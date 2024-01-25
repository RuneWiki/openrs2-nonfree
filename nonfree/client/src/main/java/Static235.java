import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!ki;")
	public static Class2_Sub23_Sub1 aClass2_Sub23_Sub1_6 = new Class2_Sub23_Sub1(8192);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
	public static final int[] anIntArray520 = new int[256];

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(20) int local20 = arg4 - arg2;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg4 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local48 + (1 - local60) * local32;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg4 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (local20 - 1) * local107;
		@Pc(169) int local169;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (Static430.anInt7123 <= arg1 && Static181.anInt3543 >= arg1) {
			@Pc(161) int[] local161 = Static280.anIntArrayArray51[arg1];
			local169 = Static327.method4554(arg0 - arg3, Static184.anInt3600, Static8.anInt223);
			local177 = Static327.method4554(arg0 + arg3, Static184.anInt3600, Static8.anInt223);
			local185 = Static327.method4554(arg0 - local16, Static184.anInt3600, Static8.anInt223);
			local193 = Static327.method4554(local16 + arg0, Static184.anInt3600, Static8.anInt223);
			Static64.method1247(local169, local161, local185, arg5);
			Static64.method1247(local185, local161, local193, arg6);
			Static64.method1247(local193, local161, local177, arg5);
		}
		while (local9 > 0) {
			@Pc(220) boolean local220 = local9 <= local20;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local115;
					local78 += local133;
					local115 += local103;
					local133 += local103;
					local7++;
				}
			}
			if (local220) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local141;
						local87 += local125;
						local125 += local111;
						local141 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local87 += local125;
					local95 += local141;
					local11++;
					local125 += local111;
					local141 += local111;
				}
				local87 += -local147;
				local95 += -local131;
				local147 -= local107;
				local131 -= local107;
			}
			if (local78 < 0) {
				local70 += local115;
				local78 += local133;
				local115 += local103;
				local7++;
				local133 += local103;
			}
			local78 += -local121;
			local70 += -local139;
			local121 -= local99;
			local9--;
			local139 -= local99;
			local169 = arg1 - local9;
			local177 = local9 + arg1;
			if (local177 >= Static430.anInt7123 && local169 <= Static181.anInt3543) {
				local185 = Static327.method4554(arg0 + local7, Static184.anInt3600, Static8.anInt223);
				local193 = Static327.method4554(arg0 - local7, Static184.anInt3600, Static8.anInt223);
				if (local220) {
					@Pc(426) int local426 = Static327.method4554(local11 + arg0, Static184.anInt3600, Static8.anInt223);
					@Pc(435) int local435 = Static327.method4554(arg0 - local11, Static184.anInt3600, Static8.anInt223);
					@Pc(442) int[] local442;
					if (Static430.anInt7123 <= local169) {
						local442 = Static280.anIntArrayArray51[local169];
						Static64.method1247(local193, local442, local435, arg5);
						Static64.method1247(local435, local442, local426, arg6);
						Static64.method1247(local426, local442, local185, arg5);
					}
					if (local177 <= Static181.anInt3543) {
						local442 = Static280.anIntArrayArray51[local177];
						Static64.method1247(local193, local442, local435, arg5);
						Static64.method1247(local435, local442, local426, arg6);
						Static64.method1247(local426, local442, local185, arg5);
					}
				} else {
					if (Static430.anInt7123 <= local169) {
						Static64.method1247(local193, Static280.anIntArrayArray51[local169], local185, arg5);
					}
					if (local177 <= Static181.anInt3543) {
						Static64.method1247(local193, Static280.anIntArrayArray51[local177], local185, arg5);
					}
				}
			}
		}
	}
}
