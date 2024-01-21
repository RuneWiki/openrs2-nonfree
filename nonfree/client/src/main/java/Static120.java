import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_916 = Static151.method2243("Oct");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_917 = Static151.method2243("Apr");

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_918 = Static151.method2243("Aug");

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_919 = Static151.method2243("Jul");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_920 = Static151.method2243("Mar");

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_921 = Static151.method2243("Jan");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_922 = Static151.method2243("Sep");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_923 = Static151.method2243("sl_flags");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_924 = Static151.method2243("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!mb;")
	public static Class62 aClass62_925 = null;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_928 = Static151.method2243("Invalid username or password)3");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!mb;")
	public static Class62 aClass62_926 = aClass62_928;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_927 = Static151.method2243("http:)4)4");

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_930 = Static151.method2243("Feb");

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_933 = Static151.method2243("May");

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_932 = Static151.method2243("Jun");

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_934 = Static151.method2243("Nov");

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_929 = Static151.method2243("Dec");

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array82 = new Class62[] { aClass62_921, aClass62_930, aClass62_920, aClass62_917, aClass62_933, aClass62_932, aClass62_919, aClass62_918, aClass62_922, aClass62_916, aClass62_934, aClass62_929 };

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_931 = Static151.method2243("p11_full");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1883() {
		for (@Pc(12) int local12 = 0; local12 < Static118.anInt2607; local12++) {
			@Pc(18) int local18 = Static199.anIntArray373[local12];
			@Pc(22) Class7_Sub2_Sub1 local22 = Static9.aClass7_Sub2_Sub1Array1[local18];
			if (local22 != null) {
				Static197.method2839(local22, local22.aClass2_Sub1_Sub20_1.anInt3558);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mf;IIIII)V")
	public static void method1884(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static204.anInt4231) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static198.anInt4147) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static12.anInt319 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub18 local62 = Static92.aClass2_Sub18ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static72.anIntArrayArrayArray3[local17][local23][local32] + Static72.anIntArrayArrayArray3[local17][local23 + 1][local32] + Static72.anIntArrayArrayArray3[local17][local23][local32 + 1] + Static72.anIntArrayArrayArray3[local17][local23 + 1][local32 + 1]) / 4 - (Static72.anIntArrayArrayArray3[arg1][arg2][arg3] + Static72.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + Static72.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + Static72.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class85 local151 = local62.aClass85_1;
									if (local151 != null) {
										if (local151.aClass7_8.method3150()) {
											arg0.method3144(local151.aClass7_8, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass7_9 != null && local151.aClass7_9.method3150()) {
											arg0.method3144(local151.aClass7_9, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt3292; local222++) {
										@Pc(228) Class39 local228 = local62.aClass39Array2[local222];
										if (local228 != null && local228.aClass7_5.method3150() && (local23 == local228.anInt1480 || local23 == local3) && (local32 == local228.anInt1484 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt1481 + 1 - local228.anInt1480;
											@Pc(265) int local265 = local228.anInt1482 + 1 - local228.anInt1484;
											arg0.method3144(local228.aClass7_5, (local228.anInt1480 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt1484 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method1886(@OriginalArg(0) Class62 arg0) {
		if (Static170.aClass41_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class62 local13 = Static182.aClass62_1355.method1842(Static170.aClass41_3.anApplet1);
			@Pc(19) Class62 local19 = Static27.aClass62_185.method1842(Static170.aClass41_3.anApplet1);
			@Pc(44) Class62 local44 = Static169.method2460(new Class62[] { local13, Static5.aClass62_42, arg0, Static159.aClass62_1209, local19 });
			if (arg0.method1878() == 0) {
				local44 = Static169.method2460(new Class62[] { local44, Static147.aClass62_1085 });
			} else {
				local44 = Static169.method2460(new Class62[] { local44, Static108.aClass62_827, Static68.method947(Static104.method1634() + 94608000000L), Static125.aClass62_972, Static39.method3121(94608000L) });
			}
			Static169.method2460(new Class62[] { Static113.aClass62_858, local44, Static51.aClass62_357 }).method1863(Static170.aClass41_3.anApplet1);
		} catch (@Pc(122) Throwable local122) {
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1887() {
		Static138.aClass6_1.method1719();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static99.aLongArray5[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static184.aLongArray4[local22] = 0L;
		}
		Static30.anInt732 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZI)V")
	public static void method1888(@OriginalArg(2) boolean arg0) {
		Static131.anInt1511 = 2;
		Static88.anInt1852 = 22050;
		Static29.aBoolean31 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method1889(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static135.method2041(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local36 <= local44);
			return Static106.method1671(arg1, local44);
		}
	}
}
