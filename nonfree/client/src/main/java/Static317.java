import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "Lclient!pc;")
	public static Class188 aClass188_86;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "Lclient!pc;")
	public static Class188 aClass188_87;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_74 = new Class44(32, -1);

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
	public static int anInt5608 = 0;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_114 = new Class256("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_140 = new Class81(97, 6);

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "F")
	public static float aFloat171 = 0.0F;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!mk;I)I")
	public static int method4542(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(7) String local7 = Static136.method1990(arg0);
		@Pc(9) int[] local9 = null;
		if (Static210.method3247(arg0.anInt4529)) {
			local9 = Static350.aClass149_2.method3483((int) arg0.aLong137).anIntArray47;
		} else if (arg0.anInt4530 != -1) {
			local9 = Static350.aClass149_2.method3483(arg0.anInt4530).anIntArray47;
		} else if (Static252.method3870(arg0.anInt4529)) {
			@Pc(47) Class4_Sub2_Sub2_Sub2 local47 = Static4.aClass4_Sub2_Sub2_Sub2Array1[(int) arg0.aLong137];
			if (local47 != null) {
				@Pc(52) Class215 local52 = local47.aClass215_1;
				if (local52.anIntArray400 != null) {
					local52 = local52.method4795(Static215.aClass225_1);
				}
				if (local52 != null) {
					local9 = local52.anIntArray401;
				}
			}
		} else if (Static6.method151(arg0.anInt4529)) {
			@Pc(90) Class250 local90;
			if (arg0.anInt4529 == 1012) {
				local90 = Static406.aClass150_3.method3508((int) arg0.aLong137);
			} else {
				local90 = Static406.aClass150_3.method3508((int) (arg0.aLong137 >>> 32 & 0x7FFFFFFFL));
			}
			if (local90.anIntArray479 != null) {
				local90 = local90.method5591(Static215.aClass225_1);
			}
			if (local90 != null) {
				local9 = local90.anIntArray480;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static237.method3704(local9);
		}
		@Pc(137) int local137 = Static55.aClass210_1.method4759(local7, Static112.aClass76Array10);
		if (arg0.aBoolean381) {
			local137 += Static226.aClass76_11.UA() + 4;
		}
		return local137;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
	public static void method4543() {
		@Pc(9) int local9 = Static451.anInt1568 * 128 + 64;
		@Pc(15) int local15 = Static361.anInt6359 * 128 + 64;
		@Pc(23) int local23 = Static66.method1200(Static301.anInt5383, local9, local15) - Static135.anInt2653;
		if (Static117.anInt2350 < 100) {
			if (Static225.anInt4310 < local9) {
				Static225.anInt4310 += (local9 - Static225.anInt4310) * Static117.anInt2350 / 1000 + Static292.anInt5317;
				if (Static225.anInt4310 > local9) {
					Static225.anInt4310 = local9;
				}
			}
			if (local9 < Static225.anInt4310) {
				Static225.anInt4310 -= (Static225.anInt4310 - local9) * Static117.anInt2350 / 1000 + Static292.anInt5317;
				if (local9 > Static225.anInt4310) {
					Static225.anInt4310 = local9;
				}
			}
			if (local23 > Static110.anInt2281) {
				Static110.anInt2281 += Static292.anInt5317 + (local23 - Static110.anInt2281) * Static117.anInt2350 / 1000;
				if (local23 < Static110.anInt2281) {
					Static110.anInt2281 = local23;
				}
			}
			if (Static110.anInt2281 > local23) {
				Static110.anInt2281 -= (Static110.anInt2281 - local23) * Static117.anInt2350 / 1000 + Static292.anInt5317;
				if (local23 > Static110.anInt2281) {
					Static110.anInt2281 = local23;
				}
			}
			if (Static293.anInt5621 < local15) {
				Static293.anInt5621 += Static292.anInt5317 + Static117.anInt2350 * (local15 - Static293.anInt5621) / 1000;
				if (local15 < Static293.anInt5621) {
					Static293.anInt5621 = local15;
				}
			}
			if (local15 < Static293.anInt5621) {
				Static293.anInt5621 -= Static292.anInt5317 + Static117.anInt2350 * (Static293.anInt5621 - local15) / 1000;
				if (Static293.anInt5621 < local15) {
					Static293.anInt5621 = local15;
				}
			}
		} else {
			Static225.anInt4310 = Static451.anInt1568 * 128 + 64;
			Static293.anInt5621 = Static361.anInt6359 * 128 + 64;
			Static110.anInt2281 = Static66.method1200(Static301.anInt5383, Static225.anInt4310, Static293.anInt5621) - Static135.anInt2653;
		}
		local9 = Static164.anInt3205 * 128 + 64;
		local15 = Static142.anInt2719 * 128 + 64;
		local23 = Static66.method1200(Static301.anInt5383, local9, local15) - Static268.anInt4956;
		@Pc(223) int local223 = local9 - Static225.anInt4310;
		@Pc(228) int local228 = local23 - Static110.anInt2281;
		@Pc(232) int local232 = local15 - Static293.anInt5621;
		@Pc(244) int local244 = (int) Math.sqrt((double) (local223 * local223 + local232 * local232));
		@Pc(255) int local255 = (int) (Math.atan2((double) local228, (double) local244) * 2607.5945876176133D) & 0x3FFF;
		@Pc(266) int local266 = (int) (-2607.5945876176133D * Math.atan2((double) local223, (double) local232)) & 0x3FFF;
		if (local255 < 1024) {
			local255 = 1024;
		}
		if (local255 > 3072) {
			local255 = 3072;
		}
		if (local255 > Static293.anInt5622) {
			Static293.anInt5622 += Static391.anInt6869 * (local255 - Static293.anInt5622 >> 3) / 1000 + Static399.anInt6965 << 3;
			if (Static293.anInt5622 > local255) {
				Static293.anInt5622 = local255;
			}
		}
		if (local255 < Static293.anInt5622) {
			Static293.anInt5622 -= (Static293.anInt5622 - local255 >> 3) * Static391.anInt6869 / 1000 + Static399.anInt6965 << 3;
			if (local255 > Static293.anInt5622) {
				Static293.anInt5622 = local255;
			}
		}
		@Pc(342) int local342 = local266 - Static258.anInt4308;
		if (local342 > 8192) {
			local342 -= 16384;
		}
		if (local342 < -8192) {
			local342 += 16384;
		}
		local342 >>= 0x3;
		if (local342 > 0) {
			Static258.anInt4308 += Static399.anInt6965 + Static391.anInt6869 * local342 / 1000 << 3;
			Static258.anInt4308 &= 0x3FFF;
		}
		if (local342 < 0) {
			Static258.anInt4308 -= -local342 * Static391.anInt6869 / 1000 + Static399.anInt6965 << 3;
			Static258.anInt4308 &= 0x3FFF;
		}
		@Pc(406) int local406 = local266 - Static258.anInt4308;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		if (local406 < 0 && local342 > 0 || local406 > 0 && local342 < 0) {
			Static258.anInt4308 = local266;
		}
		Static436.anInt7610 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!dm;Z)Z")
	public static boolean method4544(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static372.aClass106Array11 == Static77.aClass106Array12;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5564();
		if (arg0.aShort88 < 0 || arg0.aShort89 < 0 || arg0.aShort87 >= Static86.anInt2009 || arg0.aShort86 >= Static360.anInt6340) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort88; local34 <= arg0.aShort87; local34++) {
			for (local38 = arg0.aShort89; local38 <= arg0.aShort86; local38++) {
				@Pc(45) Class113 local45 = Static363.method5062(arg0.aByte92, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort88) {
						local49++;
					}
					if (local34 < arg0.aShort87) {
						local49 += 4;
					}
					if (local38 > arg0.aShort89) {
						local49 += 8;
					}
					if (local38 < arg0.aShort86) {
						local49 += 2;
					}
					@Pc(74) Class134 local74 = Static326.method4678(local49, arg0);
					@Pc(77) Class134 local77 = local45.aClass134_1;
					if (local77 == null) {
						local45.aClass134_1 = local74;
					} else {
						while (local77.aClass134_2 != null) {
							local77 = local77.aClass134_2;
						}
						local77.aClass134_2 = local74;
					}
					local45.aByte34 = (byte) (local45.aByte34 | local49);
					if (local6 && (Static72.anIntArrayArray29[local34][local38] & 0xFF000000) != 0) {
						local8 = Static72.anIntArrayArray29[local34][local38];
						local10 = Static280.aByteArrayArray15[local34][local38];
						local12 = Static87.aByteArrayArray6[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort88; local38 <= arg0.aShort87; local38++) {
				for (@Pc(150) int local150 = arg0.aShort89; local150 <= arg0.aShort86; local150++) {
					if ((Static72.anIntArrayArray29[local38][local150] & 0xFF000000) == 0) {
						Static72.anIntArrayArray29[local38][local150] = local8;
						Static280.aByteArrayArray15[local38][local150] = local10;
						Static87.aByteArrayArray6[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static428.aClass4_Sub2Array3[Static450.anInt7838++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)Z")
	public static boolean method4550(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static351.anInt6183; local1 < Static58.anInt1578; local1++) {
			@Pc(6) Class113[][] local6 = Static176.aClass113ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static178.anInt3432; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static249.anInt4746 + local9;
				@Pc(18) int local18 = Static249.anInt4746 - local9;
				if (local14 >= Static165.anInt6202 || local18 < Static8.anInt266) {
					for (@Pc(27) int local27 = -Static178.anInt3432; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static404.anInt7034 + local27;
						@Pc(36) int local36 = Static404.anInt7034 - local27;
						@Pc(48) Class113 local48;
						if (local14 >= Static165.anInt6202) {
							if (local32 >= Static12.anInt315) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean270) {
									Static397.aBoolean589 = arg0;
									Static151.aClass125_1.method2952(local48);
									Static151.aClass125_1.method2955();
								}
							}
							if (local36 < Static257.anInt4830) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean270) {
									Static397.aBoolean589 = arg0;
									Static151.aClass125_1.method2952(local48);
									Static151.aClass125_1.method2955();
								}
							}
						}
						if (local18 < Static8.anInt266) {
							if (local32 >= Static12.anInt315) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean270) {
									Static397.aBoolean589 = arg0;
									Static151.aClass125_1.method2952(local48);
									Static151.aClass125_1.method2955();
								}
							}
							if (local36 < Static257.anInt4830) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean270) {
									Static397.aBoolean589 = arg0;
									Static151.aClass125_1.method2952(local48);
									Static151.aClass125_1.method2955();
								}
							}
						}
						if (Static159.anInt3140 == 0) {
							if (Static193.aBoolean313) {
								Static151.aClass125_1.method2948(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
