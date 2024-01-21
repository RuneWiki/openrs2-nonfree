import java.awt.Component;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray38;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Z")
	public static boolean aBoolean78;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "B")
	public static byte aByte6 = 0;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1067 = Static118.method2249("(U");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1068 = Static118.method2249("null");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[1000][];

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
	public static boolean method1201() {
		@Pc(5) Class53 local5 = Static120.aClass53_1;
		synchronized (Static120.aClass53_1) {
			if (Static127.anInt3145 == Static101.anInt2537) {
				return false;
			} else {
				Static35.anInt1011 = Static196.anIntArray484[Static127.anInt3145];
				Static38.anInt1050 = Static81.anIntArray226[Static127.anInt3145];
				Static127.anInt3145 = Static127.anInt3145 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILjava/awt/Component;I)Lclient!se;")
	public static Class37 method1202(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class37_Sub2");
			@Pc(15) Class37 local15 = (Class37) local11.getDeclaredConstructor().newInstance();
			local15.method1448(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class37_Sub1 local28 = new Class37_Sub1();
			local28.method1448(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
	public static boolean method1203(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	public static void method1204(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static177.method2998(Static196.aClass65_2523, Static208.aClass65_2352, Static107.aClass65_1545);
		} else if (arg0 == -2) {
			Static177.method2998(Static25.aClass65_540, Static208.aClass65_2359, Static208.aClass65_2331);
		} else if (arg0 == -1) {
			Static177.method2998(Static196.aClass65_2522, Static208.aClass65_2357, Static14.aClass65_254);
		} else if (arg0 == 3) {
			Static177.method2998(Static144.aClass65_2163, Static208.aClass65_2361, Static208.aClass65_2332);
		} else if (arg0 == 4) {
			Static177.method2998(Static54.aClass65_2165, Static208.aClass65_2330, Static123.aClass65_1735);
		} else if (arg0 == 5) {
			Static177.method2998(Static42.aClass65_696, Static208.aClass65_2366, Static159.aClass65_2152);
		} else if (arg0 == 6) {
			Static177.method2998(Static208.aClass65_2358, Static208.aClass65_2360, Static156.aClass65_2075);
		} else if (arg0 == 7) {
			Static177.method2998(Static161.aClass65_2160, Static208.aClass65_2353, Static27.aClass65_567);
		} else if (arg0 == 8) {
			Static177.method2998(Static57.aClass65_949, Static208.aClass65_2339, Static154.aClass65_2041);
		} else if (arg0 == 9) {
			Static177.method2998(Static40.aClass65_676, Static208.aClass65_2364, Static174.aClass65_2310);
		} else if (arg0 == 10) {
			Static177.method2998(Static136.aClass65_1874, Static208.aClass65_2345, Static154.aClass65_2042);
		} else if (arg0 == 11) {
			Static177.method2998(Static30.aClass65_612, Static208.aClass65_2333, Static33.aClass65_634);
		} else if (arg0 == 12) {
			Static177.method2998(Static199.aClass65_2552, Static208.aClass65_2344, Static86.aClass65_1235);
		} else if (arg0 == 13) {
			Static177.method2998(Static196.aClass65_2520, Static208.aClass65_2343, Static99.aClass65_1490);
		} else if (arg0 == 14) {
			Static177.method2998(Static196.aClass65_2524, Static208.aClass65_2351, Static95.aClass65_1373);
		} else if (arg0 == 16) {
			Static177.method2998(Static48.aClass65_784, Static208.aClass65_2368, Static169.aClass65_1228);
		} else if (arg0 == 17) {
			Static177.method2998(Static8.aClass65_94, Static208.aClass65_2371, Static92.aClass65_1337);
		} else if (arg0 == 18) {
			Static177.method2998(Static163.aClass65_2179, Static208.aClass65_2370, Static209.aClass65_2577);
		} else if (arg0 == 19) {
			Static177.method2998(Static81.aClass65_1217, Static161.aClass65_2159, Static145.aClass65_1989);
		} else if (arg0 == 20) {
			Static177.method2998(Static196.aClass65_2525, Static208.aClass65_2336, Static168.aClass65_1733);
		} else if (arg0 == 22) {
			Static177.method2998(Static2.aClass65_45, Static208.aClass65_2365, Static89.aClass65_1263);
		} else if (arg0 == 23) {
			Static177.method2998(Static196.aClass65_2529, Static208.aClass65_2338, Static84.aClass65_1230);
		} else if (arg0 == 24) {
			Static177.method2998(Static93.aClass65_1345, Static208.aClass65_2346, Static138.aClass65_1897);
		} else if (arg0 == 25) {
			Static177.method2998(Static196.aClass65_2530, Static208.aClass65_2347, Static58.aClass65_953);
		} else if (arg0 == 26) {
			Static177.method2998(Static21.aClass65_492, Static208.aClass65_2369, Static141.aClass65_1973);
		} else if (arg0 == 27) {
			Static177.method2998(Static153.aClass65_2024, Static208.aClass65_2354, Static208.aClass65_2356);
		} else {
			Static177.method2998(Static196.aClass65_2519, Static208.aClass65_2349, Static160.aClass65_1612);
		}
		Static118.method2247(10);
	}
}
