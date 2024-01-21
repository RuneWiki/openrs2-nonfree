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

@OriginalClass("client!f")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!f", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	@Override
	protected void method1090() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
	@Override
	protected void method1094() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	@Override
	protected void method1084() {
		@Pc(1) short local1 = 256;
		if (Static106.aBoolean99) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray210[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray3[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray3[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray3, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1096(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static119.anInt2551, 16, Static106.aBoolean99 ? 2 : 1, true, false);
		this.aByteArray3 = new byte[0x100 << (Static106.aBoolean99 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public void method1085(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static106.aBoolean99 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt788 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static37.method1362(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1085(Static56.method941(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	protected int method1089() {
		return this.anInt788 - (this.aSourceDataLine1.available() >> (Static106.aBoolean99 ? 2 : 1));
	}
}
