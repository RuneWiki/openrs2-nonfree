import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
	public static final int[] anIntArray193 = new int[13];

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "S")
	public static short aShort36 = 320;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!cn;II)V")
	public static void method2645(@OriginalArg(0) Class23_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class23_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10106;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10106 > local27 + (local29 & 0x1)) {
				@Pc(44) Class23_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method2645(arg0, arg1, local10 - 1);
		method2645(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method2646() {
		if (Static253.anInt4769 > 1) {
			Static253.anInt4769--;
			Static431.anInt7596 = Static373.anInt6615;
		}
		if (Static5.aBoolean10) {
			Static5.aBoolean10 = false;
			Static344.method5200();
			return;
		}
		if (!Static463.aBoolean600) {
			Static551.method7575();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static123.method2197(); local27++) {
		}
		if (Static520.anInt6836 != 10) {
			return;
		}
		@Pc(49) Class3_Sub44 local49;
		@Pc(58) int local58;
		while (Static565.method7218()) {
			local49 = Static275.method5689(Static318.aClass376_82, Static540.aClass282_4);
			local49.aClass3_Sub17_Sub2_3.method4849(0);
			local58 = local49.aClass3_Sub17_Sub2_3.lb;
			Static24.method774(local49.aClass3_Sub17_Sub2_3);
			local49.aClass3_Sub17_Sub2_3.method4873(local49.aClass3_Sub17_Sub2_3.lb - local58);
			Static616.method8089(local49);
		}
		if (Static196.aClass3_Sub55_1 == null) {
			if (Static4.aLong3 <= Static131.method2268()) {
				Static196.aClass3_Sub55_1 = Static227.aClass358_1.method8042(Static605.aClass161_7.aString54);
			}
		} else if (Static196.aClass3_Sub55_1.anInt10339 != -1) {
			local49 = Static275.method5689(Static660.aClass376_148, Static540.aClass282_4);
			local49.aClass3_Sub17_Sub2_3.method4876(Static196.aClass3_Sub55_1.anInt10339);
			Static616.method8089(local49);
			Static196.aClass3_Sub55_1 = null;
			Static4.aLong3 = Static131.method2268() + 30000L;
		}
		@Pc(123) Class3_Sub21 local123 = (Class3_Sub21) Static565.aClass193_55.method4457();
		@Pc(140) int local140;
		@Pc(165) int local165;
		@Pc(232) int local232;
		@Pc(239) int local239;
		@Pc(251) int local251;
		@Pc(138) Class3_Sub44 local138;
		if (local123 != null || Static24.aLong8 < Static131.method2268() - 2000L) {
			local138 = null;
			local140 = 0;
			for (@Pc(145) Class3_Sub21 local145 = (Class3_Sub21) Static624.aClass193_66.method4457(); local145 != null && (local138 == null || local138.aClass3_Sub17_Sub2_3.lb - local140 < 240); local145 = (Class3_Sub21) Static624.aClass193_66.method4459()) {
				local145.method8770();
				local165 = local145.method7981();
				if (local165 < -1) {
					local165 = -1;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				@Pc(184) int local184 = local145.method7977();
				if (local184 < -1) {
					local184 = -1;
				} else if (local184 > 65534) {
					local184 = 65534;
				}
				if (local184 != Static552.anInt8939 || Static259.anInt4869 != local165) {
					if (local138 == null) {
						local138 = Static275.method5689(Static349.aClass376_91, Static540.aClass282_4);
						local138.aClass3_Sub17_Sub2_3.method4849(0);
						local140 = local138.aClass3_Sub17_Sub2_3.lb;
					}
					local232 = local184 - Static552.anInt8939;
					Static552.anInt8939 = local184;
					local239 = local165 - Static259.anInt4869;
					Static259.anInt4869 = local165;
					local251 = (int) ((local145.method7979() - Static24.aLong8) / 20L);
					if (local251 < 8 && local232 >= -32 && local232 <= 31 && local239 >= -32 && local239 <= 31) {
						local239 += 32;
						local232 += 32;
						local138.aClass3_Sub17_Sub2_3.method4876((local251 << 12) + (local232 << 6) + local239);
					} else if (local251 < 32 && local232 >= -128 && local232 <= 127 && local239 >= -128 && local239 <= 127) {
						local239 += 128;
						local138.aClass3_Sub17_Sub2_3.method4849(local251 + 128);
						local232 += 128;
						local138.aClass3_Sub17_Sub2_3.method4876(local239 + (local232 << 8));
					} else if (local251 < 32) {
						local138.aClass3_Sub17_Sub2_3.method4849(local251 + 192);
						if (local184 == 1 || local165 == -1) {
							local138.aClass3_Sub17_Sub2_3.method4854(Integer.MIN_VALUE);
						} else {
							local138.aClass3_Sub17_Sub2_3.method4854(local184 | local165 << 16);
						}
					} else {
						local138.aClass3_Sub17_Sub2_3.method4876(local251 + 57344);
						if (local184 == 1 || local165 == -1) {
							local138.aClass3_Sub17_Sub2_3.method4854(Integer.MIN_VALUE);
						} else {
							local138.aClass3_Sub17_Sub2_3.method4854(local184 | local165 << 16);
						}
					}
					Static24.aLong8 = local145.method7979();
				}
			}
			if (local138 != null) {
				local138.aClass3_Sub17_Sub2_3.method4873(local138.aClass3_Sub17_Sub2_3.lb - local140);
				Static616.method8089(local138);
			}
		}
		@Pc(449) int local449;
		if (local123 != null) {
			@Pc(433) long local433 = (local123.method7979() - Static70.aLong41) / 50L;
			if (local433 > 32767L) {
				local433 = 32767L;
			}
			Static70.aLong41 = local123.method7979();
			local449 = local123.method7981();
			if (local449 < 0) {
				local449 = 0;
			} else if (local449 > 65535) {
				local449 = 65535;
			}
			local165 = local123.method7977();
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 65535) {
				local165 = 65535;
			}
			@Pc(482) byte local482 = 0;
			if (local123.method7983() == 2) {
				local482 = 1;
			}
			local232 = (int) local433;
			@Pc(503) Class3_Sub44 local503 = Static275.method5689(Static641.aClass376_143, Static540.aClass282_4);
			local503.aClass3_Sub17_Sub2_3.method4840(local482 << 15 | local232);
			local503.aClass3_Sub17_Sub2_3.method4854(local449 << 16 | local165);
			Static616.method8089(local503);
		}
		@Pc(562) long local562;
		if (Static406.anInt6932 > 0) {
			local138 = Static275.method5689(Static586.aClass376_134, Static540.aClass282_4);
			local138.aClass3_Sub17_Sub2_3.method4849(Static406.anInt6932 * 3);
			for (local140 = 0; local140 < Static406.anInt6932; local140++) {
				@Pc(553) Interface18 local553 = Static85.anInterface18Array2[local140];
				local562 = (local553.method5672() - Static367.aLong172) / 50L;
				Static367.aLong172 = local553.method5672();
				if (local562 > 65535L) {
					local562 = 65535L;
				}
				local138.aClass3_Sub17_Sub2_3.method4849(local553.method5673());
				local138.aClass3_Sub17_Sub2_3.method4876((int) local562);
			}
			Static616.method8089(local138);
		}
		if (Static508.anInt8496 > 0) {
			Static508.anInt8496--;
		}
		if (Static226.aBoolean494 && Static508.anInt8496 <= 0) {
			Static226.aBoolean494 = false;
			Static508.anInt8496 = 20;
			local138 = Static275.method5689(Static1.aClass376_142, Static540.aClass282_4);
			local138.aClass3_Sub17_Sub2_3.method4840((int) Static461.aFloat178 >> 3);
			local138.aClass3_Sub17_Sub2_3.method4885((int) Static204.aFloat82 >> 3);
			Static616.method8089(local138);
		}
		if (Static474.aBoolean613 != Static157.aBoolean232) {
			Static157.aBoolean232 = Static474.aBoolean613;
			local138 = Static275.method5689(Static545.aClass376_127, Static540.aClass282_4);
			local138.aClass3_Sub17_Sub2_3.method4849(Static474.aBoolean613 ? 1 : 0);
			Static616.method8089(local138);
		}
		if (!Static411.aBoolean527) {
			local138 = Static275.method5689(Static357.aClass376_130, Static540.aClass282_4);
			local138.aClass3_Sub17_Sub2_3.method4849(0);
			local140 = local138.aClass3_Sub17_Sub2_3.lb;
			@Pc(696) Class3_Sub17 local696 = Static227.aClass3_Sub15_11.method2435();
			local138.aClass3_Sub17_Sub2_3.method4838(0, local696.lb, local696.aByteArray59);
			local138.aClass3_Sub17_Sub2_3.method4873(local138.aClass3_Sub17_Sub2_3.lb - local140);
			Static616.method8089(local138);
			Static411.aBoolean527 = true;
		}
		if (Static332.aClass247ArrayArrayArray1 != null) {
			if (Static378.anInt6662 == 2) {
				Static309.method4749();
			} else if (Static378.anInt6662 == 3) {
				Static25.method793();
			}
		}
		if (Static15.aBoolean18) {
			Static15.aBoolean18 = false;
		} else {
			Static112.aFloat74 /= 2.0F;
		}
		if (Static44.aBoolean106) {
			Static44.aBoolean106 = false;
		} else {
			Static554.aFloat185 /= 2.0F;
		}
		Static518.method7341();
		if (Static520.anInt6836 != 10) {
			return;
		}
		Static581.method7831();
		Static640.method8401();
		Static157.method2717();
		Static253.anInt4788++;
		if (Static253.anInt4788 > 750) {
			Static344.method5200();
			return;
		}
		Static654.method8557();
		Static424.method6044();
		Static5.method51();
		for (local58 = Static592.aClass47_2.method1436(true); local58 != -1; local58 = Static592.aClass47_2.method1436(false)) {
			Static129.method2251(local58);
			Static126.anIntArray160[Static166.anInt3025++ & 0x1F] = local58;
		}
		@Pc(891) Class208 local891;
		for (@Pc(815) Class3_Sub6_Sub7 local815 = Static391.method5677(); local815 != null; local815 = Static391.method5677()) {
			local449 = local815.method1710();
			local562 = local815.method1703();
			if (local449 == 1) {
				Static79.anIntArray121[(int) local562] = local815.anInt1790;
				Static538.aBoolean660 |= Static440.aBooleanArray22[(int) local562];
				Static287.anIntArray345[Static331.anInt9794++ & 0x1F] = (int) local562;
			} else if (local449 == 2) {
				Static657.aStringArray76[(int) local562] = local815.aString19;
				Static646.anIntArray641[Static506.anInt8470++ & 0x1F] = (int) local562;
			} else if (local449 == 3) {
				local891 = Static676.method8728((int) local562);
				if (!local815.aString19.equals(local891.aString69)) {
					local891.aString69 = local815.aString19;
					Static374.method5525(local891);
				}
			} else {
				@Pc(900) int local900;
				if (local449 == 4) {
					local891 = Static676.method8728((int) local562);
					local239 = local815.anInt1790;
					local251 = local815.anInt1782;
					local900 = local815.anInt1789;
					if (local239 != local891.anInt5599 || local251 != local891.anInt5636 || local900 != local891.anInt5603) {
						local891.anInt5599 = local239;
						local891.anInt5603 = local900;
						local891.anInt5636 = local251;
						Static374.method5525(local891);
					}
				} else if (local449 == 5) {
					local891 = Static676.method8728((int) local562);
					if (local815.anInt1790 != local891.anInt5596 || local815.anInt1790 == -1) {
						local891.anInt5596 = local815.anInt1790;
						local891.anInt5591 = 1;
						local891.anInt5655 = 0;
						local891.anInt5656 = 0;
						@Pc(975) Class48 local975 = local891.anInt5596 == -1 ? null : Static483.aClass373_2.method8323(local891.anInt5596);
						if (local975 != null) {
							Static4.method46(local975, local891.anInt5656);
						}
						Static374.method5525(local891);
					}
				} else if (local449 == 6) {
					local232 = local815.anInt1790;
					local239 = local232 >> 10 & 0x1F;
					local251 = local232 >> 5 & 0x1F;
					local900 = local232 & 0x1F;
					@Pc(1413) int local1413 = (local239 << 19) + (local251 << 11) + (local900 << 3);
					@Pc(1418) Class208 local1418 = Static676.method8728((int) local562);
					if (local1418.anInt5600 != local1413) {
						local1418.anInt5600 = local1413;
						Static374.method5525(local1418);
					}
				} else if (local449 == 7) {
					local891 = Static676.method8728((int) local562);
					@Pc(1010) boolean local1010 = local815.anInt1790 == 1;
					if (local891.aBoolean445 != local1010) {
						local891.aBoolean445 = local1010;
						Static374.method5525(local891);
					}
				} else if (local449 == 8) {
					local891 = Static676.method8728((int) local562);
					if (local891.anInt5614 != local815.anInt1790 || local891.anInt5679 != local815.anInt1782 || local891.anInt5678 != local815.anInt1789) {
						local891.anInt5678 = local815.anInt1789;
						local891.anInt5614 = local815.anInt1790;
						local891.anInt5679 = local815.anInt1782;
						if (local891.anInt5645 != -1) {
							if (local891.anInt5660 > 0) {
								local891.anInt5678 = local891.anInt5678 * 32 / local891.anInt5660;
							} else if (local891.anInt5657 > 0) {
								local891.anInt5678 = local891.anInt5678 * 32 / local891.anInt5657;
							}
						}
						Static374.method5525(local891);
					}
				} else if (local449 == 9) {
					local891 = Static676.method8728((int) local562);
					if (local815.anInt1790 != local891.anInt5645 || local815.anInt1782 != local891.anInt5605) {
						local891.anInt5645 = local815.anInt1790;
						local891.anInt5605 = local815.anInt1782;
						Static374.method5525(local891);
					}
				} else if (local449 == 10) {
					local891 = Static676.method8728((int) local562);
					if (local815.anInt1790 != local891.anInt5628 || local891.anInt5624 != local815.anInt1782 || local891.anInt5672 != local815.anInt1789) {
						local891.anInt5672 = local815.anInt1789;
						local891.anInt5628 = local815.anInt1790;
						local891.anInt5624 = local815.anInt1782;
						Static374.method5525(local891);
					}
				} else if (local449 == 11) {
					local891 = Static676.method8728((int) local562);
					local891.anInt5592 = local891.anInt5601 = local815.anInt1790;
					local891.aByte84 = 0;
					local891.anInt5680 = local891.anInt5589 = local815.anInt1782;
					local891.aByte82 = 0;
					Static374.method5525(local891);
				} else if (local449 == 12) {
					local891 = Static676.method8728((int) local562);
					local239 = local815.anInt1790;
					if (local891 != null && local891.anInt5643 == 0) {
						if (local891.anInt5649 - local891.anInt5630 < local239) {
							local239 = local891.anInt5649 - local891.anInt5630;
						}
						if (local239 < 0) {
							local239 = 0;
						}
						if (local891.anInt5648 != local239) {
							local891.anInt5648 = local239;
							Static374.method5525(local891);
						}
					}
				} else if (local449 == 14) {
					local891 = Static676.method8728((int) local562);
					local891.anInt5620 = local815.anInt1790;
				} else if (local449 == 15) {
					Static301.aBoolean425 = true;
					Static75.anInt1704 = local815.anInt1790;
					Static217.anInt4007 = local815.anInt1782;
				} else if (local449 == 16) {
					local891 = Static676.method8728((int) local562);
					local891.anInt5641 = local815.anInt1790;
				} else if (local449 == 17) {
					local891 = Static676.method8728((int) local562);
					local891.anInt5625 = local815.anInt1790;
				} else if (local449 == 18) {
					local891 = Static676.method8728((int) local562);
					local239 = (int) (local562 >> 32);
					local891.method4717(local239, (short) local815.anInt1790, (short) local815.anInt1782);
				} else if (local449 == 19) {
					local891 = Static676.method8728((int) local562);
					local239 = (int) (local562 >> 32);
					local891.method4712((short) local815.anInt1782, (short) local815.anInt1790, local239);
				}
			}
		}
		if (Static405.anInt6914 != 0) {
			Static426.anInt7218 += 20;
			if (Static426.anInt7218 >= 400) {
				Static405.anInt6914 = 0;
			}
		}
		Static527.anInt8716++;
		if (Static261.aClass208_4 != null) {
			Static291.anInt5385++;
			if (Static291.anInt5385 >= 15) {
				Static374.method5525(Static261.aClass208_4);
				Static261.aClass208_4 = null;
			}
		}
		Static303.aBoolean731 = false;
		Static363.aBoolean495 = false;
		Static267.aClass208_5 = null;
		Static647.aClass208_13 = null;
		Static250.method3961(-1, (Class208) null, -1);
		Static488.method7009(-1, (Class208) null, -1);
		if (!Static329.aBoolean166) {
			Static267.anInt5035 = -1;
		}
		Static110.method2095();
		Static373.anInt6615++;
		if (Static321.aBoolean465) {
			@Pc(1533) Class3_Sub44 local1533 = Static275.method5689(Static126.aClass376_38, Static540.aClass282_4);
			local1533.aClass3_Sub17_Sub2_3.method4887(Static638.anInt9839 << 28 | Static435.anInt7628 << 14 | Static36.anInt10061);
			Static616.method8089(local1533);
			Static321.aBoolean465 = false;
		}
		while (true) {
			@Pc(1561) Class208 local1561;
			@Pc(1556) Class3_Sub13 local1556;
			do {
				local1556 = (Class3_Sub13) Static68.aClass193_9.method4452();
				if (local1556 == null) {
					while (true) {
						do {
							local1556 = (Class3_Sub13) Static459.aClass193_47.method4452();
							if (local1556 == null) {
								while (true) {
									do {
										local1556 = (Class3_Sub13) Static257.aClass193_27.method4452();
										if (local1556 == null) {
											if (Static647.aClass208_13 == null) {
												Static523.anInt5720 = 0;
											}
											if (Static503.aClass208_9 != null) {
												Static642.method8429();
											}
											if (Static13.anInt164 > 0 && Static530.aClass284_1.method7637(82) && Static530.aClass284_1.method7637(81) && Static480.anInt8123 != 0) {
												local165 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 - Static480.anInt8123;
												if (local165 < 0) {
													local165 = 0;
												} else if (local165 > 3) {
													local165 = 3;
												}
												Static106.method2058(Static417.anInt7047 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0], local165, Static347.anInt7851 + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0]);
											}
											Static624.method8252();
											for (local165 = 0; local165 < 5; local165++) {
												@Pc(1763) int local1763 = Static13.anIntArray7[local165]++;
											}
											if (Static538.aBoolean660 && Static491.aLong294 < Static131.method2268() - 60000L) {
												Static540.method6275();
											}
											for (@Pc(1786) Class23_Sub1_Sub1 local1786 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2444(); local1786 != null; local1786 = (Class23_Sub1_Sub1) Static190.aClass105_6.method2448()) {
												if ((long) local1786.anInt754 < Static131.method2268() / 1000L - 5L) {
													if (local1786.aShort5 > 0) {
														Static310.method4784(5, local1786.aString7 + Static569.aClass335_20.method7694(Static319.anInt5939), "", "", 0, "");
													}
													if (local1786.aShort5 == 0) {
														Static310.method4784(5, local1786.aString7 + Static569.aClass335_21.method7694(Static319.anInt5939), "", "", 0, "");
													}
													local1786.method8588();
												}
											}
											Static299.anInt5485++;
											if (Static299.anInt5485 > 500) {
												Static299.anInt5485 = 0;
												local232 = (int) (Math.random() * 8.0D);
												if ((local232 & 0x2) == 2) {
													Static282.anInt5266 += Static366.anInt6486;
												}
												if ((local232 & 0x1) == 1) {
													Static422.anInt7131 += Static369.anInt1974;
												}
												if ((local232 & 0x4) == 4) {
													Static550.anInt8913 += Static109.anInt2252;
												}
											}
											if (Static422.anInt7131 < -50) {
												Static369.anInt1974 = 2;
											}
											if (Static422.anInt7131 > 50) {
												Static369.anInt1974 = -2;
											}
											if (Static282.anInt5266 < -55) {
												Static366.anInt6486 = 2;
											}
											if (Static550.anInt8913 < -40) {
												Static109.anInt2252 = 1;
											}
											if (Static282.anInt5266 > 55) {
												Static366.anInt6486 = -2;
											}
											if (Static550.anInt8913 > 40) {
												Static109.anInt2252 = -1;
											}
											Static659.anInt10089++;
											if (Static659.anInt10089 > 500) {
												Static659.anInt10089 = 0;
												local232 = (int) (Math.random() * 8.0D);
												if ((local232 & 0x1) == 1) {
													Static56.anInt1426 += Static376.anInt6646;
												}
												if ((local232 & 0x2) == 2) {
													Static433.anInt7606 += Static564.anInt9878;
												}
											}
											if (Static56.anInt1426 < -60) {
												Static376.anInt6646 = 2;
											}
											if (Static56.anInt1426 > 60) {
												Static376.anInt6646 = -2;
											}
											if (Static433.anInt7606 < -20) {
												Static564.anInt9878 = 1;
											}
											Static607.anInt9516++;
											if (Static433.anInt7606 > 10) {
												Static564.anInt9878 = -1;
											}
											if (Static607.anInt9516 > 50) {
												@Pc(2004) Class3_Sub44 local2004 = Static275.method5689(Static63.aClass376_116, Static540.aClass282_4);
												Static616.method8089(local2004);
											}
											if (Static321.aBoolean467) {
												Static299.method4635();
												Static321.aBoolean467 = false;
											}
											try {
												Static73.method1618();
												return;
											} catch (@Pc(2017) IOException local2017) {
												Static344.method5200();
												return;
											}
										}
										local1561 = local1556.aClass208_2;
										if (local1561.anInt5608 < 0) {
											break;
										}
										local891 = Static676.method8728(local1561.anInt5634);
									} while (local891 == null || local891.aClass208Array20 == null || local891.aClass208Array20.length <= local1561.anInt5608 || local1561 != local891.aClass208Array20[local1561.anInt5608]);
									Static543.method7498(local1556);
								}
							}
							local1561 = local1556.aClass208_2;
							if (local1561.anInt5608 < 0) {
								break;
							}
							local891 = Static676.method8728(local1561.anInt5634);
						} while (local891 == null || local891.aClass208Array20 == null || local891.aClass208Array20.length <= local1561.anInt5608 || local1561 != local891.aClass208Array20[local1561.anInt5608]);
						Static543.method7498(local1556);
					}
				}
				local1561 = local1556.aClass208_2;
				if (local1561.anInt5608 < 0) {
					break;
				}
				local891 = Static676.method8728(local1561.anInt5634);
			} while (local891 == null || local891.aClass208Array20 == null || local1561.anInt5608 >= local891.aClass208Array20.length || local1561 != local891.aClass208Array20[local1561.anInt5608]);
			Static543.method7498(local1556);
		}
	}
}
