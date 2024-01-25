import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!oia;I[B)Lclient!ll;")
	public static Class228 method2737(@OriginalArg(1) Class16_Sub1_Sub2 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static217.anIntArray273, 0);
		if (Static217.anIntArray273[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class228(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!cn;)V")
	public static void method2738(@OriginalArg(0) Class23_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class23_Sub2 local7 = null;
			for (@Pc(11) Class23_Sub2 local11 = Static249.aClass23_Sub2Array2[local4]; local11 != null; local11 = local11.aClass23_Sub2_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static249.aClass23_Sub2Array2[local4] = local11.aClass23_Sub2_23;
					} else {
						local7.aClass23_Sub2_23 = local11.aClass23_Sub2_23;
					}
					Static674.aBoolean763 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class23_Sub2 local43 = Static496.aClass23_Sub2Array3[local4]; local43 != null; local43 = local43.aClass23_Sub2_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static496.aClass23_Sub2Array3[local4] = local43.aClass23_Sub2_23;
					} else {
						local7.aClass23_Sub2_23 = local43.aClass23_Sub2_23;
					}
					Static674.aBoolean763 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class23_Sub2 local75 = Static188.aClass23_Sub2Array1[local4]; local75 != null; local75 = local75.aClass23_Sub2_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static188.aClass23_Sub2Array1[local4] = local75.aClass23_Sub2_23;
					} else {
						local7.aClass23_Sub2_23 = local75.aClass23_Sub2_23;
					}
					Static674.aBoolean763 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method2739() {
		if (Static216.anInt3999 == 0 || Static216.anInt3999 == 5) {
			return;
		}
		try {
			@Pc(17) short local17;
			if (Static72.anInt1667 == 0) {
				local17 = 250;
			} else {
				local17 = 2000;
			}
			if (++Static454.anInt7767 > local17) {
				if (Static673.aClass160_3 != null) {
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
				}
				if (Static72.anInt1667 >= 3) {
					Static216.anInt3999 = 0;
					Static582.method7836(-5);
					return;
				}
				if (Static490.anInt8296 == 2) {
					Static605.aClass161_7.method3709();
				} else {
					Static368.aClass161_4.method3709();
				}
				Static72.anInt1667++;
				Static216.anInt3999 = 1;
				Static454.anInt7767 = 0;
			}
			if (Static216.anInt3999 == 1) {
				if (Static490.anInt8296 == 2) {
					Static112.aClass129_4 = Static605.aClass161_7.method3706(Static499.aClass231_4);
				} else {
					Static112.aClass129_4 = Static368.aClass161_4.method3706(Static499.aClass231_4);
				}
				Static216.anInt3999 = 2;
			}
			@Pc(119) Class3_Sub44 local119;
			if (Static216.anInt3999 == 2) {
				if (Static112.aClass129_4.anInt3299 == 2) {
					throw new IOException();
				}
				if (Static112.aClass129_4.anInt3299 != 1) {
					return;
				}
				Static673.aClass160_3 = Static437.method6389((Socket) Static112.aClass129_4.anObject7);
				Static112.aClass129_4 = null;
				Static254.method4038();
				local119 = Static17.method714();
				local119.aClass3_Sub17_Sub2_3.method4849(Static97.aClass326_1.anInt8904);
				Static616.method8089(local119);
				Static73.method1618();
				Static216.anInt3999 = 3;
			}
			@Pc(160) int local160;
			if (Static216.anInt3999 == 3) {
				if (!Static673.aClass160_3.method3510(1)) {
					return;
				}
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
				local160 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
				if (local160 != 0) {
					Static216.anInt3999 = 0;
					Static582.method7836(local160);
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
					Static107.method2069();
					return;
				}
				Static67.aClass3_Sub17_Sub2_4.lb = 0;
				@Pc(183) Class3_Sub17 local183 = new Class3_Sub17(518);
				@Pc(186) int[] local186 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local183.method4849(10);
				local183.method4854(local186[0]);
				local183.method4854(local186[1]);
				local183.method4854(local186[2]);
				local183.method4854(local186[3]);
				local183.method4889(0L);
				local183.method4878(Static33.aString9);
				local183.method4889(Static222.aLong106);
				local183.method4889(Static382.aLong181);
				local183.method4882(Static546.aBigInteger5, Static192.aBigInteger1);
				Static254.method4038();
				@Pc(268) Class3_Sub44 local268 = Static17.method714();
				@Pc(271) Class3_Sub17_Sub2 local271 = local268.aClass3_Sub17_Sub2_3;
				@Pc(300) int local300;
				@Pc(315) int local315;
				if (Static490.anInt8296 == 2) {
					if (Static520.anInt6836 == 13) {
						local271.method4849(Static97.aClass326_5.anInt8904);
					} else {
						local271.method4849(Static97.aClass326_3.anInt8904);
					}
					local271.method4876(0);
					local300 = local271.lb;
					local271.method4854(642);
					local271.method4838(0, local183.lb, local183.aByteArray59);
					local315 = local271.lb;
					local271.method4878(Static69.aString16);
					local271.method4849(Static558.anInt8991);
					local271.method4849(Static545.method7549());
					local271.method4876(Static654.anInt10064);
					local271.method4876(Static483.anInt8181);
					local271.method4849(Static227.aClass3_Sub15_11.aClass17_Sub17_2.method5808());
					Static476.method6822(local271);
					local271.method4878(Static605.aString120);
					local271.method4854(Static88.anInt1933);
					@Pc(358) Class3_Sub17 local358 = Static227.aClass3_Sub15_11.method2435();
					local271.method4849(local358.lb);
					local271.method4838(0, local358.lb, local358.aByteArray59);
					Static411.aBoolean527 = true;
					@Pc(384) Class3_Sub17 local384 = new Class3_Sub17(Static447.aClass3_Sub34_1.method5458());
					Static447.aClass3_Sub34_1.method5456(local384);
					local271.method4838(0, local384.aByteArray59.length, local384.aByteArray59);
					local271.method4876(Static154.anInt2874);
					local271.method4889(Static450.aLong222);
					local271.method4849(Static637.aString125 == null ? 0 : 1);
					if (Static637.aString125 != null) {
						local271.method4878(Static637.aString125);
					}
					local271.method4849(Static143.method2460("jagtheora") ? 1 : 0);
					local271.method4849(Static133.aBoolean207 ? 1 : 0);
					Static475.method7529(local271);
					local271.method4863(local315, local271.lb, local186);
					local271.method4855(local271.lb - local300);
				} else {
					local271.method4849(Static97.aClass326_6.anInt8904);
					local271.method4876(0);
					local300 = local271.lb;
					local271.method4854(642);
					local271.method4838(0, local183.lb, local183.aByteArray59);
					local315 = local271.lb;
					local271.method4878(Static69.aString16);
					local271.method4849(Static102.aClass181_38.anInt4848);
					local271.method4849(Static319.anInt5939);
					Static476.method6822(local271);
					local271.method4878(Static605.aString120);
					local271.method4854(Static88.anInt1933);
					Static475.method7529(local271);
					local271.method4863(local315, local271.lb, local186);
					local271.method4855(local271.lb - local300);
				}
				Static616.method8089(local268);
				Static73.method1618();
				Static540.aClass282_4 = new Class282(local186);
				for (local300 = 0; local300 < 4; local300++) {
					local186[local300] += 50;
				}
				Static67.aClass3_Sub17_Sub2_4.method4907(local186);
				Static216.anInt3999 = 4;
			}
			if (Static216.anInt3999 == 4) {
				if (!Static673.aClass160_3.method3510(1)) {
					return;
				}
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
				local160 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
				if (local160 == 21) {
					Static216.anInt3999 = 7;
				} else if (local160 == 29) {
					Static216.anInt3999 = 13;
				} else if (local160 == 1) {
					Static216.anInt3999 = 5;
					Static582.method7836(local160);
					return;
				} else if (local160 == 2) {
					Static216.anInt3999 = 8;
				} else if (local160 == 15) {
					Static216.anInt3999 = 14;
					Static548.anInt8905 = -2;
				} else if (local160 == 23 && Static72.anInt1667 < 3) {
					Static72.anInt1667++;
					Static216.anInt3999 = 1;
					Static454.anInt7767 = 0;
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
					return;
				} else {
					Static216.anInt3999 = 0;
					Static582.method7836(local160);
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
					Static107.method2069();
					return;
				}
			}
			if (Static216.anInt3999 == 6) {
				Static254.method4038();
				local119 = Static17.method714();
				@Pc(680) Class3_Sub17_Sub2 local680 = local119.aClass3_Sub17_Sub2_3;
				local680.method4898(Static540.aClass282_4);
				local680.method4899(Static97.aClass326_10.anInt8904);
				Static616.method8089(local119);
				Static73.method1618();
				Static216.anInt3999 = 4;
			} else if (Static216.anInt3999 == 7) {
				if (Static673.aClass160_3.method3510(1)) {
					Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
					local160 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
					Static216.anInt3999 = 0;
					Static568.anInt9067 = local160 * 50;
					Static582.method7836(21);
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
					Static107.method2069();
				}
			} else if (Static216.anInt3999 == 13) {
				if (Static673.aClass160_3.method3510(1)) {
					Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
					Static680.anInt10366 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
					Static216.anInt3999 = 0;
					Static582.method7836(29);
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
					Static107.method2069();
				}
			} else if (Static216.anInt3999 != 8) {
				@Pc(817) Class3_Sub17_Sub2 local817;
				if (Static216.anInt3999 == 9) {
					local817 = Static67.aClass3_Sub17_Sub2_4;
					if (Static490.anInt8296 == 2) {
						if (!Static673.aClass160_3.method3510(Static668.anInt10266)) {
							return;
						}
						Static673.aClass160_3.method3511(Static668.anInt10266, local817.aByteArray59, 0);
						local817.lb = 0;
						Static13.anInt164 = local817.method4888();
						Static314.anInt5879 = local817.method4888();
						Static120.aBoolean200 = local817.method4888() == 1;
						Static576.aBoolean681 = local817.method4888() == 1;
						Static435.aBoolean581 = local817.method4888() == 1;
						Static294.aBoolean272 = local817.method4888() == 1;
						Static251.anInt4687 = local817.method4858();
						Static127.aBoolean203 = local817.method4888() == 1;
						Static133.anInt2489 = local817.method4864();
						Static375.aBoolean505 = local817.method4888() == 1;
						Static349.aClass374_2.method8351(Static375.aBoolean505);
						Static237.aClass371_2.method8315(Static375.aBoolean505);
						Static481.aClass241_2.method5576(Static375.aBoolean505);
					} else if (Static673.aClass160_3.method3510(Static668.anInt10266)) {
						Static673.aClass160_3.method3511(Static668.anInt10266, local817.aByteArray59, 0);
						local817.lb = 0;
						Static13.anInt164 = local817.method4888();
						Static314.anInt5879 = local817.method4888();
						Static120.aBoolean200 = local817.method4888() == 1;
						Static576.aBoolean681 = local817.method4888() == 1;
						Static435.aBoolean581 = local817.method4888() == 1;
						Static420.aLong204 = local817.method4865();
						@Pc(995) int local995 = local817.method4888();
						Static280.aBoolean408 = (local995 & 0x2) != 0;
						Static127.aBoolean203 = (local995 & 0x1) != 0;
						Static264.anInt4945 = local817.method4868();
						Static182.anInt3397 = local817.method4858();
						Static79.anInt1762 = local817.method4858();
						Static584.anInt9269 = local817.method4858();
						Static296.anInt8196 = local817.method4868();
						Static216.aClass129_7 = Static499.aClass231_4.method5288(Static296.anInt8196);
						Static179.anInt3370 = local817.method4888();
						Static658.anInt10081 = local817.method4858();
						Static566.anInt5236 = local817.method4858();
						Static121.aBoolean201 = local817.method4888() == 1;
						Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString33 = Static409.aString93 = local817.method4890();
						Static111.anInt10351 = local817.method4888();
						Static104.anInt2201 = local817.method4868();
						Static364.aBoolean496 = local817.method4888() == 1;
						Static429.aClass161_5 = new Class161();
						Static429.aClass161_5.anInt4423 = local817.method4858();
						if (Static429.aClass161_5.anInt4423 == 65535) {
							Static429.aClass161_5.anInt4423 = -1;
						}
						Static429.aClass161_5.aString54 = local817.method4890();
						if (Static216.aClass309_6 != Static229.aClass309_8) {
							Static429.aClass161_5.anInt4422 = Static429.aClass161_5.anInt4423 + 50000;
							Static429.aClass161_5.anInt4421 = Static429.aClass161_5.anInt4423 + 40000;
						}
						if (Static312.aClass309_7 != Static229.aClass309_8 && (Static625.aClass309_9 != Static229.aClass309_8 || Static13.anInt164 < 2) && (Static605.aClass161_7.method3707(Static110.aClass161_1) || Static605.aClass161_7.method3707(Static336.aClass161_6))) {
							Static98.method1957();
						}
					} else {
						return;
					}
					if (Static120.aBoolean200 && !Static435.aBoolean581 || Static127.aBoolean203) {
						try {
							Static685.method3974(Static287.anApplet2, "zap");
						} catch (@Pc(1174) Throwable local1174) {
							if (Static458.aBoolean593) {
								try {
									Static287.anApplet2.getAppletContext().showDocument(new URL(Static287.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1188) Exception local1188) {
								}
							}
						}
					} else {
						try {
							Static685.method3974(Static287.anApplet2, "unzap");
						} catch (@Pc(1165) Throwable local1165) {
						}
					}
					if (Static229.aClass309_8 == Static216.aClass309_6) {
						try {
							Static685.method3974(Static287.anApplet2, "loggedin");
						} catch (@Pc(1199) Throwable local1199) {
						}
					}
					if (Static490.anInt8296 != 2) {
						Static216.anInt3999 = 0;
						Static582.method7836(2);
						Static126.method2226();
						Static482.method6863(7);
						Static39.aClass126_16 = null;
						return;
					}
					Static216.anInt3999 = 11;
				}
				if (Static216.anInt3999 == 11) {
					if (!Static673.aClass160_3.method3510(3)) {
						return;
					}
					Static673.aClass160_3.method3511(3, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
					Static216.anInt3999 = 12;
				}
				if (Static216.anInt3999 == 12) {
					local817 = Static67.aClass3_Sub17_Sub2_4;
					local817.lb = 0;
					if (local817.method4903()) {
						if (!Static673.aClass160_3.method3510(1)) {
							return;
						}
						Static673.aClass160_3.method3511(1, local817.aByteArray59, 3);
					}
					Static39.aClass126_16 = Static4.method48()[local817.method4900()];
					Static548.anInt8905 = local817.method4858();
					Static216.anInt3999 = 10;
				}
				if (Static216.anInt3999 == 10) {
					if (Static673.aClass160_3.method3510(Static548.anInt8905)) {
						Static673.aClass160_3.method3511(Static548.anInt8905, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
						Static67.aClass3_Sub17_Sub2_4.lb = 0;
						Static216.anInt3999 = 0;
						local160 = Static548.anInt8905;
						Static582.method7836(2);
						Static199.method8739();
						Static388.method5653(Static67.aClass3_Sub17_Sub2_4);
						Static660.anInt10217 = -1;
						if (Static505.aClass126_166 == Static39.aClass126_16) {
							Static92.method1873();
						} else {
							Static44.method1231();
						}
						if (Static67.aClass3_Sub17_Sub2_4.lb != local160) {
							throw new RuntimeException("lswp pos:" + Static67.aClass3_Sub17_Sub2_4.lb + " psize:" + local160);
						}
						Static39.aClass126_16 = null;
					}
				} else if (Static216.anInt3999 == 14) {
					if (Static548.anInt8905 == -2) {
						if (!Static673.aClass160_3.method3510(2)) {
							return;
						}
						Static673.aClass160_3.method3511(2, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
						Static67.aClass3_Sub17_Sub2_4.lb = 0;
						Static548.anInt8905 = Static67.aClass3_Sub17_Sub2_4.method4858();
					}
					if (Static673.aClass160_3.method3510(Static548.anInt8905)) {
						Static673.aClass160_3.method3511(Static548.anInt8905, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
						Static67.aClass3_Sub17_Sub2_4.lb = 0;
						local160 = Static548.anInt8905;
						Static216.anInt3999 = 0;
						Static582.method7836(15);
						Static488.method7007();
						Static388.method5653(Static67.aClass3_Sub17_Sub2_4);
						if (Static67.aClass3_Sub17_Sub2_4.lb != local160) {
							throw new RuntimeException("lswpr pos:" + Static67.aClass3_Sub17_Sub2_4.lb + " psize:" + local160);
						}
						Static39.aClass126_16 = null;
					}
				}
			} else if (Static673.aClass160_3.method3510(1)) {
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
				Static216.anInt3999 = 9;
				Static668.anInt10266 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
			}
		} catch (@Pc(1436) IOException local1436) {
			if (Static673.aClass160_3 != null) {
				Static673.aClass160_3.method3506();
				Static673.aClass160_3 = null;
			}
			if (Static72.anInt1667 >= 3) {
				Static216.anInt3999 = 0;
				Static582.method7836(-4);
				Static107.method2069();
			} else {
				if (Static490.anInt8296 == 2) {
					Static605.aClass161_7.method3709();
				} else {
					Static368.aClass161_4.method3709();
				}
				Static72.anInt1667++;
				Static216.anInt3999 = 1;
				Static454.anInt7767 = 0;
			}
		}
	}
}
