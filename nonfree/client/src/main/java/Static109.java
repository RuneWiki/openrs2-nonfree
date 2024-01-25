import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "Lclient!qs;")
	public static Class172 aClass172_2;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_38 = new Class37(32);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	public static int anInt2092 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1757(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static90.anInt1705; local11++) {
			if (arg0.equalsIgnoreCase(Static222.aStringArray32[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static310.aStringArray38[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Z")
	public static boolean method1758() throws IOException {
		if (Static81.aClass202_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static81.aClass202_3.method5473();
		if (local13 == 0) {
			return false;
		}
		if (Static74.anInt1559 == -1) {
			Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, 1);
			Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
			Static74.anInt1559 = Static142.aClass1_Sub21_Sub2_1.method5758();
			Static237.anInt4904 = Static43.anIntArray66[Static74.anInt1559];
			local13--;
		}
		if (Static237.anInt4904 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, 1);
			Static237.anInt4904 = Static142.aClass1_Sub21_Sub2_1.aByteArray82[0] & 0xFF;
			local13--;
		}
		if (Static237.anInt4904 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, 2);
			Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
			Static237.anInt4904 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local13 -= 2;
		}
		if (Static237.anInt4904 > local13) {
			return false;
		}
		Static142.aClass1_Sub21_Sub2_1.anInt6611 = 0;
		Static81.aClass202_3.method5476(0, Static142.aClass1_Sub21_Sub2_1.aByteArray82, Static237.anInt4904);
		Static321.anInt6389 = 0;
		Static257.anInt5276 = Static48.anInt1219;
		Static48.anInt1219 = Static128.anInt3532;
		Static128.anInt3532 = Static74.anInt1559;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(132) int local132;
		@Pc(150) int local150;
		@Pc(152) int local152;
		if (Static74.anInt1559 == 11) {
			Static277.method4957();
			local122 = Static142.aClass1_Sub21_Sub2_1.method5743();
			local126 = Static142.aClass1_Sub21_Sub2_1.method5739();
			local132 = Static142.aClass1_Sub21_Sub2_1.method5727();
			Static26.anIntArray29[local132] = local126;
			Static174.anIntArray561[local132] = local122;
			Static157.anIntArray323[local132] = 1;
			local150 = Static89.anIntArray147[local132] - 1;
			for (local152 = 0; local152 < local150; local152++) {
				if (Class1_Sub25.anIntArray359[local152] <= local126) {
					Static157.anIntArray323[local132] = local152 + 2;
				}
			}
			Static165.anIntArray330[Static322.anInt6403++ & 0x1F] = local132;
			Static74.anInt1559 = -1;
			return true;
		}
		@Pc(224) Class1_Sub26 local224;
		if (Static74.anInt1559 == 242) {
			local122 = Static142.aClass1_Sub21_Sub2_1.method5735();
			local126 = Static142.aClass1_Sub21_Sub2_1.method5716();
			local132 = Static142.aClass1_Sub21_Sub2_1.method5728();
			if (Static142.method2378(local132)) {
				@Pc(217) Class1_Sub26 local217 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local126);
				local224 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local122);
				if (local224 != null) {
					Static140.method2316(false, local217 == null || local224.anInt3825 != local217.anInt3825, local224);
				}
				if (local217 != null) {
					local217.method5796();
					Static298.aClass207_35.method5552(local217, (long) local122);
				}
				@Pc(259) Class163 local259 = Static248.method22(local126);
				if (local259 != null) {
					Static340.method5639(local259);
				}
				local259 = Static248.method22(local122);
				if (local259 != null) {
					Static340.method5639(local259);
					Static154.method2689(local259, true);
				}
				if (Static129.anInt2569 != -1) {
					Static125.method2001(1, Static129.anInt2569);
				}
			}
			Static74.anInt1559 = -1;
			return true;
		}
		@Pc(332) int local332;
		@Pc(342) long local342;
		@Pc(363) Class1_Sub11 local363;
		@Pc(348) Class1_Sub11 local348;
		if (Static74.anInt1559 == 216) {
			local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
			local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
			if (local126 == 65535) {
				local126 = -1;
			}
			local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
			local150 = Static142.aClass1_Sub21_Sub2_1.method5735();
			local152 = Static142.aClass1_Sub21_Sub2_1.method5728();
			if (local152 == 65535) {
				local152 = -1;
			}
			if (Static142.method2378(local122)) {
				for (local332 = local126; local332 <= local152; local332++) {
					local342 = (long) local332 + ((long) local132 << 32);
					local348 = (Class1_Sub11) Static226.aClass207_33.method5555(local342);
					if (local348 != null) {
						local363 = new Class1_Sub11(local150, local348.anInt1310);
						local348.method5796();
					} else if (local332 == -1) {
						local363 = new Class1_Sub11(local150, Static248.method22(local132).aClass1_Sub11_2.anInt1310);
					} else {
						local363 = new Class1_Sub11(local150, -1);
					}
					Static226.aClass207_33.method5552(local363, local342);
				}
			}
			Static74.anInt1559 = -1;
			return true;
		} else if (Static74.anInt1559 == 236) {
			local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
			@Pc(409) byte local409 = Static142.aClass1_Sub21_Sub2_1.method5708();
			Static110.method1763(local409, local122);
			Static74.anInt1559 = -1;
			return true;
		} else {
			@Pc(452) int local452;
			@Pc(456) int local456;
			@Pc(460) int local460;
			if (Static74.anInt1559 == 42) {
				local122 = Static142.aClass1_Sub21_Sub2_1.method5735();
				local126 = local122 >> 28 & 0x3;
				local132 = local122 >> 14 & 0x3FFF;
				local150 = local122 & 0x3FFF;
				local152 = Static142.aClass1_Sub21_Sub2_1.method5727();
				local332 = local152 >> 2;
				local452 = local152 & 0x3;
				local456 = Static151.anIntArray300[local332];
				local460 = Static142.aClass1_Sub21_Sub2_1.method5733();
				if (local460 == 65535) {
					local460 = -1;
				}
				local132 -= Static92.anInt1755;
				local150 -= Static98.anInt1911;
				Static239.method2414(local456, local126, local460, local332, local452, local150, local132);
				Static74.anInt1559 = -1;
				return true;
			} else if (Static74.anInt1559 == 143) {
				local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
				local126 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local132 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local150 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local152 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local332 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (Static142.method2378(local122)) {
					Static68.aBooleanArray5[local126] = true;
					Static313.anIntArray626[local126] = local132;
					Static147.anIntArray296[local126] = local150;
					Static45.anIntArray70[local126] = local152;
					Static121.anIntArray393[local126] = local332;
				}
				Static74.anInt1559 = -1;
				return true;
			} else if (Static74.anInt1559 == 4) {
				local122 = Static142.aClass1_Sub21_Sub2_1.method5735();
				local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
				Static110.method1763(local122, local126);
				Static74.anInt1559 = -1;
				return true;
			} else if (Static74.anInt1559 == 23) {
				local122 = Static142.aClass1_Sub21_Sub2_1.method5712();
				local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
				local132 = Static142.aClass1_Sub21_Sub2_1.method5733();
				if (Static142.method2378(local126)) {
					Static219.method4037(local132, local122);
				}
				Static74.anInt1559 = -1;
				return true;
			} else if (Static74.anInt1559 == 6) {
				local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
				if (Static142.method2378(local122)) {
					Static43.method900();
				}
				Static74.anInt1559 = -1;
				return true;
			} else {
				@Pc(637) String local637;
				@Pc(635) String local635;
				@Pc(654) long local654;
				@Pc(649) long local649;
				@Pc(631) boolean local631;
				@Pc(659) long local659;
				@Pc(663) int local663;
				@Pc(736) String local736;
				if (Static74.anInt1559 == 117) {
					local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
					local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
					local637 = local635;
					if (local631) {
						local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
					}
					local649 = Static142.aClass1_Sub21_Sub2_1.method5704();
					local654 = Static142.aClass1_Sub21_Sub2_1.method5715();
					local659 = Static142.aClass1_Sub21_Sub2_1.method5705();
					local663 = Static142.aClass1_Sub21_Sub2_1.method5720();
					@Pc(669) long local669 = local659 + (local654 << 32);
					@Pc(671) boolean local671 = false;
					@Pc(673) int local673 = 0;
					while (true) {
						if (local673 >= 100) {
							if (local663 <= 1) {
								if (Static49.aBoolean438 && !Static152.aBoolean243 || Static339.aBoolean541) {
									local671 = true;
								} else if (method1757(local637)) {
									local671 = true;
								}
							}
							break;
						}
						if (Static24.aLongArray1[local673] == local669) {
							local671 = true;
							break;
						}
						local673++;
					}
					if (!local671 && Static327.anInt6425 == 0) {
						Static24.aLongArray1[Static120.anInt2341] = local669;
						Static120.anInt2341 = (Static120.anInt2341 + 1) % 100;
						local736 = Static214.method3965(Static355.method5868(Static303.method5264(Static142.aClass1_Sub21_Sub2_1)));
						if (local663 == 2 || local663 == 3) {
							Static110.method1761(Static271.method4880(local649), 9, local736, -1, 0, "<img=1>" + local637, "<img=1>" + local635);
						} else if (local663 == 1) {
							Static110.method1761(Static271.method4880(local649), 9, local736, -1, 0, "<img=0>" + local637, "<img=0>" + local635);
						} else {
							Static110.method1761(Static271.method4880(local649), 9, local736, -1, 0, local637, local635);
						}
					}
					Static74.anInt1559 = -1;
					return true;
				} else if (Static74.anInt1559 == 252) {
					local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
					if (Static142.method2378(local122)) {
						Static301.method5233();
					}
					Static74.anInt1559 = -1;
					return true;
				} else if (Static74.anInt1559 == 48) {
					local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
					local126 = Static142.aClass1_Sub21_Sub2_1.method5733();
					local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
					if (Static142.method2378(local126)) {
						Static144.method2581(local122, local132);
					}
					Static74.anInt1559 = -1;
					return true;
				} else if (Static74.anInt1559 == 240) {
					for (local122 = 0; local122 < Static81.anIntArray119.length; local122++) {
						if (Static326.anIntArray552[local122] != Static81.anIntArray119[local122]) {
							Static81.anIntArray119[local122] = Static326.anIntArray552[local122];
							Static131.method2205(local122);
							Static341.anIntArray663[Static204.anInt6781++ & 0x1F] = local122;
						}
					}
					Static74.anInt1559 = -1;
					return true;
				} else if (Static74.anInt1559 == 254) {
					local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
					local126 = Static142.aClass1_Sub21_Sub2_1.method5700();
					local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
					local150 = Static142.aClass1_Sub21_Sub2_1.method5712();
					if (Static142.method2378(local122)) {
						Static172.method3081(local132, local150, local126, 5);
					}
					Static74.anInt1559 = -1;
					return true;
				} else {
					@Pc(1113) boolean local1113;
					@Pc(1134) Class189 local1134;
					if (Static74.anInt1559 == 14) {
						Static355.anInt6789 = Static244.anInt6207;
						if (Static237.anInt4904 == 0) {
							Static336.aString255 = null;
							Static244.anInt6205 = 0;
							Static188.aClass189Array1 = null;
							Static74.anInt1559 = -1;
							Static86.aString64 = null;
							return true;
						}
						Static86.aString64 = Static142.aClass1_Sub21_Sub2_1.method5701();
						local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
						if (local631) {
							Static142.aClass1_Sub21_Sub2_1.method5701();
						}
						@Pc(992) long local992 = Static142.aClass1_Sub21_Sub2_1.method5704();
						Static336.aString255 = Static32.method512(local992);
						Static67.aByte13 = Static142.aClass1_Sub21_Sub2_1.method5721();
						local150 = Static142.aClass1_Sub21_Sub2_1.method5720();
						if (local150 == 255) {
							Static74.anInt1559 = -1;
							return true;
						}
						Static244.anInt6205 = local150;
						@Pc(1018) Class189[] local1018 = new Class189[100];
						for (local332 = 0; local332 < Static244.anInt6205; local332++) {
							local1018[local332] = new Class189();
							local1018[local332].aString224 = Static142.aClass1_Sub21_Sub2_1.method5701();
							local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
							if (local631) {
								local1018[local332].aString223 = Static142.aClass1_Sub21_Sub2_1.method5701();
							} else {
								local1018[local332].aString223 = local1018[local332].aString224;
							}
							local1018[local332].anInt5736 = Static142.aClass1_Sub21_Sub2_1.method5715();
							local1018[local332].aByte70 = Static142.aClass1_Sub21_Sub2_1.method5721();
							local1018[local332].aString225 = Static142.aClass1_Sub21_Sub2_1.method5701();
							if (local1018[local332].aString223.equals(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152)) {
								Static57.aByte12 = local1018[local332].aByte70;
							}
						}
						local460 = Static244.anInt6205;
						while (local460 > 0) {
							local1113 = true;
							local460--;
							for (local663 = 0; local663 < local460; local663++) {
								if (local1018[local663].aString224.compareTo(local1018[local663 + 1].aString224) > 0) {
									local1134 = local1018[local663];
									local1018[local663] = local1018[local663 + 1];
									local1113 = false;
									local1018[local663 + 1] = local1134;
								}
							}
							if (local1113) {
								break;
							}
						}
						Static74.anInt1559 = -1;
						Static188.aClass189Array1 = local1018;
						return true;
					} else if (Static74.anInt1559 == 165) {
						for (local122 = 0; local122 < Static202.aClass10_Sub1_Sub2_Sub2Array1.length; local122++) {
							if (Static202.aClass10_Sub1_Sub2_Sub2Array1[local122] != null) {
								Static202.aClass10_Sub1_Sub2_Sub2Array1[local122].anInt4026 = -1;
							}
						}
						for (local126 = 0; local126 < Static178.aClass10_Sub1_Sub2_Sub1Array1.length; local126++) {
							if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local126] != null) {
								Static178.aClass10_Sub1_Sub2_Sub1Array1[local126].anInt4026 = -1;
							}
						}
						Static74.anInt1559 = -1;
						return true;
					} else {
						@Pc(1227) String local1227;
						if (Static74.anInt1559 == 63) {
							local1227 = Static142.aClass1_Sub21_Sub2_1.method5701();
							@Pc(1238) boolean local1238 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
							if (local1238) {
								local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
							} else {
								local635 = local1227;
							}
							local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
							@Pc(1256) byte local1256 = Static142.aClass1_Sub21_Sub2_1.method5721();
							@Pc(1258) boolean local1258 = false;
							if (local1256 == -128) {
								local1258 = true;
							}
							if (local1258) {
								if (Static244.anInt6205 == 0) {
									Static74.anInt1559 = -1;
									return true;
								}
								for (local452 = 0; Static244.anInt6205 > local452 && (!Static188.aClass189Array1[local452].aString223.equals(local635) || Static188.aClass189Array1[local452].anInt5736 != local150); local452++) {
								}
								if (local452 < Static244.anInt6205) {
									while (local452 < Static244.anInt6205 - 1) {
										Static188.aClass189Array1[local452] = Static188.aClass189Array1[local452 + 1];
										local452++;
									}
									Static244.anInt6205--;
									Static188.aClass189Array1[Static244.anInt6205] = null;
								}
							} else {
								@Pc(1336) String local1336 = Static142.aClass1_Sub21_Sub2_1.method5701();
								local1134 = new Class189();
								local1134.aString225 = local1336;
								local1134.anInt5736 = local150;
								local1134.aString223 = local635;
								local1134.aString224 = local1227;
								local1134.aByte70 = local1256;
								for (local460 = Static244.anInt6205 - 1; local460 >= 0; local460--) {
									local663 = Static188.aClass189Array1[local460].aString223.compareTo(local1134.aString223);
									if (local663 == 0) {
										Static188.aClass189Array1[local460].anInt5736 = local150;
										Static188.aClass189Array1[local460].aByte70 = local1256;
										Static188.aClass189Array1[local460].aString225 = local1336;
										if (local635.equals(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152)) {
											Static57.aByte12 = local1256;
										}
										Static74.anInt1559 = -1;
										Static355.anInt6789 = Static244.anInt6207;
										return true;
									}
									if (local663 < 0) {
										break;
									}
								}
								if (Static244.anInt6205 >= Static188.aClass189Array1.length) {
									Static74.anInt1559 = -1;
									return true;
								}
								for (local663 = Static244.anInt6205 - 1; local663 > local460; local663--) {
									Static188.aClass189Array1[local663 + 1] = Static188.aClass189Array1[local663];
								}
								if (Static244.anInt6205 == 0) {
									Static188.aClass189Array1 = new Class189[100];
								}
								Static188.aClass189Array1[local460 + 1] = local1134;
								Static244.anInt6205++;
								if (local635.equals(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152)) {
									Static57.aByte12 = local1256;
								}
							}
							Static74.anInt1559 = -1;
							Static355.anInt6789 = Static244.anInt6207;
							return true;
						}
						@Pc(1504) String local1504;
						@Pc(1702) int local1702;
						@Pc(1671) int local1671;
						@Pc(1720) String local1720;
						@Pc(1756) String local1756;
						if (Static74.anInt1559 == 71) {
							local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
							local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
							local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
							local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
							local152 = Static142.aClass1_Sub21_Sub2_1.method5720();
							local1504 = "";
							local1113 = false;
							if (local150 > 0) {
								local1504 = Static142.aClass1_Sub21_Sub2_1.method5701();
								local1113 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
							}
							for (local456 = 0; local456 < Static295.anInt5953; local456++) {
								if (local631) {
									if (local637.equals(Static301.aStringArray36[local456])) {
										Static301.aStringArray36[local456] = local635;
										Static315.aStringArray39[local456] = local637;
										local635 = null;
										break;
									}
								} else if (local635.equals(Static301.aStringArray36[local456])) {
									if (Static311.anIntArray622[local456] != local150) {
										Static311.anIntArray622[local456] = local150;
										if (local150 > 0) {
											Static306.method5295(5, 0, "", local635 + Static161.aString123, "");
										}
										if (local150 == 0) {
											Static306.method5295(5, 0, "", local635 + Static163.aString124, "");
										}
									}
									Static315.aStringArray39[local456] = local637;
									Static355.aStringArray43[local456] = local1504;
									Static213.anIntArray421[local456] = local152;
									local635 = null;
									Static57.aBooleanArray4[local456] = local1113;
									break;
								}
							}
							if (local635 != null && Static295.anInt5953 < 200) {
								Static301.aStringArray36[Static295.anInt5953] = local635;
								Static315.aStringArray39[Static295.anInt5953] = local637;
								Static311.anIntArray622[Static295.anInt5953] = local150;
								Static355.aStringArray43[Static295.anInt5953] = local1504;
								Static213.anIntArray421[Static295.anInt5953] = local152;
								Static57.aBooleanArray4[Static295.anInt5953] = local1113;
								Static295.anInt5953++;
							}
							Static182.anInt3808 = Static244.anInt6207;
							local663 = Static295.anInt5953;
							while (local663 > 0) {
								local663--;
								@Pc(1669) boolean local1669 = true;
								for (local1671 = 0; local1671 < local663; local1671++) {
									if (Static311.anIntArray622[local1671] != Static35.anInt877 && Static311.anIntArray622[local1671 + 1] == Static35.anInt877 || Static311.anIntArray622[local1671] == 0 && Static311.anIntArray622[local1671 + 1] != 0) {
										local1702 = Static311.anIntArray622[local1671];
										Static311.anIntArray622[local1671] = Static311.anIntArray622[local1671 + 1];
										Static311.anIntArray622[local1671 + 1] = local1702;
										local1720 = Static355.aStringArray43[local1671];
										Static355.aStringArray43[local1671] = Static355.aStringArray43[local1671 + 1];
										Static355.aStringArray43[local1671 + 1] = local1720;
										local736 = Static301.aStringArray36[local1671];
										Static301.aStringArray36[local1671] = Static301.aStringArray36[local1671 + 1];
										Static301.aStringArray36[local1671 + 1] = local736;
										local1756 = Static315.aStringArray39[local1671];
										Static315.aStringArray39[local1671] = Static315.aStringArray39[local1671 + 1];
										Static315.aStringArray39[local1671 + 1] = local1756;
										@Pc(1774) int local1774 = Static213.anIntArray421[local1671];
										Static213.anIntArray421[local1671] = Static213.anIntArray421[local1671 + 1];
										Static213.anIntArray421[local1671 + 1] = local1774;
										@Pc(1792) boolean local1792 = Static57.aBooleanArray4[local1671];
										Static57.aBooleanArray4[local1671] = Static57.aBooleanArray4[local1671 + 1];
										local1669 = false;
										Static57.aBooleanArray4[local1671 + 1] = local1792;
									}
								}
								if (local1669) {
									break;
								}
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 170) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5739();
							local126 = Static142.aClass1_Sub21_Sub2_1.method5733();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5712();
							local150 = Static142.aClass1_Sub21_Sub2_1.method5712();
							if (Static142.method2378(local132)) {
								Static339.method5638(local122, local150 + (local126 << 16));
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 251) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5714();
							local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
							if (Static142.method2378(local126)) {
								Static30.method501(local132, local122);
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 196) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5720();
							if (Static142.aClass1_Sub21_Sub2_1.method5720() == 0) {
								Static345.aClass47Array1[local122] = new Class47();
							} else {
								Static142.aClass1_Sub21_Sub2_1.anInt6611--;
								Static345.aClass47Array1[local122] = new Class47(Static142.aClass1_Sub21_Sub2_1);
							}
							Static246.anInt5153 = Static244.anInt6207;
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 94) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5700();
							Static327.aClass193_8 = Static197.aClass215_5.method5653(local122);
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 175) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5728();
							if (local122 == 65535) {
								local122 = -1;
							}
							local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5739();
							if (Static142.method2378(local126)) {
								Static172.method3081(-1, local122, local132, 1);
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 92) {
							local1227 = Static142.aClass1_Sub21_Sub2_1.method5701();
							local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
							if (Static142.method2378(local126)) {
								Static47.method941(local1227, local132);
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 208) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5691();
							local126 = Static142.aClass1_Sub21_Sub2_1.method5735();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5719();
							local150 = Static142.aClass1_Sub21_Sub2_1.method5733();
							if (Static142.method2378(local150)) {
								Static176.method3146(local132, local122, local126);
							}
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 145) {
							local1227 = Static142.aClass1_Sub21_Sub2_1.method5701();
							local635 = Static214.method3965(Static355.method5868(Static303.method5264(Static142.aClass1_Sub21_Sub2_1)));
							Static306.method5295(6, 0, local1227, local635, local1227);
							Static74.anInt1559 = -1;
							return true;
						} else if (Static74.anInt1559 == 67) {
							local122 = Static142.aClass1_Sub21_Sub2_1.method5735();
							local126 = Static142.aClass1_Sub21_Sub2_1.method5733();
							local132 = Static142.aClass1_Sub21_Sub2_1.method5715();
							local150 = Static142.aClass1_Sub21_Sub2_1.method5733();
							if (local122 >> 30 == 0) {
								@Pc(2180) Class162 local2180;
								@Pc(2233) Class177 local2233;
								@Pc(2185) Class162 local2185;
								@Pc(2199) Class177 local2199;
								@Pc(2204) Class177 local2204;
								if (local122 >> 29 != 0) {
									local152 = local122 & 0xFFFF;
									@Pc(2343) Class10_Sub1_Sub2_Sub1 local2343 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local152];
									if (local2343 != null) {
										if (local132 == 65535) {
											local132 = -1;
										}
										local1113 = true;
										if (local132 != -1 && local2343.anInt4058 != -1) {
											if (local2343.anInt4058 == local132) {
												local2180 = Static264.method4763(local132);
												if (local2180.aBoolean394 && local2180.anInt4910 != -1) {
													local2233 = Static354.method5863(local2180.anInt4910);
													local663 = local2233.anInt5420;
													if (local663 == 0 || local663 == 2) {
														local1113 = false;
													} else if (local663 == 1) {
														local1113 = true;
													}
												}
											} else {
												local2180 = Static264.method4763(local132);
												local2185 = Static264.method4763(local2343.anInt4058);
												if (local2180.anInt4910 != -1 && local2185.anInt4910 != -1) {
													local2199 = Static354.method5863(local2180.anInt4910);
													local2204 = Static354.method5863(local2185.anInt4910);
													if (local2204.anInt5417 > local2199.anInt5417) {
														local1113 = false;
													}
												}
											}
										}
										if (local1113) {
											local2343.anInt4038 = 0;
											local2343.anInt4013 = 0;
											local2343.anInt4018 = 1;
											local2343.anInt4076 = local150 + Static282.anInt3516;
											local2343.anInt4058 = local132;
											local2343.anInt4070 = local126;
											if (local2343.anInt4076 > Static282.anInt3516) {
												local2343.anInt4038 = -1;
											}
											if (local2343.anInt4058 != -1 && Static282.anInt3516 == local2343.anInt4076) {
												local456 = Static264.method4763(local2343.anInt4058).anInt4910;
												if (local456 != -1) {
													local2233 = Static354.method5863(local456);
													if (local2233 != null && local2233.anIntArray529 != null) {
														Static351.method3417(local2343.anInt6726, false, local2343.anInt6728, 0, local2233);
													}
												}
											}
										}
									}
								} else if (local122 >> 28 != 0) {
									local152 = local122 & 0xFFFF;
									@Pc(2146) Class10_Sub1_Sub2_Sub2 local2146;
									if (local152 == Static301.anInt6030) {
										local2146 = Static127.aClass10_Sub1_Sub2_Sub2_1;
									} else {
										local2146 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local152];
									}
									if (local2146 != null) {
										if (local132 == 65535) {
											local132 = -1;
										}
										local1113 = true;
										if (local132 != -1 && local2146.anInt4058 != -1) {
											if (local132 == local2146.anInt4058) {
												local2180 = Static264.method4763(local132);
												if (local2180.aBoolean394 && local2180.anInt4910 != -1) {
													local2233 = Static354.method5863(local2180.anInt4910);
													local663 = local2233.anInt5420;
													if (local663 == 0 || local663 == 2) {
														local1113 = false;
													} else if (local663 == 1) {
														local1113 = true;
													}
												}
											} else {
												local2180 = Static264.method4763(local132);
												local2185 = Static264.method4763(local2146.anInt4058);
												if (local2180.anInt4910 != -1 && local2185.anInt4910 != -1) {
													local2199 = Static354.method5863(local2180.anInt4910);
													local2204 = Static354.method5863(local2185.anInt4910);
													if (local2199.anInt5417 < local2204.anInt5417) {
														local1113 = false;
													}
												}
											}
										}
										if (local1113) {
											local2146.anInt4013 = 0;
											local2146.anInt4076 = local150 + Static282.anInt3516;
											local2146.anInt4058 = local132;
											local2146.anInt4038 = 0;
											local2146.anInt4018 = 1;
											local2146.anInt4070 = local126;
											if (local2146.anInt4058 == 65535) {
												local2146.anInt4058 = -1;
											}
											if (Static282.anInt3516 < local2146.anInt4076) {
												local2146.anInt4038 = -1;
											}
											if (local2146.anInt4058 != -1 && local2146.anInt4076 == Static282.anInt3516) {
												local456 = Static264.method4763(local2146.anInt4058).anInt4910;
												if (local456 != -1) {
													local2233 = Static354.method5863(local456);
													if (local2233 != null && local2233.anIntArray529 != null) {
														Static351.method3417(local2146.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == local2146, local2146.anInt6728, 0, local2233);
													}
												}
											}
										}
									}
								}
							} else {
								local152 = local122 >> 28 & 0x3;
								local332 = (local122 >> 14 & 0x3FFF) - Static92.anInt1755;
								local452 = (local122 & 0x3FFF) - Static98.anInt1911;
								if (local332 >= 0 && local452 >= 0 && local332 < Static43.anInt1151 && Static260.anInt5348 > local452) {
									local456 = local332 * 128 + 64;
									local460 = local452 * 128 + 64;
									@Pc(2594) Class10_Sub1_Sub5 local2594 = new Class10_Sub1_Sub5(local132, 0, Static282.anInt3516, local152, local456, Static352.method5834(local460, local456, local152) - local126, local460, local332, local332, local452, local452);
									Static35.aClass14_2.method300(new Class1_Sub2_Sub9(local2594));
								}
							}
							Static74.anInt1559 = -1;
							return true;
						} else {
							@Pc(2622) String local2622;
							@Pc(2624) String local2624;
							if (Static74.anInt1559 == 45) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5699();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5716();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5720();
								local2622 = "";
								local2624 = local2622;
								if ((local132 & 0x1) != 0) {
									local2622 = Static142.aClass1_Sub21_Sub2_1.method5701();
									if ((local132 & 0x2) == 0) {
										local2624 = local2622;
									} else {
										local2624 = Static142.aClass1_Sub21_Sub2_1.method5701();
									}
								}
								local1504 = Static142.aClass1_Sub21_Sub2_1.method5701();
								if (local122 == 99) {
									Static34.method594(local1504);
								} else if (local2624.equals("") || !method1757(local2624)) {
									Static306.method5295(local122, local126, local2624, local1504, local2622);
								} else {
									Static74.anInt1559 = -1;
									return true;
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 18) {
								local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
								local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
								local637 = local635;
								if (local631) {
									local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
								}
								local649 = Static142.aClass1_Sub21_Sub2_1.method5704();
								local654 = Static142.aClass1_Sub21_Sub2_1.method5715();
								local659 = Static142.aClass1_Sub21_Sub2_1.method5705();
								local663 = Static142.aClass1_Sub21_Sub2_1.method5720();
								local1671 = Static142.aClass1_Sub21_Sub2_1.method5715();
								@Pc(2737) long local2737 = (local654 << 32) + local659;
								@Pc(2739) boolean local2739 = false;
								@Pc(2741) int local2741 = 0;
								while (true) {
									if (local2741 >= 100) {
										if (local663 <= 1 && method1757(local637)) {
											local2739 = true;
										}
										break;
									}
									if (local2737 == Static24.aLongArray1[local2741]) {
										local2739 = true;
										break;
									}
									local2741++;
								}
								if (!local2739 && Static327.anInt6425 == 0) {
									Static24.aLongArray1[Static120.anInt2341] = local2737;
									Static120.anInt2341 = (Static120.anInt2341 + 1) % 100;
									local1756 = Static106.method1656(local1671).method880(Static142.aClass1_Sub21_Sub2_1);
									if (local663 == 2) {
										Static110.method1761(Static271.method4880(local649), 20, local1756, local1671, 0, "<img=1>" + local637, "<img=1>" + local635);
									} else if (local663 == 1) {
										Static110.method1761(Static271.method4880(local649), 20, local1756, local1671, 0, "<img=0>" + local637, "<img=0>" + local635);
									} else {
										Static110.method1761(Static271.method4880(local649), 20, local1756, local1671, 0, local637, local635);
									}
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 211) {
								Static90.anInt1705 = Static142.aClass1_Sub21_Sub2_1.method5720();
								for (local122 = 0; local122 < Static90.anInt1705; local122++) {
									Static61.aStringArray7[local122] = Static142.aClass1_Sub21_Sub2_1.method5701();
									Static222.aStringArray32[local122] = Static142.aClass1_Sub21_Sub2_1.method5701();
									if (Static222.aStringArray32[local122].equals("")) {
										Static222.aStringArray32[local122] = Static61.aStringArray7[local122];
									}
									Static327.aStringArray41[local122] = Static142.aClass1_Sub21_Sub2_1.method5701();
									Static310.aStringArray38[local122] = Static142.aClass1_Sub21_Sub2_1.method5701();
									if (Static310.aStringArray38[local122].equals("")) {
										Static310.aStringArray38[local122] = Static327.aStringArray41[local122];
									}
									Static154.aBooleanArray14[local122] = false;
								}
								Static182.anInt3808 = Static244.anInt6207;
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 188) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5728();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5700();
								if (Static142.method2378(local122)) {
									Static172.method3081(-1, -1, local126, 3);
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 78) {
								if (Static291.aFrame1 != null) {
									Static146.method4165(Static25.anInt449, false, -1, -1);
								}
								@Pc(2997) byte[] local2997 = new byte[Static237.anInt4904];
								Static142.aClass1_Sub21_Sub2_1.method5766(Static237.anInt4904, local2997);
								local635 = Static333.method5566(0, Static237.anInt4904, local2997);
								Static47.method942(Static197.aClass215_5, Static24.anInt437 == 1, local635, true);
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 229) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5735();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5728();
								if (Static142.method2378(local132)) {
									Static264.method4767(local122, local126);
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 153) {
								Static214.method3962();
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 30) {
								Static277.method4957();
								Static309.anInt6156 = Static142.aClass1_Sub21_Sub2_1.method5720();
								Static74.anInt1559 = -1;
								Static342.anInt2475 = Static244.anInt6207;
								return true;
							} else if (Static74.anInt1559 == 35) {
								Static67.anInt1458 = Static142.aClass1_Sub21_Sub2_1.method5728() * 30;
								Static342.anInt2475 = Static244.anInt6207;
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 154) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5720();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5720();
								if (local122 == 255) {
									local122 = -1;
									local126 = -1;
								}
								Static195.method5820(local122, local126);
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 101) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
								if (local122 == 65535) {
									local122 = -1;
								}
								local126 = Static142.aClass1_Sub21_Sub2_1.method5720();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5715();
								local150 = Static142.aClass1_Sub21_Sub2_1.method5720();
								Static83.method1323(local132, local122, local126, local150);
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 233) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5700();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
								if (local126 == 65535) {
									local126 = -1;
								}
								local132 = Static142.aClass1_Sub21_Sub2_1.method5733();
								local150 = Static142.aClass1_Sub21_Sub2_1.method5728();
								if (local150 == 65535) {
									local150 = -1;
								}
								local152 = Static142.aClass1_Sub21_Sub2_1.method5733();
								if (Static142.method2378(local132)) {
									for (local332 = local126; local332 <= local150; local332++) {
										local342 = (long) local332 + ((long) local122 << 32);
										local348 = (Class1_Sub11) Static226.aClass207_33.method5555(local342);
										if (local348 != null) {
											local363 = new Class1_Sub11(local348.anInt1311, local152);
											local348.method5796();
										} else if (local332 == -1) {
											local363 = new Class1_Sub11(Static248.method22(local122).aClass1_Sub11_2.anInt1311, local152);
										} else {
											local363 = new Class1_Sub11(0, local152);
										}
										Static226.aClass207_33.method5552(local363, local342);
									}
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 121) {
								Static324.method5503();
								Static74.anInt1559 = -1;
								return false;
							} else if (Static74.anInt1559 == 33) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
								local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5712();
								if (Static142.method2378(local122)) {
									Static30.method503(local635, local132);
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 96) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
								local150 = Static142.aClass1_Sub21_Sub2_1.method5733();
								local152 = Static142.aClass1_Sub21_Sub2_1.method5715();
								if (Static142.method2378(local150)) {
									Static245.method824(local126, local152, local122, local132);
								}
								Static74.anInt1559 = -1;
								return true;
							} else if (Static74.anInt1559 == 157) {
								local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
								local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
								local132 = Static142.aClass1_Sub21_Sub2_1.method5715();
								local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
								if (Static142.method2378(local122) && Static313.aClass163ArrayArray1[local126] != null) {
									for (local152 = local132; local152 < local150; local152++) {
										local332 = Static142.aClass1_Sub21_Sub2_1.method5705();
										if (local152 < Static313.aClass163ArrayArray1[local126].length && Static313.aClass163ArrayArray1[local126][local152] != null) {
											Static313.aClass163ArrayArray1[local126][local152].anInt4915 = local332;
										}
									}
								}
								Static74.anInt1559 = -1;
								return true;
							} else {
								@Pc(3441) Class163 local3441;
								if (Static74.anInt1559 == 99) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5716();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
									if (local122 < -70000) {
										local126 += 32768;
									}
									if (local122 >= 0) {
										local3441 = Static248.method22(local122);
									} else {
										local3441 = null;
									}
									while (Static237.anInt4904 > Static142.aClass1_Sub21_Sub2_1.anInt6611) {
										local150 = Static142.aClass1_Sub21_Sub2_1.method5699();
										local152 = Static142.aClass1_Sub21_Sub2_1.method5715();
										local332 = 0;
										if (local152 != 0) {
											local332 = Static142.aClass1_Sub21_Sub2_1.method5720();
											if (local332 == 255) {
												local332 = Static142.aClass1_Sub21_Sub2_1.method5716();
											}
										}
										if (local3441 != null && local150 >= 0 && local150 < local3441.anIntArray461.length) {
											local3441.anIntArray461[local150] = local152;
											local3441.anIntArray460[local150] = local332;
										}
										Static191.method3367(local332, local150, local152 - 1, local126);
									}
									if (local3441 != null) {
										Static340.method5639(local3441);
									}
									Static277.method4957();
									Static217.anIntArray57[Static246.anInt5159++ & 0x1F] = local126 & 0x7FFF;
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 205) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
									if (local122 == 65535) {
										local122 = -1;
									}
									local126 = Static142.aClass1_Sub21_Sub2_1.method5700();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5728();
									if (Static142.method2378(local132)) {
										Static172.method3081(-1, local122, local126, 2);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 50) {
									Static219.method4036(Static197.aClass215_5, Static142.aClass1_Sub21_Sub2_1, Static237.anInt4904);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 128) {
									Static96.method1528(false);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 127) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5700();
									local150 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local152 = Static142.aClass1_Sub21_Sub2_1.method5712();
									if (Static142.method2378(local150)) {
										Static172.method3081(local152, local122 | local126 << 16, local132, 7);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 81) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5739();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5720();
									if (Static142.method2378(local126)) {
										Static348.method5330(local122, local132);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 40) {
									local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
									local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local637 = local635;
									if (local631) {
										local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
									}
									local649 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local654 = Static142.aClass1_Sub21_Sub2_1.method5705();
									local456 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local460 = Static142.aClass1_Sub21_Sub2_1.method5715();
									@Pc(3718) long local3718 = (local649 << 32) + local654;
									@Pc(3720) boolean local3720 = false;
									@Pc(3722) int local3722 = 0;
									while (true) {
										if (local3722 >= 100) {
											if (local456 <= 1 && method1757(local637)) {
												local3720 = true;
											}
											break;
										}
										if (local3718 == Static24.aLongArray1[local3722]) {
											local3720 = true;
											break;
										}
										local3722++;
									}
									if (!local3720 && Static327.anInt6425 == 0) {
										Static24.aLongArray1[Static120.anInt2341] = local3718;
										Static120.anInt2341 = (Static120.anInt2341 + 1) % 100;
										local1720 = Static106.method1656(local460).method880(Static142.aClass1_Sub21_Sub2_1);
										if (local456 == 2) {
											Static110.method1761(null, 18, local1720, local460, 0, "<img=1>" + local637, "<img=1>" + local635);
										} else if (local456 == 1) {
											Static110.method1761(null, 18, local1720, local460, 0, "<img=0>" + local637, "<img=0>" + local635);
										} else {
											Static110.method1761(null, 18, local1720, local460, 0, local637, local635);
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 93) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local152 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local332 = Static142.aClass1_Sub21_Sub2_1.method5720();
									if (Static142.method2378(local122)) {
										Static214.method3964(local152, true, local132, local332, local150, local126);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 105) {
									Static245.anInt1086 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static182.anInt3808 = Static244.anInt6207;
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 245) {
									local1227 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local637 = Static106.method1656(local126).method880(Static142.aClass1_Sub21_Sub2_1);
									Static110.method1761(null, 19, local637, local126, 0, local1227, local1227);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 163) {
									Static157.anInt3298 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static180.anInt3776 = Static142.aClass1_Sub21_Sub2_1.method5743();
									while (Static237.anInt4904 > Static142.aClass1_Sub21_Sub2_1.anInt6611) {
										Static74.anInt1559 = Static142.aClass1_Sub21_Sub2_1.method5720();
										Static340.method5641();
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 228) {
									Static96.method1528(true);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 178) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local126 = local122 >> 5;
									local132 = local122 & 0x1F;
									if (local132 == 0) {
										Static11.aClass65Array4[local126] = null;
										Static74.anInt1559 = -1;
										return true;
									}
									@Pc(4022) Class65 local4022 = new Class65();
									local4022.anInt1591 = local132;
									local4022.anInt1587 = Static142.aClass1_Sub21_Sub2_1.method5720();
									if (local4022.anInt1587 >= 0 && local4022.anInt1587 < Static54.aClass8Array3.length) {
										if (local4022.anInt1591 == 1 || local4022.anInt1591 == 10) {
											local4022.anInt1595 = Static142.aClass1_Sub21_Sub2_1.method5715();
											Static142.aClass1_Sub21_Sub2_1.anInt6611 += 5;
										} else if (local4022.anInt1591 >= 2 && local4022.anInt1591 <= 6) {
											if (local4022.anInt1591 == 2) {
												local4022.anInt1585 = 64;
												local4022.anInt1588 = 64;
											}
											if (local4022.anInt1591 == 3) {
												local4022.anInt1588 = 0;
												local4022.anInt1585 = 64;
											}
											if (local4022.anInt1591 == 4) {
												local4022.anInt1585 = 64;
												local4022.anInt1588 = 128;
											}
											if (local4022.anInt1591 == 5) {
												local4022.anInt1585 = 0;
												local4022.anInt1588 = 64;
											}
											if (local4022.anInt1591 == 6) {
												local4022.anInt1585 = 128;
												local4022.anInt1588 = 64;
											}
											local4022.anInt1591 = 2;
											local4022.anInt1592 = Static142.aClass1_Sub21_Sub2_1.method5715();
											local4022.anInt1596 = Static142.aClass1_Sub21_Sub2_1.method5715();
											local4022.anInt1589 = Static142.aClass1_Sub21_Sub2_1.method5720();
											local4022.anInt1594 = Static142.aClass1_Sub21_Sub2_1.method5715();
										}
										local4022.anInt1586 = Static142.aClass1_Sub21_Sub2_1.method5715();
										if (local4022.anInt1586 == 65535) {
											local4022.anInt1586 = -1;
										}
										Static11.aClass65Array4[local126] = local4022;
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 113) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5716();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
									if (local122 < -70000) {
										local126 += 32768;
									}
									if (local122 >= 0) {
										local3441 = Static248.method22(local122);
									} else {
										local3441 = null;
									}
									if (local3441 != null) {
										for (local150 = 0; local150 < local3441.anIntArray461.length; local150++) {
											local3441.anIntArray461[local150] = 0;
											local3441.anIntArray460[local150] = 0;
										}
									}
									Static297.method5194(local126);
									local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
									for (local152 = 0; local152 < local150; local152++) {
										local332 = Static142.aClass1_Sub21_Sub2_1.method5746();
										if (local332 == 255) {
											local332 = Static142.aClass1_Sub21_Sub2_1.method5716();
										}
										local452 = Static142.aClass1_Sub21_Sub2_1.method5733();
										if (local3441 != null && local152 < local3441.anIntArray461.length) {
											local3441.anIntArray461[local152] = local452;
											local3441.anIntArray460[local152] = local332;
										}
										Static191.method3367(local332, local152, local452 - 1, local126);
									}
									if (local3441 != null) {
										Static340.method5639(local3441);
									}
									Static277.method4957();
									Static217.anIntArray57[Static246.anInt5159++ & 0x1F] = local126 & 0x7FFF;
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 24) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5728();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5733();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5716();
									if (Static142.method2378(local122)) {
										Static219.method4039(local132, local126);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 19) {
									Static157.anInt3298 = Static142.aClass1_Sub21_Sub2_1.method5727();
									Static180.anInt3776 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 238) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5746();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5739();
									local150 = Static142.aClass1_Sub21_Sub2_1.method5733();
									if (Static142.method2378(local122)) {
										local224 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local132);
										if (local224 != null) {
											Static140.method2316(false, local150 != local224.anInt3825, local224);
										}
										Static208.method3735(local126, local150, false, local132);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 147 || Static74.anInt1559 == 255 || Static74.anInt1559 == 159 || Static74.anInt1559 == 207 || Static74.anInt1559 == 80 || Static74.anInt1559 == 191 || Static74.anInt1559 == 87 || Static74.anInt1559 == 90 || Static74.anInt1559 == 187 || Static74.anInt1559 == 69 || Static74.anInt1559 == 144 || Static74.anInt1559 == 75 || Static74.anInt1559 == 47 || Static74.anInt1559 == 132 || Static74.anInt1559 == 184) {
									Static340.method5641();
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 77) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
									if (local122 == 65535) {
										local122 = -1;
									}
									local126 = Static142.aClass1_Sub21_Sub2_1.method5727();
									Static346.method5791(local126, local122);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 66) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5747();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
									if (local126 == 65535) {
										local126 = -1;
									}
									local132 = Static142.aClass1_Sub21_Sub2_1.method5746();
									Static102.method1602(local132, local122, local126);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 179) {
									Static230.anInt4806 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static169.anInt3547 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static137.anInt5687 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 98) {
									Static157.anInt3298 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static180.anInt3776 = Static142.aClass1_Sub21_Sub2_1.method5746();
									for (@Pc(4584) Class1_Sub17 local4584 = (Class1_Sub17) Static98.aClass207_12.method5560(); local4584 != null; local4584 = (Class1_Sub17) Static98.aClass207_12.method5559()) {
										local126 = (int) (local4584.aLong214 & 0x3FFFL);
										local132 = (int) (local4584.aLong214 >> 14 & 0x3FFFL);
										local150 = (int) (local4584.aLong214 >> 28 & 0x3L);
										if (local150 == Static127.anInt2487 && Static157.anInt3298 <= local126 && Static157.anInt3298 + 8 > local126 && Static180.anInt3776 <= local132 && local132 < Static180.anInt3776 + 8) {
											local4584.method5796();
											Static281.method4985(local132, local126, Static127.anInt2487);
										}
									}
									for (@Pc(4657) Class1_Sub23 local4657 = (Class1_Sub23) Static271.aClass14_28.method302(); local4657 != null; local4657 = (Class1_Sub23) Static271.aClass14_28.method313()) {
										if (Static157.anInt3298 <= local4657.anInt3746 && Static157.anInt3298 + 8 > local4657.anInt3746 && Static180.anInt3776 <= local4657.anInt3755 && Static180.anInt3776 + 8 > local4657.anInt3755 && local4657.anInt3747 == Static127.anInt2487) {
											local4657.anInt3761 = 0;
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 223) {
									local631 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
									local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local637 = local635;
									if (local631) {
										local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
									}
									local649 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local654 = Static142.aClass1_Sub21_Sub2_1.method5705();
									local456 = Static142.aClass1_Sub21_Sub2_1.method5720();
									@Pc(4757) long local4757 = (local649 << 32) + local654;
									@Pc(4759) boolean local4759 = false;
									local1702 = 0;
									while (true) {
										if (local1702 >= 100) {
											if (local456 <= 1) {
												if (Static49.aBoolean438 && !Static152.aBoolean243 || Static339.aBoolean541) {
													local4759 = true;
												} else if (method1757(local637)) {
													local4759 = true;
												}
											}
											break;
										}
										if (local4757 == Static24.aLongArray1[local1702]) {
											local4759 = true;
											break;
										}
										local1702++;
									}
									if (!local4759 && Static327.anInt6425 == 0) {
										Static24.aLongArray1[Static120.anInt2341] = local4757;
										Static120.anInt2341 = (Static120.anInt2341 + 1) % 100;
										@Pc(4825) String local4825 = Static214.method3965(Static355.method5868(Static303.method5264(Static142.aClass1_Sub21_Sub2_1)));
										if (local456 == 2) {
											Static110.method1761(null, 7, local4825, -1, 0, "<img=1>" + local637, "<img=1>" + local635);
										} else if (local456 == 1) {
											Static110.method1761(null, 7, local4825, -1, 0, "<img=0>" + local637, "<img=0>" + local635);
										} else {
											Static110.method1761(null, 3, local4825, -1, 0, local637, local635);
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 201) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5746();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5715();
									Static159.method5484(local126, local122);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 138) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5743();
									if (Static142.method2378(local122)) {
										Static190.anInt3972 = local126;
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 232) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5743();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5728();
									@Pc(4957) Class10_Sub1_Sub2_Sub1 local4957 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local126];
									if (local4957 != null) {
										Static305.method5288(local4957, local122, local132);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 225) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5712();
									if (Static142.method2378(local126)) {
										if (local122 == 2) {
											Static74.method1292();
										}
										Static129.anInt2569 = local132;
										Static19.method334(local132);
										Static57.method1110(false);
										Static122.method1973(Static129.anInt2569);
										for (local150 = 0; local150 < 100; local150++) {
											Static19.aBooleanArray1[local150] = true;
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 114) {
									Static277.method4957();
									Static231.anInt4827 = Static142.aClass1_Sub21_Sub2_1.method5691();
									Static74.anInt1559 = -1;
									Static342.anInt2475 = Static244.anInt6207;
									return true;
								} else if (Static74.anInt1559 == 177) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5733();
									Static331.method3188(local122);
									Static217.anIntArray57[Static246.anInt5159++ & 0x1F] = local122 & 0x7FFF;
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 59) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5712();
									if (local122 == 65535) {
										local122 = -1;
									}
									local126 = Static142.aClass1_Sub21_Sub2_1.method5700();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5739();
									local150 = Static142.aClass1_Sub21_Sub2_1.method5728();
									if (Static142.method2378(local150)) {
										@Pc(5105) Class163 local5105 = Static248.method22(local132);
										@Pc(5122) Class102 local5122;
										if (local5105.aBoolean411) {
											Static45.method924(local122, local132, local126);
											local5122 = Static348.method5333(local122);
											Static245.method824(local5122.anInt2416, local5122.anInt2405, local5122.anInt2380, local132);
											Static283.method4990(local5122.anInt2397, local5122.anInt2385, local132, local5122.anInt2441);
										} else if (local122 == -1) {
											local5105.anInt4975 = 0;
											Static74.anInt1559 = -1;
											return true;
										} else {
											local5122 = Static348.method5333(local122);
											local5105.anInt4979 = local122;
											local5105.anInt4929 = local5122.anInt2416 * 100 / local126;
											local5105.anInt4975 = 4;
											local5105.anInt5000 = local5122.anInt2380;
											local5105.anInt4931 = local5122.anInt2405;
											Static340.method5639(local5105);
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 195) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5743();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5727();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5727();
									Static127.anInt2487 = local122 >> 1;
									Static127.aClass10_Sub1_Sub2_Sub2_1.method3420(local126, Static127.anInt2487, (local122 & 0x1) == 1, local132);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 197) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5716();
									@Pc(5238) Class163 local5238 = Static248.method22(local122);
									for (local132 = 0; local132 < local5238.anIntArray461.length; local132++) {
										local5238.anIntArray461[local132] = -1;
										local5238.anIntArray461[local132] = 0;
									}
									Static340.method5639(local5238);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 199) {
									@Pc(5272) byte local5272 = Static142.aClass1_Sub21_Sub2_1.method5708();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5715();
									if (Static142.method2378(local132)) {
										Static144.method2581(local126, local5272);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 185) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5739();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5712();
									if (Static142.method2378(local122)) {
										Static332.method5551(local132, local126);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 150) {
									Static234.method4199();
									Static277.method4957();
									Static74.anInt1559 = -1;
									Static204.anInt6781 += 32;
									return true;
								} else if (Static74.anInt1559 == 230) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
									@Pc(5361) Object[] local5361 = new Object[local635.length() + 1];
									for (local150 = local635.length() - 1; local150 >= 0; local150--) {
										if (local635.charAt(local150) == 's') {
											local5361[local150 + 1] = Static142.aClass1_Sub21_Sub2_1.method5701();
										} else {
											local5361[local150 + 1] = Integer.valueOf(Static142.aClass1_Sub21_Sub2_1.method5716());
										}
									}
									local5361[0] = Integer.valueOf(Static142.aClass1_Sub21_Sub2_1.method5716());
									if (Static142.method2378(local122)) {
										@Pc(5417) Class1_Sub8 local5417 = new Class1_Sub8();
										local5417.anObjectArray1 = local5361;
										Static122.method1972(local5417);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 123) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local150 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local152 = Static142.aClass1_Sub21_Sub2_1.method5720();
									local332 = Static142.aClass1_Sub21_Sub2_1.method5720();
									if (Static142.method2378(local122)) {
										Static132.method5859(local150, local152, local126, local132, local332);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 218) {
									Static114.method1823(Static142.aClass1_Sub21_Sub2_1.method5701());
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 206) {
									Static282.method2955();
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 36) {
									Static142.aClass1_Sub21_Sub2_1.anInt6611 += 28;
									if (Static142.aClass1_Sub21_Sub2_1.method5742()) {
										Static57.method1112(Static142.aClass1_Sub21_Sub2_1.anInt6611 - 28, Static142.aClass1_Sub21_Sub2_1);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 43) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local635 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local132 = Static142.aClass1_Sub21_Sub2_1.method5715();
									if (Static142.method2378(local132)) {
										Static30.method503(local635, local122);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 164) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5712();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5735();
									if (Static142.method2378(local122)) {
										Static172.method3081(0, 2047, local126, 5);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 89) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5720();
									@Pc(5593) boolean local5593 = (local122 & 0x1) == 1;
									local637 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local2622 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local2624 = Static142.aClass1_Sub21_Sub2_1.method5701();
									local1504 = Static142.aClass1_Sub21_Sub2_1.method5701();
									if (local5593) {
										for (local452 = 0; local452 < Static90.anInt1705; local452++) {
											if (Static222.aStringArray32[local452].equals(local1504)) {
												Static61.aStringArray7[local452] = local637;
												if (local2622.equals("")) {
													Static222.aStringArray32[local452] = local637;
												} else {
													Static222.aStringArray32[local452] = local2622;
												}
												Static327.aStringArray41[local452] = local2624;
												if (local1504.equals("")) {
													Static310.aStringArray38[local452] = local2624;
												} else {
													Static310.aStringArray38[local452] = local1504;
												}
												break;
											}
										}
									} else {
										Static61.aStringArray7[Static90.anInt1705] = local637;
										if (local2622.equals("")) {
											Static222.aStringArray32[Static90.anInt1705] = local637;
										} else {
											Static222.aStringArray32[Static90.anInt1705] = local2622;
										}
										Static327.aStringArray41[Static90.anInt1705] = local2624;
										if (local1504.equals("")) {
											Static310.aStringArray38[Static90.anInt1705] = local2624;
										} else {
											Static310.aStringArray38[Static90.anInt1705] = local1504;
										}
										Static154.aBooleanArray14[Static90.anInt1705] = (local122 & 0x2) == 2;
										Static90.anInt1705++;
									}
									Static182.anInt3808 = Static244.anInt6207;
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 15) {
									if (Static129.anInt2569 != -1) {
										Static125.method2001(0, Static129.anInt2569);
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 234) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5715();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5716();
									if (Static142.method2378(local122)) {
										@Pc(5771) Class1_Sub26 local5771 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local126);
										if (local5771 != null) {
											Static140.method2316(false, true, local5771);
										}
										if (Static50.aClass163_5 != null) {
											Static340.method5639(Static50.aClass163_5);
											Static50.aClass163_5 = null;
										}
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 148) {
									if (Static237.anInt4904 == 0) {
										Static289.aString228 = Static62.aString271;
									} else {
										Static289.aString228 = Static142.aClass1_Sub21_Sub2_1.method5701();
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 142) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5728();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5739();
									Static159.method5484(local122, local126);
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 160) {
									local122 = Static142.aClass1_Sub21_Sub2_1.method5746();
									local126 = Static142.aClass1_Sub21_Sub2_1.method5728();
									if (local126 == 65535) {
										local126 = -1;
									}
									local132 = Static142.aClass1_Sub21_Sub2_1.method5746();
									local2622 = Static142.aClass1_Sub21_Sub2_1.method5701();
									if (local132 >= 1 && local132 <= 8) {
										if (local2622.equalsIgnoreCase("null")) {
											local2622 = null;
										}
										Static13.aStringArray2[local132 - 1] = local2622;
										Static285.anIntArray557[local132 - 1] = local126;
										Static106.aBooleanArray10[local132 - 1] = local122 == 0;
									}
									Static74.anInt1559 = -1;
									return true;
								} else if (Static74.anInt1559 == 20) {
									Static38.anInt3168 = Static142.aClass1_Sub21_Sub2_1.method5720();
									Static74.anInt1559 = -1;
									return true;
								} else {
									Static268.method4816("T1 - " + Static74.anInt1559 + "," + Static48.anInt1219 + "," + Static257.anInt5276 + " - " + Static237.anInt4904, null);
									Static324.method5503();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIZI)V")
	public static void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static347.aClass83ArrayArrayArray3 == null) {
			Static217.aClass105_5.method4225(arg1, -16777216, arg0, arg2, arg4);
			return;
		}
		Static2.anInt30++;
		if (Static127.aClass10_Sub1_Sub2_Sub2_1 != null && Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 - (Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() - 1) * 64 >> 7 == Static307.anInt6146 && Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 - (Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() - 1) * 64 >> 7 == Static14.anInt229) {
			Static307.anInt6146 = -1;
			Static14.anInt229 = -1;
			Static39.method793();
		}
		Static154.method2687();
		if (!arg3) {
			Static149.method2628();
		}
		Static85.method1384();
		Static313.method5366(arg0, true, arg4, arg1, arg2);
		@Pc(74) int local74 = Static310.anInt6187;
		@Pc(76) int local76 = Static6.anInt4144;
		@Pc(78) int local78 = Static1.anInt12;
		@Pc(80) int local80 = Static56.anInt1345;
		@Pc(101) int local101;
		@Pc(136) int local136;
		if (Static246.anInt5156 == 1) {
			local101 = (int) Static318.aFloat77;
			if (anInt2092 >> 8 > local101) {
				local101 = anInt2092 >> 8;
			}
			if (Static68.aBooleanArray5[4] && Static147.anIntArray296[4] + 128 > local101) {
				local101 = Static147.anIntArray296[4] + 128;
			}
			local136 = Static175.anInt3715 + (int) Static143.aFloat21 & 0x3FFF;
			Static140.method2315(local101, (local101 >> 3) * 3 + 600, local74, local136, Static352.method5834(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728, Static127.anInt2487) - 50, Static163.anInt3374, Static29.anInt545);
		} else if (Static246.anInt5156 == 4) {
			local101 = (int) Static318.aFloat77;
			if (anInt2092 >> 8 > local101) {
				local101 = anInt2092 >> 8;
			}
			if (Static68.aBooleanArray5[4] && local101 < Static147.anIntArray296[4] + 128) {
				local101 = Static147.anIntArray296[4] + 128;
			}
			local136 = (int) Static143.aFloat21 & 0x3FFF;
			Static140.method2315(local101, (local101 >> 3) * 3 + 600, local74, local136, Static352.method5834(Static18.anInt355, Static67.anInt1459, Static127.anInt2487) - 50, Static163.anInt3374, Static29.anInt545);
		} else if (Static246.anInt5156 == 5) {
			Static165.method2898(local74);
		}
		local101 = Static4.anInt41;
		local136 = Static117.anInt2244;
		@Pc(232) int local232 = Static177.anInt3734;
		@Pc(234) int local234 = Static338.anInt6530;
		@Pc(236) int local236 = Static296.anInt5982;
		@Pc(280) int local280;
		for (@Pc(238) int local238 = 0; local238 < 5; local238++) {
			if (Static68.aBooleanArray5[local238]) {
				local280 = (int) ((double) -Static313.anIntArray626[local238] + Math.random() * (double) (Static313.anIntArray626[local238] * 2 + 1) + Math.sin((double) Static121.anIntArray393[local238] * ((double) Static45.anIntArray70[local238] / 100.0D)) * (double) Static147.anIntArray296[local238]);
				if (local238 == 3) {
					Static296.anInt5982 = local280 + Static296.anInt5982 & 0x3FFF;
				}
				if (local238 == 1) {
					Static117.anInt2244 += local280;
				}
				if (local238 == 4) {
					Static338.anInt6530 += local280;
					if (Static338.anInt6530 < 1024) {
						Static338.anInt6530 = 1024;
					} else if (Static338.anInt6530 > 3072) {
						Static338.anInt6530 = 3072;
					}
				}
				if (local238 == 2) {
					Static177.anInt3734 += local280;
				}
				if (local238 == 0) {
					Static4.anInt41 += local280;
				}
			}
		}
		if (Static4.anInt41 < 0) {
			Static4.anInt41 = 0;
		}
		if ((Static97.anInt1852 << 7) - 1 < Static4.anInt41) {
			Static4.anInt41 = (Static97.anInt1852 << 7) - 1;
		}
		if (Static177.anInt3734 < 0) {
			Static177.anInt3734 = 0;
		}
		if ((Static3.anInt38 << 7) - 1 < Static177.anInt3734) {
			Static177.anInt3734 = (Static3.anInt38 << 7) - 1;
		}
		Static184.method3250();
		Static58.method1138();
		Static217.aClass105_5.method4268(local76, local80, local76 + local78, local74 + local80);
		Static217.aClass105_5.method4246();
		local280 = Static97.anInt1883;
		if (Static126.aClass199_1 == null) {
			Static217.aClass105_5.method4295(local280);
		} else {
			Static126.aClass199_1.method5374(Static161.anInt3358 << 3, Static296.anInt5982, local280, local78, Static217.aClass105_5, Static338.anInt6530, local74, local80, local76);
		}
		Static310.method5336();
		Static56.aClass31_1.method3183(Static4.anInt41, Static117.anInt2244, Static177.anInt3734, -Static338.anInt6530 & 0x3FFF, -Static296.anInt5982 & 0x3FFF, -Static290.anInt5827 & 0x3FFF);
		Static217.aClass105_5.method4213(Static56.aClass31_1);
		Static217.aClass105_5.method4282(local76 + local78 / 2, local74 / 2 + local80, Static19.anInt384 << 1, Static19.anInt384 << 1);
		Static98.method1574(Static19.anInt384 << 1, local74 / 2 + local80, Static19.anInt384 << 1, local76 + local78 / 2);
		Static237.method4327(-Static290.anInt5827 & 0x3FFF, Static117.anInt2244, Static177.anInt3734, -Static296.anInt5982 & 0x3FFF, Static4.anInt41, -Static338.anInt6530 & 0x3FFF);
		@Pc(508) byte local508 = Static346.method5792() == 2 ? (byte) Static2.anInt30 : 1;
		Static162.method2853(Static217.aClass105_5, Static282.anInt3516, Static220.anInt4683, Static56.aClass31_1, Static4.anInt41, Static117.anInt2244, Static177.anInt3734, Static263.aByteArrayArrayArray9, Static25.anIntArray25, Static207.anIntArray398, Static67.anIntArray105, Static111.anIntArray187, Static142.anIntArray277, Static127.anInt2487 + 1, local508, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7, !Static266.aBoolean458);
		Static310.method5336();
		if (Static261.anInt5376 == 30) {
			Static337.method5605(local74, local78, local80, local76);
			Static240.method4378(local74, local80, local78, local76);
			Static138.method5443(local78, local80, local76, local74);
			Static178.method3170(local80, local74, local76, local78);
		}
		Static245.method839();
		Static117.anInt2244 = local136;
		Static177.anInt3734 = local232;
		Static4.anInt41 = local101;
		Static296.anInt5982 = local236;
		Static338.anInt6530 = local234;
		if (Static338.aBoolean538 && Static114.aClass154_1.method4102() == 0) {
			Static338.aBoolean538 = false;
		}
		if (Static338.aBoolean538) {
			Static217.aClass105_5.method4225(local74, -16777216, local78, local76, local80);
			Static159.method5486(false, Static101.aString78, Static233.aClass29_2);
		}
	}
}
