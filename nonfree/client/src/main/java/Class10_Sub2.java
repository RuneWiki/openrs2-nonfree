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

@OriginalClass("client!kj")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
	private int anInt2379;

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!kj", name = "Q", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "()I")
	@Override
	protected int method1784() {
		return this.anInt2379 - (this.aSourceDataLine1.available() >> (Static105.aBoolean119 ? 2 : 1));
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
	@Override
	protected void method1774() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean116) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt2379 << (Static105.aBoolean119 ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	@Override
	public void method1785(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Static105.aBoolean119 ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt2379 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static82.method1475(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method1785(Static108.method1872(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
	@Override
	protected void method1773() {
		@Pc(1) short local1 = 256;
		if (Static105.aBoolean119) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray234[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray22[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray22[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray22, 0, local1 << 1);
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
	@Override
	protected void method1779() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method1775(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(21) String local21 = local16.getName();
					if (local21 != null && local21.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean116 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static68.anInt1622, 16, Static105.aBoolean119 ? 2 : 1, true, false);
		this.aByteArray22 = new byte[0x100 << (Static105.aBoolean119 ? 2 : 1)];
	}
}
