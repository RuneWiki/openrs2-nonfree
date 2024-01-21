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

@OriginalClass("client!na")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	@Override
	public void method1229(@OriginalArg(0) Component arg0) {
		Static72.anInt1825 = 22050;
		Static102.aBoolean104 = false;
		this.anAudioFormat1 = new AudioFormat((float) Static72.anInt1825, 16, Static102.aBoolean104 ? 2 : 1, true, false);
		this.aByteArray18 = new byte[0x100 << (Static102.aBoolean104 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
	@Override
	protected int method1225() {
		return this.aSourceDataLine1.available() >> (Static102.aBoolean104 ? 2 : 1);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	@Override
	protected void method1228() {
		@Pc(1) short local1 = 256;
		if (Static102.aBoolean104) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(16) int local16 = Static44.anIntArray226[local9];
			if ((local16 + 8388608 & 0xFF000000) != 0) {
				local16 = local16 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray18[local9 * 2] = (byte) (local16 >> 8);
			this.aByteArray18[local9 * 2 + 1] = (byte) (local16 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray18, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
	@Override
	protected void method1230() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	@Override
	protected void method1226(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static102.aBoolean104 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
		} catch (@Pc(33) LineUnavailableException local33) {
			this.aSourceDataLine1 = null;
			throw local33;
		}
	}
}
