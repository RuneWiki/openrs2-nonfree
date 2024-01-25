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

@OriginalClass("client!hs")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method8609(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean261 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static227.anInt3654, 16, Static135.aBoolean154 ? 2 : 1, true, false);
		this.aByteArray39 = new byte[0x100 << (Static135.aBoolean154 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "()V")
	@Override
	protected void method8612() {
		@Pc(1) short local1 = 256;
		if (Static135.aBoolean154) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray599[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray39[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray39[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray39, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	@Override
	public void method8603(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static135.aBoolean154 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt3790 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static320.method8636(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method8603(Static209.method2991(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "()V")
	@Override
	protected void method8607() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
	@Override
	protected int method8600() {
		return this.anInt3790 - (this.aSourceDataLine1.available() >> (Static135.aBoolean154 ? 2 : 1));
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "()V")
	@Override
	protected void method8608() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean261) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt3790 << (Static135.aBoolean154 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
