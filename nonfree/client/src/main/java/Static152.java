import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt3232;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!km;")
	public static Class91 aClass91_120;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public static int anInt3235;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public static int anInt3237;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[J")
	public static long[] aLongArray7 = new long[500];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!cg;I)Lclient!ob;")
	public static Class117 method2616(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(12) Class117 local12 = new Class117();
		local12.anInt3817 = arg0.method2691();
		local12.aClass1_Sub2_Sub13_1 = Static74.method1304(local12.anInt3817);
		return local12;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!an;)V")
	public static void method2617(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.aBoolean433 = false;
		if (arg0.aClass1_Sub10_5 != null) {
			arg0.aClass1_Sub10_5.anInt647 = 0;
		}
		for (@Pc(19) Class1_Sub5 local19 = arg0.method4370(); local19 != null; local19 = arg0.method4375()) {
			method2617(local19);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method2618(@OriginalArg(1) Class14_Sub2_Sub2 arg0) {
		for (@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) Static264.aClass61_28.method1835(); local17 != null; local17 = (Class1_Sub8) Static264.aClass61_28.method1836()) {
			if (arg0 == local17.aClass14_Sub2_Sub2_1) {
				if (local17.aClass1_Sub5_Sub1_1 != null) {
					Static141.aClass1_Sub5_Sub4_1.method4380(local17.aClass1_Sub5_Sub1_1);
					local17.aClass1_Sub5_Sub1_1 = null;
				}
				local17.method4441();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lclient!in;II)V")
	public static void method2619(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) Class71 local15 = arg0[local7];
			if (local15 != null && arg1 == local15.anInt2674 && (!local15.aBoolean196 || !Static36.method763(local15))) {
				if (local15.anInt2712 == 0) {
					if (!local15.aBoolean196 && Static36.method763(local15) && Static247.aClass71_21 != local15) {
						continue;
					}
					method2619(arg0, local15.anInt2655);
					if (local15.aClass71Array1 != null) {
						method2619(local15.aClass71Array1, local15.anInt2655);
					}
					@Pc(71) Class1_Sub17 local71 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local15.anInt2655);
					if (local71 != null) {
						Static218.method3440(local71.anInt2431);
					}
				}
				if (local15.anInt2712 == 6) {
					@Pc(104) int local104;
					if (local15.anInt2687 != -1 || local15.anInt2678 != -1) {
						@Pc(99) boolean local99 = Static246.method3815(local15);
						if (local99) {
							local104 = local15.anInt2678;
						} else {
							local104 = local15.anInt2687;
						}
						if (local104 != -1) {
							@Pc(116) Class125 local116 = Static90.method1591(local104);
							if (local116 != null) {
								local15.anInt2668 += Static129.anInt2881;
								while (local116.anIntArray356[local15.anInt2654] < local15.anInt2668) {
									local15.anInt2668 -= local116.anIntArray356[local15.anInt2654];
									local15.anInt2654++;
									if (local116.anIntArray357.length <= local15.anInt2654) {
										local15.anInt2654 -= local116.anInt3946;
										if (local15.anInt2654 < 0 || local15.anInt2654 >= local116.anIntArray357.length) {
											local15.anInt2654 = 0;
										}
									}
									local15.anInt2717 = local15.anInt2654 + 1;
									if (local15.anInt2717 >= local116.anIntArray357.length) {
										local15.anInt2717 -= local116.anInt3946;
										if (local15.anInt2717 < 0 || local116.anIntArray357.length <= local15.anInt2717) {
											local15.anInt2717 = -1;
										}
									}
									Static160.method2779(local15);
								}
							}
						}
					}
					if (local15.anInt2710 != 0 && !local15.aBoolean196) {
						local104 = local15.anInt2710 << 16 >> 16;
						local104 *= Static129.anInt2881;
						local15.anInt2672 = local15.anInt2672 + local104 & 0x7FF;
						@Pc(263) int local263 = local15.anInt2710 >> 16;
						@Pc(267) int local267 = local263 * Static129.anInt2881;
						local15.anInt2635 = local15.anInt2635 + local267 & 0x7FF;
						Static160.method2779(local15);
					}
				}
			}
		}
	}
}
