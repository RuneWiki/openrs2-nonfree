import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
	public static final int[] anIntArray396 = new int[5];

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Z")
	public static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_959 = Static158.method3034("Abbrechen");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!pe;ILclient!pe;Lclient!pe;Lclient!pe;)V")
	public static void method2642(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) Class13 arg3) {
		Static167.aClass13_35 = arg0;
		Static145.aClass13_32 = arg1;
		Static151.aClass13_18 = arg2;
		Static182.aClass13_38 = arg3;
		Static197.aClass72ArrayArray1 = new Class72[Static151.aClass13_18.method519()][];
		Static65.aBooleanArray9 = new boolean[Static151.aClass13_18.method519()];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method2643(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		arg0.aBoolean121 = false;
		@Pc(20) Class2_Sub1_Sub5 local20;
		if (arg0.anInt3250 != -1) {
			local20 = Static103.method2357(arg0.anInt3250);
			if (local20 == null || local20.anIntArray84 == null) {
				arg0.anInt3250 = -1;
			} else {
				arg0.anInt3288++;
				if (local20.anIntArray84.length > arg0.anInt3301 && arg0.anInt3288 > local20.anIntArray83[arg0.anInt3301]) {
					arg0.anInt3288 = 1;
					arg0.anInt3301++;
					Static9.method258(arg0.anInt3302, local20, arg0.anInt3301, arg0 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1, arg0.anInt3273);
				}
				if (arg0.anInt3301 >= local20.anIntArray84.length) {
					arg0.anInt3288 = 0;
					arg0.anInt3301 = 0;
					Static9.method258(arg0.anInt3302, local20, arg0.anInt3301, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == arg0, arg0.anInt3273);
				}
			}
		}
		if (arg0.anInt3249 != -1 && arg0.anInt3306 <= Static20.anInt580) {
			if (arg0.anInt3297 < 0) {
				arg0.anInt3297 = 0;
			}
			@Pc(130) int local130 = Static101.method2313(arg0.anInt3249).anInt2838;
			if (local130 == -1) {
				arg0.anInt3249 = -1;
			} else {
				@Pc(143) Class2_Sub1_Sub5 local143 = Static103.method2357(local130);
				if (local143 == null || local143.anIntArray84 == null) {
					arg0.anInt3249 = -1;
				} else {
					arg0.anInt3259++;
					if (arg0.anInt3297 < local143.anIntArray84.length && local143.anIntArray83[arg0.anInt3297] < arg0.anInt3259) {
						arg0.anInt3297++;
						arg0.anInt3259 = 1;
						Static9.method258(arg0.anInt3302, local143, arg0.anInt3297, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1 == arg0, arg0.anInt3273);
					}
					if (arg0.anInt3297 >= local143.anIntArray84.length) {
						arg0.anInt3249 = -1;
					}
				}
			}
		}
		if (arg0.anInt3270 != -1 && arg0.anInt3280 <= 1) {
			local20 = Static103.method2357(arg0.anInt3270);
			if (local20.anInt796 == 1 && arg0.anInt3305 > 0 && arg0.anInt3263 <= Static20.anInt580 && Static20.anInt580 > arg0.anInt3295) {
				arg0.anInt3280 = 1;
				return;
			}
		}
		if (arg0.anInt3270 != -1 && arg0.anInt3280 == 0) {
			local20 = Static103.method2357(arg0.anInt3270);
			if (local20 == null || local20.anIntArray84 == null) {
				arg0.anInt3270 = -1;
			} else {
				arg0.anInt3261++;
				if (local20.anIntArray84.length > arg0.anInt3290 && arg0.anInt3261 > local20.anIntArray83[arg0.anInt3290]) {
					arg0.anInt3261 = 1;
					arg0.anInt3290++;
					Static9.method258(arg0.anInt3302, local20, arg0.anInt3290, arg0 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1, arg0.anInt3273);
				}
				if (local20.anIntArray84.length <= arg0.anInt3290) {
					arg0.anInt3290 -= local20.anInt795;
					arg0.anInt3281++;
					if (local20.anInt801 <= arg0.anInt3281) {
						arg0.anInt3270 = -1;
					} else if (arg0.anInt3290 >= 0 && local20.anIntArray84.length > arg0.anInt3290) {
						Static9.method258(arg0.anInt3302, local20, arg0.anInt3290, arg0 == Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1, arg0.anInt3273);
					} else {
						arg0.anInt3270 = -1;
					}
				}
				arg0.aBoolean121 = local20.aBoolean28;
			}
		}
		if (arg0.anInt3280 > 0) {
			arg0.anInt3280--;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public static void method2645() {
		Static70.aClass89_22.method3439();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
	public static void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg0 + 1;
		Static163.method3070(arg1, arg4, arg3, Static42.anIntArrayArray8[arg0]);
		@Pc(23) int local23 = arg2 - 1;
		Static163.method3070(arg1, arg4, arg3, Static42.anIntArrayArray8[arg2]);
		for (@Pc(31) int local31 = local14; local31 <= local23; local31++) {
			@Pc(37) int[] local37 = Static42.anIntArrayArray8[local31];
			local37[arg4] = local37[arg1] = arg3;
		}
	}
}
