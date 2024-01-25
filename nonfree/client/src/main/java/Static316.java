import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_91;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	public static int anInt6073;

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString392 = null;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "[I")
	public static final int[] anIntArray766 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "Ljava/lang/String;")
	public static final String aString393 = "scroll:";

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public static void method5126() {
		if (Static125.anInt2778 == 0 || Static125.anInt2778 == 5) {
			return;
		}
		try {
			if (++Static270.anInt5321 > 2000) {
				if (Static193.aClass61_1 != null) {
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
				}
				if (Static313.anInt5999 >= 1) {
					Static125.anInt2778 = 0;
					Static346.anInt6535 = -5;
					return;
				}
				if (Static206.anInt4119 == Static64.anInt1615) {
					Static206.anInt4119 = Static342.anInt6490;
				} else {
					Static206.anInt4119 = Static64.anInt1615;
				}
				Static270.anInt5321 = 0;
				Static125.anInt2778 = 1;
				Static313.anInt5999++;
			}
			if (Static125.anInt2778 == 1) {
				Static233.aClass99_8 = Static116.aClass21_4.method380(Static206.anInt4119, Static302.aString423);
				Static125.anInt2778 = 2;
			}
			if (Static125.anInt2778 == 2) {
				if (Static233.aClass99_8.anInt2836 == 2) {
					throw new IOException();
				}
				if (Static233.aClass99_8.anInt2836 != 1) {
					return;
				}
				Static193.aClass61_1 = new Class61((Socket) Static233.aClass99_8.anObject2, Static116.aClass21_4);
				Static233.aClass99_8 = null;
				@Pc(105) long local105 = Static353.aLong82 = Static199.method3568(Static301.aString368);
				Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
				@Pc(115) int local115 = (int) (local105 >> 16 & 0x1FL);
				Static29.aClass7_Sub3_Sub2_1.method2735(14);
				Static29.aClass7_Sub3_Sub2_1.method2735(local115);
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, 2);
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				@Pc(144) int local144 = Static193.aClass61_1.method1382();
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				if (local144 != 0) {
					Static125.anInt2778 = 0;
					Static346.anInt6535 = local144;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					return;
				}
				Static125.anInt2778 = 3;
			}
			if (Static125.anInt2778 == 3) {
				if (Static193.aClass61_1.method1372() < 8) {
					return;
				}
				Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, 8);
				Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
				Static98.aLong44 = Static200.aClass7_Sub3_Sub2_3.method2790();
				@Pc(194) int[] local194 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, 0, (int) Static98.aLong44 };
				Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
				local194[1] = (int) (Math.random() * 9.9999999E7D);
				local194[2] = (int) (Static98.aLong44 >> 32);
				Static29.aClass7_Sub3_Sub2_1.method2735(10);
				Static29.aClass7_Sub3_Sub2_1.method2765(local194[0]);
				Static29.aClass7_Sub3_Sub2_1.method2765(local194[1]);
				Static29.aClass7_Sub3_Sub2_1.method2765(local194[2]);
				Static29.aClass7_Sub3_Sub2_1.method2765(local194[3]);
				Static29.aClass7_Sub3_Sub2_1.method2777(Static199.method3568(Static301.aString368));
				Static29.aClass7_Sub3_Sub2_1.method2738(Static68.aString124);
				Static29.aClass7_Sub3_Sub2_1.method2789(Static184.aBigInteger2, Static101.aBigInteger1);
				Static189.aClass7_Sub3_Sub2_2.anInt3005 = 0;
				if (Static85.anInt2215 == 40) {
					Static189.aClass7_Sub3_Sub2_2.method2735(18);
				} else {
					Static189.aClass7_Sub3_Sub2_2.method2735(16);
				}
				Static189.aClass7_Sub3_Sub2_2.method2788(Static29.aClass7_Sub3_Sub2_1.anInt3005 + Static344.method5559(Static249.aString99) + 161);
				Static189.aClass7_Sub3_Sub2_2.method2765(555);
				Static189.aClass7_Sub3_Sub2_2.method2735(Static100.anInt2439);
				Static189.aClass7_Sub3_Sub2_2.method2735(Static213.method3775());
				Static189.aClass7_Sub3_Sub2_2.method2788(Static128.anInt2823);
				Static189.aClass7_Sub3_Sub2_2.method2788(Static214.anInt4266);
				Static189.aClass7_Sub3_Sub2_2.method2735(Static206.anInt4115);
				Static349.method5608(Static189.aClass7_Sub3_Sub2_2);
				Static189.aClass7_Sub3_Sub2_2.method2738(Static249.aString99);
				Static189.aClass7_Sub3_Sub2_2.method2765(Static37.anInt1055);
				Static189.aClass7_Sub3_Sub2_2.method2765(Static180.method3312());
				Static35.aBoolean77 = true;
				Static189.aClass7_Sub3_Sub2_2.method2788(Static168.anInt3502);
				Static189.aClass7_Sub3_Sub2_2.method2765(Static193.aClass180_51.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static251.aClass180_94.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static282.aClass180_75.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static318.aClass180_6.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static284.aClass180_77.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static87.aClass180_80.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static226.aClass180_57.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static247.aClass180_64.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static312.aClass180_89.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static286.aClass180_78.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static159.aClass180_44.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static65.aClass180_18.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static194.aClass180_21.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static139.aClass180_36.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static85.aClass180_23.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static100.aClass180_29.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static36.aClass180_9.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static257.aClass180_67.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static131.aClass180_35.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static284.aClass180_76.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static200.aClass180_53.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static273.aClass180_72.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static334.aClass180_95.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static87.aClass180_81.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static100.aClass180_30.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static304.aClass180_85.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static309.aClass180_87.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static239.aClass180_60.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2765(Static42.aClass180_10.method4579());
				Static189.aClass7_Sub3_Sub2_2.method2781(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				Static193.aClass61_1.method1377(Static189.aClass7_Sub3_Sub2_2.aByteArray33, Static189.aClass7_Sub3_Sub2_2.anInt3005);
				Static29.aClass7_Sub3_Sub2_1.method2800(local194);
				for (@Pc(537) int local537 = 0; local537 < 4; local537++) {
					local194[local537] += 50;
				}
				Static200.aClass7_Sub3_Sub2_3.method2800(local194);
				Static125.anInt2778 = 4;
			}
			if (Static125.anInt2778 == 4) {
				if (Static193.aClass61_1.method1372() < 1) {
					return;
				}
				@Pc(571) int local571 = Static193.aClass61_1.method1382();
				if (local571 == 21) {
					Static125.anInt2778 = 7;
				} else if (local571 == 29) {
					Static125.anInt2778 = 10;
				} else if (local571 == 1) {
					Static125.anInt2778 = 5;
					Static346.anInt6535 = local571;
					return;
				} else if (local571 == 2) {
					Static125.anInt2778 = 8;
				} else if (local571 == 15) {
					Static125.anInt2778 = 0;
					Static346.anInt6535 = local571;
					return;
				} else if (local571 == 23 && Static313.anInt5999 < 1) {
					Static270.anInt5321 = 0;
					Static313.anInt5999++;
					Static125.anInt2778 = 1;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					return;
				} else {
					Static346.anInt6535 = local571;
					Static125.anInt2778 = 0;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					return;
				}
			}
			if (Static125.anInt2778 == 6) {
				Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
				Static29.aClass7_Sub3_Sub2_1.method2799(17);
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				Static125.anInt2778 = 4;
			} else if (Static125.anInt2778 == 7) {
				if (Static193.aClass61_1.method1372() >= 1) {
					Static67.anInt6311 = (Static193.aClass61_1.method1382() + 3) * 60;
					Static125.anInt2778 = 0;
					Static346.anInt6535 = 21;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
				}
			} else if (Static125.anInt2778 != 10) {
				if (Static125.anInt2778 == 8) {
					if (Static193.aClass61_1.method1372() < 14) {
						return;
					}
					Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, 14);
					Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
					Static244.anInt4842 = Static200.aClass7_Sub3_Sub2_3.method2772();
					Static223.anInt4465 = Static200.aClass7_Sub3_Sub2_3.method2772();
					Static261.aBoolean371 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static233.aBoolean343 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static342.aBoolean472 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static343.aBoolean474 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static217.aBoolean482 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static4.anInt77 = Static200.aClass7_Sub3_Sub2_3.method2764();
					Static63.aBoolean407 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static204.aBoolean315 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
					Static324.method5211(Static204.aBoolean315);
					Static355.method5707(Static204.aBoolean315);
					Static312.method5039(Static204.aBoolean315);
					if (Static261.aBoolean371 && !Static342.aBoolean472 || Static63.aBoolean407) {
						try {
							Static362.method3353("zap", Static116.aClass21_4.anApplet1);
						} catch (@Pc(864) Throwable local864) {
						}
					} else {
						try {
							Static362.method3353("unzap", Static116.aClass21_4.anApplet1);
						} catch (@Pc(854) Throwable local854) {
						}
					}
					if (Static151.anInt3239 == 0) {
						try {
							Static362.method3353("loggedin", Static116.aClass21_4.anApplet1);
						} catch (@Pc(875) Throwable local875) {
						}
					}
					Static127.anInt2797 = Static200.aClass7_Sub3_Sub2_3.method2798();
					Static54.anInt1421 = Static200.aClass7_Sub3_Sub2_3.method2764();
					Static125.anInt2778 = 9;
				}
				if (Static125.anInt2778 == 9 && Static193.aClass61_1.method1372() >= Static54.anInt1421) {
					Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
					Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, Static54.anInt1421);
					Static346.anInt6535 = 2;
					Static125.anInt2778 = 0;
					Static84.method1786();
					Static101.anInt2445 = -1;
					Static41.method881(false);
					Static127.anInt2797 = -1;
				}
			} else if (Static193.aClass61_1.method1372() >= 1) {
				Static273.anInt5393 = Static193.aClass61_1.method1382();
				Static346.anInt6535 = 29;
				Static125.anInt2778 = 0;
				Static193.aClass61_1.method1376();
				Static193.aClass61_1 = null;
			}
		} catch (@Pc(920) IOException local920) {
			if (Static193.aClass61_1 != null) {
				Static193.aClass61_1.method1376();
				Static193.aClass61_1 = null;
			}
			if (Static313.anInt5999 < 1) {
				Static270.anInt5321 = 0;
				Static313.anInt5999++;
				Static125.anInt2778 = 1;
				if (Static206.anInt4119 == Static64.anInt1615) {
					Static206.anInt4119 = Static342.anInt6490;
				} else {
					Static206.anInt4119 = Static64.anInt1615;
				}
			} else {
				Static346.anInt6535 = -4;
				Static125.anInt2778 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	public static void method5130() {
		Static29.aClass7_Sub3_Sub2_1.method2799(74);
		Static29.aClass7_Sub3_Sub2_1.method2735(Static213.method3775());
		Static29.aClass7_Sub3_Sub2_1.method2788(Static128.anInt2823);
		Static29.aClass7_Sub3_Sub2_1.method2788(Static214.anInt4266);
		Static29.aClass7_Sub3_Sub2_1.method2735(Static206.anInt4115);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)V")
	public static void method5131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class126 local7 = Static111.method2159(arg0);
		@Pc(10) int local10 = local7.anInt3655;
		@Pc(20) int local20 = local7.anInt3656;
		@Pc(23) int local23 = local7.anInt3652;
		@Pc(29) int local29 = Class11.anIntArray418[local23 - local20];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local20;
		Static74.method1484(local10, local29 & arg1 << local20 | ~local29 & Static212.anIntArray579[local10]);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method5132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(6, arg0);
		local8.method4790();
		local8.anInt5687 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5133(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static296.aStringArray48.length; local14++) {
			if (Static296.aStringArray48[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}
}
