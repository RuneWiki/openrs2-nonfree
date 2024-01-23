import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!nm;")
	public static Class119 aClass119_66;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!uj;")
	public static Class1_Sub5_Sub9 aClass1_Sub5_Sub9_5;

	@OriginalMember(owner = "client!re", name = "Wb", descriptor = "Lclient!nm;")
	public static Class119 aClass119_67;

	@OriginalMember(owner = "client!re", name = "Yb", descriptor = "I")
	public static int anInt3861;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!ui;")
	public static Class175 aClass175_30 = new Class175(4);

	@OriginalMember(owner = "client!re", name = "hc", descriptor = "S")
	public static short aShort43 = 32767;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static34.anInt651++;
		Static44.anInt1037 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static287.anInt5198; local23 < Static311.anInt5590; local23++) {
			@Pc(30) Class1_Sub16[][] local30 = Static254.aClass1_Sub16ArrayArrayArray3[local23];
			for (local32 = Static230.anInt4306; local32 < Static82.anInt1810; local32++) {
				for (local37 = Static226.anInt4247; local37 < Static41.anInt850; local37++) {
					@Pc(46) Class1_Sub16 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static279.aBooleanArrayArray3[local32 + Static161.anInt3224 - Static66.anInt1366][local37 + Static161.anInt3224 - Static196.anInt3902] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean228 = true;
							local46.aBoolean230 = true;
							if (local46.anInt2573 > 0) {
								local46.aBoolean229 = true;
							} else {
								local46.aBoolean229 = false;
							}
							Static44.anInt1037++;
						} else {
							local46.aBoolean228 = false;
							local46.aBoolean230 = false;
							local46.anInt2578 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass39_1 != null) {
									@Pc(103) Class39 local103 = local46.aClass39_1;
									local103.aClass11_4.method4302(0, local23, local103.anInt1259, local103.anInt1261, local103.anInt1258);
									if (local103.aClass11_3 != null) {
										local103.aClass11_3.method4302(0, local23, local103.anInt1259, local103.anInt1261, local103.anInt1258);
									}
								}
								if (local46.aClass18_1 != null) {
									@Pc(134) Class18 local134 = local46.aClass18_1;
									local134.aClass11_1.method4302(local134.anInt557, local23, local134.anInt554, local134.anInt563, local134.anInt558);
									if (local134.aClass11_2 != null) {
										local134.aClass11_2.method4302(local134.anInt557, local23, local134.anInt554, local134.anInt563, local134.anInt558);
									}
								}
								if (local46.aClass124_1 != null) {
									@Pc(167) Class124 local167 = local46.aClass124_1;
									local167.aClass11_10.method4302(0, local23, local167.anInt3882, local167.anInt3885, local167.anInt3886);
								}
								if (local46.aClass45Array2 != null) {
									for (local183 = 0; local183 < local46.anInt2573; local183++) {
										@Pc(192) Class45 local192 = local46.aClass45Array2[local183];
										local192.aClass11_5.method4302(local192.anInt1353, local23, local192.anInt1358, local192.anInt1361, local192.anInt1354);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static280.anIntArrayArrayArray13 == Static124.anIntArrayArrayArray5;
		if (Static71.aBoolean165) {
			@Pc(244) GL local244 = Static71.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static62.method1103();
				Static165.method4612(3, -1);
				Static213.aBoolean520 = true;
				Static113.method2037();
				Static128.anInt2547 = -1;
				Static196.anInt3908 = -1;
				for (local32 = 0; local32 < Static230.aClass1_Sub15ArrayArray30[0].length; local32++) {
					@Pc(285) Class1_Sub15 local285 = Static230.aClass1_Sub15ArrayArray30[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean219 ? 1.0F : 0.5F);
					if (local285.anInt2505 != Static128.anInt2547) {
						Static128.anInt2547 = local285.anInt2505;
						Static286.method4305(local285.anInt2505);
						Static65.method1148(Static55.method992());
					}
					local285.method2228(Static254.aClass1_Sub16ArrayArrayArray3, local294, false);
				}
				Static113.method2039();
			} else {
				local32 = Static287.anInt5198;
				while (true) {
					if (local32 >= Static311.anInt5590) {
						Static151.method2637(Static66.anInt1366, Static196.anInt3902, Static254.aClass1_Sub16ArrayArrayArray3);
						break;
					}
					for (local37 = 0; local37 < Static230.aClass1_Sub15ArrayArray30[local32].length; local37++) {
						@Pc(336) Class1_Sub15 local336 = Static230.aClass1_Sub15ArrayArray30[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean219 ? 1.0F : 0.5F);
						if (local336.anInt2503 != -1 && Static89.method1730(Static119.anInterface5_1.method1483(local336.anInt2503)) && Static43.aBoolean88) {
							Static286.method4305(local336.anInt2505);
						}
						local336.method2228(Static254.aClass1_Sub16ArrayArrayArray3, local350, false);
					}
					if (local32 == 0 && Static147.anInt5168 > 0) {
						Static71.method1385(101.5F);
						Static15.method228(Static66.anInt1366, Static196.anInt3902, Static161.anInt3224, arg1, Static279.aBooleanArrayArray3, Static280.anIntArrayArrayArray13[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub16 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub16[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static287.anInt5198; local400 < Static311.anInt5590; local400++) {
			local407 = Static254.aClass1_Sub16ArrayArrayArray3[local400];
			for (local37 = -Static161.anInt3224; local37 <= 0; local37++) {
				local416 = Static66.anInt1366 + local37;
				local183 = Static66.anInt1366 - local37;
				if (local416 >= Static230.anInt4306 || local183 < Static82.anInt1810) {
					for (local429 = -Static161.anInt3224; local429 <= 0; local429++) {
						local435 = Static196.anInt3902 + local429;
						local439 = Static196.anInt3902 - local429;
						if (local416 >= Static230.anInt4306) {
							if (local435 >= Static226.anInt4247) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, true);
								}
							}
							if (local439 < Static41.anInt850) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, true);
								}
							}
						}
						if (local183 < Static82.anInt1810) {
							if (local435 >= Static226.anInt4247) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, true);
								}
							}
							if (local439 < Static41.anInt850) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, true);
								}
							}
						}
						if (Static44.anInt1037 == 0) {
							if (!local240) {
								Static47.aBoolean102 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static287.anInt5198; local400 < Static311.anInt5590; local400++) {
			local407 = Static254.aClass1_Sub16ArrayArrayArray3[local400];
			for (local37 = -Static161.anInt3224; local37 <= 0; local37++) {
				local416 = Static66.anInt1366 + local37;
				local183 = Static66.anInt1366 - local37;
				if (local416 >= Static230.anInt4306 || local183 < Static82.anInt1810) {
					for (local429 = -Static161.anInt3224; local429 <= 0; local429++) {
						local435 = Static196.anInt3902 + local429;
						local439 = Static196.anInt3902 - local429;
						if (local416 >= Static230.anInt4306) {
							if (local435 >= Static226.anInt4247) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, false);
								}
							}
							if (local439 < Static41.anInt850) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, false);
								}
							}
						}
						if (local183 < Static82.anInt1810) {
							if (local435 >= Static226.anInt4247) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, false);
								}
							}
							if (local439 < Static41.anInt850) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean228) {
									Static103.method1976(local451, false);
								}
							}
						}
						if (Static44.anInt1037 == 0) {
							if (!local240) {
								Static47.aBoolean102 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static47.aBoolean102 = false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	public static void method3349() {
		Static120.aClass175_20.method4288(5);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIILclient!nm;)[Lclient!lj;")
	public static Class1_Sub5_Sub6[] method3353(@OriginalArg(1) int arg0, @OriginalArg(3) Class119 arg1) {
		return Static114.method2083(arg0, arg1, 0) ? Static242.method3848() : null;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public static int method3358() {
		return 14;
	}
}
