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

@OriginalClass("client!vq")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
	private int anInt7261;

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
	private boolean aBoolean489 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "()V")
	@Override
	protected void method5578() {
		@Pc(1) short local1 = 256;
		if (Static213.aBoolean232) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray610[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray95[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray95[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray95, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5585(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(22) String local22 = local15.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean489 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static208.anInt3680, 16, Static213.aBoolean232 ? 2 : 1, true, false);
		this.aByteArray95 = new byte[0x100 << (Static213.aBoolean232 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "()V")
	@Override
	protected void method5579() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public void method5572(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static213.aBoolean232 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7261 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static323.method4284(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5572(Static444.method5654(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "()I")
	@Override
	protected int method5584() {
		return this.anInt7261 - (this.aSourceDataLine1.available() >> (Static213.aBoolean232 ? 2 : 1));
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()V")
	@Override
	protected void method5586() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean489) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7261 << (Static213.aBoolean232 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
