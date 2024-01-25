import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
	public static int anInt7481;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!dt;I)Lclient!cd;")
	public static Class21 method6272(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(19) Class266 local19 = Static404.method5594()[arg0.method7954()];
		@Pc(26) Class131 local26 = Static296.method4347()[arg0.method7954()];
		@Pc(32) int local32 = arg0.method7918();
		@Pc(38) int local38 = arg0.method7918();
		@Pc(42) int local42 = arg0.method7951();
		@Pc(46) int local46 = arg0.method7951();
		@Pc(50) int local50 = arg0.method7918();
		@Pc(54) int local54 = arg0.method7895();
		@Pc(58) int local58 = arg0.method7895();
		return new Class21(local19, local26, local32, local38, local42, local46, local50, local54, local58);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!af;IILclient!cm;)V")
	public static void method6273(@OriginalArg(1) Class3_Sub4_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class34_Sub1_Sub1_Sub2_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		if ((arg1 & 0x200) != 0) {
			local18 = arg0.method7935();
			arg3.anInt9659 = arg0.method7954();
			arg3.anInt9676 = arg0.method7914();
			arg3.anInt9682 = local18 & 0x7FFF;
			arg3.aBoolean675 = (local18 & 0x8000) != 0;
			arg3.anInt9658 = arg3.anInt9682 + Static122.anInt2190 + arg3.anInt9659;
		}
		if ((arg1 & 0x4) != 0) {
			local18 = arg0.method7935();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg3.anInt9673 = local18;
		}
		@Pc(84) int local84;
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		if ((arg1 & 0x40000) != 0) {
			local18 = arg0.method7959();
			local84 = arg0.method7947();
			if (local18 == 65535) {
				local18 = -1;
			}
			local95 = arg0.method7954();
			local99 = local95 & 0x7;
			local105 = local95 >> 3 & 0xF;
			if (local105 == 15) {
				local105 = -1;
			}
			arg3.method7859(2, local99, local105, local18, local84);
		}
		if ((arg1 & 0x80) != 0) {
			@Pc(127) int[] local127 = new int[4];
			for (local84 = 0; local84 < 4; local84++) {
				local127[local84] = arg0.method7926();
				if (local127[local84] == 65535) {
					local127[local84] = -1;
				}
			}
			local95 = arg0.method7914();
			Static503.method6584(arg3, local127, local95);
		}
		if ((arg1 & 0x8000) != 0) {
			local18 = arg0.method7959();
			local84 = arg0.method7895();
			if (local18 == 65535) {
				local18 = -1;
			}
			local95 = arg0.method7934();
			local99 = local95 & 0x7;
			local105 = local95 >> 3 & 0xF;
			if (local105 == 15) {
				local105 = -1;
			}
			arg3.method7859(1, local99, local105, local18, local84);
		}
		@Pc(237) int local237;
		if ((arg1 & 0x8) != 0) {
			local18 = arg0.method7934();
			if (local18 > 0) {
				for (local84 = 0; local84 < local18; local84++) {
					local99 = -1;
					local105 = -1;
					local95 = arg0.method7896();
					local237 = -1;
					if (local95 == 32767) {
						local95 = arg0.method7896();
						local105 = arg0.method7896();
						local99 = arg0.method7896();
						local237 = arg0.method7896();
					} else if (local95 == 32766) {
						local95 = -1;
					} else {
						local105 = arg0.method7896();
					}
					@Pc(283) int local283 = arg0.method7896();
					@Pc(287) int local287 = arg0.method7914();
					arg3.method7873(local95, local99, local283, Static122.anInt2190, local237, local105, local287);
				}
			}
		}
		@Pc(320) int[] local320;
		@Pc(323) int[] local323;
		if ((arg1 & 0x100) != 0) {
			local18 = arg0.method7899();
			local320 = new int[local18];
			local323 = new int[local18];
			@Pc(326) int[] local326 = new int[local18];
			for (local105 = 0; local105 < local18; local105++) {
				local237 = arg0.method7951();
				if (local237 == 65535) {
					local237 = -1;
				}
				local320[local105] = local237;
				local323[local105] = arg0.method7914();
				local326[local105] = arg0.method7951();
			}
			Static200.method9011(arg3, local323, local326, local320);
		}
		if ((arg1 & 0x20) != 0) {
			Static121.aByteArray13[arg2] = arg0.method7906();
		}
		if ((arg1 & 0x80000) != 0) {
			arg3.aByte137 = arg0.method7906();
			arg3.aByte135 = arg0.method7960();
			arg3.aByte136 = arg0.method7906();
			arg3.aByte138 = (byte) arg0.method7954();
			arg3.anInt9700 = Static122.anInt2190 + arg0.method7959();
			arg3.anInt9657 = Static122.anInt2190 + arg0.method7926();
		}
		if ((arg1 & 0x2000) != 0) {
			arg3.aBoolean144 = arg0.method7914() == 1;
		}
		if ((arg1 & 0x2) != 0) {
			local18 = arg0.method7926();
			local84 = arg0.method7947();
			if (local18 == 65535) {
				local18 = -1;
			}
			local95 = arg0.method7914();
			local99 = local95 & 0x7;
			local105 = local95 >> 3 & 0xF;
			if (local105 == 15) {
				local105 = -1;
			}
			arg3.method7859(0, local99, local105, local18, local84);
		}
		if ((arg1 & 0x400) != 0) {
			local7 = arg0.method7910();
		}
		if ((arg1 & 0x10) != 0) {
			local18 = arg0.method7914();
			@Pc(514) byte[] local514 = new byte[local18];
			@Pc(519) Class3_Sub4 local519 = new Class3_Sub4(local514);
			arg0.method7937(local18, local514);
			Static273.aClass3_Sub4Array1[arg2] = local519;
			arg3.method1481(local519);
		}
		if ((arg1 & 0x20000) != 0) {
			arg3.aBoolean146 = arg0.method7934() == 1;
		}
		if ((arg1 & 0x800) != 0) {
			arg3.aString108 = arg0.method7922();
			if (arg3.aString108.charAt(0) == '~') {
				arg3.aString108 = arg3.aString108.substring(1);
				Static390.method5455(0, arg3.aString108, arg3.aString24, 2, arg3.method1482(), arg3.method1485());
			} else if (arg3 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1) {
				Static390.method5455(0, arg3.aString108, arg3.aString24, 2, arg3.method1482(), arg3.method1485());
			}
			arg3.anInt9654 = 0;
			arg3.anInt9661 = 150;
			arg3.anInt9663 = 0;
		}
		if ((arg1 & 0x4000) != 0) {
			arg3.anInt9643 = arg0.method7910();
			arg3.anInt9656 = arg0.method7903();
			arg3.anInt9677 = arg0.method7906();
			arg3.anInt9640 = arg0.method7906();
			arg3.anInt9685 = arg0.method7935() + Static122.anInt2190;
			arg3.anInt9642 = arg0.method7951() + Static122.anInt2190;
			arg3.anInt9645 = arg0.method7899();
			if (arg3.aBoolean143) {
				arg3.anInt9640 += arg3.anInt1804;
				arg3.anInt9656 += arg3.anInt1804;
				arg3.anInt9677 += arg3.anInt1788;
				arg3.anInt9703 = 0;
				arg3.anInt9643 += arg3.anInt1788;
			} else {
				arg3.anInt9677 += arg3.anIntArray529[0];
				arg3.anInt9703 = 1;
				arg3.anInt9656 += arg3.anIntArray528[0];
				arg3.anInt9640 += arg3.anIntArray528[0];
				arg3.anInt9643 += arg3.anIntArray529[0];
			}
			arg3.anInt9705 = 0;
		}
		if ((arg1 & 0x1) != 0) {
			arg3.anInt1799 = arg0.method7951();
			if (arg3.anInt9703 == 0) {
				arg3.method7860(arg3.anInt1799);
				arg3.anInt1799 = -1;
			}
		}
		if ((arg1 & 0x10000) != 0) {
			local18 = arg0.method7899();
			local320 = new int[local18];
			local323 = new int[local18];
			for (local99 = 0; local99 < local18; local99++) {
				local105 = arg0.method7959();
				if ((local105 & 0xC000) == 49152) {
					local237 = arg0.method7959();
					local320[local99] = local105 << 16 | local237;
				} else {
					local320[local99] = local105;
				}
				local323[local99] = arg0.method7959();
			}
			arg3.method7877(local320, local323);
		}
		if (!arg3.aBoolean143) {
			return;
		}
		if (local7 == 127) {
			arg3.method1489(arg3.anInt1804, arg3.anInt1788);
			return;
		}
		@Pc(848) byte local848;
		if (local7 == -1) {
			local848 = Static121.aByteArray13[arg2];
		} else {
			local848 = local7;
		}
		Static245.method3710(local848, arg3);
		arg3.method1492(arg3.anInt1788, arg3.anInt1804, local848);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIILclient!ha;IIIIILclient!mfa;I)V")
	public static void method6274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class3_Sub5_Sub13 arg10) {
		if (arg3 > arg2 && arg3 < arg6 + arg2 && arg1 - 13 < arg0 && arg1 + 3 > arg0) {
			arg5 = arg7;
		}
		@Pc(36) String local36 = Static16.method8270(arg10);
		Static293.aClass67_14.method7673(arg5, Static454.anIntArray397, Static470.aClass6Array11, arg1, arg2 + 3, local36);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6275(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static194.anInt3515 = 0;
		Static313.anInt9097 = 0;
		Static276.anInt4711++;
		@Pc(21) Class34_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static368.aClass34_Sub1Array3[local5]; local21 != null; local21 = local21.aClass34_Sub1_23) {
				if (!Static67.method1226(local21, arg0, arg1, arg2, arg3)) {
					Static205.method3068(local21);
					if (local21.anInt9617 != -1) {
						Static137.aClass34_Sub1Array1[Static194.anInt3515++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static218.aClass34_Sub1Array2[local5]; local21 != null; local21 = local21.aClass34_Sub1_23) {
				if (!Static67.method1226(local21, arg0, arg1, arg2, arg3)) {
					Static205.method3068(local21);
					if (local21.anInt9617 != -1) {
						Static428.aClass34_Sub1Array5[Static313.anInt9097++] = local21;
					}
				}
			}
			for (@Pc(87) Class34_Sub1 local87 = Static392.aClass34_Sub1Array4[local5]; local87 != null; local87 = local87.aClass34_Sub1_23) {
				if (!Static67.method1226(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method7853()) {
						Static205.method3068(local87);
						if (local87.anInt9617 != -1) {
							Static428.aClass34_Sub1Array5[Static313.anInt9097++] = local87;
						}
					} else {
						Static205.method3068(local87);
						if (local87.anInt9617 != -1) {
							Static137.aClass34_Sub1Array1[Static194.anInt3515++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static23.anInt559; local137++) {
					if (!Static67.method1226(Static579.aClass34_Sub1_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static205.method3068(Static579.aClass34_Sub1_Sub1Array1[local137]);
						if (Static579.aClass34_Sub1_Sub1Array1[local137].anInt9617 != -1) {
							if (Static579.aClass34_Sub1_Sub1Array1[local137].method7853()) {
								Static428.aClass34_Sub1Array5[Static313.anInt9097++] = Static579.aClass34_Sub1_Sub1Array1[local137];
							} else {
								Static137.aClass34_Sub1Array1[Static194.anInt3515++] = Static579.aClass34_Sub1_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static194.anInt3515 > 0) {
			Static309.method4446(Static137.aClass34_Sub1Array1, 0, Static194.anInt3515 - 1);
			for (local198 = 0; local198 < Static194.anInt3515; local198++) {
				Static321.method8425(Static137.aClass34_Sub1Array1[local198], arg6);
			}
		}
		if (Static331.aBoolean356) {
			Static50.aClass95_1.method8018(0, (Class3_Sub13[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static403.anInt10576; local198 < Static247.anInt4367; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static375.aBooleanArrayArray6.length;
					if (Static72.anInt1420 + Static375.aBooleanArrayArray6.length > Static133.anInt2551) {
						local230 -= Static72.anInt1420 + Static375.aBooleanArrayArray6.length - Static133.anInt2551;
					}
					local137 = Static375.aBooleanArrayArray6[0].length;
					if (Static608.anInt10133 + Static375.aBooleanArrayArray6[0].length > Static155.anInt2874) {
						local137 -= Static608.anInt10133 + Static375.aBooleanArrayArray6[0].length - Static155.anInt2874;
					}
					local271 = Static591.aBooleanArrayArray9;
					if (Static75.aBoolean105) {
						if (Static626.aBoolean718) {
							local271 = Static30.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static79.anInt1495; local281 < local230; local281++) {
							local288 = local281 + Static72.anInt1420 - Static79.anInt1495;
							for (local290 = Static675.anInt10913; local290 < local137; local290++) {
								if (Static375.aBooleanArrayArray6[local281][local290] && !Static674.method8987(local198, local288, local290 + Static608.anInt10133 - Static675.anInt10913)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static626.aBoolean718) {
						if (arg4 >= 0) {
							Static582.aClass35Array3[local198].method7451(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static582.aClass35Array3[local198].method7458(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static270.anInt4661; local281++) {
							Static304.aClass283Array1[local281].method6200(new Class34_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static582.aClass35Array3[local198].method7451(Static88.anInt1826, Static353.anInt6041, Static362.anInt6205, Static591.aBooleanArrayArray9, true, arg4, arg5);
					} else {
						Static582.aClass35Array3[local198].method7458(Static88.anInt1826, Static353.anInt6041, Static362.anInt6205, Static591.aBooleanArrayArray9, true, arg5);
					}
				} else {
					local230 = Static375.aBooleanArrayArray6.length;
					if (Static72.anInt1420 + Static375.aBooleanArrayArray6.length > Static133.anInt2551) {
						local230 -= Static72.anInt1420 + Static375.aBooleanArrayArray6.length - Static133.anInt2551;
					}
					local137 = Static375.aBooleanArrayArray6[0].length;
					if (Static608.anInt10133 + Static375.aBooleanArrayArray6[0].length > Static155.anInt2874) {
						local137 -= Static608.anInt10133 + Static375.aBooleanArrayArray6[0].length - Static155.anInt2874;
					}
					local271 = Static591.aBooleanArrayArray9;
					if (Static75.aBoolean105) {
						if (Static626.aBoolean718) {
							local271 = Static30.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static79.anInt1495; local281 < local230; local281++) {
							local288 = local281 + Static72.anInt1420 - Static79.anInt1495;
							for (local290 = Static675.anInt10913; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static375.aBooleanArrayArray6[local281][local290]) {
									@Pc(309) int local309 = local290 + Static608.anInt10133 - Static675.anInt10913;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static254.aClass368ArrayArrayArray2[local311][local288][local309] != null && Static254.aClass368ArrayArrayArray2[local311][local288][local309].aByte143 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static674.method8987(local198, local288, local309)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static626.aBoolean718) {
						if (arg4 >= 0) {
							Static582.aClass35Array3[local198].method7451(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static582.aClass35Array3[local198].method7458(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static270.anInt4661; local281++) {
							Static304.aClass283Array1[local281].method6200(new Class34_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static582.aClass35Array3[local198].method7451(Static88.anInt1826, Static353.anInt6041, Static362.anInt6205, Static591.aBooleanArrayArray9, false, arg4, arg5);
					} else {
						Static582.aClass35Array3[local198].method7458(Static88.anInt1826, Static353.anInt6041, Static362.anInt6205, Static591.aBooleanArrayArray9, false, arg5);
					}
				}
			}
		}
		if (Static313.anInt9097 > 0) {
			Static676.method9002(Static428.aClass34_Sub1Array5, 0, Static313.anInt9097 - 1);
			for (local198 = 0; local198 < Static313.anInt9097; local198++) {
				Static321.method8425(Static428.aClass34_Sub1Array5[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIFII[BIFFFIFILclient!mm;)V")
	public static void method6276(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(11) float arg7, @OriginalArg(13) Class209 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg8.method4977(arg1 / (float) 16, local12, arg2, 0, arg7 / (float) 128, arg4 * 127.0F, arg5 / (float) 128);
			local42 = arg0;
			arg5 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg3[local42] = (byte) (int) ((float) arg3[local42] + local12[local48]);
				local42++;
			}
			arg7 *= 2.0F;
			arg1 *= 2.0F;
			arg4 *= arg6;
		}
		local42 = arg0;
		for (local48 = 0; local48 < 16384; local48++) {
			arg3[local42] = (byte) (arg3[local42] + 127);
			local42++;
		}
	}
}
