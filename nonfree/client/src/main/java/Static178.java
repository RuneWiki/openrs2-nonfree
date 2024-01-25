import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
	public static boolean aBoolean188;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method2507() {
		if (Static96.aClass6_Sub22_7.aClass29_Sub29_2.method9003() != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static61.anInt1167 - 4 & 0xFF);
		@Pc(29) int local29 = Static61.anInt1167 % Static491.anInt9856;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static393.anInt6574; local35++) {
				Static75.aByteArrayArrayArray1[local31][local29][local35] = local25;
			}
		}
		if (Static253.anInt4353 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static357.anIntArray361[local35] = -1000000;
			Static53.anIntArray62[local35] = 1000000;
			Static201.anIntArray601[local35] = 0;
			Static666.anIntArray708[local35] = 1000000;
			Static163.anIntArray155[local35] = 0;
		}
		@Pc(90) int local90 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006;
		@Pc(93) int local93 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001;
		@Pc(105) int local105;
		if (Static407.anInt6820 != 1 && Static601.anInt9806 == -1) {
			local105 = Static284.method4118(Static23.anInt564, Static253.anInt4353, Static542.anInt9140);
			if (local105 - Static170.anInt2855 < 3200 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][Static23.anInt564 >> 9][Static542.anInt9140 >> 9] & 0x4) != 0) {
				Static278.method8279(Static441.aClass351ArrayArrayArray1, 1, Static542.anInt9140 >> 9, Static23.anInt564 >> 9, false);
				return;
			}
			return;
		}
		if (Static407.anInt6820 != 1) {
			local93 = Static258.anInt4491;
			local90 = Static601.anInt9806;
		}
		if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local90 >> 9][local93 >> 9] & 0x4) != 0) {
			Static278.method8279(Static441.aClass351ArrayArrayArray1, 0, local93 >> 9, local90 >> 9, false);
		}
		if (Static598.anInt9788 >= 2560) {
			return;
		}
		local105 = Static23.anInt564 >> 9;
		@Pc(191) int local191 = Static542.anInt9140 >> 9;
		@Pc(195) int local195 = local90 >> 9;
		@Pc(199) int local199 = local93 >> 9;
		@Pc(211) int local211;
		if (local105 >= local195) {
			local211 = local105 - local195;
		} else {
			local211 = local195 - local105;
		}
		@Pc(230) int local230;
		if (local191 < local199) {
			local230 = local199 - local191;
		} else {
			local230 = local191 - local199;
		}
		if (local211 == 0 && local230 == 0 || -Static491.anInt9856 >= local211 || Static491.anInt9856 <= local211 || -Static393.anInt6574 >= local230 || Static393.anInt6574 <= local230) {
			Static664.method9007((Throwable) null, "RC: " + local105 + "," + local191 + " " + local195 + "," + local199 + " " + Static534.anInt8753 + "," + Static234.anInt4239);
			return;
		}
		@Pc(302) int local302;
		@Pc(304) int local304;
		if (local230 < local211) {
			local302 = local230 * 65536 / local211;
			local304 = 32768;
			while (local105 != local195) {
				if (local105 < local195) {
					local105++;
				} else if (local195 < local105) {
					local105--;
				}
				if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local105][local191] & 0x4) != 0) {
					Static278.method8279(Static441.aClass351ArrayArrayArray1, 1, local191, local105, false);
					return;
				}
				local304 += local302;
				if (local304 >= 65536) {
					if (local199 > local191) {
						local191++;
					} else if (local191 > local199) {
						local191--;
					}
					local304 -= 65536;
					if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local105][local191] & 0x4) != 0) {
						Static278.method8279(Static441.aClass351ArrayArrayArray1, 1, local191, local105, false);
						return;
					}
				}
			}
			return;
		}
		local302 = local211 * 65536 / local230;
		local304 = 32768;
		while (local191 != local199) {
			if (local199 > local191) {
				local191++;
			} else if (local199 < local191) {
				local191--;
			}
			if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local105][local191] & 0x4) != 0) {
				Static278.method8279(Static441.aClass351ArrayArrayArray1, 1, local191, local105, false);
				return;
			}
			local304 += local302;
			if (local304 >= 65536) {
				local304 -= 65536;
				if (local105 < local195) {
					local105++;
				} else if (local105 > local195) {
					local105--;
				}
				if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local105][local191] & 0x4) != 0) {
					Static278.method8279(Static441.aClass351ArrayArrayArray1, 1, local191, local105, false);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method2508(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(35) int local35 = (arg0 & 0x7F) * 96 >> 7;
			if (local35 < 2) {
				local35 = 2;
			} else if (local35 > 126) {
				local35 = 126;
			}
			return local35 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg1, 4);
		local9.method7976();
		local9.anInt9463 = arg2;
		local9.anInt9466 = arg0;
		local9.anInt9464 = arg3;
	}
}
