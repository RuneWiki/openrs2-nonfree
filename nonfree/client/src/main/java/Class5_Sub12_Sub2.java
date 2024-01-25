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

@OriginalClass("client!l")
public final class Class5_Sub12_Sub2 extends Class5_Sub12 {

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	private int anInt5819;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!hf;")
	private Class5_Sub16_Sub2 aClass5_Sub16_Sub2_1;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Lclient!wu;")
	private Class393 aClass393_2;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub12_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
	public int method4966() {
		return this.aClass5_Sub16_Sub2_1 == null ? 0 : this.aClass5_Sub16_Sub2_1.method3107();
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)D")
	public double method4968() {
		@Pc(12) double local12 = this.aDouble12;
		if (this.aClass5_Sub16_Sub2_1 != null) {
			local12 = this.aClass5_Sub16_Sub2_1.method3111();
			if (local12 < 0.0D) {
				local12 = this.aDouble12;
			}
		}
		return (double) -(256.0F / (float) Static608.anInt10099) + local12;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Lclient!hf;")
	public Class5_Sub16_Sub2 method4969() {
		return this.aClass5_Sub16_Sub2_1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	@Override
	public void method8413() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass5_Sub16_Sub2_1 != null) {
			this.aClass5_Sub16_Sub2_1.method3109();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8408(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9782 < 3) {
			@Pc(16) int local16 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local16 < 0) {
				throw new IllegalStateException(String.valueOf(local16));
			}
			if (super.anInt9782 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass393_2 = new Class393(this.aVorbisInfo1.rate, Static608.anInt10099);
				this.aClass5_Sub16_Sub2_1 = new Class5_Sub16_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(112) float[][] local112 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble12 = this.aDSPState1.granuleTime();
		if (this.aDouble12 == -1.0D) {
			this.aDouble12 = (double) ((float) this.anInt5819 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local112[0].length);
		this.anInt5819 += local112[0].length;
		@Pc(162) Class5_Sub5_Sub14 local162 = this.aClass5_Sub16_Sub2_1.method3108(this.aDouble12, local112[0].length);
		Static127.method1779(local162.aShortArrayArray6, local112);
		for (@Pc(170) int local170 = 0; local170 < this.aVorbisInfo1.channels; local170++) {
			local162.aShortArrayArray6[local170] = this.aClass393_2.method9302(local162.aShortArrayArray6[local170]);
		}
		this.aClass5_Sub16_Sub2_1.method3102(local162);
	}
}
