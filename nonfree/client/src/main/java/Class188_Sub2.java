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

@OriginalClass("client!sp")
public final class Class188_Sub2 extends Class188 {

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
	private int anInt9051;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "Z")
	private boolean aBoolean646 = false;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
	@Override
	protected void method7771() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean646) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt9051 << (Static447.aBoolean556 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()I")
	@Override
	protected int method7770() {
		return this.anInt9051 - (this.aSourceDataLine1.available() >> (Static447.aBoolean556 ? 2 : 1));
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
	@Override
	protected void method7773() {
		@Pc(1) short local1 = 256;
		if (Static447.aBoolean556) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray571[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray103[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray103[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray103, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7769(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(26) String local26 = local20.getName();
					if (local26 != null && local26.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean646 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static276.anInt4980, 16, Static447.aBoolean556 ? 2 : 1, true, false);
		this.aByteArray103 = new byte[0x100 << (Static447.aBoolean556 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	@Override
	public void method7759(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static447.aBoolean556 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt9051 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static272.method4461(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7759(Static109.method2234(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()V")
	@Override
	protected void method7760() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
