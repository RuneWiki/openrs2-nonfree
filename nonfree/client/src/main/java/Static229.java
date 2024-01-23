import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!nk;")
	public static Class121 aClass121_99;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[[[Lclient!wk;")
	public static Class1_Sub33[][][] aClass1_Sub33ArrayArrayArray4;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!qb;")
	public static Class142 aClass142_19 = new Class142(32);

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString237 = "Please wait...";

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public static int anInt4204 = 0;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
	public static int anInt4205 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
	public static int[] anIntArray354 = new int[] { 10, 0, 0, 15, 0, 0, 0, 0, 0, 12, 5, 0, 8, -1, 0, 0, -2, 0, 2, 8, 0, 8, 0, 0, -1, 6, 0, 0, -1, 0, 0, -2, 12, 2, 0, 0, 7, 0, 0, 0, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 11, 3, 0, 0, 3, 0, 0, 6, 0, 0, 2, 6, 0, 7, 0, 0, 0, 0, 0, -2, 0, 0, -1, 6, 0, 0, 0, 0, 0, 0, 8, 0, 10, 0, 0, 0, 0, -2, 3, 0, 0, 4, 0, 6, 0, 0, 12, 0, 1, 0, 0, 14, -2, 0, 0, 0, -2, 3, 0, 0, 10, 0, 0, 0, -1, 1, 0, 5, 0, 2, 6, 5, 6, 0, 2, 12, -1, 15, 0, 0, -2, 0, 0, -1, 0, 4, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 7, 0, 0, -1, 2, 0, 0, 0, -1, 0, 3, 0, 0, -2, 0, 4, 0, 8, 0, 28, 0, 6, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 0, 3, -1, -2, 10, 0, 0, 6, 20, 0, 0, 0, 8, 0, 0, 0, 0, 3, 1, 0, 0, 0, 9, 0, 17, 0, 0, -1, 0, 0, -2, 0, -2, 3, 0, 0, 0, 0, -1, 14, 0, 2, 4, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, 5, 3, 0, 0, 8, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString238 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public static int anInt4206 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
	public static int method3544() {
		try {
			if (Static66.anInt4307 == 0) {
				if (Static298.method4535() - 5000L < Static141.aLong100) {
					return 0;
				}
				Static111.aClass185_3 = Static26.aClass154_1.method3892(Static47.aString51, Static224.anInt4119);
				Static81.aLong62 = Static298.method4535();
				Static66.anInt4307 = 1;
			}
			if (Static298.method4535() > Static81.aLong62 + 30000L) {
				return Static222.method3456(1000);
			}
			@Pc(67) int local67;
			@Pc(119) int local119;
			if (Static66.anInt4307 == 1) {
				if (Static111.aClass185_3.anInt5276 == 2) {
					return Static222.method3456(1001);
				}
				if (Static111.aClass185_3.anInt5276 != 1) {
					return -1;
				}
				local67 = 0;
				Static5.aClass97_1 = new Class97((Socket) Static111.aClass185_3.anObject6, Static26.aClass154_1);
				if (Static212.aBoolean26) {
					local67 = Static239.anInt4333;
				}
				Static111.aClass185_3 = null;
				Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
				Static127.aClass1_Sub14_Sub1_3.method1390(23);
				Static127.aClass1_Sub14_Sub1_3.method1387(local67);
				Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				local119 = Static5.aClass97_1.method2548();
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				if (local119 != 0) {
					return Static222.method3456(local119);
				}
				Static66.anInt4307 = 2;
			}
			if (Static66.anInt4307 == 2) {
				if (Static5.aClass97_1.method2551() < 2) {
					return -1;
				}
				Static53.anInt1036 = Static5.aClass97_1.method2548();
				Static53.anInt1036 <<= 0x8;
				Static53.anInt1036 += Static5.aClass97_1.method2548();
				Static66.anInt4307 = 3;
				Static134.anInt5656 = 0;
				Static203.aByteArray47 = new byte[Static53.anInt1036];
			}
			if (Static66.anInt4307 != 3) {
				return -1;
			}
			local67 = Static5.aClass97_1.method2551();
			if (local67 < 1) {
				return -1;
			}
			if (Static53.anInt1036 - Static134.anInt5656 < local67) {
				local67 = Static53.anInt1036 - Static134.anInt5656;
			}
			Static5.aClass97_1.method2556(Static134.anInt5656, local67, Static203.aByteArray47);
			Static134.anInt5656 += local67;
			if (Static134.anInt5656 < Static53.anInt1036) {
				return -1;
			} else if (Static238.method3679(Static203.aByteArray47)) {
				Static96.aClass29_Sub1Array3 = new Class29_Sub1[Static114.anInt2372];
				local119 = 0;
				for (@Pc(241) int local241 = Static61.anInt1170; local241 <= Static196.anInt3705; local241++) {
					@Pc(252) Class29_Sub1 local252 = Static126.method1641(local241);
					if (local252 != null) {
						Static96.aClass29_Sub1Array3[local119++] = local252;
					}
				}
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
				Static154.anInt3036 = 0;
				Static66.anInt4307 = 0;
				Static203.aByteArray47 = null;
				Static141.aLong100 = Static298.method4535();
				return 0;
			} else {
				return Static222.method3456(1002);
			}
		} catch (@Pc(283) IOException local283) {
			return Static222.method3456(1003);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public static void method3546(@OriginalArg(1) int arg0) {
		Static130.method2235();
		Static226.method3511();
		@Pc(12) int local12 = Static98.method1803(arg0).anInt409;
		if (local12 == 0) {
			return;
		}
		@Pc(27) int local27 = Static55.anIntArray64[arg0];
		if (local12 == 9) {
			Static199.anInt3822 = local27;
		}
		if (local12 == 6) {
			Static26.anInt452 = local27;
		}
		if (local12 == 5) {
			Static287.anInt5144 = local27;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)Lclient!hb;")
	public static Class63 method3547(@OriginalArg(1) int arg0) {
		@Pc(10) Class63 local10 = (Class63) Static48.aClass187_27.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static133.aClass121_64.method3115(33, arg0);
		local10 = new Class63();
		if (local28 != null) {
			local10.method1814(new Class1_Sub14(local28), arg0);
		}
		Static48.aClass187_27.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = 0;
		Static77.method1513(arg4);
		@Pc(15) int local15 = arg4 - arg1;
		@Pc(18) int local18 = -arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(26) int local26 = local15;
		@Pc(28) int local28 = arg4;
		@Pc(30) int local30 = -1;
		@Pc(33) int local33 = -local15;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(87) int local87;
		if (arg2 >= Static98.anInt2007 && arg2 <= Static213.anInt4452) {
			@Pc(52) int[] local52 = Static183.anIntArrayArray26[arg2];
			local61 = Static226.method3512(arg0 - arg4, Static29.anInt517, Static11.anInt170);
			local69 = Static226.method3512(arg0 + arg4, Static29.anInt517, Static11.anInt170);
			local77 = Static226.method3512(arg0 - local15, Static29.anInt517, Static11.anInt170);
			local87 = Static226.method3512(local15 + arg0, Static29.anInt517, Static11.anInt170);
			Static273.method4257(local61, local52, arg5, local77);
			Static273.method4257(local77, local52, arg3, local87);
			Static273.method4257(local87, local52, arg5, local69);
		}
		@Pc(107) int local107 = -1;
		while (local3 < local28) {
			local107 += 2;
			local30 += 2;
			local18 += local30;
			local33 += local107;
			if (local33 >= 0 && local26 >= 1) {
				local26--;
				Static56.anIntArray65[local26] = local3;
				local33 -= local26 << 1;
			}
			local3++;
			@Pc(265) int local265;
			@Pc(274) int local274;
			@Pc(286) int[] local286;
			@Pc(153) int local153;
			if (local18 >= 0) {
				local28--;
				local153 = arg2 - local28;
				local18 -= local28 << 1;
				local61 = arg2 + local28;
				if (Static98.anInt2007 <= local61 && Static213.anInt4452 >= local153) {
					if (local28 >= local15) {
						local69 = Static226.method3512(local3 + arg0, Static29.anInt517, Static11.anInt170);
						local77 = Static226.method3512(arg0 - local3, Static29.anInt517, Static11.anInt170);
						if (local61 <= Static213.anInt4452) {
							Static273.method4257(local77, Static183.anIntArrayArray26[local61], arg5, local69);
						}
						if (Static98.anInt2007 <= local153) {
							Static273.method4257(local77, Static183.anIntArrayArray26[local153], arg5, local69);
						}
					} else {
						local69 = Static56.anIntArray65[local28];
						local77 = Static226.method3512(arg0 + local3, Static29.anInt517, Static11.anInt170);
						local87 = Static226.method3512(arg0 - local3, Static29.anInt517, Static11.anInt170);
						local265 = Static226.method3512(arg0 + local69, Static29.anInt517, Static11.anInt170);
						local274 = Static226.method3512(arg0 - local69, Static29.anInt517, Static11.anInt170);
						if (local61 <= Static213.anInt4452) {
							local286 = Static183.anIntArrayArray26[local61];
							Static273.method4257(local87, local286, arg5, local274);
							Static273.method4257(local274, local286, arg3, local265);
							Static273.method4257(local265, local286, arg5, local77);
						}
						if (Static98.anInt2007 <= local153) {
							local286 = Static183.anIntArrayArray26[local153];
							Static273.method4257(local87, local286, arg5, local274);
							Static273.method4257(local274, local286, arg3, local265);
							Static273.method4257(local265, local286, arg5, local77);
						}
					}
				}
			}
			local61 = arg2 + local3;
			local153 = arg2 - local3;
			if (Static98.anInt2007 <= local61 && Static213.anInt4452 >= local153) {
				local69 = local28 + arg0;
				local77 = arg0 - local28;
				if (Static29.anInt517 <= local69 && Static11.anInt170 >= local77) {
					local69 = Static226.method3512(local69, Static29.anInt517, Static11.anInt170);
					local77 = Static226.method3512(local77, Static29.anInt517, Static11.anInt170);
					if (local15 <= local3) {
						if (Static213.anInt4452 >= local61) {
							Static273.method4257(local77, Static183.anIntArrayArray26[local61], arg5, local69);
						}
						if (local153 >= Static98.anInt2007) {
							Static273.method4257(local77, Static183.anIntArrayArray26[local153], arg5, local69);
						}
					} else {
						local87 = local26 >= local3 ? local26 : Static56.anIntArray65[local3];
						local265 = Static226.method3512(local87 + arg0, Static29.anInt517, Static11.anInt170);
						local274 = Static226.method3512(arg0 - local87, Static29.anInt517, Static11.anInt170);
						if (local61 <= Static213.anInt4452) {
							local286 = Static183.anIntArrayArray26[local61];
							Static273.method4257(local77, local286, arg5, local274);
							Static273.method4257(local274, local286, arg3, local265);
							Static273.method4257(local265, local286, arg5, local69);
						}
						if (Static98.anInt2007 <= local153) {
							local286 = Static183.anIntArrayArray26[local153];
							Static273.method4257(local77, local286, arg5, local274);
							Static273.method4257(local274, local286, arg3, local265);
							Static273.method4257(local265, local286, arg5, local69);
						}
					}
				}
			}
		}
	}
}
