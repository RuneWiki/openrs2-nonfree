import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIBII)V")
	public static void method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(21) int local21 = arg4 - arg6;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg4 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(78) int local78 = local41 + (1 - local65) * local25;
		@Pc(86) int local86 = local29 - (local65 - 1) * local45;
		@Pc(95) int local95 = local33 * (1 - local69) + local49;
		@Pc(104) int local104 = local37 - local61 * (local69 - 1);
		@Pc(108) int local108 = local25 << 2;
		@Pc(112) int local112 = local29 << 2;
		@Pc(116) int local116 = local33 << 2;
		@Pc(120) int local120 = local37 << 2;
		@Pc(124) int local124 = local41 * 3;
		@Pc(130) int local130 = (local65 - 3) * local45;
		@Pc(134) int local134 = local49 * 3;
		@Pc(140) int local140 = (local69 - 3) * local61;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg4 - 1);
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = local116 * (local21 - 1);
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg1 >= Static317.anInt5793 && Static69.anInt1551 >= arg1) {
			@Pc(170) int[] local170 = Static152.anIntArrayArray30[arg1];
			local178 = Static86.method1459(Static121.anInt6758, arg5 - arg0, Static179.anInt3768);
			local186 = Static86.method1459(Static121.anInt6758, arg0 + arg5, Static179.anInt3768);
			local195 = Static86.method1459(Static121.anInt6758, arg5 - local16, Static179.anInt3768);
			local203 = Static86.method1459(Static121.anInt6758, local16 + arg5, Static179.anInt3768);
			Static307.method5019(local170, local195, arg2, local178);
			Static307.method5019(local170, local203, arg3, local195);
			Static307.method5019(local170, local186, arg2, local203);
		}
		while (local9 > 0) {
			@Pc(234) boolean local234 = local21 >= local9;
			if (local234) {
				if (local95 < 0) {
					while (local95 < 0) {
						local104 += local150;
						local95 += local134;
						local134 += local120;
						local150 += local120;
						local11++;
					}
				}
				if (local104 < 0) {
					local104 += local150;
					local95 += local134;
					local134 += local120;
					local11++;
					local150 += local120;
				}
				local104 += -local140;
				local95 += -local156;
				local140 -= local116;
				local156 -= local116;
			}
			if (local78 < 0) {
				while (local78 < 0) {
					local78 += local124;
					local86 += local142;
					local7++;
					local142 += local112;
					local124 += local112;
				}
			}
			if (local86 < 0) {
				local78 += local124;
				local86 += local142;
				local124 += local112;
				local7++;
				local142 += local112;
			}
			local78 += -local148;
			local86 += -local130;
			local130 -= local108;
			local148 -= local108;
			local9--;
			local178 = arg1 - local9;
			local186 = local9 + arg1;
			if (local186 >= Static317.anInt5793 && Static69.anInt1551 >= local178) {
				local195 = Static86.method1459(Static121.anInt6758, local7 + arg5, Static179.anInt3768);
				local203 = Static86.method1459(Static121.anInt6758, arg5 - local7, Static179.anInt3768);
				if (local234) {
					@Pc(416) int local416 = Static86.method1459(Static121.anInt6758, local11 + arg5, Static179.anInt3768);
					@Pc(425) int local425 = Static86.method1459(Static121.anInt6758, arg5 - local11, Static179.anInt3768);
					@Pc(432) int[] local432;
					if (Static317.anInt5793 <= local178) {
						local432 = Static152.anIntArrayArray30[local178];
						Static307.method5019(local432, local425, arg2, local203);
						Static307.method5019(local432, local416, arg3, local425);
						Static307.method5019(local432, local195, arg2, local416);
					}
					if (Static69.anInt1551 >= local186) {
						local432 = Static152.anIntArrayArray30[local186];
						Static307.method5019(local432, local425, arg2, local203);
						Static307.method5019(local432, local416, arg3, local425);
						Static307.method5019(local432, local195, arg2, local416);
					}
				} else {
					if (local178 >= Static317.anInt5793) {
						Static307.method5019(Static152.anIntArrayArray30[local178], local195, arg2, local203);
					}
					if (Static69.anInt1551 >= local186) {
						Static307.method5019(Static152.anIntArrayArray30[local186], local195, arg2, local203);
					}
				}
			}
		}
	}
}
