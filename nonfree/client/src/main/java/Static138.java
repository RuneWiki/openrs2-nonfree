import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!il", name = "S", descriptor = "[[[Lclient!uk;")
	public static Class204[][][] aClass204ArrayArrayArray1;

	@OriginalMember(owner = "client!il", name = "Y", descriptor = "Lclient!qj;")
	public static Class165 aClass165_49;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_31 = new Class195();

	@OriginalMember(owner = "client!il", name = "T", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!il", name = "U", descriptor = "I")
	public static final int anInt2753 = -13423323;

	@OriginalMember(owner = "client!il", name = "W", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!il", name = "X", descriptor = "I")
	public static int anInt2755 = 1;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
	public static void method2659() {
		Static115.anInt2300 = 0;
		Static82.anInt1642 = -3;
		Static122.anInt2361 = -1;
		Static24.anInt674 = 1;
		Static302.anInt4751 = 0;
		Static193.anInt3948 = 0;
		Static335.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
	public static void method2660() {
		if (Static24.anInt674 == 0 || Static24.anInt674 == 5) {
			return;
		}
		try {
			if (++Static115.anInt2300 > 2000) {
				if (Static153.aClass158_2 != null) {
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
				}
				if (Static302.anInt4751 >= 1) {
					Static82.anInt1642 = -5;
					Static24.anInt674 = 0;
					return;
				}
				Static24.anInt674 = 1;
				if (Static211.anInt4206 == Static298.anInt5962) {
					Static298.anInt5962 = Static2.anInt3510;
				} else {
					Static298.anInt5962 = Static211.anInt4206;
				}
				Static302.anInt4751++;
				Static115.anInt2300 = 0;
			}
			if (Static24.anInt674 == 1) {
				Static59.aClass134_1 = Static180.aClass110_6.method3357(Static91.aString73, Static298.anInt5962);
				Static24.anInt674 = 2;
			}
			if (Static24.anInt674 == 2) {
				if (Static59.aClass134_1.anInt4033 == 2) {
					throw new IOException();
				}
				if (Static59.aClass134_1.anInt4033 != 1) {
					return;
				}
				Static153.aClass158_2 = new Class158((Socket) Static59.aClass134_1.anObject6, Static180.aClass110_6);
				Static59.aClass134_1 = null;
				@Pc(105) long local105 = Static195.aLong134 = Static57.method1236(Static142.aString123);
				@Pc(112) int local112 = (int) (local105 >> 16 & 0x1FL);
				Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
				Static248.aClass1_Sub7_Sub1_2.method3108(14);
				Static248.aClass1_Sub7_Sub1_2.method3108(local112);
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, 2);
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				@Pc(146) int local146 = Static153.aClass158_2.method4337();
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				if (local146 != 0) {
					Static24.anInt674 = 0;
					Static82.anInt1642 = local146;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					return;
				}
				Static24.anInt674 = 3;
			}
			if (Static24.anInt674 == 3) {
				if (Static153.aClass158_2.method4326() < 8) {
					return;
				}
				Static153.aClass158_2.method4330(8, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
				Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
				Static286.aLong180 = Static232.aClass1_Sub7_Sub1_4.method3109();
				@Pc(206) int[] local206 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static286.aLong180 >> 32), (int) Static286.aLong180 };
				Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
				Static248.aClass1_Sub7_Sub1_2.method3108(10);
				Static248.aClass1_Sub7_Sub1_2.method3098(local206[0]);
				Static248.aClass1_Sub7_Sub1_2.method3098(local206[1]);
				Static248.aClass1_Sub7_Sub1_2.method3098(local206[2]);
				Static248.aClass1_Sub7_Sub1_2.method3098(local206[3]);
				Static248.aClass1_Sub7_Sub1_2.method3121(Static57.method1236(Static142.aString123));
				Static248.aClass1_Sub7_Sub1_2.method3124(Static87.aString69);
				Static248.aClass1_Sub7_Sub1_2.method3092(Static82.aBigInteger1, Static152.aBigInteger2);
				Static301.aClass1_Sub7_Sub1_3.anInt3368 = 0;
				if (Static239.anInt4649 == 40) {
					Static301.aClass1_Sub7_Sub1_3.method3108(18);
				} else {
					Static301.aClass1_Sub7_Sub1_3.method3108(16);
				}
				Static301.aClass1_Sub7_Sub1_3.method3128(Static248.aClass1_Sub7_Sub1_2.anInt3368 + Static203.method3794(Static119.aString76) + 161);
				Static301.aClass1_Sub7_Sub1_3.method3098(563);
				Static301.aClass1_Sub7_Sub1_3.method3108(Static87.anInt1718);
				Static301.aClass1_Sub7_Sub1_3.method3108(Static295.method5063());
				Static301.aClass1_Sub7_Sub1_3.method3128(Static11.anInt5389);
				Static301.aClass1_Sub7_Sub1_3.method3128(Static320.anInt6140);
				Static301.aClass1_Sub7_Sub1_3.method3108(Static123.anInt2389);
				Static159.method2993(Static301.aClass1_Sub7_Sub1_3);
				Static301.aClass1_Sub7_Sub1_3.method3124(Static119.aString76);
				Static301.aClass1_Sub7_Sub1_3.method3098(Static61.anInt1330);
				Static301.aClass1_Sub7_Sub1_3.method3098(Static33.method882());
				Static7.aBoolean21 = true;
				Static301.aClass1_Sub7_Sub1_3.method3128(Static169.anInt4508);
				Static301.aClass1_Sub7_Sub1_3.method3098(Static316.aClass165_95.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static334.aClass165_102.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static324.aClass165_98.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static82.aClass165_26.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static301.aClass165_92.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static316.aClass165_94.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static242.aClass165_74.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static28.aClass165_10.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static297.aClass165_88.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static348.aClass165_57.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static328.aClass165_100.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static334.aClass165_103.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static274.aClass165_82.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static236.aClass165_72.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static128.aClass165_47.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(aClass165_49.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static68.aClass165_24.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static285.aClass165_85.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static57.aClass165_22.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static240.aClass165_73.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static194.aClass165_61.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static34.aClass165_13.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static340.aClass165_60.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static119.aClass165_41.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static221.aClass165_69.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static117.aClass165_45.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static129.aClass165_48.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static145.aClass165_51.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3098(Static206.aClass165_64.method4479());
				Static301.aClass1_Sub7_Sub1_3.method3146(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				Static153.aClass158_2.method4325(Static301.aClass1_Sub7_Sub1_3.aByteArray58, Static301.aClass1_Sub7_Sub1_3.anInt3368);
				Static248.aClass1_Sub7_Sub1_2.method731(local206);
				for (@Pc(577) int local577 = 0; local577 < 4; local577++) {
					local206[local577] += 50;
				}
				Static232.aClass1_Sub7_Sub1_4.method731(local206);
				Static24.anInt674 = 4;
			}
			if (Static24.anInt674 == 4) {
				if (Static153.aClass158_2.method4326() < 1) {
					return;
				}
				@Pc(613) int local613 = Static153.aClass158_2.method4337();
				if (local613 == 21) {
					Static24.anInt674 = 7;
				} else if (local613 == 29) {
					Static24.anInt674 = 10;
				} else if (local613 == 1) {
					Static82.anInt1642 = local613;
					Static24.anInt674 = 5;
					return;
				} else if (local613 == 2) {
					Static24.anInt674 = 8;
				} else if (local613 == 15) {
					Static24.anInt674 = 0;
					Static82.anInt1642 = local613;
					return;
				} else if (local613 == 23 && Static302.anInt4751 < 1) {
					Static115.anInt2300 = 0;
					Static302.anInt4751++;
					Static24.anInt674 = 1;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					return;
				} else {
					Static24.anInt674 = 0;
					Static82.anInt1642 = local613;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					return;
				}
			}
			if (Static24.anInt674 == 6) {
				Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
				Static248.aClass1_Sub7_Sub1_2.method728(17);
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				Static24.anInt674 = 4;
			} else if (Static24.anInt674 == 7) {
				if (Static153.aClass158_2.method4326() >= 1) {
					Static193.anInt3948 = (Static153.aClass158_2.method4337() + 3) * 60;
					Static24.anInt674 = 0;
					Static82.anInt1642 = 21;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
				}
			} else if (Static24.anInt674 != 10) {
				if (Static24.anInt674 == 8) {
					if (Static153.aClass158_2.method4326() < 14) {
						return;
					}
					Static153.aClass158_2.method4330(14, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
					Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
					Static180.anInt3759 = Static232.aClass1_Sub7_Sub1_4.method3141();
					Static307.anInt5908 = Static232.aClass1_Sub7_Sub1_4.method3141();
					Static115.aBoolean193 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static300.aBoolean507 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static233.aBoolean382 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static206.aBoolean350 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static161.aBoolean284 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static69.anInt1424 = Static232.aClass1_Sub7_Sub1_4.method3115();
					Static214.aBoolean362 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static220.aBoolean369 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
					Static162.method3081(Static220.aBoolean369);
					Static11.method4797(Static220.aBoolean369);
					Static272.method4751(Static220.aBoolean369);
					if (Static115.aBoolean193 && !Static233.aBoolean382 || Static214.aBoolean362) {
						try {
							Static365.method4929(Static180.aClass110_6.anApplet1, "zap");
						} catch (@Pc(914) Throwable local914) {
						}
					} else {
						try {
							Static365.method4929(Static180.aClass110_6.anApplet1, "unzap");
						} catch (@Pc(904) Throwable local904) {
						}
					}
					if (Static123.anInt2380 == 0) {
						try {
							Static365.method4929(Static180.aClass110_6.anApplet1, "loggedin");
						} catch (@Pc(928) Throwable local928) {
						}
					}
					Static351.anInt6505 = Static232.aClass1_Sub7_Sub1_4.method730();
					Static230.anInt4529 = Static232.aClass1_Sub7_Sub1_4.method3115();
					Static24.anInt674 = 9;
				}
				if (Static24.anInt674 == 9 && Static153.aClass158_2.method4326() >= Static230.anInt4529) {
					Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
					Static153.aClass158_2.method4330(Static230.anInt4529, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
					Static82.anInt1642 = 2;
					Static24.anInt674 = 0;
					Static332.method5568();
					Static58.anInt1291 = -1;
					Static324.method5451(false);
					Static351.anInt6505 = -1;
				}
			} else if (Static153.aClass158_2.method4326() >= 1) {
				Static122.anInt2361 = Static153.aClass158_2.method4337();
				Static24.anInt674 = 0;
				Static82.anInt1642 = 29;
				Static153.aClass158_2.method4339();
				Static153.aClass158_2 = null;
			}
		} catch (@Pc(983) IOException local983) {
			if (Static153.aClass158_2 != null) {
				Static153.aClass158_2.method4339();
				Static153.aClass158_2 = null;
			}
			if (Static302.anInt4751 < 1) {
				Static115.anInt2300 = 0;
				Static302.anInt4751++;
				if (Static298.anInt5962 == Static211.anInt4206) {
					Static298.anInt5962 = Static2.anInt3510;
				} else {
					Static298.anInt5962 = Static211.anInt4206;
				}
				Static24.anInt674 = 1;
			} else {
				Static24.anInt674 = 0;
				Static82.anInt1642 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V")
	public static void method2661() {
		Static9.aClass26_1.method876();
		Static90.aClass26_10.method876();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)Z")
	public static boolean method2664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class1_Sub7 local17 = new Class1_Sub7(arg2);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method3110();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(96) Class188 local96;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method3145();
										if (local42 == 0) {
											continue label70;
										}
										local17.method3141();
									}
									local42 = local17.method3145();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local17.method3141() >> 2;
									local70 = arg1 + local60;
									local74 = local54 + arg0;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (Static48.anInt1107 - 1 <= local70);
					} while (local74 >= Static337.anInt6402 - 1);
					local96 = Static126.method2405(local19);
				} while (local66 == 22 && !Static217.aBoolean365 && local96.anInt5546 == 0 && local96.anInt5529 != 1 && !local96.aBoolean482);
				if (!local96.method4917()) {
					Static108.anInt2195++;
					local7 = false;
				}
				local36 = true;
			}
		}
	}
}
