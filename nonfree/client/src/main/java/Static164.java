import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!cs;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt3514;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
	public static final int[] anIntArray231 = new int[1];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!tc;Lclient!oa;II)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) Class305 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class93 local8 = arg1.method7501(arg2);
		if (local8 == null) {
			return;
		}
		arg2.ca(arg3, arg0, arg1.anInt9242 + arg3, arg1.anInt9160 + arg0);
		if (Static327.anInt6815 == 2 || Static327.anInt6815 == 5 || Static417.aClass37_33 == null) {
			arg2.L(-16777216, local8, arg3, arg0);
			return;
		}
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(59) int local59;
		@Pc(50) int local50;
		if (Static267.anInt5668 == 4) {
			local62 = Static531.anInt9619;
			local65 = Static166.anInt3526;
			local50 = 4096;
			local59 = (int) -Static533.aFloat188 & 0x3FFF;
		} else {
			local50 = 4096 - Static66.anInt1706 * 16;
			local59 = (int) -Static533.aFloat188 + Static288.anInt5964 & 0x3FFF;
			local62 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398;
			local65 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
		}
		@Pc(91) int local91 = local62 / 128 + 208 + 48 - Static460.anInt8640 * 2;
		@Pc(109) int local109 = Static292.anInt7682 * 4 + 48 - local65 / 128 - (Static292.anInt7682 - 104) * 2;
		Static417.aClass37_33.method7079((float) arg3 + (float) arg1.anInt9242 / 2.0F, (float) arg0 + (float) arg1.anInt9160 / 2.0F, (float) local91, (float) local109, local50, local59 << 2, local8, arg3, arg0);
		@Pc(158) int local158;
		@Pc(168) int local168;
		@Pc(178) int local178;
		@Pc(189) int local189;
		for (@Pc(143) Class3_Sub48 local143 = (Class3_Sub48) Static240.aClass183_28.method4795(); local143 != null; local143 = (Class3_Sub48) Static240.aClass183_28.method4793()) {
			@Pc(147) int local147 = local143.anInt9989;
			local158 = (Static356.aClass238_3.anIntArray465[local147] >> 14 & 0x3FFF) - Static230.anInt4667;
			local168 = (Static356.aClass238_3.anIntArray465[local147] & 0x3FFF) - Static563.anInt10006;
			local178 = local158 * 4 + 2 - local62 / 128;
			local189 = local168 * 4 + 2 - local65 / 128;
			Static323.method5611(local178, arg0, arg1, local189, arg2, Static356.aClass238_3.anIntArray464[local147], arg3, local8);
		}
		for (local158 = 0; local158 < Static569.anInt10058; local158++) {
			local168 = Static276.anIntArray355[local158] * 4 + 2 - local62 / 128;
			local178 = Static237.anIntArray302[local158] * 4 + 2 - local65 / 128;
			@Pc(248) Class292 local248 = Static253.aClass146_2.method3356(Static21.anIntArray19[local158]);
			if (local248.anIntArray571 != null) {
				local248 = local248.method7198(Static588.aClass322_1);
				if (local248 == null || local248.anInt8788 == -1) {
					continue;
				}
			}
			Static323.method5611(local168, arg0, arg1, local178, arg2, local248.anInt8788, arg3, local8);
		}
		@Pc(329) int local329;
		@Pc(340) int local340;
		for (@Pc(283) Class3_Sub30 local283 = (Class3_Sub30) Static30.aClass25_5.method949(); local283 != null; local283 = (Class3_Sub30) Static30.aClass25_5.method947()) {
			local178 = (int) (local283.aLong262 >> 28 & 0x3L);
			if (local178 == Static55.anInt1301) {
				local189 = (int) (local283.aLong262 & 0x3FFFL) - Static230.anInt4667;
				@Pc(318) int local318 = (int) (local283.aLong262 >> 14 & 0x3FFFL) - Static563.anInt10006;
				local329 = local189 * 4 + 2 - local62 / 128;
				local340 = local318 * 4 + 2 - local65 / 128;
				Static353.method5872(Static394.aClass37Array8[0], arg0, local8, local340, arg1, local329, arg3);
			}
		}
		@Pc(428) int local428;
		for (local178 = 0; local178 < Static268.anInt5680; local178++) {
			@Pc(372) Class3_Sub46 local372 = (Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local178]);
			if (local372 != null) {
				@Pc(377) Class2_Sub2_Sub1_Sub2 local377 = local372.aClass2_Sub2_Sub1_Sub2_2;
				if (local377.method6321() && local377.aByte103 == Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103) {
					@Pc(389) Class169 local389 = local377.aClass169_1;
					if (local389 != null && local389.anIntArray306 != null) {
						local389 = local389.method4177(Static588.aClass322_1);
					}
					if (local389 != null && local389.aBoolean420 && local389.aBoolean416) {
						local340 = local377.anInt9398 / 128 - local62 / 128;
						local428 = local377.anInt9396 / 128 - local65 / 128;
						if (local389.anInt4991 == -1) {
							Static353.method5872(Static394.aClass37Array8[1], arg0, local8, local428, arg1, local340, arg3);
						} else {
							Static323.method5611(local340, arg0, arg1, local428, arg2, local389.anInt4991, arg3, local8);
						}
					}
				}
			}
		}
		local189 = Static455.anInt8611;
		@Pc(468) int[] local468 = Static492.anIntArray589;
		@Pc(515) int local515;
		@Pc(519) int local519;
		@Pc(542) int local542;
		for (local329 = 0; local329 < local189; local329++) {
			@Pc(477) Class2_Sub2_Sub1_Sub1 local477 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local468[local329]];
			if (local477 != null && local477.method2040() && Static443.aClass2_Sub2_Sub1_Sub1_2 != local477 && local477.aByte103 == Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103) {
				local428 = local477.anInt9398 / 128 - local62 / 128;
				local515 = local477.anInt9396 / 128 - local65 / 128;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static346.anInt7032; local519++) {
					if (local477.aString23.equals(Static520.aStringArray34[local519]) && Static585.anIntArray666[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(540) boolean local540 = false;
				for (local542 = 0; local542 < Static447.anInt8540; local542++) {
					if (local477.aString23.equals(Static535.aClass34Array1[local542].aString9)) {
						local540 = true;
						break;
					}
				}
				@Pc(560) boolean local560 = false;
				if (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2199 != 0 && local477.anInt2199 != 0 && Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2199 == local477.anInt2199) {
					local560 = true;
				}
				if (local477.aBoolean171) {
					Static353.method5872(Static394.aClass37Array8[6], arg0, local8, local515, arg1, local428, arg3);
				} else if (local517) {
					Static353.method5872(Static394.aClass37Array8[3], arg0, local8, local515, arg1, local428, arg3);
				} else if (local540) {
					Static353.method5872(Static394.aClass37Array8[5], arg0, local8, local515, arg1, local428, arg3);
				} else if (local560) {
					Static353.method5872(Static394.aClass37Array8[4], arg0, local8, local515, arg1, local428, arg3);
				} else {
					Static353.method5872(Static394.aClass37Array8[2], arg0, local8, local515, arg1, local428, arg3);
				}
			}
		}
		@Pc(653) Class357[] local653 = Static516.aClass357Array3;
		@Pc(741) int local741;
		for (local428 = 0; local428 < local653.length; local428++) {
			@Pc(660) Class357 local660 = local653[local428];
			if (local660 != null && local660.anInt10299 != 0 && Static129.anInt10429 % 20 < 10) {
				@Pc(703) int local703;
				if (local660.anInt10299 == 1) {
					@Pc(689) Class3_Sub46 local689 = (Class3_Sub46) Static331.aClass25_25.method946((long) local660.anInt10302);
					if (local689 != null) {
						@Pc(694) Class2_Sub2_Sub1_Sub2 local694 = local689.aClass2_Sub2_Sub1_Sub2_2;
						local703 = local694.anInt9398 / 128 - local62 / 128;
						local542 = local694.anInt9396 / 128 - local65 / 128;
						Static292.method6327(local660.anInt10304, 360000L, arg3, local542, arg0, local703, arg1, local8);
					}
				}
				if (local660.anInt10299 == 2) {
					local741 = local660.anInt10300 / 128 - local62 / 128;
					local519 = local660.anInt10303 / 128 - local65 / 128;
					@Pc(757) long local757 = (long) (local660.anInt10305 << 7);
					@Pc(761) long local761 = local757 * local757;
					Static292.method6327(local660.anInt10304, local761, arg3, local519, arg0, local741, arg1, local8);
				}
				if (local660.anInt10299 == 10 && local660.anInt10302 >= 0 && local660.anInt10302 < Static378.aClass2_Sub2_Sub1_Sub1Array10.length) {
					@Pc(796) Class2_Sub2_Sub1_Sub1 local796 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local660.anInt10302];
					if (local796 != null) {
						local519 = local796.anInt9398 / 128 - local62 / 128;
						local703 = local796.anInt9396 / 128 - local65 / 128;
						Static292.method6327(local660.anInt10304, 360000L, arg3, local703, arg0, local519, arg1, local8);
					}
				}
			}
		}
		if (Static267.anInt5668 == 4) {
			return;
		}
		if (Static567.anInt10049 != 0) {
			local515 = Static567.anInt10049 * 4 + Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() * 2 + 2 - local62 / 128 - 2;
			local741 = Static387.anInt7430 * 4 + Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() * 2 + 2 - local65 / 128 - 2;
			Static353.method5872(Static118.aClass37Array10[Static394.aBoolean643 ? 1 : 0], arg0, local8, local741, arg1, local515, arg3);
		}
		arg2.method5341(-1, arg1.anInt9242 / 2 + arg3 - 1, 3, 3, arg0 + arg1.anInt9160 / 2 - 1);
		return;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)V")
	public static void method3083(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class3_Sub29 local17 = Static535.method7881(arg0, arg1);
		if (local17 != null) {
			local17.method8412();
		}
	}
}
