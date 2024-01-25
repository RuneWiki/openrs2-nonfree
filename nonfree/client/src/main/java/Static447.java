import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static int anInt7906;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)Z")
	public static boolean method6625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method6626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg6 - arg5;
		@Pc(29) int local29 = arg1 - arg5;
		@Pc(33) int local33 = arg6 * arg6;
		@Pc(37) int local37 = arg1 * arg1;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local29 * local29;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = local45 << 1;
		@Pc(61) int local61 = local41 << 1;
		@Pc(65) int local65 = arg1 << 1;
		@Pc(69) int local69 = local29 << 1;
		@Pc(77) int local77 = local49 + local33 * (1 - local65);
		@Pc(85) int local85 = local37 - local53 * (local65 - 1);
		@Pc(94) int local94 = local57 + local41 * (1 - local69);
		@Pc(103) int local103 = local45 - (local69 - 1) * local61;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 << 2;
		@Pc(119) int local119 = local45 << 2;
		@Pc(123) int local123 = local49 * 3;
		@Pc(129) int local129 = local53 * (local65 - 3);
		@Pc(133) int local133 = local57 * 3;
		@Pc(139) int local139 = (local69 - 3) * local61;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg1 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local29 - 1) * local115;
		@Pc(178) int local178;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(204) int local204;
		if (Static570.anInt9385 <= arg0 && Static177.anInt3963 >= arg0) {
			@Pc(169) int[] local169 = Static618.anIntArrayArray101[arg0];
			local178 = Static108.method1816(Static252.anInt4988, arg2 - arg6, Static306.anInt5020);
			local187 = Static108.method1816(Static252.anInt4988, arg2 + arg6, Static306.anInt5020);
			local196 = Static108.method1816(Static252.anInt4988, arg2 - local25, Static306.anInt5020);
			local204 = Static108.method1816(Static252.anInt4988, local25 + arg2, Static306.anInt5020);
			Static259.method4236(local178, local196, arg3, local169);
			Static259.method4236(local196, local204, arg4, local169);
			Static259.method4236(local204, local187, arg3, local169);
		}
		while (local9 > 0) {
			@Pc(235) boolean local235 = local9 <= local29;
			if (local235) {
				if (local94 < 0) {
					while (local94 < 0) {
						local103 += local149;
						local94 += local133;
						local21++;
						local149 += local119;
						local133 += local119;
					}
				}
				if (local103 < 0) {
					local103 += local149;
					local94 += local133;
					local149 += local119;
					local21++;
					local133 += local119;
				}
				local94 += -local155;
				local103 += -local139;
				local155 -= local115;
				local139 -= local115;
			}
			if (local77 < 0) {
				while (local77 < 0) {
					local85 += local141;
					local77 += local123;
					local123 += local111;
					local141 += local111;
					local7++;
				}
			}
			if (local85 < 0) {
				local85 += local141;
				local77 += local123;
				local7++;
				local141 += local111;
				local123 += local111;
			}
			local77 += -local147;
			local85 += -local129;
			local129 -= local107;
			local147 -= local107;
			local9--;
			local178 = arg0 - local9;
			local187 = local9 + arg0;
			if (local187 >= Static570.anInt9385 && Static177.anInt3963 >= local178) {
				local196 = Static108.method1816(Static252.anInt4988, local7 + arg2, Static306.anInt5020);
				local204 = Static108.method1816(Static252.anInt4988, arg2 - local7, Static306.anInt5020);
				if (local235) {
					@Pc(430) int local430 = Static108.method1816(Static252.anInt4988, arg2 + local21, Static306.anInt5020);
					@Pc(439) int local439 = Static108.method1816(Static252.anInt4988, arg2 - local21, Static306.anInt5020);
					@Pc(446) int[] local446;
					if (local178 >= Static570.anInt9385) {
						local446 = Static618.anIntArrayArray101[local178];
						Static259.method4236(local204, local439, arg3, local446);
						Static259.method4236(local439, local430, arg4, local446);
						Static259.method4236(local430, local196, arg3, local446);
					}
					if (local187 <= Static177.anInt3963) {
						local446 = Static618.anIntArrayArray101[local187];
						Static259.method4236(local204, local439, arg3, local446);
						Static259.method4236(local439, local430, arg4, local446);
						Static259.method4236(local430, local196, arg3, local446);
					}
				} else {
					if (Static570.anInt9385 <= local178) {
						Static259.method4236(local204, local196, arg3, Static618.anIntArrayArray101[local178]);
					}
					if (Static177.anInt3963 >= local187) {
						Static259.method4236(local204, local196, arg3, Static618.anIntArrayArray101[local187]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method6627() {
		Static267.aClass233_36.method5665();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZIII)V")
	public static void method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810() != 0 && arg1 != 0 && Static74.anInt1598 < 50 && arg3 != -1) {
			Static492.aClass208Array1[Static74.anInt1598++] = new Class208((byte) 1, arg3, arg1, arg4, arg2, 0, arg0, null);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z")
	public static boolean method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static556.method7709(arg1, arg0) || Static370.method5584(arg0, arg1) || Static161.method3020(arg1, arg0);
	}
}
