import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt6512 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method5735() {
		if (Static13.anInt334 == 10 || Static13.anInt334 == 28) {
			Static148.method2879(Static14.anInt4971 >> 10, Static260.anInt5192 >> 10);
		} else if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >= 0 && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 < Static311.anInt5653 * 128 && Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >= 0 && Static189.anInt3820 * 128 > Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726) {
			Static148.method2879(Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] >> 3, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0] >> 3);
		} else {
			Static148.method2879(Static311.anInt5653 >> 4, Static189.anInt3820 >> 4);
		}
		Static53.method1330();
		Static78.method1684();
		Static298.method5711();
		Static355.method5866();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLjava/lang/String;ZIZILjava/lang/String;IIIJ)V")
	public static void method5736(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(34) Class1_Sub7 local34 = new Class1_Sub7(128);
		local34.method2121(10);
		local34.method2144((arg2 ? 4 : 0) | (arg4 ? 2 : 0) | (arg0 ? 1 : 0));
		local34.method2124(arg9);
		local34.method2115(local8[0]);
		local34.method2106(arg1);
		local34.method2115(local8[1]);
		local34.method2144(Static180.anInt3698);
		local34.method2121(arg6);
		local34.method2121(arg8);
		local34.method2115(local8[2]);
		local34.method2144(arg7);
		local34.method2144(arg3);
		local34.method2115(local8[3]);
		local34.method2107(Static255.aBigInteger1, Static318.aBigInteger2);
		@Pc(120) Class1_Sub7 local120 = new Class1_Sub7(350);
		local120.method2106(arg5);
		@Pc(133) int local133 = 8 - Static131.method2688(arg5) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local120.method2121((int) (Math.random() * 255.0D));
		}
		local120.method2136(local8);
		Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
		Static339.aClass1_Sub7_Sub2_4.method2121(Static204.aClass103_8.anInt3138);
		Static339.aClass1_Sub7_Sub2_4.method2144(local34.anInt2219 + local120.anInt2219 + 2);
		Static339.aClass1_Sub7_Sub2_4.method2144(571);
		Static339.aClass1_Sub7_Sub2_4.method2133(local34.anInt2219, local34.aByteArray41);
		Static339.aClass1_Sub7_Sub2_4.method2133(local120.anInt2219, local120.aByteArray41);
		Static280.anInt5464 = 0;
		Static2.anInt125 = -3;
		Static180.anInt3696 = 1;
		Static100.anInt2306 = 0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLclient!fp;Lclient!ic;)V")
	public static void method5737(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static269.aClass1_Sub4_Sub15_2 == null) {
			return;
		}
		if (Static141.anInt3042 < 10) {
			if (!Static269.aClass30_51.method1182(Static269.aClass1_Sub4_Sub15_2.aString23)) {
				Static141.anInt3042 = Static310.aClass30_88.method1185(Static269.aClass1_Sub4_Sub15_2.aString23) / 10;
				return;
			}
			Static251.method4732();
			Static141.anInt3042 = 10;
		}
		if (Static141.anInt3042 == 10) {
			Static269.anInt3314 = Static269.aClass1_Sub4_Sub15_2.anInt3242 >> 6 << 6;
			Static269.anInt3320 = Static269.aClass1_Sub4_Sub15_2.anInt3249 >> 6 << 6;
			Static269.anInt3321 = (Static269.aClass1_Sub4_Sub15_2.anInt3247 >> 6 << 6) + 64 - Static269.anInt3314;
			Static269.anInt3324 = (Static269.aClass1_Sub4_Sub15_2.anInt3239 >> 6 << 6) + 64 - Static269.anInt3320;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static269.aClass1_Sub4_Sub15_2.method2982(Static299.anInt4036 + (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7), Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local77, Static50.anInt1271 + (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7))) {
				local79 = local77[1] - Static269.anInt3320;
				local81 = local77[2] - Static269.anInt3314;
			}
			if (!Static118.aBoolean189 && local79 >= 0 && Static269.anInt3324 > local79 && local81 >= 0 && Static269.anInt3321 > local81) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static207.anInt4093 = local79;
				Static299.anInt4033 = local81;
			} else if (Static216.anInt4296 == -1 || Static219.anInt4374 == -1) {
				Static269.aClass1_Sub4_Sub15_2.method2979(Static269.aClass1_Sub4_Sub15_2.anInt3244 >> 14 & 0x3FFF, Static269.aClass1_Sub4_Sub15_2.anInt3244 & 0x3FFF, local77);
				Static299.anInt4033 = local77[2] - Static269.anInt3314;
				Static207.anInt4093 = local77[1] - Static269.anInt3320;
			} else {
				Static269.aClass1_Sub4_Sub15_2.method2979(Static216.anInt4296, Static219.anInt4374, local77);
				if (local77 != null) {
					Static299.anInt4033 = local77[2] - Static269.anInt3314;
					Static207.anInt4093 = local77[1] - Static269.anInt3320;
				}
				Static118.aBoolean189 = false;
				Static219.anInt4374 = -1;
				Static216.anInt4296 = -1;
			}
			if (Static269.aClass1_Sub4_Sub15_2.anInt3248 == 37) {
				Static269.aFloat26 = 3.0F;
				Static269.aFloat25 = 3.0F;
			} else if (Static269.aClass1_Sub4_Sub15_2.anInt3248 == 50) {
				Static269.aFloat26 = 4.0F;
				Static269.aFloat25 = 4.0F;
			} else if (Static269.aClass1_Sub4_Sub15_2.anInt3248 == 75) {
				Static269.aFloat26 = 6.0F;
				Static269.aFloat25 = 6.0F;
			} else if (Static269.aClass1_Sub4_Sub15_2.anInt3248 == 100) {
				Static269.aFloat26 = 8.0F;
				Static269.aFloat25 = 8.0F;
			} else if (Static269.aClass1_Sub4_Sub15_2.anInt3248 == 200) {
				Static269.aFloat26 = 16.0F;
				Static269.aFloat25 = 16.0F;
			} else {
				Static269.aFloat26 = 8.0F;
				Static269.aFloat25 = 8.0F;
			}
			Static269.anInt3313 = (int) Static269.aFloat26 >> 1;
			Static269.aByteArrayArrayArray4 = Static129.method2663(Static269.anInt3313);
			Static229.method4278();
			Static269.method3058();
			Static164.aClass42_22 = new Class42();
			Static269.anInt3312 += (int) (Math.random() * 5.0D) - 2;
			if (Static269.anInt3312 < -8) {
				Static269.anInt3312 = -8;
			}
			if (Static269.anInt3312 > 8) {
				Static269.anInt3312 = 8;
			}
			Static269.anInt3311 += (int) (Math.random() * 5.0D) - 2;
			if (Static269.anInt3311 < -16) {
				Static269.anInt3311 = -16;
			}
			if (Static269.anInt3311 > 16) {
				Static269.anInt3311 = 16;
			}
			Static269.method3047(arg1, Static269.anInt3312 >> 2 << 10, Static269.anInt3311 >> 1);
			Static312.method5405(256, 1024);
			Static152.method2914(256, 256);
			Static245.method4673(4096);
			Static134.method2731(256);
			Static141.anInt3042 = 20;
		} else if (Static141.anInt3042 == 20) {
			Static266.method4815(true);
			Static269.method3052(arg0, Static269.anInt3312, Static269.anInt3311);
			Static141.anInt3042 = 60;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 60) {
			if (Static269.aClass30_51.method1181(Static269.aClass1_Sub4_Sub15_2.aString23 + "_staticelements")) {
				if (!Static269.aClass30_51.method1182(Static269.aClass1_Sub4_Sub15_2.aString23 + "_staticelements")) {
					return;
				}
				Static269.aClass86_3 = Static96.method2063(Static269.aClass30_51, Static204.aBoolean304, Static269.aClass1_Sub4_Sub15_2.aString23 + "_staticelements");
			} else {
				Static269.aClass86_3 = new Class86(0);
			}
			Static269.method3054();
			Static141.anInt3042 = 70;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 70) {
			Static164.aClass174_9 = new Class174(arg0, 11, true, Static174.aCanvas3);
			Static141.anInt3042 = 73;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 73) {
			Static21.aClass174_4 = new Class174(arg0, 12, true, Static174.aCanvas3);
			Static141.anInt3042 = 76;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 76) {
			Static21.aClass174_3 = new Class174(arg0, 14, true, Static174.aCanvas3);
			Static141.anInt3042 = 79;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 79) {
			Static286.aClass174_11 = new Class174(arg0, 17, true, Static174.aCanvas3);
			Static141.anInt3042 = 82;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 82) {
			Static230.aClass174_8 = new Class174(arg0, 19, true, Static174.aCanvas3);
			Static141.anInt3042 = 85;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 85) {
			Static175.aClass174_10 = new Class174(arg0, 22, true, Static174.aCanvas3);
			Static141.anInt3042 = 88;
			Static266.method4815(true);
			Static160.method3013();
		} else if (Static141.anInt3042 == 88) {
			Static69.aClass174_6 = new Class174(arg0, 26, true, Static174.aCanvas3);
			Static141.anInt3042 = 91;
			Static266.method4815(true);
			Static160.method3013();
		} else {
			Static331.aClass174_12 = new Class174(arg0, 30, true, Static174.aCanvas3);
			Static141.anInt3042 = 100;
			Static266.method4815(true);
			Static160.method3013();
			System.gc();
		}
	}
}
