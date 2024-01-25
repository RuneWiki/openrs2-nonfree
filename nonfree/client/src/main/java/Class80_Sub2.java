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

@OriginalClass("client!fo")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt3973;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "Z")
	private boolean aBoolean287 = false;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "()V")
	@Override
	protected void method3203() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3199(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean287 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static345.anInt6689, 16, Static343.aBoolean463 ? 2 : 1, true, false);
		this.aByteArray25 = new byte[0x100 << (Static343.aBoolean463 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	@Override
	public void method3200(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static343.aBoolean463 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3973 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static643.method8630(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3200(Static629.method8469(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
	@Override
	protected void method3190() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean287) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3973 << (Static343.aBoolean463 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "()V")
	@Override
	protected void method3204() {
		@Pc(1) short local1 = 256;
		if (Static343.aBoolean463) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray210[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray25[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray25[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray25, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()I")
	@Override
	protected int method3197() {
		return this.anInt3973 - (this.aSourceDataLine1.available() >> (Static343.aBoolean463 ? 2 : 1));
	}
}
