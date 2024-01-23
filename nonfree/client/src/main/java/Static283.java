import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_5;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
	public static int anInt5621 = 0;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "[I")
	public static int[] anIntArray660 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vh", name = "Q", descriptor = "[I")
	public static int[] anIntArray661 = new int[4096];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4316(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static52.aString28 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static177.aString112 + "</col>";
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!og;I)V")
	public static void method4317(@OriginalArg(0) int arg0, @OriginalArg(2) Class127 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3632 == 1) {
			Static166.method2533(arg1.aString128, arg1.anInt3574, 0, "", (short) 47, -1, 0L);
		}
		@Pc(37) String local37;
		if (arg1.anInt3632 == 2 && !Static75.aBoolean115) {
			local37 = Static37.method2468(arg1);
			if (local37 != null) {
				Static166.method2533(local37, arg1.anInt3574, -1, "<col=00ff00>" + arg1.aString123, (short) 46, -1, 0L);
			}
		}
		if (arg1.anInt3632 == 3) {
			Static166.method2533(Static64.aString35, arg1.anInt3574, 0, "", (short) 38, -1, 0L);
		}
		if (arg1.anInt3632 == 4) {
			Static166.method2533(arg1.aString128, arg1.anInt3574, 0, "", (short) 43, -1, 0L);
		}
		if (arg1.anInt3632 == 5) {
			Static166.method2533(arg1.aString128, arg1.anInt3574, 0, "", (short) 16, -1, 0L);
		}
		if (arg1.anInt3632 == 6 && Static91.aClass127_4 == null) {
			Static166.method2533(arg1.aString128, arg1.anInt3574, -1, "", (short) 13, -1, 0L);
		}
		@Pc(152) int local152;
		@Pc(150) int local150;
		if (arg1.anInt3570 == 2) {
			local150 = 0;
			for (local152 = 0; local152 < arg1.anInt3544; local152++) {
				for (@Pc(162) int local162 = 0; local162 < arg1.anInt3546; local162++) {
					@Pc(178) int local178 = local162 * (arg1.anInt3627 + 32);
					@Pc(185) int local185 = (arg1.anInt3559 + 32) * local152;
					if (local150 < 20) {
						local178 += arg1.anIntArray410[local150];
						local185 += arg1.anIntArray409[local150];
					}
					if (arg2 >= local178 && arg0 >= local185 && arg2 < local178 + 32 && arg0 < local185 + 32) {
						Static126.anInt2412 = local150;
						Static256.aClass127_11 = arg1;
						if (arg1.anIntArray415[local150] > 0) {
							@Pc(244) Class1_Sub31 local244 = Static43.method794(arg1);
							@Pc(253) Class120 local253 = Static183.method4458(arg1.anIntArray415[local150] - 1);
							if (Static282.anInt5856 == 1 && local244.method4348()) {
								if (arg1.anInt3574 != Static180.anInt3326 || Static273.anInt5456 != local150) {
									Static166.method2533(Static149.aString96, arg1.anInt3574, local150, Static196.aString132 + " -> <col=ff9040>" + local253.aString113, (short) 18, -1, (long) local253.anInt3282);
								}
							} else if (Static75.aBoolean115 && local244.method4348()) {
								@Pc(554) Class1_Sub2_Sub20 local554 = Static26.anInt574 == -1 ? null : Static47.method4517(Static26.anInt574);
								if ((Static14.anInt367 & 0x10) != 0 && (local554 == null || local253.method2683(local554.anInt5559, Static26.anInt574) != local554.anInt5559)) {
									Static166.method2533(Static222.aString150, arg1.anInt3574, local150, Static54.aString32 + " -> <col=ff9040>" + local253.aString113, (short) 49, Static162.anInt2993, (long) local253.anInt3282);
								}
							} else {
								@Pc(271) String[] local271 = local253.aStringArray15;
								if (Static244.aBoolean389) {
									local271 = Static184.method2765(local271);
								}
								@Pc(284) int local284;
								@Pc(302) byte local302;
								if (local244.method4348()) {
									for (local284 = 4; local284 >= 3; local284--) {
										if (local271 != null && local271[local284] != null) {
											if (local284 == 3) {
												local302 = 26;
											} else {
												local302 = 45;
											}
											Static166.method2533(local271[local284], arg1.anInt3574, local150, "<col=ff9040>" + local253.aString113, local302, -1, (long) local253.anInt3282);
										}
									}
								}
								if (local244.method4345()) {
									Static166.method2533(Static149.aString96, arg1.anInt3574, local150, "<col=ff9040>" + local253.aString113, (short) 31, Static180.anInt3325, (long) local253.anInt3282);
								}
								if (local244.method4348() && local271 != null) {
									for (local284 = 2; local284 >= 0; local284--) {
										if (local271[local284] != null) {
											local302 = 0;
											if (local284 == 0) {
												local302 = 15;
											}
											if (local284 == 1) {
												local302 = 2;
											}
											if (local284 == 2) {
												local302 = 22;
											}
											Static166.method2533(local271[local284], arg1.anInt3574, local150, "<col=ff9040>" + local253.aString113, local302, -1, (long) local253.anInt3282);
										}
									}
								}
								local271 = arg1.aStringArray18;
								if (Static244.aBoolean389) {
									local271 = Static184.method2765(local271);
								}
								if (local271 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local271[local284] != null) {
											local302 = 0;
											if (local284 == 0) {
												local302 = 8;
											}
											if (local284 == 1) {
												local302 = 10;
											}
											if (local284 == 2) {
												local302 = 3;
											}
											if (local284 == 3) {
												local302 = 57;
											}
											if (local284 == 4) {
												local302 = 17;
											}
											Static166.method2533(local271[local284], arg1.anInt3574, local150, "<col=ff9040>" + local253.aString113, local302, -1, (long) local253.anInt3282);
										}
									}
								}
								Static166.method2533(Static179.aString114, arg1.anInt3574, local150, "<col=ff9040>" + local253.aString113, (short) 1006, Static210.anInt4227, (long) local253.anInt3282);
							}
						}
					}
					local150++;
				}
			}
		}
		if (!arg1.aBoolean261) {
			return;
		}
		if (!Static75.aBoolean115) {
			for (local150 = 9; local150 >= 5; local150--) {
				@Pc(703) String local703 = Static105.method1656(local150, arg1);
				if (local703 != null) {
					Static166.method2533(local703, arg1.anInt3574, arg1.anInt3573, arg1.aString126, (short) 1004, Static294.method4502(local150, arg1), (long) (local150 + 1));
				}
			}
			local37 = Static37.method2468(arg1);
			if (local37 != null) {
				Static166.method2533(local37, arg1.anInt3574, arg1.anInt3573, arg1.aString126, (short) 46, -1, 0L);
			}
			for (local152 = 4; local152 >= 0; local152--) {
				@Pc(769) String local769 = Static105.method1656(local152, arg1);
				if (local769 != null) {
					Static166.method2533(local769, arg1.anInt3574, arg1.anInt3573, arg1.aString126, (short) 29, Static294.method4502(local152, arg1), (long) (local152 + 1));
				}
			}
			if (Static43.method794(arg1).method4346()) {
				if (arg1.aString124 == null) {
					Static166.method2533(Static16.aString16, arg1.anInt3574, arg1.anInt3573, "", (short) 13, -1, 0L);
				} else {
					Static166.method2533(arg1.aString124, arg1.anInt3574, arg1.anInt3573, "", (short) 13, -1, 0L);
				}
			}
		} else if (Static43.method794(arg1).method4342() && (Static14.anInt367 & 0x20) != 0) {
			Static166.method2533(Static222.aString150, arg1.anInt3574, arg1.anInt3573, Static54.aString32 + " -> " + arg1.aString126, (short) 50, Static162.anInt2993, 0L);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4318(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub18 local8 = new Class1_Sub18(arg0);
		@Pc(12) int local12 = local8.method3122();
		@Pc(16) int local16 = local8.method3074();
		if (local16 < 0 || Static211.anInt957 != 0 && local16 > Static211.anInt957) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(82) byte[] local82 = new byte[local16];
			local8.method3095(local82, local16);
			return local82;
		} else {
			@Pc(42) int local42 = local8.method3074();
			if (local42 < 0 || Static211.anInt957 != 0 && Static211.anInt957 < local42) {
				throw new RuntimeException();
			}
			@Pc(60) byte[] local60 = new byte[local42];
			if (local12 == 1) {
				Static281.method4303(local60, local42, arg0, local16);
			} else {
				Static264.aClass56_2.method1359(local60, local8);
			}
			return local60;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!mm;B)V")
	public static void method4321(@OriginalArg(0) Class1_Sub20 arg0) {
		Static137.method3045(200000, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4323(@OriginalArg(1) String arg0) {
		Static266.aString179 = arg0;
		if (Static13.aClass84_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(21) String local21 = Static13.aClass84_3.anApplet1.getParameter("cookieprefix");
			@Pc(26) String local26 = Static13.aClass84_3.anApplet1.getParameter("cookiehost");
			@Pc(41) String local41 = local21 + "settings=" + arg0 + "; version=1; path=/; domain=" + local26;
			if (arg0.length() == 0) {
				local41 = local41 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local41 = local41 + "; Expires=" + Static245.method1015(Static252.method3964() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static301.method947(Static13.aClass84_3.anApplet1, "document.cookie=\"" + local41 + "\"");
		} catch (@Pc(93) Throwable local93) {
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	public static void method4324() {
		Static284.aClass31_43.method855();
		Static247.aClass31_36.method855();
	}
}
