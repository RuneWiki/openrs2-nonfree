import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_66 = new Class215(55, 16);

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!o;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZLjava/lang/String;)I")
	public static int method4041(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg1.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(67) int local67;
			if (local41 >= '0' && local41 <= '9') {
				local67 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local67 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local67 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local67 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local67 = -local67;
			}
			@Pc(111) int local111 = local67 + local30 * arg0;
			if (local111 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local30 = local111;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method4042() {
		if (Static188.anInt5353 > 1) {
			Static308.anInt5413 = Static325.anInt5640;
			Static188.anInt5353--;
		}
		if (Static95.anInt1910 > 0) {
			Static95.anInt1910--;
		}
		if (Static22.aBoolean38) {
			Static22.aBoolean38 = false;
			Static165.method2731();
			return;
		}
		if (!Static234.aBoolean411) {
			Static314.method4198();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static207.method4188(); local38++) {
		}
		if (Static403.anInt6667 != 30) {
			return;
		}
		Static321.method4336(Static251.aClass215_54.method4926(), Static3.aClass4_Sub12_Sub1_5);
		if (Static178.aClass4_Sub42_2 == null) {
			if (Static419.aLong212 <= Static282.method3962()) {
				Static178.aClass4_Sub42_2 = Static402.aClass256_1.method5479(Static321.aString54);
			}
		} else if (Static178.aClass4_Sub42_2.anInt6883 != -1) {
			Static429.method5476(Static27.aClass215_7);
			Static3.aClass4_Sub12_Sub1_5.method2524(Static178.aClass4_Sub42_2.anInt6883);
			Static178.aClass4_Sub42_2 = null;
			Static419.aLong212 = Static282.method3962() + 30000L;
		}
		@Pc(99) Class4_Sub5 local99 = (Class4_Sub5) Static413.aClass183_47.method4140();
		@Pc(119) int local119;
		@Pc(140) int local140;
		@Pc(159) int local159;
		@Pc(175) boolean local175;
		@Pc(227) int local227;
		@Pc(234) int local234;
		@Pc(246) int local246;
		if (local99 != null || Static282.method3962() - 2000L > Static292.aLong177) {
			@Pc(116) boolean local116 = false;
			local119 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
			for (@Pc(124) Class4_Sub5 local124 = (Class4_Sub5) Static348.aClass183_42.method4140(); local124 != null && Static3.aClass4_Sub12_Sub1_5.anInt2997 - local119 < 240; local124 = (Class4_Sub5) Static348.aClass183_42.method4144()) {
				local124.method5684();
				local140 = local124.method519();
				if (local140 < 0) {
					local140 = 0;
				} else if (local140 > 65534) {
					local140 = 65534;
				}
				local159 = local124.method518();
				if (local159 < 0) {
					local159 = 0;
				} else if (local159 > 65534) {
					local159 = 65534;
				}
				local175 = false;
				if (local124.method519() == -1 && local124.method518() == -1) {
					local140 = -1;
					local175 = true;
					local159 = -1;
				}
				if (local159 != Static452.anInt7358 || local140 != Static410.anInt6734) {
					if (!local116) {
						Static429.method5476(Static266.aClass215_62);
						Static3.aClass4_Sub12_Sub1_5.method2551(0);
						local116 = true;
						local119 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
					}
					local227 = local159 - Static452.anInt7358;
					Static452.anInt7358 = local159;
					local234 = local140 - Static410.anInt6734;
					Static410.anInt6734 = local140;
					local246 = (int) ((local124.method516() - Static292.aLong177) / 20L);
					if (local246 < 8 && local227 >= -32 && local227 <= 31 && local234 >= -32 && local234 <= 31) {
						local234 += 32;
						local227 += 32;
						Static3.aClass4_Sub12_Sub1_5.method2524(local234 + (local246 << 12) + (local227 << 6));
					} else if (local246 < 32 && local227 >= -128 && local227 <= 127 && local234 >= -128 && local234 <= 127) {
						Static3.aClass4_Sub12_Sub1_5.method2551(local246 + 128);
						local227 += 128;
						local234 += 128;
						Static3.aClass4_Sub12_Sub1_5.method2524(local234 + (local227 << 8));
					} else if (local246 >= 32) {
						Static3.aClass4_Sub12_Sub1_5.method2524(local246 + 57344);
						if (local175) {
							Static3.aClass4_Sub12_Sub1_5.method2531(Integer.MIN_VALUE);
						} else {
							Static3.aClass4_Sub12_Sub1_5.method2531(local140 << 16 | local159);
						}
					} else {
						Static3.aClass4_Sub12_Sub1_5.method2551(local246 + 192);
						if (local175) {
							Static3.aClass4_Sub12_Sub1_5.method2531(Integer.MIN_VALUE);
						} else {
							Static3.aClass4_Sub12_Sub1_5.method2531(local140 << 16 | local159);
						}
					}
					Static292.aLong177 = local124.method516();
				}
			}
			if (local116) {
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local119);
			}
		}
		@Pc(416) int local416;
		@Pc(463) int local463;
		if (local99 != null) {
			@Pc(402) long local402 = (local99.method516() - Static259.aLong160) / 50L;
			if (local402 > 32767L) {
				local402 = 32767L;
			}
			Static259.aLong160 = local99.method516();
			local416 = local99.method519();
			if (local416 < 0) {
				local416 = 0;
			} else if (local416 > 65535) {
				local416 = 65535;
			}
			local140 = local99.method518();
			if (local140 < 0) {
				local140 = 0;
			} else if (local140 > 65535) {
				local140 = 65535;
			}
			@Pc(447) byte local447 = 0;
			if (local99.method515() == 2) {
				local447 = 1;
			}
			local463 = (int) local402;
			Static429.method5476(Static226.aClass215_47);
			Static3.aClass4_Sub12_Sub1_5.method2531(local416 << 16 | local140);
			Static3.aClass4_Sub12_Sub1_5.method2505(local463 | local447 << 15);
		}
		@Pc(489) int local489;
		if (Static190.anInt3602 > 0) {
			local489 = 0;
			for (local119 = 0; local119 < Static190.anInt3602; local119++) {
				if (Static164.aClass30Array4[local119].method741()) {
					local489++;
				}
			}
			if (local489 > 0) {
				Static429.method5476(Static224.aClass215_44);
				if (local489 > 75) {
					local489 = 75;
				}
				Static3.aClass4_Sub12_Sub1_5.method2551(local489 * 3);
				for (local416 = 0; local416 < Static190.anInt3602; local416++) {
					@Pc(537) Class30 local537 = Static164.aClass30Array4[local416];
					if (local537.method741()) {
						@Pc(550) long local550 = (local537.method742() - Static256.aLong156) / 50L;
						Static256.aLong156 = local537.method742();
						if (local550 > 65535L) {
							local550 = 65535L;
						}
						Static3.aClass4_Sub12_Sub1_5.method2551(local537.method746());
						Static3.aClass4_Sub12_Sub1_5.method2524((int) local550);
					}
				}
			}
		}
		if (Static324.anInt5626 > 0) {
			Static324.anInt5626--;
		}
		if (Static251.aBoolean429 && Static324.anInt5626 <= 0) {
			Static251.aBoolean429 = false;
			Static324.anInt5626 = 20;
			Static429.method5476(Static253.aClass215_57);
			Static3.aClass4_Sub12_Sub1_5.method2505((int) Static368.aFloat192 >> 3);
			Static3.aClass4_Sub12_Sub1_5.method2496((int) Static164.aFloat142 >> 3);
		}
		if (Static265.aBoolean457 && !Static41.aBoolean74) {
			Static41.aBoolean74 = true;
			Static429.method5476(Static44.aClass215_9);
			Static3.aClass4_Sub12_Sub1_5.method2551(1);
		}
		if (!Static265.aBoolean457 && Static41.aBoolean74) {
			Static41.aBoolean74 = false;
			Static429.method5476(Static44.aClass215_9);
			Static3.aClass4_Sub12_Sub1_5.method2551(0);
		}
		if (!Static249.aBoolean425) {
			Static429.method5476(Static197.aClass215_39);
			Static3.aClass4_Sub12_Sub1_5.method2551(0);
			local489 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
			@Pc(692) Class4_Sub12 local692 = Static323.aClass50_Sub1_1.method2863();
			Static3.aClass4_Sub12_Sub1_5.method2519(local692.aByteArray36, local692.anInt2997);
			Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local489);
			Static249.aBoolean425 = true;
		}
		if (Static202.aClass164ArrayArrayArray5 != null) {
			if (Static111.anInt2386 == 2) {
				Static329.method4430();
			} else if (Static111.anInt2386 == 3) {
				Static294.method514();
			}
		}
		if (Static308.aBoolean487) {
			Static308.aBoolean487 = false;
		} else {
			Static380.aFloat195 /= 2.0F;
		}
		if (Static32.aBoolean63) {
			Static32.aBoolean63 = false;
		} else {
			Static50.aFloat28 /= 2.0F;
		}
		Static255.method3687();
		if (Static403.anInt6667 != 30) {
			return;
		}
		Static248.method3623();
		Static80.method1433();
		Static412.method5294();
		Static177.method2527();
		Static410.anInt6735++;
		if (Static410.anInt6735 > 750) {
			Static165.method2731();
			return;
		}
		Static229.method3458();
		Static276.method884();
		Static108.method2009();
		for (local489 = Static257.aClass114_1.method2832(true); local489 != -1; local489 = Static257.aClass114_1.method2832(false)) {
			Static277.method3934(local489);
			Static8.anIntArray7[Static292.anInt5255++ & 0x1F] = local489;
		}
		@Pc(840) Class247 local840;
		for (@Pc(815) Class4_Sub1_Sub11 local815 = Static92.method1614(); local815 != null; local815 = Static92.method1614()) {
			local416 = local815.method2606();
			local140 = local815.method2609();
			if (local416 == 1) {
				Static165.anIntArray210[local140] = local815.anInt3083;
				Static135.aBoolean256 |= Static22.aBooleanArray3[local140];
				Static143.anIntArray184[Static314.anInt5473++ & 0x1F] = local140;
			} else if (local416 == 2) {
				Static265.aStringArray20[local140] = local815.aString32;
				Static277.anIntArray337[Static218.anInt4042++ & 0x1F] = local140;
			} else if (local416 == 3) {
				local840 = Static392.method5121(local140);
				if (!local815.aString32.equals(local840.aString67)) {
					local840.aString67 = local815.aString32;
					Static63.method1142(local840);
				}
			} else if (local416 == 4) {
				local840 = Static392.method5121(local140);
				local463 = local815.anInt3083;
				local227 = local815.anInt3082;
				local234 = local815.anInt3079;
				if (local463 != local840.anInt6796 || local840.anInt6781 != local227 || local234 != local840.anInt6848) {
					local840.anInt6781 = local227;
					local840.anInt6848 = local234;
					local840.anInt6796 = local463;
					Static63.method1142(local840);
				}
			} else if (local416 == 5) {
				local840 = Static392.method5121(local140);
				if (local815.anInt3083 != local840.anInt6788 || local815.anInt3083 == -1) {
					local840.anInt6815 = 0;
					local840.anInt6829 = 0;
					local840.anInt6783 = 1;
					local840.anInt6788 = local815.anInt3083;
					Static63.method1142(local840);
				}
			} else if (local416 == 6) {
				local159 = local815.anInt3083;
				local463 = local159 >> 10 & 0x1F;
				local227 = local159 >> 5 & 0x1F;
				local234 = local159 & 0x1F;
				local246 = (local234 << 3) + (local227 << 11) + (local463 << 19);
				@Pc(937) Class247 local937 = Static392.method5121(local140);
				if (local937.anInt6772 != local246) {
					local937.anInt6772 = local246;
					Static63.method1142(local937);
				}
			} else if (local416 == 7) {
				local840 = Static392.method5121(local140);
				local175 = local815.anInt3083 == 1;
				if (local175 != local840.aBoolean616) {
					local840.aBoolean616 = local175;
					Static63.method1142(local840);
				}
			} else if (local416 == 8) {
				local840 = Static392.method5121(local140);
				if (local840.anInt6844 != local815.anInt3083 || local840.anInt6858 != local815.anInt3082 || local815.anInt3079 != local840.anInt6857) {
					local840.anInt6857 = local815.anInt3079;
					local840.anInt6858 = local815.anInt3082;
					local840.anInt6844 = local815.anInt3083;
					if (local840.anInt6779 != -1) {
						if (local840.anInt6822 > 0) {
							local840.anInt6857 = local840.anInt6857 * 32 / local840.anInt6822;
						} else if (local840.anInt6816 > 0) {
							local840.anInt6857 = local840.anInt6857 * 32 / local840.anInt6816;
						}
					}
					Static63.method1142(local840);
				}
			} else if (local416 == 9) {
				local840 = Static392.method5121(local140);
				if (local840.anInt6779 != local815.anInt3083 || local840.anInt6832 != local815.anInt3082) {
					local840.anInt6832 = local815.anInt3082;
					local840.anInt6779 = local815.anInt3083;
					Static63.method1142(local840);
				}
			} else if (local416 == 10) {
				local840 = Static392.method5121(local140);
				if (local840.anInt6814 != local815.anInt3083 || local840.anInt6826 != local815.anInt3082 || local840.anInt6843 != local815.anInt3079) {
					local840.anInt6814 = local815.anInt3083;
					local840.anInt6826 = local815.anInt3082;
					local840.anInt6843 = local815.anInt3079;
					Static63.method1142(local840);
				}
			} else if (local416 == 11) {
				local840 = Static392.method5121(local140);
				local840.aByte79 = 0;
				local840.anInt6836 = local840.anInt6804 = local815.anInt3083;
				local840.aByte81 = 0;
				local840.anInt6859 = local840.anInt6808 = local815.anInt3082;
				Static63.method1142(local840);
			} else if (local416 == 12) {
				local840 = Static392.method5121(local140);
				local463 = local815.anInt3083;
				if (local840 != null && local840.anInt6840 == 0) {
					if (local463 > local840.anInt6834 - local840.anInt6805) {
						local463 = local840.anInt6834 - local840.anInt6805;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local840.anInt6849 != local463) {
						local840.anInt6849 = local463;
						Static63.method1142(local840);
					}
				}
			} else if (local416 == 14) {
				local840 = Static392.method5121(local140);
				local840.lb = local815.anInt3083;
			} else if (local416 == 15) {
				Static60.anInt1094 = local815.anInt3082;
				Static350.aBoolean556 = true;
				Static343.anInt771 = local815.anInt3083;
			} else if (local416 == 16) {
				local840 = Static392.method5121(local140);
				local840.anInt6791 = local815.anInt3083;
			}
		}
		Static176.anInt3414++;
		if (Static85.anInt1764 != 0) {
			Static216.anInt4014 += 20;
			if (Static216.anInt4014 >= 400) {
				Static85.anInt1764 = 0;
			}
		}
		if (Static378.aClass247_8 != null) {
			Static91.anInt1087++;
			if (Static91.anInt1087 >= 15) {
				Static63.method1142(Static378.aClass247_8);
				Static378.aClass247_8 = null;
			}
		}
		Static81.aClass247_2 = null;
		Static232.aClass247_9 = null;
		Static361.aBoolean570 = false;
		Static390.aBoolean584 = false;
		Static361.method4870(-1, null, -1);
		Static40.method697(null, -1, -1);
		if (!Static341.aBoolean599) {
			Static157.anInt3147 = -1;
		}
		Static164.method3582();
		Static325.anInt5640++;
		if (Static219.aBoolean588) {
			Static429.method5476(Static372.aClass215_84);
			Static3.aClass4_Sub12_Sub1_5.method2532(Static445.anInt7274 | Static263.anInt4958 << 14 | Static155.anInt3644 << 28);
			Static219.aBoolean588 = false;
		}
		while (true) {
			@Pc(1462) Class4_Sub34 local1462;
			@Pc(1467) Class247 local1467;
			do {
				local1462 = (Class4_Sub34) Static237.aClass183_52.method4136();
				if (local1462 == null) {
					while (true) {
						do {
							local1462 = (Class4_Sub34) Static39.aClass183_3.method4136();
							if (local1462 == null) {
								while (true) {
									do {
										local1462 = (Class4_Sub34) Static291.aClass183_35.method4136();
										if (local1462 == null) {
											if (Static81.aClass247_2 == null) {
												Static64.anInt1367 = 0;
											}
											if (Static281.aClass247_12 != null) {
												Static1.method3();
											}
											if (Static104.anInt2252 > 0 && Static384.aClass244_1.method5489(82) && Static384.aClass244_1.method5489(81) && Static430.anInt3862 != 0) {
												local416 = Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 - Static430.anInt3862;
												if (local416 < 0) {
													local416 = 0;
												} else if (local416 > 3) {
													local416 = 3;
												}
												Static200.method3168(local416, Static86.anInt1771 + Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0], Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0] + Static180.anInt3453);
											}
											Static41.method730();
											for (local416 = 0; local416 < 5; local416++) {
												@Pc(1675) int local1675 = Static390.anIntArray486[local416]++;
											}
											if (Static135.aBoolean256 && Static174.aLong119 < Static282.method3962() - 60000L) {
												Static316.method4216();
											}
											Static200.anInt3873++;
											if (Static200.anInt3873 > 500) {
												Static200.anInt3873 = 0;
												local140 = (int) (Math.random() * 8.0D);
												if ((local140 & 0x1) == 1) {
													Static217.anInt4024 += Static105.anInt2326;
												}
												if ((local140 & 0x4) == 4) {
													Static273.anInt5119 += Static268.anInt5006;
												}
												if ((local140 & 0x2) == 2) {
													Static323.anInt5620 += Static195.anInt3714;
												}
											}
											if (Static217.anInt4024 < -50) {
												Static105.anInt2326 = 2;
											}
											if (Static323.anInt5620 < -55) {
												Static195.anInt3714 = 2;
											}
											if (Static217.anInt4024 > 50) {
												Static105.anInt2326 = -2;
											}
											if (Static323.anInt5620 > 55) {
												Static195.anInt3714 = -2;
											}
											if (Static273.anInt5119 < -40) {
												Static268.anInt5006 = 1;
											}
											Static74.anInt1528++;
											if (Static273.anInt5119 > 40) {
												Static268.anInt5006 = -1;
											}
											if (Static74.anInt1528 > 500) {
												Static74.anInt1528 = 0;
												local140 = (int) (Math.random() * 8.0D);
												if ((local140 & 0x2) == 2) {
													Static110.anInt2374 += Static110.anInt2369;
												}
												if ((local140 & 0x1) == 1) {
													Static175.anInt3399 += Static400.anInt6628;
												}
											}
											if (Static175.anInt3399 < -60) {
												Static400.anInt6628 = 2;
											}
											if (Static175.anInt3399 > 60) {
												Static400.anInt6628 = -2;
											}
											if (Static110.anInt2374 < -20) {
												Static110.anInt2369 = 1;
											}
											if (Static110.anInt2374 > 10) {
												Static110.anInt2369 = -1;
											}
											Static162.anInt6744++;
											if (Static162.anInt6744 > 50) {
												Static429.method5476(Static14.aClass215_2);
											}
											if (Static83.aBoolean159) {
												Static374.method4996();
												Static83.aBoolean159 = false;
											}
											try {
												if (Static125.aClass11_5 != null && Static3.aClass4_Sub12_Sub1_5.anInt2997 > 0) {
													Static60.anInt1097 += Static3.aClass4_Sub12_Sub1_5.anInt2997;
													Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
													Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
													Static162.anInt6744 = 0;
													return;
												}
												return;
											} catch (@Pc(1884) IOException local1884) {
												Static165.method2731();
												return;
											}
										}
										local1467 = local1462.aClass247_15;
										if (local1467.anInt6865 < 0) {
											break;
										}
										local840 = Static392.method5121(local1467.anInt6850);
									} while (local840 == null || local840.aClass247Array2 == null || local1467.anInt6865 >= local840.aClass247Array2.length || local1467 != local840.aClass247Array2[local1467.anInt6865]);
									Static271.method3894(local1462);
								}
							}
							local1467 = local1462.aClass247_15;
							if (local1467.anInt6865 < 0) {
								break;
							}
							local840 = Static392.method5121(local1467.anInt6850);
						} while (local840 == null || local840.aClass247Array2 == null || local1467.anInt6865 >= local840.aClass247Array2.length || local840.aClass247Array2[local1467.anInt6865] != local1467);
						Static271.method3894(local1462);
					}
				}
				local1467 = local1462.aClass247_15;
				if (local1467.anInt6865 < 0) {
					break;
				}
				local840 = Static392.method5121(local1467.anInt6850);
			} while (local840 == null || local840.aClass247Array2 == null || local840.aClass247Array2.length <= local1467.anInt6865 || local1467 != local840.aClass247Array2[local1467.anInt6865]);
			Static271.method3894(local1462);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4044(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, arg0.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(local14 + arg1.length());
		}
		return arg2;
	}
}
