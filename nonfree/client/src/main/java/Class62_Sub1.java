import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!dw", name = "N", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!dw", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!dw", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!dw", name = "P", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()V")
	@Override
	protected void method2414() {
		@Pc(1) short local1 = 256;
		if (Static240.aBoolean266) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray254[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray15[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray15[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray15, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2419(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(24) String local24 = local17.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean81 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static150.anInt7358, 16, Static240.aBoolean266 ? 2 : 1, true, false);
		this.aByteArray15 = new byte[0x100 << (Static240.aBoolean266 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	@Override
	public void method2413(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static240.aBoolean266 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1382 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static284.method4035(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2413(Static43.method654(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()V")
	@Override
	protected void method2408() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean81) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1382 << (Static240.aBoolean266 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
	@Override
	protected void method2406() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "()I")
	@Override
	protected int method2415() {
		return this.anInt1382 - (this.aSourceDataLine1.available() >> (Static240.aBoolean266 ? 2 : 1));
	}
}
