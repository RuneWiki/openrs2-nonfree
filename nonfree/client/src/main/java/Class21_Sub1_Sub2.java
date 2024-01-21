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

@OriginalClass("client!ve")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
	@Override
	protected void method2031() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method2033(@OriginalArg(0) Component arg0) {
		Static86.aBoolean123 = false;
		Static43.anInt980 = 22050;
		this.anAudioFormat1 = new AudioFormat((float) Static43.anInt980, 16, Static86.aBoolean123 ? 2 : 1, true, false);
		this.aByteArray33 = new byte[0x100 << (Static86.aBoolean123 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	protected int method2029() {
		return this.aSourceDataLine1.available() >> (Static86.aBoolean123 ? 2 : 1);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "()V")
	@Override
	protected void method2035() {
		@Pc(1) short local1 = 256;
		if (Static86.aBoolean123) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(16) int local16 = Static29.anIntArray440[local9];
			if ((local16 + 8388608 & 0xFF000000) != 0) {
				local16 = local16 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray33[local9 * 2] = (byte) (local16 >> 8);
			this.aByteArray33[local9 * 2 + 1] = (byte) (local16 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray33, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	protected void method2027(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static86.aBoolean123 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
		} catch (@Pc(33) LineUnavailableException local33) {
			this.aSourceDataLine1 = null;
			throw local33;
		}
	}
}
