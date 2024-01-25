import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "[I")
	public static final int[] anIntArray192 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_55 = new Class92(77, -1);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!hn;Lclient!cu;ZILclient!so;I)V")
	public static void method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class3_Sub2_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub2_Sub1_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class6_Sub19 local12 = new Class6_Sub19();
		local12.anInt3596 = arg6 << 7;
		local12.anInt3589 = arg0;
		local12.anInt3594 = arg4 << 7;
		if (arg2 != null) {
			local12.aClass106_1 = arg2;
			@Pc(33) int local33 = arg2.anInt3158;
			@Pc(36) int local36 = arg2.anInt3194;
			if (arg1 == 1 || arg1 == 3) {
				local33 = arg2.anInt3194;
				local36 = arg2.anInt3158;
			}
			local12.anInt3591 = arg2.anInt3178;
			local12.anInt3603 = arg2.anInt3177 << 7;
			local12.anInt3601 = arg2.anInt3193;
			local12.anIntArray227 = arg2.anIntArray190;
			local12.anInt3599 = local33 + arg4 << 7;
			local12.anInt3592 = arg6 + local36 << 7;
			local12.anInt3590 = arg2.anInt3200;
			local12.anInt3597 = arg2.anInt3156;
			if (arg2.anIntArray188 != null) {
				local12.aBoolean232 = true;
				local12.method2972();
			}
			if (local12.anIntArray227 != null) {
				local12.anInt3602 = (int) ((double) (local12.anInt3601 - local12.anInt3590) * Math.random()) + local12.anInt3590;
			}
			Static182.aClass244_16.method5966(local12);
		} else if (arg3 != null) {
			local12.aClass3_Sub2_Sub1_Sub1_1 = arg3;
			@Pc(175) Class48 local175 = arg3.aClass48_1;
			if (local175.anIntArray103 != null) {
				local12.aBoolean232 = true;
				local175 = local175.method1378(Static393.aClass207_1);
			}
			if (local175 != null) {
				local12.anInt3599 = arg4 + local175.anInt1752 << 7;
				local12.anInt3592 = local175.anInt1752 + arg6 << 7;
				local12.anInt3591 = Static29.method722(arg3);
				local12.anInt3603 = local175.anInt1781 << 7;
				local12.anInt3597 = local175.anInt1772;
			}
			Static307.aClass244_26.method5966(local12);
		} else if (arg5 != null) {
			local12.aClass3_Sub2_Sub1_Sub2_1 = arg5;
			local12.anInt3599 = arg4 + arg5.method5521() << 7;
			local12.anInt3592 = arg5.method5521() + arg6 << 7;
			local12.anInt3591 = Static202.method3126(arg5);
			local12.anInt3597 = arg5.anInt6647;
			local12.anInt3603 = arg5.anInt6639 << 7;
			Static418.aClass74_32.method1890((long) arg5.anInt6602, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIZLclient!va;IIILclient!eq;Lclient!jl;II)Lclient!va;")
	public static Class224 method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class224 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class66 arg10, @OriginalArg(12) Class131 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg11 != null) {
			local11 = arg11.method3049(arg7, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) (arg13 + (arg3 << 16) + (arg2 << 24)) + ((long) arg8 << 32) + ((long) arg9 << 48);
		@Pc(50) Class44 local50 = Static320.aClass44_43;
		@Pc(58) Class224 local58;
		synchronized (Static320.aClass44_43) {
			local58 = (Class224) Static320.aClass44_43.method1353(local48);
		}
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(168) int local168;
		if (local58 == null || arg10.method5053(local58.method5811(), local11) != 0) {
			if (local58 != null) {
				local11 = arg10.method5062(local11, local58.method5811());
			}
			@Pc(90) byte local90;
			if (arg13 == 1) {
				local90 = 9;
			} else if (arg13 == 2) {
				local90 = 12;
			} else if (arg13 == 3) {
				local90 = 15;
			} else if (arg13 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class78 local145 = new Class78(local90 * 3 + 1, local90 * 3 * 2 - local90, 0);
			local152 = local145.method1972(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local90];
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (local158 = 0; local158 < 3; local158++) {
				local164 = local127[local158];
				local168 = local127[local158];
				for (local170 = 0; local170 < local90; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local90;
					@Pc(186) int local186 = Class145.anIntArray279[local178] * local164 >> 15;
					local194 = Class145.anIntArray280[local178] * local168 >> 15;
					local156[local158][local170] = local145.method1972(local194, local186, 0);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(241) byte local241 = (byte) (arg2 * local168 + arg3 * local170 >> 8);
				@Pc(286) short local286 = (short) ((local170 * (arg8 & 0x7F) + (arg9 & 0x7F) * local168 & 0x7F00) + ((arg9 & 0x380) * local168 + local170 * (arg8 & 0x380) & 0x38000) + ((arg9 & 0xFC00) * local168 + (arg8 & 0xFC00) * local170 & 0xFC0000) >> 8);
				for (local194 = 0; local194 < local90; local194++) {
					if (local164 == 0) {
						local145.method1971(local286, local156[0][local194], (short) -1, local241, local152, (byte) 1, (byte) -1, local156[0][(local194 + 1) % local90]);
					} else {
						local145.method1971(local286, local156[local164][(local194 + 1) % local90], (short) -1, local241, local156[local164 - 1][local194], (byte) 1, (byte) -1, local156[local164 - 1][(local194 + 1) % local90]);
						local145.method1971(local286, local156[local164][local194], (short) -1, local241, local156[local164 - 1][local194], (byte) 1, (byte) -1, local156[local164][(local194 + 1) % local90]);
					}
				}
			}
			local58 = arg10.method4971(local145, local11, Static259.anInt4722, 64, 768);
			@Pc(413) Class44 local413 = Static320.aClass44_43;
			synchronized (Static320.aClass44_43) {
				Static320.aClass44_43.method1349(local58, local48);
			}
		}
		@Pc(434) int local434 = (arg13 << 6) - 1;
		@Pc(437) int local437 = -local434;
		@Pc(440) int local440 = -local434;
		@Pc(442) int local442 = local434;
		local152 = local434;
		if (arg5) {
			if (arg12 > 9216 && arg12 < 15360) {
				local442 = local434 + 128;
			}
			if (arg12 > 1024 && arg12 < 7168) {
				local437 -= 128;
			}
			if (arg12 > 5120 && arg12 < 11264) {
				local152 = local434 + 128;
			}
			if (arg12 > 13312 || arg12 < 3072) {
				local440 -= 128;
			}
		}
		@Pc(489) int local489 = arg6.method5834();
		local158 = arg6.method5838();
		local164 = arg6.method5815();
		if (local442 < local158) {
			local158 = local442;
		}
		if (local164 < local440) {
			local164 = local440;
		}
		if (local437 > local489) {
			local489 = local437;
		}
		local168 = arg6.method5797();
		if (local168 > local152) {
			local168 = local152;
		}
		@Pc(537) Class6_Sub2_Sub8 local537 = null;
		if (arg11 != null) {
			@Pc(544) int local544 = arg11.anIntArray235[arg7];
			local537 = Static5.aClass217_1.method5235(local544 >> 16);
			arg7 = local544 & 0xFFFF;
		}
		if (local537 == null) {
			local58 = local58.method5808((byte) 3, local11, true);
			local58.method5823(local158 - local489 >> 1, 128, local168 - local164 >> 1);
			local58.method5806(local158 + local489 >> 1, 0, local168 + local164 >> 1);
		} else {
			local58 = local58.method5808((byte) 3, local11, true);
			local58.method5823(local158 - local489 >> 1, 128, local168 - local164 >> 1);
			local58.method5806(local489 + local158 >> 1, 0, local164 + local168 >> 1);
			local58.method5835(arg7, local537);
		}
		if (arg0 != 0) {
			local58.method5817(arg0);
		}
		if (arg1 != 0) {
			local58.method5840(arg1);
		}
		if (arg4 != 0) {
			local58.method5806(0, arg4, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZLclient!jl;II)V")
	public static void method2664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class131 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static415.anInt7434 >= 50 || (arg3 == null || arg3.anIntArrayArray21 == null || arg0 >= arg3.anIntArrayArray21.length || arg3.anIntArrayArray21[arg0] == null)) {
			return;
		}
		@Pc(37) int local37 = arg3.anIntArrayArray21[arg0][0];
		@Pc(41) int local41 = local37 >> 8;
		@Pc(47) int local47 = local37 >> 5 & 0x7;
		@Pc(51) int local51 = local37 & 0x1F;
		@Pc(70) int local70;
		if (arg3.anIntArrayArray21[arg0].length > 1) {
			local70 = (int) ((double) arg3.anIntArrayArray21[arg0].length * Math.random());
			if (local70 > 0) {
				local41 = arg3.anIntArrayArray21[arg0][local70];
			}
		}
		if (local51 == 0) {
			if (arg2) {
				Static235.method3639(255, local47, 0, local41);
			}
		} else if (Static291.aClass28_Sub1_1.anInt1036 != 0) {
			local70 = arg1 - 64 >> 7;
			@Pc(112) int local112 = arg4 - 64 >> 7;
			Static302.aClass241Array1[Static415.anInt7434++] = new Class241((byte) 1, local41, local47, 0, 255, (arg5 << 24) + (local70 << 16) + (local112 << 8) + local51);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZZ)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0) {
			Static126.aClass66_5 = Static96.method5011(Static280.aCanvas3, Static291.aClass28_Sub1_1.anInt1038 * 2, Static45.aClass209_127, Static397.anInterface8_6, arg0);
		} else {
			if (arg1) {
				Static126.aClass66_5 = Static96.method5011(Static280.aCanvas3, 0, Static45.aClass209_127, Static397.anInterface8_6, 0);
				Static126.aClass66_5.method5045(0);
				@Pc(36) Class166 local36 = Static30.method756(Static72.anInt1877, Static410.aClass100_89);
				@Pc(45) Class29 local45 = Static126.aClass66_5.method5036(local36, Static458.method4492(Static350.aClass100_69, Static72.anInt1877));
				Static134.method2374(local45, Static54.aClass267_20.method6581(Static161.anInt3239), true);
				Static126.aClass66_5.method4977();
				Static344.method5291();
				Static126.aClass66_5.method5069();
			}
			try {
				Static126.aClass66_5 = Static96.method5011(Static280.aCanvas3, Static291.aClass28_Sub1_1.anInt1038 * 2, Static45.aClass209_127, Static397.anInterface8_6, arg0);
				if (Static126.aClass66_5.method5031()) {
					@Pc(78) Class6_Sub15 local78 = Static126.aClass66_5.method4969();
					Static126.aClass66_5.method5028(local78);
				}
			} catch (@Pc(83) Throwable local83) {
				arg0 = 0;
				Static126.aClass66_5 = Static96.method5011(Static280.aCanvas3, 0, Static45.aClass209_127, Static397.anInterface8_6, 0);
			}
		}
		Static294.anInt5208 = arg0;
		Static286.method4292();
		if (!Static126.aClass66_5.method5029()) {
			Static143.anInt2942 = 1;
		}
		Static126.aClass66_5.method5020(Static143.anInt2942);
		Static126.aClass66_5.method5047(0);
		Static126.aClass66_5.method5032(8);
		Static382.aClass5_4 = Static126.aClass66_5.method5057();
		Static312.aClass5_5 = Static126.aClass66_5.method5057();
		Static337.method4900();
		Static126.aClass66_5.method4967(!Static291.aClass28_Sub1_1.aBoolean71);
		if (Static126.aClass66_5.method5049()) {
			Static9.method306(Static291.aClass28_Sub1_1.aBoolean82);
		}
		Static442.method6408(Static117.anInt2450 >> 3, Static126.aClass66_5, Static181.anInt3574 >> 3);
		Static245.method3817();
		Static38.aBoolean93 = false;
	}
}
