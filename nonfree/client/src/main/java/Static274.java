import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
	public static int anInt5021;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
	public static int anInt5033;

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "Lclient!wm;")
	public static Class390 aClass390_67;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
	public static void method4249() {
		if (Static273.anInt5015 == 0 || Static273.anInt5015 == 5) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Static354.anInt6414 == 0) {
				local21 = 250;
			} else {
				local21 = 2000;
			}
			if (++Static467.anInt7867 > local21) {
				if (Static12.aClass244_1 != null) {
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
				}
				if (Static354.anInt6414 >= 3) {
					Static273.anInt5015 = 0;
					Static221.method8979(-5);
					return;
				}
				if (Static245.anInt780 == 2) {
					Static514.aClass395_4.method9035();
				} else {
					Static585.aClass395_5.method9035();
				}
				Static467.anInt7867 = 0;
				Static354.anInt6414++;
				Static273.anInt5015 = 1;
			}
			if (Static273.anInt5015 == 1) {
				if (Static245.anInt780 == 2) {
					Static351.aClass331_4 = Static514.aClass395_4.method9037(Static570.aClass268_5);
				} else {
					Static351.aClass331_4 = Static585.aClass395_5.method9037(Static570.aClass268_5);
				}
				Static273.anInt5015 = 2;
			}
			@Pc(124) Class5_Sub21 local124;
			if (Static273.anInt5015 == 2) {
				if (Static351.aClass331_4.anInt9108 == 2) {
					throw new IOException();
				}
				if (Static351.aClass331_4.anInt9108 != 1) {
					return;
				}
				Static12.aClass244_1 = Static582.method9008((Socket) Static351.aClass331_4.anObject20);
				Static351.aClass331_4 = null;
				Static182.method3063();
				local124 = Static63.method894();
				local124.aClass5_Sub41_Sub2_1.method7798(Static146.aClass111_1.anInt3148);
				Static495.method7092(local124);
				Static24.method6162();
				Static273.anInt5015 = 3;
			}
			@Pc(163) int local163;
			if (Static273.anInt5015 == 3) {
				if (!Static12.aClass244_1.method5750(1)) {
					return;
				}
				Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
				local163 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
				if (local163 != 0) {
					Static273.anInt5015 = 0;
					Static221.method8979(local163);
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
					Static573.method7908();
					return;
				}
				Static474.aClass5_Sub41_Sub2_2.anInt9230 = 0;
				@Pc(193) Class5_Sub41 local193 = new Class5_Sub41(518);
				@Pc(196) int[] local196 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local193.method7798(10);
				local193.method7803(local196[0]);
				local193.method7803(local196[1]);
				local193.method7803(local196[2]);
				local193.method7803(local196[3]);
				local193.method7824(0L);
				local193.method7854(Static511.aString83);
				local193.method7824(Static288.aLong136);
				local193.method7824(Static514.aLong242);
				local193.method7853(Static326.aBigInteger2, Static327.aBigInteger3);
				Static182.method3063();
				@Pc(278) Class5_Sub21 local278 = Static63.method894();
				@Pc(281) Class5_Sub41_Sub2 local281 = local278.aClass5_Sub41_Sub2_1;
				@Pc(298) int local298;
				@Pc(313) int local313;
				if (Static245.anInt780 == 2) {
					if (Static173.anInt3397 == 13) {
						local281.method7798(Static146.aClass111_5.anInt3148);
					} else {
						local281.method7798(Static146.aClass111_3.anInt3148);
					}
					local281.method7848(0);
					local298 = local281.anInt9230;
					local281.method7803(647);
					local281.method7837(0, local193.anInt9230, local193.aByteArray93);
					local313 = local281.anInt9230;
					local281.method7854(Static178.aString23);
					local281.method7798(Static270.anInt4979);
					local281.method7798(Static469.method6688());
					local281.method7848(Static32.anInt510);
					local281.method7848(Static79.anInt1140);
					local281.method7798(Static172.aClass5_Sub50_14.aClass12_Sub6_1.method1989());
					Static663.method8838(local281);
					local281.method7854(Static89.aString11);
					local281.method7803(Static254.anInt4619);
					@Pc(437) Class5_Sub41 local437 = Static172.aClass5_Sub50_14.method7534();
					local281.method7798(local437.anInt9230);
					local281.method7837(0, local437.anInt9230, local437.aByteArray93);
					Static244.aBoolean480 = true;
					@Pc(459) Class5_Sub41 local459 = new Class5_Sub41(Static580.aClass5_Sub30_1.method4025());
					Static580.aClass5_Sub30_1.method4031(local459);
					local281.method7837(0, local459.aByteArray93.length, local459.aByteArray93);
					local281.method7848(Static446.anInt7663);
					local281.method7824(Static571.aLong266);
					local281.method7798(Static60.aString73 == null ? 0 : 1);
					if (Static60.aString73 != null) {
						local281.method7854(Static60.aString73);
					}
					local281.method7798(Static64.method906("jagtheora") ? 1 : 0);
					local281.method7798(Static361.aBoolean581 ? 1 : 0);
					Static164.method2895(local281);
					local281.method7844(local313, local196, local281.anInt9230);
					local281.method7841(local281.anInt9230 - local298);
				} else {
					local281.method7798(Static146.aClass111_6.anInt3148);
					local281.method7848(0);
					local298 = local281.anInt9230;
					local281.method7803(647);
					local281.method7837(0, local193.anInt9230, local193.aByteArray93);
					local313 = local281.anInt9230;
					local281.method7854(Static178.aString23);
					local281.method7798(Static218.aClass98_2.anInt2677);
					local281.method7798(Static544.anInt8937);
					Static663.method8838(local281);
					local281.method7854(Static89.aString11);
					local281.method7803(Static254.anInt4619);
					Static164.method2895(local281);
					local281.method7844(local313, local196, local281.anInt9230);
					local281.method7841(local281.anInt9230 - local298);
				}
				Static495.method7092(local278);
				Static24.method6162();
				Static263.aClass49_1 = new Class49(local196);
				for (local298 = 0; local298 < 4; local298++) {
					local196[local298] += 50;
				}
				Static474.aClass5_Sub41_Sub2_2.method7866(local196);
				Static273.anInt5015 = 4;
			}
			if (Static273.anInt5015 == 4) {
				if (!Static12.aClass244_1.method5750(1)) {
					return;
				}
				Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
				local163 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
				if (local163 == 21) {
					Static273.anInt5015 = 7;
				} else if (local163 == 29) {
					Static273.anInt5015 = 13;
				} else if (local163 == 1) {
					Static273.anInt5015 = 5;
					Static221.method8979(local163);
					return;
				} else if (local163 == 2) {
					Static273.anInt5015 = 8;
				} else if (local163 == 15) {
					Static273.anInt5015 = 14;
					Static630.anInt10261 = -2;
				} else if (local163 == 23 && Static354.anInt6414 < 3) {
					Static273.anInt5015 = 1;
					Static467.anInt7867 = 0;
					Static354.anInt6414++;
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
					return;
				} else {
					Static273.anInt5015 = 0;
					Static221.method8979(local163);
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
					Static573.method7908();
					return;
				}
			}
			if (Static273.anInt5015 == 6) {
				Static182.method3063();
				local124 = Static63.method894();
				@Pc(672) Class5_Sub41_Sub2 local672 = local124.aClass5_Sub41_Sub2_1;
				local672.method7870(Static263.aClass49_1);
				local672.method7875(Static146.aClass111_10.anInt3148);
				Static495.method7092(local124);
				Static24.method6162();
				Static273.anInt5015 = 4;
			} else if (Static273.anInt5015 == 7) {
				if (Static12.aClass244_1.method5750(1)) {
					Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
					local163 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
					Static134.anInt1984 = local163 * 50;
					Static273.anInt5015 = 0;
					Static221.method8979(21);
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
					Static573.method7908();
				}
			} else if (Static273.anInt5015 == 13) {
				if (Static12.aClass244_1.method5750(1)) {
					Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
					Static273.anInt5015 = 0;
					Static283.anInt5420 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
					Static221.method8979(29);
					Static12.aClass244_1.method5753();
					Static12.aClass244_1 = null;
					Static573.method7908();
				}
			} else if (Static273.anInt5015 != 8) {
				@Pc(803) Class5_Sub41_Sub2 local803;
				if (Static273.anInt5015 == 9) {
					local803 = Static474.aClass5_Sub41_Sub2_2;
					if (Static245.anInt780 == 2) {
						if (!Static12.aClass244_1.method5750(Static520.anInt8645)) {
							return;
						}
						Static12.aClass244_1.method5754(Static520.anInt8645, local803.aByteArray93, 0);
						local803.anInt9230 = 0;
						Static105.anInt2257 = local803.method7816();
						Static566.anInt9193 = local803.method7816();
						Static185.aBoolean287 = local803.method7816() == 1;
						Static373.aBoolean589 = local803.method7816() == 1;
						Static607.aBoolean695 = local803.method7816() == 1;
						Static211.aBoolean327 = local803.method7816() == 1;
						Static216.anInt4046 = local803.method7860();
						Static289.aBoolean488 = local803.method7816() == 1;
						Static42.anInt678 = local803.method7801();
						Static530.aBoolean743 = local803.method7816() == 1;
						Static568.aClass315_5.method7508(Static530.aBoolean743);
						Static110.aClass105_1.method2648(Static530.aBoolean743);
						Static231.aClass19_2.method279(Static530.aBoolean743);
					} else if (Static12.aClass244_1.method5750(Static520.anInt8645)) {
						Static12.aClass244_1.method5754(Static520.anInt8645, local803.aByteArray93, 0);
						local803.anInt9230 = 0;
						Static105.anInt2257 = local803.method7816();
						Static566.anInt9193 = local803.method7816();
						Static185.aBoolean287 = local803.method7816() == 1;
						Static373.aBoolean589 = local803.method7816() == 1;
						Static607.aBoolean695 = local803.method7816() == 1;
						Static508.aLong239 = local803.method7823();
						Static483.aLong227 = Static508.aLong239 - Static547.method7619() - local803.method7808();
						@Pc(988) int local988 = local803.method7816();
						Static487.aBoolean691 = (local988 & 0x2) != 0;
						Static289.aBoolean488 = (local988 & 0x1) != 0;
						Static676.anInt10854 = local803.method7804();
						Static81.anInt1279 = local803.method7860();
						Static500.anInt8319 = local803.method7860();
						Static497.anInt7300 = local803.method7860();
						Static560.anInt9128 = local803.method7804();
						Static120.aClass331_2 = Static570.aClass268_5.method6328(Static560.anInt9128);
						Static206.anInt3874 = local803.method7816();
						Static382.anInt6788 = local803.method7860();
						Static639.anInt10382 = local803.method7860();
						Static401.aBoolean620 = local803.method7816() == 1;
						Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString44 = Static140.aString14 = local803.method7813();
						Static621.anInt10180 = local803.method7816();
						Static657.anInt10586 = local803.method7804();
						Static496.aBoolean706 = local803.method7816() == 1;
						Static513.aClass395_3 = new Class395();
						Static513.aClass395_3.anInt10873 = local803.method7860();
						if (Static513.aClass395_3.anInt10873 == 65535) {
							Static513.aClass395_3.anInt10873 = -1;
						}
						Static513.aClass395_3.aString122 = local803.method7813();
						if (Static560.aClass187_13 != Static217.aClass187_7) {
							Static513.aClass395_3.anInt10870 = Static513.aClass395_3.anInt10873 + 50000;
							Static513.aClass395_3.anInt10879 = Static513.aClass395_3.anInt10873 + 40000;
						}
						if (Static217.aClass187_7 != Static432.aClass187_10 && (Static104.aClass187_1 != Static217.aClass187_7 || Static105.anInt2257 < 2) && (Static514.aClass395_4.method9036(Static343.aClass395_2) || Static514.aClass395_4.method9036(Static308.aClass395_1))) {
							Static477.method6824();
						}
					} else {
						return;
					}
					if (Static185.aBoolean287 && !Static607.aBoolean695 || Static289.aBoolean488) {
						try {
							Static682.method3657("zap", Static639.anApplet2);
						} catch (@Pc(1147) Throwable local1147) {
							if (Static42.aBoolean48) {
								try {
									Static639.anApplet2.getAppletContext().showDocument(new URL(Static639.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1161) Exception local1161) {
								}
							}
						}
					} else {
						try {
							Static682.method3657("unzap", Static639.anApplet2);
						} catch (@Pc(1169) Throwable local1169) {
						}
					}
					if (Static560.aClass187_13 == Static217.aClass187_7) {
						try {
							Static682.method3657("loggedin", Static639.anApplet2);
						} catch (@Pc(1180) Throwable local1180) {
						}
					}
					if (Static245.anInt780 != 2) {
						Static273.anInt5015 = 0;
						Static221.method8979(2);
						Static406.method5970();
						Static271.method4671(7);
						Static42.aClass359_12 = null;
						return;
					}
					Static273.anInt5015 = 11;
				}
				if (Static273.anInt5015 == 11) {
					if (!Static12.aClass244_1.method5750(3)) {
						return;
					}
					Static12.aClass244_1.method5754(3, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
					Static273.anInt5015 = 12;
				}
				if (Static273.anInt5015 == 12) {
					local803 = Static474.aClass5_Sub41_Sub2_2;
					local803.anInt9230 = 0;
					if (local803.method7865()) {
						if (!Static12.aClass244_1.method5750(1)) {
							return;
						}
						Static12.aClass244_1.method5754(1, local803.aByteArray93, 3);
					}
					Static42.aClass359_12 = Static576.method7938()[local803.method7868()];
					Static630.anInt10261 = local803.method7860();
					Static273.anInt5015 = 10;
				}
				if (Static273.anInt5015 == 10) {
					if (Static12.aClass244_1.method5750(Static630.anInt10261)) {
						Static12.aClass244_1.method5754(Static630.anInt10261, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
						Static474.aClass5_Sub41_Sub2_2.anInt9230 = 0;
						local163 = Static630.anInt10261;
						Static273.anInt5015 = 0;
						Static221.method8979(2);
						Static544.method7592();
						Static149.method2717(Static474.aClass5_Sub41_Sub2_2);
						Static427.anInt7491 = -1;
						if (Static279.aClass359_98 == Static42.aClass359_12) {
							Static536.method7518();
						} else {
							Static556.method7713();
						}
						if (local163 != Static474.aClass5_Sub41_Sub2_2.anInt9230) {
							throw new RuntimeException("lswp pos:" + Static474.aClass5_Sub41_Sub2_2.anInt9230 + " psize:" + local163);
						}
						Static42.aClass359_12 = null;
					}
				} else if (Static273.anInt5015 == 14) {
					if (Static630.anInt10261 == -2) {
						if (!Static12.aClass244_1.method5750(2)) {
							return;
						}
						Static12.aClass244_1.method5754(2, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
						Static474.aClass5_Sub41_Sub2_2.anInt9230 = 0;
						Static630.anInt10261 = Static474.aClass5_Sub41_Sub2_2.method7860();
					}
					if (Static12.aClass244_1.method5750(Static630.anInt10261)) {
						Static12.aClass244_1.method5754(Static630.anInt10261, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
						Static474.aClass5_Sub41_Sub2_2.anInt9230 = 0;
						local163 = Static630.anInt10261;
						Static273.anInt5015 = 0;
						Static221.method8979(15);
						Static611.method8318();
						Static149.method2717(Static474.aClass5_Sub41_Sub2_2);
						if (Static474.aClass5_Sub41_Sub2_2.anInt9230 != local163) {
							throw new RuntimeException("lswpr pos:" + Static474.aClass5_Sub41_Sub2_2.anInt9230 + " psize:" + local163);
						}
						Static42.aClass359_12 = null;
					}
				}
			} else if (Static12.aClass244_1.method5750(1)) {
				Static12.aClass244_1.method5754(1, Static474.aClass5_Sub41_Sub2_2.aByteArray93, 0);
				Static273.anInt5015 = 9;
				Static520.anInt8645 = Static474.aClass5_Sub41_Sub2_2.aByteArray93[0] & 0xFF;
			}
		} catch (@Pc(1405) IOException local1405) {
			if (Static12.aClass244_1 != null) {
				Static12.aClass244_1.method5753();
				Static12.aClass244_1 = null;
			}
			if (Static354.anInt6414 >= 3) {
				Static273.anInt5015 = 0;
				Static221.method8979(-4);
				Static573.method7908();
			} else {
				if (Static245.anInt780 == 2) {
					Static514.aClass395_4.method9035();
				} else {
					Static585.aClass395_5.method9035();
				}
				Static273.anInt5015 = 1;
				Static467.anInt7867 = 0;
				Static354.anInt6414++;
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public static void method4251() {
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub8_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub8_2);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub13_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub13_2);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub10_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub2_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub11_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub19_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub18_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub25_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub21_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub4_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub29_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub20_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub6_2);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub6_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub28_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub1_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub15_1);
		Static637.method8571();
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub14_1);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub27_1);
		Static675.method9021();
		Static459.method6575();
		Static592.aBoolean826 = true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method4253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0];
		@Pc(21) int local21 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0];
		if (local8 < 0 || Static201.anInt3834 <= local8 || local21 < 0 || local21 >= Static626.anInt10238) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static201.anInt3834 && arg0 >= 0 && Static626.anInt10238 > arg0) {
			@Pc(80) int local80 = Static131.method2371(local8, arg4, arg1, arg5, Static306.anIntArray326, local21, arg2, arg6, arg3, arg0, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599(), arg7, Static300.anIntArray565, Static275.aClass106Array1[Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145]);
			if (local80 < 1) {
				return false;
			}
			Static680.anInt10897 = Static306.anIntArray326[local80 - 1];
			Static54.anInt802 = Static300.anIntArray565[local80 - 1];
			Static209.aBoolean723 = false;
			Static105.method2035();
			return true;
		} else {
			return false;
		}
	}
}
