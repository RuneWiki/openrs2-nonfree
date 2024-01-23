import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class8_Sub3_Sub11 extends Class8_Sub3 {

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(22) int[] local22 = this.method4230(arg0, 2);
			@Pc(30) int[][] local30 = this.method4224(arg0, 0);
			@Pc(36) int[][] local36 = this.method4224(arg0, 1);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local30[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local30[2];
			@Pc(60) int[] local60 = local30[1];
			@Pc(64) int[] local64 = local36[1];
			@Pc(68) int[] local68 = local36[0];
			@Pc(72) int[] local72 = local36[2];
			for (@Pc(74) int local74 = 0; local74 < Static239.anInt4789; local74++) {
				@Pc(85) int local85 = local22[local74];
				if (local85 == 4096) {
					local40[local74] = local44[local74];
					local48[local74] = local60[local74];
					local52[local74] = local56[local74];
				} else if (local85 == 0) {
					local40[local74] = local68[local74];
					local48[local74] = local64[local74];
					local52[local74] = local72[local74];
				} else {
					@Pc(140) int local140 = 4096 - local85;
					local40[local74] = local140 * local68[local74] + local44[local74] * local85 >> 12;
					local48[local74] = local60[local74] * local85 + local64[local74] * local140 >> 12;
					local52[local74] = local72[local74] * local140 + local56[local74] * local85 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(26) int[] local26 = this.method4230(arg0, 0);
			@Pc(32) int[] local32 = this.method4230(arg0, 1);
			@Pc(38) int[] local38 = this.method4230(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static239.anInt4789; local40++) {
				@Pc(47) int local47 = local38[local40];
				if (local47 == 4096) {
					local11[local40] = local26[local40];
				} else if (local47 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local26[local40] * local47 + local32[local40] * (4096 - local47) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}
}
