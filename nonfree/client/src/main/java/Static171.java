import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
	public static boolean aBoolean152;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "Lclient!jb;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2253 = Static118.method2249("Passwort: ");

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	public static int anInt3802 = 0;

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2254 = Static118.method2249("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
	public static int method2893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg0);
		if (local14 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local14.anIntArray270.length) {
			return local14.anIntArray270[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
	public static void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static49.aClass1_Sub2_Sub5_Sub1Array5[0].method558(arg3, arg1);
		Static49.aClass1_Sub2_Sub5_Sub1Array5[1].method558(arg3, arg1 + arg0 - 16);
		@Pc(28) int local28 = arg0 * (arg0 - 32) / arg4;
		if (local28 < 8) {
			local28 = 8;
		}
		@Pc(49) int local49 = arg2 * (arg0 - local28 - 32) / (arg4 - arg0);
		Static194.method3096(arg3, arg1 + 16, 16, arg0 - 32, Static206.anInt4389);
		Static194.method3096(arg3, arg1 + local49 + 16, 16, local28, Static210.anInt4464);
		Static194.method3113(arg3, local49 + arg1 + 16, local28, Static116.anInt2838);
		Static194.method3113(arg3 + 1, local49 + arg1 + 16, local28, Static116.anInt2838);
		Static194.method3094(arg3, local49 + arg1 + 16, 16, Static116.anInt2838);
		Static194.method3094(arg3, local49 + arg1 + 17, 16, Static116.anInt2838);
		Static194.method3113(arg3 + 15, local49 + (arg1 - -16), local28, Static157.anInt4275);
		Static194.method3113(arg3 + 14, arg1 - -17 + local49, local28 - 1, Static157.anInt4275);
		Static194.method3094(arg3, local49 + arg1 + local28 + 15, 16, Static157.anInt4275);
		Static194.method3094(arg3 + 1, local28 + 14 + arg1 - -local49, 15, Static157.anInt4275);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIB)I")
	public static int method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg0 & 0x7F;
		@Pc(34) int local34 = arg1;
		if (arg1 < 3 && (Static106.aByteArrayArrayArray67[1][local7][local11] & 0x2) == 2) {
			local34 = arg1 + 1;
		}
		@Pc(53) int local53 = arg2 & 0x7F;
		@Pc(85) int local85 = local32 * Static89.anIntArrayArrayArray3[local34][local7 + 1][local11] + Static89.anIntArrayArrayArray3[local34][local7][local11] * (128 - local32) >> 7;
		@Pc(116) int local116 = local32 * Static89.anIntArrayArrayArray3[local34][local7 + 1][local11 + 1] + Static89.anIntArrayArrayArray3[local34][local7][local11 + 1] * (128 - local32) >> 7;
		return local53 * local116 + (128 - local53) * local85 >> 7;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	public static void method2897() {
		@Pc(3) int local3 = Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1600(Static149.aClass65_2014);
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 0; local5 < Static101.anInt2533; local5++) {
			local12 = Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1600(Static128.method2421(local5));
			if (local3 < local12) {
				local3 = local12;
			}
		}
		local3 += 8;
		Static198.aBoolean168 = true;
		Static195.anInt4218 = Static101.anInt2533 * 15 + 22;
		local12 = Static101.anInt2533 * 15 + 21;
		@Pc(46) int local46 = Static2.anInt67 - local3 / 2;
		Static71.anInt1742 = local3;
		if (Static176.anInt3920 < local3 + local46) {
			local46 = Static176.anInt3920 - local3;
		}
		if (local46 < 0) {
			local46 = 0;
		}
		Static51.anInt1360 = local46;
		@Pc(73) int local73 = Static182.anInt4065;
		if (local12 + local73 > Static33.anInt972) {
			local73 = Static33.anInt972 - local12;
		}
		if (local73 < 0) {
			local73 = 0;
		}
		Static197.anInt4258 = local73;
	}
}
