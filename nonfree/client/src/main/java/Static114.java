import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1009 = Static120.method1824("rot:");

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1011 = Static120.method1824("Connection lost)3");

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1010 = aClass80_1011;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!rh;)V")
	public static void method1766(@OriginalArg(1) Class82[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static18.aByteArrayArrayArray1[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static18.aByteArrayArrayArray1[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method2512(local11, local15);
						}
					}
				}
			}
		}
		Static172.anInt3857 += (int) (Math.random() * 5.0D) - 2;
		if (Static172.anInt3857 < -8) {
			Static172.anInt3857 = -8;
		}
		if (Static172.anInt3857 > 8) {
			Static172.anInt3857 = 8;
		}
		local11 = Static172.anInt3857 >> 2 << 10;
		Static31.anInt745 += (int) (Math.random() * 5.0D) - 2;
		@Pc(105) int[][] local105 = new int[104][104];
		if (Static31.anInt745 < -16) {
			Static31.anInt745 = -16;
		}
		@Pc(116) int[][] local116 = new int[104][104];
		if (Static31.anInt745 > 16) {
			Static31.anInt745 = 16;
		}
		local15 = Static31.anInt745 >> 1;
		@Pc(147) int local147;
		@Pc(155) int local155;
		@Pc(157) int local157;
		@Pc(161) int local161;
		@Pc(251) int local251;
		@Pc(186) int local186;
		@Pc(206) int local206;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(235) int local235;
		@Pc(231) int local231;
		@Pc(300) int local300;
		@Pc(513) int local513;
		@Pc(552) int local552;
		@Pc(803) int local803;
		for (@Pc(135) int local135 = 0; local135 < 4; local135++) {
			@Pc(143) byte[][] local143 = Static126.aByteArrayArrayArray5[local135];
			local147 = (int) Math.sqrt(5100.0D);
			local155 = local147 * 768 >> 8;
			for (local157 = 1; local157 < 103; local157++) {
				for (local161 = 1; local161 < 103; local161++) {
					local186 = Static42.anIntArrayArrayArray1[local135][local161 + 1][local157] - Static42.anIntArrayArrayArray1[local135][local161 - 1][local157];
					local206 = Static42.anIntArrayArrayArray1[local135][local161][local157 + 1] - Static42.anIntArrayArrayArray1[local135][local161][local157 - 1];
					local219 = (int) Math.sqrt((double) (local186 * local186 + local206 * local206 + 65536));
					local225 = (local186 << 8) / local219;
					local231 = (local206 << 8) / local219;
					local235 = -65536 / local219;
					local251 = (local235 * -10 + local225 * -50 + local231 * -50) / local155 + 74;
					local300 = (local143[local161][local157] >> 1) + (local143[local161][local157 - 1] >> 2) + (local143[local161 - -1][local157] >> 3) + (local143[local161 + -1][local157] >> 2) + (local143[local161][local157 + 1] >> 3);
					local116[local161][local157] = local251 - local300;
				}
			}
			for (local161 = 0; local161 < 104; local161++) {
				Static51.anIntArray158[local161] = 0;
				Static140.anIntArray389[local161] = 0;
				Static193.anIntArray517[local161] = 0;
				Static172.anIntArray466[local161] = 0;
				Static152.anIntArray432[local161] = 0;
			}
			for (local251 = -5; local251 < 104; local251++) {
				for (local186 = 0; local186 < 104; local186++) {
					local206 = local251 + 5;
					@Pc(417) int local417;
					if (local206 < 104) {
						local219 = Static185.aByteArrayArrayArray7[local135][local206][local186] & 0xFF;
						if (local219 > 0) {
							@Pc(381) Class3_Sub1_Sub18 local381 = Static54.method802(local219 - 1);
							Static51.anIntArray158[local186] += local381.anInt4244;
							Static140.anIntArray389[local186] += local381.anInt4247;
							Static193.anIntArray517[local186] += local381.anInt4246;
							Static172.anIntArray466[local186] += local381.anInt4238;
							local417 = Static152.anIntArray432[local186]++;
						}
					}
					local219 = local251 - 5;
					if (local219 >= 0) {
						local225 = Static185.aByteArrayArrayArray7[local135][local219][local186] & 0xFF;
						if (local225 > 0) {
							@Pc(450) Class3_Sub1_Sub18 local450 = Static54.method802(local225 - 1);
							Static51.anIntArray158[local186] -= local450.anInt4244;
							Static140.anIntArray389[local186] -= local450.anInt4247;
							Static193.anIntArray517[local186] -= local450.anInt4246;
							Static172.anIntArray466[local186] -= local450.anInt4238;
							local417 = Static152.anIntArray432[local186]--;
						}
					}
				}
				if (local251 >= 0) {
					local206 = 0;
					local219 = 0;
					local235 = 0;
					local225 = 0;
					local231 = 0;
					for (local300 = -5; local300 < 104; local300++) {
						local513 = local300 + 5;
						if (local513 < 104) {
							local219 += Static140.anIntArray389[local513];
							local206 += Static51.anIntArray158[local513];
							local231 += Static152.anIntArray432[local513];
							local225 += Static193.anIntArray517[local513];
							local235 += Static172.anIntArray466[local513];
						}
						local552 = local300 - 5;
						if (local552 >= 0) {
							local225 -= Static193.anIntArray517[local552];
							local206 -= Static51.anIntArray158[local552];
							local219 -= Static140.anIntArray389[local552];
							local235 -= Static172.anIntArray466[local552];
							local231 -= Static152.anIntArray432[local552];
						}
						if (local300 >= 0 && local231 > 0) {
							local105[local251][local300] = Static173.method2787(local225 / local231, local206 * 256 / local235, local219 / local231);
						}
					}
				}
			}
			for (local186 = 1; local186 < 103; local186++) {
				for (local206 = 1; local206 < 103; local206++) {
					if (!Static96.aBoolean83 || (Static18.aByteArrayArrayArray1[0][local186][local206] & 0x2) != 0 || (Static18.aByteArrayArrayArray1[local135][local186][local206] & 0x10) == 0 && Static135.method2054(local206, local135, local186) == Static181.anInt4055) {
						if (Static13.anInt315 > local135) {
							Static13.anInt315 = local135;
						}
						local225 = Static41.aByteArrayArrayArray3[local135][local186][local206] & 0xFF;
						local219 = Static185.aByteArrayArrayArray7[local135][local186][local206] & 0xFF;
						if (local219 > 0 || local225 > 0) {
							local235 = Static42.anIntArrayArrayArray1[local135][local186][local206];
							local300 = Static42.anIntArrayArrayArray1[local135][local186 + 1][local206 + 1];
							local513 = Static42.anIntArrayArrayArray1[local135][local186][local206 + 1];
							local231 = Static42.anIntArrayArrayArray1[local135][local186 + 1][local206];
							if (local135 > 0) {
								@Pc(735) boolean local735 = true;
								if (local219 == 0 && Static20.aByteArrayArrayArray2[local135][local186][local206] != 0) {
									local735 = false;
								}
								if (local225 > 0 && !Static96.method1446(local225 - 1).aBoolean31) {
									local735 = false;
								}
								if (local735 && local235 == local231 && local235 == local300 && local235 == local513) {
									Static72.anIntArrayArrayArray10[local135][local186][local206] |= 0x924;
								}
							}
							@Pc(819) int local819;
							@Pc(843) int local843;
							if (local219 <= 0) {
								local803 = 0;
								local552 = -1;
							} else {
								local552 = local105[local186][local206];
								local819 = local15 + (local552 & 0x7F);
								if (local819 < 0) {
									local819 = 0;
								} else if (local819 > 127) {
									local819 = 127;
								}
								local843 = (local552 & 0x380) + ((local552 + local11 & 0xFC00) + local819);
								local803 = Static65.anIntArray186[Static6.method148(local843, 96)];
							}
							local843 = local116[local186 + 1][local206];
							local819 = local116[local186][local206];
							@Pc(874) int local874 = local116[local186 + 1][local206 + 1];
							@Pc(882) int local882 = local116[local186][local206 + 1];
							if (local225 == 0) {
								Static181.method2903(local135, local186, local206, 0, 0, -1, local235, local231, local300, local513, Static6.method148(local552, local819), Static6.method148(local552, local843), Static6.method148(local552, local874), Static6.method148(local552, local882), 0, 0, 0, 0, local803, 0);
							} else {
								@Pc(929) int local929 = Static20.aByteArrayArrayArray2[local135][local186][local206] + 1;
								@Pc(937) byte local937 = Static113.aByteArrayArrayArray4[local135][local186][local206];
								@Pc(943) Class3_Sub1_Sub3 local943 = Static96.method1446(local225 - 1);
								@Pc(946) int local946 = local943.anInt535;
								if (local946 >= 0 && !Static65.anInterface1_2.method2651(local946)) {
									local946 = -1;
								}
								@Pc(964) int local964;
								@Pc(978) int local978;
								@Pc(1000) int local1000;
								@Pc(1024) int local1024;
								if (local946 >= 0) {
									local964 = -1;
									local978 = Static65.anIntArray186[Static4.method126(Static65.anInterface1_2.method2650(local946), 96)];
								} else if (local943.anInt534 == -1) {
									local978 = 0;
									local964 = -2;
								} else {
									local964 = local943.anInt534;
									local1000 = (local964 & 0x7F) + local15;
									if (local1000 < 0) {
										local1000 = 0;
									} else if (local1000 > 127) {
										local1000 = 127;
									}
									local1024 = (local964 & 0x380) + (local11 + local964 & 0xFC00) + local1000;
									local978 = Static65.anIntArray186[Static4.method126(local1024, 96)];
								}
								if (local943.anInt536 >= 0) {
									local1000 = local943.anInt536;
									local1024 = (local1000 & 0x7F) + local15;
									if (local1024 < 0) {
										local1024 = 0;
									} else if (local1024 > 127) {
										local1024 = 127;
									}
									@Pc(1067) int local1067 = local1024 + (local1000 & 0x380) + (local11 + local1000 & 0xFC00);
									local978 = Static65.anIntArray186[Static4.method126(local1067, 96)];
								}
								Static181.method2903(local135, local186, local206, local929, local937, local946, local235, local231, local300, local513, Static6.method148(local552, local819), Static6.method148(local552, local843), Static6.method148(local552, local874), Static6.method148(local552, local882), Static4.method126(local964, local819), Static4.method126(local964, local843), Static4.method126(local964, local874), Static4.method126(local964, local882), local803, local978);
							}
						}
					}
				}
			}
			for (local206 = 1; local206 < 103; local206++) {
				for (local219 = 1; local219 < 103; local219++) {
					Static128.method1941(local135, local219, local206, Static135.method2054(local206, local135, local219));
				}
			}
			Static185.aByteArrayArrayArray7[local135] = null;
			Static41.aByteArrayArrayArray3[local135] = null;
			Static20.aByteArrayArrayArray2[local135] = null;
			Static113.aByteArrayArrayArray4[local135] = null;
			Static126.aByteArrayArrayArray5[local135] = null;
		}
		Static51.method765();
		@Pc(1196) int local1196;
		for (@Pc(1192) int local1192 = 0; local1192 < 104; local1192++) {
			for (local1196 = 0; local1196 < 104; local1196++) {
				if ((Static18.aByteArrayArrayArray1[1][local1192][local1196] & 0x2) == 2) {
					Static159.method2541(local1192, local1196);
				}
			}
		}
		local1196 = 1;
		@Pc(1228) int local1228 = 2;
		local147 = 4;
		for (local155 = 0; local155 < 4; local155++) {
			if (local155 > 0) {
				local147 <<= 0x3;
				local1228 <<= 0x3;
				local1196 <<= 0x3;
			}
			for (local157 = 0; local157 <= local155; local157++) {
				for (local161 = 0; local161 <= 104; local161++) {
					for (local251 = 0; local251 <= 104; local251++) {
						if ((local1196 & Static72.anIntArrayArrayArray10[local157][local251][local161]) != 0) {
							for (local186 = local161; local186 > 0 && (Static72.anIntArrayArrayArray10[local157][local251][local186 - 1] & local1196) != 0; local186--) {
							}
							for (local206 = local161; local206 < 104 && (Static72.anIntArrayArrayArray10[local157][local251][local206 + 1] & local1196) != 0; local206++) {
							}
							local219 = local157;
							local225 = local157;
							label350: while (local219 > 0) {
								for (local235 = local186; local235 <= local206; local235++) {
									if ((Static72.anIntArrayArrayArray10[local219 - 1][local251][local235] & local1196) == 0) {
										break label350;
									}
								}
								local219--;
							}
							label339: while (local155 > local225) {
								for (local235 = local186; local235 <= local206; local235++) {
									if ((local1196 & Static72.anIntArrayArrayArray10[local225 + 1][local251][local235]) == 0) {
										break label339;
									}
								}
								local225++;
							}
							local235 = (local225 + 1 - local219) * (local206 + 1 - local186);
							if (local235 >= 8) {
								local300 = Static42.anIntArrayArrayArray1[local225][local251][local186] - 240;
								local513 = Static42.anIntArrayArrayArray1[local219][local251][local186];
								Static53.method793(local155, 1, local251 * 128, local251 * 128, local186 * 128, local206 * 128 + 128, local300, local513);
								for (local552 = local219; local552 <= local225; local552++) {
									for (local803 = local186; local803 <= local206; local803++) {
										Static72.anIntArrayArrayArray10[local552][local251][local803] &= ~local1196;
									}
								}
							}
						}
						if ((Static72.anIntArrayArrayArray10[local157][local251][local161] & local1228) != 0) {
							local186 = local251;
							local206 = local251;
							while (local186 > 0 && (Static72.anIntArrayArrayArray10[local157][local186 - 1][local161] & local1228) != 0) {
								local186--;
							}
							local219 = local157;
							while (local206 < 104 && (local1228 & Static72.anIntArrayArrayArray10[local157][local206 + 1][local161]) != 0) {
								local206++;
							}
							local225 = local157;
							label405: while (local219 > 0) {
								for (local235 = local186; local235 <= local206; local235++) {
									if ((Static72.anIntArrayArrayArray10[local219 - 1][local235][local161] & local1228) == 0) {
										break label405;
									}
								}
								local219--;
							}
							label394: while (local155 > local225) {
								for (local235 = local186; local235 <= local206; local235++) {
									if ((Static72.anIntArrayArrayArray10[local225 + 1][local235][local161] & local1228) == 0) {
										break label394;
									}
								}
								local225++;
							}
							local235 = (local206 + 1 - local186) * (local225 + 1 - local219);
							if (local235 >= 8) {
								local513 = Static42.anIntArrayArrayArray1[local219][local186][local161];
								local300 = Static42.anIntArrayArrayArray1[local225][local186][local161] - 240;
								Static53.method793(local155, 2, local186 * 128, local206 * 128 + 128, local161 * 128, local161 * 128, local300, local513);
								for (local552 = local219; local552 <= local225; local552++) {
									for (local803 = local186; local803 <= local206; local803++) {
										Static72.anIntArrayArrayArray10[local552][local803][local161] &= ~local1228;
									}
								}
							}
						}
						if ((local147 & Static72.anIntArrayArrayArray10[local157][local251][local161]) != 0) {
							local186 = local251;
							local206 = local251;
							for (local219 = local161; local219 > 0 && (local147 & Static72.anIntArrayArrayArray10[local157][local251][local219 - 1]) != 0; local219--) {
							}
							for (local225 = local161; local225 < 104 && (local147 & Static72.anIntArrayArrayArray10[local157][local251][local225 + 1]) != 0; local225++) {
							}
							label460: while (local186 > 0) {
								for (local235 = local219; local235 <= local225; local235++) {
									if ((Static72.anIntArrayArrayArray10[local157][local186 - 1][local235] & local147) == 0) {
										break label460;
									}
								}
								local186--;
							}
							label449: while (local206 < 104) {
								for (local235 = local219; local235 <= local225; local235++) {
									if ((local147 & Static72.anIntArrayArrayArray10[local157][local206 + 1][local235]) == 0) {
										break label449;
									}
								}
								local206++;
							}
							if ((local206 + 1 - local186) * (-local219 + 1 + local225) >= 4) {
								local235 = Static42.anIntArrayArrayArray1[local157][local186][local219];
								Static53.method793(local155, 4, local186 * 128, local206 * 128 + 128, local219 * 128, local225 * 128 + 128, local235, local235);
								for (local231 = local186; local231 <= local206; local231++) {
									for (local300 = local219; local300 <= local225; local300++) {
										Static72.anIntArrayArrayArray10[local157][local231][local300] &= ~local147;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!rd;Lclient!mb;I)I")
	public static int method1767(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		@Pc(11) int local11 = arg1.anInt2923;
		arg1.method2099(arg0.anInt3421);
		arg1.anInt2923 += Static22.aClass19_1.method517(arg1.anInt2923, arg0.aByteArray43, arg0.anInt3421, arg1.aByteArray40, 0);
		return arg1.anInt2923 - local11;
	}
}
