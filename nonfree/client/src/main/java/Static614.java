import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt10019;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	public static int anInt10021;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	public static int anInt10020 = 0;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_30 = new Class74("", 12);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBILclient!ha;Lclient!vfa;)V")
	public static void method8509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) Class357 arg3) {
		@Pc(14) Class1 local14 = arg3.method8393(arg2);
		if (local14 == null) {
			return;
		}
		arg2.KA(arg1, arg0, arg1 + arg3.anInt9852, arg3.anInt9797 + arg0);
		if (Static70.anInt9227 == 2 || Static70.anInt9227 == 5 || Static500.aClass44_22 == null) {
			arg2.A(-16777216, local14, arg1, arg0);
			return;
		}
		@Pc(62) int local62;
		@Pc(59) int local59;
		@Pc(56) int local56;
		@Pc(69) int local69;
		if (Static584.anInt9543 == 4) {
			local56 = (int) -Static112.aFloat22 & 0x3FFF;
			local69 = 4096;
			local62 = Static102.anInt1587;
			local59 = Static377.anInt6619;
		} else {
			local56 = Static402.anInt9327 + (int) -Static112.aFloat22 & 0x3FFF;
			local59 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315;
			local62 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317;
			local69 = 4096 - Static425.anInt7212 * 16;
		}
		@Pc(96) int local96 = local62 / 128 + 208 + 48 - Static111.anInt1752 * 2;
		@Pc(113) int local113 = Static279.anInt4567 * 4 + 48 - local59 / 128 - (Static279.anInt4567 + -104) * 2;
		Static500.aClass44_22.method5307((float) arg1 + (float) arg3.anInt9852 / 2.0F, (float) arg3.anInt9797 / 2.0F + (float) arg0, (float) local96, (float) local113, local69, local56 << 2, local14, arg1, arg0);
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(195) int local195;
		for (@Pc(147) Class5_Sub41 local147 = (Class5_Sub41) Static490.aClass306_54.method7313(); local147 != null; local147 = (Class5_Sub41) Static490.aClass306_54.method7301()) {
			@Pc(152) int local152 = local147.anInt7411;
			local164 = (Static173.aClass383_3.anIntArray839[local152] >> 14 & 0x3FFF) - Static113.anInt1785;
			local174 = (Static173.aClass383_3.anIntArray839[local152] & 0x3FFF) - Static622.anInt10087;
			local185 = local164 * 4 + 2 - local62 / 128;
			local195 = local174 * 4 + 2 - local59 / 128;
			Static458.method6815(arg3, local195, arg0, arg1, Static173.aClass383_3.anIntArray840[local152], local14, local185, arg2);
		}
		for (local164 = 0; local164 < Static482.anInt9636; local164++) {
			local174 = Static650.anIntArray845[local164] * 4 + 2 - local62 / 128;
			local185 = Static192.anIntArray688[local164] * 4 + 2 - local59 / 128;
			@Pc(252) Class283 local252 = Static525.aClass371_4.method8554(Static580.anIntArray818[local164]);
			if (local252.anIntArray623 != null) {
				local252 = local252.method6858(Static564.aClass304_1);
				if (local252 == null || local252.anInt7802 == -1) {
					continue;
				}
			}
			Static458.method6815(arg3, local185, arg0, arg1, local252.anInt7802, local14, local174, arg2);
		}
		@Pc(339) int local339;
		@Pc(350) int local350;
		for (@Pc(292) Class5_Sub17 local292 = (Class5_Sub17) Static402.aClass81_65.method1608(); local292 != null; local292 = (Class5_Sub17) Static402.aClass81_65.method1610()) {
			local185 = (int) (local292.aLong282 >> 28 & 0x3L);
			if (local185 == Static578.anInt9491) {
				local195 = (int) (local292.aLong282 & 0x3FFFL) - Static113.anInt1785;
				@Pc(329) int local329 = (int) (local292.aLong282 >> 14 & 0x3FFFL) - Static622.anInt10087;
				local339 = local195 * 4 + 2 - local62 / 128;
				local350 = local329 * 4 + 2 - local59 / 128;
				Static554.method7808(local14, arg1, Static22.aClass44Array3[0], local350, local339, arg0, arg3);
			}
		}
		@Pc(436) int local436;
		for (local185 = 0; local185 < Static58.anInt926; local185++) {
			@Pc(381) Class5_Sub13 local381 = (Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local185]);
			if (local381 != null) {
				@Pc(386) Class14_Sub1_Sub1_Sub3_Sub2 local386 = local381.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				if (local386.method2527() && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 == local386.aByte125) {
					@Pc(398) Class271 local398 = local386.aClass271_1;
					if (local398 != null && local398.anIntArray591 != null) {
						local398 = local398.method6476(Static564.aClass304_1);
					}
					if (local398 != null && local398.aBoolean615 && local398.aBoolean614) {
						local350 = local386.anInt9317 / 128 - local62 / 128;
						local436 = local386.anInt9315 / 128 - local59 / 128;
						if (local398.anInt7317 == -1) {
							Static554.method7808(local14, arg1, Static22.aClass44Array3[1], local436, local350, arg0, arg3);
						} else {
							Static458.method6815(arg3, local436, arg0, arg1, local398.anInt7317, local14, local350, arg2);
						}
					}
				}
			}
		}
		local195 = Static227.anInt3948;
		@Pc(476) int[] local476 = Static467.anIntArray632;
		@Pc(522) int local522;
		@Pc(526) int local526;
		@Pc(558) int local558;
		for (local339 = 0; local339 < local195; local339++) {
			@Pc(486) Class14_Sub1_Sub1_Sub3_Sub1 local486 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local476[local339]];
			if (local486 != null && local486.method2368() && !local486.aBoolean241 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 != local486 && local486.aByte125 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) {
				local436 = local486.anInt9317 / 128 - local62 / 128;
				local522 = local486.anInt9315 / 128 - local59 / 128;
				@Pc(524) boolean local524 = false;
				for (local526 = 0; local526 < Static74.anInt1238; local526++) {
					if (local486.aString42.equals(Static182.aStringArray13[local526]) && Static484.anIntArray647[local526] != 0) {
						local524 = true;
						break;
					}
				}
				@Pc(556) boolean local556 = false;
				for (local558 = 0; local558 < Static122.anInt1983; local558++) {
					if (local486.aString42.equals(Static60.aClass231Array3[local558].aString99)) {
						local556 = true;
						break;
					}
				}
				@Pc(578) boolean local578 = false;
				if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2720 != 0 && local486.anInt2720 != 0 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2720 == local486.anInt2720) {
					local578 = true;
				}
				if (local486.aBoolean238) {
					Static554.method7808(local14, arg1, Static22.aClass44Array3[6], local522, local436, arg0, arg3);
				} else if (local524) {
					Static554.method7808(local14, arg1, Static22.aClass44Array3[3], local522, local436, arg0, arg3);
				} else if (local556) {
					Static554.method7808(local14, arg1, Static22.aClass44Array3[5], local522, local436, arg0, arg3);
				} else if (local578) {
					Static554.method7808(local14, arg1, Static22.aClass44Array3[4], local522, local436, arg0, arg3);
				} else {
					Static554.method7808(local14, arg1, Static22.aClass44Array3[2], local522, local436, arg0, arg3);
				}
			}
		}
		@Pc(673) Class16[] local673 = Static568.aClass16Array1;
		@Pc(754) int local754;
		for (local436 = 0; local436 < local673.length; local436++) {
			@Pc(681) Class16 local681 = local673[local436];
			if (local681 != null && local681.anInt407 != 0 && Static235.anInt3998 % 20 < 10) {
				@Pc(717) int local717;
				if (local681.anInt407 == 1) {
					@Pc(703) Class5_Sub13 local703 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local681.anInt403);
					if (local703 != null) {
						@Pc(708) Class14_Sub1_Sub1_Sub3_Sub2 local708 = local703.aClass14_Sub1_Sub1_Sub3_Sub2_1;
						local717 = local708.anInt9317 / 128 - local62 / 128;
						local558 = local708.anInt9315 / 128 - local59 / 128;
						Static228.method3583(arg1, local558, local717, local14, arg0, arg3, 360000L, local681.anInt405);
					}
				}
				if (local681.anInt407 == 2) {
					local754 = local681.anInt398 / 128 - local62 / 128;
					local526 = local681.anInt402 / 128 - local59 / 128;
					@Pc(770) long local770 = (long) (local681.anInt406 << 7);
					@Pc(774) long local774 = local770 * local770;
					Static228.method3583(arg1, local526, local754, local14, arg0, arg3, local774, local681.anInt405);
				}
				if (local681.anInt407 == 10 && local681.anInt403 >= 0 && Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1.length > local681.anInt403) {
					@Pc(811) Class14_Sub1_Sub1_Sub3_Sub1 local811 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local681.anInt403];
					if (local811 != null) {
						local526 = local811.anInt9317 / 128 - local62 / 128;
						local717 = local811.anInt9315 / 128 - local59 / 128;
						Static228.method3583(arg1, local717, local526, local14, arg0, arg3, 360000L, local681.anInt405);
					}
				}
			}
		}
		if (Static584.anInt9543 == 4) {
			return;
		}
		if (Static269.anInt1227 != 0) {
			local522 = Static269.anInt1227 * 4 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() * 2 + 2 - local62 / 128 - 2;
			local754 = Static119.anInt1885 * 4 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() * 2 + 2 - local59 / 128 - 2;
			Static554.method7808(local14, arg1, Static110.aClass44Array6[Static647.aBoolean840 ? 1 : 0], local754, local522, arg0, arg3);
		}
		if (!Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aBoolean241) {
			arg2.method7045(3, 3, arg3.anInt9797 / 2 + arg0 - 1, arg1 - -(arg3.anInt9852 / 2) + -1, -1);
			return;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public static void method8510() {
		if (!Static609.aBoolean813) {
			Static349.aBoolean501 = true;
			Static322.aFloat112 += (-Static322.aFloat112 - 24.0F) / 2.0F;
			Static609.aBoolean813 = true;
		}
	}
}
