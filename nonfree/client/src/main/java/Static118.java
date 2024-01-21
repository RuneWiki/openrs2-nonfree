import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static int anInt2914;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!nb;")
	public static Class24 aClass24_25;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1372 = Static38.method736("M");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1373 = Static38.method736("Ok");

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1374 = Static38.method736("Loading textures )2 ");

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1375 = aClass71_1374;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1376 = Static38.method736("p11_full");

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1380 = Static38.method736("Loaded wordpack");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1377 = aClass71_1380;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1378 = Static38.method736("title)3jpg");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1379 = Static38.method736("Okay");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static int anInt2916 = -1;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1381 = aClass71_1373;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public static int anInt2917 = 0;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1382 = Static38.method736("backhmid1");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!vd;III)V")
	public static void method1936(@OriginalArg(0) Class5_Sub1_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = Static101.anInt2378 + Static88.anInt2060 & 0x7FF;
		@Pc(26) int local26 = arg2 * arg2 + arg1 * arg1;
		if (local26 > 6400) {
			return;
		}
		@Pc(36) int local36 = Class5_Sub1_Sub10_Sub2.anIntArray241[local12];
		@Pc(44) int local44 = local36 * 256 / (Static66.anInt1651 + 256);
		@Pc(48) int local48 = Class5_Sub1_Sub10_Sub2.anIntArray240[local12];
		@Pc(56) int local56 = local48 * 256 / (Static66.anInt1651 + 256);
		@Pc(66) int local66 = local56 * arg2 + local44 * arg1 >> 16;
		@Pc(77) int local77 = local56 * arg1 - arg2 * local44 >> 16;
		if (local26 > 2500) {
			arg0.method1851(Static4.aClass5_Sub1_Sub10_Sub1_3, local66 + 98 - arg0.anInt2774 / 2, -4 + 83 + -local77 - arg0.anInt2771 / 2);
		} else {
			arg0.method1862(local66 + 94 + 4 - arg0.anInt2774 / 2, -local77 + -4 + 83 + -(arg0.anInt2771 / 2));
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!me;")
	public static Class5_Sub1_Sub11 method1937(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static30.aClass5_Sub1_Sub11ArrayArray1[local14] == null || Static30.aClass5_Sub1_Sub11ArrayArray1[local14][local18] == null) {
			@Pc(32) boolean local32 = Static106.method1689(local14);
			if (!local32) {
				return null;
			}
		}
		return Static30.aClass5_Sub1_Sub11ArrayArray1[local14][local18];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1938() {
		aClass71_1380 = null;
		aClass71_1381 = null;
		aClass71_1372 = null;
		aClass71_1375 = null;
		aClass71_1377 = null;
		aClass71_1373 = null;
		aClass71_1382 = null;
		aClass71_1378 = null;
		aClass71_1376 = null;
		aClass24_25 = null;
		aClass71_1379 = null;
		aClass71_1374 = null;
	}
}
