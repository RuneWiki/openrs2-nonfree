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

@OriginalClass("client!cga")
public final class Class6_Sub13_Sub1 extends Class6_Sub13 {

	@OriginalMember(owner = "client!cga", name = "A", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!cga", name = "B", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!cga", name = "C", descriptor = "Lclient!tg;")
	private Class321 aClass321_1;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "Lclient!wb;")
	private Class6_Sub4_Sub4 aClass6_Sub4_Sub4_1;

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
	private int anInt2356;

	@OriginalMember(owner = "client!cga", name = "L", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!cga", name = "K", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lclient!wb;")
	public Class6_Sub4_Sub4 method2042() {
		return this.aClass6_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)D")
	public double method2043() {
		@Pc(12) double local12 = this.aDouble1;
		if (this.aClass6_Sub4_Sub4_1 != null) {
			local12 = this.aClass6_Sub4_Sub4_1.method8509();
			if (local12 < 0.0D) {
				local12 = this.aDouble1;
			}
		}
		return (double) -(256.0F / (float) Static322.anInt6392) + local12;
	}

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "(I)V")
	@Override
	public void method8553() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass6_Sub4_Sub4_1 != null) {
			this.aClass6_Sub4_Sub4_1.method8506();
		}
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(B)I")
	public int method2046() {
		return this.aClass6_Sub4_Sub4_1 == null ? 0 : this.aClass6_Sub4_Sub4_1.method8514();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8548(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10513 < 3) {
			@Pc(124) int local124 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local124 < 0) {
				throw new IllegalStateException(String.valueOf(local124));
			} else if (super.anInt10513 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass321_1 = new Class321(this.aVorbisInfo1.rate, Static322.anInt6392);
				this.aClass6_Sub4_Sub4_1 = new Class6_Sub4_Sub4(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(35) float[][] local35 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble1 = this.aDSPState1.granuleTime();
		if (this.aDouble1 == -1.0D) {
			this.aDouble1 = (double) ((float) this.anInt2356 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local35[0].length);
		this.anInt2356 += local35[0].length;
		@Pc(83) Class6_Sub5_Sub17 local83 = this.aClass6_Sub4_Sub4_1.method8512(this.aDouble1, local35[0].length);
		Static138.method2757(local35, local83.aShortArrayArray14);
		for (@Pc(91) int local91 = 0; local91 < this.aVorbisInfo1.channels; local91++) {
			local83.aShortArrayArray14[local91] = this.aClass321_1.method7677(local83.aShortArrayArray14[local91]);
		}
		this.aClass6_Sub4_Sub4_1.method8507(local83);
	}
}
