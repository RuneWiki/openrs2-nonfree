import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "Lclient!it;")
	public static final Class149 aClass149_7 = new Class149();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!qa;ZI)V")
	public static void method6589(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static242.anInt4984 == 0 || Static181.anInt4090 == 0) {
			return;
		}
		arg1.b(Static131.anInt2993, Static389.anInt7391, Static242.anInt4984, Static181.anInt4090);
		arg1.N(Static82.anInt1961, Static157.anInt3414, Static242.anInt4984, Static181.anInt4090);
		@Pc(35) Class91 local35 = arg1.method5829();
		local35.B(Static188.anInt4277, Static516.anInt9258, Static334.anInt6399, Static516.anInt9255, Static290.anInt5629, Static350.anInt6551);
		arg1.method5855(local35);
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(80) int local80;
		@Pc(89) int local89;
		@Pc(98) int local98;
		@Pc(113) int[] local113;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static155.aClass215Array5 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			local59 = arg1.c();
			local68 = local59 * (arg0 - Static131.anInt2993) / Static242.anInt4984;
			local77 = local59 * (arg2 - Static389.anInt7391) / Static181.anInt4090;
			local80 = arg1.CA();
			local89 = (arg0 - Static131.anInt2993) * local80 / Static242.anInt4984;
			local98 = (arg2 - Static389.anInt7391) * local80 / Static181.anInt4090;
			local113 = new int[] { local68, local77, local59 };
			local35.va(local113);
			@Pc(131) int[] local131 = new int[] { local89, local98, local80 };
			local35.va(local131);
			@Pc(136) float local136 = 0.0F;
			local144 = local131[0] - local113[0];
			local153 = local131[1] - local113[1];
			@Pc(162) int local162 = local131[2] - local113[2];
			while (local136 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local144 * local136 + (float) local113[0]);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local113[2] + (float) local162 * local136);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && Static37.anInt7512 > local179 && Static329.anInt6247 > local194) {
					@Pc(215) int local215 = Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99;
					if (local215 < 3 && (Static387.aByteArrayArrayArray18[1][local179][local194] & 0x2) != 0) {
						local215++;
					}
					if ((float) Static155.aClass215Array5[local215].aa(local175, local190) < (float) local153 * local136 + (float) local113[1]) {
						local54 = local175 + (Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() - 1 << 6) >> 7;
						local56 = (Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() - 1 << 6) + local190 >> 7;
						break;
					}
				}
				local136 = (float) ((double) local136 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Static73.aBoolean136 && (Static266.anInt5318 & 0x40) != 0) {
					@Pc(305) Class198 local305 = Static428.method6579(Static155.anInt3381, Static148.anInt6865);
					if (local305 == null) {
						Static227.method4101();
					} else {
						Static160.method3297(" ->", local56, local54, 45, -1, true, 0L, Static274.aString59, Static156.anInt3411, false);
					}
				} else {
					if (Static518.aClass138_8 == Static293.aClass138_7) {
						Static160.method3297("", local56, local54, 49, -1, true, 0L, Static483.aClass88_261.method2391(Static345.anInt6495), -1, false);
					}
					Static160.method3297("", local56, local54, 5, -1, true, 0L, Static261.aString55, Static455.anInt8710, false);
				}
			}
		}
		@Pc(361) Class149 local361 = Static246.aClass149_3;
		for (@Pc(366) Class7_Sub8 local366 = (Class7_Sub8) local361.method3989(); local366 != null; local366 = (Class7_Sub8) local361.method3986()) {
			if ((Static518.aBoolean660 || local366.anInt9366 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) && local366.method7762(arg0, arg2, arg1)) {
				@Pc(494) int local494;
				@Pc(506) int local506;
				if (local366.aClass30_1 instanceof Class30_Sub1_Sub1_Sub1) {
					@Pc(390) Class30_Sub1_Sub1_Sub1 local390 = (Class30_Sub1_Sub1_Sub1) local366.aClass30_1;
					local68 = local390.method3591();
					if ((local68 & 0x1) == 0 && (local390.anInt9418 & 0x7F) == 0 && (local390.anInt9416 & 0x7F) == 0 || (local68 & 0x1) == 1 && (local390.anInt9418 & 0x7F) == 64 && (local390.anInt9416 & 0x7F) == 64) {
						local77 = local390.anInt9418 - (local390.method3591() - 1 << 6);
						local80 = local390.anInt9416 - (local390.method3591() - 1 << 6);
						for (local89 = 0; local89 < Static451.anInt4553; local89++) {
							@Pc(468) Class12_Sub41 local468 = (Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local89]);
							if (local468 != null) {
								@Pc(473) Class30_Sub1_Sub1_Sub2 local473 = local468.aClass30_Sub1_Sub1_Sub2_2;
								if (Static409.anInt7683 != local473.anInt4186 && local473.aBoolean334) {
									local494 = local473.anInt9418 - (local473.aClass130_1.anInt4113 - 1 << 6);
									local506 = local473.anInt9416 - (local473.aClass130_1.anInt4113 - 1 << 6);
									if (local494 >= local77 && local473.aClass130_1.anInt4113 <= local390.method3591() - (local494 - local77 >> 7) && local506 >= local80 && local473.aClass130_1.anInt4113 <= local390.method3591() - (local506 - local80 >> 7)) {
										Static392.method6186(local473, local366.anInt9366 != Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99);
										local473.anInt4186 = Static409.anInt7683;
									}
								}
							}
						}
						local98 = Static381.anInt7254;
						local113 = Static496.anIntArray465;
						for (local494 = 0; local494 < local98; local494++) {
							@Pc(588) Class30_Sub1_Sub1_Sub1 local588 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local113[local494]];
							if (local588 != null && Static409.anInt7683 != local588.anInt4186 && local390 != local588 && local588.aBoolean334) {
								local144 = local588.anInt9418 - (local588.method3591() - 1 << 6);
								local153 = local588.anInt9416 - (local588.method3591() - 1 << 6);
								if (local77 <= local144 && local588.method3591() <= local390.method3591() - (local144 - local77 >> 7) && local80 <= local153 && local588.method3591() <= local390.method3591() - (local153 - local80 >> 7)) {
									Static51.method7362(Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local366.anInt9366, local588);
									local588.anInt4186 = Static409.anInt7683;
								}
							}
						}
					}
					if (local390.anInt4186 == Static409.anInt7683) {
						continue;
					}
					Static51.method7362(Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local366.anInt9366, local390);
					local390.anInt4186 = Static409.anInt7683;
				}
				@Pc(827) int local827;
				if (local366.aClass30_1 instanceof Class30_Sub1_Sub1_Sub2) {
					@Pc(717) Class30_Sub1_Sub1_Sub2 local717 = (Class30_Sub1_Sub1_Sub2) local366.aClass30_1;
					if (local717.aClass130_1 != null) {
						if ((local717.aClass130_1.anInt4113 & 0x1) == 0 && (local717.anInt9418 & 0x7F) == 0 && (local717.anInt9416 & 0x7F) == 0 || (local717.aClass130_1.anInt4113 & 0x1) == 1 && (local717.anInt9418 & 0x7F) == 64 && (local717.anInt9416 & 0x7F) == 64) {
							local68 = local717.anInt9418 - (local717.aClass130_1.anInt4113 - 1 << 6);
							local77 = local717.anInt9416 - (local717.aClass130_1.anInt4113 - 1 << 6);
							for (local80 = 0; local80 < Static451.anInt4553; local80++) {
								@Pc(798) Class12_Sub41 local798 = (Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local80]);
								if (local798 != null) {
									@Pc(803) Class30_Sub1_Sub1_Sub2 local803 = local798.aClass30_Sub1_Sub1_Sub2_2;
									if (local803.anInt4186 != Static409.anInt7683 && local717 != local803 && local803.aBoolean334) {
										local827 = local803.anInt9418 - (local803.aClass130_1.anInt4113 - 1 << 6);
										local494 = local803.anInt9416 - (local803.aClass130_1.anInt4113 - 1 << 6);
										if (local827 >= local68 && local717.aClass130_1.anInt4113 - (local827 - local68 >> 7) >= local803.aClass130_1.anInt4113 && local77 <= local494 && local803.aClass130_1.anInt4113 <= local717.aClass130_1.anInt4113 - (local494 - local77 >> 7)) {
											Static392.method6186(local803, local366.anInt9366 != Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99);
											local803.anInt4186 = Static409.anInt7683;
										}
									}
								}
							}
							local89 = Static381.anInt7254;
							@Pc(904) int[] local904 = Static496.anIntArray465;
							for (local827 = 0; local827 < local89; local827++) {
								@Pc(914) Class30_Sub1_Sub1_Sub1 local914 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local904[local827]];
								if (local914 != null && Static409.anInt7683 != local914.anInt4186 && local914.aBoolean334) {
									local506 = local914.anInt9418 - (local914.method3591() - 1 << 6);
									local144 = local914.anInt9416 - (local914.method3591() - 1 << 6);
									if (local506 >= local68 && local914.method3591() <= local717.aClass130_1.anInt4113 - (local506 - local68 >> 7) && local144 >= local77 && local914.method3591() <= local717.aClass130_1.anInt4113 - (local144 - local77 >> 7)) {
										Static51.method7362(Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local366.anInt9366, local914);
										local914.anInt4186 = Static409.anInt7683;
									}
								}
							}
						}
						if (Static409.anInt7683 == local717.anInt4186) {
							continue;
						}
						Static392.method6186(local717, local366.anInt9366 != Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99);
						local717.anInt4186 = Static409.anInt7683;
					}
				}
				if (local366.aClass30_1 instanceof Class30_Sub5_Sub1) {
					local59 = local366.anInt9370 + Static61.anInt1459;
					local68 = local366.anInt9368 + Static203.anInt4534;
					@Pc(1070) Class12_Sub28 local1070 = (Class12_Sub28) Static295.aClass68_45.method1917((long) (local59 | local366.anInt9366 << 28 | local68 << 14));
					if (local1070 != null) {
						for (@Pc(1078) Class12_Sub46 local1078 = (Class12_Sub46) local1070.aClass73_42.method2016(); local1078 != null; local1078 = (Class12_Sub46) local1070.aClass73_42.method2004()) {
							@Pc(1086) Class56 local1086 = Static150.aClass254_2.method6340(local1078.anInt8179);
							if (!Static73.aBoolean136) {
								if (Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 == local366.anInt9366) {
									@Pc(1096) String[] local1096 = local1086.aStringArray6;
									for (local827 = 4; local827 >= 0; local827--) {
										if (local1096 != null && local1096[local827] != null) {
											@Pc(1108) byte local1108 = 0;
											if (local827 == 0) {
												local1108 = 19;
											}
											local506 = Static252.anInt5200;
											if (local827 == 1) {
												local1108 = 8;
											}
											if (local827 == 2) {
												local1108 = 9;
											}
											if (local827 == 3) {
												local1108 = 48;
											}
											if (local827 == local1086.anInt1651) {
												local506 = local1086.anInt1612;
											}
											if (local827 == 4) {
												local1108 = 18;
											}
											if (local1086.anInt1629 == local827) {
												local506 = local1086.anInt1665;
											}
											Static160.method3297("<col=ff9040>" + local1086.aString12, local366.anInt9368, local366.anInt9370, local1108, -1, true, (long) local1078.anInt8179, local1096[local827], local506, false);
										}
									}
								}
								Static160.method3297("<col=ff9040>" + local1086.aString12, local366.anInt9368, local366.anInt9370, 1007, -1, true, (long) local1078.anInt8179, Static481.aClass88_255.method2391(Static345.anInt6495), Static258.anInt5238, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local366.anInt9366);
							} else if (local366.anInt9366 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) {
								@Pc(1250) Class213 local1250 = Static147.anInt3219 == -1 ? null : Static453.aClass258_2.method6426(Static147.anInt3219);
								if ((Static266.anInt5318 & 0x1) != 0 && (local1250 == null || local1086.method1569(Static147.anInt3219, local1250.anInt6063) != local1250.anInt6063)) {
									Static160.method3297(Static497.aString104 + " -> <col=ff9040>" + local1086.aString12, local366.anInt9368, local366.anInt9370, 2, -1, true, (long) local1078.anInt8179, Static274.aString59, Static156.anInt3411, false);
								}
							}
						}
					}
				}
				if (local366.aClass30_1 instanceof Interface19) {
					@Pc(1311) Interface19 local1311 = (Interface19) local366.aClass30_1;
					@Pc(1318) Class279 local1318 = Static49.aClass155_2.method4063(local1311.method7915());
					if (local1318.anIntArray620 != null) {
						local1318 = local1318.method6881(Static393.aClass31_1);
					}
					if (local1318 != null) {
						if (!Static73.aBoolean136) {
							if (local366.anInt9366 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) {
								@Pc(1342) String[] local1342 = local1318.aStringArray57;
								if (local1342 != null) {
									for (local80 = 4; local80 >= 0; local80--) {
										if (local1342[local80] != null) {
											@Pc(1354) short local1354 = 0;
											local98 = Static252.anInt5200;
											if (local80 == 0) {
												local1354 = 59;
											}
											if (local80 == 1) {
												local1354 = 57;
											}
											if (local80 == 2) {
												local1354 = 22;
											}
											if (local80 == 3) {
												local1354 = 10;
											}
											if (local80 == 4) {
												local1354 = 1011;
											}
											if (local80 == local1318.anInt8281) {
												local98 = local1318.anInt8279;
											}
											if (local80 == local1318.anInt8296) {
												local98 = local1318.anInt8313;
											}
											Static160.method3297("<col=00ffff>" + local1318.aString95, local366.anInt9368, local366.anInt9370, local1354, -1, true, Static346.method5436(local366.anInt9370, local366.anInt9368, local1311), local1342[local80], local98, false);
										}
									}
								}
							}
							Static160.method3297("<col=00ffff>" + local1318.aString95, local366.anInt9368, local366.anInt9370, 1008, -1, true, (long) local1318.anInt8315, Static481.aClass88_255.method2391(Static345.anInt6495), Static258.anInt5238, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 != local366.anInt9366);
						} else if (local366.anInt9366 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) {
							@Pc(1501) Class213 local1501 = Static147.anInt3219 == -1 ? null : Static453.aClass258_2.method6426(Static147.anInt3219);
							if ((Static266.anInt5318 & 0x4) != 0 && (local1501 == null || local1318.method6883(Static147.anInt3219, local1501.anInt6063) != local1501.anInt6063)) {
								Static160.method3297(Static497.aString104 + " -> <col=00ffff>" + local1318.aString95, local366.anInt9368, local366.anInt9370, 58, -1, true, Static346.method5436(local366.anInt9370, local366.anInt9368, local1311), Static274.aString59, Static156.anInt3411, false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BIILjava/lang/String;)I")
	public static int method6592(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg2.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local10++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg0[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg1;
	}
}
