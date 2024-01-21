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

@OriginalClass("client!fa")
public final class Class19_Sub1_Sub1 extends Class19_Sub1 {

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1271(@OriginalArg(0) Component arg0) {
		Static3.anInt1282 = 22050;
		Static35.aBoolean50 = false;
		this.anAudioFormat1 = new AudioFormat((float) Static3.anInt1282, 16, Static35.aBoolean50 ? 2 : 1, true, false);
		this.aByteArray7 = new byte[0x100 << (Static35.aBoolean50 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	@Override
	protected void method1266() {
		@Pc(1) short local1 = 256;
		if (Static35.aBoolean50) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(16) int local16 = Static28.anIntArray226[local9];
			if ((local16 + 8388608 & 0xFF000000) != 0) {
				local16 = local16 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7[local9 * 2] = (byte) (local16 >> 8);
			this.aByteArray7[local9 * 2 + 1] = (byte) (local16 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray7, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
	@Override
	protected void method1270() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()I")
	@Override
	protected int method1263() {
		return this.aSourceDataLine1.available() >> (Static35.aBoolean50 ? 2 : 1);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	protected void method1268(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static35.aBoolean50 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
		} catch (@Pc(33) LineUnavailableException local33) {
			this.aSourceDataLine1 = null;
			throw local33;
		}
	}
}
