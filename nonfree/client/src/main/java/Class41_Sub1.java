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

@OriginalClass("client!jf")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "()V")
	@Override
	protected void method1523() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	@Override
	public void method1517(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static23.aBoolean20 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1879 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static28.method504(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1517(Static11.method185(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	@Override
	protected void method1506() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
	@Override
	protected void method1518() {
		@Pc(1) short local1 = 256;
		if (Static23.aBoolean20) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray174[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray11[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray11[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray11, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()I")
	@Override
	protected int method1520() {
		return this.anInt1879 - (this.aSourceDataLine1.available() >> (Static23.aBoolean20 ? 2 : 1));
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1514(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static50.anInt1375, 16, Static23.aBoolean20 ? 2 : 1, true, false);
		this.aByteArray11 = new byte[0x100 << (Static23.aBoolean20 ? 2 : 1)];
	}
}
