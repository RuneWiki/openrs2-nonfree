import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "Z")
	public static final boolean aBoolean539 = true;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray17 = new int[2][][];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Z")
	public static boolean method6950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!ha;IIIIIBI)V")
	public static void method6951(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		arg0.method8644(arg4, -10660793, arg3, arg2, arg1);
		arg0.method8644(arg4 + 1, -16777216, -2 + arg3, arg2 + 1, 16);
		arg0.method8620(arg4 + 18, -16777216, -2 + arg3, arg2 + 1, arg1 + -19);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Lclient!kca;")
	public static Class5_Sub1_Sub10 method6952(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub10 local10 = (Class5_Sub1_Sub10) Static397.aClass370_5.method8484((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static230.aClass126_115.method3086(0, arg0);
		if (local29 == null || local29.length <= 1) {
			return null;
		}
		try {
			local10 = Static84.method1344(local29);
		} catch (@Pc(46) Exception local46) {
			throw new RuntimeException(local46.getMessage() + " S: " + arg0);
		}
		Static397.aClass370_5.method8485(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method6954() {
		if (Static577.aClass5_Sub19_25.aClass17_Sub19_2.method6648() != 2) {
			return;
		}
		@Pc(22) byte local22 = (byte) (Static154.anInt3001 - 4 & 0xFF);
		@Pc(26) int local26 = Static154.anInt3001 % Static271.anInt4910;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			for (@Pc(32) int local32 = 0; local32 < Static613.anInt9909; local32++) {
				Static524.aByteArrayArrayArray22[local28][local26][local32] = local22;
			}
		}
		if (Static324.anInt5529 == 3) {
			return;
		}
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			Static371.anIntArray362[local76] = -1000000;
			Static250.anIntArray249[local76] = 1000000;
			Static553.anIntArray497[local76] = 0;
			Static497.anIntArray462[local76] = 1000000;
			Static442.anIntArray434[local76] = 0;
		}
		@Pc(109) int local109 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
		@Pc(112) int local112 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
		@Pc(171) int local171;
		if (Static426.anInt7111 != 1 && Static227.anInt9451 == -1) {
			local171 = Static461.method6500(Static141.anInt2764, Static324.anInt5529, Static282.anInt5025);
			if (local171 - Static42.anInt703 < 3200 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][Static141.anInt2764 >> 9][Static282.anInt5025 >> 9] & 0x4) != 0) {
				Static154.method2821(Static283.aClass128ArrayArrayArray1, Static141.anInt2764 >> 9, 1, Static282.anInt5025 >> 9, false);
				return;
			}
			return;
		}
		if (Static426.anInt7111 != 1) {
			local112 = Static417.anInt7039;
			local109 = Static227.anInt9451;
		}
		if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local109 >> 9][local112 >> 9] & 0x4) != 0) {
			Static154.method2821(Static283.aClass128ArrayArrayArray1, local109 >> 9, 0, local112 >> 9, false);
		}
		if (Static96.anInt10862 >= 2560) {
			return;
		}
		local171 = Static141.anInt2764 >> 9;
		@Pc(175) int local175 = Static282.anInt5025 >> 9;
		@Pc(179) int local179 = local109 >> 9;
		@Pc(183) int local183 = local112 >> 9;
		@Pc(191) int local191;
		if (local171 >= local179) {
			local191 = local171 - local179;
		} else {
			local191 = local179 - local171;
		}
		@Pc(206) int local206;
		if (local183 <= local175) {
			local206 = local175 - local183;
		} else {
			local206 = local183 - local175;
		}
		if ((local191 != 0 || local206 != 0) && local191 > (-Static271.anInt4910) && Static271.anInt4910 > local191 && local206 > -Static613.anInt9909 && local206 < Static613.anInt9909) {
			@Pc(295) int local295;
			@Pc(297) int local297;
			if (local206 >= local191) {
				local295 = local191 * 65536 / local206;
				local297 = 32768;
				while (local183 != local175) {
					if (local175 < local183) {
						local175++;
					} else if (local175 > local183) {
						local175--;
					}
					if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local171][local175] & 0x4) != 0) {
						Static154.method2821(Static283.aClass128ArrayArrayArray1, local171, 1, local175, false);
						return;
					}
					local297 += local295;
					if (local297 >= 65536) {
						local297 -= 65536;
						if (local171 < local179) {
							local171++;
						} else if (local179 < local171) {
							local171--;
						}
						if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local171][local175] & 0x4) != 0) {
							Static154.method2821(Static283.aClass128ArrayArrayArray1, local171, 1, local175, false);
							return;
						}
					}
				}
				return;
			}
			local295 = local206 * 65536 / local191;
			local297 = 32768;
			while (local171 != local179) {
				if (local171 < local179) {
					local171++;
				} else if (local171 > local179) {
					local171--;
				}
				if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local171][local175] & 0x4) != 0) {
					Static154.method2821(Static283.aClass128ArrayArrayArray1, local171, 1, local175, false);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					local297 -= 65536;
					if (local175 < local183) {
						local175++;
					} else if (local183 < local175) {
						local175--;
					}
					if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local171][local175] & 0x4) != 0) {
						Static154.method2821(Static283.aClass128ArrayArrayArray1, local171, 1, local175, false);
						return;
					}
				}
			}
			return;
		}
		Static522.method7115((Throwable) null, "RC: " + local171 + "," + local175 + " " + local179 + "," + local183 + " " + Static315.anInt5380 + "," + Static290.anInt5128);
		return;
	}
}
