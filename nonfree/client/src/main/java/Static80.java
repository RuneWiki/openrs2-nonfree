import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
	public static int anInt1718;

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
	public static int anInt1719 = -1;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIILclient!vg;)V")
	public static void method1496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11_Sub1_Sub1_Sub2 arg3) {
		@Pc(9) Class165 local9 = arg3.method2761();
		@Pc(22) int local22 = arg3.anInt3240 - arg3.aClass82_7.anInt2146 & 0x3FFF;
		if (arg1 == -1) {
			if (local22 != 0 || arg3.anInt3288 > 25) {
				if (arg0 < 0 && local9.anInt4903 != -1) {
					arg3.anInt3253 = local9.anInt4903;
					arg3.aBoolean275 = false;
				} else if (arg0 <= 0 || local9.anInt4915 == -1) {
					arg3.anInt3253 = local9.anInt4908;
				} else {
					arg3.anInt3253 = local9.anInt4915;
				}
				arg3.aBoolean275 = false;
			} else if (!arg3.aBoolean275 || !local9.method4048(arg3.anInt3253)) {
				arg3.anInt3253 = local9.method4056();
				arg3.aBoolean275 = arg3.anInt3253 != -1;
			}
		} else if (arg3.anInt3278 != -1 && (local22 >= 10240 || local22 <= 2048)) {
			@Pc(48) int local48 = Static242.anIntArray326[arg2] - arg3.aClass82_7.anInt2146 & 0x3FFF;
			if (arg1 == 2 && local9.anInt4881 != -1) {
				if (local48 > 2048 && local48 <= 6144 && local9.anInt4905 != -1) {
					arg3.anInt3253 = local9.anInt4905;
				} else if (local48 >= 10240 && local48 < 14336 && local9.anInt4875 != -1) {
					arg3.anInt3253 = local9.anInt4875;
				} else if (local48 <= 6144 || local48 >= 10240 || local9.anInt4914 == -1) {
					arg3.anInt3253 = local9.anInt4881;
				} else {
					arg3.anInt3253 = local9.anInt4914;
				}
			} else if (arg1 == 0 && local9.anInt4899 != -1) {
				if (local48 > 2048 && local48 <= 6144 && local9.anInt4902 != -1) {
					arg3.anInt3253 = local9.anInt4902;
				} else if (local48 >= 10240 && local48 < 14336 && local9.anInt4910 != -1) {
					arg3.anInt3253 = local9.anInt4910;
				} else if (local48 <= 6144 || local48 >= 10240 || local9.anInt4916 == -1) {
					arg3.anInt3253 = local9.anInt4899;
				} else {
					arg3.anInt3253 = local9.anInt4916;
				}
			} else if (local48 > 2048 && local48 <= 6144 && local9.anInt4918 != -1) {
				arg3.anInt3253 = local9.anInt4918;
			} else if (local48 >= 10240 && local48 < 14336 && local9.anInt4913 != -1) {
				arg3.anInt3253 = local9.anInt4913;
			} else if (local48 <= 6144 || local48 >= 10240 || local9.anInt4888 == -1) {
				arg3.anInt3253 = local9.anInt4908;
			} else {
				arg3.anInt3253 = local9.anInt4888;
			}
			arg3.aBoolean275 = false;
		} else if (local22 == 0 && arg3.anInt3288 <= 25) {
			arg3.aBoolean275 = false;
			if (arg1 == 2 && local9.anInt4881 != -1) {
				arg3.anInt3253 = local9.anInt4881;
			} else if (arg1 == 0 && local9.anInt4899 != -1) {
				arg3.anInt3253 = local9.anInt4899;
			} else {
				arg3.anInt3253 = local9.anInt4908;
			}
		} else {
			if (arg1 == 2 && local9.anInt4881 != -1) {
				if (arg0 < 0 && local9.anInt4900 != -1) {
					arg3.anInt3253 = local9.anInt4900;
				} else if (arg0 <= 0 || local9.anInt4887 == -1) {
					arg3.anInt3253 = local9.anInt4881;
				} else {
					arg3.anInt3253 = local9.anInt4887;
				}
			} else if (arg1 == 0 && local9.anInt4899 != -1) {
				if (arg0 < 0 && local9.anInt4897 != -1) {
					arg3.anInt3253 = local9.anInt4897;
				} else if (arg0 <= 0 || local9.anInt4879 == -1) {
					arg3.anInt3253 = local9.anInt4899;
				} else {
					arg3.anInt3253 = local9.anInt4879;
				}
			} else if (arg0 < 0 && local9.anInt4889 != -1) {
				arg3.anInt3253 = local9.anInt4889;
			} else if (arg0 <= 0 || local9.anInt4901 == -1) {
				arg3.anInt3253 = local9.anInt4908;
			} else {
				arg3.anInt3253 = local9.anInt4901;
			}
			arg3.aBoolean275 = false;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method1497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static253.aBoolean399 = true;
		Static148.aBoolean298 = Static328.aClass87_6.method7953() > 0;
		Static481.aBoolean615 = true;
		Static623.anInt9563 = arg1 >> Static415.anInt7579;
		Static507.anInt8547 = arg3 >> Static415.anInt7579;
		Static60.anInt1260 = arg1;
		Static558.anInt9264 = arg3;
		Static532.anInt8897 = arg2;
		Static299.anInt5579 = Static623.anInt9563 - Static319.anInt5795;
		if (Static299.anInt5579 < 0) {
			Static447.anInt7906 = -Static299.anInt5579;
			Static299.anInt5579 = 0;
		} else {
			Static447.anInt7906 = 0;
		}
		Static171.anInt3808 = Static507.anInt8547 - Static319.anInt5795;
		if (Static171.anInt3808 < 0) {
			Static223.anInt4590 = -Static171.anInt3808;
			Static171.anInt3808 = 0;
		} else {
			Static223.anInt4590 = 0;
		}
		Static181.anInt4006 = Static623.anInt9563 + Static319.anInt5795;
		if (Static181.anInt4006 > Static347.anInt6411) {
			Static181.anInt4006 = Static347.anInt6411;
		}
		Static466.anInt4484 = Static507.anInt8547 + Static319.anInt5795;
		if (Static466.anInt4484 > Static191.anInt6006) {
			Static466.anInt4484 = Static191.anInt6006;
		}
		@Pc(72) boolean[][] local72 = Static36.aBooleanArrayArray2;
		@Pc(74) boolean[][] local74 = Static38.aBooleanArrayArray3;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static481.aBoolean615) {
			for (local78 = 0; local78 < Static319.anInt5795 + Static319.anInt5795 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static319.anInt5795 + Static319.anInt5795 + 2; local85++) {
					if (local85 > 1) {
						Static607.anIntArray692[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static623.anInt9563 + local78 - Static319.anInt5795;
					@Pc(109) int local109 = Static507.anInt8547 + local85 - Static319.anInt5795;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static347.anInt6411 && local109 < Static191.anInt6006) {
						local123 = local103 << Static415.anInt7579;
						@Pc(127) int local127 = local109 << Static415.anInt7579;
						@Pc(144) int local144 = Static178.aClass112Array2[Static178.aClass112Array2.length - 1].method7819(local109, local103) - (0x3E8 << Static415.anInt7579 - 7);
						@Pc(166) int local166 = Static164.aClass112Array1 == null ? Static178.aClass112Array2[0].method7819(local109, local103) + Static312.anInt5690 : Static164.aClass112Array1[0].method7819(local109, local103) + Static312.anInt5690;
						local83 = arg15 >= 0 ? Static328.aClass87_6.r(local123, local144, local127, local123, local166, local127, arg15) : Static328.aClass87_6.JA(local123, local144, local127, local123, local166, local127);
						Static38.aBooleanArrayArray3[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static38.aBooleanArrayArray3[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static607.anIntArray692[local85 - 1] & Static607.anIntArray692[local85] & local81 & local83;
						Static36.aBooleanArrayArray2[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static607.anIntArray692[Static319.anInt5795 + Static319.anInt5795] = local81;
				Static607.anIntArray692[Static319.anInt5795 + Static319.anInt5795 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static253.aBoolean399 = false;
			} else {
				Static35.anIntArray102 = arg5;
				Static7.anIntArray5 = arg6;
				Static285.anIntArray365 = arg7;
				Static363.anIntArray430 = arg8;
				Static326.anIntArray402 = arg9;
				Static7.method128(arg10, Static328.aClass87_6);
			}
		} else {
			if (Static105.aBooleanArrayArray6 == null) {
				Static105.aBooleanArrayArray6 = new boolean[Static347.anInt6411 + Static347.anInt6411 + 1][Static191.anInt6006 + Static347.anInt6411 + 1];
			}
			for (local78 = 0; local78 < Static105.aBooleanArrayArray6.length; local78++) {
				for (local81 = 0; local81 < Static105.aBooleanArrayArray6[0].length; local81++) {
					Static105.aBooleanArrayArray6[local78][local81] = true;
				}
			}
			Static38.aBooleanArrayArray3 = Static105.aBooleanArrayArray6;
			Static36.aBooleanArrayArray2 = Static105.aBooleanArrayArray6;
			Static299.anInt5579 = 0;
			Static171.anInt3808 = 0;
			Static181.anInt4006 = Static347.anInt6411;
			Static466.anInt4484 = Static191.anInt6006;
			Static253.aBoolean399 = false;
		}
		Static626.method8468(Static328.aClass87_6);
		if (!Static98.aClass329_2.aBoolean671) {
			@Pc(349) Class143 local349 = Static98.aClass329_2.aClass143_8;
			for (@Pc(354) Class11_Sub10 local354 = (Class11_Sub10) local349.method3536(); local354 != null; local354 = (Class11_Sub10) local349.method3528()) {
				local354.method8372();
				Static186.method3340(local354);
			}
		}
		if (Static148.aBoolean298) {
			for (local78 = 0; local78 < Static140.anInt3097; local78++) {
				Static302.aClass93Array1[local78].method2514(arg0, arg14);
			}
		}
		if (Static501.aBoolean631) {
			Static512.anIntArray588 = Static328.aClass87_6.Y();
			Static328.aClass87_6.K(Static42.anIntArray105);
			local78 = (Static42.anIntArray105[2] - Static42.anIntArray105[0]) / Static37.anInt925;
			for (local81 = 0; local81 < Static37.anInt925 - 1; local81++) {
				Static643.anIntArray750[local81] = local78 * (local81 + 1) + Static641.anIntArray741[local81];
			}
			for (local83 = 0; local83 < Static408.aClass235Array1.length; local83++) {
				Static408.aClass235Array1[local83].method5773();
			}
		}
		if (Static204.aClass217ArrayArrayArray2 != null) {
			if (Static501.aBoolean631) {
				Static121.method2491(0);
			}
			Static364.method5552(true);
			Static328.aClass87_6.ra(-1, 1583160, 40, 127);
			Static53.method1015(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static501.aBoolean631) {
				Static419.method6388();
			}
			Static328.aClass87_6.pa();
			Static364.method5552(false);
		}
		Static53.method1015(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static501.aBoolean631) {
			for (local78 = 0; local78 < Static330.anInt4381; local78++) {
				Static425.aBooleanArrayArrayArray5[local78] = Static295.aBooleanArrayArrayArray6[local78];
			}
			Static121.method2491(0);
			for (local81 = 0; local81 < Static408.aClass235Array1.length; local81++) {
				Static408.aClass235Array1[local81].method5773();
			}
		}
		if (Static501.aBoolean631) {
			Static419.method6388();
			for (local78 = 0; local78 < Static330.anInt4381; local78++) {
				Static295.aBooleanArrayArrayArray6[local78] = Static425.aBooleanArrayArrayArray5[local78];
			}
			if (Static621.anInt10092 == 2) {
				@Pc(543) int local543;
				if (Static479.aLongArray14[0] < Static479.aLongArray14[1]) {
					if (Static643.anIntArray750[0] + Static641.anIntArray741[0] > Static42.anIntArray105[0]) {
						local543 = Static641.anIntArray741[0]++;
					}
				} else if (Static479.aLongArray14[0] > Static479.aLongArray14[1] && Static643.anIntArray750[0] + Static641.anIntArray741[0] < Static42.anIntArray105[2]) {
					local543 = Static641.anIntArray741[0]--;
				}
			}
		}
		if (!Static481.aBoolean615) {
			Static36.aBooleanArrayArray2 = local72;
			Static38.aBooleanArrayArray3 = local74;
		}
		Static405.method6250();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!dm;II)Ljava/lang/String;")
	public static String method1498(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1) {
		if (!Static69.method1332(arg0).method6407(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray5 == null || arg1 >= arg0.aStringArray5.length || arg0.aStringArray5[arg1] == null || arg0.aStringArray5[arg1].trim().length() == 0) {
			return Static612.aBoolean735 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray5[arg1];
		}
	}
}
