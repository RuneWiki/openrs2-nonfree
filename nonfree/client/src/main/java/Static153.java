import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gba", name = "P", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IJ)V")
	public static void method2904(@OriginalArg(1) long arg0) {
		@Pc(6) Class6_Sub31 local6 = Static313.method4898();
		local6.aClass6_Sub21_Sub2_2.method6062(Static530.aClass46_8.anInt1234);
		local6.aClass6_Sub21_Sub2_2.method6019(arg0);
		local6.aClass6_Sub21_Sub2_2.method6062(Static25.anInt769);
		Static534.method7251(local6);
		Static238.anInt7765 = 0;
		Static573.anInt9416 = 1;
		Static119.anInt2844 = -3;
		Static309.anInt5671 = 0;
	}

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)Z")
	public static boolean method2906() throws IOException {
		if (Static563.aClass127_2 == null) {
			return false;
		}
		@Pc(77) int local77;
		if (Static385.aClass73_128 == null) {
			if (Static187.aBoolean266) {
				if (!Static563.aClass127_2.method6308(1)) {
					return false;
				}
				Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				Static564.anInt9280++;
				Static530.anInt8824 = 0;
				Static187.aBoolean266 = false;
			}
			Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
			if (Static282.aClass6_Sub21_Sub2_1.method6086()) {
				if (!Static563.aClass127_2.method6308(1)) {
					return false;
				}
				Static563.aClass127_2.method6307(1, 1, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
				Static530.anInt8824 = 0;
				Static564.anInt9280++;
			}
			Static187.aBoolean266 = true;
			@Pc(71) Class73[] local71 = Static517.method7149();
			local77 = Static282.aClass6_Sub21_Sub2_1.method6074();
			if (local77 < 0 || local77 >= local71.length) {
				throw new IOException("invo:" + local77 + " ip:" + Static282.aClass6_Sub21_Sub2_1.anInt7338);
			}
			Static385.aClass73_128 = local71[local77];
			Static177.anInt3710 = Static385.aClass73_128.anInt1861;
		}
		if (Static177.anInt3710 == -1) {
			if (!Static563.aClass127_2.method6308(1)) {
				return false;
			}
			Static563.aClass127_2.method6307(1, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
			Static530.anInt8824 = 0;
			Static564.anInt9280++;
			Static177.anInt3710 = Static282.aClass6_Sub21_Sub2_1.aByteArray93[0] & 0xFF;
		}
		if (Static177.anInt3710 == -2) {
			if (!Static563.aClass127_2.method6308(2)) {
				return false;
			}
			Static563.aClass127_2.method6307(2, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
			Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
			Static177.anInt3710 = Static282.aClass6_Sub21_Sub2_1.method6003();
			Static564.anInt9280 += 2;
			Static530.anInt8824 = 0;
		}
		if (Static177.anInt3710 > 0) {
			if (!Static563.aClass127_2.method6308(Static177.anInt3710)) {
				return false;
			}
			Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
			Static563.aClass127_2.method6307(Static177.anInt3710, 0, Static282.aClass6_Sub21_Sub2_1.aByteArray93);
			Static530.anInt8824 = 0;
			Static564.anInt9280 += Static177.anInt3710;
		}
		Static108.aClass73_41 = Static462.aClass73_148;
		Static462.aClass73_148 = Static261.aClass73_98;
		Static261.aClass73_98 = Static385.aClass73_128;
		@Pc(223) String local223;
		@Pc(213) int local213;
		if (Static385.aClass73_128 == Static322.aClass73_111) {
			local213 = Static282.aClass6_Sub21_Sub2_1.method6026();
			local77 = Static282.aClass6_Sub21_Sub2_1.method6068();
			local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
			if (Static447.method6336(local77)) {
				Static215.method3762(local213, local223);
			}
			Static385.aClass73_128 = null;
			return true;
		}
		@Pc(244) String local244;
		if (Static385.aClass73_128 == Static293.aClass73_102) {
			local244 = Static282.aClass6_Sub21_Sub2_1.method6044();
			local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
			local223 = Static266.aClass248_2.method5726(local77).method1821(Static282.aClass6_Sub21_Sub2_1);
			Static294.method4730(local223, local244, local244, 0, local77, null, local244, 19);
			Static385.aClass73_128 = null;
			return true;
		} else if (Static144.aClass73_66 == Static385.aClass73_128) {
			Static131.method2593(Static536.aClass328_25);
			Static385.aClass73_128 = null;
			return true;
		} else if (Static385.aClass73_128 == Static403.aClass73_133) {
			local213 = Static282.aClass6_Sub21_Sub2_1.method6056();
			local77 = Static282.aClass6_Sub21_Sub2_1.method6066();
			Static498.aClass101_1.method2873(local213, local77);
			Static385.aClass73_128 = null;
			return true;
		} else if (Static385.aClass73_128 == Static166.aClass73_76) {
			Static210.anInt4255 = Static282.aClass6_Sub21_Sub2_1.method6058();
			Static330.anInt6004 = Static592.anInt9587;
			Static385.aClass73_128 = null;
			return true;
		} else {
			@Pc(365) String local365;
			@Pc(334) int local334;
			@Pc(338) String local338;
			@Pc(336) String local336;
			if (Static95.aClass73_36 == Static385.aClass73_128) {
				local213 = Static282.aClass6_Sub21_Sub2_1.method6005();
				local77 = Static282.aClass6_Sub21_Sub2_1.method6036();
				local334 = Static282.aClass6_Sub21_Sub2_1.method6069();
				local336 = "";
				local338 = local336;
				if ((local334 & 0x1) != 0) {
					local336 = Static282.aClass6_Sub21_Sub2_1.method6044();
					if ((local334 & 0x2) == 0) {
						local338 = local336;
					} else {
						local338 = Static282.aClass6_Sub21_Sub2_1.method6044();
					}
				}
				local365 = Static282.aClass6_Sub21_Sub2_1.method6044();
				if (local213 == 99) {
					Static513.method7109(local365);
				} else if (local338.equals("") || !Static45.method1075(local338)) {
					Static417.method5982(local336, local338, local336, local365, local77, local213);
				} else {
					Static385.aClass73_128 = null;
					return true;
				}
				Static385.aClass73_128 = null;
				return true;
			}
			@Pc(423) int local423;
			@Pc(412) String local412;
			if (Static385.aClass73_128 == Static57.aClass73_25) {
				local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
				@Pc(418) Object[] local418 = new Object[local412.length() + 1];
				for (local423 = local412.length() - 1; local423 >= 0; local423--) {
					if (local412.charAt(local423) == 's') {
						local418[local423 + 1] = Static282.aClass6_Sub21_Sub2_1.method6044();
					} else {
						local418[local423 + 1] = Integer.valueOf(Static282.aClass6_Sub21_Sub2_1.method6036());
					}
				}
				local418[0] = Integer.valueOf(Static282.aClass6_Sub21_Sub2_1.method6036());
				if (Static447.method6336(local213)) {
					@Pc(473) Class6_Sub43 local473 = new Class6_Sub43();
					local473.anObjectArray34 = local418;
					Static446.method6319(local473);
				}
				Static385.aClass73_128 = null;
				return true;
			} else if (Static385.aClass73_128 == Static162.aClass73_75) {
				local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
				local77 = Static282.aClass6_Sub21_Sub2_1.method6040();
				if (Static447.method6336(local213)) {
					Static481.anInt8148 = local77;
				}
				Static385.aClass73_128 = null;
				return true;
			} else if (Static385.aClass73_128 == Static317.aClass73_110) {
				Static131.method2593(Static51.aClass328_3);
				Static385.aClass73_128 = null;
				return true;
			} else if (Static385.aClass73_128 == Static268.aClass73_155) {
				local213 = Static282.aClass6_Sub21_Sub2_1.method6026();
				local77 = Static282.aClass6_Sub21_Sub2_1.method6012();
				local334 = Static282.aClass6_Sub21_Sub2_1.method6058();
				if (Static447.method6336(local213)) {
					Static561.method7569(local77, local334);
				}
				Static385.aClass73_128 = null;
				return true;
			} else {
				@Pc(577) Class6_Sub11 local577;
				if (Static385.aClass73_128 == Static235.aClass73_93) {
					local213 = Static282.aClass6_Sub21_Sub2_1.method6012();
					local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local334 = Static282.aClass6_Sub21_Sub2_1.method6036();
					if (Static447.method6336(local77)) {
						@Pc(570) Class6_Sub11 local570 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local213);
						local577 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local334);
						if (local577 != null) {
							Static145.method2815(false, local570 == null || local577.anInt1216 != local570.anInt1216, local577);
						}
						if (local570 != null) {
							local570.method7804();
							Static224.aClass128_23.method3267(local570, (long) local334);
						}
						@Pc(616) Class292 local616 = Static367.method5505(local213);
						if (local616 != null) {
							Static464.method6502(local616);
						}
						local616 = Static367.method5505(local334);
						if (local616 != null) {
							Static464.method6502(local616);
							Static339.method5265(true, local616);
						}
						if (Static468.anInt8036 != -1) {
							Static201.method3632(Static468.anInt8036, 1);
						}
					}
					Static385.aClass73_128 = null;
					return true;
				}
				@Pc(673) int local673;
				if (Static302.aClass73_105 == Static385.aClass73_128) {
					local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
					local77 = Static282.aClass6_Sub21_Sub2_1.method6066();
					local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
					local423 = Static282.aClass6_Sub21_Sub2_1.method6026();
					local673 = Static282.aClass6_Sub21_Sub2_1.method6003();
					if (Static447.method6336(local213)) {
						Static68.method6768(local77, local673, 7, local334 | local423 << 16);
					}
					Static385.aClass73_128 = null;
					return true;
				} else if (Static385.aClass73_128 == Static407.aClass73_134) {
					local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
					local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
					local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
					local423 = Static282.aClass6_Sub21_Sub2_1.method6056();
					local673 = Static282.aClass6_Sub21_Sub2_1.method6012();
					if (Static447.method6336(local77)) {
						Static507.method7066(local334, local673, local423, local213);
					}
					Static385.aClass73_128 = null;
					return true;
				} else if (Static385.aClass73_128 == Static129.aClass73_56) {
					Static498.aClass101_1.method2867();
					Static51.anInt1126 += 32;
					Static385.aClass73_128 = null;
					return true;
				} else if (Static527.aClass73_161 == Static385.aClass73_128) {
					Static256.method4330(Static177.anInt3710, Static282.aClass6_Sub21_Sub2_1, Static352.aClass272_2);
					Static385.aClass73_128 = null;
					return true;
				} else {
					@Pc(770) boolean local770;
					@Pc(788) boolean local788;
					if (Static385.aClass73_128 == Static117.aClass73_48) {
						local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
						local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
						local223 = local412;
						if (local770) {
							local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
						}
						local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
						local788 = false;
						if (local423 <= 1) {
							if (Static181.aBoolean255 && !Static132.aBoolean214 || Static82.aBoolean121) {
								local788 = true;
							} else if (local423 <= 1 && Static45.method1075(local223)) {
								local788 = true;
							}
						}
						if (!local788 && Static195.anInt4052 == 0) {
							local365 = Static170.method3177(Static175.method3223(Static282.aClass6_Sub21_Sub2_1));
							if (local423 == 2) {
								Static294.method4730(local365, "<img=1>" + local223, "<img=1>" + local412, 0, -1, null, local412, 24);
							} else if (local423 == 1) {
								Static294.method4730(local365, "<img=0>" + local223, "<img=0>" + local412, 0, -1, null, local412, 24);
							} else {
								Static294.method4730(local365, local223, local412, 0, -1, null, local412, 24);
							}
						}
						Static385.aClass73_128 = null;
						return true;
					} else if (Static353.aClass73_116 == Static385.aClass73_128) {
						if (Static379.method5623(Static557.anInt9206)) {
							Static97.anInt1865 = (int) ((float) Static282.aClass6_Sub21_Sub2_1.method6003() * 2.5F);
						} else {
							Static97.anInt1865 = Static282.aClass6_Sub21_Sub2_1.method6003() * 30;
						}
						Static330.anInt6004 = Static592.anInt9587;
						Static385.aClass73_128 = null;
						return true;
					} else if (Static385.aClass73_128 == Static168.aClass73_78) {
						local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
						local77 = Static282.aClass6_Sub21_Sub2_1.method6036();
						if (Static447.method6336(local213)) {
							@Pc(954) Class6_Sub11 local954 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local77);
							if (local954 != null) {
								Static145.method2815(false, true, local954);
							}
							if (Static518.aClass292_13 != null) {
								Static464.method6502(Static518.aClass292_13);
								Static518.aClass292_13 = null;
							}
						}
						Static385.aClass73_128 = null;
						return true;
					} else {
						@Pc(1055) int local1055;
						if (Static385.aClass73_128 == Static142.aClass73_172) {
							local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
							@Pc(990) boolean local990 = (local213 & 0x1) == 1;
							local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
							local336 = Static282.aClass6_Sub21_Sub2_1.method6044();
							if (local336.equals("")) {
								local336 = local223;
							}
							local338 = Static282.aClass6_Sub21_Sub2_1.method6044();
							local365 = Static282.aClass6_Sub21_Sub2_1.method6044();
							if (local365.equals("")) {
								local365 = local338;
							}
							if (local990) {
								for (local1055 = 0; local1055 < Static362.anInt6352; local1055++) {
									if (Static227.aStringArray11[local1055].equals(local365)) {
										Static488.aStringArray16[local1055] = local223;
										Static227.aStringArray11[local1055] = local336;
										Static378.aStringArray27[local1055] = local338;
										Static120.aStringArray6[local1055] = local365;
										break;
									}
								}
							} else {
								Static488.aStringArray16[Static362.anInt6352] = local223;
								Static227.aStringArray11[Static362.anInt6352] = local336;
								Static378.aStringArray27[Static362.anInt6352] = local338;
								Static120.aStringArray6[Static362.anInt6352] = local365;
								Static82.aBooleanArray14[Static362.anInt6352] = (local213 & 0x2) == 2;
								Static362.anInt6352++;
							}
							Static385.aClass73_128 = null;
							Static449.anInt7763 = Static592.anInt9587;
							return true;
						}
						@Pc(1274) boolean local1274;
						@Pc(1170) int local1170;
						@Pc(1269) int local1269;
						@Pc(1276) int local1276;
						@Pc(1297) Class234 local1297;
						if (Static130.aClass73_58 == Static385.aClass73_128) {
							Static404.anInt7178 = Static592.anInt9587;
							if (Static177.anInt3710 == 0) {
								Static398.aString61 = null;
								Static413.aString65 = null;
								Static324.anInt7486 = 0;
								Static198.aClass234Array1 = null;
								Static385.aClass73_128 = null;
								return true;
							}
							Static413.aString65 = Static282.aClass6_Sub21_Sub2_1.method6044();
							local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
							if (local770) {
								Static282.aClass6_Sub21_Sub2_1.method6044();
							}
							@Pc(1142) long local1142 = Static282.aClass6_Sub21_Sub2_1.method6018();
							Static398.aString61 = Static404.method5929(local1142);
							Static189.aByte35 = Static282.aClass6_Sub21_Sub2_1.method6055();
							local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
							if (local423 == 255) {
								Static385.aClass73_128 = null;
								return true;
							}
							Static324.anInt7486 = local423;
							@Pc(1168) Class234[] local1168 = new Class234[100];
							for (local1170 = 0; local1170 < Static324.anInt7486; local1170++) {
								local1168[local1170] = new Class234();
								local1168[local1170].aString55 = Static282.aClass6_Sub21_Sub2_1.method6044();
								local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
								if (local770) {
									local1168[local1170].aString56 = Static282.aClass6_Sub21_Sub2_1.method6044();
								} else {
									local1168[local1170].aString56 = local1168[local1170].aString55;
								}
								local1168[local1170].aString53 = Static575.method7408(local1168[local1170].aString56);
								local1168[local1170].anInt6351 = Static282.aClass6_Sub21_Sub2_1.method6003();
								local1168[local1170].aByte55 = Static282.aClass6_Sub21_Sub2_1.method6055();
								local1168[local1170].aString54 = Static282.aClass6_Sub21_Sub2_1.method6044();
								if (local1168[local1170].aString56.equals(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63)) {
									Static190.aByte36 = local1168[local1170].aByte55;
								}
							}
							local1269 = Static324.anInt7486;
							while (local1269 > 0) {
								local1269--;
								local1274 = true;
								for (local1276 = 0; local1276 < local1269; local1276++) {
									if (local1168[local1276].aString53.compareTo(local1168[local1276 + 1].aString53) > 0) {
										local1297 = local1168[local1276];
										local1168[local1276] = local1168[local1276 + 1];
										local1168[local1276 + 1] = local1297;
										local1274 = false;
									}
								}
								if (local1274) {
									break;
								}
							}
							Static198.aClass234Array1 = local1168;
							Static385.aClass73_128 = null;
							return true;
						} else if (Static385.aClass73_128 == Static293.aClass73_101) {
							local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
							local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
							local334 = Static282.aClass6_Sub21_Sub2_1.method6069();
							local423 = Static282.aClass6_Sub21_Sub2_1.method6003() << 2;
							local673 = Static282.aClass6_Sub21_Sub2_1.method6069();
							local1170 = Static282.aClass6_Sub21_Sub2_1.method6069();
							if (Static447.method6336(local213)) {
								Static303.method4806(local423, local1170, local77, local334, true, local673);
							}
							Static385.aClass73_128 = null;
							return true;
						} else if (Static50.aClass73_21 == Static385.aClass73_128) {
							local213 = Static282.aClass6_Sub21_Sub2_1.method6020();
							local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
							if (Static447.method6336(local77)) {
								Static68.method6768(local213, -1, 3, -1);
							}
							Static385.aClass73_128 = null;
							return true;
						} else {
							@Pc(1447) int local1447;
							if (Static438.aClass73_139 == Static385.aClass73_128) {
								local213 = Static282.aClass6_Sub21_Sub2_1.method6056();
								if (local213 == 65535) {
									local213 = -1;
								}
								local77 = Static282.aClass6_Sub21_Sub2_1.method6036();
								local334 = local77 >> 28 & 0x3;
								local423 = local77 >> 14 & 0x3FFF;
								local673 = local77 & 0x3FFF;
								local1170 = Static282.aClass6_Sub21_Sub2_1.method6048();
								local1055 = local1170 >> 2;
								local1447 = local1170 & 0x3;
								local673 -= Static138.anInt3088;
								local423 -= Static39.anInt4952;
								local1269 = Static279.anIntArray399[local1055];
								Static5.method174(local673, local1447, local1055, local423, local1269, local213, local334);
								Static385.aClass73_128 = null;
								return true;
							} else if (Static368.aClass73_120 == Static385.aClass73_128) {
								Static131.method2593(Static30.aClass328_2);
								Static385.aClass73_128 = null;
								return true;
							} else {
								@Pc(1514) long local1514;
								@Pc(1519) long local1519;
								@Pc(1524) long local1524;
								@Pc(1538) int local1538;
								if (Static385.aClass73_128 == Static428.aClass73_137) {
									local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
									local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
									local223 = local412;
									if (local770) {
										local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
									}
									local1514 = Static282.aClass6_Sub21_Sub2_1.method6018();
									local1519 = Static282.aClass6_Sub21_Sub2_1.method6003();
									local1524 = Static282.aClass6_Sub21_Sub2_1.method6031();
									local1276 = Static282.aClass6_Sub21_Sub2_1.method6069();
									@Pc(1534) long local1534 = local1524 + (local1519 << 32);
									@Pc(1536) boolean local1536 = false;
									local1538 = 0;
									while (true) {
										if (local1538 >= 100) {
											if (local1276 <= 1) {
												if (Static181.aBoolean255 && !Static132.aBoolean214 || Static82.aBoolean121) {
													local1536 = true;
												} else if (Static45.method1075(local223)) {
													local1536 = true;
												}
											}
											break;
										}
										if (local1534 == Static582.aLongArray16[local1538]) {
											local1536 = true;
											break;
										}
										local1538++;
									}
									if (!local1536 && Static195.anInt4052 == 0) {
										Static582.aLongArray16[Static582.anInt9460] = local1534;
										Static582.anInt9460 = (Static582.anInt9460 + 1) % 100;
										@Pc(1593) String local1593 = Static170.method3177(Static175.method3223(Static282.aClass6_Sub21_Sub2_1));
										if (local1276 == 2 || local1276 == 3) {
											Static294.method4730(local1593, "<img=1>" + local223, "<img=1>" + local412, 0, -1, Static411.method7688(local1514), local412, 9);
										} else if (local1276 == 1) {
											Static294.method4730(local1593, "<img=0>" + local223, "<img=0>" + local412, 0, -1, Static411.method7688(local1514), local412, 9);
										} else {
											Static294.method4730(local1593, local223, local412, 0, -1, Static411.method7688(local1514), local412, 9);
										}
									}
									Static385.aClass73_128 = null;
									return true;
								}
								@Pc(1720) int local1720;
								if (Static207.aClass73_88 == Static385.aClass73_128) {
									local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
									local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
									local223 = local412;
									if (local770) {
										local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
									}
									local1514 = Static282.aClass6_Sub21_Sub2_1.method6018();
									local1519 = Static282.aClass6_Sub21_Sub2_1.method6003();
									local1524 = Static282.aClass6_Sub21_Sub2_1.method6031();
									local1276 = Static282.aClass6_Sub21_Sub2_1.method6069();
									local1720 = Static282.aClass6_Sub21_Sub2_1.method6003();
									@Pc(1727) long local1727 = (local1519 << 32) + local1524;
									@Pc(1729) boolean local1729 = false;
									@Pc(1731) int local1731 = 0;
									while (true) {
										if (local1731 >= 100) {
											if (local1276 <= 1 && Static45.method1075(local223)) {
												local1729 = true;
											}
											break;
										}
										if (local1727 == Static582.aLongArray16[local1731]) {
											local1729 = true;
											break;
										}
										local1731++;
									}
									if (!local1729 && Static195.anInt4052 == 0) {
										Static582.aLongArray16[Static582.anInt9460] = local1727;
										Static582.anInt9460 = (Static582.anInt9460 + 1) % 100;
										@Pc(1780) String local1780 = Static266.aClass248_2.method5726(local1720).method1821(Static282.aClass6_Sub21_Sub2_1);
										if (local1276 == 2) {
											Static294.method4730(local1780, "<img=1>" + local223, "<img=1>" + local412, 0, local1720, Static411.method7688(local1514), local412, 20);
										} else if (local1276 == 1) {
											Static294.method4730(local1780, "<img=0>" + local223, "<img=0>" + local412, 0, local1720, Static411.method7688(local1514), local412, 20);
										} else {
											Static294.method4730(local1780, local223, local412, 0, local1720, Static411.method7688(local1514), local412, 20);
										}
									}
									Static385.aClass73_128 = null;
									return true;
								}
								@Pc(1910) boolean local1910;
								@Pc(1946) String local1946;
								if (Static385.aClass73_128 == Static126.aClass73_162) {
									local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
									@Pc(1874) Class4_Sub1_Sub1_Sub2 local1874;
									if (local213 == Static272.anInt5214) {
										local1874 = Static328.aClass4_Sub1_Sub1_Sub2_2;
									} else {
										local1874 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local213];
									}
									if (local1874 == null) {
										Static385.aClass73_128 = null;
										return true;
									}
									local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
									local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
									local788 = (local334 & 0x8000) != 0;
									if (local1874.aString63 != null && local1874.aClass123_1 != null) {
										local1910 = false;
										if (local423 <= 1) {
											if (!local788 && (Static181.aBoolean255 && !Static132.aBoolean214 || Static82.aBoolean121)) {
												local1910 = true;
											} else if (Static45.method1075(local1874.aString63)) {
												local1910 = true;
											}
										}
										if (!local1910 && Static195.anInt4052 == 0) {
											local1447 = -1;
											if (local788) {
												local334 &= 0x7FFF;
												@Pc(1956) Class271 local1956 = Static527.method7217(Static282.aClass6_Sub21_Sub2_1);
												local1447 = local1956.anInt7400;
												local1946 = local1956.aClass6_Sub2_Sub5_1.method1821(Static282.aClass6_Sub21_Sub2_1);
											} else {
												local1946 = Static170.method3177(Static175.method3223(Static282.aClass6_Sub21_Sub2_1));
											}
											local1874.aString62 = local1946.trim();
											local1874.anInt7119 = 150;
											local1874.anInt7089 = local334 & 0xFF;
											local1874.anInt7096 = local334 >> 8;
											if (local423 == 1 || local423 == 2) {
												local1269 = local788 ? 17 : 1;
											} else {
												local1269 = local788 ? 17 : 2;
											}
											if (local423 == 2) {
												Static294.method4730(local1946, "<img=1>" + local1874.method5916(), "<img=1>" + local1874.method5922(), 0, local1447, null, local1874.aString64, local1269);
											} else if (local423 == 1) {
												Static294.method4730(local1946, "<img=0>" + local1874.method5916(), "<img=0>" + local1874.method5922(), 0, local1447, null, local1874.aString64, local1269);
											} else {
												Static294.method4730(local1946, local1874.method5916(), local1874.method5922(), 0, local1447, null, local1874.aString64, local1269);
											}
										}
									}
									Static385.aClass73_128 = null;
									return true;
								} else if (Static385.aClass73_128 == Static479.aClass73_154) {
									Static131.method2593(Static401.aClass328_21);
									Static385.aClass73_128 = null;
									return true;
								} else if (Static598.aClass73_132 == Static385.aClass73_128) {
									Static131.method2593(Static28.aClass328_1);
									Static385.aClass73_128 = null;
									return true;
								} else if (Static402.aClass73_130 == Static385.aClass73_128) {
									Static131.method2593(Static471.aClass328_20);
									Static385.aClass73_128 = null;
									return true;
								} else if (Static210.aClass73_89 == Static385.aClass73_128) {
									if (Static15.aFrame1 != null) {
										Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
									}
									@Pc(2142) byte[] local2142 = new byte[Static177.anInt3710];
									Static282.aClass6_Sub21_Sub2_1.method6077(local2142, Static177.anInt3710);
									local412 = Static242.method4221(Static177.anInt3710, 0, local2142);
									Static282.method4636(local412, Static560.anInt9242 == 1, true, Static352.aClass272_2);
									Static385.aClass73_128 = null;
									return true;
								} else if (Static91.aClass73_34 == Static385.aClass73_128) {
									Static282.aClass6_Sub21_Sub2_1.anInt7338 += 28;
									if (Static282.aClass6_Sub21_Sub2_1.method6050()) {
										Static596.method7846(Static282.aClass6_Sub21_Sub2_1.anInt7338 - 28, Static282.aClass6_Sub21_Sub2_1);
									}
									Static385.aClass73_128 = null;
									return true;
								} else {
									@Pc(2211) boolean local2211;
									if (Static447.aClass73_141 == Static385.aClass73_128) {
										local244 = Static282.aClass6_Sub21_Sub2_1.method6044();
										local2211 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
										if (local2211) {
											local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
										} else {
											local412 = local244;
										}
										local423 = Static282.aClass6_Sub21_Sub2_1.method6003();
										@Pc(2231) byte local2231 = Static282.aClass6_Sub21_Sub2_1.method6055();
										local1910 = false;
										if (local2231 == -128) {
											local1910 = true;
										}
										if (local1910) {
											if (Static324.anInt7486 == 0) {
												Static385.aClass73_128 = null;
												return true;
											}
											for (local1055 = 0; Static324.anInt7486 > local1055 && (!Static198.aClass234Array1[local1055].aString56.equals(local412) || local423 != Static198.aClass234Array1[local1055].anInt6351); local1055++) {
											}
											if (Static324.anInt7486 > local1055) {
												while (local1055 < Static324.anInt7486 - 1) {
													Static198.aClass234Array1[local1055] = Static198.aClass234Array1[local1055 + 1];
													local1055++;
												}
												Static324.anInt7486--;
												Static198.aClass234Array1[Static324.anInt7486] = null;
											}
										} else {
											local1946 = Static282.aClass6_Sub21_Sub2_1.method6044();
											local1297 = new Class234();
											local1297.aString56 = local412;
											local1297.aString55 = local244;
											local1297.aString53 = Static575.method7408(local1297.aString56);
											local1297.aByte55 = local2231;
											local1297.anInt6351 = local423;
											local1297.aString54 = local1946;
											for (local1269 = Static324.anInt7486 - 1; local1269 >= 0; local1269--) {
												local1276 = Static198.aClass234Array1[local1269].aString53.compareTo(local1297.aString53);
												if (local1276 == 0) {
													Static198.aClass234Array1[local1269].anInt6351 = local423;
													Static198.aClass234Array1[local1269].aByte55 = local2231;
													Static198.aClass234Array1[local1269].aString54 = local1946;
													if (local412.equals(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63)) {
														Static190.aByte36 = local2231;
													}
													Static385.aClass73_128 = null;
													Static404.anInt7178 = Static592.anInt9587;
													return true;
												}
												if (local1276 < 0) {
													break;
												}
											}
											if (Static198.aClass234Array1.length <= Static324.anInt7486) {
												Static385.aClass73_128 = null;
												return true;
											}
											for (local1276 = Static324.anInt7486 - 1; local1276 > local1269; local1276--) {
												Static198.aClass234Array1[local1276 + 1] = Static198.aClass234Array1[local1276];
											}
											if (Static324.anInt7486 == 0) {
												Static198.aClass234Array1 = new Class234[100];
											}
											Static198.aClass234Array1[local1269 + 1] = local1297;
											Static324.anInt7486++;
											if (local412.equals(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63)) {
												Static190.aByte36 = local2231;
											}
										}
										Static385.aClass73_128 = null;
										Static404.anInt7178 = Static592.anInt9587;
										return true;
									} else if (Static449.aClass73_142 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (local213 == 65535) {
											local213 = -1;
										}
										local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
										Static588.method1983(local423, local213, local334, local77);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static128.aClass73_55) {
										Static349.anInt6230 = Static282.aClass6_Sub21_Sub2_1.method6069();
										Static385.aClass73_128 = null;
										Static330.anInt6004 = Static592.anInt9587;
										return true;
									} else if (Static105.aClass73_38 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6020();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6068();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (Static447.method6336(local334)) {
											Static104.method1872(local77, local213);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static475.aClass73_152 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6056();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6066();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
										local423 = Static282.aClass6_Sub21_Sub2_1.method6012();
										if (Static447.method6336(local334)) {
											Static68.method6768(local77, local423, 5, local213);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static92.aClass73_35 == Static385.aClass73_128) {
										Static332.method5174(false);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static142.aClass73_171 == Static385.aClass73_128) {
										Static29.method889(Static282.aClass6_Sub21_Sub2_1, Static177.anInt3710);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static34.aClass73_14) {
										Static131.method2593(Static510.aClass328_23);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static443.aClass73_140 == Static385.aClass73_128) {
										if (Static468.anInt8036 != -1) {
											Static201.method3632(Static468.anInt8036, 0);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static300.aClass73_104) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local77 = local213 >> 5;
										local334 = local213 & 0x1F;
										if (local334 == 0) {
											Static434.aClass262Array1[local77] = null;
											Static385.aClass73_128 = null;
											return true;
										}
										@Pc(2651) Class262 local2651 = new Class262();
										local2651.anInt7229 = local334;
										local2651.anInt7227 = Static282.aClass6_Sub21_Sub2_1.method6069();
										if (local2651.anInt7227 >= 0 && Static188.aClass58Array8.length > local2651.anInt7227) {
											if (local2651.anInt7229 == 1 || local2651.anInt7229 == 10) {
												local2651.anInt7228 = Static282.aClass6_Sub21_Sub2_1.method6003();
												Static282.aClass6_Sub21_Sub2_1.anInt7338 += 6;
											} else if (local2651.anInt7229 >= 2 && local2651.anInt7229 <= 6) {
												if (local2651.anInt7229 == 2) {
													local2651.anInt7232 = 256;
													local2651.anInt7231 = 256;
												}
												if (local2651.anInt7229 == 3) {
													local2651.anInt7231 = 256;
													local2651.anInt7232 = 0;
												}
												if (local2651.anInt7229 == 4) {
													local2651.anInt7232 = 512;
													local2651.anInt7231 = 256;
												}
												if (local2651.anInt7229 == 5) {
													local2651.anInt7232 = 256;
													local2651.anInt7231 = 0;
												}
												if (local2651.anInt7229 == 6) {
													local2651.anInt7231 = 512;
													local2651.anInt7232 = 256;
												}
												local2651.anInt7229 = 2;
												local2651.anInt7235 = Static282.aClass6_Sub21_Sub2_1.method6069();
												local2651.anInt7232 += Static282.aClass6_Sub21_Sub2_1.method6003() - Static39.anInt4952 << 9;
												local2651.anInt7231 += Static282.aClass6_Sub21_Sub2_1.method6003() - Static138.anInt3088 << 9;
												local2651.anInt7234 = Static282.aClass6_Sub21_Sub2_1.method6069() << 2;
												local2651.anInt7230 = Static282.aClass6_Sub21_Sub2_1.method6003();
											}
											local2651.anInt7233 = Static282.aClass6_Sub21_Sub2_1.method6003();
											if (local2651.anInt7233 == 65535) {
												local2651.anInt7233 = -1;
											}
											Static434.aClass262Array1[local77] = local2651;
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static148.aClass73_68 == Static385.aClass73_128) {
										Static354.method6860();
										Static385.aClass73_128 = null;
										return true;
									} else if (Static189.aClass73_81 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6020();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
										if (Static447.method6336(local334)) {
											Static40.method1026(local77, local213);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static363.aClass73_119) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
										if (local213 == 65535) {
											local213 = -1;
										}
										local77 = Static282.aClass6_Sub21_Sub2_1.method6020();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6056();
										if (Static447.method6336(local334)) {
											Static68.method6768(local77, -1, 1, local213);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static243.aClass73_94) {
										Static486.aClass132_4 = Static520.method6533(Static282.aClass6_Sub21_Sub2_1.method6069());
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static302.aClass73_106) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6036();
										Static84.aClass331_4 = Static352.aClass272_2.method6124(local213);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static579.aClass73_170 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6040();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
										if (Static447.method6336(local77)) {
											if (local213 == 2) {
												Static300.method4760();
											}
											Static468.anInt8036 = local334;
											Static577.method7706(local334);
											Static396.method7542(false);
											Static446.method6318(Static468.anInt8036);
											for (local423 = 0; local423 < 100; local423++) {
												Static31.aBooleanArray17[local423] = true;
											}
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static165.aClass73_127 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6036();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (Static447.method6336(local77)) {
											Static68.method6768(local213, 0, 5, Static272.anInt5214);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static38.aClass73_17) {
										Static131.method2593(Static138.aClass328_5);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static375.aClass73_121) {
										Static501.method6777();
										Static385.aClass73_128 = null;
										return false;
									} else if (Static385.aClass73_128 == Static171.aClass73_79) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6048();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (local334 == 65535) {
											local334 = -1;
										}
										Static390.method5740(local334, local213, local77);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static203.aClass73_87 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6030();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6056();
										if (local77 == 65535) {
											local77 = -1;
										}
										local334 = Static282.aClass6_Sub21_Sub2_1.method6069();
										Static228.method4044(local334, local213, local77);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static507.aClass73_159 == Static385.aClass73_128) {
										Static356.aString47 = Static177.anInt3710 <= 2 ? Static230.aClass156_25.method4065(Static25.anInt769) : Static282.aClass6_Sub21_Sub2_1.method6044();
										Static543.anInt8952 = Static177.anInt3710 <= 0 ? -1 : Static282.aClass6_Sub21_Sub2_1.method6003();
										if (Static543.anInt8952 == 65535) {
											Static543.anInt8952 = -1;
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static104.aClass73_37) {
										Static385.aClass73_128 = null;
										Static257.anInt5017 = 1;
										Static449.anInt7763 = Static592.anInt9587;
										return true;
									} else if (Static565.aClass73_124 == Static385.aClass73_128) {
										Static40.method1024(Static301.aBoolean392);
										Static385.aClass73_128 = null;
										return false;
									} else if (Static385.aClass73_128 == Static212.aClass73_90) {
										Static131.method2593(Static120.aClass328_4);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static435.aClass73_138) {
										Static131.method2593(Static527.aClass328_24);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static29.aClass73_13) {
										Static362.anInt6352 = Static282.aClass6_Sub21_Sub2_1.method6069();
										for (local213 = 0; local213 < Static362.anInt6352; local213++) {
											Static488.aStringArray16[local213] = Static282.aClass6_Sub21_Sub2_1.method6044();
											Static227.aStringArray11[local213] = Static282.aClass6_Sub21_Sub2_1.method6044();
											if (Static227.aStringArray11[local213].equals("")) {
												Static227.aStringArray11[local213] = Static488.aStringArray16[local213];
											}
											Static378.aStringArray27[local213] = Static282.aClass6_Sub21_Sub2_1.method6044();
											Static120.aStringArray6[local213] = Static282.aClass6_Sub21_Sub2_1.method6044();
											if (Static120.aStringArray6[local213].equals("")) {
												Static120.aStringArray6[local213] = Static378.aStringArray27[local213];
											}
											Static82.aBooleanArray14[local213] = false;
										}
										Static449.anInt7763 = Static592.anInt9587;
										Static385.aClass73_128 = null;
										return true;
									} else if (Static151.aClass73_69 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (local213 == 65535) {
											local213 = -1;
										}
										local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6066();
										if (Static447.method6336(local77)) {
											Static313.method4896(local213, local334);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static458.aClass73_146 == Static385.aClass73_128) {
										local244 = Static282.aClass6_Sub21_Sub2_1.method6044();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6036();
										if (Static447.method6336(local77)) {
											Static63.method1269(local334, local244);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static157.aClass73_73 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local423 = Static282.aClass6_Sub21_Sub2_1.method6003() << 2;
										local673 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local1170 = Static282.aClass6_Sub21_Sub2_1.method6069();
										if (Static447.method6336(local213)) {
											Static439.method6246(local673, local77, local334, local423, local1170);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static165.aClass73_126 == Static385.aClass73_128) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
										local2211 = (local213 & 0x1) == 1;
										Static115.method2016(local77, local2211);
										Static12.anIntArray29[Static51.anInt1133++ & 0x1F] = local77;
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static355.aClass73_136) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6026();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6020();
										local423 = Static282.aClass6_Sub21_Sub2_1.method6068();
										if (Static447.method6336(local423)) {
											Static98.method1765(local77 + (local213 << 16), local334);
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static422.aClass73_135) {
										local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
										local423 = Static282.aClass6_Sub21_Sub2_1.method6003();
										if (Static447.method6336(local213) && Static14.aClass292ArrayArray1[local77] != null) {
											for (local673 = local334; local673 < local423; local673++) {
												local1170 = Static282.aClass6_Sub21_Sub2_1.method6031();
												if (Static14.aClass292ArrayArray1[local77].length > local673 && Static14.aClass292ArrayArray1[local77][local673] != null) {
													Static14.aClass292ArrayArray1[local77][local673].anInt7968 = local1170;
												}
											}
										}
										Static385.aClass73_128 = null;
										return true;
									} else if (Static39.aClass73_96 == Static385.aClass73_128) {
										Static131.method2593(Static494.aClass328_22);
										Static385.aClass73_128 = null;
										return true;
									} else if (Static385.aClass73_128 == Static326.aClass73_112) {
										Static131.method2593(Static303.aClass328_18);
										Static385.aClass73_128 = null;
										return true;
									} else {
										@Pc(3565) int local3565;
										if (Static458.aClass73_145 == Static385.aClass73_128) {
											local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
											local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
											local223 = local412;
											if (local770) {
												local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
											}
											local1514 = Static282.aClass6_Sub21_Sub2_1.method6003();
											local1519 = Static282.aClass6_Sub21_Sub2_1.method6031();
											local1447 = Static282.aClass6_Sub21_Sub2_1.method6069();
											@Pc(3561) long local3561 = (local1514 << 32) + local1519;
											@Pc(3563) boolean local3563 = false;
											local3565 = 0;
											while (true) {
												if (local3565 >= 100) {
													if (local1447 <= 1) {
														if (Static181.aBoolean255 && !Static132.aBoolean214 || Static82.aBoolean121) {
															local3563 = true;
														} else if (Static45.method1075(local223)) {
															local3563 = true;
														}
													}
													break;
												}
												if (local3561 == Static582.aLongArray16[local3565]) {
													local3563 = true;
													break;
												}
												local3565++;
											}
											if (!local3563 && Static195.anInt4052 == 0) {
												Static582.aLongArray16[Static582.anInt9460] = local3561;
												Static582.anInt9460 = (Static582.anInt9460 + 1) % 100;
												@Pc(3626) String local3626 = Static170.method3177(Static175.method3223(Static282.aClass6_Sub21_Sub2_1));
												if (local1447 == 2) {
													Static294.method4730(local3626, "<img=1>" + local223, "<img=1>" + local412, 0, -1, null, local412, 7);
												} else if (local1447 == 1) {
													Static294.method4730(local3626, "<img=0>" + local223, "<img=0>" + local412, 0, -1, null, local412, 7);
												} else {
													Static294.method4730(local3626, local223, local412, 0, -1, null, local412, 3);
												}
											}
											Static385.aClass73_128 = null;
											return true;
										} else if (Static385.aClass73_128 == Static193.aClass73_167) {
											Static409.anInt9440 = Static282.aClass6_Sub21_Sub2_1.method6040();
											Static562.anInt9256 = Static282.aClass6_Sub21_Sub2_1.method6055() << 3;
											Static364.anInt6396 = Static282.aClass6_Sub21_Sub2_1.method6059() << 3;
											while (Static177.anInt3710 > Static282.aClass6_Sub21_Sub2_1.anInt7338) {
												@Pc(3728) Class328 local3728 = Static563.method7577()[Static282.aClass6_Sub21_Sub2_1.method6069()];
												Static131.method2593(local3728);
											}
											Static385.aClass73_128 = null;
											return true;
										} else if (Static385.aClass73_128 == Static152.aClass73_143) {
											local213 = Static282.aClass6_Sub21_Sub2_1.method6026();
											local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
											@Pc(3762) byte local3762 = Static282.aClass6_Sub21_Sub2_1.method6038();
											if (Static447.method6336(local77)) {
												Static40.method1026(local3762, local213);
											}
											Static385.aClass73_128 = null;
											return true;
										} else if (Static129.aClass73_57 == Static385.aClass73_128) {
											Static385.aClass73_128 = null;
											return false;
										} else if (Static520.aClass73_151 == Static385.aClass73_128) {
											local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
											local77 = Static282.aClass6_Sub21_Sub2_1.method6068();
											local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
											if (Static447.method6336(local213)) {
												Static423.method6097(local77, local334);
											}
											Static385.aClass73_128 = null;
											return true;
										} else if (Static385.aClass73_128 == Static3.aClass73_6) {
											Static40.method1024(false);
											Static385.aClass73_128 = null;
											return false;
										} else if (Static385.aClass73_128 == Static161.aClass73_74) {
											Static587.method7796();
											Static385.aClass73_128 = null;
											return false;
										} else {
											@Pc(3887) long local3887;
											@Pc(3902) Class6_Sub3 local3902;
											@Pc(3893) Class6_Sub3 local3893;
											if (Static385.aClass73_128 == Static105.aClass73_39) {
												local213 = Static282.aClass6_Sub21_Sub2_1.method6066();
												local77 = Static282.aClass6_Sub21_Sub2_1.method6056();
												if (local77 == 65535) {
													local77 = -1;
												}
												local334 = Static282.aClass6_Sub21_Sub2_1.method6036();
												local423 = Static282.aClass6_Sub21_Sub2_1.method6026();
												if (local423 == 65535) {
													local423 = -1;
												}
												local673 = Static282.aClass6_Sub21_Sub2_1.method6003();
												if (Static447.method6336(local673)) {
													for (local1170 = local77; local1170 <= local423; local1170++) {
														local3887 = ((long) local213 << 32) + (long) local1170;
														local3893 = (Class6_Sub3) Static121.aClass128_7.method3263(local3887);
														if (local3893 != null) {
															local3902 = new Class6_Sub3(local334, local3893.anInt316);
															local3893.method7804();
														} else if (local1170 == -1) {
															local3902 = new Class6_Sub3(local334, Static367.method5505(local213).aClass6_Sub3_2.anInt316);
														} else {
															local3902 = new Class6_Sub3(local334, -1);
														}
														Static121.aClass128_7.method3267(local3902, local3887);
													}
												}
												Static385.aClass73_128 = null;
												return true;
											} else if (Static385.aClass73_128 == Static565.aClass73_125) {
												local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
												local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
												local2211 = (local77 & 0x1) == 1;
												Static567.method7375(local2211, local213);
												local423 = Static282.aClass6_Sub21_Sub2_1.method6003();
												for (local673 = 0; local673 < local423; local673++) {
													local1170 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local1055 = Static282.aClass6_Sub21_Sub2_1.method6069();
													if (local1055 == 255) {
														local1055 = Static282.aClass6_Sub21_Sub2_1.method6066();
													}
													Static180.method3266(local213, local673, local1170 - 1, local1055, local2211);
												}
												Static12.anIntArray29[Static51.anInt1133++ & 0x1F] = local213;
												Static385.aClass73_128 = null;
												return true;
											} else if (Static558.aClass73_165 == Static385.aClass73_128) {
												local213 = Static282.aClass6_Sub21_Sub2_1.method6035();
												local77 = Static282.aClass6_Sub21_Sub2_1.method6012();
												local334 = Static282.aClass6_Sub21_Sub2_1.method6035();
												Static536.anIntArray688[local213] = local77;
												Static41.anIntArray285[local213] = local334;
												Static400.anIntArray515[local213] = 1;
												local423 = Static142.anIntArray713[local213] - 1;
												for (local673 = 0; local673 < local423; local673++) {
													if (Class26_Sub1_Sub2.anIntArray280[local673] <= local77) {
														Static400.anIntArray515[local213] = local673 + 2;
													}
												}
												Static144.anIntArray193[Static18.anInt542++ & 0x1F] = local213;
												Static385.aClass73_128 = null;
												return true;
											} else if (Static385.aClass73_128 == Static262.aClass73_99) {
												Static332.method5174(true);
												Static385.aClass73_128 = null;
												return true;
											} else if (Static254.aClass73_158 == Static385.aClass73_128) {
												Static113.anInt2183 = Static282.aClass6_Sub21_Sub2_1.method6069();
												Static385.aClass73_128 = null;
												return true;
											} else if (Static148.aClass73_67 == Static385.aClass73_128) {
												local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
												local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
												local223 = local412;
												if (local770) {
													local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
												}
												local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
												local673 = Static282.aClass6_Sub21_Sub2_1.method6003();
												local1910 = false;
												if (local423 <= 1 && Static45.method1075(local223)) {
													local1910 = true;
												}
												if (!local1910 && Static195.anInt4052 == 0) {
													local1946 = Static266.aClass248_2.method5726(local673).method1821(Static282.aClass6_Sub21_Sub2_1);
													if (local423 == 2) {
														Static294.method4730(local1946, "<img=1>" + local223, "<img=1>" + local412, 0, local673, null, local412, 25);
													} else if (local423 == 1) {
														Static294.method4730(local1946, "<img=0>" + local223, "<img=0>" + local412, 0, local673, null, local412, 25);
													} else {
														Static294.method4730(local1946, local223, local412, 0, local673, null, local412, 25);
													}
												}
												Static385.aClass73_128 = null;
												return true;
											} else if (Static167.aClass73_77 == Static385.aClass73_128) {
												local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
												if (local213 == 65535) {
													local213 = -1;
												}
												local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
												local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
												local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
												Static366.method5502(local213, local334, local423, false, local77);
												Static385.aClass73_128 = null;
												return true;
											} else if (Static385.aClass73_128 == Static119.aClass73_50) {
												Static562.anInt9256 = Static282.aClass6_Sub21_Sub2_1.method6038() << 3;
												Static409.anInt9440 = Static282.aClass6_Sub21_Sub2_1.method6069();
												Static364.anInt6396 = Static282.aClass6_Sub21_Sub2_1.method6059() << 3;
												Static385.aClass73_128 = null;
												return true;
											} else {
												@Pc(4377) int local4377;
												if (Static190.aClass73_84 == Static385.aClass73_128) {
													local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
													local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
													local223 = local412;
													if (local770) {
														local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
													}
													local1514 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local1519 = Static282.aClass6_Sub21_Sub2_1.method6031();
													local1447 = Static282.aClass6_Sub21_Sub2_1.method6069();
													local1269 = Static282.aClass6_Sub21_Sub2_1.method6003();
													@Pc(4373) long local4373 = (local1514 << 32) + local1519;
													@Pc(4375) boolean local4375 = false;
													local4377 = 0;
													while (true) {
														if (local4377 >= 100) {
															if (local1447 <= 1 && Static45.method1075(local223)) {
																local4375 = true;
															}
															break;
														}
														if (Static582.aLongArray16[local4377] == local4373) {
															local4375 = true;
															break;
														}
														local4377++;
													}
													if (!local4375 && Static195.anInt4052 == 0) {
														Static582.aLongArray16[Static582.anInt9460] = local4373;
														Static582.anInt9460 = (Static582.anInt9460 + 1) % 100;
														@Pc(4428) String local4428 = Static266.aClass248_2.method5726(local1269).method1821(Static282.aClass6_Sub21_Sub2_1);
														if (local1447 == 2) {
															Static294.method4730(local4428, "<img=1>" + local223, "<img=1>" + local412, 0, local1269, null, local412, 18);
														} else if (local1447 == 1) {
															Static294.method4730(local4428, "<img=0>" + local223, "<img=0>" + local412, 0, local1269, null, local412, 18);
														} else {
															Static294.method4730(local4428, local223, local412, 0, local1269, null, local412, 18);
														}
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static128.aClass73_54 == Static385.aClass73_128) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6064();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6020();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6007();
													local423 = Static282.aClass6_Sub21_Sub2_1.method6003();
													if (Static447.method6336(local423)) {
														Static44.method1053(local334, local213, local77);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static467.aClass73_149) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
													local2211 = (local77 & 0x1) == 1;
													while (Static282.aClass6_Sub21_Sub2_1.anInt7338 < Static177.anInt3710) {
														local423 = Static282.aClass6_Sub21_Sub2_1.method6005();
														local673 = Static282.aClass6_Sub21_Sub2_1.method6003();
														local1170 = 0;
														if (local673 != 0) {
															local1170 = Static282.aClass6_Sub21_Sub2_1.method6069();
															if (local1170 == 255) {
																local1170 = Static282.aClass6_Sub21_Sub2_1.method6036();
															}
														}
														Static180.method3266(local213, local423, local673 - 1, local1170, local2211);
													}
													Static12.anIntArray29[Static51.anInt1133++ & 0x1F] = local213;
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static21.aClass73_9) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6048();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6035();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
													if (local334 == 65535) {
														local334 = -1;
													}
													local336 = Static282.aClass6_Sub21_Sub2_1.method6044();
													if (local213 >= 1 && local213 <= 8) {
														if (local336.equalsIgnoreCase("null")) {
															local336 = null;
														}
														Static115.aStringArray5[local213 - 1] = local336;
														Static142.anIntArray712[local213 - 1] = local334;
														Static584.aBooleanArray42[local213 - 1] = local77 == 0;
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static509.aClass73_169) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
													@Pc(4704) int[] local4704 = new int[4];
													for (local334 = 0; local334 < 4; local334++) {
														local4704[local334] = Static282.aClass6_Sub21_Sub2_1.method6026();
													}
													local423 = Static282.aClass6_Sub21_Sub2_1.method6048();
													@Pc(4729) Class6_Sub34 local4729 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local213);
													if (local4729 != null) {
														Static13.method6295(local4704, local4729.aClass4_Sub1_Sub1_Sub1_2, local423);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static139.aClass73_60 == Static385.aClass73_128) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
													if (local213 == 65535) {
														local213 = -1;
													}
													local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
													Static366.method5502(local213, local334, local423, true, local77);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static7.aClass73_7) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
													local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6026();
													if (Static447.method6336(local334)) {
														Static215.method3762(local213, local412);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static308.aClass73_108 == Static385.aClass73_128) {
													Static131.method2593(Static173.aClass328_9);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static187.aClass73_80) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6068();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
													if (local77 == 65535) {
														local77 = -1;
													}
													local334 = Static282.aClass6_Sub21_Sub2_1.method6020();
													local423 = Static282.aClass6_Sub21_Sub2_1.method6056();
													if (local423 == 65535) {
														local423 = -1;
													}
													local673 = Static282.aClass6_Sub21_Sub2_1.method6068();
													if (Static447.method6336(local673)) {
														for (local1170 = local77; local1170 <= local423; local1170++) {
															local3887 = ((long) local334 << 32) + ((long) local1170);
															local3893 = (Class6_Sub3) Static121.aClass128_7.method3263(local3887);
															if (local3893 != null) {
																local3902 = new Class6_Sub3(local3893.anInt317, local213);
																local3893.method7804();
															} else if (local1170 == -1) {
																local3902 = new Class6_Sub3(Static367.method5505(local334).aClass6_Sub3_2.anInt317, local213);
															} else {
																local3902 = new Class6_Sub3(0, local213);
															}
															Static121.aClass128_7.method3267(local3902, local3887);
														}
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static305.aClass73_23 == Static385.aClass73_128) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6066();
													Static498.aClass101_1.method2874(local213, local77);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static66.aClass73_26 == Static385.aClass73_128) {
													Static409.anInt9440 = Static282.aClass6_Sub21_Sub2_1.method6035();
													Static562.anInt9256 = Static282.aClass6_Sub21_Sub2_1.method6067() << 3;
													Static364.anInt6396 = Static282.aClass6_Sub21_Sub2_1.method6067() << 3;
													for (@Pc(4974) Class6_Sub51 local4974 = (Class6_Sub51) Static478.aClass128_40.method3265(); local4974 != null; local4974 = (Class6_Sub51) Static478.aClass128_40.method3273()) {
														local77 = (int) (local4974.aLong263 >> 28 & 0x3L);
														local334 = (int) (local4974.aLong263 & 0x3FFFL);
														local423 = local334 - Static39.anInt4952;
														local673 = (int) (local4974.aLong263 >> 14 & 0x3FFFL);
														local1170 = local673 - Static138.anInt3088;
														if (Static409.anInt9440 == local77 && Static364.anInt6396 <= local423 && local423 < Static364.anInt6396 + 8 && Static562.anInt9256 <= local1170 && local1170 < Static562.anInt9256 + 8) {
															local4974.method7804();
															if (local423 >= 0 && local1170 >= 0 && local423 < Static473.anInt8075 && local1170 < Static165.anInt6749) {
																Static540.method3555(local1170, local423, Static409.anInt9440);
															}
														}
													}
													for (@Pc(5075) Class6_Sub41 local5075 = (Class6_Sub41) Static413.aClass361_53.method7838(); local5075 != null; local5075 = (Class6_Sub41) Static413.aClass361_53.method7845()) {
														if (Static364.anInt6396 <= local5075.anInt8201 && Static364.anInt6396 + 8 > local5075.anInt8201 && local5075.anInt8205 >= Static562.anInt9256 && local5075.anInt8205 < Static562.anInt9256 + 8 && Static409.anInt9440 == local5075.anInt8202) {
															local5075.anInt8203 = 0;
														}
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static356.aClass73_118) {
													@Pc(5130) byte local5130 = Static282.aClass6_Sub21_Sub2_1.method6059();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
													Static498.aClass101_1.method2874(local77, local5130);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static151.aClass73_70 == Static385.aClass73_128) {
													local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
													@Pc(5162) byte[] local5162 = new byte[Static177.anInt3710 - 1];
													Static282.aClass6_Sub21_Sub2_1.method6053(Static177.anInt3710 - 1, local5162);
													Static556.method7538(local5162, local770);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static338.aClass73_114) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6056();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6012();
													local423 = Static282.aClass6_Sub21_Sub2_1.method6040();
													if (Static447.method6336(local77)) {
														local577 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local334);
														if (local577 != null) {
															Static145.method2815(false, local577.anInt1216 != local213, local577);
														}
														Static464.method6504(local423, local334, local213, false);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static304.aClass73_107 == Static385.aClass73_128) {
													local244 = Static282.aClass6_Sub21_Sub2_1.method6044();
													local412 = Static170.method3177(Static175.method3223(Static282.aClass6_Sub21_Sub2_1));
													Static417.method5982(local244, local244, local244, local412, 0, 6);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static111.aClass73_44 == Static385.aClass73_128) {
													Static131.method2593(Static289.aClass328_16);
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static258.aClass73_97) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
													if (Static282.aClass6_Sub21_Sub2_1.method6069() == 0) {
														Static229.aClass314Array1[local213] = new Class314();
													} else {
														Static282.aClass6_Sub21_Sub2_1.anInt7338--;
														Static229.aClass314Array1[local213] = new Class314(Static282.aClass6_Sub21_Sub2_1);
													}
													Static345.anInt6206 = Static592.anInt9587;
													Static385.aClass73_128 = null;
													return true;
												} else if (Static109.aClass73_43 == Static385.aClass73_128) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6036();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6056();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
													if (Static447.method6336(local77)) {
														Static528.method7221(local334, local213);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static246.aClass73_95) {
													Static30.anInt865 = Static282.aClass6_Sub21_Sub2_1.method6069();
													Static248.anInt5463 = Static282.aClass6_Sub21_Sub2_1.method6035();
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static298.aClass73_103) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6012();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6068();
													if (local77 == 65535) {
														local77 = -1;
													}
													local334 = Static282.aClass6_Sub21_Sub2_1.method6068();
													local423 = Static282.aClass6_Sub21_Sub2_1.method6020();
													if (Static447.method6336(local334)) {
														Static366.method5488(local213, local77, local423);
														@Pc(5394) Class237 local5394 = Static444.aClass322_2.method7141(local77);
														Static507.method7066(local5394.anInt6540, local213, local5394.anInt6518, local5394.anInt6556);
														Static341.method5290(local5394.anInt6552, local213, local5394.anInt6564, local5394.anInt6507);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static108.aClass73_42) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6036();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6056();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6026();
													if (Static447.method6336(local77)) {
														Static559.method7549(local334, local213);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static313.aClass73_109 == Static385.aClass73_128) {
													for (local213 = 0; local213 < Static588.aClass4_Sub1_Sub1_Sub2Array3.length; local213++) {
														if (Static588.aClass4_Sub1_Sub1_Sub2Array3[local213] != null) {
															Static588.aClass4_Sub1_Sub1_Sub2Array3[local213].anIntArray519 = null;
															Static588.aClass4_Sub1_Sub1_Sub2Array3[local213].anInt7085 = -1;
														}
													}
													for (local77 = 0; local77 < Static535.anInt8885; local77++) {
														Static76.aClass6_Sub34Array7[local77].aClass4_Sub1_Sub1_Sub1_2.anIntArray519 = null;
														Static76.aClass6_Sub34Array7[local77].aClass4_Sub1_Sub1_Sub1_2.anInt7085 = -1;
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static56.aClass73_24) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6036();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
													local334 = Static282.aClass6_Sub21_Sub2_1.method6040();
													if (Static447.method6336(local77)) {
														Static206.method3659(local213, local334);
													}
													Static385.aClass73_128 = null;
													return true;
												} else if (Static385.aClass73_128 == Static22.aClass73_92) {
													local213 = Static282.aClass6_Sub21_Sub2_1.method6069();
													local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
													if (local77 == 255) {
														local213 = -1;
														local77 = -1;
													}
													Static537.method7319(local213, local77);
													Static385.aClass73_128 = null;
													return true;
												} else {
													@Pc(6016) boolean local6016;
													if (Static385.aClass73_128 == Static569.aClass73_166) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6066();
														local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
														local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
														local423 = Static282.aClass6_Sub21_Sub2_1.method6068();
														local673 = Static282.aClass6_Sub21_Sub2_1.method6069();
														local1910 = (local673 & 0x80) != 0;
														if (local213 >> 30 == 0) {
															@Pc(5796) Class57 local5796;
															@Pc(5733) Class10 local5733;
															@Pc(5746) Class57 local5746;
															if (local213 >> 29 != 0) {
																local1055 = local213 & 0xFFFF;
																@Pc(5697) Class6_Sub34 local5697 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local1055);
																if (local5697 != null) {
																	@Pc(5702) Class4_Sub1_Sub1_Sub1 local5702 = local5697.aClass4_Sub1_Sub1_Sub1_2;
																	if (local77 == 65535) {
																		local77 = -1;
																	}
																	@Pc(5709) boolean local5709 = true;
																	local1720 = local1910 ? local5702.anInt7124 : local5702.anInt7069;
																	if (local77 != -1 && local1720 != -1) {
																		if (local1720 == local77) {
																			local5733 = Static289.aClass66_7.method1652(local77);
																			if (local5733.aBoolean21 && local5733.anInt334 != -1) {
																				local5746 = Static78.aClass298_2.method6521(local5733.anInt334);
																				local1538 = local5746.anInt1547;
																				if (local1538 == 0 || local1538 == 2) {
																					local5709 = false;
																				} else if (local1538 == 1) {
																					local5709 = true;
																				}
																			}
																		} else {
																			local5733 = Static289.aClass66_7.method1652(local77);
																			@Pc(5780) Class10 local5780 = Static289.aClass66_7.method1652(local1720);
																			if (local5733.anInt334 != -1 && local5780.anInt334 != -1) {
																				local5796 = Static78.aClass298_2.method6521(local5733.anInt334);
																				@Pc(5802) Class57 local5802 = Static78.aClass298_2.method6521(local5780.anInt334);
																				if (local5796.anInt1532 < local5802.anInt1532) {
																					local5709 = false;
																				}
																			}
																		}
																	}
																	if (local5709) {
																		if (local1910) {
																			local5702.anInt7117 = Static312.anInt5688 + local334;
																			local5702.anInt7115 = local423;
																			local5702.anInt7090 = 1;
																			local5702.anInt7077 = 0;
																			local5702.anInt7088 = 0;
																			local5702.anInt7079 = local673 & 0x7;
																			local5702.anInt7124 = local77;
																			if (local5702.anInt7117 > Static312.anInt5688) {
																				local5702.anInt7077 = -1;
																			}
																			if (local5702.anInt7124 != -1 && local5702.anInt7117 == Static312.anInt5688) {
																				local3565 = Static289.aClass66_7.method1652(local5702.anInt7124).anInt334;
																				if (local3565 != -1) {
																					local5746 = Static78.aClass298_2.method6521(local3565);
																					if (local5746 != null && local5746.anIntArray132 != null) {
																						Static520.method6532(local5702.aByte108, local5746, false, local5702.anInt9542, 0, local5702.anInt9540);
																					}
																				}
																			}
																		} else {
																			local5702.anInt7097 = local423;
																			local5702.anInt7109 = 1;
																			local5702.anInt7087 = 0;
																			local5702.anInt7092 = 0;
																			local5702.anInt7116 = local673 & 0x7;
																			local5702.anInt7069 = local77;
																			local5702.anInt7095 = Static312.anInt5688 + local334;
																			if (local5702.anInt7095 > Static312.anInt5688) {
																				local5702.anInt7087 = -1;
																			}
																			if (local5702.anInt7069 != -1 && local5702.anInt7095 == Static312.anInt5688) {
																				local3565 = Static289.aClass66_7.method1652(local5702.anInt7069).anInt334;
																				if (local3565 != -1) {
																					local5746 = Static78.aClass298_2.method6521(local3565);
																					if (local5746 != null && local5746.anIntArray132 != null) {
																						Static520.method6532(local5702.aByte108, local5746, false, local5702.anInt9542, 0, local5702.anInt9540);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local213 >> 28 != 0) {
																local1055 = local213 & 0xFFFF;
																@Pc(6001) Class4_Sub1_Sub1_Sub2 local6001;
																if (Static272.anInt5214 == local1055) {
																	local6001 = Static328.aClass4_Sub1_Sub1_Sub2_2;
																} else {
																	local6001 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local1055];
																}
																if (local6001 != null) {
																	if (local77 == 65535) {
																		local77 = -1;
																	}
																	local6016 = true;
																	local1276 = local1910 ? local6001.anInt7124 : local6001.anInt7069;
																	@Pc(6095) Class57 local6095;
																	if (local77 != -1 && local1276 != -1) {
																		@Pc(6042) Class10 local6042;
																		if (local77 == local1276) {
																			local6042 = Static289.aClass66_7.method1652(local77);
																			if (local6042.aBoolean21 && local6042.anInt334 != -1) {
																				local6095 = Static78.aClass298_2.method6521(local6042.anInt334);
																				local4377 = local6095.anInt1547;
																				if (local4377 == 0 || local4377 == 2) {
																					local6016 = false;
																				} else if (local4377 == 1) {
																					local6016 = true;
																				}
																			}
																		} else {
																			local6042 = Static289.aClass66_7.method1652(local77);
																			local5733 = Static289.aClass66_7.method1652(local1276);
																			if (local6042.anInt334 != -1 && local5733.anInt334 != -1) {
																				local5746 = Static78.aClass298_2.method6521(local6042.anInt334);
																				local5796 = Static78.aClass298_2.method6521(local5733.anInt334);
																				if (local5746.anInt1532 < local5796.anInt1532) {
																					local6016 = false;
																				}
																			}
																		}
																	}
																	if (local6016) {
																		if (local1910) {
																			local6001.anInt7079 = local673 & 0x7;
																			local6001.anInt7117 = local334 + Static312.anInt5688;
																			local6001.anInt7077 = 0;
																			local6001.anInt7115 = local423;
																			local6001.anInt7124 = local77;
																			local6001.anInt7090 = 1;
																			local6001.anInt7088 = 0;
																			if (Static312.anInt5688 < local6001.anInt7117) {
																				local6001.anInt7077 = -1;
																			}
																			if (local6001.anInt7124 == 65535) {
																				local6001.anInt7124 = -1;
																			}
																			if (local6001.anInt7124 != -1 && Static312.anInt5688 == local6001.anInt7117) {
																				local1720 = Static289.aClass66_7.method1652(local6001.anInt7124).anInt334;
																				if (local1720 != -1) {
																					local6095 = Static78.aClass298_2.method6521(local1720);
																					if (local6095 != null && local6095.anIntArray132 != null) {
																						Static520.method6532(local6001.aByte108, local6095, local6001 == Static328.aClass4_Sub1_Sub1_Sub2_2, local6001.anInt9542, 0, local6001.anInt9540);
																					}
																				}
																			}
																		} else {
																			local6001.anInt7087 = 0;
																			local6001.anInt7097 = local423;
																			local6001.anInt7095 = Static312.anInt5688 + local334;
																			local6001.anInt7092 = 0;
																			local6001.anInt7116 = local673 & 0x7;
																			local6001.anInt7069 = local77;
																			local6001.anInt7109 = 1;
																			if (local6001.anInt7069 == 65535) {
																				local6001.anInt7069 = -1;
																			}
																			if (local6001.anInt7095 > Static312.anInt5688) {
																				local6001.anInt7087 = -1;
																			}
																			if (local6001.anInt7069 != -1 && local6001.anInt7095 == Static312.anInt5688) {
																				local1720 = Static289.aClass66_7.method1652(local6001.anInt7069).anInt334;
																				if (local1720 != -1) {
																					local6095 = Static78.aClass298_2.method6521(local1720);
																					if (local6095 != null && local6095.anIntArray132 != null) {
																						Static520.method6532(local6001.aByte108, local6095, Static328.aClass4_Sub1_Sub1_Sub2_2 == local6001, local6001.anInt9542, 0, local6001.anInt9540);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local1055 = local213 >> 28 & 0x3;
															local1447 = (local213 >> 14 & 0x3FFF) - Static39.anInt4952;
															local1269 = (local213 & 0x3FFF) - Static138.anInt3088;
															if (local1447 >= 0 && local1269 >= 0 && local1447 < Static473.anInt8075 && local1269 < Static165.anInt6749) {
																local1276 = local1447 * 512 + 256;
																local1720 = local1269 * 512 + 256;
																local3565 = local1055;
																if (local1055 < 3 && Static270.method4475(local1447, local1269)) {
																	local3565 = local1055 + 1;
																}
																@Pc(5673) Class4_Sub1_Sub6 local5673 = new Class4_Sub1_Sub6(local77, 0, Static312.anInt5688, local1055, local3565, local1276, Static160.method2951(local1720, local1276, local1055) - local423, local1720, local1447, local1447, local1269, local1269, local673 & 0x7);
																Static79.aClass361_9.method7833(new Class6_Sub2_Sub2(local5673));
															}
														}
														Static385.aClass73_128 = null;
														return true;
													} else if (Static493.aClass73_156 == Static385.aClass73_128) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6048();
														local77 = Static282.aClass6_Sub21_Sub2_1.method6026();
														Static498.aClass101_1.method2873(local77, local213);
														Static385.aClass73_128 = null;
														return true;
													} else if (Static581.aClass73_173 == Static385.aClass73_128) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
														if (Static447.method6336(local213)) {
															Static368.method5526();
														}
														Static385.aClass73_128 = null;
														return true;
													} else if (Static385.aClass73_128 == Static297.aClass73_16) {
														Static592.method7819(Static282.aClass6_Sub21_Sub2_1.method6044());
														Static385.aClass73_128 = null;
														return true;
													} else if (Static593.aClass73_174 == Static385.aClass73_128) {
														Static131.method2593(Static316.aClass328_19);
														Static385.aClass73_128 = null;
														return true;
													} else if (Static479.aClass73_153 == Static385.aClass73_128) {
														Static131.method2593(Static206.aClass328_10);
														Static385.aClass73_128 = null;
														return true;
													} else if (Static572.aClass73_168 == Static385.aClass73_128) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
														local77 = Static282.aClass6_Sub21_Sub2_1.method6069();
														local334 = Static282.aClass6_Sub21_Sub2_1.method6069();
														local423 = Static282.aClass6_Sub21_Sub2_1.method6069();
														local673 = Static282.aClass6_Sub21_Sub2_1.method6069();
														local1170 = Static282.aClass6_Sub21_Sub2_1.method6003();
														if (Static447.method6336(local213)) {
															Static567.aBooleanArray41[local77] = true;
															Static389.anIntArray504[local77] = local334;
															Static196.anIntArray252[local77] = local423;
															Static215.anIntArray271[local77] = local673;
															Static6.anIntArray251[local77] = local1170;
														}
														Static385.aClass73_128 = null;
														return true;
													} else if (Static385.aClass73_128 == Static461.aClass73_147) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6012();
														local77 = Static282.aClass6_Sub21_Sub2_1.method6003();
														local334 = Static282.aClass6_Sub21_Sub2_1.method6003();
														if (local334 == 65535) {
															local334 = -1;
														}
														if (Static447.method6336(local77)) {
															Static68.method6768(local213, -1, 2, local334);
														}
														Static385.aClass73_128 = null;
														return true;
													} else if (Static385.aClass73_128 == Static50.aClass73_20) {
														Static424.anInt7399 = Static282.aClass6_Sub21_Sub2_1.method6043();
														Static181.aBoolean255 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
														Static385.aClass73_128 = null;
														return true;
													} else if (Static116.aClass73_45 == Static385.aClass73_128) {
														local213 = Static282.aClass6_Sub21_Sub2_1.method6003();
														if (Static447.method6336(local213)) {
															Static179.method6310();
														}
														Static385.aClass73_128 = null;
														return true;
													} else if (Static80.aClass73_33 == Static385.aClass73_128) {
														while (Static282.aClass6_Sub21_Sub2_1.anInt7338 < Static177.anInt3710) {
															local770 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
															local412 = Static282.aClass6_Sub21_Sub2_1.method6044();
															local223 = Static282.aClass6_Sub21_Sub2_1.method6044();
															local423 = Static282.aClass6_Sub21_Sub2_1.method6003();
															local673 = Static282.aClass6_Sub21_Sub2_1.method6069();
															local365 = "";
															local1274 = false;
															if (local423 > 0) {
																local365 = Static282.aClass6_Sub21_Sub2_1.method6044();
																local1274 = Static282.aClass6_Sub21_Sub2_1.method6069() == 1;
															}
															for (local1447 = 0; local1447 < Static574.anInt9426; local1447++) {
																if (local770) {
																	if (local223.equals(Static398.aStringArray29[local1447])) {
																		Static398.aStringArray29[local1447] = local412;
																		Static183.aStringArray8[local1447] = local223;
																		local412 = null;
																		break;
																	}
																} else if (local412.equals(Static398.aStringArray29[local1447])) {
																	if (local423 != Static300.anIntArray409[local1447]) {
																		local6016 = true;
																		for (@Pc(6612) Class98_Sub1_Sub2 local6612 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1132(); local6612 != null; local6612 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1129()) {
																			if (local6612.aString60.equals(local412)) {
																				if (local423 != 0 && local6612.aShort89 == 0) {
																					local6016 = false;
																					local6612.method7855();
																				} else if (local423 == 0 && local6612.aShort89 != 0) {
																					local6612.method7855();
																					local6016 = false;
																				}
																			}
																		}
																		if (local6016) {
																			Static74.aClass40_1.method1131(new Class98_Sub1_Sub2(local412, local423));
																		}
																		Static300.anIntArray409[local1447] = local423;
																	}
																	Static183.aStringArray8[local1447] = local223;
																	Static299.aStringArray21[local1447] = local365;
																	Static480.anIntArray599[local1447] = local673;
																	Static18.aBooleanArray1[local1447] = local1274;
																	local412 = null;
																	break;
																}
															}
															if (local412 != null && Static574.anInt9426 < 200) {
																Static398.aStringArray29[Static574.anInt9426] = local412;
																Static183.aStringArray8[Static574.anInt9426] = local223;
																Static300.anIntArray409[Static574.anInt9426] = local423;
																Static299.aStringArray21[Static574.anInt9426] = local365;
																Static480.anIntArray599[Static574.anInt9426] = local673;
																Static18.aBooleanArray1[Static574.anInt9426] = local1274;
																Static574.anInt9426++;
															}
														}
														Static257.anInt5017 = 2;
														Static449.anInt7763 = Static592.anInt9587;
														local77 = Static574.anInt9426;
														while (local77 > 0) {
															local77--;
															local770 = true;
															for (local334 = 0; local334 < local77; local334++) {
																if (Static316.aClass105_5.anInt3307 != Static300.anIntArray409[local334] && Static316.aClass105_5.anInt3307 == Static300.anIntArray409[local334 + 1] || Static300.anIntArray409[local334] == 0 && Static300.anIntArray409[local334 + 1] != 0) {
																	local423 = Static300.anIntArray409[local334];
																	Static300.anIntArray409[local334] = Static300.anIntArray409[local334 + 1];
																	Static300.anIntArray409[local334 + 1] = local423;
																	local338 = Static299.aStringArray21[local334];
																	Static299.aStringArray21[local334] = Static299.aStringArray21[local334 + 1];
																	Static299.aStringArray21[local334 + 1] = local338;
																	local365 = Static398.aStringArray29[local334];
																	Static398.aStringArray29[local334] = Static398.aStringArray29[local334 + 1];
																	Static398.aStringArray29[local334 + 1] = local365;
																	local1946 = Static183.aStringArray8[local334];
																	Static183.aStringArray8[local334] = Static183.aStringArray8[local334 + 1];
																	Static183.aStringArray8[local334 + 1] = local1946;
																	local1447 = Static480.anIntArray599[local334];
																	Static480.anIntArray599[local334] = Static480.anIntArray599[local334 + 1];
																	Static480.anIntArray599[local334 + 1] = local1447;
																	local6016 = Static18.aBooleanArray1[local334];
																	Static18.aBooleanArray1[local334] = Static18.aBooleanArray1[local334 + 1];
																	Static18.aBooleanArray1[local334 + 1] = local6016;
																	local770 = false;
																}
															}
															if (local770) {
																break;
															}
														}
														Static385.aClass73_128 = null;
														return true;
													} else {
														Static256.method4328("T1 - " + (Static385.aClass73_128 == null ? -1 : Static385.aClass73_128.method1751()) + "," + (Static462.aClass73_148 == null ? -1 : Static462.aClass73_148.method1751()) + "," + (Static108.aClass73_41 == null ? -1 : Static108.aClass73_41.method1751()) + " - " + Static177.anInt3710, null);
														Static40.method1024(false);
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
				}
			}
		}
	}
}
