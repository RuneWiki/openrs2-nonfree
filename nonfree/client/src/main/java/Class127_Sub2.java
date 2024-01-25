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

@OriginalClass("client!rk")
public final class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
	private int anInt8662;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7572(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean675 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static348.anInt5701, 16, Static219.aBoolean313 ? 2 : 1, true, false);
		this.aByteArray93 = new byte[0x100 << (Static219.aBoolean313 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "()V")
	@Override
	protected void method7558() {
		@Pc(1) short local1 = 256;
		if (Static219.aBoolean313) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray739[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray93[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray93[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray93, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	@Override
	public void method7561(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static219.aBoolean313 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt8662 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static521.method6952(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7561(Static282.method4521(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "()V")
	@Override
	protected void method7560() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean675) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt8662 << (Static219.aBoolean313 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "()V")
	@Override
	protected void method7559() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "()I")
	@Override
	protected int method7557() {
		return this.anInt8662 - (this.aSourceDataLine1.available() >> (Static219.aBoolean313 ? 2 : 1));
	}
}
