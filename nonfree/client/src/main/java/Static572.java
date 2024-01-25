import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!uc;")
	public static final Class122 aClass122_2 = Static174.method3175();

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_225 = new Class362(100, 4);

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
	public static final int[] anIntArray534 = new int[50];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!n;I)V")
	public static void method8105(@OriginalArg(0) int arg0, @OriginalArg(2) Class225 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray17 != null) {
			@Pc(13) Class4_Sub25 local13 = new Class4_Sub25();
			local13.aClass225_21 = arg1;
			local13.anObjectArray1 = arg1.anObjectArray17;
			Static388.method6121(local13);
		}
		Static163.anInt3317 = arg0;
		Static397.anInt7611 = arg1.anInt6507;
		Static418.aBoolean541 = true;
		Static180.anInt3622 = arg1.anInt6553;
		Static7.anInt173 = arg1.anInt6555;
		Static52.anInt768 = arg2;
		Static317.anInt10281 = arg1.anInt6565;
		Static592.anInt10215 = arg1.anInt6527;
		Static92.method2100(arg1);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method8106() {
		if (Static587.anInt10158 == 0 || Static587.anInt10158 == 6) {
			return;
		}
		try {
			if (++Static167.anInt3453 > 2000) {
				if (Static299.aClass241_3 != null) {
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
				}
				if (Static505.anInt9071 >= 2) {
					Static587.anInt10158 = 0;
					Static6.method139(-5);
					return;
				}
				if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
					Static60.aClass342_1.method8062();
				} else {
					Static133.aClass342_3.method8062();
				}
				Static505.anInt9071++;
				Static587.anInt10158 = 1;
				Static167.anInt3453 = 0;
			}
			if (Static587.anInt10158 == 1) {
				if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
					Static122.aClass234_3 = Static60.aClass342_1.method8058(Static406.aClass354_5);
				} else {
					Static122.aClass234_3 = Static133.aClass342_3.method8058(Static406.aClass354_5);
				}
				Static587.anInt10158 = 2;
			}
			if (Static587.anInt10158 == 2) {
				if (Static122.aClass234_3.anInt6717 == 2) {
					throw new IOException();
				}
				if (Static122.aClass234_3.anInt6717 != 1) {
					return;
				}
				Static299.aClass241_3 = Static41.method506((Socket) Static122.aClass234_3.anObject16);
				Static122.aClass234_3 = null;
				@Pc(120) long local120 = Static578.aLong263 = Static518.method7584(Static278.aString57);
				Static145.method2782();
				@Pc(129) int local129 = (int) (local120 >> 16 & 0x1FL);
				@Pc(132) Class4_Sub14 local132 = Static296.method5096();
				local132.aClass4_Sub11_Sub1_3.method4957(Static367.aClass140_1.anInt3740);
				local132.aClass4_Sub11_Sub1_3.method4957(local129);
				Static353.method5712(local132);
				Static367.method5899();
				Static587.anInt10158 = 3;
			}
			@Pc(174) int local174;
			if (Static587.anInt10158 == 3) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				local174 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				if (local174 != 0) {
					Static587.anInt10158 = 0;
					Static6.method139(local174);
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
					Static224.method3668();
					return;
				}
				Static587.anInt10158 = 4;
			}
			if (Static587.anInt10158 == 4) {
				if (!Static299.aClass241_3.method7084(8)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 8, 0);
				Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
				Static189.aLong100 = Static319.aClass4_Sub11_Sub1_2.method4903();
				@Pc(220) Class4_Sub11 local220 = new Class4_Sub11(518);
				@Pc(223) int[] local223 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static189.aLong100 >> 32), (int) Static189.aLong100 };
				local220.method4957(10);
				local220.method4909(local223[0]);
				local220.method4909(local223[1]);
				local220.method4909(local223[2]);
				local220.method4909(local223[3]);
				local220.method4906(Static518.method7584(Static278.aString57));
				local220.method4945(Static174.aString32);
				local220.method4906(Static129.aLong67);
				local220.method4906(Static252.aLong133);
				local220.method4939(Static526.aBigInteger2, Static251.aBigInteger3);
				Static145.method2782();
				@Pc(305) Class4_Sub14 local305 = Static296.method5096();
				@Pc(308) Class4_Sub11_Sub1 local308 = local305.aClass4_Sub11_Sub1_3;
				@Pc(326) int local326;
				if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
					if (Static203.anInt3855 == 13) {
						local308.method4957(Static367.aClass140_5.anInt3740);
					} else {
						local308.method4957(Static367.aClass140_3.anInt3740);
					}
					local308.method4937(0);
					local326 = local308.anInt5831;
					local308.method4909(623);
					local308.method4957(Static135.anInt2897);
					local308.method4957(Static4.method130());
					local308.method4937(Static554.anInt9828);
					local308.method4937(Static375.anInt7256);
					local308.method4957(Static214.aClass4_Sub19_Sub1_1.anInt3061);
					Static54.method688(local308);
					local308.method4945(Static450.aString79);
					local308.method4909(Static566.anInt9919);
					@Pc(438) Class4_Sub11 local438 = new Class4_Sub11(Static72.method6568());
					Static214.aClass4_Sub19_Sub1_1.method2776(local438);
					local308.method4957(local438.anInt5831);
					local308.method4929(local438.aByteArray68, local438.anInt5831);
					Static265.aBoolean367 = true;
					@Pc(463) Class4_Sub11 local463 = new Class4_Sub11(Static573.method8201());
					(new Class4_Sub10(true, Static406.aClass354_5)).method1074(local463);
					local308.method4929(local463.aByteArray68, local463.aByteArray68.length);
					local308.method4937(Static308.anInt6171);
					local308.method4906(Static79.aLong41);
					local308.method4957(Static314.aString60 == null ? 0 : 1);
					if (Static314.aString60 != null) {
						local308.method4945(Static314.aString60);
					}
					Static562.method8059(local308);
					local308.method4929(local220.aByteArray68, local220.anInt5831);
					local308.method4959(local308.anInt5831 - local326);
				} else {
					local308.method4957(Static367.aClass140_6.anInt3740);
					local308.method4937(0);
					local326 = local308.anInt5831;
					local308.method4909(623);
					local308.method4957(Static438.aClass92_4.anInt2751);
					local308.method4957(Static154.anInt3181);
					Static54.method688(local308);
					local308.method4945(Static450.aString79);
					local308.method4909(Static566.anInt9919);
					Static562.method8059(local308);
					local308.method4929(local220.aByteArray68, local220.anInt5831);
					local308.method4959(local308.anInt5831 - local326);
				}
				Static353.method5712(local305);
				Static367.method5899();
				Static17.aClass159_1 = new Class159(local223);
				for (local326 = 0; local326 < 4; local326++) {
					local223[local326] += 50;
				}
				Static319.aClass4_Sub11_Sub1_2.method1529(local223);
				Static587.anInt10158 = 5;
			}
			if (Static587.anInt10158 == 5) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				local174 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				if (local174 == 21) {
					Static587.anInt10158 = 8;
				} else if (local174 == 29) {
					Static587.anInt10158 = 14;
				} else if (local174 == 1) {
					Static587.anInt10158 = 6;
					Static6.method139(local174);
					return;
				} else if (local174 == 2) {
					Static587.anInt10158 = 9;
				} else if (local174 == 15) {
					Static186.anInt3680 = -2;
					Static587.anInt10158 = 15;
				} else if (local174 == 23 && Static505.anInt9071 < 2) {
					Static167.anInt3453 = 0;
					Static505.anInt9071++;
					Static587.anInt10158 = 1;
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
					return;
				} else {
					Static587.anInt10158 = 0;
					Static6.method139(local174);
					Static299.aClass241_3.method7087();
					Static299.aClass241_3 = null;
					Static224.method3668();
					return;
				}
			}
			if (Static587.anInt10158 == 7) {
				Static145.method2782();
				@Pc(666) Class4_Sub14 local666 = Static296.method5096();
				@Pc(669) Class4_Sub11_Sub1 local669 = local666.aClass4_Sub11_Sub1_3;
				local669.method1534(Static17.aClass159_1);
				local669.method1540(Static367.aClass140_13.anInt3740);
				Static353.method5712(local666);
				Static367.method5899();
				Static587.anInt10158 = 5;
				return;
			}
			if (Static587.anInt10158 == 8) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				local174 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				Static587.anInt10158 = 0;
				Static15.anInt244 = (local174 + 3) * 60;
				Static6.method139(21);
				Static299.aClass241_3.method7087();
				Static299.aClass241_3 = null;
				Static224.method3668();
				return;
			}
			if (Static587.anInt10158 == 14) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				Static587.anInt10158 = 0;
				Static496.anInt9027 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				Static6.method139(29);
				Static299.aClass241_3.method7087();
				Static299.aClass241_3 = null;
				Static224.method3668();
				return;
			}
			if (Static587.anInt10158 == 9) {
				if (!Static299.aClass241_3.method7084(1)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 1, 0);
				Static587.anInt10158 = 10;
				Static410.anInt7784 = Static319.aClass4_Sub11_Sub1_2.aByteArray68[0] & 0xFF;
				return;
			}
			@Pc(806) Class4_Sub11_Sub1 local806;
			if (Static587.anInt10158 == 10) {
				local806 = Static319.aClass4_Sub11_Sub1_2;
				if (Static313.anInt4728 == 3) {
					Static17.aBoolean17 = true;
				} else {
					Static17.aBoolean17 = false;
				}
				if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
					if (!Static299.aClass241_3.method7084(Static410.anInt7784)) {
						return;
					}
					Static299.aClass241_3.method7085(local806.aByteArray68, Static410.anInt7784, 0);
					local806.anInt5831 = 0;
					Static204.anInt8827 = local806.method4905();
					Static206.anInt2853 = local806.method4905();
					Static263.aBoolean365 = local806.method4905() == 1;
					Static593.aBoolean725 = local806.method4905() == 1;
					Static551.aBoolean687 = local806.method4905() == 1;
					Static417.aBoolean537 = local806.method4905() == 1;
					Static411.anInt7797 = local806.method4936();
					Static310.aBoolean452 = local806.method4905() == 1;
					Static300.anInt6063 = local806.method4895();
					Static475.aBoolean431 = local806.method4905() == 1;
					if (Static313.anInt4728 == 3) {
						@Pc(1120) boolean local1120 = local806.method4905() == 1;
						if (local1120) {
							@Pc(1126) long local1126 = local806.method4903();
							@Pc(1130) String local1130 = Static315.method5297(local1126);
							@Pc(1134) int local1134 = local806.method4905();
							@Pc(1137) byte[] local1137 = new byte[local1134];
							local806.method1539(local1137, local1134);
							@Pc(1147) String local1147 = Static370.method5940(local1137);
							@Pc(1149) Class337 local1149 = null;
							try {
								@Pc(1155) Class234 local1155 = Static406.aClass354_5.method8215("3", false);
								while (local1155.anInt6717 == 0) {
									Static63.method1019(1L);
								}
								if (local1155.anInt6717 == 1) {
									local1149 = (Class337) local1155.anObject16;
									@Pc(1185) int local1185 = local1130.length() + local1147.length() + 7 + 13;
									if (Static314.aString60 != null) {
										local1185 += Static314.aString60.length() + 2;
									}
									if (local1185 > 120) {
										throw new RuntimeException(">120");
									}
									@Pc(1209) Class4_Sub11 local1209 = new Class4_Sub11(local1185 + 1);
									local1209.method4957(local1185);
									local1209.method4957(3);
									local1209.method4897(local1130);
									local1209.method4897(local1147);
									local1209.method4937(Static566.anInt9919);
									local1209.method4906(Static79.aLong41);
									local1209.method4957(Static314.aString60 == null ? 0 : 1);
									if (Static314.aString60 != null) {
										local1209.method4897(Static314.aString60);
									}
									local1209.method4908();
									local1149.method7965(0, local1209.aByteArray68, local1209.anInt5831);
								}
							} catch (@Pc(1261) Exception local1261) {
							}
							try {
								if (local1149 != null) {
									local1149.method7966();
								}
							} catch (@Pc(1268) Exception local1268) {
							}
							try {
								Static604.method8248(Static110.anApplet1, "demoaccountcreated");
							} catch (@Pc(1275) Throwable local1275) {
							}
						}
					}
					Static204.aClass139_8.method3316(Static475.aBoolean431);
					Static521.aClass273_2.method6714(Static475.aBoolean431);
					Static237.aClass31_1.method485(Static475.aBoolean431);
				} else if (Static299.aClass241_3.method7084(Static410.anInt7784)) {
					Static299.aClass241_3.method7085(local806.aByteArray68, Static410.anInt7784, 0);
					local806.anInt5831 = 0;
					Static204.anInt8827 = local806.method4905();
					Static206.anInt2853 = local806.method4905();
					Static263.aBoolean365 = local806.method4905() == 1;
					Static593.aBoolean725 = local806.method4905() == 1;
					Static551.aBoolean687 = local806.method4905() == 1;
					Static280.anInt5745 = local806.method4946();
					Static310.aBoolean452 = Static280.anInt5745 > 0;
					Static22.anInt329 = local806.method4936();
					Static132.anInt2842 = local806.method4936();
					Static360.anInt6985 = local806.method4936();
					Static540.anInt5854 = local806.method4931();
					Static66.aClass234_1 = Static406.aClass354_5.method8223(Static540.anInt5854);
					Static149.anInt3135 = local806.method4905();
					Static498.anInt9035 = local806.method4936();
					Static383.anInt7369 = local806.method4936();
					Static551.aBoolean688 = local806.method4905() == 1;
					Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString77 = local806.method4933();
					Static462.anInt8633 = local806.method4905();
					Static72.anInt7879 = local806.method4931();
					Static442.aClass342_5 = new Class342();
					Static442.aClass342_5.anInt9881 = local806.method4936();
					if (Static442.aClass342_5.anInt9881 == 65535) {
						Static442.aClass342_5.anInt9881 = -1;
					}
					Static442.aClass342_5.aString96 = local806.method4933();
					if (Static296.aClass145_5 != Static565.aClass145_11) {
						Static442.aClass342_5.anInt9876 = Static442.aClass342_5.anInt9881 + 50000;
						Static442.aClass342_5.anInt9874 = Static442.aClass342_5.anInt9881 + 40000;
					}
					if (Static204.aClass145_10 != Static296.aClass145_5 && (Static60.aClass342_1.method8060(Static387.aClass342_4) || Static60.aClass342_1.method8060(Static105.aClass342_2))) {
						Static209.method3500();
					}
				} else {
					return;
				}
				if (Static263.aBoolean365 && !Static551.aBoolean687 || Static310.aBoolean452) {
					try {
						Static604.method8248(Static110.anApplet1, "zap");
					} catch (@Pc(1301) Throwable local1301) {
						if (Static274.aBoolean424) {
							try {
								Static110.anApplet1.getAppletContext().showDocument(new URL(Static110.anApplet1.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(1315) Exception local1315) {
							}
						}
					}
				} else {
					try {
						Static604.method8248(Static110.anApplet1, "unzap");
					} catch (@Pc(1324) Throwable local1324) {
					}
				}
				if (Static565.aClass145_11 == Static296.aClass145_5) {
					try {
						Static604.method8248(Static110.anApplet1, "loggedin");
					} catch (@Pc(1335) Throwable local1335) {
					}
				}
				if (Static313.anInt4728 != 2 && Static313.anInt4728 != 3) {
					Static587.anInt10158 = 0;
					Static6.method139(2);
					Static518.method7583();
					Static285.method5604(7);
					Static257.aClass362_105 = null;
					return;
				}
				Static587.anInt10158 = 12;
			}
			if (Static587.anInt10158 == 12) {
				if (!Static299.aClass241_3.method7084(3)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 3, 0);
				Static587.anInt10158 = 13;
			}
			if (Static587.anInt10158 == 13) {
				local806 = Static319.aClass4_Sub11_Sub1_2;
				local806.anInt5831 = 0;
				if (local806.method1528()) {
					if (!Static299.aClass241_3.method7084(1)) {
						return;
					}
					Static299.aClass241_3.method7085(local806.aByteArray68, 1, 3);
				}
				Static257.aClass362_105 = Static212.method3529()[local806.method1532()];
				Static186.anInt3680 = local806.method4936();
				Static587.anInt10158 = 11;
			}
			if (Static587.anInt10158 == 11) {
				if (!Static299.aClass241_3.method7084(Static186.anInt3680)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, Static186.anInt3680, 0);
				Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
				Static587.anInt10158 = 0;
				local174 = Static186.anInt3680;
				Static6.method139(2);
				Static292.method6461();
				Static219.method3586(Static319.aClass4_Sub11_Sub1_2);
				Static541.anInt9603 = -1;
				if (Static65.aClass362_35 == Static257.aClass362_105) {
					Static195.method3373();
				} else {
					Static292.method6463();
				}
				if (local174 != Static319.aClass4_Sub11_Sub1_2.anInt5831) {
					throw new RuntimeException("lswp pos:" + Static319.aClass4_Sub11_Sub1_2.anInt5831 + " psize:" + local174);
				}
				Static257.aClass362_105 = null;
				return;
			}
			if (Static587.anInt10158 == 15) {
				if (Static186.anInt3680 == -2) {
					if (!Static299.aClass241_3.method7084(2)) {
						return;
					}
					Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, 2, 0);
					Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
					Static186.anInt3680 = Static319.aClass4_Sub11_Sub1_2.method4936();
				}
				if (!Static299.aClass241_3.method7084(Static186.anInt3680)) {
					return;
				}
				Static299.aClass241_3.method7085(Static319.aClass4_Sub11_Sub1_2.aByteArray68, Static186.anInt3680, 0);
				Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
				Static587.anInt10158 = 0;
				local174 = Static186.anInt3680;
				Static6.method139(15);
				Static518.method7585();
				Static219.method3586(Static319.aClass4_Sub11_Sub1_2);
				if (local174 != Static319.aClass4_Sub11_Sub1_2.anInt5831) {
					throw new RuntimeException("lswpr pos:" + Static319.aClass4_Sub11_Sub1_2.anInt5831 + " psize:" + local174);
				}
				Static257.aClass362_105 = null;
				return;
			}
		} catch (@Pc(1571) IOException local1571) {
			if (Static299.aClass241_3 != null) {
				Static299.aClass241_3.method7087();
				Static299.aClass241_3 = null;
			}
			if (Static505.anInt9071 < 2) {
				if (Static313.anInt4728 == 2 || Static313.anInt4728 == 3) {
					Static60.aClass342_1.method8062();
				} else {
					Static133.aClass342_3.method8062();
				}
				Static505.anInt9071++;
				Static587.anInt10158 = 1;
				Static167.anInt3453 = 0;
			} else {
				Static587.anInt10158 = 0;
				Static6.method139(-4);
				Static224.method3668();
			}
		}
	}
}
