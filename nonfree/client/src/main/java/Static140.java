import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	public static int anInt2648;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "Lclient!oh;")
	public static Class150 aClass150_3;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
	public static final int[] anIntArray281 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_40 = new Class244(28, -1);

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "[I")
	public static final int[] anIntArray283 = new int[6];

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
	public static void method2225() {
		for (@Pc(7) int local7 = 0; local7 < Static365.anInt6136; local7++) {
			@Pc(13) int local13 = Static298.anIntArray570[local7];
			@Pc(17) Class28_Sub1_Sub1_Sub1 local17 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local13];
			@Pc(21) int local21 = Static26.aClass3_Sub5_Sub1_2.method2739();
			if ((local21 & 0x2) != 0) {
				local21 += Static26.aClass3_Sub5_Sub1_2.method2739() << 8;
			}
			@Pc(47) int local47;
			@Pc(51) int local51;
			if ((local21 & 0x80) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2750();
				local51 = Static26.aClass3_Sub5_Sub1_2.method2773();
				local17.method4004(Static76.anInt1617, local47, local51);
				local17.anInt4369 = Static76.anInt1617 + 300;
				local17.anInt4360 = Static26.aClass3_Sub5_Sub1_2.method2784();
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt4347 = Static26.aClass3_Sub5_Sub1_2.method2787();
				if (local17.anInt4347 == 65535) {
					local17.anInt4347 = -1;
				}
			}
			if ((local21 & 0x1) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2750();
				local51 = Static26.aClass3_Sub5_Sub1_2.method2773();
				local17.method4004(Static76.anInt1617, local47, local51);
			}
			@Pc(169) int local169;
			if ((local21 & 0x8) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2787();
				local51 = Static26.aClass3_Sub5_Sub1_2.method2726();
				if (local47 == 65535) {
					local47 = -1;
				}
				@Pc(131) boolean local131 = true;
				@Pc(166) Class177 local166;
				if (local47 != -1 && local17.anInt4367 != -1) {
					@Pc(152) Class125 local152;
					if (local17.anInt4367 == local47) {
						local152 = Static224.aClass203_2.method4559(local47);
						if (local152.aBoolean236 && local152.anInt3050 != -1) {
							local166 = Static176.aClass43_2.method930(local152.anInt3050);
							local169 = local166.anInt4500;
							if (local169 == 0) {
								local131 = false;
							} else if (local169 == 1) {
								local131 = true;
							} else if (local169 == 2) {
								local131 = false;
								local17.anInt4315 = 0;
							}
						}
					} else {
						local152 = Static224.aClass203_2.method4559(local47);
						@Pc(208) Class125 local208 = Static224.aClass203_2.method4559(local17.anInt4367);
						if (local152.anInt3050 != -1 && local208.anInt3050 != -1) {
							@Pc(223) Class177 local223 = Static176.aClass43_2.method930(local152.anInt3050);
							@Pc(229) Class177 local229 = Static176.aClass43_2.method930(local208.anInt3050);
							if (local223.anInt4520 < local229.anInt4520) {
								local131 = false;
							}
						}
					}
				}
				if (local131) {
					local17.anInt4329 = (local51 & 0xFFFF) + Static76.anInt1617;
					local17.anInt4351 = 0;
					local17.anInt4341 = 1;
					local17.anInt4367 = local47;
					local17.anInt4331 = local51 >> 16;
					local17.anInt4361 = 0;
					if (local17.anInt4329 > Static76.anInt1617) {
						local17.anInt4351 = -1;
					}
					if (local17.anInt4367 != -1 && Static76.anInt1617 == local17.anInt4329) {
						@Pc(285) int local285 = Static224.aClass203_2.method4559(local17.anInt4367).anInt3050;
						if (local285 != -1) {
							local166 = Static176.aClass43_2.method930(local285);
							if (local166 != null && local166.anIntArray499 != null) {
								Static351.method2911(local17.aByte73, local17.anInt5774, 0, local166, local17.anInt5766, false);
							}
						}
					}
				}
			}
			if ((local21 & 0x20) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2778();
				if (local47 == 65535) {
					local47 = -1;
				}
				local51 = Static26.aClass3_Sub5_Sub1_2.method2784();
				Static57.method1030(local51, local47, local17);
			}
			if ((local21 & 0x400) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2773();
				@Pc(343) int[] local343 = new int[local47];
				@Pc(346) int[] local346 = new int[local47];
				@Pc(349) int[] local349 = new int[local47];
				for (@Pc(351) int local351 = 0; local351 < local47; local351++) {
					local169 = Static26.aClass3_Sub5_Sub1_2.method2787();
					if (local169 == 65535) {
						local169 = -1;
					}
					local343[local351] = local169;
					local346[local351] = Static26.aClass3_Sub5_Sub1_2.method2739();
					local349[local351] = Static26.aClass3_Sub5_Sub1_2.method2747();
				}
				Static88.method1480(local17, local343, local346, local349);
			}
			if ((local21 & 0x4) != 0) {
				if (local17.aClass61_1.method1218()) {
					Static45.method705(local17);
				}
				local17.method2967(Static90.aClass83_2.method1716(Static26.aClass3_Sub5_Sub1_2.method2778()));
				local17.method4011(local17.aClass61_1.anInt1467);
				local17.anInt4345 = local17.aClass61_1.anInt1433 << 3;
				if (local17.aClass61_1.method1218()) {
					Static329.method5022(local17.anIntArray490[0], 0, null, local17.aByte73, local17, local17.anIntArray491[0], null);
				}
			}
			if ((local21 & 0x200) != 0) {
				local47 = Static26.aClass3_Sub5_Sub1_2.method2778();
				local17.anInt4323 = Static26.aClass3_Sub5_Sub1_2.method2773();
				local17.anInt4348 = Static26.aClass3_Sub5_Sub1_2.method2773();
				local17.anInt4330 = local47 & 0x7FFF;
				local17.aBoolean338 = (local47 & 0x8000) != 0;
				local17.anInt4362 = Static76.anInt1617 + local17.anInt4330 + local17.anInt4323;
			}
			if ((local21 & 0x40) != 0) {
				local17.aString49 = Static26.aClass3_Sub5_Sub1_2.method2788();
				local17.anInt4318 = 100;
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt3393 = Static26.aClass3_Sub5_Sub1_2.method2778();
				local17.anInt3383 = Static26.aClass3_Sub5_Sub1_2.method2787();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!oa;IBI)V")
	public static void method2226(@OriginalArg(0) Class28_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt4314 && arg2 != -1) {
			@Pc(90) Class177 local90 = Static176.aClass43_2.method930(arg2);
			@Pc(93) int local93 = local90.anInt4500;
			if (local93 == 1) {
				arg0.anInt4315 = 0;
				arg0.anInt4327 = arg1;
				arg0.anInt4363 = 0;
				arg0.anInt4356 = 0;
				arg0.anInt4317 = 1;
				Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4356, local90, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
			}
			if (local93 == 2) {
				arg0.anInt4315 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4314 == -1 || Static176.aClass43_2.method930(arg2).anInt4520 >= Static176.aClass43_2.method930(arg0.anInt4314).anInt4520) {
			arg0.anInt4314 = arg2;
			arg0.anInt4327 = arg1;
			arg0.anInt4356 = 0;
			arg0.anInt4315 = 0;
			arg0.anInt4375 = arg0.anInt4378;
			arg0.anInt4363 = 0;
			arg0.anInt4317 = 1;
			if (arg0.anInt4314 != -1) {
				Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4356, Static176.aClass43_2.method930(arg0.anInt4314), arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
			}
		}
	}
}
