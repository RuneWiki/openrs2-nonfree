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

@OriginalClass("client!on")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
	@Override
	public void method4118(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static324.aBoolean657 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5272 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static264.method3841(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4118(Static288.method4088(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4115(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(24) String local24 = local19.getName();
					if (local24 != null && local24.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean464 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static232.anInt4442, 16, Static324.aBoolean657 ? 2 : 1, true, false);
		this.aByteArray68 = new byte[0x100 << (Static324.aBoolean657 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "()V")
	@Override
	protected void method4120() {
		@Pc(1) short local1 = 256;
		if (Static324.aBoolean657) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray355[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray68[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray68[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray68, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	@Override
	protected void method4116() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "()V")
	@Override
	protected void method4124() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean464) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5272 << (Static324.aBoolean657 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "()I")
	@Override
	protected int method4121() {
		return this.anInt5272 - (this.aSourceDataLine1.available() >> (Static324.aBoolean657 ? 2 : 1));
	}
}
