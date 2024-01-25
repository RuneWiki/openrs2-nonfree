import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_205 = new Class184(60, -2);

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_193 = new Class175("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "[I")
	public static final int[] anIntArray436 = new int[2048];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method4688(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static125.aClass14ArrayArray2 = new Class14[arg2][arg1];
		Static115.aClass75_3 = arg0;
		if (Static429.anIntArray516 != null) {
			Static399.aClass7_4 = Static430.method5689(Static429.anIntArray516[2], Static429.anIntArray516[0], Static429.anIntArray516[4], Static429.anIntArray516[3], Static429.anIntArray516[5], Static429.anIntArray516[1]);
		}
		Static311.aClass14_2 = new Class14();
		Static445.method5917();
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	public static void method4689() {
		if (Static108.anInt3455 == 0 || Static108.anInt3455 == 5) {
			return;
		}
		try {
			if (++Static16.anInt533 > 2000) {
				if (Static122.aClass27_1 != null) {
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
				}
				if (Static315.anInt5739 >= 1) {
					Static108.anInt3455 = 0;
					Static287.anInt5252 = -5;
					return;
				}
				Static315.anInt5739++;
				Static16.anInt533 = 0;
				if (Static14.anInt470 == Static178.anInt3626) {
					Static178.anInt3626 = Static324.anInt423;
				} else {
					Static178.anInt3626 = Static14.anInt470;
				}
				Static108.anInt3455 = 1;
			}
			if (Static108.anInt3455 == 1) {
				Static358.aClass190_8 = Static295.aClass103_5.method2834(Static324.aString2, Static178.anInt3626);
				Static108.anInt3455 = 2;
			}
			@Pc(110) int local110;
			if (Static108.anInt3455 == 2) {
				if (Static358.aClass190_8.anInt5799 == 2) {
					throw new IOException();
				}
				if (Static358.aClass190_8.anInt5799 != 1) {
					return;
				}
				Static122.aClass27_1 = new Class27((Socket) Static358.aClass190_8.anObject7, Static295.aClass103_5);
				Static358.aClass190_8 = null;
				@Pc(103) long local103 = Static154.aLong97 = Static353.method4997(Static230.aString42);
				local110 = (int) (local103 >> 16 & 0x1FL);
				Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
				Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_1.anInt1611);
				Static302.aClass3_Sub2_Sub2_2.method6001(local110);
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, 2);
				Static212.method3428();
				@Pc(137) int local137 = Static122.aClass27_1.method890();
				Static212.method3428();
				if (local137 != 0) {
					Static287.anInt5252 = local137;
					Static108.anInt3455 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					return;
				}
				Static108.anInt3455 = 3;
			}
			if (Static108.anInt3455 == 3) {
				if (Static122.aClass27_1.method894() < 8) {
					return;
				}
				Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 8, 0);
				Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
				Static135.aLong86 = Static110.aClass3_Sub2_Sub2_1.method6047();
				@Pc(183) Class3_Sub2 local183 = new Class3_Sub2(70);
				@Pc(186) int[] local186 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static135.aLong86 >> 32), (int) Static135.aLong86 };
				local183.method6001(10);
				local183.method6008(local186[0]);
				local183.method6008(local186[1]);
				local183.method6008(local186[2]);
				local183.method6008(local186[3]);
				local183.method5990(Static353.method4997(Static230.aString42));
				local183.method6033(Static242.aString45);
				local183.method6036(Static259.aBigInteger1, Static454.aBigInteger2);
				Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
				if (Static142.anInt3209 == 40) {
					Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_5.anInt1611);
				} else {
					Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_3.anInt1611);
				}
				Static302.aClass3_Sub2_Sub2_2.method6045(0);
				local110 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				Static302.aClass3_Sub2_Sub2_2.method6008(583);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static177.anInt3622);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static38.method898());
				Static302.aClass3_Sub2_Sub2_2.method6045(Static385.anInt6686);
				Static302.aClass3_Sub2_Sub2_2.method6045(Static120.anInt2616);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static123.aClass21_Sub1_1.anInt879);
				Static67.method1286(Static302.aClass3_Sub2_Sub2_2);
				Static302.aClass3_Sub2_Sub2_2.method6033(Static16.aString3);
				Static302.aClass3_Sub2_Sub2_2.method6008(Static448.anInt7558);
				@Pc(330) Class3_Sub2 local330 = Static123.aClass21_Sub1_1.method789();
				Static302.aClass3_Sub2_Sub2_2.method6001(local330.anInt7620);
				Static302.aClass3_Sub2_Sub2_2.method6026(local330.anInt7620, local330.aByteArray95);
				Static103.aBoolean182 = true;
				Static302.aClass3_Sub2_Sub2_2.method6045(Static100.anInt2246);
				Static302.aClass3_Sub2_Sub2_2.method6008(Static142.aClass56_35.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static7.aClass56_5.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static104.aClass56_27.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static276.aClass56_67.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static95.aClass56_23.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static93.aClass56_22.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static160.aClass56_39.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static341.aClass56_73.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static20.aClass56_10.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static169.aClass56_41.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static6.aClass56_4.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static238.aClass56_60.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static331.aClass56_71.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static420.aClass56_87.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static405.aClass56_84.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static144.aClass56_36.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static270.aClass56_74.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static116.aClass56_76.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static241.aClass56_62.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static212.aClass56_53.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static445.aClass56_99.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static5.aClass56_3.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static168.aClass56_40.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static384.aClass56_77.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static137.aClass56_34.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static4.aClass56_12.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static97.aClass56_24.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static395.aClass56_81.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static114.aClass56_29.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6008(Static203.aClass56_50.method1383());
				Static302.aClass3_Sub2_Sub2_2.method6026(local183.anInt7620, local183.aByteArray95);
				Static302.aClass3_Sub2_Sub2_2.method6018(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local110);
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static302.aClass3_Sub2_Sub2_2.method6062(local186);
				for (@Pc(582) int local582 = 0; local582 < 4; local582++) {
					local186[local582] += 50;
				}
				Static110.aClass3_Sub2_Sub2_1.method6062(local186);
				Static108.anInt3455 = 4;
			}
			@Pc(617) int local617;
			if (Static108.anInt3455 == 4) {
				if (Static122.aClass27_1.method894() < 1) {
					return;
				}
				local617 = Static122.aClass27_1.method890();
				if (local617 == 21) {
					Static108.anInt3455 = 7;
				} else if (local617 == 29) {
					Static108.anInt3455 = 11;
				} else if (local617 == 1) {
					Static287.anInt5252 = local617;
					Static108.anInt3455 = 5;
					return;
				} else if (local617 == 2) {
					Static108.anInt3455 = 8;
				} else if (local617 == 15) {
					Static113.anInt6862 = -2;
					Static108.anInt3455 = 12;
				} else if (local617 == 23 && Static315.anInt5739 < 1) {
					Static108.anInt3455 = 1;
					Static315.anInt5739++;
					Static16.anInt533 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					return;
				} else {
					Static108.anInt3455 = 0;
					Static287.anInt5252 = local617;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					return;
				}
			}
			if (Static108.anInt3455 == 6) {
				Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
				Static302.aClass3_Sub2_Sub2_2.method6058(Static410.aClass49_4.anInt1611);
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static108.anInt3455 = 4;
			} else if (Static108.anInt3455 == 7) {
				if (Static122.aClass27_1.method894() >= 1) {
					Static220.anInt4289 = (Static122.aClass27_1.method890() + 3) * 60;
					Static287.anInt5252 = 21;
					Static108.anInt3455 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
				}
			} else if (Static108.anInt3455 != 11) {
				if (Static108.anInt3455 == 8) {
					if (Static122.aClass27_1.method894() < 13) {
						return;
					}
					Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 13, 0);
					Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
					Static199.anInt3933 = Static110.aClass3_Sub2_Sub2_1.method6053();
					Static144.anInt3223 = Static110.aClass3_Sub2_Sub2_1.method6053();
					Static269.aBoolean373 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static268.aBoolean372 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static377.aBoolean459 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static413.aBoolean307 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static177.anInt3617 = Static110.aClass3_Sub2_Sub2_1.method6004();
					Static17.aBoolean22 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static139.aBoolean249 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
					Static55.aClass25_1.method849(Static139.aBoolean249);
					Static89.aClass157_1.method3835(Static139.aBoolean249);
					Static154.aClass251_2.method5686(Static139.aBoolean249);
					if (Static269.aBoolean373 && !Static377.aBoolean459 || Static17.aBoolean22) {
						try {
							Static462.method4867(Static295.aClass103_5.anApplet1, "zap");
						} catch (@Pc(910) Throwable local910) {
							if (Static151.aBoolean254) {
								try {
									Static295.aClass103_5.anApplet1.getAppletContext().showDocument(new URL(Static295.aClass103_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(926) Exception local926) {
								}
							}
						}
					} else {
						try {
							Static462.method4867(Static295.aClass103_5.anApplet1, "unzap");
						} catch (@Pc(901) Throwable local901) {
						}
					}
					if (Static356.aClass238_6 == Static411.aClass238_7) {
						try {
							Static462.method4867(Static295.aClass103_5.anApplet1, "loggedin");
						} catch (@Pc(938) Throwable local938) {
						}
					}
					Static108.anInt3455 = 10;
				}
				if (Static108.anInt3455 == 10) {
					if (Static110.aClass3_Sub2_Sub2_1.method6064()) {
						if (Static122.aClass27_1.method894() < 1) {
							return;
						}
						Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 1, Static110.aClass3_Sub2_Sub2_1.anInt7620 + 2);
					}
					Static62.aClass184_57 = Static187.method3123()[Static110.aClass3_Sub2_Sub2_1.method6061()];
					Static113.anInt6862 = Static110.aClass3_Sub2_Sub2_1.method6004();
					Static108.anInt3455 = 9;
				}
				if (Static108.anInt3455 == 9) {
					if (Static122.aClass27_1.method894() >= Static113.anInt6862) {
						Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, Static113.anInt6862, 0);
						Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
						Static287.anInt5252 = 2;
						Static108.anInt3455 = 0;
						local617 = Static113.anInt6862;
						Static239.method3736();
						Static439.method5866(Static110.aClass3_Sub2_Sub2_1);
						Static422.anInt7272 = -1;
						Static17.method518();
						if (Static110.aClass3_Sub2_Sub2_1.anInt7620 != local617) {
							throw new RuntimeException("lswp pos:" + Static110.aClass3_Sub2_Sub2_1.anInt7620 + " psize:" + local617);
						}
						Static62.aClass184_57 = null;
					}
				} else if (Static108.anInt3455 == 12) {
					if (Static113.anInt6862 == -2) {
						if (Static122.aClass27_1.method894() < 2) {
							return;
						}
						Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 2, 0);
						Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
						Static113.anInt6862 = Static110.aClass3_Sub2_Sub2_1.method6004();
					}
					if (Static122.aClass27_1.method894() >= Static113.anInt6862) {
						Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, Static113.anInt6862, 0);
						Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
						Static108.anInt3455 = 0;
						Static287.anInt5252 = 15;
						local617 = Static113.anInt6862;
						Static343.method4912();
						Static439.method5866(Static110.aClass3_Sub2_Sub2_1);
						if (Static110.aClass3_Sub2_Sub2_1.anInt7620 != local617) {
							throw new RuntimeException("lswpr pos:" + Static110.aClass3_Sub2_Sub2_1.anInt7620 + " psize:" + local617);
						}
						Static62.aClass184_57 = null;
					}
				}
			} else if (Static122.aClass27_1.method894() >= 1) {
				Static52.anInt1259 = Static122.aClass27_1.method890();
				Static287.anInt5252 = 29;
				Static108.anInt3455 = 0;
				Static122.aClass27_1.method893();
				Static122.aClass27_1 = null;
			}
		} catch (@Pc(1113) IOException local1113) {
			if (Static122.aClass27_1 != null) {
				Static122.aClass27_1.method893();
				Static122.aClass27_1 = null;
			}
			if (Static315.anInt5739 < 1) {
				if (Static178.anInt3626 == Static14.anInt470) {
					Static178.anInt3626 = Static324.anInt423;
				} else {
					Static178.anInt3626 = Static14.anInt470;
				}
				Static315.anInt5739++;
				Static16.anInt533 = 0;
				Static108.anInt3455 = 1;
			} else {
				Static287.anInt5252 = -4;
				Static108.anInt3455 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)I")
	public static int method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
