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

@OriginalClass("client!bi")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
	@Override
	protected void method2668() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method2658(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static3.aBoolean5 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt507 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static87.method1449(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2658(Static174.method2746(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "()V")
	@Override
	protected void method2664() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()I")
	@Override
	protected int method2662() {
		return this.anInt507 - (this.aSourceDataLine1.available() >> (Static3.aBoolean5 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2656(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static149.anInt3584, 16, Static3.aBoolean5 ? 2 : 1, true, false);
		this.aByteArray8 = new byte[0x100 << (Static3.aBoolean5 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()V")
	@Override
	protected void method2663() {
		@Pc(1) short local1 = 256;
		if (Static3.aBoolean5) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray418[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray8[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray8[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray8, 0, local1 << 1);
	}
}
