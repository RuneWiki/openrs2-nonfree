import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt9103;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
	public static boolean aBoolean630 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!bda;III)Z")
	public static boolean method6975(@OriginalArg(0) int arg0, @OriginalArg(1) Class21_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static358.aBoolean477) {
			return false;
		} else if (Static350.anInt7294 < 100) {
			return false;
		} else if (Static351.method5319(arg3, arg0, arg2)) {
			@Pc(34) int local34 = arg0 << Static392.anInt3635;
			@Pc(38) int local38 = arg2 << Static392.anInt3635;
			@Pc(48) int local48 = Static255.aClass115Array2[arg3].method8055(arg2, arg0) - 1;
			@Pc(54) int local54 = arg1.method8231() + local48;
			if (arg1.aShort65 == 1) {
				if (!Static526.method7452(local54, local48, local38, local34, local38 + Static168.anInt3487, local38, local34, local54, local34)) {
					return false;
				} else if (Static526.method7452(local54, local48, Static168.anInt3487 + local38, local34, Static168.anInt3487 + local38, local38, local34, local48, local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 2) {
				if (!Static526.method7452(local54, local48, Static168.anInt3487 + local38, Static168.anInt3487 + local34, Static168.anInt3487 + local38, Static168.anInt3487 + local38, local34, local54, local34)) {
					return false;
				} else if (Static526.method7452(local48, local48, local38 + Static168.anInt3487, Static168.anInt3487 + local34, Static168.anInt3487 + local38, Static168.anInt3487 + local38, local34 + Static168.anInt3487, local54, local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 4) {
				if (!Static526.method7452(local54, local48, local38, local34 + Static168.anInt3487, local38 + Static168.anInt3487, local38, local34 + Static168.anInt3487, local54, local34 + Static168.anInt3487)) {
					return false;
				} else if (Static526.method7452(local54, local48, Static168.anInt3487 + local38, local34 - -Static168.anInt3487, local38 + Static168.anInt3487, local38, Static168.anInt3487 + local34, local48, Static168.anInt3487 + local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 8) {
				if (!Static526.method7452(local54, local48, local38, Static168.anInt3487 + local34, local38, local38, local34, local54, local34)) {
					return false;
				} else if (Static526.method7452(local48, local48, local38, Static168.anInt3487 + local34, local38, local38, local34 + Static168.anInt3487, local54, local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 16) {
				if (Static154.method2625(local54, Static209.anInt4422, Static209.anInt4422 + local38, local48, Static209.anInt4422, local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 32) {
				if (Static154.method2625(local54, Static209.anInt4422, local38 + Static209.anInt4422, local48, Static209.anInt4422, Static209.anInt4422 + local34)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 == 64) {
				if (Static154.method2625(local54, Static209.anInt4422, local38, local48, Static209.anInt4422, local34 + Static209.anInt4422)) {
					Static119.anInt2720++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort65 != 128) {
				return true;
			} else if (Static154.method2625(local54, Static209.anInt4422, local38, local48, Static209.anInt4422, local34)) {
				Static119.anInt2720++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
	public static void method6979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static249.method2744(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(35) int local35 = local15;
		@Pc(38) int local38 = -local15;
		@Pc(40) int local40 = -1;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static442.anIntArrayArray48[arg4];
		@Pc(50) int local50 = arg5 - local15;
		@Pc(55) int local55 = arg5 + local15;
		Static238.method3886(local46, local50, arg3, arg5 - arg0);
		Static238.method3886(local46, local55, arg1, local50);
		Static238.method3886(local46, arg0 + arg5, arg3, local55);
		while (local10 < local24) {
			local42 += 2;
			local40 += 2;
			local38 += local42;
			local27 += local40;
			if (local38 >= 0 && local35 >= 1) {
				Static225.anIntArray226[local35] = local10;
				local35--;
				local38 -= local35 << 1;
			}
			local10++;
			@Pc(119) int[] local119;
			@Pc(126) int[] local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(148) int local148;
			if (local27 >= 0) {
				local24--;
				if (local15 > local24) {
					local119 = Static442.anIntArrayArray48[local24 + arg4];
					local126 = Static442.anIntArrayArray48[arg4 - local24];
					local130 = Static225.anIntArray226[local24];
					local135 = arg5 + local10;
					local140 = arg5 - local10;
					local144 = local130 + arg5;
					local148 = arg5 - local130;
					Static238.method3886(local119, local148, arg3, local140);
					Static238.method3886(local119, local144, arg1, local148);
					Static238.method3886(local119, local135, arg3, local144);
					Static238.method3886(local126, local148, arg3, local140);
					Static238.method3886(local126, local144, arg1, local148);
					Static238.method3886(local126, local135, arg3, local144);
				} else {
					local119 = Static442.anIntArrayArray48[arg4 + local24];
					local126 = Static442.anIntArrayArray48[arg4 - local24];
					local130 = local10 + arg5;
					local135 = arg5 - local10;
					Static238.method3886(local119, local130, arg3, local135);
					Static238.method3886(local126, local130, arg3, local135);
				}
				local27 -= local24 << 1;
			}
			local119 = Static442.anIntArrayArray48[arg4 + local10];
			local126 = Static442.anIntArrayArray48[arg4 - local10];
			local130 = arg5 + local24;
			local135 = arg5 - local24;
			if (local10 >= local15) {
				Static238.method3886(local119, local130, arg3, local135);
				Static238.method3886(local126, local130, arg3, local135);
			} else {
				local140 = local10 > local35 ? Static225.anIntArray226[local10] : local35;
				local144 = local140 + arg5;
				local148 = arg5 - local140;
				Static238.method3886(local119, local148, arg3, local135);
				Static238.method3886(local119, local144, arg1, local148);
				Static238.method3886(local119, local130, arg3, local144);
				Static238.method3886(local126, local148, arg3, local135);
				Static238.method3886(local126, local144, arg1, local148);
				Static238.method3886(local126, local130, arg3, local144);
			}
		}
	}
}
