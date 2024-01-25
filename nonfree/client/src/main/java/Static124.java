import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "Ljava/lang/String;")
	public static final String aString94 = "white:";

	@OriginalMember(owner = "client!i", name = "Gb", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!i", name = "Hb", descriptor = "Ljava/lang/String;")
	public static String aString96 = "flash2:";

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 < 128 || arg4 < 128 || arg1 > Static43.anInt1151 * 128 - 256 || Static260.anInt5348 * 128 - 256 < arg4) {
			Static49.anIntArray493[0] = Static49.anIntArray493[1] = -1;
			return;
		}
		@Pc(57) int local57 = Static352.method5834(arg4, arg1, Static127.anInt2487) - arg5;
		Static56.aClass31_1.method3184(arg3, 0, 0);
		Static217.aClass105_5.method4213(Static56.aClass31_1);
		Static217.aClass105_5.method4210(arg1, local57, arg4, Static49.anIntArray493);
		Static56.aClass31_1.method3184(-arg3, 0, 0);
		Static217.aClass105_5.method4213(Static56.aClass31_1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIILclient!ii;Lclient!dc;III)Lclient!dc;")
	public static Class40 method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class105 arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg7;
		@Pc(12) Class40 local12 = (Class40) Static245.aClass37_20.method915(local6);
		if (local12 == null) {
			@Pc(22) Class219 local22 = Static154.method2690(arg7, Static200.aClass134_97);
			if (local22 == null) {
				return null;
			}
			local12 = arg5.method4301(local22, 1031, Static206.anInt4319, 64, 768);
			Static245.aClass37_20.method922(local6, local12);
		}
		local12 = local12.method4599((byte) 2, 1031, true);
		if (arg1 != 0) {
			local12.method4620(arg1);
		}
		if (arg3 != 0) {
			local12.method4591(arg3);
		}
		if (arg4 != 0) {
			local12.method4583(arg4);
		}
		if (arg9 != 0) {
			local12.method4612(0, arg9, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1982(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static205.aString163 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static12.aString7 + "</col>";
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method1983(@OriginalArg(0) Class134 arg0) {
		Static169.aClass134_81 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!cd;B)V")
	public static void method1984(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0) {
		if (Static61.anInt1413 >= 400) {
			return;
		}
		@Pc(18) Class60 local18 = arg0.aClass60_1;
		if (local18.anIntArray109 != null) {
			local18 = local18.method1274();
			if (local18 == null) {
				return;
			}
		}
		if (!local18.aBoolean103) {
			return;
		}
		@Pc(35) String local35 = local18.aString55;
		if (local18.anInt1510 != 0) {
			@Pc(48) String local48 = Class10_Sub1_Sub1.lb == 1 ? Static208.aString167 : Static246.aString197;
			local35 = local35 + Static348.method5327(local18.anInt1510, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107) + " (" + local48 + local18.anInt1510 + ")";
		}
		if (Static254.anInt5233 == 1) {
			Static169.method2996(0, Static318.anInt6339, Static319.aString120, (long) arg0.anInt4036, Static142.aString102 + " -> <col=ffff00>" + local35, 50, 0);
		} else if (Static265.aBoolean456) {
			@Pc(339) Class1_Sub2_Sub19 local339 = Static61.anInt1411 == -1 ? null : Static262.method1693(Static61.anInt1411);
			if ((Static45.anInt1184 & 0x2) != 0 && (local339 == null || local18.method1268(Static61.anInt1411, local339.anInt6009) != local339.anInt6009)) {
				Static169.method2996(0, Static224.anInt4728, Static238.aString191, (long) arg0.anInt4036, Static49.aString203 + " -> <col=ffff00>" + local35, 43, 0);
			}
		} else {
			@Pc(106) String[] local106 = local18.aStringArray8;
			if (Static153.aBoolean246) {
				local106 = Static107.method1702(local106);
			}
			@Pc(116) int local116;
			if (local106 != null) {
				for (local116 = 4; local116 >= 0; local116--) {
					if (local106[local116] != null && (Class10_Sub1_Sub1.lb != 0 || !local106[local116].equalsIgnoreCase(Static41.aString40))) {
						@Pc(132) byte local132 = 0;
						if (local116 == 0) {
							local132 = 21;
						}
						@Pc(138) int local138 = Static188.anInt3930;
						if (local116 == 1) {
							local132 = 20;
						}
						if (local116 == 2) {
							local132 = 26;
						}
						if (local116 == 3) {
							local132 = 24;
						}
						if (local18.anInt1497 == local116) {
							local138 = local18.anInt1534;
						}
						if (local116 == 4) {
							local132 = 31;
						}
						if (local18.anInt1522 == local116) {
							local138 = local18.anInt1513;
						}
						Static169.method2996(0, local138, local106[local116], (long) arg0.anInt4036, "<col=ffff00>" + local35, local132, 0);
					}
				}
			}
			if (Class10_Sub1_Sub1.lb == 0 && local106 != null) {
				for (local116 = 4; local116 >= 0; local116--) {
					if (local106[local116] != null && local106[local116].equalsIgnoreCase(Static41.aString40)) {
						@Pc(229) short local229 = 0;
						if (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107 < local18.anInt1510) {
							local229 = 2000;
						}
						@Pc(242) short local242 = 0;
						if (local116 == 0) {
							local242 = 21;
						}
						if (local116 == 1) {
							local242 = 20;
						}
						if (local116 == 2) {
							local242 = 26;
						}
						if (local116 == 3) {
							local242 = 24;
						}
						if (local116 == 4) {
							local242 = 31;
						}
						if (local242 != 0) {
							local242 += local229;
						}
						Static169.method2996(0, local18.anInt1518, local106[local116], (long) arg0.anInt4036, "<col=ffff00>" + local35, local242, 0);
					}
				}
			}
			Static169.method2996(0, Static53.anInt1290, Static99.aString77, (long) arg0.anInt4036, "<col=ffff00>" + local35, 1011, 0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!lm;)V")
	public static void method1988(@OriginalArg(1) Class134 arg0) {
		Static342.anInt2477 = arg0.method3018("titlebg");
		Static165.anInt3414 = arg0.method3018("logo");
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
	public static void method1990(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static153.aByteArrayArray8;
			local11 = 1;
		} else {
			local11 = 4;
			local9 = Static242.aByteArrayArray15;
		}
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			Static310.method5336();
			for (@Pc(30) int local30 = 0; local30 < Static43.anInt1151 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static260.anInt5348 >> 3; local34++) {
					@Pc(44) int local44 = Static320.anIntArrayArrayArray13[local24][local30][local34];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg0 || local54 == 0) {
							@Pc(64) int local64 = local44 >> 1 & 0x3;
							@Pc(70) int local70 = local44 >> 14 & 0x3FF;
							@Pc(76) int local76 = local44 >> 3 & 0x7FF;
							@Pc(86) int local86 = local76 / 8 + (local70 / 8 << 8);
							for (@Pc(88) int local88 = 0; local88 < Static146.anIntArray446.length; local88++) {
								if (Static146.anIntArray446[local88] == local86 && local9[local88] != null) {
									Static119.method1931(local34 * 8, local9[local88], Static313.aClass17Array1, local54, arg0, local24, (local76 & 0x7) * 8, Static217.aClass105_5, local64, (local70 & 0x7) * 8, local30 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
	public static void method1991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg3 < arg1) {
			for (local14 = arg3; local14 < arg1; local14++) {
				Static319.anIntArrayArray31[local14][arg2] = arg0;
			}
		} else {
			for (local14 = arg1; local14 < arg3; local14++) {
				Static319.anIntArrayArray31[local14][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method1994() {
		if (Static217.aClass105_5.method4285()) {
			Static19.method327();
			Static217.aClass105_5.method4298(Static235.aCanvas6);
			Static74.method1295();
		} else {
			Static20.method360(Static24.anInt437);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!jb;IZ)J")
	public static long method1997(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class79 local15 = Static129.method2097(arg1.method5445());
		@Pc(41) long local41 = (long) (arg1.method5452() << 14 | arg2 | arg0 << 7 | arg1.method5449() << 20 | 0x40000000);
		if (local15.anInt1863 == 0) {
			local41 |= local9;
		}
		if (local15.anInt1859 == 1) {
			local41 |= local5;
		}
		if (local15.aBoolean150) {
			local41 |= local7;
		}
		return local41 | (long) arg1.method5445() << 32;
	}
}
