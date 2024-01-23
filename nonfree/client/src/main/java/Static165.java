import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "Lclient!uj;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray111 = new boolean[100];

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!he;")
	public static Class44 aClass44_44 = new Class44();

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "[B")
	public static byte[] aByteArray47 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	public static int anInt3815 = 0;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	public static int anInt3817 = 2;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg5;
		@Pc(20) int local20 = arg0 * arg0;
		@Pc(25) int local25 = arg0 - arg5;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local25 * local25;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local37 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = arg4 << 1;
		@Pc(57) int local57 = local20 << 1;
		@Pc(61) int local61 = local16 << 1;
		@Pc(70) int local70 = local41 + (1 - local53) * local20;
		@Pc(78) int local78 = local37 - (local61 - 1) * local49;
		@Pc(87) int local87 = (1 - local61) * local33 + local45;
		@Pc(95) int local95 = local29 - local57 * (local53 - 1);
		@Pc(99) int local99 = local20 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = local57 * (local53 - 3);
		@Pc(125) int local125 = local45 * 3;
		@Pc(127) int local127 = local103;
		@Pc(133) int local133 = (local16 - 1) * local107;
		@Pc(139) int local139 = (arg4 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local49 * (local61 - 3);
		@Pc(151) int[] local151 = Static183.anIntArrayArray40[arg6];
		Static221.method3893(arg2, arg1 - arg0, local151, arg1 - local25);
		Static221.method3893(arg3, arg1 - local25, local151, arg1 + local25);
		Static221.method3893(arg2, local25 + arg1, local151, arg1 + arg0);
		while (local9 > 0) {
			if (local70 < 0) {
				while (local70 < 0) {
					local95 += local127;
					local70 += local115;
					local7++;
					local115 += local103;
					local127 += local103;
				}
			}
			if (local95 < 0) {
				local70 += local115;
				local115 += local103;
				local95 += local127;
				local7++;
				local127 += local103;
			}
			local70 += -local139;
			local139 -= local99;
			local95 += -local121;
			@Pc(256) boolean local256 = local16 >= local9;
			local121 -= local99;
			local9--;
			@Pc(265) int local265 = local9 + arg6;
			if (local256) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local125;
						local78 += local141;
						local125 += local111;
						local141 += local111;
						local11++;
					}
				}
				if (local78 < 0) {
					local78 += local141;
					local141 += local111;
					local87 += local125;
					local125 += local111;
					local11++;
				}
				local87 += -local133;
				local78 += -local147;
				local133 -= local107;
				local147 -= local107;
			}
			@Pc(337) int local337 = arg6 - local9;
			@Pc(342) int local342 = arg1 + local7;
			@Pc(346) int local346 = arg1 - local7;
			if (local256) {
				@Pc(352) int local352 = arg1 - local11;
				Static221.method3893(arg2, local346, Static183.anIntArrayArray40[local337], local352);
				@Pc(365) int local365 = arg1 + local11;
				Static221.method3893(arg3, local352, Static183.anIntArrayArray40[local337], local365);
				Static221.method3893(arg2, local365, Static183.anIntArrayArray40[local337], local342);
				Static221.method3893(arg2, local346, Static183.anIntArrayArray40[local265], local352);
				Static221.method3893(arg3, local352, Static183.anIntArrayArray40[local265], local365);
				Static221.method3893(arg2, local365, Static183.anIntArrayArray40[local265], local342);
			} else {
				Static221.method3893(arg2, local346, Static183.anIntArrayArray40[local337], local342);
				Static221.method3893(arg2, local346, Static183.anIntArrayArray40[local265], local342);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2999(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		@Pc(20) int local20 = local4.method2122();
		@Pc(24) int local24 = local4.method2133();
		if (local24 < 0 || Static225.anInt4888 != 0 && Static225.anInt4888 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(95) byte[] local95 = new byte[local24];
			local4.method2118(local24, local95);
			return local95;
		} else {
			@Pc(48) int local48 = local4.method2133();
			if (local48 < 0 || Static225.anInt4888 != 0 && local48 > Static225.anInt4888) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local48];
			if (local20 == 1) {
				Static191.method3504(local72, local48, arg0, local24);
			} else {
				Static120.aClass97_1.method3563(local4, local72);
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method3000() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static34.anInt575];
		for (@Pc(12) int local12 = 0; local12 < Static34.anInt575; local12++) {
			@Pc(18) Class2_Sub3_Sub23 local18 = Static32.method3209(local12);
			if (local18.anInt3527 >= 0 || local18.anInt3487 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static82.anIntArray294 = new int[local7];
		for (@Pc(42) int local42 = 0; local42 < local7; local42++) {
			Static82.anIntArray294[local42] = local10[local42];
		}
	}
}
