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

@OriginalClass("client!wj")
public final class Class183_Sub2 extends Class183 {

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	private int anInt9039;

	@OriginalMember(owner = "client!wj", name = "M", descriptor = "[B")
	private byte[] aByteArray124;

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method7417(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static187.aBoolean231 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt9039 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static5.method240(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7417(Static352.method5306(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
	@Override
	protected int method7418() {
		return this.anInt9039 - (this.aSourceDataLine1.available() >> (Static187.aBoolean231 ? 2 : 1));
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7414(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean632 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static477.anInt7971, 16, Static187.aBoolean231 ? 2 : 1, true, false);
		this.aByteArray124 = new byte[0x100 << (Static187.aBoolean231 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "()V")
	@Override
	protected void method7428() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean632) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt9039 << (Static187.aBoolean231 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	@Override
	protected void method7415() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "()V")
	@Override
	protected void method7429() {
		@Pc(1) short local1 = 256;
		if (Static187.aBoolean231) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray835[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray124[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray124[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray124, 0, local1 << 1);
	}
}
