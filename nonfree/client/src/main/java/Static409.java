import jaggl.OpenGL;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!ega;")
	public static final Class98 aClass98_3 = new Class98("stellardawn", 1);

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	private static int anInt7268 = 0;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[I")
	public static final int[] anIntArray409 = new int[14];

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method6016() {
		Static99.aClass367_4.method8499();
		Static494.aClass314_5.method7472();
		Static619.aClass94_2.method2326();
		Static568.aClass315_5.method7509();
		Static231.aClass19_2.method275();
		Static110.aClass105_1.method2654();
		Static591.aClass66_2.method1769();
		Static239.aClass91_1.method2242();
		Static545.aClass171_1.method4165();
		Static294.aClass389_1.method8880();
		Static667.aClass278_1.method6507();
		Static299.aClass286_2.method6791();
		Static49.aClass93_1.method2282();
		Static367.aClass365_4.method8479();
		Static191.aClass381_2.method8721();
		Static62.aClass336_1.method7774();
		Static62.aClass393_1.method9020();
		Static230.aClass122_1.method2980();
		Static497.aClass182_4.method4674();
		Static317.aClass176_2.method4503();
		Static73.aClass211_1.method5182();
		Static463.aClass70_2.method1849();
		Static73.method981();
		Static519.method7343();
		Static578.method7995();
		Static495.method7091();
		Static680.method9054();
		Static80.aClass340_4.method7996(5);
		Static334.aClass340_38.method7996(5);
		Static196.aClass340_21.method7996(5);
		Static486.aClass340_48.method7996(5);
		Static652.aClass340_67.method7996(5);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)[Lclient!gh;")
	public static Class131[] method6019() {
		return new Class131[] { Static558.aClass131_14, Static110.aClass131_4, Static356.aClass131_12, Static177.aClass131_7, Static174.aClass131_6, Static573.aClass131_19, Static490.aClass131_17, Static154.aClass131_5, Static181.aClass131_18, Static607.aClass131_16, Static651.aClass131_21, Static66.aClass131_13, Static628.aClass131_20, Static282.aClass131_11 };
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILjava/lang/String;)Z")
	public static boolean method6020(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static570.aClass268_5.aBoolean644) {
			Static514.aClass395_4 = new Class395();
			Static514.aClass395_4.anInt10873 = arg0;
			Static514.aClass395_4.aString122 = arg1;
			if (Static217.aClass187_7 != Static560.aClass187_13) {
				Static514.aClass395_4.anInt10879 = Static514.aClass395_4.anInt10873 + 40000;
				Static514.aClass395_4.anInt10870 = Static514.aClass395_4.anInt10873 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static394.aClass6_Sub1Array2.length; local35++) {
				if (arg0 == Static394.aClass6_Sub1Array2[local35].anInt65) {
					Static223.anInt4119 = Static394.aClass6_Sub1Array2[local35].anInt55;
				}
			}
			return true;
		}
		@Pc(60) String local60 = "";
		if (Static217.aClass187_7 != Static560.aClass187_13) {
			local60 = ":" + (arg0 + 7000);
		}
		@Pc(75) String local75 = "";
		if (Static89.aString11 != null) {
			local75 = "/p=" + Static89.aString11;
		}
		@Pc(129) String local129 = "http://" + arg1 + local60 + "/l=" + Static544.anInt8937 + "/a=" + Static254.anInt4619 + local75 + "/j" + (Static361.aBoolean581 ? "1" : "0") + ",o" + (Static287.aBoolean484 ? "1" : "0") + ",a2";
		try {
			Static209.aClient2.getAppletContext().showDocument(new URL(local129), "_self");
			return true;
		} catch (@Pc(139) Exception local139) {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method6021() {
		if (Static198.anInt8358 > 1) {
			Static198.anInt8358--;
			Static605.anInt9948 = Static370.anInt8567;
		}
		if (Static419.aBoolean638) {
			Static419.aBoolean638 = false;
			Static243.method3796();
			return;
		}
		if (!Static493.aBoolean702) {
			Static447.method6475();
		}
		for (@Pc(40) int local40 = 0; local40 < 100 && Static49.method623(); local40++) {
		}
		if (Static173.anInt3397 != 10) {
			return;
		}
		@Pc(62) Class5_Sub21 local62;
		@Pc(71) int local71;
		while (Static147.method2673()) {
			local62 = Static64.method905(Static263.aClass49_1, Static119.aClass305_20);
			local62.aClass5_Sub41_Sub2_1.method7798(0);
			local71 = local62.aClass5_Sub41_Sub2_1.anInt9230;
			Static19.method273(local62.aClass5_Sub41_Sub2_1);
			local62.aClass5_Sub41_Sub2_1.method7839(local62.aClass5_Sub41_Sub2_1.anInt9230 - local71);
			Static495.method7092(local62);
		}
		if (Static207.aClass5_Sub29_2 == null) {
			if (Static547.method7619() >= Static340.aLong164) {
				Static207.aClass5_Sub29_2 = Static546.aClass249_1.method5825(Static514.aClass395_4.aString122);
			}
		} else if (Static207.aClass5_Sub29_2.anInt4567 != -1) {
			local62 = Static64.method905(Static263.aClass49_1, Static12.aClass305_4);
			local62.aClass5_Sub41_Sub2_1.method7848(Static207.aClass5_Sub29_2.anInt4567);
			Static495.method7092(local62);
			Static207.aClass5_Sub29_2 = null;
			Static340.aLong164 = Static547.method7619() + 30000L;
		}
		@Pc(140) Class5_Sub7 local140 = (Class5_Sub7) Static223.aClass114_23.method2805();
		@Pc(153) int local153;
		@Pc(178) int local178;
		@Pc(197) int local197;
		@Pc(243) int local243;
		@Pc(249) int local249;
		@Pc(260) int local260;
		@Pc(151) Class5_Sub21 local151;
		if (local140 != null || Static547.method7619() - 2000L > Static84.aLong38) {
			local151 = null;
			local153 = 0;
			for (@Pc(158) Class5_Sub7 local158 = (Class5_Sub7) Static363.aClass114_63.method2805(); local158 != null && (local151 == null || local151.aClass5_Sub41_Sub2_1.anInt9230 - local153 < 240); local158 = (Class5_Sub7) Static363.aClass114_63.method2814()) {
				local158.method9052();
				local178 = local158.method8702();
				if (local178 < -1) {
					local178 = -1;
				} else if (local178 > 65534) {
					local178 = 65534;
				}
				local197 = local158.method8703();
				if (local197 < -1) {
					local197 = -1;
				} else if (local197 > 65534) {
					local197 = 65534;
				}
				if (Static114.anInt2366 != local197 || Static121.anInt2490 != local178) {
					if (local151 == null) {
						local151 = Static64.method905(Static263.aClass49_1, Static437.aClass305_68);
						local151.aClass5_Sub41_Sub2_1.method7798(0);
						local153 = local151.aClass5_Sub41_Sub2_1.anInt9230;
					}
					local243 = local197 - Static114.anInt2366;
					Static114.anInt2366 = local197;
					local249 = local178 - Static121.anInt2490;
					Static121.anInt2490 = local178;
					local260 = (int) ((local158.method8707() - Static84.aLong38) / 20L);
					if (local260 < 8 && local243 >= -32 && local243 <= 31 && local249 >= -32 && local249 <= 31) {
						local249 += 32;
						local243 += 32;
						local151.aClass5_Sub41_Sub2_1.method7848(local249 + (local243 << 6) + (local260 << 12));
					} else if (local260 < 32 && local243 >= -128 && local243 <= 127 && local249 >= -128 && local249 <= 127) {
						local249 += 128;
						local151.aClass5_Sub41_Sub2_1.method7798(local260 + 128);
						local243 += 128;
						local151.aClass5_Sub41_Sub2_1.method7848(local249 + (local243 << 8));
					} else if (local260 < 32) {
						local151.aClass5_Sub41_Sub2_1.method7798(local260 + 192);
						if (local197 == 1 || local178 == -1) {
							local151.aClass5_Sub41_Sub2_1.method7803(Integer.MIN_VALUE);
						} else {
							local151.aClass5_Sub41_Sub2_1.method7803(local178 << 16 | local197);
						}
					} else {
						local151.aClass5_Sub41_Sub2_1.method7848(local260 + 57344);
						if (local197 == 1 || local178 == -1) {
							local151.aClass5_Sub41_Sub2_1.method7803(Integer.MIN_VALUE);
						} else {
							local151.aClass5_Sub41_Sub2_1.method7803(local178 << 16 | local197);
						}
					}
					Static84.aLong38 = local158.method8707();
				}
			}
			if (local151 != null) {
				local151.aClass5_Sub41_Sub2_1.method7839(local151.aClass5_Sub41_Sub2_1.anInt9230 - local153);
				Static495.method7092(local151);
			}
		}
		@Pc(464) int local464;
		if (local140 != null) {
			@Pc(446) long local446 = (local140.method8707() - Static347.aLong168) / 50L;
			if (local446 > 32767L) {
				local446 = 32767L;
			}
			Static347.aLong168 = local140.method8707();
			local464 = local140.method8702();
			if (local464 < 0) {
				local464 = 0;
			} else if (local464 > 65535) {
				local464 = 65535;
			}
			local178 = local140.method8703();
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 65535) {
				local178 = 65535;
			}
			@Pc(497) byte local497 = 0;
			if (local140.method8705() == 2) {
				local497 = 1;
			}
			local243 = (int) local446;
			@Pc(518) Class5_Sub21 local518 = Static64.method905(Static263.aClass49_1, Static299.aClass305_45);
			local518.aClass5_Sub41_Sub2_1.method7848(local497 << 15 | local243);
			local518.aClass5_Sub41_Sub2_1.method7806(local178 | local464 << 16);
			Static495.method7092(local518);
		}
		@Pc(575) long local575;
		if (Static676.anInt10853 > 0) {
			local151 = Static64.method905(Static263.aClass49_1, Static123.aClass305_21);
			local151.aClass5_Sub41_Sub2_1.method7798(Static676.anInt10853 * 3);
			for (local153 = 0; local153 < Static676.anInt10853; local153++) {
				@Pc(567) Interface16 local567 = Static194.anInterface16Array1[local153];
				local575 = (local567.method7502() - Static373.aLong176) / 50L;
				Static373.aLong176 = local567.method7502();
				if (local575 > 65535L) {
					local575 = 65535L;
				}
				local151.aClass5_Sub41_Sub2_1.method7798(local567.method7500());
				local151.aClass5_Sub41_Sub2_1.method7848((int) local575);
			}
			Static495.method7092(local151);
		}
		if (anInt7268 > 0) {
			anInt7268--;
		}
		if (Static260.aBoolean411 && anInt7268 <= 0) {
			anInt7268 = 20;
			Static260.aBoolean411 = false;
			local151 = Static64.method905(Static263.aClass49_1, Static53.aClass305_13);
			local151.aClass5_Sub41_Sub2_1.method7828((int) Static157.aFloat83 >> 3);
			local151.aClass5_Sub41_Sub2_1.method7809((int) Static298.aFloat116 >> 3);
			Static495.method7092(local151);
		}
		if (Static253.aBoolean373 != Static391.aBoolean602) {
			Static253.aBoolean373 = Static391.aBoolean602;
			local151 = Static64.method905(Static263.aClass49_1, Static104.aClass305_18);
			local151.aClass5_Sub41_Sub2_1.method7798(Static391.aBoolean602 ? 1 : 0);
			Static495.method7092(local151);
		}
		if (!Static244.aBoolean480) {
			local151 = Static64.method905(Static263.aClass49_1, Static240.aClass305_40);
			local151.aClass5_Sub41_Sub2_1.method7798(0);
			local153 = local151.aClass5_Sub41_Sub2_1.anInt9230;
			@Pc(716) Class5_Sub41 local716 = Static172.aClass5_Sub50_14.method7534();
			local151.aClass5_Sub41_Sub2_1.method7837(0, local716.anInt9230, local716.aByteArray93);
			local151.aClass5_Sub41_Sub2_1.method7839(local151.aClass5_Sub41_Sub2_1.anInt9230 - local153);
			Static495.method7092(local151);
			Static244.aBoolean480 = true;
		}
		if (Static635.aClass226ArrayArrayArray3 != null) {
			if (Static660.anInt10605 == 2) {
				Static6.method68();
			} else if (Static660.anInt10605 == 3) {
				Static80.method1041();
			}
		}
		if (Static64.aBoolean74) {
			Static64.aBoolean74 = false;
		} else {
			Static601.aFloat206 /= 2.0F;
		}
		if (Static535.aBoolean752) {
			Static535.aBoolean752 = false;
		} else {
			Static235.aFloat91 /= 2.0F;
		}
		Static625.method8464();
		if (Static173.anInt3397 != 10) {
			return;
		}
		Static40.method583();
		Static512.method7294();
		Static110.method2086();
		Static288.anInt5619++;
		if (Static288.anInt5619 > 750) {
			Static243.method3796();
			return;
		}
		Static162.method2877();
		Static469.method6689();
		Static205.method970();
		for (local71 = Static161.aClass237_3.method5685(true); local71 != -1; local71 = Static161.aClass237_3.method5685(false)) {
			Static637.method8574(local71);
			Static253.anIntArray242[Static548.anInt8995++ & 0x1F] = local71;
		}
		for (@Pc(846) Class5_Sub3_Sub17 local846 = Static648.method8696(); local846 != null; local846 = Static648.method8696()) {
			local464 = local846.method7293();
			local575 = local846.method7292();
			if (local464 == 1) {
				Static326.anIntArray342[(int) local575] = local846.anInt8546;
				Static550.aBoolean771 |= Static180.aBooleanArray15[(int) local575];
				Static202.anIntArray194[Static306.anInt5852++ & 0x1F] = (int) local575;
			} else if (local464 == 2) {
				Static2.aStringArray1[(int) local575] = local846.aString82;
				Static610.anIntArray550[Static199.anInt3806++ & 0x1F] = (int) local575;
			} else {
				@Pc(919) Class345 local919;
				if (local464 == 3) {
					local919 = Static264.method4120((int) local575);
					if (!local846.aString82.equals(local919.aString95)) {
						local919.aString95 = local846.aString82;
						Static211.method3351(local919);
					}
				} else {
					@Pc(955) int local955;
					if (local464 == 4) {
						local919 = Static264.method4120((int) local575);
						local249 = local846.anInt8546;
						local260 = local846.anInt8549;
						local955 = local846.anInt8545;
						if (local249 != local919.anInt9656 || local260 != local919.anInt9624 || local919.anInt9602 != local955) {
							local919.anInt9656 = local249;
							local919.anInt9602 = local955;
							local919.anInt9624 = local260;
							Static211.method3351(local919);
						}
					} else if (local464 == 5) {
						local919 = Static264.method4120((int) local575);
						if (local846.anInt8546 != local919.anInt9601 || local846.anInt8546 == -1) {
							local919.anInt9604 = 1;
							local919.anInt9646 = 0;
							local919.anInt9601 = local846.anInt8546;
							local919.anInt9658 = 0;
							@Pc(1031) Class175 local1031 = local919.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(local919.anInt9601);
							if (local1031 != null) {
								Static530.method7444(local919.anInt9646, local1031);
							}
							Static211.method3351(local919);
						}
					} else if (local464 == 6) {
						local243 = local846.anInt8546;
						local249 = local243 >> 10 & 0x1F;
						local260 = local243 >> 5 & 0x1F;
						local955 = local243 & 0x1F;
						@Pc(1482) int local1482 = (local249 << 19) - (-(local260 << 11) - (local955 << 3));
						@Pc(1487) Class345 local1487 = Static264.method4120((int) local575);
						if (local1482 != local1487.anInt9655) {
							local1487.anInt9655 = local1482;
							Static211.method3351(local1487);
						}
					} else if (local464 == 7) {
						local919 = Static264.method4120((int) local575);
						@Pc(1066) boolean local1066 = local846.anInt8546 == 1;
						if (local919.aBoolean809 != local1066) {
							local919.aBoolean809 = local1066;
							Static211.method3351(local919);
						}
					} else if (local464 == 8) {
						local919 = Static264.method4120((int) local575);
						if (local919.anInt9662 != local846.anInt8546 || local919.anInt9623 != local846.anInt8549 || local846.anInt8545 != local919.anInt9663) {
							local919.anInt9663 = local846.anInt8545;
							local919.anInt9623 = local846.anInt8549;
							local919.anInt9662 = local846.anInt8546;
							if (local919.anInt9654 != -1) {
								if (local919.anInt9634 > 0) {
									local919.anInt9663 = local919.anInt9663 * 32 / local919.anInt9634;
								} else if (local919.anInt9596 > 0) {
									local919.anInt9663 = local919.anInt9663 * 32 / local919.anInt9596;
								}
							}
							Static211.method3351(local919);
						}
					} else if (local464 == 9) {
						local919 = Static264.method4120((int) local575);
						if (local846.anInt8546 != local919.anInt9654 || local919.anInt9585 != local846.anInt8549) {
							local919.anInt9585 = local846.anInt8549;
							local919.anInt9654 = local846.anInt8546;
							Static211.method3351(local919);
						}
					} else if (local464 == 10) {
						local919 = Static264.method4120((int) local575);
						if (local846.anInt8546 != local919.anInt9581 || local919.anInt9667 != local846.anInt8549 || local846.anInt8545 != local919.anInt9633) {
							local919.anInt9581 = local846.anInt8546;
							local919.anInt9667 = local846.anInt8549;
							local919.anInt9633 = local846.anInt8545;
							Static211.method3351(local919);
						}
					} else if (local464 == 11) {
						local919 = Static264.method4120((int) local575);
						local919.aByte132 = 0;
						local919.aByte133 = 0;
						local919.anInt9588 = local919.anInt9647 = local846.anInt8549;
						local919.anInt9651 = local919.anInt9582 = local846.anInt8546;
						Static211.method3351(local919);
					} else if (local464 == 12) {
						local919 = Static264.method4120((int) local575);
						local249 = local846.anInt8546;
						if (local919 != null && local919.anInt9591 == 0) {
							if (local919.anInt9593 - local919.anInt9606 < local249) {
								local249 = local919.anInt9593 - local919.anInt9606;
							}
							if (local249 < 0) {
								local249 = 0;
							}
							if (local919.anInt9577 != local249) {
								local919.anInt9577 = local249;
								Static211.method3351(local919);
							}
						}
					} else if (local464 == 14) {
						local919 = Static264.method4120((int) local575);
						local919.anInt9669 = local846.anInt8546;
					} else if (local464 == 15) {
						Static680.anInt10897 = local846.anInt8546;
						Static209.aBoolean723 = true;
						Static54.anInt802 = local846.anInt8549;
					} else if (local464 == 16) {
						local919 = Static264.method4120((int) local575);
						local919.anInt9616 = local846.anInt8546;
					} else if (local464 == 17) {
						local919 = Static264.method4120((int) local575);
						local919.anInt9617 = local846.anInt8546;
					} else if (local464 == 18) {
						local919 = Static264.method4120((int) local575);
						local249 = (int) (local575 >> 32);
						local919.method8066(local249, (short) local846.anInt8546, (short) local846.anInt8549);
					} else if (local464 == 19) {
						local919 = Static264.method4120((int) local575);
						local249 = (int) (local575 >> 32);
						local919.method8069((short) local846.anInt8549, local249, (short) local846.anInt8546);
					}
				}
			}
		}
		if (Static645.anInt10469 != 0) {
			Static177.anInt3435 += 20;
			if (Static177.anInt3435 >= 400) {
				Static645.anInt10469 = 0;
			}
		}
		Static290.anInt5659++;
		if (Static206.aClass345_3 != null) {
			Static308.anInt5865++;
			if (Static308.anInt5865 >= 15) {
				Static211.method3351(Static206.aClass345_3);
				Static206.aClass345_3 = null;
			}
		}
		Static378.aClass345_9 = null;
		Static213.aBoolean807 = false;
		Static262.aClass345_6 = null;
		Static134.aBoolean183 = false;
		Static125.method2266(-1, -1, (Class345) null);
		Static269.method4158(-1, (Class345) null, -1);
		if (!Static55.aBoolean60) {
			Static105.anInt2256 = -1;
		}
		Static316.method4964();
		Static370.anInt8567++;
		if (Static557.aBoolean777) {
			@Pc(1576) Class5_Sub21 local1576 = Static64.method905(Static263.aClass49_1, Static145.aClass305_26);
			local1576.aClass5_Sub41_Sub2_1.method7806(Static570.anInt9300 << 28 | Static477.anInt8038 << 14 | Static308.anInt5858);
			Static495.method7092(local1576);
			Static557.aBoolean777 = false;
		}
		while (true) {
			@Pc(1599) Class5_Sub22 local1599;
			@Pc(1615) Class345 local1615;
			@Pc(1604) Class345 local1604;
			do {
				local1599 = (Class5_Sub22) Static203.aClass114_22.method2813();
				if (local1599 == null) {
					while (true) {
						do {
							local1599 = (Class5_Sub22) Static562.aClass114_62.method2813();
							if (local1599 == null) {
								while (true) {
									do {
										local1599 = (Class5_Sub22) Static637.aClass114_66.method2813();
										if (local1599 == null) {
											if (Static378.aClass345_9 == null) {
												Static101.anInt2198 = 0;
											}
											if (Static383.aClass345_10 != null) {
												Static327.method5080();
											}
											if (Static105.anInt2257 > 0 && Static17.aClass252_1.method8818(82) && Static17.aClass252_1.method8818(81) && Static133.anInt2650 != 0) {
												local464 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 - Static133.anInt2650;
												if (local464 < 0) {
													local464 = 0;
												} else if (local464 > 3) {
													local464 = 3;
												}
												Static442.method6446(Static153.anInt3147 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0], Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] + Static201.anInt3839, local464);
											}
											Static676.method9029();
											for (local464 = 0; local464 < 5; local464++) {
												@Pc(1802) int local1802 = Static131.anIntArray95[local464]++;
											}
											if (Static550.aBoolean771 && Static547.method7619() - 60000L > Static404.aLong184) {
												Static431.method6343();
											}
											for (@Pc(1827) Class28_Sub3_Sub2 local1827 = (Class28_Sub3_Sub2) Static205.aClass156_2.method3776(); local1827 != null; local1827 = (Class28_Sub3_Sub2) Static205.aClass156_2.method3783()) {
												if (Static547.method7619() / 1000L - 5L > (long) local1827.anInt9317) {
													if (local1827.aShort94 > 0) {
														Static234.method3619(0, "", "", "", local1827.aString88 + Static64.aClass52_19.method907(Static544.anInt8937), 5);
													}
													if (local1827.aShort94 == 0) {
														Static234.method3619(0, "", "", "", local1827.aString88 + Static64.aClass52_20.method907(Static544.anInt8937), 5);
													}
													local1827.method9022();
												}
											}
											Static322.anInt6039++;
											if (Static322.anInt6039 > 500) {
												Static322.anInt6039 = 0;
												local197 = (int) (Math.random() * 8.0D);
												if ((local197 & 0x1) == 1) {
													Static390.anInt6937 += Static415.anInt7346;
												}
												if ((local197 & 0x4) == 4) {
													Static430.anInt57 += Static310.anInt5910;
												}
												if ((local197 & 0x2) == 2) {
													Static110.anInt2345 += Static125.anInt2530;
												}
											}
											if (Static390.anInt6937 < -50) {
												Static415.anInt7346 = 2;
											}
											if (Static390.anInt6937 > 50) {
												Static415.anInt7346 = -2;
											}
											if (Static110.anInt2345 < -55) {
												Static125.anInt2530 = 2;
											}
											if (Static430.anInt57 < -40) {
												Static310.anInt5910 = 1;
											}
											if (Static110.anInt2345 > 55) {
												Static125.anInt2530 = -2;
											}
											Static644.anInt10424++;
											if (Static430.anInt57 > 40) {
												Static310.anInt5910 = -1;
											}
											if (Static644.anInt10424 > 500) {
												Static644.anInt10424 = 0;
												local197 = (int) (Math.random() * 8.0D);
												if ((local197 & 0x1) == 1) {
													Static213.anInt9568 += Static304.anInt5810;
												}
												if ((local197 & 0x2) == 2) {
													Static569.anInt9215 += Static270.anInt4987;
												}
											}
											if (Static213.anInt9568 < -60) {
												Static304.anInt5810 = 2;
											}
											if (Static213.anInt9568 > 60) {
												Static304.anInt5810 = -2;
											}
											if (Static569.anInt9215 < -20) {
												Static270.anInt4987 = 1;
											}
											if (Static569.anInt9215 > 10) {
												Static270.anInt4987 = -1;
											}
											Static292.anInt5664++;
											if (Static292.anInt5664 > 50) {
												@Pc(2054) Class5_Sub21 local2054 = Static64.method905(Static263.aClass49_1, Static5.aClass305_3);
												Static495.method7092(local2054);
											}
											if (Static147.aBoolean255) {
												Static517.method7320();
												Static147.aBoolean255 = false;
											}
											try {
												Static24.method6162();
												return;
											} catch (@Pc(2067) IOException local2067) {
												Static243.method3796();
												return;
											}
										}
										local1604 = local1599.aClass345_1;
										if (local1604.anInt9611 < 0) {
											break;
										}
										local1615 = Static264.method4120(local1604.anInt9657);
									} while (local1615 == null || local1615.aClass345Array1 == null || local1604.anInt9611 >= local1615.aClass345Array1.length || local1615.aClass345Array1[local1604.anInt9611] != local1604);
									Static652.method8743(local1599);
								}
							}
							local1604 = local1599.aClass345_1;
							if (local1604.anInt9611 < 0) {
								break;
							}
							local1615 = Static264.method4120(local1604.anInt9657);
						} while (local1615 == null || local1615.aClass345Array1 == null || local1604.anInt9611 >= local1615.aClass345Array1.length || local1604 != local1615.aClass345Array1[local1604.anInt9611]);
						Static652.method8743(local1599);
					}
				}
				local1604 = local1599.aClass345_1;
				if (local1604.anInt9611 < 0) {
					break;
				}
				local1615 = Static264.method4120(local1604.anInt9657);
			} while (local1615 == null || local1615.aClass345Array1 == null || local1604.anInt9611 >= local1615.aClass345Array1.length || local1615.aClass345Array1[local1604.anInt9611] != local1604);
			Static652.method8743(local1599);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([BIIIIII)V")
	public static void method6022(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static111.method4954(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static111.method4954(arg3)) {
			@Pc(34) int local34 = Static105.method2031(arg5);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg3 > arg2 ? arg2 : arg3;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(57) byte[] local57 = arg0;
			@Pc(64) byte[] local64 = new byte[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg1, arg2, arg3, 0, arg5, 5121, local57, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(82) int local82 = arg2 * local34;
				@Pc(84) byte[] local84 = local64;
				for (@Pc(86) int local86 = 0; local86 < local34; local86++) {
					@Pc(89) int local89 = local86;
					@Pc(91) int local91 = local86;
					@Pc(95) int local95 = local82 + local86;
					for (@Pc(97) int local97 = 0; local97 < local51; local97++) {
						for (@Pc(100) int local100 = 0; local100 < local47; local100++) {
							@Pc(105) byte local105 = local57[local91];
							local91 += local34;
							@Pc(115) int local115 = local105 + local57[local91];
							@Pc(121) int local121 = local115 + local57[local95];
							local91 += local34;
							local95 += local34;
							@Pc(135) int local135 = local121 + local57[local95];
							local95 += local34;
							local64[local89] = (byte) (local135 >> 2);
							local89 += local34;
						}
						local91 += local82;
						local95 += local82;
					}
				}
				local64 = local57;
				arg3 = local51;
				local57 = local84;
				arg2 = local47;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
