import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class8_Sub19_Sub1 extends Class8_Sub19 {

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Lclient!gfa;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "Lclient!he;")
	private Class8_Sub16_Sub2 aClass8_Sub16_Sub2_1;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class8_Sub19_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)I")
	public int method2841() {
		return this.aClass8_Sub16_Sub2_1 == null ? 0 : this.aClass8_Sub16_Sub2_1.method3692();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)D")
	public double method2844() {
		@Pc(6) double local6 = this.aDouble6;
		if (this.aClass8_Sub16_Sub2_1 != null) {
			local6 = this.aClass8_Sub16_Sub2_1.method3684();
			if (local6 < 0.0D) {
				local6 = this.aDouble6;
			}
		}
		return local6 - (double) (256.0F / (float) Static345.anInt6689);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)Lclient!he;")
	public Class8_Sub16_Sub2 method2845() {
		return this.aClass8_Sub16_Sub2_1;
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
	@Override
	public void method7896() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass8_Sub16_Sub2_1 != null) {
			this.aClass8_Sub16_Sub2_1.method3685();
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7895(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9770 < 3) {
			@Pc(120) int local120 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local120 < 0) {
				throw new IllegalStateException(String.valueOf(local120));
			}
			if (super.anInt9770 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass116_1 = new Class116(this.aVorbisInfo1.rate, Static345.anInt6689);
				this.aClass8_Sub16_Sub2_1 = new Class8_Sub16_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(26) float[][] local26 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble6 = this.aDSPState1.granuleTime();
		if (this.aDouble6 == -1.0D) {
			this.aDouble6 = (float) this.anInt3429 / (float) this.aVorbisInfo1.rate;
		}
		this.aDSPState1.read(local26[0].length);
		this.anInt3429 += local26[0].length;
		@Pc(74) Class8_Sub5_Sub10 local74 = this.aClass8_Sub16_Sub2_1.method3693(local26[0].length, this.aDouble6);
		Static328.method7892(local26, local74.aShortArrayArray9);
		for (@Pc(82) int local82 = 0; local82 < this.aVorbisInfo1.channels; local82++) {
			local74.aShortArrayArray9[local82] = this.aClass116_1.method3382(local74.aShortArrayArray9[local82]);
		}
		this.aClass8_Sub16_Sub2_1.method3691(local74);
	}
}
