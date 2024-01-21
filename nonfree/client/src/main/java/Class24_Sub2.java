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

@OriginalClass("client!nf")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	private int anInt2145;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1460(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static39.anInt1014, 16, Static59.aBoolean73 ? 2 : 1, true, false);
		this.aByteArray20 = new byte[0x100 << (Static59.aBoolean73 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
	@Override
	protected void method1463() {
		@Pc(1) short local1 = 256;
		if (Static59.aBoolean73) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray344[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray20[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray20[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray20, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()V")
	@Override
	protected void method1465() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()V")
	@Override
	protected void method1467() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	@Override
	public void method1466(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static59.aBoolean73 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2145 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static67.method1184(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1466(Static71.method1397(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
	@Override
	protected int method1458() {
		return this.anInt2145 - (this.aSourceDataLine1.available() >> (Static59.aBoolean73 ? 2 : 1));
	}
}
