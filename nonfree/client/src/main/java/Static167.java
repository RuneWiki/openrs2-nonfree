import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public static int anInt3901;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "I")
	public static int anInt3914;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "I")
	public static int anInt3917;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	public static int anInt3907 = 0;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public static int anInt3911 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ak;IIB)V")
	public static void method2901(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg0.anInt443 && arg1 != -1) {
			@Pc(11) Class49 local11 = Static131.method697(arg1);
			@Pc(14) int local14 = local11.anInt2190;
			if (local14 == 1) {
				arg0.anInt474 = 0;
				arg0.anInt407 = 1;
				arg0.anInt399 = arg2;
				arg0.anInt431 = 0;
				arg0.anInt415 = 0;
				Static232.method3865(arg0.anInt479, arg0.anInt427, false, arg0.anInt431, local11);
			}
			if (local14 == 2) {
				arg0.anInt415 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt443 == -1 || Static131.method697(arg1).anInt2189 >= Static131.method697(arg0.anInt443).anInt2189) {
			arg0.anInt474 = 0;
			arg0.anInt415 = 0;
			arg0.anInt434 = arg0.anInt453;
			arg0.anInt431 = 0;
			arg0.anInt407 = 1;
			arg0.anInt399 = arg2;
			arg0.anInt443 = arg1;
			if (arg0.anInt443 != -1) {
				Static232.method3865(arg0.anInt479, arg0.anInt427, false, arg0.anInt431, Static131.method697(arg0.anInt443));
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class122 local8 = Static106.method2192(arg5, arg2);
		if (local8 != null && local8.anObjectArray13 != null) {
			@Pc(17) Class1_Sub30 local17 = new Class1_Sub30();
			local17.anObjectArray32 = local8.anObjectArray13;
			local17.aClass122_18 = local8;
			Static153.method2746(local17);
		}
		Static161.anInt3798 = arg5;
		Static88.aBoolean138 = true;
		anInt3917 = arg2;
		Static8.anInt152 = arg3;
		anInt3914 = arg4;
		Static266.anInt5558 = arg1;
		Static215.anInt4738 = arg0;
		Static257.method4146(local8);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIII)V")
	public static void method2908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static94.anInt4237 < arg4 || Static202.anInt4469 > arg1) {
			return;
		}
		@Pc(18) boolean local18;
		if (anInt3907 > arg3) {
			arg3 = anInt3907;
			local18 = false;
		} else if (Static150.anInt3860 >= arg3) {
			local18 = true;
		} else {
			local18 = false;
			arg3 = Static150.anInt3860;
		}
		@Pc(36) boolean local36;
		if (arg0 < anInt3907) {
			local36 = false;
			arg0 = anInt3907;
		} else if (Static150.anInt3860 < arg0) {
			local36 = false;
			arg0 = Static150.anInt3860;
		} else {
			local36 = true;
		}
		if (arg4 >= Static202.anInt4469) {
			Static147.method2681(Static29.anIntArrayArray10[arg4++], arg2, arg3, arg0);
		} else {
			arg4 = Static202.anInt4469;
		}
		if (Static94.anInt4237 >= arg1) {
			Static147.method2681(Static29.anIntArrayArray10[arg1--], arg2, arg3, arg0);
		} else {
			arg1 = Static94.anInt4237;
		}
		@Pc(97) int local97;
		if (local18 && local36) {
			for (local97 = arg4; local97 <= arg1; local97++) {
				@Pc(103) int[] local103 = Static29.anIntArrayArray10[local97];
				local103[arg3] = local103[arg0] = arg2;
			}
		} else if (local18) {
			for (local97 = arg4; local97 <= arg1; local97++) {
				Static29.anIntArrayArray10[local97][arg3] = arg2;
			}
		} else if (local36) {
			for (local97 = arg4; local97 <= arg1; local97++) {
				Static29.anIntArrayArray10[local97][arg0] = arg2;
			}
		}
	}
}
