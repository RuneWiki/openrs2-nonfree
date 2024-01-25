import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!via", name = "d", descriptor = "Lclient!lb;")
	public static Class221 aClass221_160;

	// $FF: synthetic field
	@OriginalMember(owner = "client!via", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass26;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method9029(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static362.anInt8653 - 104) / 2;
		@Pc(17) int local17 = (Static206.anInt11291 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(37) int local37;
		@Pc(50) int local50;
		for (@Pc(27) int local27 = local11; local27 < local11 + 104; local27++) {
			for (@Pc(33) int local33 = local17; local33 < local17 + 104; local33++) {
				for (local37 = arg1; local37 <= 3; local37++) {
					if (Static467.method6925(local37, local27, arg1, local33)) {
						local50 = local37;
						if (Static135.method2226(local27, local33)) {
							local50 = local37 - 1;
						}
						if (local50 >= 0) {
							local19 &= Static602.method8286(local27, local33, local50);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(107) int[] local107 = new int[262144];
		for (local37 = 0; local37 < local107.length; local37++) {
			local107[local37] = -16777216;
		}
		Static538.aClass9_20 = arg0.method7688(local107, 512, 512, 512);
		Static497.method7167();
		local50 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 228 - (-((int) (Math.random() * 20.0D) + 228 << 8) - ((int) (Math.random() * 20.0D))) | 0xFF000000;
		@Pc(181) int local181 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xB421FF00) << 16;
		@Pc(200) int local200 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(208) boolean[][] local208 = new boolean[Static536.anInt9014 + 3][Static536.anInt9014 + 3];
		@Pc(218) int local218;
		@Pc(224) int local224;
		@Pc(226) int local226;
		@Pc(228) int local228;
		@Pc(236) int local236;
		@Pc(248) int local248;
		@Pc(260) int local260;
		@Pc(288) int local288;
		@Pc(294) int local294;
		@Pc(360) int local360;
		@Pc(366) int local366;
		@Pc(370) int local370;
		@Pc(397) int local397;
		for (@Pc(210) int local210 = local11; local210 < local11 + 104; local210 += Static536.anInt9014) {
			for (local218 = local17; local218 < local17 + 104; local218 += Static536.anInt9014) {
				local224 = 0;
				local226 = 0;
				local228 = local210;
				if (local210 > 0) {
					local228 = local210 - 1;
					local224 += 4;
				}
				local236 = local218;
				if (local218 > 0) {
					local236 = local218 - 1;
				}
				local248 = local210 + Static536.anInt9014;
				if (local248 < 104) {
					local248++;
				}
				local260 = local218 + Static536.anInt9014;
				if (local260 < 104) {
					local226 += 4;
					local260++;
				}
				arg0.KA(0, 0, Static536.anInt9014 * 4 + local224, local226 + Static536.anInt9014 * 4);
				arg0.GA(-16777216);
				@Pc(300) int local300;
				for (local288 = arg1; local288 <= 3; local288++) {
					for (local294 = 0; local294 <= Static536.anInt9014; local294++) {
						for (local300 = 0; local300 <= Static536.anInt9014; local300++) {
							local208[local294][local300] = Static467.method6925(local288, local294 + local228, arg1, local236 + local300);
						}
					}
					Static167.aClass313Array1[local288].method9089(local228, local236, local248, local260, local208);
					if (!Static626.aBoolean732) {
						for (local300 = -4; local300 < Static536.anInt9014; local300++) {
							for (local360 = -4; local360 < Static536.anInt9014; local360++) {
								local366 = local210 + local300;
								local370 = local218 + local360;
								if (local366 >= local11 && local17 <= local370 && Static467.method6925(local288, local366, arg1, local370)) {
									local397 = local288;
									if (Static135.method2226(local366, local370)) {
										local397 = local288 - 1;
									}
									if (local397 >= 0) {
										Static113.method2018(local366, local224 + local300 * 4, local181, arg0, local397, local370, (Static536.anInt9014 - local360) * 4 + local226 - 4, local50);
									}
								}
							}
						}
					}
				}
				if (Static626.aBoolean732) {
					@Pc(466) Class360 local466 = Static678.aClass360Array5[arg1];
					for (local300 = 0; local300 < Static536.anInt9014; local300++) {
						for (local360 = 0; local360 < Static536.anInt9014; local360++) {
							local366 = local210 + local300;
							local370 = local218 + local360;
							local397 = local466.anIntArrayArray56[local366 - local466.anInt10108][local370 - local466.anInt10114];
							if ((local397 & 0x40240000) != 0) {
								arg0.method7696(local300 * 4 + local224, 4, 4, local226 + (Static536.anInt9014 - local360) * 4 - 4, -1713569622);
							} else if ((local397 & 0x800000) != 0) {
								arg0.method7701(local300 * 4 + local224, (-local360 + Static536.anInt9014) * 4 + local226 + -4, 4, -1713569622);
							} else if ((local397 & 0x2000000) != 0) {
								arg0.method7690(4, -1713569622, local224 + local300 * 4 + 3, (-local360 + Static536.anInt9014) * 4 + local226 - 4);
							} else if ((local397 & 0x8000000) != 0) {
								arg0.method7701(local224 + local300 * 4, 3 + -4 + (local226 - -((-local360 + Static536.anInt9014) * 4)), 4, -1713569622);
							} else if ((local397 & 0x20000000) != 0) {
								arg0.method7690(4, -1713569622, local300 * 4 + local224, (Static536.anInt9014 + -local360) * 4 + (local226 - 4));
							}
						}
					}
				}
				arg0.aa(local224, local226, Static536.anInt9014 * 4, Static536.anInt9014 * 4, local200, 2);
				Static538.aClass9_20.method8607((local210 - local11) * 4 + 48, -(Static536.anInt9014 * 4) + 464 + -((local218 - local17) * 4), Static536.anInt9014 * 4, Static536.anInt9014 * 4, local224, local226);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static693.method9085();
		Static339.anInt5860 = 0;
		Static229.aClass357_21.method8403();
		if (!Static626.aBoolean732) {
			for (local218 = local11; local218 < local11 + 104; local218++) {
				for (local224 = local17; local224 < local17 + 104; local224++) {
					for (local226 = arg1; local226 <= arg1 + 1 && local226 <= 3; local226++) {
						if (Static467.method6925(local226, local218, arg1, local224)) {
							@Pc(787) Interface19 local787 = (Interface19) Static724.method9433(local226, local218, local224);
							if (local787 == null) {
								local787 = (Interface19) Static89.method1199(local226, local218, local224, aClass26 == null ? (aClass26 = Class388.a("pe")) : aClass26);
							}
							if (local787 == null) {
								local787 = (Interface19) Static32.method476(local226, local218, local224);
							}
							if (local787 == null) {
								local787 = (Interface19) Static117.method2043(local226, local218, local224);
							}
							if (local787 != null) {
								@Pc(833) Class144 local833 = Static70.aClass323_1.method7792(local787.method9384());
								if (!local833.aBoolean385 || Static312.aBoolean458) {
									local248 = local833.anInt4393;
									if (local833.anIntArray239 != null) {
										for (local260 = 0; local260 < local833.anIntArray239.length; local260++) {
											if (local833.anIntArray239[local260] != -1) {
												@Pc(867) Class144 local867 = Static70.aClass323_1.method7792(local833.anIntArray239[local260]);
												if (local867.anInt4393 >= 0) {
													local248 = local867.anInt4393;
												}
											}
										}
									}
									if (local248 >= 0) {
										@Pc(891) boolean local891 = false;
										if (local248 >= 0) {
											@Pc(898) Class105 local898 = Static462.aClass98_2.method2452(local248);
											if (local898 != null && local898.aBoolean252) {
												local891 = true;
											}
										}
										local288 = local218;
										local294 = local224;
										if (local891) {
											@Pc(918) int[][] local918 = Static678.aClass360Array5[local226].anIntArrayArray56;
											local360 = Static678.aClass360Array5[local226].anInt10108;
											local366 = Static678.aClass360Array5[local226].anInt10114;
											for (local370 = 0; local370 < 10; local370++) {
												local397 = (int) (Math.random() * 4.0D);
												if (local397 == 0 && local11 < local288 && local288 > local218 - 3 && (local918[local288 - local360 - 1][local294 - local366] & 0x2C0108) == 0) {
													local288--;
												}
												if (local397 == 1 && local11 + 103 > local288 && local218 + 3 > local288 && (local918[local288 + 1 - local360][local294 - local366] & 0x2C0180) == 0) {
													local288++;
												}
												if (local397 == 2 && local294 > local17 && local294 > local224 - 3 && (local918[local288 - local360][local294 - local366 - 1] & 0x2C0102) == 0) {
													local294--;
												}
												if (local397 == 3 && local17 + 104 - 1 > local294 && local224 + 3 > local294 && (local918[local288 - local360][local294 + 1 - local366] & 0x2C0120) == 0) {
													local294++;
												}
											}
										}
										Static340.anIntArray334[Static339.anInt5860] = local833.anInt4397;
										Static104.anIntArray96[Static339.anInt5860] = local288;
										Static70.anIntArray80[Static339.anInt5860] = local294;
										Static339.anInt5860++;
									}
								}
							}
						}
					}
				}
			}
			if (Static254.aClass108_1 != null) {
				Static450.aClass221_121.anInt5968 = 1;
				Static462.aClass98_2.method2446(64, 1024);
				for (local224 = 0; local224 < Static254.aClass108_1.anInt3129; local224++) {
					local226 = Static254.aClass108_1.anIntArray156[local224];
					if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 == local226 >> 28) {
						local228 = (local226 >> 14 & 0x3FFF) - Static714.anInt11156;
						local236 = (local226 & 0x3FFF) - Static339.anInt5859;
						if (local228 >= 0 && local228 < Static362.anInt8653 && local236 >= 0 && local236 < Static206.anInt11291) {
							Static229.aClass357_21.method8401(new Class3_Sub42(local224));
						} else {
							@Pc(1264) Class105 local1264 = Static462.aClass98_2.method2452(Static254.aClass108_1.anIntArray155[local224]);
							if (local1264.anIntArray150 != null && local1264.anInt3092 + local228 >= 0 && local1264.anInt3082 + local228 < Static362.anInt8653 && local236 + local1264.anInt3086 >= 0 && Static206.anInt11291 > local1264.anInt3101 + local236) {
								Static229.aClass357_21.method8401(new Class3_Sub42(local224));
							}
						}
					}
				}
				Static462.aClass98_2.method2446(64, 128);
				Static450.aClass221_121.anInt5968 = 2;
				Static450.aClass221_121.method5095();
			}
		}
		return true;
	}
}
