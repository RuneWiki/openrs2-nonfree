import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
	public static int anInt5734;

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
	public static int anInt5740;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_92 = new Class217(62, 8);

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "J")
	public static volatile long aLong174 = 0L;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg1;
		@Pc(20) int local20 = arg2 - arg1;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(33) int local33 = arg2 * arg2;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local24 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg2 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(73) int local73 = local45 + local24 * (1 - local61);
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(92) int local92 = (1 - local65) * local37 + local53;
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(104) int local104 = local24 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = (local61 - 3) * local49;
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg2 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local20 - 1) * local112;
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(204) int local204;
		if (arg5 >= Static341.anInt5789 && arg5 <= Static309.anInt5495) {
			@Pc(170) int[] local170 = Static262.anIntArrayArray31[arg5];
			local179 = Static108.method1849(Static452.anInt7626, arg6 - arg0, Static82.anInt3956);
			local187 = Static108.method1849(Static452.anInt7626, arg0 + arg6, Static82.anInt3956);
			local196 = Static108.method1849(Static452.anInt7626, arg6 - local16, Static82.anInt3956);
			local204 = Static108.method1849(Static452.anInt7626, local16 + arg6, Static82.anInt3956);
			Static412.method5293(local170, arg4, local179, local196);
			Static412.method5293(local170, arg3, local196, local204);
			Static412.method5293(local170, arg4, local204, local187);
		}
		while (local9 > 0) {
			@Pc(239) boolean local239 = local9 <= local20;
			if (local73 < 0) {
				while (local73 < 0) {
					local82 += local138;
					local73 += local120;
					local120 += local108;
					local138 += local108;
					local7++;
				}
			}
			if (local239) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local130;
						local100 += local146;
						local130 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local100 < 0) {
					local92 += local130;
					local100 += local146;
					local11++;
					local130 += local116;
					local146 += local116;
				}
				local100 += -local136;
				local92 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local82 < 0) {
				local82 += local138;
				local73 += local120;
				local138 += local108;
				local120 += local108;
				local7++;
			}
			local73 += -local144;
			local82 += -local126;
			local126 -= local104;
			local144 -= local104;
			local9--;
			local179 = arg5 - local9;
			local187 = local9 + arg5;
			if (Static341.anInt5789 <= local187 && local179 <= Static309.anInt5495) {
				local196 = Static108.method1849(Static452.anInt7626, local7 + arg6, Static82.anInt3956);
				local204 = Static108.method1849(Static452.anInt7626, arg6 - local7, Static82.anInt3956);
				if (local239) {
					@Pc(420) int local420 = Static108.method1849(Static452.anInt7626, local11 + arg6, Static82.anInt3956);
					@Pc(428) int local428 = Static108.method1849(Static452.anInt7626, arg6 - local11, Static82.anInt3956);
					@Pc(439) int[] local439;
					if (local179 >= Static341.anInt5789) {
						local439 = Static262.anIntArrayArray31[local179];
						Static412.method5293(local439, arg4, local204, local428);
						Static412.method5293(local439, arg3, local428, local420);
						Static412.method5293(local439, arg4, local420, local196);
					}
					if (local187 <= Static309.anInt5495) {
						local439 = Static262.anIntArrayArray31[local187];
						Static412.method5293(local439, arg4, local204, local428);
						Static412.method5293(local439, arg3, local428, local420);
						Static412.method5293(local439, arg4, local420, local196);
					}
				} else {
					if (local179 >= Static341.anInt5789) {
						Static412.method5293(Static262.anIntArrayArray31[local179], arg4, local204, local196);
					}
					if (Static309.anInt5495 >= local187) {
						Static412.method5293(Static262.anIntArrayArray31[local187], arg4, local204, local196);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(Z)V")
	public static void method4485() {
		Static178.aClass156ArrayArray2 = new Class156[Static369.aClass32_79.method809()][];
		Static111.aClass156ArrayArray1 = new Class156[Static369.aClass32_79.method809()][];
		Static414.aBooleanArray22 = new boolean[Static369.aClass32_79.method809()];
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(BI)V")
	public static void method4486(@OriginalArg(1) int arg0) {
		Static77.anInt1943 = arg0;
		Static225.aClass126_26.method3135();
	}
}
