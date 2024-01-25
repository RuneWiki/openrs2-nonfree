import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "[S")
	public static short[] aShortArray13;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_32 = new Class205(37, -1);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)Z")
	public static boolean method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static85.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static100.anInt2069) {
			return false;
		} else if (local7 == Static100.anInt2069) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static333.anInt5694;
			@Pc(26) int local26 = arg2 << Static333.anInt5694;
			if (Static4.method85(local22 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg2), local26 + 1) && Static4.method85(local22 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg2), local26 + 1) && Static4.method85(local22 + Static180.anInt6489 - 1, Static350.aClass107Array4[arg0].method4685(arg1 + 1, arg2 + 1), local26 + Static180.anInt6489 - 1) && Static4.method85(local22 + 1, Static350.aClass107Array4[arg0].method4685(arg1, arg2 + 1), local26 + Static180.anInt6489 - 1)) {
				Static85.anIntArrayArrayArray2[arg0][arg1][arg2] = Static100.anInt2069;
				return true;
			} else {
				Static85.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static100.anInt2069;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)Lclient!ir;")
	public static Class110 method1053(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static338.aFloat53 == 3.0D) {
				return Static379.aClass110_8;
			}
			if ((double) Static338.aFloat53 == 4.0D) {
				return Static46.aClass110_1;
			}
			if ((double) Static338.aFloat53 == 6.0D) {
				return Static219.aClass110_4;
			}
			if ((double) Static338.aFloat53 >= 8.0D) {
				return Static373.aClass110_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static338.aFloat53 == 3.0D) {
				return Static219.aClass110_4;
			}
			if ((double) Static338.aFloat53 == 4.0D) {
				return Static373.aClass110_7;
			}
			if ((double) Static338.aFloat53 == 6.0D) {
				return Static160.aClass110_3;
			}
			if ((double) Static338.aFloat53 >= 8.0D) {
				return Static269.aClass110_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static338.aFloat53 == 3.0D) {
				return Static160.aClass110_3;
			}
			if ((double) Static338.aFloat53 == 4.0D) {
				return Static269.aClass110_5;
			}
			if ((double) Static338.aFloat53 == 6.0D) {
				return Static361.aClass110_6;
			}
			if ((double) Static338.aFloat53 >= 8.0D) {
				return Static59.aClass110_2;
			}
		}
		return null;
	}
}
