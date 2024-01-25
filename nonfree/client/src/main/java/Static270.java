import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!rga;")
	public static Class244 aClass244_2;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	public static int anInt4979 = -1;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	public static int anInt4987 = 1;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)Z")
	public static boolean method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;Lclient!ha;Lclient!da;ZILclient!ne;)V")
	public static void method4168(@OriginalArg(0) String arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class247 arg4) {
		@Pc(21) boolean local21 = !Static578.aBoolean801 || Static192.method3181();
		if (!local21) {
			return;
		}
		@Pc(35) int local35;
		@Pc(44) int local44;
		if (Static578.aBoolean801 && local21) {
			@Pc(139) Class247 local139 = Static569.aClass247_15;
			@Pc(145) Class73 local145 = arg1.method6886(local139, Static72.aClass369Array1);
			local35 = local139.method5769(arg0, (Class50[]) null, 250);
			local44 = local139.method5763(arg0, (Class50[]) null, 250, local139.anInt6972);
			@Pc(164) int local164 = Static479.aClass369_2.anInt10309;
			@Pc(168) int local168 = local164 + 4;
			local35 += local168 * 2;
			local44 += local168 * 2;
			if (local44 < Static590.anInt9691) {
				local44 = Static590.anInt9691;
			}
			if (local35 < Static370.anInt8566) {
				local35 = Static370.anInt8566;
			}
			@Pc(201) int local201 = Class28_Sub1_Sub2_Sub2.lb.method6449(Static613.anInt10005, local35) + Static496.anInt8306;
			@Pc(209) int local209 = Static94.aClass81_9.method2034(Static10.anInt152, local44) + Static534.anInt8839;
			if (Static66.aBoolean570) {
				local201 += Static106.method2037();
				local209 += Static660.method8815();
			}
			arg1.method6898(Static559.aClass369_3, false).method6005(local201 + Static288.aClass369_1.anInt10309, Static288.aClass369_1.anInt10307 + local209, local35 - Static288.aClass369_1.anInt10309 * 2, local44 + -(Static288.aClass369_1.anInt10307 * 2), 1, 0, 0);
			arg1.method6898(Static288.aClass369_1, true).method5996(local201, local209);
			Static288.aClass369_1.method8543();
			arg1.method6898(Static288.aClass369_1, true).method5996(local35 + local201 - local164, local209);
			Static288.aClass369_1.method8547();
			arg1.method6898(Static288.aClass369_1, true).method5996(local201 + local35 - local164, local44 + local209 + -local164);
			Static288.aClass369_1.method8543();
			arg1.method6898(Static288.aClass369_1, true).method5996(local201, local44 + local209 - local164);
			Static288.aClass369_1.method8547();
			arg1.method6898(Static479.aClass369_2, true).method5989(local201, Static288.aClass369_1.anInt10307 + local209, local164, local44 - Static288.aClass369_1.anInt10307 * 2);
			Static479.aClass369_2.method8544();
			arg1.method6898(Static479.aClass369_2, true).method5989(local201 + Static288.aClass369_1.anInt10309, local209, local35 - Static288.aClass369_1.anInt10309 * 2, local164);
			Static479.aClass369_2.method8544();
			arg1.method6898(Static479.aClass369_2, true).method5989(local35 + local201 - local164, local209 + Static288.aClass369_1.anInt10307, local164, local44 - Static288.aClass369_1.anInt10307 * 2);
			Static479.aClass369_2.method8544();
			arg1.method6898(Static479.aClass369_2, true).method5989(Static288.aClass369_1.anInt10309 + local201, -local164 + local44 + local209, local35 - Static288.aClass369_1.anInt10309 * 2, local164);
			Static479.aClass369_2.method8544();
			local145.method5780(1, (Class1) null, local201 + local168, local168 + local209, arg0, 0, 1, (Class50[]) null, local35 - local168 * 2, 0, -1, 0, Static613.anInt10015 | 0xFF000000, local44 - local168 * 2, (int[]) null);
			Static356.method5358(local201, local44, local209, local35);
		} else {
			local35 = arg4.method5769(arg0, (Class50[]) null, 250);
			local44 = arg4.method5766(250, arg0, (Class50[]) null) * 13;
			arg1.aa(6, 6, local35 + 4 + 4, local44 + 4 + 4, -16777216, 0);
			arg1.method6895(6, 6, local35 + 8, local44 + 8, -1, 0);
			arg2.method5780(1, (Class1) null, 10, 10, arg0, 0, 1, (Class50[]) null, local35, 0, -1, 0, -1, local44, (int[]) null);
			Static356.method5358(6, local44 + 4 + 4, 6, local35 + 4 + 4);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static66.aBoolean570) {
				Static546.method7617();
			} else {
				arg1.method6925();
			}
		} catch (@Pc(451) Exception_Sub1 local451) {
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public static void method4169() {
		Static661.method8827();
		Static27.aClass347ArrayArray1 = null;
		Static555.aClass57_3 = null;
		Static484.aClass57_4 = null;
		Static367.aClass65_11 = null;
		Static282.aClass57_1 = null;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg0) {
			Static180.method2996(arg6, arg3, arg5, arg2, arg4, arg1);
		} else if (arg3 - arg1 >= Static106.anInt2266 && Static669.anInt10712 >= arg3 + arg1 && Static639.anInt10384 <= arg6 - arg0 && arg6 + arg0 <= Static496.anInt8305) {
			Static641.method8654(arg6, arg0, arg2, arg1, arg4, arg3, arg5);
		} else {
			Static192.method3180(arg2, arg5, arg3, arg4, arg1, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)I")
	public static int method4171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg0;
			arg0 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 + 1 - arg2 - arg4;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	public static void method4172(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub3_Sub17 local17 = Static358.method5408(1, (long) arg0);
		local17.method7288();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4173(@OriginalArg(1) String arg0) {
		return Static167.method2919(arg0, 10);
	}
}
