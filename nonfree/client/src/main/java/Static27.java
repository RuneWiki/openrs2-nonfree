import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt614;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!le;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_275 = Static187.method3089("loc)3dat");

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_276 = Static187.method3089("Hierhin gehen");

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt616 = 0;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array5 = new Class92[200];

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt618 = 0;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!ka;I)Lclient!gj;")
	public static Class33_Sub2 method493(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class33_Sub2(arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3048(), arg0.method3049(), arg0.method3049(), arg0.method3010());
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)Lclient!kf;")
	public static Class1_Sub3_Sub13 method494(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub3_Sub13 local18 = (Class1_Sub3_Sub13) Static124.aClass47_19.method1281((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static89.aClass3_16.method3265(Static205.method3369(arg0), Static146.method2173(arg0));
		local18 = new Class1_Sub3_Sub13();
		local18.anInt2268 = arg0;
		if (local32 != null) {
			local18.method1576(new Class1_Sub14(local32));
		}
		local18.method1577();
		Static124.aClass47_19.method1273((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method495() {
		if (!Static200.aBoolean237) {
			return;
		}
		Static117.aClass1_Sub3_Sub1_Sub5_2 = null;
		Static104.anIntArray170 = null;
		Static34.aClass1_Sub3_Sub1_Sub1_2 = null;
		Static123.anIntArray197 = null;
		Static145.aClass1_Sub3_Sub1_Sub5_3 = null;
		Static197.aClass1_Sub3_Sub1_Sub1_7 = null;
		Static175.aClass1_Sub3_Sub1_Sub1_5 = null;
		Static143.anIntArray252 = null;
		Static124.aClass1_Sub3_Sub1_Sub1_3 = null;
		Static89.aClass1_Sub3_Sub1_Sub5Array4 = null;
		Static36.anIntArray76 = null;
		Static66.anIntArray121 = null;
		Static51.anIntArray91 = null;
		Static165.aClass1_Sub3_Sub1_Sub5Array8 = null;
		Static131.anIntArray211 = null;
		Static138.aClass1_Sub3_Sub1_Sub5Array6 = null;
		Static194.aClass1_Sub3_Sub1_Sub5Array9 = null;
		Static42.aClass1_Sub3_Sub1_Sub5_1 = null;
		Static202.aClass1_Sub3_Sub1_Sub5Array10 = null;
		Static152.anIntArray280 = null;
		Static172.aClass1_Sub3_Sub1_Sub5_4 = null;
		Static4.aClass1_Sub3_Sub1_Sub1Array1 = null;
		Static77.method1170();
		Static138.method2071(true);
		Static200.aBoolean237 = false;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!sc;)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub24 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray28;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub3_Sub24 local18 = Static143.method2102(local14);
		if (local18 == null) {
			return;
		}
		Static129.anInt2678 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray332;
		@Pc(35) int[] local35 = local18.anIntArray333;
		@Pc(37) byte local37 = -1;
		@Pc(56) int local56;
		@Pc(69) int local69;
		try {
			Static55.anIntArray108 = new int[local18.anInt4164];
			Static176.aClass92Array24 = new Class92[local18.anInt4167];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			for (local56 = 1; local56 < local8.length; local56++) {
				if (local8[local56] instanceof Integer) {
					local69 = (Integer) local8[local56];
					if (local69 == -2147483647) {
						local69 = arg1.anInt3517;
					}
					if (local69 == -2147483646) {
						local69 = arg1.anInt3510;
					}
					if (local69 == -2147483645) {
						local69 = arg1.aClass11_18 == null ? -1 : arg1.aClass11_18.anInt275;
					}
					if (local69 == -2147483644) {
						local69 = arg1.anInt3514;
					}
					if (local69 == -2147483643) {
						local69 = arg1.aClass11_18 == null ? -1 : arg1.aClass11_18.anInt272;
					}
					if (local69 == -2147483642) {
						local69 = arg1.aClass11_17 == null ? -1 : arg1.aClass11_17.anInt275;
					}
					if (local69 == -2147483641) {
						local69 = arg1.aClass11_17 == null ? -1 : arg1.aClass11_17.anInt272;
					}
					if (local69 == -2147483640) {
						local69 = arg1.anInt3513;
					}
					if (local69 == -2147483639) {
						local69 = arg1.anInt3515;
					}
					Static55.anIntArray108[local47++] = local69;
				} else if (local8[local56] instanceof Class92) {
					@Pc(178) Class92 local178 = (Class92) local8[local56];
					if (local178.method3243(Static43.aClass92_461)) {
						local178 = arg1.aClass92_1700;
					}
					Static176.aClass92Array24[local49++] = local178;
				}
			}
			local69 = 0;
			label2406: while (true) {
				local69++;
				if (local69 > arg0) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(220) int local220 = local32[local29];
				@Pc(784) int local784;
				@Pc(789) int local789;
				@Pc(642) int local642;
				@Pc(667) int local667;
				@Pc(600) Class92 local600;
				if (local220 < 100) {
					if (local220 == 0) {
						Static44.anIntArray253[local25++] = local35[local29];
						continue;
					}
					@Pc(246) int local246;
					if (local220 == 1) {
						local246 = local35[local29];
						Static44.anIntArray253[local25++] = Static84.anIntArray156[local246];
						continue;
					}
					if (local220 == 2) {
						local246 = local35[local29];
						local25--;
						Static84.anIntArray156[local246] = Static44.anIntArray253[local25];
						continue;
					}
					if (local220 == 3) {
						Static189.aClass92Array28[local27++] = local18.aClass92Array29[local29];
						continue;
					}
					if (local220 == 6) {
						local29 += local35[local29];
						continue;
					}
					if (local220 == 7) {
						local25 -= 2;
						if (Static44.anIntArray253[local25] != Static44.anIntArray253[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 8) {
						local25 -= 2;
						if (Static44.anIntArray253[local25] == Static44.anIntArray253[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 9) {
						local25 -= 2;
						if (Static44.anIntArray253[local25 + 1] > Static44.anIntArray253[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 10) {
						local25 -= 2;
						if (Static44.anIntArray253[local25] > Static44.anIntArray253[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 21) {
						if (Static129.anInt2678 == 0) {
							return;
						}
						@Pc(419) Class21 local419 = Static141.aClass21Array1[--Static129.anInt2678];
						local29 = local419.anInt598;
						Static55.anIntArray108 = local419.anIntArray49;
						local18 = local419.aClass1_Sub3_Sub24_1;
						Static176.aClass92Array24 = local419.aClass92Array4;
						local35 = local18.anIntArray333;
						local32 = local18.anIntArray332;
						continue;
					}
					if (local220 == 25) {
						local246 = local35[local29];
						Static44.anIntArray253[local25++] = Static83.method1267(local246);
						continue;
					}
					if (local220 == 27) {
						local246 = local35[local29];
						local25--;
						Static196.method3236(Static44.anIntArray253[local25], local246);
						continue;
					}
					if (local220 == 31) {
						local25 -= 2;
						if (Static44.anIntArray253[local25] <= Static44.anIntArray253[local25 + 1]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 32) {
						local25 -= 2;
						if (Static44.anIntArray253[local25 + 1] <= Static44.anIntArray253[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local220 == 33) {
						Static44.anIntArray253[local25++] = Static55.anIntArray108[local35[local29]];
						continue;
					}
					@Pc(542) int local542;
					if (local220 == 34) {
						local542 = local35[local29];
						local25--;
						Static55.anIntArray108[local542] = Static44.anIntArray253[local25];
						continue;
					}
					if (local220 == 35) {
						Static189.aClass92Array28[local27++] = Static176.aClass92Array24[local35[local29]];
						continue;
					}
					if (local220 == 36) {
						local542 = local35[local29];
						local27--;
						Static176.aClass92Array24[local542] = Static189.aClass92Array28[local27];
						continue;
					}
					if (local220 == 37) {
						local246 = local35[local29];
						local27 -= local246;
						local600 = Static179.method2928(local246, Static189.aClass92Array28, local27);
						Static189.aClass92Array28[local27++] = local600;
						continue;
					}
					if (local220 == 38) {
						local25--;
						continue;
					}
					if (local220 == 39) {
						local27--;
						continue;
					}
					if (local220 == 40) {
						local246 = local35[local29];
						@Pc(632) Class1_Sub3_Sub24 local632 = Static143.method2102(local246);
						@Pc(636) int[] local636 = new int[local632.anInt4164];
						@Pc(640) Class92[] local640 = new Class92[local632.anInt4167];
						for (local642 = 0; local642 < local632.anInt4161; local642++) {
							local636[local642] = Static44.anIntArray253[local642 + local25 - local632.anInt4161];
						}
						for (local667 = 0; local667 < local632.anInt4158; local667++) {
							local640[local667] = Static189.aClass92Array28[local27 + local667 - local632.anInt4158];
						}
						local25 -= local632.anInt4161;
						local27 -= local632.anInt4158;
						@Pc(701) Class21 local701 = new Class21();
						local701.aClass92Array4 = Static176.aClass92Array24;
						local701.aClass1_Sub3_Sub24_1 = local18;
						local701.anIntArray49 = Static55.anIntArray108;
						local701.anInt598 = local29;
						if (Static141.aClass21Array1.length <= Static129.anInt2678) {
							throw new RuntimeException();
						}
						local29 = -1;
						Static141.aClass21Array1[Static129.anInt2678++] = local701;
						Static55.anIntArray108 = local636;
						local18 = local632;
						local32 = local632.anIntArray332;
						local35 = local632.anIntArray333;
						Static176.aClass92Array24 = local640;
						continue;
					}
					if (local220 == 42) {
						Static44.anIntArray253[local25++] = Static113.anIntArray185[local35[local29]];
						continue;
					}
					if (local220 == 43) {
						local542 = local35[local29];
						local25--;
						Static113.anIntArray185[local542] = Static44.anIntArray253[local25];
						continue;
					}
					if (local220 == 44) {
						local784 = local35[local29] & 0xFFFF;
						local25--;
						local789 = Static44.anIntArray253[local25];
						local246 = local35[local29] >> 16;
						if (local789 >= 0 && local789 <= 5000) {
							@Pc(806) byte local806 = -1;
							if (local784 == 105) {
								local806 = 0;
							}
							Static148.anIntArray273[local246] = local789;
							local642 = 0;
							while (true) {
								if (local642 >= local789) {
									continue label2406;
								}
								Static82.anIntArrayArray12[local246][local642] = local806;
								local642++;
							}
						}
						throw new RuntimeException();
					}
					if (local220 == 45) {
						local246 = local35[local29];
						local25--;
						local784 = Static44.anIntArray253[local25];
						if (local784 >= 0 && Static148.anIntArray273[local246] > local784) {
							Static44.anIntArray253[local25++] = Static82.anIntArrayArray12[local246][local784];
							continue;
						}
						throw new RuntimeException();
					}
					if (local220 == 46) {
						local25 -= 2;
						local246 = local35[local29];
						local784 = Static44.anIntArray253[local25];
						if (local784 >= 0 && local784 < Static148.anIntArray273[local246]) {
							Static82.anIntArrayArray12[local246][local784] = Static44.anIntArray253[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local220 == 47) {
						@Pc(921) Class92 local921 = Static62.aClass92Array12[local35[local29]];
						if (local921 == null) {
							local921 = Static47.aClass92_502;
						}
						Static189.aClass92Array28[local27++] = local921;
						continue;
					}
					if (local220 == 48) {
						local542 = local35[local29];
						local27--;
						Static62.aClass92Array12[local542] = Static189.aClass92Array28[local27];
						continue;
					}
					if (local220 == 51) {
						@Pc(960) Class97 local960 = local18.aClass97Array1[local35[local29]];
						local25--;
						@Pc(970) Class1_Sub20 local970 = (Class1_Sub20) local960.method3375((long) Static44.anIntArray253[local25]);
						if (local970 != null) {
							local29 += local970.anInt2663;
						}
						continue;
					}
				}
				@Pc(988) boolean local988;
				if (local35[local29] == 1) {
					local988 = true;
				} else {
					local988 = false;
				}
				@Pc(2095) Class11 local2095;
				@Pc(2068) Class11 local2068;
				@Pc(6718) int local6718;
				@Pc(1093) Class11 local1093;
				@Pc(1713) int local1713;
				if (local220 < 300) {
					if (local220 == 100) {
						local25 -= 3;
						local784 = Static44.anIntArray253[local25];
						local789 = Static44.anIntArray253[local25 + 1];
						local1713 = Static44.anIntArray253[local25 + 2];
						if (local789 == 0) {
							throw new RuntimeException();
						}
						local2068 = Static9.method2342(local784);
						if (local2068.aClass11Array1 == null) {
							local2068.aClass11Array1 = new Class11[local1713 + 1];
						}
						if (local1713 >= local2068.aClass11Array1.length) {
							@Pc(8921) Class11[] local8921 = new Class11[local1713 + 1];
							for (local6718 = 0; local6718 < local2068.aClass11Array1.length; local6718++) {
								local8921[local6718] = local2068.aClass11Array1[local6718];
							}
							local2068.aClass11Array1 = local8921;
						}
						if (local1713 > 0 && local2068.aClass11Array1[local1713 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1713 - 1));
						}
						@Pc(8970) Class11 local8970 = new Class11();
						local8970.anInt326 = local789;
						local8970.aBoolean28 = true;
						local8970.anInt256 = local8970.anInt275 = local2068.anInt275;
						local8970.anInt272 = local1713;
						local2068.aClass11Array1[local1713] = local8970;
						if (local988) {
							Static78.aClass11_5 = local8970;
						} else {
							Static92.aClass11_7 = local8970;
						}
						Static73.method1118(local2068);
						continue;
					}
					@Pc(9036) Class11 local9036;
					if (local220 == 101) {
						local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
						if (local1093.anInt272 == -1) {
							if (local988) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local9036 = Static9.method2342(local1093.anInt275);
						local9036.aClass11Array1[local1093.anInt272] = null;
						Static73.method1118(local9036);
						continue;
					}
					if (local220 == 102) {
						local25--;
						local1093 = Static9.method2342(Static44.anIntArray253[local25]);
						local1093.aClass11Array1 = null;
						Static73.method1118(local1093);
						continue;
					}
					if (local220 == 200) {
						local25 -= 2;
						local789 = Static44.anIntArray253[local25 + 1];
						local784 = Static44.anIntArray253[local25];
						local2095 = Static173.method2744(local784, local789);
						if (local2095 != null && local789 != -1) {
							Static44.anIntArray253[local25++] = 1;
							if (local988) {
								Static78.aClass11_5 = local2095;
							} else {
								Static92.aClass11_7 = local2095;
							}
							continue;
						}
						Static44.anIntArray253[local25++] = 0;
						continue;
					}
					if (local220 == 201) {
						local25--;
						local784 = Static44.anIntArray253[local25];
						local9036 = Static9.method2342(local784);
						if (local9036 == null) {
							Static44.anIntArray253[local25++] = 0;
						} else {
							Static44.anIntArray253[local25++] = 1;
							if (local988) {
								Static78.aClass11_5 = local9036;
							} else {
								Static92.aClass11_7 = local9036;
							}
						}
						continue;
					}
				} else if (local220 < 500) {
					if (local220 == 403) {
						local25 -= 2;
						local789 = Static44.anIntArray253[local25 + 1];
						local784 = Static44.anIntArray253[local25];
						if (local784 >= 7) {
							local784 -= 7;
						}
						Static15.aClass8_Sub3_Sub1_1.aClass95_18.method3305(local789, local784);
						continue;
					}
					if (local220 == 404) {
						local25 -= 2;
						local784 = Static44.anIntArray253[local25];
						local789 = Static44.anIntArray253[local25 + 1];
						Static15.aClass8_Sub3_Sub1_1.aClass95_18.method3299(local789, local784);
						continue;
					}
					if (local220 == 410) {
						local25--;
						@Pc(1061) boolean local1061 = Static44.anIntArray253[local25] != 0;
						Static15.aClass8_Sub3_Sub1_1.aClass95_18.method3297(local1061);
						continue;
					}
				} else if (local220 >= 1000 && local220 < 1100 || local220 >= 2000 && local220 < 2100) {
					if (local220 < 2000) {
						local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
					} else {
						local220 -= 1000;
						local25--;
						local1093 = Static9.method2342(Static44.anIntArray253[local25]);
					}
					if (local220 == 1000) {
						local25 -= 2;
						local1093.aByte1 = 0;
						local1093.anInt255 = local1093.anInt300 = Static44.anIntArray253[local25];
						local1093.aByte2 = 0;
						local1093.anInt291 = local1093.anInt305 = Static44.anIntArray253[local25 + 1];
						Static73.method1118(local1093);
						continue;
					}
					if (local220 == 1001) {
						local1093.aByte4 = 0;
						local25 -= 2;
						local1093.anInt312 = local1093.anInt307 = Static44.anIntArray253[local25];
						local1093.anInt287 = 0;
						local1093.aByte3 = 0;
						local1093.anInt263 = local1093.anInt296 = Static44.anIntArray253[local25 + 1];
						local1093.anInt284 = 0;
						Static73.method1118(local1093);
						if (local1093.anInt326 == 0) {
							Static71.method1101(local1093);
						}
						continue;
					}
					if (local220 == 1003) {
						local25--;
						@Pc(1196) boolean local1196 = Static44.anIntArray253[local25] == 1;
						if (local1093.aBoolean24 != local1196) {
							local1093.aBoolean24 = local1196;
							Static73.method1118(local1093);
						}
						continue;
					}
				} else {
					@Pc(2034) Class92 local2034;
					if (local220 >= 1100 && local220 < 1200 || local220 >= 2100 && local220 < 2200) {
						if (local220 >= 2000) {
							local220 -= 1000;
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
						} else {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
						}
						if (local220 == 1100) {
							local25 -= 2;
							local1093.anInt299 = Static44.anIntArray253[local25];
							if (local1093.anInt268 - local1093.anInt312 < local1093.anInt299) {
								local1093.anInt299 = local1093.anInt268 - local1093.anInt312;
							}
							if (local1093.anInt299 < 0) {
								local1093.anInt299 = 0;
							}
							local1093.anInt297 = Static44.anIntArray253[local25 + 1];
							if (local1093.anInt318 - local1093.anInt263 < local1093.anInt297) {
								local1093.anInt297 = local1093.anInt318 - local1093.anInt263;
							}
							if (local1093.anInt297 < 0) {
								local1093.anInt297 = 0;
							}
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1101) {
							local25--;
							local1093.anInt321 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1102) {
							local25--;
							local1093.aBoolean19 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1103) {
							local25--;
							local1093.anInt251 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1104) {
							local25--;
							local1093.anInt295 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1105) {
							local25--;
							local1093.anInt267 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1106) {
							local25--;
							local1093.anInt286 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1107) {
							local25--;
							local1093.aBoolean27 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1108) {
							local1093.anInt302 = 1;
							local25--;
							local1093.anInt250 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1109) {
							local25 -= 6;
							local1093.anInt281 = Static44.anIntArray253[local25];
							local1093.anInt328 = Static44.anIntArray253[local25 + 1];
							local1093.anInt258 = Static44.anIntArray253[local25 + 2];
							local1093.anInt317 = Static44.anIntArray253[local25 + 3];
							local1093.anInt323 = Static44.anIntArray253[local25 + 4];
							local1093.anInt308 = Static44.anIntArray253[local25 + 5];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1110) {
							local25--;
							local789 = Static44.anIntArray253[local25];
							if (local1093.anInt311 != local789) {
								local1093.anInt271 = 0;
								local1093.anInt311 = local789;
								local1093.anInt276 = 0;
								Static73.method1118(local1093);
							}
							continue;
						}
						if (local220 == 1111) {
							local25--;
							local1093.aBoolean22 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1112) {
							local27--;
							local2034 = Static189.aClass92Array28[local27];
							if (!local2034.method3243(local1093.aClass92_104)) {
								local1093.aClass92_104 = local2034;
								Static73.method1118(local1093);
							}
							continue;
						}
						if (local220 == 1113) {
							local25--;
							local1093.anInt292 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1114) {
							local25 -= 3;
							local1093.anInt283 = Static44.anIntArray253[local25];
							local1093.anInt304 = Static44.anIntArray253[local25 + 1];
							local1093.anInt320 = Static44.anIntArray253[local25 + 2];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1115) {
							local25--;
							local1093.aBoolean29 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1116) {
							local25--;
							local1093.anInt257 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1117) {
							local25--;
							local1093.anInt298 = Static44.anIntArray253[local25];
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1118) {
							local25--;
							local1093.aBoolean26 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1119) {
							local25--;
							local1093.aBoolean30 = Static44.anIntArray253[local25] == 1;
							Static73.method1118(local1093);
							continue;
						}
						if (local220 == 1120) {
							local25 -= 2;
							local1093.anInt268 = Static44.anIntArray253[local25];
							local1093.anInt318 = Static44.anIntArray253[local25 + 1];
							Static73.method1118(local1093);
							if (local1093.anInt326 == 0) {
								Static71.method1101(local1093);
							}
							continue;
						}
					} else if (local220 >= 1200 && local220 < 1300 || local220 >= 2200 && local220 < 2300) {
						if (local220 < 2000) {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
						} else {
							local220 -= 1000;
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
						}
						Static73.method1118(local1093);
						if (local220 == 1200 || local220 == 1205) {
							local25 -= 2;
							local789 = Static44.anIntArray253[local25];
							local1713 = Static44.anIntArray253[local25 + 1];
							if (local789 == -1) {
								local1093.anInt302 = 1;
								local1093.anInt309 = -1;
								local1093.anInt250 = -1;
							} else {
								local1093.anInt314 = local1713;
								local1093.anInt309 = local789;
								@Pc(8200) Class1_Sub3_Sub22 local8200 = Static102.method1549(local789);
								local1093.anInt281 = local8200.anInt3860;
								local1093.anInt258 = local8200.anInt3877;
								local1093.anInt328 = local8200.anInt3899;
								if (local220 == 1205) {
									local1093.aBoolean31 = false;
								} else {
									local1093.aBoolean31 = true;
								}
								local1093.anInt317 = local8200.anInt3890;
								local1093.anInt323 = local8200.anInt3881;
								local1093.anInt308 = local8200.anInt3879;
								if (local1093.anInt287 > 0) {
									local1093.anInt308 = local1093.anInt308 * 32 / local1093.anInt287;
								} else if (local1093.anInt307 > 0) {
									local1093.anInt308 = local1093.anInt308 * 32 / local1093.anInt307;
								}
							}
							continue;
						}
						if (local220 == 1201) {
							local1093.anInt302 = 2;
							local25--;
							local1093.anInt250 = Static44.anIntArray253[local25];
							continue;
						}
						if (local220 == 1202) {
							local1093.anInt302 = 3;
							local1093.anInt250 = Static15.aClass8_Sub3_Sub1_1.aClass95_18.method3302();
							continue;
						}
						if (local220 == 1203) {
							local1093.anInt302 = 6;
							local25--;
							local1093.anInt250 = Static44.anIntArray253[local25];
							continue;
						}
						if (local220 == 1204) {
							local1093.anInt302 = 5;
							local25--;
							local1093.anInt250 = Static44.anIntArray253[local25];
							continue;
						}
					} else if ((local220 < 1300 || local220 >= 1400) && (local220 < 2300 || local220 >= 2400)) {
						if (local220 >= 1400 && local220 < 1500 || local220 >= 2400 && local220 < 2500) {
							if (local220 >= 2000) {
								local220 -= 1000;
								local25--;
								local1093 = Static9.method2342(Static44.anIntArray253[local25]);
							} else {
								local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
							}
							@Pc(7653) int[] local7653 = null;
							local27--;
							local2034 = Static189.aClass92Array28[local27];
							if (local2034.method3233() > 0 && local2034.method3231(local2034.method3233() - 1) == 89) {
								local25--;
								local642 = Static44.anIntArray253[local25];
								if (local642 > 0) {
									local7653 = new int[local642];
									while (local642-- > 0) {
										local25--;
										local7653[local642] = Static44.anIntArray253[local25];
									}
								}
								local2034 = local2034.method3208(local2034.method3233() - 1, 0);
							}
							@Pc(7719) Object[] local7719 = new Object[local2034.method3233() + 1];
							for (local667 = local7719.length - 1; local667 >= 1; local667--) {
								if (local2034.method3231(local667 - 1) == 115) {
									local27--;
									local7719[local667] = Static189.aClass92Array28[local27];
								} else {
									local25--;
									local7719[local667] = Integer.valueOf(Static44.anIntArray253[local25]);
								}
							}
							local25--;
							local6718 = Static44.anIntArray253[local25];
							if (local6718 == -1) {
								local7719 = null;
							} else {
								local7719[0] = Integer.valueOf(local6718);
							}
							if (local220 == 1422) {
								local1093.anObjectArray9 = local7719;
							}
							if (local220 == 1411) {
								local1093.anObjectArray19 = local7719;
							}
							if (local220 == 1409) {
								local1093.anObjectArray25 = local7719;
							}
							if (local220 == 1412) {
								local1093.anObjectArray17 = local7719;
							}
							if (local220 == 1405) {
								local1093.anObjectArray2 = local7719;
							}
							if (local220 == 1420) {
								local1093.anObjectArray18 = local7719;
							}
							if (local220 == 1417) {
								local1093.anObjectArray11 = local7719;
							}
							if (local220 == 1408) {
								local1093.anObjectArray3 = local7719;
							}
							if (local220 == 1423) {
								local1093.anObjectArray13 = local7719;
							}
							if (local220 == 1404) {
								local1093.anObjectArray10 = local7719;
							}
							if (local220 == 1407) {
								local1093.anObjectArray14 = local7719;
								local1093.anIntArray25 = local7653;
							}
							if (local220 == 1410) {
								local1093.anObjectArray27 = local7719;
							}
							if (local220 == 1418) {
								local1093.anObjectArray24 = local7719;
							}
							if (local220 == 1415) {
								local1093.anIntArray34 = local7653;
								local1093.anObjectArray16 = local7719;
							}
							if (local220 == 1424) {
								local1093.anObjectArray4 = local7719;
							}
							if (local220 == 1421) {
								local1093.anObjectArray20 = local7719;
							}
							if (local220 == 1402) {
								local1093.anObjectArray21 = local7719;
							}
							if (local220 == 1419) {
								local1093.anObjectArray8 = local7719;
							}
							if (local220 == 1414) {
								local1093.anObjectArray22 = local7719;
								local1093.anIntArray26 = local7653;
							}
							local1093.aBoolean18 = true;
							if (local220 == 1403) {
								local1093.anObjectArray12 = local7719;
							}
							if (local220 == 1416) {
								local1093.anObjectArray23 = local7719;
							}
							if (local220 == 1406) {
								local1093.anObjectArray15 = local7719;
							}
							if (local220 == 1401) {
								local1093.anObjectArray5 = local7719;
							}
							if (local220 == 1400) {
								local1093.anObjectArray7 = local7719;
							}
							if (local220 == 1425) {
								local1093.anObjectArray6 = local7719;
							}
							continue;
						}
						if (local220 < 1600) {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
							if (local220 == 1500) {
								Static44.anIntArray253[local25++] = local1093.anInt255;
								continue;
							}
							if (local220 == 1501) {
								Static44.anIntArray253[local25++] = local1093.anInt291;
								continue;
							}
							if (local220 == 1502) {
								Static44.anIntArray253[local25++] = local1093.anInt312;
								continue;
							}
							if (local220 == 1503) {
								Static44.anIntArray253[local25++] = local1093.anInt263;
								continue;
							}
							if (local220 == 1504) {
								Static44.anIntArray253[local25++] = local1093.aBoolean24 ? 1 : 0;
								continue;
							}
							if (local220 == 1505) {
								Static44.anIntArray253[local25++] = local1093.anInt256;
								continue;
							}
						} else if (local220 < 1700) {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
							if (local220 == 1600) {
								Static44.anIntArray253[local25++] = local1093.anInt299;
								continue;
							}
							if (local220 == 1601) {
								Static44.anIntArray253[local25++] = local1093.anInt297;
								continue;
							}
							if (local220 == 1602) {
								Static189.aClass92Array28[local27++] = local1093.aClass92_104;
								continue;
							}
							if (local220 == 1603) {
								Static44.anIntArray253[local25++] = local1093.anInt268;
								continue;
							}
							if (local220 == 1604) {
								Static44.anIntArray253[local25++] = local1093.anInt318;
								continue;
							}
							if (local220 == 1605) {
								Static44.anIntArray253[local25++] = local1093.anInt308;
								continue;
							}
							if (local220 == 1606) {
								Static44.anIntArray253[local25++] = local1093.anInt258;
								continue;
							}
							if (local220 == 1607) {
								Static44.anIntArray253[local25++] = local1093.anInt323;
								continue;
							}
							if (local220 == 1608) {
								Static44.anIntArray253[local25++] = local1093.anInt317;
								continue;
							}
							if (local220 == 1609) {
								Static44.anIntArray253[local25++] = local1093.anInt251;
								continue;
							}
						} else if (local220 < 1800) {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
							if (local220 == 1700) {
								Static44.anIntArray253[local25++] = local1093.anInt309;
								continue;
							}
							if (local220 == 1701) {
								if (local1093.anInt309 == -1) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local1093.anInt314;
								}
								continue;
							}
							if (local220 == 1702) {
								Static44.anIntArray253[local25++] = local1093.anInt272;
								continue;
							}
						} else if (local220 < 1900) {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
							if (local220 == 1800) {
								Static44.anIntArray253[local25++] = Static140.method2076(Static195.method3194(local1093));
								continue;
							}
							if (local220 == 1801) {
								local25--;
								local789 = Static44.anIntArray253[local25];
								local789--;
								if (local1093.aClass92Array2 != null && local789 < local1093.aClass92Array2.length && local1093.aClass92Array2[local789] != null) {
									Static189.aClass92Array28[local27++] = local1093.aClass92Array2[local789];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 1802) {
								if (local1093.aClass92_102 == null) {
									Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								} else {
									Static189.aClass92Array28[local27++] = local1093.aClass92_102;
								}
								continue;
							}
						} else if (local220 < 2600) {
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
							if (local220 == 2500) {
								Static44.anIntArray253[local25++] = local1093.anInt255;
								continue;
							}
							if (local220 == 2501) {
								Static44.anIntArray253[local25++] = local1093.anInt291;
								continue;
							}
							if (local220 == 2502) {
								Static44.anIntArray253[local25++] = local1093.anInt312;
								continue;
							}
							if (local220 == 2503) {
								Static44.anIntArray253[local25++] = local1093.anInt263;
								continue;
							}
							if (local220 == 2504) {
								Static44.anIntArray253[local25++] = local1093.aBoolean24 ? 1 : 0;
								continue;
							}
							if (local220 == 2505) {
								Static44.anIntArray253[local25++] = local1093.anInt256;
								continue;
							}
						} else if (local220 < 2700) {
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
							if (local220 == 2600) {
								Static44.anIntArray253[local25++] = local1093.anInt299;
								continue;
							}
							if (local220 == 2601) {
								Static44.anIntArray253[local25++] = local1093.anInt297;
								continue;
							}
							if (local220 == 2602) {
								Static189.aClass92Array28[local27++] = local1093.aClass92_104;
								continue;
							}
							if (local220 == 2603) {
								Static44.anIntArray253[local25++] = local1093.anInt268;
								continue;
							}
							if (local220 == 2604) {
								Static44.anIntArray253[local25++] = local1093.anInt318;
								continue;
							}
							if (local220 == 2605) {
								Static44.anIntArray253[local25++] = local1093.anInt308;
								continue;
							}
							if (local220 == 2606) {
								Static44.anIntArray253[local25++] = local1093.anInt258;
								continue;
							}
							if (local220 == 2607) {
								Static44.anIntArray253[local25++] = local1093.anInt323;
								continue;
							}
							if (local220 == 2608) {
								Static44.anIntArray253[local25++] = local1093.anInt317;
								continue;
							}
							if (local220 == 2609) {
								Static44.anIntArray253[local25++] = local1093.anInt251;
								continue;
							}
						} else if (local220 < 2800) {
							if (local220 == 2700) {
								local25--;
								local1093 = Static9.method2342(Static44.anIntArray253[local25]);
								Static44.anIntArray253[local25++] = local1093.anInt309;
								continue;
							}
							if (local220 == 2701) {
								local25--;
								local1093 = Static9.method2342(Static44.anIntArray253[local25]);
								if (local1093.anInt309 == -1) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local1093.anInt314;
								}
								continue;
							}
							if (local220 == 2702) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								@Pc(1669) Class1_Sub4 local1669 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local784);
								if (local1669 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = 1;
								}
								continue;
							}
							if (local220 == 2703) {
								local25--;
								local1093 = Static9.method2342(Static44.anIntArray253[local25]);
								if (local1093.aClass11Array1 == null) {
									Static44.anIntArray253[local25++] = 0;
									continue;
								}
								local789 = local1093.aClass11Array1.length;
								for (local1713 = 0; local1713 < local1093.aClass11Array1.length; local1713++) {
									if (local1093.aClass11Array1[local1713] == null) {
										local789 = local1713;
										break;
									}
								}
								Static44.anIntArray253[local25++] = local789;
								continue;
							}
							if (local220 == 2704 || local220 == 2705) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								@Pc(1763) Class1_Sub4 local1763 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local784);
								if (local1763 != null && local1763.anInt490 == local789) {
									Static44.anIntArray253[local25++] = 1;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
						} else if (local220 < 2900) {
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
							if (local220 == 2800) {
								Static44.anIntArray253[local25++] = Static140.method2076(Static195.method3194(local1093));
								continue;
							}
							if (local220 == 2801) {
								local25--;
								local789 = Static44.anIntArray253[local25];
								local789--;
								if (local1093.aClass92Array2 != null && local1093.aClass92Array2.length > local789 && local1093.aClass92Array2[local789] != null) {
									Static189.aClass92Array28[local27++] = local1093.aClass92Array2[local789];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 2802) {
								if (local1093.aClass92_102 == null) {
									Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								} else {
									Static189.aClass92Array28[local27++] = local1093.aClass92_102;
								}
								continue;
							}
						} else if (local220 < 3200) {
							if (local220 == 3100) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static145.method2151(local600, Static55.aClass92_556, 0);
								continue;
							}
							if (local220 == 3101) {
								local25 -= 2;
								Static208.method788(Static15.aClass8_Sub3_Sub1_1, Static44.anIntArray253[local25 + 1], Static44.anIntArray253[local25]);
								continue;
							}
							if (local220 == 3103) {
								Static83.method1270();
								continue;
							}
							if (local220 == 3104) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local789 = 0;
								if (local600.method3239()) {
									local789 = local600.method3235();
								}
								Static38.aClass1_Sub14_Sub1_3.method3067(58);
								Static38.aClass1_Sub14_Sub1_3.method3032(local789);
								continue;
							}
							if (local220 == 3105) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static38.aClass1_Sub14_Sub1_3.method3067(23);
								Static38.aClass1_Sub14_Sub1_3.method3016(local600.method3217());
								continue;
							}
							if (local220 == 3106) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static38.aClass1_Sub14_Sub1_3.method3067(237);
								Static38.aClass1_Sub14_Sub1_3.method3024(local600.method3233() + 1);
								Static38.aClass1_Sub14_Sub1_3.method3018(local600);
								continue;
							}
							if (local220 == 3107) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local27--;
								local2034 = Static189.aClass92Array28[local27];
								Static152.method2319(local2034, local784);
								continue;
							}
							if (local220 == 3108) {
								local25 -= 3;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								local1713 = Static44.anIntArray253[local25 + 2];
								local2068 = Static9.method2342(local1713);
								Static159.method2502(local2068, local789, local784);
								continue;
							}
							if (local220 == 3109) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								local2095 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
								Static159.method2502(local2095, local789, local784);
								continue;
							}
							if (local220 == 3110) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static38.aClass1_Sub14_Sub1_3.method3067(115);
								Static38.aClass1_Sub14_Sub1_3.method3020(local784);
								continue;
							}
						} else if (local220 < 3300) {
							if (local220 == 3200) {
								local25 -= 3;
								Static173.method2740(Static44.anIntArray253[local25 + 2], Static44.anIntArray253[local25 + 1], Static44.anIntArray253[local25]);
								continue;
							}
							if (local220 == 3201) {
								local25--;
								Static42.method733(Static44.anIntArray253[local25]);
								continue;
							}
							if (local220 == 3202) {
								local25 -= 2;
								Static126.method1851(Static44.anIntArray253[local25], Static44.anIntArray253[local25 + 1]);
								continue;
							}
						} else if (local220 < 3400) {
							if (local220 == 3300) {
								Static44.anIntArray253[local25++] = Static155.anInt2981;
								continue;
							}
							if (local220 == 3301) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static64.method1028(local789, local784);
								continue;
							}
							if (local220 == 3302) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static200.method3307(local789, local784);
								continue;
							}
							if (local220 == 3303) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = Static108.method1628(local784, local789);
								continue;
							}
							if (local220 == 3304) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static148.method2239(local784).anInt2461;
								continue;
							}
							if (local220 == 3305) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static38.anIntArray79[local784];
								continue;
							}
							if (local220 == 3306) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static21.anIntArray47[local784];
								continue;
							}
							if (local220 == 3307) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static96.anIntArray165[local784];
								continue;
							}
							if (local220 == 3308) {
								local784 = Static192.anInt4180;
								local789 = Static100.anInt2141 + (Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7);
								local1713 = (Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7) + Static138.anInt2800;
								Static44.anIntArray253[local25++] = local1713 + (local784 << 28) + (local789 << 14);
								continue;
							}
							if (local220 == 3309) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 >> 14 & 0x3FFF;
								continue;
							}
							if (local220 == 3310) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 >> 28;
								continue;
							}
							if (local220 == 3311) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 & 0x3FFF;
								continue;
							}
							if (local220 == 3312) {
								Static44.anIntArray253[local25++] = Static181.aBoolean221 ? 1 : 0;
								continue;
							}
							if (local220 == 3313) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25] + 32768;
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = Static64.method1028(local789, local784);
								continue;
							}
							if (local220 == 3314) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25] + 32768;
								Static44.anIntArray253[local25++] = Static200.method3307(local789, local784);
								continue;
							}
							if (local220 == 3315) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25] + 32768;
								Static44.anIntArray253[local25++] = Static108.method1628(local784, local789);
								continue;
							}
							if (local220 == 3316) {
								if (Static4.anInt101 >= 2) {
									Static44.anIntArray253[local25++] = Static4.anInt101;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
							if (local220 == 3317) {
								Static44.anIntArray253[local25++] = Static177.anInt3805;
								continue;
							}
							if (local220 == 3318) {
								Static44.anIntArray253[local25++] = Static183.anInt3929;
								continue;
							}
							if (local220 == 3321) {
								Static44.anIntArray253[local25++] = Static129.anInt2672;
								continue;
							}
							if (local220 == 3322) {
								Static44.anIntArray253[local25++] = Static42.anInt1096;
								continue;
							}
							if (local220 == 3323) {
								if (Static103.anInt2230 >= 5 && Static103.anInt2230 <= 9) {
									Static44.anIntArray253[local25++] = 1;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3324) {
								if (Static103.anInt2230 >= 5 && Static103.anInt2230 <= 9) {
									Static44.anIntArray253[local25++] = Static103.anInt2230;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3325) {
								if (Static95.anInt2004 > 0) {
									Static44.anIntArray253[local25++] = 1;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
							if (local220 == 3326) {
								Static44.anIntArray253[local25++] = Static15.aClass8_Sub3_Sub1_1.anInt975;
								continue;
							}
							if (local220 == 3327) {
								Static44.anIntArray253[local25++] = Static15.aClass8_Sub3_Sub1_1.aClass95_18.aBoolean236 ? 1 : 0;
								continue;
							}
						} else if (local220 < 3500) {
							if (local220 == 3400) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								@Pc(2687) Class1_Sub3_Sub14 local2687 = Static180.method3389(local784);
								Static189.aClass92Array28[local27++] = local2687.method1634(local789);
								continue;
							}
							if (local220 == 3408) {
								local25 -= 4;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								local1713 = Static44.anIntArray253[local25 + 2];
								local642 = Static44.anIntArray253[local25 + 3];
								@Pc(2729) Class1_Sub3_Sub14 local2729 = Static180.method3389(local1713);
								if (local784 == local2729.anInt2345 && local789 == local2729.anInt2348) {
									if (local789 == 115) {
										Static189.aClass92Array28[local27++] = local2729.method1634(local642);
									} else {
										Static44.anIntArray253[local25++] = local2729.method1629(local642);
									}
									continue;
								}
								if (local789 == 115) {
									Static189.aClass92Array28[local27++] = Static47.aClass92_502;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
						} else if (local220 < 3700) {
							if (local220 == 3600) {
								if (Static36.anInt1017 == 0) {
									Static44.anIntArray253[local25++] = -2;
								} else if (Static36.anInt1017 == 1) {
									Static44.anIntArray253[local25++] = -1;
								} else {
									Static44.anIntArray253[local25++] = Static78.anInt1731;
								}
								continue;
							}
							if (local220 == 3601) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static36.anInt1017 == 2 && Static78.anInt1731 > local784) {
									Static189.aClass92Array28[local27++] = aClass92Array5[local784];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 3602) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static36.anInt1017 == 2 && Static78.anInt1731 > local784) {
									Static44.anIntArray253[local25++] = Static33.anIntArray61[local784];
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3603) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static36.anInt1017 == 2 && local784 < Static78.anInt1731) {
									Static44.anIntArray253[local25++] = Static168.anIntArray306[local784];
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3604) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25--;
								local789 = Static44.anIntArray253[local25];
								Static156.method2386(local789, local600);
								continue;
							}
							if (local220 == 3605) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static12.method228(local600.method3217());
								continue;
							}
							if (local220 == 3606) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static59.method972(local600.method3217());
								continue;
							}
							if (local220 == 3607) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static140.method2078(local600.method3217());
								continue;
							}
							if (local220 == 3608) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static146.method2174(local600.method3217());
								continue;
							}
							if (local220 == 3609) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								if (local600.method3205(Static99.aClass92_1895) || local600.method3205(Static90.aClass92_850)) {
									local600 = local600.method3232(7);
								}
								Static44.anIntArray253[local25++] = Static201.method3333(local600) ? 1 : 0;
								continue;
							}
							if (local220 == 3610) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static36.anInt1017 == 2 && local784 < Static78.anInt1731) {
									Static189.aClass92Array28[local27++] = Static109.aClass92Array16[local784];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 3611) {
								if (Static25.aClass92_256 == null) {
									Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								} else {
									Static189.aClass92Array28[local27++] = Static25.aClass92_256.method3198();
								}
								continue;
							}
							if (local220 == 3612) {
								if (Static25.aClass92_256 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = Static68.anInt1566;
								}
								continue;
							}
							if (local220 == 3613) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static25.aClass92_256 != null && Static68.anInt1566 > local784) {
									Static189.aClass92Array28[local27++] = Static8.aClass1_Sub10Array1[local784].aClass92_674.method3198();
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 3614) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static25.aClass92_256 != null && Static68.anInt1566 > local784) {
									Static44.anIntArray253[local25++] = Static8.aClass1_Sub10Array1[local784].anInt1639;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3615) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static25.aClass92_256 != null && Static68.anInt1566 > local784) {
									Static44.anIntArray253[local25++] = Static8.aClass1_Sub10Array1[local784].aByte6;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3616) {
								Static44.anIntArray253[local25++] = Static177.aByte11;
								continue;
							}
							if (local220 == 3617) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static66.method1035(local600);
								continue;
							}
							if (local220 == 3618) {
								Static44.anIntArray253[local25++] = Static128.aByte8;
								continue;
							}
							if (local220 == 3619) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static96.method1390(local600.method3217());
								continue;
							}
							if (local220 == 3620) {
								Static79.method1207();
								continue;
							}
							if (local220 == 3621) {
								if (Static36.anInt1017 == 0) {
									Static44.anIntArray253[local25++] = -1;
								} else {
									Static44.anIntArray253[local25++] = Static103.anInt2229;
								}
								continue;
							}
							if (local220 == 3622) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static36.anInt1017 != 0 && local784 < Static103.anInt2229) {
									Static189.aClass92Array28[local27++] = Static179.method2937(Static57.aLongArray3[local784]).method3198();
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 3623) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								if (local600.method3205(Static99.aClass92_1895) || local600.method3205(Static90.aClass92_850)) {
									local600 = local600.method3232(7);
								}
								Static44.anIntArray253[local25++] = Static6.method119(local600) ? 1 : 0;
								continue;
							}
							if (local220 == 3624) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static8.aClass1_Sub10Array1 != null && Static68.anInt1566 > local784 && Static8.aClass1_Sub10Array1[local784].aClass92_674.method3241(Static15.aClass8_Sub3_Sub1_1.aClass92_374)) {
									Static44.anIntArray253[local25++] = 1;
									continue;
								}
								Static44.anIntArray253[local25++] = 0;
								continue;
							}
							if (local220 == 3625) {
								if (Static138.aClass92_1350 == null) {
									Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								} else {
									Static189.aClass92Array28[local27++] = Static138.aClass92_1350.method3198();
								}
								continue;
							}
							if (local220 == 3626) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (Static25.aClass92_256 != null && local784 < Static68.anInt1566) {
									Static189.aClass92Array28[local27++] = Static8.aClass1_Sub10Array1[local784].aClass92_675;
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
						} else if (local220 < 4000) {
							if (local220 == 3903) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].method3190();
								continue;
							}
							if (local220 == 3904) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].anInt4222;
								continue;
							}
							if (local220 == 3905) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].anInt4220;
								continue;
							}
							if (local220 == 3906) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].anInt4217;
								continue;
							}
							if (local220 == 3907) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].anInt4214;
								continue;
							}
							if (local220 == 3908) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.aClass91Array1[local784].anInt4213;
								continue;
							}
							if (local220 == 3910) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = Static206.aClass91Array1[local784].method3188();
								Static44.anIntArray253[local25++] = local789 == 0 ? 1 : 0;
								continue;
							}
							if (local220 == 3911) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = Static206.aClass91Array1[local784].method3188();
								Static44.anIntArray253[local25++] = local789 == 2 ? 1 : 0;
								continue;
							}
							if (local220 == 3912) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = Static206.aClass91Array1[local784].method3188();
								Static44.anIntArray253[local25++] = local789 == 5 ? 1 : 0;
								continue;
							}
							if (local220 == 3913) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = Static206.aClass91Array1[local784].method3188();
								Static44.anIntArray253[local25++] = local789 == 1 ? 1 : 0;
								continue;
							}
						} else if (local220 < 4100) {
							if (local220 == 4000) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local789 + local784;
								continue;
							}
							if (local220 == 4001) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local784 - local789;
								continue;
							}
							if (local220 == 4002) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 * local789;
								continue;
							}
							if (local220 == 4003) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 / local789;
								continue;
							}
							if (local220 == 4004) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = (int) (Math.random() * (double) local784);
								continue;
							}
							if (local220 == 4005) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = (int) (Math.random() * (double) (local784 + 1));
								continue;
							}
							if (local220 == 4006) {
								local25 -= 5;
								local642 = Static44.anIntArray253[local25 + 3];
								local667 = Static44.anIntArray253[local25 + 4];
								local1713 = Static44.anIntArray253[local25 + 2];
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = (local667 - local1713) * (local789 - local784) / (local642 - local1713) + local784;
								continue;
							}
							@Pc(3935) long local3935;
							@Pc(3940) long local3940;
							if (local220 == 4007) {
								local25 -= 2;
								local3935 = Static44.anIntArray253[local25 + 1];
								local3940 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = (int) (local3940 + local3940 * local3935 / 100L);
								continue;
							}
							if (local220 == 4008) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local784 | 0x1 << local789;
								continue;
							}
							if (local220 == 4009) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = -(0x1 << local789) - 1 & local784;
								continue;
							}
							if (local220 == 4010) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = (0x1 << local789 & local784) == 0 ? 0 : 1;
								continue;
							}
							if (local220 == 4011) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 % local789;
								continue;
							}
							if (local220 == 4012) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								if (local784 == 0) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = (int) Math.pow((double) local784, (double) local789);
								}
								continue;
							}
							if (local220 == 4013) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								if (local784 == 0) {
									Static44.anIntArray253[local25++] = 0;
								} else if (local789 == 0) {
									Static44.anIntArray253[local25++] = Integer.MAX_VALUE;
								} else {
									Static44.anIntArray253[local25++] = (int) Math.pow((double) local784, 1.0D / (double) local789);
								}
								continue;
							}
							if (local220 == 4014) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local784 & local789;
								continue;
							}
							if (local220 == 4015) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local784 | local789;
								continue;
							}
							if (local220 == 4016) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local789 <= local784 ? local789 : local784;
								continue;
							}
							if (local220 == 4017) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local789 >= local784 ? local789 : local784;
								continue;
							}
							if (local220 == 4018) {
								local25 -= 3;
								local3940 = Static44.anIntArray253[local25];
								local3935 = Static44.anIntArray253[local25 + 1];
								@Pc(4282) long local4282 = (long) Static44.anIntArray253[local25 + 2];
								Static44.anIntArray253[local25++] = (int) (local3940 * local4282 / local3935);
								continue;
							}
						} else if (local220 < 4200) {
							if (local220 == 4100) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25--;
								local789 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static208.method787(new Class92[] { local600, Static49.method872(local789) });
								continue;
							}
							if (local220 == 4101) {
								local27 -= 2;
								local2034 = Static189.aClass92Array28[local27 + 1];
								local600 = Static189.aClass92Array28[local27];
								Static189.aClass92Array28[local27++] = Static208.method787(new Class92[] { local600, local2034 });
								continue;
							}
							if (local220 == 4102) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25--;
								local789 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static208.method787(new Class92[] { local600, Static113.method1688(local789) });
								continue;
							}
							if (local220 == 4103) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static189.aClass92Array28[local27++] = local600.method3220();
								continue;
							}
							if (local220 == 4104) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								@Pc(6700) long local6700 = ((long) local784 + 11745L) * 86400000L;
								Static79.aCalendar2.setTime(new Date(local6700));
								local642 = Static79.aCalendar2.get(5);
								local667 = Static79.aCalendar2.get(2);
								local6718 = Static79.aCalendar2.get(1);
								Static189.aClass92Array28[local27++] = Static208.method787(new Class92[] { Static49.method872(local642), Static106.aClass92_1022, Static22.aClass92Array3[local667], Static106.aClass92_1022, Static49.method872(local6718) });
								continue;
							}
							if (local220 == 4105) {
								local27 -= 2;
								local600 = Static189.aClass92Array28[local27];
								local2034 = Static189.aClass92Array28[local27 + 1];
								if (Static15.aClass8_Sub3_Sub1_1.aClass95_18 != null && Static15.aClass8_Sub3_Sub1_1.aClass95_18.aBoolean236) {
									Static189.aClass92Array28[local27++] = local2034;
									continue;
								}
								Static189.aClass92Array28[local27++] = local600;
								continue;
							}
							if (local220 == 4106) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static49.method872(local784);
								continue;
							}
							if (local220 == 4107) {
								local27 -= 2;
								Static44.anIntArray253[local25++] = Static189.aClass92Array28[local27].method3206(Static189.aClass92Array28[local27 + 1]);
								continue;
							}
							@Pc(6858) Class1_Sub3_Sub1_Sub3_Sub1 local6858;
							@Pc(6853) byte[] local6853;
							if (local220 == 4108) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25 -= 2;
								local789 = Static44.anIntArray253[local25];
								local1713 = Static44.anIntArray253[local25 + 1];
								local6853 = Static7.aClass3_Sub1_3.method3265(local1713, 0);
								local6858 = new Class1_Sub3_Sub1_Sub3_Sub1(local6853);
								local6858.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
								Static44.anIntArray253[local25++] = local6858.method2452(local600, local789);
								continue;
							}
							if (local220 == 4109) {
								local25 -= 2;
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local789 = Static44.anIntArray253[local25];
								local1713 = Static44.anIntArray253[local25 + 1];
								local6853 = Static7.aClass3_Sub1_3.method3265(local1713, 0);
								local6858 = new Class1_Sub3_Sub1_Sub3_Sub1(local6853);
								local6858.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
								Static44.anIntArray253[local25++] = local6858.method2455(local600, local789);
								continue;
							}
							if (local220 == 4110) {
								local27 -= 2;
								local2034 = Static189.aClass92Array28[local27 + 1];
								local600 = Static189.aClass92Array28[local27];
								local25--;
								if (Static44.anIntArray253[local25] == 1) {
									Static189.aClass92Array28[local27++] = local600;
								} else {
									Static189.aClass92Array28[local27++] = local2034;
								}
								continue;
							}
							if (local220 == 4111) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static189.aClass92Array28[local27++] = Static130.method2468(local600);
								continue;
							}
							if (local220 == 4112) {
								local25--;
								local789 = Static44.anIntArray253[local25];
								local27--;
								local600 = Static189.aClass92Array28[local27];
								if (local789 == -1) {
									throw new RuntimeException("null char");
								}
								Static189.aClass92Array28[local27++] = local600.method3242(local789);
								continue;
							}
							if (local220 == 4113) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static176.method2879(local784) ? 1 : 0;
								continue;
							}
							if (local220 == 4114) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static166.method2603(local784) ? 1 : 0;
								continue;
							}
							if (local220 == 4115) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static10.method190(local784) ? 1 : 0;
								continue;
							}
							if (local220 == 4116) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static111.method1667(local784) ? 1 : 0;
								continue;
							}
							if (local220 == 4117) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								if (local600 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local600.method3233();
								}
								continue;
							}
							if (local220 == 4118) {
								local25 -= 2;
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local1713 = Static44.anIntArray253[local25 + 1];
								local789 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = local600.method3208(local1713, local789);
								continue;
							}
							if (local220 == 4119) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								@Pc(7168) boolean local7168 = false;
								local2034 = Static193.method2265(local600.method3233());
								for (local642 = 0; local642 < local600.method3233(); local642++) {
									local667 = local600.method3231(local642);
									if (local667 == 60) {
										local7168 = true;
									} else if (local667 == 62) {
										local7168 = false;
									} else if (!local7168) {
										local2034.method3204(local667);
									}
								}
								local2034.method3219();
								Static189.aClass92Array28[local27++] = local2034;
								continue;
							}
							if (local220 == 4120) {
								local25 -= 2;
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local789 = Static44.anIntArray253[local25];
								local1713 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = local600.method3227(local1713, local789);
								continue;
							}
							if (local220 == 4121) {
								local27 -= 2;
								local600 = Static189.aClass92Array28[local27];
								local2034 = Static189.aClass92Array28[local27 + 1];
								local25--;
								local1713 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = local600.method3238(local2034, local1713);
								continue;
							}
							if (local220 == 4122) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static132.method1968(local784);
								continue;
							}
							if (local220 == 4123) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static206.method3371(local784);
								continue;
							}
						} else if (local220 < 4300) {
							if (local220 == 4200) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static102.method1549(local784).aClass92_1846;
								continue;
							}
							@Pc(6257) Class1_Sub3_Sub22 local6257;
							if (local220 == 4201) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								local6257 = Static102.method1549(local784);
								if (local789 >= 1 && local789 <= 5 && local6257.aClass92Array25[local789 - 1] != null) {
									Static189.aClass92Array28[local27++] = local6257.aClass92Array25[local789 - 1];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 4202) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								local6257 = Static102.method1549(local784);
								if (local789 >= 1 && local789 <= 5 && local6257.aClass92Array26[local789 - 1] != null) {
									Static189.aClass92Array28[local27++] = local6257.aClass92Array26[local789 - 1];
									continue;
								}
								Static189.aClass92Array28[local27++] = Static55.aClass92_556;
								continue;
							}
							if (local220 == 4203) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static102.method1549(local784).anInt3885;
								continue;
							}
							if (local220 == 4204) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static102.method1549(local784).anInt3863 == 1 ? 1 : 0;
								continue;
							}
							@Pc(6398) Class1_Sub3_Sub22 local6398;
							if (local220 == 4205) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local6398 = Static102.method1549(local784);
								if (local6398.anInt3870 == -1 && local6398.anInt3873 >= 0) {
									Static44.anIntArray253[local25++] = local6398.anInt3873;
									continue;
								}
								Static44.anIntArray253[local25++] = local784;
								continue;
							}
							if (local220 == 4206) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local6398 = Static102.method1549(local784);
								if (local6398.anInt3870 >= 0 && local6398.anInt3873 >= 0) {
									Static44.anIntArray253[local25++] = local6398.anInt3873;
									continue;
								}
								Static44.anIntArray253[local25++] = local784;
								continue;
							}
							if (local220 == 4207) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static102.method1549(local784).aBoolean219 ? 1 : 0;
								continue;
							}
							if (local220 == 4210) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25--;
								local789 = Static44.anIntArray253[local25];
								Static190.method3114(local789 == 1, local600);
								Static44.anIntArray253[local25++] = Static12.anInt363;
								continue;
							}
							if (local220 == 4211) {
								if (Static170.aShortArray38 != null && anInt614 < Static12.anInt363) {
									Static44.anIntArray253[local25++] = Static170.aShortArray38[anInt614++] & 0xFFFF;
									continue;
								}
								Static44.anIntArray253[local25++] = -1;
								continue;
							}
							if (local220 == 4212) {
								anInt614 = 0;
								continue;
							}
						} else if (local220 < 5100) {
							if (local220 == 5000) {
								Static44.anIntArray253[local25++] = Static169.anInt3511;
								continue;
							}
							if (local220 == 5001) {
								local25 -= 3;
								Static169.anInt3511 = Static44.anIntArray253[local25];
								Static196.anInt4281 = Static44.anIntArray253[local25 + 1];
								Static29.anInt716 = Static44.anIntArray253[local25 + 2];
								Static38.aClass1_Sub14_Sub1_3.method3067(239);
								Static38.aClass1_Sub14_Sub1_3.method3024(Static169.anInt3511);
								Static38.aClass1_Sub14_Sub1_3.method3024(Static196.anInt4281);
								Static38.aClass1_Sub14_Sub1_3.method3024(Static29.anInt716);
								continue;
							}
							if (local220 == 5002) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								local25 -= 2;
								local789 = Static44.anIntArray253[local25];
								local1713 = Static44.anIntArray253[local25 + 1];
								Static38.aClass1_Sub14_Sub1_3.method3067(63);
								Static38.aClass1_Sub14_Sub1_3.method3016(local600.method3217());
								Static38.aClass1_Sub14_Sub1_3.method3024(local789 - 1);
								Static38.aClass1_Sub14_Sub1_3.method3024(local1713);
								continue;
							}
							if (local220 == 5003) {
								local2034 = null;
								local25--;
								local784 = Static44.anIntArray253[local25];
								if (local784 < 100) {
									local2034 = Static111.aClass92Array17[local784];
								}
								if (local2034 == null) {
									local2034 = Static55.aClass92_556;
								}
								Static189.aClass92Array28[local27++] = local2034;
								continue;
							}
							if (local220 == 5004) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = -1;
								if (local784 < 100 && Static111.aClass92Array17[local784] != null) {
									local789 = Static71.anIntArray128[local784];
								}
								Static44.anIntArray253[local25++] = local789;
								continue;
							}
							if (local220 == 5005) {
								Static44.anIntArray253[local25++] = Static196.anInt4281;
								continue;
							}
							if (local220 == 5008) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								if (local600.method3205(Static190.aClass92_1935)) {
									Static36.method679(local600);
								} else {
									@Pc(4711) byte local4711 = 0;
									@Pc(4713) byte local4713 = 0;
									local2034 = local600.method3220();
									if (local2034.method3205(Static110.aClass92_1070)) {
										local4713 = 0;
										local600 = local600.method3232(Static110.aClass92_1070.method3233());
									} else if (local2034.method3205(Static153.aClass92_1517)) {
										local4713 = 1;
										local600 = local600.method3232(Static153.aClass92_1517.method3233());
									} else if (local2034.method3205(Static10.aClass92_95)) {
										local600 = local600.method3232(Static10.aClass92_95.method3233());
										local4713 = 2;
									} else if (local2034.method3205(Static191.aClass92_1953)) {
										local600 = local600.method3232(Static191.aClass92_1953.method3233());
										local4713 = 3;
									} else if (local2034.method3205(Static178.aClass92_1828)) {
										local4713 = 4;
										local600 = local600.method3232(Static178.aClass92_1828.method3233());
									} else if (local2034.method3205(Static12.aClass92_119)) {
										local600 = local600.method3232(Static12.aClass92_119.method3233());
										local4713 = 5;
									} else if (local2034.method3205(Static164.aClass92_1656)) {
										local4713 = 6;
										local600 = local600.method3232(Static164.aClass92_1656.method3233());
									} else if (local2034.method3205(Static136.aClass92_1333)) {
										local600 = local600.method3232(Static136.aClass92_1333.method3233());
										local4713 = 7;
									} else if (local2034.method3205(Static173.aClass92_1759)) {
										local600 = local600.method3232(Static173.aClass92_1759.method3233());
										local4713 = 8;
									} else if (local2034.method3205(Static98.aClass92_932)) {
										local4713 = 9;
										local600 = local600.method3232(Static98.aClass92_932.method3233());
									} else if (local2034.method3205(Static9.aClass92_1507)) {
										local600 = local600.method3232(Static9.aClass92_1507.method3233());
										local4713 = 10;
									} else if (local2034.method3205(Static96.aClass92_899)) {
										local4713 = 11;
										local600 = local600.method3232(Static96.aClass92_899.method3233());
									} else if (Static93.anInt1976 != 0) {
										if (local2034.method3205(Static110.aClass92_1069)) {
											local600 = local600.method3232(Static110.aClass92_1069.method3233());
											local4713 = 0;
										} else if (local2034.method3205(Static153.aClass92_1522)) {
											local4713 = 1;
											local600 = local600.method3232(Static153.aClass92_1522.method3233());
										} else if (local2034.method3205(Static10.aClass92_96)) {
											local600 = local600.method3232(Static10.aClass92_96.method3233());
											local4713 = 2;
										} else if (local2034.method3205(Static191.aClass92_1955)) {
											local4713 = 3;
											local600 = local600.method3232(Static191.aClass92_1955.method3233());
										} else if (local2034.method3205(Static178.aClass92_1831)) {
											local4713 = 4;
											local600 = local600.method3232(Static178.aClass92_1831.method3233());
										} else if (local2034.method3205(Static12.aClass92_121)) {
											local4713 = 5;
											local600 = local600.method3232(Static12.aClass92_121.method3233());
										} else if (local2034.method3205(Static164.aClass92_1654)) {
											local4713 = 6;
											local600 = local600.method3232(Static164.aClass92_1654.method3233());
										} else if (local2034.method3205(Static136.aClass92_1336)) {
											local4713 = 7;
											local600 = local600.method3232(Static136.aClass92_1336.method3233());
										} else if (local2034.method3205(Static173.aClass92_1763)) {
											local600 = local600.method3232(Static173.aClass92_1763.method3233());
											local4713 = 8;
										} else if (local2034.method3205(Static98.aClass92_935)) {
											local4713 = 9;
											local600 = local600.method3232(Static98.aClass92_935.method3233());
										} else if (local2034.method3205(Static9.aClass92_1504)) {
											local600 = local600.method3232(Static9.aClass92_1504.method3233());
											local4713 = 10;
										} else if (local2034.method3205(Static96.aClass92_901)) {
											local4713 = 11;
											local600 = local600.method3232(Static96.aClass92_901.method3233());
										}
									}
									local2034 = local600.method3220();
									if (local2034.method3205(Static77.aClass92_720)) {
										local4711 = 1;
										local600 = local600.method3232(Static77.aClass92_720.method3233());
									} else if (local2034.method3205(Static74.aClass92_680)) {
										local4711 = 2;
										local600 = local600.method3232(Static74.aClass92_680.method3233());
									} else if (local2034.method3205(Static22.aClass92_227)) {
										local600 = local600.method3232(Static22.aClass92_227.method3233());
										local4711 = 3;
									} else if (local2034.method3205(Static92.aClass92_863)) {
										local4711 = 4;
										local600 = local600.method3232(Static92.aClass92_863.method3233());
									} else if (local2034.method3205(Static160.aClass92_1618)) {
										local4711 = 5;
										local600 = local600.method3232(Static160.aClass92_1618.method3233());
									} else if (Static93.anInt1976 != 0) {
										if (local2034.method3205(Static77.aClass92_718)) {
											local4711 = 1;
											local600 = local600.method3232(Static77.aClass92_718.method3233());
										} else if (local2034.method3205(Static74.aClass92_682)) {
											local4711 = 2;
											local600 = local600.method3232(Static74.aClass92_682.method3233());
										} else if (local2034.method3205(Static22.aClass92_223)) {
											local4711 = 3;
											local600 = local600.method3232(Static22.aClass92_223.method3233());
										} else if (local2034.method3205(Static92.aClass92_862)) {
											local4711 = 4;
											local600 = local600.method3232(Static92.aClass92_862.method3233());
										} else if (local2034.method3205(Static160.aClass92_1624)) {
											local600 = local600.method3232(Static160.aClass92_1624.method3233());
											local4711 = 5;
										}
									}
									Static38.aClass1_Sub14_Sub1_3.method3067(157);
									Static38.aClass1_Sub14_Sub1_3.method3024(0);
									local667 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
									Static38.aClass1_Sub14_Sub1_3.method3024(local4713);
									Static38.aClass1_Sub14_Sub1_3.method3024(local4711);
									Static95.method1383(local600, Static38.aClass1_Sub14_Sub1_3);
									Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local667);
								}
								continue;
							}
							if (local220 == 5009) {
								local27 -= 2;
								local600 = Static189.aClass92Array28[local27];
								local2034 = Static189.aClass92Array28[local27 + 1];
								Static38.aClass1_Sub14_Sub1_3.method3067(4);
								Static38.aClass1_Sub14_Sub1_3.method3024(0);
								local1713 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
								Static38.aClass1_Sub14_Sub1_3.method3016(local600.method3217());
								Static95.method1383(local2034, Static38.aClass1_Sub14_Sub1_3);
								Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local1713);
								continue;
							}
							if (local220 == 5010) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local2034 = null;
								if (local784 < 100) {
									local2034 = Static189.aClass92Array27[local784];
								}
								if (local2034 == null) {
									local2034 = Static55.aClass92_556;
								}
								Static189.aClass92Array28[local27++] = local2034;
								continue;
							}
							if (local220 == 5011) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local2034 = null;
								if (local784 < 100) {
									local2034 = Static82.aClass92Array14[local784];
								}
								if (local2034 == null) {
									local2034 = Static55.aClass92_556;
								}
								Static189.aClass92Array28[local27++] = local2034;
								continue;
							}
							if (local220 == 5012) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local789 = -1;
								if (local784 < 100) {
									local789 = Static172.anIntArray313[local784];
								}
								Static44.anIntArray253[local25++] = local789;
								continue;
							}
							if (local220 == 5015) {
								if (Static15.aClass8_Sub3_Sub1_1 == null || Static15.aClass8_Sub3_Sub1_1.aClass92_374 == null) {
									local600 = Static88.aClass92_813;
								} else {
									local600 = Static15.aClass8_Sub3_Sub1_1.aClass92_374;
								}
								Static189.aClass92Array28[local27++] = local600;
								continue;
							}
							if (local220 == 5016) {
								Static44.anIntArray253[local25++] = Static29.anInt716;
								continue;
							}
							if (local220 == 5017) {
								Static44.anIntArray253[local25++] = Static9.anInt3166;
								continue;
							}
							if (local220 == 5050) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static47.method838(local784).aClass92_295;
								continue;
							}
							@Pc(5582) Class1_Sub3_Sub3 local5582;
							if (local220 == 5051) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local5582 = Static47.method838(local784);
								if (local5582.anIntArray55 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local5582.anIntArray55.length;
								}
								continue;
							}
							if (local220 == 5052) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = Static47.method838(local784).anIntArray55[local789];
								continue;
							}
							if (local220 == 5053) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								local5582 = Static47.method838(local784);
								if (local5582.anIntArray57 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local5582.anIntArray57.length;
								}
								continue;
							}
							if (local220 == 5054) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = Static47.method838(local784).anIntArray57[local789];
								continue;
							}
							if (local220 == 5055) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static189.aClass92Array28[local27++] = Static68.method1065(local784).method2385();
								continue;
							}
							if (local220 == 5056) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								@Pc(5719) Class1_Sub3_Sub19 local5719 = Static68.method1065(local784);
								if (local5719.anIntArray287 == null) {
									Static44.anIntArray253[local25++] = 0;
								} else {
									Static44.anIntArray253[local25++] = local5719.anIntArray287.length;
								}
								continue;
							}
							if (local220 == 5057) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static68.method1065(local784).anIntArray287[local789];
								continue;
							}
							if (local220 == 5058) {
								Static169.aClass90_1 = new Class90();
								local25--;
								Static169.aClass90_1.anInt4209 = Static44.anIntArray253[local25];
								Static169.aClass90_1.aClass1_Sub3_Sub19_1 = Static68.method1065(Static169.aClass90_1.anInt4209);
								Static169.aClass90_1.anIntArray343 = new int[Static169.aClass90_1.aClass1_Sub3_Sub19_1.method2384()];
								continue;
							}
							if (local220 == 5059) {
								Static38.aClass1_Sub14_Sub1_3.method3067(110);
								Static38.aClass1_Sub14_Sub1_3.method3024(0);
								local784 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
								Static38.aClass1_Sub14_Sub1_3.method3024(0);
								Static38.aClass1_Sub14_Sub1_3.method3020(Static169.aClass90_1.anInt4209);
								Static169.aClass90_1.aClass1_Sub3_Sub19_1.method2387(Static38.aClass1_Sub14_Sub1_3, Static169.aClass90_1.anIntArray343);
								Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local784);
								continue;
							}
							if (local220 == 5060) {
								local27--;
								local600 = Static189.aClass92Array28[local27];
								Static38.aClass1_Sub14_Sub1_3.method3067(182);
								Static38.aClass1_Sub14_Sub1_3.method3024(0);
								local789 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
								Static38.aClass1_Sub14_Sub1_3.method3016(local600.method3217());
								Static38.aClass1_Sub14_Sub1_3.method3020(Static169.aClass90_1.anInt4209);
								Static169.aClass90_1.aClass1_Sub3_Sub19_1.method2387(Static38.aClass1_Sub14_Sub1_3, Static169.aClass90_1.anIntArray343);
								Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local789);
								continue;
							}
							if (local220 == 5061) {
								Static38.aClass1_Sub14_Sub1_3.method3067(110);
								Static38.aClass1_Sub14_Sub1_3.method3024(0);
								local784 = Static38.aClass1_Sub14_Sub1_3.anInt4061;
								Static38.aClass1_Sub14_Sub1_3.method3024(1);
								Static38.aClass1_Sub14_Sub1_3.method3020(Static169.aClass90_1.anInt4209);
								Static169.aClass90_1.aClass1_Sub3_Sub19_1.method2387(Static38.aClass1_Sub14_Sub1_3, Static169.aClass90_1.anIntArray343);
								Static38.aClass1_Sub14_Sub1_3.method3042(Static38.aClass1_Sub14_Sub1_3.anInt4061 - local784);
								continue;
							}
							if (local220 == 5062) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static44.anIntArray253[local25++] = Static47.method838(local784).anIntArray56[local789];
								continue;
							}
							if (local220 == 5063) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static47.method838(local784).anIntArray58[local789];
								continue;
							}
							if (local220 == 5064) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								if (local789 == -1) {
									Static44.anIntArray253[local25++] = -1;
								} else {
									Static44.anIntArray253[local25++] = Static47.method838(local784).method510(local789);
								}
								continue;
							}
							if (local220 == 5065) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								if (local789 == -1) {
									Static44.anIntArray253[local25++] = -1;
								} else {
									Static44.anIntArray253[local25++] = Static47.method838(local784).method514(local789);
								}
								continue;
							}
							if (local220 == 5066) {
								local25--;
								local784 = Static44.anIntArray253[local25];
								Static44.anIntArray253[local25++] = Static68.method1065(local784).method2384();
								continue;
							}
							if (local220 == 5067) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								local1713 = Static68.method1065(local784).method2381(local789);
								System.out.println("chatphrase_getdynamiccommand=" + local1713);
								Static44.anIntArray253[local25++] = local1713;
								continue;
							}
							if (local220 == 5068) {
								local25 -= 2;
								local789 = Static44.anIntArray253[local25 + 1];
								local784 = Static44.anIntArray253[local25];
								Static169.aClass90_1.anIntArray343[local784] = local789;
								continue;
							}
							if (local220 == 5069) {
								local25 -= 2;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								Static169.aClass90_1.anIntArray343[local784] = local789;
								continue;
							}
							if (local220 == 5070) {
								local25 -= 3;
								local784 = Static44.anIntArray253[local25];
								local789 = Static44.anIntArray253[local25 + 1];
								local1713 = Static44.anIntArray253[local25 + 2];
								@Pc(6198) Class1_Sub3_Sub19 local6198 = Static68.method1065(local784);
								if (local6198.method2381(local789) != 0) {
									throw new RuntimeException("bad command");
								}
								Static44.anIntArray253[local25++] = local6198.method2382(local789, local1713);
								continue;
							}
						} else if (local220 < 5200) {
							if (local220 == 5100) {
								if (Static5.aBooleanArray2[86]) {
									Static44.anIntArray253[local25++] = 1;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
							if (local220 == 5101) {
								if (Static5.aBooleanArray2[82]) {
									Static44.anIntArray253[local25++] = 1;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
							if (local220 == 5102) {
								if (Static5.aBooleanArray2[81]) {
									Static44.anIntArray253[local25++] = 1;
								} else {
									Static44.anIntArray253[local25++] = 0;
								}
								continue;
							}
						} else if (local220 < 5300) {
							if (local220 == 5200) {
								local25--;
								Static28.method517(Static44.anIntArray253[local25]);
								continue;
							}
							if (local220 == 5201) {
								Static44.anIntArray253[local25++] = Static158.method2475();
								continue;
							}
							if (local220 == 5202) {
								local25--;
								Static51.method881(Static44.anIntArray253[local25]);
								continue;
							}
							if (local220 == 5203) {
								local27--;
								Static128.method1870(Static189.aClass92Array28[local27]);
								continue;
							}
							if (local220 == 5204) {
								Static189.aClass92Array28[local27 - 1] = Static35.method653(Static189.aClass92Array28[local27 - 1]);
								continue;
							}
							if (local220 == 5205) {
								local27--;
								Static34.method618(Static189.aClass92Array28[local27]);
								continue;
							}
						} else if (local220 >= 5400 && local220 < 5500 && local220 == 5400) {
							local27 -= 2;
							local600 = Static189.aClass92Array28[local27];
							local2034 = Static189.aClass92Array28[local27 + 1];
							local25--;
							local1713 = Static44.anIntArray253[local25];
							Static38.aClass1_Sub14_Sub1_3.method3067(223);
							Static38.aClass1_Sub14_Sub1_3.method3024(Static114.method1703(local600) + Static114.method1703(local2034) + 1);
							Static38.aClass1_Sub14_Sub1_3.method3018(local600);
							Static38.aClass1_Sub14_Sub1_3.method3018(local2034);
							Static38.aClass1_Sub14_Sub1_3.method3024(local1713);
							continue;
						}
					} else {
						if (local220 >= 2000) {
							local25--;
							local1093 = Static9.method2342(Static44.anIntArray253[local25]);
							local220 -= 1000;
						} else {
							local1093 = local988 ? Static78.aClass11_5 : Static92.aClass11_7;
						}
						if (local220 == 1300) {
							local25--;
							local789 = Static44.anIntArray253[local25] - 1;
							if (local789 >= 0 && local789 <= 9) {
								local27--;
								local1093.method197(Static189.aClass92Array28[local27], local789);
								continue;
							}
							local27--;
							continue;
						}
						if (local220 == 1301) {
							local25 -= 2;
							local789 = Static44.anIntArray253[local25];
							local1713 = Static44.anIntArray253[local25 + 1];
							local1093.aClass11_1 = Static173.method2744(local789, local1713);
							continue;
						}
						if (local220 == 1302) {
							local25--;
							local1093.aBoolean25 = Static44.anIntArray253[local25] == 1;
							continue;
						}
						if (local220 == 1303) {
							local25--;
							local1093.anInt280 = Static44.anIntArray253[local25];
							continue;
						}
						if (local220 == 1304) {
							local25--;
							local1093.anInt252 = Static44.anIntArray253[local25];
							continue;
						}
						if (local220 == 1305) {
							local27--;
							local1093.aClass92_102 = Static189.aClass92Array28[local27];
							continue;
						}
						if (local220 == 1306) {
							local27--;
							local1093.aClass92_103 = Static189.aClass92Array28[local27];
							continue;
						}
						if (local220 == 1307) {
							local1093.aClass92Array2 = null;
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(9154) Exception local9154) {
			if (local18.aClass92_1954 == null) {
				if (Static86.anInt1862 != 0) {
					Static145.method2151(Static124.aClass92_1221, Static55.aClass92_556, 0);
				}
				Static61.method998(local9154, "CS2 - scr:" + local18.aLong251 + " op:" + local37);
			} else {
				@Pc(9186) Class92 local9186 = Static193.method2265(30);
				local9186.method3237(Static52.aClass92_553).method3237(local18.aClass92_1954);
				for (local56 = Static129.anInt2678 - 1; local56 >= 0; local56--) {
					local9186.method3237(Static9.aClass92_1506).method3237(Static141.aClass21Array1[local56].aClass1_Sub3_Sub24_1.aClass92_1954);
				}
				if (local37 == 40) {
					local69 = local35[local29];
					local9186.method3237(Static25.aClass92_258).method3237(Static49.method872(local69));
				}
				if (Static86.anInt1862 != 0) {
					Static145.method2151(Static208.method787(new Class92[] { Static164.aClass92_1657, local18.aClass92_1954 }), Static55.aClass92_556, 0);
				}
				Static61.method998(local9154, "CS2 - scr:" + local18.aLong251 + " op:" + local37 + new String(local9186.method3228()));
			}
		}
	}
}
