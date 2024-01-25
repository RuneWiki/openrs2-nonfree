import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_44 = new Class130();

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
	public static void method5891() {
		if (Static582.anInt9301 == 0 || Static582.anInt9301 == 6) {
			return;
		}
		try {
			if (++Static192.anInt3722 > 2000) {
				if (Static78.aClass152_2 != null) {
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
				}
				if (Static376.anInt6365 >= 2) {
					Static582.anInt9301 = 0;
					Static337.method5148(-5);
					return;
				}
				if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
					Static583.aClass65_5.method2046();
				} else {
					Static460.aClass65_3.method2046();
				}
				Static192.anInt3722 = 0;
				Static376.anInt6365++;
				Static582.anInt9301 = 1;
			}
			if (Static582.anInt9301 == 1) {
				if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
					Static440.aClass192_4 = Static583.aClass65_5.method2044(Static409.aClass221_6);
				} else {
					Static440.aClass192_4 = Static460.aClass65_3.method2044(Static409.aClass221_6);
				}
				Static582.anInt9301 = 2;
			}
			if (Static582.anInt9301 == 2) {
				if (Static440.aClass192_4.anInt5186 == 2) {
					throw new IOException();
				}
				if (Static440.aClass192_4.anInt5186 != 1) {
					return;
				}
				Static78.aClass152_2 = Static123.method2535((Socket) Static440.aClass192_4.anObject30);
				Static440.aClass192_4 = null;
				@Pc(118) long local118 = Static354.aLong176 = Static248.method7734(Static412.aString100);
				@Pc(125) int local125 = (int) (local118 >> 16 & 0x1FL);
				Static294.method4659();
				@Pc(130) Class3_Sub34 local130 = Static17.method293();
				local130.aClass3_Sub11_Sub1_2.method3079(Static115.aClass92_1.anInt2893);
				local130.aClass3_Sub11_Sub1_2.method3079(local125);
				Static131.method2572(local130);
				Static556.method7408();
				Static582.anInt9301 = 3;
			}
			@Pc(174) int local174;
			if (Static582.anInt9301 == 3) {
				if (!Static78.aClass152_2.method3910(1)) {
					return;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				local174 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
				if (local174 != 0) {
					Static582.anInt9301 = 0;
					Static337.method5148(local174);
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					Static212.method3743();
					return;
				}
				Static582.anInt9301 = 4;
			}
			if (Static582.anInt9301 == 4) {
				if (!Static78.aClass152_2.method3910(8)) {
					return;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 8, 0);
				Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
				Static118.aLong78 = Static187.aClass3_Sub11_Sub1_1.method3128();
				@Pc(225) Class3_Sub11 local225 = new Class3_Sub11(518);
				@Pc(228) int[] local228 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static118.aLong78 >> 32), (int) Static118.aLong78 };
				local225.method3079(10);
				local225.method3101(local228[0]);
				local225.method3101(local228[1]);
				local225.method3101(local228[2]);
				local225.method3101(local228[3]);
				local225.method3124(Static248.method7734(Static412.aString100));
				local225.method3136(Static594.aString129);
				local225.method3124(Static381.aLong186);
				local225.method3124(Static365.aLong274);
				local225.method3119(Static479.aBigInteger6, Static551.aBigInteger8);
				Static294.method4659();
				@Pc(312) Class3_Sub34 local312 = Static17.method293();
				@Pc(315) Class3_Sub11_Sub1 local315 = local312.aClass3_Sub11_Sub1_2;
				@Pc(337) int local337;
				if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
					if (Static246.anInt4542 == 13) {
						local315.method3079(Static115.aClass92_5.anInt2893);
					} else {
						local315.method3079(Static115.aClass92_3.anInt2893);
					}
					local315.method3131(0);
					local337 = local315.anInt3520;
					local315.method3101(620);
					local315.method3079(Static490.anInt7979);
					local315.method3079(Static294.method4660());
					local315.method3131(Static318.anInt5754);
					local315.method3131(Static447.anInt7372);
					local315.method3079(Static278.aClass3_Sub13_Sub1_1.anInt5159);
					Static254.method4070(local315);
					local315.method3136(Static502.aString109);
					local315.method3101(Static350.anInt8128);
					@Pc(449) Class3_Sub11 local449 = new Class3_Sub11(Static551.method7383());
					Static278.aClass3_Sub13_Sub1_1.method4462(local449);
					local315.method3079(local449.anInt3520);
					local315.method3084(local449.anInt3520, local449.aByteArray36);
					Static529.aBoolean647 = true;
					@Pc(474) Class3_Sub11 local474 = new Class3_Sub11(Static583.method7708());
					(new Class3_Sub40(true, Static409.aClass221_6)).method6068(local474);
					local315.method3084(local474.aByteArray36.length, local474.aByteArray36);
					local315.method3131(Static435.anInt7197);
					local315.method3124(Static513.aLong237);
					local315.method3079(Static428.aString28 == null ? 0 : 1);
					if (Static428.aString28 != null) {
						local315.method3136(Static428.aString28);
					}
					Static557.method7418(local315);
					local315.method3084(local225.anInt3520, local225.aByteArray36);
					local315.method3098(local315.anInt3520 - local337);
				} else {
					local315.method3079(Static115.aClass92_6.anInt2893);
					local315.method3131(0);
					local337 = local315.anInt3520;
					local315.method3101(620);
					local315.method3079(Static227.aClass211_1.anInt5793);
					local315.method3079(Static131.anInt2839);
					Static254.method4070(local315);
					local315.method3136(Static502.aString109);
					local315.method3101(Static350.anInt8128);
					Static557.method7418(local315);
					local315.method3084(local225.anInt3520, local225.aByteArray36);
					local315.method3098(local315.anInt3520 - local337);
				}
				Static131.method2572(local312);
				Static556.method7408();
				Static220.aClass287_2 = new Class287(local228);
				for (local337 = 0; local337 < 4; local337++) {
					local228[local337] += 50;
				}
				Static187.aClass3_Sub11_Sub1_1.method998(local228);
				Static582.anInt9301 = 5;
			}
			if (Static582.anInt9301 == 5) {
				if (!Static78.aClass152_2.method3910(1)) {
					return;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				local174 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
				if (local174 == 21) {
					Static582.anInt9301 = 8;
				} else if (local174 == 29) {
					Static582.anInt9301 = 14;
				} else if (local174 == 1) {
					Static582.anInt9301 = 6;
					Static337.method5148(local174);
					return;
				} else if (local174 == 2) {
					Static582.anInt9301 = 9;
				} else if (local174 == 15) {
					Static582.anInt9301 = 15;
					Static178.anInt8249 = -2;
				} else if (local174 == 23 && Static376.anInt6365 < 2) {
					Static582.anInt9301 = 1;
					Static376.anInt6365++;
					Static192.anInt3722 = 0;
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					return;
				} else {
					Static582.anInt9301 = 0;
					Static337.method5148(local174);
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					Static212.method3743();
					return;
				}
			}
			if (Static582.anInt9301 == 7) {
				Static294.method4659();
				@Pc(679) Class3_Sub34 local679 = Static17.method293();
				@Pc(682) Class3_Sub11_Sub1 local682 = local679.aClass3_Sub11_Sub1_2;
				local682.method994(Static220.aClass287_2);
				local682.method996(Static115.aClass92_13.anInt2893);
				Static131.method2572(local679);
				Static556.method7408();
				Static582.anInt9301 = 5;
			} else if (Static582.anInt9301 == 8) {
				if (Static78.aClass152_2.method3910(1)) {
					Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
					local174 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
					Static138.anInt2947 = local174 * 60 + 180;
					Static582.anInt9301 = 0;
					Static337.method5148(21);
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					Static212.method3743();
				}
			} else if (Static582.anInt9301 == 14) {
				if (Static78.aClass152_2.method3910(1)) {
					Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
					Static582.anInt9301 = 0;
					Static462.anInt7552 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
					Static337.method5148(29);
					Static78.aClass152_2.method3908();
					Static78.aClass152_2 = null;
					Static212.method3743();
				}
			} else if (Static582.anInt9301 != 9) {
				@Pc(826) Class3_Sub11_Sub1 local826;
				if (Static582.anInt9301 == 10) {
					if (Static209.anInt8184 == 3) {
						Static377.aBoolean531 = true;
					} else {
						Static377.aBoolean531 = false;
					}
					local826 = Static187.aClass3_Sub11_Sub1_1;
					if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
						if (!Static78.aClass152_2.method3910(Static219.anInt4310)) {
							return;
						}
						Static78.aClass152_2.method3909(local826.aByteArray36, Static219.anInt4310, 0);
						local826.anInt3520 = 0;
						Static274.anInt5067 = local826.method3118();
						Static130.anInt2834 = local826.method3118();
						Static203.aBoolean318 = local826.method3118() == 1;
						Static491.aBoolean618 = local826.method3118() == 1;
						Static576.aBoolean713 = local826.method3118() == 1;
						Static426.aBoolean561 = local826.method3118() == 1;
						Static502.anInt8011 = local826.method3109();
						Static35.aBoolean75 = local826.method3118() == 1;
						Static59.anInt5160 = local826.method3137();
						Static137.aBoolean250 = local826.method3118() == 1;
						if (Static209.anInt8184 == 3) {
							@Pc(1136) boolean local1136 = local826.method3118() == 1;
							if (local1136) {
								@Pc(1142) long local1142 = local826.method3128();
								@Pc(1146) String local1146 = Static180.method3145(local1142);
								@Pc(1150) int local1150 = local826.method3118();
								@Pc(1153) byte[] local1153 = new byte[local1150];
								local826.method993(local1150, local1153);
								@Pc(1163) String local1163 = Static463.method6414(local1153);
								@Pc(1165) Class235 local1165 = null;
								try {
									@Pc(1171) Class192 local1171 = Static409.aClass221_6.method5200("3", false);
									while (local1171.anInt5186 == 0) {
										Static374.method5521(1L);
									}
									if (local1171.anInt5186 == 1) {
										local1165 = (Class235) local1171.anObject30;
										@Pc(1203) int local1203 = local1146.length() + local1163.length() + 12 + 2 + 3 + 3;
										if (Static428.aString28 != null) {
											local1203 += Static428.aString28.length() + 2;
										}
										if (local1203 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1228) Class3_Sub11 local1228 = new Class3_Sub11(local1203 + 1);
										local1228.method3079(local1203);
										local1228.method3079(3);
										local1228.method3081(local1146);
										local1228.method3081(local1163);
										local1228.method3131(Static350.anInt8128);
										local1228.method3124(Static513.aLong237);
										local1228.method3079(Static428.aString28 == null ? 0 : 1);
										if (Static428.aString28 != null) {
											local1228.method3081(Static428.aString28);
										}
										local1228.method3091();
										local1165.method5486(local1228.aByteArray36, local1228.anInt3520, 0);
									}
								} catch (@Pc(1282) Exception local1282) {
								}
								try {
									if (local1165 != null) {
										local1165.method5488();
									}
								} catch (@Pc(1289) Exception local1289) {
								}
								try {
									Static605.method6792("demoaccountcreated", Static533.anApplet4);
								} catch (@Pc(1296) Throwable local1296) {
								}
							}
						}
						Static476.aClass69_5.method2187(Static137.aBoolean250);
						Static517.aClass145_1.method3792(Static137.aBoolean250);
						Static510.aClass284_2.method6287(Static137.aBoolean250);
					} else if (Static78.aClass152_2.method3910(Static219.anInt4310)) {
						Static78.aClass152_2.method3909(local826.aByteArray36, Static219.anInt4310, 0);
						local826.anInt3520 = 0;
						Static274.anInt5067 = local826.method3118();
						Static130.anInt2834 = local826.method3118();
						Static203.aBoolean318 = local826.method3118() == 1;
						Static491.aBoolean618 = local826.method3118() == 1;
						Static576.aBoolean713 = local826.method3118() == 1;
						Static460.anInt7528 = local826.method3107();
						Static35.aBoolean75 = Static460.anInt7528 > 0;
						Static443.anInt7319 = local826.method3109();
						Static7.anInt105 = local826.method3109();
						Static484.anInt7815 = local826.method3109();
						Static130.anInt2835 = local826.method3116();
						Static65.aClass192_1 = Static409.aClass221_6.method5203(Static130.anInt2835);
						Static543.anInt8521 = local826.method3118();
						Static437.anInt7270 = local826.method3109();
						Static365.anInt9432 = local826.method3109();
						Static123.aBoolean234 = local826.method3118() == 1;
						Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString95 = local826.method3125();
						Static88.anInt2200 = local826.method3118();
						Static232.anInt4425 = local826.method3116();
						Static551.aClass65_4 = new Class65();
						Static551.aClass65_4.anInt2279 = local826.method3109();
						if (Static551.aClass65_4.anInt2279 == 65535) {
							Static551.aClass65_4.anInt2279 = -1;
						}
						Static551.aClass65_4.aString31 = local826.method3125();
						if (Static555.aClass173_8 != Static559.aClass173_9) {
							Static551.aClass65_4.anInt2278 = Static551.aClass65_4.anInt2279 + 50000;
							Static551.aClass65_4.anInt2274 = Static551.aClass65_4.anInt2279 + 40000;
						}
						if (Static559.aClass173_9 != Static52.aClass173_6 && (Static583.aClass65_5.method2045(Static56.aClass65_1) || Static583.aClass65_5.method2045(Static338.aClass65_2))) {
							Static427.method6071();
						}
					} else {
						return;
					}
					if (Static203.aBoolean318 && !Static576.aBoolean713 || Static35.aBoolean75) {
						try {
							Static605.method6792("zap", Static533.anApplet4);
						} catch (@Pc(1322) Throwable local1322) {
							if (Static32.aBoolean55) {
								try {
									Static533.anApplet4.getAppletContext().showDocument(new URL(Static533.anApplet4.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1336) Exception local1336) {
								}
							}
						}
					} else {
						try {
							Static605.method6792("unzap", Static533.anApplet4);
						} catch (@Pc(1345) Throwable local1345) {
						}
					}
					if (Static559.aClass173_9 == Static555.aClass173_8) {
						try {
							Static605.method6792("loggedin", Static533.anApplet4);
						} catch (@Pc(1358) Throwable local1358) {
						}
					}
					if (Static209.anInt8184 != 2 && Static209.anInt8184 != 3) {
						Static582.anInt9301 = 0;
						Static337.method5148(2);
						Static130.method2563();
						Static113.method2374(7);
						Static230.aClass272_135 = null;
						return;
					}
					Static582.anInt9301 = 12;
				}
				if (Static582.anInt9301 == 12) {
					if (!Static78.aClass152_2.method3910(3)) {
						return;
					}
					Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 3, 0);
					Static582.anInt9301 = 13;
				}
				if (Static582.anInt9301 == 13) {
					local826 = Static187.aClass3_Sub11_Sub1_1;
					local826.anInt3520 = 0;
					if (local826.method995()) {
						if (!Static78.aClass152_2.method3910(1)) {
							return;
						}
						Static78.aClass152_2.method3909(local826.aByteArray36, 1, 3);
					}
					Static230.aClass272_135 = Static95.method523()[local826.method1000()];
					Static178.anInt8249 = local826.method3109();
					Static582.anInt9301 = 11;
				}
				if (Static582.anInt9301 == 11) {
					if (Static78.aClass152_2.method3910(Static178.anInt8249)) {
						Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, Static178.anInt8249, 0);
						Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
						Static582.anInt9301 = 0;
						local174 = Static178.anInt8249;
						Static337.method5148(2);
						Static282.method4484();
						Static260.method4318(Static187.aClass3_Sub11_Sub1_1);
						Static16.anInt248 = -1;
						if (Static357.aClass272_194 == Static230.aClass272_135) {
							Static2.method12();
						} else {
							Static353.method5306();
						}
						if (local174 != Static187.aClass3_Sub11_Sub1_1.anInt3520) {
							throw new RuntimeException("lswp pos:" + Static187.aClass3_Sub11_Sub1_1.anInt3520 + " psize:" + local174);
						}
						Static230.aClass272_135 = null;
					}
				} else if (Static582.anInt9301 == 15) {
					if (Static178.anInt8249 == -2) {
						if (!Static78.aClass152_2.method3910(2)) {
							return;
						}
						Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 2, 0);
						Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
						Static178.anInt8249 = Static187.aClass3_Sub11_Sub1_1.method3109();
					}
					if (Static78.aClass152_2.method3910(Static178.anInt8249)) {
						Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, Static178.anInt8249, 0);
						Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
						Static582.anInt9301 = 0;
						local174 = Static178.anInt8249;
						Static337.method5148(15);
						Static446.method6255();
						Static260.method4318(Static187.aClass3_Sub11_Sub1_1);
						if (Static187.aClass3_Sub11_Sub1_1.anInt3520 != local174) {
							throw new RuntimeException("lswpr pos:" + Static187.aClass3_Sub11_Sub1_1.anInt3520 + " psize:" + local174);
						}
						Static230.aClass272_135 = null;
					}
				}
			} else if (Static78.aClass152_2.method3910(1)) {
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				Static219.anInt4310 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
				Static582.anInt9301 = 10;
			}
		} catch (@Pc(1604) IOException local1604) {
			if (Static78.aClass152_2 != null) {
				Static78.aClass152_2.method3908();
				Static78.aClass152_2 = null;
			}
			if (Static376.anInt6365 >= 2) {
				Static582.anInt9301 = 0;
				Static337.method5148(-4);
				Static212.method3743();
			} else {
				if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
					Static583.aClass65_5.method2046();
				} else {
					Static460.aClass65_3.method2046();
				}
				Static376.anInt6365++;
				Static192.anInt3722 = 0;
				Static582.anInt9301 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5892(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static48.aClass33_35.method797(Static131.anInt2839) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static48.aClass33_37.method797(Static131.anInt2839) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
