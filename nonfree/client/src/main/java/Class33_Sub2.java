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

@OriginalClass("client!is")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!is", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "I")
	private int anInt3678;

	@OriginalMember(owner = "client!is", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Z")
	private boolean aBoolean286 = false;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "()I")
	@Override
	protected int method3056() {
		return this.anInt3678 - (this.aSourceDataLine1.available() >> (Static29.aBoolean45 ? 2 : 1));
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "()V")
	@Override
	protected void method3047() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "()V")
	@Override
	protected void method3053() {
		@Pc(1) short local1 = 256;
		if (Static29.aBoolean45) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray282[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray42[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray42[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray42, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3051(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(21) Info local21 = local1[local9];
				if (local21 != null) {
					@Pc(27) String local27 = local21.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean286 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static94.anInt2028, 16, Static29.aBoolean45 ? 2 : 1, true, false);
		this.aByteArray42 = new byte[0x100 << (Static29.aBoolean45 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "()V")
	@Override
	protected void method3058() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean286) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3678 << (Static29.aBoolean45 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	@Override
	public void method3060(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static29.aBoolean45 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3678 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static195.method3199(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3060(Static350.method4984(arg0));
			}
		}
	}
}
