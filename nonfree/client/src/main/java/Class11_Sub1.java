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

@OriginalClass("client!mt")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!mt", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!mt", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!mt", name = "R", descriptor = "I")
	private int anInt5939;

	@OriginalMember(owner = "client!mt", name = "P", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)V")
	@Override
	public void method6293(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static341.aBoolean438 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5939 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static329.method5150(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method6293(Static253.method4296(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "()V")
	@Override
	protected void method6281() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "()I")
	@Override
	protected int method6284() {
		return this.anInt5939 - (this.aSourceDataLine1.available() >> (Static341.aBoolean438 ? 2 : 1));
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "()V")
	@Override
	protected void method6292() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean417) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5939 << (Static341.aBoolean438 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6289(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean417 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static330.anInt6003, 16, Static341.aBoolean438 ? 2 : 1, true, false);
		this.aByteArray69 = new byte[0x100 << (Static341.aBoolean438 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "()V")
	@Override
	protected void method6296() {
		@Pc(1) short local1 = 256;
		if (Static341.aBoolean438) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray550[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray69[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray69[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray69, 0, local1 << 1);
	}
}
