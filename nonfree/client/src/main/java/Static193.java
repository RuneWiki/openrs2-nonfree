import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
	public static boolean aBoolean273 = true;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBIIII)V")
	public static void method3144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static312.anInt5850 <= arg0 - arg1 && Static214.anInt4216 >= arg1 + arg0 && Static240.anInt1319 <= arg2 - arg1 && Static59.anInt1155 >= arg2 + arg1) {
			Static107.method1776(arg5, arg1, arg3, arg4, arg0, arg2);
		} else {
			Static233.method3681(arg0, arg3, arg1, arg2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)Lclient!fo;")
	public static Class57 method3145(@OriginalArg(1) int arg0) {
		@Pc(6) Class57 local6 = (Class57) Static240.aClass169_51.method4017((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(36) byte[] local36 = Static292.aClass138_83.method3346(Static240.method1123(arg0), Static13.method197(arg0));
		local6 = new Class57();
		if (local36 != null) {
			local6.method1225(new Class1_Sub14(local36));
		}
		Static240.aClass169_51.method4016(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(14) int local14 = arg6 - arg4;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = local14 * local14;
		@Pc(33) int local33 = local21 * local21;
		@Pc(37) int local37 = local33 << 1;
		@Pc(41) int local41 = local25 << 1;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = arg1 << 1;
		@Pc(53) int local53 = arg1 * arg1;
		@Pc(57) int local57 = local53 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local57 + local25 * (1 - local49);
		@Pc(78) int local78 = (1 - local61) * local29 + local37;
		@Pc(87) int local87 = local53 - (local49 - 1) * local41;
		@Pc(95) int local95 = local33 - (local61 - 1) * local45;
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local53 << 2;
		@Pc(107) int local107 = local29 << 2;
		@Pc(111) int local111 = local33 << 2;
		@Pc(115) int local115 = local57 * 3;
		@Pc(121) int local121 = local41 * (local49 - 3);
		@Pc(127) int local127 = (local61 - 3) * local45;
		@Pc(131) int local131 = local37 * 3;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg1 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (local21 - 1) * local107;
		@Pc(151) int[] local151 = Static51.anIntArrayArray1[arg3];
		Static109.method1795(arg5 - arg6, local151, arg5 - local14, arg2);
		Static109.method1795(arg5 - local14, local151, local14 + arg5, arg0);
		Static109.method1795(local14 + arg5, local151, arg5 + arg6, arg2);
		while (local7 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local16++;
					local70 += local115;
					local115 += local103;
					local87 += local133;
					local133 += local103;
				}
			}
			if (local87 < 0) {
				local87 += local133;
				local133 += local103;
				local16++;
				local70 += local115;
				local115 += local103;
			}
			local70 += -local139;
			local87 += -local121;
			local121 -= local99;
			@Pc(258) boolean local258 = local7 <= local21;
			local7--;
			if (local258) {
				if (local78 < 0) {
					while (local78 < 0) {
						local78 += local131;
						local95 += local141;
						local131 += local111;
						local9++;
						local141 += local111;
					}
				}
				if (local95 < 0) {
					local9++;
					local78 += local131;
					local95 += local141;
					local141 += local111;
					local131 += local111;
				}
				local78 += -local147;
				local95 += -local127;
				local147 -= local107;
				local127 -= local107;
			}
			local139 -= local99;
			@Pc(335) int local335 = arg3 - local7;
			@Pc(339) int local339 = local7 + arg3;
			@Pc(343) int local343 = local16 + arg5;
			@Pc(348) int local348 = arg5 - local16;
			if (local258) {
				@Pc(354) int local354 = arg5 + local9;
				@Pc(359) int local359 = arg5 - local9;
				Static109.method1795(local348, Static51.anIntArrayArray1[local335], local359, arg2);
				Static109.method1795(local359, Static51.anIntArrayArray1[local335], local354, arg0);
				Static109.method1795(local354, Static51.anIntArrayArray1[local335], local343, arg2);
				Static109.method1795(local348, Static51.anIntArrayArray1[local339], local359, arg2);
				Static109.method1795(local359, Static51.anIntArrayArray1[local339], local354, arg0);
				Static109.method1795(local354, Static51.anIntArrayArray1[local339], local343, arg2);
			} else {
				Static109.method1795(local348, Static51.anIntArrayArray1[local335], local343, arg2);
				Static109.method1795(local348, Static51.anIntArrayArray1[local339], local343, arg2);
			}
		}
	}
}
