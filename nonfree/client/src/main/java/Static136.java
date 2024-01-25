import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!ie;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "F")
	public static float aFloat79 = 1.0F;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	public static void method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static167.aFloat24 < Static167.aFloat23) {
			Static167.aFloat24 = (float) ((double) Static167.aFloat24 + (double) Static167.aFloat24 / 30.0D);
			if (Static167.aFloat24 > Static167.aFloat23) {
				Static167.aFloat24 = Static167.aFloat23;
			}
			Static65.method1075();
			Static167.anInt2086 = (int) Static167.aFloat24 >> 1;
			Static167.aByteArrayArrayArray6 = Static305.method4181(Static167.anInt2086);
		} else if (Static167.aFloat23 < Static167.aFloat24) {
			Static167.aFloat24 = (float) ((double) Static167.aFloat24 - (double) Static167.aFloat24 / 30.0D);
			if (Static167.aFloat24 < Static167.aFloat23) {
				Static167.aFloat24 = Static167.aFloat23;
			}
			Static65.method1075();
			Static167.anInt2086 = (int) Static167.aFloat24 >> 1;
			Static167.aByteArrayArrayArray6 = Static305.method4181(Static167.anInt2086);
		}
		if (Static78.anInt3523 != -1 && Static222.anInt3998 != -1) {
			@Pc(83) int local83 = Static78.anInt3523 - Static441.anInt7355;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(102) int local102 = Static222.anInt3998 - Static169.anInt2773;
			if (local102 < 2 || local102 > 2) {
				local102 /= 8;
			}
			Static441.anInt7355 += local83;
			Static169.anInt2773 += local102;
			if (local83 == 0 && local102 == 0) {
				Static222.anInt3998 = -1;
				Static78.anInt3523 = -1;
			}
			Static65.method1075();
		}
		if (Static154.anInt2613 <= 0) {
			Static427.anInt7220 = -1;
			Static125.anInt2319 = -1;
		} else {
			Static287.anInt5028--;
			if (Static287.anInt5028 == 0) {
				Static287.anInt5028 = 100;
				Static154.anInt2613--;
			}
		}
		if (!Static451.aBoolean814 || Static103.aClass227_8 == null) {
			return;
		}
		for (@Pc(164) Class1_Sub38 local164 = (Class1_Sub38) Static103.aClass227_8.method4967(); local164 != null; local164 = (Class1_Sub38) Static103.aClass227_8.method4973()) {
			@Pc(173) Class205 local173 = Static167.aClass178_2.method3963(local164.aClass1_Sub36_1.anInt5632);
			if (local164.method4916(arg1, arg0)) {
				if (local173.aStringArray38 != null) {
					if (local173.aStringArray38[4] != null) {
						Static382.method5588(-1, local173.anInt5747, 1004, local173.aStringArray38[4], local173.aString66, 0, -1, (long) local164.aClass1_Sub36_1.anInt5632, true, false);
					}
					if (local173.aStringArray38[3] != null) {
						Static382.method5588(-1, local173.anInt5747, 1003, local173.aStringArray38[3], local173.aString66, 0, -1, (long) local164.aClass1_Sub36_1.anInt5632, true, false);
					}
					if (local173.aStringArray38[2] != null) {
						Static382.method5588(-1, local173.anInt5747, 1010, local173.aStringArray38[2], local173.aString66, 0, -1, (long) local164.aClass1_Sub36_1.anInt5632, true, false);
					}
					if (local173.aStringArray38[1] != null) {
						Static382.method5588(-1, local173.anInt5747, 1001, local173.aStringArray38[1], local173.aString66, 0, -1, (long) local164.aClass1_Sub36_1.anInt5632, true, false);
					}
					if (local173.aStringArray38[0] != null) {
						Static382.method5588(-1, local173.anInt5747, 1007, local173.aStringArray38[0], local173.aString66, 0, -1, (long) local164.aClass1_Sub36_1.anInt5632, true, false);
					}
				}
				if (!local164.aClass1_Sub36_1.aBoolean642) {
					local164.aClass1_Sub36_1.aBoolean642 = true;
					Static298.method4069(Static5.aClass182_1, local164.aClass1_Sub36_1.anInt5632, local173.anInt5747);
				}
				if (local164.aClass1_Sub36_1.aBoolean642) {
					Static298.method4069(Static366.aClass182_9, local164.aClass1_Sub36_1.anInt5632, local173.anInt5747);
				}
			} else if (local164.aClass1_Sub36_1.aBoolean642) {
				local164.aClass1_Sub36_1.aBoolean642 = false;
				Static298.method4069(Static345.aClass182_7, local164.aClass1_Sub36_1.anInt5632, local173.anInt5747);
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!vv;)V")
	public static void method5270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2 arg3) {
		@Pc(4) Class169 local4 = Static175.method2473(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII)V")
	public static void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class25_Sub1 local13 = local7.aClass25_Sub1_2;
		@Pc(16) Class25_Sub1 local16 = local7.aClass25_Sub1_3;
		if (local13 != null) {
			local13.anInt5359 = local13.anInt5359 * arg3 / (0x10 << Static215.anInt4460 - 7);
			local13.anInt5353 = local13.anInt5353 * arg3 / (0x10 << Static215.anInt4460 - 7);
		}
		if (local16 != null) {
			local16.anInt5359 = local16.anInt5359 * arg3 / (0x10 << Static215.anInt4460 - 7);
			local16.anInt5353 = local16.anInt5353 * arg3 / (0x10 << Static215.anInt4460 - 7);
		}
	}
}
