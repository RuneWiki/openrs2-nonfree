import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	public static int anInt2169;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1155 = method1463("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
	public static int[] anIntArray247 = new int[32768];

	@OriginalMember(owner = "client!o", name = "A", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1156 = method1463("Malformed login packet)3");

	@OriginalMember(owner = "client!o", name = "B", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1157 = method1463(" )2> ");

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1158 = aClass63_1156;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public static void method1462() {
		if (Static19.anInt642 != 1) {
			return;
		}
		if (Static59.anInt1765 >= 6 && Static59.anInt1765 <= 106 && Static61.anInt1804 >= 467 && Static61.anInt1804 <= 499) {
			Static15.aBoolean29 = true;
			Static15.anInt494 = (Static15.anInt494 + 1) % 4;
			Static96.aBoolean146 = true;
			Static23.aClass6_Sub4_Sub1_4.method1347(51);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static15.anInt494);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static38.anInt1233);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static68.anInt1974);
		}
		if (Static59.anInt1765 >= 135 && Static59.anInt1765 <= 235 && Static61.anInt1804 >= 467 && Static61.anInt1804 <= 499) {
			Static15.aBoolean29 = true;
			Static38.anInt1233 = (Static38.anInt1233 + 1) % 3;
			Static96.aBoolean146 = true;
			Static23.aClass6_Sub4_Sub1_4.method1347(51);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static15.anInt494);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static38.anInt1233);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static68.anInt1974);
		}
		if (Static59.anInt1765 >= 273 && Static59.anInt1765 <= 373 && Static61.anInt1804 >= 467 && Static61.anInt1804 <= 499) {
			Static96.aBoolean146 = true;
			Static68.anInt1974 = (Static68.anInt1974 + 1) % 3;
			Static15.aBoolean29 = true;
			Static23.aClass6_Sub4_Sub1_4.method1347(51);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static15.anInt494);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static38.anInt1233);
			Static23.aClass6_Sub4_Sub1_4.method1330(Static68.anInt1974);
		}
		if (Static59.anInt1765 < 412 || Static59.anInt1765 > 512 || Static61.anInt1804 < 467 || Static61.anInt1804 > 499) {
			return;
		}
		if (Static102.anInt2833 != -1) {
			Static46.method996(Static111.aClass63_1661, 0, Static39.aClass63_675);
			if (Static20.aClass63_417 != null) {
				Static46.method996(Static111.aClass63_1661, 0, Static20.aClass63_417);
			}
			return;
		}
		Static17.method1723();
		if (Static40.anInt2120 != -1) {
			Static93.aBoolean138 = false;
			Static112.anInt3084 = Static102.anInt2833 = Static40.anInt2120;
			Static111.aClass63_1652 = Static111.aClass63_1661;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!rd;")
	public static Class63 method1463(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class63 local13 = new Class63();
		local13.aByteArray33 = new byte[local9];
		@Pc(26) int local26 = 0;
		while (local9 > local26) {
			@Pc(34) int local34 = local6[local26++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local9 <= local26) {
					break;
				}
				@Pc(73) int local73 = local6[local26++] & 0xFF;
				local13.aByteArray33[local13.anInt2746++] = (byte) (local73 + (local34 + -40) * 43 - 48);
			} else if (local34 != 0) {
				local13.aByteArray33[local13.anInt2746++] = (byte) local34;
			}
		}
		local13.method1800();
		return local13.method1832();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method1464() {
		aClass63_1157 = null;
		aClass63_1155 = null;
		anIntArray247 = null;
		aClass63_1158 = null;
		aClass63_1156 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!af;Z)V")
	public static void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		if (Static86.aClass6_Sub4_5 == null) {
			Static41.method903(0, (byte) 0, null, 255, true, 255);
			Static68.aClass7_Sub1Array1[arg0] = arg1;
		} else {
			Static86.aClass6_Sub4_5.anInt1949 = arg0 * 4 + 5;
			@Pc(21) int local21 = Static86.aClass6_Sub4_5.method1289();
			arg1.method125(local21);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!wa;IIIIIIII)V")
	public static void method1466(@OriginalArg(0) Class6_Sub3_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static90.aBoolean130) {
			Static65.anInt1844 = 32;
		} else {
			Static65.anInt1844 = 0;
		}
		Static90.aBoolean130 = false;
		@Pc(185) int local185;
		if (arg7 >= arg5 && arg7 < arg5 + 16 && arg3 >= arg4 && arg4 + 16 > arg3) {
			if (arg2 == 2 || arg2 == 3) {
				Static15.aBoolean29 = true;
			}
			arg0.anInt3291 -= Static11.anInt1969 * 4;
			if (arg2 == 1) {
				Static10.aBoolean20 = true;
			}
		} else if (arg7 >= arg5 && arg5 + 16 > arg7 && arg6 + arg4 - 16 <= arg3 && arg6 + arg4 > arg3) {
			arg0.anInt3291 += Static11.anInt1969 * 4;
			if (arg2 == 1) {
				Static10.aBoolean20 = true;
			}
			if (arg2 == 2 || arg2 == 3) {
				Static15.aBoolean29 = true;
			}
		} else if (arg7 >= arg5 - Static65.anInt1844 && arg5 + Static65.anInt1844 + 16 > arg7 && arg3 >= arg4 + 16 && arg3 < arg6 + arg4 - 16 && Static11.anInt1969 > 0) {
			if (arg2 == 2 || arg2 == 3) {
				Static15.aBoolean29 = true;
			}
			if (arg2 == 1) {
				Static10.aBoolean20 = true;
			}
			Static90.aBoolean130 = true;
			local185 = arg6 * (arg6 - 32) / arg1;
			if (local185 < 8) {
				local185 = 8;
			}
			@Pc(196) int local196 = arg6 - local185 - 32;
			@Pc(207) int local207 = arg3 - arg4 - local185 / 2 - 16;
			arg0.anInt3291 = (arg1 - arg6) * local207 / local196;
		}
		if (Static74.anInt2071 == 0) {
			return;
		}
		local185 = arg0.anInt3230;
		if (arg2 == -1) {
			local185 = 479;
		}
		if (arg7 < arg5 - local185 || arg4 > arg3 || arg5 + 16 <= arg7 || arg4 + arg6 < arg3) {
			return;
		}
		arg0.anInt3291 += Static74.anInt2071 * 45;
		if (arg2 == 1) {
			Static10.aBoolean20 = true;
		}
		if (arg2 == 2 || arg2 == 3) {
			Static15.aBoolean29 = true;
		}
		return;
	}
}
