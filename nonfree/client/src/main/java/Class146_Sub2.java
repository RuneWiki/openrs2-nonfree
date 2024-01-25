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

@OriginalClass("client!qd")
public final class Class146_Sub2 extends Class146 {

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	private int anInt7109;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	@Override
	protected void method5754() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean502) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt7109 << (Static543.aBoolean438 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()I")
	@Override
	protected int method5764() {
		return this.anInt7109 - (this.aSourceDataLine1.available() >> (Static543.aBoolean438 ? 2 : 1));
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
	@Override
	protected void method5759() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5762(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(22) String local22 = local16.getName();
					if (local22 != null && local22.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean502 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static527.anInt8915, 16, Static543.aBoolean438 ? 2 : 1, true, false);
		this.aByteArray94 = new byte[0x100 << (Static543.aBoolean438 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method5755(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static543.aBoolean438 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt7109 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static380.method5666(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5755(Static179.method3071(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	@Override
	protected void method5766() {
		@Pc(1) short local1 = 256;
		if (Static543.aBoolean438) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray555[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray94[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray94[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray94, 0, local1 << 1);
	}
}
