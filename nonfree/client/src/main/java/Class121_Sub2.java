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

@OriginalClass("client!qa")
public final class Class121_Sub2 extends Class121 {

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "[B")
	private byte[] aByteArray137;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
	private int anInt4175;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Z")
	private boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3577(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(15) Info local15 = local1[local7];
				if (local15 != null) {
					@Pc(21) String local21 = local15.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean377 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static69.anInt1498, 16, Static292.aBoolean497 ? 2 : 1, true, false);
		this.aByteArray137 = new byte[0x100 << (Static292.aBoolean497 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	@Override
	protected int method3582() {
		return this.anInt4175 - (this.aSourceDataLine1.available() >> (Static292.aBoolean497 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	@Override
	protected void method3587() {
		@Pc(1) short local1 = 256;
		if (Static292.aBoolean497) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray462[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray137[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray137[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray137, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	@Override
	protected void method3574() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean377) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt4175 << (Static292.aBoolean497 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	@Override
	public void method3578(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static292.aBoolean497 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt4175 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static13.method189(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3578(Static138.method3842(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	@Override
	protected void method3573() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
