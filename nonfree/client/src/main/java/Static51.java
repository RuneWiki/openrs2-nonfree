import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_720 = Static38.method736(" )2> @cya@");

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_721 = Static38.method736("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_722 = Static38.method736("::fpsoff");

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Lclient!rb;")
	public static Class57 aClass57_7 = new Class57(512);

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "Lclient!vc;")
	public static Class71 aClass71_723 = Static38.method736("@or3@");

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "Lclient!vc;")
	private static Class71 aClass71_724 = Static38.method736("Enter message to send to ");

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_725 = Static38.method736("::errortest");

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Lclient!vc;")
	public static Class71 aClass71_726 = aClass71_724;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lclient!vc;")
	public static Class71 method962(@OriginalArg(0) int arg0) {
		return Static104.method2011(arg0, false);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method963() {
		aClass71_723 = null;
		aClass71_724 = null;
		aClass71_726 = null;
		aClass57_7 = null;
		anIntArrayArrayArray3 = null;
		aClass71_725 = null;
		aClass71_721 = null;
		aClass71_722 = null;
		aClass71_720 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIILclient!nb;)[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] method964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2) {
		return Static6.method156(arg2, arg1, arg0) ? Static89.method1413() : null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!la;)V")
	public static void method966(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt2443 == 0) {
			return;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt2436 != -1 && arg0.anInt2436 < 32768) {
			@Pc(27) Class5_Sub1_Sub1_Sub3_Sub1 local27 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt2436];
			if (local27 != null) {
				local36 = arg0.anInt2474 - local27.anInt2474;
				local43 = arg0.anInt2452 - local27.anInt2452;
				if (local36 != 0 || local43 != 0) {
					arg0.anInt2441 = (int) (Math.atan2((double) local36, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt2436 >= 32768) {
			local68 = arg0.anInt2436 - 32768;
			if (Static6.anInt222 == local68) {
				local68 = 2047;
			}
			@Pc(81) Class5_Sub1_Sub1_Sub3_Sub2 local81 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local68];
			if (local81 != null) {
				local43 = arg0.anInt2474 - local81.anInt2474;
				@Pc(96) int local96 = arg0.anInt2452 - local81.anInt2452;
				if (local43 != 0 || local96 != 0) {
					arg0.anInt2441 = (int) (Math.atan2((double) local43, (double) local96) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2480 != 0 || arg0.anInt2465 != 0) && (arg0.anInt2440 == 0 || arg0.anInt2454 > 0)) {
			local68 = arg0.anInt2474 - (arg0.anInt2480 - Static48.anInt1367 - Static48.anInt1367) * 64;
			local36 = arg0.anInt2452 - (arg0.anInt2465 - Static76.anInt1884 - Static76.anInt1884) * 64;
			if (local68 != 0 || local36 != 0) {
				arg0.anInt2441 = (int) (Math.atan2((double) local68, (double) local36) * 325.949D) & 0x7FF;
			}
			arg0.anInt2465 = 0;
			arg0.anInt2480 = 0;
		}
		local68 = arg0.anInt2441 - arg0.anInt2456 & 0x7FF;
		if (local68 == 0) {
			arg0.anInt2463 = 0;
			return;
		}
		arg0.anInt2463++;
		@Pc(216) boolean local216;
		if (local68 <= 1024) {
			arg0.anInt2456 += arg0.anInt2443;
			local216 = true;
			if (local68 < arg0.anInt2443 || local68 > 2048 - arg0.anInt2443) {
				local216 = false;
				arg0.anInt2456 = arg0.anInt2441;
			}
			if (arg0.anInt2470 == arg0.anInt2487 && (arg0.anInt2463 > 25 || local216)) {
				if (arg0.anInt2448 == -1) {
					arg0.anInt2470 = arg0.anInt2453;
				} else {
					arg0.anInt2470 = arg0.anInt2448;
				}
			}
		} else {
			arg0.anInt2456 -= arg0.anInt2443;
			local216 = true;
			if (arg0.anInt2443 > local68 || local68 > 2048 - arg0.anInt2443) {
				arg0.anInt2456 = arg0.anInt2441;
				local216 = false;
			}
			if (arg0.anInt2470 == arg0.anInt2487 && (arg0.anInt2463 > 25 || local216)) {
				if (arg0.anInt2478 == -1) {
					arg0.anInt2470 = arg0.anInt2453;
				} else {
					arg0.anInt2470 = arg0.anInt2478;
				}
			}
		}
		arg0.anInt2456 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public static void method969() {
		for (@Pc(7) int local7 = 0; local7 < Static90.anInt3005; local7++) {
			@Pc(13) int local13 = Static61.anIntArray175[local7];
			@Pc(17) Class5_Sub1_Sub1_Sub3_Sub1 local17 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local13];
			if (local17 != null) {
				Static30.method581(local17.aClass5_Sub1_Sub16_1.anInt2819, local17);
			}
		}
	}
}
