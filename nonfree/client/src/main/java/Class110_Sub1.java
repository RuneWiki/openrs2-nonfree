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

@OriginalClass("client!kb")
public final class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt3732;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	@Override
	protected void method4779() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
	@Override
	protected int method4783() {
		return this.anInt3732 - (this.aSourceDataLine1.available() >> (Static93.aBoolean97 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4784(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(9) int local9 = 0; local9 < local1.length; local9++) {
				@Pc(17) Info local17 = local1[local9];
				if (local17 != null) {
					@Pc(23) String local23 = local17.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean256 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static78.anInt1548, 16, Static93.aBoolean97 ? 2 : 1, true, false);
		this.aByteArray51 = new byte[0x100 << (Static93.aBoolean97 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	@Override
	protected void method4774() {
		@Pc(1) short local1 = 256;
		if (Static93.aBoolean97) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray467[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray51[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray51[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray51, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static93.aBoolean97 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3732 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static185.method2825(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4775(Static100.method1552(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
	@Override
	protected void method4781() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean256) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) javax.sound.sampled.DataLine.Info local34 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3732 << (Static93.aBoolean97 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
