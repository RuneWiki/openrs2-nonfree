import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!oi;")
	public static Class185 aClass185_119;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "S")
	public static short aShort114 = 32767;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt7228 = 0;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public static int anInt7231 = 0;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method5854(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return local40 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!hm;)Ljava/lang/String;")
	public static String method5855(@OriginalArg(1) Class107 arg0) {
		if (Static55.method767(arg0).method3034() == 0) {
			return null;
		} else if (arg0.aString25 == null || arg0.aString25.trim().length() == 0) {
			return Static312.aBoolean465 ? "Hidden-use" : null;
		} else {
			return arg0.aString25;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)V")
	public static void method5856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg1, 9);
		local8.method384();
		local8.anInt387 = arg0;
		local8.anInt381 = arg2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	public static void method5858() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static71.aClass216ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static71.aClass216ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static174.anInt2873; local6++) {
					for (local9 = 0; local9 < Static325.anInt5351; local9++) {
						if (Static71.aClass216ArrayArrayArray1[local3][local6][local9] != null) {
							Static71.aClass216ArrayArrayArray1[local3][local6][local9].method4559();
						}
						Static71.aClass216ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static71.aClass216ArrayArrayArray1 = null;
		Static157.aClass139Array1 = null;
		if (Static165.aClass216ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static165.aClass216ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static174.anInt2873; local6++) {
					for (local9 = 0; local9 < Static325.anInt5351; local9++) {
						if (Static165.aClass216ArrayArrayArray2[local3][local6][local9] != null) {
							Static165.aClass216ArrayArrayArray2[local3][local6][local9].method4559();
						}
						Static165.aClass216ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static165.aClass216ArrayArrayArray2 = null;
		Static397.aClass139Array2 = null;
		Static259.aClass216ArrayArrayArray3 = null;
		Static452.aClass139Array3 = null;
		Static269.anInt4694 = 0;
		if (Static350.aClass254Array2 != null) {
			for (local3 = 0; local3 < Static269.anInt4694; local3++) {
				Static350.aClass254Array2[local3] = null;
			}
		}
		if (Static56.aClass11_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static24.anInt352; local3++) {
				Static56.aClass11_Sub1Array1[local3] = null;
			}
			Static24.anInt352 = 0;
		}
		if (Static203.aClass93Array1 != null) {
			for (local3 = 0; local3 < Static395.anInt6364; local3++) {
				Static203.aClass93Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static112.anInt1710; local6++) {
				for (local9 = 0; local9 < Static174.anInt2873; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static325.anInt5351; local160++) {
						Static404.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static395.anInt6364 = 0;
		}
		Static148.anIntArrayArrayArray2 = null;
		Static334.method4390();
		Static181.aClass63_2.method1025();
		Static240.aByteArrayArray81 = null;
		Static105.anIntArrayArray18 = null;
		Static425.aShortArrayArray9 = null;
		Static352.aClass12_1 = null;
		Static378.aClass34_7 = null;
		Static335.aClass117_6 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLclient!et;)V")
	public static void method5860(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class11_Sub1_Sub3_Sub1 arg1) {
		if (Static76.anInt1078 >= 400) {
			return;
		}
		@Pc(14) Class272 local14 = arg1.aClass272_1;
		if (local14.anIntArray543 != null) {
			local14 = local14.method5900(Static32.aClass4_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean638) {
			return;
		}
		@Pc(37) String local37 = local14.aString70;
		if (local14.anInt7322 != 0) {
			@Pc(56) String local56 = Static94.aClass148_3 == Static93.aClass148_2 ? Static286.aClass142_71.method3118(Static63.anInt981) : Static304.aClass142_12.method3118(Static63.anInt981);
			local37 = local37 + Static20.method310(local14.anInt7322, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369) + " (" + local56 + local14.anInt7322 + ")";
		}
		if (!Static290.aBoolean449) {
			if (!arg0) {
				@Pc(145) String[] local145 = local14.aStringArray52;
				if (Static160.aBoolean269) {
					local145 = Static416.method5325(local145);
				}
				@Pc(155) int local155;
				if (local145 != null) {
					for (local155 = 4; local155 >= 0; local155--) {
						if (local145[local155] != null && (local14.aByte101 == 0 || !local145[local155].equalsIgnoreCase(Static268.aClass142_67.method3118(Static63.anInt981)))) {
							@Pc(178) byte local178 = 0;
							@Pc(180) int local180 = Static93.anInt1257;
							if (local155 == 0) {
								local178 = 30;
							}
							if (local155 == 1) {
								local178 = 16;
							}
							if (local155 == 2) {
								local178 = 48;
							}
							if (local155 == 3) {
								local178 = 3;
							}
							if (local155 == 4) {
								local178 = 22;
							}
							if (local14.lb == local155) {
								local180 = local14.anInt7314;
							}
							if (local155 == local14.anInt7320) {
								local180 = local14.anInt7330;
							}
							Static213.method3090((long) arg1.anInt3279, local145[local155], "<col=ffff00>" + local37, 0, local145[local155].equalsIgnoreCase(Static268.aClass142_67.method3118(Static63.anInt981)) ? local14.anInt7319 : local180, false, 0, local178, true, -1);
						}
					}
				}
				if (local14.aByte101 == 1 && local145 != null) {
					for (local155 = 4; local155 >= 0; local155--) {
						if (local145[local155] != null && local145[local155].equalsIgnoreCase(Static268.aClass142_67.method3118(Static63.anInt981))) {
							@Pc(295) short local295 = 0;
							if (local14.anInt7322 > Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369) {
								local295 = 2000;
							}
							@Pc(304) short local304 = 0;
							if (local155 == 0) {
								local304 = 30;
							}
							if (local155 == 1) {
								local304 = 16;
							}
							if (local155 == 2) {
								local304 = 48;
							}
							if (local155 == 3) {
								local304 = 3;
							}
							if (local155 == 4) {
								local304 = 22;
							}
							if (local304 != 0) {
								local304 += local295;
							}
							Static213.method3090((long) arg1.anInt3279, local145[local155], "<col=ffff00>" + local37, 0, local14.anInt7319, false, 0, local304, true, -1);
						}
					}
				}
			}
			Static213.method3090((long) arg1.anInt3279, Static355.aClass142_88.method3118(Static63.anInt981), "<col=ffff00>" + local37, 0, Static52.anInt742, arg0, 0, 1009, true, -1);
		} else if (!arg0) {
			@Pc(94) Class45 local94 = Static228.anInt5703 == -1 ? null : Static256.aClass136_1.method3016(Static228.anInt5703);
			if ((Static226.anInt4102 & 0x2) != 0) {
				if (local94 == null || local14.method5907(Static228.anInt5703, local94.anInt953) != local94.anInt953) {
					Static213.method3090((long) arg1.anInt3279, Static28.aString5, Static392.aString62 + " -> <col=ffff00>" + local37, 0, Static313.anInt5165, false, 0, 46, true, -1);
				}
				return;
			}
		}
	}
}
