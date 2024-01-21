import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1402 = Static78.method1313("au");

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1403 = Static78.method1313("button near the top of that page)3");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array24 = new Class25[20];

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public static int anInt2899 = 0;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1404 = Static78.method1313(" is already on your friend list");

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1405 = aClass25_1404;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1406 = Static78.method1313("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1407 = aClass25_1403;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1408 = Static78.method1313("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static57.method1727(arg3)) {
			Static64.method1126(0, arg1, arg4, -1, arg6, Static56.aClass1_Sub2_Sub14ArrayArray1[arg3], arg2, arg5, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method2004() {
		aClass25_1406 = null;
		aClass25_1407 = null;
		aClass25Array24 = null;
		aClass25_1404 = null;
		aClass25_1408 = null;
		aClass25_1405 = null;
		aClass25_1402 = null;
		aClass25_1403 = null;
		anIntArray494 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIBIII)Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 method2010(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg1 << 40) + (((long) arg3 << 16) + (long) arg2 + ((long) arg4 << 38));
		@Pc(32) Class1_Sub2_Sub2_Sub1 local32;
		if (!arg0) {
			local32 = (Class1_Sub2_Sub2_Sub1) Static94.aClass63_18.method1517(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub2_Sub16 local40 = Static33.method736(arg2);
		if (arg3 > 1 && local40.anIntArray380 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg3 >= local40.anIntArray379[local52] && local40.anIntArray379[local52] != 0) {
					local50 = local40.anIntArray380[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static33.method736(local50);
			}
		}
		@Pc(89) Class1_Sub2_Sub3_Sub2 local89 = local40.method1594(1);
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class1_Sub2_Sub2_Sub1 local95 = null;
		if (local40.anInt2147 != -1) {
			local95 = method2010(true, 0, local40.anInt2144, 10, 1);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static128.anIntArray476;
		@Pc(117) int local117 = Static128.anInt2749;
		@Pc(119) int local119 = Static128.anInt2754;
		@Pc(122) int[] local122 = new int[4];
		Static128.method1933(local122);
		local32 = new Class1_Sub2_Sub2_Sub1(36, 32);
		Static128.method1932(local32.anIntArray40, 36, 32);
		Static128.method1943();
		Static36.method841();
		Static36.method832(16, 16);
		Static36.aBoolean43 = false;
		@Pc(145) int local145 = local40.anInt2136;
		if (arg0) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg4 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(173) int local173 = local145 * Class1_Sub2_Sub2_Sub2.anIntArray189[local40.anInt2151] >> 16;
		@Pc(182) int local182 = Class1_Sub2_Sub2_Sub2.anIntArray185[local40.anInt2151] * local145 >> 16;
		local89.method465();
		local89.method474(local40.anInt2113, local40.anInt2161, local40.anInt2151, local40.anInt2150, local89.anInt2778 / 2 + local173 + local40.anInt2126, local182 + local40.anInt2126);
		if (arg4 >= 1) {
			local32.method201(1);
		}
		if (arg4 >= 2) {
			local32.method201(16777215);
		}
		if (arg1 != 0) {
			local32.method214(arg1);
		}
		Static128.method1932(local32.anIntArray40, 36, 32);
		if (local40.anInt2147 != -1) {
			local95.method204(0, 0);
		}
		if (!arg0 && (local40.anInt2152 == 1 || arg3 != 1) && arg3 != -1) {
			Static88.aClass1_Sub2_Sub2_Sub3_4.method1180(Static38.method874(arg3), 0, 9, 16776960, 1);
		}
		if (!arg0) {
			Static94.aClass63_18.method1520(local32, local24);
		}
		Static128.method1932(local115, local117, local119);
		Static128.method1936(local122);
		Static36.method841();
		Static36.aBoolean43 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZI)V")
	public static void method2013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static68.aClass1_Sub5_Sub1_2.method688(186);
		Static68.aClass1_Sub5_Sub1_2.method633(arg0);
		Static68.aClass1_Sub5_Sub1_2.method631(arg1);
	}
}
