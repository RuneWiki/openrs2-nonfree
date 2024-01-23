import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(28) int[] local28 = this.method4946(arg0, 0);
			@Pc(34) int[] local34 = this.method4946(arg0, 1);
			@Pc(40) int[] local40 = this.method4946(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static114.anInt1359; local42++) {
				@Pc(49) int local49 = local40[local42];
				if (local49 == 4096) {
					local17[local42] = local28[local42];
				} else if (local49 == 0) {
					local17[local42] = local34[local42];
				} else {
					local17[local42] = local34[local42] * (4096 - local49) + local28[local42] * local49 >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(28) int[] local28 = this.method4946(arg0, 2);
			@Pc(34) int[][] local34 = this.method4937(0, arg0);
			@Pc(40) int[][] local40 = this.method4937(1, arg0);
			@Pc(44) int[] local44 = local34[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(52) int[] local52 = local34[0];
			@Pc(56) int[] local56 = local34[2];
			@Pc(60) int[] local60 = local11[1];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local40[0];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static114.anInt1359; local78++) {
				@Pc(85) int local85 = local28[local78];
				if (local85 == 4096) {
					local68[local78] = local52[local78];
					local60[local78] = local44[local78];
					local48[local78] = local56[local78];
				} else if (local85 == 0) {
					local68[local78] = local72[local78];
					local60[local78] = local64[local78];
					local48[local78] = local76[local78];
				} else {
					@Pc(120) int local120 = 4096 - local85;
					local68[local78] = local52[local78] * local85 + local72[local78] * local120 >> 12;
					local60[local78] = local64[local78] * local120 + local85 * local44[local78] >> 12;
					local48[local78] = local76[local78] * local120 + local56[local78] * local85 >> 12;
				}
			}
		}
		return local11;
	}
}
