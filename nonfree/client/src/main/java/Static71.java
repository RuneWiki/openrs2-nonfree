import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public static int anInt1629;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!sf;")
	public static Class105 aClass105_10 = new Class105();

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public static int anInt1631 = 0;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public static int anInt1636 = 0;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	public static int anInt1640 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method1255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static155.anInt3424 != 0 && arg1 != -1) {
			Static65.method1115(Static155.anInt3424, Static225.aClass70_Sub1_68, arg1);
			Static178.aBoolean183 = true;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lclient!lc;")
	public static Class41 method1257() {
		@Pc(30) Class41_Sub1 local30 = new Class41_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[0], Static152.anIntArray225[0], Static51.anIntArray72[0], Static89.anIntArray85[0], Static73.aByteArrayArray4[0], Static52.anIntArray74);
		Static134.method2401();
		return local30;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJ)Lclient!ia;")
	public static Class51 method1258(@OriginalArg(1) long arg0) {
		Static128.aCalendar42.setTime(new Date(arg0));
		@Pc(13) int local13 = Static128.aCalendar42.get(7);
		@Pc(24) int local24 = Static128.aCalendar42.get(5);
		@Pc(28) int local28 = Static128.aCalendar42.get(2);
		@Pc(32) int local32 = Static128.aCalendar42.get(1);
		@Pc(36) int local36 = Static128.aCalendar42.get(11);
		@Pc(40) int local40 = Static128.aCalendar42.get(12);
		@Pc(44) int local44 = Static128.aCalendar42.get(13);
		return Static150.method2574(new Class51[] { Static208.aClass51Array29[local13 - 1], Static43.aClass51_306, Static27.method511(local24 / 10), Static27.method511(local24 % 10), Static97.aClass51_719, Static62.aClass51Array10[local28], Static97.aClass51_719, Static27.method511(local32), Static182.aClass51_1368, Static27.method511(local36 / 10), Static27.method511(local36 % 10), Static136.aClass51_929, Static27.method511(local40 / 10), Static27.method511(local40 % 10), Static136.aClass51_929, Static27.method511(local44 / 10), Static27.method511(local44 % 10), Static212.aClass51_1559 });
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZLclient!me;)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class71 arg2) {
		if (Static111.aClass71_22 != null || Static156.aBoolean164 || (arg2 == null || Static216.method3594(arg2) == null)) {
			return;
		}
		Static111.aClass71_22 = arg2;
		Static218.aClass71_20 = Static216.method3594(arg2);
		Static167.anInt3761 = arg0;
		Static144.anInt3149 = 0;
		Static33.aBoolean35 = false;
		Static222.anInt4666 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!o;IB)V")
	public static void method1260(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray32;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub2_Sub3 local18 = Static43.method755(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		Static13.anInt330 = 0;
		@Pc(27) int local27 = -1;
		@Pc(30) int[] local30 = local18.anIntArray41;
		@Pc(32) int local32 = 0;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray40;
		@Pc(51) int local51;
		@Pc(89) int local89;
		try {
			Static55.aClass51Array8 = new Class51[local18.anInt581];
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			Static188.anIntArray307 = new int[local18.anInt575];
			for (local51 = 1; local51 < local8.length; local51++) {
				if (local8[local51] instanceof Integer) {
					local89 = (Integer) local8[local51];
					if (local89 == -2147483647) {
						local89 = arg0.anInt3104;
					}
					if (local89 == -2147483646) {
						local89 = arg0.anInt3105;
					}
					if (local89 == -2147483645) {
						local89 = arg0.aClass71_25 == null ? -1 : arg0.aClass71_25.anInt2807;
					}
					if (local89 == -2147483644) {
						local89 = arg0.anInt3101;
					}
					if (local89 == -2147483643) {
						local89 = arg0.aClass71_25 == null ? -1 : arg0.aClass71_25.anInt2788;
					}
					if (local89 == -2147483642) {
						local89 = arg0.aClass71_26 == null ? -1 : arg0.aClass71_26.anInt2807;
					}
					if (local89 == -2147483641) {
						local89 = arg0.aClass71_26 == null ? -1 : arg0.aClass71_26.anInt2788;
					}
					if (local89 == -2147483640) {
						local89 = arg0.anInt3106;
					}
					if (local89 == -2147483639) {
						local89 = arg0.anInt3102;
					}
					Static188.anIntArray307[local43++] = local89;
				} else if (local8[local51] instanceof Class51) {
					@Pc(68) Class51 local68 = (Class51) local8[local51];
					if (local68.method1426(Static63.aClass51_460)) {
						local68 = arg0.aClass51_1095;
					}
					Static55.aClass51Array8[local45++] = local68;
				}
			}
			local89 = 0;
			label3276: while (true) {
				local89++;
				if (local89 > arg1) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(218) int local218 = local30[local27];
				@Pc(784) int local784;
				@Pc(624) int local624;
				@Pc(648) int local648;
				@Pc(779) int local779;
				@Pc(582) Class51 local582;
				if (local218 < 100) {
					if (local218 == 0) {
						Static52.anIntArray73[local23++] = local37[local27];
						continue;
					}
					@Pc(244) int local244;
					if (local218 == 1) {
						local244 = local37[local27];
						Static52.anIntArray73[local23++] = Static86.anIntArray125[local244];
						continue;
					}
					if (local218 == 2) {
						local244 = local37[local27];
						local23--;
						Static53.method929(Static52.anIntArray73[local23], local244);
						continue;
					}
					if (local218 == 3) {
						Static58.aClass51Array9[local32++] = local18.aClass51Array4[local27];
						continue;
					}
					if (local218 == 6) {
						local27 += local37[local27];
						continue;
					}
					if (local218 == 7) {
						local23 -= 2;
						if (Static52.anIntArray73[local23] != Static52.anIntArray73[local23 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 8) {
						local23 -= 2;
						if (Static52.anIntArray73[local23] == Static52.anIntArray73[local23 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 9) {
						local23 -= 2;
						if (Static52.anIntArray73[local23] < Static52.anIntArray73[local23 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 10) {
						local23 -= 2;
						if (Static52.anIntArray73[local23 + 1] < Static52.anIntArray73[local23]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static13.anInt330 == 0) {
							return;
						}
						@Pc(403) Class12 local403 = Static197.aClass12Array2[--Static13.anInt330];
						Static188.anIntArray307 = local403.anIntArray16;
						local27 = local403.anInt341;
						local18 = local403.aClass1_Sub2_Sub3_1;
						Static55.aClass51Array8 = local403.aClass51Array2;
						local30 = local18.anIntArray41;
						local37 = local18.anIntArray40;
						continue;
					}
					if (local218 == 25) {
						local244 = local37[local27];
						Static52.anIntArray73[local23++] = Static182.method3078(local244);
						continue;
					}
					if (local218 == 27) {
						local244 = local37[local27];
						local23--;
						Static209.method3459(local244, Static52.anIntArray73[local23]);
						continue;
					}
					if (local218 == 31) {
						local23 -= 2;
						if (Static52.anIntArray73[local23 + 1] >= Static52.anIntArray73[local23]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 32) {
						local23 -= 2;
						if (Static52.anIntArray73[local23 + 1] <= Static52.anIntArray73[local23]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local218 == 33) {
						Static52.anIntArray73[local23++] = Static188.anIntArray307[local37[local27]];
						continue;
					}
					@Pc(526) int local526;
					if (local218 == 34) {
						local526 = local37[local27];
						local23--;
						Static188.anIntArray307[local526] = Static52.anIntArray73[local23];
						continue;
					}
					if (local218 == 35) {
						Static58.aClass51Array9[local32++] = Static55.aClass51Array8[local37[local27]];
						continue;
					}
					if (local218 == 36) {
						local526 = local37[local27];
						local32--;
						Static55.aClass51Array8[local526] = Static58.aClass51Array9[local32];
						continue;
					}
					if (local218 == 37) {
						local244 = local37[local27];
						local32 -= local244;
						local582 = Static132.method2336(local244, Static58.aClass51Array9, local32);
						Static58.aClass51Array9[local32++] = local582;
						continue;
					}
					if (local218 == 38) {
						local23--;
						continue;
					}
					if (local218 == 39) {
						local32--;
						continue;
					}
					if (local218 == 40) {
						local244 = local37[local27];
						@Pc(614) Class1_Sub2_Sub3 local614 = Static43.method755(local244);
						@Pc(618) int[] local618 = new int[local614.anInt575];
						@Pc(622) Class51[] local622 = new Class51[local614.anInt581];
						for (local624 = 0; local624 < local614.anInt580; local624++) {
							local618[local624] = Static52.anIntArray73[local624 + local23 - local614.anInt580];
						}
						for (local648 = 0; local648 < local614.anInt579; local648++) {
							local622[local648] = Static58.aClass51Array9[local648 + local32 - local614.anInt579];
						}
						local32 -= local614.anInt579;
						local23 -= local614.anInt580;
						@Pc(685) Class12 local685 = new Class12();
						local685.anIntArray16 = Static188.anIntArray307;
						local685.aClass1_Sub2_Sub3_1 = local18;
						local685.aClass51Array2 = Static55.aClass51Array8;
						local685.anInt341 = local27;
						if (Static197.aClass12Array2.length <= Static13.anInt330) {
							throw new RuntimeException();
						}
						Static197.aClass12Array2[Static13.anInt330++] = local685;
						local27 = -1;
						Static188.anIntArray307 = local618;
						Static55.aClass51Array8 = local622;
						local18 = local614;
						local37 = local614.anIntArray40;
						local30 = local614.anIntArray41;
						continue;
					}
					if (local218 == 42) {
						Static52.anIntArray73[local23++] = Static7.anIntArray9[local37[local27]];
						continue;
					}
					if (local218 == 43) {
						local244 = local37[local27];
						local23--;
						Static7.anIntArray9[local244] = Static52.anIntArray73[local23];
						Static33.method584(local244);
						continue;
					}
					if (local218 == 44) {
						local244 = local37[local27] >> 16;
						local779 = local37[local27] & 0xFFFF;
						local23--;
						local784 = Static52.anIntArray73[local23];
						if (local784 >= 0 && local784 <= 5000) {
							Static15.anIntArray18[local244] = local784;
							@Pc(802) byte local802 = -1;
							if (local779 == 105) {
								local802 = 0;
							}
							local624 = 0;
							while (true) {
								if (local784 <= local624) {
									continue label3276;
								}
								Static34.anIntArrayArray4[local244][local624] = local802;
								local624++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local244 = local37[local27];
						local23--;
						local779 = Static52.anIntArray73[local23];
						if (local779 >= 0 && Static15.anIntArray18[local244] > local779) {
							Static52.anIntArray73[local23++] = Static34.anIntArrayArray4[local244][local779];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local23 -= 2;
						local244 = local37[local27];
						local779 = Static52.anIntArray73[local23];
						if (local779 >= 0 && Static15.anIntArray18[local244] > local779) {
							Static34.anIntArrayArray4[local244][local779] = Static52.anIntArray73[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						@Pc(916) Class51 local916 = Static107.aClass51Array12[local37[local27]];
						if (local916 == null) {
							local916 = Static93.aClass51_675;
						}
						Static58.aClass51Array9[local32++] = local916;
						continue;
					}
					if (local218 == 48) {
						local244 = local37[local27];
						local32--;
						Static107.aClass51Array12[local244] = Static58.aClass51Array9[local32];
						Static167.method2864(local244);
						continue;
					}
					if (local218 == 51) {
						@Pc(956) Class102 local956 = local18.aClass102Array1[local37[local27]];
						local23--;
						@Pc(966) Class1_Sub15 local966 = (Class1_Sub15) local956.method3093((long) Static52.anIntArray73[local23]);
						if (local966 != null) {
							local27 += local966.anInt2107;
						}
						continue;
					}
				}
				@Pc(982) boolean local982;
				if (local37[local27] == 1) {
					local982 = true;
				} else {
					local982 = false;
				}
				@Pc(1065) Class71 local1065;
				@Pc(1115) int local1115;
				@Pc(1350) int local1350;
				@Pc(2310) Class71 local2310;
				@Pc(2293) Class71 local2293;
				if (local218 < 300) {
					if (local218 == 100) {
						local23 -= 3;
						local1115 = Static52.anIntArray73[local23 + 2];
						local784 = Static52.anIntArray73[local23 + 1];
						local779 = Static52.anIntArray73[local23];
						if (local784 == 0) {
							throw new RuntimeException();
						}
						local2293 = Static7.method102(local779);
						if (local2293.aClass71Array2 == null) {
							local2293.aClass71Array2 = new Class71[local1115 + 1];
						}
						if (local2293.aClass71Array2.length <= local1115) {
							@Pc(11399) Class71[] local11399 = new Class71[local1115 + 1];
							for (local1350 = 0; local1350 < local2293.aClass71Array2.length; local1350++) {
								local11399[local1350] = local2293.aClass71Array2[local1350];
							}
							local2293.aClass71Array2 = local11399;
						}
						if (local1115 > 0 && local2293.aClass71Array2[local1115 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1115 - 1));
						}
						@Pc(11449) Class71 local11449 = new Class71();
						local11449.anInt2788 = local1115;
						local11449.anInt2777 = local784;
						local11449.aBoolean122 = true;
						local11449.anInt2785 = local11449.anInt2807 = local2293.anInt2807;
						local2293.aClass71Array2[local1115] = local11449;
						if (local982) {
							Static118.aClass71_23 = local11449;
						} else {
							Static56.aClass71_28 = local11449;
						}
						Static82.method1438(local2293);
						continue;
					}
					@Pc(11516) Class71 local11516;
					if (local218 == 101) {
						local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
						if (local1065.anInt2788 == -1) {
							if (local982) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local11516 = Static7.method102(local1065.anInt2807);
						local11516.aClass71Array2[local1065.anInt2788] = null;
						Static82.method1438(local11516);
						continue;
					}
					if (local218 == 102) {
						local23--;
						local1065 = Static7.method102(Static52.anIntArray73[local23]);
						local1065.aClass71Array2 = null;
						Static82.method1438(local1065);
						continue;
					}
					if (local218 == 200) {
						local23 -= 2;
						local784 = Static52.anIntArray73[local23 + 1];
						local779 = Static52.anIntArray73[local23];
						local2310 = Static29.method527(local779, local784);
						if (local2310 != null && local784 != -1) {
							Static52.anIntArray73[local23++] = 1;
							if (local982) {
								Static118.aClass71_23 = local2310;
							} else {
								Static56.aClass71_28 = local2310;
							}
							continue;
						}
						Static52.anIntArray73[local23++] = 0;
						continue;
					}
					if (local218 == 201) {
						local23--;
						local779 = Static52.anIntArray73[local23];
						local11516 = Static7.method102(local779);
						if (local11516 == null) {
							Static52.anIntArray73[local23++] = 0;
						} else {
							Static52.anIntArray73[local23++] = 1;
							if (local982) {
								Static118.aClass71_23 = local11516;
							} else {
								Static56.aClass71_28 = local11516;
							}
						}
						continue;
					}
				} else if (local218 >= 500) {
					@Pc(5186) boolean local5186;
					if (local218 >= 1000 && local218 < 1100 || local218 >= 2000 && local218 < 2100) {
						if (local218 >= 2000) {
							local23--;
							local1065 = Static7.method102(Static52.anIntArray73[local23]);
							local218 -= 1000;
						} else {
							local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
						}
						if (local218 == 1000) {
							local23 -= 4;
							local1065.anInt2834 = Static52.anIntArray73[local23];
							local1065.anInt2781 = Static52.anIntArray73[local23 + 1];
							local784 = Static52.anIntArray73[local23 + 2];
							if (local784 < 0) {
								local784 = 0;
							} else if (local784 > 5) {
								local784 = 5;
							}
							local1115 = Static52.anIntArray73[local23 + 3];
							local1065.aByte10 = (byte) local784;
							if (local1115 < 0) {
								local1115 = 0;
							} else if (local1115 > 5) {
								local1115 = 5;
							}
							local1065.aByte9 = (byte) local1115;
							Static82.method1438(local1065);
							Static159.method2692(local1065);
							continue;
						}
						if (local218 == 1001) {
							local23 -= 4;
							local1065.anInt2855 = Static52.anIntArray73[local23];
							local1065.anInt2797 = Static52.anIntArray73[local23 + 1];
							local1065.anInt2784 = 0;
							local1065.anInt2839 = 0;
							local1115 = Static52.anIntArray73[local23 + 3];
							local784 = Static52.anIntArray73[local23 + 2];
							if (local784 < 0) {
								local784 = 0;
							} else if (local784 > 4) {
								local784 = 4;
							}
							if (local1115 < 0) {
								local1115 = 0;
							} else if (local1115 > 4) {
								local1115 = 4;
							}
							local1065.aByte11 = (byte) local784;
							local1065.aByte8 = (byte) local1115;
							Static82.method1438(local1065);
							if (local1065.anInt2777 == 0) {
								Static180.method3046(false, local1065);
							}
							Static159.method2692(local1065);
							continue;
						}
						if (local218 == 1003) {
							local23--;
							local5186 = Static52.anIntArray73[local23] == 1;
							if (local5186 != local1065.aBoolean121) {
								local1065.aBoolean121 = local5186;
								Static82.method1438(local1065);
							}
							continue;
						}
						if (local218 == 1004) {
							local23 -= 2;
							local1065.anInt2799 = Static52.anIntArray73[local23];
							local1065.anInt2778 = Static52.anIntArray73[local23 + 1];
							Static82.method1438(local1065);
							if (local1065.anInt2777 == 0) {
								Static180.method3046(false, local1065);
							}
							Static159.method2692(local1065);
							continue;
						}
					} else {
						@Pc(1247) Class51 local1247;
						if (local218 >= 1100 && local218 < 1200 || !(local218 < 2100 || local218 >= 2200)) {
							if (local218 >= 2000) {
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
								local218 -= 1000;
							} else {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
							}
							if (local218 == 1100) {
								local23 -= 2;
								local1065.anInt2842 = Static52.anIntArray73[local23];
								if (local1065.anInt2842 > local1065.anInt2841 - local1065.anInt2802) {
									local1065.anInt2842 = local1065.anInt2841 - local1065.anInt2802;
								}
								if (local1065.anInt2842 < 0) {
									local1065.anInt2842 = 0;
								}
								local1065.anInt2779 = Static52.anIntArray73[local23 + 1];
								if (local1065.anInt2813 - local1065.anInt2835 < local1065.anInt2779) {
									local1065.anInt2779 = local1065.anInt2813 - local1065.anInt2835;
								}
								if (local1065.anInt2779 < 0) {
									local1065.anInt2779 = 0;
								}
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1101) {
								local23--;
								local1065.anInt2854 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1102) {
								local23--;
								local1065.aBoolean119 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1103) {
								local23--;
								local1065.anInt2810 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1104) {
								local23--;
								local1065.anInt2808 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1105) {
								local23--;
								local1065.anInt2819 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1106) {
								local23--;
								local1065.anInt2850 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1107) {
								local23--;
								local1065.aBoolean117 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1108) {
								local1065.anInt2821 = 1;
								local23--;
								local1065.anInt2805 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1109) {
								local23 -= 6;
								local1065.anInt2792 = Static52.anIntArray73[local23];
								local1065.anInt2822 = Static52.anIntArray73[local23 + 1];
								local1065.anInt2776 = Static52.anIntArray73[local23 + 2];
								local1065.anInt2825 = Static52.anIntArray73[local23 + 3];
								local1065.anInt2827 = Static52.anIntArray73[local23 + 4];
								local1065.anInt2844 = Static52.anIntArray73[local23 + 5];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1110) {
								local23--;
								local784 = Static52.anIntArray73[local23];
								if (local1065.anInt2782 != local784) {
									local1065.anInt2818 = 0;
									local1065.anInt2793 = 0;
									local1065.anInt2782 = local784;
									Static82.method1438(local1065);
								}
								continue;
							}
							if (local218 == 1111) {
								local23--;
								local1065.aBoolean126 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1112) {
								local32--;
								local1247 = Static58.aClass51Array9[local32];
								if (!local1247.method1426(local1065.aClass51_985)) {
									local1065.aClass51_985 = local1247;
									Static82.method1438(local1065);
								}
								continue;
							}
							if (local218 == 1113) {
								local23--;
								local1065.anInt2848 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1114) {
								local23 -= 3;
								local1065.anInt2780 = Static52.anIntArray73[local23];
								local1065.anInt2837 = Static52.anIntArray73[local23 + 1];
								local1065.anInt2775 = Static52.anIntArray73[local23 + 2];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1115) {
								local23--;
								local1065.aBoolean115 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1116) {
								local23--;
								local1065.anInt2861 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1117) {
								local23--;
								local1065.anInt2824 = Static52.anIntArray73[local23];
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1118) {
								local23--;
								local1065.aBoolean114 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1119) {
								local23--;
								local1065.aBoolean124 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1120) {
								local23 -= 2;
								local1065.anInt2841 = Static52.anIntArray73[local23];
								local1065.anInt2813 = Static52.anIntArray73[local23 + 1];
								Static82.method1438(local1065);
								if (local1065.anInt2777 == 0) {
									Static180.method3046(false, local1065);
								}
								continue;
							}
							if (local218 == 1121) {
								local23 -= 2;
								Static82.method1438(local1065);
								continue;
							}
							if (local218 == 1122) {
								local23--;
								local1065.aBoolean123 = Static52.anIntArray73[local23] == 1;
								Static82.method1438(local1065);
								continue;
							}
						} else if (local218 >= 1200 && local218 < 1300 || !(local218 < 2200 || local218 >= 2300)) {
							if (local218 < 2000) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
							} else {
								local218 -= 1000;
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
							}
							Static82.method1438(local1065);
							if (local218 == 1200 || local218 == 1205) {
								local23 -= 2;
								local1115 = Static52.anIntArray73[local23 + 1];
								local784 = Static52.anIntArray73[local23];
								if (local784 == -1) {
									local1065.anInt2806 = -1;
									local1065.anInt2821 = 1;
									local1065.anInt2805 = -1;
								} else {
									local1065.anInt2823 = local1115;
									local1065.anInt2806 = local784;
									@Pc(10354) Class92 local10354 = Static36.method637(local784);
									local1065.anInt2827 = local10354.anInt3657;
									local1065.anInt2844 = local10354.anInt3668;
									local1065.anInt2822 = local10354.anInt3697;
									local1065.anInt2825 = local10354.anInt3675;
									if (local1065.anInt2839 > 0) {
										local1065.anInt2844 = local1065.anInt2844 * 32 / local1065.anInt2839;
									} else if (local1065.anInt2855 > 0) {
										local1065.anInt2844 = local1065.anInt2844 * 32 / local1065.anInt2855;
									}
									local1065.anInt2792 = local10354.anInt3680;
									local1065.anInt2776 = local10354.anInt3686;
									if (local218 == 1205) {
										local1065.aBoolean116 = false;
									} else {
										local1065.aBoolean116 = true;
									}
								}
								continue;
							}
							if (local218 == 1201) {
								local1065.anInt2821 = 2;
								local23--;
								local1065.anInt2805 = Static52.anIntArray73[local23];
								continue;
							}
							if (local218 == 1202) {
								local1065.anInt2821 = 3;
								local1065.anInt2805 = Static73.aClass5_Sub1_Sub1_1.aClass111_2.method3281();
								continue;
							}
							if (local218 == 1203) {
								local1065.anInt2821 = 6;
								local23--;
								local1065.anInt2805 = Static52.anIntArray73[local23];
								continue;
							}
							if (local218 == 1204) {
								local1065.anInt2821 = 5;
								local23--;
								local1065.anInt2805 = Static52.anIntArray73[local23];
								continue;
							}
						} else if ((local218 < 1300 || local218 >= 1400) && (local218 < 2300 || local218 >= 2400)) {
							if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
								if (local218 < 2000) {
									local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
								} else {
									local23--;
									local1065 = Static7.method102(Static52.anIntArray73[local23]);
									local218 -= 1000;
								}
								local32--;
								local1247 = Static58.aClass51Array9[local32];
								@Pc(1249) int[] local1249 = null;
								if (local1247.method1399() > 0 && local1247.method1408(local1247.method1399() - 1) == 89) {
									local23--;
									local624 = Static52.anIntArray73[local23];
									if (local624 > 0) {
										local1249 = new int[local624];
										while (local624-- > 0) {
											local23--;
											local1249[local624] = Static52.anIntArray73[local23];
										}
									}
									local1247 = local1247.method1433(0, local1247.method1399() - 1);
								}
								@Pc(1307) Object[] local1307 = new Object[local1247.method1399() + 1];
								for (local648 = local1307.length - 1; local648 >= 1; local648--) {
									if (local1247.method1408(local648 - 1) == 115) {
										local32--;
										local1307[local648] = Static58.aClass51Array9[local32];
									} else {
										local23--;
										local1307[local648] = Integer.valueOf(Static52.anIntArray73[local23]);
									}
								}
								local23--;
								local1350 = Static52.anIntArray73[local23];
								if (local1350 == -1) {
									local1307 = null;
								} else {
									local1307[0] = Integer.valueOf(local1350);
								}
								local1065.aBoolean113 = true;
								if (local218 == 1400) {
									local1065.anObjectArray13 = local1307;
								} else if (local218 == 1401) {
									local1065.anObjectArray2 = local1307;
								} else if (local218 == 1402) {
									local1065.anObjectArray11 = local1307;
								} else if (local218 == 1403) {
									local1065.anObjectArray18 = local1307;
								} else if (local218 == 1404) {
									local1065.anObjectArray31 = local1307;
								} else if (local218 == 1405) {
									local1065.anObjectArray27 = local1307;
								} else if (local218 == 1406) {
									local1065.anObjectArray28 = local1307;
								} else if (local218 == 1407) {
									local1065.anObjectArray9 = local1307;
									local1065.anIntArray185 = local1249;
								} else if (local218 == 1408) {
									local1065.anObjectArray17 = local1307;
								} else if (local218 == 1409) {
									local1065.anObjectArray30 = local1307;
								} else if (local218 == 1410) {
									local1065.anObjectArray12 = local1307;
								} else if (local218 == 1411) {
									local1065.anObjectArray8 = local1307;
								} else if (local218 == 1412) {
									local1065.anObjectArray25 = local1307;
								} else if (local218 == 1414) {
									local1065.anObjectArray29 = local1307;
									local1065.anIntArray178 = local1249;
								} else if (local218 == 1415) {
									local1065.anIntArray183 = local1249;
									local1065.anObjectArray3 = local1307;
								} else if (local218 == 1416) {
									local1065.anObjectArray20 = local1307;
								} else if (local218 == 1417) {
									local1065.anObjectArray24 = local1307;
								} else if (local218 == 1418) {
									local1065.anObjectArray4 = local1307;
								} else if (local218 == 1419) {
									local1065.anObjectArray10 = local1307;
								} else if (local218 == 1420) {
									local1065.anObjectArray26 = local1307;
								} else if (local218 == 1421) {
									local1065.anObjectArray21 = local1307;
								} else if (local218 == 1422) {
									local1065.anObjectArray7 = local1307;
								} else if (local218 == 1423) {
									local1065.anObjectArray6 = local1307;
								} else if (local218 == 1424) {
									local1065.anObjectArray14 = local1307;
								} else if (local218 == 1425) {
									local1065.anObjectArray22 = local1307;
								} else if (local218 == 1426) {
									local1065.anObjectArray19 = local1307;
								} else if (local218 == 1427) {
									local1065.anObjectArray23 = local1307;
								} else if (local218 == 1428) {
									local1065.anIntArray179 = local1249;
									local1065.anObjectArray16 = local1307;
								} else if (local218 == 1429) {
									local1065.anIntArray176 = local1249;
									local1065.anObjectArray5 = local1307;
								}
								continue;
							}
							if (local218 < 1600) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
								if (local218 == 1500) {
									Static52.anIntArray73[local23++] = local1065.anInt2858;
									continue;
								}
								if (local218 == 1501) {
									Static52.anIntArray73[local23++] = local1065.anInt2804;
									continue;
								}
								if (local218 == 1502) {
									Static52.anIntArray73[local23++] = local1065.anInt2802;
									continue;
								}
								if (local218 == 1503) {
									Static52.anIntArray73[local23++] = local1065.anInt2835;
									continue;
								}
								if (local218 == 1504) {
									Static52.anIntArray73[local23++] = local1065.aBoolean121 ? 1 : 0;
									continue;
								}
								if (local218 == 1505) {
									Static52.anIntArray73[local23++] = local1065.anInt2785;
									continue;
								}
							} else if (local218 < 1700) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
								if (local218 == 1600) {
									Static52.anIntArray73[local23++] = local1065.anInt2842;
									continue;
								}
								if (local218 == 1601) {
									Static52.anIntArray73[local23++] = local1065.anInt2779;
									continue;
								}
								if (local218 == 1602) {
									Static58.aClass51Array9[local32++] = local1065.aClass51_985;
									continue;
								}
								if (local218 == 1603) {
									Static52.anIntArray73[local23++] = local1065.anInt2841;
									continue;
								}
								if (local218 == 1604) {
									Static52.anIntArray73[local23++] = local1065.anInt2813;
									continue;
								}
								if (local218 == 1605) {
									Static52.anIntArray73[local23++] = local1065.anInt2844;
									continue;
								}
								if (local218 == 1606) {
									Static52.anIntArray73[local23++] = local1065.anInt2776;
									continue;
								}
								if (local218 == 1607) {
									Static52.anIntArray73[local23++] = local1065.anInt2827;
									continue;
								}
								if (local218 == 1608) {
									Static52.anIntArray73[local23++] = local1065.anInt2825;
									continue;
								}
								if (local218 == 1609) {
									Static52.anIntArray73[local23++] = local1065.anInt2810;
									continue;
								}
							} else if (local218 < 1800) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
								if (local218 == 1700) {
									Static52.anIntArray73[local23++] = local1065.anInt2806;
									continue;
								}
								if (local218 == 1701) {
									if (local1065.anInt2806 == -1) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = local1065.anInt2823;
									}
									continue;
								}
								if (local218 == 1702) {
									Static52.anIntArray73[local23++] = local1065.anInt2788;
									continue;
								}
							} else if (local218 < 1900) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
								if (local218 == 1800) {
									Static52.anIntArray73[local23++] = Static73.method1284(Static33.method587(local1065));
									continue;
								}
								if (local218 == 1801) {
									local23--;
									local784 = Static52.anIntArray73[local23];
									local784--;
									if (local1065.aClass51Array18 != null && local1065.aClass51Array18.length > local784 && local1065.aClass51Array18[local784] != null) {
										Static58.aClass51Array9[local32++] = local1065.aClass51Array18[local784];
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 1802) {
									if (local1065.aClass51_984 == null) {
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									} else {
										Static58.aClass51Array9[local32++] = local1065.aClass51_984;
									}
									continue;
								}
							} else if (local218 < 2600) {
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
								if (local218 == 2500) {
									Static52.anIntArray73[local23++] = local1065.anInt2858;
									continue;
								}
								if (local218 == 2501) {
									Static52.anIntArray73[local23++] = local1065.anInt2804;
									continue;
								}
								if (local218 == 2502) {
									Static52.anIntArray73[local23++] = local1065.anInt2802;
									continue;
								}
								if (local218 == 2503) {
									Static52.anIntArray73[local23++] = local1065.anInt2835;
									continue;
								}
								if (local218 == 2504) {
									Static52.anIntArray73[local23++] = local1065.aBoolean121 ? 1 : 0;
									continue;
								}
								if (local218 == 2505) {
									Static52.anIntArray73[local23++] = local1065.anInt2785;
									continue;
								}
							} else if (local218 < 2700) {
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
								if (local218 == 2600) {
									Static52.anIntArray73[local23++] = local1065.anInt2842;
									continue;
								}
								if (local218 == 2601) {
									Static52.anIntArray73[local23++] = local1065.anInt2779;
									continue;
								}
								if (local218 == 2602) {
									Static58.aClass51Array9[local32++] = local1065.aClass51_985;
									continue;
								}
								if (local218 == 2603) {
									Static52.anIntArray73[local23++] = local1065.anInt2841;
									continue;
								}
								if (local218 == 2604) {
									Static52.anIntArray73[local23++] = local1065.anInt2813;
									continue;
								}
								if (local218 == 2605) {
									Static52.anIntArray73[local23++] = local1065.anInt2844;
									continue;
								}
								if (local218 == 2606) {
									Static52.anIntArray73[local23++] = local1065.anInt2776;
									continue;
								}
								if (local218 == 2607) {
									Static52.anIntArray73[local23++] = local1065.anInt2827;
									continue;
								}
								if (local218 == 2608) {
									Static52.anIntArray73[local23++] = local1065.anInt2825;
									continue;
								}
								if (local218 == 2609) {
									Static52.anIntArray73[local23++] = local1065.anInt2810;
									continue;
								}
							} else if (local218 < 2800) {
								if (local218 == 2700) {
									local23--;
									local1065 = Static7.method102(Static52.anIntArray73[local23]);
									Static52.anIntArray73[local23++] = local1065.anInt2806;
									continue;
								}
								if (local218 == 2701) {
									local23--;
									local1065 = Static7.method102(Static52.anIntArray73[local23]);
									if (local1065.anInt2806 == -1) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = local1065.anInt2823;
									}
									continue;
								}
								if (local218 == 2702) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									@Pc(1993) Class1_Sub13 local1993 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local779);
									if (local1993 == null) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = 1;
									}
									continue;
								}
								if (local218 == 2703) {
									local23--;
									local1065 = Static7.method102(Static52.anIntArray73[local23]);
									if (local1065.aClass71Array2 == null) {
										Static52.anIntArray73[local23++] = 0;
										continue;
									}
									local784 = local1065.aClass71Array2.length;
									for (local1115 = 0; local1115 < local1065.aClass71Array2.length; local1115++) {
										if (local1065.aClass71Array2[local1115] == null) {
											local784 = local1115;
											break;
										}
									}
									Static52.anIntArray73[local23++] = local784;
									continue;
								}
								if (local218 == 2704 || local218 == 2705) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									@Pc(2089) Class1_Sub13 local2089 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local779);
									if (local2089 != null && local2089.anInt1677 == local784) {
										Static52.anIntArray73[local23++] = 1;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
							} else if (local218 < 2900) {
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
								if (local218 == 2800) {
									Static52.anIntArray73[local23++] = Static73.method1284(Static33.method587(local1065));
									continue;
								}
								if (local218 == 2801) {
									local23--;
									local784 = Static52.anIntArray73[local23];
									local784--;
									if (local1065.aClass51Array18 != null && local1065.aClass51Array18.length > local784 && local1065.aClass51Array18[local784] != null) {
										Static58.aClass51Array9[local32++] = local1065.aClass51Array18[local784];
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 2802) {
									if (local1065.aClass51_984 == null) {
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									} else {
										Static58.aClass51Array9[local32++] = local1065.aClass51_984;
									}
									continue;
								}
							} else if (local218 < 3200) {
								if (local218 == 3100) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static164.method2798(0, local582, Static136.aClass51_927);
									continue;
								}
								if (local218 == 3101) {
									local23 -= 2;
									Static17.method324(Static52.anIntArray73[local23 + 1], Static52.anIntArray73[local23], Static73.aClass5_Sub1_Sub1_1);
									continue;
								}
								if (local218 == 3103) {
									Static197.method1855();
									continue;
								}
								if (local218 == 3104) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local784 = 0;
									if (local582.method1417()) {
										local784 = local582.method1428();
									}
									Static167.aClass1_Sub16_Sub1_2.method3823(162);
									Static167.aClass1_Sub16_Sub1_2.method3808(local784);
									continue;
								}
								if (local218 == 3105) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static167.aClass1_Sub16_Sub1_2.method3823(229);
									Static167.aClass1_Sub16_Sub1_2.method3786(local582.method1388());
									continue;
								}
								if (local218 == 3106) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static167.aClass1_Sub16_Sub1_2.method3823(86);
									Static167.aClass1_Sub16_Sub1_2.method3765(local582.method1399() + 1);
									Static167.aClass1_Sub16_Sub1_2.method3810(local582);
									continue;
								}
								if (local218 == 3107) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									local32--;
									local1247 = Static58.aClass51Array9[local32];
									Static206.method3409(local1247, local779);
									continue;
								}
								if (local218 == 3108) {
									local23 -= 3;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									local1115 = Static52.anIntArray73[local23 + 2];
									local2293 = Static7.method102(local1115);
									method1259(local784, local779, local2293);
									continue;
								}
								if (local218 == 3109) {
									local23 -= 2;
									local2310 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									method1259(local784, local779, local2310);
									continue;
								}
								if (local218 == 3110) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static167.aClass1_Sub16_Sub1_2.method3823(123);
									Static167.aClass1_Sub16_Sub1_2.method3807(local779);
									continue;
								}
							} else if (local218 < 3300) {
								if (local218 == 3200) {
									local23 -= 3;
									Static218.method1758(Static52.anIntArray73[local23 + 2], Static52.anIntArray73[local23 + 1], Static52.anIntArray73[local23]);
									continue;
								}
								if (local218 == 3201) {
									local23--;
									Static183.method3091(Static52.anIntArray73[local23]);
									continue;
								}
								if (local218 == 3202) {
									local23 -= 2;
									method1255(Static52.anIntArray73[local23 + 1], Static52.anIntArray73[local23]);
									continue;
								}
							} else if (local218 < 3400) {
								if (local218 == 3300) {
									Static52.anIntArray73[local23++] = Static109.anInt2430;
									continue;
								}
								if (local218 == 3301) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = Static50.method863(local779, local784);
									continue;
								}
								if (local218 == 3302) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = Static19.method3355(local779, local784);
									continue;
								}
								if (local218 == 3303) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static161.method2718(local784, local779);
									continue;
								}
								if (local218 == 3304) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static7.method106(local779).anInt3852;
									continue;
								}
								if (local218 == 3305) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static44.anIntArray63[local779];
									continue;
								}
								if (local218 == 3306) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static218.anIntArray139[local779];
									continue;
								}
								if (local218 == 3307) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static207.anIntArray330[local779];
									continue;
								}
								if (local218 == 3308) {
									local779 = Static197.anInt2422;
									local784 = (Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7) + Static198.anInt4217;
									local1115 = Static118.anInt2541 + (Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7);
									Static52.anIntArray73[local23++] = local1115 + (local779 << 28) + (local784 << 14);
									continue;
								}
								if (local218 == 3309) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local779 >> 14 & 0x3FFF;
									continue;
								}
								if (local218 == 3310) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local779 >> 28;
									continue;
								}
								if (local218 == 3311) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local779 & 0x3FFF;
									continue;
								}
								if (local218 == 3312) {
									Static52.anIntArray73[local23++] = Static206.aBoolean199 ? 1 : 0;
									continue;
								}
								if (local218 == 3313) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23] + 32768;
									Static52.anIntArray73[local23++] = Static50.method863(local779, local784);
									continue;
								}
								if (local218 == 3314) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23] + 32768;
									Static52.anIntArray73[local23++] = Static19.method3355(local779, local784);
									continue;
								}
								if (local218 == 3315) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23] + 32768;
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = Static161.method2718(local784, local779);
									continue;
								}
								if (local218 == 3316) {
									if (Static24.anInt604 >= 2) {
										Static52.anIntArray73[local23++] = Static24.anInt604;
									} else {
										Static52.anIntArray73[local23++] = 0;
									}
									continue;
								}
								if (local218 == 3317) {
									Static52.anIntArray73[local23++] = Static90.anInt4704;
									continue;
								}
								if (local218 == 3318) {
									Static52.anIntArray73[local23++] = Static192.anInt4159;
									continue;
								}
								if (local218 == 3321) {
									Static52.anIntArray73[local23++] = Static186.anInt4029;
									continue;
								}
								if (local218 == 3322) {
									Static52.anIntArray73[local23++] = Static122.anInt2705;
									continue;
								}
								if (local218 == 3323) {
									if (Static23.anInt597 >= 5 && Static23.anInt597 <= 9) {
										Static52.anIntArray73[local23++] = 1;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3324) {
									if (Static23.anInt597 >= 5 && Static23.anInt597 <= 9) {
										Static52.anIntArray73[local23++] = Static23.anInt597;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3325) {
									if (Static106.anInt2351 <= 0) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = 1;
									}
									continue;
								}
								if (local218 == 3326) {
									Static52.anIntArray73[local23++] = Static73.aClass5_Sub1_Sub1_1.anInt1941;
									continue;
								}
								if (local218 == 3327) {
									Static52.anIntArray73[local23++] = Static73.aClass5_Sub1_Sub1_1.aClass111_2.aBoolean191 ? 1 : 0;
									continue;
								}
								if (local218 == 3328) {
									Static52.anIntArray73[local23++] = Static135.anInt3030;
									continue;
								}
								if (local218 == 3329) {
									Static52.anIntArray73[local23++] = Static97.anInt2132;
									continue;
								}
							} else if (local218 < 3500) {
								if (local218 == 3400) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									@Pc(2961) Class1_Sub2_Sub6 local2961 = Static19.method3354(local779);
									Static58.aClass51Array9[local32++] = local2961.method1183(local784);
									continue;
								}
								if (local218 == 3408) {
									local23 -= 4;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									local1115 = Static52.anIntArray73[local23 + 2];
									local624 = Static52.anIntArray73[local23 + 3];
									@Pc(3003) Class1_Sub2_Sub6 local3003 = Static19.method3354(local1115);
									if (local779 == local3003.anInt1552 && local784 == local3003.anInt1555) {
										if (local784 == 115) {
											Static58.aClass51Array9[local32++] = local3003.method1183(local624);
										} else {
											Static52.anIntArray73[local23++] = local3003.method1190(local624);
										}
										continue;
									}
									if (local784 == 115) {
										Static58.aClass51Array9[local32++] = Static93.aClass51_675;
									} else {
										Static52.anIntArray73[local23++] = 0;
									}
									continue;
								}
							} else if (local218 < 3700) {
								if (local218 == 3600) {
									if (Static128.anInt4776 == 0) {
										Static52.anIntArray73[local23++] = -2;
									} else if (Static128.anInt4776 == 1) {
										Static52.anIntArray73[local23++] = -1;
									} else {
										Static52.anIntArray73[local23++] = Static201.anInt4259;
									}
									continue;
								}
								if (local218 == 3601) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 == 2 && Static201.anInt4259 > local779) {
										Static58.aClass51Array9[local32++] = Static113.aClass51Array15[local779];
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 3602) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 == 2 && Static201.anInt4259 > local779) {
										Static52.anIntArray73[local23++] = Static144.anIntArray215[local779];
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3603) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 == 2 && local779 < Static201.anInt4259) {
										Static52.anIntArray73[local23++] = Static191.anIntArray312[local779];
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3604) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local23--;
									local784 = Static52.anIntArray73[local23];
									Static131.method2280(local784, local582);
									continue;
								}
								if (local218 == 3605) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static202.method3327(local582.method1388());
									continue;
								}
								if (local218 == 3606) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static51.method926(local582.method1388());
									continue;
								}
								if (local218 == 3607) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static60.method1057(local582.method1388());
									continue;
								}
								if (local218 == 3608) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static8.method114(local582.method1388());
									continue;
								}
								if (local218 == 3609) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									if (local582.method1393(Static155.aClass51_1208) || local582.method1393(Static3.aClass51_40)) {
										local582 = local582.method1394(7);
									}
									Static52.anIntArray73[local23++] = Static60.method1059(local582) ? 1 : 0;
									continue;
								}
								if (local218 == 3610) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 == 2 && local779 < Static201.anInt4259) {
										Static58.aClass51Array9[local32++] = Static33.aClass51Array6[local779];
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 3611) {
									if (Static157.aClass51_1213 == null) {
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									} else {
										Static58.aClass51Array9[local32++] = Static157.aClass51_1213.method1437();
									}
									continue;
								}
								if (local218 == 3612) {
									if (Static157.aClass51_1213 == null) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = Static111.anInt2458;
									}
									continue;
								}
								if (local218 == 3613) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static157.aClass51_1213 != null && local779 < Static111.anInt2458) {
										Static58.aClass51Array9[local32++] = Static176.aClass1_Sub17Array1[local779].aClass51_820.method1437();
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 3614) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static157.aClass51_1213 != null && local779 < Static111.anInt2458) {
										Static52.anIntArray73[local23++] = Static176.aClass1_Sub17Array1[local779].anInt2472;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3615) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static157.aClass51_1213 != null && local779 < Static111.anInt2458) {
										Static52.anIntArray73[local23++] = Static176.aClass1_Sub17Array1[local779].aByte6;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3616) {
									Static52.anIntArray73[local23++] = Static126.aByte7;
									continue;
								}
								if (local218 == 3617) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static222.method3649(local582);
									continue;
								}
								if (local218 == 3618) {
									Static52.anIntArray73[local23++] = Static72.aByte4;
									continue;
								}
								if (local218 == 3619) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static216.method3596(local582.method1388());
									continue;
								}
								if (local218 == 3620) {
									Static97.method1636();
									continue;
								}
								if (local218 == 3621) {
									if (Static128.anInt4776 == 0) {
										Static52.anIntArray73[local23++] = -1;
									} else {
										Static52.anIntArray73[local23++] = Static113.anInt2474;
									}
									continue;
								}
								if (local218 == 3622) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 != 0 && local779 < Static113.anInt2474) {
										Static58.aClass51Array9[local32++] = Static202.method3323(Static181.aLongArray11[local779]).method1437();
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 3623) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									if (local582.method1393(Static155.aClass51_1208) || local582.method1393(Static3.aClass51_40)) {
										local582 = local582.method1394(7);
									}
									Static52.anIntArray73[local23++] = Static91.method1527(local582) ? 1 : 0;
									continue;
								}
								if (local218 == 3624) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static176.aClass1_Sub17Array1 != null && Static111.anInt2458 > local779 && Static176.aClass1_Sub17Array1[local779].aClass51_820.method1401(Static73.aClass5_Sub1_Sub1_1.aClass51_619)) {
										Static52.anIntArray73[local23++] = 1;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3625) {
									if (Static107.aClass51_786 == null) {
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									} else {
										Static58.aClass51Array9[local32++] = Static107.aClass51_786.method1437();
									}
									continue;
								}
								if (local218 == 3626) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static157.aClass51_1213 != null && Static111.anInt2458 > local779) {
										Static58.aClass51Array9[local32++] = Static176.aClass1_Sub17Array1[local779].aClass51_819;
										continue;
									}
									Static58.aClass51Array9[local32++] = Static136.aClass51_927;
									continue;
								}
								if (local218 == 3627) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									if (Static128.anInt4776 == 2 && local779 >= 0 && local779 < Static201.anInt4259) {
										Static52.anIntArray73[local23++] = Static78.aBooleanArray12[local779] ? 1 : 0;
										continue;
									}
									Static52.anIntArray73[local23++] = 0;
									continue;
								}
								if (local218 == 3628) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									if (local582.method1393(Static155.aClass51_1208) || local582.method1393(Static3.aClass51_40)) {
										local582 = local582.method1394(7);
									}
									Static52.anIntArray73[local23++] = Static98.method1639(local582);
									continue;
								}
							} else if (local218 < 4000) {
								if (local218 == 3903) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].method2498();
									continue;
								}
								if (local218 == 3904) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].anInt3154;
									continue;
								}
								if (local218 == 3905) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].anInt3153;
									continue;
								}
								if (local218 == 3906) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].anInt3155;
									continue;
								}
								if (local218 == 3907) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].anInt3159;
									continue;
								}
								if (local218 == 3908) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static28.aClass80Array1[local779].anInt3156;
									continue;
								}
								if (local218 == 3910) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									local784 = Static28.aClass80Array1[local779].method2496();
									Static52.anIntArray73[local23++] = local784 == 0 ? 1 : 0;
									continue;
								}
								if (local218 == 3911) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									local784 = Static28.aClass80Array1[local779].method2496();
									Static52.anIntArray73[local23++] = local784 == 2 ? 1 : 0;
									continue;
								}
								if (local218 == 3912) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									local784 = Static28.aClass80Array1[local779].method2496();
									Static52.anIntArray73[local23++] = local784 == 5 ? 1 : 0;
									continue;
								}
								if (local218 == 3913) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									local784 = Static28.aClass80Array1[local779].method2496();
									Static52.anIntArray73[local23++] = local784 == 1 ? 1 : 0;
									continue;
								}
							} else if (local218 < 4100) {
								if (local218 == 4000) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 + local784;
									continue;
								}
								if (local218 == 4001) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 - local784;
									continue;
								}
								if (local218 == 4002) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local784 * local779;
									continue;
								}
								if (local218 == 4003) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local779 / local784;
									continue;
								}
								if (local218 == 4004) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = (int) ((double) local779 * Math.random());
									continue;
								}
								if (local218 == 4005) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = (int) (Math.random() * (double) (local779 + 1));
									continue;
								}
								if (local218 == 4006) {
									local23 -= 5;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									local1115 = Static52.anIntArray73[local23 + 2];
									local624 = Static52.anIntArray73[local23 + 3];
									local648 = Static52.anIntArray73[local23 + 4];
									Static52.anIntArray73[local23++] = local779 + (local784 - local779) * (local648 + -local1115) / (local624 - local1115);
									continue;
								}
								@Pc(8590) long local8590;
								@Pc(8595) long local8595;
								if (local218 == 4007) {
									local23 -= 2;
									local8590 = Static52.anIntArray73[local23 + 1];
									local8595 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = (int) (local8590 * local8595 / 100L + local8595);
									continue;
								}
								if (local218 == 4008) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 | 0x1 << local784;
									continue;
								}
								if (local218 == 4009) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 & -(0x1 << local784) - 1;
									continue;
								}
								if (local218 == 4010) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = (local779 & 0x1 << local784) == 0 ? 0 : 1;
									continue;
								}
								if (local218 == 4011) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 % local784;
									continue;
								}
								if (local218 == 4012) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									if (local779 == 0) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = (int) Math.pow((double) local779, (double) local784);
									}
									continue;
								}
								if (local218 == 4013) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									if (local779 == 0) {
										Static52.anIntArray73[local23++] = 0;
									} else if (local784 == 0) {
										Static52.anIntArray73[local23++] = Integer.MAX_VALUE;
									} else {
										Static52.anIntArray73[local23++] = (int) Math.pow((double) local779, 1.0D / (double) local784);
									}
									continue;
								}
								if (local218 == 4014) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local784 & local779;
									continue;
								}
								if (local218 == 4015) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 | local784;
									continue;
								}
								if (local218 == 4016) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23 + 1];
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local779 >= local784 ? local784 : local779;
									continue;
								}
								if (local218 == 4017) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local779 > local784 ? local779 : local784;
									continue;
								}
								if (local218 == 4018) {
									local23 -= 3;
									local8590 = Static52.anIntArray73[local23 + 1];
									@Pc(8922) long local8922 = (long) Static52.anIntArray73[local23 + 2];
									local8595 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = (int) (local8922 * local8595 / local8590);
									continue;
								}
							} else if (local218 >= 4200) {
								@Pc(3105) Class1_Sub2_Sub5 local3105;
								if (local218 < 4300) {
									if (local218 == 4200) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										Static58.aClass51Array9[local32++] = Static36.method637(local779).aClass51_1254;
										continue;
									}
									@Pc(7283) Class92 local7283;
									if (local218 == 4201) {
										local23 -= 2;
										local784 = Static52.anIntArray73[local23 + 1];
										local779 = Static52.anIntArray73[local23];
										local7283 = Static36.method637(local779);
										if (local784 >= 1 && local784 <= 5 && local7283.aClass51Array25[local784 - 1] != null) {
											Static58.aClass51Array9[local32++] = local7283.aClass51Array25[local784 - 1];
											continue;
										}
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
										continue;
									}
									if (local218 == 4202) {
										local23 -= 2;
										local784 = Static52.anIntArray73[local23 + 1];
										local779 = Static52.anIntArray73[local23];
										local7283 = Static36.method637(local779);
										if (local784 >= 1 && local784 <= 5 && local7283.aClass51Array26[local784 - 1] != null) {
											Static58.aClass51Array9[local32++] = local7283.aClass51Array26[local784 - 1];
											continue;
										}
										Static58.aClass51Array9[local32++] = Static136.aClass51_927;
										continue;
									}
									if (local218 == 4203) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										Static52.anIntArray73[local23++] = Static36.method637(local779).anInt3681;
										continue;
									}
									if (local218 == 4204) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										Static52.anIntArray73[local23++] = Static36.method637(local779).anInt3644 == 1 ? 1 : 0;
										continue;
									}
									@Pc(7428) Class92 local7428;
									if (local218 == 4205) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										local7428 = Static36.method637(local779);
										if (local7428.anInt3670 == -1 && local7428.anInt3650 >= 0) {
											Static52.anIntArray73[local23++] = local7428.anInt3650;
											continue;
										}
										Static52.anIntArray73[local23++] = local779;
										continue;
									}
									if (local218 == 4206) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										local7428 = Static36.method637(local779);
										if (local7428.anInt3670 >= 0 && local7428.anInt3650 >= 0) {
											Static52.anIntArray73[local23++] = local7428.anInt3650;
											continue;
										}
										Static52.anIntArray73[local23++] = local779;
										continue;
									}
									if (local218 == 4207) {
										local23--;
										local779 = Static52.anIntArray73[local23];
										Static52.anIntArray73[local23++] = Static36.method637(local779).aBoolean170 ? 1 : 0;
										continue;
									}
									if (local218 == 4208) {
										local23 -= 2;
										local779 = Static52.anIntArray73[local23];
										local784 = Static52.anIntArray73[local23 + 1];
										local3105 = Static8.method112(local784);
										if (local3105.method1078()) {
											Static58.aClass51Array9[local32++] = Static36.method637(local779).method2813(local784, local3105.aClass51_437);
										} else {
											Static52.anIntArray73[local23++] = Static36.method637(local779).method2803(local3105.anInt1423, local784);
										}
										continue;
									}
									if (local218 == 4210) {
										local23--;
										local784 = Static52.anIntArray73[local23];
										local32--;
										local582 = Static58.aClass51Array9[local32];
										Static165.method2804(local582, local784 == 1);
										Static52.anIntArray73[local23++] = Static53.anInt1241;
										continue;
									}
									if (local218 == 4211) {
										if (Static110.aShortArray13 != null && Static53.anInt1241 > Static174.anInt3860) {
											Static52.anIntArray73[local23++] = Static110.aShortArray13[Static174.anInt3860++] & 0xFFFF;
											continue;
										}
										Static52.anIntArray73[local23++] = -1;
										continue;
									}
									if (local218 == 4212) {
										Static174.anInt3860 = 0;
										continue;
									}
								} else if (local218 < 4400) {
									if (local218 == 4300) {
										local23 -= 2;
										local784 = Static52.anIntArray73[local23 + 1];
										local779 = Static52.anIntArray73[local23];
										local3105 = Static8.method112(local784);
										if (local3105.method1078()) {
											Static58.aClass51Array9[local32++] = Static168.method2871(local779).method601(local784, local3105.aClass51_437);
										} else {
											Static52.anIntArray73[local23++] = Static168.method2871(local779).method592(local3105.anInt1423, local784);
										}
										continue;
									}
								} else if (local218 >= 4500) {
									if (local218 < 4600) {
										if (local218 == 4500) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											local3105 = Static8.method112(local784);
											if (local3105.method1078()) {
												Static58.aClass51Array9[local32++] = Static104.method1766(local779).method1878(local784, local3105.aClass51_437);
											} else {
												Static52.anIntArray73[local23++] = Static104.method1766(local779).method1882(local784, local3105.anInt1423);
											}
											continue;
										}
									} else if (local218 < 5100) {
										if (local218 == 5000) {
											Static52.anIntArray73[local23++] = Static164.anInt3638;
											continue;
										}
										if (local218 == 5001) {
											local23 -= 3;
											Static164.anInt3638 = Static52.anIntArray73[local23];
											Static85.anInt1997 = Static52.anIntArray73[local23 + 1];
											Static105.anInt2332 = Static52.anIntArray73[local23 + 2];
											Static167.aClass1_Sub16_Sub1_2.method3823(172);
											Static167.aClass1_Sub16_Sub1_2.method3765(Static164.anInt3638);
											Static167.aClass1_Sub16_Sub1_2.method3765(Static85.anInt1997);
											Static167.aClass1_Sub16_Sub1_2.method3765(Static105.anInt2332);
											continue;
										}
										if (local218 == 5002) {
											local23 -= 2;
											local32--;
											local582 = Static58.aClass51Array9[local32];
											local1115 = Static52.anIntArray73[local23 + 1];
											local784 = Static52.anIntArray73[local23];
											Static167.aClass1_Sub16_Sub1_2.method3823(191);
											Static167.aClass1_Sub16_Sub1_2.method3786(local582.method1388());
											Static167.aClass1_Sub16_Sub1_2.method3765(local784 - 1);
											Static167.aClass1_Sub16_Sub1_2.method3765(local1115);
											continue;
										}
										if (local218 == 5003) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local1247 = null;
											if (local779 < 100) {
												local1247 = Static224.aClass51Array31[local779];
											}
											if (local1247 == null) {
												local1247 = Static136.aClass51_927;
											}
											Static58.aClass51Array9[local32++] = local1247;
											continue;
										}
										if (local218 == 5004) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local784 = -1;
											if (local779 < 100 && Static224.aClass51Array31[local779] != null) {
												local784 = Static84.anIntArray124[local779];
											}
											Static52.anIntArray73[local23++] = local784;
											continue;
										}
										if (local218 == 5005) {
											Static52.anIntArray73[local23++] = Static85.anInt1997;
											continue;
										}
										if (local218 == 5008) {
											local32--;
											local582 = Static58.aClass51Array9[local32];
											if (local582.method1393(Static92.aClass51_658)) {
												Static149.method2566(local582);
												continue;
											}
											if (Static24.anInt604 == 0 && (Static135.anInt3030 == 1 || Static97.anInt2132 == 1)) {
												continue;
											}
											local1247 = local582.method1430();
											@Pc(3418) byte local3418 = 0;
											if (local1247.method1393(Static183.aClass51_1371)) {
												local3418 = 0;
												local582 = local582.method1394(Static183.aClass51_1371.method1399());
											} else if (local1247.method1393(Static42.aClass51_1652)) {
												local582 = local582.method1394(Static42.aClass51_1652.method1399());
												local3418 = 1;
											} else if (local1247.method1393(Static115.aClass51_852)) {
												local3418 = 2;
												local582 = local582.method1394(Static115.aClass51_852.method1399());
											} else if (local1247.method1393(Static42.aClass51_1654)) {
												local3418 = 3;
												local582 = local582.method1394(Static42.aClass51_1654.method1399());
											} else if (local1247.method1393(Static58.aClass51_418)) {
												local3418 = 4;
												local582 = local582.method1394(Static58.aClass51_418.method1399());
											} else if (local1247.method1393(Static70.aClass51_543)) {
												local3418 = 5;
												local582 = local582.method1394(Static70.aClass51_543.method1399());
											} else if (local1247.method1393(Static128.aClass51_1644)) {
												local3418 = 6;
												local582 = local582.method1394(Static128.aClass51_1644.method1399());
											} else if (local1247.method1393(Static33.aClass51_223)) {
												local582 = local582.method1394(Static33.aClass51_223.method1399());
												local3418 = 7;
											} else if (local1247.method1393(Static136.aClass51_925)) {
												local3418 = 8;
												local582 = local582.method1394(Static136.aClass51_925.method1399());
											} else if (local1247.method1393(Static8.aClass51_55)) {
												local582 = local582.method1394(Static8.aClass51_55.method1399());
												local3418 = 9;
											} else if (local1247.method1393(Static137.aClass51_1080)) {
												local3418 = 10;
												local582 = local582.method1394(Static137.aClass51_1080.method1399());
											} else if (local1247.method1393(Static210.aClass51_1557)) {
												local582 = local582.method1394(Static210.aClass51_1557.method1399());
												local3418 = 11;
											} else if (Static179.anInt3919 != 0) {
												if (local1247.method1393(Static183.aClass51_1373)) {
													local3418 = 0;
													local582 = local582.method1394(Static183.aClass51_1373.method1399());
												} else if (local1247.method1393(Static42.aClass51_1656)) {
													local3418 = 1;
													local582 = local582.method1394(Static42.aClass51_1656.method1399());
												} else if (local1247.method1393(Static115.aClass51_851)) {
													local582 = local582.method1394(Static115.aClass51_851.method1399());
													local3418 = 2;
												} else if (local1247.method1393(Static42.aClass51_1651)) {
													local3418 = 3;
													local582 = local582.method1394(Static42.aClass51_1651.method1399());
												} else if (local1247.method1393(Static58.aClass51_417)) {
													local582 = local582.method1394(Static58.aClass51_417.method1399());
													local3418 = 4;
												} else if (local1247.method1393(Static70.aClass51_541)) {
													local582 = local582.method1394(Static70.aClass51_541.method1399());
													local3418 = 5;
												} else if (local1247.method1393(Static128.aClass51_1643)) {
													local3418 = 6;
													local582 = local582.method1394(Static128.aClass51_1643.method1399());
												} else if (local1247.method1393(Static33.aClass51_221)) {
													local3418 = 7;
													local582 = local582.method1394(Static33.aClass51_221.method1399());
												} else if (local1247.method1393(Static136.aClass51_928)) {
													local3418 = 8;
													local582 = local582.method1394(Static136.aClass51_928.method1399());
												} else if (local1247.method1393(Static8.aClass51_54)) {
													local582 = local582.method1394(Static8.aClass51_54.method1399());
													local3418 = 9;
												} else if (local1247.method1393(Static137.aClass51_1084)) {
													local582 = local582.method1394(Static137.aClass51_1084.method1399());
													local3418 = 10;
												} else if (local1247.method1393(Static210.aClass51_1556)) {
													local3418 = 11;
													local582 = local582.method1394(Static210.aClass51_1556.method1399());
												}
											}
											@Pc(3804) byte local3804 = 0;
											local1247 = local582.method1430();
											if (local1247.method1393(Static203.aClass51_1447)) {
												local3804 = 1;
												local582 = local582.method1394(Static203.aClass51_1447.method1399());
											} else if (local1247.method1393(Static177.aClass51_1332)) {
												local3804 = 2;
												local582 = local582.method1394(Static177.aClass51_1332.method1399());
											} else if (local1247.method1393(Static129.aClass51_1020)) {
												local3804 = 3;
												local582 = local582.method1394(Static129.aClass51_1020.method1399());
											} else if (local1247.method1393(Static36.aClass51_242)) {
												local582 = local582.method1394(Static36.aClass51_242.method1399());
												local3804 = 4;
											} else if (local1247.method1393(Static111.aClass51_803)) {
												local582 = local582.method1394(Static111.aClass51_803.method1399());
												local3804 = 5;
											} else if (Static179.anInt3919 != 0) {
												if (local1247.method1393(Static203.aClass51_1449)) {
													local3804 = 1;
													local582 = local582.method1394(Static203.aClass51_1449.method1399());
												} else if (local1247.method1393(Static177.aClass51_1334)) {
													local582 = local582.method1394(Static177.aClass51_1334.method1399());
													local3804 = 2;
												} else if (local1247.method1393(Static129.aClass51_1014)) {
													local582 = local582.method1394(Static129.aClass51_1014.method1399());
													local3804 = 3;
												} else if (local1247.method1393(Static36.aClass51_241)) {
													local3804 = 4;
													local582 = local582.method1394(Static36.aClass51_241.method1399());
												} else if (local1247.method1393(Static111.aClass51_806)) {
													local582 = local582.method1394(Static111.aClass51_806.method1399());
													local3804 = 5;
												}
											}
											Static167.aClass1_Sub16_Sub1_2.method3823(169);
											Static167.aClass1_Sub16_Sub1_2.method3765(0);
											local648 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
											Static167.aClass1_Sub16_Sub1_2.method3765(local3418);
											Static167.aClass1_Sub16_Sub1_2.method3765(local3804);
											Static82.method1397(Static167.aClass1_Sub16_Sub1_2, local582);
											Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local648);
											continue;
										}
										if (local218 == 5009) {
											local32 -= 2;
											local582 = Static58.aClass51Array9[local32];
											local1247 = Static58.aClass51Array9[local32 + 1];
											if (Static24.anInt604 != 0 || Static135.anInt3030 != 1 && Static97.anInt2132 != 1) {
												Static167.aClass1_Sub16_Sub1_2.method3823(121);
												Static167.aClass1_Sub16_Sub1_2.method3765(0);
												local1115 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
												Static167.aClass1_Sub16_Sub1_2.method3786(local582.method1388());
												Static82.method1397(Static167.aClass1_Sub16_Sub1_2, local1247);
												Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local1115);
											}
											continue;
										}
										if (local218 == 5010) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local1247 = null;
											if (local779 < 100) {
												local1247 = Static206.aClass51Array28[local779];
											}
											if (local1247 == null) {
												local1247 = Static136.aClass51_927;
											}
											Static58.aClass51Array9[local32++] = local1247;
											continue;
										}
										if (local218 == 5011) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local1247 = null;
											if (local779 < 100) {
												local1247 = Static135.aClass51Array22[local779];
											}
											if (local1247 == null) {
												local1247 = Static136.aClass51_927;
											}
											Static58.aClass51Array9[local32++] = local1247;
											continue;
										}
										if (local218 == 5012) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local784 = -1;
											if (local779 < 100) {
												local784 = Static44.anIntArray62[local779];
											}
											Static52.anIntArray73[local23++] = local784;
											continue;
										}
										if (local218 == 5015) {
											if (Static73.aClass5_Sub1_Sub1_1 == null || Static73.aClass5_Sub1_Sub1_1.aClass51_619 == null) {
												local582 = Static81.aClass51_605;
											} else {
												local582 = Static73.aClass5_Sub1_Sub1_1.aClass51_619;
											}
											Static58.aClass51Array9[local32++] = local582;
											continue;
										}
										if (local218 == 5016) {
											Static52.anIntArray73[local23++] = Static105.anInt2332;
											continue;
										}
										if (local218 == 5017) {
											Static52.anIntArray73[local23++] = Static93.anInt2061;
											continue;
										}
										if (local218 == 5050) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											Static58.aClass51Array9[local32++] = Static180.method3040(local779).aClass51_1414;
											continue;
										}
										@Pc(4223) Class1_Sub2_Sub17 local4223;
										if (local218 == 5051) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local4223 = Static180.method3040(local779);
											if (local4223.anIntArray311 == null) {
												Static52.anIntArray73[local23++] = 0;
											} else {
												Static52.anIntArray73[local23++] = local4223.anIntArray311.length;
											}
											continue;
										}
										if (local218 == 5052) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											@Pc(4262) Class1_Sub2_Sub17 local4262 = Static180.method3040(local779);
											local624 = local4262.anIntArray311[local784];
											Static52.anIntArray73[local23++] = local624;
											continue;
										}
										if (local218 == 5053) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											local4223 = Static180.method3040(local779);
											if (local4223.anIntArray309 == null) {
												Static52.anIntArray73[local23++] = 0;
											} else {
												Static52.anIntArray73[local23++] = local4223.anIntArray309.length;
											}
											continue;
										}
										if (local218 == 5054) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											Static52.anIntArray73[local23++] = Static180.method3040(local779).anIntArray309[local784];
											continue;
										}
										if (local218 == 5055) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											Static58.aClass51Array9[local32++] = Static84.method1464(local779).method2272();
											continue;
										}
										if (local218 == 5056) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											@Pc(4366) Class1_Sub2_Sub13 local4366 = Static84.method1464(local779);
											if (local4366.anIntArray191 == null) {
												Static52.anIntArray73[local23++] = 0;
											} else {
												Static52.anIntArray73[local23++] = local4366.anIntArray191.length;
											}
											continue;
										}
										if (local218 == 5057) {
											local23 -= 2;
											local784 = Static52.anIntArray73[local23 + 1];
											local779 = Static52.anIntArray73[local23];
											Static52.anIntArray73[local23++] = Static84.method1464(local779).anIntArray191[local784];
											continue;
										}
										if (local218 == 5058) {
											Static3.aClass8_1 = new Class8();
											local23--;
											Static3.aClass8_1.anInt171 = Static52.anIntArray73[local23];
											Static3.aClass8_1.aClass1_Sub2_Sub13_1 = Static84.method1464(Static3.aClass8_1.anInt171);
											Static3.aClass8_1.anIntArray11 = new int[Static3.aClass8_1.aClass1_Sub2_Sub13_1.method2276()];
											continue;
										}
										if (local218 == 5059) {
											Static167.aClass1_Sub16_Sub1_2.method3823(242);
											Static167.aClass1_Sub16_Sub1_2.method3765(0);
											local779 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
											Static167.aClass1_Sub16_Sub1_2.method3765(0);
											Static167.aClass1_Sub16_Sub1_2.method3807(Static3.aClass8_1.anInt171);
											Static3.aClass8_1.aClass1_Sub2_Sub13_1.method2281(Static167.aClass1_Sub16_Sub1_2, Static3.aClass8_1.anIntArray11);
											Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local779);
											continue;
										}
										if (local218 == 5060) {
											local32--;
											local582 = Static58.aClass51Array9[local32];
											Static167.aClass1_Sub16_Sub1_2.method3823(134);
											Static167.aClass1_Sub16_Sub1_2.method3765(0);
											local784 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
											Static167.aClass1_Sub16_Sub1_2.method3786(local582.method1388());
											Static167.aClass1_Sub16_Sub1_2.method3807(Static3.aClass8_1.anInt171);
											Static3.aClass8_1.aClass1_Sub2_Sub13_1.method2281(Static167.aClass1_Sub16_Sub1_2, Static3.aClass8_1.anIntArray11);
											Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local784);
											continue;
										}
										if (local218 == 5061) {
											Static167.aClass1_Sub16_Sub1_2.method3823(242);
											Static167.aClass1_Sub16_Sub1_2.method3765(0);
											local779 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
											Static167.aClass1_Sub16_Sub1_2.method3765(1);
											Static167.aClass1_Sub16_Sub1_2.method3807(Static3.aClass8_1.anInt171);
											Static3.aClass8_1.aClass1_Sub2_Sub13_1.method2281(Static167.aClass1_Sub16_Sub1_2, Static3.aClass8_1.anIntArray11);
											Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local779);
											continue;
										}
										if (local218 == 5062) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											Static52.anIntArray73[local23++] = Static180.method3040(local779).anIntArray310[local784];
											continue;
										}
										if (local218 == 5063) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											Static52.anIntArray73[local23++] = Static180.method3040(local779).anIntArray308[local784];
											continue;
										}
										if (local218 == 5064) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											if (local784 == -1) {
												Static52.anIntArray73[local23++] = -1;
											} else {
												Static52.anIntArray73[local23++] = Static180.method3040(local779).method3186(local784);
											}
											continue;
										}
										if (local218 == 5065) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											if (local784 == -1) {
												Static52.anIntArray73[local23++] = -1;
											} else {
												Static52.anIntArray73[local23++] = Static180.method3040(local779).method3189(local784);
											}
											continue;
										}
										if (local218 == 5066) {
											local23--;
											local779 = Static52.anIntArray73[local23];
											Static52.anIntArray73[local23++] = Static84.method1464(local779).method2276();
											continue;
										}
										if (local218 == 5067) {
											local23 -= 2;
											local784 = Static52.anIntArray73[local23 + 1];
											local779 = Static52.anIntArray73[local23];
											local1115 = Static84.method1464(local779).method2279(local784);
											Static52.anIntArray73[local23++] = local1115;
											continue;
										}
										if (local218 == 5068) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											Static3.aClass8_1.anIntArray11[local779] = local784;
											continue;
										}
										if (local218 == 5069) {
											local23 -= 2;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											Static3.aClass8_1.anIntArray11[local779] = local784;
											continue;
										}
										if (local218 == 5070) {
											local23 -= 3;
											local779 = Static52.anIntArray73[local23];
											local784 = Static52.anIntArray73[local23 + 1];
											local1115 = Static52.anIntArray73[local23 + 2];
											@Pc(4830) Class1_Sub2_Sub13 local4830 = Static84.method1464(local779);
											if (local4830.method2279(local784) != 0) {
												throw new RuntimeException("bad command");
											}
											Static52.anIntArray73[local23++] = local4830.method2277(local1115, local784);
											continue;
										}
									} else if (local218 < 5200) {
										if (local218 == 5100) {
											if (Static208.aBooleanArray25[86]) {
												Static52.anIntArray73[local23++] = 1;
											} else {
												Static52.anIntArray73[local23++] = 0;
											}
											continue;
										}
										if (local218 == 5101) {
											if (Static208.aBooleanArray25[82]) {
												Static52.anIntArray73[local23++] = 1;
											} else {
												Static52.anIntArray73[local23++] = 0;
											}
											continue;
										}
										if (local218 == 5102) {
											if (Static208.aBooleanArray25[81]) {
												Static52.anIntArray73[local23++] = 1;
											} else {
												Static52.anIntArray73[local23++] = 0;
											}
											continue;
										}
									} else if (local218 < 5300) {
										if (local218 == 5200) {
											local23--;
											Static191.method3194(Static52.anIntArray73[local23]);
											continue;
										}
										if (local218 == 5201) {
											Static52.anIntArray73[local23++] = Static41.method722();
											continue;
										}
										if (local218 == 5202) {
											local23--;
											Static128.method3728(Static52.anIntArray73[local23]);
											continue;
										}
										if (local218 == 5203) {
											local32--;
											Static44.method788(Static58.aClass51Array9[local32]);
											continue;
										}
										if (local218 == 5204) {
											Static58.aClass51Array9[local32 - 1] = Static108.method1837(Static58.aClass51Array9[local32 - 1]);
											continue;
										}
										if (local218 == 5205) {
											local32--;
											Static92.method1532(Static58.aClass51Array9[local32]);
											continue;
										}
									} else if (local218 >= 5400) {
										if (local218 < 5500) {
											if (local218 == 5400) {
												local32 -= 2;
												local582 = Static58.aClass51Array9[local32];
												local23--;
												local1115 = Static52.anIntArray73[local23];
												local1247 = Static58.aClass51Array9[local32 + 1];
												Static167.aClass1_Sub16_Sub1_2.method3823(206);
												Static167.aClass1_Sub16_Sub1_2.method3765(Static7.method104(local582) + Static7.method104(local1247) + 1);
												Static167.aClass1_Sub16_Sub1_2.method3810(local582);
												Static167.aClass1_Sub16_Sub1_2.method3810(local1247);
												Static167.aClass1_Sub16_Sub1_2.method3765(local1115);
												continue;
											}
											if (local218 == 5401) {
												local23 -= 2;
												Static86.aShortArray20[Static52.anIntArray73[local23]] = (short) Static205.method3384(Static52.anIntArray73[local23 + 1]);
												Static186.method3108();
												Static136.method2046();
												Static124.method3506();
												Static227.method3743();
												Static198.method3277();
												continue;
											}
											if (local218 == 5402) {
												local32 -= 2;
												Static81.aClass51_605 = Static58.aClass51Array9[local32];
												Static81.aClass51_606 = Static58.aClass51Array9[local32 + 1];
												if (Static47.anInt1142 != 10) {
													continue;
												}
												if (!Static81.aClass51_605.method1426(Static136.aClass51_927) && !Static81.aClass51_606.method1426(Static136.aClass51_927)) {
													Static142.method2482(20);
													continue;
												}
												Static77.anInt1721 = 3;
												continue;
											}
											if (local218 == 5403) {
												Static52.anIntArray73[local23++] = Static77.anInt1721;
												continue;
											}
											if (local218 == 5404) {
												Static52.anIntArray73[local23++] = Static194.anInt4190 / 60;
												continue;
											}
											if (local218 == 5405) {
												local23 -= 2;
												local779 = Static52.anIntArray73[local23];
												local784 = Static52.anIntArray73[local23 + 1];
												if (local779 >= 0 && local779 < 2) {
													Static11.anIntArrayArrayArray1[local779] = new int[local784 << 1][4];
												}
												continue;
											}
											if (local218 == 5406) {
												local23 -= 7;
												local784 = Static52.anIntArray73[local23 + 1] << 1;
												local779 = Static52.anIntArray73[local23];
												local624 = Static52.anIntArray73[local23 + 3];
												local648 = Static52.anIntArray73[local23 + 4];
												@Pc(6620) int local6620 = Static52.anIntArray73[local23 + 6];
												local1115 = Static52.anIntArray73[local23 + 2];
												local1350 = Static52.anIntArray73[local23 + 5];
												if (local779 >= 0 && local779 < 2 && Static11.anIntArrayArrayArray1[local779] != null && local784 >= 0 && Static11.anIntArrayArrayArray1[local779].length > local784) {
													Static11.anIntArrayArrayArray1[local779][local784] = new int[] { (local1115 >> 14 & 0x3FFF) * 128, local624, (local1115 & 0x3FFF) * 128, local6620 };
													Static11.anIntArrayArrayArray1[local779][local784 + 1] = new int[] { (local648 >> 14 & 0x3FFF) * 128, local1350, (local648 & 0x3FFF) * 128 };
												}
												continue;
											}
											if (local218 == 5407) {
												local23--;
												local779 = Static11.anIntArrayArrayArray1[Static52.anIntArray73[local23]].length >> 1;
												Static52.anIntArray73[local23++] = local779;
												continue;
											}
											if (local218 == 5408) {
												Static52.anIntArray73[local23++] = 0;
												continue;
											}
											if (local218 == 5409) {
												Static98.method1641();
												continue;
											}
											if (local218 == 5411) {
												if (Static95.aFrame1 == null) {
													Static111.method1880(Static167.method2865(), false);
												} else {
													System.exit(0);
												}
												continue;
											}
											if (local218 == 5412) {
												local23 -= 4;
												if (Static37.anInt889 == 0) {
													Static127.method2215(Static52.anIntArray73[local23 + 2], Static52.anIntArray73[local23], Static52.anIntArray73[local23 + 1], Static52.anIntArray73[local23 + 3]);
												}
												continue;
											}
											if (local218 == 5413) {
												Static52.anIntArray73[local23++] = Static201.anInt4264;
												continue;
											}
											if (local218 == 5414) {
												local32--;
												if (Static37.anInt889 == 0) {
													Static16.method297(Static58.aClass51Array9[local32].method1388());
												}
												continue;
											}
											if (local218 == 5415) {
												Static52.anIntArray73[local23++] = Static128.anInt4777;
												continue;
											}
											if (local218 == 5416) {
												local23 -= 4;
												local32 -= 2;
												if (Static37.anInt889 == 0) {
													Static179.method3038(Static52.anIntArray73[local23], Static58.aClass51Array9[local32 + 1], Static52.anIntArray73[local23 + 3], Static52.anIntArray73[local23 + 2], Static58.aClass51Array9[local32].method1388(), Static52.anIntArray73[local23 + 1]);
												}
												continue;
											}
											if (local218 == 5417) {
												Static52.anIntArray73[local23++] = Static107.anInt2390;
												continue;
											}
											if (local218 == 5418) {
												for (local779 = 0; local779 < 5; local779++) {
													Static58.aClass51Array9[local32++] = Static197.aClass51Array14.length > local779 ? Static197.aClass51Array14[local779] : Static136.aClass51_927;
												}
												Static197.aClass51Array14 = null;
												continue;
											}
											if (local218 == 5419) {
												local582 = Static136.aClass51_927;
												if (Static22.aClass38_2 != null) {
													local582 = Static104.method1770(Static22.aClass38_2.anInt1235);
													try {
														if (Static22.aClass38_2.anObject3 != null) {
															@Pc(6962) byte[] local6962 = ((String) Static22.aClass38_2.anObject3).getBytes("ISO-8859-1");
															local582 = Static191.method3197(local6962.length, 0, local6962);
														}
													} catch (@Pc(6971) UnsupportedEncodingException local6971) {
													}
												}
												Static58.aClass51Array9[local32++] = local582;
												continue;
											}
											if (local218 == 5420) {
												Static52.anIntArray73[local23++] = Static24.anInt606 == 2 ? 1 : 0;
												continue;
											}
											if (local218 == 5421) {
												local32--;
												local582 = Static58.aClass51Array9[local32];
												local23--;
												local5186 = Static52.anIntArray73[local23] == 1;
												Static111.method1880(Static150.method2574(new Class51[] { Static167.method2865(), local582 }), local5186);
												continue;
											}
										} else if (local218 < 5600) {
											if (local218 == 5500) {
												local23 -= 4;
												local1115 = Static52.anIntArray73[local23 + 2];
												local784 = Static52.anIntArray73[local23 + 1];
												local624 = Static52.anIntArray73[local23 + 3];
												local779 = Static52.anIntArray73[local23];
												Static138.method2456((local779 >> 14 & 0x3FFF) - Static198.anInt4217, local624, (local779 & 0x3FFF) - Static118.anInt2541, local784, false, local1115);
												continue;
											}
											if (local218 == 5501) {
												local23 -= 4;
												local784 = Static52.anIntArray73[local23 + 1];
												local779 = Static52.anIntArray73[local23];
												local1115 = Static52.anIntArray73[local23 + 2];
												local624 = Static52.anIntArray73[local23 + 3];
												Static92.method1531((local779 & 0x3FFF) - Static118.anInt2541, -Static198.anInt4217 + (local779 >> 14 & 0x3FFF), local624, local1115, local784);
												continue;
											}
											if (local218 == 5502) {
												local23 -= 6;
												local779 = Static52.anIntArray73[local23];
												if (local779 >= 2) {
													throw new RuntimeException();
												}
												Static161.anInt3480 = local779;
												local784 = Static52.anIntArray73[local23 + 1];
												if (Static11.anIntArrayArrayArray1[Static161.anInt3480].length >> 1 <= local784 + 1) {
													throw new RuntimeException();
												}
												Static110.anInt1392 = local784;
												Static41.anInt971 = 0;
												Static34.anInt805 = Static52.anIntArray73[local23 + 2];
												Static36.anInt873 = Static52.anIntArray73[local23 + 3];
												local1115 = Static52.anIntArray73[local23 + 4];
												if (local1115 >= 2) {
													throw new RuntimeException();
												}
												Static164.anInt3637 = local1115;
												local624 = Static52.anIntArray73[local23 + 5];
												if (local624 + 1 >= Static11.anIntArrayArrayArray1[Static164.anInt3637].length >> 1) {
													throw new RuntimeException();
												}
												Static70.anInt1624 = 3;
												Static18.anInt454 = local624;
												continue;
											}
											if (local218 == 5503) {
												Static24.method482();
												continue;
											}
										} else if (local218 < 6100) {
											if (local218 == 6001) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 1) {
													local779 = 1;
												}
												if (local779 > 4) {
													local779 = 4;
												}
												Static42.anInt4800 = local779;
												if (Static42.anInt4800 == 1) {
													Static171.method2955(0.9F);
												}
												if (Static42.anInt4800 == 2) {
													Static171.method2955(0.8F);
												}
												if (Static42.anInt4800 == 3) {
													Static171.method2955(0.7F);
												}
												if (Static42.anInt4800 == 4) {
													Static171.method2955(0.6F);
												}
												Static136.method2046();
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											@Pc(5608) byte local5608;
											if (local218 == 6002) {
												local23--;
												Static107.method1834(Static52.anIntArray73[local23] == 1);
												Static76.method1307();
												Static155.method2673();
												if (Static112.method1883() && Static51.aBoolean60) {
													local5608 = (byte) (Static10.anInt217 - 4 & 0xFF);
													if (Static202.aByteArrayArrayArray13 == null) {
														Static202.aByteArrayArrayArray13 = new byte[4][104][104];
													}
													for (local784 = 0; local784 < 4; local784++) {
														for (local1115 = 0; local1115 < 104; local1115++) {
															for (local624 = 0; local624 < 104; local624++) {
																Static202.aByteArrayArrayArray13[local784][local1115][local624] = local5608;
															}
														}
													}
												}
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6003) {
												local23--;
												Static51.aBoolean60 = Static52.anIntArray73[local23] == 1;
												if (Static112.method1883() && Static51.aBoolean60) {
													if (Static202.aByteArrayArrayArray13 == null) {
														Static202.aByteArrayArrayArray13 = new byte[4][104][104];
													}
													local5608 = (byte) (Static10.anInt217 - 4 & 0xFF);
													for (local784 = 0; local784 < 4; local784++) {
														for (local1115 = 0; local1115 < 104; local1115++) {
															for (local624 = 0; local624 < 104; local624++) {
																Static202.aByteArrayArrayArray13[local784][local1115][local624] = local5608;
															}
														}
													}
												}
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6005) {
												local23--;
												Static107.aBoolean98 = Static52.anIntArray73[local23] == 1;
												Static155.method2673();
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6006) {
												local23--;
												Static18.aBoolean17 = Static52.anIntArray73[local23] == 1;
												((Class9) Static171.anInterface3_2).method134(!Static18.aBoolean17);
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6007) {
												local23--;
												Static6.aBoolean6 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6008) {
												local23--;
												Static184.aBoolean185 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6009) {
												local23--;
												Static103.aBoolean214 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6010) {
												local23--;
												Static21.aBoolean22 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6011) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 0 || local779 > 2) {
													local779 = 0;
												}
												Static16.anInt387 = local779;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6012) {
												local23--;
												Static142.aBoolean140 = Static52.anIntArray73[local23] == 1;
												if (Static42.anInt4800 == 1) {
													Static171.method2955(0.9F);
												}
												if (Static42.anInt4800 == 2) {
													Static171.method2955(0.8F);
												}
												if (Static42.anInt4800 == 3) {
													Static171.method2955(0.7F);
												}
												if (Static42.anInt4800 == 4) {
													Static171.method2955(0.6F);
												}
												Static155.method2673();
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6014) {
												local23--;
												Static19.aBoolean195 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6015) {
												local23--;
												Static68.aBoolean73 = Static52.anIntArray73[local23] == 1;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6016) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 0 || local779 > 2) {
													local779 = 0;
												}
												Static161.anInt3478 = local779;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6017) {
												local23--;
												Static18.aBoolean16 = Static52.anIntArray73[local23] == 1;
												Static111.method1876();
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6018) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 0) {
													local779 = 0;
												}
												if (local779 > 127) {
													local779 = 127;
												}
												Static84.anInt1961 = local779;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6019) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 0) {
													local779 = 0;
												}
												if (local779 > 255) {
													local779 = 255;
												}
												if (Static155.anInt3424 != local779) {
													if (Static155.anInt3424 == 0 && Static69.anInt1577 != -1) {
														Static65.method1115(local779, Static8.aClass70_Sub1_3, Static69.anInt1577);
														Static178.aBoolean183 = false;
													} else if (local779 == 0) {
														Static54.method941();
														Static178.aBoolean183 = false;
													} else {
														Static1.method57(local779);
													}
													Static155.anInt3424 = local779;
												}
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6020) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												if (local779 < 0) {
													local779 = 0;
												}
												if (local779 > 127) {
													local779 = 127;
												}
												Static123.anInt2717 = local779;
												Static203.method3257(Static51.aClass72_3);
												Static151.aBoolean158 = false;
												continue;
											}
											if (local218 == 6021) {
												local23--;
												Static113.aBoolean99 = Static52.anIntArray73[local23] == 1;
												continue;
											}
										} else if (local218 < 6200) {
											if (local218 == 6101) {
												Static52.anIntArray73[local23++] = Static42.anInt4800;
												continue;
											}
											if (local218 == 6102) {
												Static52.anIntArray73[local23++] = Static112.method1883() ? 1 : 0;
												continue;
											}
											if (local218 == 6103) {
												Static52.anIntArray73[local23++] = Static51.aBoolean60 ? 1 : 0;
												continue;
											}
											if (local218 == 6105) {
												Static52.anIntArray73[local23++] = Static107.aBoolean98 ? 1 : 0;
												continue;
											}
											if (local218 == 6106) {
												Static52.anIntArray73[local23++] = Static18.aBoolean17 ? 1 : 0;
												continue;
											}
											if (local218 == 6107) {
												Static52.anIntArray73[local23++] = Static6.aBoolean6 ? 1 : 0;
												continue;
											}
											if (local218 == 6108) {
												Static52.anIntArray73[local23++] = Static184.aBoolean185 ? 1 : 0;
												continue;
											}
											if (local218 == 6109) {
												Static52.anIntArray73[local23++] = Static103.aBoolean214 ? 1 : 0;
												continue;
											}
											if (local218 == 6110) {
												Static52.anIntArray73[local23++] = Static21.aBoolean22 ? 1 : 0;
												continue;
											}
											if (local218 == 6111) {
												Static52.anIntArray73[local23++] = Static16.anInt387;
												continue;
											}
											if (local218 == 6112) {
												Static52.anIntArray73[local23++] = Static142.aBoolean140 ? 1 : 0;
												continue;
											}
											if (local218 == 6114) {
												Static52.anIntArray73[local23++] = Static19.aBoolean195 ? 1 : 0;
												continue;
											}
											if (local218 == 6115) {
												Static52.anIntArray73[local23++] = Static68.aBoolean73 ? 1 : 0;
												continue;
											}
											if (local218 == 6116) {
												Static52.anIntArray73[local23++] = Static161.anInt3478;
												continue;
											}
											if (local218 == 6117) {
												Static52.anIntArray73[local23++] = Static18.aBoolean16 ? 1 : 0;
												continue;
											}
											if (local218 == 6118) {
												Static52.anIntArray73[local23++] = Static84.anInt1961;
												continue;
											}
											if (local218 == 6119) {
												Static52.anIntArray73[local23++] = Static155.anInt3424;
												continue;
											}
											if (local218 == 6120) {
												Static52.anIntArray73[local23++] = Static123.anInt2717;
												continue;
											}
											if (local218 == 6121) {
												Static52.anIntArray73[local23++] = 0;
												continue;
											}
										} else if (local218 < 6300) {
											if (local218 == 6200) {
												local23 -= 2;
												Static219.aShort31 = (short) Static52.anIntArray73[local23];
												if (Static219.aShort31 <= 0) {
													Static219.aShort31 = 256;
												}
												Static150.aShort12 = (short) Static52.anIntArray73[local23 + 1];
												if (Static150.aShort12 <= 0) {
													Static150.aShort12 = 205;
												}
												continue;
											}
											if (local218 == 6201) {
												local23 -= 2;
												Static53.aShort6 = (short) Static52.anIntArray73[local23];
												if (Static53.aShort6 <= 0) {
													Static53.aShort6 = 256;
												}
												Static84.aShort9 = (short) Static52.anIntArray73[local23 + 1];
												if (Static84.aShort9 <= 0) {
													Static84.aShort9 = 320;
												}
												continue;
											}
											if (local218 == 6202) {
												local23 -= 4;
												Static209.aShort22 = (short) Static52.anIntArray73[local23];
												if (Static209.aShort22 <= 0) {
													Static209.aShort22 = 1;
												}
												Static107.aShort11 = (short) Static52.anIntArray73[local23 + 1];
												if (Static107.aShort11 <= 0) {
													Static107.aShort11 = 32767;
												} else if (Static209.aShort22 > Static107.aShort11) {
													Static107.aShort11 = Static209.aShort22;
												}
												Static85.aShort10 = (short) Static52.anIntArray73[local23 + 2];
												if (Static85.aShort10 <= 0) {
													Static85.aShort10 = 1;
												}
												Static37.aShort5 = (short) Static52.anIntArray73[local23 + 3];
												if (Static37.aShort5 <= 0) {
													Static37.aShort5 = 32767;
												} else if (Static37.aShort5 < Static85.aShort10) {
													Static37.aShort5 = Static85.aShort10;
												}
												continue;
											}
											if (local218 == 6203) {
												Static193.method3238(Static20.aClass71_6.anInt2802, Static20.aClass71_6.anInt2835);
												Static52.anIntArray73[local23++] = Static217.anInt4594;
												Static52.anIntArray73[local23++] = Static125.anInt3564;
												continue;
											}
											if (local218 == 6204) {
												Static52.anIntArray73[local23++] = Static53.aShort6;
												Static52.anIntArray73[local23++] = Static84.aShort9;
												continue;
											}
											if (local218 == 6205) {
												Static52.anIntArray73[local23++] = Static219.aShort31;
												Static52.anIntArray73[local23++] = Static150.aShort12;
												continue;
											}
										} else if (local218 < 6400) {
											if (local218 == 6300) {
												Static52.anIntArray73[local23++] = (int) (Static144.method2489() / 60000L);
												continue;
											}
											if (local218 == 6301) {
												Static52.anIntArray73[local23++] = (int) (Static144.method2489() / 86400000L) - 11745;
												continue;
											}
											if (local218 == 6302) {
												local23 -= 3;
												local779 = Static52.anIntArray73[local23];
												local1115 = Static52.anIntArray73[local23 + 2];
												local784 = Static52.anIntArray73[local23 + 1];
												Static186.aCalendar33.clear();
												Static186.aCalendar33.set(11, 12);
												Static186.aCalendar33.set(local1115, local784, local779);
												Static52.anIntArray73[local23++] = (int) (Static186.aCalendar33.getTime().getTime() / 86400000L) - 11745;
												continue;
											}
											if (local218 == 6303) {
												Static186.aCalendar33.clear();
												Static186.aCalendar33.setTime(new Date(Static144.method2489()));
												Static52.anIntArray73[local23++] = Static186.aCalendar33.get(1);
												continue;
											}
											if (local218 == 6304) {
												local23--;
												local779 = Static52.anIntArray73[local23];
												local5186 = true;
												if (local779 < 0) {
													local5186 = (local779 + 1) % 4 == 0;
												} else if (local779 < 1582) {
													local5186 = local779 % 4 == 0;
												} else if (local779 % 4 != 0) {
													local5186 = false;
												} else if (local779 % 100 != 0) {
													local5186 = true;
												} else if (local779 % 400 != 0) {
													local5186 = false;
												}
												Static52.anIntArray73[local23++] = local5186 ? 1 : 0;
												continue;
											}
										}
									} else if (local218 == 5304) {
										Static52.anIntArray73[local23++] = 0;
										continue;
									}
								} else if (local218 == 4400) {
									local23 -= 2;
									local779 = Static52.anIntArray73[local23];
									local784 = Static52.anIntArray73[local23 + 1];
									local3105 = Static8.method112(local784);
									if (local3105.method1078()) {
										Static58.aClass51Array9[local32++] = Static9.method132(local779).method2585(local784, local3105.aClass51_437);
									} else {
										Static52.anIntArray73[local23++] = Static9.method132(local779).method2575(local3105.anInt1423, local784);
									}
									continue;
								}
							} else {
								if (local218 == 4100) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local23--;
									local784 = Static52.anIntArray73[local23];
									Static58.aClass51Array9[local32++] = Static150.method2574(new Class51[] { local582, Static27.method511(local784) });
									continue;
								}
								if (local218 == 4101) {
									local32 -= 2;
									local582 = Static58.aClass51Array9[local32];
									local1247 = Static58.aClass51Array9[local32 + 1];
									Static58.aClass51Array9[local32++] = Static150.method2574(new Class51[] { local582, local1247 });
									continue;
								}
								if (local218 == 4102) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local23--;
									local784 = Static52.anIntArray73[local23];
									Static58.aClass51Array9[local32++] = Static150.method2574(new Class51[] { local582, Static72.method1264(local784) });
									continue;
								}
								if (local218 == 4103) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static58.aClass51Array9[local32++] = local582.method1430();
									continue;
								}
								if (local218 == 4104) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									@Pc(7771) long local7771 = ((long) local779 + 11745L) * 86400000L;
									Static186.aCalendar33.setTime(new Date(local7771));
									local624 = Static186.aCalendar33.get(5);
									local648 = Static186.aCalendar33.get(2);
									local1350 = Static186.aCalendar33.get(1);
									Static58.aClass51Array9[local32++] = Static150.method2574(new Class51[] { Static27.method511(local624), Static61.aClass51_435, Static129.aClass51Array20[local648], Static61.aClass51_435, Static27.method511(local1350) });
									continue;
								}
								if (local218 == 4105) {
									local32 -= 2;
									local582 = Static58.aClass51Array9[local32];
									local1247 = Static58.aClass51Array9[local32 + 1];
									if (Static73.aClass5_Sub1_Sub1_1.aClass111_2 != null && Static73.aClass5_Sub1_Sub1_1.aClass111_2.aBoolean191) {
										Static58.aClass51Array9[local32++] = local1247;
										continue;
									}
									Static58.aClass51Array9[local32++] = local582;
									continue;
								}
								if (local218 == 4106) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static58.aClass51Array9[local32++] = Static27.method511(local779);
									continue;
								}
								if (local218 == 4107) {
									local32 -= 2;
									Static52.anIntArray73[local23++] = Static58.aClass51Array9[local32].method1390(Static58.aClass51Array9[local32 + 1]);
									continue;
								}
								@Pc(7931) Class1_Sub2_Sub11_Sub1_Sub1 local7931;
								@Pc(7926) byte[] local7926;
								if (local218 == 4108) {
									local23 -= 2;
									local784 = Static52.anIntArray73[local23];
									local1115 = Static52.anIntArray73[local23 + 1];
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local7926 = Static216.aClass70_Sub1_66.method3509(0, local1115);
									local7931 = new Class1_Sub2_Sub11_Sub1_Sub1(local7926);
									local7931.method2022(Static141.aClass41Array7, null);
									Static52.anIntArray73[local23++] = local7931.method2029(local582, local784);
									continue;
								}
								if (local218 == 4109) {
									local23 -= 2;
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local1115 = Static52.anIntArray73[local23 + 1];
									local784 = Static52.anIntArray73[local23];
									local7926 = Static216.aClass70_Sub1_66.method3509(0, local1115);
									local7931 = new Class1_Sub2_Sub11_Sub1_Sub1(local7926);
									local7931.method2022(Static141.aClass41Array7, null);
									Static52.anIntArray73[local23++] = local7931.method2024(local582, local784);
									continue;
								}
								if (local218 == 4110) {
									local32 -= 2;
									local1247 = Static58.aClass51Array9[local32 + 1];
									local582 = Static58.aClass51Array9[local32];
									local23--;
									if (Static52.anIntArray73[local23] == 1) {
										Static58.aClass51Array9[local32++] = local582;
									} else {
										Static58.aClass51Array9[local32++] = local1247;
									}
									continue;
								}
								if (local218 == 4111) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									Static58.aClass51Array9[local32++] = Static94.method2018(local582);
									continue;
								}
								if (local218 == 4112) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local23--;
									local784 = Static52.anIntArray73[local23];
									if (local784 == -1) {
										throw new RuntimeException("null char");
									}
									Static58.aClass51Array9[local32++] = local582.method1406(local784);
									continue;
								}
								if (local218 == 4113) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static202.method3325(local779) ? 1 : 0;
									continue;
								}
								if (local218 == 4114) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static67.method1166(local779) ? 1 : 0;
									continue;
								}
								if (local218 == 4115) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static37.method651(local779) ? 1 : 0;
									continue;
								}
								if (local218 == 4116) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static128.method3726(local779) ? 1 : 0;
									continue;
								}
								if (local218 == 4117) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									if (local582 == null) {
										Static52.anIntArray73[local23++] = 0;
									} else {
										Static52.anIntArray73[local23++] = local582.method1399();
									}
									continue;
								}
								if (local218 == 4118) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local23 -= 2;
									local784 = Static52.anIntArray73[local23];
									local1115 = Static52.anIntArray73[local23 + 1];
									Static58.aClass51Array9[local32++] = local582.method1433(local784, local1115);
									continue;
								}
								if (local218 == 4119) {
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local1247 = Static158.method2687(local582.method1399());
									@Pc(8237) boolean local8237 = false;
									for (local624 = 0; local582.method1399() > local624; local624++) {
										local648 = local582.method1408(local624);
										if (local648 == 60) {
											local8237 = true;
										} else if (local648 == 62) {
											local8237 = false;
										} else if (!local8237) {
											local1247.method1423(local648);
										}
									}
									local1247.method1434();
									Static58.aClass51Array9[local32++] = local1247;
									continue;
								}
								if (local218 == 4120) {
									local23 -= 2;
									local32--;
									local582 = Static58.aClass51Array9[local32];
									local784 = Static52.anIntArray73[local23];
									local1115 = Static52.anIntArray73[local23 + 1];
									Static52.anIntArray73[local23++] = local582.method1425(local784, local1115);
									continue;
								}
								if (local218 == 4121) {
									local32 -= 2;
									local1247 = Static58.aClass51Array9[local32 + 1];
									local582 = Static58.aClass51Array9[local32];
									local23--;
									local1115 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = local582.method1389(local1115, local1247);
									continue;
								}
								if (local218 == 4122) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static93.method1544(local779);
									continue;
								}
								if (local218 == 4123) {
									local23--;
									local779 = Static52.anIntArray73[local23];
									Static52.anIntArray73[local23++] = Static218.method1761(local779);
									continue;
								}
							}
						} else {
							if (local218 < 2000) {
								local1065 = local982 ? Static118.aClass71_23 : Static56.aClass71_28;
							} else {
								local23--;
								local1065 = Static7.method102(Static52.anIntArray73[local23]);
								local218 -= 1000;
							}
							if (local218 == 1300) {
								local23--;
								local784 = Static52.anIntArray73[local23] - 1;
								if (local784 >= 0 && local784 <= 9) {
									local32--;
									local1065.method2203(local784, Static58.aClass51Array9[local32]);
									continue;
								}
								local32--;
								continue;
							}
							if (local218 == 1301) {
								local23 -= 2;
								local1115 = Static52.anIntArray73[local23 + 1];
								local784 = Static52.anIntArray73[local23];
								local1065.aClass71_24 = Static29.method527(local784, local1115);
								continue;
							}
							if (local218 == 1302) {
								local23--;
								local1065.aBoolean125 = Static52.anIntArray73[local23] == 1;
								continue;
							}
							if (local218 == 1303) {
								local23--;
								local1065.anInt2843 = Static52.anIntArray73[local23];
								continue;
							}
							if (local218 == 1304) {
								local23--;
								local1065.anInt2857 = Static52.anIntArray73[local23];
								continue;
							}
							if (local218 == 1305) {
								local32--;
								local1065.aClass51_984 = Static58.aClass51Array9[local32];
								continue;
							}
							if (local218 == 1306) {
								local32--;
								local1065.aClass51_983 = Static58.aClass51Array9[local32];
								continue;
							}
							if (local218 == 1307) {
								local1065.aClass51Array18 = null;
								continue;
							}
						}
					}
				} else {
					if (local218 == 403) {
						local23 -= 2;
						local779 = Static52.anIntArray73[local23];
						if (local779 >= 7) {
							local779 -= 7;
						}
						local784 = Static52.anIntArray73[local23 + 1];
						Static73.aClass5_Sub1_Sub1_1.aClass111_2.method3283(local784, local779);
						continue;
					}
					if (local218 == 404) {
						local23 -= 2;
						local779 = Static52.anIntArray73[local23];
						local784 = Static52.anIntArray73[local23 + 1];
						Static73.aClass5_Sub1_Sub1_1.aClass111_2.method3279(local779, local784);
						continue;
					}
					if (local218 == 410) {
						local23--;
						@Pc(11336) boolean local11336 = Static52.anIntArray73[local23] != 0;
						Static73.aClass5_Sub1_Sub1_1.aClass111_2.method3274(local11336);
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(11638) Exception local11638) {
			if (local18.aClass51_189 == null) {
				if (Static147.anInt3191 != 0) {
					Static164.method2798(0, Static152.aClass51_1178, Static136.aClass51_927);
				}
				Static34.method595("CS2 - scr:" + local18.aLong170 + " op:" + local34, local11638);
			} else {
				@Pc(11668) Class51 local11668 = Static158.method2687(30);
				local11668.method1404(Static168.aClass51_1283).method1404(local18.aClass51_189);
				for (local51 = Static13.anInt330 - 1; local51 >= 0; local51--) {
					local11668.method1404(Static43.aClass51_305).method1404(Static197.aClass12Array2[local51].aClass1_Sub2_Sub3_1.aClass51_189);
				}
				if (local34 == 40) {
					local89 = local37[local27];
					local11668.method1404(Static69.aClass51_520).method1404(Static27.method511(local89));
				}
				if (Static147.anInt3191 != 0) {
					Static164.method2798(0, Static150.method2574(new Class51[] { Static180.aClass51_1350, local18.aClass51_189 }), Static136.aClass51_927);
				}
				Static34.method595("CS2 - scr:" + local18.aLong170 + " op:" + local34 + new String(local11668.method1387()), local11638);
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([IBIII)V")
	public static void method1261(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(7) int local7 = arg3 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg1 < local11) {
			@Pc(15) int local15 = arg1 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg1 = local45 + 1;
			arg0[arg1] = arg2;
		}
		while (local7 > arg1) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lclient!qh;")
	public static Class1_Sub2_Sub14 method1262(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = (Class1_Sub2_Sub14) Static144.aClass53_23.method1501((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static163.method2759(arg0, Static146.aClass70_14, Static103.aClass70_46);
		if (local10 != null) {
			Static144.aClass53_23.method1497(local10, (long) arg0);
		}
		return local10;
	}
}
