import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(21) int[] local21 = this.method2904(2, arg0);
			@Pc(27) int[][] local27 = this.method2913(arg0, 0);
			@Pc(33) int[][] local33 = this.method2913(arg0, 1);
			@Pc(37) int[] local37 = local11[2];
			@Pc(41) int[] local41 = local27[1];
			@Pc(45) int[] local45 = local27[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[0];
			@Pc(57) int[] local57 = local33[2];
			@Pc(61) int[] local61 = local27[2];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[0];
			for (@Pc(71) int local71 = 0; local71 < Static141.anInt3261; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local53[local71] = local45[local71];
					local49[local71] = local41[local71];
					local37[local71] = local61[local71];
				} else if (local77 == 0) {
					local53[local71] = local69[local71];
					local49[local71] = local65[local71];
					local37[local71] = local57[local71];
				} else {
					@Pc(111) int local111 = 4096 - local77;
					local53[local71] = local45[local71] * local77 + local69[local71] * local111 >> 12;
					local49[local71] = local41[local71] * local77 + local65[local71] * local111 >> 12;
					local37[local71] = local61[local71] * local77 + local57[local71] * local111 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean171 = arg1.method191() == 1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(26) int[] local26 = this.method2904(0, arg0);
			@Pc(32) int[] local32 = this.method2904(1, arg0);
			@Pc(38) int[] local38 = this.method2904(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static141.anInt3261; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}
}
