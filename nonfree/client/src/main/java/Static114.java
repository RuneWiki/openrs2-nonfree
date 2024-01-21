import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
	public static int anInt3277 = 0;

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1374 = Static34.method846("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	public static int anInt3279 = 0;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1375 = Static34.method846("Please contact customer support)3");

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1376 = Static34.method846("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1377 = aClass55_1375;

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1378 = Static34.method846("(Z");

	@OriginalMember(owner = "client!wd", name = "lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1379 = Static34.method846("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!wd", name = "mb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1380 = Static34.method846("Mem:");

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1381 = Static34.method846("backtop1");

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1382 = Static34.method846("Aus");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public static void method2095(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub13 local12 = (Class6_Sub13) Static12.aClass38_8.method1183((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray275.length; local17++) {
				local12.anIntArray275[local17] = -1;
				local12.anIntArray274[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public static void method2096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class6_Sub2_Sub12 local7 = Static112.method2068(arg1);
		@Pc(10) int local10 = local7.anInt2649;
		@Pc(13) int local13 = local7.anInt2652;
		@Pc(16) int local16 = local7.anInt2651;
		@Pc(27) int local27 = Class54.anIntArray233[local16 - local13];
		if (arg0 < 0 || local27 < arg0) {
			arg0 = 0;
		}
		local27 <<= local13;
		Static11.anIntArray44[local10] = Static11.anIntArray44[local10] & ~local27 | arg0 << local13 & local27;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)V")
	public static void method2097(@OriginalArg(1) int arg0) {
		if (Static61.anInt1879 == arg0) {
			return;
		}
		if (Static61.anInt1879 == 0) {
			Static106.method1603();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static38.anInt1387 = 0;
			Static44.anInt2759 = 0;
			Static81.anInt2297 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static35.aClass65_2 != null) {
			Static35.aClass65_2.method2012();
			Static35.aClass65_2 = null;
		}
		if (Static61.anInt1879 == 25 || Static61.anInt1879 == 40) {
			Static28.method738();
			Static53.method1279();
		}
		if (Static61.anInt1879 == 25) {
			Static66.anInt1970 = 1;
			Static93.anInt2609 = 1;
			Static71.anInt2109 = 0;
			anInt3277 = 0;
			Static54.anInt1681 = 0;
		}
		if (arg0 == 35) {
			Static66.method1357();
			Static112.method2074();
			if (Static33.aClass21_9 == null) {
				Static33.aClass21_9 = Static68.method1376(503, 765, Static32.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static33.aClass21_9 = null;
			Static66.method1357();
			Static39.method1166(Static92.aClass40_Sub1_33, Static32.aCanvas1, Static72.aClass40_Sub1_27);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static33.aClass21_9 = null;
			Static112.method2074();
			Static101.method1932(Static92.aClass40_Sub1_33, Static32.aCanvas1);
		}
		Static61.anInt1879 = arg0;
		Static52.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	public static void method2098() {
		aClass55_1380 = null;
		aClass55_1376 = null;
		aClass55_1375 = null;
		aClass55_1377 = null;
		aClass55_1381 = null;
		anIntArray313 = null;
		aClass55_1374 = null;
		aClass55_1378 = null;
		aClass55_1382 = null;
		aClass55_1379 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static22.method654(arg2)) {
			Static8.method327(-1, arg0, 0, 0, Static9.aClass6_Sub2_Sub14ArrayArray1[arg2], arg5, arg3, arg1, arg4);
		}
	}
}
