import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kia", name = "dd", descriptor = "J")
	public static long aLong157;

	@OriginalMember(owner = "client!kia", name = "id", descriptor = "I")
	public static int anInt5470;

	@OriginalMember(owner = "client!kia", name = "md", descriptor = "I")
	public static int anInt5474 = -1;

	@OriginalMember(owner = "client!kia", name = "od", descriptor = "I")
	public static int anInt5476 = 0;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BI)V")
	public static void method4714(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class5 local14 = Static67.aClass335_8.method7768(); local14 != null; local14 = Static67.aClass335_8.method7777()) {
			if ((long) arg0 == (local14.aLong329 >> 48 & 0xFFFFL)) {
				local14.method8829();
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4717(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)Z")
	public static boolean method4720(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class5_Sub2_Sub13 local8 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local8 != null; local8 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
			if (Static152.method2244(local8.anInt6711) && local8.aLong198 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg4;
		@Pc(20) int local20 = arg2 - arg4;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = arg2 * arg2;
		@Pc(36) int local36 = local15 * local15;
		@Pc(40) int local40 = local20 * local20;
		@Pc(44) int local44 = local32 << 1;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local36 << 1;
		@Pc(60) int local60 = arg2 << 1;
		@Pc(64) int local64 = local20 << 1;
		@Pc(72) int local72 = local44 + local28 * (1 - local60);
		@Pc(81) int local81 = local32 - local48 * (local60 - 1);
		@Pc(91) int local91 = (1 - local64) * local36 + local52;
		@Pc(99) int local99 = local40 - local56 * (local64 - 1);
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 << 2;
		@Pc(119) int local119 = local44 * 3;
		@Pc(125) int local125 = (local60 - 3) * local48;
		@Pc(129) int local129 = local52 * 3;
		@Pc(135) int local135 = (local64 - 3) * local56;
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg2 - 1);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(195) int local195;
		if (Static128.anInt2200 <= arg3 && Static380.anInt6585 >= arg3) {
			@Pc(161) int[] local161 = Static286.anIntArrayArray42[arg3];
			local170 = Static439.method6578(arg1 - arg6, Static361.anInt6317, Static651.anInt10267);
			local178 = Static439.method6578(arg6 + arg1, Static361.anInt6317, Static651.anInt10267);
			local186 = Static439.method6578(arg1 - local15, Static361.anInt6317, Static651.anInt10267);
			local195 = Static439.method6578(arg1 + local15, Static361.anInt6317, Static651.anInt10267);
			Static343.method5202(local170, local161, arg5, local186);
			Static343.method5202(local186, local161, arg0, local195);
			Static343.method5202(local195, local161, arg5, local178);
		}
		while (local9 > 0) {
			@Pc(222) boolean local222 = local20 >= local9;
			if (local72 < 0) {
				while (local72 < 0) {
					local81 += local137;
					local72 += local119;
					local137 += local107;
					local119 += local107;
					local7++;
				}
			}
			if (local222) {
				if (local91 < 0) {
					while (local91 < 0) {
						local99 += local145;
						local91 += local129;
						local129 += local115;
						local145 += local115;
						local11++;
					}
				}
				if (local99 < 0) {
					local99 += local145;
					local91 += local129;
					local145 += local115;
					local11++;
					local129 += local115;
				}
				local99 += -local135;
				local91 += -local151;
				local135 -= local111;
				local151 -= local111;
			}
			if (local81 < 0) {
				local72 += local119;
				local81 += local137;
				local137 += local107;
				local119 += local107;
				local7++;
			}
			local81 += -local125;
			local72 += -local143;
			local143 -= local103;
			local125 -= local103;
			local9--;
			local170 = arg3 - local9;
			local178 = local9 + arg3;
			if (Static128.anInt2200 <= local178 && Static380.anInt6585 >= local170) {
				local186 = Static439.method6578(local7 + arg1, Static361.anInt6317, Static651.anInt10267);
				local195 = Static439.method6578(arg1 - local7, Static361.anInt6317, Static651.anInt10267);
				if (local222) {
					@Pc(404) int local404 = Static439.method6578(arg1 + local11, Static361.anInt6317, Static651.anInt10267);
					@Pc(412) int local412 = Static439.method6578(arg1 - local11, Static361.anInt6317, Static651.anInt10267);
					@Pc(423) int[] local423;
					if (local170 >= Static128.anInt2200) {
						local423 = Static286.anIntArrayArray42[local170];
						Static343.method5202(local195, local423, arg5, local412);
						Static343.method5202(local412, local423, arg0, local404);
						Static343.method5202(local404, local423, arg5, local186);
					}
					if (local178 <= Static380.anInt6585) {
						local423 = Static286.anIntArrayArray42[local178];
						Static343.method5202(local195, local423, arg5, local412);
						Static343.method5202(local412, local423, arg0, local404);
						Static343.method5202(local404, local423, arg5, local186);
					}
				} else {
					if (local170 >= Static128.anInt2200) {
						Static343.method5202(local195, Static286.anIntArrayArray42[local170], arg5, local186);
					}
					if (local178 <= Static380.anInt6585) {
						Static343.method5202(local195, Static286.anIntArrayArray42[local178], arg5, local186);
					}
				}
			}
		}
	}
}
