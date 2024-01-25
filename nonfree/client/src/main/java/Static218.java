import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!gj;")
	public static Class124 aClass124_5;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_64 = new Class100(0, 16);

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	public static int anInt4113 = 0;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public static int anInt4114 = -60;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ha;Lclient!rca;II)V")
	public static void method3409(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class296 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		if (Static368.anIntArray494 != null && arg1.aByte131 >= arg2) {
			for (local13 = 0; local13 < Static368.anIntArray494.length; local13++) {
				if (Static368.anIntArray494[local13] != -1000000 && (Static368.anIntArray494[local13] >= arg1.anIntArray657[0] || arg1.anIntArray657[1] <= Static368.anIntArray494[local13] || arg1.anIntArray657[2] <= Static368.anIntArray494[local13] || Static368.anIntArray494[local13] >= arg1.anIntArray657[3]) && (Static159.anIntArray614[local13] >= arg1.anIntArray658[0] || Static159.anIntArray614[local13] >= arg1.anIntArray658[1] || Static159.anIntArray614[local13] >= arg1.anIntArray658[2] || Static159.anIntArray614[local13] >= arg1.anIntArray658[3]) && (Static613.anIntArray754[local13] <= arg1.anIntArray658[0] || Static613.anIntArray754[local13] <= arg1.anIntArray658[1] || Static613.anIntArray754[local13] <= arg1.anIntArray658[2] || Static613.anIntArray754[local13] <= arg1.anIntArray658[3]) && (Static453.anIntArray604[local13] >= arg1.anIntArray659[0] || arg1.anIntArray659[1] <= Static453.anIntArray604[local13] || arg1.anIntArray659[2] <= Static453.anIntArray604[local13] || arg1.anIntArray659[3] <= Static453.anIntArray604[local13]) && (Static341.anIntArray460[local13] <= arg1.anIntArray659[0] || Static341.anIntArray460[local13] <= arg1.anIntArray659[1] || Static341.anIntArray460[local13] <= arg1.anIntArray659[2] || arg1.anIntArray659[3] >= Static341.anIntArray460[local13])) {
					return;
				}
			}
		}
		@Pc(248) int local248;
		@Pc(272) int local272;
		@Pc(291) boolean local291;
		@Pc(318) float local318;
		if (arg1.aByte130 == 1) {
			local13 = arg1.aShort91 + Static64.anInt1476 - Static358.anInt6609;
			if (local13 >= 0 && Static64.anInt1476 + Static64.anInt1476 >= local13) {
				local248 = Static64.anInt1476 + arg1.aShort92 - Static297.anInt5235;
				if (local248 < 0) {
					local248 = 0;
				} else if (Static64.anInt1476 + Static64.anInt1476 < local248) {
					return;
				}
				local272 = arg1.aShort90 + Static64.anInt1476 - Static297.anInt5235;
				if (Static64.anInt1476 + Static64.anInt1476 < local272) {
					local272 = Static64.anInt1476 + Static64.anInt1476;
				} else if (local272 < 0) {
					return;
				}
				local291 = false;
				while (local248 <= local272) {
					if (Static255.aBooleanArrayArray2[local13][local248++]) {
						local291 = true;
						break;
					}
				}
				if (local291) {
					local318 = (float) (Static335.anInt6337 - arg1.anIntArray658[0]);
					if (local318 < 0.0F) {
						local318 *= -1.0F;
					}
					if (!local318 < (float) Static552.anInt9411 && (Static445.method5102(0, arg1) && (Static445.method5102(1, arg1) && (Static445.method5102(2, arg1) && Static445.method5102(3, arg1))))) {
						Static622.aClass296Array3[Static157.anInt3110++] = arg1;
					}
				}
			}
		} else if (arg1.aByte130 == 2) {
			local13 = Static64.anInt1476 + arg1.aShort92 - Static297.anInt5235;
			if (local13 >= 0 && Static64.anInt1476 + Static64.anInt1476 >= local13) {
				local248 = Static64.anInt1476 + arg1.aShort91 - Static358.anInt6609;
				if (local248 < 0) {
					local248 = 0;
				} else if (Static64.anInt1476 + Static64.anInt1476 < local248) {
					return;
				}
				local272 = arg1.aShort93 + Static64.anInt1476 - Static358.anInt6609;
				if (local272 > Static64.anInt1476 + Static64.anInt1476) {
					local272 = Static64.anInt1476 + Static64.anInt1476;
				} else if (local272 < 0) {
					return;
				}
				local291 = false;
				while (local272 >= local248) {
					if (Static255.aBooleanArrayArray2[local248++][local13]) {
						local291 = true;
						break;
					}
				}
				if (local291) {
					local318 = (float) (Static496.anInt8826 - arg1.anIntArray659[0]);
					if (local318 < 0.0F) {
						local318 *= -1.0F;
					}
					if (!((float) Static552.anInt9411 > local318) && (Static445.method5102(0, arg1) && (Static445.method5102(1, arg1) && (Static445.method5102(2, arg1) && Static445.method5102(3, arg1))))) {
						Static622.aClass296Array3[Static157.anInt3110++] = arg1;
					}
				}
			}
		} else if (arg1.aByte130 == 16 || arg1.aByte130 == 8) {
			local13 = arg1.aShort91 + Static64.anInt1476 - Static358.anInt6609;
			if (local13 >= 0 && local13 <= Static64.anInt1476 + Static64.anInt1476) {
				local248 = arg1.aShort92 + Static64.anInt1476 - Static297.anInt5235;
				if (local248 >= 0 && Static64.anInt1476 + Static64.anInt1476 >= local248 && Static255.aBooleanArrayArray2[local13][local248]) {
					@Pc(599) float local599 = (float) (Static335.anInt6337 - arg1.anIntArray658[0]);
					if (local599 < 0.0F) {
						local599 *= -1.0F;
					}
					@Pc(616) float local616 = (float) (Static496.anInt8826 - arg1.anIntArray659[0]);
					if (local616 < 0.0F) {
						local616 *= -1.0F;
					}
					if ((!(local599 < (float) Static552.anInt9411) || !((float) Static552.anInt9411 > local616)) && (Static445.method5102(0, arg1) && (Static445.method5102(1, arg1) && (Static445.method5102(2, arg1) && Static445.method5102(3, arg1))))) {
						Static622.aClass296Array3[Static157.anInt3110++] = arg1;
					}
				}
			}
		} else if (arg1.aByte130 == 4) {
			@Pc(686) float local686 = (float) (arg1.anIntArray657[0] - Static358.anInt6600);
			if (!(local686 <= (float) Static382.anInt7019)) {
				local248 = arg1.aShort92 + Static64.anInt1476 - Static297.anInt5235;
				if (local248 < 0) {
					local248 = 0;
				} else if (local248 > Static64.anInt1476 + Static64.anInt1476) {
					return;
				}
				local272 = Static64.anInt1476 + arg1.aShort90 - Static297.anInt5235;
				if (local272 > Static64.anInt1476 + Static64.anInt1476) {
					local272 = Static64.anInt1476 + Static64.anInt1476;
				} else if (local272 < 0) {
					return;
				}
				@Pc(754) int local754 = arg1.aShort91 + Static64.anInt1476 - Static358.anInt6609;
				if (local754 < 0) {
					local754 = 0;
				} else if (local754 > Static64.anInt1476 + Static64.anInt1476) {
					return;
				}
				@Pc(780) int local780 = Static64.anInt1476 + arg1.aShort93 - Static358.anInt6609;
				if (Static64.anInt1476 + Static64.anInt1476 < local780) {
					local780 = Static64.anInt1476 + Static64.anInt1476;
				} else if (local780 < 0) {
					return;
				}
				@Pc(798) boolean local798 = false;
				label283: for (@Pc(800) int local800 = local754; local800 <= local780; local800++) {
					for (@Pc(804) int local804 = local248; local804 <= local272; local804++) {
						if (Static255.aBooleanArrayArray2[local800][local804]) {
							local798 = true;
							break label283;
						}
					}
				}
				if (local798 && (Static445.method5102(0, arg1) && (Static445.method5102(1, arg1) && (Static445.method5102(2, arg1) && Static445.method5102(3, arg1))))) {
					Static622.aClass296Array3[Static157.anInt3110++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public static void method3410(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 6);
		local9.method2822();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static33.aBoolean71 = true;
		Static679.aBoolean764 = Static533.aClass137_41.method7937() > 0;
		Static252.aBoolean307 = true;
		Static358.anInt6609 = arg1 >> Static579.anInt9935;
		Static297.anInt5235 = arg3 >> Static579.anInt9935;
		Static335.anInt6337 = arg1;
		Static496.anInt8826 = arg3;
		Static358.anInt6600 = arg2;
		Static384.anInt7056 = Static358.anInt6609 - Static64.anInt1476;
		if (Static384.anInt7056 < 0) {
			Static644.anInt10794 = -Static384.anInt7056;
			Static384.anInt7056 = 0;
		} else {
			Static644.anInt10794 = 0;
		}
		Static6.anInt41 = Static297.anInt5235 - Static64.anInt1476;
		if (Static6.anInt41 < 0) {
			Static55.anInt1381 = -Static6.anInt41;
			Static6.anInt41 = 0;
		} else {
			Static55.anInt1381 = 0;
		}
		Static113.anInt2284 = Static358.anInt6609 + Static64.anInt1476;
		if (Static113.anInt2284 > Static28.anInt704) {
			Static113.anInt2284 = Static28.anInt704;
		}
		Static47.anInt1132 = Static297.anInt5235 + Static64.anInt1476;
		if (Static47.anInt1132 > Static55.anInt1384) {
			Static47.anInt1132 = Static55.anInt1384;
		}
		@Pc(72) boolean[][] local72 = Static255.aBooleanArrayArray2;
		@Pc(74) boolean[][] local74 = Static519.aBooleanArrayArray5;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static252.aBoolean307) {
			for (local78 = 0; local78 < Static64.anInt1476 + Static64.anInt1476 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static64.anInt1476 + Static64.anInt1476 + 2; local85++) {
					if (local85 > 1) {
						Static465.anIntArray621[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static358.anInt6609 + local78 - Static64.anInt1476;
					@Pc(109) int local109 = Static297.anInt5235 + local85 - Static64.anInt1476;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static28.anInt704 && local109 < Static55.anInt1384) {
						local123 = local103 << Static579.anInt9935;
						@Pc(127) int local127 = local109 << Static579.anInt9935;
						@Pc(144) int local144 = Static343.aClass51Array1[Static343.aClass51Array1.length - 1].method7857(local109, local103) - (0x3E8 << Static579.anInt9935 - 7);
						@Pc(166) int local166 = Static473.aClass51Array2 == null ? Static343.aClass51Array1[0].method7857(local109, local103) + Static222.anInt4166 : Static473.aClass51Array2[0].method7857(local109, local103) + Static222.anInt4166;
						local83 = arg15 >= 0 ? Static533.aClass137_41.r(local123, local144, local127, local123, local166, local127, arg15) : Static533.aClass137_41.JA(local123, local144, local127, local123, local166, local127);
						Static519.aBooleanArrayArray5[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static519.aBooleanArrayArray5[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static465.anIntArray621[local85 - 1] & Static465.anIntArray621[local85] & local81 & local83;
						Static255.aBooleanArrayArray2[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static465.anIntArray621[Static64.anInt1476 + Static64.anInt1476] = local81;
				Static465.anIntArray621[Static64.anInt1476 + Static64.anInt1476 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static33.aBoolean71 = false;
			} else {
				Static368.anIntArray494 = arg5;
				Static613.anIntArray754 = arg6;
				Static159.anIntArray614 = arg7;
				Static453.anIntArray604 = arg8;
				Static341.anIntArray460 = arg9;
				Static46.method963(Static533.aClass137_41, arg10);
			}
		} else {
			if (Static535.aBooleanArrayArray6 == null) {
				Static535.aBooleanArrayArray6 = new boolean[Static28.anInt704 + Static28.anInt704 + 1][Static55.anInt1384 + Static28.anInt704 + 1];
			}
			for (local78 = 0; local78 < Static535.aBooleanArrayArray6.length; local78++) {
				for (local81 = 0; local81 < Static535.aBooleanArrayArray6[0].length; local81++) {
					Static535.aBooleanArrayArray6[local78][local81] = true;
				}
			}
			Static519.aBooleanArrayArray5 = Static535.aBooleanArrayArray6;
			Static255.aBooleanArrayArray2 = Static535.aBooleanArrayArray6;
			Static384.anInt7056 = 0;
			Static6.anInt41 = 0;
			Static113.anInt2284 = Static28.anInt704;
			Static47.anInt1132 = Static55.anInt1384;
			Static33.aBoolean71 = false;
		}
		Static423.method6259(Static533.aClass137_41);
		if (!Static326.aClass23_1.aBoolean35) {
			@Pc(349) Class376 local349 = Static326.aClass23_1.aClass376_1;
			for (@Pc(354) Class12_Sub8 local354 = (Class12_Sub8) local349.method9008(); local354 != null; local354 = (Class12_Sub8) local349.method9014()) {
				local354.method9143();
				Static512.method7461(local354);
			}
		}
		if (Static679.aBoolean764) {
			for (local78 = 0; local78 < Static253.anInt4485; local78++) {
				Static260.aClass328Array1[local78].method7809(arg14, arg0);
			}
		}
		if (Static267.aBoolean322) {
			Static421.anIntArray558 = Static533.aClass137_41.Y();
			Static533.aClass137_41.K(Static167.anIntArray275);
			local78 = (Static167.anIntArray275[2] - Static167.anIntArray275[0]) / Static535.anInt9236;
			for (local81 = 0; local81 < Static535.anInt9236 - 1; local81++) {
				Static133.anIntArray213[local81] = local78 * (local81 + 1) + Static230.anIntArray334[local81];
			}
			for (local83 = 0; local83 < Static113.aClass109Array1.length; local83++) {
				Static113.aClass109Array1[local83].method2652();
			}
		}
		if (Static646.aClass58ArrayArrayArray3 != null) {
			if (Static267.aBoolean322) {
				Static422.method6249(0);
			}
			Static357.method5408(true);
			Static533.aClass137_41.ra(-1, 1583160, 40, 127);
			Static421.method6235(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static267.aBoolean322) {
				Static15.method144();
			}
			Static533.aClass137_41.pa();
			Static357.method5408(false);
		}
		Static421.method6235(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static267.aBoolean322) {
			for (local78 = 0; local78 < Static613.anInt10338; local78++) {
				Static51.aBooleanArrayArrayArray1[local78] = Static256.aBooleanArrayArrayArray2[local78];
			}
			Static422.method6249(0);
			for (local81 = 0; local81 < Static113.aClass109Array1.length; local81++) {
				Static113.aClass109Array1[local81].method2652();
			}
		}
		if (Static267.aBoolean322) {
			Static15.method144();
			for (local78 = 0; local78 < Static613.anInt10338; local78++) {
				Static256.aBooleanArrayArrayArray2[local78] = Static51.aBooleanArrayArrayArray1[local78];
			}
			if (Static434.anInt7761 == 2) {
				@Pc(543) int local543;
				if (Static407.aLongArray18[0] < Static407.aLongArray18[1]) {
					if (Static133.anIntArray213[0] + Static230.anIntArray334[0] > Static167.anIntArray275[0]) {
						local543 = Static230.anIntArray334[0]++;
					}
				} else if (Static407.aLongArray18[0] > Static407.aLongArray18[1] && Static133.anIntArray213[0] + Static230.anIntArray334[0] < Static167.anIntArray275[2]) {
					local543 = Static230.anIntArray334[0]--;
				}
			}
		}
		if (!Static252.aBoolean307) {
			Static255.aBooleanArrayArray2 = local72;
			Static519.aBooleanArrayArray5 = local74;
		}
		Static90.method1709();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!wia;ZIIII)V")
	public static void method3413(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static522.method7501(arg2, arg1, arg0);
			return;
		}
		Static348.aBoolean440 = false;
		Static445.anInt6142 = 0;
		Static352.anInt6508 = arg2;
		Static628.aClass14_Sub5_Sub2_4 = null;
		Static507.anInt8961 = 1;
		Static478.aClass386_105 = arg1;
		Static27.anInt690 = arg0;
		Static286.anInt4898 = Static558.aClass14_Sub5_Sub2_2.method3872() / arg3;
		if (Static286.anInt4898 < 1) {
			Static286.anInt4898 = 1;
		}
	}
}
