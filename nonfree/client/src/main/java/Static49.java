import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!ls;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt1295;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_2 = new Class55(12, -1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method1206(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static650.method2274(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public static void method1208() {
		if (Static305.aClass2_Sub49_15.aClass33_Sub29_1.method8714() != 2) {
			return;
		}
		@Pc(27) byte local27 = (byte) (Static364.anInt6282 - 4 & 0xFF);
		@Pc(31) int local31 = Static364.anInt6282 % Static456.anInt7428;
		@Pc(37) int local37;
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			for (local37 = 0; local37 < Static5.anInt112; local37++) {
				Static582.aByteArrayArrayArray17[local33][local31][local37] = local27;
			}
		}
		if (Static531.anInt8550 == 3) {
			return;
		}
		for (local37 = 0; local37 < 2; local37++) {
			Static165.anIntArray219[local37] = -1000000;
			Static237.anIntArray283[local37] = 1000000;
			Static327.anIntArray367[local37] = 0;
			Static494.anIntArray569[local37] = 1000000;
			Static447.anIntArray498[local37] = 0;
		}
		@Pc(92) int local92 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
		@Pc(95) int local95 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
		@Pc(108) int local108;
		if (Static407.anInt6909 != 1 && Static644.anInt10415 == -1) {
			local108 = Static392.method5799(Static531.anInt8550, Static576.anInt9403, Static63.anInt1715);
			if (local108 - Static479.anInt7769 < 3200 && (Static372.aByteArrayArrayArray3[Static531.anInt8550][Static576.anInt9403 >> 9][Static63.anInt1715 >> 9] & 0x4) != 0) {
				Static274.method4475(Static348.aClass84ArrayArrayArray5, false, Static576.anInt9403 >> 9, Static63.anInt1715 >> 9, 1);
				return;
			}
			return;
		}
		if (Static407.anInt6909 != 1) {
			local95 = Static648.anInt10476;
			local92 = Static644.anInt10415;
		}
		if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local92 >> 9][local95 >> 9] & 0x4) != 0) {
			Static274.method4475(Static348.aClass84ArrayArrayArray5, false, local92 >> 9, local95 >> 9, 0);
		}
		if (Static502.anInt9930 >= 2560) {
			return;
		}
		local108 = Static576.anInt9403 >> 9;
		@Pc(189) int local189 = Static63.anInt1715 >> 9;
		@Pc(193) int local193 = local92 >> 9;
		@Pc(197) int local197 = local95 >> 9;
		@Pc(205) int local205;
		if (local193 <= local108) {
			local205 = local108 - local193;
		} else {
			local205 = local193 - local108;
		}
		@Pc(220) int local220;
		if (local197 <= local189) {
			local220 = local189 - local197;
		} else {
			local220 = local197 - local189;
		}
		if (local205 == 0 && local220 == 0 || -Static456.anInt7428 >= local205 || Static456.anInt7428 <= local205 || local220 <= -Static5.anInt112 || local220 >= Static5.anInt112) {
			Static25.method7457((Throwable) null, "RC: " + local108 + "," + local189 + " " + local193 + "," + local197 + " " + Static406.anInt6899 + "," + Static338.anInt5885);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local205 <= local220) {
			local295 = local205 * 65536 / local220;
			local297 = 32768;
			while (local189 != local197) {
				if (local197 > local189) {
					local189++;
				} else if (local189 > local197) {
					local189--;
				}
				if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local108][local189] & 0x4) != 0) {
					Static274.method4475(Static348.aClass84ArrayArrayArray5, false, local108, local189, 1);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					if (local193 > local108) {
						local108++;
					} else if (local193 < local108) {
						local108--;
					}
					local297 -= 65536;
					if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local108][local189] & 0x4) != 0) {
						Static274.method4475(Static348.aClass84ArrayArrayArray5, false, local108, local189, 1);
						return;
					}
				}
			}
			return;
		}
		local295 = local220 * 65536 / local205;
		local297 = 32768;
		while (local108 != local193) {
			if (local193 > local108) {
				local108++;
			} else if (local108 > local193) {
				local108--;
			}
			if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local108][local189] & 0x4) != 0) {
				Static274.method4475(Static348.aClass84ArrayArrayArray5, false, local108, local189, 1);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				local297 -= 65536;
				if (local189 < local197) {
					local189++;
				} else if (local189 > local197) {
					local189--;
				}
				if ((Static372.aByteArrayArrayArray3[Static531.anInt8550][local108][local189] & 0x4) != 0) {
					Static274.method4475(Static348.aClass84ArrayArrayArray5, false, local108, local189, 1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static612.anInt8415 == arg1 && arg0 == Static595.anInt9885 && arg2 == Static129.anInt2698) {
			return;
		}
		Static612.anInt8415 = arg1;
		Static129.anInt2698 = arg2;
		Static578.aBoolean673 = true;
		Static595.anInt9885 = arg0;
		@Pc(39) double local39 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static242.aDouble11 = local52 * local58;
		Static602.aDouble23 = 0.0D;
		Static277.aDouble12 = local61;
		Static644.aDouble24 = -local52 * local61;
		Static485.aDouble18 = local52;
		Static77.aDouble1 = local55;
		Static600.aDouble22 = local58 * -local55;
		Static543.aDouble20 = local58;
		Static460.aDouble15 = local61 * local55;
	}
}
