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

@OriginalClass("client!ha")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
	private int anInt1608;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	@Override
	protected void method2995() {
		this.aSourceDataLine1.flush();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	@Override
	protected void method2989() {
		@Pc(1) short local1 = 256;
		if (Static107.aBoolean100) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray417[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray7[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray7[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray7, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()I")
	@Override
	protected int method2998() {
		return this.anInt1608 - (this.aSourceDataLine1.available() >> (Static107.aBoolean100 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3002(@OriginalArg(0) Component arg0) {
		this.anAudioFormat1 = new AudioFormat((float) Static185.anInt3915, 16, Static107.aBoolean100 ? 2 : 1, true, false);
		this.aByteArray7 = new byte[0x100 << (Static107.aBoolean100 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	@Override
	protected void method2994() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static107.aBoolean100 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1608 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static132.method2249(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2993(Static99.method2680(arg0));
			}
		}
	}
}
