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

@OriginalClass("client!fs")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!fs", name = "K", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!fs", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!fs", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!fs", name = "C", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	@Override
	public void method7693(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static608.aBoolean713 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3303 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static679.method9038(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method7693(Static585.method7772(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method7699(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) javax.sound.sampled.Mixer.Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(27) String local27 = local20.getName();
					if (local27 != null && local27.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean240 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static16.anInt10139, 16, Static608.aBoolean713 ? 2 : 1, true, false);
		this.aByteArray24 = new byte[0x100 << (Static608.aBoolean713 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "()V")
	@Override
	protected void method7697() {
		@Pc(1) short local1 = 256;
		if (Static608.aBoolean713) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray510[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray24[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray24[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray24, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "()V")
	@Override
	protected void method7710() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
	@Override
	protected int method7694() {
		return this.anInt3303 - (this.aSourceDataLine1.available() >> (Static608.aBoolean713 ? 2 : 1));
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "()V")
	@Override
	protected void method7705() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean240) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3303 << (Static608.aBoolean713 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
