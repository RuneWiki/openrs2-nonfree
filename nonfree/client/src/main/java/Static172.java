import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "Lclient!bu;")
	public static Class32 aClass32_45;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Lclient!qj;")
	public static Class204 aClass204_5;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public static final int anInt3432 = 1407;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_108 = new Class189("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
	public static int anInt3456 = 20;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
	public static void method2768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static291.method4104(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(47) int[] local47 = Static262.anIntArrayArray31[arg2];
		@Pc(52) int local52 = arg3 - local15;
		@Pc(56) int local56 = arg3 + local15;
		Static412.method5293(local47, arg1, arg3 - arg5, local52);
		Static412.method5293(local47, arg0, local52, local56);
		Static412.method5293(local47, arg1, local56, arg5 + arg3);
		while (local10 < local21) {
			local43 += 2;
			local41 += 2;
			local29 += local43;
			local24 += local41;
			if (local29 >= 0 && local26 >= 1) {
				Static171.anIntArray223[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(132) int[] local132;
			@Pc(139) int[] local139;
			@Pc(143) int local143;
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 < local15) {
					local132 = Static262.anIntArrayArray31[local21 + arg2];
					local139 = Static262.anIntArrayArray31[arg2 - local21];
					local143 = Static171.anIntArray223[local21];
					local147 = arg3 + local10;
					local152 = arg3 - local10;
					local156 = arg3 + local143;
					local161 = arg3 - local143;
					Static412.method5293(local132, arg1, local152, local161);
					Static412.method5293(local132, arg0, local161, local156);
					Static412.method5293(local132, arg1, local156, local147);
					Static412.method5293(local139, arg1, local152, local161);
					Static412.method5293(local139, arg0, local161, local156);
					Static412.method5293(local139, arg1, local156, local147);
				} else {
					local132 = Static262.anIntArrayArray31[local21 + arg2];
					local139 = Static262.anIntArrayArray31[arg2 - local21];
					local143 = local10 + arg3;
					local147 = arg3 - local10;
					Static412.method5293(local132, arg1, local147, local143);
					Static412.method5293(local139, arg1, local147, local143);
				}
			}
			local132 = Static262.anIntArrayArray31[arg2 + local10];
			local139 = Static262.anIntArrayArray31[arg2 - local10];
			local143 = local21 + arg3;
			local147 = arg3 - local21;
			if (local10 >= local15) {
				Static412.method5293(local132, arg1, local147, local143);
				Static412.method5293(local139, arg1, local147, local143);
			} else {
				local152 = local26 < local10 ? Static171.anIntArray223[local10] : local26;
				local156 = arg3 + local152;
				local161 = arg3 - local152;
				Static412.method5293(local132, arg1, local147, local161);
				Static412.method5293(local132, arg0, local161, local156);
				Static412.method5293(local132, arg1, local156, local143);
				Static412.method5293(local139, arg1, local147, local161);
				Static412.method5293(local139, arg0, local161, local156);
				Static412.method5293(local139, arg1, local156, local143);
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!jq;IILclient!gj;Lclient!qa;)Z")
	public static boolean method2770(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(4) Class90 arg1, @OriginalArg(5) Class172 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray162 != null) {
			local9 = Static144.anInt5412 + (arg1.anInt2710 + arg0.anInt3895 - Static144.anInt5415) * (Static144.anInt5413 - Static144.anInt5412) / (Static144.anInt5418 - Static144.anInt5415);
			local11 = Static144.anInt5417 - (arg0.anInt3891 + arg1.anInt2712 - Static144.anInt5416) * (-Static144.anInt5414 + Static144.anInt5417) / (Static144.anInt5419 - Static144.anInt5416);
			local13 = Static144.anInt5417 - (arg0.anInt3891 + arg1.anInt2726 - Static144.anInt5416) * (Static144.anInt5417 - Static144.anInt5414) / (Static144.anInt5419 - Static144.anInt5416);
			local7 = (Static144.anInt5413 - Static144.anInt5412) * (arg0.anInt3895 + arg1.anInt2705 - Static144.anInt5415) / (Static144.anInt5418 - Static144.anInt5415) + Static144.anInt5412;
		}
		@Pc(100) Class8 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg1.anInt2704 != -1) {
			if (arg0.aBoolean335 && arg1.anInt2708 != -1) {
				local100 = arg1.method2033(arg2, true);
			} else {
				local100 = arg1.method2033(arg2, false);
			}
			if (local100 != null) {
				local102 = arg0.anInt3893 - (local100.ja() + 1 >> 1);
				if (local102 < local7) {
					local7 = local102;
				}
				local104 = arg0.anInt3893 + (local100.ja() + 1 >> 1);
				local106 = arg0.anInt3890 - (local100.JA() + 1 >> 1);
				if (local104 > local9) {
					local9 = local104;
				}
				if (local11 > local106) {
					local11 = local106;
				}
				local108 = arg0.anInt3890 + (local100.JA() + 1 >> 1);
				if (local13 < local108) {
					local13 = local108;
				}
			}
		}
		@Pc(226) Class204 local226 = null;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(238) int local238 = 0;
		@Pc(240) int local240 = 0;
		@Pc(290) int local290;
		@Pc(317) int local317;
		if (arg1.aString18 != null) {
			local226 = Static334.method4489(arg1.anInt2702);
			if (local226 != null) {
				local228 = Static309.aClass70_28.method1757(Static143.aStringArray14, null, arg1.aString18, null);
				local230 = arg0.anInt3890;
				if (local100 == null) {
					local230 -= local228 * local226.method4414() / 2;
				} else {
					local230 -= (local100.JA() >> 1) + (local228 * local226.method4418());
				}
				for (local290 = 0; local290 < local228; local290++) {
					@Pc(296) String local296 = Static143.aStringArray14[local290];
					if (local290 < local228 - 1) {
						local296 = local296.substring(0, local296.length() - 4);
					}
					local317 = local226.method4416(local296);
					if (local317 > local232) {
						local232 = local317;
					}
				}
				local234 = arg0.anInt3893 - local232 / 2;
				if (local234 < local7) {
					local7 = local234;
				}
				local236 = local232 / 2 + arg0.anInt3893;
				if (local236 > local9) {
					local9 = local236;
				}
				local238 = local230;
				local240 = local226.method4418() * local228 + local230;
				if (local11 > local238) {
					local11 = local238;
				}
				if (local13 < local240) {
					local13 = local240;
				}
			}
		}
		if (Static144.anInt5412 > local9 || local7 > Static144.anInt5413 || Static144.anInt5414 > local13 || local11 > Static144.anInt5417) {
			return true;
		}
		@Pc(427) int local427;
		if (arg1.anIntArray162 != null) {
			@Pc(425) int[] local425 = new int[arg1.anIntArray162.length];
			for (local427 = 0; local427 < local425.length / 2; local427++) {
				local317 = arg1.anIntArray162[local427 * 2] + arg0.anInt3895;
				@Pc(452) int local452 = arg0.anInt3891 + arg1.anIntArray162[local427 * 2 + 1];
				local425[local427 * 2] = (local317 - Static144.anInt5415) * (-Static144.anInt5412 + Static144.anInt5413) / (Static144.anInt5418 - Static144.anInt5415) + Static144.anInt5412;
				local425[local427 * 2 + 1] = Static144.anInt5417 - (Static144.anInt5417 - Static144.anInt5414) * (local452 + -Static144.anInt5416) / (Static144.anInt5419 - Static144.anInt5416);
			}
			Static211.method3252(arg2, local425, arg1.anInt2729);
			for (local317 = 0; local317 < local425.length / 2 - 1; local317++) {
				arg2.method5511(local425[local317 * 2], local425[local317 * 2 + 1], arg1.anInt2706, local425[local317 * 2 + 1 + 2], local425[(local317 + 1) * 2]);
			}
			arg2.method5511(local425[local425.length - 2], local425[local425.length - 1], arg1.anInt2706, local425[1], local425[0]);
		}
		if (local100 != null) {
			if (Static374.anInt6289 > 0 && (Static128.anInt2675 != -1 && Static128.anInt2675 == arg0.anInt3892 || Static233.anInt4469 != -1 && arg1.anInt2698 == Static233.anInt4469)) {
				if (Static238.anInt4569 > 50) {
					local290 = 200 - Static238.anInt4569 * 2;
				} else {
					local290 = Static238.anInt4569 * 2;
				}
				local427 = local290 << 24 | 0xFFFF00;
				arg2.method5493(arg0.anInt3893, local427, arg0.anInt3890, local100.UA() / 2 + 7);
				arg2.method5493(arg0.anInt3893, local427, arg0.anInt3890, local100.UA() / 2 + 5);
				arg2.method5493(arg0.anInt3893, local427, arg0.anInt3890, local100.UA() / 2 + 3);
				arg2.method5493(arg0.anInt3893, local427, arg0.anInt3890, local100.UA() / 2 + 1);
				arg2.method5493(arg0.anInt3893, local427, arg0.anInt3890, local100.UA() / 2);
			}
			local100.method6001(arg0.anInt3893 - (local100.ja() >> 1), arg0.anInt3890 - (local100.JA() >> 1));
		}
		if (arg1.aString18 != null && local226 != null) {
			Static228.method3428(arg0, arg2, local230, local226, arg1, local228, local232);
		}
		if (arg1.anInt2704 != -1 || arg1.aString18 != null) {
			@Pc(735) Class3_Sub16 local735 = new Class3_Sub16(arg0);
			local735.anInt2490 = local236;
			local735.anInt2496 = local102;
			local735.anInt2488 = local240;
			local735.anInt2497 = local238;
			local735.anInt2494 = local234;
			local735.anInt2493 = local106;
			local735.anInt2492 = local104;
			local735.anInt2489 = local108;
			Static132.aClass243_17.method5198(local735);
		}
		return false;
	}
}
