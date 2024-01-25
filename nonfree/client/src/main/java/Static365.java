import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public static int anInt2303;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public static int anInt2304;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public static int anInt2296 = 2;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_19 = new Class210();

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ms;")
	public static Class155 aClass155_13 = null;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2195() {
		for (@Pc(11) Class22_Sub3 local11 = (Class22_Sub3) Static183.aClass56_4.method1256(); local11 != null; local11 = (Class22_Sub3) Static183.aClass56_4.method1256()) {
			Static10.method376(local11);
		}
		@Pc(34) int local34;
		@Pc(32) int local32;
		if (Static43.method900()) {
			local32 = 3;
			local34 = 0;
		} else {
			local32 = Static303.anInt5442;
			local34 = Static303.anInt5442;
		}
		Static41.method881();
		for (@Pc(43) int local43 = local34; local43 <= local32; local43++) {
			Static41.method880();
			Static41.method894(local43);
			Static41.method893(local43);
		}
		Static41.method882();
		Static41.method884();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIB[J)V")
	public static void method2197(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg2; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg3[local46]) {
				@Pc(64) long local64 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local64;
				@Pc(78) int local78 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local78;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method2197(arg0, arg1, local16 - 1, arg3);
		method2197(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIII)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = local21 * (Static170.aShort23 - Static43.aShort14) / 100 + Static43.aShort14;
		if (local45 < Static276.aShort68) {
			local45 = Static276.aShort68;
		} else if (local45 > Static138.aShort22) {
			local45 = Static138.aShort22;
		}
		@Pc(71) int local71 = local45 * 512 * arg3 / (arg0 * 334);
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(87) short local87;
		if (Static242.aShort66 > local71) {
			local87 = Static242.aShort66;
			local45 = arg0 * local87 * 334 / (arg3 * 512);
			if (Static138.aShort22 < local45) {
				local45 = Static138.aShort22;
				local112 = arg3 * local45 * 512 / (local87 * 334);
				local118 = (arg0 - local112) / 2;
				if (arg2) {
					Static304.aClass82_4.method4512();
					Static304.aClass82_4.method4486(arg3, local118, arg4, -16777216, arg1);
					Static304.aClass82_4.method4486(arg3, local118, arg4 + arg0 - local118, -16777216, arg1);
				}
				arg0 -= local118 * 2;
				arg4 += local118;
			}
		} else if (Static79.aShort15 < local71) {
			local87 = Static79.aShort15;
			local45 = local87 * arg0 * 334 / (arg3 * 512);
			if (local45 < Static276.aShort68) {
				local45 = Static276.aShort68;
				local112 = arg0 * 334 * local87 / (local45 * 512);
				local118 = (arg3 - local112) / 2;
				if (arg2) {
					Static304.aClass82_4.method4512();
					Static304.aClass82_4.method4486(local118, arg0, arg4, -16777216, arg1);
					Static304.aClass82_4.method4486(local118, arg0, arg4, -16777216, arg1 + arg3 - local118);
				}
				arg1 += local118;
				arg3 -= local118 * 2;
			}
		}
		Static233.anInt4272 = arg1;
		Static108.anInt2142 = (short) arg3;
		Static244.anInt1026 = (short) arg0;
		Static143.anInt2605 = arg4;
		Static30.anInt684 = local45 * arg3 / 334;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)Z")
	public static boolean method2201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface11 local9 = (Interface11) Static252.method4000(arg2, arg0, arg1);
		@Pc(16) boolean local16 = true;
		if (local9 != null) {
			local16 = Static327.method5055(local9) & true;
		}
		local9 = (Interface11) Static86.method4712(arg2, arg0, arg1, wk.class);
		if (local9 != null) {
			local16 &= Static327.method5055(local9);
		}
		local9 = (Interface11) Static240.method3889(arg2, arg0, arg1);
		if (local9 != null) {
			local16 &= Static327.method5055(local9);
		}
		return local16;
	}
}
