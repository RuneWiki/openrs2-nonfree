import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mj", name = "J", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_60 = new Class179(58, 3);

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_61 = new Class179(2, 6);

	@OriginalMember(owner = "client!mj", name = "S", descriptor = "[Lclient!bo;")
	public static final Class26[] aClass26Array2 = new Class26[30];

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
	public static void method4273() {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(15, 0);
		local8.method1775();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BB)C")
	public static char method4274(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(49) char local49 = Static289.aCharArray9[local7 - 128];
			if (local49 == '\u0000') {
				local49 = '?';
			}
			local7 = local49;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZ)V")
	public static void method4276(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static206.aClass1_Sub5_Sub1_2.method309(Static167.anInt3076) >= 15) {
				@Pc(14) int local14 = Static206.aClass1_Sub5_Sub1_2.method316(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static98.aClass31_Sub2_Sub1_Sub2Array1[local14] == null) {
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local14] = new Class31_Sub2_Sub1_Sub2();
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local14].anInt7301 = local14;
						local19 = true;
					}
					@Pc(40) Class31_Sub2_Sub1_Sub2 local40 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local14];
					Static331.anIntArray648[Static5.anInt163++] = local14;
					local40.anInt7302 = Static378.anInt4244;
					if (local40.aClass53_1 != null && local40.aClass53_1.method1505()) {
						Static422.method5611(local40);
					}
					local40.method5997(Static238.aClass116_2.method2822(Static206.aClass1_Sub5_Sub1_2.method316(14)));
					@Pc(85) int local85 = Static206.aClass1_Sub5_Sub1_2.method316(2);
					@Pc(92) int local92;
					if (arg0) {
						local92 = Static206.aClass1_Sub5_Sub1_2.method316(8);
						if (local92 > 127) {
							local92 -= 256;
						}
					} else {
						local92 = Static206.aClass1_Sub5_Sub1_2.method316(5);
						if (local92 > 15) {
							local92 -= 32;
						}
					}
					@Pc(122) int local122;
					if (arg0) {
						local122 = Static206.aClass1_Sub5_Sub1_2.method316(8);
						if (local122 > 127) {
							local122 -= 256;
						}
					} else {
						local122 = Static206.aClass1_Sub5_Sub1_2.method316(5);
						if (local122 > 15) {
							local122 -= 32;
						}
					}
					@Pc(142) int local142 = Static206.aClass1_Sub5_Sub1_2.method316(1);
					@Pc(153) int local153 = Static206.aClass1_Sub5_Sub1_2.method316(3) + 4 << 11 & 0x3BE6;
					@Pc(158) int local158 = Static206.aClass1_Sub5_Sub1_2.method316(1);
					if (local158 == 1) {
						Static237.anIntArray546[Static372.anInt6091++] = local14;
					}
					local40.method5979(local40.aClass53_1.anInt1728);
					local40.anInt7345 = local40.aClass53_1.anInt1726 << 3;
					if (local40.anInt7345 == 0) {
						local40.method5988(0);
					} else if (local19) {
						local40.method5988(local153);
					}
					local40.method5996(local142 == 1, local40.method5989(), local85, local122 + Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0], local92 + Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0]);
					if (local40.aClass53_1.method1505()) {
						Static84.method1594(local40.anIntArray657[0], null, local40.aByte100, local40, 0, local40.anIntArray658[0], null);
					}
					continue;
				}
			}
			Static206.aClass1_Sub5_Sub1_2.method313();
			return;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ya;ZLclient!ul;Lclient!ul;)V")
	public static void method4278(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class246 arg1, @OriginalArg(3) Class246 arg2) {
		Static51.aClass151_137 = Static41.method755(Static374.anInt6118, arg1);
		Static26.aClass71_1 = arg0.method4564(Static51.aClass151_137, Static461.method1446(arg2, Static374.anInt6118));
		Static325.aClass151_103 = Static41.method755(Static295.anInt5134, arg1);
		Static312.aClass71_7 = arg0.method4564(Static325.aClass151_103, Static461.method1446(arg2, Static295.anInt5134));
		Static3.aClass151_6 = Static41.method755(Static218.anInt4007, arg1);
		Static178.aClass71_5 = arg0.method4564(Static3.aClass151_6, Static461.method1446(arg2, Static218.anInt4007));
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V")
	public static void method4279() {
		@Pc(9) int local9 = Static258.anInt3113 * 128 + 64;
		@Pc(15) int local15 = Static145.anInt2798 * 128 + 64;
		@Pc(23) int local23 = Static301.method4312(Static357.anInt5881, local9, local15) - Static305.anInt5270;
		if (Static91.anInt1908 < 100) {
			if (local9 > Static139.anInt2727) {
				Static139.anInt2727 += Static91.anInt1908 * (local9 - Static139.anInt2727) / 1000 + Static21.anInt527;
				if (Static139.anInt2727 > local9) {
					Static139.anInt2727 = local9;
				}
			}
			if (Static142.anInt5535 < local23) {
				Static142.anInt5535 += Static91.anInt1908 * (local23 - Static142.anInt5535) / 1000 + Static21.anInt527;
				if (Static142.anInt5535 > local23) {
					Static142.anInt5535 = local23;
				}
			}
			if (local9 < Static139.anInt2727) {
				Static139.anInt2727 -= Static91.anInt1908 * (Static139.anInt2727 - local9) / 1000 + Static21.anInt527;
				if (local9 > Static139.anInt2727) {
					Static139.anInt2727 = local9;
				}
			}
			if (Static142.anInt5535 > local23) {
				Static142.anInt5535 -= (Static142.anInt5535 - local23) * Static91.anInt1908 / 1000 + Static21.anInt527;
				if (Static142.anInt5535 < local23) {
					Static142.anInt5535 = local23;
				}
			}
			if (local15 > Static92.anInt1946) {
				Static92.anInt1946 += Static91.anInt1908 * (local15 - Static92.anInt1946) / 1000 + Static21.anInt527;
				if (local15 < Static92.anInt1946) {
					Static92.anInt1946 = local15;
				}
			}
			if (local15 < Static92.anInt1946) {
				Static92.anInt1946 -= Static21.anInt527 + (Static92.anInt1946 - local15) * Static91.anInt1908 / 1000;
				if (Static92.anInt1946 < local15) {
					Static92.anInt1946 = local15;
				}
			}
		} else {
			Static92.anInt1946 = Static145.anInt2798 * 128 + 64;
			Static139.anInt2727 = Static258.anInt3113 * 128 + 64;
			Static142.anInt5535 = Static301.method4312(Static357.anInt5881, Static139.anInt2727, Static92.anInt1946) - Static305.anInt5270;
		}
		local15 = Static374.anInt6117 * 128 + 64;
		local9 = Static372.anInt6092 * 128 + 64;
		local23 = Static301.method4312(Static357.anInt5881, local9, local15) - Static452.anInt7261;
		@Pc(225) int local225 = local9 - Static139.anInt2727;
		@Pc(230) int local230 = local23 - Static142.anInt5535;
		@Pc(234) int local234 = local15 - Static92.anInt1946;
		@Pc(245) int local245 = (int) Math.sqrt((double) (local234 * local234 + local225 * local225));
		@Pc(256) int local256 = (int) (Math.atan2((double) local230, (double) local245) * 2607.5945876176133D) & 0x3FFF;
		if (local256 < 1024) {
			local256 = 1024;
		}
		@Pc(272) int local272 = (int) (Math.atan2((double) local225, (double) local234) * -2607.5945876176133D) & 0x3FFF;
		if (local256 > 3072) {
			local256 = 3072;
		}
		if (Static296.anInt5167 < local256) {
			Static296.anInt5167 += Static139.anInt2726 * (local256 - Static296.anInt5167 >> 3) / 1000 + Static440.anInt7082 << 3;
			if (local256 < Static296.anInt5167) {
				Static296.anInt5167 = local256;
			}
		}
		if (local256 < Static296.anInt5167) {
			Static296.anInt5167 -= Static139.anInt2726 * (Static296.anInt5167 - local256 >> 3) / 1000 + Static440.anInt7082 << 3;
			if (local256 > Static296.anInt5167) {
				Static296.anInt5167 = local256;
			}
		}
		@Pc(339) int local339 = local272 - Static406.anInt6527;
		if (local339 > 8192) {
			local339 -= 16384;
		}
		if (local339 < -8192) {
			local339 += 16384;
		}
		local339 >>= 0x3;
		if (local339 > 0) {
			Static406.anInt6527 += Static440.anInt7082 + local339 * Static139.anInt2726 / 1000 << 3;
			Static406.anInt6527 &= 0x3FFF;
		}
		if (local339 < 0) {
			Static406.anInt6527 -= Static440.anInt7082 + Static139.anInt2726 * -local339 / 1000 << 3;
			Static406.anInt6527 &= 0x3FFF;
		}
		@Pc(400) int local400 = local272 - Static406.anInt6527;
		if (local400 > 8192) {
			local400 -= 16384;
		}
		if (local400 < -8192) {
			local400 += 16384;
		}
		if (local400 < 0 && local339 > 0 || local400 > 0 && local339 < 0) {
			Static406.anInt6527 = local272;
		}
		Static264.anInt4689 = 0;
	}
}
