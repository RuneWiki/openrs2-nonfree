import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
	public static int anInt662;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_17 = new Class394("", 18);

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_10 = new Class305(7, 7);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static522.aClass38Array4[Static364.anInt6622++] = new Class38(4, arg3, arg2, arg1, arg1, arg2, arg5, arg0, arg0, arg5, arg6, arg6, arg4, arg4);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method582(@OriginalArg(1) int arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static491.anInt8247 == 0 || Static588.anInt9671 == 0) {
			return;
		}
		@Pc(31) Class254 local31;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(62) int local62;
		if (Static66.aBoolean570) {
			Static507.method7266(false);
			local31 = arg1.method6890();
			@Pc(34) int[] local34 = arg1.Y();
			local38 = local34[2];
			local42 = local34[3];
			local46 = local34[0];
			local50 = local34[1];
			local56 = arg2 + Static443.method6448(false);
			local62 = Static254.method3901(false) + arg0;
		} else {
			arg1.DA(Static342.anInt6251, Static121.anInt2492, Static491.anInt8247, Static588.anInt9671);
			local38 = Static491.anInt8247;
			local46 = Static342.anInt6251;
			local42 = Static588.anInt9671;
			local50 = Static121.anInt2492;
			arg1.KA(Static300.anInt10358, Static469.anInt7908, Static491.anInt8247, Static588.anInt9671);
			local31 = arg1.method6955();
			local31.method7360(Static137.anInt2688, Static314.anInt5970, Static285.anInt5539, Static386.anInt6900, Static20.anInt303, Static284.anInt5429);
			local56 = arg2;
			local62 = arg0;
			arg1.method6891(local31);
		}
		if (local38 == 0) {
			local38 = 1;
		}
		Static467.method6657(true);
		if (local42 == 0) {
			local42 = 1;
		}
		@Pc(137) int local137;
		@Pc(160) int local160;
		@Pc(149) int local149;
		@Pc(272) int local272;
		@Pc(281) int local281;
		@Pc(292) int local292;
		@Pc(303) int local303;
		@Pc(129) int local129;
		@Pc(352) int local352;
		if (Static605.aClass109Array5 != null && (!Static55.aBoolean60 || (Static24.anInt7340 & 0x40) != 0)) {
			local129 = -1;
			@Pc(131) int local131 = -1;
			@Pc(134) int local134 = arg1.i();
			local137 = arg1.XA();
			@Pc(150) int local150;
			@Pc(159) int local159;
			if (Static632.aBoolean877) {
				local150 = local149 = Static483.anInt8094 * (local62 - local50) / local42;
				local160 = local159 = Static483.anInt8094 * (local56 - local46) / local38;
			} else {
				local160 = local134 * (local56 - local46) / local38;
				local150 = (local62 - local50) * local134 / local42;
				local149 = (local62 - local50) * local137 / local42;
				local159 = (local56 - local46) * local137 / local38;
			}
			@Pc(211) int[] local211 = new int[] { local160, local150, local134 };
			local31.method7351(local211);
			@Pc(229) int[] local229 = new int[] { local159, local149, local137 };
			local31.method7351(local229);
			@Pc(260) float local260 = Static585.method8039((float) local229[0], (float) local211[2], (float) local211[0], 4, (float) local229[1], (float) local229[2], (float) local211[1]);
			if (local260 > 0.0F) {
				local272 = local229[0] - local211[0];
				local281 = local229[2] - local211[2];
				local292 = (int) ((float) local211[0] + (float) local272 * local260);
				local303 = (int) ((float) local211[2] + (float) local281 * local260);
				local129 = (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() - 1 << 8) + local292 >> 9;
				local131 = local303 + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() - 1 << 8) >> 9;
				@Pc(331) byte local331 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145;
				if (local331 < 3 && (Static7.aByteArrayArrayArray1[1][local292 >> 9][local303 >> 9] & 0x2) != 0) {
					local352 = local331 + 1;
				}
			}
			if (local129 != -1 && local131 != -1) {
				if (Static55.aBoolean60 && (Static24.anInt7340 & 0x40) != 0) {
					@Pc(424) Class345 local424 = Static144.method2595(Static549.anInt9003, Static353.anInt6392);
					if (local424 == null) {
						Static424.method6285();
					} else {
						Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, true, 0L, local131, 5, (long) (local131 | local129 << 0), local129, " ->", true);
					}
				} else {
					if (Static609.aBoolean848) {
						Static282.method4539(Static64.aClass52_27.method907(Static544.anInt8937), false, -1, -1, true, 0L, local131, 4, (long) (local131 | local129 << 0), local129, "", true);
					}
					Static282.method4539(Static634.aString107, false, -1, Static98.anInt2166, true, 0L, local131, 16, (long) (local131 | local129 << 0), local129, "", true);
				}
			}
		}
		if (Static66.aBoolean570) {
			Static17.method230();
		}
		for (local129 = 0; local129 < (Static66.aBoolean570 ? 2 : 1); local129++) {
			@Pc(473) boolean local473 = local129 == 0;
			@Pc(479) Class270 local479 = local473 ? Static296.aClass270_3 : Static281.aClass270_1;
			local137 = arg2;
			local160 = arg0;
			if (Static66.aBoolean570) {
				Static507.method7266(local473);
				local137 = arg2 + Static443.method6448(local473);
				local160 = arg0 + Static254.method3901(local473);
			}
			@Pc(503) Class156 local503 = local479.aClass156_6;
			for (@Pc(508) Class28_Sub7 local508 = (Class28_Sub7) local503.method3776(); local508 != null; local508 = (Class28_Sub7) local503.method3783()) {
				if ((Static317.aBoolean530 || Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local508.aClass28_Sub1_17.aByte145) && local508.method6488(arg1, local137, local160)) {
					@Pc(545) int local545;
					if (local508.aClass28_Sub1_17 instanceof Class28_Sub1_Sub4) {
						local545 = ((Class28_Sub1_Sub4) local508.aClass28_Sub1_17).aShort121;
						local149 = ((Class28_Sub1_Sub4) local508.aClass28_Sub1_17).aShort124;
					} else {
						local545 = local508.aClass28_Sub1_17.anInt10784 >> 9;
						local149 = local508.aClass28_Sub1_17.anInt10781 >> 9;
					}
					@Pc(683) int local683;
					@Pc(695) int local695;
					@Pc(803) int local803;
					@Pc(575) int local575;
					if (local508.aClass28_Sub1_17 instanceof Class28_Sub1_Sub4_Sub2_Sub2) {
						@Pc(571) Class28_Sub1_Sub4_Sub2_Sub2 local571 = (Class28_Sub1_Sub4_Sub2_Sub2) local508.aClass28_Sub1_17;
						local575 = local571.method4599();
						if ((local575 & 0x1) == 0 && (local571.anInt10781 & 0x1FF) == 0 && (local571.anInt10784 & 0x1FF) == 0 || (local575 & 0x1) == 1 && (local571.anInt10781 & 0x1FF) == 256 && (local571.anInt10784 & 0x1FF) == 256) {
							local272 = local571.anInt10781 - (local571.method4599() - 1 << 8);
							local281 = local571.anInt10784 - (local571.method4599() - 1 << 8);
							for (local292 = 0; local292 < Static36.anInt607; local292++) {
								@Pc(654) Class5_Sub25 local654 = (Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local292]);
								if (local654 != null) {
									@Pc(659) Class28_Sub1_Sub4_Sub2_Sub1 local659 = local654.aClass28_Sub1_Sub4_Sub2_Sub1_1;
									if (Static26.anInt350 != local659.anInt5521 && local659.aBoolean468) {
										local683 = local659.anInt10781 - (local659.aClass134_1.anInt3851 - 1 << 8);
										local695 = local659.anInt10784 - (local659.aClass134_1.anInt3851 - 1 << 8);
										if (local272 <= local683 && local659.aClass134_1.anInt3851 <= local571.method4599() - (local683 - local272 >> 9) && local281 <= local695 && local659.aClass134_1.anInt3851 <= local571.method4599() - (local695 - local281 >> 9)) {
											Static265.method4125(local659, local508.aClass28_Sub1_17.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
											local659.anInt5521 = Static26.anInt350;
										}
									}
								}
							}
							local303 = Static105.anInt2258;
							@Pc(764) int[] local764 = Static321.anIntArray339;
							for (local683 = 0; local683 < local303; local683++) {
								@Pc(774) Class28_Sub1_Sub4_Sub2_Sub2 local774 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local764[local683]];
								if (local774 != null && local774.anInt5521 != Static26.anInt350 && local571 != local774 && local774.aBoolean468) {
									local803 = local774.anInt10781 - (local774.method4599() - 1 << 8);
									@Pc(814) int local814 = local774.anInt10784 - (local774.method4599() - 1 << 8);
									if (local272 <= local803 && local774.method4599() <= local571.method4599() - (local803 - local272 >> 9) && local814 >= local281 && local774.method4599() <= local571.method4599() - (local814 - local281 >> 9)) {
										Static677.method9031(local774, local508.aClass28_Sub1_17.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
										local774.anInt5521 = Static26.anInt350;
									}
								}
							}
						}
						if (local571.anInt5521 == Static26.anInt350) {
							continue;
						}
						Static677.method9031(local571, local508.aClass28_Sub1_17.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
						local571.anInt5521 = Static26.anInt350;
					}
					if (local508.aClass28_Sub1_17 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
						@Pc(916) Class28_Sub1_Sub4_Sub2_Sub1 local916 = (Class28_Sub1_Sub4_Sub2_Sub1) local508.aClass28_Sub1_17;
						if (local916.aClass134_1 != null) {
							if ((local916.aClass134_1.anInt3851 & 0x1) == 0 && (local916.anInt10781 & 0x1FF) == 0 && (local916.anInt10784 & 0x1FF) == 0 || (local916.aClass134_1.anInt3851 & 0x1) == 1 && (local916.anInt10781 & 0x1FF) == 256 && (local916.anInt10784 & 0x1FF) == 256) {
								local575 = local916.anInt10781 - (local916.aClass134_1.anInt3851 - 1 << 8);
								local272 = local916.anInt10784 - (local916.aClass134_1.anInt3851 - 1 << 8);
								for (local281 = 0; local281 < Static36.anInt607; local281++) {
									@Pc(1002) Class5_Sub25 local1002 = (Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local281]);
									if (local1002 != null) {
										@Pc(1007) Class28_Sub1_Sub4_Sub2_Sub1 local1007 = local1002.aClass28_Sub1_Sub4_Sub2_Sub1_1;
										if (Static26.anInt350 != local1007.anInt5521 && local916 != local1007 && local1007.aBoolean468) {
											local352 = local1007.anInt10781 - (local1007.aClass134_1.anInt3851 - 1 << 8);
											local683 = local1007.anInt10784 - (local1007.aClass134_1.anInt3851 - 1 << 8);
											if (local575 <= local352 && local1007.aClass134_1.anInt3851 <= local916.aClass134_1.anInt3851 - (local352 - local575 >> 9) && local683 >= local272 && local1007.aClass134_1.anInt3851 <= local916.aClass134_1.anInt3851 - (local683 - local272 >> 9)) {
												Static265.method4125(local1007, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 != local508.aClass28_Sub1_17.aByte145);
												local1007.anInt5521 = Static26.anInt350;
											}
										}
									}
								}
								local292 = Static105.anInt2258;
								@Pc(1115) int[] local1115 = Static321.anIntArray339;
								for (local352 = 0; local352 < local292; local352++) {
									@Pc(1125) Class28_Sub1_Sub4_Sub2_Sub2 local1125 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local1115[local352]];
									if (local1125 != null && local1125.anInt5521 != Static26.anInt350 && local1125.aBoolean468) {
										local695 = local1125.anInt10781 - (local1125.method4599() - 1 << 8);
										local803 = local1125.anInt10784 - (local1125.method4599() - 1 << 8);
										if (local695 >= local575 && local1125.method4599() <= local916.aClass134_1.anInt3851 - (local695 - local575 >> 9) && local272 <= local803 && local1125.method4599() <= local916.aClass134_1.anInt3851 - (local803 - local272 >> 9)) {
											Static677.method9031(local1125, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 != local508.aClass28_Sub1_17.aByte145);
											local1125.anInt5521 = Static26.anInt350;
										}
									}
								}
							}
							if (local916.anInt5521 == Static26.anInt350) {
								continue;
							}
							Static265.method4125(local916, local508.aClass28_Sub1_17.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
							local916.anInt5521 = Static26.anInt350;
						}
					}
					if (local508.aClass28_Sub1_17 instanceof Class28_Sub1_Sub1_Sub1) {
						@Pc(1258) int local1258 = local149 + Static153.anInt3147;
						local575 = Static201.anInt3839 + local545;
						@Pc(1279) Class5_Sub31 local1279 = (Class5_Sub31) Static548.aClass300_41.method7188((long) (local575 << 14 | local508.aClass28_Sub1_17.aByte145 << 28 | local1258));
						if (local1279 != null) {
							local281 = 0;
							for (@Pc(1291) Class5_Sub51 local1291 = (Class5_Sub51) local1279.aClass114_39.method2818(); local1291 != null; local1291 = (Class5_Sub51) local1279.aClass114_39.method2817()) {
								@Pc(1301) Class238 local1301 = Static110.aClass105_1.method2659(local1291.anInt9059);
								if (Static55.aBoolean60 && local508.aClass28_Sub1_17.aByte145 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145) {
									@Pc(1323) Class233 local1323 = Static412.anInt7320 == -1 ? null : Static191.aClass381_2.method8728(Static412.anInt7320);
									if ((Static24.anInt7340 & 0x1) != 0 && (local1323 == null || local1301.method5687(Static412.anInt7320, local1323.anInt6763) != local1323.anInt6763)) {
										Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, false, (long) local1291.anInt9059, local545, 21, (long) local281, local149, Static199.aString28 + " -> <col=ff9040>" + local1301.aString57, true);
									}
								}
								if (local508.aClass28_Sub1_17.aByte145 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145) {
									@Pc(1381) String[] local1381 = local1301.aStringArray40;
									for (local683 = 4; local683 >= 0; local683--) {
										if (local1381 != null && local1381[local683] != null) {
											@Pc(1393) byte local1393 = 0;
											local803 = Static300.anInt10361;
											if (local683 == 0) {
												local1393 = 8;
											}
											if (local683 == 1) {
												local1393 = 51;
											}
											if (local683 == 2) {
												local1393 = 48;
											}
											if (local683 == 3) {
												local1393 = 30;
											}
											if (local683 == 4) {
												local1393 = 20;
											}
											if (local683 == local1301.anInt6883) {
												local803 = local1301.anInt6881;
											}
											if (local1301.anInt6834 == local683) {
												local803 = local1301.anInt6845;
											}
											Static282.method4539(local1381[local683], false, -1, local803, false, (long) local1291.anInt9059, local545, local1393, (long) local281, local149, "<col=ff9040>" + local1301.aString57, true);
										}
									}
								}
								Static282.method4539(Static64.aClass52_22.method907(Static544.anInt8937), local508.aClass28_Sub1_17.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145, -1, Static559.anInt9123, false, (long) local1291.anInt9059, local545, 1003, (long) local281, local149, "<col=ff9040>" + local1301.aString57, true);
								local281++;
							}
						}
					}
					if (local508.aClass28_Sub1_17 instanceof Interface1) {
						@Pc(1540) Interface1 local1540 = (Interface1) local508.aClass28_Sub1_17;
						@Pc(1547) Class164 local1547 = Static568.aClass315_5.method7511(local1540.method8986());
						if (local1547.anIntArray247 != null) {
							local1547 = local1547.method3908(Static161.aClass237_3);
						}
						if (local1547 != null) {
							if (Static55.aBoolean60 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local508.aClass28_Sub1_17.aByte145) {
								@Pc(1581) Class233 local1581 = Static412.anInt7320 == -1 ? null : Static191.aClass381_2.method8728(Static412.anInt7320);
								if ((Static24.anInt7340 & 0x4) != 0 && (local1581 == null || local1547.method3906(local1581.anInt6763, Static412.anInt7320) != local1581.anInt6763)) {
									Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, false, Static464.method6626(local149, local545, local1540), local545, 53, (long) local1540.hashCode(), local149, Static199.aString28 + " -> <col=00ffff>" + local1547.aString34, true);
								}
							}
							if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 == local508.aClass28_Sub1_17.aByte145) {
								@Pc(1646) String[] local1646 = local1547.aStringArray27;
								if (local1646 != null) {
									for (local281 = 4; local281 >= 0; local281--) {
										if (local1646[local281] != null) {
											@Pc(1658) short local1658 = 0;
											if (local281 == 0) {
												local1658 = 15;
											}
											local303 = Static300.anInt10361;
											if (local281 == 1) {
												local1658 = 46;
											}
											if (local281 == 2) {
												local1658 = 23;
											}
											if (local281 == 3) {
												local1658 = 13;
											}
											if (local281 == 4) {
												local1658 = 1002;
											}
											if (local1547.anInt4676 == local281) {
												local303 = local1547.anInt4669;
											}
											if (local1547.anInt4675 == local281) {
												local303 = local1547.anInt4633;
											}
											Static282.method4539(local1646[local281], false, -1, local303, false, Static464.method6626(local149, local545, local1540), local545, local1658, (long) local1540.hashCode(), local149, "<col=00ffff>" + local1547.aString34, true);
										}
									}
								}
								Static282.method4539(Static64.aClass52_22.method907(Static544.anInt8937), Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 != local508.aClass28_Sub1_17.aByte145, -1, Static559.anInt9123, false, (long) local1547.anInt4670, local545, 1009, (long) local1540.hashCode(), local149, "<col=00ffff>" + local1547.aString34, true);
							}
						}
					}
				}
			}
			if (Static66.aBoolean570) {
				Static17.method230();
			}
		}
		Static467.method6657(false);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	public static void method583() {
		if (Static15.method206(Static173.anInt3397) || Static326.method5069(Static173.anInt3397)) {
			Static502.method7167(5000, Static407.anInt7215 >> 12, Static332.anInt6132 >> 12);
		} else {
			@Pc(24) int local24 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] >> 3;
			@Pc(31) int local31 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] >> 3;
			if (local24 >= 0 && local24 < Static201.anInt3834 >> 3 && local31 >= 0 && local31 < Static626.anInt10238 >> 3) {
				Static502.method7167(5000, local31, local24);
			} else {
				Static502.method7167(0, Static626.anInt10238 >> 4, Static201.anInt3834 >> 4);
			}
		}
		Static489.method7020();
		Static654.method8787();
		Static527.method7437();
		Static221.method8980();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
	public static void method585(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(13) int local13 = (arg3 + arg0) / 2;
		@Pc(15) int local15 = arg3;
		@Pc(19) String local19 = arg2[local13];
		arg2[local13] = arg2[arg0];
		arg2[arg0] = local19;
		@Pc(33) short local33 = arg1[local13];
		arg1[local13] = arg1[arg0];
		arg1[arg0] = local33;
		for (@Pc(45) int local45 = arg3; local45 < arg0; local45++) {
			if (local19 == null || arg2[local45] != null && arg2[local45].compareTo(local19) < (local45 & 0x1)) {
				@Pc(69) String local69 = arg2[local45];
				arg2[local45] = arg2[local15];
				arg2[local15] = local69;
				@Pc(83) short local83 = arg1[local45];
				arg1[local45] = arg1[local15];
				arg1[local15++] = local83;
			}
		}
		arg2[arg0] = arg2[local15];
		arg2[local15] = local19;
		arg1[arg0] = arg1[local15];
		arg1[local15] = local33;
		method585(local15 - 1, arg1, arg2, arg3);
		method585(arg0, arg1, arg2, local15 + 1);
	}
}
