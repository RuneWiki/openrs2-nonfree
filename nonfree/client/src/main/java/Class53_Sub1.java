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

@OriginalClass("client!dk")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
	private int anInt1478;

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	@Override
	public void method5624(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static391.aBoolean443 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt1478 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static31.method430(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5624(Static171.method2382(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "()V")
	@Override
	protected void method5631() {
		@Pc(1) short local1 = 256;
		if (Static391.aBoolean443) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray528[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray9[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray9[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray9, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
	@Override
	protected void method5626() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean101) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(33) Info local33 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt1478 << (Static391.aBoolean443 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local33);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5635(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean101 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static145.anInt2577, 16, Static391.aBoolean443 ? 2 : 1, true, false);
		this.aByteArray9 = new byte[0x100 << (Static391.aBoolean443 ? 2 : 1)];
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "()I")
	@Override
	protected int method5629() {
		return this.anInt1478 - (this.aSourceDataLine1.available() >> (Static391.aBoolean443 ? 2 : 1));
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "()V")
	@Override
	protected void method5627() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}
}
