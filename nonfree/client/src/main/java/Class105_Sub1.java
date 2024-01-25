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

@OriginalClass("client!hh")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	private int anInt2622;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
	@Override
	protected void method5170() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean193) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2622 << (Static24.aBoolean29 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static24.aBoolean29 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2622 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static298.method4371(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5169(Static420.method5696(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	@Override
	protected void method5164() {
		@Pc(1) short local1 = 256;
		if (Static24.aBoolean29) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray542[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray36[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray36[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray36, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5172(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(24) String local24 = local19.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean193 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static203.anInt3580, 16, Static24.aBoolean29 ? 2 : 1, true, false);
		this.aByteArray36 = new byte[0x100 << (Static24.aBoolean29 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()I")
	@Override
	protected int method5160() {
		return this.anInt2622 - (this.aSourceDataLine1.available() >> (Static24.aBoolean29 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()V")
	@Override
	protected void method5168() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
