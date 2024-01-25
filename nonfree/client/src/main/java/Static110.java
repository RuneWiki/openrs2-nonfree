import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_32 = new Class187(59, -1);

	@OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
	public static final int[] anIntArray104 = new int[4096];

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)Z")
	public static boolean method1800() throws IOException {
		if (Static537.aClass240_34 == null) {
			return false;
		}
		@Pc(71) int local71;
		if (Static398.aClass196_212 == null) {
			if (Static449.aBoolean574) {
				if (!Static537.aClass240_34.method5659(1)) {
					return false;
				}
				Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				Static411.anInt7046++;
				Static449.aBoolean574 = false;
				Static554.anInt3890 = 0;
			}
			Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
			if (Static386.aClass5_Sub15_Sub2_2.method3708()) {
				if (!Static537.aClass240_34.method5659(1)) {
					return false;
				}
				Static537.aClass240_34.method5656(1, 1, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				Static411.anInt7046++;
				Static554.anInt3890 = 0;
			}
			Static449.aBoolean574 = true;
			@Pc(67) Class196[] local67 = Static455.method6720();
			local71 = Static386.aClass5_Sub15_Sub2_2.method3706();
			if (local71 < 0 || local71 >= local67.length) {
				throw new IOException("invo:" + local71 + " ip:" + Static386.aClass5_Sub15_Sub2_2.anInt4144);
			}
			Static398.aClass196_212 = local67[local71];
			Static139.anInt2291 = Static398.aClass196_212.anInt4620;
		}
		if (Static139.anInt2291 == -1) {
			if (!Static537.aClass240_34.method5659(1)) {
				return false;
			}
			Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
			Static139.anInt2291 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
			Static411.anInt7046++;
			Static554.anInt3890 = 0;
		}
		if (Static139.anInt2291 == -2) {
			if (!Static537.aClass240_34.method5659(2)) {
				return false;
			}
			Static537.aClass240_34.method5656(2, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
			Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
			Static139.anInt2291 = Static386.aClass5_Sub15_Sub2_2.method3698();
			Static554.anInt3890 = 0;
			Static411.anInt7046 += 2;
		}
		if (Static139.anInt2291 > 0) {
			if (!Static537.aClass240_34.method5659(Static139.anInt2291)) {
				return false;
			}
			Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
			Static537.aClass240_34.method5656(Static139.anInt2291, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
			Static554.anInt3890 = 0;
			Static411.anInt7046 += Static139.anInt2291;
		}
		Static527.aClass196_263 = Static587.aClass196_296;
		Static587.aClass196_296 = Static446.aClass196_243;
		Static446.aClass196_243 = Static398.aClass196_212;
		if (Static398.aClass196_212 == Static604.aClass196_144) {
			Static205.anInt3271 = Static386.aClass5_Sub15_Sub2_2.method3642();
			Static658.anInt9448 = Static293.anInt4549;
			Static398.aClass196_212 = null;
			return true;
		}
		@Pc(232) int local232;
		@Pc(250) int local250;
		@Pc(252) int local252;
		@Pc(224) int local224;
		if (Static398.aClass196_212 == Static166.aClass196_106) {
			local224 = Static386.aClass5_Sub15_Sub2_2.method3646();
			local71 = Static386.aClass5_Sub15_Sub2_2.method3635();
			local232 = Static386.aClass5_Sub15_Sub2_2.method3642();
			Static204.anIntArray183[local232] = local71;
			Static399.anIntArray387[local232] = local224;
			Static609.anIntArray563[local232] = 1;
			local250 = Static172.anIntArray165[local232] - 1;
			for (local252 = 0; local252 < local250; local252++) {
				if (Class22.anIntArray31[local252] <= local71) {
					Static609.anIntArray563[local232] = local252 + 2;
				}
			}
			Static316.anIntArray454[Static6.anInt143++ & 0x1F] = local232;
			Static398.aClass196_212 = null;
			return true;
		} else if (Static398.aClass196_212 == Static570.aClass196_288) {
			Static447.anInt7822 = Static386.aClass5_Sub15_Sub2_2.method3682() << 3;
			Static290.anInt10003 = Static386.aClass5_Sub15_Sub2_2.method3677() << 3;
			Static596.anInt9715 = Static386.aClass5_Sub15_Sub2_2.method3646();
			while (Static386.aClass5_Sub15_Sub2_2.anInt4144 < Static139.anInt2291) {
				@Pc(313) Class74 local313 = Static605.method8129()[Static386.aClass5_Sub15_Sub2_2.method3642()];
				Static452.method6710(local313);
			}
			Static398.aClass196_212 = null;
			return true;
		} else {
			@Pc(339) String local339;
			if (Static398.aClass196_212 == Static645.aClass196_326) {
				local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
				local250 = Static386.aClass5_Sub15_Sub2_2.method3637();
				if (local250 == 65535) {
					local250 = -1;
				}
				if (local71 >= 1 && local71 <= 8) {
					if (local339.equalsIgnoreCase("null")) {
						local339 = null;
					}
					Static430.aStringArray35[local71 - 1] = local339;
					Static72.anIntArray500[local71 - 1] = local250;
					Static549.aBooleanArray22[local71 - 1] = local224 == 0;
				}
				Static398.aClass196_212 = null;
				return true;
			} else if (Static247.aClass196_145 == Static398.aClass196_212) {
				local224 = Static386.aClass5_Sub15_Sub2_2.method3662();
				local71 = Static386.aClass5_Sub15_Sub2_2.method3637();
				local232 = Static386.aClass5_Sub15_Sub2_2.method3671();
				Static607.method8169();
				Static473.method7003(local71 + (local224 << 16), local232);
				Static398.aClass196_212 = null;
				return true;
			} else if (Static398.aClass196_212 == Static158.aClass196_99) {
				Static452.method6710(Static549.aClass74_17);
				Static398.aClass196_212 = null;
				return true;
			} else if (Static398.aClass196_212 == Static560.aClass196_280) {
				local224 = Static386.aClass5_Sub15_Sub2_2.method3635();
				local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
				Static607.method8169();
				if (local71 == 65535) {
					local71 = -1;
				}
				Static271.method3792(2, local71, local224, -1);
				Static398.aClass196_212 = null;
				return true;
			} else {
				@Pc(521) int local521;
				if (Static670.aClass196_338 == Static398.aClass196_212) {
					Static596.anInt9715 = Static386.aClass5_Sub15_Sub2_2.method3646();
					Static447.anInt7822 = Static386.aClass5_Sub15_Sub2_2.method3682() << 3;
					Static290.anInt10003 = Static386.aClass5_Sub15_Sub2_2.method3658() << 3;
					for (@Pc(488) Class5_Sub24 local488 = (Class5_Sub24) Static109.aClass335_12.method7768(); local488 != null; local488 = (Class5_Sub24) Static109.aClass335_12.method7777()) {
						local71 = (int) (local488.aLong329 >> 28 & 0x3L);
						local232 = (int) (local488.aLong329 & 0x3FFFL);
						local250 = local232 - Static454.anInt7910;
						local252 = (int) (local488.aLong329 >> 14 & 0x3FFFL);
						local521 = local252 - Static48.anInt750;
						if (Static596.anInt9715 == local71 && local250 >= Static290.anInt10003 && Static290.anInt10003 + 8 > local250 && Static447.anInt7822 <= local521 && local521 < Static447.anInt7822 + 8) {
							local488.method8829();
							if (local250 >= 0 && local521 >= 0 && local250 < Static124.anInt2150 && local521 < Static64.anInt1015) {
								Static57.method857(local250, local521, Static596.anInt9715);
							}
						}
					}
					@Pc(600) Class5_Sub47 local600;
					for (local600 = (Class5_Sub47) Static59.aClass124_60.method2572(); local600 != null; local600 = (Class5_Sub47) Static59.aClass124_60.method2569()) {
						if (local600.anInt9036 >= Static290.anInt10003 && Static290.anInt10003 + 8 > local600.anInt9036 && Static447.anInt7822 <= local600.anInt9031 && local600.anInt9031 < Static447.anInt7822 + 8 && Static596.anInt9715 == local600.anInt9032) {
							local600.aBoolean651 = true;
						}
					}
					for (local600 = (Class5_Sub47) Static227.aClass124_36.method2572(); local600 != null; local600 = (Class5_Sub47) Static227.aClass124_36.method2569()) {
						if (local600.anInt9036 >= Static290.anInt10003 && local600.anInt9036 < Static290.anInt10003 + 8 && Static447.anInt7822 <= local600.anInt9031 && local600.anInt9031 < Static447.anInt7822 + 8 && local600.anInt9032 == Static596.anInt9715) {
							local600.aBoolean651 = true;
						}
					}
					Static398.aClass196_212 = null;
					return true;
				} else if (Static24.aClass196_19 == Static398.aClass196_212) {
					local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (local224 == 65535) {
						local224 = -1;
					}
					local71 = Static386.aClass5_Sub15_Sub2_2.method3635();
					Static607.method8169();
					Static28.method374(local71, local224);
					Static398.aClass196_212 = null;
					return true;
				} else if (Static398.aClass196_212 == Static4.aClass196_2) {
					Static452.method6710(Static447.aClass74_14);
					Static398.aClass196_212 = null;
					return true;
				} else if (Static398.aClass196_212 == Static252.aClass196_147) {
					local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local71 = Static386.aClass5_Sub15_Sub2_2.method3693();
					Static607.method8169();
					Static442.method6605(local71, local224);
					Static398.aClass196_212 = null;
					return true;
				} else if (Static398.aClass196_212 == Static527.aClass196_262) {
					local224 = Static386.aClass5_Sub15_Sub2_2.method3662();
					Static607.method8169();
					Static314.method4802(local224);
					Static398.aClass196_212 = null;
					return true;
				} else if (Static398.aClass196_212 == Static560.aClass196_281) {
					Static452.method6710(Static233.aClass74_9);
					Static398.aClass196_212 = null;
					return true;
				} else {
					@Pc(815) boolean local815;
					if (Static671.aClass196_340 == Static398.aClass196_212) {
						local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
						local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
						local815 = (local71 & 0x1) == 1;
						while (Static386.aClass5_Sub15_Sub2_2.anInt4144 < Static139.anInt2291) {
							local250 = Static386.aClass5_Sub15_Sub2_2.method3690();
							local252 = Static386.aClass5_Sub15_Sub2_2.method3698();
							local521 = 0;
							if (local252 != 0) {
								local521 = Static386.aClass5_Sub15_Sub2_2.method3642();
								if (local521 == 255) {
									local521 = Static386.aClass5_Sub15_Sub2_2.method3671();
								}
							}
							Static453.method6713(local252 - 1, local224, local815, local521, local250);
						}
						Static348.anIntArray434[Static496.anInt8473++ & 0x1F] = local224;
						Static398.aClass196_212 = null;
						return true;
					} else if (Static398.aClass196_212 == Static53.aClass196_149) {
						local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
						local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
						Static607.method8169();
						Static484.method7065(local224, local71);
						Static398.aClass196_212 = null;
						return true;
					} else if (Static62.aClass196_45 == Static398.aClass196_212) {
						for (local224 = 0; local224 < Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2.length; local224++) {
							if (Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local224] != null) {
								Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local224].anIntArray521 = null;
								Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local224].anInt9503 = -1;
							}
						}
						for (local71 = 0; local71 < Static562.anInt9155; local71++) {
							Static278.aClass5_Sub34Array1[local71].aClass41_Sub1_Sub1_Sub3_Sub1_1.anIntArray521 = null;
							Static278.aClass5_Sub34Array1[local71].aClass41_Sub1_Sub1_Sub3_Sub1_1.anInt9503 = -1;
						}
						Static398.aClass196_212 = null;
						return true;
					} else if (Static398.aClass196_212 == Static444.aClass196_241) {
						Static355.method5248();
						Static398.aClass196_212 = null;
						return false;
					} else {
						@Pc(965) String local965;
						@Pc(961) boolean local961;
						@Pc(1014) String local1014;
						@Pc(979) boolean local979;
						if (Static398.aClass196_212 == Static532.aClass196_266) {
							local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
							local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
							local339 = local965;
							if (local961) {
								local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
							}
							local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
							local979 = false;
							if (local250 <= 1) {
								if (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633) {
									local979 = true;
								} else if (local250 <= 1 && Static115.method1838(local339)) {
									local979 = true;
								}
							}
							if (!local979 && Static214.anInt3451 == 0) {
								local1014 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
								if (local250 == 2) {
									Static272.method3804(local1014, "<img=1>" + local339, "<img=1>" + local965, local965, 24, -1, 0, (String) null);
								} else if (local250 == 1) {
									Static272.method3804(local1014, "<img=0>" + local339, "<img=0>" + local965, local965, 24, -1, 0, (String) null);
								} else {
									Static272.method3804(local1014, local339, local965, local965, 24, -1, 0, (String) null);
								}
							}
							Static398.aClass196_212 = null;
							return true;
						} else if (Static398.aClass196_212 == Static599.aClass196_304) {
							Static452.method6710(Static248.aClass74_10);
							Static398.aClass196_212 = null;
							return true;
						} else if (Static523.aClass196_339 == Static398.aClass196_212) {
							local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
							local71 = local224 >> 5;
							local232 = local224 & 0x1F;
							if (local232 == 0) {
								Static217.aClass358Array1[local71] = null;
								Static398.aClass196_212 = null;
								return true;
							}
							@Pc(1121) Class358 local1121 = new Class358();
							local1121.anInt9736 = local232;
							local1121.anInt9738 = Static386.aClass5_Sub15_Sub2_2.method3642();
							if (local1121.anInt9738 >= 0 && Static283.aClass59Array10.length > local1121.anInt9738) {
								if (local1121.anInt9736 == 1 || local1121.anInt9736 == 10) {
									local1121.anInt9743 = Static386.aClass5_Sub15_Sub2_2.method3698();
									Static386.aClass5_Sub15_Sub2_2.anInt4144 += 6;
								} else if (local1121.anInt9736 >= 2 && local1121.anInt9736 <= 6) {
									if (local1121.anInt9736 == 2) {
										local1121.anInt9737 = 256;
										local1121.anInt9742 = 256;
									}
									if (local1121.anInt9736 == 3) {
										local1121.anInt9737 = 0;
										local1121.anInt9742 = 256;
									}
									if (local1121.anInt9736 == 4) {
										local1121.anInt9742 = 256;
										local1121.anInt9737 = 512;
									}
									if (local1121.anInt9736 == 5) {
										local1121.anInt9742 = 0;
										local1121.anInt9737 = 256;
									}
									if (local1121.anInt9736 == 6) {
										local1121.anInt9737 = 256;
										local1121.anInt9742 = 512;
									}
									local1121.anInt9736 = 2;
									local1121.anInt9735 = Static386.aClass5_Sub15_Sub2_2.method3642();
									local1121.anInt9737 += Static386.aClass5_Sub15_Sub2_2.method3698() - Static454.anInt7910 << 9;
									local1121.anInt9742 += Static386.aClass5_Sub15_Sub2_2.method3698() - Static48.anInt750 << 9;
									local1121.anInt9741 = Static386.aClass5_Sub15_Sub2_2.method3642() << 2;
									local1121.anInt9744 = Static386.aClass5_Sub15_Sub2_2.method3698();
								}
								local1121.anInt9739 = Static386.aClass5_Sub15_Sub2_2.method3698();
								if (local1121.anInt9739 == 65535) {
									local1121.anInt9739 = -1;
								}
								Static217.aClass358Array1[local71] = local1121;
							}
							Static398.aClass196_212 = null;
							return true;
						} else if (Static398.aClass196_212 == Static162.aClass196_247) {
							if (Static131.anInt2222 != -1) {
								Static416.method6119(Static131.anInt2222, 0);
							}
							Static398.aClass196_212 = null;
							return true;
						} else {
							@Pc(1340) Class5_Sub4 local1340;
							if (Static398.aClass196_212 == Static317.aClass196_175) {
								local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
								local71 = Static386.aClass5_Sub15_Sub2_2.method3693();
								Static607.method8169();
								@Pc(1333) Class5_Sub4 local1333 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local71);
								local1340 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local224);
								if (local1340 != null) {
									Static272.method3801(local1340, false, local1333 == null || local1333.anInt257 != local1340.anInt257);
								}
								if (local1333 != null) {
									local1333.method8829();
									Static131.aClass335_15.method7770((long) local224, local1333);
								}
								@Pc(1371) Class394 local1371 = Static238.method3422(local71);
								if (local1371 != null) {
									Static609.method8190(local1371);
								}
								local1371 = Static238.method3422(local224);
								if (local1371 != null) {
									Static609.method8190(local1371);
									Static547.method7542(true, local1371);
								}
								if (Static131.anInt2222 != -1) {
									Static416.method6119(Static131.anInt2222, 1);
								}
								Static398.aClass196_212 = null;
								return true;
							}
							@Pc(1454) boolean local1454;
							@Pc(1503) String local1503;
							@Pc(1484) int local1484;
							@Pc(1541) int local1541;
							if (Static398.aClass196_212 == Static436.aClass196_235) {
								local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
								@Pc(1418) Class41_Sub1_Sub1_Sub3_Sub2 local1418;
								if (local224 == Static177.anInt2910) {
									local1418 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1;
								} else {
									local1418 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local224];
								}
								if (local1418 == null) {
									Static398.aClass196_212 = null;
									return true;
								}
								local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
								local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
								local979 = (local232 & 0x8000) != 0;
								if (local1418.aString100 != null && local1418.aClass239_1 != null) {
									local1454 = false;
									if (local250 <= 1) {
										if (!local979 && (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633)) {
											local1454 = true;
										} else if (Static115.method1838(local1418.aString100)) {
											local1454 = true;
										}
									}
									if (!local1454 && Static214.anInt3451 == 0) {
										local1484 = -1;
										if (local979) {
											local232 &= 0x7FFF;
											@Pc(1494) Class305 local1494 = Static481.method889(Static386.aClass5_Sub15_Sub2_2);
											local1484 = local1494.anInt8528;
											local1503 = local1494.aClass5_Sub2_Sub2_1.method193(Static386.aClass5_Sub15_Sub2_2);
										} else {
											local1503 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
										}
										local1418.aString99 = local1503.trim();
										local1418.anInt9486 = local232 >> 8;
										local1418.anInt9467 = 150;
										local1418.anInt9495 = local232 & 0xFF;
										if (local250 == 1 || local250 == 2) {
											local1541 = local979 ? 17 : 1;
										} else {
											local1541 = local979 ? 17 : 2;
										}
										if (local250 == 2) {
											Static272.method3804(local1503, "<img=1>" + local1418.method7936(), "<img=1>" + local1418.method7935(), local1418.aString101, local1541, local1484, 0, (String) null);
										} else if (local250 == 1) {
											Static272.method3804(local1503, "<img=0>" + local1418.method7936(), "<img=0>" + local1418.method7935(), local1418.aString101, local1541, local1484, 0, (String) null);
										} else {
											Static272.method3804(local1503, local1418.method7936(), local1418.method7935(), local1418.aString101, local1541, local1484, 0, (String) null);
										}
									}
								}
								Static398.aClass196_212 = null;
								return true;
							} else if (Static436.aClass196_236 == Static398.aClass196_212) {
								if (Static385.method5648(Static539.anInt8853)) {
									Static563.anInt9175 = (int) ((float) Static386.aClass5_Sub15_Sub2_2.method3698() * 2.5F);
								} else {
									Static563.anInt9175 = Static386.aClass5_Sub15_Sub2_2.method3698() * 30;
								}
								Static398.aClass196_212 = null;
								Static658.anInt9448 = Static293.anInt4549;
								return true;
							} else if (Static180.aClass196_116 == Static398.aClass196_212) {
								local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
								local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
								local232 = Static386.aClass5_Sub15_Sub2_2.method3635();
								local250 = Static386.aClass5_Sub15_Sub2_2.method3662();
								Static607.method8169();
								Static461.method6845(local250, local224, local232, local71);
								Static398.aClass196_212 = null;
								return true;
							} else {
								@Pc(1732) boolean local1732;
								@Pc(1983) String local1983;
								if (Static398.aClass196_212 == Static236.aClass196_139) {
									@Pc(1784) boolean local1784;
									while (Static139.anInt2291 > Static386.aClass5_Sub15_Sub2_2.anInt4144) {
										local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
										local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
										local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
										local250 = Static386.aClass5_Sub15_Sub2_2.method3698();
										local252 = Static386.aClass5_Sub15_Sub2_2.method3642();
										local1014 = "";
										local1732 = false;
										if (local250 > 0) {
											local1014 = Static386.aClass5_Sub15_Sub2_2.method3661();
											local1732 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
										}
										for (local1484 = 0; local1484 < Static529.anInt8750; local1484++) {
											if (local961) {
												if (local339.equals(Static562.aStringArray36[local1484])) {
													Static562.aStringArray36[local1484] = local965;
													local965 = null;
													Static128.aStringArray6[local1484] = local339;
													break;
												}
											} else if (local965.equals(Static562.aStringArray36[local1484])) {
												if (local250 != Static640.anIntArray587[local1484]) {
													local1784 = true;
													for (@Pc(1789) Class41_Sub4_Sub2 local1789 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2062(); local1789 != null; local1789 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2054()) {
														if (local1789.aString74.equals(local965)) {
															if (local250 != 0 && local1789.aShort90 == 0) {
																local1789.method8644();
																local1784 = false;
															} else if (local250 == 0 && local1789.aShort90 != 0) {
																local1784 = false;
																local1789.method8644();
															}
														}
													}
													if (local1784) {
														Static508.aClass102_8.method2055(new Class41_Sub4_Sub2(local965, local250));
													}
													Static640.anIntArray587[local1484] = local250;
												}
												Static128.aStringArray6[local1484] = local339;
												Static377.aStringArray24[local1484] = local1014;
												Static374.anIntArray425[local1484] = local252;
												local965 = null;
												Static211.aBooleanArray5[local1484] = local1732;
												break;
											}
										}
										if (local965 != null && Static529.anInt8750 < 200) {
											Static562.aStringArray36[Static529.anInt8750] = local965;
											Static128.aStringArray6[Static529.anInt8750] = local339;
											Static640.anIntArray587[Static529.anInt8750] = local250;
											Static377.aStringArray24[Static529.anInt8750] = local1014;
											Static374.anIntArray425[Static529.anInt8750] = local252;
											Static211.aBooleanArray5[Static529.anInt8750] = local1732;
											Static529.anInt8750++;
										}
									}
									Static182.anInt6963 = 2;
									Static223.anInt3567 = Static293.anInt4549;
									local71 = Static529.anInt8750;
									while (local71 > 0) {
										local71--;
										local961 = true;
										for (local232 = 0; local232 < local71; local232++) {
											if (Static6.aClass365_1.anInt9973 != Static640.anIntArray587[local232] && Static640.anIntArray587[local232 + 1] == Static6.aClass365_1.anInt9973 || Static640.anIntArray587[local232] == 0 && Static640.anIntArray587[local232 + 1] != 0) {
												local250 = Static640.anIntArray587[local232];
												Static640.anIntArray587[local232] = Static640.anIntArray587[local232 + 1];
												Static640.anIntArray587[local232 + 1] = local250;
												local1983 = Static377.aStringArray24[local232];
												Static377.aStringArray24[local232] = Static377.aStringArray24[local232 + 1];
												Static377.aStringArray24[local232 + 1] = local1983;
												local1014 = Static562.aStringArray36[local232];
												Static562.aStringArray36[local232] = Static562.aStringArray36[local232 + 1];
												Static562.aStringArray36[local232 + 1] = local1014;
												local1503 = Static128.aStringArray6[local232];
												Static128.aStringArray6[local232] = Static128.aStringArray6[local232 + 1];
												Static128.aStringArray6[local232 + 1] = local1503;
												local1484 = Static374.anIntArray425[local232];
												Static374.anIntArray425[local232] = Static374.anIntArray425[local232 + 1];
												Static374.anIntArray425[local232 + 1] = local1484;
												local1784 = Static211.aBooleanArray5[local232];
												Static211.aBooleanArray5[local232] = Static211.aBooleanArray5[local232 + 1];
												Static211.aBooleanArray5[local232 + 1] = local1784;
												local961 = false;
											}
										}
										if (local961) {
											break;
										}
									}
									Static398.aClass196_212 = null;
									return true;
								} else if (Static398.aClass196_212 == Static661.aClass196_332) {
									local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
									local71 = Static386.aClass5_Sub15_Sub2_2.method3637();
									Static607.method8169();
									Static395.method5739(local224, local71);
									Static398.aClass196_212 = null;
									return true;
								} else if (Static600.aClass196_305 == Static398.aClass196_212) {
									Static452.method6710(Static637.aClass74_20);
									Static398.aClass196_212 = null;
									return true;
								} else if (Static233.aClass196_137 == Static398.aClass196_212) {
									local224 = Static386.aClass5_Sub15_Sub2_2.method3662();
									local71 = Static386.aClass5_Sub15_Sub2_2.method3667();
									local232 = Static386.aClass5_Sub15_Sub2_2.method3693();
									Static607.method8169();
									local1340 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local232);
									if (local1340 != null) {
										Static272.method3801(local1340, false, local1340.anInt257 != local224);
									}
									Static30.method397(local224, local232, local71, false);
									Static398.aClass196_212 = null;
									return true;
								} else if (Static398.aClass196_212 == Static244.aClass196_143) {
									local224 = Static386.aClass5_Sub15_Sub2_2.method3646();
									local71 = Static386.aClass5_Sub15_Sub2_2.method3646();
									if (local224 == 255) {
										local224 = -1;
										local71 = -1;
									}
									Static459.method6790(local71, local224);
									Static398.aClass196_212 = null;
									return true;
								} else {
									@Pc(2241) long local2241;
									@Pc(2259) Class5_Sub42 local2259;
									@Pc(2247) Class5_Sub42 local2247;
									if (Static398.aClass196_212 == Static546.aClass196_272) {
										local224 = Static386.aClass5_Sub15_Sub2_2.method3662();
										if (local224 == 65535) {
											local224 = -1;
										}
										local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
										local232 = Static386.aClass5_Sub15_Sub2_2.method3683();
										if (local232 == 65535) {
											local232 = -1;
										}
										local250 = Static386.aClass5_Sub15_Sub2_2.method3673();
										Static607.method8169();
										for (local252 = local224; local252 <= local232; local252++) {
											local2241 = ((long) local250 << 32) + ((long) local252);
											local2247 = (Class5_Sub42) Static67.aClass335_8.method7766(local2241);
											if (local2247 != null) {
												local2259 = new Class5_Sub42(local2247.anInt7813, local71);
												local2247.method8829();
											} else if (local252 == -1) {
												local2259 = new Class5_Sub42(Static238.method3422(local250).aClass5_Sub42_2.anInt7813, local71);
											} else {
												local2259 = new Class5_Sub42(0, local71);
											}
											Static67.aClass335_8.method7770(local2241, local2259);
										}
										Static398.aClass196_212 = null;
										return true;
									} else if (Static398.aClass196_212 == Static215.aClass196_131) {
										Static452.method6710(Static625.aClass74_19);
										Static398.aClass196_212 = null;
										return true;
									} else if (Static398.aClass196_212 == Static58.aClass196_44) {
										local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
										local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
										Static607.method8169();
										Static676.method7789(local224, local965);
										Static398.aClass196_212 = null;
										return true;
									} else if (Static583.aClass196_293 == Static398.aClass196_212) {
										local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
										Static607.method8169();
										Static271.method3792(5, Static177.anInt2910, local224, 0);
										Static398.aClass196_212 = null;
										return true;
									} else if (Static398.aClass196_212 == Static398.aClass196_213) {
										local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
										Static607.method8169();
										@Pc(2367) Class5_Sub4 local2367 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local224);
										if (local2367 != null) {
											Static272.method3801(local2367, false, true);
										}
										if (Static415.aClass394_5 != null) {
											Static609.method8190(Static415.aClass394_5);
											Static415.aClass394_5 = null;
										}
										Static398.aClass196_212 = null;
										return true;
									} else if (Static398.aClass196_214 == Static398.aClass196_212) {
										Static559.method7676();
										Static398.aClass196_212 = null;
										return false;
									} else if (Static398.aClass196_212 == Static662.aClass196_333) {
										local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
										local71 = Static386.aClass5_Sub15_Sub2_2.method3646();
										local232 = Static386.aClass5_Sub15_Sub2_2.method3667();
										local250 = Static386.aClass5_Sub15_Sub2_2.method3637() << 2;
										local252 = Static386.aClass5_Sub15_Sub2_2.method3667();
										Static607.method8169();
										Static217.method3094(local232, local252, local250, local71, true, local224);
										Static398.aClass196_212 = null;
										return true;
									} else {
										@Pc(2484) int local2484;
										@Pc(2460) String local2460;
										if (Static589.aClass196_297 == Static398.aClass196_212) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
											@Pc(2452) boolean local2452 = (local224 & 0x1) == 1;
											local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
											local2460 = Static386.aClass5_Sub15_Sub2_2.method3661();
											if (local2460.equals("")) {
												local2460 = local339;
											}
											local1983 = Static386.aClass5_Sub15_Sub2_2.method3661();
											local1014 = Static386.aClass5_Sub15_Sub2_2.method3661();
											if (local1014.equals("")) {
												local1014 = local1983;
											}
											if (local2452) {
												for (local2484 = 0; local2484 < Static455.anInt7921; local2484++) {
													if (Static275.aStringArray17[local2484].equals(local1014)) {
														Static587.aStringArray38[local2484] = local339;
														Static275.aStringArray17[local2484] = local2460;
														Static594.aStringArray39[local2484] = local1983;
														Static221.aStringArray11[local2484] = local1014;
														break;
													}
												}
											} else {
												Static587.aStringArray38[Static455.anInt7921] = local339;
												Static275.aStringArray17[Static455.anInt7921] = local2460;
												Static594.aStringArray39[Static455.anInt7921] = local1983;
												Static221.aStringArray11[Static455.anInt7921] = local1014;
												Static468.aBooleanArray19[Static455.anInt7921] = (local224 & 0x2) == 2;
												Static455.anInt7921++;
											}
											Static398.aClass196_212 = null;
											Static223.anInt3567 = Static293.anInt4549;
											return true;
										} else if (Static34.aClass196_27 == Static398.aClass196_212) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
											if (local224 == 65535) {
												local224 = -1;
											}
											local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
											local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
											local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
											Static99.method1646(256, local232, local224, true, local71, local250);
											Static398.aClass196_212 = null;
											return true;
										} else if (Static398.aClass196_212 == Static667.aClass196_337) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
											local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
											Static607.method8169();
											if (local224 == 2) {
												Static517.method7335();
											}
											Static131.anInt2222 = local71;
											Static462.method6850(local71);
											Static469.method6939(false);
											Static497.method7209(Static131.anInt2222);
											for (local232 = 0; local232 < 100; local232++) {
												Static425.aBooleanArray18[local232] = true;
											}
											Static398.aClass196_212 = null;
											return true;
										} else if (Static402.aClass196_216 == Static398.aClass196_212) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
											local71 = local224 >> 2;
											local232 = local224 & 0x3;
											local250 = Static512.anIntArray472[local71];
											local252 = Static386.aClass5_Sub15_Sub2_2.method3662();
											if (local252 == 65535) {
												local252 = -1;
											}
											local521 = Static386.aClass5_Sub15_Sub2_2.method3671();
											local2484 = local521 >> 28 & 0x3;
											local1484 = local521 >> 14 & 0x3FFF;
											local1541 = local521 & 0x3FFF;
											local1484 -= Static454.anInt7910;
											local1541 -= Static48.anInt750;
											Static632.method8411(local1541, local232, local252, local1484, local250, local2484, local71);
											Static398.aClass196_212 = null;
											return true;
										} else if (Static398.aClass196_212 == Static361.aClass196_190) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
											local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
											Static607.method8169();
											Static483.method7063(local224, local71);
											Static398.aClass196_212 = null;
											return true;
										} else if (Static598.aClass196_303 == Static398.aClass196_212) {
											local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
											local71 = Static386.aClass5_Sub15_Sub2_2.method3637();
											Static607.method8169();
											Static92.method1425(local71, local224);
											Static398.aClass196_212 = null;
											return true;
										} else if (Static270.aClass196_153 == Static398.aClass196_212) {
											Static324.method5067();
											Static398.aClass196_212 = null;
											return true;
										} else {
											@Pc(2767) String local2767;
											if (Static398.aClass196_212 == Static66.aClass196_49) {
												local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
												local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
												Static607.method8169();
												Static324.method5066(local71, local2767);
												Static398.aClass196_212 = null;
												return true;
											} else if (Static327.aClass196_180 == Static398.aClass196_212) {
												Static452.method6710(Static125.aClass74_5);
												Static398.aClass196_212 = null;
												return true;
											} else if (Static398.aClass196_212 == Static301.aClass196_163) {
												local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
												local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
												Static413.aClass63_1.method1225(local71, local224);
												Static398.aClass196_212 = null;
												return true;
											} else if (Static65.aClass196_48 == Static398.aClass196_212) {
												Static675.anInt10641 = Static293.anInt4549;
												local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
												if (Static139.anInt2291 != 1) {
													if (local961) {
														Static583.aClass233_2 = new Class233(Static386.aClass5_Sub15_Sub2_2);
													} else {
														Static619.aClass233_3 = new Class233(Static386.aClass5_Sub15_Sub2_2);
													}
													Static398.aClass196_212 = null;
													return true;
												}
												Static398.aClass196_212 = null;
												if (local961) {
													Static583.aClass233_2 = null;
												} else {
													Static619.aClass233_3 = null;
												}
												return true;
											} else if (Static398.aClass196_212 == Static557.aClass196_278) {
												local224 = Static386.aClass5_Sub15_Sub2_2.method3690();
												local71 = Static386.aClass5_Sub15_Sub2_2.method3671();
												local232 = Static386.aClass5_Sub15_Sub2_2.method3642();
												local2460 = "";
												local1983 = local2460;
												if ((local232 & 0x1) != 0) {
													local2460 = Static386.aClass5_Sub15_Sub2_2.method3661();
													if ((local232 & 0x2) == 0) {
														local1983 = local2460;
													} else {
														local1983 = Static386.aClass5_Sub15_Sub2_2.method3661();
													}
												}
												local1014 = Static386.aClass5_Sub15_Sub2_2.method3661();
												if (local224 == 99) {
													Static611.method8213(local1014);
												} else if (local1983.equals("") || !Static115.method1838(local1983)) {
													Static423.method6423(local224, local71, local1014, local2460, local2460, local1983);
												} else {
													Static398.aClass196_212 = null;
													return true;
												}
												Static398.aClass196_212 = null;
												return true;
											} else {
												@Pc(2948) byte local2948;
												if (Static418.aClass196_227 == Static398.aClass196_212) {
													local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
													local2948 = Static386.aClass5_Sub15_Sub2_2.method3677();
													Static607.method8169();
													Static395.method5739(local2948, local224);
													Static398.aClass196_212 = null;
													return true;
												} else if (Static398.aClass196_212 == Static584.aClass196_294) {
													if (Static518.aFrame4 != null) {
														Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
													}
													@Pc(2976) byte[] local2976 = new byte[Static139.anInt2291];
													Static386.aClass5_Sub15_Sub2_2.method3700(Static139.anInt2291, local2976);
													local965 = Static621.method8308(Static139.anInt2291, 0, local2976);
													Static408.method5967(true, Static150.aClass202_2, Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 1, local965);
													Static398.aClass196_212 = null;
													return true;
												} else if (Static376.aClass196_198 == Static398.aClass196_212) {
													Static560.anInt9141 = Static386.aClass5_Sub15_Sub2_2.method3638();
													Static398.aClass196_212 = null;
													Static658.anInt9448 = Static293.anInt4549;
													return true;
												} else if (Static435.aClass196_234 == Static398.aClass196_212) {
													Static452.method6710(Static202.aClass74_8);
													Static398.aClass196_212 = null;
													return true;
												} else if (Static398.aClass196_212 == Static338.aClass196_291) {
													local224 = Static386.aClass5_Sub15_Sub2_2.method3655();
													@Pc(3039) int[] local3039 = new int[4];
													for (local232 = 0; local232 < 4; local232++) {
														local3039[local232] = Static386.aClass5_Sub15_Sub2_2.method3637();
													}
													local250 = Static386.aClass5_Sub15_Sub2_2.method3637();
													@Pc(3063) Class5_Sub34 local3063 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local250);
													if (local3063 != null) {
														Static488.method7147(local3063.aClass41_Sub1_Sub1_Sub3_Sub1_1, local224, local3039);
													}
													Static398.aClass196_212 = null;
													return true;
												} else {
													@Pc(3129) int local3129;
													@Pc(3106) long local3106;
													@Pc(3127) boolean local3127;
													@Pc(3179) String local3179;
													if (Static398.aClass196_212 == Static657.aClass196_331) {
														local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
														local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
														local339 = local965;
														if (local961) {
															local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
														}
														local3106 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
														local2241 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
														local1484 = Static386.aClass5_Sub15_Sub2_2.method3642();
														local1541 = Static386.aClass5_Sub15_Sub2_2.method3698();
														@Pc(3125) long local3125 = (local3106 << 32) + local2241;
														local3127 = false;
														local3129 = 0;
														while (true) {
															if (local3129 >= 100) {
																if (local1484 <= 1 && Static115.method1838(local339)) {
																	local3127 = true;
																}
																break;
															}
															if (local3125 == Static346.aLongArray13[local3129]) {
																local3127 = true;
																break;
															}
															local3129++;
														}
														if (!local3127 && Static214.anInt3451 == 0) {
															Static346.aLongArray13[Static648.anInt10235] = local3125;
															Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
															local3179 = Static62.aClass100_2.method2047(local1541).method193(Static386.aClass5_Sub15_Sub2_2);
															if (local1484 == 2) {
																Static272.method3804(local3179, "<img=1>" + local339, "<img=1>" + local965, local965, 18, local1541, 0, (String) null);
															} else if (local1484 == 1) {
																Static272.method3804(local3179, "<img=0>" + local339, "<img=0>" + local965, local965, 18, local1541, 0, (String) null);
															} else {
																Static272.method3804(local3179, local339, local965, local965, 18, local1541, 0, (String) null);
															}
														}
														Static398.aClass196_212 = null;
														return true;
													} else if (Static649.aClass196_328 == Static398.aClass196_212) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
														if (Static386.aClass5_Sub15_Sub2_2.method3642() == 0) {
															Static644.aClass278Array1[local224] = new Class278();
														} else {
															Static386.aClass5_Sub15_Sub2_2.anInt4144--;
															Static644.aClass278Array1[local224] = new Class278(Static386.aClass5_Sub15_Sub2_2);
														}
														Static552.anInt10276 = Static293.anInt4549;
														Static398.aClass196_212 = null;
														return true;
													} else if (Static324.aClass196_178 == Static398.aClass196_212) {
														Static162.method6698(Static598.aBoolean716);
														Static398.aClass196_212 = null;
														return false;
													} else if (Static24.aClass196_20 == Static398.aClass196_212) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
														if (local224 == 65535) {
															local224 = -1;
														}
														local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
														local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
														local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
														local252 = Static386.aClass5_Sub15_Sub2_2.method3698();
														Static85.method1307(local224, local232, local71, local252, local250);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static175.aClass196_109 == Static398.aClass196_212) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
														local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
														if (local71 == 65535) {
															local71 = -1;
														}
														local232 = Static386.aClass5_Sub15_Sub2_2.method3635();
														Static607.method8169();
														Static246.method3501(local224, local232, local71);
														@Pc(3368) Class219 local3368 = Static259.aClass135_1.method2776(local71);
														Static105.method1745(local3368.anInt6145, local3368.anInt6132, local3368.anInt6129, local224);
														Static369.method5413(local3368.anInt6146, local3368.anInt6141, local224, local3368.anInt6123);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static398.aClass196_212 == Static382.aClass196_203) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3646();
														local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
														Static413.aClass63_1.method1225(local71, local224);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static398.aClass196_212 == Static72.aClass196_277) {
														local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
														local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
														local339 = local965;
														if (local961) {
															local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
														}
														local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
														local252 = Static386.aClass5_Sub15_Sub2_2.method3698();
														local1454 = false;
														if (local250 <= 1 && Static115.method1838(local339)) {
															local1454 = true;
														}
														if (!local1454 && Static214.anInt3451 == 0) {
															local1503 = Static62.aClass100_2.method2047(local252).method193(Static386.aClass5_Sub15_Sub2_2);
															if (local250 == 2) {
																Static272.method3804(local1503, "<img=1>" + local339, "<img=1>" + local965, local965, 25, local252, 0, (String) null);
															} else if (local250 == 1) {
																Static272.method3804(local1503, "<img=0>" + local339, "<img=0>" + local965, local965, 25, local252, 0, (String) null);
															} else {
																Static272.method3804(local1503, local339, local965, local965, 25, local252, 0, (String) null);
															}
														}
														Static398.aClass196_212 = null;
														return true;
													} else if (Static398.aClass196_212 == Static212.aClass196_129) {
														local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
														@Pc(3559) byte[] local3559 = new byte[Static139.anInt2291 - 1];
														Static386.aClass5_Sub15_Sub2_2.method3650(0, Static139.anInt2291 - 1, local3559);
														Static193.method2764(local3559, local961);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static469.aClass196_253 == Static398.aClass196_212) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3655();
														local71 = Static386.aClass5_Sub15_Sub2_2.method3673();
														local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
														local250 = Static386.aClass5_Sub15_Sub2_2.method3662();
														Static607.method8169();
														Static499.method7238(local250, local224, local71, local232);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static398.aClass196_212 == Static404.aClass196_217) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
														Static333.aClass297_4 = Static150.aClass202_2.method4729(local224);
														Static398.aClass196_212 = null;
														return true;
													} else if (Static158.aClass196_100 == Static398.aClass196_212) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3637();
														local71 = Static386.aClass5_Sub15_Sub2_2.method3646();
														local815 = (local71 & 0x1) == 1;
														Static586.method7995(local224, local815);
														Static348.anIntArray434[Static496.anInt8473++ & 0x1F] = local224;
														Static398.aClass196_212 = null;
														return true;
													} else if (Static398.aClass196_212 == Static136.aClass196_90) {
														local224 = Static386.aClass5_Sub15_Sub2_2.method3694();
														local71 = Static386.aClass5_Sub15_Sub2_2.method3673();
														Static607.method8169();
														Static463.method6857(local224, local71);
														Static398.aClass196_212 = null;
														return true;
													} else {
														@Pc(3706) long local3706;
														@Pc(3711) long local3711;
														@Pc(3721) long local3721;
														@Pc(3738) int local3738;
														@Pc(3792) String local3792;
														if (Static398.aClass196_212 == Static95.aClass196_65) {
															local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
															local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
															local3706 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
															local3711 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
															local2484 = Static386.aClass5_Sub15_Sub2_2.method3642();
															local3721 = local3711 + (local3706 << 32);
															@Pc(3723) boolean local3723 = false;
															@Pc(3731) Class5_Sub49 local3731 = local961 ? Static394.aClass5_Sub49_2 : Static57.aClass5_Sub49_1;
															if (local3731 == null) {
																local3723 = true;
															} else {
																label2136: {
																	for (local3738 = 0; local3738 < 100; local3738++) {
																		if (local3721 == Static346.aLongArray13[local3738]) {
																			local3723 = true;
																			break label2136;
																		}
																	}
																	if (local2484 <= 1) {
																		if (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633) {
																			local3723 = true;
																		} else if (Static115.method1838(local965)) {
																			local3723 = true;
																		}
																	}
																}
															}
															if (!local3723 && Static214.anInt3451 == 0) {
																Static346.aLongArray13[Static648.anInt10235] = local3721;
																Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
																local3792 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
																local3129 = local961 ? 41 : 44;
																if (local2484 == 2 || local2484 == 3) {
																	Static272.method3804(local3792, "<img=1>" + local965, "<img=1>" + local965, local965, local3129, -1, 0, local3731.aString103);
																} else if (local2484 == 1) {
																	Static272.method3804(local3792, "<img=0>" + local965, "<img=0>" + local965, local965, local3129, -1, 0, local3731.aString103);
																} else {
																	Static272.method3804(local3792, local965, local965, local965, local3129, -1, 0, local3731.aString103);
																}
															}
															Static398.aClass196_212 = null;
															return true;
														} else if (Static398.aClass196_212 == Static663.aClass196_336) {
															local961 = Static386.aClass5_Sub15_Sub2_2.method3646() == 1;
															Static607.method8169();
															Static398.aClass196_212 = null;
															Static284.aBoolean295 = local961;
															return true;
														} else if (Static433.aClass196_232 == Static398.aClass196_212) {
															Static566.aClass139_4 = Static43.method608(Static386.aClass5_Sub15_Sub2_2.method3642());
															Static398.aClass196_212 = null;
															return true;
														} else if (Static637.aClass196_323 == Static398.aClass196_212) {
															local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
															local71 = Static386.aClass5_Sub15_Sub2_2.method3662();
															Static413.aClass63_1.method1215(local224, local71);
															Static398.aClass196_212 = null;
															return true;
														} else if (Static398.aClass196_212 == Static606.aClass196_310) {
															local224 = Static386.aClass5_Sub15_Sub2_2.method3655();
															local2948 = Static386.aClass5_Sub15_Sub2_2.method3658();
															Static607.method8169();
															Static163.method2421(local2948, local224);
															Static398.aClass196_212 = null;
															return true;
														} else {
															@Pc(3992) int local3992;
															@Pc(4002) int local4002;
															@Pc(4000) boolean local4000;
															if (Static398.aClass196_212 == Static347.aClass196_184) {
																local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
																local339 = local965;
																if (local961) {
																	local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
																}
																local3106 = Static386.aClass5_Sub15_Sub2_2.method3634();
																local2241 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
																local3721 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
																local3992 = Static386.aClass5_Sub15_Sub2_2.method3642();
																@Pc(3998) long local3998 = (local2241 << 32) + local3721;
																local4000 = false;
																local4002 = 0;
																while (true) {
																	if (local4002 >= 100) {
																		if (local3992 <= 1) {
																			if (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633) {
																				local4000 = true;
																			} else if (Static115.method1838(local339)) {
																				local4000 = true;
																			}
																		}
																		break;
																	}
																	if (Static346.aLongArray13[local4002] == local3998) {
																		local4000 = true;
																		break;
																	}
																	local4002++;
																}
																if (!local4000 && Static214.anInt3451 == 0) {
																	Static346.aLongArray13[Static648.anInt10235] = local3998;
																	Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
																	@Pc(4056) String local4056 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
																	if (local3992 == 2 || local3992 == 3) {
																		Static272.method3804(local4056, "<img=1>" + local339, "<img=1>" + local965, local965, 9, -1, 0, Static100.method1665(local3106));
																	} else if (local3992 == 1) {
																		Static272.method3804(local4056, "<img=0>" + local339, "<img=0>" + local965, local965, 9, -1, 0, Static100.method1665(local3106));
																	} else {
																		Static272.method3804(local4056, local339, local965, local965, 9, -1, 0, Static100.method1665(local3106));
																	}
																}
																Static398.aClass196_212 = null;
																return true;
															} else if (Static113.aClass196_79 == Static398.aClass196_212) {
																local224 = Static386.aClass5_Sub15_Sub2_2.method3683();
																local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																local232 = Static386.aClass5_Sub15_Sub2_2.method3637();
																local250 = Static386.aClass5_Sub15_Sub2_2.method3671();
																Static607.method8169();
																Static271.method3792(7, local71 << 16 | local232, local250, local224);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static398.aClass196_212 == Static199.aClass196_123) {
																local224 = Static386.aClass5_Sub15_Sub2_2.method3637();
																Static607.method8169();
																Static595.method8077(local224);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static605.aClass196_308 == Static398.aClass196_212) {
																local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
																local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
																local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
																Static607.method8169();
																if (Static227.aClass394ArrayArray2[local224] != null) {
																	for (local250 = local71; local250 < local232; local250++) {
																		local252 = Static386.aClass5_Sub15_Sub2_2.method3633();
																		if (Static227.aClass394ArrayArray2[local224].length > local250 && Static227.aClass394ArrayArray2[local224][local250] != null) {
																			Static227.aClass394ArrayArray2[local224][local250].anInt10501 = local252;
																		}
																	}
																}
																Static398.aClass196_212 = null;
																return true;
															} else if (Static398.aClass196_212 == Static634.aClass196_322) {
																Static455.anInt7921 = Static386.aClass5_Sub15_Sub2_2.method3642();
																for (local224 = 0; local224 < Static455.anInt7921; local224++) {
																	Static587.aStringArray38[local224] = Static386.aClass5_Sub15_Sub2_2.method3661();
																	Static275.aStringArray17[local224] = Static386.aClass5_Sub15_Sub2_2.method3661();
																	if (Static275.aStringArray17[local224].equals("")) {
																		Static275.aStringArray17[local224] = Static587.aStringArray38[local224];
																	}
																	Static594.aStringArray39[local224] = Static386.aClass5_Sub15_Sub2_2.method3661();
																	Static221.aStringArray11[local224] = Static386.aClass5_Sub15_Sub2_2.method3661();
																	if (Static221.aStringArray11[local224].equals("")) {
																		Static221.aStringArray11[local224] = Static594.aStringArray39[local224];
																	}
																	Static468.aBooleanArray19[local224] = false;
																}
																Static398.aClass196_212 = null;
																Static223.anInt3567 = Static293.anInt4549;
																return true;
															} else if (Static377.aClass196_199 == Static398.aClass196_212) {
																Static452.method6710(Static412.aClass74_13);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static398.aClass196_212 == Static269.aClass196_152) {
																local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
																@Pc(4341) Object[] local4341 = new Object[local2767.length() + 1];
																for (local232 = local2767.length() - 1; local232 >= 0; local232--) {
																	if (local2767.charAt(local232) == 's') {
																		local4341[local232 + 1] = Static386.aClass5_Sub15_Sub2_2.method3661();
																	} else {
																		local4341[local232 + 1] = Integer.valueOf(Static386.aClass5_Sub15_Sub2_2.method3671());
																	}
																}
																local4341[0] = Integer.valueOf(Static386.aClass5_Sub15_Sub2_2.method3671());
																Static607.method8169();
																@Pc(4396) Class5_Sub28 local4396 = new Class5_Sub28();
																local4396.anObjectArray2 = local4341;
																Static497.method7205(local4396);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static112.aClass196_77 == Static398.aClass196_212) {
																local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
																local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																Static607.method8169();
																Static268.method4050(local71, local224);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static369.aClass196_196 == Static398.aClass196_212) {
																Static452.method6710(Static455.aClass74_15);
																Static398.aClass196_212 = null;
																return true;
															} else if (Static398.aClass196_212 == Static310.aClass196_174) {
																Static452.method6710(Static674.aClass74_4);
																Static398.aClass196_212 = null;
																return true;
															} else {
																@Pc(4493) int local4493;
																@Pc(4504) int local4504;
																if (Static398.aClass196_212 == Static193.aClass196_122) {
																	local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																	local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
																	local339 = local965;
																	if (local961) {
																		local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
																	}
																	local3106 = Static386.aClass5_Sub15_Sub2_2.method3634();
																	local2241 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
																	local3721 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
																	local3992 = Static386.aClass5_Sub15_Sub2_2.method3642();
																	local4493 = Static386.aClass5_Sub15_Sub2_2.method3698();
																	@Pc(4500) long local4500 = (local2241 << 32) + local3721;
																	@Pc(4502) boolean local4502 = false;
																	local4504 = 0;
																	while (true) {
																		if (local4504 >= 100) {
																			if (local3992 <= 1 && Static115.method1838(local339)) {
																				local4502 = true;
																			}
																			break;
																		}
																		if (Static346.aLongArray13[local4504] == local4500) {
																			local4502 = true;
																			break;
																		}
																		local4504++;
																	}
																	if (!local4502 && Static214.anInt3451 == 0) {
																		Static346.aLongArray13[Static648.anInt10235] = local4500;
																		Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
																		@Pc(4553) String local4553 = Static62.aClass100_2.method2047(local4493).method193(Static386.aClass5_Sub15_Sub2_2);
																		if (local3992 == 2) {
																			Static272.method3804(local4553, "<img=1>" + local339, "<img=1>" + local965, local965, 20, local4493, 0, Static100.method1665(local3106));
																		} else if (local3992 == 1) {
																			Static272.method3804(local4553, "<img=0>" + local339, "<img=0>" + local965, local965, 20, local4493, 0, Static100.method1665(local3106));
																		} else {
																			Static272.method3804(local4553, local339, local965, local965, 20, local4493, 0, Static100.method1665(local3106));
																		}
																	}
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static398.aClass196_212 == Static14.aClass196_12) {
																	Static452.method6710(Static463.aClass74_16);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static398.aClass196_212 == Static377.aClass196_200) {
																	Static386.aClass5_Sub15_Sub2_2.anInt4144 += 28;
																	if (Static386.aClass5_Sub15_Sub2_2.method3670()) {
																		Static4.method48(Static386.aClass5_Sub15_Sub2_2.anInt4144 - 28, Static386.aClass5_Sub15_Sub2_2);
																	}
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static603.aClass196_306 == Static398.aClass196_212) {
																	local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
																	local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
																	local232 = Static386.aClass5_Sub15_Sub2_2.method3683();
																	if (local232 == 65535) {
																		local232 = -1;
																	}
																	Static107.method1769(local71, local224, local232);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static398.aClass196_212 == Static181.aClass196_117) {
																	local224 = Static386.aClass5_Sub15_Sub2_2.method3646();
																	local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																	if (local71 == 65535) {
																		local71 = -1;
																	}
																	local232 = Static386.aClass5_Sub15_Sub2_2.method3689();
																	Static192.method2760(local232, local71, local224);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static76.aClass196_54 == Static398.aClass196_212) {
																	Static155.method2356(Static139.anInt2291, Static386.aClass5_Sub15_Sub2_2, Static150.aClass202_2);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static398.aClass196_212 == Static296.aClass196_162) {
																	local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
																	local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
																	local232 = Static386.aClass5_Sub15_Sub2_2.method3646();
																	local250 = Static386.aClass5_Sub15_Sub2_2.method3698() << 2;
																	local252 = Static386.aClass5_Sub15_Sub2_2.method3642();
																	Static607.method8169();
																	Static667.method8690(local250, local252, local232, local71, local224);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static541.aClass196_268 == Static398.aClass196_212) {
																	Static90.aString13 = Static139.anInt2291 > 2 ? Static386.aClass5_Sub15_Sub2_2.method3661() : Static49.aClass42_26.method730(Static259.anInt4113);
																	Static14.anInt209 = Static139.anInt2291 > 0 ? Static386.aClass5_Sub15_Sub2_2.method3698() : -1;
																	if (Static14.anInt209 == 65535) {
																		Static14.anInt209 = -1;
																	}
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static398.aClass196_212 == Static399.aClass196_215) {
																	Static557.anInt9100 = Static386.aClass5_Sub15_Sub2_2.method3667();
																	Static415.anInt7088 = Static386.aClass5_Sub15_Sub2_2.method3655();
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static415.aClass196_224 == Static398.aClass196_212) {
																	Static162.method6698(false);
																	Static398.aClass196_212 = null;
																	return false;
																} else if (Static398.aClass196_212 == Static194.aClass196_320) {
																	local224 = Static386.aClass5_Sub15_Sub2_2.method3635();
																	local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																	local232 = Static386.aClass5_Sub15_Sub2_2.method3635();
																	Static607.method8169();
																	Static271.method3792(5, local71, local232, local224);
																	Static398.aClass196_212 = null;
																	return true;
																} else if (Static620.aClass196_316 == Static398.aClass196_212) {
																	local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
																	local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
																	local815 = (local71 & 0x1) == 1;
																	Static458.method6768(local815, local224);
																	local250 = Static386.aClass5_Sub15_Sub2_2.method3698();
																	for (local252 = 0; local252 < local250; local252++) {
																		local521 = Static386.aClass5_Sub15_Sub2_2.method3655();
																		if (local521 == 255) {
																			local521 = Static386.aClass5_Sub15_Sub2_2.method3673();
																		}
																		local2484 = Static386.aClass5_Sub15_Sub2_2.method3698();
																		Static453.method6713(local2484 - 1, local224, local815, local521, local252);
																	}
																	Static348.anIntArray434[Static496.anInt8473++ & 0x1F] = local224;
																	Static398.aClass196_212 = null;
																	return true;
																} else {
																	@Pc(5058) Class273 local5058;
																	if (Static398.aClass196_212 == Static108.aClass196_75) {
																		local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
																		local815 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																		if (local815) {
																			local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
																		} else {
																			local965 = local2767;
																		}
																		local250 = Static386.aClass5_Sub15_Sub2_2.method3698();
																		@Pc(4975) byte local4975 = Static386.aClass5_Sub15_Sub2_2.method3677();
																		local1454 = false;
																		if (local4975 == -128) {
																			local1454 = true;
																		}
																		if (local1454) {
																			if (Static476.anInt8265 == 0) {
																				Static398.aClass196_212 = null;
																				return true;
																			}
																			for (local2484 = 0; local2484 < Static476.anInt8265 && (!Static151.aClass273Array5[local2484].aString80.equals(local965) || local250 != Static151.aClass273Array5[local2484].anInt7908); local2484++) {
																			}
																			if (local2484 < Static476.anInt8265) {
																				while (local2484 < Static476.anInt8265 - 1) {
																					Static151.aClass273Array5[local2484] = Static151.aClass273Array5[local2484 + 1];
																					local2484++;
																				}
																				Static476.anInt8265--;
																				Static151.aClass273Array5[Static476.anInt8265] = null;
																			}
																		} else {
																			local1503 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local5058 = new Class273();
																			local5058.aString80 = local965;
																			local5058.aString81 = local2767;
																			local5058.aString79 = Static555.method7630(local5058.aString80);
																			local5058.anInt7908 = local250;
																			local5058.aString78 = local1503;
																			local5058.aByte93 = local4975;
																			for (local1541 = Static476.anInt8265 - 1; local1541 >= 0; local1541--) {
																				local3992 = Static151.aClass273Array5[local1541].aString79.compareTo(local5058.aString79);
																				if (local3992 == 0) {
																					Static151.aClass273Array5[local1541].anInt7908 = local250;
																					Static151.aClass273Array5[local1541].aByte93 = local4975;
																					Static151.aClass273Array5[local1541].aString78 = local1503;
																					if (local965.equals(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100)) {
																						Static51.aByte42 = local4975;
																					}
																					Static554.anInt3882 = Static293.anInt4549;
																					Static398.aClass196_212 = null;
																					return true;
																				}
																				if (local3992 < 0) {
																					break;
																				}
																			}
																			if (Static476.anInt8265 >= Static151.aClass273Array5.length) {
																				Static398.aClass196_212 = null;
																				return true;
																			}
																			for (local3992 = Static476.anInt8265 - 1; local3992 > local1541; local3992--) {
																				Static151.aClass273Array5[local3992 + 1] = Static151.aClass273Array5[local3992];
																			}
																			if (Static476.anInt8265 == 0) {
																				Static151.aClass273Array5 = new Class273[100];
																			}
																			Static151.aClass273Array5[local1541 + 1] = local5058;
																			Static476.anInt8265++;
																			if (local965.equals(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100)) {
																				Static51.aByte42 = local4975;
																			}
																		}
																		Static554.anInt3882 = Static293.anInt4549;
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static140.aClass196_91 == Static398.aClass196_212) {
																		Static616.method8265(Static386.aClass5_Sub15_Sub2_2.method3661());
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static398.aClass196_212 == Static301.aClass196_164) {
																		Static630.anInt10061 = Static386.aClass5_Sub15_Sub2_2.method3641();
																		Static533.aBoolean637 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static125.aClass196_86 == Static398.aClass196_212) {
																		Static607.method8169();
																		Static429.method6470();
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static398.aClass196_212 == Static117.aClass196_80) {
																		local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
																		local71 = Static386.aClass5_Sub15_Sub2_2.method3635();
																		local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
																		local250 = Static386.aClass5_Sub15_Sub2_2.method3662();
																		local252 = Static386.aClass5_Sub15_Sub2_2.method3642();
																		local521 = Static386.aClass5_Sub15_Sub2_2.method3642();
																		local2484 = local252 & 0x7;
																		local1484 = local252 >> 3 & 0xF;
																		if (local1484 == 15) {
																			local1484 = -1;
																		}
																		if (local71 >> 30 == 0) {
																			@Pc(5465) Class65 local5465;
																			@Pc(5443) Class385 local5443;
																			@Pc(5459) Class65 local5459;
																			if (local71 >> 29 != 0) {
																				local1541 = local71 & 0xFFFF;
																				@Pc(5611) Class5_Sub34 local5611 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local1541);
																				if (local5611 != null) {
																					@Pc(5616) Class41_Sub1_Sub1_Sub3_Sub1 local5616 = local5611.aClass41_Sub1_Sub1_Sub3_Sub1_1;
																					@Pc(5621) Class329 local5621 = local5616.aClass329Array3[local521];
																					if (local232 == 65535) {
																						local232 = -1;
																					}
																					local4000 = true;
																					local4002 = local5621.anInt9066;
																					if (local232 != -1 && local4002 != -1) {
																						if (local232 == local4002) {
																							local5443 = Static312.aClass179_1.method3798(local232);
																							if (local5443.aBoolean742 && local5443.anInt10218 != -1) {
																								local5459 = Static459.aClass128_2.method2686(local5443.anInt10218);
																								@Pc(5663) int local5663 = local5459.anInt1425;
																								if (local5663 == 0 || local5663 == 2) {
																									local4000 = false;
																								} else if (local5663 == 1) {
																									local4000 = true;
																								}
																							}
																						} else {
																							local5443 = Static312.aClass179_1.method3798(local232);
																							@Pc(5689) Class385 local5689 = Static312.aClass179_1.method3798(local4002);
																							if (local5443.anInt10218 != -1 && local5689.anInt10218 != -1) {
																								local5465 = Static459.aClass128_2.method2686(local5443.anInt10218);
																								@Pc(5710) Class65 local5710 = Static459.aClass128_2.method2686(local5689.anInt10218);
																								if (local5465.anInt1419 < local5710.anInt1419) {
																									local4000 = false;
																								}
																							}
																						}
																					}
																					if (local4000) {
																						local5621.anInt9074 = local224;
																						local5621.anInt9077 = local1484;
																						local5621.anInt9076 = 0;
																						local5621.anInt9070 = local250 + Static421.anInt7434;
																						local5621.anInt9071 = 0;
																						local5621.anInt9066 = local232;
																						local5621.anInt9068 = local2484;
																						local5621.anInt9073 = 1;
																						if (local5621.anInt9066 == 65535) {
																							local5621.anInt9066 = -1;
																						}
																						if (local5621.anInt9070 > Static421.anInt7434) {
																							local5621.anInt9076 = -1;
																						}
																						if (local5621.anInt9066 != -1 && local5621.anInt9070 == Static421.anInt7434) {
																							local4504 = Static312.aClass179_1.method3798(local5621.anInt9066).anInt10218;
																							if (local4504 != -1) {
																								local5459 = Static459.aClass128_2.method2686(local4504);
																								if (local5459 != null && local5459.anIntArray75 != null && !local5616.aBoolean692) {
																									Static119.method1899(0, local5616, local5459);
																								}
																							}
																						}
																					}
																				}
																			} else if (local71 >> 28 != 0) {
																				local1541 = local71 & 0xFFFF;
																				@Pc(5394) Class41_Sub1_Sub1_Sub3_Sub2 local5394;
																				if (local1541 == Static177.anInt2910) {
																					local5394 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1;
																				} else {
																					local5394 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local1541];
																				}
																				if (local5394 != null) {
																					if (local232 == 65535) {
																						local232 = -1;
																					}
																					@Pc(5413) Class329 local5413 = local5394.aClass329Array3[local521];
																					local3127 = true;
																					local3129 = local5413.anInt9066;
																					@Pc(5492) Class65 local5492;
																					if (local232 != -1 && local3129 != -1) {
																						@Pc(5438) Class385 local5438;
																						if (local3129 == local232) {
																							local5438 = Static312.aClass179_1.method3798(local232);
																							if (local5438.aBoolean742 && local5438.anInt10218 != -1) {
																								local5492 = Static459.aClass128_2.method2686(local5438.anInt10218);
																								@Pc(5495) int local5495 = local5492.anInt1425;
																								if (local5495 == 0 || local5495 == 2) {
																									local3127 = false;
																								} else if (local5495 == 1) {
																									local3127 = true;
																								}
																							}
																						} else {
																							local5438 = Static312.aClass179_1.method3798(local232);
																							local5443 = Static312.aClass179_1.method3798(local3129);
																							if (local5438.anInt10218 != -1 && local5443.anInt10218 != -1) {
																								local5459 = Static459.aClass128_2.method2686(local5438.anInt10218);
																								local5465 = Static459.aClass128_2.method2686(local5443.anInt10218);
																								if (local5465.anInt1419 > local5459.anInt1419) {
																									local3127 = false;
																								}
																							}
																						}
																					}
																					if (local3127) {
																						local5413.anInt9071 = 0;
																						local5413.anInt9077 = local1484;
																						local5413.anInt9068 = local2484;
																						local5413.anInt9066 = local232;
																						local5413.anInt9074 = local224;
																						local5413.anInt9073 = 1;
																						local5413.anInt9076 = 0;
																						local5413.anInt9070 = Static421.anInt7434 + local250;
																						if (Static421.anInt7434 < local5413.anInt9070) {
																							local5413.anInt9076 = -1;
																						}
																						if (local5413.anInt9066 == 65535) {
																							local5413.anInt9066 = -1;
																						}
																						if (local5413.anInt9066 != -1 && local5413.anInt9070 == Static421.anInt7434) {
																							local4002 = Static312.aClass179_1.method3798(local5413.anInt9066).anInt10218;
																							if (local4002 != -1) {
																								local5492 = Static459.aClass128_2.method2686(local4002);
																								if (local5492 != null && local5492.anIntArray75 != null && !local5394.aBoolean692) {
																									Static119.method1899(0, local5394, local5492);
																								}
																							}
																						}
																					}
																				}
																			}
																		} else {
																			local1541 = local71 >> 28 & 0x3;
																			local3992 = (local71 >> 14 & 0x3FFF) - Static454.anInt7910;
																			local4493 = (local71 & 0x3FFF) - Static48.anInt750;
																			if (local3992 >= 0 && local4493 >= 0 && local3992 < Static124.anInt2150 && local4493 < Static64.anInt1015) {
																				local3738 = local3992 * 512 + 256;
																				local3129 = local4493 * 512 + 256;
																				local4002 = local1541;
																				if (local1541 < 3 && Static488.method7149(local3992, local4493)) {
																					local4002 = local1541 + 1;
																				}
																				@Pc(5366) Class41_Sub1_Sub1_Sub2 local5366 = new Class41_Sub1_Sub1_Sub2(local232, local250, Static421.anInt7434, local1541, local4002, local3738, Static161.method1246(local1541, local3129, local3738) - local224, local3129, local3992, local3992, local4493, local4493, local2484);
																				Static614.aClass124_99.method2574(new Class5_Sub2_Sub11(local5366));
																			}
																		}
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static398.aClass196_212 == Static64.aClass196_47) {
																		Static452.method6710(Static12.aClass74_21);
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static398.aClass196_212 == Static222.aClass196_133) {
																		Static675.anInt10641 = Static293.anInt4549;
																		local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																		@Pc(5831) Class364 local5831 = new Class364(Static386.aClass5_Sub15_Sub2_2);
																		@Pc(5835) Class233 local5835;
																		if (local961) {
																			local5835 = Static583.aClass233_2;
																		} else {
																			local5835 = Static619.aClass233_3;
																		}
																		local5831.method8270(local5835);
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static398.aClass196_212 == Static437.aClass196_237) {
																		Static439.method6575();
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static272.aClass196_154 == Static398.aClass196_212) {
																		local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
																		local71 = Static386.aClass5_Sub15_Sub2_2.method3698();
																		local339 = Static62.aClass100_2.method2047(local71).method193(Static386.aClass5_Sub15_Sub2_2);
																		Static272.method3804(local339, local2767, local2767, local2767, 19, local71, 0, (String) null);
																		Static398.aClass196_212 = null;
																		return true;
																	} else if (Static176.aClass196_113 == Static398.aClass196_212) {
																		local224 = Static386.aClass5_Sub15_Sub2_2.method3642();
																		Static607.method8169();
																		Static398.aClass196_212 = null;
																		Static534.anInt10371 = local224;
																		return true;
																	} else {
																		@Pc(5950) boolean local5950;
																		@Pc(5948) long local5948;
																		if (Static398.aClass196_212 == Static451.aClass196_246) {
																			local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																			local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local339 = local965;
																			if (local961) {
																				local339 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			}
																			local3106 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
																			local2241 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
																			local1484 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			local5948 = (local3106 << 32) + local2241;
																			local5950 = false;
																			local3738 = 0;
																			while (true) {
																				if (local3738 >= 100) {
																					if (local1484 <= 1) {
																						if (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633) {
																							local5950 = true;
																						} else if (Static115.method1838(local339)) {
																							local5950 = true;
																						}
																					}
																					break;
																				}
																				if (local5948 == Static346.aLongArray13[local3738]) {
																					local5950 = true;
																					break;
																				}
																				local3738++;
																			}
																			if (!local5950 && Static214.anInt3451 == 0) {
																				Static346.aLongArray13[Static648.anInt10235] = local5948;
																				Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
																				local3792 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
																				if (local1484 == 2) {
																					Static272.method3804(local3792, "<img=1>" + local339, "<img=1>" + local965, local965, 7, -1, 0, (String) null);
																				} else if (local1484 == 1) {
																					Static272.method3804(local3792, "<img=0>" + local339, "<img=0>" + local965, local965, 7, -1, 0, (String) null);
																				} else {
																					Static272.method3804(local3792, local339, local965, local965, 3, -1, 0, (String) null);
																				}
																			}
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static111.aClass196_342) {
																			Static554.anInt3882 = Static293.anInt4549;
																			if (Static139.anInt2291 == 0) {
																				Static398.aClass196_212 = null;
																				Static337.aString60 = null;
																				Static476.anInt8265 = 0;
																				Static371.aString65 = null;
																				Static151.aClass273Array5 = null;
																				return true;
																			}
																			Static337.aString60 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																			if (local961) {
																				Static386.aClass5_Sub15_Sub2_2.method3661();
																			}
																			@Pc(6123) long local6123 = Static386.aClass5_Sub15_Sub2_2.method3634();
																			Static371.aString65 = Static618.method8284(local6123);
																			Static504.aByte100 = Static386.aClass5_Sub15_Sub2_2.method3677();
																			local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			if (local250 == 255) {
																				Static398.aClass196_212 = null;
																				return true;
																			}
																			Static476.anInt8265 = local250;
																			@Pc(6147) Class273[] local6147 = new Class273[100];
																			for (local521 = 0; local521 < Static476.anInt8265; local521++) {
																				local6147[local521] = new Class273();
																				local6147[local521].aString81 = Static386.aClass5_Sub15_Sub2_2.method3661();
																				local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																				if (local961) {
																					local6147[local521].aString80 = Static386.aClass5_Sub15_Sub2_2.method3661();
																				} else {
																					local6147[local521].aString80 = local6147[local521].aString81;
																				}
																				local6147[local521].aString79 = Static555.method7630(local6147[local521].aString80);
																				local6147[local521].anInt7908 = Static386.aClass5_Sub15_Sub2_2.method3698();
																				local6147[local521].aByte93 = Static386.aClass5_Sub15_Sub2_2.method3677();
																				local6147[local521].aString78 = Static386.aClass5_Sub15_Sub2_2.method3661();
																				if (local6147[local521].aString80.equals(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100)) {
																					Static51.aByte42 = local6147[local521].aByte93;
																				}
																			}
																			local1541 = Static476.anInt8265;
																			while (local1541 > 0) {
																				local1541--;
																				local1732 = true;
																				for (local3992 = 0; local3992 < local1541; local3992++) {
																					if (local6147[local3992].aString79.compareTo(local6147[local3992 + 1].aString79) > 0) {
																						local5058 = local6147[local3992];
																						local6147[local3992] = local6147[local3992 + 1];
																						local6147[local3992 + 1] = local5058;
																						local1732 = false;
																					}
																				}
																				if (local1732) {
																					break;
																				}
																			}
																			Static398.aClass196_212 = null;
																			Static151.aClass273Array5 = local6147;
																			return true;
																		} else if (Static83.aClass196_58 == Static398.aClass196_212) {
																			Static596.anInt9715 = Static386.aClass5_Sub15_Sub2_2.method3655();
																			Static290.anInt10003 = Static386.aClass5_Sub15_Sub2_2.method3677() << 3;
																			Static447.anInt7822 = Static386.aClass5_Sub15_Sub2_2.method3658() << 3;
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static528.aClass196_264 == Static398.aClass196_212) {
																			local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																			Static607.method8169();
																			Static324.method5066(local71, local2767);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static498.aClass196_258) {
																			Static452.method6710(Static149.aClass74_7);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static460.aClass196_250 == Static398.aClass196_212) {
																			Static602.aByte143 = Static386.aClass5_Sub15_Sub2_2.method3677();
																			Static398.aClass196_212 = null;
																			if (Static602.aByte143 == 0 || Static602.aByte143 == 1) {
																				Static118.aBoolean145 = true;
																			}
																			return true;
																		} else if (Static398.aClass196_212 == Static4.aClass196_1) {
																			Static413.aClass63_1.method1220();
																			Static599.anInt9730 += 32;
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static301.aClass196_165 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3655();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3637();
																			local232 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			local250 = Static386.aClass5_Sub15_Sub2_2.method3646();
																			local252 = Static386.aClass5_Sub15_Sub2_2.method3655();
																			Static607.method8169();
																			Static322.aBooleanArray13[local250] = true;
																			Static156.anIntArray137[local250] = local252;
																			Static559.anIntArray503[local250] = local224;
																			Static229.anIntArray222[local250] = local232;
																			Static118.anIntArray106[local250] = local71;
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static408.aClass196_220 == Static398.aClass196_212) {
																			Static607.method8169();
																			Static353.method5241();
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static563.aClass196_283 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3635();
																			Static607.method8169();
																			Static398.aClass196_212 = null;
																			if (local224 == -1) {
																				Static297.anInt571 = -1;
																				Static67.anInt1033 = -1;
																			} else {
																				local71 = local224 >> 14 & 0x3FFF;
																				local71 -= Static454.anInt7910;
																				local232 = local224 & 0x3FFF;
																				local232 -= Static48.anInt750;
																				if (local71 < 0) {
																					local71 = 0;
																				} else if (local71 >= Static124.anInt2150) {
																					local71 = Static124.anInt2150;
																				}
																				Static297.anInt571 = (local71 << 9) + 256;
																				if (local232 < 0) {
																					local232 = 0;
																				} else if (local232 >= Static64.anInt1015) {
																					local232 = Static64.anInt1015;
																				}
																				Static67.anInt1033 = (local232 << 9) + 256;
																			}
																			return true;
																		} else if (Static71.aClass196_51 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3671();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			Static607.method8169();
																			Static343.method5203(local224, local71);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static333.aClass196_183 == Static398.aClass196_212) {
																			local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																			local965 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local3706 = (long) Static386.aClass5_Sub15_Sub2_2.method3698();
																			local3711 = (long) Static386.aClass5_Sub15_Sub2_2.method3633();
																			local2484 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			local1484 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			local5948 = (local3706 << 32) + local3711;
																			local5950 = false;
																			@Pc(6614) Class5_Sub49 local6614 = local961 ? Static394.aClass5_Sub49_2 : Static57.aClass5_Sub49_1;
																			if (local6614 == null) {
																				local5950 = true;
																			} else {
																				label2171: {
																					for (local3129 = 0; local3129 < 100; local3129++) {
																						if (local5948 == Static346.aLongArray13[local3129]) {
																							local5950 = true;
																							break label2171;
																						}
																					}
																					if (local2484 <= 1 && Static115.method1838(local965)) {
																						local5950 = true;
																					}
																				}
																			}
																			if (!local5950 && Static214.anInt3451 == 0) {
																				Static346.aLongArray13[Static648.anInt10235] = local5948;
																				Static648.anInt10235 = (Static648.anInt10235 + 1) % 100;
																				local3179 = Static62.aClass100_2.method2047(local1484).method193(Static386.aClass5_Sub15_Sub2_2);
																				local4002 = local961 ? 42 : 45;
																				if (local2484 == 2 || local2484 == 3) {
																					Static272.method3804(local3179, "<img=1>" + local965, "<img=1>" + local965, local965, local4002, local1484, 0, local6614.aString103);
																				} else if (local2484 == 1) {
																					Static272.method3804(local3179, "<img=0>" + local965, "<img=0>" + local965, local965, local4002, local1484, 0, local6614.aString103);
																				} else {
																					Static272.method3804(local3179, local965, local965, local965, local4002, local1484, 0, local6614.aString103);
																				}
																			}
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static467.aClass196_252 == Static398.aClass196_212) {
																			Static398.aClass196_212 = null;
																			Static223.anInt3567 = Static293.anInt4549;
																			Static182.anInt6963 = 1;
																			return true;
																		} else if (Static624.aClass196_318 == Static398.aClass196_212) {
																			Static277.aBoolean287 = Static386.aClass5_Sub15_Sub2_2.method3646() == 1;
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static100.aClass196_68 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3654();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3638();
																			local232 = Static386.aClass5_Sub15_Sub2_2.method3635();
																			Static607.method8169();
																			Static147.method8611(local71, local224, local232);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static633.aClass196_321 == Static398.aClass196_212) {
																			Static605.anInt9763 = Static293.anInt4549;
																			local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																			@Pc(6825) Class373 local6825 = new Class373(Static386.aClass5_Sub15_Sub2_2);
																			@Pc(6829) Class5_Sub49 local6829;
																			if (local961) {
																				local6829 = Static394.aClass5_Sub49_2;
																			} else {
																				local6829 = Static57.aClass5_Sub49_1;
																			}
																			local6825.method8379(local6829);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static226.aClass196_134) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3637();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3673();
																			local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			local250 = Static386.aClass5_Sub15_Sub2_2.method3683();
																			Static607.method8169();
																			Static105.method1745(local224, local232, local250, local71);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static440.aClass196_239) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			local2948 = Static386.aClass5_Sub15_Sub2_2.method3682();
																			Static413.aClass63_1.method1215(local2948, local224);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static20.aClass196_16 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
																			if (Static204.anInt3269 != local224) {
																				Static204.anInt3269 = local224;
																				Static497.method7212(Static107.aClass209_1, -1, -1);
																			}
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static252.aClass196_146) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3635();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																			if (local71 == 65535) {
																				local71 = -1;
																			}
																			Static607.method8169();
																			Static271.method3792(1, local71, local224, -1);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static84.aClass196_59 == Static398.aClass196_212) {
																			Static398.aClass196_212 = null;
																			return false;
																		} else if (Static398.aClass196_212 == Static663.aClass196_335) {
																			local2767 = Static386.aClass5_Sub15_Sub2_2.method3661();
																			local965 = Static372.method5468(Static11.method177(Static386.aClass5_Sub15_Sub2_2));
																			Static423.method6423(6, 0, local965, local2767, local2767, local2767);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static176.aClass196_112) {
																			Static605.anInt9763 = Static293.anInt4549;
																			local961 = Static386.aClass5_Sub15_Sub2_2.method3642() == 1;
																			if (Static139.anInt2291 != 1) {
																				if (local961) {
																					Static394.aClass5_Sub49_2 = new Class5_Sub49(Static386.aClass5_Sub15_Sub2_2);
																				} else {
																					Static57.aClass5_Sub49_1 = new Class5_Sub49(Static386.aClass5_Sub15_Sub2_2);
																				}
																				Static398.aClass196_212 = null;
																				return true;
																			}
																			if (local961) {
																				Static394.aClass5_Sub49_2 = null;
																			} else {
																				Static57.aClass5_Sub49_1 = null;
																			}
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static188.aClass196_121) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			if (local224 == 65535) {
																				local224 = -1;
																			}
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			local232 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			local250 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			local252 = Static386.aClass5_Sub15_Sub2_2.method3698();
																			Static99.method1646(local252, local232, local224, false, local71, local250);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static321.aClass196_176) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3673();
																			Static607.method8169();
																			Static271.method3792(3, -1, local224, -1);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static398.aClass196_212 == Static590.aClass196_299) {
																			Static452.method6710(Static600.aClass74_18);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static534.aClass196_334 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3683();
																			if (local224 == 65535) {
																				local224 = -1;
																			}
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3671();
																			local232 = Static386.aClass5_Sub15_Sub2_2.method3662();
																			if (local232 == 65535) {
																				local232 = -1;
																			}
																			local250 = Static386.aClass5_Sub15_Sub2_2.method3693();
																			Static607.method8169();
																			for (local252 = local232; local252 <= local224; local252++) {
																				local2241 = ((long) local250 << 32) + (long) local252;
																				local2247 = (Class5_Sub42) Static67.aClass335_8.method7766(local2241);
																				if (local2247 != null) {
																					local2259 = new Class5_Sub42(local71, local2247.anInt7814);
																					local2247.method8829();
																				} else if (local252 == -1) {
																					local2259 = new Class5_Sub42(local71, Static238.method3422(local250).aClass5_Sub42_2.anInt7814);
																				} else {
																					local2259 = new Class5_Sub42(local71, -1);
																				}
																				Static67.aClass335_8.method7770(local2241, local2259);
																			}
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static424.aClass196_230 == Static398.aClass196_212) {
																			local224 = Static386.aClass5_Sub15_Sub2_2.method3667();
																			local71 = Static386.aClass5_Sub15_Sub2_2.method3683();
																			Static607.method8169();
																			Static95.method1611(true, local71, local224);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static640.aClass196_325 == Static398.aClass196_212) {
																			Static442.method6606(Static139.anInt2291, Static386.aClass5_Sub15_Sub2_2);
																			Static398.aClass196_212 = null;
																			return true;
																		} else if (Static596.aClass196_302 == Static398.aClass196_212) {
																			Static514.anInt8684 = Static386.aClass5_Sub15_Sub2_2.method3642();
																			Static398.aClass196_212 = null;
																			return true;
																		} else {
																			Static17.method268("T1 - " + (Static398.aClass196_212 == null ? -1 : Static398.aClass196_212.method4065()) + "," + (Static587.aClass196_296 == null ? -1 : Static587.aClass196_296.method4065()) + "," + (Static527.aClass196_263 == null ? -1 : Static527.aClass196_263.method4065()) + " - " + Static139.anInt2291, (Throwable) null);
																			Static162.method6698(false);
																			return true;
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
