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

@OriginalClass("client!sc")
public final class Class5_Sub5_Sub4 extends Class5_Sub5 {

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!uw;")
	private Class5_Sub16_Sub5 aClass5_Sub16_Sub5_1;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!tf;")
	private Class325 aClass325_2;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	private int anInt8571;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub5_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)D")
	public double method7386() {
		@Pc(13) double local13 = this.aDouble28;
		if (this.aClass5_Sub16_Sub5_1 != null) {
			local13 = this.aClass5_Sub16_Sub5_1.method8292();
			if (local13 < 0.0D) {
				local13 = this.aDouble28;
			}
		}
		return local13 - (double) (256.0F / (float) Static92.anInt9993);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method7383(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8564 < 3) {
			@Pc(18) int local18 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local18 < 0) {
				throw new IllegalStateException(String.valueOf(local18));
			}
			if (super.anInt8564 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass325_2 = new Class325(this.aVorbisInfo1.rate, Static92.anInt9993);
				this.aClass5_Sub16_Sub5_1 = new Class5_Sub16_Sub5(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(102) float[][] local102 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble28 = this.aDSPState1.granuleTime();
		if (this.aDouble28 == -1.0D) {
			this.aDouble28 = (double) ((float) this.anInt8571 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local102[0].length);
		this.anInt8571 += local102[0].length;
		@Pc(150) Class5_Sub4_Sub17 local150 = this.aClass5_Sub16_Sub5_1.method8298(local102[0].length, this.aDouble28);
		Static342.method5251(local102, local150.aShortArrayArray17);
		for (@Pc(158) int local158 = 0; local158 < this.aVorbisInfo1.channels; local158++) {
			local150.aShortArrayArray17[local158] = this.aClass325_2.method7727(local150.aShortArrayArray17[local158]);
		}
		this.aClass5_Sub16_Sub5_1.method8297(local150);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)I")
	public int method7388() {
		return this.aClass5_Sub16_Sub5_1 == null ? 0 : this.aClass5_Sub16_Sub5_1.method8290();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	@Override
	public void method7384() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass5_Sub16_Sub5_1 != null) {
			this.aClass5_Sub16_Sub5_1.method8299();
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lclient!uw;")
	public Class5_Sub16_Sub5 method7389() {
		return this.aClass5_Sub16_Sub5_1;
	}
}
