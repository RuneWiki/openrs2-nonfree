import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_34 = new Class70(59, 2);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
	public static void method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class1_Sub6_Sub16 local13 = Static212.method3332(10, arg1);
		local13.method6594();
		local13.anInt8204 = arg3;
		local13.anInt8208 = arg0;
		local13.anInt8205 = arg2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method3270() {
		if (Static181.anInt3169 == 0 || Static181.anInt3169 == 6) {
			return;
		}
		try {
			if (++Static374.anInt6268 > 2000) {
				if (Static568.aClass149_2 != null) {
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
				}
				if (Static50.anInt933 >= 2) {
					Static181.anInt3169 = 0;
					Static138.method2101(-5);
					return;
				}
				if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
					Static382.aClass227_2.method4534();
				} else {
					Static536.aClass227_4.method4534();
				}
				Static374.anInt6268 = 0;
				Static181.anInt3169 = 1;
				Static50.anInt933++;
			}
			if (Static181.anInt3169 == 1) {
				if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
					Static216.aClass260_7 = Static382.aClass227_2.method4535(Static362.aClass109_5);
				} else {
					Static216.aClass260_7 = Static536.aClass227_4.method4535(Static362.aClass109_5);
				}
				Static181.anInt3169 = 2;
			}
			if (Static181.anInt3169 == 2) {
				if (Static216.aClass260_7.anInt7041 == 2) {
					throw new IOException();
				}
				if (Static216.aClass260_7.anInt7041 != 1) {
					return;
				}
				Static568.aClass149_2 = Static303.method4269((Socket) Static216.aClass260_7.anObject16);
				Static216.aClass260_7 = null;
				@Pc(134) long local134 = Static134.aLong86 = Static566.method7647(Static157.aString27);
				Static256.method3751();
				@Pc(143) int local143 = (int) (local134 >> 16 & 0x1FL);
				@Pc(146) Class1_Sub11 local146 = Static165.method2386();
				local146.aClass1_Sub35_Sub2_1.method5777(Static420.aClass128_1.anInt3034);
				local146.aClass1_Sub35_Sub2_1.method5777(local143);
				Static48.method743(local146);
				Static173.method2438();
				Static181.anInt3169 = 3;
			}
			@Pc(190) int local190;
			if (Static181.anInt3169 == 3) {
				if (!Static568.aClass149_2.method3280(1)) {
					return;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				local190 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
				if (local190 != 0) {
					Static181.anInt3169 = 0;
					Static138.method2101(local190);
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					Static549.method6486();
					return;
				}
				Static181.anInt3169 = 4;
			}
			if (Static181.anInt3169 == 4) {
				if (!Static568.aClass149_2.method3280(8)) {
					return;
				}
				Static568.aClass149_2.method3278(8, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
				Static436.aLong234 = Static585.aClass1_Sub35_Sub2_2.method5778();
				@Pc(239) Class1_Sub35 local239 = new Class1_Sub35(518);
				@Pc(242) int[] local242 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static436.aLong234 >> 32), (int) Static436.aLong234 };
				local239.method5777(10);
				local239.method5792(local242[0]);
				local239.method5792(local242[1]);
				local239.method5792(local242[2]);
				local239.method5792(local242[3]);
				local239.method5748(Static566.method7647(Static157.aString27));
				local239.method5761(Static399.aString69);
				local239.method5748(Static435.aLong284);
				local239.method5748(Static184.aLong107);
				local239.method5747(Static264.aBigInteger3, Static98.aBigInteger5);
				Static256.method3751();
				@Pc(326) Class1_Sub11 local326 = Static165.method2386();
				@Pc(329) Class1_Sub35_Sub2 local329 = local326.aClass1_Sub35_Sub2_1;
				@Pc(349) int local349;
				if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
					if (Static216.anInt4135 == 13) {
						local329.method5777(Static420.aClass128_5.anInt3034);
					} else {
						local329.method5777(Static420.aClass128_3.anInt3034);
					}
					local329.method5776(0);
					local349 = local329.anInt7214;
					local329.method5792(618);
					local329.method5777(Static184.anInt3253);
					local329.method5777(Static195.method2980());
					local329.method5776(Static130.anInt2566);
					local329.method5776(Static499.anInt4149);
					local329.method5777(Static348.aClass1_Sub30_Sub1_1.anInt4869);
					Static356.method4862(local329);
					local329.method5761(Static499.aString36);
					local329.method5792(Static47.anInt802);
					@Pc(467) Class1_Sub35 local467 = new Class1_Sub35(Static316.method4384());
					Static348.aClass1_Sub30_Sub1_1.method3902(local467);
					local329.method5777(local467.anInt7214);
					local329.method5781(local467.anInt7214, local467.aByteArray85);
					Static266.aBoolean354 = true;
					@Pc(492) Class1_Sub35 local492 = new Class1_Sub35(Static62.method1098());
					(new Class1_Sub48(true, Static362.aClass109_5)).method7749(local492);
					local329.method5781(local492.aByteArray85.length, local492.aByteArray85);
					local329.method5776(Static373.anInt6266);
					local329.method5748(Static480.aLong248);
					local329.method5777(Static508.aString87 == null ? 0 : 1);
					if (Static508.aString87 != null) {
						local329.method5761(Static508.aString87);
					}
					Static513.method7128(local329);
					local329.method5781(local239.anInt7214, local239.aByteArray85);
					local329.method5790(local329.anInt7214 - local349);
				} else {
					local329.method5777(Static420.aClass128_6.anInt3034);
					local329.method5776(0);
					local349 = local329.anInt7214;
					local329.method5792(618);
					local329.method5777(Static246.aClass195_2.anInt4912);
					local329.method5777(Static307.anInt5279);
					Static356.method4862(local329);
					local329.method5761(Static499.aString36);
					local329.method5792(Static47.anInt802);
					Static513.method7128(local329);
					local329.method5781(local239.anInt7214, local239.aByteArray85);
					local329.method5790(local329.anInt7214 - local349);
				}
				Static48.method743(local326);
				Static173.method2438();
				Static481.aClass276_2 = new Class276(local242);
				for (local349 = 0; local349 < 4; local349++) {
					local242[local349] += 50;
				}
				Static585.aClass1_Sub35_Sub2_2.method5817(local242);
				Static181.anInt3169 = 5;
			}
			if (Static181.anInt3169 == 5) {
				if (!Static568.aClass149_2.method3280(1)) {
					return;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				local190 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
				if (local190 == 21) {
					Static181.anInt3169 = 8;
				} else if (local190 == 29) {
					Static181.anInt3169 = 14;
				} else if (local190 == 1) {
					Static181.anInt3169 = 6;
					Static138.method2101(local190);
					return;
				} else if (local190 == 2) {
					Static181.anInt3169 = 9;
				} else if (local190 == 15) {
					Static181.anInt3169 = 15;
					Static445.anInt7693 = -2;
				} else if (local190 == 23 && Static50.anInt933 < 2) {
					Static181.anInt3169 = 1;
					Static374.anInt6268 = 0;
					Static50.anInt933++;
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					return;
				} else {
					Static181.anInt3169 = 0;
					Static138.method2101(local190);
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					Static549.method6486();
					return;
				}
			}
			if (Static181.anInt3169 == 7) {
				Static256.method3751();
				@Pc(703) Class1_Sub11 local703 = Static165.method2386();
				@Pc(706) Class1_Sub35_Sub2 local706 = local703.aClass1_Sub35_Sub2_1;
				local706.method5816(Static481.aClass276_2);
				local706.method5813(Static420.aClass128_13.anInt3034);
				Static48.method743(local703);
				Static173.method2438();
				Static181.anInt3169 = 5;
			} else if (Static181.anInt3169 == 8) {
				if (Static568.aClass149_2.method3280(1)) {
					Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
					local190 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
					Static437.anInt7656 = local190 * 60 + 180;
					Static181.anInt3169 = 0;
					Static138.method2101(21);
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					Static549.method6486();
				}
			} else if (Static181.anInt3169 == 14) {
				if (Static568.aClass149_2.method3280(1)) {
					Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
					Static541.anInt9060 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
					Static181.anInt3169 = 0;
					Static138.method2101(29);
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					Static549.method6486();
				}
			} else if (Static181.anInt3169 != 9) {
				@Pc(849) Class1_Sub35_Sub2 local849;
				if (Static181.anInt3169 == 10) {
					local849 = Static585.aClass1_Sub35_Sub2_2;
					if (Static404.anInt7074 == 3) {
						Static448.aBoolean596 = true;
					} else {
						Static448.aBoolean596 = false;
					}
					if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
						if (!Static568.aClass149_2.method3280(Static495.anInt1270)) {
							return;
						}
						Static568.aClass149_2.method3278(Static495.anInt1270, local849.aByteArray85, 0);
						local849.anInt7214 = 0;
						Static267.anInt4711 = local849.method5750();
						Static522.anInt8837 = local849.method5750();
						Static274.aBoolean30 = local849.method5750() == 1;
						Static357.aBoolean467 = local849.method5750() == 1;
						Static503.aBoolean668 = local849.method5750() == 1;
						Static422.aBoolean573 = local849.method5750() == 1;
						Static296.anInt5113 = local849.method5771();
						Static82.aBoolean143 = local849.method5750() == 1;
						Static398.anInt7013 = local849.method5766();
						Static154.aBoolean211 = local849.method5750() == 1;
						if (Static404.anInt7074 == 3) {
							@Pc(979) boolean local979 = local849.method5750() == 1;
							if (local979) {
								@Pc(985) long local985 = local849.method5778();
								@Pc(991) String local991 = Static91.method1613(local985);
								@Pc(995) int local995 = local849.method5750();
								@Pc(998) byte[] local998 = new byte[local995];
								local849.method5819(local998, local995);
								@Pc(1010) String local1010 = Static261.method3775(local998);
								@Pc(1012) Class91 local1012 = null;
								try {
									@Pc(1018) Class260 local1018 = Static362.aClass109_5.method2169(false, "3");
									while (local1018.anInt7041 == 0) {
										Static391.method5400(1L);
									}
									if (local1018.anInt7041 == 1) {
										local1012 = (Class91) local1018.anObject16;
										@Pc(1056) int local1056 = local991.length() + local1010.length() + 1 + 12 + 2 + 2 + 3;
										if (Static508.aString87 != null) {
											local1056 += Static508.aString87.length() + 2;
										}
										if (local1056 > 120) {
											throw new RuntimeException(">120");
										}
										@Pc(1080) Class1_Sub35 local1080 = new Class1_Sub35(local1056 + 1);
										local1080.method5777(local1056);
										local1080.method5777(3);
										local1080.method5802(local991);
										local1080.method5802(local1010);
										local1080.method5776(Static47.anInt802);
										local1080.method5748(Static480.aLong248);
										local1080.method5777(Static508.aString87 == null ? 0 : 1);
										if (Static508.aString87 != null) {
											local1080.method5802(Static508.aString87);
										}
										local1080.method5785();
										local1012.method1834(local1080.anInt7214, 0, local1080.aByteArray85);
									}
								} catch (@Pc(1132) Exception local1132) {
								}
								try {
									if (local1012 != null) {
										local1012.method1833();
									}
								} catch (@Pc(1139) Exception local1139) {
								}
								try {
									Static602.method2417(Static590.anApplet2, "demoaccountcreated");
								} catch (@Pc(1146) Throwable local1146) {
								}
							}
						}
						Static518.aClass96_4.method1927(Static154.aBoolean211);
						Static175.aClass114_4.method2213(Static154.aBoolean211);
						Static322.aClass326_2.method7237(Static154.aBoolean211);
					} else if (Static568.aClass149_2.method3280(Static495.anInt1270)) {
						Static568.aClass149_2.method3278(Static495.anInt1270, local849.aByteArray85, 0);
						local849.anInt7214 = 0;
						Static267.anInt4711 = local849.method5750();
						Static522.anInt8837 = local849.method5750();
						Static274.aBoolean30 = local849.method5750() == 1;
						Static357.aBoolean467 = local849.method5750() == 1;
						Static503.aBoolean668 = local849.method5750() == 1;
						Static432.anInt7571 = local849.method5738();
						Static82.aBoolean143 = Static432.anInt7571 > 0;
						Static306.anInt4491 = local849.method5771();
						Static89.anInt1862 = local849.method5771();
						Static165.anInt2960 = local849.method5771();
						Static87.anInt5333 = local849.method5804();
						Static1.aClass260_1 = Static362.aClass109_5.method2170(Static87.anInt5333);
						Static486.anInt8191 = local849.method5750();
						Static431.anInt7564 = local849.method5771();
						Static533.anInt8939 = local849.method5771();
						Static516.aBoolean679 = local849.method5750() == 1;
						Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString15 = local849.method5798();
						Static123.anInt2446 = local849.method5750();
						Static370.anInt6167 = local849.method5804();
						Static480.aClass227_3 = new Class227();
						Static480.aClass227_3.anInt5547 = local849.method5771();
						if (Static480.aClass227_3.anInt5547 == 65535) {
							Static480.aClass227_3.anInt5547 = -1;
						}
						Static480.aClass227_3.aString53 = local849.method5798();
						if (Static357.aClass308_6 != Static199.aClass308_3) {
							Static480.aClass227_3.anInt5546 = Static480.aClass227_3.anInt5547 + 40000;
							Static480.aClass227_3.anInt5548 = Static480.aClass227_3.anInt5547 + 50000;
						}
						if (Static77.aClass308_2 != Static357.aClass308_6 && (Static382.aClass227_2.method4532(Static330.aClass227_1) || Static382.aClass227_2.method4532(Static553.aClass227_5))) {
							Static488.method2263();
						}
					} else {
						return;
					}
					if (Static274.aBoolean30 && !Static503.aBoolean668 || Static82.aBoolean143) {
						try {
							Static602.method2417(Static590.anApplet2, "zap");
						} catch (@Pc(1356) Throwable local1356) {
							if (Static484.aBoolean624) {
								try {
									Static590.anApplet2.getAppletContext().showDocument(new URL(Static590.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1370) Exception local1370) {
								}
							}
						}
					} else {
						try {
							Static602.method2417(Static590.anApplet2, "unzap");
						} catch (@Pc(1379) Throwable local1379) {
						}
					}
					if (Static199.aClass308_3 == Static357.aClass308_6) {
						try {
							Static602.method2417(Static590.anApplet2, "loggedin");
						} catch (@Pc(1390) Throwable local1390) {
						}
					}
					if (Static404.anInt7074 != 2 && Static404.anInt7074 != 3) {
						Static181.anInt3169 = 0;
						Static138.method2101(2);
						Static264.method3792();
						Static426.method5887(7);
						Static504.aClass235_188 = null;
						return;
					}
					Static181.anInt3169 = 12;
				}
				if (Static181.anInt3169 == 12) {
					if (!Static568.aClass149_2.method3280(3)) {
						return;
					}
					Static568.aClass149_2.method3278(3, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
					Static181.anInt3169 = 13;
				}
				if (Static181.anInt3169 == 13) {
					local849 = Static585.aClass1_Sub35_Sub2_2;
					local849.anInt7214 = 0;
					if (local849.method5815()) {
						if (!Static568.aClass149_2.method3280(1)) {
							return;
						}
						Static568.aClass149_2.method3278(1, local849.aByteArray85, 3);
					}
					Static504.aClass235_188 = Static418.method5812()[local849.method5807()];
					Static445.anInt7693 = local849.method5771();
					Static181.anInt3169 = 11;
				}
				if (Static181.anInt3169 == 11) {
					if (Static568.aClass149_2.method3280(Static445.anInt7693)) {
						Static568.aClass149_2.method3278(Static445.anInt7693, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
						Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
						local190 = Static445.anInt7693;
						Static181.anInt3169 = 0;
						Static138.method2101(2);
						Static135.method2062();
						Static575.method7735(Static585.aClass1_Sub35_Sub2_2);
						Static504.anInt5716 = -1;
						if (Static504.aClass235_188 == Static48.aClass235_35) {
							Static317.method4385();
						} else {
							Static516.method7174();
						}
						if (Static585.aClass1_Sub35_Sub2_2.anInt7214 != local190) {
							throw new RuntimeException("lswp pos:" + Static585.aClass1_Sub35_Sub2_2.anInt7214 + " psize:" + local190);
						}
						Static504.aClass235_188 = null;
					}
				} else if (Static181.anInt3169 == 15) {
					if (Static445.anInt7693 == -2) {
						if (!Static568.aClass149_2.method3280(2)) {
							return;
						}
						Static568.aClass149_2.method3278(2, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
						Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
						Static445.anInt7693 = Static585.aClass1_Sub35_Sub2_2.method5771();
					}
					if (Static568.aClass149_2.method3280(Static445.anInt7693)) {
						Static568.aClass149_2.method3278(Static445.anInt7693, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
						Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
						Static181.anInt3169 = 0;
						local190 = Static445.anInt7693;
						Static138.method2101(15);
						Static243.method3638();
						Static575.method7735(Static585.aClass1_Sub35_Sub2_2);
						if (local190 != Static585.aClass1_Sub35_Sub2_2.anInt7214) {
							throw new RuntimeException("lswpr pos:" + Static585.aClass1_Sub35_Sub2_2.anInt7214 + " psize:" + local190);
						}
						Static504.aClass235_188 = null;
					}
				}
			} else if (Static568.aClass149_2.method3280(1)) {
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				Static495.anInt1270 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
				Static181.anInt3169 = 10;
			}
		} catch (@Pc(1634) IOException local1634) {
			if (Static568.aClass149_2 != null) {
				Static568.aClass149_2.method3281();
				Static568.aClass149_2 = null;
			}
			if (Static50.anInt933 >= 2) {
				Static181.anInt3169 = 0;
				Static138.method2101(-4);
				Static549.method6486();
			} else {
				if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
					Static382.aClass227_2.method4534();
				} else {
					Static536.aClass227_4.method4534();
				}
				Static50.anInt933++;
				Static181.anInt3169 = 1;
				Static374.anInt6268 = 0;
			}
		}
	}
}
