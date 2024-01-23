import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!e", name = "y", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array1;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)I")
	public static int method706(@OriginalArg(0) int arg0) {
		if (Static209.anInt4478 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIIII)V")
	public static void method707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static107.method1863(Static141.anInt3163, arg3, Static200.anInt4273);
		@Pc(13) int local13 = Static107.method1863(Static141.anInt3163, arg0, Static200.anInt4273);
		@Pc(30) int local30 = Static107.method1863(Static214.anInt4572, arg1, Static130.anInt2847);
		@Pc(36) int local36 = Static107.method1863(Static214.anInt4572, arg4, Static130.anInt2847);
		for (@Pc(38) int local38 = local7; local38 <= local13; local38++) {
			Static104.method1768(local30, local36, arg2, Static148.anIntArrayArray78[local38]);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIZIIIIZ)Lclient!ch;")
	public static Class1_Sub1_Sub6 method710(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Class1_Sub1_Sub18 local5 = Static191.method2990(arg4);
		if (arg1 > 1 && local5.anIntArray390 != null) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg1 >= local5.anIntArray389[local15] && local5.anIntArray389[local15] != 0) {
					local13 = local5.anIntArray390[local15];
				}
			}
			if (local13 != -1) {
				local5 = Static191.method2990(local13);
			}
		}
		@Pc(56) Class9_Sub2_Sub1 local56 = local5.method2288();
		if (local56 == null) {
			return null;
		}
		@Pc(62) Class1_Sub1_Sub6_Sub1 local62 = null;
		if (local5.anInt3027 != -1) {
			local62 = (Class1_Sub1_Sub6_Sub1) method710(false, 10, true, 0, local5.anInt3024, 1);
			if (local62 == null) {
				return null;
			}
		} else if (local5.anInt2987 != -1) {
			local62 = (Class1_Sub1_Sub6_Sub1) method710(false, arg1, false, arg3, local5.anInt3004, arg5);
			if (local62 == null) {
				return null;
			}
		}
		@Pc(106) int[] local106 = Static76.anIntArray214;
		@Pc(109) int[] local109 = new int[4];
		@Pc(111) int local111 = Static76.anInt1848;
		@Pc(113) int local113 = Static76.anInt1846;
		Static76.method1356(local109);
		@Pc(121) Class1_Sub1_Sub6_Sub1 local121 = new Class1_Sub1_Sub6_Sub1(36, 32);
		Static76.method1359(local121.anIntArray366, 36, 32);
		Static81.method1437();
		Static81.method1448(16, 16);
		Static81.aBoolean104 = false;
		@Pc(140) int local140 = local5.anInt3013;
		if (arg2) {
			local140 = (int) ((double) local140 * 1.5D);
		} else if (arg5 == 2) {
			local140 = (int) ((double) local140 * 1.04D);
		}
		@Pc(170) int local170 = Class46.anIntArray225[local5.anInt3018] * local140 >> 16;
		@Pc(179) int local179 = local140 * Class46.anIntArray226[local5.anInt3018] >> 16;
		local56.method1710(local5.anInt2994, local5.anInt2999, local5.anInt3018, local5.anInt2988, local179 + local5.anInt2995 - local56.method2902() / 2, local5.anInt2995 + local170);
		if (arg5 >= 1) {
			local121.method2180(1);
			if (arg5 >= 2) {
				local121.method2180(16777215);
			}
			Static76.method1359(local121.anIntArray366, 36, 32);
		}
		if (arg3 != 0) {
			local121.method2181(arg3);
		}
		if (local5.anInt3027 != -1) {
			local62.method2164(0, 0);
		} else if (local5.anInt2987 != -1) {
			Static76.method1359(local62.anIntArray366, 36, 32);
			local121.method2164(0, 0);
			local121 = local62;
		}
		if (arg0 && (local5.anInt3014 == 1 || arg1 != 1) && arg1 != -1) {
			Static2.aClass1_Sub1_Sub14_Sub1_Sub1_1.method3317(Static143.method2455(arg1), 0, 9, 16776960, 1);
		}
		Static76.method1359(local106, local113, local111);
		Static76.method1369(local109);
		Static81.method1437();
		Static81.aBoolean104 = true;
		return local121;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method711() {
		Static91.anIntArray251 = null;
		Static181.anIntArray504 = null;
		Static97.anIntArray263 = null;
		Static10.anIntArray46 = null;
		Static110.anIntArray317 = null;
		Static96.aByteArrayArray4 = null;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static void method712() {
		Static116.aClass39_14.method1158();
		Static155.aClass39_18.method1158();
	}
}
