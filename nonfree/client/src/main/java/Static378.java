import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public static int anInt7010 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void method5946(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg1; local51 < arg3; local51++) {
			if ((local49 & local51) + local16 > arg2[local51]) {
				@Pc(70) int local70 = arg2[local51];
				arg2[local51] = arg2[local12];
				arg2[local12] = local70;
				@Pc(84) Object local84 = arg0[local51];
				arg0[local51] = arg0[local12];
				arg0[local12++] = local84;
			}
		}
		arg2[arg3] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method5946(arg0, arg1, arg2, local12 - 1);
		method5946(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method5947() {
		if (Static528.anInt9122 == 0 || Static528.anInt9122 == 6) {
			return;
		}
		try {
			if (++Static331.anInt6217 > 2000) {
				if (Static497.aClass173_2 != null) {
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
				}
				if (Static437.anInt7978 >= 1) {
					Static528.anInt9122 = 0;
					Static468.method7051(-5);
					return;
				}
				Static331.anInt6217 = 0;
				Static437.anInt7978++;
				Static528.anInt9122 = 1;
				if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
					Static471.aClass163_5.aBoolean339 = !Static471.aClass163_5.aBoolean339;
				} else {
					Static425.aClass163_4.aBoolean339 = !Static425.aClass163_4.aBoolean339;
				}
			}
			if (Static528.anInt9122 == 1) {
				if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
					Static16.aClass20_3 = Static531.aClass283_6.method7169(Static471.aClass163_5.aString104, Static471.aClass163_5.method3978());
				} else {
					Static16.aClass20_3 = Static531.aClass283_6.method7169(Static425.aClass163_4.aString104, Static425.aClass163_4.method3978());
				}
				Static528.anInt9122 = 2;
			}
			if (Static528.anInt9122 == 2) {
				if (Static16.aClass20_3.anInt593 == 2) {
					throw new IOException();
				}
				if (Static16.aClass20_3.anInt593 != 1) {
					return;
				}
				Static497.aClass173_2 = Static528.method7624((Socket) Static16.aClass20_3.anObject2);
				Static16.aClass20_3 = null;
				@Pc(138) long local138 = Static293.aLong149 = Static156.method2700(Static43.aString22);
				@Pc(145) int local145 = (int) (local138 >> 16 & 0x1FL);
				Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
				Static381.aClass2_Sub29_Sub2_2.method5172(Static319.aClass117_1.anInt3345);
				Static381.aClass2_Sub29_Sub2_2.method5172(local145);
				Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, 2);
				Static528.anInt9122 = 3;
			}
			@Pc(192) int local192;
			if (Static528.anInt9122 == 3) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				local192 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				if (local192 != 0) {
					Static528.anInt9122 = 0;
					Static468.method7051(local192);
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
					Static411.method6443();
					return;
				}
				Static528.anInt9122 = 4;
			}
			if (Static528.anInt9122 == 4) {
				if (!Static497.aClass173_2.method7260(8)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 8);
				Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
				Static464.aLong209 = Static70.aClass2_Sub29_Sub2_1.method5218();
				@Pc(238) Class2_Sub29 local238 = new Class2_Sub29(518);
				@Pc(241) int[] local241 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static464.aLong209 >> 32), (int) Static464.aLong209 };
				local238.method5172(10);
				local238.method5185(local241[0]);
				local238.method5185(local241[1]);
				local238.method5185(local241[2]);
				local238.method5185(local241[3]);
				local238.method5192(Static156.method2700(Static43.aString22));
				local238.method5189(Static454.aString170);
				local238.method5192(Static205.aLong104);
				local238.method5192(Static260.aLong126);
				local238.method5195(Static509.aBigInteger6, Static285.aBigInteger5);
				@Pc(320) Class2_Sub29_Sub2 local320 = Static381.aClass2_Sub29_Sub2_2;
				local320.anInt6132 = 0;
				@Pc(351) int local351;
				if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
					if (Static271.anInt8654 == 12) {
						local320.method5172(Static319.aClass117_5.anInt3345);
					} else {
						local320.method5172(Static319.aClass117_3.anInt3345);
					}
					local320.method5217(0);
					local351 = local320.anInt6132;
					local320.method5185(607);
					local320.method5172(Static456.anInt8316);
					local320.method5172(Static181.method3002());
					local320.method5217(Static461.anInt8348);
					local320.method5217(Static223.anInt3996);
					local320.method5172(Static281.aClass2_Sub19_Sub1_1.anInt2192);
					Static135.method2426(local320);
					local320.method5189(Static530.aString206);
					local320.method5185(Static224.anInt4041);
					@Pc(394) Class2_Sub29 local394 = new Class2_Sub29(Static26.method600());
					Static281.aClass2_Sub19_Sub1_1.method2139(local394);
					local320.method5172(local394.anInt6132);
					local320.method5221(local394.anInt6132, local394.aByteArray96);
					Static210.aBoolean299 = true;
					@Pc(419) Class2_Sub29 local419 = new Class2_Sub29(Static389.method6244());
					(new Class2_Sub41(true, Static531.aClass283_6)).method6569(local419);
					local320.method5221(local419.aByteArray96.length, local419.aByteArray96);
					local320.method5217(Static199.anInt3587);
					Static535.method6661();
					local320.method5221(local238.anInt6132, local238.aByteArray96);
					local320.method5208(local320.anInt6132 - local351);
				} else {
					local320.method5172(Static319.aClass117_6.anInt3345);
					local320.method5217(0);
					local351 = local320.anInt6132;
					local320.method5185(607);
					local320.method5172(Static185.aClass212_1.anInt6307);
					local320.method5172(Static172.anInt6352);
					Static135.method2426(local320);
					local320.method5189(Static530.aString206);
					local320.method5185(Static224.anInt4041);
					Static535.method6661();
					local320.method5221(local238.anInt6132, local238.aByteArray96);
					local320.method5208(local320.anInt6132 - local351);
				}
				Static497.aClass173_2.method7257(local320.aByteArray96, local320.anInt6132);
				local320.method5243(local241);
				for (local351 = 0; local351 < 4; local351++) {
					local241[local351] += 50;
				}
				Static70.aClass2_Sub29_Sub2_1.method5243(local241);
				Static528.anInt9122 = 5;
			}
			if (Static528.anInt9122 == 5) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				local192 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				if (local192 == 21) {
					Static528.anInt9122 = 8;
				} else if (local192 == 29) {
					Static528.anInt9122 = 14;
				} else if (local192 == 1) {
					Static528.anInt9122 = 6;
					Static468.method7051(local192);
					return;
				} else if (local192 == 2) {
					Static528.anInt9122 = 9;
				} else if (local192 == 15) {
					Static472.anInt8247 = -2;
					Static528.anInt9122 = 15;
				} else if (local192 == 23 && Static437.anInt7978 < 1) {
					Static331.anInt6217 = 0;
					Static528.anInt9122 = 1;
					Static437.anInt7978++;
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
					return;
				} else {
					Static528.anInt9122 = 0;
					Static468.method7051(local192);
					Static497.aClass173_2.method7261();
					Static497.aClass173_2 = null;
					Static411.method6443();
					return;
				}
			}
			if (Static528.anInt9122 == 7) {
				Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
				Static381.aClass2_Sub29_Sub2_2.method5237(Static319.aClass117_13.anInt3345);
				Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, Static381.aClass2_Sub29_Sub2_2.anInt6132);
				Static528.anInt9122 = 5;
				return;
			}
			if (Static528.anInt9122 == 8) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				local192 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				Static273.anInt4975 = local192 * 60 + 180;
				Static528.anInt9122 = 0;
				Static468.method7051(21);
				Static497.aClass173_2.method7261();
				Static497.aClass173_2 = null;
				Static411.method6443();
				return;
			}
			if (Static528.anInt9122 == 14) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				Static13.anInt295 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				Static528.anInt9122 = 0;
				Static468.method7051(29);
				Static497.aClass173_2.method7261();
				Static497.aClass173_2 = null;
				Static411.method6443();
				return;
			}
			if (Static528.anInt9122 == 9) {
				if (!Static497.aClass173_2.method7260(1)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 1);
				Static248.anInt4541 = Static70.aClass2_Sub29_Sub2_1.aByteArray96[0] & 0xFF;
				Static528.anInt9122 = 10;
				return;
			}
			@Pc(798) Class2_Sub29_Sub2 local798;
			if (Static528.anInt9122 == 10) {
				if (Static86.anInt1765 == 3) {
					Static278.aBoolean388 = true;
				} else {
					Static278.aBoolean388 = false;
				}
				local798 = Static70.aClass2_Sub29_Sub2_1;
				if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
					if (!Static497.aClass173_2.method7260(Static248.anInt4541)) {
						return;
					}
					Static497.aClass173_2.method7262(0, local798.aByteArray96, Static248.anInt4541);
					local798.anInt6132 = 0;
					Static475.anInt8486 = local798.method5170();
					Static531.anInt9252 = local798.method5170();
					Static89.aBoolean131 = local798.method5170() == 1;
					Static100.aBoolean147 = local798.method5170() == 1;
					Static8.aBoolean19 = local798.method5170() == 1;
					Static391.aBoolean559 = local798.method5170() == 1;
					Static174.anInt3154 = local798.method5229();
					Static415.aBoolean571 = local798.method5170() == 1;
					Static349.anInt6441 = local798.method5216();
					Static165.aBoolean245 = local798.method5170() == 1;
					if (Static86.anInt1765 == 3) {
						@Pc(917) boolean local917 = local798.method5170() == 1;
						if (local917) {
							@Pc(923) long local923 = local798.method5218();
							@Pc(927) String local927 = Static404.method6383(local923);
							@Pc(931) int local931 = local798.method5170();
							@Pc(934) byte[] local934 = new byte[local931];
							local798.method5238(local934, local931);
							@Pc(944) String local944 = Static414.method7236(local934);
							@Pc(946) Class133 local946 = null;
							try {
								@Pc(952) Class20 local952 = Static531.aClass283_6.method7180("3", false);
								while (local952.anInt593 == 0) {
									Static379.method5233(1L);
								}
								if (local952.anInt593 == 1) {
									local946 = (Class133) local952.anObject2;
									@Pc(986) int local986 = local927.length() + local944.length() + 2 + 2 + 3 + 4;
									if (local986 > 50) {
										throw new RuntimeException(">50");
									}
									@Pc(1003) Class2_Sub29 local1003 = new Class2_Sub29(local986 + 1);
									local1003.method5172(local986);
									local1003.method5172(1);
									local1003.method5234(local927);
									local1003.method5234(local944);
									local1003.method5217(Static224.anInt4041);
									local1003.method5200();
									local946.method3307(0, local1003.anInt6132, local1003.aByteArray96);
								}
							} catch (@Pc(1037) Exception local1037) {
							}
							try {
								if (local946 != null) {
									local946.method3306();
								}
							} catch (@Pc(1044) Exception local1044) {
							}
							try {
								Static559.method6631("demoaccountcreated", Static531.aClass283_6.anApplet1);
							} catch (@Pc(1052) Throwable local1052) {
							}
						}
					}
					Static505.aClass206_4.method5331(Static165.aBoolean245);
					Static464.aClass115_1.method2975(Static165.aBoolean245);
					Static21.aClass255_2.method6586(Static165.aBoolean245);
				} else if (Static497.aClass173_2.method7260(Static248.anInt4541)) {
					Static497.aClass173_2.method7262(0, local798.aByteArray96, Static248.anInt4541);
					local798.anInt6132 = 0;
					Static475.anInt8486 = local798.method5170();
					Static531.anInt9252 = local798.method5170();
					Static89.aBoolean131 = local798.method5170() == 1;
					Static100.aBoolean147 = local798.method5170() == 1;
					Static8.aBoolean19 = local798.method5170() == 1;
					Static24.anInt486 = local798.method5229();
					Static415.aBoolean571 = Static24.anInt486 > 0;
					Static429.anInt7992 = local798.method5229();
					Static97.anInt1929 = local798.method5229();
					Static115.anInt2320 = local798.method5229();
					Static485.anInt8594 = local798.method5198();
					Static17.aClass20_4 = Static531.aClass283_6.method7174(Static485.anInt8594);
					Static465.anInt8381 = local798.method5170();
					Static110.anInt2150 = local798.method5229();
					Static415.anInt7715 = local798.method5229();
					Static259.aBoolean198 = local798.method5170() == 1;
					Static266.aClass1_Sub1_Sub2_Sub1_1.aString83 = Static266.aClass1_Sub1_Sub2_Sub1_1.aString82 = local798.method5176();
					Static534.aClass163_7 = new Class163();
					Static534.aClass163_7.anInt4593 = local798.method5229();
					if (Static534.aClass163_7.anInt4593 == 65535) {
						Static534.aClass163_7.anInt4593 = -1;
					}
					Static534.aClass163_7.aString104 = local798.method5176();
					if (Static414.aClass320_17 != Static455.aClass320_15) {
						Static534.aClass163_7.anInt4588 = Static534.aClass163_7.anInt4593 + 40000;
						Static534.aClass163_7.anInt4591 = Static534.aClass163_7.anInt4593 + 50000;
					}
					if (Static414.aClass320_17 != Static117.aClass320_1 && (Static471.aClass163_5.method3982(Static217.aClass163_3) || Static471.aClass163_5.method3982(Static530.aClass163_6))) {
						Static131.method2412();
					}
				} else {
					return;
				}
				if (Static89.aBoolean131 && !Static8.aBoolean19 || Static415.aBoolean571) {
					try {
						Static559.method6631("zap", Static531.aClass283_6.anApplet1);
					} catch (@Pc(1248) Throwable local1248) {
						if (Static502.aBoolean638) {
							try {
								Static531.aClass283_6.anApplet1.getAppletContext().showDocument(new URL(Static531.aClass283_6.anApplet1.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(1264) Exception local1264) {
							}
						}
					}
				} else {
					try {
						Static559.method6631("unzap", Static531.aClass283_6.anApplet1);
					} catch (@Pc(1274) Throwable local1274) {
					}
				}
				if (Static455.aClass320_15 == Static414.aClass320_17) {
					try {
						Static559.method6631("loggedin", Static531.aClass283_6.anApplet1);
					} catch (@Pc(1286) Throwable local1286) {
					}
				}
				if (Static86.anInt1765 != 2 && Static86.anInt1765 != 3) {
					Static528.anInt9122 = 0;
					Static468.method7051(2);
					Static117.method2256();
					Static301.method4738(6);
					Static91.aClass239_38 = null;
					return;
				}
				Static528.anInt9122 = 12;
			}
			if (Static528.anInt9122 == 12) {
				if (!Static497.aClass173_2.method7260(3)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 3);
				Static528.anInt9122 = 13;
			}
			if (Static528.anInt9122 == 13) {
				local798 = Static70.aClass2_Sub29_Sub2_1;
				local798.anInt6132 = 0;
				if (local798.method5247()) {
					if (!Static497.aClass173_2.method7260(1)) {
						return;
					}
					Static497.aClass173_2.method7262(3, local798.aByteArray96, 1);
				}
				Static91.aClass239_38 = Static55.method1026()[local798.method5242()];
				Static472.anInt8247 = local798.method5229();
				Static528.anInt9122 = 11;
			}
			if (Static528.anInt9122 == 11) {
				if (!Static497.aClass173_2.method7260(Static472.anInt8247)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, Static472.anInt8247);
				Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
				local192 = Static472.anInt8247;
				Static528.anInt9122 = 0;
				Static468.method7051(2);
				Static191.method6946();
				Static364.method5844(Static70.aClass2_Sub29_Sub2_1);
				Static367.anInt6894 = -1;
				Static47.method853();
				if (local192 != Static70.aClass2_Sub29_Sub2_1.anInt6132) {
					throw new RuntimeException("lswp pos:" + Static70.aClass2_Sub29_Sub2_1.anInt6132 + " psize:" + local192);
				}
				Static91.aClass239_38 = null;
				return;
			}
			if (Static528.anInt9122 == 15) {
				if (Static472.anInt8247 == -2) {
					if (!Static497.aClass173_2.method7260(2)) {
						return;
					}
					Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, 2);
					Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
					Static472.anInt8247 = Static70.aClass2_Sub29_Sub2_1.method5229();
				}
				if (!Static497.aClass173_2.method7260(Static472.anInt8247)) {
					return;
				}
				Static497.aClass173_2.method7262(0, Static70.aClass2_Sub29_Sub2_1.aByteArray96, Static472.anInt8247);
				Static70.aClass2_Sub29_Sub2_1.anInt6132 = 0;
				Static528.anInt9122 = 0;
				local192 = Static472.anInt8247;
				Static468.method7051(15);
				Static179.method2978();
				Static364.method5844(Static70.aClass2_Sub29_Sub2_1);
				if (Static70.aClass2_Sub29_Sub2_1.anInt6132 != local192) {
					throw new RuntimeException("lswpr pos:" + Static70.aClass2_Sub29_Sub2_1.anInt6132 + " psize:" + local192);
				}
				Static91.aClass239_38 = null;
				return;
			}
		} catch (@Pc(1515) IOException local1515) {
			if (Static497.aClass173_2 != null) {
				Static497.aClass173_2.method7261();
				Static497.aClass173_2 = null;
			}
			if (Static437.anInt7978 >= 1) {
				Static528.anInt9122 = 0;
				Static468.method7051(-4);
				Static411.method6443();
			} else {
				if (Static86.anInt1765 == 2 || Static86.anInt1765 == 3) {
					Static471.aClass163_5.aBoolean339 = !Static471.aClass163_5.aBoolean339;
				} else {
					Static425.aClass163_4.aBoolean339 = !Static425.aClass163_4.aBoolean339;
				}
				Static437.anInt7978++;
				Static331.anInt6217 = 0;
				Static528.anInt9122 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
	public static boolean method5949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static311.method4814(arg0, arg1) || Static154.method2641(arg1, arg0);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	public static void method5953() {
		Static306.aClass72_1.method6795();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static166.aLongArray8[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static518.aLongArray15[local22] = 0L;
		}
		Static113.anInt2307 = 0;
	}
}
