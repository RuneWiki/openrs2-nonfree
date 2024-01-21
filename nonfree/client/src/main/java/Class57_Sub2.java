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

@OriginalClass("client!w")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!w", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
	@Override
	protected int method2002() {
		return this.anInt2919 - (this.aSourceDataLine1.available() >> (Static10.aBoolean6 ? 2 : 1));
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	@Override
	protected void method2017() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	@Override
	protected void method2008() {
		@Pc(1) short local1 = 256;
		if (Static10.aBoolean6) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray493[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray40[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray40[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray40, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	protected void method2012() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2016(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static81.anInt1802, 16, Static10.aBoolean6 ? 2 : 1, true, false);
		this.aByteArray40 = new byte[0x100 << (Static10.aBoolean6 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	@Override
	public void method2011(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static10.aBoolean6 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2919 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static94.method1582(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2011(Static81.method1378(arg0));
			}
		}
	}
}
