import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kw", name = "je", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "I")
	public static int anInt5465 = -1;

	@OriginalMember(owner = "client!kw", name = "yd", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_86 = new Class130(76, 2);

	@OriginalMember(owner = "client!kw", name = "Od", descriptor = "J")
	public static long aLong177 = 20000000L;

	@OriginalMember(owner = "client!kw", name = "ee", descriptor = "[I")
	public static int[] anIntArray297 = new int[1];

	@OriginalMember(owner = "client!kw", name = "ke", descriptor = "[I")
	public static int[] anIntArray298 = null;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!fe;IIIIIIII)Z")
	public static boolean method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(17) int local17 = arg7 - 64;
		Static426.anIntArrayArray52[64][64] = 99;
		@Pc(28) int local28 = arg5 - 64;
		Static331.anIntArrayArray43[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static360.anIntArray409[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static143.anIntArray139[0] = arg5;
		@Pc(55) int[][] local55 = arg2.anIntArrayArray19;
		while (local50 != local47) {
			local9 = Static143.anIntArray139[local47];
			local7 = Static360.anIntArray409[local47];
			@Pc(70) int local70 = local7 - local17;
			@Pc(74) int local74 = local9 - local28;
			@Pc(79) int local79 = local7 - arg2.anInt2957;
			@Pc(85) int local85 = local9 - arg2.anInt2972;
			local47 = local47 + 1 & 0xFFF;
			if (arg6 == -4) {
				if (arg1 == local7 && arg9 == local9) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static352.method5824(arg1, 1, arg8, 1, arg9, arg3, local9, local7)) {
					Static574.anInt9453 = local7;
					Static496.anInt2424 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg2.method2727(1, arg4, 1, arg9, arg8, local7, local9, arg3, arg1)) {
					Static574.anInt9453 = local7;
					Static496.anInt2424 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg2.method2723(arg9, local7, arg1, local9, 1, arg8, arg4, arg3)) {
					Static574.anInt9453 = local7;
					Static496.anInt2424 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg2.method2724(arg6, arg1, local7, arg9, local9, 1, arg0)) {
					Static496.anInt2424 = local9;
					Static574.anInt9453 = local7;
					return true;
				}
			} else if (arg2.method2734(arg9, arg0, arg1, arg6, local9, local7, 1)) {
				Static574.anInt9453 = local7;
				Static496.anInt2424 = local9;
				return true;
			}
			@Pc(247) int local247 = Static331.anIntArrayArray43[local70][local74] + 1;
			if (local70 > 0 && Static426.anIntArrayArray52[local70 - 1][local74] == 0 && (local55[local79 - 1][local85] & 0x42240000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 - 1][local74] = 2;
				Static331.anIntArrayArray43[local70 - 1][local74] = local247;
			}
			if (local70 < 127 && Static426.anIntArrayArray52[local70 + 1][local74] == 0 && (local55[local79 + 1][local85] & 0x60240000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 + 1][local74] = 8;
				Static331.anIntArrayArray43[local70 + 1][local74] = local247;
			}
			if (local74 > 0 && Static426.anIntArrayArray52[local70][local74 - 1] == 0 && (local55[local79][local85 - 1] & 0x40A40000) == 0) {
				Static360.anIntArray409[local50] = local7;
				Static143.anIntArray139[local50] = local9 - 1;
				Static426.anIntArrayArray52[local70][local74 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70][local74 - 1] = local247;
			}
			if (local74 < 127 && Static426.anIntArrayArray52[local70][local74 + 1] == 0 && (local55[local79][local85 + 1] & 0x48240000) == 0) {
				Static360.anIntArray409[local50] = local7;
				Static143.anIntArray139[local50] = local9 + 1;
				Static426.anIntArrayArray52[local70][local74 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70][local74 + 1] = local247;
			}
			if (local70 > 0 && local74 > 0 && Static426.anIntArrayArray52[local70 - 1][local74 - 1] == 0 && (local55[local79 - 1][local85 - 1] & 0x43A40000) == 0 && (local55[local79 - 1][local85] & 0x42240000) == 0 && (local55[local79][local85 - 1] & 0x40A40000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9 - 1;
				Static426.anIntArrayArray52[local70 - 1][local74 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70 - 1][local74 - 1] = local247;
			}
			if (local70 < 127 && local74 > 0 && Static426.anIntArrayArray52[local70 + 1][local74 - 1] == 0 && (local55[local79 + 1][local85 - 1] & 0x60E40000) == 0 && (local55[local79 + 1][local85] & 0x60240000) == 0 && (local55[local79][local85 - 1] & 0x40A40000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9 - 1;
				Static426.anIntArrayArray52[local70 + 1][local74 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70 + 1][local74 - 1] = local247;
			}
			if (local70 > 0 && local74 < 127 && Static426.anIntArrayArray52[local70 - 1][local74 + 1] == 0 && (local55[local79 - 1][local85 + 1] & 0x4E240000) == 0 && (local55[local79 - 1][local85] & 0x42240000) == 0 && (local55[local79][local85 + 1] & 0x48240000) == 0) {
				Static360.anIntArray409[local50] = local7 - 1;
				Static143.anIntArray139[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static426.anIntArrayArray52[local70 - 1][local74 + 1] = 6;
				Static331.anIntArrayArray43[local70 - 1][local74 + 1] = local247;
			}
			if (local70 < 127 && local74 < 127 && Static426.anIntArrayArray52[local70 + 1][local74 + 1] == 0 && (local55[local79 + 1][local85 + 1] & 0x78240000) == 0 && (local55[local79 + 1][local85] & 0x60240000) == 0 && (local55[local79][local85 + 1] & 0x48240000) == 0) {
				Static360.anIntArray409[local50] = local7 + 1;
				Static143.anIntArray139[local50] = local9 + 1;
				Static426.anIntArrayArray52[local70 + 1][local74 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static331.anIntArrayArray43[local70 + 1][local74 + 1] = local247;
			}
		}
		Static574.anInt9453 = local7;
		Static496.anInt2424 = local9;
		return false;
	}
}
