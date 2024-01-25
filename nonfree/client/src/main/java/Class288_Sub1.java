import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class288_Sub1 extends Class288 {

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	private int anInt7734;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
	@Override
	protected void method6808() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
	@Override
	protected int method6807() {
		return this.anInt7734 - (this.aSourceDataLine1.available() >> (Static134.aBoolean244 ? 2 : 1));
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
	@Override
	protected void method6795() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean611) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7734 << (Static134.aBoolean244 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	@Override
	public void method6801(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static134.aBoolean244 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7734 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static148.method2766(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6801(Static114.method2375(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
	@Override
	protected void method6803() {
		@Pc(1) short local1 = 256;
		if (Static134.aBoolean244) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray617[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray89[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray89[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray89, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6800(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) javax.sound.sampled.Mixer.Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean611 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static124.anInt3635, 16, Static134.aBoolean244 ? 2 : 1, true, false);
		this.aByteArray89 = new byte[0x100 << (Static134.aBoolean244 ? 2 : 1)];
	}
}
