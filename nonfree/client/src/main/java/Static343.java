import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
	public static boolean aBoolean385;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!ll;")
	public static Class152 aClass152_11;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public static int anInt5750 = -1;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_104 = new Class186(17, 2);

	@OriginalMember(owner = "client!re", name = "F", descriptor = "[S")
	public static final short[] aShortArray74 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!re", name = "J", descriptor = "Lclient!vh;")
	public static final Class253 aClass253_3 = new Class253(1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	public static void method4831(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static55.aClass6_Sub15_Sub1_1.method2610(Static337.anInt5664) >= 15) {
				@Pc(18) int local18 = Static55.aClass6_Sub15_Sub1_1.method2604(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static450.aClass3_Sub3_Sub6_Sub2Array1[local18] == null) {
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local18] = new Class3_Sub3_Sub6_Sub2();
						local23 = true;
						Static450.aClass3_Sub3_Sub6_Sub2Array1[local18].anInt6731 = local18;
					}
					@Pc(44) Class3_Sub3_Sub6_Sub2 local44 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local18];
					Static345.anIntArray507[Static147.anInt7038++] = local18;
					local44.anInt6745 = Static125.anInt2225;
					if (local44.aClass17_1 != null && local44.aClass17_1.method285()) {
						Static405.method5558(local44);
					}
					@Pc(71) int local71 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
					@Pc(82) int local82 = Static55.aClass6_Sub15_Sub1_1.method2604(3) + 4 << 11 & 0x3AE0;
					@Pc(87) int local87 = Static55.aClass6_Sub15_Sub1_1.method2604(2);
					@Pc(94) int local94;
					if (arg0) {
						local94 = Static55.aClass6_Sub15_Sub1_1.method2604(8);
						if (local94 > 127) {
							local94 -= 256;
						}
					} else {
						local94 = Static55.aClass6_Sub15_Sub1_1.method2604(5);
						if (local94 > 15) {
							local94 -= 32;
						}
					}
					@Pc(114) int local114 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
					if (local114 == 1) {
						Static375.anIntArray545[Static80.anInt1573++] = local18;
					}
					@Pc(132) int local132;
					if (arg0) {
						local132 = Static55.aClass6_Sub15_Sub1_1.method2604(8);
						if (local132 > 127) {
							local132 -= 256;
						}
					} else {
						local132 = Static55.aClass6_Sub15_Sub1_1.method2604(5);
						if (local132 > 15) {
							local132 -= 32;
						}
					}
					local44.method5529(Static336.aClass59_2.method1468(Static55.aClass6_Sub15_Sub1_1.method2604(14)));
					local44.method5513(local44.aClass17_1.anInt344);
					local44.anInt6679 = local44.aClass17_1.anInt351 << 3;
					if (local44.anInt6679 == 0) {
						local44.method5522(0);
					} else if (local23) {
						local44.method5522(local82);
					}
					local44.method5525(local87, local132 + Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0], local44.method5512(), Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0] + local94, local71 == 1);
					if (local44.aClass17_1.method285()) {
						Static57.method1074(null, local44.anIntArray582[0], local44, 0, local44.aByte93, local44.anIntArray583[0], null);
					}
					continue;
				}
			}
			Static55.aClass6_Sub15_Sub1_1.method2613();
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
	public static void method4832() {
		@Pc(9) int local9 = Static319.anInt5203 * 128 + 64;
		@Pc(15) int local15 = Static363.anInt6129 * 128 + 64;
		@Pc(23) int local23 = Static165.method2689(local9, Static4.anInt30, local15) - Static11.anInt180;
		if (Static220.anInt3786 < 100) {
			if (local9 > Static32.anInt521) {
				Static32.anInt521 += Static220.anInt3786 * (local9 - Static32.anInt521) / 1000 + Static259.anInt4457;
				if (local9 < Static32.anInt521) {
					Static32.anInt521 = local9;
				}
			}
			if (local9 < Static32.anInt521) {
				Static32.anInt521 -= Static259.anInt4457 + Static220.anInt3786 * (Static32.anInt521 - local9) / 1000;
				if (local9 > Static32.anInt521) {
					Static32.anInt521 = local9;
				}
			}
			if (local23 > Static354.anInt5973) {
				Static354.anInt5973 += Static259.anInt4457 + Static220.anInt3786 * (local23 - Static354.anInt5973) / 1000;
				if (local23 < Static354.anInt5973) {
					Static354.anInt5973 = local23;
				}
			}
			if (Static354.anInt5973 > local23) {
				Static354.anInt5973 -= (Static354.anInt5973 - local23) * Static220.anInt3786 / 1000 + Static259.anInt4457;
				if (Static354.anInt5973 < local23) {
					Static354.anInt5973 = local23;
				}
			}
			if (local15 > Static214.anInt3730) {
				Static214.anInt3730 += Static259.anInt4457 + (local15 - Static214.anInt3730) * Static220.anInt3786 / 1000;
				if (local15 < Static214.anInt3730) {
					Static214.anInt3730 = local15;
				}
			}
			if (Static214.anInt3730 > local15) {
				Static214.anInt3730 -= Static220.anInt3786 * (Static214.anInt3730 - local15) / 1000 + Static259.anInt4457;
				if (Static214.anInt3730 < local15) {
					Static214.anInt3730 = local15;
				}
			}
		} else {
			Static214.anInt3730 = Static363.anInt6129 * 128 + 64;
			Static32.anInt521 = Static319.anInt5203 * 128 + 64;
			Static354.anInt5973 = Static165.method2689(Static32.anInt521, Static4.anInt30, Static214.anInt3730) - Static11.anInt180;
		}
		local9 = Static38.anInt852 * 128 + 64;
		local15 = Static5.anInt47 * 128 + 64;
		local23 = Static165.method2689(local9, Static4.anInt30, local15) - Static46.anInt5784;
		@Pc(223) int local223 = local9 - Static32.anInt521;
		@Pc(228) int local228 = local23 - Static354.anInt5973;
		@Pc(233) int local233 = local15 - Static214.anInt3730;
		@Pc(244) int local244 = (int) Math.sqrt((double) (local233 * local233 + local223 * local223));
		@Pc(255) int local255 = (int) (Math.atan2((double) local228, (double) local244) * 2607.5945876176133D) & 0x3FFF;
		@Pc(266) int local266 = (int) (Math.atan2((double) local223, (double) local233) * -2607.5945876176133D) & 0x3FFF;
		if (local255 < 1024) {
			local255 = 1024;
		}
		if (local255 > 3072) {
			local255 = 3072;
		}
		if (Static303.anInt4990 < local255) {
			Static303.anInt4990 += Static325.anInt5317 + Static131.anInt2335 * (local255 - Static303.anInt4990 >> 3) / 1000 << 3;
			if (Static303.anInt4990 > local255) {
				Static303.anInt4990 = local255;
			}
		}
		if (local255 < Static303.anInt4990) {
			Static303.anInt4990 -= Static325.anInt5317 + (Static303.anInt4990 - local255 >> 3) * Static131.anInt2335 / 1000 << 3;
			if (Static303.anInt4990 < local255) {
				Static303.anInt4990 = local255;
			}
		}
		@Pc(344) int local344 = local266 - Static217.anInt3768;
		if (local344 > 8192) {
			local344 -= 16384;
		}
		if (local344 < -8192) {
			local344 += 16384;
		}
		local344 >>= 0x3;
		if (local344 > 0) {
			Static217.anInt3768 += Static325.anInt5317 + Static131.anInt2335 * local344 / 1000 << 3;
			Static217.anInt3768 &= 0x3FFF;
		}
		if (local344 < 0) {
			Static217.anInt3768 -= Static325.anInt5317 + Static131.anInt2335 * -local344 / 1000 << 3;
			Static217.anInt3768 &= 0x3FFF;
		}
		@Pc(403) int local403 = local266 - Static217.anInt3768;
		if (local403 > 8192) {
			local403 -= 16384;
		}
		if (local403 < -8192) {
			local403 += 16384;
		}
		Static189.anInt6581 = 0;
		if (local403 < 0 && local344 > 0 || local403 > 0 && local344 < 0) {
			Static217.anInt3768 = local266;
		}
	}
}
