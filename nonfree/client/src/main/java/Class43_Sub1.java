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

@OriginalClass("client!ik")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	@Override
	public void method2441(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static49.aBoolean84 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2914 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static95.method1666(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2441(Static305.method4628(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()V")
	@Override
	protected void method2452() {
		@Pc(1) short local1 = 256;
		if (Static49.aBoolean84) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray304[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray24[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray24[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray24, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2447(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) javax.sound.sampled.Mixer.Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean203 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static107.anInt2456, 16, Static49.aBoolean84 ? 2 : 1, true, false);
		this.aByteArray24 = new byte[0x100 << (Static49.aBoolean84 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
	@Override
	protected void method2450() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
	@Override
	protected int method2442() {
		return this.anInt2914 - (this.aSourceDataLine1.available() >> (Static49.aBoolean84 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()V")
	@Override
	protected void method2446() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean203) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2914 << (Static49.aBoolean84 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
