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

@OriginalClass("client!ra")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private int anInt5256;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
	@Override
	protected void method4467() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean391) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5256 << (Static103.aBoolean170 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static103.aBoolean170 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5256 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static348.method5591(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4470(Static271.method4522(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()I")
	@Override
	protected int method4460() {
		return this.anInt5256 - (this.aSourceDataLine1.available() >> (Static103.aBoolean170 ? 2 : 1));
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	@Override
	protected void method4458() {
		@Pc(1) short local1 = 256;
		if (Static103.aBoolean170) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray674[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray79[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray79[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray79, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	@Override
	protected void method4457() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4469(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean391 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static172.anInt2667, 16, Static103.aBoolean170 ? 2 : 1, true, false);
		this.aByteArray79 = new byte[0x100 << (Static103.aBoolean170 ? 2 : 1)];
	}
}
