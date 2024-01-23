import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class4_Sub6_Sub17 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub17() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(24) int[] local24 = this.method4372(0, arg0);
			@Pc(30) int[] local30 = this.method4372(1, arg0);
			@Pc(36) int[] local36 = this.method4372(2, arg0);
			for (@Pc(38) int local38 = 0; local38 < Static2.anInt19; local38++) {
				@Pc(49) int local49 = local36[local38];
				if (local49 == 4096) {
					local7[local38] = local24[local38];
				} else if (local49 == 0) {
					local7[local38] = local30[local38];
				} else {
					local7[local38] = local30[local38] * (4096 - local49) + local49 * local24[local38] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(32) int[] local32 = this.method4372(2, arg0);
			@Pc(38) int[][] local38 = this.method4377(arg0, 0);
			@Pc(44) int[][] local44 = this.method4377(arg0, 1);
			@Pc(48) int[] local48 = local21[0];
			@Pc(52) int[] local52 = local21[1];
			@Pc(56) int[] local56 = local38[0];
			@Pc(60) int[] local60 = local21[2];
			@Pc(64) int[] local64 = local38[1];
			@Pc(68) int[] local68 = local38[2];
			@Pc(72) int[] local72 = local44[0];
			@Pc(76) int[] local76 = local44[1];
			@Pc(80) int[] local80 = local44[2];
			for (@Pc(82) int local82 = 0; local82 < Static2.anInt19; local82++) {
				@Pc(89) int local89 = local32[local82];
				if (local89 == 4096) {
					local48[local82] = local56[local82];
					local52[local82] = local64[local82];
					local60[local82] = local68[local82];
				} else if (local89 == 0) {
					local48[local82] = local72[local82];
					local52[local82] = local76[local82];
					local60[local82] = local80[local82];
				} else {
					@Pc(100) int local100 = 4096 - local89;
					local48[local82] = local72[local82] * local100 + local56[local82] * local89 >> 12;
					local52[local82] = local64[local82] * local89 + local100 * local76[local82] >> 12;
					local60[local82] = local68[local82] * local89 + local80[local82] * local100 >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}
}
