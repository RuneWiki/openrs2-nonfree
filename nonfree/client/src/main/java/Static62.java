import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Lclient!kda;")
	public static final Class185 aClass185_2 = new Class185();

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_14 = new Class70(24, 7);

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
	public static final int[] anIntArray109 = new int[3];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Z")
	public static boolean method1097() throws IOException {
		if (Static568.aClass149_2 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static504.aClass235_188 == null) {
			if (Static579.aBoolean699) {
				if (!Static568.aClass149_2.method3280(1)) {
					return false;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				Static5.anInt62 = 0;
				Static579.aBoolean699 = false;
				Static256.anInt4626++;
			}
			Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
			if (Static585.aClass1_Sub35_Sub2_2.method5815()) {
				if (!Static568.aClass149_2.method3280(1)) {
					return false;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 1);
				Static256.anInt4626++;
				Static5.anInt62 = 0;
			}
			Static579.aBoolean699 = true;
			@Pc(71) Class235[] local71 = Static418.method5812();
			local75 = Static585.aClass1_Sub35_Sub2_2.method5807();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static585.aClass1_Sub35_Sub2_2.anInt7214);
			}
			Static504.aClass235_188 = local71[local75];
			Static445.anInt7693 = Static504.aClass235_188.anInt5788;
		}
		if (Static445.anInt7693 == -1) {
			if (!Static568.aClass149_2.method3280(1)) {
				return false;
			}
			Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
			Static445.anInt7693 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
			Static5.anInt62 = 0;
			Static256.anInt4626++;
		}
		if (Static445.anInt7693 == -2) {
			if (!Static568.aClass149_2.method3280(2)) {
				return false;
			}
			Static568.aClass149_2.method3278(2, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
			Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
			Static445.anInt7693 = Static585.aClass1_Sub35_Sub2_2.method5771();
			Static5.anInt62 = 0;
			Static256.anInt4626 += 2;
		}
		if (Static445.anInt7693 > 0) {
			if (!Static568.aClass149_2.method3280(Static445.anInt7693)) {
				return false;
			}
			Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
			Static568.aClass149_2.method3278(Static445.anInt7693, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
			Static256.anInt4626 += Static445.anInt7693;
			Static5.anInt62 = 0;
		}
		Static73.aClass235_31 = Static125.aClass235_83;
		Static125.aClass235_83 = Static122.aClass235_80;
		Static122.aClass235_80 = Static504.aClass235_188;
		@Pc(230) int local230;
		@Pc(215) int local215;
		if (Static504.aClass235_188 == Static336.aClass235_183) {
			local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
			if (local215 == 65535) {
				local215 = -1;
			}
			local75 = Static585.aClass1_Sub35_Sub2_2.method5775();
			local230 = Static585.aClass1_Sub35_Sub2_2.method5750();
			Static315.method4375(local75, local230, local215);
			Static504.aClass235_188 = null;
			return true;
		} else if (Static584.aClass235_290 == Static504.aClass235_188) {
			local215 = Static585.aClass1_Sub35_Sub2_2.method5797();
			local75 = Static585.aClass1_Sub35_Sub2_2.method5742();
			local230 = Static585.aClass1_Sub35_Sub2_2.method5783();
			if (local230 == 65535) {
				local230 = -1;
			}
			Static382.method5238(local230, local215, local75);
			Static504.aClass235_188 = null;
			return true;
		} else if (Static288.aClass235_151 == Static504.aClass235_188) {
			local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
			local75 = Static585.aClass1_Sub35_Sub2_2.method5765();
			local230 = Static585.aClass1_Sub35_Sub2_2.method5779();
			if (local230 == 65535) {
				local230 = -1;
			}
			if (Static497.method4926(local215)) {
				Static254.method3725(2, local75, local230, -1);
			}
			Static504.aClass235_188 = null;
			return true;
		} else {
			@Pc(338) int local338;
			@Pc(342) int local342;
			@Pc(344) int local344;
			@Pc(332) boolean local332;
			if (Static504.aClass235_188 == Static534.aClass235_269) {
				local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local332 = (local75 & 0x1) == 1;
				while (Static585.aClass1_Sub35_Sub2_2.anInt7214 < Static445.anInt7693) {
					local338 = Static585.aClass1_Sub35_Sub2_2.method5739();
					local342 = Static585.aClass1_Sub35_Sub2_2.method5771();
					local344 = 0;
					if (local342 != 0) {
						local344 = Static585.aClass1_Sub35_Sub2_2.method5750();
						if (local344 == 255) {
							local344 = Static585.aClass1_Sub35_Sub2_2.method5804();
						}
					}
					Static183.method2578(local342 - 1, local215, local338, local332, local344);
				}
				Static527.anIntArray672[Static96.anInt2012++ & 0x1F] = local215;
				Static504.aClass235_188 = null;
				return true;
			}
			@Pc(417) String local417;
			if (Static427.aClass235_219 == Static504.aClass235_188) {
				if (Static264.aFrame2 != null) {
					Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
				}
				@Pc(405) byte[] local405 = new byte[Static445.anInt7693];
				Static585.aClass1_Sub35_Sub2_2.method5819(local405, Static445.anInt7693);
				local417 = Static133.method3234(0, Static445.anInt7693, local405);
				Static383.method5284(Static362.aClass109_5, local417, Static113.anInt2222 == 1, true);
				Static504.aClass235_188 = null;
				return true;
			} else if (Static112.aClass235_73 == Static504.aClass235_188) {
				Static585.aClass1_Sub35_Sub2_2.anInt7214 += 28;
				if (Static585.aClass1_Sub35_Sub2_2.method5749()) {
					Static131.method2041(Static585.aClass1_Sub35_Sub2_2, Static585.aClass1_Sub35_Sub2_2.anInt7214 - 28);
				}
				Static504.aClass235_188 = null;
				return true;
			} else if (Static335.aClass235_182 == Static504.aClass235_188) {
				local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (Static497.method4926(local215)) {
					Static426.method5891();
				}
				Static504.aClass235_188 = null;
				return true;
			} else {
				@Pc(501) String local501;
				@Pc(818) String local818;
				@Pc(533) int local533;
				@Pc(513) boolean local513;
				@Pc(511) String local511;
				@Pc(782) String local782;
				@Pc(571) boolean local571;
				@Pc(493) boolean local493;
				if (Static504.aClass235_188 == Static149.aClass235_96) {
					while (Static585.aClass1_Sub35_Sub2_2.anInt7214 < Static445.anInt7693) {
						local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
						local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
						local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
						local338 = Static585.aClass1_Sub35_Sub2_2.method5771();
						local342 = Static585.aClass1_Sub35_Sub2_2.method5750();
						local511 = "";
						local513 = false;
						if (local338 > 0) {
							local511 = Static585.aClass1_Sub35_Sub2_2.method5760();
							local513 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
						}
						for (local533 = 0; local533 < Static281.anInt4916; local533++) {
							if (local493) {
								if (local501.equals(Static308.aStringArray24[local533])) {
									Static308.aStringArray24[local533] = local417;
									Static98.aStringArray29[local533] = local501;
									local417 = null;
									break;
								}
							} else if (local417.equals(Static308.aStringArray24[local533])) {
								if (local338 != Static448.anIntArray598[local533]) {
									local571 = true;
									for (@Pc(576) Class8_Sub2_Sub2 local576 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4194(); local576 != null; local576 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4191()) {
										if (local576.aString89.equals(local417)) {
											if (local338 != 0 && local576.aShort124 == 0) {
												local571 = false;
												local576.method7615();
											} else if (local338 == 0 && local576.aShort124 != 0) {
												local571 = false;
												local576.method7615();
											}
										}
									}
									if (local571) {
										Static378.aClass209_4.method4190(new Class8_Sub2_Sub2(local417, local338));
									}
									Static448.anIntArray598[local533] = local338;
								}
								Static98.aStringArray29[local533] = local501;
								Static250.aStringArray22[local533] = local511;
								Static590.anIntArray735[local533] = local342;
								local417 = null;
								Static305.aBooleanArray9[local533] = local513;
								break;
							}
						}
						if (local417 != null && Static281.anInt4916 < 200) {
							Static308.aStringArray24[Static281.anInt4916] = local417;
							Static98.aStringArray29[Static281.anInt4916] = local501;
							Static448.anIntArray598[Static281.anInt4916] = local338;
							Static250.aStringArray22[Static281.anInt4916] = local511;
							Static590.anIntArray735[Static281.anInt4916] = local342;
							Static305.aBooleanArray9[Static281.anInt4916] = local513;
							Static281.anInt4916++;
						}
					}
					Static162.anInt2936 = 2;
					Static498.anInt8553 = Static233.anInt8002;
					local75 = Static281.anInt4916;
					while (local75 > 0) {
						local75--;
						local493 = true;
						for (local230 = 0; local230 < local75; local230++) {
							if (Static448.anIntArray598[local230] != Static382.aClass227_2.anInt5547 && Static382.aClass227_2.anInt5547 == Static448.anIntArray598[local230 + 1] || Static448.anIntArray598[local230] == 0 && Static448.anIntArray598[local230 + 1] != 0) {
								local338 = Static448.anIntArray598[local230];
								Static448.anIntArray598[local230] = Static448.anIntArray598[local230 + 1];
								Static448.anIntArray598[local230 + 1] = local338;
								local782 = Static250.aStringArray22[local230];
								Static250.aStringArray22[local230] = Static250.aStringArray22[local230 + 1];
								Static250.aStringArray22[local230 + 1] = local782;
								local511 = Static308.aStringArray24[local230];
								Static308.aStringArray24[local230] = Static308.aStringArray24[local230 + 1];
								Static308.aStringArray24[local230 + 1] = local511;
								local818 = Static98.aStringArray29[local230];
								Static98.aStringArray29[local230] = Static98.aStringArray29[local230 + 1];
								Static98.aStringArray29[local230 + 1] = local818;
								local533 = Static590.anIntArray735[local230];
								Static590.anIntArray735[local230] = Static590.anIntArray735[local230 + 1];
								Static590.anIntArray735[local230 + 1] = local533;
								local571 = Static305.aBooleanArray9[local230];
								Static305.aBooleanArray9[local230] = Static305.aBooleanArray9[local230 + 1];
								Static305.aBooleanArray9[local230 + 1] = local571;
								local493 = false;
							}
						}
						if (local493) {
							break;
						}
					}
					Static504.aClass235_188 = null;
					return true;
				} else if (Static504.aClass235_188 == Static27.aClass235_18) {
					local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
					if (local215 == 65535) {
						local215 = -1;
					}
					local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
					local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
					local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
					Static255.method3727(local230, false, local338, local75, local215);
					Static504.aClass235_188 = null;
					return true;
				} else {
					@Pc(974) long local974;
					@Pc(991) Class1_Sub49 local991;
					@Pc(980) Class1_Sub49 local980;
					if (Static504.aClass235_188 == Static530.aClass235_266) {
						local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
						local75 = Static585.aClass1_Sub35_Sub2_2.method5782();
						local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
						if (local230 == 65535) {
							local230 = -1;
						}
						local338 = Static585.aClass1_Sub35_Sub2_2.method5765();
						local342 = Static585.aClass1_Sub35_Sub2_2.method5783();
						if (local342 == 65535) {
							local342 = -1;
						}
						if (Static497.method4926(local215)) {
							for (local344 = local342; local344 <= local230; local344++) {
								local974 = ((long) local338 << 32) + ((long) local344);
								local980 = (Class1_Sub49) Static353.aClass187_25.method3797(local974);
								if (local980 != null) {
									local991 = new Class1_Sub49(local75, local980.anInt9538);
									local980.method7859();
								} else if (local344 == -1) {
									local991 = new Class1_Sub49(local75, Static350.method4758(local338).aClass1_Sub49_2.anInt9538);
								} else {
									local991 = new Class1_Sub49(local75, -1);
								}
								Static353.aClass187_25.method3795(local991, local974);
							}
						}
						Static504.aClass235_188 = null;
						return true;
					}
					@Pc(1037) String local1037;
					if (Static504.aClass235_188 == Static319.aClass235_170) {
						local1037 = Static585.aClass1_Sub35_Sub2_2.method5760();
						local75 = Static585.aClass1_Sub35_Sub2_2.method5783();
						if (local75 == 65535) {
							local75 = -1;
						}
						local230 = Static585.aClass1_Sub35_Sub2_2.method5775();
						local338 = Static585.aClass1_Sub35_Sub2_2.method5742();
						if (local338 >= 1 && local338 <= 8) {
							if (local1037.equalsIgnoreCase("null")) {
								local1037 = null;
							}
							Static66.aStringArray7[local338 - 1] = local1037;
							Static381.anIntArray509[local338 - 1] = local75;
							Static260.aBooleanArray7[local338 - 1] = local230 == 0;
						}
						Static504.aClass235_188 = null;
						return true;
					} else if (Static504.aClass235_188 == Static194.aClass235_112) {
						local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
						local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
						local230 = Static585.aClass1_Sub35_Sub2_2.method5750();
						local338 = Static585.aClass1_Sub35_Sub2_2.method5771() << 2;
						local342 = Static585.aClass1_Sub35_Sub2_2.method5750();
						local344 = Static585.aClass1_Sub35_Sub2_2.method5750();
						if (Static497.method4926(local215)) {
							Static485.method6557(local344, local342, local338, local75, local230);
						}
						Static504.aClass235_188 = null;
						return true;
					} else if (Static504.aClass235_188 == Static164.aClass235_274) {
						Static30.method384(Static510.aClass316_14);
						Static504.aClass235_188 = null;
						return true;
					} else if (Static504.aClass235_188 == Static306.aClass235_137) {
						local215 = Static585.aClass1_Sub35_Sub2_2.method5765();
						local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
						local230 = Static585.aClass1_Sub35_Sub2_2.method5772();
						if (Static497.method4926(local230)) {
							Static378.method5053(local75, local215);
						}
						Static504.aClass235_188 = null;
						return true;
					} else {
						@Pc(1207) boolean local1207;
						if (Static504.aClass235_188 == Static244.aClass235_138) {
							local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
							local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
							local501 = local417;
							if (local493) {
								local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
							}
							local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
							local1207 = false;
							if (local338 <= 1) {
								if (Static274.aBoolean30 && !Static357.aBoolean467 || Static422.aBoolean573) {
									local1207 = true;
								} else if (local338 <= 1 && Static350.method4761(local501)) {
									local1207 = true;
								}
							}
							if (!local1207 && Static557.anInt9336 == 0) {
								local511 = Static93.method1618(Static68.method1213(Static585.aClass1_Sub35_Sub2_2));
								if (local338 == 2) {
									Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local511, 24, null, -1);
								} else if (local338 == 1) {
									Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local511, 24, null, -1);
								} else {
									Static385.method5299(0, local417, local417, local501, local511, 24, null, -1);
								}
							}
							Static504.aClass235_188 = null;
							return true;
						} else if (Static504.aClass235_188 == Static351.aClass235_194) {
							local1037 = Static585.aClass1_Sub35_Sub2_2.method5760();
							local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
							local230 = Static585.aClass1_Sub35_Sub2_2.method5737();
							if (Static497.method4926(local75)) {
								Static462.method6381(local230, local1037);
							}
							Static504.aClass235_188 = null;
							return true;
						} else if (Static504.aClass235_188 == Static478.aClass235_270) {
							local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
							local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
							if (Static497.method4926(local215)) {
								@Pc(1362) Class1_Sub44 local1362 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local75);
								if (local1362 != null) {
									Static157.method2283(false, true, local1362);
								}
								if (Static205.aClass341_21 != null) {
									Static442.method6111(Static205.aClass341_21);
									Static205.aClass341_21 = null;
								}
							}
							Static504.aClass235_188 = null;
							return true;
						} else if (Static321.aClass235_171 == Static504.aClass235_188) {
							local215 = Static585.aClass1_Sub35_Sub2_2.method5804();
							local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
							local230 = Static585.aClass1_Sub35_Sub2_2.method5772();
							if (Static497.method4926(local230)) {
								Static189.method2921(local75, local215);
							}
							Static504.aClass235_188 = null;
							return true;
						} else {
							@Pc(1463) int local1463;
							@Pc(1453) int local1453;
							@Pc(1444) long local1444;
							@Pc(1449) long local1449;
							@Pc(1439) long local1439;
							if (Static504.aClass235_188 == Static340.aClass235_186) {
								local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
								local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
								local501 = local417;
								if (local493) {
									local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
								}
								local1439 = Static585.aClass1_Sub35_Sub2_2.method5778();
								local1444 = Static585.aClass1_Sub35_Sub2_2.method5771();
								local1449 = Static585.aClass1_Sub35_Sub2_2.method5797();
								local1453 = Static585.aClass1_Sub35_Sub2_2.method5750();
								@Pc(1459) long local1459 = local1449 + (local1444 << 32);
								@Pc(1461) boolean local1461 = false;
								local1463 = 0;
								while (true) {
									if (local1463 >= 100) {
										if (local1453 <= 1) {
											if (Static274.aBoolean30 && !Static357.aBoolean467 || Static422.aBoolean573) {
												local1461 = true;
											} else if (Static350.method4761(local501)) {
												local1461 = true;
											}
										}
										break;
									}
									if (Static578.aLongArray27[local1463] == local1459) {
										local1461 = true;
										break;
									}
									local1463++;
								}
								if (!local1461 && Static557.anInt9336 == 0) {
									Static578.aLongArray27[Static209.anInt4091] = local1459;
									Static209.anInt4091 = (Static209.anInt4091 + 1) % 100;
									@Pc(1529) String local1529 = Static93.method1618(Static68.method1213(Static585.aClass1_Sub35_Sub2_2));
									if (local1453 == 2 || local1453 == 3) {
										Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local1529, 9, Static380.method5091(local1439), -1);
									} else if (local1453 == 1) {
										Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local1529, 9, Static380.method5091(local1439), -1);
									} else {
										Static385.method5299(0, local417, local417, local501, local1529, 9, Static380.method5091(local1439), -1);
									}
								}
								Static504.aClass235_188 = null;
								return true;
							}
							@Pc(1689) int local1689;
							@Pc(1632) String local1632;
							if (Static504.aClass235_188 == Static127.aClass235_88) {
								local215 = Static585.aClass1_Sub35_Sub2_2.method5750();
								@Pc(1624) boolean local1624 = (local215 & 0x1) == 1;
								local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
								local1632 = Static585.aClass1_Sub35_Sub2_2.method5760();
								if (local1632.equals("")) {
									local1632 = local501;
								}
								local782 = Static585.aClass1_Sub35_Sub2_2.method5760();
								local511 = Static585.aClass1_Sub35_Sub2_2.method5760();
								if (local511.equals("")) {
									local511 = local782;
								}
								if (local1624) {
									for (local1689 = 0; local1689 < Static233.anInt7999; local1689++) {
										if (Static563.aStringArray39[local1689].equals(local511)) {
											Static29.aStringArray4[local1689] = local501;
											Static563.aStringArray39[local1689] = local1632;
											Static534.aStringArray37[local1689] = local782;
											Static574.aStringArray41[local1689] = local511;
											break;
										}
									}
								} else {
									Static29.aStringArray4[Static233.anInt7999] = local501;
									Static563.aStringArray39[Static233.anInt7999] = local1632;
									Static534.aStringArray37[Static233.anInt7999] = local782;
									Static574.aStringArray41[Static233.anInt7999] = local511;
									Static469.aBooleanArray18[Static233.anInt7999] = (local215 & 0x2) == 2;
									Static233.anInt7999++;
								}
								Static504.aClass235_188 = null;
								Static498.anInt8553 = Static233.anInt8002;
								return true;
							} else if (Static99.aClass235_181 == Static504.aClass235_188) {
								Static295.anInt5065 = Static585.aClass1_Sub35_Sub2_2.method5743() << 3;
								Static487.anInt8209 = Static585.aClass1_Sub35_Sub2_2.method5775();
								Static590.anInt9615 = Static585.aClass1_Sub35_Sub2_2.method5743() << 3;
								Static504.aClass235_188 = null;
								return true;
							} else if (Static78.aClass235_46 == Static504.aClass235_188) {
								Static30.method384(Static116.aClass316_3);
								Static504.aClass235_188 = null;
								return true;
							} else if (Static232.aClass235_129 == Static504.aClass235_188) {
								Static30.method384(Static449.aClass316_12);
								Static504.aClass235_188 = null;
								return true;
							} else if (Static504.aClass235_188 == Static95.aClass235_64) {
								Static30.method380(true);
								Static504.aClass235_188 = null;
								return true;
							} else if (Static568.aClass235_279 == Static504.aClass235_188) {
								Static265.anInt4692 = Static585.aClass1_Sub35_Sub2_2.method5750();
								Static127.anInt2535 = Static233.anInt8002;
								Static504.aClass235_188 = null;
								return true;
							} else if (Static504.aClass235_188 == Static83.aClass235_51) {
								Static487.anInt8209 = Static585.aClass1_Sub35_Sub2_2.method5750();
								Static590.anInt9615 = Static585.aClass1_Sub35_Sub2_2.method5762() << 3;
								Static295.anInt5065 = Static585.aClass1_Sub35_Sub2_2.method5768() << 3;
								for (@Pc(1815) Class1_Sub28 local1815 = (Class1_Sub28) Static19.aClass187_3.method3799(); local1815 != null; local1815 = (Class1_Sub28) Static19.aClass187_3.method3805()) {
									local75 = (int) (local1815.aLong301 >> 28 & 0x3L);
									local230 = (int) (local1815.aLong301 & 0x3FFFL);
									local338 = local230 - Static541.anInt9058;
									local342 = (int) (local1815.aLong301 >> 14 & 0x3FFFL);
									local344 = local342 - Static116.anInt2289;
									if (local75 == Static487.anInt8209 && local338 >= Static295.anInt5065 && Static295.anInt5065 + 8 > local338 && local344 >= Static590.anInt9615 && local344 < Static590.anInt9615 + 8) {
										local1815.method7859();
										if (local338 >= 0 && local344 >= 0 && Static71.anInt1410 > local338 && local344 < Static471.anInt8012) {
											Static38.method540(local344, Static487.anInt8209, local338);
										}
									}
								}
								for (@Pc(1928) Class1_Sub20 local1928 = (Class1_Sub20) Static27.aClass353_3.method7677(); local1928 != null; local1928 = (Class1_Sub20) Static27.aClass353_3.method7687()) {
									if (Static295.anInt5065 <= local1928.anInt2953 && Static295.anInt5065 + 8 > local1928.anInt2953 && local1928.anInt2957 >= Static590.anInt9615 && local1928.anInt2957 < Static590.anInt9615 + 8 && Static487.anInt8209 == local1928.anInt2942) {
										local1928.anInt2945 = 0;
									}
								}
								Static504.aClass235_188 = null;
								return true;
							} else {
								@Pc(2022) int local2022;
								if (Static526.aClass235_262 == Static504.aClass235_188) {
									local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
									local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
									local501 = local417;
									if (local493) {
										local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
									}
									local1439 = Static585.aClass1_Sub35_Sub2_2.method5778();
									local1444 = Static585.aClass1_Sub35_Sub2_2.method5771();
									local1449 = Static585.aClass1_Sub35_Sub2_2.method5797();
									local1453 = Static585.aClass1_Sub35_Sub2_2.method5750();
									local2022 = Static585.aClass1_Sub35_Sub2_2.method5771();
									@Pc(2028) long local2028 = local1449 + (local1444 << 32);
									@Pc(2030) boolean local2030 = false;
									@Pc(2032) int local2032 = 0;
									while (true) {
										if (local2032 >= 100) {
											if (local1453 <= 1 && Static350.method4761(local501)) {
												local2030 = true;
											}
											break;
										}
										if (Static578.aLongArray27[local2032] == local2028) {
											local2030 = true;
											break;
										}
										local2032++;
									}
									if (!local2030 && Static557.anInt9336 == 0) {
										Static578.aLongArray27[Static209.anInt4091] = local2028;
										Static209.anInt4091 = (Static209.anInt4091 + 1) % 100;
										@Pc(2084) String local2084 = Static183.aClass366_1.method7873(local2022).method6225(Static585.aClass1_Sub35_Sub2_2);
										if (local1453 == 2) {
											Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local2084, 20, Static380.method5091(local1439), local2022);
										} else if (local1453 == 1) {
											Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local2084, 20, Static380.method5091(local1439), local2022);
										} else {
											Static385.method5299(0, local417, local417, local501, local2084, 20, Static380.method5091(local1439), local2022);
										}
									}
									Static504.aClass235_188 = null;
									return true;
								} else if (Static504.aClass235_188 == Static243.aClass235_135) {
									Static30.method384(Static299.aClass316_9);
									Static504.aClass235_188 = null;
									return true;
								} else if (Static504.aClass235_188 == Static527.aClass235_263) {
									Static470.method6439(Static585.aClass1_Sub35_Sub2_2.method5760());
									Static504.aClass235_188 = null;
									return true;
								} else if (Static504.aClass235_188 == Static31.aClass235_21) {
									Static504.aClass235_188 = null;
									return false;
								} else if (Static567.aClass235_278 == Static504.aClass235_188) {
									Static509.anInt5326 = Static585.aClass1_Sub35_Sub2_2.method5750();
									Static504.aClass235_188 = null;
									return true;
								} else {
									@Pc(2255) boolean local2255;
									@Pc(2344) int local2344;
									if (Static458.aClass235_240 == Static504.aClass235_188) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
										@Pc(2218) Class8_Sub3_Sub3_Sub1_Sub1 local2218;
										if (Static296.anInt5113 == local215) {
											local2218 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1;
										} else {
											local2218 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local215];
										}
										if (local2218 == null) {
											Static504.aClass235_188 = null;
											return true;
										}
										local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
										local1207 = (local230 & 0x8000) != 0;
										if (local2218.aString16 != null && local2218.aClass190_1 != null) {
											local2255 = false;
											if (local338 <= 1) {
												if (!local1207 && (Static274.aBoolean30 && !Static357.aBoolean467 || Static422.aBoolean573)) {
													local2255 = true;
												} else if (Static350.method4761(local2218.aString16)) {
													local2255 = true;
												}
											}
											if (!local2255 && Static557.anInt9336 == 0) {
												local533 = -1;
												if (local1207) {
													local230 &= 0x7FFF;
													@Pc(2306) Class99 local2306 = Static579.method7399(Static585.aClass1_Sub35_Sub2_2);
													local533 = local2306.anInt2536;
													local818 = local2306.aClass1_Sub6_Sub13_1.method6225(Static585.aClass1_Sub35_Sub2_2);
												} else {
													local818 = Static93.method1618(Static68.method1213(Static585.aClass1_Sub35_Sub2_2));
												}
												local2218.aString68 = local818.trim();
												local2218.anInt6799 = local230 & 0xFF;
												local2218.anInt6815 = 150;
												local2218.anInt6778 = local230 >> 8;
												if (local338 == 1 || local338 == 2) {
													local2344 = local1207 ? 17 : 1;
												} else {
													local2344 = local1207 ? 17 : 2;
												}
												if (local338 == 2) {
													Static385.method5299(0, local2218.aString15, "<img=1>" + local2218.method1438(), "<img=1>" + local2218.method1441(), local818, local2344, null, local533);
												} else if (local338 == 1) {
													Static385.method5299(0, local2218.aString15, "<img=0>" + local2218.method1438(), "<img=0>" + local2218.method1441(), local818, local2344, null, local533);
												} else {
													Static385.method5299(0, local2218.aString15, local2218.method1438(), local2218.method1441(), local818, local2344, null, local533);
												}
											}
										}
										Static504.aClass235_188 = null;
										return true;
									}
									@Pc(2501) int local2501;
									if (Static504.aClass235_188 == Static73.aClass235_30) {
										local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
										local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
										local501 = local417;
										if (local493) {
											local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
										}
										local1439 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local1444 = Static585.aClass1_Sub35_Sub2_2.method5797();
										local533 = Static585.aClass1_Sub35_Sub2_2.method5750();
										local2344 = Static585.aClass1_Sub35_Sub2_2.method5771();
										@Pc(2497) long local2497 = local1444 + (local1439 << 32);
										@Pc(2499) boolean local2499 = false;
										local2501 = 0;
										while (true) {
											if (local2501 >= 100) {
												if (local533 <= 1 && Static350.method4761(local501)) {
													local2499 = true;
												}
												break;
											}
											if (local2497 == Static578.aLongArray27[local2501]) {
												local2499 = true;
												break;
											}
											local2501++;
										}
										if (!local2499 && Static557.anInt9336 == 0) {
											Static578.aLongArray27[Static209.anInt4091] = local2497;
											Static209.anInt4091 = (Static209.anInt4091 + 1) % 100;
											@Pc(2556) String local2556 = Static183.aClass366_1.method7873(local2344).method6225(Static585.aClass1_Sub35_Sub2_2);
											if (local533 == 2) {
												Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local2556, 18, null, local2344);
											} else if (local533 == 1) {
												Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local2556, 18, null, local2344);
											} else {
												Static385.method5299(0, local417, local417, local501, local2556, 18, null, local2344);
											}
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static12.aClass235_158) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
										local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
										local230 = Static585.aClass1_Sub35_Sub2_2.method5804();
										if (Static497.method4926(local215)) {
											Static412.method5667(local75, local230);
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static574.aClass235_283 == Static504.aClass235_188) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
										if (Static497.method4926(local215)) {
											Static456.method6297();
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static4.aClass235_5 == Static504.aClass235_188) {
										Static498.anInt8553 = Static233.anInt8002;
										Static162.anInt2936 = 1;
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static477.aClass235_245) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
										local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local338 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local342 = Static585.aClass1_Sub35_Sub2_2.method5772();
										if (Static497.method4926(local215)) {
											Static438.method6094(local342, local75, local338, local230);
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static344.aClass235_189 == Static504.aClass235_188) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
										local75 = Static585.aClass1_Sub35_Sub2_2.method5765();
										if (Static497.method4926(local215)) {
											if (local75 == -1) {
												Static243.anInt4483 = -1;
												Static442.anInt7679 = -1;
											} else {
												local230 = local75 >> 14 & 0x3FFF;
												local338 = local75 & 0x3FFF;
												local230 -= Static541.anInt9058;
												local338 -= Static116.anInt2289;
												if (local230 < 0) {
													local230 = 0;
												} else if (Static71.anInt1410 <= local230) {
													local230 = Static71.anInt1410;
												}
												if (local338 < 0) {
													local338 = 0;
												} else if (local338 >= Static471.anInt8012) {
													local338 = Static471.anInt8012;
												}
												Static442.anInt7679 = (local230 << 9) + 256;
												Static243.anInt4483 = (local338 << 9) + 256;
											}
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static10.aClass235_10) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
										@Pc(2816) byte local2816 = Static585.aClass1_Sub35_Sub2_2.method5768();
										Static430.aClass321_1.method7093(local215, local2816);
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static200.aClass235_117) {
										local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
										local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
										local501 = local417;
										if (local493) {
											local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
										}
										local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
										local342 = Static585.aClass1_Sub35_Sub2_2.method5771();
										local2255 = false;
										if (local338 <= 1 && Static350.method4761(local501)) {
											local2255 = true;
										}
										if (!local2255 && Static557.anInt9336 == 0) {
											local818 = Static183.aClass366_1.method7873(local342).method6225(Static585.aClass1_Sub35_Sub2_2);
											if (local338 == 2) {
												Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local818, 25, null, local342);
											} else if (local338 == 1) {
												Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local818, 25, null, local342);
											} else {
												Static385.method5299(0, local417, local417, local501, local818, 25, null, local342);
											}
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static553.aClass235_276) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5804();
										Static1.aClass260_1 = Static362.aClass109_5.method2170(local215);
										Static504.aClass235_188 = null;
										return true;
									} else if (Static504.aClass235_188 == Static580.aClass235_288) {
										local215 = Static585.aClass1_Sub35_Sub2_2.method5738();
										local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
										local230 = Static585.aClass1_Sub35_Sub2_2.method5758();
										local338 = Static585.aClass1_Sub35_Sub2_2.method5783();
										if (Static497.method4926(local338)) {
											Static105.method1725(local230, local215, local75);
										}
										Static504.aClass235_188 = null;
										return true;
									} else if (Static459.aClass235_242 == Static504.aClass235_188) {
										Static398.anInt7013 = Static585.aClass1_Sub35_Sub2_2.method5766();
										Static274.aBoolean30 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
										Static504.aClass235_188 = null;
										return true;
									} else {
										@Pc(3080) int local3080;
										if (Static504.aClass235_188 == Static585.aClass235_292) {
											local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
											local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
											local501 = local417;
											if (local493) {
												local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
											}
											local1439 = Static585.aClass1_Sub35_Sub2_2.method5771();
											local1444 = Static585.aClass1_Sub35_Sub2_2.method5797();
											local533 = Static585.aClass1_Sub35_Sub2_2.method5750();
											@Pc(3076) long local3076 = local1444 + (local1439 << 32);
											@Pc(3078) boolean local3078 = false;
											local3080 = 0;
											while (true) {
												if (local3080 >= 100) {
													if (local533 <= 1) {
														if (Static274.aBoolean30 && !Static357.aBoolean467 || Static422.aBoolean573) {
															local3078 = true;
														} else if (Static350.method4761(local501)) {
															local3078 = true;
														}
													}
													break;
												}
												if (local3076 == Static578.aLongArray27[local3080]) {
													local3078 = true;
													break;
												}
												local3080++;
											}
											if (!local3078 && Static557.anInt9336 == 0) {
												Static578.aLongArray27[Static209.anInt4091] = local3076;
												Static209.anInt4091 = (Static209.anInt4091 + 1) % 100;
												@Pc(3145) String local3145 = Static93.method1618(Static68.method1213(Static585.aClass1_Sub35_Sub2_2));
												if (local533 == 2) {
													Static385.method5299(0, local417, "<img=1>" + local417, "<img=1>" + local501, local3145, 7, null, -1);
												} else if (local533 == 1) {
													Static385.method5299(0, local417, "<img=0>" + local417, "<img=0>" + local501, local3145, 7, null, -1);
												} else {
													Static385.method5299(0, local417, local417, local501, local3145, 3, null, -1);
												}
											}
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static509.aClass235_163) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5772();
											local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
											if (Static497.method4926(local75)) {
												Static439.method6099(local215, local501);
											}
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static42.aClass235_32) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
											local230 = Static585.aClass1_Sub35_Sub2_2.method5750();
											local338 = Static585.aClass1_Sub35_Sub2_2.method5771() << 2;
											local342 = Static585.aClass1_Sub35_Sub2_2.method5750();
											local344 = Static585.aClass1_Sub35_Sub2_2.method5750();
											if (Static497.method4926(local215)) {
												Static132.method2047(local230, local342, local338, local344, true, local75);
											}
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static397.aClass235_294) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
											Static430.aClass321_1.method7090(local75, local215);
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static197.aClass235_203) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5772();
											if (local215 == 65535) {
												local215 = -1;
											}
											local75 = Static585.aClass1_Sub35_Sub2_2.method5742();
											local230 = local75 >> 2;
											local338 = local75 & 0x3;
											local342 = Static305.anIntArray413[local230];
											local344 = Static585.aClass1_Sub35_Sub2_2.method5765();
											local1689 = local344 >> 28 & 0x3;
											local533 = local344 >> 14 & 0x3FFF;
											local2344 = local344 & 0x3FFF;
											local533 -= Static541.anInt9058;
											local2344 -= Static116.anInt2289;
											Static578.method7766(local230, local533, local342, local1689, local2344, local215, local338);
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static565.aClass235_286) {
											Static590.anInt9615 = Static585.aClass1_Sub35_Sub2_2.method5751() << 3;
											Static295.anInt5065 = Static585.aClass1_Sub35_Sub2_2.method5743() << 3;
											Static487.anInt8209 = Static585.aClass1_Sub35_Sub2_2.method5750();
											while (Static585.aClass1_Sub35_Sub2_2.anInt7214 < Static445.anInt7693) {
												@Pc(3408) Class316 local3408 = Static162.method2372()[Static585.aClass1_Sub35_Sub2_2.method5750()];
												Static30.method384(local3408);
											}
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static351.aClass235_195) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5772();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
											local332 = (local75 & 0x1) == 1;
											Static455.method6288(local215, local332);
											Static527.anIntArray672[Static96.anInt2012++ & 0x1F] = local215;
											Static504.aClass235_188 = null;
											return true;
										} else if (Static504.aClass235_188 == Static125.aClass235_84) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5739();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
											local230 = Static585.aClass1_Sub35_Sub2_2.method5750();
											local1632 = "";
											local782 = local1632;
											if ((local230 & 0x1) != 0) {
												local1632 = Static585.aClass1_Sub35_Sub2_2.method5760();
												if ((local230 & 0x2) == 0) {
													local782 = local1632;
												} else {
													local782 = Static585.aClass1_Sub35_Sub2_2.method5760();
												}
											}
											local511 = Static585.aClass1_Sub35_Sub2_2.method5760();
											if (local215 == 99) {
												Static165.method2388(local511);
											} else if (local782.equals("") || !Static350.method4761(local782)) {
												Static83.method1476(local215, local75, local782, local1632, local1632, local511);
											} else {
												Static504.aClass235_188 = null;
												return true;
											}
											Static504.aClass235_188 = null;
											return true;
										} else if (Static438.aClass235_231 == Static504.aClass235_188) {
											local215 = Static585.aClass1_Sub35_Sub2_2.method5765();
											local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
											local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
											if (local230 == 65535) {
												local230 = -1;
											}
											if (Static497.method4926(local75)) {
												Static254.method3725(1, local215, local230, -1);
											}
											Static504.aClass235_188 = null;
											return true;
										} else {
											@Pc(3608) Class1_Sub44 local3608;
											if (Static504.aClass235_188 == Static102.aClass235_66) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5737();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5783();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5737();
												if (Static497.method4926(local75)) {
													@Pc(3601) Class1_Sub44 local3601 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local215);
													local3608 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local230);
													if (local3608 != null) {
														Static157.method2283(false, local3601 == null || local3608.anInt7685 != local3601.anInt7685, local3608);
													}
													if (local3601 != null) {
														local3601.method7859();
														Static78.aClass187_8.method3795(local3601, (long) local230);
													}
													@Pc(3639) Class341 local3639 = Static350.method4758(local215);
													if (local3639 != null) {
														Static442.method6111(local3639);
													}
													local3639 = Static350.method4758(local230);
													if (local3639 != null) {
														Static442.method6111(local3639);
														Static417.method6106(local3639, true);
													}
													if (Static422.anInt7311 != -1) {
														Static474.method7346(1, Static422.anInt7311);
													}
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static592.aClass235_295 == Static504.aClass235_188) {
												Static424.method5868(false);
												Static504.aClass235_188 = null;
												return false;
											} else if (Static504.aClass235_188 == Static402.aClass235_211) {
												local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
												@Pc(3698) byte[] local3698 = new byte[Static445.anInt7693 - 1];
												Static585.aClass1_Sub35_Sub2_2.method5800(local3698, Static445.anInt7693 - 1);
												Static29.method349(local3698, local493);
												Static504.aClass235_188 = null;
												return true;
											} else if (Static528.aClass235_264 == Static504.aClass235_188) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
												@Pc(3724) int[] local3724 = new int[4];
												for (local230 = 0; local230 < 4; local230++) {
													local3724[local230] = Static585.aClass1_Sub35_Sub2_2.method5771();
												}
												local338 = Static585.aClass1_Sub35_Sub2_2.method5793();
												@Pc(3751) Class1_Sub42 local3751 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local215);
												if (local3751 != null) {
													Static496.method6893(local3751.aClass8_Sub3_Sub3_Sub1_Sub2_2, local3724, local338);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static330.aClass235_176) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5804();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
												if (Static497.method4926(local230)) {
													Static431.method6023(local215, local75);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static347.aClass235_191 == Static504.aClass235_188) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5772();
												if (Static497.method4926(local75)) {
													Static437.method6086(local230, local215);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static166.aClass235_102) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5804();
												if (Static497.method4926(local75)) {
													Static343.method4701(local230, local215);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static304.aClass235_160 == Static504.aClass235_188) {
												Static424.method5868(Static468.aBoolean615);
												Static504.aClass235_188 = null;
												return false;
											} else if (Static290.aClass235_152 == Static504.aClass235_188) {
												Static259.anInt4650 = Static585.aClass1_Sub35_Sub2_2.method5738();
												Static504.aClass235_188 = null;
												Static127.anInt2535 = Static233.anInt8002;
												return true;
											} else if (Static504.aClass235_188 == Static486.aClass235_248) {
												Static30.method384(Static507.aClass316_13);
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static456.aClass235_239) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5804();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
												if (local230 == 65535) {
													local230 = -1;
												}
												if (Static497.method4926(local215)) {
													Static159.method2292(local230, local75);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static275.aClass235_144) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5737();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5783();
												if (local230 == 65535) {
													local230 = -1;
												}
												local338 = Static585.aClass1_Sub35_Sub2_2.method5804();
												if (Static497.method4926(local215)) {
													Static360.method4789(local75, local230, local338);
													@Pc(3967) Class245 local3967 = Static175.aClass114_4.method2217(local230);
													Static438.method6094(local3967.anInt6221, local75, local3967.anInt6173, local3967.anInt6205);
													Static206.method3268(local3967.anInt6214, local75, local3967.anInt6216, local3967.anInt6220);
												}
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static290.aClass235_153) {
												Static30.method384(Static188.aClass316_5);
												Static504.aClass235_188 = null;
												return true;
											} else if (Static504.aClass235_188 == Static353.aClass235_196) {
												local215 = Static585.aClass1_Sub35_Sub2_2.method5772();
												local75 = Static585.aClass1_Sub35_Sub2_2.method5765();
												local230 = Static585.aClass1_Sub35_Sub2_2.method5779();
												local338 = Static585.aClass1_Sub35_Sub2_2.method5737();
												if (Static497.method4926(local215)) {
													Static254.method3725(5, local75, local230, local338);
												}
												Static504.aClass235_188 = null;
												return true;
											} else {
												@Pc(4233) Class218 local4233;
												if (Static504.aClass235_188 == Static556.aClass235_277) {
													Static61.anInt1185 = Static233.anInt8002;
													if (Static445.anInt7693 == 0) {
														Static424.aString73 = null;
														Static301.aClass218Array1 = null;
														Static550.aString92 = null;
														Static482.anInt8105 = 0;
														Static504.aClass235_188 = null;
														return true;
													}
													Static424.aString73 = Static585.aClass1_Sub35_Sub2_2.method5760();
													local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
													if (local493) {
														Static585.aClass1_Sub35_Sub2_2.method5760();
													}
													@Pc(4078) long local4078 = Static585.aClass1_Sub35_Sub2_2.method5778();
													Static550.aString92 = Static91.method1613(local4078);
													Static6.aByte8 = Static585.aClass1_Sub35_Sub2_2.method5751();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
													if (local338 == 255) {
														Static504.aClass235_188 = null;
														return true;
													}
													Static482.anInt8105 = local338;
													@Pc(4102) Class218[] local4102 = new Class218[100];
													for (local344 = 0; local344 < Static482.anInt8105; local344++) {
														local4102[local344] = new Class218();
														local4102[local344].aString49 = Static585.aClass1_Sub35_Sub2_2.method5760();
														local493 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
														if (local493) {
															local4102[local344].aString47 = Static585.aClass1_Sub35_Sub2_2.method5760();
														} else {
															local4102[local344].aString47 = local4102[local344].aString49;
														}
														local4102[local344].aString50 = Static442.method6116(local4102[local344].aString47);
														local4102[local344].anInt5411 = Static585.aClass1_Sub35_Sub2_2.method5771();
														local4102[local344].aByte87 = Static585.aClass1_Sub35_Sub2_2.method5751();
														local4102[local344].aString48 = Static585.aClass1_Sub35_Sub2_2.method5760();
														if (local4102[local344].aString47.equals(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16)) {
															Static266.aByte70 = local4102[local344].aByte87;
														}
													}
													local2344 = Static482.anInt8105;
													while (local2344 > 0) {
														local2344--;
														local513 = true;
														for (local1453 = 0; local1453 < local2344; local1453++) {
															if (local4102[local1453].aString50.compareTo(local4102[local1453 + 1].aString50) > 0) {
																local4233 = local4102[local1453];
																local4102[local1453] = local4102[local1453 + 1];
																local4102[local1453 + 1] = local4233;
																local513 = false;
															}
														}
														if (local513) {
															break;
														}
													}
													Static504.aClass235_188 = null;
													Static301.aClass218Array1 = local4102;
													return true;
												} else if (Static161.aClass235_99 == Static504.aClass235_188) {
													Static30.method380(false);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static135.aClass235_92) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (local215 == 65535) {
														local215 = -1;
													}
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
													Static159.method2289(local215, local75, local230, local338);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static42.aClass235_33) {
													Static351.anInt5833 = Static585.aClass1_Sub35_Sub2_2.method5742();
													Static10.anInt136 = Static585.aClass1_Sub35_Sub2_2.method5750();
													Static504.aClass235_188 = null;
													return true;
												} else if (Static116.aClass235_74 == Static504.aClass235_188) {
													local1037 = Static585.aClass1_Sub35_Sub2_2.method5760();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local501 = Static183.aClass366_1.method7873(local75).method6225(Static585.aClass1_Sub35_Sub2_2);
													Static385.method5299(0, local1037, local1037, local1037, local501, 19, null, local75);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static514.aClass235_258 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5772();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5793();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5737();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5772();
													if (Static497.method4926(local215)) {
														local3608 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local230);
														if (local3608 != null) {
															Static157.method2283(false, local338 != local3608.anInt7685, local3608);
														}
														Static397.method7857(local75, local230, false, local338);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static131.aClass235_90) {
													for (local215 = 0; local215 < Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1.length; local215++) {
														if (Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local215] != null) {
															Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local215].anIntArray532 = null;
															Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local215].anInt6822 = -1;
														}
													}
													for (local75 = 0; local75 < Static35.anInt540; local75++) {
														Static466.aClass1_Sub42Array1[local75].aClass8_Sub3_Sub3_Sub1_Sub2_2.anIntArray532 = null;
														Static466.aClass1_Sub42Array1[local75].aClass8_Sub3_Sub3_Sub1_Sub2_2.anInt6822 = -1;
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static427.aClass235_220 == Static504.aClass235_188) {
													Static30.method384(Static292.aClass316_8);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static284.aClass235_148 == Static504.aClass235_188) {
													Static516.method7174();
													Static504.aClass235_188 = null;
													return false;
												} else if (Static143.aClass235_95 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (local215 == 65535) {
														local215 = -1;
													}
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
													Static255.method3727(local230, true, local338, local75, local215);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static339.aClass235_184) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5737();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (Static497.method4926(local75)) {
														Static254.method3725(5, local215, Static296.anInt5113, 0);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static86.aClass235_54 == Static504.aClass235_188) {
													Static30.method384(Static323.aClass316_10);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static52.aClass235_38 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local332 = (local75 & 0x1) == 1;
													Static371.method4993(local332, local215);
													local338 = Static585.aClass1_Sub35_Sub2_2.method5771();
													for (local342 = 0; local342 < local338; local342++) {
														local344 = Static585.aClass1_Sub35_Sub2_2.method5775();
														if (local344 == 255) {
															local344 = Static585.aClass1_Sub35_Sub2_2.method5765();
														}
														local1689 = Static585.aClass1_Sub35_Sub2_2.method5779();
														Static183.method2578(local1689 - 1, local215, local342, local332, local344);
													}
													Static527.anIntArray672[Static96.anInt2012++ & 0x1F] = local215;
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static570.aClass235_281) {
													Static30.method384(Static529.aClass316_15);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static48.aClass235_35 == Static504.aClass235_188) {
													Static317.method4385();
													Static504.aClass235_188 = null;
													return false;
												} else if (Static504.aClass235_188 == Static585.aClass235_293) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (Static497.method4926(local215) && Static578.aClass341ArrayArray2[local75] != null) {
														for (local342 = local230; local342 < local338; local342++) {
															local344 = Static585.aClass1_Sub35_Sub2_2.method5797();
															if (Static578.aClass341ArrayArray2[local75].length > local342 && Static578.aClass341ArrayArray2[local75][local342] != null) {
																Static578.aClass341ArrayArray2[local75][local342].anInt9292 = local344;
															}
														}
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static122.aClass235_79) {
													Static30.method384(Static101.aClass316_2);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static532.aClass235_268) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5804();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5783();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5779();
													if (Static497.method4926(local75)) {
														Static310.method4308(local215, local338 + (local230 << 16));
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static362.aClass235_119 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
													@Pc(4808) Object[] local4808 = new Object[local417.length() + 1];
													for (local338 = local417.length() - 1; local338 >= 0; local338--) {
														if (local417.charAt(local338) == 's') {
															local4808[local338 + 1] = Static585.aClass1_Sub35_Sub2_2.method5760();
														} else {
															local4808[local338 + 1] = Integer.valueOf(Static585.aClass1_Sub35_Sub2_2.method5804());
														}
													}
													local4808[0] = Integer.valueOf(Static585.aClass1_Sub35_Sub2_2.method5804());
													if (Static497.method4926(local215)) {
														@Pc(4868) Class1_Sub15 local4868 = new Class1_Sub15();
														local4868.anObjectArray1 = local4808;
														Static80.method1451(local4868);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static271.aClass235_143 == Static504.aClass235_188) {
													Static30.method384(Static32.aClass316_1);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static500.aClass235_273) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5772();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5782();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5772();
													local342 = Static585.aClass1_Sub35_Sub2_2.method5772();
													if (Static497.method4926(local338)) {
														Static254.method3725(7, local230, local75 << 16 | local342, local215);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static440.aClass235_232 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5737();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5775();
													Static427.anIntArray572[local230] = local215;
													Static52.anIntArray102[local230] = local75;
													Static524.anIntArray187[local230] = 1;
													local338 = Static387.anIntArray524[local230] - 1;
													for (local342 = 0; local342 < local338; local342++) {
														if (local215 >= Class234.anIntArray474[local342]) {
															Static524.anIntArray187[local230] = local342 + 2;
														}
													}
													Static514.anIntArray662[Static351.anInt5835++ & 0x1F] = local230;
													Static504.aClass235_188 = null;
													return true;
												} else if (Static586.aClass235_208 == Static504.aClass235_188) {
													if (Static237.method3602(Static216.anInt4135)) {
														Static388.anInt6676 = (int) ((float) Static585.aClass1_Sub35_Sub2_2.method5771() * 2.5F);
													} else {
														Static388.anInt6676 = Static585.aClass1_Sub35_Sub2_2.method5771() * 30;
													}
													Static127.anInt2535 = Static233.anInt8002;
													Static504.aClass235_188 = null;
													return true;
												} else if (Static135.aClass235_93 == Static504.aClass235_188) {
													local1037 = Static585.aClass1_Sub35_Sub2_2.method5760();
													local417 = Static93.method1618(Static68.method1213(Static585.aClass1_Sub35_Sub2_2));
													Static83.method1476(6, 0, local1037, local1037, local1037, local417);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static162.aClass235_100) {
													Static417.aClass23_7 = Static321.method4409(Static585.aClass1_Sub35_Sub2_2.method5750());
													Static504.aClass235_188 = null;
													return true;
												} else if (Static442.aClass235_234 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5783();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5772();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local342 = Static585.aClass1_Sub35_Sub2_2.method5737();
													local2255 = (local338 & 0x80) != 0;
													if (local342 >> 30 == 0) {
														@Pc(5270) Class60 local5270;
														@Pc(5329) Class290 local5329;
														@Pc(5290) Class290 local5290;
														if (local342 >> 29 != 0) {
															local1689 = local342 & 0xFFFF;
															@Pc(5229) Class1_Sub42 local5229 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local1689);
															if (local5229 != null) {
																if (local215 == 65535) {
																	local215 = -1;
																}
																@Pc(5241) Class8_Sub3_Sub3_Sub1_Sub2 local5241 = local5229.aClass8_Sub3_Sub3_Sub1_Sub2_2;
																@Pc(5243) boolean local5243 = true;
																local2022 = local2255 ? local5241.anInt6782 : local5241.anInt6830;
																if (local215 != -1 && local2022 != -1) {
																	if (local2022 == local215) {
																		local5270 = Static107.aClass200_3.method3956(local215);
																		if (local5270.aBoolean111 && local5270.anInt1383 != -1) {
																			local5329 = Static192.aClass211_1.method4277(local5270.anInt1383);
																			local1463 = local5329.anInt7801;
																			if (local1463 == 0 || local1463 == 2) {
																				local5243 = false;
																			} else if (local1463 == 1) {
																				local5243 = true;
																			}
																		}
																	} else {
																		local5270 = Static107.aClass200_3.method3956(local215);
																		@Pc(5275) Class60 local5275 = Static107.aClass200_3.method3956(local2022);
																		if (local5270.anInt1383 != -1 && local5275.anInt1383 != -1) {
																			local5290 = Static192.aClass211_1.method4277(local5270.anInt1383);
																			@Pc(5296) Class290 local5296 = Static192.aClass211_1.method4277(local5275.anInt1383);
																			if (local5296.anInt7802 > local5290.anInt7802) {
																				local5243 = false;
																			}
																		}
																	}
																}
																if (local5243) {
																	if (local2255) {
																		local5241.anInt6848 = 1;
																		local5241.anInt6855 = local75;
																		local5241.anInt6784 = local230 + Static301.anInt5197;
																		local5241.anInt6782 = local215;
																		local5241.anInt6807 = 0;
																		local5241.anInt6833 = local338 & 0x7;
																		local5241.anInt6838 = 0;
																		if (Static301.anInt5197 < local5241.anInt6784) {
																			local5241.anInt6807 = -1;
																		}
																		if (local5241.anInt6782 != -1 && local5241.anInt6784 == Static301.anInt5197) {
																			local3080 = Static107.aClass200_3.method3956(local5241.anInt6782).anInt1383;
																			if (local3080 != -1) {
																				local5329 = Static192.aClass211_1.method4277(local3080);
																				if (local5329 != null && local5329.anIntArray604 != null) {
																					Static137.method2090(local5329, local5241.anInt9365, 0, false, local5241.anInt9370, local5241.aByte123);
																				}
																			}
																		}
																	} else {
																		local5241.anInt6802 = 0;
																		local5241.anInt6787 = local75;
																		local5241.anInt6786 = local338 & 0x7;
																		local5241.anInt6801 = 0;
																		local5241.anInt6830 = local215;
																		local5241.anInt6775 = 1;
																		local5241.anInt6797 = local230 + Static301.anInt5197;
																		if (Static301.anInt5197 < local5241.anInt6797) {
																			local5241.anInt6801 = -1;
																		}
																		if (local5241.anInt6830 != -1 && Static301.anInt5197 == local5241.anInt6797) {
																			local3080 = Static107.aClass200_3.method3956(local5241.anInt6830).anInt1383;
																			if (local3080 != -1) {
																				local5329 = Static192.aClass211_1.method4277(local3080);
																				if (local5329 != null && local5329.anIntArray604 != null) {
																					Static137.method2090(local5329, local5241.anInt9365, 0, false, local5241.anInt9370, local5241.aByte123);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local342 >> 28 != 0) {
															local1689 = local342 & 0xFFFF;
															@Pc(5526) Class8_Sub3_Sub3_Sub1_Sub1 local5526;
															if (Static296.anInt5113 == local1689) {
																local5526 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1;
															} else {
																local5526 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local1689];
															}
															if (local5526 != null) {
																if (local215 == 65535) {
																	local215 = -1;
																}
																local571 = true;
																local1453 = local2255 ? local5526.anInt6782 : local5526.anInt6830;
																@Pc(5582) Class290 local5582;
																if (local215 != -1 && local1453 != -1) {
																	@Pc(5568) Class60 local5568;
																	if (local1453 == local215) {
																		local5568 = Static107.aClass200_3.method3956(local215);
																		if (local5568.aBoolean111 && local5568.anInt1383 != -1) {
																			local5582 = Static192.aClass211_1.method4277(local5568.anInt1383);
																			local2501 = local5582.anInt7801;
																			if (local2501 == 0 || local2501 == 2) {
																				local571 = false;
																			} else if (local2501 == 1) {
																				local571 = true;
																			}
																		}
																	} else {
																		local5568 = Static107.aClass200_3.method3956(local215);
																		local5270 = Static107.aClass200_3.method3956(local1453);
																		if (local5568.anInt1383 != -1 && local5270.anInt1383 != -1) {
																			local5329 = Static192.aClass211_1.method4277(local5568.anInt1383);
																			local5290 = Static192.aClass211_1.method4277(local5270.anInt1383);
																			if (local5329.anInt7802 < local5290.anInt7802) {
																				local571 = false;
																			}
																		}
																	}
																}
																if (local571) {
																	if (local2255) {
																		local5526.anInt6807 = 0;
																		local5526.anInt6782 = local215;
																		local5526.anInt6838 = 0;
																		local5526.anInt6784 = local230 + Static301.anInt5197;
																		local5526.anInt6833 = local338 & 0x7;
																		local5526.anInt6855 = local75;
																		local5526.anInt6848 = 1;
																		if (local5526.anInt6782 == 65535) {
																			local5526.anInt6782 = -1;
																		}
																		if (Static301.anInt5197 < local5526.anInt6784) {
																			local5526.anInt6807 = -1;
																		}
																		if (local5526.anInt6782 != -1 && Static301.anInt5197 == local5526.anInt6784) {
																			local2022 = Static107.aClass200_3.method3956(local5526.anInt6782).anInt1383;
																			if (local2022 != -1) {
																				local5582 = Static192.aClass211_1.method4277(local2022);
																				if (local5582 != null && local5582.anIntArray604 != null) {
																					Static137.method2090(local5582, local5526.anInt9365, 0, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == local5526, local5526.anInt9370, local5526.aByte123);
																				}
																			}
																		}
																	} else {
																		local5526.anInt6802 = 0;
																		local5526.anInt6801 = 0;
																		local5526.anInt6787 = local75;
																		local5526.anInt6786 = local338 & 0x7;
																		local5526.anInt6797 = local230 + Static301.anInt5197;
																		local5526.anInt6830 = local215;
																		local5526.anInt6775 = 1;
																		if (Static301.anInt5197 < local5526.anInt6797) {
																			local5526.anInt6801 = -1;
																		}
																		if (local5526.anInt6830 == 65535) {
																			local5526.anInt6830 = -1;
																		}
																		if (local5526.anInt6830 != -1 && Static301.anInt5197 == local5526.anInt6797) {
																			local2022 = Static107.aClass200_3.method3956(local5526.anInt6830).anInt1383;
																			if (local2022 != -1) {
																				local5582 = Static192.aClass211_1.method4277(local2022);
																				if (local5582 != null && local5582.anIntArray604 != null) {
																					Static137.method2090(local5582, local5526.anInt9365, 0, local5526 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, local5526.anInt9370, local5526.aByte123);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local1689 = local342 >> 28 & 0x3;
														local533 = (local342 >> 14 & 0x3FFF) - Static541.anInt9058;
														local2344 = (local342 & 0x3FFF) - Static116.anInt2289;
														if (local533 >= 0 && local2344 >= 0 && Static71.anInt1410 > local533 && Static471.anInt8012 > local2344) {
															local1453 = local533 * 512 + 256;
															local2022 = local2344 * 512 + 256;
															local3080 = local1689;
															if (local1689 < 3 && Static466.method6426(local2344, local533)) {
																local3080 = local1689 + 1;
															}
															@Pc(5205) Class8_Sub3_Sub3_Sub3 local5205 = new Class8_Sub3_Sub3_Sub3(local215, 0, Static301.anInt5197, local1689, local3080, local1453, Static66.method1191(local1453, local1689, local2022) - local75, local2022, local533, local533, local2344, local2344, local338 & 0x7);
															Static356.aClass353_42.method7679(new Class1_Sub6_Sub6(local5205));
														}
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static198.aClass235_116 == Static504.aClass235_188) {
													Static30.method384(Static195.aClass316_6);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static25.aClass235_17) {
													if (Static422.anInt7311 != -1) {
														Static474.method7346(0, Static422.anInt7311);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static434.aClass235_230 == Static504.aClass235_188) {
													Static430.aClass321_1.method7091();
													Static66.anInt1328 += 32;
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static418.aClass235_215) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5783();
													local501 = Static585.aClass1_Sub35_Sub2_2.method5760();
													if (Static497.method4926(local75)) {
														Static439.method6099(local215, local501);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static298.aClass235_157 == Static504.aClass235_188) {
													Static233.anInt7999 = Static585.aClass1_Sub35_Sub2_2.method5750();
													for (local215 = 0; local215 < Static233.anInt7999; local215++) {
														Static29.aStringArray4[local215] = Static585.aClass1_Sub35_Sub2_2.method5760();
														Static563.aStringArray39[local215] = Static585.aClass1_Sub35_Sub2_2.method5760();
														if (Static563.aStringArray39[local215].equals("")) {
															Static563.aStringArray39[local215] = Static29.aStringArray4[local215];
														}
														Static534.aStringArray37[local215] = Static585.aClass1_Sub35_Sub2_2.method5760();
														Static574.aStringArray41[local215] = Static585.aClass1_Sub35_Sub2_2.method5760();
														if (Static574.aStringArray41[local215].equals("")) {
															Static574.aStringArray41[local215] = Static534.aStringArray37[local215];
														}
														Static469.aBooleanArray18[local215] = false;
													}
													Static498.anInt8553 = Static233.anInt8002;
													Static504.aClass235_188 = null;
													return true;
												} else if (Static408.aClass235_213 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5737();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5769();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5779();
													if (Static497.method4926(local230)) {
														Static426.method5888(local75, local215);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static47.aClass235_34 == Static504.aClass235_188) {
													Static30.method384(Static202.aClass316_7);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static229.aClass235_127 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5779();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5793();
													Static430.aClass321_1.method7090(local75, local215);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static87.aClass235_165) {
													Static498.aString86 = Static445.anInt7693 > 2 ? Static585.aClass1_Sub35_Sub2_2.method5760() : Static568.aClass351_30.method7651(Static307.anInt5279);
													Static185.anInt3263 = Static445.anInt7693 <= 0 ? -1 : Static585.aClass1_Sub35_Sub2_2.method5771();
													if (Static185.anInt3263 == 65535) {
														Static185.anInt3263 = -1;
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static541.aClass235_272 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													if (Static497.method4926(local215)) {
														Static30.anInt456 = local75;
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static125.aClass235_85 == Static504.aClass235_188) {
													local1037 = Static585.aClass1_Sub35_Sub2_2.method5760();
													local332 = Static585.aClass1_Sub35_Sub2_2.method5750() == 1;
													if (local332) {
														local417 = Static585.aClass1_Sub35_Sub2_2.method5760();
													} else {
														local417 = local1037;
													}
													local338 = Static585.aClass1_Sub35_Sub2_2.method5771();
													@Pc(6126) byte local6126 = Static585.aClass1_Sub35_Sub2_2.method5751();
													local2255 = false;
													if (local6126 == -128) {
														local2255 = true;
													}
													if (local2255) {
														if (Static482.anInt8105 == 0) {
															Static504.aClass235_188 = null;
															return true;
														}
														for (local1689 = 0; Static482.anInt8105 > local1689 && (!Static301.aClass218Array1[local1689].aString47.equals(local417) || Static301.aClass218Array1[local1689].anInt5411 != local338); local1689++) {
														}
														if (local1689 < Static482.anInt8105) {
															while (Static482.anInt8105 - 1 > local1689) {
																Static301.aClass218Array1[local1689] = Static301.aClass218Array1[local1689 + 1];
																local1689++;
															}
															Static482.anInt8105--;
															Static301.aClass218Array1[Static482.anInt8105] = null;
														}
													} else {
														local818 = Static585.aClass1_Sub35_Sub2_2.method5760();
														local4233 = new Class218();
														local4233.aString47 = local417;
														local4233.aString49 = local1037;
														local4233.aString50 = Static442.method6116(local4233.aString47);
														local4233.aByte87 = local6126;
														local4233.anInt5411 = local338;
														local4233.aString48 = local818;
														for (local2344 = Static482.anInt8105 - 1; local2344 >= 0; local2344--) {
															local1453 = Static301.aClass218Array1[local2344].aString50.compareTo(local4233.aString50);
															if (local1453 == 0) {
																Static301.aClass218Array1[local2344].anInt5411 = local338;
																Static301.aClass218Array1[local2344].aByte87 = local6126;
																Static301.aClass218Array1[local2344].aString48 = local818;
																if (local417.equals(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16)) {
																	Static266.aByte70 = local6126;
																}
																Static61.anInt1185 = Static233.anInt8002;
																Static504.aClass235_188 = null;
																return true;
															}
															if (local1453 < 0) {
																break;
															}
														}
														if (Static482.anInt8105 >= Static301.aClass218Array1.length) {
															Static504.aClass235_188 = null;
															return true;
														}
														for (local1453 = Static482.anInt8105 - 1; local1453 > local2344; local1453--) {
															Static301.aClass218Array1[local1453 + 1] = Static301.aClass218Array1[local1453];
														}
														if (Static482.anInt8105 == 0) {
															Static301.aClass218Array1 = new Class218[100];
														}
														Static301.aClass218Array1[local2344 + 1] = local4233;
														Static482.anInt8105++;
														if (local417.equals(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16)) {
															Static266.aByte70 = local6126;
														}
													}
													Static504.aClass235_188 = null;
													Static61.anInt1185 = Static233.anInt8002;
													return true;
												} else if (Static229.aClass235_126 == Static504.aClass235_188) {
													Static578.method7765(Static445.anInt7693, Static585.aClass1_Sub35_Sub2_2);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static107.aClass235_50) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5783();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5804();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5783();
													if (local338 == 65535) {
														local338 = -1;
													}
													local342 = Static585.aClass1_Sub35_Sub2_2.method5772();
													if (local342 == 65535) {
														local342 = -1;
													}
													if (Static497.method4926(local215)) {
														for (local344 = local342; local344 <= local338; local344++) {
															local974 = ((long) local230 << 32) + (long) local344;
															local980 = (Class1_Sub49) Static353.aClass187_25.method3797(local974);
															if (local980 != null) {
																local991 = new Class1_Sub49(local980.anInt9530, local75);
																local980.method7859();
															} else if (local344 == -1) {
																local991 = new Class1_Sub49(Static350.method4758(local230).aClass1_Sub49_2.anInt9530, local75);
															} else {
																local991 = new Class1_Sub49(0, local75);
															}
															Static353.aClass187_25.method3795(local991, local974);
														}
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static442.aClass235_233 == Static504.aClass235_188) {
													@Pc(6470) byte local6470 = Static585.aClass1_Sub35_Sub2_2.method5751();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5783();
													if (Static497.method4926(local75)) {
														Static343.method4701(local6470, local230);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static93.aClass235_61) {
													Static30.method384(Static394.aClass316_11);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static222.aClass235_125) {
													Static176.method2505();
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static315.aClass235_169) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5771();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local338 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local342 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local344 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (Static497.method4926(local215)) {
														Static227.aBooleanArray6[local75] = true;
														Static557.anIntArray709[local75] = local230;
														Static513.anIntArray659[local75] = local338;
														Static594.anIntArray739[local75] = local342;
														Static342.anIntArray465[local75] = local344;
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static493.aClass235_252 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5782();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5783();
													Static430.aClass321_1.method7093(local75, local215);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static93.aClass235_62) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5750();
													if (local215 == 255) {
														local75 = -1;
														local215 = -1;
													}
													Static513.method7133(local75, local215);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static499.aClass235_123 == Static504.aClass235_188) {
													Static47.method717(Static445.anInt7693, Static362.aClass109_5, Static585.aClass1_Sub35_Sub2_2);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static79.aClass235_48) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5750();
													if (Static585.aClass1_Sub35_Sub2_2.method5750() == 0) {
														Static22.aClass61Array1[local215] = new Class61();
													} else {
														Static585.aClass1_Sub35_Sub2_2.anInt7214--;
														Static22.aClass61Array1[local215] = new Class61(Static585.aClass1_Sub35_Sub2_2);
													}
													Static504.aClass235_188 = null;
													Static595.anInt9660 = Static233.anInt8002;
													return true;
												} else if (Static504.aClass235_188 == Static87.aClass235_164) {
													Static30.method384(Static188.aClass316_4);
													Static504.aClass235_188 = null;
													return true;
												} else if (Static504.aClass235_188 == Static428.aClass235_221) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5750();
													local75 = local215 >> 5;
													local230 = local215 & 0x1F;
													if (local230 == 0) {
														Static41.aClass154Array1[local75] = null;
														Static504.aClass235_188 = null;
														return true;
													}
													@Pc(6711) Class154 local6711 = new Class154();
													local6711.anInt4116 = local230;
													local6711.anInt4117 = Static585.aClass1_Sub35_Sub2_2.method5750();
													if (local6711.anInt4117 >= 0 && Static444.aClass22Array15.length > local6711.anInt4117) {
														if (local6711.anInt4116 == 1 || local6711.anInt4116 == 10) {
															local6711.anInt4115 = Static585.aClass1_Sub35_Sub2_2.method5771();
															Static585.aClass1_Sub35_Sub2_2.anInt7214 += 6;
														} else if (local6711.anInt4116 >= 2 && local6711.anInt4116 <= 6) {
															if (local6711.anInt4116 == 2) {
																local6711.anInt4120 = 256;
																local6711.anInt4114 = 256;
															}
															if (local6711.anInt4116 == 3) {
																local6711.anInt4114 = 256;
																local6711.anInt4120 = 0;
															}
															if (local6711.anInt4116 == 4) {
																local6711.anInt4114 = 256;
																local6711.anInt4120 = 512;
															}
															if (local6711.anInt4116 == 5) {
																local6711.anInt4120 = 256;
																local6711.anInt4114 = 0;
															}
															if (local6711.anInt4116 == 6) {
																local6711.anInt4114 = 512;
																local6711.anInt4120 = 256;
															}
															local6711.anInt4116 = 2;
															local6711.anInt4113 = Static585.aClass1_Sub35_Sub2_2.method5750();
															local6711.anInt4120 += Static585.aClass1_Sub35_Sub2_2.method5771() - Static541.anInt9058 << 9;
															local6711.anInt4114 += Static585.aClass1_Sub35_Sub2_2.method5771() - Static116.anInt2289 << 9;
															local6711.anInt4108 = Static585.aClass1_Sub35_Sub2_2.method5750() << 2;
															local6711.anInt4107 = Static585.aClass1_Sub35_Sub2_2.method5771();
														}
														local6711.anInt4118 = Static585.aClass1_Sub35_Sub2_2.method5771();
														if (local6711.anInt4118 == 65535) {
															local6711.anInt4118 = -1;
														}
														Static41.aClass154Array1[local75] = local6711;
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static364.aClass235_200 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5804();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5771();
													if (Static497.method4926(local75)) {
														Static254.method3725(3, local215, -1, -1);
													}
													Static504.aClass235_188 = null;
													return true;
												} else if (Static194.aClass235_113 == Static504.aClass235_188) {
													local215 = Static585.aClass1_Sub35_Sub2_2.method5772();
													local75 = Static585.aClass1_Sub35_Sub2_2.method5779();
													local230 = Static585.aClass1_Sub35_Sub2_2.method5742();
													if (Static497.method4926(local75)) {
														if (local230 == 2) {
															Static193.method2952();
														}
														Static422.anInt7311 = local215;
														Static520.method7227(local215);
														Static482.method6526(false);
														Static80.method1459(Static422.anInt7311);
														for (local338 = 0; local338 < 100; local338++) {
															Static166.aBooleanArray5[local338] = true;
														}
													}
													Static504.aClass235_188 = null;
													return true;
												} else {
													Static345.method4708(null, "T1 - " + (Static504.aClass235_188 == null ? -1 : Static504.aClass235_188.method4740()) + "," + (Static125.aClass235_83 == null ? -1 : Static125.aClass235_83.method4740()) + "," + (Static73.aClass235_31 == null ? -1 : Static73.aClass235_31.method4740()) + " - " + Static445.anInt7693);
													Static424.method5868(false);
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

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I")
	public static int method1098() {
		return 19;
	}
}
