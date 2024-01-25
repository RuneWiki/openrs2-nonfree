import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!ah;")
	public static Class2_Sub5 aClass2_Sub5_48;

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_31;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public static int anInt10094 = 64;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_131 = new Class179(0, -1);

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_87 = new Class32(8);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[FB)[F")
	public static float[] method8396(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static653.method5396(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
	public static void method8407() {
		if (Static324.anInt5144 == 0 || Static324.anInt5144 == 5) {
			return;
		}
		try {
			@Pc(18) short local18;
			if (Static497.anInt8119 == 0) {
				local18 = 250;
			} else {
				local18 = 2000;
			}
			if (local18 < ++Static512.anInt8553) {
				if (Static155.aClass121_2 != null) {
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
				}
				if (Static497.anInt8119 >= 3) {
					Static324.anInt5144 = 0;
					Static63.method8324(-5);
					return;
				}
				if (Static507.anInt8408 == 2) {
					Static216.aClass326_9.method7370();
				} else {
					Static390.aClass326_8.method7370();
				}
				Static497.anInt8119++;
				Static512.anInt8553 = 0;
				Static324.anInt5144 = 1;
			}
			if (Static324.anInt5144 == 1) {
				if (Static507.anInt8408 == 2) {
					Static563.aClass108_8 = Static216.aClass326_9.method7373(Static452.aClass226_6);
				} else {
					Static563.aClass108_8 = Static390.aClass326_8.method7373(Static452.aClass226_6);
				}
				Static324.anInt5144 = 2;
			}
			@Pc(121) Class2_Sub40 local121;
			if (Static324.anInt5144 == 2) {
				if (Static563.aClass108_8.anInt2766 == 2) {
					throw new IOException();
				}
				if (Static563.aClass108_8.anInt2766 != 1) {
					return;
				}
				Static155.aClass121_2 = Static592.method8037((Socket) Static563.aClass108_8.anObject6);
				Static563.aClass108_8 = null;
				Static166.method1420();
				local121 = Static123.method1776();
				local121.aClass2_Sub22_Sub2_2.method8537(Static582.aClass314_1.anInt8556);
				Static528.method7295(local121);
				Static124.method1779();
				Static324.anInt5144 = 3;
			}
			@Pc(160) int local160;
			if (Static324.anInt5144 == 3) {
				if (!Static155.aClass121_2.method2934(1)) {
					return;
				}
				Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				local160 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
				if (local160 != 0) {
					Static324.anInt5144 = 0;
					Static63.method8324(local160);
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
					Static582.method7926();
					return;
				}
				Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
				@Pc(186) Class2_Sub22 local186 = new Class2_Sub22(518);
				@Pc(189) int[] local189 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				local186.method8537(10);
				local186.method8552(local189[0]);
				local186.method8552(local189[1]);
				local186.method8552(local189[2]);
				local186.method8552(local189[3]);
				local186.method8509(0L);
				local186.method8540(Static91.aString17);
				local186.method8509(Static630.aLong277);
				local186.method8509(Static298.aLong133);
				local186.method8493(Static475.aBigInteger6, Static171.aBigInteger3);
				Static166.method1420();
				@Pc(271) Class2_Sub40 local271 = Static123.method1776();
				@Pc(274) Class2_Sub22_Sub2 local274 = local271.aClass2_Sub22_Sub2_2;
				@Pc(303) int local303;
				@Pc(318) int local318;
				if (Static507.anInt8408 == 2) {
					if (Static324.anInt5145 == 13) {
						local274.method8537(Static582.aClass314_5.anInt8556);
					} else {
						local274.method8537(Static582.aClass314_3.anInt8556);
					}
					local274.method8500(0);
					local303 = local274.anInt10247;
					local274.method8552(631);
					local274.method8508(0, local186.anInt10247, local186.aByteArray115);
					local318 = local274.anInt10247;
					local274.method8540(Static34.aString8);
					local274.method8537(Static500.anInt8131);
					local274.method8537(Static626.method8388());
					local274.method8500(Static511.anInt8548);
					local274.method8500(Static153.anInt2747);
					local274.method8537(aClass2_Sub5_48.aClass6_Sub11_2.method3433());
					Static316.method4248(local274);
					local274.method8540(Static377.aString78);
					local274.method8552(Static380.anInt5916);
					@Pc(361) Class2_Sub22 local361 = aClass2_Sub5_48.method178();
					local274.method8537(local361.anInt10247);
					local274.method8508(0, local361.anInt10247, local361.aByteArray115);
					Static266.aBoolean292 = true;
					@Pc(383) Class2_Sub22 local383 = new Class2_Sub22(Static446.aClass2_Sub34_2.method5127());
					Static446.aClass2_Sub34_2.method5123(local383);
					local274.method8508(0, local383.aByteArray115.length, local383.aByteArray115);
					local274.method8500(Static372.anInt5855);
					local274.method8509(Static528.aLong234);
					local274.method8537(Static322.aString56 == null ? 0 : 1);
					if (Static322.aString56 != null) {
						local274.method8540(Static322.aString56);
					}
					local274.method8537(Static630.method8442("jagtheora") ? 1 : 0);
					Static613.method8241(local274);
					local274.method8550(local189, local274.anInt10247, local318);
					local274.method8517(local274.anInt10247 - local303);
				} else {
					local274.method8537(Static582.aClass314_6.anInt8556);
					local274.method8500(0);
					local303 = local274.anInt10247;
					local274.method8552(631);
					local274.method8508(0, local186.anInt10247, local186.aByteArray115);
					local318 = local274.anInt10247;
					local274.method8540(Static34.aString8);
					local274.method8537(Static189.aClass375_5.anInt10144);
					local274.method8537(Static483.anInt7694);
					Static316.method4248(local274);
					local274.method8540(Static377.aString78);
					local274.method8552(Static380.anInt5916);
					Static613.method8241(local274);
					local274.method8550(local189, local274.anInt10247, local318);
					local274.method8517(local274.anInt10247 - local303);
				}
				Static528.method7295(local271);
				Static124.method1779();
				Static251.aClass131_1 = new Class131(local189);
				for (local303 = 0; local303 < 4; local303++) {
					local189[local303] += 50;
				}
				Static53.aClass2_Sub22_Sub2_1.method8557(local189);
				Static324.anInt5144 = 4;
			}
			if (Static324.anInt5144 == 4) {
				if (!Static155.aClass121_2.method2934(1)) {
					return;
				}
				Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				local160 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
				if (local160 == 21) {
					Static324.anInt5144 = 7;
				} else if (local160 == 29) {
					Static324.anInt5144 = 13;
				} else if (local160 == 1) {
					Static324.anInt5144 = 5;
					Static63.method8324(local160);
					return;
				} else if (local160 == 2) {
					Static324.anInt5144 = 8;
				} else if (local160 == 15) {
					Static324.anInt5144 = 14;
					Static84.anInt1498 = -2;
				} else if (local160 == 23 && Static497.anInt8119 < 3) {
					Static324.anInt5144 = 1;
					Static497.anInt8119++;
					Static512.anInt8553 = 0;
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
					return;
				} else {
					Static324.anInt5144 = 0;
					Static63.method8324(local160);
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
					Static582.method7926();
					return;
				}
			}
			if (Static324.anInt5144 == 6) {
				Static166.method1420();
				local121 = Static123.method1776();
				@Pc(659) Class2_Sub22_Sub2 local659 = local121.aClass2_Sub22_Sub2_2;
				local659.method8561(Static251.aClass131_1);
				local659.method8559(Static582.aClass314_12.anInt8556);
				Static528.method7295(local121);
				Static124.method1779();
				Static324.anInt5144 = 4;
			} else if (Static324.anInt5144 == 7) {
				if (Static155.aClass121_2.method2934(1)) {
					Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
					local160 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
					Static324.anInt5144 = 0;
					Static125.anInt2197 = (local160 + 3) * 60;
					Static63.method8324(21);
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
					Static582.method7926();
				}
			} else if (Static324.anInt5144 == 13) {
				if (Static155.aClass121_2.method2934(1)) {
					Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
					Static324.anInt5144 = 0;
					Static7.anInt95 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
					Static63.method8324(29);
					Static155.aClass121_2.method2936();
					Static155.aClass121_2 = null;
					Static582.method7926();
				}
			} else if (Static324.anInt5144 != 8) {
				@Pc(794) Class2_Sub22_Sub2 local794;
				if (Static324.anInt5144 == 9) {
					local794 = Static53.aClass2_Sub22_Sub2_1;
					if (Static507.anInt8408 == 2) {
						if (!Static155.aClass121_2.method2934(Static219.anInt3587)) {
							return;
						}
						Static155.aClass121_2.method2938(Static219.anInt3587, 0, local794.aByteArray115);
						local794.anInt10247 = 0;
						Static165.anInt5949 = local794.method8547();
						Static354.anInt5551 = local794.method8547();
						Static416.aBoolean461 = local794.method8547() == 1;
						Static463.aBoolean554 = local794.method8547() == 1;
						Static412.aBoolean458 = local794.method8547() == 1;
						Static32.aBoolean58 = local794.method8547() == 1;
						Static528.anInt8672 = local794.method8546();
						Static296.aBoolean353 = local794.method8547() == 1;
						Static429.anInt6738 = local794.method8503();
						Static570.aBoolean690 = local794.method8547() == 1;
						Static319.aClass141_4.method2975(Static570.aBoolean690);
						Static72.aClass225_2.method4788(Static570.aBoolean690);
						Static409.aClass107_2.method2293(Static570.aBoolean690);
					} else if (Static155.aClass121_2.method2934(Static219.anInt3587)) {
						Static155.aClass121_2.method2938(Static219.anInt3587, 0, local794.aByteArray115);
						local794.anInt10247 = 0;
						Static165.anInt5949 = local794.method8547();
						Static354.anInt5551 = local794.method8547();
						Static416.aBoolean461 = local794.method8547() == 1;
						Static463.aBoolean554 = local794.method8547() == 1;
						Static412.aBoolean458 = local794.method8547() == 1;
						Static440.anInt7073 = local794.method8526();
						Static296.aBoolean353 = Static440.anInt7073 > 0;
						Static368.anInt5826 = local794.method8546();
						Static100.anInt1889 = local794.method8546();
						Static228.anInt3706 = local794.method8546();
						Static139.anInt2563 = local794.method8542();
						Static224.aClass108_4 = Static452.aClass226_6.method4845(Static139.anInt2563);
						Static110.anInt1988 = local794.method8547();
						Static156.anInt2812 = local794.method8546();
						Static432.anInt7005 = local794.method8546();
						Static432.aBoolean527 = local794.method8547() == 1;
						Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString49 = Static447.aString103 = local794.method8519();
						Static513.anInt8560 = local794.method8547();
						Static518.anInt8595 = local794.method8542();
						Static558.aClass326_10 = new Class326();
						Static558.aClass326_10.anInt8758 = local794.method8546();
						if (Static558.aClass326_10.anInt8758 == 65535) {
							Static558.aClass326_10.anInt8758 = -1;
						}
						Static558.aClass326_10.aString102 = local794.method8519();
						if (Static252.aClass80_3 != Static162.aClass80_2) {
							Static558.aClass326_10.anInt8764 = Static558.aClass326_10.anInt8758 + 40000;
							Static558.aClass326_10.anInt8760 = Static558.aClass326_10.anInt8758 + 50000;
						}
						if (Static252.aClass80_3 != Static122.aClass80_1 && (Static216.aClass326_9.method7371(Static616.aClass326_11) || Static216.aClass326_9.method7371(Static451.aClass326_6))) {
							Static6.method108();
						}
					} else {
						return;
					}
					if (Static416.aBoolean461 && !Static412.aBoolean458 || Static296.aBoolean353) {
						try {
							Static651.method4296("zap", Static617.anApplet2);
						} catch (@Pc(1104) Throwable local1104) {
							if (Static85.aBoolean497) {
								try {
									Static617.anApplet2.getAppletContext().showDocument(new URL(Static617.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1118) Exception local1118) {
								}
							}
						}
					} else {
						try {
							Static651.method4296("unzap", Static617.anApplet2);
						} catch (@Pc(1095) Throwable local1095) {
						}
					}
					if (Static162.aClass80_2 == Static252.aClass80_3) {
						try {
							Static651.method4296("loggedin", Static617.anApplet2);
						} catch (@Pc(1129) Throwable local1129) {
						}
					}
					if (Static507.anInt8408 != 2) {
						Static324.anInt5144 = 0;
						Static63.method8324(2);
						Static155.method2313();
						Static158.method2370(7);
						Static468.aClass288_250 = null;
						return;
					}
					Static324.anInt5144 = 11;
				}
				if (Static324.anInt5144 == 11) {
					if (!Static155.aClass121_2.method2934(3)) {
						return;
					}
					Static155.aClass121_2.method2938(3, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
					Static324.anInt5144 = 12;
				}
				if (Static324.anInt5144 == 12) {
					local794 = Static53.aClass2_Sub22_Sub2_1;
					local794.anInt10247 = 0;
					if (local794.method8565()) {
						if (!Static155.aClass121_2.method2934(1)) {
							return;
						}
						Static155.aClass121_2.method2938(1, 3, local794.aByteArray115);
					}
					Static468.aClass288_250 = Static152.method2264()[local794.method8563()];
					Static84.anInt1498 = local794.method8546();
					Static324.anInt5144 = 10;
				}
				if (Static324.anInt5144 == 10) {
					if (Static155.aClass121_2.method2934(Static84.anInt1498)) {
						Static155.aClass121_2.method2938(Static84.anInt1498, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
						Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
						Static324.anInt5144 = 0;
						local160 = Static84.anInt1498;
						Static63.method8324(2);
						Static411.method5513();
						Static237.method3327(Static53.aClass2_Sub22_Sub2_1);
						Static22.anInt551 = -1;
						if (Static468.aClass288_250 == Static483.aClass288_263) {
							Static232.method3186();
						} else {
							Static128.method1809();
						}
						if (Static53.aClass2_Sub22_Sub2_1.anInt10247 != local160) {
							throw new RuntimeException("lswp pos:" + Static53.aClass2_Sub22_Sub2_1.anInt10247 + " psize:" + local160);
						}
						Static468.aClass288_250 = null;
					}
				} else if (Static324.anInt5144 == 14) {
					if (Static84.anInt1498 == -2) {
						if (!Static155.aClass121_2.method2934(2)) {
							return;
						}
						Static155.aClass121_2.method2938(2, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
						Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
						Static84.anInt1498 = Static53.aClass2_Sub22_Sub2_1.method8546();
					}
					if (Static155.aClass121_2.method2934(Static84.anInt1498)) {
						Static155.aClass121_2.method2938(Static84.anInt1498, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
						Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
						Static324.anInt5144 = 0;
						local160 = Static84.anInt1498;
						Static63.method8324(15);
						Static367.method4991();
						Static237.method3327(Static53.aClass2_Sub22_Sub2_1);
						if (local160 != Static53.aClass2_Sub22_Sub2_1.anInt10247) {
							throw new RuntimeException("lswpr pos:" + Static53.aClass2_Sub22_Sub2_1.anInt10247 + " psize:" + local160);
						}
						Static468.aClass288_250 = null;
					}
				}
			} else if (Static155.aClass121_2.method2934(1)) {
				Static155.aClass121_2.method2938(1, 0, Static53.aClass2_Sub22_Sub2_1.aByteArray115);
				Static219.anInt3587 = Static53.aClass2_Sub22_Sub2_1.aByteArray115[0] & 0xFF;
				Static324.anInt5144 = 9;
			}
		} catch (@Pc(1372) IOException local1372) {
			if (Static155.aClass121_2 != null) {
				Static155.aClass121_2.method2936();
				Static155.aClass121_2 = null;
			}
			if (Static497.anInt8119 >= 3) {
				Static324.anInt5144 = 0;
				Static63.method8324(-4);
				Static582.method7926();
			} else {
				if (Static507.anInt8408 == 2) {
					Static216.aClass326_9.method7370();
				} else {
					Static390.aClass326_8.method7370();
				}
				Static497.anInt8119++;
				Static512.anInt8553 = 0;
				Static324.anInt5144 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILclient!cea;Lclient!cea;)V")
	public static void method8411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub1_Sub3 arg3, @OriginalArg(4) Class13_Sub1_Sub3 arg4) {
		@Pc(4) Class53 local4 = Static435.method2767(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass13_Sub1_Sub3_2 = arg3;
		local4.aClass13_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static314.aClass76Array2 == Static313.aClass76Array1 ? 1 : 0;
		if (!arg3.method8408()) {
			Static139.aClass13_Sub1ArrayArray1[local19][Static497.anIntArray571[local19]++] = arg3;
		} else if (arg3.method8413()) {
			Static417.aClass13_Sub1ArrayArray2[local19][Static28.anIntArray63[local19]++] = arg3;
		} else {
			Static597.aClass13_Sub1ArrayArray3[local19][Static369.anIntArray426[local19]++] = arg3;
			Static116.aBoolean155 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8408()) {
			if (arg4.method8413()) {
				Static417.aClass13_Sub1ArrayArray2[local19][Static28.anIntArray63[local19]++] = arg4;
				return;
			}
			Static597.aClass13_Sub1ArrayArray3[local19][Static369.anIntArray426[local19]++] = arg4;
			Static116.aBoolean155 = true;
			return;
		}
		Static139.aClass13_Sub1ArrayArray1[local19][Static497.anIntArray571[local19]++] = arg4;
	}
}
