import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class1_Sub5_Sub39 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
	private int anInt6710 = 4096;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(29) int[] local29 = this.method5802(0, arg0 - 1 & Static42.anInt1137);
			@Pc(37) int[] local37 = this.method5802(0, arg0);
			@Pc(47) int[] local47 = this.method5802(0, arg0 + 1 & Static42.anInt1137);
			for (@Pc(49) int local49 = 0; local49 < Static75.anInt1566; local49++) {
				@Pc(62) int local62 = this.anInt6710 * (local47[local49] - local29[local49]);
				@Pc(82) int local82 = this.anInt6710 * (local37[Static239.anInt2816 & local49 + 1] - local37[local49 - 1 & Static239.anInt2816]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local15[local49] = 4096 - local128;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6710 = arg0.method5715();
		}
	}
}
