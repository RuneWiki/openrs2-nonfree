import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1126 = Static15.method178("Existing user");

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1127 = aClass23_1126;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1128 = Static15.method178("mod_icons");

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	public static int anInt1968 = 0;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt1970 = 0;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	public static int anInt1971 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1256() {
		aClass23_1126 = null;
		aClass23_1128 = null;
		anIntArray233 = null;
		aClass23_1127 = null;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1258() {
		Static46.anInt1571 = 0;
		@Pc(16) int local16 = (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196 >> 7) + Static104.anInt2684;
		@Pc(23) int local23 = (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232 >> 7) + Static107.anInt2745;
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static46.anInt1571 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static46.anInt1571 = 1;
		}
		if (Static46.anInt1571 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static46.anInt1571 = 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method1259() {
		@Pc(5) Class61 local5 = Static55.aClass61_1;
		synchronized (Static55.aClass61_1) {
			Static89.anInt2389 = Static106.anInt2721;
			Static32.anInt1007 = Static44.anInt1490;
			Static110.anInt2872 = Static12.anInt2438;
			Static65.anInt1963 = Static46.anInt1585;
			Static111.anInt2890 = Static14.anInt264;
			Static74.anInt1803 = Static33.anInt1048;
			Static31.aLong24 = Static18.aLong10;
			Static46.anInt1585 = 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V")
	public static void method1261(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static8.anInt186 >= 100 && Static72.anInt2012 != 1 || Static8.anInt186 >= 200) {
			Static63.method1229(Static104.aClass23_1523, Static17.aClass23_258, 0);
			return;
		}
		@Pc(38) Class23 local38 = Static54.method1049(arg0).method514();
		for (@Pc(40) int local40 = 0; local40 < Static8.anInt186; local40++) {
			if (arg0 == Static88.aLongArray16[local40]) {
				Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { local38, Static14.aClass23_204 }), 0);
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static35.anInt1118; local78++) {
			if (Static58.aLongArray37[local78] == arg0) {
				Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { Static69.aClass23_1161, local38, Static8.aClass23_156 }), 0);
				return;
			}
		}
		if (local38.method539(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260)) {
			return;
		}
		Static8.aClass23Array4[Static8.anInt186] = local38;
		Static88.aLongArray16[Static8.anInt186] = arg0;
		Static63.anIntArray223[Static8.anInt186] = 0;
		Static8.anInt186++;
		Static34.aBoolean60 = true;
		Static76.aClass1_Sub5_Sub1_2.method731(44);
		Static76.aClass1_Sub5_Sub1_2.method711(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
	public static int method1262() {
		@Pc(14) int local14 = Static48.method987(Static21.anInt702, Static54.anInt1684, Static79.anInt2137);
		return local14 - Static96.anInt1793 >= 800 || (Static95.aByteArrayArrayArray5[Static79.anInt2137][Static54.anInt1684 >> 7][Static21.anInt702 >> 7] & 0x4) == 0 ? 3 : Static79.anInt2137;
	}
}
