import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!rc;")
	private static Class55 aClass55_253 = Static34.method846("Please remove ");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_250 = aClass55_253;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_251 = Static34.method846("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_252 = Static34.method846("Loaded fonts");

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_254 = Static34.method846("redstone1");

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_255 = Static34.method846("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_256 = aClass55_253;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
	public static int[] anIntArray44 = new int[2000];

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!rc;")
	public static Class55 aClass55_257 = Static34.method846("redstone2");

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	public static int anInt699 = -1;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Lclient!rc;")
	public static Class55 aClass55_258 = aClass55_252;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public static int anInt702 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method451() {
		Static51.aClass6_Sub1_Sub1_3.method1515(215);
		if (Static14.anInt804 != -1) {
			Static98.method1872(Static14.anInt804);
			Static63.aBoolean89 = true;
			Static79.aBoolean106 = true;
			Static67.anInt1986 = -1;
			Static14.anInt804 = -1;
		}
		if (Static1.anInt3 != -1) {
			Static98.method1872(Static1.anInt3);
			Static67.anInt1986 = -1;
			Static72.aBoolean99 = true;
			Static1.anInt3 = -1;
		}
		if (Static76.anInt2217 != -1) {
			Static98.method1872(Static76.anInt2217);
			Static76.anInt2217 = -1;
			Static114.method2097(30);
		}
		if (Static24.anInt1098 != -1) {
			Static98.method1872(Static24.anInt1098);
			Static24.anInt1098 = -1;
		}
		if (Static13.anInt800 != -1) {
			Static98.method1872(Static13.anInt800);
			Static67.anInt1986 = -1;
			Static13.anInt800 = -1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
	public static boolean method452(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!te;I)Z")
	public static boolean method453(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2909;
		if (Static70.anInt2072 == 2) {
			if (local6 == 201) {
				Static72.aBoolean99 = true;
				Static67.aBoolean90 = true;
				Static34.aClass55_506 = Static20.aClass55_344;
				Static34.aClass55_511 = Static34.aClass55_502;
				Static98.anInt2831 = 1;
				Static79.anInt2289 = 0;
			}
			if (local6 == 202) {
				Static34.aClass55_506 = Static27.aClass55_528;
				Static67.aBoolean90 = true;
				Static79.anInt2289 = 0;
				Static34.aClass55_511 = Static34.aClass55_502;
				Static98.anInt2831 = 2;
				Static72.aBoolean99 = true;
			}
		}
		if (local6 == 205) {
			Static100.anInt2949 = 250;
			return true;
		}
		if (local6 == 501) {
			Static34.aClass55_506 = Static101.aClass55_1258;
			Static79.anInt2289 = 0;
			Static72.aBoolean99 = true;
			Static34.aClass55_511 = Static34.aClass55_502;
			Static98.anInt2831 = 4;
			Static67.aBoolean90 = true;
		}
		if (local6 == 502) {
			Static98.anInt2831 = 5;
			Static34.aClass55_511 = Static34.aClass55_502;
			Static67.aBoolean90 = true;
			Static34.aClass55_506 = Static99.aClass55_1219;
			Static79.anInt2289 = 0;
			Static72.aBoolean99 = true;
		}
		@Pc(101) int local101;
		@Pc(105) int local105;
		if (local6 >= 300 && local6 <= 313) {
			local101 = (local6 - 300) / 2;
			local105 = local6 & 0x1;
			Static74.aClass8_3.method335(local105 == 1, local101);
		}
		if (local6 >= 314 && local6 <= 323) {
			local101 = (local6 - 314) / 2;
			local105 = local6 & 0x1;
			Static74.aClass8_3.method325(local101, local105 == 1);
		}
		if (local6 == 324) {
			Static74.aClass8_3.method334(false);
		}
		if (local6 == 325) {
			Static74.aClass8_3.method334(true);
		}
		if (local6 == 326) {
			Static51.aClass6_Sub1_Sub1_3.method1515(240);
			Static74.aClass8_3.method328(Static51.aClass6_Sub1_Sub1_3);
			return true;
		}
		if (local6 == 620) {
			Static90.aBoolean118 = !Static90.aBoolean118;
		}
		if (local6 >= 601 && local6 <= 613) {
			method451();
			if (Static34.aClass55_514.method1674() > 0) {
				Static51.aClass6_Sub1_Sub1_3.method1515(112);
				Static51.aClass6_Sub1_Sub1_3.method1463(Static34.aClass55_514.method1639());
				Static51.aClass6_Sub1_Sub1_3.method1501(local6 - 601);
				Static51.aClass6_Sub1_Sub1_3.method1501(Static90.aBoolean118 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!sb;IIIIBLclient!kb;II)V")
	public static void method456(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class34 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static6.anIntArrayArrayArray1[arg0][arg7][arg3];
		@Pc(27) int local27 = Static6.anIntArrayArrayArray1[arg0][arg7 + 1][arg3];
		@Pc(39) int local39 = Static6.anIntArrayArrayArray1[arg0][arg7 + 1][arg3 + 1];
		@Pc(49) int local49 = Static6.anIntArrayArrayArray1[arg0][arg7][arg3 + 1];
		@Pc(59) int local59 = local49 + local27 + local13 + local39 >> 2;
		@Pc(63) Class6_Sub2_Sub15 local63 = Static8.method333(arg8);
		@Pc(75) int local75 = (arg8 << 14) + (arg3 << 7) + arg7 + 1073741824;
		if (local63.anInt3004 == 0) {
			local75 += Integer.MIN_VALUE;
		}
		@Pc(91) int local91 = arg2 + (arg5 << 6);
		if (local63.anInt2982 == 1) {
			local91 += 256;
		}
		@Pc(120) Class6_Sub2_Sub3 local120;
		if (arg2 == 22) {
			if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
				local120 = local63.method1942(local39, local49, local27, local13, arg5, 22);
			} else {
				local120 = new Class6_Sub2_Sub3_Sub4(arg8, 22, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
			}
			arg6.method1046(arg4, arg7, arg3, local59, local120, local75, local91);
			if (local63.aBoolean150 && local63.anInt3004 == 1) {
				arg1.method1733(arg7, arg3);
			}
			return;
		}
		@Pc(221) int local221;
		if (arg2 == 10 || arg2 == 11) {
			if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
				local120 = local63.method1942(local39, local49, local27, local13, arg5, 10);
			} else {
				local120 = new Class6_Sub2_Sub3_Sub4(arg8, 10, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
			}
			if (local120 != null) {
				@Pc(218) int local218;
				if (arg5 == 1 || arg5 == 3) {
					local221 = local63.anInt2984;
					local218 = local63.anInt2981;
				} else {
					local218 = local63.anInt2984;
					local221 = local63.anInt2981;
				}
				@Pc(231) int local231 = 0;
				if (arg2 == 11) {
					local231 += 256;
				}
				arg6.method1051(arg4, arg7, arg3, local59, local221, local218, local120, local231, local75, local91);
			}
			if (local63.aBoolean150) {
				arg1.method1732(arg7, local63.anInt2984, local63.anInt2981, arg5, local63.aBoolean151, arg3);
			}
		} else if (arg2 >= 12) {
			if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
				local120 = local63.method1942(local39, local49, local27, local13, arg5, arg2);
			} else {
				local120 = new Class6_Sub2_Sub3_Sub4(arg8, arg2, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
			}
			arg6.method1051(arg4, arg7, arg3, local59, 1, 1, local120, 0, local75, local91);
			if (local63.aBoolean150) {
				arg1.method1732(arg7, local63.anInt2984, local63.anInt2981, arg5, local63.aBoolean151, arg3);
			}
		} else if (arg2 == 0) {
			if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
				local120 = local63.method1942(local39, local49, local27, local13, arg5, 0);
			} else {
				local120 = new Class6_Sub2_Sub3_Sub4(arg8, 0, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
			}
			arg6.method1070(arg4, arg7, arg3, local59, local120, null, Static79.anIntArray221[arg5], 0, local75, local91);
			if (local63.aBoolean150) {
				arg1.method1739(local63.aBoolean151, arg2, arg7, arg5, arg3);
			}
		} else if (arg2 == 1) {
			if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
				local120 = local63.method1942(local39, local49, local27, local13, arg5, 1);
			} else {
				local120 = new Class6_Sub2_Sub3_Sub4(arg8, 1, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
			}
			arg6.method1070(arg4, arg7, arg3, local59, local120, null, Static81.anIntArray231[arg5], 0, local75, local91);
			if (local63.aBoolean150) {
				arg1.method1739(local63.aBoolean151, arg2, arg7, arg5, arg3);
			}
		} else {
			@Pc(469) int local469;
			@Pc(499) Class6_Sub2_Sub3 local499;
			if (arg2 == 2) {
				local469 = arg5 + 1 & 0x3;
				@Pc(489) Class6_Sub2_Sub3 local489;
				if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
					local489 = local63.method1942(local39, local49, local27, local13, arg5 + 4, 2);
					local499 = local63.method1942(local39, local49, local27, local13, local469, 2);
				} else {
					local489 = new Class6_Sub2_Sub3_Sub4(arg8, 2, arg5 + 4, local13, local27, local39, local49, local63.anInt3011, true, null);
					local499 = new Class6_Sub2_Sub3_Sub4(arg8, 2, local469, local13, local27, local39, local49, local63.anInt3011, true, null);
				}
				arg6.method1070(arg4, arg7, arg3, local59, local489, local499, Static79.anIntArray221[arg5], Static79.anIntArray221[local469], local75, local91);
				if (local63.aBoolean150) {
					arg1.method1739(local63.aBoolean151, arg2, arg7, arg5, arg3);
				}
			} else if (arg2 == 3) {
				if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
					local120 = local63.method1942(local39, local49, local27, local13, arg5, 3);
				} else {
					local120 = new Class6_Sub2_Sub3_Sub4(arg8, 3, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
				}
				arg6.method1070(arg4, arg7, arg3, local59, local120, null, Static81.anIntArray231[arg5], 0, local75, local91);
				if (local63.aBoolean150) {
					arg1.method1739(local63.aBoolean151, arg2, arg7, arg5, arg3);
				}
			} else if (arg2 == 9) {
				if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
					local120 = local63.method1942(local39, local49, local27, local13, arg5, arg2);
				} else {
					local120 = new Class6_Sub2_Sub3_Sub4(arg8, arg2, arg5, local13, local27, local39, local49, local63.anInt3011, true, null);
				}
				arg6.method1051(arg4, arg7, arg3, local59, 1, 1, local120, 0, local75, local91);
				if (local63.aBoolean150) {
					arg1.method1732(arg7, local63.anInt2984, local63.anInt2981, arg5, local63.aBoolean151, arg3);
				}
			} else {
				if (local63.aBoolean152) {
					if (arg5 == 1) {
						local469 = local49;
						local49 = local39;
						local39 = local27;
						local27 = local13;
						local13 = local469;
					} else if (arg5 == 2) {
						local469 = local49;
						local49 = local27;
						local27 = local469;
						local469 = local39;
						local39 = local13;
						local13 = local469;
					} else if (arg5 == 3) {
						local469 = local49;
						local49 = local13;
						local13 = local27;
						local27 = local39;
						local39 = local469;
					}
				}
				if (arg2 == 4) {
					if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
						local120 = local63.method1942(local39, local49, local27, local13, 0, 4);
					} else {
						local120 = new Class6_Sub2_Sub3_Sub4(arg8, 4, 0, local13, local27, local39, local49, local63.anInt3011, true, null);
					}
					arg6.method1032(arg4, arg7, arg3, local59, local120, Static79.anIntArray221[arg5], arg5 * 512, 0, 0, local75, local91);
				} else if (arg2 == 5) {
					local469 = 16;
					local221 = arg6.method1027(arg4, arg7, arg3);
					if (local221 > 0) {
						local469 = Static8.method333(local221 >> 14 & 0x7FFF).anInt2991;
					}
					if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
						local499 = local63.method1942(local39, local49, local27, local13, 0, 4);
					} else {
						local499 = new Class6_Sub2_Sub3_Sub4(arg8, 4, 0, local13, local27, local39, local49, local63.anInt3011, true, null);
					}
					arg6.method1032(arg4, arg7, arg3, local59, local499, Static79.anIntArray221[arg5], arg5 * 512, local469 * Static102.anIntArray287[arg5], Static108.anIntArray293[arg5] * local469, local75, local91);
				} else if (arg2 == 6) {
					if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
						local120 = local63.method1942(local39, local49, local27, local13, 0, 4);
					} else {
						local120 = new Class6_Sub2_Sub3_Sub4(arg8, 4, 0, local13, local27, local39, local49, local63.anInt3011, true, null);
					}
					arg6.method1032(arg4, arg7, arg3, local59, local120, 256, arg5, 0, 0, local75, local91);
				} else if (arg2 == 7) {
					if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
						local120 = local63.method1942(local39, local49, local27, local13, 0, 4);
					} else {
						local120 = new Class6_Sub2_Sub3_Sub4(arg8, 4, 0, local13, local27, local39, local49, local63.anInt3011, true, null);
					}
					arg6.method1032(arg4, arg7, arg3, local59, local120, 512, arg5, 0, 0, local75, local91);
				} else if (arg2 == 8) {
					if (local63.anInt3011 == -1 && local63.anIntArray278 == null) {
						local120 = local63.method1942(local39, local49, local27, local13, 0, 4);
					} else {
						local120 = new Class6_Sub2_Sub3_Sub4(arg8, 4, 0, local13, local27, local39, local49, local63.anInt3011, true, null);
					}
					arg6.method1032(arg4, arg7, arg3, local59, local120, 768, arg5, 0, 0, local75, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method457() {
		aClass55_255 = null;
		aClass55_252 = null;
		anIntArray44 = null;
		aClass55_253 = null;
		aClass6_Sub2_Sub2_Sub1_4 = null;
		aClass55_258 = null;
		aClass55_251 = null;
		aClass55_250 = null;
		aClass55_257 = null;
		aClass55_254 = null;
		aClass55_256 = null;
	}
}
