import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "[I")
	public static int[] anIntArray325 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Z")
	public static boolean method2492() throws IOException {
		if (Static150.aClass139_3 == null) {
			return false;
		}
		@Pc(15) int local15 = Static150.aClass139_3.method3554();
		if (local15 == 0) {
			return false;
		}
		if (Static255.anInt5252 == -1) {
			local15--;
			Static150.aClass139_3.method3558(1, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
			Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
			Static255.anInt5252 = Static249.aClass3_Sub26_Sub1_3.method3955();
			Static287.anInt5742 = Static114.anIntArray631[Static255.anInt5252];
		}
		if (Static287.anInt5742 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			Static150.aClass139_3.method3558(1, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
			Static287.anInt5742 = Static249.aClass3_Sub26_Sub1_3.aByteArray64[0] & 0xFF;
		}
		if (Static287.anInt5742 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static150.aClass139_3.method3558(2, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
			local15 -= 2;
			Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
			Static287.anInt5742 = Static249.aClass3_Sub26_Sub1_3.method3948();
		}
		if (local15 < Static287.anInt5742) {
			return false;
		}
		Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
		Static150.aClass139_3.method3558(Static287.anInt5742, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
		Static108.anInt2014 = Static252.anInt5210;
		Static252.anInt5210 = Static179.anInt3342;
		Static144.anInt4823 = 0;
		Static179.anInt3342 = Static255.anInt5252;
		@Pc(151) int local151;
		@Pc(194) int local194;
		@Pc(141) String local141;
		@Pc(153) boolean local153;
		@Pc(317) int local317;
		@Pc(205) int local205;
		@Pc(128) String local128;
		if (Static255.anInt5252 == 8) {
			local128 = Static249.aClass3_Sub26_Sub1_3.method3931();
			@Pc(137) boolean local137 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
			if (local137) {
				local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
			} else {
				local141 = local128;
			}
			local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
			local153 = false;
			@Pc(157) byte local157 = Static249.aClass3_Sub26_Sub1_3.method3920();
			if (local157 == -128) {
				local153 = true;
			}
			if (local153) {
				if (Static200.anInt3909 == 0) {
					Static255.anInt5252 = -1;
					return true;
				}
				for (local317 = 0; Static200.anInt3909 > local317 && (!Static279.aClass187Array1[local317].aString222.equals(local141) || Static279.aClass187Array1[local317].anInt5891 != local151); local317++) {
				}
				if (Static200.anInt3909 > local317) {
					while (local317 < Static200.anInt3909 - 1) {
						Static279.aClass187Array1[local317] = Static279.aClass187Array1[local317 + 1];
						local317++;
					}
					Static200.anInt3909--;
					Static279.aClass187Array1[Static200.anInt3909] = null;
				}
			} else {
				@Pc(171) String local171 = Static249.aClass3_Sub26_Sub1_3.method3931();
				@Pc(175) Class187 local175 = new Class187();
				local175.aString221 = local128;
				local175.anInt5891 = local151;
				local175.aByte30 = local157;
				local175.aString223 = local171;
				local175.aString222 = local141;
				for (local194 = Static200.anInt3909 - 1; local194 >= 0; local194--) {
					local205 = Static279.aClass187Array1[local194].aString222.compareTo(local175.aString222);
					if (local205 == 0) {
						Static279.aClass187Array1[local194].anInt5891 = local151;
						Static279.aClass187Array1[local194].aByte30 = local157;
						Static279.aClass187Array1[local194].aString223 = local171;
						if (local141.equals(Static136.aClass10_Sub5_Sub1_1.aString124)) {
							Static43.aByte1 = local157;
						}
						Static255.anInt5252 = -1;
						Static305.anInt6008 = Static201.anInt3956;
						return true;
					}
					if (local205 < 0) {
						break;
					}
				}
				if (Static279.aClass187Array1.length <= Static200.anInt3909) {
					Static255.anInt5252 = -1;
					return true;
				}
				for (local205 = Static200.anInt3909 - 1; local205 > local194; local205--) {
					Static279.aClass187Array1[local205 + 1] = Static279.aClass187Array1[local205];
				}
				if (Static200.anInt3909 == 0) {
					Static279.aClass187Array1 = new Class187[100];
				}
				Static279.aClass187Array1[local194 + 1] = local175;
				Static200.anInt3909++;
				if (local141.equals(Static136.aClass10_Sub5_Sub1_1.aString124)) {
					Static43.aByte1 = local157;
				}
			}
			Static255.anInt5252 = -1;
			Static305.anInt6008 = Static201.anInt3956;
			return true;
		}
		@Pc(389) int local389;
		@Pc(393) int local393;
		@Pc(397) int local397;
		if (Static255.anInt5252 == 64) {
			Static155.method2593();
			local389 = Static249.aClass3_Sub26_Sub1_3.method3921();
			local393 = Static249.aClass3_Sub26_Sub1_3.method3896();
			local397 = Static249.aClass3_Sub26_Sub1_3.method3921();
			Static262.anIntArray559[local389] = local393;
			Static170.anIntArray386[local389] = local397;
			Static210.anIntArray457[local389] = 1;
			for (local151 = 0; local151 < 98; local151++) {
				if (Class31.anIntArray83[local151] <= local393) {
					Static210.anIntArray457[local389] = local151 + 2;
				}
			}
			Static229.anIntArray497[Static196.anInt3827++ & 0x1F] = local389;
			Static255.anInt5252 = -1;
			return true;
		} else if (Static255.anInt5252 == 13) {
			local389 = Static249.aClass3_Sub26_Sub1_3.method3915();
			local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
			@Pc(465) byte local465 = Static249.aClass3_Sub26_Sub1_3.method3920();
			if (Static272.aByte15 != local465) {
				Static255.anInt5252 = -1;
				return true;
			}
			Static255.anInt5252 = -1;
			if (local389 == 255) {
				Static6.aBoolean11 = false;
				Static247.anInt4992 = 0;
				Static81.anInt1533 = 0;
			} else {
				Static81.anInt1533 = local389;
				Static247.anInt4992 = local393;
				Static6.aBoolean11 = true;
			}
			return true;
		} else if (Static255.anInt5252 == 108) {
			Static149.anInt2817 = Static249.aClass3_Sub26_Sub1_3.method3915();
			for (local389 = 0; local389 < Static149.anInt2817; local389++) {
				Static13.aStringArray3[local389] = Static249.aClass3_Sub26_Sub1_3.method3931();
				Static88.aStringArray17[local389] = Static249.aClass3_Sub26_Sub1_3.method3931();
				if (Static88.aStringArray17[local389].equals("")) {
					Static88.aStringArray17[local389] = Static13.aStringArray3[local389];
				}
				Static82.aStringArray15[local389] = Static249.aClass3_Sub26_Sub1_3.method3931();
				Static308.aStringArray42[local389] = Static249.aClass3_Sub26_Sub1_3.method3931();
				if (Static308.aStringArray42[local389].equals("")) {
					Static308.aStringArray42[local389] = Static82.aStringArray15[local389];
				}
				Static184.aBooleanArray86[local389] = false;
			}
			Static152.anInt2882 = Static201.anInt3956;
			Static255.anInt5252 = -1;
			return true;
		} else if (Static255.anInt5252 == 106) {
			local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
			local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
			local397 = Static249.aClass3_Sub26_Sub1_3.method3941();
			if (Static178.method2933(local389)) {
				if (local397 == 2) {
					Static76.method1200();
				}
				Static66.anInt1232 = local393;
				Static241.method4090(local393);
				Static315.method5005(false);
				Static43.method654(Static66.anInt1232);
				for (local151 = 0; local151 < 100; local151++) {
					Static292.aBooleanArray129[local151] = true;
				}
			}
			Static255.anInt5252 = -1;
			return true;
		} else if (Static255.anInt5252 == 9) {
			local128 = Static249.aClass3_Sub26_Sub1_3.method3931();
			local141 = Static24.method3703(Static291.method4776(Static152.method2564(Static249.aClass3_Sub26_Sub1_3)));
			Static291.method4774(local128, local128, local141, 0, 6);
			Static255.anInt5252 = -1;
			return true;
		} else if (Static255.anInt5252 == 114) {
			if (Static73.aFrame1 != null) {
				Static203.method3359(-1, false, -1, Static255.anInt5254);
			}
			@Pc(667) byte[] local667 = new byte[Static287.anInt5742];
			Static249.aClass3_Sub26_Sub1_3.method3954(Static287.anInt5742, local667);
			local141 = Static222.method3633(local667, Static287.anInt5742, 0);
			if (Static276.aFrame2 == null && (Static275.anInt5563 == 3 || !Static275.aString208.startsWith("win") || Static62.aBoolean87)) {
				Static17.method291(local141, true);
			} else {
				Static306.aBoolean428 = true;
				Static85.aString63 = local141;
				Static120.aClass178_1 = Static274.aClass176_4.method4517(local141);
			}
			Static255.anInt5252 = -1;
			return true;
		} else if (Static255.anInt5252 == 76) {
			Static65.anInt1222 = Static249.aClass3_Sub26_Sub1_3.method3915();
			Static152.anInt2882 = Static201.anInt3956;
			Static255.anInt5252 = -1;
			return true;
		} else {
			@Pc(776) int local776;
			@Pc(1035) int local1035;
			@Pc(739) boolean local739;
			@Pc(747) String local747;
			@Pc(755) int local755;
			@Pc(757) String local757;
			@Pc(759) boolean local759;
			@Pc(981) String local981;
			@Pc(963) int local963;
			@Pc(999) String local999;
			@Pc(1017) String local1017;
			if (Static255.anInt5252 == 112) {
				local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
				local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
				local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local755 = Static249.aClass3_Sub26_Sub1_3.method3915();
				local757 = "";
				local759 = false;
				if (local151 > 0) {
					local757 = Static249.aClass3_Sub26_Sub1_3.method3931();
					local759 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				}
				for (local776 = 0; local776 < Static285.anInt5735; local776++) {
					if (local739) {
						if (local747.equals(Static286.aStringArray37[local776])) {
							Static286.aStringArray37[local776] = local141;
							Static136.aStringArray22[local776] = local747;
							local141 = null;
							break;
						}
					} else if (local141.equals(Static286.aStringArray37[local776])) {
						if (Static139.anIntArray400[local776] != local151) {
							Static139.anIntArray400[local776] = local151;
							if (local151 > 0) {
								Static291.method4774("", "", local141 + Static315.aString233, 0, 5);
							}
							if (local151 == 0) {
								Static291.method4774("", "", local141 + Static288.aString218, 0, 5);
							}
						}
						Static136.aStringArray22[local776] = local747;
						Static151.aStringArray24[local776] = local757;
						local141 = null;
						Static9.anIntArray16[local776] = local755;
						Static279.aBooleanArray122[local776] = local759;
						break;
					}
				}
				if (local141 != null && Static285.anInt5735 < 200) {
					Static286.aStringArray37[Static285.anInt5735] = local141;
					Static136.aStringArray22[Static285.anInt5735] = local747;
					Static139.anIntArray400[Static285.anInt5735] = local151;
					Static151.aStringArray24[Static285.anInt5735] = local757;
					Static9.anIntArray16[Static285.anInt5735] = local755;
					Static279.aBooleanArray122[Static285.anInt5735] = local759;
					Static285.anInt5735++;
				}
				Static152.anInt2882 = Static201.anInt3956;
				local194 = Static285.anInt5735;
				while (local194 > 0) {
					@Pc(917) boolean local917 = true;
					local194--;
					for (local205 = 0; local205 < local194; local205++) {
						if (Static203.anInt3980 != Static139.anIntArray400[local205] && Static139.anIntArray400[local205 + 1] == Static203.anInt3980 || Static139.anIntArray400[local205] == 0 && Static139.anIntArray400[local205 + 1] != 0) {
							local917 = false;
							local963 = Static139.anIntArray400[local205];
							Static139.anIntArray400[local205] = Static139.anIntArray400[local205 + 1];
							Static139.anIntArray400[local205 + 1] = local963;
							local981 = Static151.aStringArray24[local205];
							Static151.aStringArray24[local205] = Static151.aStringArray24[local205 + 1];
							Static151.aStringArray24[local205 + 1] = local981;
							local999 = Static286.aStringArray37[local205];
							Static286.aStringArray37[local205] = Static286.aStringArray37[local205 + 1];
							Static286.aStringArray37[local205 + 1] = local999;
							local1017 = Static136.aStringArray22[local205];
							Static136.aStringArray22[local205] = Static136.aStringArray22[local205 + 1];
							Static136.aStringArray22[local205 + 1] = local1017;
							local1035 = Static9.anIntArray16[local205];
							Static9.anIntArray16[local205] = Static9.anIntArray16[local205 + 1];
							Static9.anIntArray16[local205 + 1] = local1035;
							@Pc(1053) boolean local1053 = Static279.aBooleanArray122[local205];
							Static279.aBooleanArray122[local205] = Static279.aBooleanArray122[local205 + 1];
							Static279.aBooleanArray122[local205 + 1] = local1053;
						}
					}
					if (local917) {
						break;
					}
				}
				Static255.anInt5252 = -1;
				return true;
			} else if (Static255.anInt5252 == 97) {
				Static248.method4172(Static249.aClass3_Sub26_Sub1_3.method3931());
				Static255.anInt5252 = -1;
				return true;
			} else if (Static255.anInt5252 == 49 || Static255.anInt5252 == 67 || Static255.anInt5252 == 113 || Static255.anInt5252 == 179 || Static255.anInt5252 == 200 || Static255.anInt5252 == 173 || Static255.anInt5252 == 134 || Static255.anInt5252 == 50 || Static255.anInt5252 == 146 || Static255.anInt5252 == 130 || Static255.anInt5252 == 21 || Static255.anInt5252 == 81 || Static255.anInt5252 == 90 || Static255.anInt5252 == 17) {
				Static230.method3783();
				Static255.anInt5252 = -1;
				return true;
			} else if (Static255.anInt5252 == 14) {
				Static249.aClass3_Sub26_Sub1_3.anInt4615 += 28;
				if (Static249.aClass3_Sub26_Sub1_3.method3888()) {
					Static277.method4539(Static249.aClass3_Sub26_Sub1_3, Static249.aClass3_Sub26_Sub1_3.anInt4615 - 28);
				}
				Static255.anInt5252 = -1;
				return true;
			} else {
				@Pc(1256) int local1256;
				if (Static255.anInt5252 == 38) {
					Static305.anInt6008 = Static201.anInt3956;
					if (Static287.anInt5742 == 0) {
						Static51.aString38 = null;
						Static111.aString83 = null;
						Static255.anInt5252 = -1;
						Static200.anInt3909 = 0;
						Static279.aClass187Array1 = null;
						return true;
					}
					Static111.aString83 = Static249.aClass3_Sub26_Sub1_3.method3931();
					local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
					if (local739) {
						Static249.aClass3_Sub26_Sub1_3.method3931();
					}
					@Pc(1230) long local1230 = Static249.aClass3_Sub26_Sub1_3.method3900();
					Static51.aString38 = Static92.method1367(local1230);
					Static175.aByte16 = Static249.aClass3_Sub26_Sub1_3.method3920();
					local151 = Static249.aClass3_Sub26_Sub1_3.method3915();
					if (local151 == 255) {
						Static255.anInt5252 = -1;
						return true;
					}
					Static200.anInt3909 = local151;
					@Pc(1254) Class187[] local1254 = new Class187[100];
					for (local1256 = 0; local1256 < Static200.anInt3909; local1256++) {
						local1254[local1256] = new Class187();
						local1254[local1256].aString221 = Static249.aClass3_Sub26_Sub1_3.method3931();
						local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
						if (local739) {
							local1254[local1256].aString222 = Static249.aClass3_Sub26_Sub1_3.method3931();
						} else {
							local1254[local1256].aString222 = local1254[local1256].aString221;
						}
						local1254[local1256].anInt5891 = Static249.aClass3_Sub26_Sub1_3.method3948();
						local1254[local1256].aByte30 = Static249.aClass3_Sub26_Sub1_3.method3920();
						local1254[local1256].aString223 = Static249.aClass3_Sub26_Sub1_3.method3931();
						if (local1254[local1256].aString222.equals(Static136.aClass10_Sub5_Sub1_1.aString124)) {
							Static43.aByte1 = local1254[local1256].aByte30;
						}
					}
					local776 = Static200.anInt3909;
					while (local776 > 0) {
						local153 = true;
						local776--;
						for (local194 = 0; local194 < local776; local194++) {
							if (local1254[local194].aString221.compareTo(local1254[local194 + 1].aString221) > 0) {
								local153 = false;
								@Pc(1379) Class187 local1379 = local1254[local194];
								local1254[local194] = local1254[local194 + 1];
								local1254[local194 + 1] = local1379;
							}
						}
						if (local153) {
							break;
						}
					}
					Static279.aClass187Array1 = local1254;
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 31) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3932();
					local393 = Static249.aClass3_Sub26_Sub1_3.method3908();
					local397 = Static249.aClass3_Sub26_Sub1_3.method3925();
					if (Static178.method2933(local393)) {
						Static238.method4037(local397, local389);
					}
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 137) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
					if (Static178.method2933(local389)) {
						Static38.method559();
					}
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 175) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
					local393 = Static249.aClass3_Sub26_Sub1_3.method3891();
					local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
					if (Static178.method2933(local397)) {
						Static243.method4113(local389, local393);
					}
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 204) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3915();
					if (Static249.aClass3_Sub26_Sub1_3.method3915() == 0) {
						Static290.aClass54Array1[local389] = new Class54();
					} else {
						Static249.aClass3_Sub26_Sub1_3.anInt4615--;
						Static290.aClass54Array1[local389] = new Class54(Static249.aClass3_Sub26_Sub1_3);
					}
					Static255.anInt5252 = -1;
					Static214.anInt4188 = Static201.anInt3956;
					return true;
				} else if (Static255.anInt5252 == 51) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3890();
					local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
					local397 = Static249.aClass3_Sub26_Sub1_3.method3908();
					if (Static178.method2933(local397)) {
						Static57.method925(local393, local389);
					}
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 69) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
					local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
					local397 = Static249.aClass3_Sub26_Sub1_3.method3909();
					if (Static178.method2933(local389)) {
						Static10.method158(local141, local397);
					}
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 65) {
					local389 = Static249.aClass3_Sub26_Sub1_3.method3932();
					local393 = local389 >> 28 & 0x3;
					local151 = local389 & 0x3FFF;
					local397 = local389 >> 14 & 0x3FFF;
					local755 = Static249.aClass3_Sub26_Sub1_3.method3948();
					if (local755 == 65535) {
						local755 = -1;
					}
					local1256 = Static249.aClass3_Sub26_Sub1_3.method3915();
					local151 -= Static43.anInt798;
					local317 = local1256 >> 2;
					local776 = local1256 & 0x3;
					local194 = Static254.anIntArray550[local317];
					local397 -= Static101.anInt1844;
					Static65.method1020(local755, local776, local317, local397, local393, local151, local194);
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 123) {
					Static5.method101();
					Static255.anInt5252 = -1;
					return false;
				} else if (Static255.anInt5252 == 145) {
					Static155.method2593();
					Static117.anInt2182 = Static249.aClass3_Sub26_Sub1_3.method3930();
					Static293.anInt5839 = Static201.anInt3956;
					Static255.anInt5252 = -1;
					return true;
				} else if (Static255.anInt5252 == 233) {
					Static13.anInt242 = Static249.aClass3_Sub26_Sub1_3.method3921();
					Static135.anInt2605 = Static249.aClass3_Sub26_Sub1_3.method3921();
					while (Static249.aClass3_Sub26_Sub1_3.anInt4615 < Static287.anInt5742) {
						Static255.anInt5252 = Static249.aClass3_Sub26_Sub1_3.method3915();
						Static230.method3783();
					}
					Static255.anInt5252 = -1;
					return true;
				} else {
					@Pc(1727) String local1727;
					@Pc(1731) String local1731;
					if (Static255.anInt5252 == 224) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
						local1727 = Static249.aClass3_Sub26_Sub1_3.method3931();
						local1731 = Static249.aClass3_Sub26_Sub1_3.method3931();
						@Pc(1742) boolean local1742 = (local389 & 0x1) == 1;
						local757 = Static249.aClass3_Sub26_Sub1_3.method3931();
						if (local1742) {
							for (local317 = 0; local317 < Static149.anInt2817; local317++) {
								if (Static88.aStringArray17[local317].equals(local757)) {
									Static13.aStringArray3[local317] = local747;
									if (local1727.equals("")) {
										Static88.aStringArray17[local317] = local747;
									} else {
										Static88.aStringArray17[local317] = local1727;
									}
									Static82.aStringArray15[local317] = local1731;
									if (local757.equals("")) {
										Static308.aStringArray42[local317] = local1731;
									} else {
										Static308.aStringArray42[local317] = local757;
									}
									break;
								}
							}
						} else {
							Static13.aStringArray3[Static149.anInt2817] = local747;
							if (local1727.equals("")) {
								Static88.aStringArray17[Static149.anInt2817] = local747;
							} else {
								Static88.aStringArray17[Static149.anInt2817] = local1727;
							}
							Static82.aStringArray15[Static149.anInt2817] = local1731;
							if (local757.equals("")) {
								Static308.aStringArray42[Static149.anInt2817] = local1731;
							} else {
								Static308.aStringArray42[Static149.anInt2817] = local757;
							}
							Static184.aBooleanArray86[Static149.anInt2817] = (local389 & 0x2) == 2;
							Static149.anInt2817++;
						}
						Static152.anInt2882 = Static201.anInt3956;
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 121) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3890();
						Static220.aClass178_5 = Static274.aClass176_4.method4527(local389);
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 1) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
						local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3896();
						if (Static178.method2933(local389)) {
							Static208.method3464(local141, local397);
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 217) {
						Static94.method1390(false);
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 218) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3908();
						local151 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local755 = Static249.aClass3_Sub26_Sub1_3.method3891();
						if (Static178.method2933(local389)) {
							Static62.method979(7, local755, local393 << 16 | local397, local151);
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 180) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3890();
						Static267.method4418(local389, local393);
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 151) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3925();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3930();
						local151 = Static249.aClass3_Sub26_Sub1_3.method3896();
						if (Static178.method2933(local389)) {
							Static286.method4485(local397, local393, local151);
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 86) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
						if (Static178.method2933(local393)) {
							Static23.method363(local389, local397);
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 78) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
						local755 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local1256 = Static249.aClass3_Sub26_Sub1_3.method3915();
						if (Static178.method2933(local389)) {
							Static204.method3391(local393, local397, local755, local1256, local151);
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 79) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3921();
						if (local389 == 65535) {
							local389 = -1;
						}
						Static314.method5015(local389, local393);
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 94) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3921();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3916();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
						if (local397 == 65535) {
							local397 = -1;
						}
						Static186.method3128(local393, local397, local389);
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 147) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3908();
						if (local393 == 65535) {
							local393 = -1;
						}
						local397 = Static249.aClass3_Sub26_Sub1_3.method3890();
						local151 = Static249.aClass3_Sub26_Sub1_3.method3895();
						if (Static178.method2933(local151)) {
							@Pc(2176) Class151 local2176 = Static243.method4115(local389);
							@Pc(2188) Class21 local2188;
							if (local2176.aBoolean328) {
								Static259.method4348(local389, local393, local397);
								local2188 = Static133.method2309(local393);
								Static43.method658(local2188.anInt528, local2188.anInt549, local2188.anInt503, local389);
								Static237.method4006(local2188.anInt533, local2188.anInt497, local2188.anInt499, local389);
							} else if (local393 == -1) {
								local2176.anInt4737 = 0;
								Static255.anInt5252 = -1;
								return true;
							} else {
								local2188 = Static133.method2309(local393);
								local2176.anInt4724 = local2188.anInt503 * 100 / local397;
								local2176.anInt4801 = local2188.anInt549;
								local2176.anInt4737 = 4;
								local2176.anInt4806 = local393;
								local2176.anInt4729 = local2188.anInt528;
								Static134.method3639(local2176);
							}
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 80) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local151 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local755 = Static249.aClass3_Sub26_Sub1_3.method3915();
						local1256 = Static249.aClass3_Sub26_Sub1_3.method3948();
						if (Static178.method2933(local389)) {
							Static312.aBooleanArray136[local393] = true;
							Static183.anIntArray422[local393] = local397;
							Static111.anIntArray215[local393] = local151;
							Static90.anIntArray161[local393] = local755;
							Static220.anIntArray544[local393] = local1256;
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 193) {
						local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
						if (Static178.method2933(local389)) {
							Static291.method4773();
						}
						Static255.anInt5252 = -1;
						return true;
					} else if (Static255.anInt5252 == 136) {
						local128 = Static249.aClass3_Sub26_Sub1_3.method3931();
						local393 = Static249.aClass3_Sub26_Sub1_3.method3895();
						local397 = Static249.aClass3_Sub26_Sub1_3.method3909();
						if (Static178.method2933(local397)) {
							Static10.method158(local128, local393);
						}
						Static255.anInt5252 = -1;
						return true;
					} else {
						@Pc(2376) Class151 local2376;
						if (Static255.anInt5252 == 255) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (local389 >= 0) {
								local2376 = Static243.method4115(local389);
							} else {
								local2376 = null;
							}
							if (local389 < -70000) {
								local393 += 32768;
							}
							while (Static249.aClass3_Sub26_Sub1_3.anInt4615 < Static287.anInt5742) {
								local151 = Static249.aClass3_Sub26_Sub1_3.method3904();
								local755 = Static249.aClass3_Sub26_Sub1_3.method3948();
								local1256 = 0;
								if (local755 != 0) {
									local1256 = Static249.aClass3_Sub26_Sub1_3.method3915();
									if (local1256 == 255) {
										local1256 = Static249.aClass3_Sub26_Sub1_3.method3896();
									}
								}
								if (local2376 != null && local151 >= 0 && local151 < local2376.anIntArray511.length) {
									local2376.anIntArray511[local151] = local755;
									local2376.anIntArray515[local151] = local1256;
								}
								Static268.method4447(local755 - 1, local393, local1256, local151);
							}
							if (local2376 != null) {
								Static134.method3639(local2376);
							}
							Static155.method2593();
							Static252.anIntArray545[Static17.anInt330++ & 0x1F] = local393 & 0x7FFF;
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 70) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3932();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							local397 = Static249.aClass3_Sub26_Sub1_3.method3909();
							if (Static178.method2933(local393)) {
								Static11.method4249(local397, local389);
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 167) {
							for (local389 = 0; local389 < Static52.aClass10_Sub5_Sub1Array1.length; local389++) {
								if (Static52.aClass10_Sub5_Sub1Array1[local389] != null) {
									Static52.aClass10_Sub5_Sub1Array1[local389].anInt5061 = -1;
								}
							}
							for (local389 = 0; local389 < Static110.aClass10_Sub5_Sub2Array1.length; local389++) {
								if (Static110.aClass10_Sub5_Sub2Array1[local389] != null) {
									Static110.aClass10_Sub5_Sub2Array1[local389].anInt5061 = -1;
								}
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 210) {
							Static157.method2608(Static287.anInt5742, Static274.aClass176_4, Static249.aClass3_Sub26_Sub1_3);
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 225) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3915();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (Static178.method2933(local393)) {
								Static100.anInt1839 = local389;
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 162) {
							@Pc(2607) byte local2607 = Static249.aClass3_Sub26_Sub1_3.method3887();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
							local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (Static178.method2933(local393)) {
								Static243.method4113(local397, local2607);
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 28) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							local397 = Static249.aClass3_Sub26_Sub1_3.method3932();
							if (Static178.method2933(local393)) {
								Static47.method4892(local389, local397);
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 84) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (local389 >= 0) {
								local2376 = Static243.method4115(local389);
							} else {
								local2376 = null;
							}
							if (local389 < -70000) {
								local393 += 32768;
							}
							if (local2376 != null) {
								for (local151 = 0; local151 < local2376.anIntArray511.length; local151++) {
									local2376.anIntArray511[local151] = 0;
									local2376.anIntArray515[local151] = 0;
								}
							}
							Static35.method532(local393);
							local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
							for (local755 = 0; local755 < local151; local755++) {
								local1256 = Static249.aClass3_Sub26_Sub1_3.method3939();
								if (local1256 == 255) {
									local1256 = Static249.aClass3_Sub26_Sub1_3.method3896();
								}
								local317 = Static249.aClass3_Sub26_Sub1_3.method3909();
								if (local2376 != null && local755 < local2376.anIntArray511.length) {
									local2376.anIntArray511[local755] = local317;
									local2376.anIntArray515[local755] = local1256;
								}
								Static268.method4447(local317 - 1, local393, local1256, local755);
							}
							if (local2376 != null) {
								Static134.method3639(local2376);
							}
							Static155.method2593();
							Static252.anIntArray545[Static17.anInt330++ & 0x1F] = local393 & 0x7FFF;
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 254) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (local389 == 65535) {
								local389 = -1;
							}
							local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
							local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
							local151 = Static249.aClass3_Sub26_Sub1_3.method3915();
							Static306.method4919(local393, local389, local151, local397);
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 244) {
							Static155.method2593();
							Static105.anInt1943 = Static249.aClass3_Sub26_Sub1_3.method3915();
							Static255.anInt5252 = -1;
							Static293.anInt5839 = Static201.anInt3956;
							return true;
						} else if (Static255.anInt5252 == 30) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3915();
							local393 = local389 >> 5;
							local397 = local389 & 0x1F;
							if (local397 == 0) {
								Static51.aClass121Array1[local393] = null;
								Static255.anInt5252 = -1;
								return true;
							}
							@Pc(2884) Class121 local2884 = new Class121();
							local2884.anInt3691 = local397;
							local2884.anInt3699 = Static249.aClass3_Sub26_Sub1_3.method3915();
							if (local2884.anInt3699 >= 0 && Static270.aClass3_Sub4_Sub12Array10.length > local2884.anInt3699) {
								if (local2884.anInt3691 == 1 || local2884.anInt3691 == 10) {
									local2884.anInt3690 = Static249.aClass3_Sub26_Sub1_3.method3948();
									Static249.aClass3_Sub26_Sub1_3.anInt4615 += 5;
								} else if (local2884.anInt3691 >= 2 && local2884.anInt3691 <= 6) {
									if (local2884.anInt3691 == 2) {
										local2884.anInt3695 = 64;
										local2884.anInt3689 = 64;
									}
									if (local2884.anInt3691 == 3) {
										local2884.anInt3689 = 64;
										local2884.anInt3695 = 0;
									}
									if (local2884.anInt3691 == 4) {
										local2884.anInt3695 = 128;
										local2884.anInt3689 = 64;
									}
									if (local2884.anInt3691 == 5) {
										local2884.anInt3695 = 64;
										local2884.anInt3689 = 0;
									}
									if (local2884.anInt3691 == 6) {
										local2884.anInt3689 = 128;
										local2884.anInt3695 = 64;
									}
									local2884.anInt3691 = 2;
									local2884.anInt3703 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local2884.anInt3696 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local2884.anInt3697 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local2884.anInt3698 = Static249.aClass3_Sub26_Sub1_3.method3948();
								}
								local2884.anInt3692 = Static249.aClass3_Sub26_Sub1_3.method3948();
								if (local2884.anInt3692 == 65535) {
									local2884.anInt3692 = -1;
								}
								Static51.aClass121Array1[local393] = local2884;
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 127) {
							Static102.method1633();
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 88) {
							local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
							local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
							if (Static178.method2933(local393)) {
								Static62.method979(5, local389, 2047, 0);
							}
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 222) {
							Static296.anInt5865 = Static249.aClass3_Sub26_Sub1_3.method3915();
							Static49.anInt946 = Static249.aClass3_Sub26_Sub1_3.method3915();
							Static284.anInt5707 = Static249.aClass3_Sub26_Sub1_3.method3915();
							Static255.anInt5252 = -1;
							return true;
						} else if (Static255.anInt5252 == 249) {
							if (Static287.anInt5742 == 0) {
								Static54.aString40 = Static75.aString58;
							} else {
								Static54.aString40 = Static249.aClass3_Sub26_Sub1_3.method3931();
							}
							Static255.anInt5252 = -1;
							return true;
						} else {
							@Pc(3143) long local3143;
							@Pc(3148) long local3148;
							if (Static255.anInt5252 == 227) {
								local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
								local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
								local747 = local141;
								if (local739) {
									local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
								}
								local3143 = Static249.aClass3_Sub26_Sub1_3.method3948();
								local3148 = Static249.aClass3_Sub26_Sub1_3.method3899();
								@Pc(3150) boolean local3150 = false;
								local776 = Static249.aClass3_Sub26_Sub1_3.method3915();
								@Pc(3161) long local3161 = (local3143 << 32) + local3148;
								@Pc(3163) int local3163 = 0;
								while (true) {
									if (local3163 >= 100) {
										if (local776 <= 1) {
											if (Static264.aBoolean376 && !Static78.aBoolean128 || Static191.aBoolean264) {
												local3150 = true;
											} else if (Static288.method4745(local747)) {
												local3150 = true;
											}
										}
										break;
									}
									if (local3161 == Static238.aLongArray10[local3163]) {
										local3150 = true;
										break;
									}
									local3163++;
								}
								if (!local3150 && Static293.anInt5842 == 0) {
									Static238.aLongArray10[Static272.anInt3136] = local3161;
									Static272.anInt3136 = (Static272.anInt3136 + 1) % 100;
									local981 = Static24.method3703(Static291.method4776(Static152.method2564(Static249.aClass3_Sub26_Sub1_3)));
									if (local776 == 2) {
										Static251.method4236("<img=1>" + local747, local981, "<img=1>" + local141, 0, null, 7, -1);
									} else if (local776 == 1) {
										Static251.method4236("<img=0>" + local747, local981, "<img=0>" + local141, 0, null, 7, -1);
									} else {
										Static251.method4236(local747, local981, local141, 0, null, 3, -1);
									}
								}
								Static255.anInt5252 = -1;
								return true;
							}
							@Pc(3357) Class3_Sub31 local3357;
							@Pc(3351) long local3351;
							@Pc(3366) Class3_Sub31 local3366;
							if (Static255.anInt5252 == 72) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
								if (local389 == 65535) {
									local389 = -1;
								}
								local393 = Static249.aClass3_Sub26_Sub1_3.method3890();
								local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
								local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
								if (local151 == 65535) {
									local151 = -1;
								}
								local755 = Static249.aClass3_Sub26_Sub1_3.method3909();
								if (Static178.method2933(local397)) {
									for (local1256 = local151; local1256 <= local389; local1256++) {
										local3351 = (long) local1256 + ((long) local393 << 32);
										local3357 = (Class3_Sub31) Static34.aClass30_2.method663(local3351);
										if (local3357 != null) {
											local3366 = new Class3_Sub31(local3357.anInt5831, local755);
											local3357.method5013();
										} else if (local1256 == -1) {
											local3366 = new Class3_Sub31(Static243.method4115(local393).aClass3_Sub31_2.anInt5831, local755);
										} else {
											local3366 = new Class3_Sub31(0, local755);
										}
										Static34.aClass30_2.method668(local3366, local3351);
									}
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 25) {
								local128 = Static249.aClass3_Sub26_Sub1_3.method3931();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
								local747 = Static213.method3486(local393).method1585(Static249.aClass3_Sub26_Sub1_3);
								Static251.method4236(local128, local747, local128, 0, null, 19, local393);
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 92) {
								for (local389 = 0; local389 < Static161.anIntArray347.length; local389++) {
									if (Static161.anIntArray347[local389] != Static229.anIntArray496[local389]) {
										Static161.anIntArray347[local389] = Static229.anIntArray496[local389];
										Static15.method3529(local389);
										Static156.anIntArray336[Static88.anInt1660++ & 0x1F] = local389;
									}
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 119) {
								Static230.anInt4489 = Static249.aClass3_Sub26_Sub1_3.method3915();
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 47) {
								Static13.anInt242 = Static249.aClass3_Sub26_Sub1_3.method3939();
								Static135.anInt2605 = Static249.aClass3_Sub26_Sub1_3.method3939();
								for (local389 = Static135.anInt2605; local389 < Static135.anInt2605 + 8; local389++) {
									for (local393 = Static13.anInt242; local393 < Static13.anInt242 + 8; local393++) {
										if (Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local389][local393] != null) {
											Static223.aClass56ArrayArrayArray1[Static99.anInt1826][local389][local393] = null;
											Static244.method4141(local393, local389);
										}
									}
								}
								for (@Pc(3570) Class3_Sub10 local3570 = (Class3_Sub10) Static219.aClass56_21.method1281(); local3570 != null; local3570 = (Class3_Sub10) Static219.aClass56_21.method1278()) {
									if (Static135.anInt2605 <= local3570.anInt1465 && Static135.anInt2605 + 8 > local3570.anInt1465 && Static13.anInt242 <= local3570.anInt1475 && Static13.anInt242 + 8 > local3570.anInt1475 && Static99.anInt1826 == local3570.anInt1477) {
										local3570.anInt1466 = 0;
									}
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 126) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
								local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
								local151 = Static249.aClass3_Sub26_Sub1_3.method3908();
								local755 = Static249.aClass3_Sub26_Sub1_3.method3890();
								if (Static178.method2933(local389)) {
									Static43.method658(local151, local393, local397, local755);
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 241) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3932();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3890();
								local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
								local151 = Static249.aClass3_Sub26_Sub1_3.method3909();
								if (Static178.method2933(local151)) {
									Static62.method979(5, local393, local397, local389);
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 107) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
								if (local393 == 65535) {
									local393 = -1;
								}
								local397 = Static249.aClass3_Sub26_Sub1_3.method3891();
								if (Static178.method2933(local389)) {
									Static62.method979(2, local397, local393, -1);
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 182) {
								Static222.anInt4338 = Static249.aClass3_Sub26_Sub1_3.method3909() * 30;
								Static293.anInt5839 = Static201.anInt3956;
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 6) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3891();
								if (Static178.method2933(local389)) {
									local397 = 0;
									if (Static136.aClass10_Sub5_Sub1_1.aClass131_2 != null) {
										local397 = Static136.aClass10_Sub5_Sub1_1.aClass131_2.method3354();
									}
									Static62.method979(3, local393, local397, -1);
								}
								Static255.anInt5252 = -1;
								return true;
							} else if (Static255.anInt5252 == 215) {
								local389 = Static249.aClass3_Sub26_Sub1_3.method3939();
								local393 = Static249.aClass3_Sub26_Sub1_3.method3941();
								local397 = Static249.aClass3_Sub26_Sub1_3.method3941();
								Static99.anInt1826 = local397 >> 1;
								Static136.aClass10_Sub5_Sub1_1.method3047(local389, local393, (local397 & 0x1) == 1);
								Static255.anInt5252 = -1;
								return true;
							} else {
								@Pc(3841) Class3_Sub3 local3841;
								if (Static255.anInt5252 == 168) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3895();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local151 = Static249.aClass3_Sub26_Sub1_3.method3891();
									if (Static178.method2933(local389)) {
										local3841 = (Class3_Sub3) Static205.aClass30_23.method663((long) local151);
										if (local3841 != null) {
											Static49.method779(local3841.anInt183 != local397, local3841);
										}
										Static165.method2735(local151, local393, local397);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 36) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
									@Pc(3883) Object[] local3883 = new Object[local141.length() + 1];
									for (local151 = local141.length() - 1; local151 >= 0; local151--) {
										if (local141.charAt(local151) == 's') {
											local3883[local151 + 1] = Static249.aClass3_Sub26_Sub1_3.method3931();
										} else {
											local3883[local151 + 1] = Integer.valueOf(Static249.aClass3_Sub26_Sub1_3.method3896());
										}
									}
									local3883[0] = Integer.valueOf(Static249.aClass3_Sub26_Sub1_3.method3896());
									if (Static178.method2933(local389)) {
										@Pc(3939) Class3_Sub24 local3939 = new Class3_Sub24();
										local3939.anObjectArray1 = local3883;
										Static161.method2653(local3939);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 75) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
									Static219.method3604(local389, local393);
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 141) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
									Static267.method4418(local389, local393);
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 211) {
									Static94.method1390(true);
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 135) {
									Static64.method1015();
									Static155.method2593();
									Static255.anInt5252 = -1;
									Static88.anInt1660 += 32;
									return true;
								} else if (Static255.anInt5252 == 192) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3939();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
									@Pc(4044) Class10_Sub5_Sub2 local4044 = Static110.aClass10_Sub5_Sub2Array1[local389];
									if (local4044 != null) {
										Static276.method4530(local393, local4044, local397);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 170) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3896();
									if (Static178.method2933(local389)) {
										@Pc(4079) Class3_Sub3 local4079 = (Class3_Sub3) Static205.aClass30_23.method663((long) local393);
										if (local4079 != null) {
											Static49.method779(true, local4079);
										}
										if (Static259.aClass151_18 != null) {
											Static134.method3639(Static259.aClass151_18);
											Static259.aClass151_18 = null;
										}
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 57) {
									Static135.anInt2605 = Static249.aClass3_Sub26_Sub1_3.method3921();
									Static13.anInt242 = Static249.aClass3_Sub26_Sub1_3.method3921();
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 15) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local151 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local755 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local1256 = Static249.aClass3_Sub26_Sub1_3.method3915();
									if (Static178.method2933(local389)) {
										Static123.method2052(local397, local393, true, local151, local1256, local755);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 206) {
									Static73.method1126();
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 203) {
									if (Static66.anInt1232 != -1) {
										Static88.method1354(0, Static66.anInt1232);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 91) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3895();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local151 = Static249.aClass3_Sub26_Sub1_3.method3891();
									if (Static178.method2933(local389)) {
										Static99.method1584(local151, local397 + (local393 << 16));
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 52) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
									if (local393 == 65535) {
										local393 = -1;
									}
									local397 = Static249.aClass3_Sub26_Sub1_3.method3890();
									local151 = Static249.aClass3_Sub26_Sub1_3.method3890();
									local755 = Static249.aClass3_Sub26_Sub1_3.method3895();
									if (local755 == 65535) {
										local755 = -1;
									}
									if (Static178.method2933(local389)) {
										for (local1256 = local393; local1256 <= local755; local1256++) {
											local3351 = ((long) local151 << 32) + (long) local1256;
											local3357 = (Class3_Sub31) Static34.aClass30_2.method663(local3351);
											if (local3357 != null) {
												local3366 = new Class3_Sub31(local397, local3357.anInt5833);
												local3357.method5013();
											} else if (local1256 == -1) {
												local3366 = new Class3_Sub31(local397, Static243.method4115(local151).aClass3_Sub31_2.anInt5833);
											} else {
												local3366 = new Class3_Sub31(local397, -1);
											}
											Static34.aClass30_2.method668(local3366, local3351);
										}
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 122) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3891();
									if (local393 == 65535) {
										local393 = -1;
									}
									if (Static178.method2933(local389)) {
										Static62.method979(1, local397, local393, -1);
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 45) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3890();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3890();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3895();
									if (Static178.method2933(local397)) {
										@Pc(4400) Class3_Sub3 local4400 = (Class3_Sub3) Static205.aClass30_23.method663((long) local389);
										local3841 = (Class3_Sub3) Static205.aClass30_23.method663((long) local393);
										if (local3841 != null) {
											Static49.method779(local4400 == null || local4400.anInt183 != local3841.anInt183, local3841);
										}
										if (local4400 != null) {
											local4400.method5013();
											Static205.aClass30_23.method668(local4400, (long) local393);
										}
										@Pc(4439) Class151 local4439 = Static243.method4115(local389);
										if (local4439 != null) {
											Static134.method3639(local4439);
										}
										local4439 = Static243.method4115(local393);
										if (local4439 != null) {
											Static134.method3639(local4439);
											Static282.method4617(local4439, true);
										}
										if (Static66.anInt1232 != -1) {
											Static88.method1354(1, Static66.anInt1232);
										}
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 132) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3909();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3909();
									local151 = Static249.aClass3_Sub26_Sub1_3.method3908();
									if (local389 >> 30 == 0) {
										@Pc(4559) Class173 local4559;
										@Pc(4648) Class15 local4648;
										@Pc(4572) Class15 local4572;
										@Pc(4631) Class173 local4631;
										@Pc(4653) Class15 local4653;
										if (local389 >> 29 != 0) {
											local755 = local389 & 0xFFFF;
											@Pc(4759) Class10_Sub5_Sub2 local4759 = Static110.aClass10_Sub5_Sub2Array1[local755];
											if (local4759 != null) {
												if (local393 == 65535) {
													local393 = -1;
												}
												local759 = true;
												if (local393 != -1 && local4759.anInt5023 != -1) {
													if (local393 == local4759.anInt5023) {
														local4559 = Static297.method1843(local393);
														if (local4559.aBoolean380 && local4559.anInt5489 != -1) {
															local4572 = Static253.method4288(local4559.anInt5489);
															local205 = local4572.anInt412;
															if (local205 == 1) {
																local4759.anInt5047 = 0;
																local4759.anInt5069 = 1;
																local4759.anInt5056 = 0;
																local4759.anInt5050 = Static124.anInt2371 + local397;
																local4759.anInt5101 = 0;
																local759 = false;
																Static158.method2622(local4759.anInt5073, local4759.anInt5047, local4572, false, local4759.anInt5016);
															} else if (local205 == 2) {
																local759 = false;
																local4759.anInt5051 = 0;
															}
														}
													} else {
														local4559 = Static297.method1843(local393);
														local4631 = Static297.method1843(local4759.anInt5023);
														if (local4559.anInt5489 != -1 && local4631.anInt5489 != -1) {
															local4648 = Static253.method4288(local4559.anInt5489);
															local4653 = Static253.method4288(local4631.anInt5489);
															if (local4648.anInt420 < local4653.anInt420) {
																local759 = false;
															}
														}
													}
												}
												if (local759) {
													local4759.anInt5069 = 1;
													local4759.anInt5033 = local151;
													local4759.anInt5050 = local397 + Static124.anInt2371;
													local4759.anInt5047 = 0;
													local4759.anInt5023 = local393;
													local4759.anInt5101 = 0;
													if (Static124.anInt2371 < local4759.anInt5050) {
														local4759.anInt5047 = -1;
													}
													if (local4759.anInt5023 != -1 && Static124.anInt2371 == local4759.anInt5050) {
														local776 = Static297.method1843(local4759.anInt5023).anInt5489;
														if (local776 != -1) {
															local4572 = Static253.method4288(local776);
															if (local4572 != null && local4572.anIntArray35 != null) {
																Static158.method2622(local4759.anInt5073, 0, local4572, false, local4759.anInt5016);
															}
														}
													}
												}
											}
										} else if (local389 >> 28 != 0) {
											local755 = local389 & 0xFFFF;
											@Pc(4522) Class10_Sub5_Sub1 local4522;
											if (local755 == Static273.anInt5556) {
												local4522 = Static136.aClass10_Sub5_Sub1_1;
											} else {
												local4522 = Static52.aClass10_Sub5_Sub1Array1[local755];
											}
											if (local4522 != null) {
												if (local393 == 65535) {
													local393 = -1;
												}
												local759 = true;
												if (local393 != -1 && local4522.anInt5023 != -1) {
													if (local4522.anInt5023 == local393) {
														local4559 = Static297.method1843(local393);
														if (local4559.aBoolean380 && local4559.anInt5489 != -1) {
															local4572 = Static253.method4288(local4559.anInt5489);
															local205 = local4572.anInt412;
															if (local205 == 1) {
																local4522.anInt5056 = 0;
																local759 = false;
																local4522.anInt5069 = 1;
																local4522.anInt5101 = 0;
																local4522.anInt5050 = Static124.anInt2371 + local397;
																local4522.anInt5047 = 0;
																Static158.method2622(local4522.anInt5073, local4522.anInt5047, local4572, false, local4522.anInt5016);
															} else if (local205 == 2) {
																local4522.anInt5051 = 0;
																local759 = false;
															}
														}
													} else {
														local4559 = Static297.method1843(local393);
														local4631 = Static297.method1843(local4522.anInt5023);
														if (local4559.anInt5489 != -1 && local4631.anInt5489 != -1) {
															local4648 = Static253.method4288(local4559.anInt5489);
															local4653 = Static253.method4288(local4631.anInt5489);
															if (local4648.anInt420 < local4653.anInt420) {
																local759 = false;
															}
														}
													}
												}
												if (local759) {
													local4522.anInt5050 = local397 + Static124.anInt2371;
													local4522.anInt5023 = local393;
													local4522.anInt5069 = 1;
													local4522.anInt5033 = local151;
													if (local4522.anInt5023 == 65535) {
														local4522.anInt5023 = -1;
													}
													local4522.anInt5101 = 0;
													local4522.anInt5047 = 0;
													if (local4522.anInt5050 > Static124.anInt2371) {
														local4522.anInt5047 = -1;
													}
													if (local4522.anInt5023 != -1 && local4522.anInt5050 == Static124.anInt2371) {
														local776 = Static297.method1843(local4522.anInt5023).anInt5489;
														if (local776 != -1) {
															local4572 = Static253.method4288(local776);
															if (local4572 != null && local4572.anIntArray35 != null) {
																Static158.method2622(local4522.anInt5073, 0, local4572, Static136.aClass10_Sub5_Sub1_1 == local4522, local4522.anInt5016);
															}
														}
													}
												}
											}
										}
									} else {
										local1256 = (local389 >> 14 & 0x3FFF) - Static101.anInt1844;
										local755 = local389 >> 28 & 0x3;
										local317 = (local389 & 0x3FFF) - Static43.anInt798;
										if (local1256 >= 0 && local317 >= 0 && local1256 < 104 && local317 < 104) {
											local317 = local317 * 128 + 64;
											local1256 = local1256 * 128 + 64;
											@Pc(5040) Class10_Sub1 local5040 = new Class10_Sub1(local393, local755, local1256, local317, Static122.method2036(local317, local1256, local755) - local151, local397, Static124.anInt2371);
											Static259.aClass56_25.method1282(new Class3_Sub4_Sub20(local5040));
										}
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 61) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3909();
									@Pc(5065) byte local5065 = Static249.aClass3_Sub26_Sub1_3.method3920();
									Static219.method3604(local5065, local389);
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 20) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3904();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3896();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local1727 = "";
									local1731 = local1727;
									if ((local397 & 0x1) != 0) {
										local1727 = Static249.aClass3_Sub26_Sub1_3.method3931();
										if ((local397 & 0x2) == 0) {
											local1731 = local1727;
										} else {
											local1731 = Static249.aClass3_Sub26_Sub1_3.method3931();
										}
									}
									local757 = Static249.aClass3_Sub26_Sub1_3.method3931();
									if (!local1731.equals("") && Static288.method4745(local1731)) {
										Static255.anInt5252 = -1;
										return true;
									} else {
										Static291.method4774(local1731, local1727, local757, local393, local389);
										Static255.anInt5252 = -1;
										return true;
									}
								} else if (Static255.anInt5252 == 99) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3896();
									@Pc(5157) Class151 local5157 = Static243.method4115(local389);
									for (local397 = 0; local397 < local5157.anIntArray511.length; local397++) {
										local5157.anIntArray511[local397] = -1;
										local5157.anIntArray511[local397] = 0;
									}
									Static134.method3639(local5157);
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 110) {
									local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
									local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
									local747 = local141;
									if (local739) {
										local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
									}
									local3143 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local3148 = Static249.aClass3_Sub26_Sub1_3.method3899();
									@Pc(5231) long local5231 = local3148 + (local3143 << 32);
									@Pc(5233) boolean local5233 = false;
									local776 = Static249.aClass3_Sub26_Sub1_3.method3915();
									local194 = Static249.aClass3_Sub26_Sub1_3.method3948();
									@Pc(5243) int local5243 = 0;
									while (true) {
										if (local5243 >= 100) {
											if (local776 <= 1 && Static288.method4745(local747)) {
												local5233 = true;
											}
											break;
										}
										if (Static238.aLongArray10[local5243] == local5231) {
											local5233 = true;
											break;
										}
										local5243++;
									}
									if (!local5233 && Static293.anInt5842 == 0) {
										Static238.aLongArray10[Static272.anInt3136] = local5231;
										Static272.anInt3136 = (Static272.anInt3136 + 1) % 100;
										local999 = Static213.method3486(local194).method1585(Static249.aClass3_Sub26_Sub1_3);
										if (local776 == 2) {
											Static251.method4236("<img=1>" + local747, local999, "<img=1>" + local141, 0, null, 18, local194);
										} else if (local776 == 1) {
											Static251.method4236("<img=0>" + local747, local999, "<img=0>" + local141, 0, null, 18, local194);
										} else {
											Static251.method4236(local747, local999, local141, 0, null, 18, local194);
										}
									}
									Static255.anInt5252 = -1;
									return true;
								} else if (Static255.anInt5252 == 188) {
									local389 = Static249.aClass3_Sub26_Sub1_3.method3908();
									local393 = Static249.aClass3_Sub26_Sub1_3.method3948();
									local397 = Static249.aClass3_Sub26_Sub1_3.method3890();
									if (Static178.method2933(local393)) {
										Static26.method417(local397, local389);
									}
									Static255.anInt5252 = -1;
									return true;
								} else {
									@Pc(5447) long local5447;
									if (Static255.anInt5252 == 103) {
										local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
										local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
										local747 = local141;
										if (local739) {
											local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
										}
										local3143 = Static249.aClass3_Sub26_Sub1_3.method3900();
										local3148 = Static249.aClass3_Sub26_Sub1_3.method3948();
										local5447 = Static249.aClass3_Sub26_Sub1_3.method3899();
										@Pc(5453) long local5453 = (local3148 << 32) + local5447;
										@Pc(5455) boolean local5455 = false;
										local205 = Static249.aClass3_Sub26_Sub1_3.method3915();
										@Pc(5461) int local5461 = 0;
										while (true) {
											if (local5461 < 100) {
												if (Static238.aLongArray10[local5461] != local5453) {
													local5461++;
													continue;
												}
												local5455 = true;
												break;
											}
											if (local205 <= 1) {
												if (Static264.aBoolean376 && !Static78.aBoolean128 || Static191.aBoolean264) {
													local5455 = true;
												} else if (Static288.method4745(local747)) {
													local5455 = true;
												}
											}
											break;
										}
										if (!local5455 && Static293.anInt5842 == 0) {
											Static238.aLongArray10[Static272.anInt3136] = local5453;
											Static272.anInt3136 = (Static272.anInt3136 + 1) % 100;
											local1017 = Static24.method3703(Static291.method4776(Static152.method2564(Static249.aClass3_Sub26_Sub1_3)));
											if (local205 == 2 || local205 == 3) {
												Static251.method4236("<img=1>" + local747, local1017, "<img=1>" + local141, 0, Static249.method4208(local3143), 9, -1);
											} else if (local205 == 1) {
												Static251.method4236("<img=0>" + local747, local1017, "<img=0>" + local141, 0, Static249.method4208(local3143), 9, -1);
											} else {
												Static251.method4236(local747, local1017, local141, 0, Static249.method4208(local3143), 9, -1);
											}
										}
										Static255.anInt5252 = -1;
										return true;
									} else if (Static255.anInt5252 == 116) {
										local739 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
										local141 = Static249.aClass3_Sub26_Sub1_3.method3931();
										local747 = local141;
										if (local739) {
											local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
										}
										local3143 = Static249.aClass3_Sub26_Sub1_3.method3900();
										local3148 = Static249.aClass3_Sub26_Sub1_3.method3948();
										local5447 = Static249.aClass3_Sub26_Sub1_3.method3899();
										@Pc(5659) long local5659 = local5447 + (local3148 << 32);
										local205 = Static249.aClass3_Sub26_Sub1_3.method3915();
										local963 = Static249.aClass3_Sub26_Sub1_3.method3948();
										@Pc(5669) boolean local5669 = false;
										local1035 = 0;
										while (true) {
											if (local1035 < 100) {
												if (local5659 != Static238.aLongArray10[local1035]) {
													local1035++;
													continue;
												}
												local5669 = true;
												break;
											}
											if (local205 <= 1 && Static288.method4745(local747)) {
												local5669 = true;
											}
											break;
										}
										if (!local5669 && Static293.anInt5842 == 0) {
											Static238.aLongArray10[Static272.anInt3136] = local5659;
											Static272.anInt3136 = (Static272.anInt3136 + 1) % 100;
											@Pc(5723) String local5723 = Static213.method3486(local963).method1585(Static249.aClass3_Sub26_Sub1_3);
											if (local205 == 2) {
												Static251.method4236("<img=1>" + local747, local5723, "<img=1>" + local141, 0, Static249.method4208(local3143), 20, local963);
											} else if (local205 == 1) {
												Static251.method4236("<img=0>" + local747, local5723, "<img=0>" + local141, 0, Static249.method4208(local3143), 20, local963);
											} else {
												Static251.method4236(local747, local5723, local141, 0, Static249.method4208(local3143), 20, local963);
											}
										}
										Static255.anInt5252 = -1;
										return true;
									} else if (Static255.anInt5252 == 42) {
										local389 = Static249.aClass3_Sub26_Sub1_3.method3921();
										local393 = Static249.aClass3_Sub26_Sub1_3.method3915();
										local747 = Static249.aClass3_Sub26_Sub1_3.method3931();
										local151 = Static249.aClass3_Sub26_Sub1_3.method3895();
										if (local151 == 65535) {
											local151 = -1;
										}
										if (local393 >= 1 && local393 <= 8) {
											if (local747.equalsIgnoreCase("null")) {
												local747 = null;
											}
											Static276.aStringArray38[local393 - 1] = local747;
											Static109.anIntArray339[local393 - 1] = local151;
											Static281.aBooleanArray112[local393 - 1] = local389 == 0;
										}
										Static255.anInt5252 = -1;
										return true;
									} else if (Static255.anInt5252 == 230) {
										local389 = Static249.aClass3_Sub26_Sub1_3.method3895();
										Static13.method195(local389);
										Static252.anIntArray545[Static17.anInt330++ & 0x1F] = local389 & 0x7FFF;
										Static255.anInt5252 = -1;
										return true;
									} else {
										Static42.method613("T1 - " + Static255.anInt5252 + "," + Static252.anInt5210 + "," + Static108.anInt2014 + " - " + Static287.anInt5742, null);
										Static5.method101();
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2494(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([BII)I")
	public static int method2495(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static244.method4142(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
	public static void method2496(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static107.aBoolean157) {
			Static107.aBoolean157 = arg0;
			Static149.method2520();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method2497(@OriginalArg(0) Class155 arg0) {
		Static4.aClass155_87 = arg0;
	}
}
