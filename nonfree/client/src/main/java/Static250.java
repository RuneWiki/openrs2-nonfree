import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_70 = new Class256("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_71 = new Class256("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
	public static void method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static331.anInt5894 <= arg3 && arg4 <= Static351.anInt6176 && Static75.anInt1858 <= arg2 && Static175.anInt3399 >= arg0) {
			if (arg1 == 1) {
				Static307.method4387(arg0, arg4, arg3, arg5, arg2);
			} else {
				Static46.method880(arg3, arg0, arg1, arg4, arg2, arg5);
			}
		} else if (arg1 == 1) {
			Static316.method4520(arg2, arg0, arg4, arg5, arg3);
		} else {
			Static11.method213(arg5, arg3, arg1, arg0, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!bo;ILjava/lang/String;Z)Lclient!bm;")
	public static Class25 method3256(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static343.anIntArray403, 0);
		if (Static343.anIntArray403[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class25(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILclient!cl;IIIIIIIIII)Z")
	public static boolean method3257(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg3;
		@Pc(23) int local23 = arg5 - 64;
		@Pc(28) int local28 = arg3 - 64;
		Static225.anIntArrayArray35[64][64] = 99;
		Static266.anIntArrayArray38[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static378.anIntArray443[0] = arg5;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static351.anIntArray416[0] = arg3;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray6;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(77) int local77;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(244) int local244;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static433.anInt7533 = local9;
									Static369.anInt6567 = local7;
									return false;
								}
								local9 = Static351.anIntArray416[local48];
								local7 = Static378.anIntArray443[local48];
								local48 = local48 + 1 & 0xFFF;
								local77 = local9 - local28;
								local82 = local7 - local23;
								local88 = local7 - arg1.anInt1438;
								local94 = local9 - arg1.anInt1447;
								if (arg7 == -4) {
									if (local7 == arg4 && arg10 == local9) {
										Static433.anInt7533 = local9;
										Static369.anInt6567 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static48.method944(arg2, arg0, arg6, arg4, arg10, arg2, local7, local9)) {
										Static369.anInt6567 = local7;
										Static433.anInt7533 = local9;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg1.method1056(arg2, arg4, arg6, arg0, arg8, local7, local9, arg10, arg2)) {
										Static433.anInt7533 = local9;
										Static369.anInt6567 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg1.method1057(local7, arg6, arg8, local9, arg2, arg4, arg0, arg10)) {
										Static433.anInt7533 = local9;
										Static369.anInt6567 = local7;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg1.method1059(arg4, local7, arg10, arg7, local9, arg2, arg9)) {
										Static369.anInt6567 = local7;
										Static433.anInt7533 = local9;
										return true;
									}
								} else if (arg1.method1055(local7, arg10, local9, arg7, arg2, arg4, arg9)) {
									Static369.anInt6567 = local7;
									Static433.anInt7533 = local9;
									return true;
								}
								local244 = Static266.anIntArrayArray38[local82][local77] + 1;
								if (local82 > 0 && Static225.anIntArrayArray35[local82 - 1][local77] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg2 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg2 - 1) {
											Static378.anIntArray443[local51] = local7 - 1;
											Static351.anIntArray416[local51] = local9;
											Static225.anIntArrayArray35[local82 - 1][local77] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static266.anIntArrayArray38[local82 - 1][local77] = local244;
											break;
										}
										if ((local56[local88 - 1][local94 + local284] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg2 > local82 && Static225.anIntArrayArray35[local82 + 1][local77] == 0 && (local56[arg2 + local88][local94] & 0x60E40000) == 0 && (local56[local88 + arg2][arg2 + local94 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg2 - 1) {
											Static378.anIntArray443[local51] = local7 + 1;
											Static351.anIntArray416[local51] = local9;
											Static225.anIntArrayArray35[local82 + 1][local77] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static266.anIntArrayArray38[local82 + 1][local77] = local244;
											break;
										}
										if ((local56[arg2 + local88][local94 + local284] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 > 0 && Static225.anIntArrayArray35[local82][local77 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg2 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg2 - 1 <= local284) {
											Static378.anIntArray443[local51] = local7;
											Static351.anIntArray416[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static225.anIntArrayArray35[local82][local77 - 1] = 1;
											Static266.anIntArrayArray38[local82][local77 - 1] = local244;
											break;
										}
										if ((local56[local88 + local284][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg2 > local77 && Static225.anIntArrayArray35[local82][local77 + 1] == 0 && (local56[local88][arg2 + local94] & 0x4E240000) == 0 && (local56[arg2 + local88 - 1][arg2 + local94] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg2 - 1) {
											Static378.anIntArray443[local51] = local7;
											Static351.anIntArray416[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static225.anIntArrayArray35[local82][local77 + 1] = 4;
											Static266.anIntArrayArray38[local82][local77 + 1] = local244;
											break;
										}
										if ((local56[local88 + local284][arg2 + local94] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 > 0 && local77 > 0 && Static225.anIntArrayArray35[local82 - 1][local77 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg2 <= local284) {
											Static378.anIntArray443[local51] = local7 - 1;
											Static351.anIntArray416[local51] = local9 - 1;
											Static225.anIntArrayArray35[local82 - 1][local77 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static266.anIntArrayArray38[local82 - 1][local77 - 1] = local244;
											break;
										}
										if ((local56[local88 - 1][local94 + local284 - 1] & 0x4FA40000) != 0 || (local56[local284 + local88 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 < 128 - arg2 && local77 > 0 && Static225.anIntArrayArray35[local82 + 1][local77 - 1] == 0 && (local56[arg2 + local88][local94 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg2) {
											Static378.anIntArray443[local51] = local7 + 1;
											Static351.anIntArray416[local51] = local9 - 1;
											Static225.anIntArrayArray35[local82 + 1][local77 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static266.anIntArrayArray38[local82 + 1][local77 - 1] = local244;
											break;
										}
										if ((local56[local88 + arg2][local284 + local94 - 1] & 0x78E40000) != 0 || (local56[local88 + local284][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local82 > 0 && local77 < 128 - arg2 && Static225.anIntArrayArray35[local82 - 1][local77 + 1] == 0 && (local56[local88 - 1][local94 + arg2] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg2; local284++) {
										if ((local56[local88 - 1][local94 + local284] & 0x4FA40000) != 0 || (local56[local284 + local88 - 1][arg2 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static378.anIntArray443[local51] = local7 - 1;
									Static351.anIntArray416[local51] = local9 + 1;
									Static225.anIntArrayArray35[local82 - 1][local77 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static266.anIntArrayArray38[local82 - 1][local77 + 1] = local244;
								}
							} while (local82 >= 128 - arg2);
						} while (local77 >= 128 - arg2);
					} while (Static225.anIntArrayArray35[local82 + 1][local77 + 1] != 0);
				} while ((local56[local88 + arg2][local94 + arg2] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg2; local284++) {
					if ((local56[local284 + local88][local94 + arg2] & 0x7E240000) != 0 || (local56[local88 + arg2][local284 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static378.anIntArray443[local51] = local7 + 1;
				Static351.anIntArray416[local51] = local9 + 1;
				Static225.anIntArrayArray35[local82 + 1][local77 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local82 + 1][local77 + 1] = local244;
			}
		}
	}
}
