import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	public static int anInt4494;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!th;")
	public static Class168 aClass168_154;

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
	public static int anInt4499;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	public static int anInt4489 = 0;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt4490 = 2;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
	public static int anInt4501 = 0;

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "[I")
	public static int[] anIntArray401 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "Ljava/lang/String;")
	public static String aString305 = "Loading textures - ";

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public static void method3290() {
		Static127.aClass89_14.method2265();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	public static void method3293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static90.anInt2088 < arg2 || Static206.anInt4449 > arg0) {
			return;
		}
		@Pc(29) boolean local29;
		if (arg4 < Static170.anInt3814) {
			local29 = false;
			arg4 = Static170.anInt3814;
		} else if (Static310.anInt6206 >= arg4) {
			local29 = true;
		} else {
			arg4 = Static310.anInt6206;
			local29 = false;
		}
		@Pc(46) boolean local46;
		if (Static170.anInt3814 > arg1) {
			local46 = false;
			arg1 = Static170.anInt3814;
		} else if (arg1 <= Static310.anInt6206) {
			local46 = true;
		} else {
			arg1 = Static310.anInt6206;
			local46 = false;
		}
		if (Static206.anInt4449 <= arg2) {
			Static98.method3942(arg1, Static121.anIntArrayArray33[arg2++], arg3, arg4);
		} else {
			arg2 = Static206.anInt4449;
		}
		if (Static90.anInt2088 < arg0) {
			arg0 = Static90.anInt2088;
		} else {
			Static98.method3942(arg1, Static121.anIntArrayArray33[arg0--], arg3, arg4);
		}
		@Pc(111) int local111;
		if (local29 && local46) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				@Pc(118) int[] local118 = Static121.anIntArrayArray33[local111];
				local118[arg4] = local118[arg1] = arg3;
			}
		} else if (local29) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				Static121.anIntArrayArray33[local111][arg4] = arg3;
			}
		} else if (local46) {
			for (local111 = arg2; local111 <= arg0; local111++) {
				Static121.anIntArrayArray33[local111][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!th;B)V")
	public static void method3294(@OriginalArg(0) Class168 arg0) {
		Static281.aClass168_97 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method3295() {
		Static40.method817(Static238.aClass191_11);
		Static31.anInt773++;
		if (Static81.aBoolean130 && Static129.aBoolean173) {
			@Pc(35) int local35 = Static89.anInt5974;
			local35 -= Static40.anInt989;
			@Pc(41) int local41 = Static289.anInt5816;
			if (Static289.anInt5817 > local35) {
				local35 = Static289.anInt5817;
			}
			local41 -= Static270.anInt5414;
			if (Static118.anInt2546 > local41) {
				local41 = Static118.anInt2546;
			}
			if (Static238.aClass191_11.anInt6128 + local41 > Static120.aClass191_18.anInt6128 + Static118.anInt2546) {
				local41 = Static120.aClass191_18.anInt6128 + Static118.anInt2546 - Static238.aClass191_11.anInt6128;
			}
			@Pc(82) int local82 = Static238.aClass191_11.anInt6143;
			if (Static238.aClass191_11.anInt6088 + local35 > Static120.aClass191_18.anInt6088 + Static289.anInt5817) {
				local35 = Static289.anInt5817 + Static120.aClass191_18.anInt6088 - Static238.aClass191_11.anInt6088;
			}
			@Pc(111) int local111 = local35 - Static37.anInt928;
			@Pc(116) int local116 = local41 - Static251.anInt5520;
			@Pc(124) int local124 = local35 + Static120.aClass191_18.anInt6163 - Static289.anInt5817;
			if (Static238.aClass191_11.anInt6124 < Static31.anInt773 && (local111 > local82 || -local82 > local111 || local116 > local82 || local116 < -local82)) {
				Static102.aBoolean61 = true;
			}
			@Pc(162) int local162 = local41 + Static120.aClass191_18.anInt6106 - Static118.anInt2546;
			@Pc(173) Class1_Sub27 local173;
			if (Static238.aClass191_11.anObjectArray18 != null && Static102.aBoolean61) {
				local173 = new Class1_Sub27();
				local173.anInt5232 = local162;
				local173.anInt5234 = local124;
				local173.aClass191_14 = Static238.aClass191_11;
				local173.anObjectArray1 = Static238.aClass191_11.anObjectArray18;
				Static140.method2329(local173);
			}
			if (Static202.anInt4403 == 0) {
				if (Static102.aBoolean61) {
					if (Static238.aClass191_11.anObjectArray19 != null) {
						local173 = new Class1_Sub27();
						local173.anInt5232 = local162;
						local173.aClass191_13 = Static77.aClass191_5;
						local173.anInt5234 = local124;
						local173.anObjectArray1 = Static238.aClass191_11.anObjectArray19;
						local173.aClass191_14 = Static238.aClass191_11;
						Static140.method2329(local173);
					}
					if (Static77.aClass191_5 != null && Static35.method745(Static238.aClass191_11) != null) {
						Static2.aClass1_Sub14_Sub1_1.method2252(44);
						Static2.aClass1_Sub14_Sub1_1.method2208(Static77.aClass191_5.anInt6165);
						Static2.aClass1_Sub14_Sub1_1.method2220(Static238.aClass191_11.anInt6134);
						Static2.aClass1_Sub14_Sub1_1.method2210(Static238.aClass191_11.anInt6165);
						Static2.aClass1_Sub14_Sub1_1.method2250(Static77.aClass191_5.anInt6134);
					}
				} else if ((Static102.anInt849 == 1 || Static300.method4578(Static181.anInt3973 - 1)) && Static181.anInt3973 > 2) {
					Static301.method3612();
				} else if (Static181.anInt3973 > 0) {
					Static103.method1723();
				}
				Static238.aClass191_11 = null;
			}
		} else if (Static31.anInt773 > 1) {
			Static238.aClass191_11 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIIII)V")
	public static void method3297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class64[] local7 = Static170.aClass64Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(21) Class64 local21 = local7[local9];
			if (local21 != null && local21.anInt2092 == 2) {
				Static116.method1875(arg0, arg4, local21.anInt2087 * 2, local21.anInt2099 + (local21.anInt2097 - Static159.anInt3527 << 7), arg1 >> 1, arg5 >> 1, local21.anInt2098 + (local21.anInt2095 - Static217.anInt4673 << 7));
				if (Static18.anInt482 > -1 && Static133.anInt3061 % 20 < 10) {
					Static82.aClass1_Sub3_Sub13Array5[local21.anInt2094].method4204(Static18.anInt482 + arg3 - 12, arg2 + Static264.anInt5305 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!rb;III)V")
	public static void method3299(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static181.anInt3973 >= 400) {
			return;
		}
		if (arg1.anIntArray455 != null) {
			arg1 = arg1.method3711();
		}
		if (arg1 == null || !arg1.aBoolean300) {
			return;
		}
		@Pc(40) String local40 = arg1.aString346;
		if (arg1.anInt4922 != 0) {
			@Pc(56) String local56 = anInt4489 == 1 ? Static101.aString14 : Static220.aString328;
			local40 = local40 + Static134.method2281(Static56.aClass2_Sub4_Sub2_1.anInt2867, arg1.anInt4922) + " (" + local56 + arg1.anInt4922 + ")";
		}
		if (Static24.anInt662 == 1) {
			Static12.method2960(arg2, Static7.anInt211, (long) arg0, Static311.aString444 + " -> <col=ffff00>" + local40, arg3, Static163.aString216, (short) 29);
		} else if (Static230.aBoolean185) {
			@Pc(361) Class1_Sub3_Sub7 local361 = Static101.anInt155 == -1 ? null : Static279.method4264(Static101.anInt155);
			if ((Static56.anInt1257 & 0x2) != 0 && (local361 == null || arg1.method3715(Static101.anInt155, local361.anInt2417) != local361.anInt2417)) {
				Static12.method2960(arg2, Static181.anInt3978, (long) arg0, Static303.aString426 + " -> <col=ffff00>" + local40, arg3, Static244.aString290, (short) 18);
			}
		} else {
			@Pc(114) String[] local114 = arg1.aStringArray40;
			if (Static214.aBoolean290) {
				local114 = Static242.method3788(local114);
			}
			@Pc(125) int local125;
			if (local114 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local114[local125] != null && (anInt4489 != 0 || !local114[local125].equalsIgnoreCase(Static145.aString432))) {
						@Pc(151) int local151 = -1;
						@Pc(153) byte local153 = 0;
						if (local125 == 0) {
							local153 = 7;
						}
						if (local125 == 1) {
							local153 = 2;
						}
						if (local125 == 2) {
							local153 = 32;
						}
						if (local125 == 3) {
							local153 = 40;
						}
						if (local125 == 4) {
							local153 = 28;
						}
						if (local125 == arg1.anInt4913) {
							local151 = arg1.anInt4929;
						}
						if (arg1.anInt4916 == local125) {
							local151 = arg1.anInt4941;
						}
						Static12.method2960(arg2, local151, (long) arg0, "<col=ffff00>" + local40, arg3, local114[local125], local153);
					}
				}
			}
			if (anInt4489 == 0 && local114 != null) {
				for (local125 = 4; local125 >= 0; local125--) {
					if (local114[local125] != null && local114[local125].equalsIgnoreCase(Static145.aString432)) {
						@Pc(251) short local251 = 0;
						if (Static56.aClass2_Sub4_Sub2_1.anInt2867 < arg1.anInt4922) {
							local251 = 2000;
						}
						@Pc(265) short local265 = 0;
						if (local125 == 0) {
							local265 = 7;
						}
						if (local125 == 1) {
							local265 = 2;
						}
						if (local125 == 2) {
							local265 = 32;
						}
						if (local125 == 3) {
							local265 = 40;
						}
						if (local125 == 4) {
							local265 = 28;
						}
						if (local265 != 0) {
							local265 += local251;
						}
						Static12.method2960(arg2, arg1.anInt4948, (long) arg0, "<col=ffff00>" + local40, arg3, local114[local125], local265);
					}
				}
			}
			Static12.method2960(arg2, Static234.anInt4944, (long) arg0, "<col=ffff00>" + local40, arg3, Static31.aString50, (short) 1008);
		}
	}
}
