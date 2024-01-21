import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!jd;")
	public static Class36 aClass36_69;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1244 = Static2.method66("backright2");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1245 = Static2.method66("null");

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1249 = Static2.method66("skill)2");

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1246 = aClass39_1249;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1247 = Static2.method66("scape main");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!ie;")
	public static Class34 aClass34_52 = new Class34();

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1248 = Static2.method66("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1250 = Static2.method66(":tradereq:");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array14 = new Class39[5];

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1251 = Static2.method66(" )2> @whi@");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method1949() {
		Static55.aClass54_14.method1635();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
	public static void method1950(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static89.aBooleanArray12[arg0]) {
			return;
		}
		Static65.aClass36_44.method1756(arg0);
		if (Static76.aClass2_Sub1_Sub6ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static76.aClass2_Sub1_Sub6ArrayArray1[arg0].length; local28++) {
			if (Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local28] != null) {
				if (Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local28].anInt700 == 2) {
					local26 = false;
				} else {
					Static76.aClass2_Sub1_Sub6ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static76.aClass2_Sub1_Sub6ArrayArray1[arg0] = null;
		}
		Static89.aBooleanArray12[arg0] = false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BZ)Lclient!ke;")
	public static Class39 method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class39 local7 = new Class39();
		local7.aByteArray13 = new byte[arg1];
		local7.anInt1601 = arg1;
		Static114.method1154(arg2, arg0, local7.aByteArray13, 0, arg1);
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!ld;I[B)V")
	public static void method1953(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class2_Sub9 local3 = new Class2_Sub9();
		local3.anInt1926 = 0;
		local3.aByteArray17 = arg2;
		local3.aClass42_1 = arg0;
		local3.aLong82 = arg1;
		@Pc(30) Class34 local30 = Static41.aClass34_21;
		synchronized (Static41.aClass34_21) {
			Static41.aClass34_21.method876(local3);
		}
		Static86.method1632();
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method1954() {
		aClass39_1250 = null;
		aClass39_1247 = null;
		aClass36_69 = null;
		aClass39_1245 = null;
		aClass39_1249 = null;
		aClass39_1246 = null;
		aClass39Array14 = null;
		aClass39_1244 = null;
		aClass34_52 = null;
		aClass39_1248 = null;
		aClass39_1251 = null;
	}
}
