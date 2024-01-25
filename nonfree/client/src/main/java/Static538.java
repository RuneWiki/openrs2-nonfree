import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lclient!cba;")
	public static Class33 aClass33_45;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_84 = new Class99(32);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!cea;I)Lclient!gfa;")
	public static Class114_Sub2 method9144(@OriginalArg(0) Class2_Sub11 arg0) {
		return new Class114_Sub2(arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8368(), arg0.method8347(), arg0.method8347(), arg0.method8383());
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method9146() {
		@Pc(5) int local5 = 0;
		if (Static74.aClass2_Sub13_5.aClass14_Sub8_1.method3544() == 1) {
			local5 = 55;
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2491() == 0) {
			local5 |= 0x40;
		}
		Static286.method5198(local5);
		Static27.aClass342_3.method8538(local5);
		Static635.aClass336_2.method8426(local5);
		Static462.aClass355_2.method8738(local5);
		Static459.aClass62_2.method2248(local5);
		Static17.method367(local5);
		Static581.method8641(local5);
		Static288.method5231(local5);
		Static345.method5918(local5);
		Static269.method4952();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method9149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(20) int local20 = arg3 - arg6;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(86) int local86 = (1 - local60) * local32 + local48;
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = (local60 - 3) * local52;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg3 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local20 - 1);
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (Static380.anInt7421 <= arg2 && Static237.anInt5159 >= arg2) {
			@Pc(161) int[] local161 = Static208.anIntArrayArray20[arg2];
			local170 = Static317.method5515(Static38.anInt823, arg1 - arg0, Static161.anInt7734);
			local178 = Static317.method5515(Static38.anInt823, arg0 + arg1, Static161.anInt7734);
			local189 = Static317.method5515(Static38.anInt823, arg1 - local16, Static161.anInt7734);
			local197 = Static317.method5515(Static38.anInt823, arg1 + local16, Static161.anInt7734);
			Static280.method5108(local189, local161, local170, arg5);
			Static280.method5108(local197, local161, local189, arg4);
			Static280.method5108(local178, local161, local197, arg5);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local20 >= local9;
			if (local224) {
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
					local141 += local111;
					local125 += local111;
					local11++;
				}
				local86 += -local147;
				local95 += -local131;
				local147 -= local107;
				local131 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local78 += local133;
					local7++;
					local133 += local103;
					local115 += local103;
				}
			}
			if (local78 < 0) {
				local78 += local133;
				local69 += local115;
				local115 += local103;
				local7++;
				local133 += local103;
			}
			local69 += -local139;
			local78 += -local121;
			local9--;
			local121 -= local99;
			local139 -= local99;
			local170 = arg2 - local9;
			local178 = local9 + arg2;
			if (Static380.anInt7421 <= local178 && local170 <= Static237.anInt5159) {
				local189 = Static317.method5515(Static38.anInt823, local7 + arg1, Static161.anInt7734);
				local197 = Static317.method5515(Static38.anInt823, arg1 - local7, Static161.anInt7734);
				if (local224) {
					@Pc(440) int local440 = Static317.method5515(Static38.anInt823, arg1 + local11, Static161.anInt7734);
					@Pc(449) int local449 = Static317.method5515(Static38.anInt823, arg1 - local11, Static161.anInt7734);
					@Pc(460) int[] local460;
					if (local170 >= Static380.anInt7421) {
						local460 = Static208.anIntArrayArray20[local170];
						Static280.method5108(local449, local460, local197, arg5);
						Static280.method5108(local440, local460, local449, arg4);
						Static280.method5108(local189, local460, local440, arg5);
					}
					if (Static237.anInt5159 >= local178) {
						local460 = Static208.anIntArrayArray20[local178];
						Static280.method5108(local449, local460, local197, arg5);
						Static280.method5108(local440, local460, local449, arg4);
						Static280.method5108(local189, local460, local440, arg5);
					}
				} else {
					if (Static380.anInt7421 <= local170) {
						Static280.method5108(local189, Static208.anIntArrayArray20[local170], local197, arg5);
					}
					if (local178 <= Static237.anInt5159) {
						Static280.method5108(local189, Static208.anIntArrayArray20[local178], local197, arg5);
					}
				}
			}
		}
	}
}
