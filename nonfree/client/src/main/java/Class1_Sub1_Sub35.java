import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
	private void method2775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static106.anIntArray284[arg1];
		@Pc(18) int local18 = Static18.anIntArray101[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static175.anInt3993 = arg1;
			Static30.anInt1052 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static175.anInt3993 = arg0;
			Static30.anInt1052 = arg1;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static175.anInt3993 = Static65.anInt1933 - arg0;
			Static30.anInt1052 = arg1;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static30.anInt1052 = Static30.anInt1097 - arg0;
			Static175.anInt3993 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static30.anInt1052 = Static30.anInt1097 - arg0;
			Static175.anInt3993 = Static65.anInt1933 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static175.anInt3993 = Static65.anInt1933 - arg0;
			Static30.anInt1052 = Static30.anInt1097 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static30.anInt1052 = Static30.anInt1097 - arg1;
			Static175.anInt3993 = arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static30.anInt1052 = arg0;
			Static175.anInt3993 = Static65.anInt1933 - arg1;
		}
		Static30.anInt1052 &= Static93.anInt2716;
		Static175.anInt3993 &= Static64.anInt1922;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			for (@Pc(22) int local22 = 0; local22 < Static65.anInt1933; local22++) {
				this.method2775(arg0, local22);
				@Pc(35) int[] local35 = this.method3012(0, Static30.anInt1052);
				local7[local22] = local35[Static175.anInt3993];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		@Pc(15) int[] local15 = local11[0];
		@Pc(24) int[] local24 = local11[1];
		@Pc(28) int[] local28 = local11[2];
		if (super.aClass40_41.aBoolean168) {
			for (@Pc(34) int local34 = 0; local34 < Static65.anInt1933; local34++) {
				this.method2775(arg0, local34);
				@Pc(47) int[][] local47 = this.method3013(Static30.anInt1052, 0);
				local15[local34] = local47[0][Static175.anInt3993];
				local24[local34] = local47[1][Static175.anInt3993];
				local28[local34] = local47[2][Static175.anInt3993];
			}
		}
		return local11;
	}
}
