import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!rd;")
	public static Class1_Sub21 aClass1_Sub21_1;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt1832 = -1;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_629 = Static120.method2057("::noclip");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_630 = Static120.method2057(":assistreq:");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1347() {
		aClass81_630 = null;
		aClass1_Sub21_1 = null;
		aClass81_629 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[Lclient!gf;)V")
	public static void method1348(@OriginalArg(1) Class28[] arg0) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static43.aByteArrayArrayArray2[local3][local7][local11] & 0x1) == 1) {
						@Pc(28) int local28 = local3;
						if ((Static43.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method1043(local11, local7);
						}
					}
				}
			}
		}
		Static133.anInt2873 += (int) (Math.random() * 5.0D) - 2;
		if (Static133.anInt2873 < -16) {
			Static133.anInt2873 = -16;
		}
		Static50.anInt1175 += (int) (Math.random() * 5.0D) - 2;
		if (Static133.anInt2873 > 16) {
			Static133.anInt2873 = 16;
		}
		if (Static50.anInt1175 < -8) {
			Static50.anInt1175 = -8;
		}
		if (Static50.anInt1175 > 8) {
			Static50.anInt1175 = 8;
		}
		local7 = Static50.anInt1175 >> 2 << 10;
		@Pc(115) int[][] local115 = new int[104][104];
		@Pc(119) int[][] local119 = new int[104][104];
		local11 = Static133.anInt2873 >> 1;
		@Pc(142) int local142;
		@Pc(150) int local150;
		@Pc(152) int local152;
		@Pc(156) int local156;
		@Pc(246) int local246;
		@Pc(201) int local201;
		@Pc(181) int local181;
		@Pc(214) int local214;
		@Pc(220) int local220;
		@Pc(230) int local230;
		@Pc(226) int local226;
		@Pc(295) int local295;
		@Pc(510) int local510;
		@Pc(506) int local506;
		@Pc(802) int local802;
		for (@Pc(130) int local130 = 0; local130 < 4; local130++) {
			@Pc(136) byte[][] local136 = Static168.aByteArrayArrayArray9[local130];
			local142 = (int) Math.sqrt(5100.0D);
			local150 = local142 * 768 >> 8;
			for (local152 = 1; local152 < 103; local152++) {
				for (local156 = 1; local156 < 103; local156++) {
					local181 = Static157.anIntArrayArrayArray7[local130][local156][local152 + 1] - Static157.anIntArrayArrayArray7[local130][local156][local152 - 1];
					local201 = Static157.anIntArrayArrayArray7[local130][local156 + 1][local152] - Static157.anIntArrayArrayArray7[local130][local156 - 1][local152];
					local214 = (int) Math.sqrt((double) (local181 * local181 + local201 * local201 + 65536));
					local220 = (local201 << 8) / local214;
					local226 = (local181 << 8) / local214;
					local230 = 65536 / local214;
					local246 = (local226 * -50 + local230 * -10 + local220 * -50) / local150 + 96;
					local295 = (local136[local156][local152] >> 1) + (local136[local156][local152 + 1] >> 3) + (local136[local156 + -1][local152] >> 2) + (local136[local156 + 1][local152] >> 3) + (local136[local156][local152 - 1] >> 2);
					local119[local156][local152] = local246 - local295;
				}
			}
			for (local156 = 0; local156 < 104; local156++) {
				Static64.anIntArray130[local156] = 0;
				Static89.anIntArray425[local156] = 0;
				Static149.anIntArray353[local156] = 0;
				Static128.anIntArray303[local156] = 0;
				Static73.anIntArray154[local156] = 0;
			}
			for (local246 = -5; local246 < 104; local246++) {
				for (local201 = 0; local201 < 104; local201++) {
					local181 = local246 + 5;
					@Pc(410) int local410;
					if (local181 < 104) {
						local214 = Static146.aByteArrayArrayArray8[local130][local181][local201] & 0xFF;
						if (local214 > 0) {
							@Pc(374) Class1_Sub2_Sub14 local374 = Static71.method1254(local214 - 1);
							Static64.anIntArray130[local201] += local374.anInt2968;
							Static89.anIntArray425[local201] += local374.anInt2976;
							Static149.anIntArray353[local201] += local374.anInt2970;
							Static128.anIntArray303[local201] += local374.anInt2972;
							local410 = Static73.anIntArray154[local201]++;
						}
					}
					local214 = local246 - 5;
					if (local214 >= 0) {
						local220 = Static146.aByteArrayArrayArray8[local130][local214][local201] & 0xFF;
						if (local220 > 0) {
							@Pc(440) Class1_Sub2_Sub14 local440 = Static71.method1254(local220 - 1);
							Static64.anIntArray130[local201] -= local440.anInt2968;
							Static89.anIntArray425[local201] -= local440.anInt2976;
							Static149.anIntArray353[local201] -= local440.anInt2970;
							Static128.anIntArray303[local201] -= local440.anInt2972;
							local410 = Static73.anIntArray154[local201]--;
						}
					}
				}
				if (local246 >= 0) {
					local181 = 0;
					local230 = 0;
					local214 = 0;
					local220 = 0;
					local226 = 0;
					for (local295 = -5; local295 < 104; local295++) {
						local506 = local295 - 5;
						local510 = local295 + 5;
						if (local510 < 104) {
							local214 += Static89.anIntArray425[local510];
							local181 += Static64.anIntArray130[local510];
							local230 += Static128.anIntArray303[local510];
							local220 += Static149.anIntArray353[local510];
							local226 += Static73.anIntArray154[local510];
						}
						if (local506 >= 0) {
							local220 -= Static149.anIntArray353[local506];
							local214 -= Static89.anIntArray425[local506];
							local181 -= Static64.anIntArray130[local506];
							local230 -= Static128.anIntArray303[local506];
							local226 -= Static73.anIntArray154[local506];
						}
						if (local295 >= 0 && local226 > 0) {
							local115[local246][local295] = Static19.method394(local220 / local226, local181 * 256 / local230, local214 / local226);
						}
					}
				}
			}
			for (local201 = 1; local201 < 103; local201++) {
				for (local181 = 1; local181 < 103; local181++) {
					if (!Static50.aBoolean45 || (Static43.aByteArrayArrayArray2[0][local201][local181] & 0x2) != 0 || (Static43.aByteArrayArrayArray2[local130][local201][local181] & 0x10) == 0 && Static166.method2912(local201, local181, local130) == Static77.anInt1824) {
						if (local130 < Static54.anInt1304) {
							Static54.anInt1304 = local130;
						}
						local220 = Static109.aByteArrayArrayArray7[local130][local201][local181] & 0xFF;
						local214 = Static146.aByteArrayArrayArray8[local130][local201][local181] & 0xFF;
						if (local214 > 0 || local220 > 0) {
							local230 = Static157.anIntArrayArrayArray7[local130][local201][local181];
							local226 = Static157.anIntArrayArrayArray7[local130][local201 + 1][local181];
							local295 = Static157.anIntArrayArrayArray7[local130][local201 + 1][local181 + 1];
							local510 = Static157.anIntArrayArrayArray7[local130][local201][local181 + 1];
							if (local130 > 0) {
								@Pc(736) boolean local736 = true;
								if (local214 == 0 && Static26.aByteArrayArrayArray1[local130][local201][local181] != 0) {
									local736 = false;
								}
								if (local220 > 0 && !Static44.method821(local220 - 1).aBoolean150) {
									local736 = false;
								}
								if (local736 && local230 == local226 && local295 == local230 && local230 == local510) {
									Static166.anIntArrayArrayArray8[local130][local201][local181] |= 0x924;
								}
							}
							@Pc(817) int local817;
							@Pc(841) int local841;
							if (local214 <= 0) {
								local506 = -1;
								local802 = 0;
							} else {
								local506 = local115[local201][local181];
								local817 = (local506 & 0x7F) + local11;
								if (local817 < 0) {
									local817 = 0;
								} else if (local817 > 127) {
									local817 = 127;
								}
								local841 = (local506 & 0x380) + (local506 + local7 & 0xFC00) + local817;
								local802 = Static22.anIntArray29[method1349(local841, 96)];
							}
							local817 = local119[local201][local181];
							local841 = local119[local201 + 1][local181];
							@Pc(872) int local872 = local119[local201 + 1][local181 + 1];
							@Pc(880) int local880 = local119[local201][local181 + 1];
							if (local220 == 0) {
								Static131.method2248(local130, local201, local181, 0, 0, -1, local230, local226, local295, local510, method1349(local506, local817), method1349(local506, local841), method1349(local506, local872), method1349(local506, local880), 0, 0, 0, 0, local802, 0);
							} else {
								@Pc(893) byte local893 = Static114.aByteArrayArrayArray6[local130][local201][local181];
								@Pc(903) int local903 = Static26.aByteArrayArrayArray1[local130][local201][local181] + 1;
								@Pc(911) Class1_Sub2_Sub16 local911 = Static44.method821(local220 - 1);
								@Pc(914) int local914 = local911.anInt3557;
								if (local914 >= 0 && !Static22.anInterface3_2.method1029(local914)) {
									local914 = -1;
								}
								@Pc(939) int local939;
								@Pc(937) int local937;
								@Pc(955) int local955;
								@Pc(979) int local979;
								if (local914 >= 0) {
									local937 = Static22.anIntArray29[Static88.method1499(96, Static22.anInterface3_2.method1027(local914))];
									local939 = -1;
								} else if (local911.anInt3558 == -1) {
									local939 = -2;
									local937 = 0;
								} else {
									local939 = local911.anInt3558;
									local955 = local11 + (local939 & 0x7F);
									if (local955 < 0) {
										local955 = 0;
									} else if (local955 > 127) {
										local955 = 127;
									}
									local979 = (local939 & 0x380) + (local939 + local7 & 0xFC00) + local955;
									local937 = Static22.anIntArray29[Static88.method1499(96, local979)];
								}
								if (local911.anInt3551 >= 0) {
									local955 = local911.anInt3551;
									local979 = local11 + (local955 & 0x7F);
									if (local979 < 0) {
										local979 = 0;
									} else if (local979 > 127) {
										local979 = 127;
									}
									@Pc(1032) int local1032 = (local955 + local7 & 0xFC00) - (-(local955 & 0x380) - local979);
									local937 = Static22.anIntArray29[Static88.method1499(96, local1032)];
								}
								Static131.method2248(local130, local201, local181, local903, local893, local914, local230, local226, local295, local510, method1349(local506, local817), method1349(local506, local841), method1349(local506, local872), method1349(local506, local880), Static88.method1499(local817, local939), Static88.method1499(local841, local939), Static88.method1499(local872, local939), Static88.method1499(local880, local939), local802, local937);
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local214 = 1; local214 < 103; local214++) {
					Static72.method1258(local130, local214, local181, Static166.method2912(local214, local181, local130));
				}
			}
			Static146.aByteArrayArrayArray8[local130] = null;
			Static109.aByteArrayArrayArray7[local130] = null;
			Static26.aByteArrayArrayArray1[local130] = null;
			Static114.aByteArrayArrayArray6[local130] = null;
			Static168.aByteArrayArrayArray9[local130] = null;
		}
		Static98.method1644();
		@Pc(1196) int local1196;
		for (@Pc(1192) int local1192 = 0; local1192 < 104; local1192++) {
			for (local1196 = 0; local1196 < 104; local1196++) {
				if ((Static43.aByteArrayArrayArray2[1][local1192][local1196] & 0x2) == 2) {
					Static140.method2367(local1192, local1196);
				}
			}
		}
		local1196 = 1;
		@Pc(1230) int local1230 = 2;
		local142 = 4;
		for (local150 = 0; local150 < 4; local150++) {
			if (local150 > 0) {
				local1196 <<= 0x3;
				local1230 <<= 0x3;
				local142 <<= 0x3;
			}
			for (local152 = 0; local152 <= local150; local152++) {
				for (local156 = 0; local156 <= 104; local156++) {
					for (local246 = 0; local246 <= 104; local246++) {
						if ((local1196 & Static166.anIntArrayArrayArray8[local152][local246][local156]) != 0) {
							for (local201 = local156; local201 > 0 && (local1196 & Static166.anIntArrayArrayArray8[local152][local246][local201 - 1]) != 0; local201--) {
							}
							local181 = local156;
							local214 = local152;
							while (local181 < 104 && (Static166.anIntArrayArrayArray8[local152][local246][local181 + 1] & local1196) != 0) {
								local181++;
							}
							local220 = local152;
							label350: while (local214 > 0) {
								for (local230 = local201; local230 <= local181; local230++) {
									if ((local1196 & Static166.anIntArrayArrayArray8[local214 - 1][local246][local230]) == 0) {
										break label350;
									}
								}
								local214--;
							}
							label339: while (local220 < local150) {
								for (local230 = local201; local230 <= local181; local230++) {
									if ((local1196 & Static166.anIntArrayArrayArray8[local220 + 1][local246][local230]) == 0) {
										break label339;
									}
								}
								local220++;
							}
							local230 = (local220 + 1 - local214) * ((local181 - local201) + 1);
							if (local230 >= 8) {
								local295 = Static157.anIntArrayArrayArray7[local220][local246][local201] - 240;
								local510 = Static157.anIntArrayArrayArray7[local214][local246][local201];
								Static103.method1702(local150, 1, local246 * 128, local246 * 128, local201 * 128, local181 * 128 + 128, local295, local510);
								for (local506 = local214; local506 <= local220; local506++) {
									for (local802 = local201; local802 <= local181; local802++) {
										Static166.anIntArrayArrayArray8[local506][local246][local802] &= ~local1196;
									}
								}
							}
						}
						if ((Static166.anIntArrayArrayArray8[local152][local246][local156] & local1230) != 0) {
							local201 = local246;
							local181 = local246;
							while (local201 > 0 && (local1230 & Static166.anIntArrayArrayArray8[local152][local201 - 1][local156]) != 0) {
								local201--;
							}
							while (local181 < 104 && (local1230 & Static166.anIntArrayArrayArray8[local152][local181 + 1][local156]) != 0) {
								local181++;
							}
							local214 = local152;
							local220 = local152;
							label405: while (local214 > 0) {
								for (local230 = local201; local230 <= local181; local230++) {
									if ((local1230 & Static166.anIntArrayArrayArray8[local214 - 1][local230][local156]) == 0) {
										break label405;
									}
								}
								local214--;
							}
							label394: while (local220 < local150) {
								for (local230 = local201; local230 <= local181; local230++) {
									if ((Static166.anIntArrayArrayArray8[local220 + 1][local230][local156] & local1230) == 0) {
										break label394;
									}
								}
								local220++;
							}
							local230 = (local220 + 1 - local214) * (local181 + 1 - local201);
							if (local230 >= 8) {
								local510 = Static157.anIntArrayArrayArray7[local214][local201][local156];
								local295 = Static157.anIntArrayArrayArray7[local220][local201][local156] - 240;
								Static103.method1702(local150, 2, local201 * 128, local181 * 128 + 128, local156 * 128, local156 * 128, local295, local510);
								for (local506 = local214; local506 <= local220; local506++) {
									for (local802 = local201; local802 <= local181; local802++) {
										Static166.anIntArrayArrayArray8[local506][local802][local156] &= ~local1230;
									}
								}
							}
						}
						if ((local142 & Static166.anIntArrayArrayArray8[local152][local246][local156]) != 0) {
							local181 = local246;
							local214 = local156;
							local201 = local246;
							for (local220 = local156; local220 < 104 && (local142 & Static166.anIntArrayArrayArray8[local152][local246][local220 + 1]) != 0; local220++) {
							}
							while (local214 > 0 && (local142 & Static166.anIntArrayArrayArray8[local152][local246][local214 - 1]) != 0) {
								local214--;
							}
							label459: while (local201 > 0) {
								for (local230 = local214; local230 <= local220; local230++) {
									if ((local142 & Static166.anIntArrayArrayArray8[local152][local201 - 1][local230]) == 0) {
										break label459;
									}
								}
								local201--;
							}
							label448: while (local181 < 104) {
								for (local230 = local214; local230 <= local220; local230++) {
									if ((Static166.anIntArrayArrayArray8[local152][local181 + 1][local230] & local142) == 0) {
										break label448;
									}
								}
								local181++;
							}
							if ((local181 + 1 - local201) * ((local220 - local214) + 1) >= 4) {
								local230 = Static157.anIntArrayArrayArray7[local152][local201][local214];
								Static103.method1702(local150, 4, local201 * 128, local181 * 128 + 128, local214 * 128, local220 * 128 + 128, local230, local230);
								for (local226 = local201; local226 <= local181; local226++) {
									for (local295 = local214; local295 <= local220; local295++) {
										Static166.anIntArrayArrayArray8[local152][local226][local295] &= ~local142;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	private static int method1349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
