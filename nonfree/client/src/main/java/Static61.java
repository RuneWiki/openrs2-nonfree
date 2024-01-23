import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!bo;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array7;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "Lclient!jd;")
	public static Class84 aClass84_56;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	public static int anInt2999;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
	public static int anInt2996 = -1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!jd;IZ)Z")
	public static boolean method2444(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) byte[] local18 = arg0.method2146(arg1);
		if (local18 == null) {
			return false;
		} else {
			Static62.method1203(local18);
			return true;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
	public static String method2445(@OriginalArg(0) int arg0) {
		return arg0 >= 0 ? Static136.method2422(arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!jd;I)Lclient!rj;")
	public static Class2_Sub3_Sub1 method2446(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1) {
		return method2444(arg0, arg1) ? Static59.method1133() : null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method2447(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local18);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 - 96;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static183.anInt3890++;
		Static118.anInt2539 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static14.anInt348; local23 < Static63.anInt1426; local23++) {
			@Pc(30) Class2_Sub31[][] local30 = Static180.aClass2_Sub31ArrayArrayArray2[local23];
			for (local32 = Static281.anInt5831; local32 < Static222.anInt4612; local32++) {
				for (local37 = Static26.anInt549; local37 < Static50.anInt1165; local37++) {
					@Pc(46) Class2_Sub31 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static121.aBooleanArrayArray3[local32 + Static92.anInt2034 - Static53.anInt1215][local37 + Static92.anInt2034 - Static210.anInt4375] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean456 = true;
							local46.aBoolean457 = true;
							if (local46.anInt5708 > 0) {
								local46.aBoolean455 = true;
							} else {
								local46.aBoolean455 = false;
							}
							Static118.anInt2539++;
						} else {
							local46.aBoolean456 = false;
							local46.aBoolean457 = false;
							local46.anInt5704 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass168_1 != null) {
									@Pc(103) Class168 local103 = local46.aClass168_1;
									local103.aClass36_10.method4886(0, local23, local103.anInt5424, local103.anInt5427, local103.anInt5433);
									if (local103.aClass36_9 != null) {
										local103.aClass36_9.method4886(0, local23, local103.anInt5424, local103.anInt5427, local103.anInt5433);
									}
								}
								if (local46.aClass50_1 != null) {
									@Pc(134) Class50 local134 = local46.aClass50_1;
									local134.aClass36_3.method4886(local134.anInt1325, local23, local134.anInt1328, local134.anInt1316, local134.anInt1327);
									if (local134.aClass36_2 != null) {
										local134.aClass36_2.method4886(local134.anInt1325, local23, local134.anInt1328, local134.anInt1316, local134.anInt1327);
									}
								}
								if (local46.aClass65_1 != null) {
									@Pc(167) Class65 local167 = local46.aClass65_1;
									local167.aClass36_5.method4886(0, local23, local167.anInt2037, local167.anInt2044, local167.anInt2043);
								}
								if (local46.aClass34Array2 != null) {
									for (local183 = 0; local183 < local46.anInt5708; local183++) {
										@Pc(192) Class34 local192 = local46.aClass34Array2[local183];
										local192.aClass36_1.method4886(local192.anInt898, local23, local192.anInt903, local192.anInt901, local192.anInt899);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static141.anIntArrayArrayArray4 == Static144.anIntArrayArrayArray5;
		if (Static60.aBoolean106) {
			@Pc(244) GL local244 = Static60.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static16.method352();
				Static4.method119(-1, 3);
				Static68.aBoolean124 = true;
				Static24.method480();
				Static101.anInt6024 = -1;
				Static159.anInt3363 = -1;
				for (local32 = 0; local32 < Static73.aClass2_Sub12ArrayArray1[0].length; local32++) {
					@Pc(285) Class2_Sub12 local285 = Static73.aClass2_Sub12ArrayArray1[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean136 ? 1.0F : 0.5F);
					if (local285.anInt1667 != Static101.anInt6024) {
						Static101.anInt6024 = local285.anInt1667;
						Static36.method721(local285.anInt1667);
						Static117.method2158(Static43.method833());
					}
					local285.method1399(Static180.aClass2_Sub31ArrayArrayArray2, local294, false);
				}
				Static24.method481();
			} else {
				local32 = Static14.anInt348;
				while (true) {
					if (local32 >= Static63.anInt1426) {
						Static128.method2265(Static53.anInt1215, Static210.anInt4375, Static180.aClass2_Sub31ArrayArrayArray2);
						break;
					}
					for (local37 = 0; local37 < Static73.aClass2_Sub12ArrayArray1[local32].length; local37++) {
						@Pc(336) Class2_Sub12 local336 = Static73.aClass2_Sub12ArrayArray1[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean136 ? 1.0F : 0.5F);
						if (local336.anInt1662 != -1 && Static133.method2323(Static93.anInterface5_1.method3516(local336.anInt1662)) && Static233.aBoolean407) {
							Static36.method721(local336.anInt1667);
						}
						local336.method1399(Static180.aClass2_Sub31ArrayArrayArray2, local350, false);
					}
					if (local32 == 0 && Static195.anInt4041 > 0) {
						Static60.method1142(101.5F);
						Static194.method3243(Static53.anInt1215, Static210.anInt4375, Static92.anInt2034, arg1, Static121.aBooleanArrayArray3, Static141.anIntArrayArrayArray4[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class2_Sub31 local451;
		@Pc(400) int local400;
		@Pc(407) Class2_Sub31[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static14.anInt348; local400 < Static63.anInt1426; local400++) {
			local407 = Static180.aClass2_Sub31ArrayArrayArray2[local400];
			for (local37 = -Static92.anInt2034; local37 <= 0; local37++) {
				local416 = Static53.anInt1215 + local37;
				local183 = Static53.anInt1215 - local37;
				if (local416 >= Static281.anInt5831 || local183 < Static222.anInt4612) {
					for (local429 = -Static92.anInt2034; local429 <= 0; local429++) {
						local435 = Static210.anInt4375 + local429;
						local439 = Static210.anInt4375 - local429;
						if (local416 >= Static281.anInt5831) {
							if (local435 >= Static26.anInt549) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, true);
								}
							}
							if (local439 < Static50.anInt1165) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, true);
								}
							}
						}
						if (local183 < Static222.anInt4612) {
							if (local435 >= Static26.anInt549) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, true);
								}
							}
							if (local439 < Static50.anInt1165) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, true);
								}
							}
						}
						if (Static118.anInt2539 == 0) {
							if (!local240) {
								Static116.aBoolean191 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static14.anInt348; local400 < Static63.anInt1426; local400++) {
			local407 = Static180.aClass2_Sub31ArrayArrayArray2[local400];
			for (local37 = -Static92.anInt2034; local37 <= 0; local37++) {
				local416 = Static53.anInt1215 + local37;
				local183 = Static53.anInt1215 - local37;
				if (local416 >= Static281.anInt5831 || local183 < Static222.anInt4612) {
					for (local429 = -Static92.anInt2034; local429 <= 0; local429++) {
						local435 = Static210.anInt4375 + local429;
						local439 = Static210.anInt4375 - local429;
						if (local416 >= Static281.anInt5831) {
							if (local435 >= Static26.anInt549) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, false);
								}
							}
							if (local439 < Static50.anInt1165) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, false);
								}
							}
						}
						if (local183 < Static222.anInt4612) {
							if (local435 >= Static26.anInt549) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, false);
								}
							}
							if (local439 < Static50.anInt1165) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean456) {
									Static247.method3964(local451, false);
								}
							}
						}
						if (Static118.anInt2539 == 0) {
							if (!local240) {
								Static116.aBoolean191 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static116.aBoolean191 = false;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;")
	public static String method2450(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) boolean local9 = false;
		@Pc(17) char local17 = '.';
		@Pc(22) StringBuffer local22 = new StringBuffer(26);
		if (arg2 < 0L) {
			arg2 = -arg2;
			local9 = true;
		}
		if (arg3 == 0) {
			local7 = '.';
			local17 = ',';
		}
		if (arg3 == 2) {
			local17 = ' ';
		}
		@Pc(55) int local55;
		@Pc(61) int local61;
		if (arg1 > 0) {
			for (local55 = 0; local55 < arg1; local55++) {
				local61 = (int) arg2;
				arg2 /= 10L;
				local22.append((char) (local61 + 48 - (int) arg2 * 10));
			}
			local22.append(local7);
		}
		local55 = 0;
		while (true) {
			local61 = (int) arg2;
			arg2 /= 10L;
			local22.append((char) (local61 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local9) {
					local22.append('-');
				}
				return local22.reverse().toString();
			}
			if (arg0) {
				local55++;
				if (local55 % 3 == 0) {
					local22.append(local17);
				}
			}
		}
	}
}
