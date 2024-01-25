import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	public static int anInt1530;

	@OriginalMember(owner = "client!cca", name = "u", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
	public static int anInt1531 = 0;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public static void method1392() {
		if (Static317.aClass31_10 != null) {
			Static317.aClass31_10.method8053();
			Static102.aClass63_2 = null;
			Static317.aClass31_10 = null;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)I")
	public static int method1394(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(28) int local28 = (local9 >>> 2 & 0xB3333333) + (local9 & 0x33333333);
		@Pc(37) int local37 = local28 + (local28 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg1;
		@Pc(20) int local20 = arg3 - arg1;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + (1 - local60) * local32;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg3 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local20 - 1);
		@Pc(151) int[] local151 = Static570.anIntArrayArray100[arg5];
		Static504.method6755(arg4, arg2 - local16, local151, arg2 - arg6);
		Static504.method6755(arg0, arg2 + local16, local151, arg2 - local16);
		Static504.method6755(arg4, arg2 + arg6, local151, local16 + arg2);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local20 >= local9;
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local115;
					local77 += local133;
					local133 += local103;
					local7++;
					local115 += local103;
				}
			}
			if (local201) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local141;
						local141 += local111;
						local11++;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local86 += local125;
					local95 += local141;
					local11++;
					local141 += local111;
					local125 += local111;
				}
				local86 += -local147;
				local95 += -local131;
				local131 -= local107;
				local147 -= local107;
			}
			if (local77 < 0) {
				local68 += local115;
				local77 += local133;
				local7++;
				local133 += local103;
				local115 += local103;
			}
			local77 += -local121;
			local68 += -local139;
			local121 -= local99;
			local9--;
			local139 -= local99;
			@Pc(335) int local335 = arg5 - local9;
			@Pc(339) int local339 = local9 + arg5;
			@Pc(344) int local344 = arg2 + local7;
			@Pc(349) int local349 = arg2 - local7;
			if (local201) {
				@Pc(373) int local373 = arg2 + local11;
				@Pc(378) int local378 = arg2 - local11;
				Static504.method6755(arg4, local378, Static570.anIntArrayArray100[local335], local349);
				Static504.method6755(arg0, local373, Static570.anIntArrayArray100[local335], local378);
				Static504.method6755(arg4, local344, Static570.anIntArrayArray100[local335], local373);
				Static504.method6755(arg4, local378, Static570.anIntArrayArray100[local339], local349);
				Static504.method6755(arg0, local373, Static570.anIntArrayArray100[local339], local378);
				Static504.method6755(arg4, local344, Static570.anIntArrayArray100[local339], local373);
			} else {
				Static504.method6755(arg4, local344, Static570.anIntArrayArray100[local335], local349);
				Static504.method6755(arg4, local344, Static570.anIntArrayArray100[local339], local349);
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)V")
	public static void method1396() {
		for (@Pc(11) Class3_Sub13 local11 = (Class3_Sub13) Static260.aClass244_40.method5572(); local11 != null; local11 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			if (Static454.method6260(local11.anInt2364)) {
				Static486.method6590(local11);
			}
		}
		if (Static161.anInt3613 == 1) {
			Static314.method4678();
			return;
		}
		Static587.method1502(Static89.anInt2311, Static240.anInt4751, Static126.anInt2888, Static111.anInt2680);
		@Pc(51) int local51 = Static35.aClass328_1.method7371(Static573.aClass350_28.method7730(Static201.anInt4321));
		for (@Pc(56) Class3_Sub13 local56 = (Class3_Sub13) Static260.aClass244_40.method5572(); local56 != null; local56 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			@Pc(62) int local62 = Static424.method7515(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static240.anInt4751 = local51 + 8;
		Static126.anInt2888 = Static161.anInt3613 * 16 + (Static582.aBoolean697 ? 26 : 22);
	}
}
