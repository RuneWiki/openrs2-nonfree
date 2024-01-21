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

@OriginalClass("client!bd")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!bd", name = "Mb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!bd", name = "Nb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!bd", name = "Ob", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!bd", name = "Pb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
	@Override
	protected void method1722() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	protected int method1713() {
		return this.anInt328 - (this.aSourceDataLine1.available() >> (Static52.aBoolean78 ? 2 : 1));
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1714(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static73.anInt2059, 16, Static52.aBoolean78 ? 2 : 1, true, false);
		this.aByteArray6 = new byte[0x100 << (Static52.aBoolean78 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
	@Override
	protected void method1712() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	@Override
	public void method1719(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static52.aBoolean78 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt328 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static86.method1552(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1719(Static120.method2150(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	@Override
	protected void method1724() {
		@Pc(1) short local1 = 256;
		if (Static52.aBoolean78) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray287[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray6[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray6[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray6, 0, local1 << 1);
	}
}
