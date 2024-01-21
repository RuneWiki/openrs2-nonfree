import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Lclient!db;")
	public static Class16 aClass16_8;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
	public static int[] anIntArray212 = new int[32];

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_713 = Static38.method685(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_714 = Static38.method685("<col=ff9040>");

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_715 = Static38.method685("Cabbage");

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array13 = new Class6[500];

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method1705() {
		aClass6Array13 = null;
		anIntArray212 = null;
		aClass6_715 = null;
		aClass6_713 = null;
		aClass2_Sub3_Sub2_Sub1Array6 = null;
		aClass16_8 = null;
		aClass6_714 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!h;)V")
	public static void method1706(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3_Sub5_Sub1 arg1) {
		if (arg1.anInt2690 > Static107.anInt2559) {
			method1709(arg1);
		} else if (Static107.anInt2559 <= arg1.anInt2696) {
			Static148.method2276(arg1);
		} else {
			Static36.method637(arg1);
		}
		if (arg1.anInt2674 < 128 || arg1.anInt2672 < 128 || arg1.anInt2674 >= 13184 || arg1.anInt2672 >= 13184) {
			arg1.anInt2708 = -1;
			arg1.anInt2672 = arg1.anIntArray223[0] * 128 + arg1.anInt2695 * 64;
			arg1.anInt2696 = 0;
			arg1.anInt2658 = -1;
			arg1.anInt2690 = 0;
			arg1.anInt2674 = arg1.anInt2695 * 64 + arg1.anIntArray221[0] * 128;
			arg1.method1804();
		}
		if (arg1 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 && (arg1.anInt2674 < 1536 || arg1.anInt2672 < 1536 || arg1.anInt2674 >= 11776 || arg1.anInt2672 >= 11776)) {
			arg1.anInt2672 = arg1.anIntArray223[0] * 128 + arg1.anInt2695 * 64;
			arg1.anInt2690 = 0;
			arg1.anInt2696 = 0;
			arg1.anInt2674 = arg1.anInt2695 * 64 + arg1.anIntArray221[0] * 128;
			arg1.anInt2708 = -1;
			arg1.anInt2658 = -1;
			arg1.method1804();
		}
		Static13.method208(arg1);
		Static27.method501(arg1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)Z")
	public static boolean method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static30.aClass44_1.method1272(Static36.anInt1020, arg2, arg0, arg1);
		@Pc(18) int local18 = arg1 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(27) int local27 = local12 & 0x1F;
		@Pc(33) int local33 = local12 >> 6 & 0x3;
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(52) Class2_Sub3_Sub6 local52 = Static163.method2609(local18);
			@Pc(68) int local68;
			@Pc(65) int local65;
			if (local33 == 0 || local33 == 2) {
				local65 = local52.anInt1195;
				local68 = local52.anInt1205;
			} else {
				local65 = local52.anInt1205;
				local68 = local52.anInt1195;
			}
			@Pc(79) int local79 = local52.anInt1217;
			if (local33 != 0) {
				local79 = (local79 << local33 & 0xF) + (local79 >> 4 - local33);
			}
			Static74.method1151(arg2, 0, local68, arg0, local65, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], local79, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], true);
		} else {
			Static74.method1151(arg2, local33, 0, arg0, 0, 2, local27 + 1, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], true);
		}
		Static73.anInt1792 = 0;
		Static83.anInt2045 = Static5.anInt84;
		Static113.anInt2749 = 2;
		Static17.anInt2418 = Static155.anInt3959;
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!h;I)V")
	private static void method1709(@OriginalArg(0) Class2_Sub3_Sub5_Sub1 arg0) {
		if (arg0.anInt2691 == 0) {
			arg0.anInt2680 = 1024;
		}
		@Pc(18) int local18 = arg0.anInt2690 - Static107.anInt2559;
		arg0.anInt2685 = 0;
		if (arg0.anInt2691 == 1) {
			arg0.anInt2680 = 1536;
		}
		if (arg0.anInt2691 == 2) {
			arg0.anInt2680 = 0;
		}
		if (arg0.anInt2691 == 3) {
			arg0.anInt2680 = 512;
		}
		@Pc(58) int local58 = arg0.anInt2671 * 128 + arg0.anInt2695 * 64;
		arg0.anInt2674 += (local58 - arg0.anInt2674) / local18;
		@Pc(80) int local80 = arg0.anInt2695 * 64 + arg0.anInt2666 * 128;
		arg0.anInt2672 += (local80 - arg0.anInt2672) / local18;
	}
}
