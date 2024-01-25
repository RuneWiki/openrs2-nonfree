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

@OriginalClass("client!via")
public final class Class6_Sub37_Sub3 extends Class6_Sub37 {

	@OriginalMember(owner = "client!via", name = "v", descriptor = "Lclient!wp;")
	private Class397 aClass397_2;

	@OriginalMember(owner = "client!via", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!via", name = "p", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!via", name = "B", descriptor = "Lclient!tfa;")
	private Class6_Sub17_Sub5 aClass6_Sub17_Sub5_1;

	@OriginalMember(owner = "client!via", name = "D", descriptor = "D")
	private double aDouble54;

	@OriginalMember(owner = "client!via", name = "t", descriptor = "I")
	private int anInt9995;

	@OriginalMember(owner = "client!via", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!via", name = "q", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub37_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	@Override
	public void method8837() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass6_Sub17_Sub5_1 != null) {
			this.aClass6_Sub17_Sub5_1.method8149();
		}
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(B)I")
	public int method8691() {
		return this.aClass6_Sub17_Sub5_1 == null ? 0 : this.aClass6_Sub17_Sub5_1.method8154();
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)Lclient!tfa;")
	public Class6_Sub17_Sub5 method8692() {
		return this.aClass6_Sub17_Sub5_1;
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)D")
	public double method8693() {
		@Pc(15) double local15 = this.aDouble54;
		if (this.aClass6_Sub17_Sub5_1 != null) {
			local15 = this.aClass6_Sub17_Sub5_1.method8155();
			if (local15 < 0.0D) {
				local15 = this.aDouble54;
			}
		}
		return (double) -(256.0F / (float) Static90.anInt9479) + local15;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8838(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt10248 < 3) {
			@Pc(27) int local27 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local27 < 0) {
				throw new IllegalStateException(String.valueOf(local27));
			}
			if (super.anInt10248 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass397_2 = new Class397(this.aVorbisInfo1.rate, Static90.anInt9479);
					this.aClass6_Sub17_Sub5_1 = new Class6_Sub17_Sub5(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(121) float[][] local121 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble54 = this.aDSPState1.granuleTime();
		if (this.aDouble54 == -1.0D) {
			this.aDouble54 = (double) ((float) this.anInt9995 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local121[0].length);
		this.anInt9995 += local121[0].length;
		@Pc(171) Class6_Sub2_Sub8 local171 = this.aClass6_Sub17_Sub5_1.method8152(this.aDouble54, local121[0].length);
		Static237.method4200(local121, local171.aShortArrayArray7);
		for (@Pc(181) int local181 = 0; local181 < this.aVorbisInfo1.channels; local181++) {
			local171.aShortArrayArray7[local181] = this.aClass397_2.method8968(local171.aShortArrayArray7[local181]);
		}
		this.aClass6_Sub17_Sub5_1.method8147(local171);
	}
}
