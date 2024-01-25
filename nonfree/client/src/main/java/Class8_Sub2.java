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

@OriginalClass("client!oda")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
	private int anInt6473;

	@OriginalMember(owner = "client!oda", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!oda", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!oda", name = "H", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5518(@OriginalArg(0) Component arg0) {
		@Pc(1) Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(20) Info local20 = local1[local8];
				if (local20 != null) {
					@Pc(25) String local25 = local20.getName();
					if (local25 != null && local25.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean481 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static404.anInt6999, 16, Static305.aBoolean394 ? 2 : 1, true, false);
		this.aByteArray69 = new byte[0x100 << (Static305.aBoolean394 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "()I")
	@Override
	protected int method5521() {
		return this.anInt6473 - (this.aSourceDataLine1.available() >> (Static305.aBoolean394 ? 2 : 1));
	}

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "()V")
	@Override
	protected void method5527() {
		@Pc(1) short local1 = 256;
		if (Static305.aBoolean394) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray393[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray69[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray69[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray69, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "()V")
	@Override
	protected void method5523() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	@Override
	public void method5522(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) javax.sound.sampled.DataLine.Info local20 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static305.aBoolean394 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6473 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static172.method7824(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5522(Static371.method5424(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "()V")
	@Override
	protected void method5520() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean481) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) javax.sound.sampled.DataLine.Info local33 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6473 << (Static305.aBoolean394 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}
}
