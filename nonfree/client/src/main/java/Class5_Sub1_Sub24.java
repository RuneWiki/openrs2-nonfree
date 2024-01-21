import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class5_Sub1_Sub24 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub24() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(28) int[] local28 = this.method3196(arg0, 0);
			@Pc(34) int[] local34 = this.method3196(arg0, 1);
			@Pc(40) int[] local40 = this.method3196(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static174.anInt3489; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local11[local42] = local28[local42];
				} else if (local48 == 0) {
					local11[local42] = local34[local42];
				} else {
					local11[local42] = local34[local42] * (4096 - local48) + local28[local42] * local48 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(17) int[] local17 = this.method3196(arg0, 2);
			@Pc(23) int[][] local23 = this.method3191(0, arg0);
			@Pc(29) int[][] local29 = this.method3191(1, arg0);
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			@Pc(45) int[] local45 = local23[0];
			@Pc(49) int[] local49 = local23[1];
			@Pc(53) int[] local53 = local29[0];
			@Pc(57) int[] local57 = local23[2];
			@Pc(61) int[] local61 = local29[1];
			@Pc(65) int[] local65 = local29[2];
			for (@Pc(67) int local67 = 0; local67 < Static174.anInt3489; local67++) {
				@Pc(73) int local73 = local17[local67];
				if (local73 == 4096) {
					local33[local67] = local45[local67];
					local37[local67] = local49[local67];
					local41[local67] = local57[local67];
				} else if (local73 == 0) {
					local33[local67] = local53[local67];
					local37[local67] = local61[local67];
					local41[local67] = local65[local67];
				} else {
					@Pc(126) int local126 = 4096 - local73;
					local33[local67] = local45[local67] * local73 + local126 * local53[local67] >> 12;
					local37[local67] = local49[local67] * local73 + local126 * local61[local67] >> 12;
					local41[local67] = local126 * local65[local67] + local73 * local57[local67] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}
}
