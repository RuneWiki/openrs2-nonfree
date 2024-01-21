import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass62_38.method1904(arg0);
		@Pc(20) int[] local20 = local16[0];
		@Pc(24) int[] local24 = local16[1];
		@Pc(28) int[] local28 = local16[2];
		if (super.aClass62_38.aBoolean118) {
			for (@Pc(34) int local34 = 0; local34 < Static149.anInt3233; local34++) {
				this.method1328(arg0, local34);
				@Pc(47) int[][] local47 = this.method2582(0, Static9.anInt248);
				local20[local34] = local47[0][Static78.anInt734];
				local24[local34] = local47[1][Static78.anInt734];
				local28[local34] = local47[2][Static78.anInt734];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
	private void method1328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static86.anIntArray218[arg0];
		@Pc(13) int local13 = Static154.anIntArray354[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static9.anInt248 = arg0;
			Static78.anInt734 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static9.anInt248 = arg1;
			Static78.anInt734 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static9.anInt248 = arg1;
			Static78.anInt734 = Static149.anInt3233 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static9.anInt248 = Static2.anInt36 - arg0;
			Static78.anInt734 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static9.anInt248 = Static2.anInt36 - arg0;
			Static78.anInt734 = Static149.anInt3233 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static78.anInt734 = Static149.anInt3233 - arg0;
			Static9.anInt248 = Static2.anInt36 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static9.anInt248 = Static2.anInt36 - arg1;
			Static78.anInt734 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static78.anInt734 = Static149.anInt3233 - arg1;
			Static9.anInt248 = arg0;
		}
		Static9.anInt248 &= Static75.anInt1778;
		Static78.anInt734 &= Static145.anInt2636;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			for (@Pc(22) int local22 = 0; local22 < Static149.anInt3233; local22++) {
				this.method1328(arg0, local22);
				@Pc(37) int[] local37 = this.method2573(Static9.anInt248, 0);
				local16[local22] = local37[Static78.anInt734];
			}
		}
		return local16;
	}
}
