import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public static int anInt835;

	// $FF: synthetic field
	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass4;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
	public static int method789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)Z")
	public static boolean method790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ha;IB)Z")
	public static boolean method791(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static544.anInt9261 - 104) / 2;
		@Pc(25) int local25 = (Static282.anInt4887 - 104) / 2;
		@Pc(27) boolean local27 = true;
		@Pc(39) int local39;
		@Pc(52) int local52;
		for (@Pc(29) int local29 = local11; local29 < local11 + 104; local29++) {
			for (@Pc(35) int local35 = local25; local35 < local25 + 104; local35++) {
				for (local39 = arg1; local39 <= 3; local39++) {
					if (Static602.method8660(local39, local35, arg1, local29)) {
						local52 = local39;
						if (Static90.method1353(1, local35, local29)) {
							local52 = local39 - 1;
						}
						if (local52 >= 0) {
							local27 &= Static117.method1657(local29, local52, local35);
						}
					}
				}
			}
		}
		if (!local27) {
			return false;
		}
		@Pc(110) int[] local110 = new int[262144];
		for (local39 = 0; local39 < local110.length; local39++) {
			local110[local39] = -16777216;
		}
		Static161.aClass134_21 = arg0.method7679(512, local110, 512, 512);
		Static303.method4657();
		local52 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(180) int local180 = ((int) (Math.random() * 20.0D) + 228 | 0x8B38FF00) << 16;
		@Pc(199) int local199 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(209) boolean[][] local209 = new boolean[Static333.anInt5935 + 3][Static333.anInt5935 + 1 + 2];
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(227) int local227;
		@Pc(229) int local229;
		@Pc(237) int local237;
		@Pc(249) int local249;
		@Pc(261) int local261;
		@Pc(289) int local289;
		@Pc(295) int local295;
		@Pc(366) int local366;
		@Pc(372) int local372;
		@Pc(376) int local376;
		@Pc(399) int local399;
		for (@Pc(211) int local211 = local11; local211 < local11 + 104; local211 += Static333.anInt5935) {
			for (local219 = local25; local219 < local25 + 104; local219 += Static333.anInt5935) {
				local225 = 0;
				local227 = 0;
				local229 = local211;
				if (local211 > 0) {
					local225 += 4;
					local229 = local211 - 1;
				}
				local237 = local219;
				if (local219 > 0) {
					local237 = local219 - 1;
				}
				local249 = Static333.anInt5935 + local211;
				if (local249 < 104) {
					local249++;
				}
				local261 = local219 + Static333.anInt5935;
				if (local261 < 104) {
					local261++;
					local227 += 4;
				}
				arg0.KA(0, 0, Static333.anInt5935 * 4 + local225, Static333.anInt5935 * 4 + local227);
				arg0.GA(-16777216);
				@Pc(301) int local301;
				for (local289 = arg1; local289 <= 3; local289++) {
					for (local295 = 0; local295 <= Static333.anInt5935; local295++) {
						for (local301 = 0; local301 <= Static333.anInt5935; local301++) {
							local209[local295][local301] = Static602.method8660(local289, local237 + local301, arg1, local229 + local295);
						}
					}
					Static220.aClass22Array2[local289].method8035(local229, local237, local249, local261, local209);
					if (!Static654.aBoolean774) {
						for (local301 = -4; local301 < Static333.anInt5935; local301++) {
							for (local366 = -4; local366 < Static333.anInt5935; local366++) {
								local372 = local211 + local301;
								local376 = local366 + local219;
								if (local11 <= local372 && local25 <= local376 && Static602.method8660(local289, local376, arg1, local372)) {
									local399 = local289;
									if (Static90.method1353(1, local376, local372)) {
										local399 = local289 - 1;
									}
									if (local399 >= 0) {
										Static235.method3414(local52, (Static333.anInt5935 - local366) * 4 + local227 - 4, local376, local180, arg0, local399, local372, local225 + local301 * 4);
									}
								}
							}
						}
					}
				}
				if (Static654.aBoolean774) {
					@Pc(463) Class88 local463 = Static670.aClass88Array1[arg1];
					for (local301 = 0; local301 < Static333.anInt5935; local301++) {
						for (local366 = 0; local366 < Static333.anInt5935; local366++) {
							local372 = local301 + local211;
							local376 = local219 + local366;
							local399 = local463.anIntArrayArray12[local372 - local463.anInt1778][local376 - local463.anInt1763];
							if ((local399 & 0x40240000) != 0) {
								arg0.method7731(-1713569622, local225 + local301 * 4, 4, 4, local227 + (Static333.anInt5935 - local366) * 4 - 4);
							} else if ((local399 & 0x800000) != 0) {
								arg0.method7709(-1713569622, 4, local301 * 4 + local225, local227 + -4 + (-local366 + Static333.anInt5935) * 4);
							} else if ((local399 & 0x2000000) != 0) {
								arg0.method7647(4, local227 + (Static333.anInt5935 - local366) * 4 - 4, local301 * 4 + local225 - -3, -1713569622);
							} else if ((local399 & 0x8000000) != 0) {
								arg0.method7709(-1713569622, 4, local225 + local301 * 4, (-local366 + Static333.anInt5935) * 4 + 3 + local227 + -4);
							} else if ((local399 & 0x20000000) != 0) {
								arg0.method7647(4, (Static333.anInt5935 - local366) * 4 + local227 - 4, local225 - -(local301 * 4), -1713569622);
							}
						}
					}
				}
				arg0.aa(local225, local227, Static333.anInt5935 * 4, Static333.anInt5935 * 4, local199, 2);
				Static161.aClass134_21.method9225((local211 - local11) * 4 + 48, -(Static333.anInt5935 * 4) + -((local219 - local25) * 4) + 464, Static333.anInt5935 * 4, Static333.anInt5935 * 4, local225, local227);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static437.method6493();
		Static301.anInt9106 = 0;
		Static551.aClass102_66.method1932();
		if (!Static654.aBoolean774) {
			for (local219 = local11; local219 < local11 + 104; local219++) {
				for (local225 = local25; local225 < local25 + 104; local225++) {
					for (local227 = arg1; arg1 + 1 >= local227 && local227 <= 3; local227++) {
						if (Static602.method8660(local227, local225, arg1, local219)) {
							@Pc(782) Interface16 local782 = (Interface16) Static209.method3036(local227, local219, local225);
							if (local782 == null) {
								local782 = (Interface16) Static465.method5496(local227, local219, local225, aClass4 == null ? (aClass4 = Class46.a("nda")) : aClass4);
							}
							if (local782 == null) {
								local782 = (Interface16) Static87.method1318(local227, local219, local225);
							}
							if (local782 == null) {
								local782 = (Interface16) Static532.method7888(local227, local219, local225);
							}
							if (local782 != null) {
								@Pc(828) Class55 local828 = Static536.aClass392_2.method9293(0, local782.method8089());
								if (!local828.aBoolean77 || Static475.aBoolean605) {
									local249 = local828.anInt938;
									if (local828.anIntArray46 != null) {
										for (local261 = 0; local261 < local828.anIntArray46.length; local261++) {
											if (local828.anIntArray46[local261] != -1) {
												@Pc(862) Class55 local862 = Static536.aClass392_2.method9293(0, local828.anIntArray46[local261]);
												if (local862.anInt938 >= 0) {
													local249 = local862.anInt938;
												}
											}
										}
									}
									if (local249 >= 0) {
										@Pc(887) boolean local887 = false;
										if (local249 >= 0) {
											@Pc(894) Class315 local894 = Static2.aClass33_1.method657(local249);
											if (local894 != null && local894.aBoolean672) {
												local887 = true;
											}
										}
										local289 = local219;
										local295 = local225;
										if (local887) {
											@Pc(914) int[][] local914 = Static670.aClass88Array1[local227].anIntArrayArray12;
											local366 = Static670.aClass88Array1[local227].anInt1778;
											local372 = Static670.aClass88Array1[local227].anInt1763;
											for (local376 = 0; local376 < 10; local376++) {
												local399 = (int) (Math.random() * 4.0D);
												if (local399 == 0 && local11 < local289 && local219 - 3 < local289 && (local914[local289 - local366 - 1][local295 - local372] & 0x2C0108) == 0) {
													local289--;
												}
												if (local399 == 1 && local11 + 104 - 1 > local289 && local219 + 3 > local289 && (local914[local289 + 1 - local366][local295 - local372] & 0x2C0180) == 0) {
													local289++;
												}
												if (local399 == 2 && local25 < local295 && local225 - 3 < local295 && (local914[local289 - local366][local295 - local372 - 1] & 0x2C0102) == 0) {
													local295--;
												}
												if (local399 == 3 && local295 < local25 + 104 - 1 && local295 < local225 + 3 && (local914[local289 - local366][local295 + 1 - local372] & 0x2C0120) == 0) {
													local295++;
												}
											}
										}
										Static411.anIntArray424[Static301.anInt9106] = local828.anInt911;
										Static532.anIntArray520[Static301.anInt9106] = local289;
										Static360.anIntArray345[Static301.anInt9106] = local295;
										Static301.anInt9106++;
									}
								}
							}
						}
					}
				}
			}
			if (Static557.aClass197_1 != null) {
				Static449.aClass208_104.anInt5851 = 1;
				Static2.aClass33_1.method656(64, 1024);
				for (local225 = 0; local225 < Static557.aClass197_1.anInt5405; local225++) {
					local227 = Static557.aClass197_1.anIntArray292[local225];
					if (local227 >> 28 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145) {
						local229 = (local227 >> 14 & 0x3FFF) - Static622.anInt10188;
						local237 = (local227 & 0x3FFF) - Static668.anInt10683;
						if (local229 >= 0 && local229 < Static544.anInt9261 && local237 >= 0 && Static282.anInt4887 > local237) {
							Static551.aClass102_66.method1921(new Class5_Sub29(local225));
						} else {
							@Pc(1221) Class315 local1221 = Static2.aClass33_1.method657(Static557.aClass197_1.anIntArray291[local225]);
							if (local1221.anIntArray514 != null && local229 + local1221.anInt8873 >= 0 && local1221.anInt8897 + local229 < Static544.anInt9261 && local1221.anInt8882 + local237 >= 0 && Static282.anInt4887 > local237 + local1221.anInt8888) {
								Static551.aClass102_66.method1921(new Class5_Sub29(local225));
							}
						}
					}
				}
				Static2.aClass33_1.method656(64, 128);
				Static449.aClass208_104.anInt5851 = 2;
				Static449.aClass208_104.method5001();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method792() {
		@Pc(7) Class286 local7 = null;
		try {
			@Pc(13) Class366 local13 = Static294.aClass230_3.method5344("");
			while (local13.anInt10206 == 0) {
				Static351.method5279(1L);
			}
			if (local13.anInt10206 == 1) {
				local7 = (Class286) local13.anObject18;
				@Pc(40) Class5_Sub23 local40 = Static637.aClass5_Sub20_31.method3197();
				local7.method6821(0, local40.aByteArray102, local40.anInt9869);
			}
		} catch (@Pc(52) Exception local52) {
		}
		try {
			if (local7 != null) {
				local7.method6820();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}
}
