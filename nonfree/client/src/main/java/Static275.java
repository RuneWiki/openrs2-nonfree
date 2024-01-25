import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
	public static int anInt5173;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "[I")
	public static int[] anIntArray396;

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "Lclient!ul;")
	public static Class255 aClass255_4;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public static void method4379() {
		@Pc(8) Class4_Sub15 local8 = (Class4_Sub15) Static296.aClass91_50.method2584();
		@Pc(19) boolean local19 = Static65.aClass240_4 != null || Static128.anInt3397 > 0;
		if (local19) {
			Static120.anInt2509 = 1;
		}
		if (Static341.aBoolean452 && Static115.aClass173_1.method4895(81) && Static352.anInt6233 > 2) {
			if (local19) {
				Static146.aClass4_Sub14_2 = (Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270.aClass4_270;
			} else {
				Static91.method1816(local8.method5049(), local8.method5050(), (Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270.aClass4_270);
			}
		} else if (local19) {
			Static146.aClass4_Sub14_2 = (Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270;
		} else {
			Static91.method1816(local8.method5049(), local8.method5050(), (Class4_Sub14) Static289.aClass91_31.aClass4_103.aClass4_270);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IC)Z")
	public static boolean method4380(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg2;
		@Pc(20) int local20 = arg1 - arg2;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local15 * local15;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local24 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local32 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(74) int local74 = local24 * (1 - local61) + local45;
		@Pc(82) int local82 = local28 - (local61 - 1) * local49;
		@Pc(90) int local90 = local32 * (1 - local65) + local53;
		@Pc(99) int local99 = local41 - (local65 - 1) * local57;
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local41 << 2;
		@Pc(119) int local119 = local45 * 3;
		@Pc(125) int local125 = (local61 - 3) * local49;
		@Pc(129) int local129 = local53 * 3;
		@Pc(135) int local135 = local57 * (local65 - 3);
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = (arg1 - 1) * local103;
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(155) int[] local155 = Static400.anIntArrayArray54[arg4];
		Static236.method3990(arg5 - local15, -arg6 + arg5, local155, arg3);
		Static236.method3990(local15 + arg5, arg5 + -local15, local155, arg0);
		Static236.method3990(arg5 + arg6, arg5 + local15, local155, arg3);
		while (local9 > 0) {
			@Pc(196) boolean local196 = local9 <= local20;
			if (local196) {
				if (local90 < 0) {
					while (local90 < 0) {
						local99 += local145;
						local90 += local129;
						local129 += local115;
						local11++;
						local145 += local115;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local90 += local129;
					local129 += local115;
					local11++;
					local145 += local115;
				}
				local90 += -local151;
				local99 += -local135;
				local135 -= local111;
				local151 -= local111;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local82 += local137;
					local74 += local119;
					local137 += local107;
					local7++;
					local119 += local107;
				}
			}
			if (local82 < 0) {
				local74 += local119;
				local82 += local137;
				local137 += local107;
				local7++;
				local119 += local107;
			}
			local82 += -local125;
			local74 += -local143;
			local143 -= local103;
			local125 -= local103;
			local9--;
			@Pc(326) int local326 = arg4 - local9;
			@Pc(331) int local331 = arg4 + local9;
			@Pc(336) int local336 = arg5 + local7;
			@Pc(341) int local341 = arg5 - local7;
			if (local196) {
				@Pc(367) int local367 = arg5 + local11;
				@Pc(372) int local372 = arg5 - local11;
				Static236.method3990(local372, local341, Static400.anIntArrayArray54[local326], arg3);
				Static236.method3990(local367, local372, Static400.anIntArrayArray54[local326], arg0);
				Static236.method3990(local336, local367, Static400.anIntArrayArray54[local326], arg3);
				Static236.method3990(local372, local341, Static400.anIntArrayArray54[local331], arg3);
				Static236.method3990(local367, local372, Static400.anIntArrayArray54[local331], arg0);
				Static236.method3990(local336, local367, Static400.anIntArrayArray54[local331], arg3);
			} else {
				Static236.method3990(local336, local341, Static400.anIntArrayArray54[local326], arg3);
				Static236.method3990(local336, local341, Static400.anIntArrayArray54[local331], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)Z")
	public static boolean method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
