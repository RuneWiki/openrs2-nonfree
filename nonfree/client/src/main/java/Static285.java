import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!jka", name = "W", descriptor = "I")
	public static int anInt4849;

	@OriginalMember(owner = "client!jka", name = "Y", descriptor = "Lclient!eb;")
	public static Class91 aClass91_8;

	@OriginalMember(owner = "client!jka", name = "H", descriptor = "I")
	public static int anInt4838 = 0;

	@OriginalMember(owner = "client!jka", name = "L", descriptor = "Lclient!fga;")
	public static final Class115 aClass115_3 = new Class115();

	@OriginalMember(owner = "client!jka", name = "T", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_48 = new Class240(84, -1);

	@OriginalMember(owner = "client!jka", name = "U", descriptor = "I")
	public static final int anInt4847 = 52;

	@OriginalMember(owner = "client!jka", name = "X", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_71 = new Class171(77, 4);

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IILclient!ofa;I)V")
	public static void method4138(@OriginalArg(1) int arg0, @OriginalArg(2) Class265 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte108 == 0) {
			arg1.anInt6993 = arg1.anInt7048;
		} else if (arg1.aByte108 == 1) {
			arg1.anInt6993 = arg1.anInt7048 + (arg2 - arg1.anInt7024) / 2;
		} else if (arg1.aByte108 == 2) {
			arg1.anInt6993 = arg2 - arg1.anInt7048 - arg1.anInt7024;
		} else if (arg1.aByte108 == 3) {
			arg1.anInt6993 = arg1.anInt7048 * arg2 >> 14;
		} else if (arg1.aByte108 == 4) {
			arg1.anInt6993 = (arg2 * arg1.anInt7048 >> 14) + (arg2 - arg1.anInt7024) / 2;
		} else {
			arg1.anInt6993 = arg2 - (arg2 * arg1.anInt7048 >> 14) - arg1.anInt7024;
		}
		if (arg1.aByte109 == 0) {
			arg1.anInt6968 = arg1.anInt7035;
		} else if (arg1.aByte109 == 1) {
			arg1.anInt6968 = arg1.anInt7035 + (arg0 - arg1.anInt6997) / 2;
		} else if (arg1.aByte109 == 2) {
			arg1.anInt6968 = arg0 - arg1.anInt6997 - arg1.anInt7035;
		} else if (arg1.aByte109 == 3) {
			arg1.anInt6968 = arg0 * arg1.anInt7035 >> 14;
		} else if (arg1.aByte109 == 4) {
			arg1.anInt6968 = (arg1.anInt7035 * arg0 >> 14) + (arg0 - arg1.anInt6997) / 2;
		} else {
			arg1.anInt6968 = arg0 - (arg0 * arg1.anInt7035 >> 14) - arg1.anInt6997;
		}
		if (!Static97.aBoolean153 || Static86.method1383(arg1).anInt7824 == 0 && arg1.anInt6967 != 0) {
			return;
		}
		if (arg1.anInt6993 < 0) {
			arg1.anInt6993 = 0;
		} else if (arg2 < arg1.anInt6993 + arg1.anInt7024) {
			arg1.anInt6993 = arg2 - arg1.anInt7024;
		}
		if (arg1.anInt6968 < 0) {
			arg1.anInt6968 = 0;
		} else if (arg0 < arg1.anInt6968 + arg1.anInt6997) {
			arg1.anInt6968 = arg0 - arg1.anInt6997;
			return;
		}
	}

	@OriginalMember(owner = "client!jka", name = "h", descriptor = "(I)V")
	public static void method4139() {
		Static260.anInt4566 = 0;
		@Pc(12) int local12 = Static534.anInt8358 + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9);
		@Pc(27) int local27 = Static402.anInt6661 + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static260.anInt4566 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static260.anInt4566 = 1;
		}
		if (Static260.anInt4566 == 1 && local12 >= 3139 && local12 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static260.anInt4566 = 0;
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method4140(@OriginalArg(0) Class95 arg0) {
		Static261.aClass67_5 = Static379.method5354(arg0, true, Static206.anInt3612);
		aClass91_8 = Static448.method6082(Static206.anInt3612, arg0);
		Static184.aClass67_3 = Static379.method5354(arg0, true, Static642.anInt10556);
		Static513.aClass91_12 = Static448.method6082(Static642.anInt10556, arg0);
		Static293.aClass67_14 = Static379.method5354(arg0, true, Static336.anInt5797);
		Static281.aClass91_7 = Static448.method6082(Static336.anInt5797, arg0);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)V")
	public static void method4141(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 1);
		local9.method8834();
	}

	@OriginalMember(owner = "client!jka", name = "i", descriptor = "(I)V")
	public static void method4142() {
		if (Static474.anInt7575 == 0 || Static474.anInt7575 == 5) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static16.anInt10137 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (++Static264.anInt4602 > local18) {
				if (Static12.aClass26_1 != null) {
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
				}
				if (Static16.anInt10137 >= 3) {
					Static474.anInt7575 = 0;
					Static302.method4386(-5);
					return;
				}
				if (Static367.anInt10954 == 2) {
					Static98.aClass275_2.method6084();
				} else {
					Static385.aClass275_6.method6084();
				}
				Static264.anInt4602 = 0;
				Static16.anInt10137++;
				Static474.anInt7575 = 1;
			}
			if (Static474.anInt7575 == 1) {
				if (Static367.anInt10954 == 2) {
					Static500.aClass338_11 = Static98.aClass275_2.method6086(Static566.aClass92_6);
				} else {
					Static500.aClass338_11 = Static385.aClass275_6.method6086(Static566.aClass92_6);
				}
				Static474.anInt7575 = 2;
			}
			@Pc(126) Class3_Sub37 local126;
			if (Static474.anInt7575 == 2) {
				if (Static500.aClass338_11.anInt9321 == 2) {
					throw new IOException();
				}
				if (Static500.aClass338_11.anInt9321 != 1) {
					return;
				}
				Static12.aClass26_1 = Static309.method4444((Socket) Static500.aClass338_11.anObject18);
				Static500.aClass338_11 = null;
				Static516.method6719();
				local126 = Static272.method4014();
				local126.aClass3_Sub4_Sub1_2.method7948(Static675.aClass179_1.anInt4730);
				Static301.method2678(local126);
				Static538.method6888();
				Static474.anInt7575 = 3;
			}
			@Pc(163) int local163;
			if (Static474.anInt7575 == 3) {
				if (!Static12.aClass26_1.method741(1)) {
					return;
				}
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
				local163 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
				if (local163 != 0) {
					Static474.anInt7575 = 0;
					Static302.method4386(local163);
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
					Static359.method5202();
					return;
				}
				Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
				@Pc(189) Class3_Sub4 local189 = new Class3_Sub4(518);
				@Pc(192) int[] local192 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local189.method7948(10);
				local189.method7909(local192[0]);
				local189.method7909(local192[1]);
				local189.method7909(local192[2]);
				local189.method7909(local192[3]);
				local189.method7893(0L);
				local189.method7901(Static330.aString71);
				local189.method7893(Static425.aLong191);
				local189.method7893(Static502.aLong221);
				local189.method7950(Static391.aBigInteger3, Static107.aBigInteger1);
				Static516.method6719();
				@Pc(278) Class3_Sub37 local278 = Static272.method4014();
				@Pc(281) Class3_Sub4_Sub1 local281 = local278.aClass3_Sub4_Sub1_2;
				@Pc(300) int local300;
				@Pc(315) int local315;
				if (Static367.anInt10954 == 2) {
					if (Static221.anInt3831 == 13) {
						local281.method7948(Static675.aClass179_5.anInt4730);
					} else {
						local281.method7948(Static675.aClass179_3.anInt4730);
					}
					local281.method7956(0);
					local300 = local281.anInt9739;
					local281.method7909(645);
					local281.method7939(local189.aByteArray90, local189.anInt9739, 0);
					local315 = local281.anInt9739;
					local281.method7901(Static525.aString100);
					local281.method7948(Static399.anInt6574);
					local281.method7948(Static241.method3664());
					local281.method7956(Static531.anInt8327);
					local281.method7956(Static13.anInt306);
					local281.method7948(Static336.aClass3_Sub41_18.aClass14_Sub10_2.method3046());
					Static165.method2614(local281);
					local281.method7901(Static360.aString78);
					local281.method7909(Static224.anInt3866);
					@Pc(440) Class3_Sub4 local440 = Static336.aClass3_Sub41_18.method6701();
					local281.method7948(local440.anInt9739);
					local281.method7939(local440.aByteArray90, local440.anInt9739, 0);
					Static74.aBoolean102 = true;
					@Pc(464) Class3_Sub4 local464 = new Class3_Sub4(Static395.aClass3_Sub28_1.method3897());
					Static395.aClass3_Sub28_1.method3899(local464);
					local281.method7939(local464.aByteArray90, local464.aByteArray90.length, 0);
					local281.method7956(Static147.anInt2707);
					local281.method7893(Static566.aLong254);
					local281.method7948(Static502.aString96 == null ? 0 : 1);
					if (Static502.aString96 != null) {
						local281.method7901(Static502.aString96);
					}
					local281.method7948(Static66.method1168("jagtheora") ? 1 : 0);
					local281.method7948(Static158.aBoolean218 ? 1 : 0);
					Static463.method6192(local281);
					local281.method7940(local281.anInt9739, local192, local315);
					local281.method7923(local281.anInt9739 - local300);
				} else {
					local281.method7948(Static675.aClass179_6.anInt4730);
					local281.method7956(0);
					local300 = local281.anInt9739;
					local281.method7909(645);
					local281.method7939(local189.aByteArray90, local189.anInt9739, 0);
					local315 = local281.anInt9739;
					local281.method7901(Static525.aString100);
					local281.method7948(Static227.aClass203_4.anInt5389);
					local281.method7948(Static654.anInt10668);
					Static165.method2614(local281);
					local281.method7901(Static360.aString78);
					local281.method7909(Static224.anInt3866);
					Static463.method6192(local281);
					local281.method7940(local281.anInt9739, local192, local315);
					local281.method7923(local281.anInt9739 - local300);
				}
				Static301.method2678(local278);
				Static538.method6888();
				Static226.aClass144_2 = new Class144(local192);
				for (local300 = 0; local300 < 4; local300++) {
					local192[local300] += 50;
				}
				Static459.aClass3_Sub4_Sub1_1.method339(local192);
				Static474.anInt7575 = 4;
			}
			if (Static474.anInt7575 == 4) {
				if (!Static12.aClass26_1.method741(1)) {
					return;
				}
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
				local163 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
				if (local163 == 21) {
					Static474.anInt7575 = 7;
				} else if (local163 == 29) {
					Static474.anInt7575 = 13;
				} else if (local163 == 1) {
					Static474.anInt7575 = 5;
					Static302.method4386(local163);
					return;
				} else if (local163 == 2) {
					Static474.anInt7575 = 8;
				} else if (local163 == 15) {
					Static474.anInt7575 = 14;
					Static147.anInt2709 = -2;
				} else if (local163 == 23 && Static16.anInt10137 < 3) {
					Static264.anInt4602 = 0;
					Static474.anInt7575 = 1;
					Static16.anInt10137++;
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
					return;
				} else {
					Static474.anInt7575 = 0;
					Static302.method4386(local163);
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
					Static359.method5202();
					return;
				}
			}
			if (Static474.anInt7575 == 6) {
				Static516.method6719();
				local126 = Static272.method4014();
				@Pc(683) Class3_Sub4_Sub1 local683 = local126.aClass3_Sub4_Sub1_2;
				local683.method328(Static226.aClass144_2);
				local683.method335(Static675.aClass179_10.anInt4730);
				Static301.method2678(local126);
				Static538.method6888();
				Static474.anInt7575 = 4;
			} else if (Static474.anInt7575 == 7) {
				if (Static12.aClass26_1.method741(1)) {
					Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
					local163 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
					Static474.anInt7575 = 0;
					anInt4838 = local163 * 50;
					Static302.method4386(21);
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
					Static359.method5202();
				}
			} else if (Static474.anInt7575 == 13) {
				if (Static12.aClass26_1.method741(1)) {
					Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
					Static237.anInt4212 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
					Static474.anInt7575 = 0;
					Static302.method4386(29);
					Static12.aClass26_1.method746();
					Static12.aClass26_1 = null;
					Static359.method5202();
				}
			} else if (Static474.anInt7575 != 8) {
				@Pc(819) Class3_Sub4_Sub1 local819;
				if (Static474.anInt7575 == 9) {
					local819 = Static459.aClass3_Sub4_Sub1_1;
					if (Static367.anInt10954 == 2) {
						if (!Static12.aClass26_1.method741(Static558.anInt9004)) {
							return;
						}
						Static12.aClass26_1.method743(Static558.anInt9004, local819.aByteArray90, 0);
						local819.anInt9739 = 0;
						Static512.anInt8070 = local819.method7954();
						Static154.anInt6135 = local819.method7954();
						Static511.aBoolean563 = local819.method7954() == 1;
						Static14.aBoolean14 = local819.method7954() == 1;
						Static498.aBoolean758 = local819.method7954() == 1;
						Static656.aBoolean736 = local819.method7954() == 1;
						Static291.anInt4955 = local819.method7951();
						Static118.aBoolean679 = local819.method7954() == 1;
						Static455.anInt7321 = local819.method7912();
						Static20.aBoolean23 = local819.method7954() == 1;
						Static466.aClass340_6.method7671(Static20.aBoolean23);
						Static117.aClass197_2.method4519(Static20.aBoolean23);
						Static267.aClass196_1.method4473(Static20.aBoolean23);
					} else if (Static12.aClass26_1.method741(Static558.anInt9004)) {
						Static12.aClass26_1.method743(Static558.anInt9004, local819.aByteArray90, 0);
						local819.anInt9739 = 0;
						Static512.anInt8070 = local819.method7954();
						Static154.anInt6135 = local819.method7954();
						Static511.aBoolean563 = local819.method7954() == 1;
						Static14.aBoolean14 = local819.method7954() == 1;
						Static498.aBoolean758 = local819.method7954() == 1;
						Static662.aLong303 = local819.method7946();
						Static222.aLong102 = Static662.aLong303 - Static15.method380() - local819.method7961();
						@Pc(1000) int local1000 = local819.method7954();
						Static365.aBoolean436 = (local1000 & 0x2) != 0;
						Static118.aBoolean679 = (local1000 & 0x1) != 0;
						Static75.anInt1476 = local819.method7895();
						Static335.anInt5701 = local819.method7951();
						Static151.anInt8950 = local819.method7951();
						Static193.anInt3508 = local819.method7951();
						Static180.anInt3306 = local819.method7895();
						Static633.aClass338_15 = Static566.aClass92_6.method1876(Static180.anInt3306);
						Static239.anInt4249 = local819.method7954();
						Static530.anInt8326 = local819.method7951();
						Static514.anInt8104 = local819.method7951();
						Static375.aBoolean530 = local819.method7954() == 1;
						Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString24 = Static168.aString44 = local819.method7928();
						Static517.anInt8128 = local819.method7954();
						Static301.anInt3096 = local819.method7895();
						Static15.aBoolean15 = local819.method7954() == 1;
						Static307.aClass275_4 = new Class275();
						Static307.aClass275_4.anInt7235 = local819.method7951();
						if (Static307.aClass275_4.anInt7235 == 65535) {
							Static307.aClass275_4.anInt7235 = -1;
						}
						Static307.aClass275_4.aString91 = local819.method7928();
						if (Static256.aClass135_4 != Static228.aClass135_3) {
							Static307.aClass275_4.anInt7236 = Static307.aClass275_4.anInt7235 + 40000;
							Static307.aClass275_4.anInt7232 = Static307.aClass275_4.anInt7235 + 50000;
						}
						if (Static621.aClass135_12 != Static228.aClass135_3 && (Static81.aClass135_11 != Static228.aClass135_3 || Static512.anInt8070 < 2) && (Static98.aClass275_2.method6088(Static649.aClass275_7) || Static98.aClass275_2.method6088(Static322.aClass275_5))) {
							Static341.method4980();
						}
					} else {
						return;
					}
					if (Static511.aBoolean563 && !Static498.aBoolean758 || Static118.aBoolean679) {
						try {
							Static680.method795(Static339.anApplet2, "zap");
						} catch (@Pc(1178) Throwable local1178) {
							if (Static595.aBoolean669) {
								try {
									Static339.anApplet2.getAppletContext().showDocument(new URL(Static339.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1192) Exception local1192) {
								}
							}
						}
					} else {
						try {
							Static680.method795(Static339.anApplet2, "unzap");
						} catch (@Pc(1167) Throwable local1167) {
						}
					}
					if (Static256.aClass135_4 == Static228.aClass135_3) {
						try {
							Static680.method795(Static339.anApplet2, "loggedin");
						} catch (@Pc(1203) Throwable local1203) {
						}
					}
					if (Static367.anInt10954 != 2) {
						Static474.anInt7575 = 0;
						Static302.method4386(2);
						Static391.method5472();
						Static279.method4069(7);
						Static307.aClass171_79 = null;
						return;
					}
					Static474.anInt7575 = 11;
				}
				if (Static474.anInt7575 == 11) {
					if (!Static12.aClass26_1.method741(3)) {
						return;
					}
					Static12.aClass26_1.method743(3, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
					Static474.anInt7575 = 12;
				}
				if (Static474.anInt7575 == 12) {
					local819 = Static459.aClass3_Sub4_Sub1_1;
					local819.anInt9739 = 0;
					if (local819.method337()) {
						if (!Static12.aClass26_1.method741(1)) {
							return;
						}
						Static12.aClass26_1.method743(1, local819.aByteArray90, 3);
					}
					Static307.aClass171_79 = Static344.method5007()[local819.method331()];
					Static147.anInt2709 = local819.method7951();
					Static474.anInt7575 = 10;
				}
				if (Static474.anInt7575 == 10) {
					if (Static12.aClass26_1.method741(Static147.anInt2709)) {
						Static12.aClass26_1.method743(Static147.anInt2709, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
						Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
						local163 = Static147.anInt2709;
						Static474.anInt7575 = 0;
						Static302.method4386(2);
						Static666.method8904();
						Static427.method5895(Static459.aClass3_Sub4_Sub1_1);
						Static55.anInt1158 = -1;
						if (Static523.aClass171_130 == Static307.aClass171_79) {
							Static673.method8966();
						} else {
							Static22.method529();
						}
						if (local163 != Static459.aClass3_Sub4_Sub1_1.anInt9739) {
							throw new RuntimeException("lswp pos:" + Static459.aClass3_Sub4_Sub1_1.anInt9739 + " psize:" + local163);
						}
						Static307.aClass171_79 = null;
					}
				} else if (Static474.anInt7575 == 14) {
					if (Static147.anInt2709 == -2) {
						if (!Static12.aClass26_1.method741(2)) {
							return;
						}
						Static12.aClass26_1.method743(2, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
						Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
						Static147.anInt2709 = Static459.aClass3_Sub4_Sub1_1.method7951();
					}
					if (Static12.aClass26_1.method741(Static147.anInt2709)) {
						Static12.aClass26_1.method743(Static147.anInt2709, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
						Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
						Static474.anInt7575 = 0;
						local163 = Static147.anInt2709;
						Static302.method4386(15);
						Static287.method4147();
						Static427.method5895(Static459.aClass3_Sub4_Sub1_1);
						if (local163 != Static459.aClass3_Sub4_Sub1_1.anInt9739) {
							throw new RuntimeException("lswpr pos:" + Static459.aClass3_Sub4_Sub1_1.anInt9739 + " psize:" + local163);
						}
						Static307.aClass171_79 = null;
					}
				}
			} else if (Static12.aClass26_1.method741(1)) {
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
				Static474.anInt7575 = 9;
				Static558.anInt9004 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
			}
		} catch (@Pc(1434) IOException local1434) {
			if (Static12.aClass26_1 != null) {
				Static12.aClass26_1.method746();
				Static12.aClass26_1 = null;
			}
			if (Static16.anInt10137 < 3) {
				if (Static367.anInt10954 == 2) {
					Static98.aClass275_2.method6084();
				} else {
					Static385.aClass275_6.method6084();
				}
				Static264.anInt4602 = 0;
				Static16.anInt10137++;
				Static474.anInt7575 = 1;
			} else {
				Static474.anInt7575 = 0;
				Static302.method4386(-4);
				Static359.method5202();
			}
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!nga;I)Lclient!lda;")
	public static Class205 method4143(@OriginalArg(0) Class34_Sub1_Sub1 arg0) {
		@Pc(9) Class205 local9;
		if (Static38.aClass205_2 == null) {
			local9 = new Class205();
		} else {
			local9 = Static38.aClass205_2;
			Static38.aClass205_2 = Static38.aClass205_2.aClass205_3;
			Static366.anInt6248--;
			local9.aClass205_3 = null;
		}
		local9.aClass34_Sub1_Sub1_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!gt;B)V")
	public static void method4144(@OriginalArg(0) Class34_Sub4 arg0) {
		arg0.aClass34_Sub1_Sub1_Sub2_1 = null;
		if (Static378.anInt9225 < 20) {
			Static410.aClass317_8.method6890(arg0);
			Static378.anInt9225++;
		}
	}

	@OriginalMember(owner = "client!jka", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method4145() {
		@Pc(7) String local7 = "www";
		if (Static228.aClass135_3 == Static352.aClass135_8) {
			local7 = "www-wtrc";
		} else if (Static81.aClass135_11 == Static228.aClass135_3) {
			local7 = "www-wtqa";
		} else if (Static224.aClass135_2 == Static228.aClass135_3) {
			local7 = "www-wtwip";
		}
		@Pc(34) String local34 = "";
		if (Static360.aString78 != null) {
			local34 = "/p=" + Static360.aString78;
		}
		return "http://" + local7 + "." + Static227.aClass203_4.aString69 + ".com/l=" + Static654.anInt10668 + "/a=" + Static224.anInt3866 + local34 + "/";
	}
}
