import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_31;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int anInt1748;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt1740 = 1;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!hb;")
	private static Class27 aClass27_854 = Static87.method1648("wave2:");

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_852 = aClass27_854;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_853 = Static87.method1648("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1242() {
		aClass54_Sub1_31 = null;
		aClass27_854 = null;
		aClass27_852 = null;
		aClass27_853 = null;
		anIntArray300 = null;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 method1243() {
		@Pc(9) Class3_Sub3_Sub2_Sub2 local9 = new Class3_Sub3_Sub2_Sub2();
		local9.anInt1018 = Static28.anInt748;
		local9.anInt1019 = Static66.anInt1710;
		local9.anInt1017 = Static54.anIntArray238[0];
		local9.anInt1016 = Static72.anIntArray316[0];
		local9.anInt1015 = Static36.anIntArray160[0];
		local9.anInt1014 = Static54.anIntArray239[0];
		@Pc(39) byte[] local39 = Static72.aByteArrayArray10[0];
		@Pc(45) int local45 = local9.anInt1014 * local9.anInt1015;
		local9.anIntArray172 = new int[local45];
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local9.anIntArray172[local51] = Static98.anIntArray378[local39[local51] & 0xFF];
		}
		Static96.method1232();
		return local9;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)I")
	public static int method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static89.aByteArrayArrayArray11[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static89.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V")
	public static void method1245(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static38.anInt910 >= 100) {
			Static43.method901(Static65.aClass27_809, Static45.aClass27_182, 0);
			return;
		}
		@Pc(29) Class27 local29 = Static38.method712(arg0).method746();
		for (@Pc(31) int local31 = 0; local31 < Static38.anInt910; local31++) {
			if (Static45.aLongArray5[local31] == arg0) {
				Static43.method901(Static98.method1779(new Class27[] { local29, Static37.aClass27_451 }), Static45.aClass27_182, 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static43.anInt1241; local70++) {
			if (Static53.aLongArray8[local70] == arg0) {
				Static43.method901(Static98.method1779(new Class27[] { Static80.aClass27_1037, local29, Static30.aClass27_382 }), Static45.aClass27_182, 0);
				return;
			}
		}
		if (!local29.method733(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150)) {
			Static45.aLongArray5[Static38.anInt910++] = arg0;
			Static75.aBoolean101 = true;
			Static78.aClass3_Sub11_Sub1_3.method1478(145);
			Static78.aClass3_Sub11_Sub1_3.method1468(arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ja;BI)V")
	public static void method1246(@OriginalArg(0) Class3_Sub3_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2408 < 128 || arg0.anInt2399 < 128 || arg0.anInt2408 >= 13184 || arg0.anInt2399 >= 13184) {
			arg0.anInt2402 = 0;
			arg0.anInt2424 = 0;
			arg0.anInt2430 = -1;
			arg0.anInt2385 = -1;
			arg0.anInt2408 = arg0.anInt2435 * 64 + arg0.anIntArray359[0] * 128;
			arg0.anInt2399 = arg0.anInt2435 * 64 + arg0.anIntArray357[0] * 128;
			arg0.method1673();
		}
		if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1 == arg0 && (arg0.anInt2408 < 1536 || arg0.anInt2399 < 1536 || arg0.anInt2408 >= 11776 || arg0.anInt2399 >= 11776)) {
			arg0.anInt2424 = 0;
			arg0.anInt2385 = -1;
			arg0.anInt2402 = 0;
			arg0.anInt2430 = -1;
			arg0.anInt2408 = arg0.anIntArray359[0] * 128 + arg0.anInt2435 * 64;
			arg0.anInt2399 = arg0.anIntArray357[0] * 128 + arg0.anInt2435 * 64;
			arg0.method1673();
		}
		if (arg0.anInt2424 > Static2.anInt38) {
			Static2.method18(arg0);
		} else if (arg0.anInt2402 < Static2.anInt38) {
			Static70.method1277(arg0);
		} else {
			Static47.method940(arg0);
		}
		Static15.method249(arg0);
		Static102.method1836(arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method1247() {
		if (Static25.aClass20_13 != null) {
			Static25.aClass20_13.method656();
		}
	}
}
