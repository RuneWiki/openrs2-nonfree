import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "Lclient!da;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
	public static int[] anIntArray371 = new int[2];

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_68 = new Class186(80, 6);

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_73 = new Class231("M", "M", "M", "M");

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "[I")
	public static final int[] anIntArray373 = new int[64];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lclient!oa;")
	public static Class184_Sub1 method3753(@OriginalArg(0) int arg0) {
		return Static301.aBoolean200 && Static201.anInt3536 <= arg0 && arg0 <= Static266.anInt4578 ? Static183.aClass184_Sub1Array3[arg0 - Static201.anInt3536] : null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
	public static void method3755() {
		@Pc(10) Class220 local10 = Static131.aClass220_15;
		synchronized (Static131.aClass220_15) {
			Static131.aClass220_15.method4998(5);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIZII)V")
	public static void method3759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static85.anInt1636 || arg0 < Static97.anInt1796) {
			return;
		}
		@Pc(26) boolean local26;
		if (Static81.anInt1574 > arg1) {
			arg1 = Static81.anInt1574;
			local26 = false;
		} else if (Static99.anInt1808 >= arg1) {
			local26 = true;
		} else {
			local26 = false;
			arg1 = Static99.anInt1808;
		}
		@Pc(50) boolean local50;
		if (Static81.anInt1574 > arg2) {
			local50 = false;
			arg2 = Static81.anInt1574;
		} else if (Static99.anInt1808 < arg2) {
			local50 = false;
			arg2 = Static99.anInt1808;
		} else {
			local50 = true;
		}
		if (Static97.anInt1796 <= arg3) {
			Static73.method1404(Static347.anIntArrayArray54[arg3++], arg2, arg4, arg1);
		} else {
			arg3 = Static97.anInt1796;
		}
		if (arg0 > Static85.anInt1636) {
			arg0 = Static85.anInt1636;
		} else {
			Static73.method1404(Static347.anIntArrayArray54[arg0--], arg2, arg4, arg1);
		}
		@Pc(108) int local108;
		if (local26 && local50) {
			for (local108 = arg3; local108 <= arg0; local108++) {
				@Pc(114) int[] local114 = Static347.anIntArrayArray54[local108];
				local114[arg1] = local114[arg2] = arg4;
			}
		} else if (local26) {
			for (local108 = arg3; local108 <= arg0; local108++) {
				Static347.anIntArrayArray54[local108][arg1] = arg4;
			}
		} else if (local50) {
			for (local108 = arg3; local108 <= arg0; local108++) {
				Static347.anIntArrayArray54[local108][arg2] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
	public static void method3765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static325.method4617(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(28) int local28 = -arg5;
		@Pc(30) int local30 = local15;
		@Pc(33) int local33 = -local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static347.anIntArrayArray54[arg1];
		@Pc(46) int local46 = arg2 - local15;
		Static73.method1404(local41, local46, arg4, arg2 - arg5);
		@Pc(59) int local59 = local15 + arg2;
		Static73.method1404(local41, local59, arg0, local46);
		Static73.method1404(local41, arg2 + arg5, arg4, local59);
		while (local10 < local21) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				Static242.anIntArray370[local30] = local10;
				local30--;
				local33 -= local30 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(132) int[] local132;
			@Pc(136) int local136;
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(154) int local154;
			if (local28 >= 0) {
				local21--;
				local28 -= local21 << 1;
				if (local15 > local21) {
					local125 = Static347.anIntArrayArray54[arg1 + local21];
					local132 = Static347.anIntArrayArray54[arg1 - local21];
					local136 = Static242.anIntArray370[local21];
					local140 = arg2 + local10;
					local145 = arg2 - local10;
					local149 = arg2 + local136;
					local154 = arg2 - local136;
					Static73.method1404(local125, local154, arg4, local145);
					Static73.method1404(local125, local149, arg0, local154);
					Static73.method1404(local125, local140, arg4, local149);
					Static73.method1404(local132, local154, arg4, local145);
					Static73.method1404(local132, local149, arg0, local154);
					Static73.method1404(local132, local140, arg4, local149);
				} else {
					local125 = Static347.anIntArrayArray54[arg1 + local21];
					local132 = Static347.anIntArrayArray54[arg1 - local21];
					local136 = local10 + arg2;
					local140 = arg2 - local10;
					Static73.method1404(local125, local136, arg4, local140);
					Static73.method1404(local132, local136, arg4, local140);
				}
			}
			local125 = Static347.anIntArrayArray54[local10 + arg1];
			local132 = Static347.anIntArrayArray54[arg1 - local10];
			local136 = arg2 + local21;
			local140 = arg2 - local21;
			if (local10 >= local15) {
				Static73.method1404(local125, local136, arg4, local140);
				Static73.method1404(local132, local136, arg4, local140);
			} else {
				local145 = local30 < local10 ? Static242.anIntArray370[local10] : local30;
				local149 = local145 + arg2;
				local154 = arg2 - local145;
				Static73.method1404(local125, local154, arg4, local140);
				Static73.method1404(local125, local149, arg0, local154);
				Static73.method1404(local125, local136, arg4, local149);
				Static73.method1404(local132, local154, arg4, local140);
				Static73.method1404(local132, local149, arg0, local154);
				Static73.method1404(local132, local136, arg4, local149);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method3768(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static421.anIntArray456[local3] = Static421.anIntArray456[local3 - 1];
			Static170.anIntArray186[local3] = Static170.anIntArray186[local3 - 1];
			Static117.aStringArray16[local3] = Static117.aStringArray16[local3 - 1];
			Static355.aStringArray41[local3] = Static355.aStringArray41[local3 - 1];
			Static131.aStringArray21[local3] = Static131.aStringArray21[local3 - 1];
			Static113.aStringArray14[local3] = Static113.aStringArray14[local3 - 1];
			Static232.anIntArray340[local3] = Static232.anIntArray340[local3 - 1];
		}
		Static421.anIntArray456[0] = arg5;
		Static170.anIntArray186[0] = arg4;
		Static117.aStringArray16[0] = arg6;
		Static355.aStringArray41[0] = arg3;
		Static131.aStringArray21[0] = arg0;
		Static402.anInt6641 = Static323.anInt5265;
		Static113.aStringArray14[0] = arg2;
		Static232.anIntArray340[0] = arg1;
		Static259.anInt4456++;
	}
}
