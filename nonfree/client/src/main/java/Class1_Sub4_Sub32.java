import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub4_Sub32 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		@Pc(15) int[] local15 = local11[1];
		@Pc(19) int[] local19 = local11[0];
		@Pc(28) int[] local28 = local11[2];
		if (super.aClass35_38.aBoolean89) {
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1888; local34++) {
				this.method2975(local34, arg0);
				@Pc(47) int[][] local47 = this.method3217(0, Static72.anInt2200);
				local19[local34] = local47[0][Static38.anInt1185];
				local15[local34] = local47[1][Static38.anInt1185];
				local28[local34] = local47[2][Static38.anInt1185];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)V")
	private void method2975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static171.anIntArray421[arg0];
		@Pc(21) int local21 = Static150.anIntArray383[arg1];
		@Pc(32) float local32 = (float) Math.atan2((double) (local5 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static72.anInt2200 = arg1;
			Static38.anInt1185 = arg0;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static72.anInt2200 = arg0;
			Static38.anInt1185 = arg1;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static38.anInt1185 = Static73.anInt1888 - arg1;
			Static72.anInt2200 = arg0;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static72.anInt2200 = Static98.anInt3017 - arg1;
			Static38.anInt1185 = arg0;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static38.anInt1185 = Static73.anInt1888 - arg0;
			Static72.anInt2200 = Static98.anInt3017 - arg1;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static38.anInt1185 = Static73.anInt1888 - arg1;
			Static72.anInt2200 = Static98.anInt3017 - arg0;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static38.anInt1185 = arg1;
			Static72.anInt2200 = Static98.anInt3017 - arg0;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static38.anInt1185 = Static73.anInt1888 - arg0;
			Static72.anInt2200 = arg1;
		}
		Static72.anInt2200 &= Static125.anInt3628;
		Static38.anInt1185 &= Static35.anInt672;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			for (@Pc(22) int local22 = 0; local22 < Static73.anInt1888; local22++) {
				this.method2975(local22, arg0);
				@Pc(35) int[] local35 = this.method3215(Static72.anInt2200, 0);
				local16[local22] = local35[Static38.anInt1185];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}
}
