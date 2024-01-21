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

@OriginalClass("client!ja")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
	private int anInt1688;

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1713(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static68.anInt2134, 16, Static68.aBoolean70 ? 2 : 1, true, false);
		this.aByteArray42 = new byte[0x100 << (Static68.aBoolean70 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
	@Override
	protected int method1714() {
		return this.anInt1688 - (this.aSourceDataLine1.available() >> (Static68.aBoolean70 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
	@Override
	protected void method1721() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
	@Override
	protected void method1723() {
		@Pc(1) short local1 = 256;
		if (Static68.aBoolean70) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray284[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray42[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray42[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray42, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	@Override
	public void method1719(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static68.aBoolean70 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1688 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static20.method546(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1719(Static66.method1354(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
	@Override
	protected void method1715() {
		this.aSourceDataLine1.flush();
	}
}
