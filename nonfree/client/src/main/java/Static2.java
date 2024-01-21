import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
	public static long aLong1;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_4 = Static6.method100("Clientscript error in: ");

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[32];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_5 = Static6.method100("_");

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!he;")
	private static Class26 aClass26_6 = Static6.method100("No response from server)3");

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_7 = Static6.method100("titlebox");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_8 = aClass26_6;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	public static int anInt17 = 0;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
	public static int anInt18 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!d;III)V")
	public static void method7(@OriginalArg(1) Class3_Sub1_Sub5_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1 || Static56.anInt1695 >= 400) {
			return;
		}
		@Pc(50) Class26 local50;
		if (arg0.anInt825 == 0) {
			local50 = Static119.method2136(new Class26[] { arg0.aClass26_393, Static27.method585(Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt823, arg0.anInt823), Static35.aClass26_583, Static5.aClass26_1753, Static122.method2170(arg0.anInt823), Static51.aClass26_804 });
		} else {
			local50 = Static119.method2136(new Class26[] { arg0.aClass26_393, Static35.aClass26_583, Static35.aClass26_582, Static122.method2170(arg0.anInt825), Static51.aClass26_804 });
		}
		@Pc(164) int local164;
		if (Static3.anInt89 == 1) {
			Static24.method514(Static119.method2136(new Class26[] { Static102.aClass26_1505, Static44.aClass26_709, local50 }), arg2, arg1, 30, arg3, Static93.aClass26_1343);
		} else if (!Static117.aBoolean169) {
			for (local164 = 7; local164 >= 0; local164--) {
				if (Static114.aClass26Array25[local164] != null) {
					@Pc(176) short local176 = 0;
					if (Static114.aClass26Array25[local164].method832(Static94.aClass26_1359)) {
						if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt823 < arg0.anInt823) {
							local176 = 2000;
						}
						if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt828 != 0 && arg0.anInt828 != 0) {
							if (arg0.anInt828 == Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt828) {
								local176 = 2000;
							} else {
								local176 = 0;
							}
						}
					} else if (Static43.aBooleanArray25[local164]) {
						local176 = 2000;
					}
					@Pc(227) int local227 = local176 + Static81.anIntArray226[local164];
					Static24.method514(Static119.method2136(new Class26[] { Static41.aClass26_671, local50 }), arg2, arg1, local227, arg3, Static114.aClass26Array25[local164]);
				}
			}
		} else if ((Static57.anInt1731 & 0x8) == 8) {
			Static24.method514(Static119.method2136(new Class26[] { Static8.aClass26_114, Static44.aClass26_709, local50 }), arg2, arg1, 7, arg3, Static132.aClass26_1815);
		}
		for (local164 = 0; local164 < Static56.anInt1695; local164++) {
			if (Static132.anIntArray411[local164] == 35) {
				Static29.aClass26Array7[local164] = Static119.method2136(new Class26[] { Static41.aClass26_671, local50 });
				break;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method8() {
		Static107.aClass3_Sub11_Sub1_3.method1029(71);
		for (@Pc(10) Class3_Sub17 local10 = (Class3_Sub17) Static52.aClass17_9.method598(); local10 != null; local10 = (Class3_Sub17) Static52.aClass17_9.method597()) {
			if (local10.anInt2549 == 0 || local10.anInt2549 == 3) {
				Static36.method730(true, local10);
			}
		}
		if (Static79.aClass3_Sub14_8 != null) {
			Static110.method2004(Static79.aClass3_Sub14_8);
			Static79.aClass3_Sub14_8 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!he;Lclient!he;Lclient!ef;)Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 method9(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(13) int local13 = arg2.method574(arg1);
		@Pc(19) int local19 = arg2.method567(arg0, local13);
		return Static104.method1942(arg2, local19, local13);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public static boolean method10(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method11() {
		aClass26_7 = null;
		aClass26_5 = null;
		aClass26_4 = null;
		aShortArrayArray1 = null;
		aClass26_8 = null;
		aClass26_6 = null;
		anIntArray2 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Z")
	public static boolean method12(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
