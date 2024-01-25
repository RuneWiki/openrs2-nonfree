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

@OriginalClass("client!hb")
public final class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	private int anInt2551;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
	@Override
	protected void method2713() {
		@Pc(1) short local1 = 256;
		if (Static226.aBoolean429) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray244[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray23[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray23[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray23, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "()V")
	@Override
	protected void method2711() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean242) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2551 << (Static226.aBoolean429 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2717(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean242 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static36.anInt551, 16, Static226.aBoolean429 ? 2 : 1, true, false);
		this.aByteArray23 = new byte[0x100 << (Static226.aBoolean429 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	@Override
	protected void method2710() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	@Override
	public void method2716(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static226.aBoolean429 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2551 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static261.method4459(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2716(Static51.method1026(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()I")
	@Override
	protected int method2708() {
		return this.anInt2551 - (this.aSourceDataLine1.available() >> (Static226.aBoolean429 ? 2 : 1));
	}
}
