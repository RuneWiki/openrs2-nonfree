import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!ua;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Z")
	public static boolean aBoolean132;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1422 = Static78.method1313("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt2956 = 0;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	public static int anInt2960 = 0;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1423 = Static78.method1313(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1424 = Static78.method1313("Hier wechseln");

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!nf;")
	public static Class1_Sub2_Sub13 method2045(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static121.aClass63_26.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static115.aClass56_85.method1269(9, arg0);
		local10 = new Class1_Sub2_Sub13();
		local10.anInt1839 = arg0;
		if (local20 != null) {
			local10.method1406(new Class1_Sub5(local20));
		}
		local10.method1404();
		Static121.aClass63_26.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
	public static void method2046(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static80.anInt1786; local17++) {
			if (arg0 == aLongArray6[local17]) {
				Static90.aBoolean98 = true;
				Static80.anInt1786--;
				for (@Pc(37) int local37 = local17; local37 < Static80.anInt1786; local37++) {
					Static118.aClass25Array22[local37] = Static118.aClass25Array22[local37 + 1];
					Static47.anIntArray241[local37] = Static47.anIntArray241[local37 + 1];
					aLongArray6[local37] = aLongArray6[local37 + 1];
					Static3.anIntArray12[local37] = Static3.anIntArray12[local37 + 1];
				}
				Static62.anInt1392 = Static60.anInt1366 + 1;
				Static68.aClass1_Sub5_Sub1_2.method688(71);
				Static68.aClass1_Sub5_Sub1_2.method640(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)I")
	public static int method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg0;
			arg0 = local12;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return 1 + 7 - arg0 - arg1;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method2048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg1;
		if (arg1 < 3 && (Static116.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
			local30 = arg1 + 1;
		}
		@Pc(49) int local49 = arg0 & 0x7F;
		@Pc(53) int local53 = arg2 & 0x7F;
		@Pc(80) int local80 = (128 - local53) * Static7.anIntArrayArrayArray3[local30][local7][local11] + Static7.anIntArrayArrayArray3[local30][local7 + 1][local11] * local53 >> 7;
		@Pc(111) int local111 = Static7.anIntArrayArrayArray3[local30][local7 + 1][local11 + 1] * local53 + Static7.anIntArrayArrayArray3[local30][local7][local11 + 1] * (128 - local53) >> 7;
		return (128 - local49) * local80 + local111 * local49 >> 7;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method2049() {
		aClass25_1422 = null;
		aClass76_1 = null;
		aLongArray6 = null;
		aBooleanArray15 = null;
		aClass25_1423 = null;
		aClass25_1424 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public static int method2050() {
		return Static38.anInt1081++;
	}
}
