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

@OriginalClass("client!rf")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
	private int anInt5352;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "Z")
	private boolean aBoolean331 = false;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
	@Override
	protected void method4522() {
		@Pc(1) short local1 = 256;
		if (Static272.aBoolean339) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray429[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray82[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray82[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray82, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
	@Override
	protected int method4511() {
		return this.anInt5352 - (this.aSourceDataLine1.available() >> (Static272.aBoolean339 ? 2 : 1));
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	@Override
	public void method4512(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static272.aBoolean339 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5352 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static37.method5459(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4512(Static83.method1300(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
	@Override
	protected void method4519() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean331) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5352 << (Static272.aBoolean339 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4524(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(7) int local7 = 0; local7 < local1.length; local7++) {
				@Pc(19) javax.sound.sampled.Mixer.Info local19 = local1[local7];
				if (local19 != null) {
					@Pc(25) String local25 = local19.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean331 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static244.anInt4835, 16, Static272.aBoolean339 ? 2 : 1, true, false);
		this.aByteArray82 = new byte[0x100 << (Static272.aBoolean339 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
	@Override
	protected void method4514() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
