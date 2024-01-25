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

@OriginalClass("client!aq")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()I")
	@Override
	protected int method3558() {
		return this.anInt414 - (this.aSourceDataLine1.available() >> (Static121.aBoolean214 ? 2 : 1));
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V")
	@Override
	public void method3562(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static121.aBoolean214 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt414 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static155.method2854(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method3562(Static184.method3549(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()V")
	@Override
	protected void method3564() {
		@Pc(1) short local1 = 256;
		if (Static121.aBoolean214) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray297[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray5[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray5[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray5, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
	@Override
	protected void method3553() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()V")
	@Override
	protected void method3567() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean26) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt414 << (Static121.aBoolean214 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3556(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean26 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static411.anInt9206, 16, Static121.aBoolean214 ? 2 : 1, true, false);
		this.aByteArray5 = new byte[0x100 << (Static121.aBoolean214 ? 2 : 1)];
	}
}
