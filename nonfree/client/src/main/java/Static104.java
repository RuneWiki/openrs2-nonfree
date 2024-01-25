import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dia", name = "z", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_23 = new Class341(52, 16);

	@OriginalMember(owner = "client!dia", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ol;Z)Lclient!ica;")
	public static Class2_Sub15 method1879(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method5203();
		@Pc(20) int local20 = arg0.method5203();
		@Pc(24) Class2_Sub15 local24 = Static458.method7353(local20);
		local24.anInt11361 = arg0.method5203();
		@Pc(33) int local33 = arg0.method5203();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) int local41 = arg0.method5203();
			local24.method9718(local41, arg0);
		}
		local24.method9722();
		return local24;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIZLclient!m;)V")
	public static void method1882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub13 arg2) {
		if (arg2 == null || arg2 == Static61.aClass271_6.aClass2_230) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt6873;
		@Pc(18) int local18 = arg2.anInt6870;
		@Pc(21) int local21 = arg2.anInt6866;
		@Pc(25) int local25 = (int) arg2.aLong181;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg2.aLong181;
		@Pc(42) Class2_Sub6 local42;
		@Pc(51) Class15_Sub3_Sub3_Sub1_Sub2 local51;
		@Pc(64) Class2_Sub52 local64;
		if (local21 == 17) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static481.anInt8660 = 2;
				Static136.anInt2586 = 0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				Static369.anInt11005 = arg1;
				Static383.anInt7257 = arg0;
				local64 = Static311.method5098(Static542.aClass341_90, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local64.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
				local64.aClass2_Sub8_Sub2_2.method5187(local25);
				local64.aClass2_Sub8_Sub2_2.method5218(Static188.anInt8300);
				local64.aClass2_Sub8_Sub2_2.method5179(Static135.anInt2564);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		@Pc(142) Class2_Sub52 local142;
		if (local21 == 18) {
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			Static369.anInt11005 = arg1;
			local142 = Static311.method5098(Static670.aClass341_78, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5187(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt3977);
			local142.aClass2_Sub8_Sub2_2.method5218(Static188.anInt8300);
			local142.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5188(Static135.anInt2564);
			local142.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
			Static38.method791(local142);
		}
		@Pc(185) Class15_Sub3_Sub3_Sub1_Sub1 local185;
		@Pc(204) Class2_Sub52 local204;
		if (local21 == 22) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				Static136.anInt2586 = 0;
				local204 = Static311.method5098(Static90.aClass341_20, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5205(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 52) {
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			Static369.anInt11005 = arg1;
			Static136.anInt2586 = 0;
			local142 = Static311.method5098(Static613.aClass341_103, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5218(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local142.aClass2_Sub8_Sub2_2.method5192(Static640.anInt11085 + local15);
			local142.aClass2_Sub8_Sub2_2.method5218(local18 + Static490.anInt8763);
			local142.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 25) {
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			Static136.anInt2586 = 0;
			Static383.anInt7257 = arg0;
			local142 = Static311.method5098(Static582.aClass341_98, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5187(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5192(local15 + Static640.anInt11085);
			local142.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5205(local25);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 5) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static369.anInt11005 = arg1;
				Static136.anInt2586 = 0;
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				local204 = Static311.method5098(Static172.aClass341_42, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5218(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 6) {
			Static136.anInt2586 = 0;
			Static383.anInt7257 = arg0;
			Static481.anInt8660 = 2;
			Static369.anInt11005 = arg1;
			local142 = Static311.method5098(Static358.aClass341_70, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5192(local18 + Static490.anInt8763);
			local142.aClass2_Sub8_Sub2_2.method5218(Static640.anInt11085 + local15);
			local142.aClass2_Sub8_Sub2_2.method5205(local25);
			local142.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 30) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static383.anInt7257 = arg0;
				Static481.anInt8660 = 2;
				Static369.anInt11005 = arg1;
				Static136.anInt2586 = 0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				local64 = Static311.method5098(Static265.aClass341_57, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5187(local25);
				local64.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		if (local21 == 19) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				local204 = Static311.method5098(Static153.aClass341_38, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5192(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 1009) {
			Static136.anInt2586 = 0;
			Static383.anInt7257 = arg0;
			Static481.anInt8660 = 2;
			Static369.anInt11005 = arg1;
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				@Pc(674) Class312 local674 = local51.aClass312_1;
				if (local674.anIntArray458 != null) {
					local674 = local674.method7953(Static113.aClass282_1);
				}
				if (local674 != null) {
					@Pc(693) Class2_Sub52 local693 = Static311.method5098(Static665.aClass341_114, Static125.aClass179_1);
					local693.aClass2_Sub8_Sub2_2.method5192(local674.anInt9090);
					Static38.method791(local693);
				}
			}
		}
		if (local21 == 13) {
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			Static481.anInt8660 = 2;
			Static369.anInt11005 = arg1;
			local142 = Static311.method5098(Static521.aClass341_69, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5187(Static590.anInt10293);
			local142.aClass2_Sub8_Sub2_2.method5187(local25);
			local142.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5179(Static135.anInt2564);
			local142.aClass2_Sub8_Sub2_2.method5218(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5205(Static188.anInt8300);
			local142.aClass2_Sub8_Sub2_2.method5192(Static640.anInt11085 + local15);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 1011 || local21 == 1003 || local21 == 1012 || local21 == 1004 || local21 == 1010) {
			Static233.method4203(local21, local25, local15);
		}
		if (local21 == 3) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				local204 = Static311.method5098(Static614.aClass341_104, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5218(local25);
				local204.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 51) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static383.anInt7257 = arg0;
				Static481.anInt8660 = 2;
				Static369.anInt11005 = arg1;
				local204 = Static311.method5098(Static53.aClass341_13, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5218(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 53 && Static122.aClass357_40 == null) {
			Static526.method8185(local15, local18);
			Static122.aClass357_40 = Static226.method4160(local15, local18);
			Static473.method7526(Static122.aClass357_40);
		}
		if (local21 == 11) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static481.anInt8660 = 2;
				Static369.anInt11005 = arg1;
				Static383.anInt7257 = arg0;
				local204 = Static311.method5098(Static629.aClass341_106, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5218(local25);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 16) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static383.anInt7257 = arg0;
				Static481.anInt8660 = 2;
				Static136.anInt2586 = 0;
				Static369.anInt11005 = arg1;
				local204 = Static311.method5098(Static670.aClass341_78, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5187(local25);
				local204.aClass2_Sub8_Sub2_2.method5218(Static188.anInt8300);
				local204.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5188(Static135.anInt2564);
				local204.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 15 || local21 == 1001) {
			Static158.method3194(arg2.aString82, local25, local18, local15);
		}
		if (local21 == 23) {
			Static136.anInt2586 = 0;
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			local142 = Static311.method5098(Static68.aClass341_18, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5205(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5218(local25);
			local142.aClass2_Sub8_Sub2_2.method5205(local15 + Static640.anInt11085);
			local142.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 48) {
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 1;
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			local142 = Static311.method5098(Static646.aClass341_111, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5205(Static590.anInt10293);
			local142.aClass2_Sub8_Sub2_2.method5218(Static188.anInt8300);
			local142.aClass2_Sub8_Sub2_2.method5218(local15 + Static640.anInt11085);
			local142.aClass2_Sub8_Sub2_2.method5205(local18 + Static490.anInt8763);
			local142.aClass2_Sub8_Sub2_2.method5188(Static135.anInt2564);
			Static38.method791(local142);
			Static76.method1368(-4, 0, 1, local15, 1, 0, true, local18);
		}
		@Pc(1257) Class357 local1257;
		if (local21 == 12) {
			local1257 = Static226.method4160(local15, local18);
			if (local1257 != null) {
				Static290.method6763(local1257);
			}
		}
		if (local21 == 59) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				local204 = Static311.method5098(Static312.aClass341_61, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5187(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 4) {
			Static369.anInt11005 = arg1;
			Static136.anInt2586 = 0;
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			local142 = Static311.method5098(Static54.aClass341_14, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5205(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local142.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5187(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5187(local15 + Static640.anInt11085);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 10) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				Static136.anInt2586 = 0;
				Static369.anInt11005 = arg1;
				local204 = Static311.method5098(Static636.aClass341_110, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5205(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 2) {
			if (Static31.anInt530 > 0 && Static202.aClass191_1.method8963(82) && Static202.aClass191_1.method8963(81)) {
				Static26.method458(Static640.anInt11085 + local15, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, Static490.anInt8763 + local18);
			} else {
				local142 = Static611.method9194(local18, local25, local15);
				if (local25 == 1) {
					local142.aClass2_Sub8_Sub2_2.method5170(-1);
					local142.aClass2_Sub8_Sub2_2.method5170(-1);
					local142.aClass2_Sub8_Sub2_2.method5192((int) Static278.aFloat108);
					local142.aClass2_Sub8_Sub2_2.method5170(57);
					local142.aClass2_Sub8_Sub2_2.method5170(Static275.anInt5119);
					local142.aClass2_Sub8_Sub2_2.method5170(Static199.anInt4199);
					local142.aClass2_Sub8_Sub2_2.method5170(89);
					local142.aClass2_Sub8_Sub2_2.method5192(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022);
					local142.aClass2_Sub8_Sub2_2.method5192(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024);
					local142.aClass2_Sub8_Sub2_2.method5170(63);
				} else {
					Static136.anInt2586 = 0;
					Static369.anInt11005 = arg1;
					Static481.anInt8660 = 1;
					Static383.anInt7257 = arg0;
				}
				Static38.method791(local142);
				Static76.method1368(-4, 0, 1, local15, 1, 0, true, local18);
			}
		}
		if (local21 == 44) {
			Static369.anInt11005 = arg1;
			Static383.anInt7257 = arg0;
			Static481.anInt8660 = 2;
			Static136.anInt2586 = 0;
			local142 = Static311.method5098(Static569.aClass341_94, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5177(Static135.anInt2564);
			local142.aClass2_Sub8_Sub2_2.method5187(Static188.anInt8300);
			local142.aClass2_Sub8_Sub2_2.method5187(Static590.anInt10293);
			local142.aClass2_Sub8_Sub2_2.method5187(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5192(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local142.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5192(local15 + Static640.anInt11085);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 1007) {
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			local142 = Static311.method5098(Static387.aClass341_75, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5192(local25);
			Static38.method791(local142);
		}
		if (local21 == 9) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static136.anInt2586 = 0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				local64 = Static311.method5098(Static189.aClass341_45, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local64.aClass2_Sub8_Sub2_2.method5187(local25);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		if (local21 == 45) {
			if (Static31.anInt530 > 0 && Static202.aClass191_1.method8963(82) && Static202.aClass191_1.method8963(81)) {
				Static26.method458(Static640.anInt11085 + local15, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, Static490.anInt8763 + local18);
			} else {
				Static481.anInt8660 = 1;
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				Static136.anInt2586 = 0;
				local142 = Static311.method5098(Static34.aClass341_9, Static125.aClass179_1);
				local142.aClass2_Sub8_Sub2_2.method5187(Static490.anInt8763 + local18);
				local142.aClass2_Sub8_Sub2_2.method5205(local15 + Static640.anInt11085);
				Static38.method791(local142);
			}
		}
		if (local21 == 1008) {
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			local142 = Static311.method5098(Static629.aClass341_107, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5187(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5205(Static640.anInt11085 + local15);
			local142.aClass2_Sub8_Sub2_2.method5192((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local142.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 20) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static136.anInt2586 = 0;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				local64 = Static311.method5098(Static579.aClass341_97, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5218(local25);
				local64.aClass2_Sub8_Sub2_2.method5225(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		if (local21 == 58) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static481.anInt8660 = 2;
				Static369.anInt11005 = arg1;
				Static383.anInt7257 = arg0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				Static136.anInt2586 = 0;
				local64 = Static311.method5098(Static169.aClass341_40, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5205(local25);
				local64.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		if (local21 == 46) {
			Static481.anInt8660 = 2;
			Static136.anInt2586 = 0;
			Static369.anInt11005 = arg1;
			Static383.anInt7257 = arg0;
			local142 = Static311.method5098(Static464.aClass341_80, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5192(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local142.aClass2_Sub8_Sub2_2.method5192(Static640.anInt11085 + local15);
			local142.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5218(local18 + Static490.anInt8763);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 60) {
			Static383.anInt7257 = arg0;
			Static369.anInt11005 = arg1;
			Static136.anInt2586 = 0;
			Static481.anInt8660 = 2;
			local142 = Static311.method5098(Static66.aClass341_17, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5218(local25);
			local142.aClass2_Sub8_Sub2_2.method5208(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5192(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5205(local15 + Static640.anInt11085);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 1006) {
			Static136.anInt2586 = 0;
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			Static369.anInt11005 = arg1;
			local142 = Static311.method5098(Static255.aClass341_54, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5192(local25);
			Static38.method791(local142);
		}
		if (local21 == 57) {
			local1257 = Static226.method4160(local15, local18);
			if (local1257 != null) {
				Static417.method6895();
				@Pc(2217) Class2_Sub11 local2217 = Static85.method1469(local1257);
				Static390.method6563(local2217.method1142(), local2217.anInt1160, local1257);
				Static526.aString109 = Static181.method3540(local1257);
				Static13.aString100 = local1257.aString121 + "<col=ffffff>";
				if (Static526.aString109 == null) {
					Static526.aString109 = "Null";
				}
			}
			return;
		}
		if (local21 == 8) {
			Static136.anInt2586 = 0;
			Static383.anInt7257 = arg0;
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			local142 = Static311.method5098(Static166.aClass341_39, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5218(Static640.anInt11085 + local15);
			local142.aClass2_Sub8_Sub2_2.method5187(local18 + Static490.anInt8763);
			local142.aClass2_Sub8_Sub2_2.method5205((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static38.method791(local142);
			Static563.method8556(local32, local15, local18);
		}
		if (local21 == 21) {
			local42 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local25);
			if (local42 != null) {
				Static383.anInt7257 = arg0;
				local51 = local42.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				Static369.anInt11005 = arg1;
				Static481.anInt8660 = 2;
				Static136.anInt2586 = 0;
				local64 = Static311.method5098(Static471.aClass341_82, Static125.aClass179_1);
				local64.aClass2_Sub8_Sub2_2.method5218(local25);
				local64.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local64);
				Static76.method1368(-2, 0, local51.method3690(), local51.anIntArray189[0], local51.method3690(), 0, true, local51.anIntArray188[0]);
			}
		}
		if (local21 == 49) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static369.anInt11005 = arg1;
				Static383.anInt7257 = arg0;
				Static481.anInt8660 = 2;
				local204 = Static311.method5098(Static476.aClass341_84, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5192(local25);
				local204.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (local21 == 47) {
			Static369.anInt11005 = arg1;
			Static481.anInt8660 = 2;
			Static383.anInt7257 = arg0;
			Static136.anInt2586 = 0;
			local142 = Static311.method5098(Static94.aClass341_22, Static125.aClass179_1);
			local142.aClass2_Sub8_Sub2_2.method5187(local25);
			local142.aClass2_Sub8_Sub2_2.method5205(Static490.anInt8763 + local18);
			local142.aClass2_Sub8_Sub2_2.method5170(Static202.aClass191_1.method8963(82) ? 1 : 0);
			local142.aClass2_Sub8_Sub2_2.method5218(local15 + Static640.anInt11085);
			Static38.method791(local142);
			Static301.method4960(local15, local18);
		}
		if (local21 == 50) {
			local185 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local25];
			if (local185 != null) {
				Static136.anInt2586 = 0;
				Static481.anInt8660 = 2;
				Static383.anInt7257 = arg0;
				Static369.anInt11005 = arg1;
				local204 = Static311.method5098(Static22.aClass341_8, Static125.aClass179_1);
				local204.aClass2_Sub8_Sub2_2.method5189(Static202.aClass191_1.method8963(82) ? 1 : 0);
				local204.aClass2_Sub8_Sub2_2.method5218(local25);
				Static38.method791(local204);
				Static76.method1368(-2, 0, local185.method3690(), local185.anIntArray189[0], local185.method3690(), 0, true, local185.anIntArray188[0]);
			}
		}
		if (Static537.aBoolean683) {
			Static417.method6895();
		}
		if (Static660.aClass357_159 != null && Static541.anInt9470 == 0) {
			Static473.method7526(Static660.aClass357_159);
		}
	}
}
