import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt547 = 0;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt548 = 0;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!wf;IIIILclient!uj;)V")
	public static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub3_Sub14 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static202.aFloat97 + Static269.anInt3585 & 0x7FF;
		@Pc(26) int local26 = Math.max(arg1.anInt5897 / 2, arg1.anInt5953 / 2) + 10;
		@Pc(34) int local34 = arg4 * arg4 + arg3 * arg3;
		if (local34 > local26 * local26) {
			return;
		}
		@Pc(45) int local45 = Class111.anIntArray299[local14];
		@Pc(53) int local53 = local45 * 256 / (Static250.anInt4762 + 256);
		@Pc(57) int local57 = Class111.anIntArray298[local14];
		@Pc(65) int local65 = local57 * 256 / (Static250.anInt4762 + 256);
		@Pc(75) int local75 = arg3 * local65 + arg4 * local53 >> 16;
		@Pc(86) int local86 = local65 * arg4 - arg3 * local53 >> 16;
		if (Static94.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) arg5).method4554(arg1.anInt5897 / 2 + arg0 + local75 - arg5.anInt5603 / 2, -(arg5.anInt5613 / 2) + -local86 + arg1.anInt5953 / 2 + arg2, (Class4_Sub3_Sub14_Sub2) arg1.method4766(false));
		} else {
			((Class4_Sub3_Sub14_Sub1) arg5).method2172(arg0 + arg1.anInt5897 / 2 + local75 - arg5.anInt5603 / 2, -(arg5.anInt5613 / 2) + -local86 + arg1.anInt5953 / 2 + arg2, arg1.anIntArray672, arg1.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILclient!wf;II)V")
	public static void method526(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg2.anInt5953;
		if (arg2.aByte27 == 0) {
			arg2.anInt5953 = arg2.anInt5954;
		} else if (arg2.aByte27 == 1) {
			arg2.anInt5953 = arg3 - arg2.anInt5954;
		} else if (arg2.aByte27 == 2) {
			arg2.anInt5953 = arg3 * arg2.anInt5954 >> 14;
		} else if (arg2.aByte27 == 3) {
			if (arg2.anInt5915 == 2) {
				arg2.anInt5953 = arg2.anInt5968 * (arg2.anInt5954 - 1) + arg2.anInt5954 * 32;
			} else if (arg2.anInt5915 == 7) {
				arg2.anInt5953 = arg2.anInt5954 * 12 + (arg2.anInt5954 - 1) * arg2.anInt5968;
			}
		}
		@Pc(108) int local108 = arg2.anInt5897;
		if (arg2.aByte24 == 0) {
			arg2.anInt5897 = arg2.anInt5931;
		} else if (arg2.aByte24 == 1) {
			arg2.anInt5897 = arg1 - arg2.anInt5931;
		} else if (arg2.aByte24 == 2) {
			arg2.anInt5897 = arg1 * arg2.anInt5931 >> 14;
		} else if (arg2.aByte24 == 3) {
			if (arg2.anInt5915 == 2) {
				arg2.anInt5897 = (arg2.anInt5931 - 1) * arg2.anInt5947 + arg2.anInt5931 * 32;
			} else if (arg2.anInt5915 == 7) {
				arg2.anInt5897 = arg2.anInt5931 * 115 + arg2.anInt5947 * (arg2.anInt5931 - 1);
			}
		}
		if (arg2.aByte24 == 4) {
			arg2.anInt5897 = arg2.anInt5912 * arg2.anInt5953 / arg2.anInt5974;
		}
		if (arg2.aByte27 == 4) {
			arg2.anInt5953 = arg2.anInt5974 * arg2.anInt5897 / arg2.anInt5912;
		}
		if (Static27.aBoolean26 && (Static41.method687(arg2).anInt3947 != 0 || arg2.anInt5915 == 0)) {
			if (arg2.anInt5953 < 5 && arg2.anInt5897 < 5) {
				arg2.anInt5953 = 5;
				arg2.anInt5897 = 5;
			} else {
				if (arg2.anInt5953 <= 0) {
					arg2.anInt5953 = 5;
				}
				if (arg2.anInt5897 <= 0) {
					arg2.anInt5897 = 5;
				}
			}
		}
		if (arg2.anInt5908 == 1337) {
			Static115.aClass189_5 = arg2;
		}
		if (arg0 && arg2.anObjectArray32 != null && (local108 != arg2.anInt5897 || local13 != arg2.anInt5953)) {
			@Pc(298) Class4_Sub13 local298 = new Class4_Sub13();
			local298.anObjectArray2 = arg2.anObjectArray32;
			local298.aClass189_7 = arg2;
			Static135.aClass114_14.method2625(local298);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!dm;")
	public static Class42 method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass42_1 == null ? null : local7.aClass42_1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!p;BI)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt4007 && arg0 != -1) {
			@Pc(19) Class46 local19 = Static156.method2501(arg0);
			@Pc(22) int local22 = local19.anInt1238;
			if (local22 == 1) {
				arg1.anInt3970 = 0;
				arg1.anInt3996 = arg2;
				arg1.anInt4011 = 1;
				arg1.anInt4001 = 0;
				arg1.anInt4044 = 0;
				Static213.method3474(local19, arg1.anInt4002, arg1.anInt3974, arg1.anInt3970, false);
			}
			if (local22 == 2) {
				arg1.anInt4001 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4007 == -1 || Static156.method2501(arg0).anInt1243 >= Static156.method2501(arg1.anInt4007).anInt1243) {
			arg1.anInt4011 = 1;
			arg1.anInt4030 = arg1.anInt3965;
			arg1.anInt4001 = 0;
			arg1.anInt3970 = 0;
			arg1.anInt3996 = arg2;
			arg1.anInt4007 = arg0;
			arg1.anInt4044 = 0;
			if (arg1.anInt4007 != -1) {
				Static213.method3474(Static156.method2501(arg1.anInt4007), arg1.anInt4002, arg1.anInt3974, arg1.anInt3970, false);
			}
		}
	}
}
