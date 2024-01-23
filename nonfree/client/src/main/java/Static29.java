import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public static int anInt661;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!dc;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_1;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!fm;")
	public static Class49 aClass49_2 = new Class49(128);

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!in;")
	public static Class71 aClass71_2 = null;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static107.anInt2499++;
		Static172.anInt3657 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static48.anInt1122; local23 < Static169.anInt3625; local23++) {
			@Pc(30) Class1_Sub26[][] local30 = Static74.aClass1_Sub26ArrayArrayArray1[local23];
			for (local32 = Static161.anInt3459; local32 < Static30.anInt3246; local32++) {
				for (local37 = Static172.anInt3652; local37 < Static152.anInt3232; local37++) {
					@Pc(46) Class1_Sub26 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static260.aBooleanArrayArray8[local32 + Static171.anInt3641 - Static186.anInt3849][local37 + Static171.anInt3641 - Static204.anInt4137] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean313 = true;
							local46.aBoolean314 = true;
							if (local46.anInt4090 > 0) {
								local46.aBoolean315 = true;
							} else {
								local46.aBoolean315 = false;
							}
							Static172.anInt3657++;
						} else {
							local46.aBoolean313 = false;
							local46.aBoolean314 = false;
							local46.anInt4095 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass72_1 != null) {
									@Pc(103) Class72 local103 = local46.aClass72_1;
									local103.aClass14_10.method4094(0, local23, local103.anInt2739, local103.anInt2734, local103.anInt2732);
									if (local103.aClass14_9 != null) {
										local103.aClass14_9.method4094(0, local23, local103.anInt2739, local103.anInt2734, local103.anInt2732);
									}
								}
								if (local46.aClass67_1 != null) {
									@Pc(134) Class67 local134 = local46.aClass67_1;
									local134.aClass14_7.method4094(local134.anInt2517, local23, local134.anInt2514, local134.anInt2513, local134.anInt2508);
									if (local134.aClass14_8 != null) {
										local134.aClass14_8.method4094(local134.anInt2517, local23, local134.anInt2514, local134.anInt2513, local134.anInt2508);
									}
								}
								if (local46.aClass44_1 != null) {
									@Pc(167) Class44 local167 = local46.aClass44_1;
									local167.aClass14_6.method4094(0, local23, local167.anInt1521, local167.anInt1520, local167.anInt1524);
								}
								if (local46.aClass25Array4 != null) {
									for (local183 = 0; local183 < local46.anInt4090; local183++) {
										@Pc(192) Class25 local192 = local46.aClass25Array4[local183];
										local192.aClass14_1.method4094(local192.anInt1010, local23, local192.anInt1005, local192.anInt1009, local192.anInt1011);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static55.anIntArrayArrayArray3 == Static255.anIntArrayArrayArray12;
		if (Static277.aBoolean412) {
			@Pc(244) GL local244 = Static277.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static164.method2830();
				Static123.method2162(-1, 3);
				Static261.aBoolean387 = true;
				Static96.method1773();
				Static7.anInt2288 = -1;
				Static287.anInt5491 = -1;
				for (local32 = 0; local32 < Static299.aClass1_Sub32ArrayArray3[0].length; local32++) {
					@Pc(285) Class1_Sub32 local285 = Static299.aClass1_Sub32ArrayArray3[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean381 ? 1.0F : 0.5F);
					if (local285.anInt5038 != Static7.anInt2288) {
						Static7.anInt2288 = local285.anInt5038;
						Static92.method1621(local285.anInt5038);
						Static28.method556(Static111.method2042());
					}
					local285.method3947(Static74.aClass1_Sub26ArrayArrayArray1, local294, false);
				}
				Static96.method1770();
			} else {
				local32 = Static48.anInt1122;
				while (true) {
					if (local32 >= Static169.anInt3625) {
						Static120.method2145(Static186.anInt3849, Static204.anInt4137, Static74.aClass1_Sub26ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static299.aClass1_Sub32ArrayArray3[local32].length; local37++) {
						@Pc(336) Class1_Sub32 local336 = Static299.aClass1_Sub32ArrayArray3[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean381 ? 1.0F : 0.5F);
						if (local336.anInt5042 != -1 && Static171.method2928(Static110.anInterface2_1.method2264(local336.anInt5042)) && Static236.aBoolean353) {
							Static92.method1621(local336.anInt5038);
						}
						local336.method3947(Static74.aClass1_Sub26ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static262.anInt5132 > 0) {
						Static277.method4221(101.5F);
						Static292.method4397(Static186.anInt3849, Static204.anInt4137, Static171.anInt3641, arg1, Static260.aBooleanArrayArray8, Static55.anIntArrayArrayArray3[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub26 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub26[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static48.anInt1122; local400 < Static169.anInt3625; local400++) {
			local407 = Static74.aClass1_Sub26ArrayArrayArray1[local400];
			for (local37 = -Static171.anInt3641; local37 <= 0; local37++) {
				local416 = Static186.anInt3849 + local37;
				local183 = Static186.anInt3849 - local37;
				if (local416 >= Static161.anInt3459 || local183 < Static30.anInt3246) {
					for (local429 = -Static171.anInt3641; local429 <= 0; local429++) {
						local435 = Static204.anInt4137 + local429;
						local439 = Static204.anInt4137 - local429;
						if (local416 >= Static161.anInt3459) {
							if (local435 >= Static172.anInt3652) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, true);
								}
							}
							if (local439 < Static152.anInt3232) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, true);
								}
							}
						}
						if (local183 < Static30.anInt3246) {
							if (local435 >= Static172.anInt3652) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, true);
								}
							}
							if (local439 < Static152.anInt3232) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, true);
								}
							}
						}
						if (Static172.anInt3657 == 0) {
							if (!local240) {
								Static88.aBoolean140 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static48.anInt1122; local400 < Static169.anInt3625; local400++) {
			local407 = Static74.aClass1_Sub26ArrayArrayArray1[local400];
			for (local37 = -Static171.anInt3641; local37 <= 0; local37++) {
				local416 = Static186.anInt3849 + local37;
				local183 = Static186.anInt3849 - local37;
				if (local416 >= Static161.anInt3459 || local183 < Static30.anInt3246) {
					for (local429 = -Static171.anInt3641; local429 <= 0; local429++) {
						local435 = Static204.anInt4137 + local429;
						local439 = Static204.anInt4137 - local429;
						if (local416 >= Static161.anInt3459) {
							if (local435 >= Static172.anInt3652) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, false);
								}
							}
							if (local439 < Static152.anInt3232) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, false);
								}
							}
						}
						if (local183 < Static30.anInt3246) {
							if (local435 >= Static172.anInt3652) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, false);
								}
							}
							if (local439 < Static152.anInt3232) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean313) {
									Static209.method3327(local451, false);
								}
							}
						}
						if (Static172.anInt3657 == 0) {
							if (!local240) {
								Static88.aBoolean140 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static88.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBI)V")
	public static void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static130.method2227(arg2, 10);
		local16.method3905();
		local16.anInt5004 = arg3;
		local16.anInt5005 = arg1;
		local16.anInt5000 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!pl;")
	public static Class131 method566(@OriginalArg(0) int arg0) {
		@Pc(10) Class131 local10 = (Class131) Static201.aClass135_22.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static85.aClass91_66.method2495(33, arg0);
		local10 = new Class131();
		if (local21 != null) {
			local10.method3292(arg0, new Class1_Sub11(local21));
		}
		Static201.aClass135_22.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
	public static void method568(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg0, 9);
		local8.method3911();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IJ)V")
	public static void method569(@OriginalArg(1) long arg0) {
		if (Static220.anInt4376 == 1 || Static220.anInt4376 == 5) {
			Static265.method4054(arg0);
		} else if (Static220.anInt4376 == 2) {
			Static224.method3518();
		} else {
			Static177.method2999();
		}
		if (!Static14.aBoolean23) {
			Static20.anIntArray44[0] = Static254.anInt4981;
			if (Static30.anInt3296 != 0) {
				anInt661 = Static58.anInt992;
				Static137.anInt3016 = Static298.anInt5621;
			} else if (Static123.anInt2804 == 0) {
				Static137.anInt3016 = Static224.anInt4445;
				anInt661 = Static8.anInt226;
			} else {
				Static137.anInt3016 = Static249.anInt4936;
				anInt661 = Static40.anInt1015;
			}
			Static92.aStringArray26[0] = Static140.aString176;
			Static134.anInt2945 = 1;
			Static61.aShortArray23[0] = 1004;
			Static266.aStringArray50[0] = "";
		}
		if (Static116.anInt5593 != -1) {
			Static218.method3440(Static116.anInt5593);
		}
		@Pc(83) int local83;
		for (local83 = 0; local83 < Static270.anInt5273; local83++) {
			if (Static272.aBooleanArray50[local83]) {
				Static78.aBooleanArray17[local83] = true;
			}
			Static44.aBooleanArray15[local83] = Static272.aBooleanArray50[local83];
			Static272.aBooleanArray50[local83] = false;
		}
		Static104.anInt2455 = -1;
		Static222.aClass71_19 = null;
		if (Static277.aBoolean412) {
			Static129.aBoolean215 = true;
		}
		Static207.anInt4872 = Static237.anInt4710;
		Static59.aClass71_17 = null;
		Static183.anInt4433 = -1;
		if (Static116.anInt5593 != -1) {
			Static270.anInt5273 = 0;
			Static48.method933();
		}
		if (Static277.aBoolean412) {
			Static41.method842();
		} else {
			Static50.method952();
		}
		Static218.method3442();
		if (Static14.aBoolean23) {
			if (Static221.aBoolean340) {
				Static123.method2165();
			} else {
				Static181.method3043();
			}
		} else if (Static59.aClass71_17 != null) {
			Static226.method3554(Static59.aClass71_17, Static5.anInt174, Static95.anInt2225);
		} else if (Static104.anInt2455 != -1) {
			Static226.method3554(null, Static104.anInt2455, Static183.anInt4433);
		}
		local83 = Static14.aBoolean23 ? -1 : Static156.method1238();
		if (local83 == -1) {
			local83 = Static92.anInt2070;
		}
		Static166.method2881(local83);
		if (Static117.anInt2670 == 1) {
			Static117.anInt2670 = 2;
		}
		if (Static205.anInt4155 == 1) {
			Static205.anInt4155 = 2;
		}
		if (Static267.anInt5202 == 3) {
			for (@Pc(212) int local212 = 0; local212 < Static270.anInt5273; local212++) {
				if (Static44.aBooleanArray15[local212]) {
					if (Static277.aBoolean412) {
						Static41.method839(Static55.anIntArray127[local212], Static62.anIntArray136[local212], Static189.anIntArray351[local212], Static215.anIntArray382[local212], 16711935, 128);
					} else {
						Static50.method961(Static55.anIntArray127[local212], Static62.anIntArray136[local212], Static189.anIntArray351[local212], Static215.anIntArray382[local212], 16711935, 128);
					}
				} else if (Static78.aBooleanArray17[local212]) {
					if (Static277.aBoolean412) {
						Static41.method839(Static55.anIntArray127[local212], Static62.anIntArray136[local212], Static189.anIntArray351[local212], Static215.anIntArray382[local212], 16711680, 128);
					} else {
						Static50.method961(Static55.anIntArray127[local212], Static62.anIntArray136[local212], Static189.anIntArray351[local212], Static215.anIntArray382[local212], 16711680, 128);
					}
				}
			}
		}
		Static172.method2939(Static129.anInt2881, Static197.aClass14_Sub2_Sub1_2.anInt4630, Static197.aClass14_Sub2_Sub1_2.anInt4680, Static140.anInt3034);
		Static129.anInt2881 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method570(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(16) char local16 = 0;
		@Pc(19) int local19 = arg1.length();
		@Pc(22) int local22 = arg0.length();
		@Pc(24) char local24 = 0;
		while (local19 > local7 - local16 || local22 > local9 - local24) {
			if (local7 - local16 >= local19) {
				return -1;
			}
			if (local9 - local24 >= local22) {
				return 1;
			}
			@Pc(62) char local62;
			if (local16 == '\u0000') {
				local62 = arg1.charAt(local7++);
			} else {
				local62 = local16;
			}
			@Pc(75) char local75;
			if (local24 == '\u0000') {
				local75 = arg0.charAt(local9++);
			} else {
				local75 = local24;
			}
			local16 = Static278.method4233(local62);
			local24 = Static278.method4233(local75);
			local62 = Static252.method3870(arg2, local62);
			local75 = Static252.method3870(arg2, local75);
			if (local62 != local75 && Character.toUpperCase(local62) != Character.toUpperCase(local75)) {
				local62 = Character.toLowerCase(local62);
				local75 = Character.toLowerCase(local75);
				if (local75 != local62) {
					return Static85.method1487(arg2, local62) - Static85.method1487(arg2, local75);
				}
			}
		}
		@Pc(142) int local142 = Math.min(local19, local22);
		@Pc(180) char local180;
		@Pc(144) int local144;
		for (local144 = 0; local144 < local142; local144++) {
			if (arg2 == 2) {
				local7 = local19 - local144 - 1;
				local9 = local22 - local144 - 1;
			} else {
				local9 = local144;
				local7 = local144;
			}
			@Pc(176) char local176 = arg1.charAt(local7);
			local180 = arg0.charAt(local9);
			if (local176 != local180 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static85.method1487(arg2, local176) - Static85.method1487(arg2, local180);
				}
			}
		}
		local144 = local19 - local22;
		if (local144 != 0) {
			return local144;
		}
		for (@Pc(231) int local231 = 0; local231 < local142; local231++) {
			local180 = arg1.charAt(local231);
			@Pc(242) char local242 = arg0.charAt(local231);
			if (local180 != local242) {
				return Static85.method1487(arg2, local180) - Static85.method1487(arg2, local242);
			}
		}
		return 0;
	}
}
