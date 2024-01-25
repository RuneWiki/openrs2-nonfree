import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!tla", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_186 = new Class225(99, 4);

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "Lclient!mfa;")
	public static final Class239 aClass239_20 = new Class239();

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(III)V")
	public static void method8392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static90.aFloat42 > Static90.aFloat43) {
			Static90.aFloat43 = (float) ((double) Static90.aFloat43 + (double) Static90.aFloat43 / 30.0D);
			if (Static90.aFloat43 > Static90.aFloat42) {
				Static90.aFloat43 = Static90.aFloat42;
			}
			Static360.method5164();
			Static90.anInt3344 = (int) Static90.aFloat43 >> 1;
			Static90.aByteArrayArrayArray3 = Static496.method7087(Static90.anInt3344);
		} else if (Static90.aFloat42 < Static90.aFloat43) {
			Static90.aFloat43 = (float) ((double) Static90.aFloat43 - (double) Static90.aFloat43 / 30.0D);
			if (Static90.aFloat42 > Static90.aFloat43) {
				Static90.aFloat43 = Static90.aFloat42;
			}
			Static360.method5164();
			Static90.anInt3344 = (int) Static90.aFloat43 >> 1;
			Static90.aByteArrayArrayArray3 = Static496.method7087(Static90.anInt3344);
		}
		if (Static657.anInt10294 != -1 && Static537.anInt5296 != -1) {
			@Pc(93) int local93 = Static657.anInt10294 - Static681.anInt10509;
			if (local93 < 2 || local93 > 2) {
				local93 /= 8;
			}
			@Pc(110) int local110 = Static537.anInt5296 - Static704.anInt10775;
			if (local110 < 2 || local110 > 2) {
				local110 /= 8;
			}
			Static681.anInt10509 += local93;
			if (local93 == 0 && local110 == 0) {
				Static537.anInt5296 = -1;
				Static657.anInt10294 = -1;
			}
			Static704.anInt10775 += local110;
			Static360.method5164();
		}
		if (Static181.anInt3030 > 0) {
			Static482.anInt7725--;
			if (Static482.anInt7725 == 0) {
				Static181.anInt3030--;
				Static482.anInt7725 = 100;
			}
		} else {
			Static368.anInt5903 = -1;
			Static444.anInt7209 = -1;
		}
		if (!Static517.aBoolean713 || Static127.aClass60_40 == null) {
			return;
		}
		for (@Pc(193) Class2_Sub41 local193 = (Class2_Sub41) Static127.aClass60_40.method1226(7); local193 != null; local193 = (Class2_Sub41) Static127.aClass60_40.method1228()) {
			@Pc(202) Class259 local202 = Static90.aClass196_3.method4194(local193.aClass2_Sub51_1.anInt9158);
			if (local193.method5913(arg1, arg0)) {
				if (local202.aStringArray29 != null) {
					if (local202.aStringArray29[4] != null) {
						Static27.method371(-1, (long) local193.aClass2_Sub51_1.anInt9158, true, -1, local202.aStringArray29[4], false, 1006, false, local202.aString74, (long) local193.aClass2_Sub51_1.anInt9158, 0, local202.anInt6981);
					}
					if (local202.aStringArray29[3] != null) {
						Static27.method371(-1, (long) local193.aClass2_Sub51_1.anInt9158, true, -1, local202.aStringArray29[3], false, 1008, false, local202.aString74, (long) local193.aClass2_Sub51_1.anInt9158, 0, local202.anInt6981);
					}
					if (local202.aStringArray29[2] != null) {
						Static27.method371(-1, (long) local193.aClass2_Sub51_1.anInt9158, true, -1, local202.aStringArray29[2], false, 1004, false, local202.aString74, (long) local193.aClass2_Sub51_1.anInt9158, 0, local202.anInt6981);
					}
					if (local202.aStringArray29[1] != null) {
						Static27.method371(-1, (long) local193.aClass2_Sub51_1.anInt9158, true, -1, local202.aStringArray29[1], false, 1011, false, local202.aString74, (long) local193.aClass2_Sub51_1.anInt9158, 0, local202.anInt6981);
					}
					if (local202.aStringArray29[0] != null) {
						Static27.method371(-1, (long) local193.aClass2_Sub51_1.anInt9158, true, -1, local202.aStringArray29[0], false, 1003, false, local202.aString74, (long) local193.aClass2_Sub51_1.anInt9158, 0, local202.anInt6981);
					}
				}
				if (!local193.aClass2_Sub51_1.aBoolean786) {
					local193.aClass2_Sub51_1.aBoolean786 = true;
					Static484.method6918(Static30.aClass286_2, local193.aClass2_Sub51_1.anInt9158, local202.anInt6981);
				}
				if (local193.aClass2_Sub51_1.aBoolean786) {
					Static484.method6918(Static21.aClass286_1, local193.aClass2_Sub51_1.anInt9158, local202.anInt6981);
				}
			} else if (local193.aClass2_Sub51_1.aBoolean786) {
				local193.aClass2_Sub51_1.aBoolean786 = false;
				Static484.method6918(Static328.aClass286_7, local193.aClass2_Sub51_1.anInt9158, local202.anInt6981);
			}
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(II)Lclient!dv;")
	public static Class88_Sub1 method8394(@OriginalArg(0) int arg0) {
		return Static23.aBoolean574 && arg0 >= Static532.anInt8451 && Static578.anInt9142 >= arg0 ? Static261.aClass88_Sub1Array3[arg0 - Static532.anInt8451] : null;
	}

	@OriginalMember(owner = "client!tla", name = "b", descriptor = "(I)V")
	public static void method8395() {
		if (Static283.anInt8842 > 1) {
			Static283.anInt8842--;
			Static539.anInt8520 = Static602.anInt10526;
		}
		if (Static487.aClass221_2.aBoolean488) {
			Static487.aClass221_2.aBoolean488 = false;
			Static284.method3979();
			return;
		}
		if (!Static189.aBoolean301) {
			Static8.method114();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static575.method7995(Static487.aClass221_2); local36++) {
		}
		if (Static357.anInt5722 != 11) {
			return;
		}
		@Pc(71) Class2_Sub33 local71;
		@Pc(82) int local82;
		while (Static327.method8982()) {
			local71 = Static592.method8154(Static466.aClass349_109, Static487.aClass221_2.aClass48_1);
			local71.aClass2_Sub20_Sub2_1.method8584(0);
			local82 = local71.aClass2_Sub20_Sub2_1.anInt9723;
			Static721.method9622(local71.aClass2_Sub20_Sub2_1);
			local71.aClass2_Sub20_Sub2_1.method8547(local71.aClass2_Sub20_Sub2_1.anInt9723 - local82);
			Static487.aClass221_2.method5173(local71);
		}
		if (Static33.aClass2_Sub25_1 == null) {
			if (Static567.method7863() >= Static195.aLong110) {
				Static33.aClass2_Sub25_1 = Static435.aClass89_1.method1854(Static548.aClass176_3.aString48);
			}
		} else if (Static33.aClass2_Sub25_1.anInt2903 != -1) {
			local71 = Static592.method8154(Static88.aClass349_104, Static487.aClass221_2.aClass48_1);
			local71.aClass2_Sub20_Sub2_1.method8551(Static33.aClass2_Sub25_1.anInt2903);
			Static487.aClass221_2.method5173(local71);
			Static33.aClass2_Sub25_1 = null;
			Static195.aLong110 = Static567.method7863() + 30000L;
		}
		@Pc(165) Class2_Sub18 local165 = (Class2_Sub18) Static171.aClass60_55.method1226(7);
		@Pc(184) int local184;
		@Pc(209) int local209;
		@Pc(227) int local227;
		@Pc(282) int local282;
		@Pc(289) int local289;
		@Pc(300) int local300;
		@Pc(182) Class2_Sub33 local182;
		if (local165 != null || Static393.aLong185 < Static567.method7863() - 2000L) {
			local182 = null;
			local184 = 0;
			for (@Pc(191) Class2_Sub18 local191 = (Class2_Sub18) Static344.aClass60_108.method1226(7); local191 != null && (local182 == null || local182.aClass2_Sub20_Sub2_1.anInt9723 - local184 < 240); local191 = (Class2_Sub18) Static344.aClass60_108.method1228()) {
				local191.method9872();
				local209 = local191.method7124();
				if (local209 < -1) {
					local209 = -1;
				} else if (local209 > 65534) {
					local209 = 65534;
				}
				local227 = local191.method7122();
				if (local227 < -1) {
					local227 = -1;
				} else if (local227 > 65534) {
					local227 = 65534;
				}
				if (local227 != Static140.anInt2386 || local209 != Static141.anInt8986) {
					if (local182 == null) {
						local182 = Static592.method8154(Static162.aClass349_48, Static487.aClass221_2.aClass48_1);
						local182.aClass2_Sub20_Sub2_1.method8584(0);
						local184 = local182.aClass2_Sub20_Sub2_1.anInt9723;
					}
					local282 = local227 - Static140.anInt2386;
					Static140.anInt2386 = local227;
					local289 = local209 - Static141.anInt8986;
					Static141.anInt8986 = local209;
					local300 = (int) ((local191.method7125() - Static393.aLong185) / 20L);
					if (local300 < 8 && local282 >= -32 && local282 <= 31 && local289 >= -32 && local289 <= 31) {
						local282 += 32;
						local289 += 32;
						local182.aClass2_Sub20_Sub2_1.method8551(local289 + (local282 << 6) + (local300 << 12));
					} else if (local300 < 32 && local282 >= -128 && local282 <= 127 && local289 >= -128 && local289 <= 127) {
						local182.aClass2_Sub20_Sub2_1.method8584(local300 + 128);
						local289 += 128;
						local282 += 128;
						local182.aClass2_Sub20_Sub2_1.method8551((local282 << 8) + local289);
					} else if (local300 < 32) {
						local182.aClass2_Sub20_Sub2_1.method8584(local300 + 192);
						if (local227 == 1 || local209 == -1) {
							local182.aClass2_Sub20_Sub2_1.method8577(Integer.MIN_VALUE);
						} else {
							local182.aClass2_Sub20_Sub2_1.method8577(local227 | local209 << 16);
						}
					} else {
						local182.aClass2_Sub20_Sub2_1.method8551(local300 + 57344);
						if (local227 == 1 || local209 == -1) {
							local182.aClass2_Sub20_Sub2_1.method8577(Integer.MIN_VALUE);
						} else {
							local182.aClass2_Sub20_Sub2_1.method8577(local227 | local209 << 16);
						}
					}
					Static393.aLong185 = local191.method7125();
				}
			}
			if (local182 != null) {
				local182.aClass2_Sub20_Sub2_1.method8547(local182.aClass2_Sub20_Sub2_1.anInt9723 - local184);
				Static487.aClass221_2.method5173(local182);
			}
		}
		@Pc(546) int local546;
		if (local165 != null) {
			@Pc(528) long local528 = (local165.method7125() - Static165.aLong98) / 50L;
			if (local528 > 32767L) {
				local528 = 32767L;
			}
			Static165.aLong98 = local165.method7125();
			local546 = local165.method7124();
			if (local546 < 0) {
				local546 = 0;
			} else if (local546 > 65535) {
				local546 = 65535;
			}
			local209 = local165.method7122();
			if (local209 < 0) {
				local209 = 0;
			} else if (local209 > 65535) {
				local209 = 65535;
			}
			@Pc(582) byte local582 = 0;
			if (local165.method7126() == 2) {
				local582 = 1;
			}
			local282 = (int) local528;
			@Pc(606) Class2_Sub33 local606 = Static592.method8154(Static53.aClass349_18, Static487.aClass221_2.aClass48_1);
			local606.aClass2_Sub20_Sub2_1.method8582(local582 << 15 | local282);
			local606.aClass2_Sub20_Sub2_1.method8567(local546 << 16 | local209);
			Static487.aClass221_2.method5173(local606);
		}
		@Pc(666) long local666;
		if (Static117.anInt1953 > 0) {
			local182 = Static592.method8154(Static570.aClass349_133, Static487.aClass221_2.aClass48_1);
			local182.aClass2_Sub20_Sub2_1.method8584(Static117.anInt1953 * 3);
			for (local184 = 0; local184 < Static117.anInt1953; local184++) {
				@Pc(658) Interface21 local658 = Static103.anInterface21Array7[local184];
				local666 = (local658.method9555() - Static34.aLong271) / 50L;
				Static34.aLong271 = local658.method9555();
				if (local666 > 65535L) {
					local666 = 65535L;
				}
				local182.aClass2_Sub20_Sub2_1.method8584(local658.method9556());
				local182.aClass2_Sub20_Sub2_1.method8551((int) local666);
			}
			Static487.aClass221_2.method5173(local182);
		}
		if (Static594.anInt9286 > 0) {
			Static594.anInt9286--;
		}
		if (Static176.aBoolean298 && Static594.anInt9286 <= 0) {
			Static176.aBoolean298 = false;
			Static594.anInt9286 = 20;
			local182 = Static592.method8154(Static395.aClass349_90, Static487.aClass221_2.aClass48_1);
			local182.aClass2_Sub20_Sub2_1.method8582((int) Static356.aFloat90 >> 3);
			local182.aClass2_Sub20_Sub2_1.method8582((int) Static213.aFloat46 >> 3);
			Static487.aClass221_2.method5173(local182);
		}
		if (Static344.aBoolean451 != Static482.aBoolean673) {
			Static482.aBoolean673 = Static344.aBoolean451;
			local182 = Static592.method8154(Static124.aClass349_36, Static487.aClass221_2.aClass48_1);
			local182.aClass2_Sub20_Sub2_1.method8584(Static344.aBoolean451 ? 1 : 0);
			Static487.aClass221_2.method5173(local182);
		}
		if (!Static492.aBoolean688) {
			local182 = Static592.method8154(Static495.aClass349_114, Static487.aClass221_2.aClass48_1);
			local182.aClass2_Sub20_Sub2_1.method8584(0);
			local184 = local182.aClass2_Sub20_Sub2_1.anInt9723;
			@Pc(825) Class2_Sub20 local825 = Static650.aClass2_Sub30_29.method2989();
			local182.aClass2_Sub20_Sub2_1.method8565(local825.aByteArray111, 0, local825.anInt9723);
			local182.aClass2_Sub20_Sub2_1.method8547(local182.aClass2_Sub20_Sub2_1.anInt9723 - local184);
			Static487.aClass221_2.method5173(local182);
			Static492.aBoolean688 = true;
		}
		if (Static632.aClass311ArrayArrayArray3 != null) {
			if (Static60.anInt1040 == 2) {
				Static39.method552();
			} else if (Static60.anInt1040 == 3) {
				Static578.method8065();
			}
		}
		if (Static157.aBoolean264) {
			Static157.aBoolean264 = false;
		} else {
			Static357.aFloat91 /= 2.0F;
		}
		if (Static530.aBoolean724) {
			Static530.aBoolean724 = false;
		} else {
			Static298.aFloat64 /= 2.0F;
		}
		Static639.method8671();
		if (Static357.anInt5722 != 11) {
			return;
		}
		Static134.method1977();
		Static200.method2823();
		Static445.method6510();
		Static487.aClass221_2.anInt5770++;
		if (Static487.aClass221_2.anInt5770 > 750) {
			Static284.method3979();
			return;
		}
		if (Static166.anInt2884 == 0) {
			Static663.method8151();
			Static59.method921();
		} else {
			if (Static166.anInt2884 == 1 && Static298.method4186(Static640.anInt9835)) {
				Static576.method8014();
				Static166.anInt2884 = 2;
			}
			if (Static166.anInt2884 == 2 && Static357.anInt5722 != 12) {
				Static424.aClass218_28.method5097();
				Static265.anInt4122 = Static528.anInt8386;
				Static166.anInt2884 = 3;
				Static655.anInt10255 = 0;
				Static677.method9186();
			}
			if (Static166.anInt2884 == 3) {
				local82 = Static528.anInt8386 - Static265.anInt4122;
				if (Static655.anInt10255 < Static578.aClass15Array1.length) {
					do {
						@Pc(994) Class15 local994 = Static578.aClass15Array1[Static655.anInt10255];
						if (local82 < local994.anInt10723) {
							break;
						}
						local994.method9378();
					} while (Static166.anInt2884 == 3 && ++Static655.anInt10255 < Static578.aClass15Array1.length);
				}
				if (Static166.anInt2884 == 3) {
					for (local184 = 0; local184 < Static199.aClass61Array1.length; local184++) {
						@Pc(1039) Class61 local1039 = Static199.aClass61Array1[local184];
						if (local1039.aBoolean151) {
							@Pc(1046) Class4_Sub2_Sub1_Sub2 local1046 = local1039.method1238();
							Static435.method6318(local1046, true);
						}
					}
				}
			}
		}
		Static692.method9327();
		if (!Static166.aBoolean283) {
			Static69.method1059();
			Static166.aBoolean283 = true;
		}
		for (local82 = Static396.aClass107_1.method2270(true); local82 != -1; local82 = Static396.aClass107_1.method2270(false)) {
			Static159.method2364(local82);
			Static526.anIntArray596[Static49.anInt646++ & 0x1F] = local82;
		}
		for (@Pc(1114) Class2_Sub6_Sub12 local1114 = Static490.method7037(); local1114 != null; local1114 = Static490.method7037()) {
			local546 = local1114.method6246();
			local666 = local1114.method6241();
			if (local546 == 1) {
				Static41.anIntArray266[(int) local666] = local1114.anInt6936;
				Static330.aBoolean430 |= Static317.aBooleanArray27[(int) local666];
				Static36.anIntArray48[Static13.anInt194++ & 0x1F] = (int) local666;
			} else if (local546 == 2) {
				Static581.aStringArray41[(int) local666] = local1114.aString73;
				Static492.anIntArray560[Static11.anInt180++ & 0x1F] = (int) local666;
			} else {
				@Pc(1185) Class273 local1185;
				if (local546 == 3) {
					local1185 = Static417.method6111((int) local666);
					if (!local1114.aString73.equals(local1185.aString86)) {
						local1185.aString86 = local1114.aString73;
						Static371.method5299(local1185);
					}
				} else {
					@Pc(1194) int local1194;
					if (local546 == 4) {
						local1185 = Static417.method6111((int) local666);
						local289 = local1114.anInt6936;
						local300 = local1114.anInt6938;
						local1194 = local1114.anInt6934;
						if (local289 != local1185.anInt7354 || local1185.anInt7420 != local300 || local1194 != local1185.anInt7391) {
							local1185.anInt7420 = local300;
							local1185.anInt7391 = local1194;
							local1185.anInt7354 = local289;
							Static371.method5299(local1185);
						}
					} else if (local546 == 5) {
						local1185 = Static417.method6111((int) local666);
						if (local1114.anInt6936 != local1185.anInt7337) {
							if (local1114.anInt6936 == -1) {
								local1185.aClass53_8 = null;
							} else {
								if (local1185.aClass53_8 == null) {
									local1185.aClass53_8 = new Class53_Sub2();
								}
								local1185.aClass53_8.method4089(local1114.anInt6936);
							}
							local1185.anInt7337 = local1114.anInt6936;
							Static371.method5299(local1185);
						}
					} else if (local546 == 6) {
						local282 = local1114.anInt6936;
						local289 = local282 >> 10 & 0x1F;
						local300 = local282 >> 5 & 0x1F;
						local1194 = local282 & 0x1F;
						@Pc(1271) int local1271 = (local1194 << 3) + (local300 << 11) + (local289 << 19);
						@Pc(1276) Class273 local1276 = Static417.method6111((int) local666);
						if (local1271 != local1276.anInt7396) {
							local1276.anInt7396 = local1271;
							Static371.method5299(local1276);
						}
					} else if (local546 == 7) {
						local1185 = Static417.method6111((int) local666);
						@Pc(1773) boolean local1773 = local1114.anInt6936 == 1;
						if (local1773 != local1185.aBoolean631) {
							local1185.aBoolean631 = local1773;
							Static371.method5299(local1185);
						}
					} else if (local546 == 8) {
						local1185 = Static417.method6111((int) local666);
						if (local1185.anInt7335 != local1114.anInt6936 || local1185.anInt7390 != local1114.anInt6938 || local1185.anInt7360 != local1114.anInt6934) {
							local1185.anInt7335 = local1114.anInt6936;
							local1185.anInt7390 = local1114.anInt6938;
							local1185.anInt7360 = local1114.anInt6934;
							if (local1185.anInt7415 != -1) {
								if (local1185.anInt7422 > 0) {
									local1185.anInt7360 = local1185.anInt7360 * 32 / local1185.anInt7422;
								} else if (local1185.anInt7404 > 0) {
									local1185.anInt7360 = local1185.anInt7360 * 32 / local1185.anInt7404;
								}
							}
							Static371.method5299(local1185);
						}
					} else if (local546 == 9) {
						local1185 = Static417.method6111((int) local666);
						if (local1185.anInt7415 != local1114.anInt6936 || local1114.anInt6938 != local1185.anInt7416) {
							local1185.anInt7415 = local1114.anInt6936;
							local1185.anInt7416 = local1114.anInt6938;
							Static371.method5299(local1185);
						}
					} else if (local546 == 10) {
						local1185 = Static417.method6111((int) local666);
						if (local1185.anInt7414 != local1114.anInt6936 || local1185.anInt7374 != local1114.anInt6938 || local1114.anInt6934 != local1185.anInt7407) {
							local1185.anInt7374 = local1114.anInt6938;
							local1185.anInt7414 = local1114.anInt6936;
							local1185.anInt7407 = local1114.anInt6934;
							Static371.method5299(local1185);
						}
					} else if (local546 == 11) {
						local1185 = Static417.method6111((int) local666);
						local1185.aByte103 = 0;
						local1185.anInt7346 = local1185.anInt7364 = local1114.anInt6938;
						local1185.anInt7373 = local1185.anInt7357 = local1114.anInt6936;
						local1185.aByte105 = 0;
						Static371.method5299(local1185);
					} else if (local546 == 12) {
						local1185 = Static417.method6111((int) local666);
						local289 = local1114.anInt6936;
						if (local1185 != null && local1185.anInt7371 == 0) {
							if (local1185.anInt7400 - local1185.anInt7385 < local289) {
								local289 = local1185.anInt7400 - local1185.anInt7385;
							}
							if (local289 < 0) {
								local289 = 0;
							}
							if (local289 != local1185.anInt7342) {
								local1185.anInt7342 = local289;
								Static371.method5299(local1185);
							}
						}
					} else if (local546 == 14) {
						local1185 = Static417.method6111((int) local666);
						local1185.anInt7394 = local1114.anInt6936;
					} else if (local546 == 15) {
						Static392.anInt6487 = local1114.anInt6936;
						Static371.anInt5924 = local1114.anInt6938;
						Static397.aBoolean554 = true;
					} else if (local546 == 16) {
						local1185 = Static417.method6111((int) local666);
						local1185.anInt7359 = local1114.anInt6936;
					} else if (local546 == 20) {
						local1185 = Static417.method6111((int) local666);
						local1185.aBoolean641 = local1114.anInt6936 == 1;
					} else if (local546 == 21) {
						local1185 = Static417.method6111((int) local666);
						local1185.aBoolean637 = local1114.anInt6936 == 1;
					} else if (local546 == 17) {
						local1185 = Static417.method6111((int) local666);
						local1185.anInt7367 = local1114.anInt6936;
					} else if (local546 == 18) {
						local1185 = Static417.method6111((int) local666);
						local289 = (int) (local666 >> 32);
						local1185.method6606((short) local1114.anInt6936, (short) local1114.anInt6938, local289);
					} else if (local546 == 19) {
						local1185 = Static417.method6111((int) local666);
						local289 = (int) (local666 >> 32);
						local1185.method6618((short) local1114.anInt6936, (short) local1114.anInt6938, local289);
					}
				}
			}
		}
		Static371.anInt5922++;
		if (Static427.anInt6966 != 0) {
			Static29.anInt415 += 20;
			if (Static29.anInt415 >= 400) {
				Static427.anInt6966 = 0;
			}
		}
		if (Static411.aClass273_12 != null) {
			Static642.anInt9855++;
			if (Static642.anInt9855 >= 15) {
				Static371.method5299(Static411.aClass273_12);
				Static411.aClass273_12 = null;
			}
		}
		Static168.aBoolean286 = false;
		Static121.aClass273_2 = null;
		Static515.aBoolean708 = false;
		Static388.aClass273_10 = null;
		Static366.method5264((Class273) null, -1, -1);
		if (!Static581.aBoolean787) {
			Static85.anInt1436 = -1;
		}
		Static515.method7307();
		Static602.anInt10526++;
		if (Static520.aBoolean716) {
			@Pc(1983) Class2_Sub33 local1983 = Static592.method8154(Static702.aClass349_158, Static487.aClass221_2.aClass48_1);
			local1983.aClass2_Sub20_Sub2_1.method8577(Static645.anInt9906 | Static104.anInt1801 << 28 | Static716.anInt10910 << 14);
			Static487.aClass221_2.method5173(local1983);
			Static520.aBoolean716 = false;
		}
		while (true) {
			@Pc(2007) Class2_Sub36 local2007;
			@Pc(2024) Class273 local2024;
			@Pc(2012) Class273 local2012;
			do {
				local2007 = (Class2_Sub36) Static574.aClass60_184.method1225();
				if (local2007 == null) {
					while (true) {
						do {
							local2007 = (Class2_Sub36) Static238.aClass60_79.method1225();
							if (local2007 == null) {
								while (true) {
									do {
										local2007 = (Class2_Sub36) Static592.aClass60_189.method1225();
										if (local2007 == null) {
											if (Static388.aClass273_10 == null) {
												Static230.anInt3651 = 0;
											}
											if (Static650.aClass273_17 != null) {
												Static436.method6341(-108);
											}
											if (Static565.anInt8888 > 0 && Static102.aClass184_1.method6058(82) && Static102.aClass184_1.method6058(81) && Static204.anInt3328 != 0) {
												local546 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 - Static204.anInt3328;
												if (local546 < 0) {
													local546 = 0;
												} else if (local546 > 3) {
													local546 = 3;
												}
												Static233.method3334(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] + Static243.anInt3820, local546, Static224.anInt11062 + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0]);
											}
											Static314.method4376();
											for (local546 = 0; local546 < 5; local546++) {
												@Pc(2244) int local2244 = Static629.anIntArray702[local546]++;
											}
											if (Static330.aBoolean430 && Static567.method7863() - 60000L > Static162.aLong97) {
												Static404.method5979();
											}
											for (@Pc(2279) Class4_Sub1_Sub2 local2279 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7605(); local2279 != null; local2279 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7608()) {
												if ((long) local2279.anInt5844 < Static567.method7863() / 1000L - 5L) {
													if (local2279.aShort69 > 0) {
														Static296.method4163(0, "", local2279.aString63 + Static289.aClass191_19.method4067(Static414.anInt9485), 5, "", "");
													}
													if (local2279.aShort69 == 0) {
														Static296.method4163(0, "", local2279.aString63 + Static289.aClass191_20.method4067(Static414.anInt9485), 5, "", "");
													}
													local2279.method9416();
												}
											}
											Static533.anInt8458++;
											if (Static533.anInt8458 > 500) {
												Static533.anInt8458 = 0;
												local227 = (int) (Math.random() * 8.0D);
												if ((local227 & 0x1) == 1) {
													Static241.anInt3808 += Static110.anInt1834;
												}
												if ((local227 & 0x2) == 2) {
													Static100.anInt1783 += Static384.anInt6090;
												}
												if ((local227 & 0x4) == 4) {
													Static405.anInt6686 += Static665.anInt10343;
												}
											}
											if (Static241.anInt3808 < -50) {
												Static110.anInt1834 = 2;
											}
											if (Static241.anInt3808 > 50) {
												Static110.anInt1834 = -2;
											}
											if (Static100.anInt1783 < -55) {
												Static384.anInt6090 = 2;
											}
											if (Static405.anInt6686 < -40) {
												Static665.anInt10343 = 1;
											}
											if (Static100.anInt1783 > 55) {
												Static384.anInt6090 = -2;
											}
											Static569.anInt9316++;
											if (Static405.anInt6686 > 40) {
												Static665.anInt10343 = -1;
											}
											if (Static569.anInt9316 > 500) {
												Static569.anInt9316 = 0;
												local227 = (int) (Math.random() * 8.0D);
												if ((local227 & 0x2) == 2) {
													Static505.anInt8017 += Static412.anInt6769;
												}
												if ((local227 & 0x1) == 1) {
													Static91.anInt1623 += Static535.anInt8478;
												}
											}
											if (Static91.anInt1623 < -60) {
												Static535.anInt8478 = 2;
											}
											if (Static91.anInt1623 > 60) {
												Static535.anInt8478 = -2;
											}
											if (Static505.anInt8017 < -20) {
												Static412.anInt6769 = 1;
											}
											if (Static505.anInt8017 > 10) {
												Static412.anInt6769 = -1;
											}
											Static487.aClass221_2.anInt5769++;
											if (Static487.aClass221_2.anInt5769 > 50) {
												@Pc(2547) Class2_Sub33 local2547 = Static592.method8154(Static402.aClass349_93, Static487.aClass221_2.aClass48_1);
												Static487.aClass221_2.method5173(local2547);
											}
											if (Static46.aBoolean79) {
												Static558.method7792();
												Static46.aBoolean79 = false;
											}
											try {
												Static487.aClass221_2.method5171((byte) 112);
												return;
											} catch (@Pc(2566) IOException local2566) {
												Static284.method3979();
												return;
											}
										}
										local2012 = local2007.aClass273_6;
										if (local2012.anInt7410 < 0) {
											break;
										}
										local2024 = Static417.method6111(local2012.anInt7392);
									} while (local2024 == null || local2024.aClass273Array4 == null || local2012.anInt7410 >= local2024.aClass273Array4.length || local2012 != local2024.aClass273Array4[local2012.anInt7410]);
									Static484.method6919(local2007);
								}
							}
							local2012 = local2007.aClass273_6;
							if (local2012.anInt7410 < 0) {
								break;
							}
							local2024 = Static417.method6111(local2012.anInt7392);
						} while (local2024 == null || local2024.aClass273Array4 == null || local2012.anInt7410 >= local2024.aClass273Array4.length || local2012 != local2024.aClass273Array4[local2012.anInt7410]);
						Static484.method6919(local2007);
					}
				}
				local2012 = local2007.aClass273_6;
				if (local2012.anInt7410 < 0) {
					break;
				}
				local2024 = Static417.method6111(local2012.anInt7392);
			} while (local2024 == null || local2024.aClass273Array4 == null || local2024.aClass273Array4.length <= local2012.anInt7410 || local2012 != local2024.aClass273Array4[local2012.anInt7410]);
			Static484.method6919(local2007);
		}
	}
}
