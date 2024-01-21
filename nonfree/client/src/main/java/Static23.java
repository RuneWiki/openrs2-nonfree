import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static int anInt730;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "Lclient!bf;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "J")
	public static long aLong25;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!ae;")
	private static Class5 aClass5_313 = Static56.method972("Enter name of friend to add to list");

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_312 = aClass5_313;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "Lclient!p;")
	public static Class51 aClass51_7 = new Class51();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_314 = Static56.method972("@yel@");

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!e;")
	public static Class21 aClass21_5 = new Class21(4096);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public static int anInt736 = 0;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Lclient!ae;")
	private static Class5 aClass5_315 = Static56.method972("Could not complete login)3");

	@OriginalMember(owner = "client!e", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_316 = Static56.method972("Wordpack geladen)3");

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!ae;")
	private static Class5 aClass5_323 = Static56.method972("You have only just left another world)3");

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!ae;")
	public static Class5 aClass5_317 = aClass5_323;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!ae;")
	public static Class5 aClass5_318 = Static56.method972(" )2> @lre@");

	@OriginalMember(owner = "client!e", name = "G", descriptor = "Lclient!ae;")
	private static Class5 aClass5_319 = Static56.method972("Loaded textures");

	@OriginalMember(owner = "client!e", name = "I", descriptor = "Lclient!ae;")
	public static Class5 aClass5_320 = Static56.method972("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!e", name = "J", descriptor = "Lclient!ae;")
	private static Class5 aClass5_321 = Static56.method972("Select");

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!ae;")
	public static Class5 aClass5_322 = Static56.method972("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!e", name = "N", descriptor = "Lclient!ae;")
	public static Class5 aClass5_324 = aClass5_321;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "Lclient!ae;")
	public static Class5 aClass5_325 = Static56.method972("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!e", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_326 = aClass5_315;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_327 = aClass5_319;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V")
	public static void method451(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static17.anInt616; local17++) {
			if (Static56.aLongArray4[local17] == arg0) {
				Static116.aBoolean157 = true;
				Static17.anInt616--;
				for (@Pc(37) int local37 = local17; local37 < Static17.anInt616; local37++) {
					Static56.aLongArray4[local37] = Static56.aLongArray4[local37 + 1];
				}
				Static95.aClass3_Sub6_Sub1_3.method1645(250);
				Static95.aClass3_Sub6_Sub1_3.method1606(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B[BII)Lclient!ae;")
	public static Class5 method454(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5 local9 = new Class5();
		local9.anInt311 = 0;
		local9.aByteArray1 = new byte[arg2];
		for (@Pc(27) int local27 = arg1; local27 < arg1 + arg2; local27++) {
			if (arg0[local27] != 0) {
				local9.aByteArray1[local9.anInt311++] = arg0[local27];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method457() {
		aClass51_7 = null;
		aClass11_14 = null;
		anIntArray92 = null;
		aClass5_322 = null;
		aClass5_327 = null;
		aClass5_312 = null;
		aClass5_320 = null;
		aClass5_325 = null;
		aClass5_317 = null;
		aClass5_326 = null;
		aClass21_5 = null;
		aClass5_321 = null;
		aClass5_315 = null;
		aClass5_323 = null;
		aByteArray7 = null;
		aClass5_319 = null;
		aClass5_314 = null;
		aClass5_318 = null;
		aClass5_324 = null;
		aClass5_316 = null;
		aClass5_313 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!mc;Z)V")
	public static void method458(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt1542 = 0;
		if (arg0.anInt1558 == 0) {
			arg0.anInt1560 = 1024;
		}
		if (arg0.anInt1558 == 1) {
			arg0.anInt1560 = 1536;
		}
		@Pc(34) int local34 = arg0.anInt1520 - Static3.anInt289;
		if (arg0.anInt1558 == 2) {
			arg0.anInt1560 = 0;
		}
		@Pc(53) int local53 = arg0.anInt1562 * 64 + arg0.anInt1554 * 128;
		arg0.anInt1567 += (local53 - arg0.anInt1567) / local34;
		if (arg0.anInt1558 == 3) {
			arg0.anInt1560 = 512;
		}
		@Pc(83) int local83 = arg0.anInt1534 * 128 + arg0.anInt1562 * 64;
		arg0.anInt1543 += (local83 - arg0.anInt1543) / local34;
	}
}
