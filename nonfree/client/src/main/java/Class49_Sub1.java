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

@OriginalClass("client!dh")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	private int anInt1453;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	@Override
	public void method2065(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static422.aBoolean649 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1453 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static162.method5277(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2065(Static370.method4949(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
	@Override
	protected void method2073() {
		@Pc(1) short local1 = 256;
		if (Static422.aBoolean649) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray162[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray14[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray14[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray14, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()I")
	@Override
	protected int method2067() {
		return this.anInt1453 - (this.aSourceDataLine1.available() >> (Static422.aBoolean649 ? 2 : 1));
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2066(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean122 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static261.anInt4928, 16, Static422.aBoolean649 ? 2 : 1, true, false);
		this.aByteArray14 = new byte[0x100 << (Static422.aBoolean649 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()V")
	@Override
	protected void method2072() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean122) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1453 << (Static422.aBoolean649 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	@Override
	protected void method2071() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
