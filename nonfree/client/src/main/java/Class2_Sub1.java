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

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	@Override
	public void method1983(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static9.aBoolean13 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt125 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static185.method3519(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1983(Static177.method3437(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()I")
	@Override
	protected int method1982() {
		return this.anInt125 - (this.aSourceDataLine1.available() >> (Static9.aBoolean13 ? 2 : 1));
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
	@Override
	protected void method1987() {
		@Pc(1) short local1 = 256;
		if (Static9.aBoolean13) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray253[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray1[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray1[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray1, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1985(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static166.anInt4307, 16, Static9.aBoolean13 ? 2 : 1, true, false);
		this.aByteArray1 = new byte[0x100 << (Static9.aBoolean13 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	@Override
	protected void method1973() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
	@Override
	protected void method1978() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
