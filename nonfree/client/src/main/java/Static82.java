import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public static int anInt1959;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "Z")
	public static boolean aBoolean77;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_14;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_15;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!m;")
	public static Class49 aClass49_8 = new Class49();

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public static volatile int anInt1970 = -1;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "Lclient!ic;")
	private static Class34 aClass34_895 = Static56.method816("K");

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_891 = aClass34_895;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_892 = Static56.method816(")4l");

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	public static int anInt1977 = 0;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "Lclient!ic;")
	private static Class34 aClass34_893 = Static56.method816("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	public static int anInt1978 = -2;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "Lclient!ic;")
	public static Class34 aClass34_894 = aClass34_893;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "Lclient!ic;")
	public static Class34 aClass34_896 = Static56.method816(":assistreq:");

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Lclient!ic;")
	public static Class34 aClass34_897 = aClass34_895;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1193() {
		Static32.aClass48_19.method1101();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Z")
	public static boolean method1194(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method1197() {
		@Pc(9) int local9 = Static105.anInt2396 * 128 + 64;
		@Pc(15) int local15 = Static62.anInt1596 * 128 + 64;
		@Pc(23) int local23 = Static123.method1945(local9, Static42.anInt1024, local15) - Static116.anInt2615;
		if (Static113.anInt2579 < local23) {
			Static113.anInt2579 += Static15.anInt376 * (local23 - Static113.anInt2579) / 1000 + Static102.anInt3088;
			if (Static113.anInt2579 > local23) {
				Static113.anInt2579 = local23;
			}
		}
		if (local9 > Static13.anInt345) {
			Static13.anInt345 += Static15.anInt376 * (local9 - Static13.anInt345) / 1000 + Static102.anInt3088;
			if (local9 < Static13.anInt345) {
				Static13.anInt345 = local9;
			}
		}
		if (Static13.anInt345 > local9) {
			Static13.anInt345 -= (Static13.anInt345 - local9) * Static15.anInt376 / 1000 + Static102.anInt3088;
			if (local9 > Static13.anInt345) {
				Static13.anInt345 = local9;
			}
		}
		local9 = Static108.anInt2490 * 128 + 64;
		if (local23 < Static113.anInt2579) {
			Static113.anInt2579 -= Static102.anInt3088 + (Static113.anInt2579 - local23) * Static15.anInt376 / 1000;
			if (Static113.anInt2579 < local23) {
				Static113.anInt2579 = local23;
			}
		}
		if (local15 > Static48.anInt2951) {
			Static48.anInt2951 += Static102.anInt3088 + (local15 - Static48.anInt2951) * Static15.anInt376 / 1000;
			if (Static48.anInt2951 > local15) {
				Static48.anInt2951 = local15;
			}
		}
		if (Static48.anInt2951 > local15) {
			Static48.anInt2951 -= Static102.anInt3088 + Static15.anInt376 * (Static48.anInt2951 - local15) / 1000;
			if (local15 > Static48.anInt2951) {
				Static48.anInt2951 = local15;
			}
		}
		local15 = Static95.anInt2242 * 128 + 64;
		local23 = Static123.method1945(local9, Static42.anInt1024, local15) - Static48.anInt2952;
		@Pc(186) int local186 = local9 - Static13.anInt345;
		@Pc(190) int local190 = local15 - Static48.anInt2951;
		@Pc(195) int local195 = local23 - Static113.anInt2579;
		@Pc(206) int local206 = (int) Math.sqrt((double) (local190 * local190 + local186 * local186));
		@Pc(217) int local217 = (int) (Math.atan2((double) local195, (double) local206) * 325.949D) & 0x7FF;
		@Pc(228) int local228 = (int) (Math.atan2((double) local190, (double) local186) * -325.949D) & 0x7FF;
		if (local217 < 128) {
			local217 = 128;
		}
		if (local217 > 383) {
			local217 = 383;
		}
		@Pc(242) int local242 = local228 - Static19.anInt593;
		if (Static24.anInt1900 < local217) {
			Static24.anInt1900 += Static128.anInt3016 * (local217 - Static24.anInt1900) / 1000 + Static92.anInt2204;
			if (Static24.anInt1900 > local217) {
				Static24.anInt1900 = local217;
			}
		}
		if (local217 < Static24.anInt1900) {
			Static24.anInt1900 -= (Static24.anInt1900 - local217) * Static128.anInt3016 / 1000 + Static92.anInt2204;
			if (local217 > Static24.anInt1900) {
				Static24.anInt1900 = local217;
			}
		}
		if (local242 > 1024) {
			local242 -= 2048;
		}
		if (local242 < -1024) {
			local242 += 2048;
		}
		if (local242 > 0) {
			Static19.anInt593 += local242 * Static128.anInt3016 / 1000 + Static92.anInt2204;
			Static19.anInt593 &= 0x7FF;
		}
		if (local242 < 0) {
			Static19.anInt593 -= Static92.anInt2204 + Static128.anInt3016 * -local242 / 1000;
			Static19.anInt593 &= 0x7FF;
		}
		@Pc(347) int local347 = local228 - Static19.anInt593;
		if (local347 > 1024) {
			local347 -= 2048;
		}
		if (local347 < -1024) {
			local347 += 2048;
		}
		if (local347 < 0 && local242 > 0 || local347 > 0 && local242 < 0) {
			Static19.anInt593 = local228;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lclient!ic;")
	public static Class34 method1198(@OriginalArg(0) int arg0) {
		@Pc(7) Class34 local7 = new Class34();
		local7.aByteArray20 = new byte[arg0];
		local7.anInt1418 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public static void method1200() {
		aClass34_896 = null;
		aClass34_894 = null;
		aClass34_895 = null;
		aClass34_897 = null;
		aClass34_893 = null;
		anIntArray255 = null;
		aClass14_Sub1_15 = null;
		aClass49_8 = null;
		aString4 = null;
		aClass34_892 = null;
		aClass34_891 = null;
		aClass14_Sub1_14 = null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	public static void method1201(@OriginalArg(0) int arg0) {
		if (Static61.anInt1587 == arg0) {
			return;
		}
		if (Static61.anInt1587 == 0) {
			Static67.method1013();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static77.anInt1828 = 0;
			Static30.anInt848 = 0;
			Static106.anInt2455 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static49.aClass25_3 != null) {
			Static49.aClass25_3.method588();
			Static49.aClass25_3 = null;
		}
		if (Static61.anInt1587 == 25) {
			Static128.anInt3019 = 0;
			Static15.anInt370 = 1;
			Static36.anInt922 = 0;
			Static4.anInt64 = 1;
			Static32.anInt871 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static117.method1643(Static92.aClass14_Sub1_16, Static70.aClass14_Sub1_11, Static119.aCanvas1);
		} else {
			Static49.method749();
		}
		Static61.anInt1587 = arg0;
	}
}
