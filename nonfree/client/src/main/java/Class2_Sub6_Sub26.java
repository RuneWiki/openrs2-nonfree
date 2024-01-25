import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class2_Sub6_Sub26 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int[] local26 = this.method8461(0, arg0);
			@Pc(32) int[] local32 = this.method8461(1, arg0);
			@Pc(38) int[] local38 = this.method8461(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static51.anInt1085; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local46 * local26[local40] + (4096 - local46) * local32[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(21) int[] local21 = this.method8461(2, arg0);
			@Pc(27) int[][] local27 = this.method8465(0, arg0);
			@Pc(33) int[][] local33 = this.method8465(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static51.anInt1085; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(127) int local127 = 4096 - local77;
					local37[local71] = local61[local71] * local127 + local77 * local49[local71] >> 12;
					local41[local71] = local127 * local65[local71] + local77 * local53[local71] >> 12;
					local45[local71] = local127 * local69[local71] + local77 * local57[local71] >> 12;
				}
			}
		}
		return local11;
	}
}
