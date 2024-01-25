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

@OriginalClass("client!ega")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!ega", name = "J", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!ega", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ega", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ega", name = "N", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ega", name = "M", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "()V")
	@Override
	protected void method2211() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "()V")
	@Override
	protected void method2218() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean160) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2335 << (Static157.aBoolean213 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "(I)V")
	@Override
	public void method2215(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static157.aBoolean213 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2335 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static143.method2493(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2215(Static162.method2593(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "()V")
	@Override
	protected void method2217() {
		@Pc(1) short local1 = 256;
		if (Static157.aBoolean213) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray157[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray30[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray30[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray30, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "()I")
	@Override
	protected int method2210() {
		return this.anInt2335 - (this.aSourceDataLine1.available() >> (Static157.aBoolean213 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2221(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean160 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static434.anInt6851, 16, Static157.aBoolean213 ? 2 : 1, true, false);
		this.aByteArray30 = new byte[0x100 << (Static157.aBoolean213 ? 2 : 1)];
	}
}
