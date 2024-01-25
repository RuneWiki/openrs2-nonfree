import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	public static void method5096() {
		if (Static16.anInt9847 == 0 || Static16.anInt9847 == 5) {
			return;
		}
		try {
			@Pc(23) short local23;
			if (Static462.anInt8060 == 0) {
				local23 = 250;
			} else {
				local23 = 2000;
			}
			if (++Static537.anInt10361 > local23) {
				if (Static537.aClass240_34 != null) {
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
				}
				if (Static462.anInt8060 >= 3) {
					Static16.anInt9847 = 0;
					Static97.method1623(-5);
					return;
				}
				if (Static62.anInt991 == 2) {
					Static6.aClass365_1.method8293();
				} else {
					Static515.aClass365_4.method8293();
				}
				Static462.anInt8060++;
				Static16.anInt9847 = 1;
				Static537.anInt10361 = 0;
			}
			if (Static16.anInt9847 == 1) {
				if (Static62.anInt991 == 2) {
					Static444.aClass297_6 = Static6.aClass365_1.method8291(Static150.aClass202_2);
				} else {
					Static444.aClass297_6 = Static515.aClass365_4.method8291(Static150.aClass202_2);
				}
				Static16.anInt9847 = 2;
			}
			@Pc(133) Class5_Sub16 local133;
			if (Static16.anInt9847 == 2) {
				if (Static444.aClass297_6.anInt8459 == 2) {
					throw new IOException();
				}
				if (Static444.aClass297_6.anInt8459 != 1) {
					return;
				}
				Static537.aClass240_34 = Static311.method4773((Socket) Static444.aClass297_6.anObject15);
				Static444.aClass297_6 = null;
				Static546.method7533();
				local133 = Static444.method6617();
				local133.aClass5_Sub15_Sub2_1.method3651(Static304.aClass208_1.anInt5598);
				Static479.method7038(local133);
				Static652.method8576();
				Static16.anInt9847 = 3;
			}
			@Pc(170) int local170;
			if (Static16.anInt9847 == 3) {
				if (!Static537.aClass240_34.method5659(1)) {
					return;
				}
				Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				local170 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
				if (local170 != 0) {
					Static16.anInt9847 = 0;
					Static97.method1623(local170);
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
					Static229.method3276();
					return;
				}
				Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
				@Pc(196) Class5_Sub15 local196 = new Class5_Sub15(518);
				@Pc(199) int[] local199 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local196.method3651(10);
				local196.method3679(local199[0]);
				local196.method3679(local199[1]);
				local196.method3679(local199[2]);
				local196.method3679(local199[3]);
				local196.method3648(0L);
				local196.method3680(Static159.aString25);
				local196.method3648(Static416.aLong216);
				local196.method3648(Static149.aLong92);
				local196.method3652(Static198.aBigInteger2, Static517.aBigInteger6);
				Static546.method7533();
				@Pc(281) Class5_Sub16 local281 = Static444.method6617();
				@Pc(284) Class5_Sub15_Sub2 local284 = local281.aClass5_Sub15_Sub2_1;
				@Pc(299) int local299;
				@Pc(314) int local314;
				if (Static62.anInt991 == 2) {
					if (Static539.anInt8853 == 13) {
						local284.method3651(Static304.aClass208_5.anInt5598);
					} else {
						local284.method3651(Static304.aClass208_3.anInt5598);
					}
					local284.method3660(0);
					local299 = local284.anInt4144;
					local284.method3679(644);
					local284.method3685(local196.aByteArray45, local196.anInt4144, 0);
					local314 = local284.anInt4144;
					local284.method3680(Static154.aString24);
					local284.method3651(Static69.anInt1053);
					local284.method3651(Static581.method7952());
					local284.method3660(Static563.anInt9176);
					local284.method3660(Static316.anInt8165);
					local284.method3651(Static655.aClass5_Sub36_29.aClass2_Sub28_1.method8721());
					Static654.method8343(local284);
					local284.method3680(Static471.aString82);
					local284.method3679(Static312.anInt5547);
					@Pc(438) Class5_Sub15 local438 = Static655.aClass5_Sub36_29.method5352();
					local284.method3651(local438.anInt4144);
					local284.method3685(local438.aByteArray45, local438.anInt4144, 0);
					Static97.aBoolean118 = true;
					@Pc(460) Class5_Sub15 local460 = new Class5_Sub15(Static87.aClass5_Sub30_1.method3856());
					Static87.aClass5_Sub30_1.method3857(local460);
					local284.method3685(local460.aByteArray45, local460.aByteArray45.length, 0);
					local284.method3660(Static500.anInt8514);
					local284.method3648(Static55.aLong47);
					local284.method3651(Static577.aString98 == null ? 0 : 1);
					if (Static577.aString98 != null) {
						local284.method3680(Static577.aString98);
					}
					local284.method3651(Static371.method5449("jagtheora") ? 1 : 0);
					local284.method3651(Static394.aBoolean491 ? 1 : 0);
					Static536.method7433(local284);
					local284.method3687(local199, local314, local284.anInt4144);
					local284.method3644(local284.anInt4144 - local299);
				} else {
					local284.method3651(Static304.aClass208_6.anInt5598);
					local284.method3660(0);
					local299 = local284.anInt4144;
					local284.method3679(644);
					local284.method3685(local196.aByteArray45, local196.anInt4144, 0);
					local314 = local284.anInt4144;
					local284.method3680(Static154.aString24);
					local284.method3651(Static591.aClass174_7.anInt4124);
					local284.method3651(Static259.anInt4113);
					Static654.method8343(local284);
					local284.method3680(Static471.aString82);
					local284.method3679(Static312.anInt5547);
					Static536.method7433(local284);
					local284.method3687(local199, local314, local284.anInt4144);
					local284.method3644(local284.anInt4144 - local299);
				}
				Static479.method7038(local281);
				Static652.method8576();
				Static16.aClass332_8 = new Class332(local199);
				for (local299 = 0; local299 < 4; local299++) {
					local199[local299] += 50;
				}
				Static386.aClass5_Sub15_Sub2_2.method3705(local199);
				Static16.anInt9847 = 4;
			}
			if (Static16.anInt9847 == 4) {
				if (!Static537.aClass240_34.method5659(1)) {
					return;
				}
				Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				local170 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
				if (local170 == 21) {
					Static16.anInt9847 = 7;
				} else if (local170 == 29) {
					Static16.anInt9847 = 13;
				} else if (local170 == 1) {
					Static16.anInt9847 = 5;
					Static97.method1623(local170);
					return;
				} else if (local170 == 2) {
					Static16.anInt9847 = 8;
				} else if (local170 == 15) {
					Static139.anInt2291 = -2;
					Static16.anInt9847 = 14;
				} else if (local170 == 23 && Static462.anInt8060 < 3) {
					Static462.anInt8060++;
					Static16.anInt9847 = 1;
					Static537.anInt10361 = 0;
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
					return;
				} else {
					Static16.anInt9847 = 0;
					Static97.method1623(local170);
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
					Static229.method3276();
					return;
				}
			}
			if (Static16.anInt9847 == 6) {
				Static546.method7533();
				local133 = Static444.method6617();
				@Pc(677) Class5_Sub15_Sub2 local677 = local133.aClass5_Sub15_Sub2_1;
				local677.method3699(Static16.aClass332_8);
				local677.method3704(Static304.aClass208_10.anInt5598);
				Static479.method7038(local133);
				Static652.method8576();
				Static16.anInt9847 = 4;
			} else if (Static16.anInt9847 == 7) {
				if (Static537.aClass240_34.method5659(1)) {
					Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
					local170 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
					Static216.anInt3460 = local170 * 50;
					Static16.anInt9847 = 0;
					Static97.method1623(21);
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
					Static229.method3276();
				}
			} else if (Static16.anInt9847 == 13) {
				if (Static537.aClass240_34.method5659(1)) {
					Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
					Static155.anInt2603 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
					Static16.anInt9847 = 0;
					Static97.method1623(29);
					Static537.aClass240_34.method5658();
					Static537.aClass240_34 = null;
					Static229.method3276();
				}
			} else if (Static16.anInt9847 != 8) {
				@Pc(808) Class5_Sub15_Sub2 local808;
				if (Static16.anInt9847 == 9) {
					local808 = Static386.aClass5_Sub15_Sub2_2;
					if (Static62.anInt991 == 2) {
						if (!Static537.aClass240_34.method5659(Static309.anInt5515)) {
							return;
						}
						Static537.aClass240_34.method5656(Static309.anInt5515, 0, local808.aByteArray45);
						local808.anInt4144 = 0;
						Static281.anInt4403 = local808.method3642();
						Static122.anInt2142 = local808.method3642();
						Static533.aBoolean637 = local808.method3642() == 1;
						Static236.aBoolean266 = local808.method3642() == 1;
						Static556.aBoolean653 = local808.method3642() == 1;
						Static528.aBoolean633 = local808.method3642() == 1;
						Static177.anInt2910 = local808.method3698();
						Static513.aBoolean630 = local808.method3642() == 1;
						Static630.anInt10061 = local808.method3641();
						Static581.aBoolean701 = local808.method3642() == 1;
						Static400.aClass140_4.method2842(Static581.aBoolean701);
						Static259.aClass135_1.method2773(Static581.aBoolean701);
						Static58.aClass230_1.method5296(Static581.aBoolean701);
					} else if (Static537.aClass240_34.method5659(Static309.anInt5515)) {
						Static537.aClass240_34.method5656(Static309.anInt5515, 0, local808.aByteArray45);
						local808.anInt4144 = 0;
						Static281.anInt4403 = local808.method3642();
						Static122.anInt2142 = local808.method3642();
						Static533.aBoolean637 = local808.method3642() == 1;
						Static236.aBoolean266 = local808.method3642() == 1;
						Static556.aBoolean653 = local808.method3642() == 1;
						Static389.aLong43 = local808.method3634();
						Static656.aLong322 = Static389.aLong43 - Static124.method1947() - local808.method3666();
						@Pc(990) int local990 = local808.method3642();
						Static668.aBoolean768 = (local990 & 0x2) != 0;
						Static513.aBoolean630 = (local990 & 0x1) != 0;
						Static204.anInt3269 = local808.method3671();
						Static458.anInt7967 = local808.method3698();
						Static547.anInt8952 = local808.method3698();
						Static136.anInt2270 = local808.method3698();
						Static54.anInt8560 = local808.method3671();
						Static333.aClass297_4 = Static150.aClass202_2.method4729(Static54.anInt8560);
						Static233.anInt3759 = local808.method3642();
						Static415.anInt7080 = local808.method3698();
						Static399.anInt6907 = local808.method3698();
						Static317.aBoolean397 = local808.method3642() == 1;
						Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString101 = Static126.aString19 = local808.method3674();
						Static316.anInt8166 = local808.method3642();
						Static614.anInt9895 = local808.method3671();
						Static118.aBoolean145 = local808.method3642() == 1;
						Static617.aClass365_6 = new Class365();
						Static617.aClass365_6.anInt9973 = local808.method3698();
						if (Static617.aClass365_6.anInt9973 == 65535) {
							Static617.aClass365_6.anInt9973 = -1;
						}
						Static617.aClass365_6.aString112 = local808.method3674();
						if (Static99.aClass267_3 != Static71.aClass267_2) {
							Static617.aClass365_6.anInt9970 = Static617.aClass365_6.anInt9973 + 50000;
							Static617.aClass365_6.anInt9967 = Static617.aClass365_6.anInt9973 + 40000;
						}
						if (Static99.aClass267_3 != Static223.aClass267_5 && (Static67.aClass267_1 != Static99.aClass267_3 || Static281.anInt4403 < 2) && (Static6.aClass365_1.method8289(Static90.aClass365_2) || Static6.aClass365_1.method8289(Static457.aClass365_5))) {
							Static633.method8422();
						}
					} else {
						return;
					}
					if (Static533.aBoolean637 && !Static556.aBoolean653 || Static513.aBoolean630) {
						try {
							Static680.method2300("zap", Static285.anApplet5);
						} catch (@Pc(1154) Throwable local1154) {
							if (Static28.aBoolean15) {
								try {
									Static285.anApplet5.getAppletContext().showDocument(new URL(Static285.anApplet5.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1168) Exception local1168) {
								}
							}
						}
					} else {
						try {
							Static680.method2300("unzap", Static285.anApplet5);
						} catch (@Pc(1177) Throwable local1177) {
						}
					}
					if (Static71.aClass267_2 == Static99.aClass267_3) {
						try {
							Static680.method2300("loggedin", Static285.anApplet5);
						} catch (@Pc(1188) Throwable local1188) {
						}
					}
					if (Static62.anInt991 != 2) {
						Static16.anInt9847 = 0;
						Static97.method1623(2);
						Static323.method5029();
						Static42.method560(7);
						Static398.aClass196_212 = null;
						return;
					}
					Static16.anInt9847 = 11;
				}
				if (Static16.anInt9847 == 11) {
					if (!Static537.aClass240_34.method5659(3)) {
						return;
					}
					Static537.aClass240_34.method5656(3, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
					Static16.anInt9847 = 12;
				}
				if (Static16.anInt9847 == 12) {
					local808 = Static386.aClass5_Sub15_Sub2_2;
					local808.anInt4144 = 0;
					if (local808.method3708()) {
						if (!Static537.aClass240_34.method5659(1)) {
							return;
						}
						Static537.aClass240_34.method5656(1, 3, local808.aByteArray45);
					}
					Static398.aClass196_212 = Static455.method6720()[local808.method3706()];
					Static139.anInt2291 = local808.method3698();
					Static16.anInt9847 = 10;
				}
				if (Static16.anInt9847 == 10) {
					if (Static537.aClass240_34.method5659(Static139.anInt2291)) {
						Static537.aClass240_34.method5656(Static139.anInt2291, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
						Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
						local170 = Static139.anInt2291;
						Static16.anInt9847 = 0;
						Static97.method1623(2);
						Static296.method4061();
						Static183.method3164(Static386.aClass5_Sub15_Sub2_2);
						Static216.anInt3459 = -1;
						if (Static444.aClass196_241 == Static398.aClass196_212) {
							Static355.method5248();
						} else {
							Static559.method7676();
						}
						if (Static386.aClass5_Sub15_Sub2_2.anInt4144 != local170) {
							throw new RuntimeException("lswp pos:" + Static386.aClass5_Sub15_Sub2_2.anInt4144 + " psize:" + local170);
						}
						Static398.aClass196_212 = null;
					}
				} else if (Static16.anInt9847 == 14) {
					if (Static139.anInt2291 == -2) {
						if (!Static537.aClass240_34.method5659(2)) {
							return;
						}
						Static537.aClass240_34.method5656(2, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
						Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
						Static139.anInt2291 = Static386.aClass5_Sub15_Sub2_2.method3698();
					}
					if (Static537.aClass240_34.method5659(Static139.anInt2291)) {
						Static537.aClass240_34.method5656(Static139.anInt2291, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
						Static386.aClass5_Sub15_Sub2_2.anInt4144 = 0;
						Static16.anInt9847 = 0;
						local170 = Static139.anInt2291;
						Static97.method1623(15);
						Static187.method2725();
						Static183.method3164(Static386.aClass5_Sub15_Sub2_2);
						if (local170 != Static386.aClass5_Sub15_Sub2_2.anInt4144) {
							throw new RuntimeException("lswpr pos:" + Static386.aClass5_Sub15_Sub2_2.anInt4144 + " psize:" + local170);
						}
						Static398.aClass196_212 = null;
					}
				}
			} else if (Static537.aClass240_34.method5659(1)) {
				Static537.aClass240_34.method5656(1, 0, Static386.aClass5_Sub15_Sub2_2.aByteArray45);
				Static309.anInt5515 = Static386.aClass5_Sub15_Sub2_2.aByteArray45[0] & 0xFF;
				Static16.anInt9847 = 9;
			}
		} catch (@Pc(1429) IOException local1429) {
			if (Static537.aClass240_34 != null) {
				Static537.aClass240_34.method5658();
				Static537.aClass240_34 = null;
			}
			if (Static462.anInt8060 < 3) {
				if (Static62.anInt991 == 2) {
					Static6.aClass365_1.method8293();
				} else {
					Static515.aClass365_4.method8293();
				}
				Static16.anInt9847 = 1;
				Static537.anInt10361 = 0;
				Static462.anInt8060++;
			} else {
				Static16.anInt9847 = 0;
				Static97.method1623(-4);
				Static229.method3276();
			}
		}
	}
}
