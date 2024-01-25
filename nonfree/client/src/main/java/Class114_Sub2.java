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

@OriginalClass("client!iba")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!iba", name = "H", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!iba", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
	private int anInt5172;

	@OriginalMember(owner = "client!iba", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!iba", name = "G", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "()V")
	@Override
	protected void method4232() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean416) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt5172 << (Static528.aBoolean739 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "()I")
	@Override
	protected int method4231() {
		return this.anInt5172 - (this.aSourceDataLine1.available() >> (Static528.aBoolean739 ? 2 : 1));
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "()V")
	@Override
	protected void method4230() {
		@Pc(1) short local1 = 256;
		if (Static528.aBoolean739) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray219[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray34[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray34[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray34, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4226(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean416 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static322.anInt6392, 16, Static528.aBoolean739 ? 2 : 1, true, false);
		this.aByteArray34 = new byte[0x100 << (Static528.aBoolean739 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static528.aBoolean739 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt5172 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static624.method8536(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method4223(Static101.method2622(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "()V")
	@Override
	protected void method4235() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
