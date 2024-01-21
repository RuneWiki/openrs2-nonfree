import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ii", name = "kb", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_574 = Static181.method2795("Thu");

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "[I")
	public static final int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!ii", name = "ub", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_580 = Static181.method2795("Sun");

	@OriginalMember(owner = "client!ii", name = "qb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_578 = Static181.method2795("Mon");

	@OriginalMember(owner = "client!ii", name = "rb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_579 = Static181.method2795("Tue");

	@OriginalMember(owner = "client!ii", name = "eb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_576 = Static181.method2795("Wed");

	@OriginalMember(owner = "client!ii", name = "lb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_577 = Static181.method2795("Fri");

	@OriginalMember(owner = "client!ii", name = "bb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_575 = Static181.method2795("Sat");

	@OriginalMember(owner = "client!ii", name = "X", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array34 = new Class83[] { aClass83_580, aClass83_578, aClass83_579, aClass83_576, aClass83_574, aClass83_577, aClass83_575 };

	@OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
	public static int anInt1827 = 0;

	@OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!ii", name = "ob", descriptor = "I")
	public static int anInt1838 = 0;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
	public static int method1475(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0xB3333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILclient!qe;)V")
	public static void method1476(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1) {
		Static69.aClass2_Sub3_Sub1_2.method284(200);
		Static69.aClass2_Sub3_Sub1_2.method228(arg1.method2397());
		Static69.aClass2_Sub3_Sub1_2.method247(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI)I")
	public static int method1477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)[Lclient!fc;")
	public static Class29[] method1478() {
		@Pc(8) Class29[] local8 = new Class29[Static200.anInt3968];
		for (@Pc(10) int local10 = 0; local10 < Static200.anInt3968; local10++) {
			local8[local10] = new Class29_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[local10], Static124.anIntArray251[local10], Static163.anIntArray314[local10], Static131.anIntArray284[local10], Static151.aByteArrayArray14[local10], Static153.anIntArray317);
		}
		Static17.method372();
		return local8;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZI[IIII[BIII)V")
	public static void method1479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(19) int local19 = (arg8 * (arg1 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) >> 8;
		@Pc(35) int local35 = 256 - arg8;
		for (@Pc(38) int local38 = -arg7; local38 < 0; local38++) {
			for (@Pc(43) int local43 = -arg3; local43 < 0; local43++) {
				if (arg6[arg5++] == 0) {
					arg9++;
				} else {
					@Pc(57) int local57 = arg2[arg9];
					arg2[arg9++] = ((local35 * (local57 & 0xFF00) & 0xFF0000) + ((local57 & 0xFF00FF) * local35 & 0xFF00FF00) >> 8) + local19;
				}
			}
			arg9 += arg4;
			arg5 += arg0;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method1481(@OriginalArg(0) Class24_Sub4 arg0) {
		if (arg0.anInt3345 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(37) int local37;
		if (arg0.anInt3299 != -1 && arg0.anInt3299 < 32768) {
			@Pc(28) Class24_Sub4_Sub2 local28 = Static47.aClass24_Sub4_Sub2Array1[arg0.anInt3299];
			if (local28 != null) {
				local37 = arg0.anInt3349 - local28.anInt3349;
				local43 = arg0.anInt3316 - local28.anInt3316;
				if (local43 != 0 || local37 != 0) {
					arg0.anInt3318 = (int) (Math.atan2((double) local43, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(76) int local76;
		if (arg0.anInt3299 >= 32768) {
			local76 = arg0.anInt3299 - 32768;
			if (local76 == Static138.anInt2924) {
				local76 = 2047;
			}
			@Pc(85) Class24_Sub4_Sub1 local85 = Static22.aClass24_Sub4_Sub1Array1[local76];
			if (local85 != null) {
				@Pc(94) int local94 = arg0.anInt3349 - local85.anInt3349;
				local37 = arg0.anInt3316 - local85.anInt3316;
				if (local37 != 0 || local94 != 0) {
					arg0.anInt3318 = (int) (Math.atan2((double) local37, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3306 != 0 || arg0.anInt3320 != 0) && (arg0.anInt3330 == 0 || arg0.anInt3339 > 0)) {
			local76 = arg0.anInt3316 + (arg0.anInt3332 + -1) * 64 - (arg0.anInt3306 - Static2.anInt57 - Static2.anInt57) * 64;
			local43 = arg0.anInt3349 + (arg0.anInt3332 - 1) * 64 - (arg0.anInt3320 - Static123.anInt2755 - Static123.anInt2755) * 64;
			if (local76 != 0 || local43 != 0) {
				arg0.anInt3318 = (int) (Math.atan2((double) local76, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt3320 = 0;
			arg0.anInt3306 = 0;
		}
		local76 = arg0.anInt3318 - arg0.anInt3331 & 0x7FF;
		if (local76 == 0) {
			arg0.anInt3323 = 0;
			return;
		}
		arg0.anInt3323++;
		@Pc(236) boolean local236;
		if (local76 > 1024) {
			arg0.anInt3331 -= arg0.anInt3345;
			local236 = true;
			if (arg0.anInt3345 > local76 || local76 > 2048 - arg0.anInt3345) {
				arg0.anInt3331 = arg0.anInt3318;
				local236 = false;
			}
			if (arg0.anInt3290 == arg0.anInt3310 && (arg0.anInt3323 > 25 || local236)) {
				if (arg0.anInt3327 == -1) {
					arg0.anInt3310 = arg0.anInt3289;
				} else {
					arg0.anInt3310 = arg0.anInt3327;
				}
			}
		} else {
			local236 = true;
			arg0.anInt3331 += arg0.anInt3345;
			if (local76 < arg0.anInt3345 || 2048 - arg0.anInt3345 < local76) {
				local236 = false;
				arg0.anInt3331 = arg0.anInt3318;
			}
			if (arg0.anInt3290 == arg0.anInt3310 && (arg0.anInt3323 > 25 || local236)) {
				if (arg0.anInt3328 == -1) {
					arg0.anInt3310 = arg0.anInt3289;
				} else {
					arg0.anInt3310 = arg0.anInt3328;
				}
			}
		}
		arg0.anInt3331 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)I")
	public static int method1482(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(ZI)Lclient!ca;")
	public static Class2_Sub2_Sub4 method1483(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub4 local12 = (Class2_Sub2_Sub4) Static43.aClass86_15.method2643((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(30) byte[] local30 = Static76.aClass28_204.method852(Static54.method1044(arg0), Static125.method2111(arg0));
		local12 = new Class2_Sub2_Sub4();
		if (local30 != null) {
			local12.method431(new Class2_Sub3(local30));
		}
		Static43.aClass86_15.method2647(local12, (long) arg0);
		return local12;
	}
}
