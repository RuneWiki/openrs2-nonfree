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

@OriginalClass("client!ik")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "Lclient!fr;")
	private Class2_Sub26_Sub2 aClass2_Sub26_Sub2_1;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
	private int anInt4921;

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Lclient!ou;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	public int method4460() {
		return this.aClass2_Sub26_Sub2_1 == null ? 0 : this.aClass2_Sub26_Sub2_1.method3385();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7541(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8453 < 3) {
			@Pc(122) int local122 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local122 < 0) {
				throw new IllegalStateException(String.valueOf(local122));
			}
			if (super.anInt8453 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass269_1 = new Class269(this.aVorbisInfo1.rate, Static237.anInt4718);
				this.aClass2_Sub26_Sub2_1 = new Class2_Sub26_Sub2(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(28) float[][] local28 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble15 = this.aDSPState1.granuleTime();
		if (this.aDouble15 == -1.0D) {
			this.aDouble15 = (double) ((float) this.anInt4921 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local28[0].length);
		this.anInt4921 += local28[0].length;
		@Pc(76) Class2_Sub1_Sub21 local76 = this.aClass2_Sub26_Sub2_1.method3390(this.aDouble15, local28[0].length);
		Static62.method1159(local76.aShortArrayArray22, local28);
		for (@Pc(84) int local84 = 0; local84 < this.aVorbisInfo1.channels; local84++) {
			local76.aShortArrayArray22[local84] = this.aClass269_1.method7163(local76.aShortArrayArray22[local84]);
		}
		this.aClass2_Sub26_Sub2_1.method3391(local76);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)D")
	public double method4462() {
		@Pc(12) double local12 = this.aDouble15;
		if (this.aClass2_Sub26_Sub2_1 != null) {
			local12 = this.aClass2_Sub26_Sub2_1.method3387();
			if (local12 < 0.0D) {
				local12 = this.aDouble15;
			}
		}
		return (double) -(256.0F / (float) Static237.anInt4718) + local12;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Lclient!fr;")
	public Class2_Sub26_Sub2 method4464() {
		return this.aClass2_Sub26_Sub2_1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	@Override
	public void method7539() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub26_Sub2_1 != null) {
			this.aClass2_Sub26_Sub2_1.method3386();
		}
	}
}
