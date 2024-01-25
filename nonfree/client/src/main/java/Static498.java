import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "D")
	public static double aDouble42;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public static void method7328() {
		if (Static597.anInt9453 == 0 || Static597.anInt9453 == 10) {
			return;
		}
		try {
			@Pc(26) short local26;
			if (Static264.anInt5014 == 0) {
				local26 = 250;
			} else {
				local26 = 2000;
			}
			if (Static653.aBoolean739 && Static597.anInt9453 >= 6) {
				local26 = 6000;
			}
			if (Static41.anInt544 != 2 || Static597.anInt9453 != 20 && Static472.anInt8073 != 42) {
				Static337.anInt5763++;
			}
			if (Static337.anInt5763 > local26) {
				Static305.aClass260_2.method6400();
				if (Static264.anInt5014 >= 3) {
					Static597.anInt9453 = 0;
					Static378.method5857(-5);
					return;
				}
				if (Static41.anInt544 == 2) {
					Static82.aClass165_2.method4207();
				} else {
					Static227.aClass165_4.method4207();
				}
				Static337.anInt5763 = 0;
				Static597.anInt9453 = 1;
				Static264.anInt5014++;
			}
			if (Static597.anInt9453 == 1) {
				if (Static41.anInt544 == 2) {
					Static305.aClass260_2.aClass380_4 = Static82.aClass165_2.method4203(Static651.aClass122_38);
				} else {
					Static305.aClass260_2.aClass380_4 = Static227.aClass165_4.method4203(Static651.aClass122_38);
				}
				Static597.anInt9453 = 2;
			}
			@Pc(195) Class6_Sub13 local195;
			@Pc(212) int local212;
			@Pc(259) int local259;
			if (Static597.anInt9453 == 2) {
				if (Static305.aClass260_2.aClass380_4.anInt10067 == 2) {
					throw new IOException();
				}
				if (Static305.aClass260_2.aClass380_4.anInt10067 != 1) {
					return;
				}
				Static305.aClass260_2.aClass141_1 = Static486.method7218((Socket) Static305.aClass260_2.aClass380_4.anObject25);
				Static305.aClass260_2.aClass380_4 = null;
				Static305.aClass260_2.method6403();
				local195 = Static29.method339();
				if (Static653.aBoolean739) {
					local195.aClass6_Sub15_Sub1_1.method3016(Static650.aClass162_12.anInt4493);
					local195.aClass6_Sub15_Sub1_1.method3040(0);
					local212 = local195.aClass6_Sub15_Sub1_1.anInt3174;
					local195.aClass6_Sub15_Sub1_1.method3029(658);
					if (Static41.anInt544 == 2) {
						local195.aClass6_Sub15_Sub1_1.method3016(Static37.anInt498 == 14 ? 1 : 0);
					}
					@Pc(238) Class6_Sub15 local238 = Static624.method8544();
					local238.method3016(Static561.anInt9080);
					local238.method3040((int) (Math.random() * 9.9999999E7D));
					local238.method3016(Static601.anInt9518);
					local238.method3029(Static99.anInt1987);
					for (local259 = 0; local259 < 6; local259++) {
						local238.method3029((int) (Math.random() * 9.9999999E7D));
					}
					local238.method2985(Static314.aLong180);
					local238.method3016(Static129.aClass121_1.anInt3555);
					local238.method3016((int) (Math.random() * 9.9999999E7D));
					local238.method3038(Static537.aBigInteger7, Static219.aBigInteger5);
					local195.aClass6_Sub15_Sub1_1.method2988(0, local238.aByteArray20, local238.anInt3174);
					local195.aClass6_Sub15_Sub1_1.method2993(local195.aClass6_Sub15_Sub1_1.anInt3174 - local212);
				} else {
					local195.aClass6_Sub15_Sub1_1.method3016(Static650.aClass162_1.anInt4493);
				}
				Static305.aClass260_2.method6404(local195);
				Static305.aClass260_2.method6399();
				Static597.anInt9453 = 3;
			}
			@Pc(371) int local371;
			if (Static597.anInt9453 == 3) {
				if (!Static305.aClass260_2.aClass141_1.method7613(1)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				local371 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
				if (local371 != 0) {
					Static597.anInt9453 = 0;
					Static378.method5857(local371);
					Static305.aClass260_2.method6400();
					Static343.method5289();
					return;
				}
				if (Static653.aBoolean739) {
					Static597.anInt9453 = 4;
				} else {
					Static597.anInt9453 = 8;
				}
			}
			if (Static597.anInt9453 == 4) {
				if (!Static305.aClass260_2.aClass141_1.method7613(2)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, 2, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.method3018();
				Static597.anInt9453 = 5;
			}
			if (Static597.anInt9453 == 5) {
				if (!Static305.aClass260_2.aClass141_1.method7613(Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.method2994(Static169.anIntArray188);
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
				@Pc(474) String local474 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.method2998();
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
				@Pc(482) String local482 = "opensn";
				if (!Static477.aBoolean381 || Static591.method8212(local474, 1, local482, Static651.aClass122_38).anInt10067 == 2) {
					Static118.method2175(Static651.aClass122_38, true, local482, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 1, local474);
				}
				Static597.anInt9453 = 6;
			}
			if (Static597.anInt9453 == 6) {
				if (!Static305.aClass260_2.aClass141_1.method7613(1)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				if ((Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF) == 1) {
					Static597.anInt9453 = 7;
				}
			}
			if (Static597.anInt9453 == 7) {
				if (!Static305.aClass260_2.aClass141_1.method7613(16)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, 16, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 16;
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.method2994(Static169.anIntArray188);
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
				Static527.aString100 = Static87.aString114 = Static23.method263(Static305.aClass260_2.aClass6_Sub15_Sub1_2.method3049());
				Static520.aLong275 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.method3049();
				Static597.anInt9453 = 8;
			}
			@Pc(631) Class6_Sub15_Sub1 local631;
			if (Static597.anInt9453 == 8) {
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
				Static305.aClass260_2.method6403();
				local195 = Static29.method339();
				local631 = local195.aClass6_Sub15_Sub1_1;
				@Pc(659) int local659;
				@Pc(668) Class6_Sub15 local668;
				@Pc(640) Class162 local640;
				if (Static41.anInt544 == 2) {
					if (Static653.aBoolean739) {
						local640 = Static650.aClass162_13;
					} else {
						local640 = Static650.aClass162_3;
					}
					local631.method3016(local640.anInt4493);
					local631.method3040(0);
					local259 = local631.anInt3174;
					local659 = local631.anInt3174;
					if (!Static653.aBoolean739) {
						local631.method3029(658);
						local631.method3016(Static37.anInt498 == 14 ? 1 : 0);
						local659 = local631.anInt3174;
						local668 = Static238.method4204();
						local631.method2988(0, local668.aByteArray20, local668.anInt3174);
						local659 = local631.anInt3174;
						local631.method2991(Static527.aString100);
					}
					local631.method3016(Static423.anInt7240);
					local631.method3016(Static368.method5566());
					local631.method3040(Static535.anInt4128);
					local631.method3040(Static274.anInt3226);
					local631.method3016(Static687.aClass6_Sub44_33.aClass7_Sub25_2.method7631());
					Static11.method170(local631);
					local631.method2991(Static506.aString97);
					local631.method3029(Static99.anInt1987);
					local668 = Static687.aClass6_Sub44_33.method7084();
					local631.method3016(local668.anInt3174);
					local631.method2988(0, local668.aByteArray20, local668.anInt3174);
					Static554.aBoolean681 = true;
					@Pc(850) Class6_Sub15 local850 = new Class6_Sub15(Static192.aClass6_Sub1_1.method40());
					Static192.aClass6_Sub1_1.method43(local850);
					local631.method2988(0, local850.aByteArray20, local850.aByteArray20.length);
					local631.method3029(Static620.anInt9784);
					local631.method2985(Static48.aLong225);
					local631.method3016(Static192.aString43 == null ? 0 : 1);
					if (Static192.aString43 != null) {
						local631.method2991(Static192.aString43);
					}
					local631.method3016(Static687.method8626("jagtheora") ? 1 : 0);
					local631.method3016(Static477.aBoolean381 ? 1 : 0);
					Static99.method1959(local631);
					local631.method3002(local659, Static169.anIntArray188, local631.anInt3174);
					local631.method2993(local631.anInt3174 - local259);
				} else {
					if (Static653.aBoolean739) {
						local640 = Static650.aClass162_13;
					} else {
						local640 = Static650.aClass162_5;
					}
					local631.method3016(local640.anInt4493);
					local631.method3040(0);
					local259 = local631.anInt3174;
					local659 = local631.anInt3174;
					if (!Static653.aBoolean739) {
						local631.method3029(658);
						local668 = Static238.method4204();
						local631.method2988(0, local668.aByteArray20, local668.anInt3174);
						local659 = local631.anInt3174;
						local631.method2991(Static527.aString100);
					}
					local631.method3016(Static129.aClass121_1.anInt3555);
					local631.method3016(Static601.anInt9518);
					Static11.method170(local631);
					local631.method2991(Static506.aString97);
					local631.method3029(Static99.anInt1987);
					Static99.method1959(local631);
					local631.method3002(local659, Static169.anIntArray188, local631.anInt3174);
					local631.method2993(local631.anInt3174 - local259);
				}
				Static305.aClass260_2.method6404(local195);
				Static305.aClass260_2.method6399();
				Static305.aClass260_2.aClass270_2 = new Class270(Static169.anIntArray188);
				for (@Pc(942) int local942 = 0; local942 < 4; local942++) {
					Static169.anIntArray188[local942] += 50;
				}
				Static305.aClass260_2.aClass6_Sub15_Sub1_2.method2473(Static169.anIntArray188);
				Static597.anInt9453 = 9;
				Static169.anIntArray188 = null;
			}
			if (Static597.anInt9453 == 9) {
				if (!Static305.aClass260_2.aClass141_1.method7613(1)) {
					return;
				}
				Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				local371 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
				if (local371 == 21) {
					Static597.anInt9453 = 12;
				} else if (local371 == 29 || local371 == 45) {
					Static328.anInt5668 = local371;
					Static597.anInt9453 = 18;
				} else if (local371 == 1) {
					Static597.anInt9453 = 10;
					Static378.method5857(local371);
					return;
				} else if (local371 == 2) {
					Static597.anInt9453 = 13;
				} else if (local371 == 15) {
					Static305.aClass260_2.anInt7198 = -2;
					Static597.anInt9453 = 19;
				} else if (local371 == 23 && Static264.anInt5014 < 3) {
					Static264.anInt5014++;
					Static597.anInt9453 = 1;
					Static337.anInt5763 = 0;
					Static305.aClass260_2.aClass141_1.method7615();
					Static305.aClass260_2.aClass141_1 = null;
					return;
				} else if (local371 == 42) {
					Static597.anInt9453 = 20;
					Static378.method5857(local371);
					return;
				} else if (!Static67.aBoolean56 || Static653.aBoolean739 || Static561.anInt9080 == -1 || local371 != 35) {
					Static597.anInt9453 = 0;
					Static378.method5857(local371);
					Static305.aClass260_2.aClass141_1.method7615();
					Static305.aClass260_2.aClass141_1 = null;
					Static343.method5289();
					return;
				} else {
					Static597.anInt9453 = 1;
					Static653.aBoolean739 = true;
					Static337.anInt5763 = 0;
					Static305.aClass260_2.aClass141_1.method7615();
					Static305.aClass260_2.aClass141_1 = null;
					return;
				}
			}
			if (Static597.anInt9453 == 11) {
				Static305.aClass260_2.method6403();
				local195 = Static29.method339();
				local631 = local195.aClass6_Sub15_Sub1_1;
				local631.method2474(Static305.aClass260_2.aClass270_2);
				local631.method2471(Static650.aClass162_9.anInt4493);
				Static305.aClass260_2.method6404(local195);
				Static305.aClass260_2.method6399();
				Static597.anInt9453 = 9;
			} else if (Static597.anInt9453 == 12) {
				if (Static305.aClass260_2.aClass141_1.method7613(1)) {
					Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
					local371 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
					Static634.anInt9904 = local371 * 50;
					Static597.anInt9453 = 0;
					Static378.method5857(21);
					Static305.aClass260_2.aClass141_1.method7615();
					Static305.aClass260_2.aClass141_1 = null;
					Static343.method5289();
				}
			} else if (Static597.anInt9453 == 20) {
				if (Static305.aClass260_2.aClass141_1.method7613(2)) {
					Static305.aClass260_2.aClass141_1.method7610(0, 2, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
					Static462.anInt7983 = ((Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF) << 8) + (Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[1] & 0xFF);
					Static597.anInt9453 = 9;
				}
			} else if (Static597.anInt9453 == 18) {
				if (Static328.anInt5668 == 29) {
					if (!Static305.aClass260_2.aClass141_1.method7613(1)) {
						return;
					}
					Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
					Static562.anInt9091 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
				} else if (Static328.anInt5668 == 45) {
					if (!Static305.aClass260_2.aClass141_1.method7613(3)) {
						return;
					}
					Static305.aClass260_2.aClass141_1.method7610(0, 3, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
					Static562.anInt9091 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
					Static584.anInt9324 = (Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[2] & 0xFF) + ((Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[1] & 0xFF) << 8);
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static328.anInt5668);
				}
				Static597.anInt9453 = 0;
				Static378.method5857(Static328.anInt5668);
				Static305.aClass260_2.aClass141_1.method7615();
				Static305.aClass260_2.aClass141_1 = null;
				Static343.method5289();
			} else if (Static597.anInt9453 != 13) {
				@Pc(1442) Class6_Sub15_Sub1 local1442;
				if (Static597.anInt9453 == 14) {
					local1442 = Static305.aClass260_2.aClass6_Sub15_Sub1_2;
					if (Static41.anInt544 == 2) {
						if (!Static305.aClass260_2.aClass141_1.method7613(Static659.anInt10195)) {
							return;
						}
						Static305.aClass260_2.aClass141_1.method7610(0, Static659.anInt10195, local1442.aByteArray20);
						local1442.anInt3174 = 0;
						Static679.anInt6104 = local1442.method3030();
						Static614.anInt9721 = local1442.method3030();
						Static334.aBoolean425 = local1442.method3030() == 1;
						Static364.aBoolean455 = local1442.method3030() == 1;
						Static265.aBoolean374 = local1442.method3030() == 1;
						Static610.aBoolean714 = local1442.method3030() == 1;
						Static503.anInt8407 = local1442.method3018();
						Static200.aBoolean328 = local1442.method3030() == 1;
						Static632.anInt9896 = local1442.method3004();
						Static340.aBoolean430 = local1442.method3030() == 1;
						Static290.aClass163_5.method4121(Static340.aBoolean430);
						Static149.aClass244_1.method5965(Static340.aBoolean430);
						Static221.aClass164_1.method4156(Static340.aBoolean430);
					} else if (Static305.aClass260_2.aClass141_1.method7613(Static659.anInt10195)) {
						Static305.aClass260_2.aClass141_1.method7610(0, Static659.anInt10195, local1442.aByteArray20);
						local1442.anInt3174 = 0;
						Static679.anInt6104 = local1442.method3030();
						Static614.anInt9721 = local1442.method3030();
						Static334.aBoolean425 = local1442.method3030() == 1;
						Static364.aBoolean455 = local1442.method3030() == 1;
						Static265.aBoolean374 = local1442.method3030() == 1;
						Static478.aLong261 = local1442.method3049();
						Static453.aLong249 = Static478.aLong261 - Static549.method7758() - local1442.method3006();
						local212 = local1442.method3030();
						Static608.aBoolean712 = (local212 & 0x2) != 0;
						Static200.aBoolean328 = (local212 & 0x1) != 0;
						Static99.anInt1944 = local1442.method3015();
						Static681.aBoolean768 = local1442.method3030() == 1;
						Static481.anInt8149 = local1442.method3015();
						Static335.anInt5740 = local1442.method3018();
						Static337.anInt5770 = local1442.method3018();
						Static397.anInt6877 = local1442.method3018();
						Static35.anInt469 = local1442.method3015();
						Static308.aClass380_3 = Static651.aClass122_38.method3345(Static35.anInt469);
						Static278.anInt3857 = local1442.method3030();
						Static254.anInt4892 = local1442.method3018();
						Static254.anInt4901 = local1442.method3018();
						Static490.aBoolean633 = local1442.method3030() == 1;
						Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString24 = Static405.aString111 = local1442.method2998();
						Static118.anInt2281 = local1442.method3030();
						Static141.anInt8736 = local1442.method3015();
						Static434.aBoolean553 = local1442.method3030() == 1;
						Static107.aClass165_3 = new Class165();
						Static107.aClass165_3.anInt4607 = local1442.method3018();
						if (Static107.aClass165_3.anInt4607 == 65535) {
							Static107.aClass165_3.anInt4607 = -1;
						}
						Static107.aClass165_3.aString47 = local1442.method2998();
						if (Static41.aClass352_2 != Static520.aClass352_8) {
							Static107.aClass165_3.anInt4608 = Static107.aClass165_3.anInt4607 + 40000;
							Static107.aClass165_3.anInt4602 = Static107.aClass165_3.anInt4607 + 50000;
						}
						if (Static92.aClass352_4 != Static520.aClass352_8 && (Static452.aClass352_7 != Static520.aClass352_8 || Static679.anInt6104 < 2) && Static82.aClass165_2.method4206(Static601.aClass165_5)) {
							Static244.method4312();
						}
					} else {
						return;
					}
					if (Static334.aBoolean425 && !Static265.aBoolean374 || Static200.aBoolean328) {
						try {
							Static692.method2495("zap", Static371.anApplet1);
						} catch (@Pc(1852) Throwable local1852) {
							if (Static81.aBoolean103) {
								try {
									Static371.anApplet1.getAppletContext().showDocument(new URL(Static371.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1870) Exception local1870) {
								}
							}
						}
					} else {
						try {
							Static692.method2495("unzap", Static371.anApplet1);
						} catch (@Pc(1841) Throwable local1841) {
						}
					}
					if (Static41.aClass352_2 == Static520.aClass352_8) {
						try {
							Static692.method2495("loggedin", Static371.anApplet1);
						} catch (@Pc(1883) Throwable local1883) {
						}
					}
					if (Static41.anInt544 != 2) {
						Static597.anInt9453 = 0;
						Static378.method5857(2);
						Static202.method3752();
						Static307.method4889(7);
						Static305.aClass260_2.aClass322_128 = null;
						return;
					}
					Static597.anInt9453 = 16;
				}
				if (Static597.anInt9453 == 16) {
					if (!Static305.aClass260_2.aClass141_1.method7613(3)) {
						return;
					}
					Static305.aClass260_2.aClass141_1.method7610(0, 3, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
					Static597.anInt9453 = 17;
				}
				if (Static597.anInt9453 == 17) {
					local1442 = Static305.aClass260_2.aClass6_Sub15_Sub1_2;
					local1442.anInt3174 = 0;
					if (local1442.method2476()) {
						if (!Static305.aClass260_2.aClass141_1.method7613(1)) {
							return;
						}
						Static305.aClass260_2.aClass141_1.method7610(3, 1, local1442.aByteArray20);
					}
					Static305.aClass260_2.aClass322_128 = Static207.method3819()[local1442.method2475()];
					Static305.aClass260_2.anInt7198 = local1442.method3018();
					Static597.anInt9453 = 15;
				}
				if (Static597.anInt9453 == 15) {
					if (Static305.aClass260_2.aClass141_1.method7613(Static305.aClass260_2.anInt7198)) {
						Static305.aClass260_2.aClass141_1.method7610(0, Static305.aClass260_2.anInt7198, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
						Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
						Static597.anInt9453 = 0;
						local371 = Static305.aClass260_2.anInt7198;
						Static378.method5857(2);
						Static293.method4777();
						Static433.method6603(Static305.aClass260_2.aClass6_Sub15_Sub1_2);
						Static253.anInt4790 = -1;
						if (Static494.aClass322_61 == Static305.aClass260_2.aClass322_128) {
							Static577.method8049();
						} else {
							Static216.method3962();
						}
						if (local371 != Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174) {
							throw new RuntimeException("lswp pos:" + Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 + " psize:" + local371);
						}
						Static305.aClass260_2.aClass322_128 = null;
					}
				} else if (Static597.anInt9453 == 19) {
					if (Static305.aClass260_2.anInt7198 == -2) {
						if (!Static305.aClass260_2.aClass141_1.method7613(2)) {
							return;
						}
						Static305.aClass260_2.aClass141_1.method7610(0, 2, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
						Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
						Static305.aClass260_2.anInt7198 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.method3018();
					}
					if (Static305.aClass260_2.aClass141_1.method7613(Static305.aClass260_2.anInt7198)) {
						Static305.aClass260_2.aClass141_1.method7610(0, Static305.aClass260_2.anInt7198, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
						Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 = 0;
						local371 = Static305.aClass260_2.anInt7198;
						Static597.anInt9453 = 0;
						Static378.method5857(15);
						Static141.method7650();
						Static433.method6603(Static305.aClass260_2.aClass6_Sub15_Sub1_2);
						if (Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 != local371) {
							throw new RuntimeException("lswpr pos:" + Static305.aClass260_2.aClass6_Sub15_Sub1_2.anInt3174 + " psize:" + local371);
						}
						Static305.aClass260_2.aClass322_128 = null;
					}
				}
			} else if (Static305.aClass260_2.aClass141_1.method7613(1)) {
				Static305.aClass260_2.aClass141_1.method7610(0, 1, Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20);
				Static659.anInt10195 = Static305.aClass260_2.aClass6_Sub15_Sub1_2.aByteArray20[0] & 0xFF;
				Static597.anInt9453 = 14;
			}
		} catch (@Pc(2185) IOException local2185) {
			Static305.aClass260_2.method6400();
			if (Static264.anInt5014 >= 3) {
				Static597.anInt9453 = 0;
				Static378.method5857(-4);
				Static343.method5289();
			} else {
				if (Static41.anInt544 == 2) {
					Static82.aClass165_2.method4207();
				} else {
					Static227.aClass165_4.method4207();
				}
				Static264.anInt5014++;
				Static597.anInt9453 = 1;
				Static337.anInt5763 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII[FIB)V")
	public static void method7329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static232.method4114(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static232.method4114(arg1)) {
			@Pc(48) int local48 = Static8.method111(6408);
			@Pc(50) int local50 = 0;
			@Pc(62) int local62 = arg3 < arg1 ? arg3 : arg1;
			@Pc(66) int local66 = arg3 >> 1;
			@Pc(70) int local70 = arg1 >> 1;
			@Pc(72) float[] local72 = arg4;
			@Pc(79) float[] local79 = new float[local70 * local66 * local48];
			while (true) {
				OpenGL.glTexImage2Df(3553, local50, 34842, arg3, arg1, 0, 6408, 5126, local72, 0);
				if (local62 <= 1) {
					return;
				}
				@Pc(99) int local99 = local48 * arg3;
				@Pc(101) float[] local101 = local79;
				for (@Pc(103) int local103 = 0; local103 < local48; local103++) {
					@Pc(109) int local109 = local103;
					@Pc(111) int local111 = local103;
					@Pc(115) int local115 = local99 + local103;
					for (@Pc(117) int local117 = 0; local117 < local70; local117++) {
						for (@Pc(121) int local121 = 0; local121 < local66; local121++) {
							@Pc(127) float local127 = local72[local111];
							local111 += local48;
							@Pc(137) float local137 = local127 + local72[local111];
							local111 += local48;
							@Pc(147) float local147 = local137 + local72[local115];
							local115 += local48;
							@Pc(157) float local157 = local147 + local72[local115];
							local79[local109] = local157 * 0.25F;
							local115 += local48;
							local109 += local48;
						}
						local111 += local99;
						local115 += local99;
					}
				}
				local79 = local72;
				local72 = local101;
				arg1 = local70;
				arg3 = local66;
				local70 >>= 0x1;
				local62 >>= 0x1;
				local50++;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
