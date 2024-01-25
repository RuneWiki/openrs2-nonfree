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

@OriginalClass("client!eda")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!eda", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!eda", name = "I", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!eda", name = "J", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!eda", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!eda", name = "K", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "()I")
	@Override
	protected int method5608() {
		return this.anInt2620 - (this.aSourceDataLine1.available() >> (Static161.aBoolean31 ? 2 : 1));
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5613(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(20) String local20 = local15.getName();
					if (local20 != null && local20.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean189 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static262.anInt5047, 16, Static161.aBoolean31 ? 2 : 1, true, false);
		this.aByteArray26 = new byte[0x100 << (Static161.aBoolean31 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "()V")
	@Override
	protected void method5610() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static161.aBoolean31 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2620 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static448.method6947(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5599(Static341.method5553(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "()V")
	@Override
	protected void method5602() {
		@Pc(1) short local1 = 256;
		if (Static161.aBoolean31) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray347[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray26[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray26[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray26, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
	@Override
	protected void method5600() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean189) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2620 << (Static161.aBoolean31 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
