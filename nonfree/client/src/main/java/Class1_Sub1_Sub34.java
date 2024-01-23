import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(26) int[] local26 = this.method3733(arg0, 0);
			@Pc(32) int[] local32 = this.method3733(arg0, 1);
			@Pc(38) int[] local38 = this.method3733(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static157.anInt3431; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(17) int[] local17 = this.method3733(arg0, 2);
			@Pc(23) int[][] local23 = this.method3737(0, arg0);
			@Pc(29) int[][] local29 = this.method3737(1, arg0);
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local23[0];
			@Pc(45) int[] local45 = local7[1];
			@Pc(49) int[] local49 = local23[2];
			@Pc(53) int[] local53 = local23[1];
			@Pc(57) int[] local57 = local29[0];
			@Pc(61) int[] local61 = local29[1];
			@Pc(65) int[] local65 = local29[2];
			for (@Pc(67) int local67 = 0; local67 < Static157.anInt3431; local67++) {
				@Pc(73) int local73 = local17[local67];
				if (local73 == 4096) {
					local33[local67] = local41[local67];
					local45[local67] = local53[local67];
					local37[local67] = local49[local67];
				} else if (local73 == 0) {
					local33[local67] = local57[local67];
					local45[local67] = local61[local67];
					local37[local67] = local65[local67];
				} else {
					@Pc(104) int local104 = 4096 - local73;
					local33[local67] = local73 * local41[local67] + local57[local67] * local104 >> 12;
					local45[local67] = local61[local67] * local104 + local73 * local53[local67] >> 12;
					local37[local67] = local104 * local65[local67] + local49[local67] * local73 >> 12;
				}
			}
		}
		return local7;
	}
}
