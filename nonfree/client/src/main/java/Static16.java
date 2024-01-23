import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "R", descriptor = "Lclient!va;")
	public static Class1_Sub2_Sub21 aClass1_Sub2_Sub21_1;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	public static int anInt444;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
	public static int anInt452;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "[Lclient!ao;")
	public static Class14[] aClass14Array1 = new Class14[29];

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[5];

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	public static int anInt453 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BIIII)V")
	public static void method360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1_Sub5 local10;
		for (local10 = (Class1_Sub5) Static130.aClass131_6.method3791(); local10 != null; local10 = (Class1_Sub5) Static130.aClass131_6.method3792()) {
			Static78.method1416(arg0, arg2, local10, arg3, arg1);
		}
		@Pc(37) byte local37;
		@Pc(42) Class124 local42;
		@Pc(132) int local132;
		for (local10 = (Class1_Sub5) Static234.aClass131_16.method3791(); local10 != null; local10 = (Class1_Sub5) Static234.aClass131_16.method3792()) {
			local37 = 1;
			local42 = local10.aClass25_Sub1_Sub2_1.method1232();
			if (local10.aClass25_Sub1_Sub2_1.anInt1646 == local42.anInt4578) {
				local37 = 0;
			} else if (local10.aClass25_Sub1_Sub2_1.anInt1646 == local42.anInt4571 || local42.anInt4575 == local10.aClass25_Sub1_Sub2_1.anInt1646 || local10.aClass25_Sub1_Sub2_1.anInt1646 == local42.anInt4597 || local10.aClass25_Sub1_Sub2_1.anInt1646 == local42.anInt4600) {
				local37 = 2;
			} else if (local42.anInt4602 == local10.aClass25_Sub1_Sub2_1.anInt1646 || local42.anInt4580 == local10.aClass25_Sub1_Sub2_1.anInt1646 || local10.aClass25_Sub1_Sub2_1.anInt1646 == local42.anInt4584 || local42.anInt4573 == local10.aClass25_Sub1_Sub2_1.anInt1646) {
				local37 = 3;
			}
			if (local37 != local10.anInt1222) {
				local132 = Static158.method2960(local10.aClass25_Sub1_Sub2_1);
				if (local132 != local10.anInt1230) {
					if (local10.aClass1_Sub3_Sub4_2 != null) {
						Static245.aClass1_Sub3_Sub1_2.method520(local10.aClass1_Sub3_Sub4_2);
						local10.aClass1_Sub3_Sub4_2 = null;
					}
					local10.anInt1230 = local132;
				}
				local10.anInt1222 = local37;
			}
			local10.anInt1224 = local10.aClass25_Sub1_Sub2_1.anInt1635;
			local10.anInt1232 = local10.aClass25_Sub1_Sub2_1.anInt1635 + local10.aClass25_Sub1_Sub2_1.method1243() * 64;
			local10.anInt1223 = local10.aClass25_Sub1_Sub2_1.anInt1604;
			local10.anInt1227 = local10.aClass25_Sub1_Sub2_1.anInt1604 + local10.aClass25_Sub1_Sub2_1.method1243() * 64;
			Static78.method1416(arg0, arg2, local10, arg3, arg1);
		}
		for (local10 = (Class1_Sub5) Static156.aClass117_13.method3441(); local10 != null; local10 = (Class1_Sub5) Static156.aClass117_13.method3444()) {
			local37 = 1;
			local42 = local10.aClass25_Sub1_Sub1_1.method1232();
			if (local42.anInt4578 == local10.aClass25_Sub1_Sub1_1.anInt1646) {
				local37 = 0;
			} else if (local10.aClass25_Sub1_Sub1_1.anInt1646 == local42.anInt4571 || local42.anInt4575 == local10.aClass25_Sub1_Sub1_1.anInt1646 || local42.anInt4597 == local10.aClass25_Sub1_Sub1_1.anInt1646 || local10.aClass25_Sub1_Sub1_1.anInt1646 == local42.anInt4600) {
				local37 = 2;
			} else if (local10.aClass25_Sub1_Sub1_1.anInt1646 == local42.anInt4602 || local10.aClass25_Sub1_Sub1_1.anInt1646 == local42.anInt4580 || local10.aClass25_Sub1_Sub1_1.anInt1646 == local42.anInt4584 || local42.anInt4573 == local10.aClass25_Sub1_Sub1_1.anInt1646) {
				local37 = 3;
			}
			if (local10.anInt1222 != local37) {
				local132 = Static192.method3418(local10.aClass25_Sub1_Sub1_1);
				if (local10.anInt1230 != local132) {
					if (local10.aClass1_Sub3_Sub4_2 != null) {
						Static245.aClass1_Sub3_Sub1_2.method520(local10.aClass1_Sub3_Sub4_2);
						local10.aClass1_Sub3_Sub4_2 = null;
					}
					local10.anInt1230 = local132;
				}
				local10.anInt1222 = local37;
			}
			local10.anInt1224 = local10.aClass25_Sub1_Sub1_1.anInt1635;
			local10.anInt1232 = local10.aClass25_Sub1_Sub1_1.anInt1635 + local10.aClass25_Sub1_Sub1_1.method1243() * 64;
			local10.anInt1223 = local10.aClass25_Sub1_Sub1_1.anInt1604;
			local10.anInt1227 = local10.aClass25_Sub1_Sub1_1.anInt1604 + local10.aClass25_Sub1_Sub1_1.method1243() * 64;
			Static78.method1416(arg0, arg2, local10, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
	public static void method361() {
		if (Static283.aBoolean322) {
			return;
		}
		Static283.aBoolean322 = true;
		Static37.aBoolean69 = true;
		if (Static205.aBoolean243) {
			Static125.aFloat97 = (int) Static125.aFloat97 - 65 & 0xFFFFFF80;
		} else {
			Static279.aFloat196 += (-24.0F - Static279.aFloat196) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIII)I")
	public static int method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		} else {
			@Pc(16) int local16 = 128 - arg0;
			@Pc(34) int local34 = ((arg2 & -16711936) >>> 7) * local16 + arg0 * ((arg1 & -16711936) >>> 7) & 0xFF00FF00;
			@Pc(48) int local48 = local16 * (arg2 & 0xFF00FF) + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00;
			return local34 + (local48 >> 7);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
	public static void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static223.anInt1245 || Static152.anInt3532 > arg1) {
			return;
		}
		@Pc(29) boolean local29;
		if (Static102.anInt2239 > arg4) {
			arg4 = Static102.anInt2239;
			local29 = false;
		} else if (arg4 > Static88.anInt2052) {
			arg4 = Static88.anInt2052;
			local29 = false;
		} else {
			local29 = true;
		}
		@Pc(57) boolean local57;
		if (Static102.anInt2239 > arg0) {
			arg0 = Static102.anInt2239;
			local57 = false;
		} else if (arg0 > Static88.anInt2052) {
			local57 = false;
			arg0 = Static88.anInt2052;
		} else {
			local57 = true;
		}
		if (arg3 >= Static152.anInt3532) {
			Static89.method1538(Static57.anIntArrayArray9[arg3++], arg4, arg0, arg2);
		} else {
			arg3 = Static152.anInt3532;
		}
		if (arg1 > Static223.anInt1245) {
			arg1 = Static223.anInt1245;
		} else {
			Static89.method1538(Static57.anIntArrayArray9[arg1--], arg4, arg0, arg2);
		}
		@Pc(120) int local120;
		if (local57 && local29) {
			for (local120 = arg3; local120 <= arg1; local120++) {
				@Pc(173) int[] local173 = Static57.anIntArrayArray9[local120];
				local173[arg0] = local173[arg4] = arg2;
			}
		} else if (local57) {
			for (local120 = arg3; local120 <= arg1; local120++) {
				Static57.anIntArrayArray9[local120][arg0] = arg2;
			}
		} else if (local29) {
			for (local120 = arg3; local120 <= arg1; local120++) {
				Static57.anIntArrayArray9[local120][arg4] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BILclient!im;)Ljava/lang/String;")
	public static String method364(@OriginalArg(2) Class1_Sub16 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2618();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(16) byte[] local16 = new byte[local7];
			arg0.anInt3328 += Static24.aClass96_1.method2878(local16, arg0.aByteArray39, local7, 0, arg0.anInt3328);
			return Static74.method1369(local16, local7, 0);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}
}
