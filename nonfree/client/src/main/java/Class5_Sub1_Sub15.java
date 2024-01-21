import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static174.anInt3489; local34++) {
				this.method1217(local34, arg0);
				@Pc(49) int[][] local49 = this.method3191(0, Static59.anInt1343);
				local24[local34] = local49[0][Static118.anInt3270];
				local28[local34] = local49[1][Static118.anInt3270];
				local32[local34] = local49[2][Static118.anInt3270];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(III)V")
	private void method1217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static117.anIntArray274[arg0];
		@Pc(13) int local13 = Static147.anIntArray321[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static59.anInt1343 = arg1;
			Static118.anInt3270 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static59.anInt1343 = arg0;
			Static118.anInt3270 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static59.anInt1343 = arg0;
			Static118.anInt3270 = Static174.anInt3489 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static59.anInt1343 = Static207.anInt4072 - arg1;
			Static118.anInt3270 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static59.anInt1343 = Static207.anInt4072 - arg1;
			Static118.anInt3270 = Static174.anInt3489 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static118.anInt3270 = Static174.anInt3489 - arg1;
			Static59.anInt1343 = Static207.anInt4072 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static59.anInt1343 = Static207.anInt4072 - arg0;
			Static118.anInt3270 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static59.anInt1343 = arg1;
			Static118.anInt3270 = Static174.anInt3489 - arg0;
		}
		Static118.anInt3270 &= Static189.anInt3753;
		Static59.anInt1343 &= Static3.anInt74;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			for (@Pc(21) int local21 = 0; local21 < Static174.anInt3489; local21++) {
				this.method1217(local21, arg0);
				@Pc(34) int[] local34 = this.method3196(Static59.anInt1343, 0);
				local15[local21] = local34[Static118.anInt3270];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}
}
