import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_6;

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!hc", name = "xb", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_7;

	@OriginalMember(owner = "client!hc", name = "Ib", descriptor = "Lclient!ld;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!he;")
	public static Class26 aClass26_693 = Static6.method100("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!hc", name = "wb", descriptor = "Lclient!he;")
	private static Class26 aClass26_700 = Static6.method100("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!he;")
	public static Class26 aClass26_694 = aClass26_700;

	@OriginalMember(owner = "client!hc", name = "sb", descriptor = "Lclient!he;")
	private static Class26 aClass26_698 = Static6.method100("Click to switch");

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_695 = aClass26_698;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "[I")
	public static int[] anIntArray141 = new int[32];

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lclient!he;")
	public static Class26 aClass26_696 = Static6.method100("p11_full");

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!he;")
	public static Class26 aClass26_697 = Static6.method100("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!hc", name = "Fb", descriptor = "Lclient!he;")
	private static Class26 aClass26_702 = Static6.method100("Loaded input handler");

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lclient!he;")
	public static Class26 aClass26_699 = aClass26_702;

	@OriginalMember(owner = "client!hc", name = "zb", descriptor = "Lclient!he;")
	private static Class26 aClass26_701 = Static6.method100("Please reload this page)3");

	@OriginalMember(owner = "client!hc", name = "Hb", descriptor = "Lclient!he;")
	public static Class26 aClass26_703 = aClass26_701;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ef;IIB)[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] method807(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static90.method1659(arg1, arg2, arg0) ? Static76.method1357() : null;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
	public static void method809() {
		aClass26_699 = null;
		aClass26_701 = null;
		aClass26_696 = null;
		aString2 = null;
		aClass26_695 = null;
		aClass26_698 = null;
		aClass26_693 = null;
		aClass26_697 = null;
		aClass26_694 = null;
		aClass43_2 = null;
		aClass26_703 = null;
		anIntArray141 = null;
		aClass16_Sub1_7 = null;
		aClass26_700 = null;
		aClass26_702 = null;
		aClass16_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		return Static56.aClass3_Sub1_Sub11_1 != null && Static56.aClass3_Sub1_Sub11_1.aLong100 == local6 ? Static64.aClass3_Sub11_21.anInt1562 * 99 / (Static64.aClass3_Sub11_21.aByteArray13.length - Static56.aClass3_Sub1_Sub11_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBIIII)V")
	public static void method811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg5 < 1 || arg2 > 102 || arg5 > 102) {
			return;
		}
		if (Static98.aBoolean151 && arg1 != Static132.anInt3270) {
			return;
		}
		@Pc(43) int local43 = 0;
		if (arg6 == 0) {
			local43 = Static62.aClass69_1.method2042(arg1, arg2, arg5);
		}
		if (arg6 == 1) {
			local43 = Static62.aClass69_1.method2047(arg1, arg2, arg5);
		}
		if (arg6 == 2) {
			local43 = Static62.aClass69_1.method2019(arg1, arg2, arg5);
		}
		if (arg6 == 3) {
			local43 = Static62.aClass69_1.method2017(arg1, arg2, arg5);
		}
		@Pc(106) int local106;
		if (local43 != 0) {
			@Pc(99) int local99 = local43 >> 14 & 0x7FFF;
			local106 = Static62.aClass69_1.method2062(arg1, arg2, arg5, local43);
			@Pc(112) int local112 = local106 >> 6 & 0x3;
			@Pc(116) int local116 = local106 & 0x1F;
			@Pc(127) Class3_Sub1_Sub1 local127;
			if (arg6 == 0) {
				Static62.aClass69_1.method2044(arg1, arg2, arg5);
				local127 = Static4.method68(local99);
				if (local127.anInt93 != 0) {
					Static93.aClass4Array1[arg1].method71(arg2, arg5, local127.aBoolean6, local112, local116);
				}
			}
			if (arg6 == 1) {
				Static62.aClass69_1.method2023(arg1, arg2, arg5);
			}
			if (arg6 == 2) {
				Static62.aClass69_1.method2028(arg1, arg2, arg5);
				local127 = Static4.method68(local99);
				if (arg2 + local127.anInt86 > 103 || arg5 + local127.anInt86 > 103 || arg2 + local127.anInt96 > 103 || arg5 + local127.anInt96 > 103) {
					return;
				}
				if (local127.anInt93 != 0) {
					Static93.aClass4Array1[arg1].method76(arg5, arg2, local127.anInt86, local127.anInt96, local112, local127.aBoolean6);
				}
			}
			if (arg6 == 3) {
				Static62.aClass69_1.method2014(arg1, arg2, arg5);
				local127 = Static4.method68(local99);
				if (local127.anInt93 == 1) {
					Static93.aClass4Array1[arg1].method73(arg2, arg5);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local106 = arg1;
		if (arg1 < 3 && (Static74.aByteArrayArrayArray5[1][arg2][arg5] & 0x2) == 2) {
			local106 = arg1 + 1;
		}
		Static70.method1022(arg3, Static93.aClass4Array1[arg1], arg5, arg1, arg0, local106, arg4, arg2, Static62.aClass69_1);
		return;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method813() {
		Static25.aClass66_27.method1971();
		Static40.aClass66_12.method1971();
		Static14.aClass66_3.method1971();
	}
}
