import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	public static int anInt4270;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	public static final int[] anIntArray320 = new int[250];

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("8b078a3163d7f83bb59e66cbd09dcbfeb59b643e9846da6955143b46217e16b2f3c98a697fd6885353831abe858d9f007486e4f8f8683d4c8395519bb4033ea9", 16);

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Lclient!mc;")
	public static Class198 aClass198_5 = null;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_112 = new Class88("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	public static void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class12_Sub22 local14 = (Class12_Sub22) Static316.aClass73_49.method2005(); local14 != null; local14 = (Class12_Sub22) Static316.aClass73_49.method2009()) {
			Static143.method2854(arg2, local14, arg3, arg1, arg0);
		}
		for (@Pc(35) Class12_Sub22 local35 = (Class12_Sub22) Static325.aClass73_50.method2005(); local35 != null; local35 = (Class12_Sub22) Static325.aClass73_50.method2009()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class166 local44 = local35.aClass30_Sub1_Sub1_Sub2_1.method3602();
			if (local35.aClass30_Sub1_Sub1_Sub2_1.aBoolean335) {
				local39 = 0;
			} else if (local44.anInt4962 == local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 || local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4973 || local44.anInt4992 == local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 || local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4982) {
				local39 = 2;
			} else if (local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4987 || local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4971 || local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4983 || local35.aClass30_Sub1_Sub1_Sub2_1.anInt4155 == local44.anInt4978) {
				local39 = 3;
			}
			if (local39 != local35.anInt4483) {
				@Pc(131) int local131 = Static418.method6471(local35.aClass30_Sub1_Sub1_Sub2_1);
				if (local131 != local35.anInt4480) {
					if (local35.aClass12_Sub13_Sub4_3 != null) {
						Static328.aClass12_Sub13_Sub1_1.method2443(local35.aClass12_Sub13_Sub4_3);
						local35.aClass12_Sub13_Sub4_3 = null;
					}
					local35.anInt4480 = local131;
				}
				local35.anInt4483 = local39;
			}
			local35.anInt4479 = local35.aClass30_Sub1_Sub1_Sub2_1.anInt9418;
			local35.anInt4478 = local35.aClass30_Sub1_Sub1_Sub2_1.anInt9418 + (local35.aClass30_Sub1_Sub1_Sub2_1.method3591() << 6);
			local35.anInt4475 = local35.aClass30_Sub1_Sub1_Sub2_1.anInt9416;
			local35.anInt4485 = local35.aClass30_Sub1_Sub1_Sub2_1.anInt9416 + (local35.aClass30_Sub1_Sub1_Sub2_1.method3591() << 6);
			Static143.method2854(arg2, local35, arg3, arg1, arg0);
		}
		for (@Pc(204) Class12_Sub22 local204 = (Class12_Sub22) Static451.aClass68_35.method1923(); local204 != null; local204 = (Class12_Sub22) Static451.aClass68_35.method1920()) {
			@Pc(208) byte local208 = 1;
			@Pc(213) Class166 local213 = local204.aClass30_Sub1_Sub1_Sub1_1.method3602();
			if (local204.aClass30_Sub1_Sub1_Sub1_1.aBoolean335) {
				local208 = 0;
			} else if (local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 == local213.anInt4962 || local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 == local213.anInt4973 || local213.anInt4992 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 || local213.anInt4982 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155) {
				local208 = 2;
			} else if (local213.anInt4987 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 || local213.anInt4971 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 || local213.anInt4983 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155 || local213.anInt4978 == local204.aClass30_Sub1_Sub1_Sub1_1.anInt4155) {
				local208 = 3;
			}
			if (local204.anInt4483 != local208) {
				@Pc(304) int local304 = Static53.method1408(local204.aClass30_Sub1_Sub1_Sub1_1);
				if (local304 != local204.anInt4480) {
					if (local204.aClass12_Sub13_Sub4_3 != null) {
						Static328.aClass12_Sub13_Sub1_1.method2443(local204.aClass12_Sub13_Sub4_3);
						local204.aClass12_Sub13_Sub4_3 = null;
					}
					local204.anInt4480 = local304;
				}
				local204.anInt4483 = local208;
			}
			local204.anInt4479 = local204.aClass30_Sub1_Sub1_Sub1_1.anInt9418;
			local204.anInt4478 = local204.aClass30_Sub1_Sub1_Sub1_1.anInt9418 + (local204.aClass30_Sub1_Sub1_Sub1_1.method3591() << 6);
			local204.anInt4475 = local204.aClass30_Sub1_Sub1_Sub1_1.anInt9416;
			local204.anInt4485 = local204.aClass30_Sub1_Sub1_Sub1_1.anInt9416 + (local204.aClass30_Sub1_Sub1_Sub1_1.method3591() << 6);
			Static143.method2854(arg2, local204, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!mc;Lclient!qa;ZII)V")
	public static void method3652(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class145 local10 = arg0.method4813(arg1);
		if (local10 == null) {
			return;
		}
		arg1.N(arg3, arg2, arg0.anInt5762 + arg3, arg0.anInt5715 + arg2);
		if (Static540.anInt9595 == 2 || Static540.anInt9595 == 5 || Static491.aClass84_24 == null) {
			arg1.G(-16777216, local10, arg3, arg2);
			return;
		}
		@Pc(45) int local45;
		@Pc(56) int local56;
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (Static242.anInt4993 == 4) {
			local45 = Static247.anInt5092;
			local53 = (int) -Static500.aFloat186 & 0x3FFF;
			local63 = 4096;
			local56 = Static357.anInt6674;
		} else {
			local45 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
			local53 = Static432.anInt7990 + (int) -Static500.aFloat186 & 0x3FFF;
			local56 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416;
			local63 = 4096 - Static339.anInt6470 * 16;
		}
		@Pc(90) int local90 = local45 / 32 + 48 + 208 - Static37.anInt7512 * 2;
		@Pc(108) int local108 = Static329.anInt6247 * 4 + 48 - (Static329.anInt6247 - 104) * 2 - local56 / 32;
		Static491.aClass84_24.method7486((float) arg3 + (float) arg0.anInt5762 / 2.0F, (float) arg2 + (float) arg0.anInt5715 / 2.0F, (float) local90, (float) local108, local63, local53 << 2, local10, arg3, arg2);
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(190) int local190;
		for (@Pc(142) Class12_Sub18 local142 = (Class12_Sub18) Static275.aClass73_45.method2005(); local142 != null; local142 = (Class12_Sub18) Static275.aClass73_45.method2009()) {
			@Pc(147) int local147 = local142.anInt3978;
			local159 = (Static119.aClass159_2.anIntArray346[local147] >> 14 & 0x3FFF) - Static61.anInt1459;
			local169 = (Static119.aClass159_2.anIntArray346[local147] & 0x3FFF) - Static203.anInt4534;
			local179 = local159 * 4 + 2 - local45 / 32;
			local190 = local169 * 4 + 2 - local56 / 32;
			Static109.method2273(local179, local10, arg1, arg2, local190, arg0, arg3, Static119.aClass159_2.anIntArray347[local147]);
		}
		for (local159 = 0; local159 < Static210.anInt4598; local159++) {
			local169 = Static480.anIntArray649[local159] * 4 + 2 - local45 / 32;
			local179 = Static400.anIntArray501[local159] * 4 + 2 - local56 / 32;
			@Pc(247) Class279 local247 = Static49.aClass155_2.method4063(Static367.anIntArray470[local159]);
			if (local247.anIntArray620 != null) {
				local247 = local247.method6881(Static393.aClass31_1);
				if (local247 == null || local247.anInt8292 == -1) {
					continue;
				}
			}
			Static109.method2273(local169, local10, arg1, arg2, local179, arg0, arg3, local247.anInt8292);
		}
		@Pc(334) int local334;
		@Pc(345) int local345;
		for (@Pc(287) Class12_Sub28 local287 = (Class12_Sub28) Static295.aClass68_45.method1923(); local287 != null; local287 = (Class12_Sub28) Static295.aClass68_45.method1920()) {
			local179 = (int) (local287.aLong248 >> 28 & 0x3L);
			if (local179 == Static8.anInt119) {
				local190 = (int) (local287.aLong248 & 0x3FFFL) - Static61.anInt1459;
				@Pc(324) int local324 = (int) (local287.aLong248 >> 14 & 0x3FFFL) - Static203.anInt4534;
				local334 = local190 * 4 + 2 - local45 / 32;
				local345 = local324 * 4 + 2 - local56 / 32;
				Static294.method4768(arg3, local334, local10, local345, Static478.aClass84Array14[0], arg0, arg2);
			}
		}
		@Pc(431) int local431;
		for (local179 = 0; local179 < Static451.anInt4553; local179++) {
			@Pc(376) Class12_Sub41 local376 = (Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local179]);
			if (local376 != null) {
				@Pc(381) Class30_Sub1_Sub1_Sub2 local381 = local376.aClass30_Sub1_Sub1_Sub2_2;
				if (local381.method3606() && Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 == local381.aByte99) {
					@Pc(393) Class130 local393 = local381.aClass130_1;
					if (local393 != null && local393.anIntArray308 != null) {
						local393 = local393.method3570(Static393.aClass31_1);
					}
					if (local393 != null && local393.aBoolean331 && local393.aBoolean327) {
						local345 = local381.anInt9418 / 32 - local45 / 32;
						local431 = local381.anInt9416 / 32 - local56 / 32;
						if (local393.anInt4084 == -1) {
							Static294.method4768(arg3, local345, local10, local431, Static478.aClass84Array14[1], arg0, arg2);
						} else {
							Static109.method2273(local345, local10, arg1, arg2, local431, arg0, arg3, local393.anInt4084);
						}
					}
				}
			}
		}
		local190 = Static381.anInt7254;
		@Pc(472) int[] local472 = Static496.anIntArray465;
		@Pc(515) int local515;
		@Pc(519) int local519;
		@Pc(544) int local544;
		for (local334 = 0; local334 < local190; local334++) {
			@Pc(482) Class30_Sub1_Sub1_Sub1 local482 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local472[local334]];
			if (local482 != null && local482.method781() && local482 != Static440.aClass30_Sub1_Sub1_Sub1_2 && local482.aByte99 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) {
				local431 = local482.anInt9418 / 32 - local45 / 32;
				local515 = local482.anInt9416 / 32 - local56 / 32;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static167.anInt3850; local519++) {
					if (local482.aString6.equals(Static205.aStringArray24[local519]) && Static462.anIntArray626[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(542) boolean local542 = false;
				for (local544 = 0; local544 < Static124.anInt2889; local544++) {
					if (local482.aString6.equals(Static224.aClass169Array5[local544].aString47)) {
						local542 = true;
						break;
					}
				}
				@Pc(568) boolean local568 = false;
				if (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt737 != 0 && local482.anInt737 != 0 && Static440.aClass30_Sub1_Sub1_Sub1_2.anInt737 == local482.anInt737) {
					local568 = true;
				}
				if (local482.aBoolean43) {
					Static294.method4768(arg3, local431, local10, local515, Static478.aClass84Array14[6], arg0, arg2);
				} else if (local517) {
					Static294.method4768(arg3, local431, local10, local515, Static478.aClass84Array14[3], arg0, arg2);
				} else if (local542) {
					Static294.method4768(arg3, local431, local10, local515, Static478.aClass84Array14[5], arg0, arg2);
				} else if (local568) {
					Static294.method4768(arg3, local431, local10, local515, Static478.aClass84Array14[4], arg0, arg2);
				} else {
					Static294.method4768(arg3, local431, local10, local515, Static478.aClass84Array14[2], arg0, arg2);
				}
			}
		}
		@Pc(669) Class76[] local669 = Static22.aClass76Array28;
		@Pc(750) int local750;
		for (local431 = 0; local431 < local669.length; local431++) {
			@Pc(677) Class76 local677 = local669[local431];
			if (local677 != null && local677.anInt2310 != 0 && Static409.anInt7683 % 20 < 10) {
				@Pc(714) int local714;
				if (local677.anInt2310 == 1) {
					@Pc(699) Class12_Sub41 local699 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local677.anInt2309);
					if (local699 != null) {
						@Pc(704) Class30_Sub1_Sub1_Sub2 local704 = local699.aClass30_Sub1_Sub1_Sub2_2;
						local714 = local704.anInt9418 / 32 - local45 / 32;
						local544 = local704.anInt9416 / 32 - local56 / 32;
						Static490.method7297(local714, local544, arg2, local677.anInt2315, arg3, arg0, 360000L, local10);
					}
				}
				if (local677.anInt2310 == 2) {
					local750 = local677.anInt2313 / 32 - local45 / 32;
					local519 = local677.anInt2317 / 32 - local56 / 32;
					@Pc(765) long local765 = (long) (local677.anInt2311 << 5);
					@Pc(769) long local769 = local765 * local765;
					Static490.method7297(local750, local519, arg2, local677.anInt2315, arg3, arg0, local769, local10);
				}
				if (local677.anInt2310 == 10 && local677.anInt2309 >= 0 && Static90.aClass30_Sub1_Sub1_Sub1Array1.length > local677.anInt2309) {
					@Pc(799) Class30_Sub1_Sub1_Sub1 local799 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local677.anInt2309];
					if (local799 != null) {
						local519 = local799.anInt9418 / 32 - local45 / 32;
						local714 = local799.anInt9416 / 32 - local56 / 32;
						Static490.method7297(local519, local714, arg2, local677.anInt2315, arg3, arg0, 360000L, local10);
					}
				}
			}
		}
		if (Static242.anInt4993 == 4) {
			return;
		}
		if (Static273.anInt5444 != 0) {
			local515 = Static273.anInt5444 * 4 + Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() * 2 + 2 - local45 / 32 - 2;
			local750 = Static141.anInt3151 * 4 + (Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() - 1) * 2 + 2 - local56 / 32;
			Static294.method4768(arg3, local515, local10, local750, Static222.aClass84Array5[Static209.aBoolean364 ? 1 : 0], arg0, arg2);
		}
		arg1.method5866(arg0.anInt5715 / 2 + arg2 - 1, 3, 3, -1, arg3 + arg0.anInt5762 / 2 - 1);
		return;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZILclient!mc;)V")
	public static void method3653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class198 arg2) {
		if (arg2.aByte72 == 0) {
			arg2.anInt5741 = arg2.anInt5757;
		} else if (arg2.aByte72 == 1) {
			arg2.anInt5741 = arg2.anInt5757 + (arg0 - arg2.anInt5715) / 2;
		} else if (arg2.aByte72 == 2) {
			arg2.anInt5741 = arg0 - arg2.anInt5757 - arg2.anInt5715;
		} else if (arg2.aByte72 == 3) {
			arg2.anInt5741 = arg2.anInt5757 * arg0 >> 14;
		} else if (arg2.aByte72 == 4) {
			arg2.anInt5741 = (arg2.anInt5757 * arg0 >> 14) + (arg0 - arg2.anInt5715) / 2;
		} else {
			arg2.anInt5741 = arg0 - arg2.anInt5715 - (arg2.anInt5757 * arg0 >> 14);
		}
		if (arg2.aByte70 == 0) {
			arg2.anInt5713 = arg2.anInt5731;
		} else if (arg2.aByte70 == 1) {
			arg2.anInt5713 = arg2.anInt5731 + (arg1 - arg2.anInt5762) / 2;
		} else if (arg2.aByte70 == 2) {
			arg2.anInt5713 = arg1 - arg2.anInt5762 - arg2.anInt5731;
		} else if (arg2.aByte70 == 3) {
			arg2.anInt5713 = arg1 * arg2.anInt5731 >> 14;
		} else if (arg2.aByte70 == 4) {
			arg2.anInt5713 = (arg2.anInt5731 * arg1 >> 14) + (arg1 - arg2.anInt5762) / 2;
		} else {
			arg2.anInt5713 = arg1 - (arg2.anInt5731 * arg1 >> 14) - arg2.anInt5762;
		}
		if (!Static470.aBoolean610) {
			return;
		}
		if (Static67.method1529(arg2).anInt6901 == 0 && arg2.anInt5776 != 0) {
			return;
		}
		if (arg2.anInt5713 < 0) {
			arg2.anInt5713 = 0;
		} else if (arg1 < arg2.anInt5713 + arg2.anInt5762) {
			arg2.anInt5713 = arg1 - arg2.anInt5762;
		}
		if (arg2.anInt5741 < 0) {
			arg2.anInt5741 = 0;
			return;
		}
		if (arg0 < arg2.anInt5715 + arg2.anInt5741) {
			arg2.anInt5741 = arg0 - arg2.anInt5715;
			return;
		}
	}
}
