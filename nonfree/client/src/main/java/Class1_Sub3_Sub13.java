import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(21) int[] local21 = this.method3468(arg0, 2);
			@Pc(27) int[][] local27 = this.method3465(arg0, 0);
			@Pc(33) int[][] local33 = this.method3465(arg0, 1);
			@Pc(37) int[] local37 = local11[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static76.anInt1531; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local41[local71] = local49[local71];
					local45[local71] = local53[local71];
					local37[local71] = local57[local71];
				} else if (local77 == 0) {
					local41[local71] = local61[local71];
					local45[local71] = local65[local71];
					local37[local71] = local69[local71];
				} else {
					@Pc(127) int local127 = 4096 - local77;
					local41[local71] = local77 * local49[local71] + local61[local71] * local127 >> 12;
					local45[local71] = local53[local71] * local77 + local127 * local65[local71] >> 12;
					local37[local71] = local57[local71] * local77 + local127 * local69[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(21) int[] local21 = this.method3468(arg0, 0);
			@Pc(27) int[] local27 = this.method3468(arg0, 1);
			@Pc(33) int[] local33 = this.method3468(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static76.anInt1531; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local41) * local27[local35] + local21[local35] * local41 >> 12;
				}
			}
		}
		return local11;
	}
}
