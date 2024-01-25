import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array8;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Cancel";

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt760 = 0;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString33 = "Discard";

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	public static void method686(@OriginalArg(1) int arg0) {
		if (arg0 == Static256.anInt4752) {
			return;
		}
		Static153.anInt2883 = Static246.anInt4606 = Static172.anIntArray388[arg0];
		Static289.aClass81_7.method3019(50, (int) ((double) Static153.anInt2883 * 34.46D));
		Static215.anIntArrayArray145 = new int[Static153.anInt2883][Static246.anInt4606];
		Static280.anIntArrayArray175 = new int[Static153.anInt2883][Static246.anInt4606];
		Static176.anIntArrayArrayArray5 = new int[4][Static153.anInt2883 >> 3][Static246.anInt4606 >> 3];
		for (@Pc(51) int local51 = 0; local51 < 4; local51++) {
			Static334.aClass27Array1[local51] = Static203.method3669(Static153.anInt2883, Static246.anInt4606);
		}
		Static37.aByteArrayArrayArray2 = new byte[4][Static153.anInt2883][Static246.anInt4606];
		Static183.method3474(Static246.anInt4606, Static153.anInt2883);
		Static16.method281(Static246.anInt4606 >> 3, Static153.anInt2883 >> 3, Static289.aClass81_7);
		Static256.anInt4752 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method687(@OriginalArg(0) Class44_Sub4_Sub4 arg0) {
		arg0.aBoolean355 = false;
		@Pc(18) Class24 local18;
		if (arg0.anInt5116 != -1) {
			local18 = Static209.method3737(arg0.anInt5116);
			if (local18 == null || local18.anIntArray64 == null) {
				arg0.anInt5116 = -1;
				arg0.aBoolean358 = false;
			} else {
				label297: {
					arg0.anInt5114++;
					if (local18.anIntArray64.length > arg0.anInt5129 && local18.anIntArray66[arg0.anInt5129] < arg0.anInt5114) {
						arg0.anInt5114 = 1;
						arg0.anInt5129++;
						arg0.anInt5091++;
						Static203.method3667(arg0.anInt5129, arg0.anInt6339, local18, arg0.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0);
					}
					if (arg0.anInt5129 >= local18.anIntArray64.length) {
						arg0.anInt5114 = 0;
						arg0.anInt5129 = 0;
						if (arg0.aBoolean358) {
							arg0.anInt5116 = arg0.method4716().method3453();
							if (arg0.anInt5116 == -1) {
								arg0.aBoolean358 = false;
								break label297;
							}
							local18 = Static209.method3737(arg0.anInt5116);
						}
						Static203.method3667(arg0.anInt5129, arg0.anInt6339, local18, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
					}
					arg0.anInt5091 = arg0.anInt5129 + 1;
					if (arg0.anInt5091 >= local18.anIntArray64.length) {
						arg0.anInt5091 = 0;
					}
				}
			}
		}
		@Pc(185) Class24 local185;
		if (arg0.anInt5148 != -1 && Static76.anInt2853 >= arg0.anInt5088) {
			@Pc(174) Class166 local174 = Static62.method999(arg0.anInt5148);
			@Pc(177) int local177 = local174.anInt4753;
			if (local177 == -1) {
				arg0.anInt5148 = -1;
			} else {
				label299: {
					local185 = Static209.method3737(local177);
					if (local174.aBoolean336) {
						if (local185.anInt595 == 3) {
							if (arg0.anInt5158 > 0 && Static76.anInt2853 >= arg0.anInt5084 && arg0.anInt5134 < Static76.anInt2853) {
								arg0.anInt5148 = -1;
								break label299;
							}
						} else if (local185.anInt595 == 1 && arg0.anInt5158 > 0 && Static76.anInt2853 >= arg0.anInt5084 && arg0.anInt5134 < Static76.anInt2853) {
							arg0.anInt5088 = Static76.anInt2853 + 1;
							break label299;
						}
					}
					if (local185 == null || local185.anIntArray64 == null) {
						arg0.anInt5148 = -1;
					} else {
						if (arg0.anInt5107 < 0) {
							arg0.anInt5107 = 0;
							Static203.method3667(0, arg0.anInt6339, local185, arg0.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0);
						}
						arg0.anInt5122++;
						if (local185.anIntArray64.length > arg0.anInt5107 && arg0.anInt5122 > local185.anIntArray66[arg0.anInt5107]) {
							arg0.anInt5122 = 1;
							arg0.anInt5107++;
							Static203.method3667(arg0.anInt5107, arg0.anInt6339, local185, arg0.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0);
						}
						if (arg0.anInt5107 >= local185.anIntArray64.length) {
							if (local174.aBoolean336) {
								arg0.anInt5107 -= local185.anInt586;
								arg0.anInt5104++;
								if (local185.anInt589 <= arg0.anInt5104) {
									arg0.anInt5148 = -1;
								} else if (arg0.anInt5107 >= 0 && arg0.anInt5107 < local185.anIntArray64.length) {
									Static203.method3667(arg0.anInt5107, arg0.anInt6339, local185, arg0.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0);
								} else {
									arg0.anInt5148 = -1;
								}
							} else {
								arg0.anInt5148 = -1;
							}
						}
						arg0.anInt5147 = arg0.anInt5107 + 1;
						if (arg0.anInt5147 >= local185.anIntArray64.length) {
							if (local174.aBoolean336) {
								arg0.anInt5147 -= local185.anInt586;
								if (local185.anInt589 <= arg0.anInt5104 + 1) {
									arg0.anInt5147 = -1;
								} else if (arg0.anInt5147 < 0 || local185.anIntArray64.length <= arg0.anInt5147) {
									arg0.anInt5147 = -1;
								}
							} else {
								arg0.anInt5147 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5099 != -1 && arg0.anInt5118 <= 1) {
			local18 = Static209.method3737(arg0.anInt5099);
			if (local18.anInt595 == 3) {
				if (arg0.anInt5158 > 0 && Static76.anInt2853 >= arg0.anInt5084 && Static76.anInt2853 > arg0.anInt5134) {
					arg0.anInt5099 = -1;
				}
			} else if (local18.anInt595 == 1 && arg0.anInt5158 > 0 && Static76.anInt2853 >= arg0.anInt5084 && arg0.anInt5134 < Static76.anInt2853) {
				arg0.anInt5118 = 2;
			}
		}
		if (arg0.anInt5099 != -1 && arg0.anInt5118 == 0) {
			local18 = Static209.method3737(arg0.anInt5099);
			if (local18 == null || local18.anIntArray64 == null) {
				arg0.anInt5099 = -1;
			} else {
				arg0.anInt5119++;
				if (local18.anIntArray64.length > arg0.anInt5152 && local18.anIntArray66[arg0.anInt5152] < arg0.anInt5119) {
					arg0.anInt5152++;
					arg0.anInt5119 = 1;
					Static203.method3667(arg0.anInt5152, arg0.anInt6339, local18, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
				}
				if (local18.anIntArray64.length <= arg0.anInt5152) {
					arg0.anInt5144++;
					arg0.anInt5152 -= local18.anInt586;
					if (local18.anInt589 <= arg0.anInt5144) {
						arg0.anInt5099 = -1;
					} else if (arg0.anInt5152 >= 0 && arg0.anInt5152 < local18.anIntArray64.length) {
						Static203.method3667(arg0.anInt5152, arg0.anInt6339, local18, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
					} else {
						arg0.anInt5099 = -1;
					}
				}
				arg0.anInt5133 = arg0.anInt5152 + 1;
				if (local18.anIntArray64.length <= arg0.anInt5133) {
					arg0.anInt5133 -= local18.anInt586;
					if (local18.anInt589 <= arg0.anInt5144 + 1) {
						arg0.anInt5133 = -1;
					} else if (arg0.anInt5133 < 0 || arg0.anInt5133 >= local18.anIntArray64.length) {
						arg0.anInt5133 = -1;
					}
				}
				arg0.aBoolean355 = local18.aBoolean45;
			}
		}
		if (arg0.anInt5118 > 0) {
			arg0.anInt5118--;
		}
		for (@Pc(738) int local738 = 0; local738 < arg0.aClass192Array3.length; local738++) {
			@Pc(745) Class192 local745 = arg0.aClass192Array3[local738];
			if (local745 != null) {
				if (local745.anInt5791 > 0) {
					local745.anInt5791--;
				} else {
					local185 = Static209.method3737(local745.anInt5797);
					if (local185 == null || local185.anIntArray64 == null) {
						arg0.aClass192Array3[local738] = null;
					} else {
						local745.anInt5796++;
						if (local745.anInt5792 < local185.anIntArray64.length && local745.anInt5796 > local185.anIntArray66[local745.anInt5792]) {
							local745.anInt5796 = 1;
							local745.anInt5792++;
							Static203.method3667(local745.anInt5792, arg0.anInt6339, local185, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
						}
						if (local745.anInt5792 >= local185.anIntArray64.length) {
							local745.anInt5792 -= local185.anInt586;
							local745.anInt5789++;
							if (local185.anInt589 <= local745.anInt5789) {
								arg0.aClass192Array3[local738] = null;
							} else if (local745.anInt5792 >= 0 && local185.anIntArray64.length > local745.anInt5792) {
								Static203.method3667(local745.anInt5792, arg0.anInt6339, local185, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
							} else {
								arg0.aClass192Array3[local738] = null;
							}
						}
						local745.anInt5786 = local745.anInt5792 + 1;
						if (local185.anIntArray64.length <= local745.anInt5786) {
							local745.anInt5786 -= local185.anInt586;
							if (local745.anInt5789 + 1 >= local185.anInt589) {
								local745.anInt5786 = -1;
							} else if (local745.anInt5786 < 0 || local745.anInt5786 >= local185.anIntArray64.length) {
								local745.anInt5786 = -1;
							}
						}
					}
				}
			}
		}
	}
}
