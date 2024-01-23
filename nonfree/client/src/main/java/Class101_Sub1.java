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

@OriginalClass("client!kl")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
	private int anInt2941;

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kl", name = "Q", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()I")
	@Override
	protected int method2808() {
		return this.anInt2941 - (this.aSourceDataLine1.available() >> (Static64.aBoolean221 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	@Override
	protected void method2800() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean209) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2941 << (Static64.aBoolean221 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2796(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean209 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static152.anInt3130, 16, Static64.aBoolean221 ? 2 : 1, true, false);
		this.aByteArray32 = new byte[0x100 << (Static64.aBoolean221 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	@Override
	public void method2804(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static64.aBoolean221 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2941 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static230.method3629(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method2804(Static203.method3254(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
	@Override
	protected void method2805() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()V")
	@Override
	protected void method2802() {
		@Pc(1) short local1 = 256;
		if (Static64.aBoolean221) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray278[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray32[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray32[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray32, 0, local1 << 1);
	}
}
