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

@OriginalClass("client!mf")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
	private int anInt2716;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
	@Override
	protected int method2050() {
		return this.anInt2716 - (this.aSourceDataLine1.available() >> (Static68.aBoolean82 ? 2 : 1));
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2043(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static154.anInt4087, 16, Static68.aBoolean82 ? 2 : 1, true, false);
		this.aByteArray31 = new byte[0x100 << (Static68.aBoolean82 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
	@Override
	protected void method2045() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	@Override
	protected void method2035() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	@Override
	public void method2041(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static68.aBoolean82 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2716 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static95.method2231(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2041(Static117.method2132(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
	@Override
	protected void method2044() {
		@Pc(1) short local1 = 256;
		if (Static68.aBoolean82) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray252[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray31[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray31[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray31, 0, local1 << 1);
	}
}
