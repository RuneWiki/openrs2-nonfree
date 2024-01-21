import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lclient!bf;")
	public static Class11 aClass11_24;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lclient!bf;")
	public static Class11 aClass11_25;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_559 = Static56.method972("Versteckt");

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_565 = Static56.method972("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_560 = aClass5_565;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "Lclient!ae;")
	private static Class5 aClass5_561 = Static56.method972("Prepared visibility map");

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!ae;")
	private static Class5 aClass5_562 = Static56.method972("This computers address has been blocked");

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	public static int anInt1217 = 0;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_563 = aClass5_561;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
	public static final int anInt1219 = 3353893;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_564 = Static56.method972("Your account is already logged in)3");

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "Lclient!ae;")
	public static Class5 aClass5_566 = aClass5_562;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_567 = aClass5_564;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method818() {
		if (Static76.anInt2563 != 1) {
			return;
		}
		if (Static45.anInt1269 >= 6 && Static45.anInt1269 <= 106 && Static99.anInt2491 >= 467 && Static99.anInt2491 <= 499) {
			Static99.anInt2488 = (Static99.anInt2488 + 1) % 4;
			Static15.aBoolean22 = true;
			Static68.aBoolean71 = true;
			Static95.aClass3_Sub6_Sub1_3.method1645(76);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static99.anInt2488);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static12.anInt479);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static9.anInt428);
		}
		if (Static45.anInt1269 >= 135 && Static45.anInt1269 <= 235 && Static99.anInt2491 >= 467 && Static99.anInt2491 <= 499) {
			Static12.anInt479 = (Static12.anInt479 + 1) % 3;
			Static68.aBoolean71 = true;
			Static15.aBoolean22 = true;
			Static95.aClass3_Sub6_Sub1_3.method1645(76);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static99.anInt2488);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static12.anInt479);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static9.anInt428);
		}
		if (Static45.anInt1269 >= 273 && Static45.anInt1269 <= 373 && Static99.anInt2491 >= 467 && Static99.anInt2491 <= 499) {
			Static68.aBoolean71 = true;
			Static9.anInt428 = (Static9.anInt428 + 1) % 3;
			Static15.aBoolean22 = true;
			Static95.aClass3_Sub6_Sub1_3.method1645(76);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static99.anInt2488);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static12.anInt479);
			Static95.aClass3_Sub6_Sub1_3.method1608(Static9.anInt428);
		}
		if (Static45.anInt1269 < 412 || Static45.anInt1269 > 512 || Static99.anInt2491 < 467 || Static99.anInt2491 > 499) {
			return;
		}
		if (Static89.anInt2288 == -1) {
			Static93.method1557();
			if (Static81.anInt2006 != -1) {
				Static103.aBoolean140 = false;
				Static37.anInt1012 = Static89.anInt2288 = Static81.anInt2006;
				Static110.aClass5_1306 = Static110.aClass5_1307;
				return;
			}
		} else {
			Static64.method1084(Static110.aClass5_1307, Static47.aClass5_631, 0);
		}
		return;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method820() {
		aClass5_559 = null;
		aClass5_564 = null;
		aClass5_567 = null;
		aClass5_566 = null;
		aClass5_565 = null;
		aClass5_563 = null;
		aClass11_24 = null;
		aClass5_561 = null;
		aClass11_25 = null;
		aClass5_562 = null;
		aClass5_560 = null;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
	public static void method822() {
		if (Static24.aClass15_1 == null) {
			return;
		}
		@Pc(9) long local9 = Static3.method125();
		if (Static101.aLong75 >= local9) {
			return;
		}
		Static24.aClass15_1.method1910(local9);
		@Pc(27) int local27 = (int) (local9 - Static101.aLong75);
		Static101.aLong75 = local9;
		@Pc(43) Class local43 = cd.class;
		synchronized (cd.class) {
			Static106.anInt2734 += local27 * Static17.anInt610;
			@Pc(60) int local60 = (Static106.anInt2734 - Static17.anInt610 * 2000) / 1000;
			if (local60 > 0) {
				if (Static33.aClass3_Sub2_1 != null) {
					Static33.aClass3_Sub2_1.method1380(local60);
				}
				Static106.anInt2734 -= local60 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lclient!kc;")
	public static Class3_Sub1_Sub10 method823(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static3.aClass9_3.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static23.aClass11_14.method1882(1, arg0);
		local10 = new Class3_Sub1_Sub10();
		if (local20 != null) {
			local10.method969(arg0, new Class3_Sub6(local20));
		}
		local10.method974();
		Static3.aClass9_3.method284(local10, (long) arg0);
		return local10;
	}
}
