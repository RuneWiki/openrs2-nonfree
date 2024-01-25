import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString372 = "green:";

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
	public static int anInt6449 = 0;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "[I")
	public static int[] anIntArray555 = new int[2];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)I")
	public static int method5694() {
		return 6;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!jf;I)V")
	public static void method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2) {
		if (arg2.anInt2926 == 1) {
			Static345.method5684(29, arg2.aString185, "", -1, 0, arg2.anInt2877, 0L);
		}
		if (arg2.anInt2926 == 2 && !Static20.aBoolean40) {
			@Pc(38) String local38 = Static154.method2896(arg2);
			if (local38 != null) {
				Static345.method5684(8, local38, "<col=00ff00>" + arg2.lb, -1, -1, arg2.anInt2877, 0L);
			}
		}
		if (arg2.anInt2926 == 3) {
			Static345.method5684(28, Static226.aString260, "", -1, 0, arg2.anInt2877, 0L);
		}
		if (arg2.anInt2926 == 4) {
			Static345.method5684(30, arg2.aString185, "", -1, 0, arg2.anInt2877, 0L);
		}
		if (arg2.anInt2926 == 5) {
			Static345.method5684(37, arg2.aString185, "", -1, 0, arg2.anInt2877, 0L);
		}
		if (arg2.anInt2926 == 6 && Static323.aClass96_20 == null) {
			Static345.method5684(20, arg2.aString185, "", -1, -1, arg2.anInt2877, 0L);
		}
		@Pc(158) int local158;
		@Pc(152) int local152;
		if (arg2.anInt2933 == 2) {
			local152 = 0;
			for (@Pc(154) int local154 = 0; local154 < arg2.anInt2900; local154++) {
				for (local158 = 0; local158 < arg2.anInt2901; local158++) {
					@Pc(168) int local168 = local158 * (arg2.anInt2890 + 32);
					@Pc(175) int local175 = (arg2.anInt2875 + 32) * local154;
					if (local152 < 20) {
						local168 += arg2.anIntArray184[local152];
						local175 += arg2.anIntArray190[local152];
					}
					if (local168 <= arg1 && local175 <= arg0 && arg1 < local168 + 32 && arg0 < local175 + 32) {
						Static84.aClass96_7 = arg2;
						Static239.anInt4617 = local152;
						if (arg2.anIntArray191[local152] > 0) {
							@Pc(230) Class5_Sub10 local230 = Static43.method975(arg2);
							@Pc(239) Class165 local239 = Static88.method1382(arg2.anIntArray191[local152] - 1);
							if (Static100.anInt2199 == 1 && local230.method1137()) {
								if (Static51.anInt1288 != arg2.anInt2877 || local152 != Static229.anInt4484) {
									Static345.method5684(47, Static121.aString166, Static332.aString362 + " -> <col=ff9040>" + local239.aString291, Static100.anInt2198, local152, arg2.anInt2877, (long) local239.anInt4906);
								}
							} else if (Static20.aBoolean40 && local230.method1137()) {
								@Pc(619) Class5_Sub9_Sub1 local619 = Static257.anInt5013 == -1 ? null : Static129.method2470(Static257.anInt5013);
								if ((Static240.anInt4648 & 0x10) != 0 && (local619 == null || local239.method4413(Static257.anInt5013, local619.anInt1273) != local619.anInt1273)) {
									Static345.method5684(60, Static221.aString254, Static111.aString151 + " -> <col=ff9040>" + local239.aString291, Static258.anInt5020, local152, arg2.anInt2877, (long) local239.anInt4906);
								}
							} else {
								@Pc(294) String[] local294 = local239.aStringArray38;
								@Pc(300) int local300;
								@Pc(317) byte local317;
								@Pc(310) int local310;
								if (local230.method1137()) {
									for (local300 = 4; local300 >= 3; local300--) {
										if (local294 != null && local294[local300] != null) {
											local310 = -1;
											if (local300 == 3) {
												local317 = 49;
											} else {
												local317 = 44;
											}
											if (local239.anInt4966 == local300) {
												local310 = local239.anInt4921;
											}
											if (local239.anInt4926 == local300) {
												local310 = local239.anInt4943;
											}
											Static345.method5684(local317, local294[local300], "<col=ff9040>" + local239.aString291, local310, local152, arg2.anInt2877, (long) local239.anInt4906);
										}
									}
								}
								if (local230.method1138()) {
									Static345.method5684(41, Static121.aString166, "<col=ff9040>" + local239.aString291, Static100.anInt2198, local152, arg2.anInt2877, (long) local239.anInt4906);
								}
								if (local230.method1137() && local294 != null) {
									for (local300 = 2; local300 >= 0; local300--) {
										if (local294[local300] != null) {
											local317 = 0;
											if (local300 == 0) {
												local317 = 26;
											}
											local310 = -1;
											if (local300 == 1) {
												local317 = 34;
											}
											if (local300 == local239.anInt4966) {
												local310 = local239.anInt4921;
											}
											if (local300 == 2) {
												local317 = 22;
											}
											if (local300 == local239.anInt4926) {
												local310 = local239.anInt4943;
											}
											Static345.method5684(local317, local294[local300], "<col=ff9040>" + local239.aString291, local310, local152, arg2.anInt2877, (long) local239.anInt4906);
										}
									}
								}
								local294 = arg2.aStringArray18;
								if (local294 != null) {
									for (local300 = 4; local300 >= 0; local300--) {
										if (local294[local300] != null) {
											local317 = 0;
											local310 = -1;
											if (local300 == 0) {
												local317 = 23;
											}
											if (local300 == 1) {
												local317 = 2;
											}
											if (local300 == 2) {
												local317 = 19;
											}
											if (local300 == 3) {
												local317 = 11;
											}
											if (local239.anInt4966 == local300) {
												local310 = local239.anInt4921;
											}
											if (local300 == 4) {
												local317 = 57;
											}
											if (local239.anInt4926 == local300) {
												local310 = local239.anInt4943;
											}
											Static345.method5684(local317, local294[local300], "<col=ff9040>" + local239.aString291, local310, local152, arg2.anInt2877, (long) local239.anInt4906);
										}
									}
								}
								Static345.method5684(1012, Static139.aString354, "<col=ff9040>" + local239.aString291, Static218.anInt4348, local152, arg2.anInt2877, (long) local239.anInt4906);
							}
						}
					}
					local152++;
				}
			}
		}
		if (!arg2.aBoolean197) {
			return;
		}
		if (!Static20.aBoolean40) {
			@Pc(692) String local692;
			for (local152 = 9; local152 >= 5; local152--) {
				local692 = Static115.method2280(local152, arg2);
				if (local692 != null) {
					Static345.method5684(1004, local692, arg2.aString184, Static183.method3396(local152, arg2), arg2.anInt2914, arg2.anInt2877, (long) (local152 + 1));
				}
			}
			local692 = Static154.method2896(arg2);
			if (local692 != null) {
				Static345.method5684(8, local692, arg2.aString184, -1, arg2.anInt2914, arg2.anInt2877, 0L);
			}
			for (local158 = 4; local158 >= 0; local158--) {
				@Pc(753) String local753 = Static115.method2280(local158, arg2);
				if (local753 != null) {
					Static345.method5684(48, local753, arg2.aString184, Static183.method3396(local158, arg2), arg2.anInt2914, arg2.anInt2877, (long) (local158 + 1));
				}
			}
			if (Static43.method975(arg2).method1135()) {
				if (arg2.aString186 == null) {
					Static345.method5684(20, Static264.aString193, "", -1, arg2.anInt2914, arg2.anInt2877, 0L);
				} else {
					Static345.method5684(20, arg2.aString186, "", -1, arg2.anInt2914, arg2.anInt2877, 0L);
				}
				return;
			}
			return;
		}
		if (Static43.method975(arg2).method1142() && (Static240.anInt4648 & 0x20) != 0) {
			Static345.method5684(5, Static221.aString254, Static111.aString151 + " -> " + arg2.aString184, Static258.anInt5020, arg2.anInt2914, arg2.anInt2877, 0L);
			return;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method5697(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static320.anInt6060;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class187 local26 = Static233.method3993(arg0[local18]);
			if (local26.anInt5633 != -1) {
				@Pc(38) Class54 local38 = (Class54) Static156.aClass66_54.method1939((long) local26.anInt5633);
				if (local38 == null) {
					@Pc(46) Class37 local46 = Static360.method907(Static317.aClass170_114, local26.anInt5633, 0);
					if (local46 != null) {
						local38 = Static15.aClass59_1.method4872(local46);
						Static156.aClass66_54.method1936((long) local26.anInt5633, local38);
					}
				}
				if (local38 != null) {
					Static49.aClass54Array4[local16] = local38;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
