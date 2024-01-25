import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_198 = new Class214(2, -2);

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Z")
	public static boolean method5222() throws IOException {
		if (Static172.aClass13_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static432.aClass214_220 == null) {
			if (Static236.aBoolean305) {
				if (!Static172.aClass13_1.method179(1)) {
					return false;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				Static270.anInt5899 = 0;
				Static236.aBoolean305 = false;
				Static288.anInt5357++;
			}
			Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
			if (Static196.aClass4_Sub20_Sub1_4.method3234()) {
				if (!Static172.aClass13_1.method179(1)) {
					return false;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 1, 1);
				Static288.anInt5357++;
				Static270.anInt5899 = 0;
			}
			Static236.aBoolean305 = true;
			@Pc(69) Class214[] local69 = Static254.method4161();
			local73 = Static196.aClass4_Sub20_Sub1_4.method3237();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static196.aClass4_Sub20_Sub1_4.anInt5526);
			}
			Static432.aClass214_220 = local69[local73];
			Static136.anInt2819 = Static432.aClass214_220.anInt6029;
		}
		if (Static136.anInt2819 == -1) {
			if (!Static172.aClass13_1.method179(1)) {
				return false;
			}
			Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
			Static288.anInt5357++;
			Static136.anInt2819 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
			Static270.anInt5899 = 0;
		}
		if (Static136.anInt2819 == -2) {
			if (!Static172.aClass13_1.method179(2)) {
				return false;
			}
			Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 2);
			Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
			Static136.anInt2819 = Static196.aClass4_Sub20_Sub1_4.method4560();
			Static270.anInt5899 = 0;
			Static288.anInt5357 += 2;
		}
		if (Static136.anInt2819 > 0) {
			if (!Static172.aClass13_1.method179(Static136.anInt2819)) {
				return false;
			}
			Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
			Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, Static136.anInt2819);
			Static270.anInt5899 = 0;
			Static288.anInt5357 += Static136.anInt2819;
		}
		Static72.aClass214_68 = Static20.aClass214_216;
		Static20.aClass214_216 = Static298.aClass214_171;
		Static298.aClass214_171 = Static432.aClass214_220;
		@Pc(222) int local222;
		@Pc(231) int local231;
		@Pc(235) int local235;
		@Pc(248) int local248;
		@Pc(214) int local214;
		@Pc(258) long local258;
		@Pc(273) Class4_Sub45 local273;
		@Pc(264) Class4_Sub45 local264;
		if (Static339.aClass214_186 == Static432.aClass214_220) {
			local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local73 = Static196.aClass4_Sub20_Sub1_4.method4595();
			local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (local222 == 65535) {
				local222 = -1;
			}
			local231 = Static196.aClass4_Sub20_Sub1_4.method4606();
			local235 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (local235 == 65535) {
				local235 = -1;
			}
			if (Static89.method1784(local214)) {
				for (local248 = local235; local248 <= local222; local248++) {
					local258 = ((long) local73 << 32) + (long) local248;
					local264 = (Class4_Sub45) Static135.aClass96_15.method2797(local258);
					if (local264 != null) {
						local273 = new Class4_Sub45(local264.anInt7357, local231);
						local264.method6330();
					} else if (local248 == -1) {
						local273 = new Class4_Sub45(Static92.method1820(local73).aClass4_Sub45_2.anInt7357, local231);
					} else {
						local273 = new Class4_Sub45(0, local231);
					}
					Static135.aClass96_15.method2805(local258, local273);
				}
			}
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static295.aClass214_167) {
			Static161.method5249(Static196.aClass4_Sub20_Sub1_4.method4624());
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static88.aClass214_204) {
			local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
			local222 = Static196.aClass4_Sub20_Sub1_4.method4606();
			if (Static89.method1784(local73)) {
				Static171.method3019(local214, local222);
			}
			Static432.aClass214_220 = null;
			return true;
		} else if (Static145.aClass214_101 == Static432.aClass214_220) {
			Static67.aClass224_1.method5155();
			Static295.anInt5429 += 32;
			Static432.aClass214_220 = null;
			return true;
		} else if (Static422.aClass214_218 == Static432.aClass214_220) {
			local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
			local222 = Static196.aClass4_Sub20_Sub1_4.method4614();
			local231 = Static196.aClass4_Sub20_Sub1_4.method4560() << 0;
			local235 = Static196.aClass4_Sub20_Sub1_4.method4614();
			local248 = Static196.aClass4_Sub20_Sub1_4.method4614();
			if (Static89.method1784(local214)) {
				Static24.method364(local231, local222, local73, local248, local235);
			}
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static392.aClass214_209) {
			Static178.method3293(Static209.aClass49_14);
			Static432.aClass214_220 = null;
			return true;
		} else if (Static245.aClass214_149 == Static432.aClass214_220) {
			local214 = Static196.aClass4_Sub20_Sub1_4.method4564();
			local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
			local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
			if (Static89.method1784(local222)) {
				Static50.method1143(local73, local214);
			}
			Static432.aClass214_220 = null;
			return true;
		} else if (Static184.aClass214_133 == Static432.aClass214_220) {
			Static178.method3293(Static277.aClass49_12);
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static246.aClass214_151) {
			if (Static35.method516(Static70.anInt1726)) {
				Static293.anInt5391 = (int) ((float) Static196.aClass4_Sub20_Sub1_4.method4560() * 2.5F);
			} else {
				Static293.anInt5391 = Static196.aClass4_Sub20_Sub1_4.method4560() * 30;
			}
			Static432.aClass214_220 = null;
			Static234.anInt4636 = Static446.anInt7635;
			return true;
		} else if (Static432.aClass214_220 == Static411.aClass214_202) {
			local214 = Static196.aClass4_Sub20_Sub1_4.method4580();
			local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
			local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
			if (local222 == 65535) {
				local222 = -1;
			}
			local231 = Static196.aClass4_Sub20_Sub1_4.method4595();
			if (Static89.method1784(local73)) {
				Static261.method4240(local231, local222, local214);
				@Pc(528) Class274 local528 = Static139.aClass193_1.method4650(local222);
				Static319.method4777(local231, local528.anInt7913, local528.anInt7874, local528.anInt7865);
				Static53.method3951(local528.anInt7903, local528.anInt7897, local231, local528.anInt7872);
			}
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static46.aClass214_39) {
			Static178.method3293(Static109.aClass49_11);
			Static432.aClass214_220 = null;
			return true;
		} else if (Static337.aClass214_185 == Static432.aClass214_220) {
			Static178.method3293(Static66.aClass49_8);
			Static432.aClass214_220 = null;
			return true;
		} else if (Static107.aClass214_84 == Static432.aClass214_220) {
			Static74.method1629(Static390.aClass255_5, Static196.aClass4_Sub20_Sub1_4, Static136.anInt2819);
			Static432.aClass214_220 = null;
			return true;
		} else if (Static432.aClass214_220 == Static307.aClass214_221) {
			Static435.aClass56_4 = Static140.method2578(Static196.aClass4_Sub20_Sub1_4.method4614());
			Static432.aClass214_220 = null;
			return true;
		} else {
			@Pc(773) int local773;
			@Pc(627) boolean local627;
			@Pc(794) Class152 local794;
			@Pc(766) int local766;
			@Pc(771) boolean local771;
			if (Static233.aClass214_145 == Static432.aClass214_220) {
				Static184.anInt3736 = Static446.anInt7635;
				if (Static136.anInt2819 == 0) {
					Static422.anInt7300 = 0;
					Static386.aString78 = null;
					Static87.aClass152Array1 = null;
					Static43.aString5 = null;
					Static432.aClass214_220 = null;
					return true;
				}
				Static386.aString78 = Static196.aClass4_Sub20_Sub1_4.method4624();
				local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
				if (local627) {
					Static196.aClass4_Sub20_Sub1_4.method4624();
				}
				@Pc(637) long local637 = Static196.aClass4_Sub20_Sub1_4.method4603();
				Static43.aString5 = Static30.method446(local637);
				Static265.aByte67 = Static196.aClass4_Sub20_Sub1_4.method4576();
				local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
				if (local231 == 255) {
					Static432.aClass214_220 = null;
					return true;
				}
				Static422.anInt7300 = local231;
				@Pc(663) Class152[] local663 = new Class152[100];
				for (local248 = 0; local248 < Static422.anInt7300; local248++) {
					local663[local248] = new Class152();
					local663[local248].aString36 = Static196.aClass4_Sub20_Sub1_4.method4624();
					local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
					if (local627) {
						local663[local248].aString37 = Static196.aClass4_Sub20_Sub1_4.method4624();
					} else {
						local663[local248].aString37 = local663[local248].aString36;
					}
					local663[local248].aString38 = Static315.method4358(local663[local248].aString37);
					local663[local248].anInt4611 = Static196.aClass4_Sub20_Sub1_4.method4560();
					local663[local248].aByte47 = Static196.aClass4_Sub20_Sub1_4.method4576();
					local663[local248].aString39 = Static196.aClass4_Sub20_Sub1_4.method4624();
					if (local663[local248].aString37.equals(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31)) {
						Static186.aByte25 = local663[local248].aByte47;
					}
				}
				local766 = Static422.anInt7300;
				while (local766 > 0) {
					local766--;
					local771 = true;
					for (local773 = 0; local773 < local766; local773++) {
						if (local663[local773].aString38.compareTo(local663[local773 + 1].aString38) > 0) {
							local794 = local663[local773];
							local663[local773] = local663[local773 + 1];
							local663[local773 + 1] = local794;
							local771 = false;
						}
					}
					if (local771) {
						break;
					}
				}
				Static87.aClass152Array1 = local663;
				Static432.aClass214_220 = null;
				return true;
			}
			@Pc(850) String local850;
			@Pc(860) long local860;
			@Pc(848) String local848;
			@Pc(865) long local865;
			@Pc(870) long local870;
			@Pc(878) int local878;
			if (Static432.aClass214_220 == Static289.aClass214_165) {
				local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
				local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
				local850 = local848;
				if (local627) {
					local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
				}
				local860 = Static196.aClass4_Sub20_Sub1_4.method4603();
				local865 = Static196.aClass4_Sub20_Sub1_4.method4560();
				local870 = Static196.aClass4_Sub20_Sub1_4.method4582();
				local773 = Static196.aClass4_Sub20_Sub1_4.method4614();
				local878 = Static196.aClass4_Sub20_Sub1_4.method4560();
				@Pc(884) long local884 = local870 + (local865 << 32);
				@Pc(886) boolean local886 = false;
				@Pc(888) int local888 = 0;
				while (true) {
					if (local888 >= 100) {
						if (local773 <= 1 && Static75.method1641(local850)) {
							local886 = true;
						}
						break;
					}
					if (local884 == Static453.aLongArray7[local888]) {
						local886 = true;
						break;
					}
					local888++;
				}
				if (!local886 && Static304.anInt5641 == 0) {
					Static453.aLongArray7[Static453.anInt7766] = local884;
					Static453.anInt7766 = (Static453.anInt7766 + 1) % 100;
					@Pc(940) String local940 = Static135.aClass75_2.method2200(local878).method468(Static196.aClass4_Sub20_Sub1_4);
					if (local773 == 2) {
						Static7.method71("<img=1>" + local850, local940, 0, "<img=1>" + local848, Static166.method5266(local860), local878, 20);
					} else if (local773 == 1) {
						Static7.method71("<img=0>" + local850, local940, 0, "<img=0>" + local848, Static166.method5266(local860), local878, 20);
					} else {
						Static7.method71(local850, local940, 0, local848, Static166.method5266(local860), local878, 20);
					}
				}
				Static432.aClass214_220 = null;
				return true;
			} else if (Static139.aClass214_96 == Static432.aClass214_220) {
				local214 = Static196.aClass4_Sub20_Sub1_4.method4617();
				local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
				local222 = Static196.aClass4_Sub20_Sub1_4.method4602();
				local231 = Static196.aClass4_Sub20_Sub1_4.method4623();
				if (local231 == 65535) {
					local231 = -1;
				}
				if (local214 >= 1 && local214 <= 8) {
					if (local848.equalsIgnoreCase("null")) {
						local848 = null;
					}
					Static342.aStringArray31[local214 - 1] = local848;
					Static182.anIntArray287[local214 - 1] = local231;
					Static390.aBooleanArray134[local214 - 1] = local222 == 0;
				}
				Static432.aClass214_220 = null;
				return true;
			} else if (Static432.aClass214_220 == Static302.aClass214_175) {
				local214 = Static196.aClass4_Sub20_Sub1_4.method4564();
				local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
				local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
				if (Static89.method1784(local222)) {
					Static165.method2908(local214, local73);
				}
				Static432.aClass214_220 = null;
				return true;
			} else if (Static432.aClass214_220 == Static302.aClass214_174) {
				Static380.method5393();
				Static432.aClass214_220 = null;
				return false;
			} else {
				@Pc(1160) String local1160;
				@Pc(1133) String local1133;
				@Pc(1131) String local1131;
				if (Static432.aClass214_220 == Static260.aClass214_156) {
					local214 = Static196.aClass4_Sub20_Sub1_4.method4575();
					local73 = Static196.aClass4_Sub20_Sub1_4.method4595();
					local222 = Static196.aClass4_Sub20_Sub1_4.method4614();
					local1131 = "";
					local1133 = local1131;
					if ((local222 & 0x1) != 0) {
						local1131 = Static196.aClass4_Sub20_Sub1_4.method4624();
						if ((local222 & 0x2) == 0) {
							local1133 = local1131;
						} else {
							local1133 = Static196.aClass4_Sub20_Sub1_4.method4624();
						}
					}
					local1160 = Static196.aClass4_Sub20_Sub1_4.method4624();
					if (local214 == 99) {
						Static328.method4873(local1160);
					} else if (local1133.equals("") || !Static75.method1641(local1133)) {
						Static238.method4006(local1131, local214, local1160, local1133, local73);
					} else {
						Static432.aClass214_220 = null;
						return true;
					}
					Static432.aClass214_220 = null;
					return true;
				}
				@Pc(1223) Class4_Sub39 local1223;
				if (Static356.aClass214_193 == Static432.aClass214_220) {
					local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
					local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
					local222 = Static196.aClass4_Sub20_Sub1_4.method4607();
					local231 = Static196.aClass4_Sub20_Sub1_4.method4564();
					if (Static89.method1784(local222)) {
						local1223 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local231);
						if (local1223 != null) {
							Static298.method4546(local1223, local214 != local1223.anInt6721, false);
						}
						Static20.method5766(false, local214, local73, local231);
					}
					Static432.aClass214_220 = null;
					return true;
				} else if (Static312.aClass214_206 == Static432.aClass214_220) {
					local214 = Static196.aClass4_Sub20_Sub1_4.method4595();
					local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
					local222 = Static196.aClass4_Sub20_Sub1_4.method4607();
					if (Static89.method1784(local73)) {
						Static303.method4679(local214, local222);
					}
					Static432.aClass214_220 = null;
					return true;
				} else {
					@Pc(1281) String local1281;
					if (Static432.aClass214_220 == Static224.aClass214_141) {
						local1281 = Static196.aClass4_Sub20_Sub1_4.method4624();
						local848 = Static105.method2007(Static110.method2178(Static196.aClass4_Sub20_Sub1_4));
						Static238.method4006(local1281, 6, local848, local1281, 0);
						Static432.aClass214_220 = null;
						return true;
					} else if (Static17.aClass214_14 == Static432.aClass214_220) {
						Static432.aClass214_220 = null;
						return false;
					} else {
						@Pc(1358) int local1358;
						if (Static432.aClass214_220 == Static335.aClass214_184) {
							local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
							local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
							local850 = local848;
							if (local627) {
								local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
							}
							local860 = Static196.aClass4_Sub20_Sub1_4.method4603();
							local865 = Static196.aClass4_Sub20_Sub1_4.method4560();
							local870 = Static196.aClass4_Sub20_Sub1_4.method4582();
							local773 = Static196.aClass4_Sub20_Sub1_4.method4614();
							@Pc(1354) long local1354 = (local865 << 32) + local870;
							@Pc(1356) boolean local1356 = false;
							local1358 = 0;
							while (true) {
								if (local1358 >= 100) {
									if (local773 <= 1) {
										if (Static238.aBoolean310 && !Static53.aBoolean301 || Static317.aBoolean427) {
											local1356 = true;
										} else if (Static75.method1641(local850)) {
											local1356 = true;
										}
									}
									break;
								}
								if (Static453.aLongArray7[local1358] == local1354) {
									local1356 = true;
									break;
								}
								local1358++;
							}
							if (!local1356 && Static304.anInt5641 == 0) {
								Static453.aLongArray7[Static453.anInt7766] = local1354;
								Static453.anInt7766 = (Static453.anInt7766 + 1) % 100;
								@Pc(1424) String local1424 = Static105.method2007(Static110.method2178(Static196.aClass4_Sub20_Sub1_4));
								if (local773 == 2 || local773 == 3) {
									Static7.method71("<img=1>" + local850, local1424, 0, "<img=1>" + local848, Static166.method5266(local860), -1, 9);
								} else if (local773 == 1) {
									Static7.method71("<img=0>" + local850, local1424, 0, "<img=0>" + local848, Static166.method5266(local860), -1, 9);
								} else {
									Static7.method71(local850, local1424, 0, local848, Static166.method5266(local860), -1, 9);
								}
							}
							Static432.aClass214_220 = null;
							return true;
						} else if (Static247.aClass214_152 == Static432.aClass214_220) {
							local214 = Static196.aClass4_Sub20_Sub1_4.method4623();
							local73 = Static196.aClass4_Sub20_Sub1_4.method4623();
							local222 = Static196.aClass4_Sub20_Sub1_4.method4564();
							local231 = Static196.aClass4_Sub20_Sub1_4.method4623();
							local235 = Static196.aClass4_Sub20_Sub1_4.method4606();
							if (Static89.method1784(local73)) {
								Static319.method4777(local222, local231, local235, local214);
							}
							Static432.aClass214_220 = null;
							return true;
						} else {
							@Pc(1581) int local1581;
							@Pc(1589) int local1589;
							@Pc(1627) int local1627;
							@Pc(2041) int local2041;
							@Pc(1568) boolean local1568;
							@Pc(2001) boolean local2001;
							if (Static285.aClass214_164 == Static432.aClass214_220) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local73 = Static196.aClass4_Sub20_Sub1_4.method4580();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
								local231 = Static196.aClass4_Sub20_Sub1_4.method4618();
								local235 = Static196.aClass4_Sub20_Sub1_4.method4607();
								local1568 = (local231 & 0x80) != 0;
								if (local73 >> 30 == 0) {
									@Pc(1746) Class130 local1746;
									@Pc(1783) Class130 local1783;
									@Pc(1725) Class149 local1725;
									if (local73 >> 29 != 0) {
										local1581 = local73 & 0xFFFF;
										@Pc(1684) Class4_Sub44 local1684 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local1581);
										if (local1684 != null) {
											if (local235 == 65535) {
												local235 = -1;
											}
											@Pc(1696) Class11_Sub5_Sub2_Sub2 local1696 = local1684.aClass11_Sub5_Sub2_Sub2_2;
											@Pc(1698) boolean local1698 = true;
											local878 = local1568 ? local1696.anInt6486 : local1696.anInt6515;
											if (local235 != -1 && local878 != -1) {
												if (local235 == local878) {
													local1725 = Static193.aClass186_1.method4462(local235);
													if (local1725.aBoolean297 && local1725.anInt4573 != -1) {
														local1783 = Static143.aClass85_1.method2406(local1725.anInt4573);
														local1358 = local1783.anInt3937;
														if (local1358 == 0 || local1358 == 2) {
															local1698 = false;
														} else if (local1358 == 1) {
															local1698 = true;
														}
													}
												} else {
													local1725 = Static193.aClass186_1.method4462(local235);
													@Pc(1730) Class149 local1730 = Static193.aClass186_1.method4462(local878);
													if (local1725.anInt4573 != -1 && local1730.anInt4573 != -1) {
														local1746 = Static143.aClass85_1.method2406(local1725.anInt4573);
														@Pc(1752) Class130 local1752 = Static143.aClass85_1.method2406(local1730.anInt4573);
														if (local1752.anInt3938 > local1746.anInt3938) {
															local1698 = false;
														}
													}
												}
											}
											if (local1698) {
												if (local1568) {
													local1696.anInt6497 = 1;
													local1696.anInt6493 = local214;
													local1696.anInt6528 = local231 & 0x7;
													local1696.anInt6536 = local222 + Static277.anInt2834;
													local1696.anInt6494 = 0;
													local1696.anInt6534 = 0;
													local1696.anInt6486 = local235;
													if (local1696.anInt6536 > Static277.anInt2834) {
														local1696.anInt6494 = -1;
													}
													if (local1696.anInt6486 != -1 && Static277.anInt2834 == local1696.anInt6536) {
														local1627 = Static193.aClass186_1.method4462(local1696.anInt6486).anInt4573;
														if (local1627 != -1) {
															local1783 = Static143.aClass85_1.method2406(local1627);
															if (local1783 != null && local1783.anIntArray306 != null) {
																Static125.method2339(local1696.anInt7514, 0, local1696.anInt7515, false, local1783, local1696.aByte100);
															}
														}
													}
												} else {
													local1696.anInt6507 = local231 & 0x7;
													local1696.anInt6490 = 0;
													local1696.anInt6512 = 0;
													local1696.anInt6515 = local235;
													local1696.anInt6517 = Static277.anInt2834 + local222;
													local1696.anInt6504 = local214;
													local1696.anInt6521 = 1;
													if (local1696.anInt6517 > Static277.anInt2834) {
														local1696.anInt6512 = -1;
													}
													if (local1696.anInt6515 != -1 && Static277.anInt2834 == local1696.anInt6517) {
														local1627 = Static193.aClass186_1.method4462(local1696.anInt6515).anInt4573;
														if (local1627 != -1) {
															local1783 = Static143.aClass85_1.method2406(local1627);
															if (local1783 != null && local1783.anIntArray306 != null) {
																Static125.method2339(local1696.anInt7514, 0, local1696.anInt7515, false, local1783, local1696.aByte100);
															}
														}
													}
												}
											}
										}
									} else if (local73 >> 28 != 0) {
										local1581 = local73 & 0xFFFF;
										@Pc(1986) Class11_Sub5_Sub2_Sub1 local1986;
										if (local1581 == Static147.anInt3062) {
											local1986 = Static52.aClass11_Sub5_Sub2_Sub1_2;
										} else {
											local1986 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local1581];
										}
										if (local1986 != null) {
											if (local235 == 65535) {
												local235 = -1;
											}
											local2001 = true;
											local773 = local1568 ? local1986.anInt6486 : local1986.anInt6515;
											@Pc(2038) Class130 local2038;
											if (local235 != -1 && local773 != -1) {
												@Pc(2024) Class149 local2024;
												if (local235 == local773) {
													local2024 = Static193.aClass186_1.method4462(local235);
													if (local2024.aBoolean297 && local2024.anInt4573 != -1) {
														local2038 = Static143.aClass85_1.method2406(local2024.anInt4573);
														local2041 = local2038.anInt3937;
														if (local2041 == 0 || local2041 == 2) {
															local2001 = false;
														} else if (local2041 == 1) {
															local2001 = true;
														}
													}
												} else {
													local2024 = Static193.aClass186_1.method4462(local235);
													local1725 = Static193.aClass186_1.method4462(local773);
													if (local2024.anInt4573 != -1 && local1725.anInt4573 != -1) {
														local1783 = Static143.aClass85_1.method2406(local2024.anInt4573);
														local1746 = Static143.aClass85_1.method2406(local1725.anInt4573);
														if (local1783.anInt3938 < local1746.anInt3938) {
															local2001 = false;
														}
													}
												}
											}
											if (local2001) {
												if (local1568) {
													local1986.anInt6497 = 1;
													local1986.anInt6536 = Static277.anInt2834 + local222;
													local1986.anInt6534 = 0;
													local1986.anInt6486 = local235;
													local1986.anInt6528 = local231 & 0x7;
													local1986.anInt6493 = local214;
													local1986.anInt6494 = 0;
													if (Static277.anInt2834 < local1986.anInt6536) {
														local1986.anInt6494 = -1;
													}
													if (local1986.anInt6486 == 65535) {
														local1986.anInt6486 = -1;
													}
													if (local1986.anInt6486 != -1 && Static277.anInt2834 == local1986.anInt6536) {
														local878 = Static193.aClass186_1.method4462(local1986.anInt6486).anInt4573;
														if (local878 != -1) {
															local2038 = Static143.aClass85_1.method2406(local878);
															if (local2038 != null && local2038.anIntArray306 != null) {
																Static125.method2339(local1986.anInt7514, 0, local1986.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == local1986, local2038, local1986.aByte100);
															}
														}
													}
												} else {
													local1986.anInt6515 = local235;
													local1986.anInt6521 = 1;
													local1986.anInt6512 = 0;
													local1986.anInt6490 = 0;
													local1986.anInt6504 = local214;
													local1986.anInt6517 = Static277.anInt2834 + local222;
													local1986.anInt6507 = local231 & 0x7;
													if (local1986.anInt6515 == 65535) {
														local1986.anInt6515 = -1;
													}
													if (Static277.anInt2834 < local1986.anInt6517) {
														local1986.anInt6512 = -1;
													}
													if (local1986.anInt6515 != -1 && Static277.anInt2834 == local1986.anInt6517) {
														local878 = Static193.aClass186_1.method4462(local1986.anInt6515).anInt4573;
														if (local878 != -1) {
															local2038 = Static143.aClass85_1.method2406(local878);
															if (local2038 != null && local2038.anIntArray306 != null) {
																Static125.method2339(local1986.anInt7514, 0, local1986.anInt7515, Static52.aClass11_Sub5_Sub2_Sub1_2 == local1986, local2038, local1986.aByte100);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local1581 = local73 >> 28 & 0x3;
									local1589 = (local73 >> 14 & 0x3FFF) - Static426.anInt7325;
									local766 = (local73 & 0x3FFF) - Static72.anInt1776;
									if (local1589 >= 0 && local766 >= 0 && Static193.anInt3853 > local1589 && local766 < Static301.anInt5585) {
										local773 = local1589 * 128 + 64;
										local878 = local766 * 128 + 64;
										local1627 = local1581;
										if (local1581 < 3 && Static34.method498(local1589, local766)) {
											local1627 = local1581 + 1;
										}
										@Pc(1660) Class11_Sub5_Sub3 local1660 = new Class11_Sub5_Sub3(local235, 0, Static277.anInt2834, local1581, local1627, local773, Static21.method356(local773, local878, local1581) - local214, local878, local1589, local1589, local766, local766, local231);
										Static325.aClass91_36.method2587(new Class4_Sub1_Sub2(local1660));
									}
								}
								Static432.aClass214_220 = null;
								return true;
							} else if (Static399.aClass214_212 == Static432.aClass214_220) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4564();
								local73 = Static196.aClass4_Sub20_Sub1_4.method4596();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4606();
								local231 = Static196.aClass4_Sub20_Sub1_4.method4594();
								if (Static89.method1784(local222)) {
									Static194.method3459(local73, local231, local214);
								}
								Static432.aClass214_220 = null;
								return true;
							} else if (Static3.aClass214_47 == Static432.aClass214_220) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
								local73 = Static196.aClass4_Sub20_Sub1_4.method4617();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4607();
								@Pc(2345) Class4_Sub44 local2345 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local222);
								if (local2345 != null) {
									Static204.method3630(local214, local2345.aClass11_Sub5_Sub2_Sub2_2, local73);
								}
								Static432.aClass214_220 = null;
								return true;
							} else if (Static432.aClass214_220 == Static409.aClass214_215) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
								@Pc(2373) boolean local2373 = (local214 & 0x1) == 1;
								local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
								local1131 = Static196.aClass4_Sub20_Sub1_4.method4624();
								if (local1131.equals("")) {
									local1131 = local850;
								}
								local1133 = Static196.aClass4_Sub20_Sub1_4.method4624();
								local1160 = Static196.aClass4_Sub20_Sub1_4.method4624();
								if (local1160.equals("")) {
									local1160 = local1133;
								}
								if (local2373) {
									for (local1581 = 0; local1581 < Static401.anInt7085; local1581++) {
										if (Static146.aStringArray15[local1581].equals(local1160)) {
											Static225.aStringArray20[local1581] = local850;
											Static146.aStringArray15[local1581] = local1131;
											Static244.aStringArray22[local1581] = local1133;
											Static253.aStringArray23[local1581] = local1160;
											break;
										}
									}
								} else {
									Static225.aStringArray20[Static401.anInt7085] = local850;
									Static146.aStringArray15[Static401.anInt7085] = local1131;
									Static244.aStringArray22[Static401.anInt7085] = local1133;
									Static253.aStringArray23[Static401.anInt7085] = local1160;
									Static295.aBooleanArray106[Static401.anInt7085] = (local214 & 0x2) == 2;
									Static401.anInt7085++;
								}
								Static432.aClass214_220 = null;
								Static368.anInt6378 = Static446.anInt7635;
								return true;
							} else if (Static432.aClass214_220 == Static345.aClass214_190) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
								@Pc(2497) Object[] local2497 = new Object[local848.length() + 1];
								for (local231 = local848.length() - 1; local231 >= 0; local231--) {
									if (local848.charAt(local231) == 's') {
										local2497[local231 + 1] = Static196.aClass4_Sub20_Sub1_4.method4624();
									} else {
										local2497[local231 + 1] = Integer.valueOf(Static196.aClass4_Sub20_Sub1_4.method4595());
									}
								}
								local2497[0] = Integer.valueOf(Static196.aClass4_Sub20_Sub1_4.method4595());
								if (Static89.method1784(local214)) {
									@Pc(2552) Class4_Sub10 local2552 = new Class4_Sub10();
									local2552.anObjectArray4 = local2497;
									Static64.method1462(local2552);
								}
								Static432.aClass214_220 = null;
								return true;
							} else if (Static61.aClass214_59 == Static432.aClass214_220) {
								Static178.method3293(Static34.aClass49_5);
								Static432.aClass214_220 = null;
								return true;
							} else if (Static432.aClass214_220 == Static440.aClass214_225) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
								if (local73 == 65535) {
									local73 = -1;
								}
								local222 = Static196.aClass4_Sub20_Sub1_4.method4602();
								Static356.method5132(local73, local214, local222);
								Static432.aClass214_220 = null;
								return true;
							} else if (Static432.aClass214_220 == Static132.aClass214_95) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
								if (local214 == 65535) {
									local214 = -1;
								}
								local73 = Static196.aClass4_Sub20_Sub1_4.method4602();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4591();
								Static6.method64(local73, local222, local214);
								Static432.aClass214_220 = null;
								return true;
							} else if (Static297.aClass214_168 == Static432.aClass214_220) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4623();
								if (local214 == 65535) {
									local214 = -1;
								}
								local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4570();
								if (Static89.method1784(local73)) {
									Static30.method445(-1, 1, local222, local214);
								}
								Static432.aClass214_220 = null;
								return true;
							} else if (Static432.aClass214_220 == Static340.aClass214_187) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
								@Pc(2676) byte local2676 = Static196.aClass4_Sub20_Sub1_4.method4576();
								Static67.aClass224_1.method5161(local2676, local214);
								Static432.aClass214_220 = null;
								return true;
							} else if (Static418.aClass214_105 == Static432.aClass214_220) {
								local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
								local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local222 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local235 = Static196.aClass4_Sub20_Sub1_4.method4614();
								local248 = Static196.aClass4_Sub20_Sub1_4.method4560();
								if (Static89.method1784(local214)) {
									Static287.aBooleanArray109[local73] = true;
									Static150.anIntArray257[local73] = local222;
									Static186.anIntArray294[local73] = local231;
									Static406.anIntArray528[local73] = local235;
									Static368.anIntArray514[local73] = local248;
								}
								Static432.aClass214_220 = null;
								return true;
							} else {
								@Pc(2762) boolean local2762;
								if (Static432.aClass214_220 == Static379.aClass214_205) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4602();
									local2762 = (local73 & 0x1) == 1;
									Static350.method5094(local214, local2762);
									Static390.anIntArray544[Static452.anInt7748++ & 0x1F] = local214;
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static35.aClass214_29) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4618();
									local222 = Static196.aClass4_Sub20_Sub1_4.method4580();
									Static155.anIntArray262[local73] = local222;
									Static19.anIntArray23[local73] = local214;
									Static103.anIntArray193[local73] = 1;
									local231 = Static10.anIntArray14[local73] - 1;
									for (local235 = 0; local235 < local231; local235++) {
										if (local222 >= Class243.anIntArray569[local235]) {
											Static103.anIntArray193[local73] = local235 + 2;
										}
									}
									Static416.anIntArray590[Static74.anInt1842++ & 0x1F] = local73;
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == aClass214_198) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
									local2762 = (local73 & 0x1) == 1;
									while (Static136.anInt2819 > Static196.aClass4_Sub20_Sub1_4.anInt5526) {
										local231 = Static196.aClass4_Sub20_Sub1_4.method4575();
										local235 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local248 = 0;
										if (local235 != 0) {
											local248 = Static196.aClass4_Sub20_Sub1_4.method4614();
											if (local248 == 255) {
												local248 = Static196.aClass4_Sub20_Sub1_4.method4595();
											}
										}
										Static307.method5984(local231, local214, local235 - 1, local248, local2762);
									}
									Static390.anIntArray544[Static452.anInt7748++ & 0x1F] = local214;
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static262.aClass214_157) {
									Static188.method3406(false);
									Static432.aClass214_220 = null;
									return true;
								} else if (Static442.aClass214_227 == Static432.aClass214_220) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4623();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4580();
									Static67.aClass224_1.method5161(local73, local214);
									Static432.aClass214_220 = null;
									return true;
								} else if (Static114.aClass214_88 == Static432.aClass214_220) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4623();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4570();
									local222 = Static196.aClass4_Sub20_Sub1_4.method4618();
									if (Static89.method1784(local214)) {
										Static103.method1964(local222, local73);
									}
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static61.aClass214_58) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
									if (local214 == 65535) {
										local214 = -1;
									}
									local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
									local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
									local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
									Static420.method5852(local73, local214, local231, local222);
									Static432.aClass214_220 = null;
									return true;
								} else if (Static323.aClass214_83 == Static432.aClass214_220) {
									local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
									local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
									local850 = local848;
									if (local627) {
										local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
									}
									local860 = Static196.aClass4_Sub20_Sub1_4.method4560();
									local865 = Static196.aClass4_Sub20_Sub1_4.method4582();
									local1589 = Static196.aClass4_Sub20_Sub1_4.method4614();
									local766 = Static196.aClass4_Sub20_Sub1_4.method4560();
									@Pc(3073) long local3073 = (local860 << 32) + local865;
									@Pc(3075) boolean local3075 = false;
									local2041 = 0;
									while (true) {
										if (local2041 >= 100) {
											if (local1589 <= 1 && Static75.method1641(local850)) {
												local3075 = true;
											}
											break;
										}
										if (Static453.aLongArray7[local2041] == local3073) {
											local3075 = true;
											break;
										}
										local2041++;
									}
									if (!local3075 && Static304.anInt5641 == 0) {
										Static453.aLongArray7[Static453.anInt7766] = local3073;
										Static453.anInt7766 = (Static453.anInt7766 + 1) % 100;
										@Pc(3133) String local3133 = Static135.aClass75_2.method2200(local766).method468(Static196.aClass4_Sub20_Sub1_4);
										if (local1589 == 2) {
											Static7.method71("<img=1>" + local850, local3133, 0, "<img=1>" + local848, null, local766, 18);
										} else if (local1589 == 1) {
											Static7.method71("<img=0>" + local850, local3133, 0, "<img=0>" + local848, null, local766, 18);
										} else {
											Static7.method71(local850, local3133, 0, local848, null, local766, 18);
										}
									}
									Static432.aClass214_220 = null;
									return true;
								} else if (Static111.aClass214_87 == Static432.aClass214_220) {
									Static263.anInt5013 = Static196.aClass4_Sub20_Sub1_4.method4602();
									Static98.anInt2102 = Static196.aClass4_Sub20_Sub1_4.method4617();
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static17.aClass214_15) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4564();
									local222 = Static196.aClass4_Sub20_Sub1_4.method4580();
									local231 = Static196.aClass4_Sub20_Sub1_4.method4607();
									if (Static89.method1784(local231)) {
										Static30.method445(local222, 5, local73, local214);
									}
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static215.aClass214_146) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4607();
									local222 = Static196.aClass4_Sub20_Sub1_4.method4595();
									if (Static89.method1784(local73)) {
										Static322.method4803(local214, local222);
									}
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static430.aClass214_219) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4580();
									if (Static89.method1784(local214)) {
										Static30.method445(-1, 3, local73, -1);
									}
									Static432.aClass214_220 = null;
									return true;
								} else if (Static432.aClass214_220 == Static461.aClass214_173) {
									local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
									local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
									@Pc(3315) byte local3315 = Static196.aClass4_Sub20_Sub1_4.method4576();
									if (Static89.method1784(local73)) {
										Static303.method4679(local3315, local214);
									}
									Static432.aClass214_220 = null;
									return true;
								} else {
									@Pc(3654) String local3654;
									if (Static432.aClass214_220 == Static294.aClass214_166) {
										while (Static196.aClass4_Sub20_Sub1_4.anInt5526 < Static136.anInt2819) {
											local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
											local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
											local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
											local231 = Static196.aClass4_Sub20_Sub1_4.method4560();
											local235 = Static196.aClass4_Sub20_Sub1_4.method4614();
											local1160 = "";
											local771 = false;
											if (local231 > 0) {
												local1160 = Static196.aClass4_Sub20_Sub1_4.method4624();
												local771 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
											}
											for (local1589 = 0; local1589 < Static65.anInt1626; local1589++) {
												if (local627) {
													if (local850.equals(Static75.aStringArray9[local1589])) {
														Static75.aStringArray9[local1589] = local848;
														Static108.aStringArray10[local1589] = local850;
														local848 = null;
														break;
													}
												} else if (local848.equals(Static75.aStringArray9[local1589])) {
													if (Static269.anIntArray390[local1589] != local231) {
														local2001 = true;
														for (@Pc(3422) Class71_Sub1_Sub1 local3422 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6246(); local3422 != null; local3422 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6249()) {
															if (local3422.aString17.equals(local848)) {
																if (local231 != 0 && local3422.aShort22 == 0) {
																	local2001 = false;
																	local3422.method6187();
																} else if (local231 == 0 && local3422.aShort22 != 0) {
																	local2001 = false;
																	local3422.method6187();
																}
															}
														}
														if (local2001) {
															Static436.aClass273_8.method6247(new Class71_Sub1_Sub1(local848, local231));
														}
														Static269.anIntArray390[local1589] = local231;
													}
													Static108.aStringArray10[local1589] = local850;
													Static5.aStringArray1[local1589] = local1160;
													Static158.anIntArray216[local1589] = local235;
													Static121.aBooleanArray154[local1589] = local771;
													local848 = null;
													break;
												}
											}
											if (local848 != null && Static65.anInt1626 < 200) {
												Static75.aStringArray9[Static65.anInt1626] = local848;
												Static108.aStringArray10[Static65.anInt1626] = local850;
												Static269.anIntArray390[Static65.anInt1626] = local231;
												Static5.aStringArray1[Static65.anInt1626] = local1160;
												Static158.anIntArray216[Static65.anInt1626] = local235;
												Static121.aBooleanArray154[Static65.anInt1626] = local771;
												Static65.anInt1626++;
											}
										}
										Static368.anInt6378 = Static446.anInt7635;
										Static6.anInt75 = 2;
										local73 = Static65.anInt1626;
										while (local73 > 0) {
											local627 = true;
											local73--;
											for (local222 = 0; local222 < local73; local222++) {
												if (Static269.anIntArray390[local222] != Static302.aClass9_6.anInt84 && Static302.aClass9_6.anInt84 == Static269.anIntArray390[local222 + 1] || Static269.anIntArray390[local222] == 0 && Static269.anIntArray390[local222 + 1] != 0) {
													local231 = Static269.anIntArray390[local222];
													Static269.anIntArray390[local222] = Static269.anIntArray390[local222 + 1];
													Static269.anIntArray390[local222 + 1] = local231;
													local1133 = Static5.aStringArray1[local222];
													Static5.aStringArray1[local222] = Static5.aStringArray1[local222 + 1];
													Static5.aStringArray1[local222 + 1] = local1133;
													local1160 = Static75.aStringArray9[local222];
													Static75.aStringArray9[local222] = Static75.aStringArray9[local222 + 1];
													Static75.aStringArray9[local222 + 1] = local1160;
													local3654 = Static108.aStringArray10[local222];
													Static108.aStringArray10[local222] = Static108.aStringArray10[local222 + 1];
													Static108.aStringArray10[local222 + 1] = local3654;
													local1589 = Static158.anIntArray216[local222];
													Static158.anIntArray216[local222] = Static158.anIntArray216[local222 + 1];
													Static158.anIntArray216[local222 + 1] = local1589;
													local2001 = Static121.aBooleanArray154[local222];
													Static121.aBooleanArray154[local222] = Static121.aBooleanArray154[local222 + 1];
													local627 = false;
													Static121.aBooleanArray154[local222 + 1] = local2001;
												}
											}
											if (local627) {
												break;
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static382.aClass214_136) {
										Static401.anInt7085 = Static196.aClass4_Sub20_Sub1_4.method4614();
										for (local214 = 0; local214 < Static401.anInt7085; local214++) {
											Static225.aStringArray20[local214] = Static196.aClass4_Sub20_Sub1_4.method4624();
											Static146.aStringArray15[local214] = Static196.aClass4_Sub20_Sub1_4.method4624();
											if (Static146.aStringArray15[local214].equals("")) {
												Static146.aStringArray15[local214] = Static225.aStringArray20[local214];
											}
											Static244.aStringArray22[local214] = Static196.aClass4_Sub20_Sub1_4.method4624();
											Static253.aStringArray23[local214] = Static196.aClass4_Sub20_Sub1_4.method4624();
											if (Static253.aStringArray23[local214].equals("")) {
												Static253.aStringArray23[local214] = Static244.aStringArray22[local214];
											}
											Static295.aBooleanArray106[local214] = false;
										}
										Static368.anInt6378 = Static446.anInt7635;
										Static432.aClass214_220 = null;
										return true;
									} else if (Static461.aClass214_172 == Static432.aClass214_220) {
										Static424.aString76 = Static136.anInt2819 > 2 ? Static196.aClass4_Sub20_Sub1_4.method4624() : Static266.aClass21_73.method362(Static168.anInt3290);
										Static87.anInt1988 = Static136.anInt2819 <= 0 ? -1 : Static196.aClass4_Sub20_Sub1_4.method4560();
										Static432.aClass214_220 = null;
										if (Static87.anInt1988 == 65535) {
											Static87.anInt1988 = -1;
										}
										return true;
									} else if (Static432.aClass214_220 == Static72.aClass214_67) {
										Static178.method3293(Static264.aClass49_21);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static159.aClass214_113) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
										if (Static196.aClass4_Sub20_Sub1_4.method4614() == 0) {
											Static329.aClass155Array1[local214] = new Class155();
										} else {
											Static196.aClass4_Sub20_Sub1_4.anInt5526--;
											Static329.aClass155Array1[local214] = new Class155(Static196.aClass4_Sub20_Sub1_4);
										}
										Static432.aClass214_220 = null;
										Static189.anInt3810 = Static446.anInt7635;
										return true;
									} else if (Static432.aClass214_220 == Static276.aClass214_162) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4564();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4596();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
										if (Static89.method1784(local222)) {
											Static233.method3941(local73, local214);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static228.aClass214_144 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
										if (Static89.method1784(local214)) {
											method5228(local850, local73);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static441.aClass214_226 == Static432.aClass214_220) {
										Static171.method3013();
										Static432.aClass214_220 = null;
										return false;
									} else if (Static21.aClass214_20 == Static432.aClass214_220) {
										Static63.method1459();
										Static432.aClass214_220 = null;
										return true;
									} else if (Static257.aClass214_153 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (local214 == 65535) {
											local214 = -1;
										}
										local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4580();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4595();
										local235 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (local235 == 65535) {
											local235 = -1;
										}
										if (Static89.method1784(local73)) {
											for (local248 = local235; local248 <= local214; local248++) {
												local258 = ((long) local222 << 32) + ((long) local248);
												local264 = (Class4_Sub45) Static135.aClass96_15.method2797(local258);
												if (local264 != null) {
													local273 = new Class4_Sub45(local231, local264.anInt7348);
													local264.method6330();
												} else if (local248 == -1) {
													local273 = new Class4_Sub45(local231, Static92.method1820(local222).aClass4_Sub45_2.anInt7348);
												} else {
													local273 = new Class4_Sub45(local231, -1);
												}
												Static135.aClass96_15.method2805(local258, local273);
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static80.aClass214_70) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4580();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4580();
										if (Static89.method1784(local214)) {
											@Pc(4085) Class4_Sub39 local4085 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local73);
											local1223 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local222);
											if (local1223 != null) {
												Static298.method4546(local1223, local4085 == null || local4085.anInt6721 != local1223.anInt6721, false);
											}
											if (local4085 != null) {
												local4085.method6330();
												Static157.aClass96_22.method2805((long) local222, local4085);
											}
											@Pc(4127) Class240 local4127 = Static92.method1820(local73);
											if (local4127 != null) {
												Static273.method4374(local4127);
											}
											local4127 = Static92.method1820(local222);
											if (local4127 != null) {
												Static273.method4374(local4127);
												Static354.method5123(local4127, true);
											}
											if (Static248.anInt4793 != -1) {
												Static132.method2437(Static248.anInt4793, 1);
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static235.aClass214_148) {
										local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local850 = local848;
										if (local627) {
											local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
										}
										local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local235 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local1568 = false;
										if (local231 <= 1 && Static75.method1641(local850)) {
											local1568 = true;
										}
										if (!local1568 && Static304.anInt5641 == 0) {
											local3654 = Static135.aClass75_2.method2200(local235).method468(Static196.aClass4_Sub20_Sub1_4);
											if (local231 == 2) {
												Static7.method71("<img=1>" + local850, local3654, 0, "<img=1>" + local848, null, local235, 25);
											} else if (local231 == 1) {
												Static7.method71("<img=0>" + local850, local3654, 0, "<img=0>" + local848, null, local235, 25);
											} else {
												Static7.method71(local850, local3654, 0, local848, null, local235, 25);
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static86.aClass214_71) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4595();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4623();
										local235 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (Static89.method1784(local231)) {
											Static30.method445(local214, 7, local73, local235 << 16 | local222);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static390.aClass214_208) {
										Static178.method3293(Static413.aClass49_20);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static125.aClass214_91 == Static432.aClass214_220) {
										Static178.method3293(Static265.aClass49_16);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static20.aClass214_217) {
										Static188.method3406(true);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static89.aClass214_73) {
										local1281 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local2762 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										if (local2762) {
											local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
										} else {
											local848 = local1281;
										}
										local231 = Static196.aClass4_Sub20_Sub1_4.method4560();
										@Pc(4386) byte local4386 = Static196.aClass4_Sub20_Sub1_4.method4576();
										local1568 = false;
										if (local4386 == -128) {
											local1568 = true;
										}
										if (local1568) {
											if (Static422.anInt7300 == 0) {
												Static432.aClass214_220 = null;
												return true;
											}
											for (local1581 = 0; Static422.anInt7300 > local1581 && (!Static87.aClass152Array1[local1581].aString37.equals(local848) || Static87.aClass152Array1[local1581].anInt4611 != local231); local1581++) {
											}
											if (Static422.anInt7300 > local1581) {
												while (Static422.anInt7300 - 1 > local1581) {
													Static87.aClass152Array1[local1581] = Static87.aClass152Array1[local1581 + 1];
													local1581++;
												}
												Static422.anInt7300--;
												Static87.aClass152Array1[Static422.anInt7300] = null;
											}
										} else {
											local3654 = Static196.aClass4_Sub20_Sub1_4.method4624();
											local794 = new Class152();
											local794.aString36 = local1281;
											local794.aString37 = local848;
											local794.aString38 = Static315.method4358(local794.aString37);
											local794.anInt4611 = local231;
											local794.aString39 = local3654;
											local794.aByte47 = local4386;
											for (local766 = Static422.anInt7300 - 1; local766 >= 0; local766--) {
												local773 = Static87.aClass152Array1[local766].aString38.compareTo(local794.aString38);
												if (local773 == 0) {
													Static87.aClass152Array1[local766].anInt4611 = local231;
													Static87.aClass152Array1[local766].aByte47 = local4386;
													Static87.aClass152Array1[local766].aString39 = local3654;
													if (local848.equals(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31)) {
														Static186.aByte25 = local4386;
													}
													Static184.anInt3736 = Static446.anInt7635;
													Static432.aClass214_220 = null;
													return true;
												}
												if (local773 < 0) {
													break;
												}
											}
											if (Static87.aClass152Array1.length <= Static422.anInt7300) {
												Static432.aClass214_220 = null;
												return true;
											}
											for (local773 = Static422.anInt7300 - 1; local773 > local766; local773--) {
												Static87.aClass152Array1[local773 + 1] = Static87.aClass152Array1[local773];
											}
											if (Static422.anInt7300 == 0) {
												Static87.aClass152Array1 = new Class152[100];
											}
											Static87.aClass152Array1[local766 + 1] = local794;
											Static422.anInt7300++;
											if (local848.equals(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31)) {
												Static186.aByte25 = local4386;
											}
										}
										Static432.aClass214_220 = null;
										Static184.anInt3736 = Static446.anInt7635;
										return true;
									} else if (Static432.aClass214_220 == Static317.aClass214_176) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (local214 == 65535) {
											local214 = -1;
										}
										local73 = Static196.aClass4_Sub20_Sub1_4.method4564();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (Static89.method1784(local222)) {
											Static30.method445(-1, 2, local73, local214);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static326.aClass214_181 == Static432.aClass214_220) {
										Static178.method3293(Static289.aClass49_18);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static319.aClass214_177 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4595();
										Static177.aClass87_4 = Static390.aClass255_5.method5832(local214);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static328.aClass214_182 == Static432.aClass214_220) {
										Static322.method4801(Static196.aClass4_Sub20_Sub1_4, Static136.anInt2819);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static25.aClass214_24) {
										local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local850 = local848;
										if (local627) {
											local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
										}
										local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
										@Pc(4702) boolean local4702 = false;
										if (local231 <= 1) {
											if (Static238.aBoolean310 && !Static53.aBoolean301 || Static317.aBoolean427) {
												local4702 = true;
											} else if (local231 <= 1 && Static75.method1641(local850)) {
												local4702 = true;
											}
										}
										if (!local4702 && Static304.anInt5641 == 0) {
											local1160 = Static105.method2007(Static110.method2178(Static196.aClass4_Sub20_Sub1_4));
											if (local231 == 2) {
												Static7.method71("<img=1>" + local850, local1160, 0, "<img=1>" + local848, null, -1, 24);
											} else if (local231 == 1) {
												Static7.method71("<img=0>" + local850, local1160, 0, "<img=0>" + local848, null, -1, 24);
											} else {
												Static7.method71(local850, local1160, 0, local848, null, -1, 24);
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static465.aClass214_230) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4607();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4595();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4623();
										if (Static89.method1784(local214)) {
											Static31.method451((local231 << 16) + local73, local222);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static9.aClass214_8 == Static432.aClass214_220) {
										Static76.anInt1857 = Static196.aClass4_Sub20_Sub1_4.method4614();
										Static432.aClass214_220 = null;
										Static234.anInt4636 = Static446.anInt7635;
										return true;
									} else if (Static2.aClass214_1 == Static432.aClass214_220) {
										Static196.aClass4_Sub20_Sub1_4.anInt5526 += 28;
										if (Static196.aClass4_Sub20_Sub1_4.method4597()) {
											Static75.method1640(Static196.aClass4_Sub20_Sub1_4.anInt5526 - 28, Static196.aClass4_Sub20_Sub1_4);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static323.aClass214_82) {
										Static432.aClass214_220 = null;
										Static6.anInt75 = 1;
										Static368.anInt6378 = Static446.anInt7635;
										return true;
									} else if (Static432.aClass214_220 == Static68.aClass214_62) {
										Static392.anInt6820 = Static196.aClass4_Sub20_Sub1_4.method4605() << 3;
										Static107.anInt2321 = Static196.aClass4_Sub20_Sub1_4.method4602();
										Static389.anInt6757 = Static196.aClass4_Sub20_Sub1_4.method4576() << 3;
										while (Static196.aClass4_Sub20_Sub1_4.anInt5526 < Static136.anInt2819) {
											@Pc(4912) Class49 local4912 = Static339.method4978()[Static196.aClass4_Sub20_Sub1_4.method4614()];
											Static178.method3293(local4912);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static369.aClass214_199) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local73 = local214 >> 5;
										local222 = local214 & 0x1F;
										if (local222 == 0) {
											Static209.aClass51Array1[local73] = null;
											Static432.aClass214_220 = null;
											return true;
										}
										@Pc(4956) Class51 local4956 = new Class51();
										local4956.anInt1749 = local222;
										local4956.anInt1744 = Static196.aClass4_Sub20_Sub1_4.method4614();
										if (local4956.anInt1744 >= 0 && Static355.aClass2Array37.length > local4956.anInt1744) {
											if (local4956.anInt1749 == 1 || local4956.anInt1749 == 10) {
												local4956.anInt1740 = Static196.aClass4_Sub20_Sub1_4.method4560();
												Static196.aClass4_Sub20_Sub1_4.anInt5526 += 6;
											} else if (local4956.anInt1749 >= 2 && local4956.anInt1749 <= 6) {
												if (local4956.anInt1749 == 2) {
													local4956.anInt1748 = 64;
													local4956.anInt1746 = 64;
												}
												if (local4956.anInt1749 == 3) {
													local4956.anInt1748 = 64;
													local4956.anInt1746 = 0;
												}
												if (local4956.anInt1749 == 4) {
													local4956.anInt1748 = 64;
													local4956.anInt1746 = 128;
												}
												if (local4956.anInt1749 == 5) {
													local4956.anInt1746 = 64;
													local4956.anInt1748 = 0;
												}
												if (local4956.anInt1749 == 6) {
													local4956.anInt1746 = 64;
													local4956.anInt1748 = 128;
												}
												local4956.anInt1749 = 2;
												local4956.anInt1742 = Static196.aClass4_Sub20_Sub1_4.method4614();
												local4956.anInt1746 += Static196.aClass4_Sub20_Sub1_4.method4560() - Static426.anInt7325 << 7;
												local4956.anInt1748 += Static196.aClass4_Sub20_Sub1_4.method4560() - Static72.anInt1776 << 7;
												local4956.anInt1745 = Static196.aClass4_Sub20_Sub1_4.method4614() << 0;
												local4956.anInt1738 = Static196.aClass4_Sub20_Sub1_4.method4560();
											}
											local4956.anInt1747 = Static196.aClass4_Sub20_Sub1_4.method4560();
											if (local4956.anInt1747 == 65535) {
												local4956.anInt1747 = -1;
											}
											Static209.aClass51Array1[local73] = local4956;
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static15.aClass214_9) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (local214 == 65535) {
											local214 = -1;
										}
										local73 = Static196.aClass4_Sub20_Sub1_4.method4618();
										local222 = local73 >> 2;
										local231 = local73 & 0x3;
										local235 = Static86.anIntArray170[local222];
										local248 = Static196.aClass4_Sub20_Sub1_4.method4580();
										local1581 = local248 >> 28 & 0x3;
										local1589 = local248 >> 14 & 0x3FFF;
										local1589 -= Static426.anInt7325;
										local766 = local248 & 0x3FFF;
										@Pc(5189) int local5189 = local766 - Static72.anInt1776;
										Static396.method5603(local1581, local222, local235, local231, local214, local1589, local5189);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static274.aClass214_161) {
										Static431.anInt7385 = Static196.aClass4_Sub20_Sub1_4.method4614();
										Static432.aClass214_220 = null;
										return true;
									} else if (Static210.aClass214_139 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4623();
										Static67.aClass224_1.method5158(local73, local214);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static218.aClass214_140 == Static432.aClass214_220) {
										local1281 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local850 = Static135.aClass75_2.method2200(local73).method468(Static196.aClass4_Sub20_Sub1_4);
										Static7.method71(local1281, local850, 0, local1281, null, local73, 19);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static162.aClass214_65) {
										Static107.anInt2321 = Static196.aClass4_Sub20_Sub1_4.method4617();
										Static392.anInt6820 = Static196.aClass4_Sub20_Sub1_4.method4576() << 3;
										Static389.anInt6757 = Static196.aClass4_Sub20_Sub1_4.method4605() << 3;
										for (@Pc(5289) Class4_Sub47 local5289 = (Class4_Sub47) Static377.aClass96_31.method2798(); local5289 != null; local5289 = (Class4_Sub47) Static377.aClass96_31.method2796()) {
											local73 = (int) (local5289.aLong228 >> 28 & 0x3L);
											local222 = (int) (local5289.aLong228 & 0x3FFFL);
											local231 = local222 - Static426.anInt7325;
											local235 = (int) (local5289.aLong228 >> 14 & 0x3FFFL);
											local248 = local235 - Static72.anInt1776;
											if (Static107.anInt2321 == local73 && local231 >= Static392.anInt6820 && local231 < Static392.anInt6820 + 8 && Static389.anInt6757 <= local248 && local248 < Static389.anInt6757 + 8) {
												local5289.method6330();
												if (local231 >= 0 && local248 >= 0 && Static193.anInt3853 > local231 && local248 < Static301.anInt5585) {
													method5225(local231, Static107.anInt2321, local248);
												}
											}
										}
										for (@Pc(5394) Class4_Sub36 local5394 = (Class4_Sub36) Static190.aClass91_25.method2584(); local5394 != null; local5394 = (Class4_Sub36) Static190.aClass91_25.method2586()) {
											if (local5394.anInt6592 >= Static392.anInt6820 && local5394.anInt6592 < Static392.anInt6820 + 8 && Static389.anInt6757 <= local5394.anInt6587 && Static389.anInt6757 + 8 > local5394.anInt6587 && local5394.anInt6599 == Static107.anInt2321) {
												local5394.anInt6584 = 0;
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static39.aClass214_36 == Static432.aClass214_220) {
										Static178.method3293(Static234.aClass49_15);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static272.aClass214_159 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4595();
										if (Static89.method1784(local214)) {
											@Pc(5470) Class4_Sub39 local5470 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local73);
											if (local5470 != null) {
												Static298.method4546(local5470, true, false);
											}
											if (Static341.aClass240_13 != null) {
												Static273.method4374(Static341.aClass240_13);
												Static341.aClass240_13 = null;
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static70.aClass214_66) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (local214 == 65535) {
											local214 = -1;
										}
										local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4614();
										Static236.method3985(local222, local214, local73, local231);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static347.aClass214_191) {
										if (Static124.aFrame2 != null) {
											Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
										}
										@Pc(5537) byte[] local5537 = new byte[Static136.anInt2819];
										Static196.aClass4_Sub20_Sub1_4.method3244(Static136.anInt2819, local5537);
										local848 = Static268.method4311(Static136.anInt2819, local5537, 0);
										Static45.method930(local848, true, Static390.aClass255_5, Static192.anInt3828 == 1);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static448.aClass214_229 == Static432.aClass214_220) {
										Static178.method3293(Static376.aClass49_19);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static283.aClass214_61) {
										Static59.anInt1457 = Static196.aClass4_Sub20_Sub1_4.method4589();
										Static238.aBoolean310 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										Static432.aClass214_220 = null;
										return true;
									} else if (Static155.aClass214_110 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4617();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
										if (Static89.method1784(local73)) {
											if (local214 == 2) {
												Static52.method1153();
											}
											Static248.anInt4793 = local222;
											Static80.method1690(local222);
											Static393.method5536(false);
											Static64.method1472(Static248.anInt4793);
											for (local231 = 0; local231 < 100; local231++) {
												Static353.aBooleanArray124[local231] = true;
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static389.aClass214_207) {
										Static178.method3293(Static267.aClass49_17);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static198.aClass214_135 == Static432.aClass214_220) {
										Static107.anInt2321 = Static196.aClass4_Sub20_Sub1_4.method4614();
										Static389.anInt6757 = Static196.aClass4_Sub20_Sub1_4.method4578() << 3;
										Static392.anInt6820 = Static196.aClass4_Sub20_Sub1_4.method4578() << 3;
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static266.aClass214_158) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (Static89.method1784(local214) && Static122.aClass240ArrayArray2[local73] != null) {
											for (local235 = local222; local235 < local231; local235++) {
												local248 = Static196.aClass4_Sub20_Sub1_4.method4582();
												if (Static122.aClass240ArrayArray2[local73].length > local235 && Static122.aClass240ArrayArray2[local73][local235] != null) {
													Static122.aClass240ArrayArray2[local73][local235].anInt6844 = local248;
												}
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static216.aClass214_179) {
										local1281 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4607();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4564();
										if (Static89.method1784(local73)) {
											Static150.method2786(local1281, local222);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static258.aClass214_132) {
										Static443.anInt7558 = Static196.aClass4_Sub20_Sub1_4.method4586();
										Static234.anInt4636 = Static446.anInt7635;
										Static432.aClass214_220 = null;
										return true;
									} else if (Static173.aClass214_127 == Static432.aClass214_220) {
										Static178.method3293(Static199.aClass49_2);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static459.aClass214_223 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (Static89.method1784(local214)) {
											Static199.method178();
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static80.aClass214_69) {
										Static178.method3293(Static42.aClass49_6);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static215.aClass214_147 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local231 = Static196.aClass4_Sub20_Sub1_4.method4560() << 0;
										local235 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local248 = Static196.aClass4_Sub20_Sub1_4.method4614();
										if (Static89.method1784(local214)) {
											Static23.method363(local235, local73, local248, true, local231, local222);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static402.aClass214_213) {
										Static91.method1815(Static82.aBoolean141);
										Static432.aClass214_220 = null;
										return false;
									} else if (Static439.aClass214_224 == Static432.aClass214_220) {
										local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										local848 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local850 = local848;
										if (local627) {
											local850 = Static196.aClass4_Sub20_Sub1_4.method4624();
										}
										local860 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local865 = Static196.aClass4_Sub20_Sub1_4.method4582();
										local1589 = Static196.aClass4_Sub20_Sub1_4.method4614();
										@Pc(5925) long local5925 = local865 + (local860 << 32);
										@Pc(5927) boolean local5927 = false;
										local1627 = 0;
										while (true) {
											if (local1627 >= 100) {
												if (local1589 <= 1) {
													if (Static238.aBoolean310 && !Static53.aBoolean301 || Static317.aBoolean427) {
														local5927 = true;
													} else if (Static75.method1641(local850)) {
														local5927 = true;
													}
												}
												break;
											}
											if (Static453.aLongArray7[local1627] == local5925) {
												local5927 = true;
												break;
											}
											local1627++;
										}
										if (!local5927 && Static304.anInt5641 == 0) {
											Static453.aLongArray7[Static453.anInt7766] = local5925;
											Static453.anInt7766 = (Static453.anInt7766 + 1) % 100;
											@Pc(5995) String local5995 = Static105.method2007(Static110.method2178(Static196.aClass4_Sub20_Sub1_4));
											if (local1589 == 2) {
												Static7.method71("<img=1>" + local850, local5995, 0, "<img=1>" + local848, null, -1, 7);
											} else if (local1589 == 1) {
												Static7.method71("<img=0>" + local850, local5995, 0, "<img=0>" + local848, null, -1, 7);
											} else {
												Static7.method71(local850, local5995, 0, local848, null, -1, 3);
											}
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static259.aClass214_155 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4607();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4595();
										Static67.aClass224_1.method5158(local214, local73);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static445.aClass214_228 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local2762 = (local73 & 0x1) == 1;
										Static234.method3956(local2762, local214);
										local231 = Static196.aClass4_Sub20_Sub1_4.method4560();
										for (local235 = 0; local235 < local231; local235++) {
											local248 = Static196.aClass4_Sub20_Sub1_4.method4606();
											local1581 = Static196.aClass4_Sub20_Sub1_4.method4602();
											if (local1581 == 255) {
												local1581 = Static196.aClass4_Sub20_Sub1_4.method4570();
											}
											Static307.method5984(local235, local214, local248 - 1, local1581, local2762);
										}
										Static390.anIntArray544[Static452.anInt7748++ & 0x1F] = local214;
										Static432.aClass214_220 = null;
										return true;
									} else if (Static149.aClass214_108 == Static432.aClass214_220) {
										for (local214 = 0; local214 < Static39.aClass11_Sub5_Sub2_Sub1Array1.length; local214++) {
											if (Static39.aClass11_Sub5_Sub2_Sub1Array1[local214] != null) {
												Static39.aClass11_Sub5_Sub2_Sub1Array1[local214].anInt6505 = -1;
											}
										}
										for (local73 = 0; local73 < Static328.anInt5871; local73++) {
											Static154.aClass4_Sub44Array1[local73].aClass11_Sub5_Sub2_Sub2_2.anInt6505 = -1;
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static246.aClass214_150) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4623();
										if (local214 == 65535) {
											local214 = -1;
										}
										local73 = Static196.aClass4_Sub20_Sub1_4.method4570();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4623();
										if (Static89.method1784(local222)) {
											Static317.method4765(local73, local214);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static329.aClass214_183) {
										if (Static248.anInt4793 != -1) {
											Static132.method2437(Static248.anInt4793, 0);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static307.aClass214_222) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4580();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4606();
										if (Static89.method1784(local73)) {
											Static30.method445(0, 5, local214, Static147.anInt3062);
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static109.aClass214_85 == Static432.aClass214_220) {
										Static91.method1815(false);
										Static432.aClass214_220 = null;
										return false;
									} else if (Static404.aClass214_214 == Static432.aClass214_220) {
										Static178.method3293(Static193.aClass49_13);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static5.aClass214_7) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4606();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4618();
										if (Static89.method1784(local214)) {
											Static460.anInt7848 = local73;
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static432.aClass214_220 == Static165.aClass214_114) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4614();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4617();
										if (local73 == 255) {
											local214 = -1;
											local73 = -1;
										}
										Static68.method1517(local214, local73);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static90.aClass214_192 == Static432.aClass214_220) {
										local627 = Static196.aClass4_Sub20_Sub1_4.method4614() == 1;
										@Pc(6363) byte[] local6363 = new byte[Static136.anInt2819 - 1];
										Static196.aClass4_Sub20_Sub1_4.method4566(Static136.anInt2819 - 1, local6363);
										Static341.method4986(local627, local6363);
										Static432.aClass214_220 = null;
										return true;
									} else if (Static48.aClass214_40 == Static432.aClass214_220) {
										local214 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (Static89.method1784(local214)) {
											Static435.method5992();
										}
										Static432.aClass214_220 = null;
										return true;
									} else if (Static374.aClass214_203 == Static432.aClass214_220) {
										local1281 = Static196.aClass4_Sub20_Sub1_4.method4624();
										local73 = Static196.aClass4_Sub20_Sub1_4.method4560();
										local222 = Static196.aClass4_Sub20_Sub1_4.method4560();
										if (Static89.method1784(local222)) {
											method5228(local1281, local73);
										}
										Static432.aClass214_220 = null;
										return true;
									} else {
										Static417.method5814(null, "T1 - " + (Static432.aClass214_220 == null ? -1 : Static432.aClass214_220.method4988()) + "," + (Static20.aClass214_216 == null ? -1 : Static20.aClass214_216.method4988()) + "," + (Static72.aClass214_68 == null ? -1 : Static72.aClass214_68.method4988()) + " - " + Static136.anInt2819);
										Static91.method1815(false);
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

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIII)V")
	public static void method5224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static176.anInt3462 <= arg3 && arg5 <= Static418.anInt3023 && Static162.anInt1715 <= arg0 && Static55.anInt1319 >= arg2) {
			if (arg4 == 1) {
				Static130.method2414(arg2, arg3, arg5, arg1, arg0);
			} else {
				Static448.method6135(arg5, arg4, arg2, arg0, arg3, arg1);
			}
		} else if (arg4 == 1) {
			Static70.method1554(arg5, arg1, arg0, arg2, arg3);
		} else {
			Static301.method4652(arg4, arg3, arg1, arg5, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIZI)V")
	public static void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static426.anInt7325 + arg0;
		@Pc(13) int local13 = Static72.anInt1776 + arg2;
		if (Static294.aClass162ArrayArrayArray2 == null || arg0 < 0 || arg2 < 0 || arg0 >= Static193.anInt3853 || Static301.anInt5585 <= arg2) {
			return;
		}
		@Pc(40) long local40 = (long) (arg1 << 28 | local13 << 14 | local9);
		@Pc(46) Class4_Sub47 local46 = (Class4_Sub47) Static377.aClass96_31.method2797(local40);
		if (local46 == null) {
			Static224.method3829(arg1, arg0, arg2);
			return;
		}
		@Pc(60) Class4_Sub42 local60 = (Class4_Sub42) local46.aClass91_54.method2584();
		if (local60 == null) {
			Static224.method3829(arg1, arg0, arg2);
			return;
		}
		@Pc(74) Class11_Sub4_Sub1 local74 = (Class11_Sub4_Sub1) Static224.method3829(arg1, arg0, arg2);
		if (local74 == null) {
			local74 = new Class11_Sub4_Sub1();
		} else {
			local74.anInt1666 = local74.anInt1668 = -1;
		}
		local74.anInt1672 = local60.anInt7301;
		local74.anInt1669 = local60.anInt7299;
		label46: while (true) {
			@Pc(102) Class4_Sub42 local102 = (Class4_Sub42) local46.aClass91_54.method2586();
			if (local102 == null) {
				break;
			}
			if (local102.anInt7301 != local74.anInt1672) {
				local74.anInt1666 = local102.anInt7301;
				local74.anInt1667 = local102.anInt7299;
				while (true) {
					@Pc(123) Class4_Sub42 local123 = (Class4_Sub42) local46.aClass91_54.method2586();
					if (local123 == null) {
						break label46;
					}
					if (local74.anInt1672 != local123.anInt7301 && local123.anInt7301 != local74.anInt1666) {
						local74.anInt1675 = local123.anInt7299;
						local74.anInt1668 = local123.anInt7301;
					}
				}
			}
		}
		@Pc(171) int local171 = Static21.method356((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static283.method1515(arg1, arg0, arg2, local171, local74);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILjava/lang/String;I)V")
	private static void method5228(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub5 local13 = Static431.method5935(2, arg1);
		local13.method521();
		local13.aString2 = arg0;
	}
}
