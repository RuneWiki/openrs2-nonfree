import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "[S")
	public static short[] aShortArray45 = new short[256];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIII)I")
	public static int method2504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static154.anIntArrayArrayArray5 == null) {
			return 0;
		}
		@Pc(18) int local18 = arg0 >> 7;
		@Pc(22) int local22 = arg1 >> 7;
		if (local22 < 0 || local18 < 0 || local22 > 103 || local18 > 103) {
			return 0;
		}
		@Pc(42) int local42 = arg2;
		@Pc(46) int local46 = arg0 & 0x7F;
		@Pc(50) int local50 = arg1 & 0x7F;
		if (arg2 < 3 && (Static27.aByteArrayArrayArray2[1][local22][local18] & 0x2) == 2) {
			local42 = arg2 + 1;
		}
		@Pc(99) int local99 = Static154.anIntArrayArrayArray5[local42][local22 + 1][local18 + 1] * local50 + (128 - local50) * Static154.anIntArrayArrayArray5[local42][local22][local18 + 1] >> 7;
		@Pc(126) int local126 = Static154.anIntArrayArrayArray5[local42][local22][local18] * (128 - local50) + Static154.anIntArrayArrayArray5[local42][local22 + 1][local18] * local50 >> 7;
		return local126 * (128 - local46) + local46 * local99 >> 7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIBI)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static183.method2966(arg3, arg0, arg1, arg4);
			}
		} else if (local10 == 0) {
			Static183.method2963(arg4, arg2, arg1, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(77) boolean local77 = local15 < local10;
			@Pc(86) int local86;
			@Pc(82) int local82;
			if (local77) {
				local82 = arg2;
				arg2 = arg3;
				local86 = arg1;
				arg1 = arg4;
				arg4 = local86;
				arg3 = local82;
			}
			if (arg1 > arg2) {
				local86 = arg1;
				arg1 = arg2;
				local82 = arg4;
				arg2 = local86;
				arg4 = arg3;
				arg3 = local82;
			}
			local86 = arg4;
			local82 = arg2 - arg1;
			@Pc(123) int local123 = arg3 - arg4;
			if (local123 < 0) {
				local123 = -local123;
			}
			@Pc(134) int local134 = -(local82 >> 1);
			@Pc(145) int local145 = arg4 >= arg3 ? -1 : 1;
			@Pc(149) int local149;
			if (local77) {
				for (local149 = arg1; local149 <= arg2; local149++) {
					Static253.anIntArrayArray34[local149][local86] = arg0;
					local134 += local123;
					if (local134 > 0) {
						local134 -= local82;
						local86 += local145;
					}
				}
			} else {
				for (local149 = arg1; local149 <= arg2; local149++) {
					Static253.anIntArrayArray34[local86][local149] = arg0;
					local134 += local123;
					if (local134 > 0) {
						local134 -= local82;
						local86 += local145;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([III[Ljava/lang/Object;I)V")
	public static void method2507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg1) / 2;
		@Pc(22) int local22 = arg0[local18];
		@Pc(24) int local24 = arg1;
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local22;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg3; local50++) {
			if (local22 + (local50 & 0x1) > arg0[local50]) {
				@Pc(71) int local71 = arg0[local50];
				arg0[local50] = arg0[local24];
				arg0[local24] = local71;
				@Pc(85) Object local85 = arg2[local50];
				arg2[local50] = arg2[local24];
				arg2[local24++] = local85;
			}
		}
		arg0[arg3] = arg0[local24];
		arg0[local24] = local22;
		arg2[arg3] = arg2[local24];
		arg2[local24] = local38;
		method2507(arg0, arg1, arg2, local24 - 1);
		method2507(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lclient!fk;")
	public static Class4_Sub2_Sub7 method2508(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub7 local12 = (Class4_Sub2_Sub7) Static120.aClass111_14.method2890((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static284.aClass22_100.method665(11, arg0);
		local12 = new Class4_Sub2_Sub7();
		if (local22 != null) {
			local12.method1390(new Class4_Sub24(local22));
		}
		Static120.aClass111_14.method2886((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)V")
	public static void method2509(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static56.anInt1264 != -1) {
				Static97.method3590(Static56.anInt1264);
			}
			for (@Pc(26) Class4_Sub30 local26 = (Class4_Sub30) Static167.aClass163_25.method4192(); local26 != null; local26 = (Class4_Sub30) Static167.aClass163_25.method4183()) {
				Static157.method262(true, local26);
			}
			Static56.anInt1264 = -1;
			Static167.aClass163_25 = new Class163(8);
			Static73.method1224();
			Static56.anInt1264 = Static263.anInt5161;
			Static143.method2292(false);
			Static38.method716();
			Static140.method2240(Static56.anInt1264);
		}
		Static60.anInt1341 = -1;
		Static305.method4687(Static198.anInt4005);
		Static72.aClass13_Sub5_Sub1_1 = new Class13_Sub5_Sub1();
		Static72.aClass13_Sub5_Sub1_1.anInt5294 = 3000;
		Static72.aClass13_Sub5_Sub1_1.anInt5334 = 3000;
		if (!Static251.aBoolean330 && Static122.anInt2465 == 0) {
			Static48.method956(Static60.aClass22_26);
			Static123.method2035(10);
			return;
		}
		if (Static99.anInt1946 == 2) {
			Static248.anInt4865 = Static65.anInt5705 << 7;
			Static71.anInt1457 = Static89.anInt1797 << 7;
		} else {
			Static282.method4404();
		}
		if (Static251.aBoolean330) {
			Static197.method3207();
		}
		Static14.method264();
		Static123.method2035(28);
	}
}
