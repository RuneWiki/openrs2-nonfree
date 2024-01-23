import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(24) int[] local24 = this.method4954(arg0, 2);
			@Pc(30) int[][] local30 = this.method4965(arg0, 0);
			@Pc(36) int[][] local36 = this.method4965(arg0, 1);
			@Pc(40) int[] local40 = local30[0];
			@Pc(44) int[] local44 = local14[2];
			@Pc(48) int[] local48 = local30[2];
			@Pc(52) int[] local52 = local14[0];
			@Pc(56) int[] local56 = local14[1];
			@Pc(60) int[] local60 = local30[1];
			@Pc(64) int[] local64 = local36[0];
			@Pc(68) int[] local68 = local36[1];
			@Pc(72) int[] local72 = local36[2];
			for (@Pc(74) int local74 = 0; local74 < Static22.anInt421; local74++) {
				@Pc(85) int local85 = local24[local74];
				if (local85 == 4096) {
					local52[local74] = local40[local74];
					local56[local74] = local60[local74];
					local44[local74] = local48[local74];
				} else if (local85 == 0) {
					local52[local74] = local64[local74];
					local56[local74] = local68[local74];
					local44[local74] = local72[local74];
				} else {
					@Pc(97) int local97 = 4096 - local85;
					local52[local74] = local85 * local40[local74] + local97 * local64[local74] >> 12;
					local56[local74] = local85 * local60[local74] + local68[local74] * local97 >> 12;
					local44[local74] = local72[local74] * local97 + local48[local74] * local85 >> 12;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(26) int[] local26 = this.method4954(arg0, 0);
			@Pc(32) int[] local32 = this.method4954(arg0, 1);
			@Pc(38) int[] local38 = this.method4954(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static22.anInt421; local40++) {
				@Pc(51) int local51 = local38[local40];
				if (local51 == 4096) {
					local16[local40] = local26[local40];
				} else if (local51 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local51) + local51 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}
}
