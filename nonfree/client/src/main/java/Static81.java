import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!pk;")
	public static Class132 aClass132_33;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "[I")
	public static int[] anIntArray121 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIZI)V")
	public static void method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static92.method1483(arg0)) {
			Static224.method3488(arg2, arg3, Static210.aClass159ArrayArray6[arg0], -1, arg1);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lclient!ri;")
	public static Class144 method1346(@OriginalArg(1) int arg0) {
		@Pc(15) Class144 local15 = (Class144) Static138.aClass61_21.method1384((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(31) byte[] local31 = Static293.aClass132_91.method3194(Static48.method769(arg0), Static101.method1613(arg0));
		local15 = new Class144();
		local15.anInt4679 = arg0;
		if (local31 != null) {
			local15.method3530(new Class8_Sub2(local31));
		}
		Static138.aClass61_21.method1377((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!pk;B)V")
	public static void method1348(@OriginalArg(0) Class132 arg0) {
		Static16.anInt3523 = arg0.method3185("titlebg");
		Static58.anInt2231 = arg0.method3185("logo");
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
	public static boolean method1349() throws IOException {
		if (Static95.aClass92_4 == null) {
			return false;
		}
		@Pc(20) int local20 = Static95.aClass92_4.method2175();
		if (local20 == 0) {
			return false;
		}
		if (Static277.anInt5667 == -1) {
			local20--;
			Static95.aClass92_4.method2182(0, 1, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
			Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
			Static277.anInt5667 = Static275.aClass8_Sub2_Sub1_6.method2388();
			Static68.anInt1687 = Static135.anIntArray226[Static277.anInt5667];
		}
		if (Static68.anInt1687 == -1) {
			if (local20 <= 0) {
				return false;
			}
			Static95.aClass92_4.method2182(0, 1, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
			Static68.anInt1687 = Static275.aClass8_Sub2_Sub1_6.aByteArray24[0] & 0xFF;
			local20--;
		}
		if (Static68.anInt1687 == -2) {
			if (local20 <= 1) {
				return false;
			}
			Static95.aClass92_4.method2182(0, 2, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
			local20 -= 2;
			Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
			Static68.anInt1687 = Static275.aClass8_Sub2_Sub1_6.method2375();
		}
		if (Static68.anInt1687 > local20) {
			return false;
		}
		Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
		Static95.aClass92_4.method2182(0, Static68.anInt1687, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
		Static173.anInt3442 = Static188.anInt3774;
		Static17.anInt477 = 0;
		Static188.anInt3774 = Static93.anInt1952;
		Static93.anInt1952 = Static277.anInt5667;
		@Pc(165) int local165;
		@Pc(145) int local145;
		@Pc(157) int local157;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(161) int local161;
		if (Static277.anInt5667 == 115) {
			local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local153 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local157 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local161 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local165 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if (Static67.method1072(local145)) {
				Static25.method437(true, local161, local165, local149, local153, local157);
			}
			Static277.anInt5667 = -1;
			return true;
		} else if (Static277.anInt5667 == 216) {
			Static295.method2912();
			Static277.anInt5667 = -1;
			return true;
		} else if (Static277.anInt5667 == 164) {
			local145 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if (Static275.aClass8_Sub2_Sub1_6.method2334() == 0) {
				Static178.aClass94Array1[local145] = new Class94();
			} else {
				Static275.aClass8_Sub2_Sub1_6.anInt2955--;
				Static178.aClass94Array1[local145] = new Class94(Static275.aClass8_Sub2_Sub1_6);
			}
			Static279.anInt5450 = Static157.anInt5706;
			Static277.anInt5667 = -1;
			return true;
		} else if (Static277.anInt5667 == 93) {
			Static279.anInt5451 = Static275.aClass8_Sub2_Sub1_6.method2334();
			Static216.anInt4456 = Static275.aClass8_Sub2_Sub1_6.method2338();
			while (Static275.aClass8_Sub2_Sub1_6.anInt2955 < Static68.anInt1687) {
				Static277.anInt5667 = Static275.aClass8_Sub2_Sub1_6.method2334();
				Static279.method4117();
			}
			Static277.anInt5667 = -1;
			return true;
		} else {
			@Pc(280) long local280;
			@Pc(373) String local373;
			@Pc(275) long local275;
			@Pc(301) int local301;
			@Pc(295) int local295;
			@Pc(285) long local285;
			if (Static277.anInt5667 == 245) {
				local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
				local280 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local285 = Static275.aClass8_Sub2_Sub1_6.method2323();
				@Pc(291) long local291 = (local280 << 32) + local285;
				local295 = Static275.aClass8_Sub2_Sub1_6.method2334();
				@Pc(297) boolean local297 = false;
				local301 = Static275.aClass8_Sub2_Sub1_6.method2375();
				@Pc(303) int local303 = 0;
				label1302: while (true) {
					if (local303 >= 100) {
						if (local295 <= 1) {
							for (local303 = 0; local303 < Static30.anInt728; local303++) {
								if (local275 == Static213.aLongArray11[local303]) {
									local297 = true;
									break label1302;
								}
							}
						}
						break;
					}
					if (Static33.aLongArray1[local303] == local291) {
						local297 = true;
						break;
					}
					local303++;
				}
				if (!local297 && Static226.anInt4614 == 0) {
					Static33.aLongArray1[Static295.anInt3742] = local291;
					Static295.anInt3742 = (Static295.anInt3742 + 1) % 100;
					local373 = Static115.method1854(local301).method3130(Static275.aClass8_Sub2_Sub1_6);
					if (local295 == 2) {
						Static282.method648(18, local301, "<img=1>" + Static121.method1945(local275), local373, null);
					} else if (local295 == 1) {
						Static282.method648(18, local301, "<img=0>" + Static121.method1945(local275), local373, null);
					} else {
						Static282.method648(18, local301, Static121.method1945(local275), local373, null);
					}
				}
				Static277.anInt5667 = -1;
				return true;
			}
			@Pc(466) Class8_Sub32 local466;
			if (Static277.anInt5667 == 235) {
				local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
				local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local153 = Static275.aClass8_Sub2_Sub1_6.method2358();
				local157 = Static275.aClass8_Sub2_Sub1_6.method2352();
				if (Static67.method1072(local153)) {
					local466 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local157);
					if (local466 != null) {
						Static7.method60(local145 != local466.anInt5295, local466);
					}
					Static76.method1204(local157, local145, local149);
				}
				Static277.anInt5667 = -1;
				return true;
			} else if (Static277.anInt5667 == 132) {
				local145 = Static275.aClass8_Sub2_Sub1_6.method2379();
				local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
				local153 = Static275.aClass8_Sub2_Sub1_6.method2358();
				if (Static67.method1072(local149)) {
					Static31.method510(local145, local153);
				}
				Static277.anInt5667 = -1;
				return true;
			} else if (Static277.anInt5667 == 239) {
				Static216.anInt4456 = Static275.aClass8_Sub2_Sub1_6.method2322();
				Static279.anInt5451 = Static275.aClass8_Sub2_Sub1_6.method2338();
				Static277.anInt5667 = -1;
				return true;
			} else {
				@Pc(545) String local545;
				@Pc(560) String local560;
				@Pc(568) boolean local568;
				@Pc(610) String local610;
				if (Static277.anInt5667 == 62) {
					local545 = Static275.aClass8_Sub2_Sub1_6.method2372();
					if (local545.endsWith(":tradereq:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local568 = false;
						local280 = Static31.method513(local560);
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (local280 == Static213.aLongArray11[local165]) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							Static47.method746(4, Static156.aString106, local560);
						}
					} else if (local545.endsWith(":chalreq:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local280 = Static31.method513(local560);
						local568 = false;
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (Static213.aLongArray11[local165] == local280) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							local610 = local545.substring(local545.indexOf(":") + 1, local545.length() - 9);
							Static47.method746(8, local610, local560);
						}
					} else if (local545.endsWith(":assistreq:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local280 = Static31.method513(local560);
						local568 = false;
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (local280 == Static213.aLongArray11[local165]) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							Static47.method746(10, "", local560);
						}
					} else if (local545.endsWith(":clan:")) {
						local560 = local545.substring(0, local545.indexOf(":clan:"));
						Static47.method746(11, local560, "");
					} else if (local545.endsWith(":trade:")) {
						local560 = local545.substring(0, local545.indexOf(":trade:"));
						if (Static226.anInt4614 == 0) {
							Static47.method746(12, local560, "");
						}
					} else if (local545.endsWith(":assist:")) {
						local560 = local545.substring(0, local545.indexOf(":assist:"));
						if (Static226.anInt4614 == 0) {
							Static47.method746(13, local560, "");
						}
					} else if (local545.endsWith(":duelstake:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local280 = Static31.method513(local560);
						local568 = false;
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (local280 == Static213.aLongArray11[local165]) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							Static47.method746(14, "", local560);
						}
					} else if (local545.endsWith(":duelfriend:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local568 = false;
						local280 = Static31.method513(local560);
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (local280 == Static213.aLongArray11[local165]) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							Static47.method746(15, "", local560);
						}
					} else if (local545.endsWith(":clanreq:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local280 = Static31.method513(local560);
						local568 = false;
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (Static213.aLongArray11[local165] == local280) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							Static47.method746(16, "", local560);
						}
					} else if (local545.endsWith(":allyreq:")) {
						local560 = local545.substring(0, local545.indexOf(":"));
						local280 = Static31.method513(local560);
						local568 = false;
						for (local165 = 0; local165 < Static30.anInt728; local165++) {
							if (local280 == Static213.aLongArray11[local165]) {
								local568 = true;
								break;
							}
						}
						if (!local568 && Static226.anInt4614 == 0) {
							local610 = local545.substring(local545.indexOf(":") + 1, local545.length() + -9);
							Static47.method746(21, local610, local560);
						}
					} else {
						Static47.method746(0, local545, "");
					}
					Static277.anInt5667 = -1;
					return true;
				} else if (Static277.anInt5667 == 108) {
					local145 = Static275.aClass8_Sub2_Sub1_6.method2352();
					local560 = Static275.aClass8_Sub2_Sub1_6.method2372();
					local153 = Static275.aClass8_Sub2_Sub1_6.method2377();
					if (Static67.method1072(local153)) {
						Static77.method1233(local560, local145);
					}
					Static277.anInt5667 = -1;
					return true;
				} else if (Static277.anInt5667 == 197) {
					local545 = Static275.aClass8_Sub2_Sub1_6.method2372();
					local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
					local153 = Static275.aClass8_Sub2_Sub1_6.method2348();
					if (Static67.method1072(local153)) {
						Static50.method804(local545, local149);
					}
					Static277.anInt5667 = -1;
					return true;
				} else if (Static277.anInt5667 == 41) {
					local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
					if (local145 == 65535) {
						local145 = -1;
					}
					local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
					local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
					local157 = Static275.aClass8_Sub2_Sub1_6.method2334();
					Static140.method2221(local149, local153, local157, local145);
					Static277.anInt5667 = -1;
					return true;
				} else {
					@Pc(1142) Class159 local1142;
					if (Static277.anInt5667 == 103) {
						local145 = Static275.aClass8_Sub2_Sub1_6.method2352();
						local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
						if (local145 < -70000) {
							local149 += 32768;
						}
						if (local145 < 0) {
							local1142 = null;
						} else {
							local1142 = Static82.method1361(local145);
						}
						while (Static275.aClass8_Sub2_Sub1_6.anInt2955 < Static68.anInt1687) {
							local157 = Static275.aClass8_Sub2_Sub1_6.method2382();
							local161 = Static275.aClass8_Sub2_Sub1_6.method2375();
							local165 = 0;
							if (local161 != 0) {
								local165 = Static275.aClass8_Sub2_Sub1_6.method2334();
								if (local165 == 255) {
									local165 = Static275.aClass8_Sub2_Sub1_6.method2352();
								}
							}
							if (local1142 != null && local157 >= 0 && local1142.anIntArray394.length > local157) {
								local1142.anIntArray394[local157] = local161;
								local1142.anIntArray399[local157] = local165;
							}
							Static49.method776(local149, local161 - 1, local165, local157);
						}
						if (local1142 != null) {
							Static128.method2075(local1142);
						}
						Static20.method368();
						Static73.anIntArray110[Static192.anInt3874++ & 0x1F] = local149 & 0x7FFF;
						Static277.anInt5667 = -1;
						return true;
					} else if (Static277.anInt5667 == 241) {
						local145 = Static275.aClass8_Sub2_Sub1_6.method2381();
						local149 = Static275.aClass8_Sub2_Sub1_6.method2348();
						local153 = Static275.aClass8_Sub2_Sub1_6.method2358();
						if (Static67.method1072(local149)) {
							Static89.method1445(local153, local145);
						}
						Static277.anInt5667 = -1;
						return true;
					} else if (Static277.anInt5667 == 60) {
						if (Static68.anInt1687 == 0) {
							Static30.aString30 = Static285.aString194;
						} else {
							Static30.aString30 = Static275.aClass8_Sub2_Sub1_6.method2372();
						}
						Static277.anInt5667 = -1;
						return true;
					} else {
						@Pc(1317) long local1317;
						@Pc(1327) int local1327;
						@Pc(1331) int local1331;
						if (Static277.anInt5667 == 122) {
							local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
							Static275.aClass8_Sub2_Sub1_6.method2374();
							local280 = Static275.aClass8_Sub2_Sub1_6.method2347();
							local285 = Static275.aClass8_Sub2_Sub1_6.method2375();
							local1317 = Static275.aClass8_Sub2_Sub1_6.method2323();
							@Pc(1323) long local1323 = local1317 + (local285 << 32);
							local1327 = Static275.aClass8_Sub2_Sub1_6.method2334();
							local1331 = Static275.aClass8_Sub2_Sub1_6.method2375();
							@Pc(1333) boolean local1333 = false;
							@Pc(1335) int local1335 = 0;
							label1679: while (true) {
								if (local1335 < 100) {
									if (local1323 != Static33.aLongArray1[local1335]) {
										local1335++;
										continue;
									}
									local1333 = true;
									break;
								}
								if (local1327 <= 1) {
									for (local1335 = 0; local1335 < Static30.anInt728; local1335++) {
										if (Static213.aLongArray11[local1335] == local275) {
											local1333 = true;
											break label1679;
										}
									}
								}
								break;
							}
							if (!local1333 && Static226.anInt4614 == 0) {
								Static33.aLongArray1[Static295.anInt3742] = local1323;
								Static295.anInt3742 = (Static295.anInt3742 + 1) % 100;
								@Pc(1411) String local1411 = Static115.method1854(local1331).method3130(Static275.aClass8_Sub2_Sub1_6);
								if (local1327 == 2 || local1327 == 3) {
									Static282.method648(20, local1331, "<img=1>" + Static121.method1945(local275), local1411, Static121.method1945(local280));
								} else if (local1327 == 1) {
									Static282.method648(20, local1331, "<img=0>" + Static121.method1945(local275), local1411, Static121.method1945(local280));
								} else {
									Static282.method648(20, local1331, Static121.method1945(local275), local1411, Static121.method1945(local280));
								}
							}
							Static277.anInt5667 = -1;
							return true;
						} else if (Static277.anInt5667 == 153) {
							local145 = Static275.aClass8_Sub2_Sub1_6.method2376();
							local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
							local153 = Static275.aClass8_Sub2_Sub1_6.method2381();
							if (Static67.method1072(local149)) {
								@Pc(1515) Class8_Sub32 local1515 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local153);
								local466 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local145);
								if (local466 != null) {
									Static7.method60(local1515 == null || local466.anInt5295 != local1515.anInt5295, local466);
								}
								if (local1515 != null) {
									local1515.method4273();
									Static213.aClass129_22.method3039(local1515, (long) local145);
								}
								@Pc(1555) Class159 local1555 = Static82.method1361(local153);
								if (local1555 != null) {
									Static128.method2075(local1555);
								}
								local1555 = Static82.method1361(local145);
								if (local1555 != null) {
									Static128.method2075(local1555);
									Static191.method2995(true, local1555);
								}
								if (Static248.anInt4917 != -1) {
									Static88.method1440(1, Static248.anInt4917);
								}
							}
							Static277.anInt5667 = -1;
							return true;
						} else if (Static277.anInt5667 == 107) {
							local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
							local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
							local153 = Static275.aClass8_Sub2_Sub1_6.method2352();
							if (Static67.method1072(local145)) {
								Static192.method3016(local149, local153);
							}
							Static277.anInt5667 = -1;
							return true;
						} else {
							@Pc(1675) boolean local1675;
							if (Static277.anInt5667 == 61) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2377();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2348();
								local153 = Static275.aClass8_Sub2_Sub1_6.method2348();
								local157 = Static275.aClass8_Sub2_Sub1_6.method2379();
								if (local157 >> 30 == 0) {
									@Pc(1697) Class144 local1697;
									@Pc(1711) Class76 local1711;
									@Pc(1772) Class144 local1772;
									@Pc(1788) Class76 local1788;
									@Pc(1793) Class76 local1793;
									if (local157 >> 29 != 0) {
										local161 = local157 & 0xFFFF;
										@Pc(1664) Class36_Sub3_Sub2 local1664 = Static48.aClass36_Sub3_Sub2Array1[local161];
										if (local1664 != null) {
											if (local149 == 65535) {
												local149 = -1;
											}
											local1675 = true;
											if (local149 != -1 && local1664.anInt4125 != -1) {
												if (local149 == local1664.anInt4125) {
													local1697 = method1346(local149);
													if (local1697.aBoolean374 && local1697.anInt4680 != -1) {
														local1711 = Static115.method1855(local1697.anInt4680);
														local1331 = local1711.anInt2220;
														if (local1331 == 1) {
															local1664.anInt4127 = 0;
															local1675 = false;
															local1664.anInt4124 = 1;
															local1664.anInt4094 = 0;
															local1664.anInt4149 = local153 + Static183.anInt3590;
															local1664.anInt4070 = 0;
															Static184.method2846(false, local1664.anInt4127, local1664.anInt4117, local1711, local1664.anInt4118);
														} else if (local1331 == 2) {
															local1675 = false;
															local1664.anInt4085 = 0;
														}
													}
												} else {
													local1697 = method1346(local149);
													local1772 = method1346(local1664.anInt4125);
													if (local1697.anInt4680 != -1 && local1772.anInt4680 != -1) {
														local1788 = Static115.method1855(local1697.anInt4680);
														local1793 = Static115.method1855(local1772.anInt4680);
														if (local1793.anInt2224 > local1788.anInt2224) {
															local1675 = false;
														}
													}
												}
											}
											if (local1675) {
												local1664.anInt4095 = local145;
												local1664.anInt4124 = 1;
												local1664.anInt4070 = 0;
												local1664.anInt4149 = Static183.anInt3590 + local153;
												local1664.anInt4125 = local149;
												local1664.anInt4127 = 0;
												if (local1664.anInt4149 > Static183.anInt3590) {
													local1664.anInt4127 = -1;
												}
												if (local1664.anInt4125 != -1 && Static183.anInt3590 == local1664.anInt4149) {
													local301 = method1346(local1664.anInt4125).anInt4680;
													if (local301 != -1) {
														local1711 = Static115.method1855(local301);
														if (local1711 != null && local1711.anIntArray159 != null) {
															Static184.method2846(false, 0, local1664.anInt4117, local1711, local1664.anInt4118);
														}
													}
												}
											}
										}
									} else if (local157 >> 28 != 0) {
										local161 = local157 & 0xFFFF;
										@Pc(1891) Class36_Sub3_Sub1 local1891;
										if (local161 == Static34.anInt765) {
											local1891 = Static21.aClass36_Sub3_Sub1_1;
										} else {
											local1891 = Static230.aClass36_Sub3_Sub1Array1[local161];
										}
										if (local1891 != null) {
											local1675 = true;
											if (local149 == 65535) {
												local149 = -1;
											}
											if (local149 != -1 && local1891.anInt4125 != -1) {
												if (local149 == local1891.anInt4125) {
													local1697 = method1346(local149);
													if (local1697.aBoolean374 && local1697.anInt4680 != -1) {
														local1711 = Static115.method1855(local1697.anInt4680);
														local1331 = local1711.anInt2220;
														if (local1331 == 1) {
															local1891.anInt4149 = Static183.anInt3590 + local153;
															local1675 = false;
															local1891.anInt4127 = 0;
															local1891.anInt4070 = 0;
															local1891.anInt4124 = 1;
															local1891.anInt4094 = 0;
															Static184.method2846(false, local1891.anInt4127, local1891.anInt4117, local1711, local1891.anInt4118);
														} else if (local1331 == 2) {
															local1891.anInt4085 = 0;
															local1675 = false;
														}
													}
												} else {
													local1697 = method1346(local149);
													local1772 = method1346(local1891.anInt4125);
													if (local1697.anInt4680 != -1 && local1772.anInt4680 != -1) {
														local1788 = Static115.method1855(local1697.anInt4680);
														local1793 = Static115.method1855(local1772.anInt4680);
														if (local1788.anInt2224 < local1793.anInt2224) {
															local1675 = false;
														}
													}
												}
											}
											if (local1675) {
												local1891.anInt4095 = local145;
												local1891.anInt4124 = 1;
												local1891.anInt4149 = local153 + Static183.anInt3590;
												local1891.anInt4125 = local149;
												if (local1891.anInt4125 == 65535) {
													local1891.anInt4125 = -1;
												}
												local1891.anInt4127 = 0;
												if (Static183.anInt3590 < local1891.anInt4149) {
													local1891.anInt4127 = -1;
												}
												local1891.anInt4070 = 0;
												if (local1891.anInt4125 != -1 && Static183.anInt3590 == local1891.anInt4149) {
													local301 = method1346(local1891.anInt4125).anInt4680;
													if (local301 != -1) {
														local1711 = Static115.method1855(local301);
														if (local1711 != null && local1711.anIntArray159 != null) {
															Static184.method2846(Static21.aClass36_Sub3_Sub1_1 == local1891, 0, local1891.anInt4117, local1711, local1891.anInt4118);
														}
													}
												}
											}
										}
									}
								} else {
									local165 = (local157 >> 14 & 0x3FFF) - Static49.anInt1089;
									local161 = local157 >> 28 & 0x3;
									local295 = (local157 & 0x3FFF) - Static130.anInt2601;
									if (local165 >= 0 && local295 >= 0 && local165 < 104 && local295 < 104) {
										local295 = local295 * 128 + 64;
										local165 = local165 * 128 + 64;
										@Pc(2185) Class36_Sub5 local2185 = new Class36_Sub5(local149, local161, local165, local295, Static59.method927(local165, local295, local161) - local145, local153, Static183.anInt3590);
										Static164.aClass182_13.method4328(new Class8_Sub1_Sub19(local2185));
									}
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 243) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
								@Pc(2207) byte local2207 = Static275.aClass8_Sub2_Sub1_6.method2337();
								Static297.method4294(local145, local2207);
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 102) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2352();
								if (Static67.method1072(local145)) {
									@Pc(2240) Class8_Sub32 local2240 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local149);
									if (local2240 != null) {
										Static7.method60(true, local2240);
									}
									if (Static272.aClass159_19 != null) {
										Static128.method2075(Static272.aClass159_19);
										Static272.aClass159_19 = null;
									}
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 183) {
								for (local145 = 0; local145 < Static8.anIntArray495.length; local145++) {
									if (Static8.anIntArray495[local145] != Static255.anIntArray392[local145]) {
										Static8.anIntArray495[local145] = Static255.anIntArray392[local145];
										Static20.method357(local145);
										Static49.anIntArray76[Static261.anInt5241++ & 0x1F] = local145;
									}
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 219) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2377();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2381();
								Static297.method4294(local145, local149);
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 116) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2338();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
								local153 = Static275.aClass8_Sub2_Sub1_6.method2322();
								Static34.anInt770 = local153 >> 1;
								Static21.aClass36_Sub3_Sub1_1.method3085(local149, local145, (local153 & 0x1) == 1);
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 111 || Static277.anInt5667 == 26 || Static277.anInt5667 == 92 || Static277.anInt5667 == 203 || Static277.anInt5667 == 237 || Static277.anInt5667 == 131 || Static277.anInt5667 == 199 || Static277.anInt5667 == 218 || Static277.anInt5667 == 230 || Static277.anInt5667 == 29 || Static277.anInt5667 == 134 || Static277.anInt5667 == 63 || Static277.anInt5667 == 45 || Static277.anInt5667 == 67) {
								Static279.method4117();
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 105) {
								Static275.aClass8_Sub2_Sub1_6.anInt2955 += 28;
								if (Static275.aClass8_Sub2_Sub1_6.method2342()) {
									Static67.method1071(Static275.aClass8_Sub2_Sub1_6, Static275.aClass8_Sub2_Sub1_6.anInt2955 - 28);
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 167) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
								local153 = Static275.aClass8_Sub2_Sub1_6.method2334();
								local157 = Static275.aClass8_Sub2_Sub1_6.method2375();
								local161 = Static275.aClass8_Sub2_Sub1_6.method2334();
								local165 = Static275.aClass8_Sub2_Sub1_6.method2334();
								if (Static67.method1072(local145)) {
									Static182.method2784(local157, local149, local161, local165, local153);
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 37) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2376();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2348();
								local153 = Static275.aClass8_Sub2_Sub1_6.method2358();
								if (local153 == 65535) {
									local153 = -1;
								}
								local157 = Static275.aClass8_Sub2_Sub1_6.method2352();
								if (Static67.method1072(local149)) {
									@Pc(2546) Class159 local2546 = Static82.method1361(local145);
									@Pc(2558) Class10 local2558;
									if (local2546.aBoolean423) {
										Static73.method1156(local153, local145, local157);
										local2558 = Static140.method2222(local153);
										Static209.method3305(local2558.anInt119, local2558.anInt152, local145, local2558.anInt124);
										Static52.method839(local2558.anInt97, local2558.anInt153, local2558.anInt126, local145);
									} else if (local153 == -1) {
										Static277.anInt5667 = -1;
										local2546.anInt5151 = 0;
										return true;
									} else {
										local2558 = Static140.method2222(local153);
										local2546.anInt5209 = local2558.anInt152 * 100 / local157;
										local2546.anInt5163 = local2558.anInt119;
										local2546.anInt5153 = local153;
										local2546.anInt5151 = 4;
										local2546.anInt5138 = local2558.anInt124;
										Static128.method2075(local2546);
									}
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 119) {
								for (local145 = 0; local145 < Static230.aClass36_Sub3_Sub1Array1.length; local145++) {
									if (Static230.aClass36_Sub3_Sub1Array1[local145] != null) {
										Static230.aClass36_Sub3_Sub1Array1[local145].anInt4107 = -1;
									}
								}
								for (local145 = 0; local145 < Static48.aClass36_Sub3_Sub2Array1.length; local145++) {
									if (Static48.aClass36_Sub3_Sub2Array1[local145] != null) {
										Static48.aClass36_Sub3_Sub2Array1[local145].anInt4107 = -1;
									}
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 182) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2348();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2352();
								local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
								local157 = Static275.aClass8_Sub2_Sub1_6.method2358();
								if (Static67.method1072(local145)) {
									Static52.method842(local149, local157 + (local153 << 16));
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 95) {
								local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
								local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
								if (local149 == 65535) {
									local149 = -1;
								}
								local153 = Static275.aClass8_Sub2_Sub1_6.method2352();
								if (Static67.method1072(local145)) {
									Static102.method1663(-1, local149, 2, local153);
								}
								Static277.anInt5667 = -1;
								return true;
							} else if (Static277.anInt5667 == 125) {
								Static161.method2570();
								Static20.method368();
								Static277.anInt5667 = -1;
								Static261.anInt5241 += 32;
								return true;
							} else {
								@Pc(2802) int local2802;
								if (Static277.anInt5667 == 22) {
									local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
									local280 = Static275.aClass8_Sub2_Sub1_6.method2375();
									local285 = Static275.aClass8_Sub2_Sub1_6.method2323();
									@Pc(2794) long local2794 = (local280 << 32) + local285;
									@Pc(2796) boolean local2796 = false;
									local295 = Static275.aClass8_Sub2_Sub1_6.method2334();
									local2802 = 0;
									label1607: while (true) {
										if (local2802 >= 100) {
											if (local295 <= 1) {
												if (Static176.aBoolean291 && !Static139.aBoolean229 || Static176.aBoolean292) {
													local2796 = true;
												} else {
													for (local2802 = 0; local2802 < Static30.anInt728; local2802++) {
														if (local275 == Static213.aLongArray11[local2802]) {
															local2796 = true;
															break label1607;
														}
													}
												}
											}
											break;
										}
										if (Static33.aLongArray1[local2802] == local2794) {
											local2796 = true;
											break;
										}
										local2802++;
									}
									if (!local2796 && Static226.anInt4614 == 0) {
										Static33.aLongArray1[Static295.anInt3742] = local2794;
										Static295.anInt3742 = (Static295.anInt3742 + 1) % 100;
										@Pc(2882) String local2882 = Static43.method2024(Static236.method3593(Static168.method4147(Static275.aClass8_Sub2_Sub1_6)));
										if (local295 == 2 || local295 == 3) {
											Static47.method746(7, local2882, "<img=1>" + Static121.method1945(local275));
										} else if (local295 == 1) {
											Static47.method746(7, local2882, "<img=0>" + Static121.method1945(local275));
										} else {
											Static47.method746(3, local2882, Static121.method1945(local275));
										}
									}
									Static277.anInt5667 = -1;
									return true;
								} else if (Static277.anInt5667 == 38) {
									local145 = Static275.aClass8_Sub2_Sub1_6.method2349();
									local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
									if (local149 == 65535) {
										local149 = -1;
									}
									Static135.method2192(local145, local149);
									Static277.anInt5667 = -1;
									return true;
								} else if (Static277.anInt5667 == 212) {
									local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
									if (local145 == 65535) {
										local145 = -1;
									}
									local149 = Static275.aClass8_Sub2_Sub1_6.method2327();
									local153 = Static275.aClass8_Sub2_Sub1_6.method2338();
									Static204.method3181(local149, local145, local153);
									Static277.anInt5667 = -1;
									return true;
								} else if (Static277.anInt5667 == 8) {
									local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
									local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
									local153 = Static275.aClass8_Sub2_Sub1_6.method2348();
									local157 = Static275.aClass8_Sub2_Sub1_6.method2379();
									local161 = Static275.aClass8_Sub2_Sub1_6.method2358();
									if (Static67.method1072(local149)) {
										Static209.method3305(local145, local153, local157, local161);
									}
									Static277.anInt5667 = -1;
									return true;
								} else {
									@Pc(3130) Class8_Sub24 local3130;
									@Pc(3116) Class8_Sub24 local3116;
									if (Static277.anInt5667 == 69) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2379();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
										local153 = Static275.aClass8_Sub2_Sub1_6.method2358();
										if (local149 == 65535) {
											local149 = -1;
										}
										local157 = Static275.aClass8_Sub2_Sub1_6.method2358();
										local161 = Static275.aClass8_Sub2_Sub1_6.method2377();
										if (local161 == 65535) {
											local161 = -1;
										}
										if (Static67.method1072(local157)) {
											for (local165 = local161; local165 <= local149; local165++) {
												local1317 = (long) local165 + ((long) local145 << 32);
												local3116 = (Class8_Sub24) Static94.aClass129_8.method3043(local1317);
												if (local3116 != null) {
													local3130 = new Class8_Sub24(local3116.anInt4411, local153);
													local3116.method4273();
												} else if (local165 == -1) {
													local3130 = new Class8_Sub24(Static82.method1361(local145).aClass8_Sub24_2.anInt4411, local153);
												} else {
													local3130 = new Class8_Sub24(0, local153);
												}
												Static94.aClass129_8.method3039(local3130, local1317);
											}
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 96) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2352();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
										if (local145 < 0) {
											local1142 = null;
										} else {
											local1142 = Static82.method1361(local145);
										}
										if (local1142 != null) {
											for (local157 = 0; local157 < local1142.anIntArray394.length; local157++) {
												local1142.anIntArray394[local157] = 0;
												local1142.anIntArray399[local157] = 0;
											}
										}
										if (local145 < -70000) {
											local149 += 32768;
										}
										Static82.method1360(local149);
										local157 = Static275.aClass8_Sub2_Sub1_6.method2375();
										for (local161 = 0; local161 < local157; local161++) {
											local165 = Static275.aClass8_Sub2_Sub1_6.method2334();
											if (local165 == 255) {
												local165 = Static275.aClass8_Sub2_Sub1_6.method2379();
											}
											local295 = Static275.aClass8_Sub2_Sub1_6.method2348();
											if (local1142 != null && local161 < local1142.anIntArray394.length) {
												local1142.anIntArray394[local161] = local295;
												local1142.anIntArray399[local161] = local165;
											}
											Static49.method776(local149, local295 - 1, local165, local161);
										}
										if (local1142 != null) {
											Static128.method2075(local1142);
										}
										Static20.method368();
										Static73.anIntArray110[Static192.anInt3874++ & 0x1F] = local149 & 0x7FFF;
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 214) {
										local545 = Static275.aClass8_Sub2_Sub1_6.method2372();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2358();
										local153 = Static275.aClass8_Sub2_Sub1_6.method2377();
										if (Static67.method1072(local153)) {
											Static50.method804(local545, local149);
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 247) {
										Static147.anInt2993 = Static275.aClass8_Sub2_Sub1_6.method2348() * 30;
										Static41.anInt879 = Static157.anInt5706;
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 128) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
										@Pc(3374) byte local3374 = Static275.aClass8_Sub2_Sub1_6.method2374();
										if (Static67.method1072(local145)) {
											Static89.method1445(local149, local3374);
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 58) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2349();
										local153 = Static275.aClass8_Sub2_Sub1_6.method2348();
										if (Static67.method1072(local145)) {
											if (local149 == 2) {
												Static230.method3531();
											}
											Static248.anInt4917 = local153;
											Static194.method3023(local153);
											Static269.method3756(false);
											Static217.method3401(Static248.anInt4917);
											for (local157 = 0; local157 < 100; local157++) {
												Static128.aBooleanArray7[local157] = true;
											}
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 5) {
										Static279.anInt5451 = Static275.aClass8_Sub2_Sub1_6.method2334();
										Static216.anInt4456 = Static275.aClass8_Sub2_Sub1_6.method2334();
										for (local145 = Static216.anInt4456; local145 < Static216.anInt4456 + 8; local145++) {
											for (local149 = Static279.anInt5451; local149 < Static279.anInt5451 + 8; local149++) {
												if (Static124.aClass182ArrayArrayArray1[Static34.anInt770][local145][local149] != null) {
													Static124.aClass182ArrayArrayArray1[Static34.anInt770][local145][local149] = null;
													Static115.method1856(local149, local145);
												}
											}
										}
										for (@Pc(3510) Class8_Sub9 local3510 = (Class8_Sub9) Static84.aClass182_10.method4319(); local3510 != null; local3510 = (Class8_Sub9) Static84.aClass182_10.method4329()) {
											if (Static216.anInt4456 <= local3510.anInt1249 && local3510.anInt1249 < Static216.anInt4456 + 8 && local3510.anInt1251 >= Static279.anInt5451 && local3510.anInt1251 < Static279.anInt5451 + 8 && local3510.anInt1250 == Static34.anInt770) {
												local3510.anInt1245 = 0;
											}
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 72) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2322();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
										if (Static67.method1072(local149)) {
											Static20.anInt543 = local145;
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 129) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2352();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
										if (Static67.method1072(local149)) {
											local153 = 0;
											if (Static21.aClass36_Sub3_Sub1_1.aClass11_2 != null) {
												local153 = Static21.aClass36_Sub3_Sub1_1.aClass11_2.method264();
											}
											Static102.method1663(-1, local153, 3, local145);
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 7) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2348();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
										local153 = Static275.aClass8_Sub2_Sub1_6.method2348();
										local157 = Static275.aClass8_Sub2_Sub1_6.method2377();
										local161 = Static275.aClass8_Sub2_Sub1_6.method2381();
										if (Static67.method1072(local149)) {
											Static102.method1663(local157, local145 | local153 << 16, 7, local161);
										}
										Static277.anInt5667 = -1;
										return true;
									} else if (Static277.anInt5667 == 135) {
										local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
										local149 = Static275.aClass8_Sub2_Sub1_6.method2358();
										local153 = Static275.aClass8_Sub2_Sub1_6.method2338();
										@Pc(3694) Class36_Sub3_Sub2 local3694 = Static48.aClass36_Sub3_Sub2Array1[local145];
										if (local3694 != null) {
											Static239.method3611(local153, local149, local3694);
										}
										Static277.anInt5667 = -1;
										return true;
									} else {
										@Pc(3825) String local3825;
										if (Static277.anInt5667 == 117) {
											local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
											Static275.aClass8_Sub2_Sub1_6.method2374();
											local280 = Static275.aClass8_Sub2_Sub1_6.method2347();
											local285 = Static275.aClass8_Sub2_Sub1_6.method2375();
											local1317 = Static275.aClass8_Sub2_Sub1_6.method2323();
											@Pc(3739) long local3739 = local1317 + (local285 << 32);
											local1327 = Static275.aClass8_Sub2_Sub1_6.method2334();
											@Pc(3745) boolean local3745 = false;
											@Pc(3747) int local3747 = 0;
											label1341: while (true) {
												if (local3747 >= 100) {
													if (local1327 <= 1) {
														if (Static176.aBoolean291 && !Static139.aBoolean229 || Static176.aBoolean292) {
															local3745 = true;
														} else {
															for (local3747 = 0; local3747 < Static30.anInt728; local3747++) {
																if (local275 == Static213.aLongArray11[local3747]) {
																	local3745 = true;
																	break label1341;
																}
															}
														}
													}
													break;
												}
												if (Static33.aLongArray1[local3747] == local3739) {
													local3745 = true;
													break;
												}
												local3747++;
											}
											if (!local3745 && Static226.anInt4614 == 0) {
												Static33.aLongArray1[Static295.anInt3742] = local3739;
												Static295.anInt3742 = (Static295.anInt3742 + 1) % 100;
												local3825 = Static43.method2024(Static236.method3593(Static168.method4147(Static275.aClass8_Sub2_Sub1_6)));
												if (local1327 == 2 || local1327 == 3) {
													Static137.method1335(Static121.method1945(local280), local3825, "<img=1>" + Static121.method1945(local275));
												} else if (local1327 == 1) {
													Static137.method1335(Static121.method1945(local280), local3825, "<img=0>" + Static121.method1945(local275));
												} else {
													Static137.method1335(Static121.method1945(local280), local3825, Static121.method1945(local275));
												}
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 223) {
											local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
											local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
											local157 = Static275.aClass8_Sub2_Sub1_6.method2334();
											local610 = "";
											local568 = true;
											if (local275 < 0L) {
												local275 &= Long.MAX_VALUE;
												local568 = false;
											}
											if (local153 > 0) {
												local610 = Static275.aClass8_Sub2_Sub1_6.method2372();
											}
											@Pc(3937) String local3937 = Static121.method1945(local275);
											for (local301 = 0; local301 < Static173.anInt3444; local301++) {
												if (Static98.aLongArray7[local301] == local275) {
													if (Static63.anIntArray95[local301] != local153) {
														Static63.anIntArray95[local301] = local153;
														if (local153 > 0) {
															Static47.method746(5, local3937 + Static216.aString157, "");
														}
														if (local153 == 0) {
															Static47.method746(5, local3937 + Static210.aString159, "");
														}
													}
													local3937 = null;
													Static173.aStringArray51[local301] = local610;
													Static220.anIntArray340[local301] = local157;
													Static57.aBooleanArray4[local301] = local568;
													break;
												}
											}
											if (local3937 != null && Static173.anInt3444 < 200) {
												Static98.aLongArray7[Static173.anInt3444] = local275;
												Static47.aStringArray15[Static173.anInt3444] = local3937;
												Static63.anIntArray95[Static173.anInt3444] = local153;
												Static173.aStringArray51[Static173.anInt3444] = local610;
												Static220.anIntArray340[Static173.anInt3444] = local157;
												Static57.aBooleanArray4[Static173.anInt3444] = local568;
												Static173.anInt3444++;
											}
											local1327 = Static173.anInt3444;
											Static295.anInt3737 = Static157.anInt5706;
											while (local1327 > 0) {
												@Pc(4057) boolean local4057 = true;
												local1327--;
												for (local1331 = 0; local1331 < local1327; local1331++) {
													if (Static63.anIntArray95[local1331] != Static11.anInt2977 && Static11.anInt2977 == Static63.anIntArray95[local1331 + 1] || Static63.anIntArray95[local1331] == 0 && Static63.anIntArray95[local1331 + 1] != 0) {
														local2802 = Static63.anIntArray95[local1331];
														Static63.anIntArray95[local1331] = Static63.anIntArray95[local1331 + 1];
														local4057 = false;
														Static63.anIntArray95[local1331 + 1] = local2802;
														local373 = Static173.aStringArray51[local1331];
														Static173.aStringArray51[local1331] = Static173.aStringArray51[local1331 + 1];
														Static173.aStringArray51[local1331 + 1] = local373;
														local3825 = Static47.aStringArray15[local1331];
														Static47.aStringArray15[local1331] = Static47.aStringArray15[local1331 + 1];
														Static47.aStringArray15[local1331 + 1] = local3825;
														@Pc(4159) long local4159 = Static98.aLongArray7[local1331];
														Static98.aLongArray7[local1331] = Static98.aLongArray7[local1331 + 1];
														Static98.aLongArray7[local1331 + 1] = local4159;
														@Pc(4177) int local4177 = Static220.anIntArray340[local1331];
														Static220.anIntArray340[local1331] = Static220.anIntArray340[local1331 + 1];
														Static220.anIntArray340[local1331 + 1] = local4177;
														@Pc(4195) boolean local4195 = Static57.aBooleanArray4[local1331];
														Static57.aBooleanArray4[local1331] = Static57.aBooleanArray4[local1331 + 1];
														Static57.aBooleanArray4[local1331 + 1] = local4195;
													}
												}
												if (local4057) {
													break;
												}
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 118) {
											Static20.method368();
											Static288.anInt1354 = Static275.aClass8_Sub2_Sub1_6.method2334();
											Static277.anInt5667 = -1;
											Static41.anInt879 = Static157.anInt5706;
											return true;
										} else if (Static277.anInt5667 == 16) {
											local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
											local560 = Static275.aClass8_Sub2_Sub1_6.method2372();
											@Pc(4255) Object[] local4255 = new Object[local560.length() + 1];
											for (local157 = local560.length() - 1; local157 >= 0; local157--) {
												if (local560.charAt(local157) == 's') {
													local4255[local157 + 1] = Static275.aClass8_Sub2_Sub1_6.method2372();
												} else {
													local4255[local157 + 1] = Integer.valueOf(Static275.aClass8_Sub2_Sub1_6.method2352());
												}
											}
											local4255[0] = Integer.valueOf(Static275.aClass8_Sub2_Sub1_6.method2352());
											if (Static67.method1072(local145)) {
												@Pc(4311) Class8_Sub14 local4311 = new Class8_Sub14();
												local4311.anObjectArray1 = local4255;
												Static173.method2688(local4311);
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 176) {
											Static206.method3267();
											Static277.anInt5667 = -1;
											return false;
										} else if (Static277.anInt5667 == 82) {
											Static266.method4009(true);
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 68) {
											Static134.anInt2700 = Static275.aClass8_Sub2_Sub1_6.method2334();
											Static119.anInt2400 = Static275.aClass8_Sub2_Sub1_6.method2334();
											Static14.anInt362 = Static275.aClass8_Sub2_Sub1_6.method2334();
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 77) {
											local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
											if (Static67.method1072(local145)) {
												Static30.method506();
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 213) {
											Static30.anInt728 = Static68.anInt1687 / 8;
											for (local145 = 0; local145 < Static30.anInt728; local145++) {
												Static213.aLongArray11[local145] = Static275.aClass8_Sub2_Sub1_6.method2347();
												Static48.aStringArray17[local145] = Static170.method2669(Static213.aLongArray11[local145]);
												Static145.aBooleanArray13[local145] = false;
											}
											Static295.anInt3737 = Static157.anInt5706;
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 210) {
											if (Static248.anInt4917 != -1) {
												Static88.method1440(0, Static248.anInt4917);
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 215) {
											Static86.method1405();
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 150) {
											Static199.method3079(Static275.aClass8_Sub2_Sub1_6.method2372());
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 194) {
											local145 = Static275.aClass8_Sub2_Sub1_6.method2354();
											local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
											local153 = Static275.aClass8_Sub2_Sub1_6.method2354();
											local157 = Static275.aClass8_Sub2_Sub1_6.method2376();
											if (Static67.method1072(local149)) {
												Static172.method2680(local153, local157, local145);
											}
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 9) {
											local145 = Static275.aClass8_Sub2_Sub1_6.method2381();
											Static107.aClass163_6 = Static199.aClass17_3.method453(local145);
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 200) {
											Static242.anInt4844 = Static157.anInt5706;
											local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
											if (local275 == 0L) {
												Static4.aString6 = null;
												Static277.anInt5667 = -1;
												Static119.aString90 = null;
												Static146.anInt2901 = 0;
												Static189.aClass8_Sub25Array1 = null;
												return true;
											}
											local280 = Static275.aClass8_Sub2_Sub1_6.method2347();
											Static4.aString6 = Static72.method1149(local280);
											Static119.aString90 = Static72.method1149(local275);
											Static92.aByte6 = Static275.aClass8_Sub2_Sub1_6.method2374();
											local161 = Static275.aClass8_Sub2_Sub1_6.method2334();
											if (local161 == 255) {
												Static277.anInt5667 = -1;
												return true;
											}
											Static146.anInt2901 = local161;
											@Pc(4586) Class8_Sub25[] local4586 = new Class8_Sub25[100];
											for (local295 = 0; local295 < Static146.anInt2901; local295++) {
												local4586[local295] = new Class8_Sub25();
												local4586[local295].aLong203 = Static275.aClass8_Sub2_Sub1_6.method2347();
												local4586[local295].aString154 = Static72.method1149(local4586[local295].aLong203);
												local4586[local295].anInt4432 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local4586[local295].aByte13 = Static275.aClass8_Sub2_Sub1_6.method2374();
												local4586[local295].aString155 = Static275.aClass8_Sub2_Sub1_6.method2372();
												if (local4586[local295].aLong203 == Static222.aLong165) {
													Static191.aByte9 = local4586[local295].aByte13;
												}
											}
											local1327 = Static146.anInt2901;
											while (local1327 > 0) {
												local1327--;
												local1675 = true;
												for (local1331 = 0; local1331 < local1327; local1331++) {
													if (local4586[local1331].aString154.compareTo(local4586[local1331 + 1].aString154) > 0) {
														@Pc(4689) Class8_Sub25 local4689 = local4586[local1331];
														local1675 = false;
														local4586[local1331] = local4586[local1331 + 1];
														local4586[local1331 + 1] = local4689;
													}
												}
												if (local1675) {
													break;
												}
											}
											Static189.aClass8_Sub25Array1 = local4586;
											Static277.anInt5667 = -1;
											return true;
										} else if (Static277.anInt5667 == 148) {
											Static11.anInt2951 = Static275.aClass8_Sub2_Sub1_6.method2334();
											Static295.anInt3737 = Static157.anInt5706;
											Static277.anInt5667 = -1;
											return true;
										} else {
											@Pc(4750) String local4750;
											if (Static277.anInt5667 == 34) {
												local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local4750 = Static115.method1854(local153).method3130(Static275.aClass8_Sub2_Sub1_6);
												Static282.method648(19, local153, Static121.method1945(local275), local4750, null);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 85) {
												local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
												@Pc(4781) String local4781 = Static43.method2024(Static236.method3593(Static168.method4147(Static275.aClass8_Sub2_Sub1_6)));
												Static47.method746(6, local4781, Static121.method1945(local275));
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 226) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2322();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2322();
												if (local149 == 65535) {
													local149 = -1;
												}
												local4750 = Static275.aClass8_Sub2_Sub1_6.method2372();
												if (local153 >= 1 && local153 <= 8) {
													if (local4750.equalsIgnoreCase("null")) {
														local4750 = null;
													}
													Static184.aStringArray56[local153 - 1] = local4750;
													Static245.anIntArray370[local153 - 1] = local149;
													Static195.aBooleanArray11[local153 - 1] = local145 == 0;
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 173) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2348();
												Static137.method1330(local145);
												Static73.anIntArray110[Static192.anInt3874++ & 0x1F] = local145 & 0x7FFF;
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 28) {
												local275 = Static275.aClass8_Sub2_Sub1_6.method2347();
												local568 = false;
												local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
												@Pc(4915) byte local4915 = Static275.aClass8_Sub2_Sub1_6.method2374();
												if ((local275 & Long.MIN_VALUE) != 0L) {
													local568 = true;
												}
												if (local568) {
													if (Static146.anInt2901 == 0) {
														Static277.anInt5667 = -1;
														return true;
													}
													local275 &= Long.MAX_VALUE;
													for (local165 = 0; Static146.anInt2901 > local165 && (local275 != Static189.aClass8_Sub25Array1[local165].aLong203 || Static189.aClass8_Sub25Array1[local165].anInt4432 != local153); local165++) {
													}
													if (Static146.anInt2901 > local165) {
														while (Static146.anInt2901 - 1 > local165) {
															Static189.aClass8_Sub25Array1[local165] = Static189.aClass8_Sub25Array1[local165 + 1];
															local165++;
														}
														Static146.anInt2901--;
														Static189.aClass8_Sub25Array1[Static146.anInt2901] = null;
													}
												} else {
													local610 = Static275.aClass8_Sub2_Sub1_6.method2372();
													@Pc(4935) Class8_Sub25 local4935 = new Class8_Sub25();
													local4935.aLong203 = local275;
													local4935.aString154 = Static72.method1149(local4935.aLong203);
													local4935.anInt4432 = local153;
													local4935.aString155 = local610;
													local4935.aByte13 = local4915;
													for (local301 = Static146.anInt2901 - 1; local301 >= 0; local301--) {
														local1327 = Static189.aClass8_Sub25Array1[local301].aString154.compareTo(local4935.aString154);
														if (local1327 == 0) {
															Static189.aClass8_Sub25Array1[local301].anInt4432 = local153;
															Static189.aClass8_Sub25Array1[local301].aByte13 = local4915;
															Static189.aClass8_Sub25Array1[local301].aString155 = local610;
															Static277.anInt5667 = -1;
															Static242.anInt4844 = Static157.anInt5706;
															if (Static222.aLong165 == local275) {
																Static191.aByte9 = local4915;
															}
															return true;
														}
														if (local1327 < 0) {
															break;
														}
													}
													if (Static146.anInt2901 >= Static189.aClass8_Sub25Array1.length) {
														Static277.anInt5667 = -1;
														return true;
													}
													for (local1327 = Static146.anInt2901 - 1; local1327 > local301; local1327--) {
														Static189.aClass8_Sub25Array1[local1327 + 1] = Static189.aClass8_Sub25Array1[local1327];
													}
													if (Static146.anInt2901 == 0) {
														Static189.aClass8_Sub25Array1 = new Class8_Sub25[100];
													}
													Static189.aClass8_Sub25Array1[local301 + 1] = local4935;
													if (Static222.aLong165 == local275) {
														Static191.aByte9 = local4915;
													}
													Static146.anInt2901++;
												}
												Static242.anInt4844 = Static157.anInt5706;
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 48) {
												Static266.method4009(false);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 217) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2379();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2360();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2377();
												if (Static67.method1072(local153)) {
													Static275.method4085(local145, local149);
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 228) {
												Static242.anInt4842 = Static275.aClass8_Sub2_Sub1_6.method2334();
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 158) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
												if (Static67.method1072(local145)) {
													Static162.method2643();
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 162) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local149 = local145 >> 5;
												local153 = local145 & 0x1F;
												if (local153 == 0) {
													Static245.aClass18Array1[local149] = null;
													Static277.anInt5667 = -1;
													return true;
												}
												@Pc(5249) Class18 local5249 = new Class18();
												local5249.anInt668 = local153;
												local5249.anInt668 = local145 & 0x3F;
												local5249.anInt674 = Static275.aClass8_Sub2_Sub1_6.method2334();
												if (local5249.anInt674 >= 0 && Static198.aClass8_Sub1_Sub7Array85.length > local5249.anInt674) {
													if (local5249.anInt668 == 1 || local5249.anInt668 == 10) {
														local5249.anInt671 = Static275.aClass8_Sub2_Sub1_6.method2375();
														Static275.aClass8_Sub2_Sub1_6.anInt2955 += 5;
													} else if (local5249.anInt668 >= 2 && local5249.anInt668 <= 6) {
														if (local5249.anInt668 == 2) {
															local5249.anInt663 = 64;
															local5249.anInt672 = 64;
														}
														if (local5249.anInt668 == 3) {
															local5249.anInt672 = 64;
															local5249.anInt663 = 0;
														}
														if (local5249.anInt668 == 4) {
															local5249.anInt672 = 64;
															local5249.anInt663 = 128;
														}
														if (local5249.anInt668 == 5) {
															local5249.anInt672 = 0;
															local5249.anInt663 = 64;
														}
														if (local5249.anInt668 == 6) {
															local5249.anInt672 = 128;
															local5249.anInt663 = 64;
														}
														local5249.anInt668 = 2;
														local5249.anInt675 = Static275.aClass8_Sub2_Sub1_6.method2375();
														local5249.anInt664 = Static275.aClass8_Sub2_Sub1_6.method2375();
														local5249.anInt678 = Static275.aClass8_Sub2_Sub1_6.method2334();
														local5249.anInt676 = Static275.aClass8_Sub2_Sub1_6.method2375();
													}
													local5249.anInt667 = Static275.aClass8_Sub2_Sub1_6.method2375();
													if (local5249.anInt667 == 65535) {
														local5249.anInt667 = -1;
													}
													Static245.aClass18Array1[local149] = local5249;
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 147) {
												Static56.method898(Static275.aClass8_Sub2_Sub1_6, Static199.aClass17_3, Static68.anInt1687);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 208) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
												if (Static67.method1072(local145)) {
													Static63.method982(local149, local153);
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 195) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2375();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local157 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local161 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local165 = Static275.aClass8_Sub2_Sub1_6.method2375();
												if (Static67.method1072(local145)) {
													Static134.aBooleanArray8[local149] = true;
													Static165.anIntArray254[local149] = local153;
													Static269.anIntArray376[local149] = local157;
													Static70.anIntArray106[local149] = local161;
													Static39.anIntArray60[local149] = local165;
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 180) {
												if (Static58.aFrame2 != null) {
													Static101.method1616(-1, -1, false, Static99.anInt2072);
												}
												@Pc(5533) byte[] local5533 = new byte[Static68.anInt1687];
												Static275.aClass8_Sub2_Sub1_6.method2395(local5533, Static68.anInt1687);
												local560 = Static144.method2277(local5533, 0, Static68.anInt1687);
												if (Static209.aFrame3 == null && (Static26.anInt662 == 3 || !Static26.aString24.startsWith("win") || Static279.aBoolean460)) {
													Static37.method3008(local560, true);
												} else {
													Static79.aString65 = local560;
													Static102.aBoolean168 = true;
													Static3.aClass163_10 = Static199.aClass17_3.method456(local560);
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 202) {
												Static20.method368();
												local145 = Static275.aClass8_Sub2_Sub1_6.method2334();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2381();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2334();
												Static125.anIntArray198[local145] = local149;
												Static77.anIntArray112[local145] = local153;
												Static64.anIntArray98[local145] = 1;
												for (local157 = 0; local157 < 98; local157++) {
													if (local149 >= Class7.anIntArray8[local157]) {
														Static64.anIntArray98[local145] = local157 + 2;
													}
												}
												Static33.anIntArray53[Static133.anInt2697++ & 0x1F] = local145;
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 250) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2358();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2379();
												Static122.method1971(local145, local149);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 64) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2338();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2381();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2375();
												if (Static67.method1072(local153)) {
													Static203.method3158(local149, local145);
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 15) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2379();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2375();
												if (local149 == 65535) {
													local149 = -1;
												}
												local153 = Static275.aClass8_Sub2_Sub1_6.method2376();
												local157 = Static275.aClass8_Sub2_Sub1_6.method2377();
												if (local157 == 65535) {
													local157 = -1;
												}
												local161 = Static275.aClass8_Sub2_Sub1_6.method2358();
												if (Static67.method1072(local161)) {
													for (local165 = local149; local165 <= local157; local165++) {
														local1317 = (long) local165 + ((long) local145 << 32);
														local3116 = (Class8_Sub24) Static94.aClass129_8.method3043(local1317);
														if (local3116 != null) {
															local3130 = new Class8_Sub24(local153, local3116.anInt4398);
															local3116.method4273();
														} else if (local165 == -1) {
															local3130 = new Class8_Sub24(local153, Static82.method1361(local145).aClass8_Sub24_2.anInt4398);
														} else {
															local3130 = new Class8_Sub24(local153, -1);
														}
														Static94.aClass129_8.method3039(local3130, local1317);
													}
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 106) {
												Static20.method368();
												Static169.anInt3391 = Static275.aClass8_Sub2_Sub1_6.method2360();
												Static41.anInt879 = Static157.anInt5706;
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 154) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2322();
												local149 = local145 >> 2;
												local153 = local145 & 0x3;
												local157 = Static156.anIntArray250[local149];
												local161 = Static275.aClass8_Sub2_Sub1_6.method2358();
												if (local161 == 65535) {
													local161 = -1;
												}
												local165 = Static275.aClass8_Sub2_Sub1_6.method2379();
												local295 = local165 >> 28 & 0x3;
												local301 = local165 >> 14 & 0x3FFF;
												local1327 = local165 & 0x3FFF;
												local1327 -= Static130.anInt2601;
												local301 -= Static49.anInt1089;
												Static17.method322(local1327, local149, local153, local295, local301, local161, local157);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 11) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2338();
												local149 = Static275.aClass8_Sub2_Sub1_6.method2377();
												Static122.method1971(local149, local145);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 113) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2348();
												if (local145 == 65535) {
													local145 = -1;
												}
												local149 = Static275.aClass8_Sub2_Sub1_6.method2379();
												local153 = Static275.aClass8_Sub2_Sub1_6.method2377();
												if (Static67.method1072(local153)) {
													Static102.method1663(-1, local145, 1, local149);
												}
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 136) {
												local145 = Static275.aClass8_Sub2_Sub1_6.method2352();
												@Pc(5978) Class159 local5978 = Static82.method1361(local145);
												for (local153 = 0; local153 < local5978.anIntArray394.length; local153++) {
													local5978.anIntArray394[local153] = -1;
													local5978.anIntArray394[local153] = 0;
												}
												Static128.method2075(local5978);
												Static277.anInt5667 = -1;
												return true;
											} else if (Static277.anInt5667 == 186) {
												Static277.anInt5667 = -1;
												Static292.anInt5659 = 0;
												return true;
											} else {
												Static88.method1444("T1 - " + Static277.anInt5667 + "," + Static188.anInt3774 + "," + Static173.anInt3442 + " - " + Static68.anInt1687, null);
												Static206.method3267();
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
