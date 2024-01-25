import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "[J")
	public static final long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
	public static void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static28.anInt3098 = arg1;
		Static309.anInt5591 = arg0;
		Static87.anInt1966 = arg2;
		Static574.anInt9353 = arg3;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method7542() {
		if (Static316.anInt5682 == 0 || Static316.anInt5682 == 6) {
			return;
		}
		try {
			if (++Static188.anInt3883 > 2000) {
				if (Static400.aClass75_3 != null) {
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
				}
				if (Static73.anInt1814 >= 2) {
					Static316.anInt5682 = 0;
					Static298.method4694(-5);
					return;
				}
				if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
					Static137.aClass174_1.method4003();
				} else {
					Static293.aClass174_3.method4003();
				}
				Static316.anInt5682 = 1;
				Static188.anInt3883 = 0;
				Static73.anInt1814++;
			}
			if (Static316.anInt5682 == 1) {
				if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
					Static120.aClass23_6 = Static137.aClass174_1.method3998(Static246.aClass114_10);
				} else {
					Static120.aClass23_6 = Static293.aClass174_3.method3998(Static246.aClass114_10);
				}
				Static316.anInt5682 = 2;
			}
			if (Static316.anInt5682 == 2) {
				if (Static120.aClass23_6.anInt875 == 2) {
					throw new IOException();
				}
				if (Static120.aClass23_6.anInt875 != 1) {
					return;
				}
				Static400.aClass75_3 = Static76.method1623((Socket) Static120.aClass23_6.anObject1);
				Static120.aClass23_6 = null;
				@Pc(131) long local131 = Static349.aLong266 = Static455.method6387(Static315.aString63);
				Static316.method4805();
				@Pc(142) int local142 = (int) (local131 >> 16 & 0x1FL);
				@Pc(147) Class1_Sub48 local147 = Static240.method3953();
				local147.aClass1_Sub20_Sub1_2.method4378(Static189.aClass232_1.anInt6494);
				local147.aClass1_Sub20_Sub1_2.method4378(local142);
				Static34.method813(local147);
				Static364.method5312();
				Static316.anInt5682 = 3;
			}
			@Pc(189) int local189;
			if (Static316.anInt5682 == 3) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				local189 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				if (local189 != 0) {
					Static316.anInt5682 = 0;
					Static298.method4694(local189);
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
					Static413.method5799();
					return;
				}
				Static316.anInt5682 = 4;
			}
			if (Static316.anInt5682 == 4) {
				if (!Static400.aClass75_3.method1855(8)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 8);
				Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
				Static442.aLong339 = Static480.aClass1_Sub20_Sub1_1.method4416();
				@Pc(237) Class1_Sub20 local237 = new Class1_Sub20(518);
				@Pc(240) int[] local240 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static442.aLong339 >> 32), (int) Static442.aLong339 };
				local237.method4378(10);
				local237.method4421(local240[0]);
				local237.method4421(local240[1]);
				local237.method4421(local240[2]);
				local237.method4421(local240[3]);
				local237.method4380(Static455.method6387(Static315.aString63));
				local237.method4399(Static77.aString86);
				local237.method4380(Static562.aLong403);
				local237.method4380(Static487.aLong362);
				local237.method4407(Static502.aBigInteger4, Static566.aBigInteger6);
				Static316.method4805();
				@Pc(326) Class1_Sub48 local326 = Static240.method3953();
				@Pc(329) Class1_Sub20_Sub1 local329 = local326.aClass1_Sub20_Sub1_2;
				@Pc(361) int local361;
				if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
					if (Static177.anInt2101 == 13) {
						local329.method4378(Static189.aClass232_5.anInt6494);
					} else {
						local329.method4378(Static189.aClass232_3.anInt6494);
					}
					local329.method4381(0);
					local361 = local329.anInt5238;
					local329.method4421(619);
					local329.method4378(Static326.anInt5840);
					local329.method4378(Static19.method541());
					local329.method4381(Static443.anInt7718);
					local329.method4381(Static300.anInt5516);
					local329.method4378(Static479.aClass1_Sub7_Sub1_1.anInt3105);
					Static259.method4058(local329);
					local329.method4399(Static74.aString17);
					local329.method4421(Static208.anInt8805);
					@Pc(412) Class1_Sub20 local412 = new Class1_Sub20(Static578.method7769());
					Static479.aClass1_Sub7_Sub1_1.method2619(local412);
					local329.method4378(local412.anInt5238);
					local329.method4412(local412.aByteArray52, local412.anInt5238);
					Static392.aBoolean493 = true;
					@Pc(437) Class1_Sub20 local437 = new Class1_Sub20(Static123.method2122());
					(new Class1_Sub17(true, Static246.aClass114_10)).method2523(local437);
					local329.method4412(local437.aByteArray52, local437.aByteArray52.length);
					local329.method4381(Static199.anInt4026);
					local329.method4380(Static368.aLong283);
					local329.method4378(Static292.aString59 == null ? 0 : 1);
					if (Static292.aString59 != null) {
						local329.method4399(Static292.aString59);
					}
					Static357.method5210(local329);
					local329.method4412(local237.aByteArray52, local237.anInt5238);
					local329.method4423(local329.anInt5238 - local361);
				} else {
					local329.method4378(Static189.aClass232_6.anInt6494);
					local329.method4381(0);
					local361 = local329.anInt5238;
					local329.method4421(619);
					local329.method4378(Static275.aClass230_2.anInt6313);
					local329.method4378(Static562.anInt9127);
					Static259.method4058(local329);
					local329.method4399(Static74.aString17);
					local329.method4421(Static208.anInt8805);
					Static357.method5210(local329);
					local329.method4412(local237.aByteArray52, local237.anInt5238);
					local329.method4423(local329.anInt5238 - local361);
				}
				Static34.method813(local326);
				Static364.method5312();
				Static442.aClass170_2 = new Class170(local240);
				for (local361 = 0; local361 < 4; local361++) {
					local240[local361] += 50;
				}
				Static480.aClass1_Sub20_Sub1_1.method3935(local240);
				Static316.anInt5682 = 5;
			}
			if (Static316.anInt5682 == 5) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				local189 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				if (local189 == 21) {
					Static316.anInt5682 = 8;
				} else if (local189 == 29) {
					Static316.anInt5682 = 14;
				} else if (local189 == 1) {
					Static316.anInt5682 = 6;
					Static298.method4694(local189);
					return;
				} else if (local189 == 2) {
					Static316.anInt5682 = 9;
				} else if (local189 == 15) {
					Static494.anInt8294 = -2;
					Static316.anInt5682 = 15;
				} else if (local189 == 23 && Static73.anInt1814 < 2) {
					Static73.anInt1814++;
					Static188.anInt3883 = 0;
					Static316.anInt5682 = 1;
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
					return;
				} else {
					Static316.anInt5682 = 0;
					Static298.method4694(local189);
					Static400.aClass75_3.method1850();
					Static400.aClass75_3 = null;
					Static413.method5799();
					return;
				}
			}
			if (Static316.anInt5682 == 7) {
				Static316.method4805();
				@Pc(711) Class1_Sub48 local711 = Static240.method3953();
				@Pc(714) Class1_Sub20_Sub1 local714 = local711.aClass1_Sub20_Sub1_2;
				local714.method3931(Static442.aClass170_2);
				local714.method3934(Static189.aClass232_13.anInt6494);
				Static34.method813(local711);
				Static364.method5312();
				Static316.anInt5682 = 5;
				return;
			}
			if (Static316.anInt5682 == 8) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				local189 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				Static321.anInt5786 = (local189 + 3) * 60;
				Static316.anInt5682 = 0;
				Static298.method4694(21);
				Static400.aClass75_3.method1850();
				Static400.aClass75_3 = null;
				Static413.method5799();
				return;
			}
			if (Static316.anInt5682 == 14) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				Static316.anInt5682 = 0;
				Static413.anInt7039 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				Static298.method4694(29);
				Static400.aClass75_3.method1850();
				Static400.aClass75_3 = null;
				Static413.method5799();
				return;
			}
			if (Static316.anInt5682 == 9) {
				if (!Static400.aClass75_3.method1855(1)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				Static316.anInt5682 = 10;
				Static325.anInt9475 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
				return;
			}
			@Pc(853) Class1_Sub20_Sub1 local853;
			if (Static316.anInt5682 == 10) {
				local853 = Static480.aClass1_Sub20_Sub1_1;
				if (Static590.anInt9527 == 3) {
					Static579.aBoolean690 = true;
				} else {
					Static579.aBoolean690 = false;
				}
				if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
					if (!Static400.aClass75_3.method1855(Static325.anInt9475)) {
						return;
					}
					Static400.aClass75_3.method1856(local853.aByteArray52, 0, Static325.anInt9475);
					local853.anInt5238 = 0;
					Static276.anInt5092 = local853.method4393();
					Static323.anInt5789 = local853.method4393();
					Static242.aBoolean359 = local853.method4393() == 1;
					Static35.aBoolean80 = local853.method4393() == 1;
					Static416.aBoolean509 = local853.method4393() == 1;
					Static329.aBoolean427 = local853.method4393() == 1;
					Static594.anInt9653 = local853.method4426();
					Static40.aBoolean452 = local853.method4393() == 1;
					Static506.anInt8447 = local853.method4410();
					Static33.aBoolean76 = local853.method4393() == 1;
					if (Static590.anInt9527 == 3) {
						@Pc(1165) boolean local1165 = local853.method4393() == 1;
						if (local1165) {
							@Pc(1171) long local1171 = local853.method4416();
							@Pc(1175) String local1175 = Static541.method7808(local1171);
							@Pc(1179) int local1179 = local853.method4393();
							@Pc(1182) byte[] local1182 = new byte[local1179];
							local853.method3930(local1179, local1182);
							@Pc(1194) String local1194 = Static50.method1158(local1182);
							@Pc(1196) Class283 local1196 = null;
							try {
								@Pc(1202) Class23 local1202 = Static246.aClass114_10.method2514("3", false);
								while (local1202.anInt875 == 0) {
									Static423.method5918(1L);
								}
								if (local1202.anInt875 == 1) {
									local1196 = (Class283) local1202.anObject1;
									@Pc(1237) int local1237 = local1175.length() + local1194.length() + 10 + 3 + 2 + 5;
									if (Static292.aString59 != null) {
										local1237 += Static292.aString59.length() + 2;
									}
									if (local1237 > 120) {
										throw new RuntimeException(">120");
									}
									@Pc(1263) Class1_Sub20 local1263 = new Class1_Sub20(local1237 + 1);
									local1263.method4378(local1237);
									local1263.method4378(3);
									local1263.method4401(local1175);
									local1263.method4401(local1194);
									local1263.method4381(Static208.anInt8805);
									local1263.method4380(Static368.aLong283);
									local1263.method4378(Static292.aString59 == null ? 0 : 1);
									if (Static292.aString59 != null) {
										local1263.method4401(Static292.aString59);
									}
									local1263.method4405();
									local1196.method6493(0, local1263.aByteArray52, local1263.anInt5238);
								}
							} catch (@Pc(1323) Exception local1323) {
							}
							try {
								if (local1196 != null) {
									local1196.method6494();
								}
							} catch (@Pc(1332) Exception local1332) {
							}
							try {
								Static602.method5582(Static412.anApplet1, "demoaccountcreated");
							} catch (@Pc(1339) Throwable local1339) {
							}
						}
					}
					Static146.aClass214_1.method4896(Static33.aBoolean76);
					Static46.aClass234_1.method5401(Static33.aBoolean76);
					Static183.aClass182_1.method4065(Static33.aBoolean76);
				} else if (Static400.aClass75_3.method1855(Static325.anInt9475)) {
					Static400.aClass75_3.method1856(local853.aByteArray52, 0, Static325.anInt9475);
					local853.anInt5238 = 0;
					Static276.anInt5092 = local853.method4393();
					Static323.anInt5789 = local853.method4393();
					Static242.aBoolean359 = local853.method4393() == 1;
					Static35.aBoolean80 = local853.method4393() == 1;
					Static416.aBoolean509 = local853.method4393() == 1;
					Static28.anInt3095 = local853.method4391();
					Static40.aBoolean452 = Static28.anInt3095 > 0;
					Static590.anInt9532 = local853.method4426();
					Static65.anInt1570 = local853.method4426();
					Static150.anInt2843 = local853.method4426();
					Static140.anInt2719 = local853.method4371();
					Static105.aClass23_5 = Static246.aClass114_10.method2504(Static140.anInt2719);
					Static282.anInt5184 = local853.method4393();
					Static499.anInt8356 = local853.method4426();
					Static205.anInt4104 = local853.method4426();
					Static247.aBoolean361 = local853.method4393() == 1;
					Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString50 = local853.method4395();
					Static23.anInt6321 = local853.method4393();
					Static427.anInt7256 = local853.method4371();
					Static159.aClass174_2 = new Class174();
					Static159.aClass174_2.anInt4666 = local853.method4426();
					if (Static159.aClass174_2.anInt4666 == 65535) {
						Static159.aClass174_2.anInt4666 = -1;
					}
					Static159.aClass174_2.aString46 = local853.method4395();
					if (Static122.aClass218_4 != Static253.aClass218_6) {
						Static159.aClass174_2.anInt4668 = Static159.aClass174_2.anInt4666 + 40000;
						Static159.aClass174_2.anInt4662 = Static159.aClass174_2.anInt4666 + 50000;
					}
					if (Static489.aClass218_10 != Static253.aClass218_6 && (Static137.aClass174_1.method4001(Static534.aClass174_5) || Static137.aClass174_1.method4001(Static404.aClass174_4))) {
						Static331.method4980();
					}
				} else {
					return;
				}
				if (Static242.aBoolean359 && !Static416.aBoolean509 || Static40.aBoolean452) {
					try {
						Static602.method5582(Static412.anApplet1, "zap");
					} catch (@Pc(1365) Throwable local1365) {
						if (Static267.aBoolean381) {
							try {
								Static412.anApplet1.getAppletContext().showDocument(new URL(Static412.anApplet1.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(1379) Exception local1379) {
							}
						}
					}
				} else {
					try {
						Static602.method5582(Static412.anApplet1, "unzap");
					} catch (@Pc(1390) Throwable local1390) {
					}
				}
				if (Static122.aClass218_4 == Static253.aClass218_6) {
					try {
						Static602.method5582(Static412.anApplet1, "loggedin");
					} catch (@Pc(1401) Throwable local1401) {
					}
				}
				if (Static590.anInt9527 != 2 && Static590.anInt9527 != 3) {
					Static316.anInt5682 = 0;
					Static298.method4694(2);
					Static584.method7814();
					Static243.method3970(7);
					Static315.aClass81_130 = null;
					return;
				}
				Static316.anInt5682 = 12;
			}
			if (Static316.anInt5682 == 12) {
				if (!Static400.aClass75_3.method1855(3)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 3);
				Static316.anInt5682 = 13;
			}
			if (Static316.anInt5682 == 13) {
				local853 = Static480.aClass1_Sub20_Sub1_1;
				local853.anInt5238 = 0;
				if (local853.method3925()) {
					if (!Static400.aClass75_3.method1855(1)) {
						return;
					}
					Static400.aClass75_3.method1856(local853.aByteArray52, 3, 1);
				}
				Static315.aClass81_130 = Static71.method1515()[local853.method3928()];
				Static494.anInt8294 = local853.method4426();
				Static316.anInt5682 = 11;
			}
			if (Static316.anInt5682 == 11) {
				if (!Static400.aClass75_3.method1855(Static494.anInt8294)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, Static494.anInt8294);
				Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
				local189 = Static494.anInt8294;
				Static316.anInt5682 = 0;
				Static298.method4694(2);
				Static235.method3828();
				Static55.method1290(Static480.aClass1_Sub20_Sub1_1);
				Static246.anInt8758 = -1;
				if (Static297.aClass81_197 == Static315.aClass81_130) {
					Static559.method7539();
				} else {
					Static346.method5123();
				}
				if (Static480.aClass1_Sub20_Sub1_1.anInt5238 != local189) {
					throw new RuntimeException("lswp pos:" + Static480.aClass1_Sub20_Sub1_1.anInt5238 + " psize:" + local189);
				}
				Static315.aClass81_130 = null;
				return;
			}
			if (Static316.anInt5682 == 15) {
				if (Static494.anInt8294 == -2) {
					if (!Static400.aClass75_3.method1855(2)) {
						return;
					}
					Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 2);
					Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
					Static494.anInt8294 = Static480.aClass1_Sub20_Sub1_1.method4426();
				}
				if (!Static400.aClass75_3.method1855(Static494.anInt8294)) {
					return;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, Static494.anInt8294);
				Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
				local189 = Static494.anInt8294;
				Static316.anInt5682 = 0;
				Static298.method4694(15);
				Static417.method5838();
				Static55.method1290(Static480.aClass1_Sub20_Sub1_1);
				if (local189 != Static480.aClass1_Sub20_Sub1_1.anInt5238) {
					throw new RuntimeException("lswpr pos:" + Static480.aClass1_Sub20_Sub1_1.anInt5238 + " psize:" + local189);
				}
				Static315.aClass81_130 = null;
				return;
			}
		} catch (@Pc(1649) IOException local1649) {
			if (Static400.aClass75_3 != null) {
				Static400.aClass75_3.method1850();
				Static400.aClass75_3 = null;
			}
			if (Static73.anInt1814 < 2) {
				if (Static590.anInt9527 == 2 || Static590.anInt9527 == 3) {
					Static137.aClass174_1.method4003();
				} else {
					Static293.aClass174_3.method4003();
				}
				Static73.anInt1814++;
				Static316.anInt5682 = 1;
				Static188.anInt3883 = 0;
			} else {
				Static316.anInt5682 = 0;
				Static298.method4694(-4);
				Static413.method5799();
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
	public static void method7544(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(10, arg0);
		local8.method488();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7545(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static54.anInt1399; local11++) {
			if (arg0.equalsIgnoreCase(Static316.aStringArray25[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static68.aStringArray6[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg1;
		@Pc(13) int local13 = arg6 - arg0;
		for (@Pc(15) int local15 = arg1; local15 < local9; local15++) {
			Static250.method4000(arg4, Static478.anIntArrayArray51[local15], arg3, arg5);
		}
		@Pc(41) int local41 = arg4 - arg0;
		@Pc(45) int local45 = arg0 + arg3;
		for (@Pc(47) int local47 = arg6; local47 > local13; local47--) {
			Static250.method4000(arg4, Static478.anIntArrayArray51[local47], arg3, arg5);
		}
		for (@Pc(67) int local67 = local9; local67 <= local13; local67++) {
			@Pc(73) int[] local73 = Static478.anIntArrayArray51[local67];
			Static250.method4000(local45, local73, arg3, arg5);
			Static250.method4000(local41, local73, local45, arg2);
			Static250.method4000(arg4, local73, local41, arg5);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public static void method7547(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class20_Sub10 local7 = new Class20_Sub10();
		local7.aString93 = arg0;
		local7.anInt9323 = arg3;
		local7.anInt9321 = Static81.anInt1910 + arg6;
		local7.anInt9320 = arg1;
		local7.anInt9318 = arg4;
		local7.anInt9317 = arg2;
		local7.anInt9319 = arg5;
		Static456.aClass349_13.method7655(local7);
	}
}
