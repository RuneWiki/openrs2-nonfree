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

@OriginalClass("client!td")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	private int anInt2672;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public void method1843(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static6.aBoolean2 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2672 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static127.method634(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1843(Static27.method462(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	@Override
	protected void method1849() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
	@Override
	protected void method1844() {
		@Pc(1) short local1 = 256;
		if (Static6.aBoolean2) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray333[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray42[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray42[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray42, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
	@Override
	protected void method1841() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
	@Override
	protected int method1839() {
		return this.anInt2672 - (this.aSourceDataLine1.available() >> (Static6.aBoolean2 ? 2 : 1));
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1838(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static115.anInt2690, 16, Static6.aBoolean2 ? 2 : 1, true, false);
		this.aByteArray42 = new byte[0x100 << (Static6.aBoolean2 ? 2 : 1)];
	}
}
