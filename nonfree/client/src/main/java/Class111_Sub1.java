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

@OriginalClass("client!md")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "I")
	private int anInt3223;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static81.aBoolean130 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3223 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static59.method934(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4139(Static95.method1518(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
	@Override
	protected void method4143() {
		@Pc(1) short local1 = 256;
		if (Static81.aBoolean130) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray473[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray28[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray28[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray28, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4152(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) javax.sound.sampled.Mixer.Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean271 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static264.anInt5577, 16, Static81.aBoolean130 ? 2 : 1, true, false);
		this.aByteArray28 = new byte[0x100 << (Static81.aBoolean130 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
	@Override
	protected void method4154() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean271) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3223 << (Static81.aBoolean130 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()I")
	@Override
	protected int method4155() {
		return this.anInt3223 - (this.aSourceDataLine1.available() >> (Static81.aBoolean130 ? 2 : 1));
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()V")
	@Override
	protected void method4148() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
