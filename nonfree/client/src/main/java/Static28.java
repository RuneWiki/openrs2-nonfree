import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
	public static int anInt442;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!jg;")
	public static final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_11 = new Class25(7, 7);

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public static void method361() {
		if (Static140.anInt2540 == 0 || Static140.anInt2540 == 5) {
			return;
		}
		try {
			if (++Static205.anInt1293 > 2000) {
				if (Static103.aClass30_1 != null) {
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
				}
				if (Static246.anInt4149 >= 1) {
					Static140.anInt2540 = 0;
					Static189.anInt6579 = -5;
					return;
				}
				Static246.anInt4149++;
				if (Static384.anInt6347 == Static178.anInt1113) {
					Static384.anInt6347 = Static358.anInt6021;
				} else {
					Static384.anInt6347 = Static178.anInt1113;
				}
				Static205.anInt1293 = 0;
				Static140.anInt2540 = 1;
			}
			if (Static140.anInt2540 == 1) {
				Static215.aClass249_5 = Static165.aClass103_3.method2378(Static367.aString66, Static384.anInt6347);
				Static140.anInt2540 = 2;
			}
			@Pc(115) int local115;
			if (Static140.anInt2540 == 2) {
				if (Static215.aClass249_5.anInt6929 == 2) {
					throw new IOException();
				}
				if (Static215.aClass249_5.anInt6929 != 1) {
					return;
				}
				Static103.aClass30_1 = new Class30((Socket) Static215.aClass249_5.anObject10, Static165.aClass103_3);
				Static215.aClass249_5 = null;
				@Pc(108) long local108 = Static34.aLong26 = Static293.method4335(Static27.aString4);
				local115 = (int) (local108 >> 16 & 0x1FL);
				Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
				Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_1.anInt414);
				Static449.aClass6_Sub15_Sub1_2.method3075(local115);
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, 2);
				Static124.method3215();
				@Pc(140) int local140 = Static103.aClass30_1.method738();
				Static124.method3215();
				if (local140 != 0) {
					Static189.anInt6579 = local140;
					Static140.anInt2540 = 0;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					return;
				}
				Static140.anInt2540 = 3;
			}
			if (Static140.anInt2540 == 3) {
				if (Static103.aClass30_1.method735() < 8) {
					return;
				}
				Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 8);
				Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
				Static371.aLong181 = Static55.aClass6_Sub15_Sub1_1.method3119();
				@Pc(184) Class6_Sub15 local184 = new Class6_Sub15(70);
				@Pc(187) int[] local187 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static371.aLong181 >> 32), (int) Static371.aLong181 };
				local184.method3075(10);
				local184.method3107(local187[0]);
				local184.method3107(local187[1]);
				local184.method3107(local187[2]);
				local184.method3107(local187[3]);
				local184.method3115(Static293.method4335(Static27.aString4));
				local184.method3094(Static368.aString55);
				local184.method3087(Static35.aBigInteger1, Static318.aBigInteger2);
				Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
				if (Static54.anInt1123 == 40) {
					Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_5.anInt414);
				} else {
					Static449.aClass6_Sub15_Sub1_2.method3075(Static289.aClass20_3.anInt414);
				}
				Static449.aClass6_Sub15_Sub1_2.method3100(0);
				local115 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				Static449.aClass6_Sub15_Sub1_2.method3107(581);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static32.anInt522);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static172.method2743());
				Static449.aClass6_Sub15_Sub1_2.method3100(Static235.anInt4053);
				Static449.aClass6_Sub15_Sub1_2.method3100(Static381.anInt6279);
				Static449.aClass6_Sub15_Sub1_2.method3075(Static8.aClass173_Sub1_1.anInt4417);
				Static181.method2825(Static449.aClass6_Sub15_Sub1_2);
				Static449.aClass6_Sub15_Sub1_2.method3094(Static300.aString70);
				Static449.aClass6_Sub15_Sub1_2.method3107(Static441.anInt7213);
				@Pc(322) Class6_Sub15 local322 = Static8.aClass173_Sub1_1.method3973();
				Static449.aClass6_Sub15_Sub1_2.method3075(local322.anInt3487);
				Static449.aClass6_Sub15_Sub1_2.method3135(local322.anInt3487, local322.aByteArray51);
				Static59.aBoolean106 = true;
				Static449.aClass6_Sub15_Sub1_2.method3100(Static443.anInt7221);
				Static449.aClass6_Sub15_Sub1_2.method3107(Static100.aClass158_8.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static367.aClass158_90.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static435.aClass158_94.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static429.aClass158_93.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static144.aClass158_30.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static118.aClass158_26.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static280.aClass158_63.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static223.aClass158_51.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static76.aClass158_17.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static63.aClass158_15.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static207.aClass158_44.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static305.aClass158_67.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static313.aClass158_69.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static241.aClass158_55.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static340.aClass158_71.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static123.aClass158_27.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static312.aClass158_68.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static250.aClass158_58.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static129.aClass158_29.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static85.aClass158_22.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static197.aClass158_42.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static20.aClass158_6.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static337.aClass158_70.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static422.aClass158_88.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static363.aClass158_81.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static382.aClass158_82.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static52.aClass158_13.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static268.aClass158_62.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static360.aClass158_77.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3107(Static315.aClass158_56.method3698());
				Static449.aClass6_Sub15_Sub1_2.method3135(local184.anInt3487, local184.aByteArray51);
				Static449.aClass6_Sub15_Sub1_2.method3080(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local115);
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static449.aClass6_Sub15_Sub1_2.method2614(local187);
				for (@Pc(551) int local551 = 0; local551 < 4; local551++) {
					local187[local551] += 50;
				}
				Static55.aClass6_Sub15_Sub1_1.method2614(local187);
				Static140.anInt2540 = 4;
			}
			@Pc(585) int local585;
			if (Static140.anInt2540 == 4) {
				if (Static103.aClass30_1.method735() < 1) {
					return;
				}
				local585 = Static103.aClass30_1.method738();
				if (local585 == 21) {
					Static140.anInt2540 = 7;
				} else if (local585 == 29) {
					Static140.anInt2540 = 11;
				} else if (local585 == 1) {
					Static189.anInt6579 = local585;
					Static140.anInt2540 = 5;
					return;
				} else if (local585 == 2) {
					Static140.anInt2540 = 8;
				} else if (local585 == 15) {
					Static337.anInt5664 = -2;
					Static140.anInt2540 = 12;
				} else if (local585 == 23 && Static246.anInt4149 < 1) {
					Static205.anInt1293 = 0;
					Static246.anInt4149++;
					Static140.anInt2540 = 1;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					return;
				} else {
					Static189.anInt6579 = local585;
					Static140.anInt2540 = 0;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
					return;
				}
			}
			if (Static140.anInt2540 == 6) {
				Static449.aClass6_Sub15_Sub1_2.anInt3487 = 0;
				Static449.aClass6_Sub15_Sub1_2.method2605(Static289.aClass20_4.anInt414);
				Static103.aClass30_1.method733(Static449.aClass6_Sub15_Sub1_2.aByteArray51, Static449.aClass6_Sub15_Sub1_2.anInt3487);
				Static140.anInt2540 = 4;
			} else if (Static140.anInt2540 == 7) {
				if (Static103.aClass30_1.method735() >= 1) {
					Static40.anInt882 = Static103.aClass30_1.method738() * 60 + 180;
					Static189.anInt6579 = 21;
					Static140.anInt2540 = 0;
					Static103.aClass30_1.method741();
					Static103.aClass30_1 = null;
				}
			} else if (Static140.anInt2540 != 11) {
				if (Static140.anInt2540 == 8) {
					if (Static103.aClass30_1.method735() < 13) {
						return;
					}
					Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 13);
					Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
					Static221.anInt3810 = Static55.aClass6_Sub15_Sub1_1.method3111();
					Static200.anInt3527 = Static55.aClass6_Sub15_Sub1_1.method3111();
					Static311.aBoolean354 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static40.aBoolean73 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static265.aBoolean327 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static130.aBoolean175 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static251.anInt4268 = Static55.aClass6_Sub15_Sub1_1.method3108();
					Static181.aBoolean223 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static118.aBoolean158 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					Static113.aClass127_2.method2813(Static118.aBoolean158);
					Static354.aClass170_2.method3867(Static118.aBoolean158);
					Static336.aClass59_2.method1474(Static118.aBoolean158);
					if (Static311.aBoolean354 && !Static265.aBoolean327 || Static181.aBoolean223) {
						try {
							Static453.method333(Static165.aClass103_3.anApplet1, "zap");
						} catch (@Pc(852) Throwable local852) {
							if (Static171.aBoolean139) {
								try {
									Static165.aClass103_3.anApplet1.getAppletContext().showDocument(new URL(Static165.aClass103_3.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(868) Exception local868) {
								}
							}
						}
					} else {
						try {
							Static453.method333(Static165.aClass103_3.anApplet1, "unzap");
						} catch (@Pc(878) Throwable local878) {
						}
					}
					if (Static194.aClass207_8 == Static449.aClass207_11) {
						try {
							Static453.method333(Static165.aClass103_3.anApplet1, "loggedin");
						} catch (@Pc(890) Throwable local890) {
						}
					}
					Static140.anInt2540 = 10;
				}
				if (Static140.anInt2540 == 10) {
					if (Static55.aClass6_Sub15_Sub1_1.method2609()) {
						if (Static103.aClass30_1.method735() < 1) {
							return;
						}
						Static103.aClass30_1.method734(Static55.aClass6_Sub15_Sub1_1.anInt3487 + 2, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 1);
					}
					Static106.aClass186_44 = Static446.method5947()[Static55.aClass6_Sub15_Sub1_1.method2603()];
					Static337.anInt5664 = Static55.aClass6_Sub15_Sub1_1.method3108();
					Static140.anInt2540 = 9;
				}
				if (Static140.anInt2540 == 9) {
					if (Static103.aClass30_1.method735() >= Static337.anInt5664) {
						Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, Static337.anInt5664);
						Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
						local585 = Static337.anInt5664;
						Static140.anInt2540 = 0;
						Static189.anInt6579 = 2;
						Static218.method3365();
						Static340.method4808(Static55.aClass6_Sub15_Sub1_1);
						Static371.anInt6170 = -1;
						Static400.method5450();
						if (local585 != Static55.aClass6_Sub15_Sub1_1.anInt3487) {
							throw new RuntimeException("lswp pos:" + Static55.aClass6_Sub15_Sub1_1.anInt3487 + " psize:" + local585);
						}
						Static106.aClass186_44 = null;
					}
				} else if (Static140.anInt2540 == 12) {
					if (Static337.anInt5664 == -2) {
						if (Static103.aClass30_1.method735() < 2) {
							return;
						}
						Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 2);
						Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
						Static337.anInt5664 = Static55.aClass6_Sub15_Sub1_1.method3108();
					}
					if (Static103.aClass30_1.method735() >= Static337.anInt5664) {
						Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, Static337.anInt5664);
						Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
						Static189.anInt6579 = 15;
						Static140.anInt2540 = 0;
						local585 = Static337.anInt5664;
						Static251.method3868();
						Static340.method4808(Static55.aClass6_Sub15_Sub1_1);
						if (Static55.aClass6_Sub15_Sub1_1.anInt3487 != local585) {
							throw new RuntimeException("lswpr pos:" + Static55.aClass6_Sub15_Sub1_1.anInt3487 + " psize:" + local585);
						}
						Static106.aClass186_44 = null;
					}
				}
			} else if (Static103.aClass30_1.method735() >= 1) {
				Static236.anInt4058 = Static103.aClass30_1.method738();
				Static189.anInt6579 = 29;
				Static140.anInt2540 = 0;
				Static103.aClass30_1.method741();
				Static103.aClass30_1 = null;
			}
		} catch (@Pc(1075) IOException local1075) {
			if (Static103.aClass30_1 != null) {
				Static103.aClass30_1.method741();
				Static103.aClass30_1 = null;
			}
			if (Static246.anInt4149 < 1) {
				Static140.anInt2540 = 1;
				if (Static384.anInt6347 == Static178.anInt1113) {
					Static384.anInt6347 = Static358.anInt6021;
				} else {
					Static384.anInt6347 = Static178.anInt1113;
				}
				Static205.anInt1293 = 0;
				Static246.anInt4149++;
			} else {
				Static189.anInt6579 = -4;
				Static140.anInt2540 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wi;")
	public static RuntimeException_Sub1 method362(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString69 = local9.aString69 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
