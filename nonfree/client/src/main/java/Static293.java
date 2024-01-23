import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!ek;")
	public static Class42 aClass42_106;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[S")
	public static short[] aShortArray86;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[Lclient!eb;")
	public static Class2_Sub8_Sub6[] aClass2_Sub8_Sub6Array5 = new Class2_Sub8_Sub6[14];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString201 = "";

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt5704 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static40.anInt989++;
		Static169.anInt3730 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static227.anInt4576; local23 < Static46.anInt1155; local23++) {
			@Pc(30) Class2_Sub13[][] local30 = Static52.aClass2_Sub13ArrayArrayArray1[local23];
			for (local32 = Static82.anInt1918; local32 < Static276.anInt5467; local32++) {
				for (local37 = Static281.anInt5559; local37 < Static84.anInt1964; local37++) {
					@Pc(46) Class2_Sub13 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static6.aBooleanArrayArray1[local32 + Static243.anInt4841 - Static290.anInt5686][local37 + Static243.anInt4841 - Static72.anInt1815] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean101 = true;
							local46.aBoolean104 = true;
							if (local46.anInt1544 > 0) {
								local46.aBoolean102 = true;
							} else {
								local46.aBoolean102 = false;
							}
							Static169.anInt3730++;
						} else {
							local46.aBoolean101 = false;
							local46.aBoolean104 = false;
							local46.anInt1552 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass122_1 != null) {
									@Pc(103) Class122 local103 = local46.aClass122_1;
									local103.aClass15_3.method4277(0, local23, local103.anInt4023, local103.anInt4018, local103.anInt4021);
									if (local103.aClass15_2 != null) {
										local103.aClass15_2.method4277(0, local23, local103.anInt4023, local103.anInt4018, local103.anInt4021);
									}
								}
								if (local46.aClass147_1 != null) {
									@Pc(134) Class147 local134 = local46.aClass147_1;
									local134.aClass15_5.method4277(local134.anInt4782, local23, local134.anInt4780, local134.anInt4781, local134.anInt4784);
									if (local134.aClass15_4 != null) {
										local134.aClass15_4.method4277(local134.anInt4782, local23, local134.anInt4780, local134.anInt4781, local134.anInt4784);
									}
								}
								if (local46.aClass191_1 != null) {
									@Pc(167) Class191 local167 = local46.aClass191_1;
									local167.aClass15_10.method4277(0, local23, local167.anInt5935, local167.anInt5934, local167.anInt5932);
								}
								if (local46.aClass170Array1 != null) {
									for (local183 = 0; local183 < local46.anInt1544; local183++) {
										@Pc(192) Class170 local192 = local46.aClass170Array1[local183];
										local192.aClass15_9.method4277(local192.anInt5438, local23, local192.anInt5431, local192.anInt5443, local192.anInt5432);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static9.anIntArrayArrayArray7 == Static85.anIntArrayArrayArray4;
		if (Static116.aBoolean184) {
			@Pc(244) GL local244 = Static116.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static86.method1542();
				Static118.method1991(-1, 3);
				Static229.aBoolean306 = true;
				Static23.method451();
				Static73.anInt1827 = -1;
				Static304.anInt5893 = -1;
				for (local32 = 0; local32 < Static247.aClass2_Sub32ArrayArray2[0].length; local32++) {
					@Pc(285) Class2_Sub32 local285 = Static247.aClass2_Sub32ArrayArray2[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean401 ? 1.0F : 0.5F);
					if (local285.anInt6051 != Static73.anInt1827) {
						Static73.anInt1827 = local285.anInt6051;
						Static163.method2983(local285.anInt6051);
						Static235.method3806(Static152.method2800());
					}
					local285.method4751(Static52.aClass2_Sub13ArrayArrayArray1, local294, false);
				}
				Static23.method454();
			} else {
				local32 = Static227.anInt4576;
				while (true) {
					if (local32 >= Static46.anInt1155) {
						Static212.method3544(Static290.anInt5686, Static72.anInt1815, Static52.aClass2_Sub13ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static247.aClass2_Sub32ArrayArray2[local32].length; local37++) {
						@Pc(336) Class2_Sub32 local336 = Static247.aClass2_Sub32ArrayArray2[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean401 ? 1.0F : 0.5F);
						if (local336.anInt6048 != -1 && Static48.method888(Static1.anInterface3_1.method4135(local336.anInt6048)) && Static74.aBoolean118) {
							Static163.method2983(local336.anInt6051);
						}
						local336.method4751(Static52.aClass2_Sub13ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static243.anInt4839 > 0) {
						Static116.method1957(101.5F);
						Static266.method4176(Static290.anInt5686, Static72.anInt1815, Static243.anInt4841, arg1, Static6.aBooleanArrayArray1, Static9.anIntArrayArrayArray7[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class2_Sub13 local451;
		@Pc(400) int local400;
		@Pc(407) Class2_Sub13[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static227.anInt4576; local400 < Static46.anInt1155; local400++) {
			local407 = Static52.aClass2_Sub13ArrayArrayArray1[local400];
			for (local37 = -Static243.anInt4841; local37 <= 0; local37++) {
				local416 = Static290.anInt5686 + local37;
				local183 = Static290.anInt5686 - local37;
				if (local416 >= Static82.anInt1918 || local183 < Static276.anInt5467) {
					for (local429 = -Static243.anInt4841; local429 <= 0; local429++) {
						local435 = Static72.anInt1815 + local429;
						local439 = Static72.anInt1815 - local429;
						if (local416 >= Static82.anInt1918) {
							if (local435 >= Static281.anInt5559) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, true);
								}
							}
							if (local439 < Static84.anInt1964) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, true);
								}
							}
						}
						if (local183 < Static276.anInt5467) {
							if (local435 >= Static281.anInt5559) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, true);
								}
							}
							if (local439 < Static84.anInt1964) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, true);
								}
							}
						}
						if (Static169.anInt3730 == 0) {
							if (!local240) {
								Static182.aBoolean399 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static227.anInt4576; local400 < Static46.anInt1155; local400++) {
			local407 = Static52.aClass2_Sub13ArrayArrayArray1[local400];
			for (local37 = -Static243.anInt4841; local37 <= 0; local37++) {
				local416 = Static290.anInt5686 + local37;
				local183 = Static290.anInt5686 - local37;
				if (local416 >= Static82.anInt1918 || local183 < Static276.anInt5467) {
					for (local429 = -Static243.anInt4841; local429 <= 0; local429++) {
						local435 = Static72.anInt1815 + local429;
						local439 = Static72.anInt1815 - local429;
						if (local416 >= Static82.anInt1918) {
							if (local435 >= Static281.anInt5559) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, false);
								}
							}
							if (local439 < Static84.anInt1964) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, false);
								}
							}
						}
						if (local183 < Static276.anInt5467) {
							if (local435 >= Static281.anInt5559) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, false);
								}
							}
							if (local439 < Static84.anInt1964) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean101) {
									Static184.method3260(local451, false);
								}
							}
						}
						if (Static169.anInt3730 == 0) {
							if (!local240) {
								Static182.aBoolean399 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static182.aBoolean399 = false;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)I")
	public static int method4501() {
		if (Static38.aBoolean62) {
			return 0;
		} else if (Static69.method2440()) {
			return Static3.aBoolean8 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public static void method4502() {
		Static299.anIntArray561 = null;
		Static275.anIntArray522 = null;
		Static311.anIntArray591 = null;
		Static199.anIntArray438 = null;
		Static165.aByteArrayArray9 = null;
		Static187.anIntArray397 = null;
	}
}
