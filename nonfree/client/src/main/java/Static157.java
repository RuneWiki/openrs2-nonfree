import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Z")
	public static boolean aBoolean194;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
	public static int anInt3003;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public static int anInt3004;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_28 = new Class26(4);

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_56 = new Class117("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[Lclient!fc;")
	public static final Class69[] aClass69Array1 = new Class69[29];

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!dr;")
	public static Class55 method2529(@OriginalArg(1) int arg0) {
		@Pc(13) Class26 local13 = Static262.aClass26_49;
		@Pc(22) Class55 local22;
		synchronized (Static262.aClass26_49) {
			local22 = (Class55) Static262.aClass26_49.method332((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(38) byte[] local38 = Static246.aClass144_85.method3896(arg0, 32);
		local22 = new Class55();
		if (local38 != null) {
			local22.method943(new Class11_Sub25(local38));
		}
		local22.method938();
		@Pc(56) Class26 local56 = Static262.aClass26_49;
		synchronized (Static262.aClass26_49) {
			Static262.aClass26_49.method330((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!uo;IILclient!ic;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2530(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static174.aClass129_5 = arg0;
		Static128.anInt2364 = arg1;
		Static110.aClass61_3 = arg3;
		Static216.aBoolean369 = Static174.aClass129_5.method5000() > 0;
		Static6.anInt4021 = arg4 >> 7;
		Static104.anInt1932 = arg6 >> 7;
		Static10.anInt229 = arg4;
		Static178.anInt3541 = arg6;
		Static337.anInt6447 = arg5;
		Static54.anInt1025 = Static6.anInt4021 - Static209.anInt4263;
		if (Static54.anInt1025 < 0) {
			Static256.anInt5196 = -Static54.anInt1025;
			Static54.anInt1025 = 0;
		} else {
			Static256.anInt5196 = 0;
		}
		Static305.anInt5983 = Static104.anInt1932 - Static209.anInt4263;
		if (Static305.anInt5983 < 0) {
			Static199.anInt4035 = -Static305.anInt5983;
			Static305.anInt5983 = 0;
		} else {
			Static199.anInt4035 = 0;
		}
		Static199.anInt4037 = Static6.anInt4021 + Static209.anInt4263;
		if (Static199.anInt4037 > Static232.anInt4703) {
			Static199.anInt4037 = Static232.anInt4703;
		}
		Static108.anInt2044 = Static104.anInt1932 + Static209.anInt4263;
		if (Static108.anInt2044 > Static300.anInt5931) {
			Static108.anInt2044 = Static300.anInt5931;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static209.anInt4263 + Static209.anInt4263 + 2; local74++) {
			for (local77 = 0; local77 < Static209.anInt4263 + Static209.anInt4263 + 2; local77++) {
				local84 = Static6.anInt4021 + local74 - Static209.anInt4263;
				local90 = Static104.anInt1932 + local77 - Static209.anInt4263;
				if (local84 >= 0 && local90 >= 0 && local84 < Static232.anInt4703 && local90 < Static300.anInt5931) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static129.aClass77Array3[3].method4122(local84, local90) - 1000;
					@Pc(137) int local137 = Static79.aClass77Array5 == null ? Static129.aClass77Array3[0].method4122(local84, local90) + 128 : Static79.aClass77Array5[0].method4122(local84, local90) + 128;
					Static195.aBooleanArrayArray6[local74][local77] = Static174.aClass129_5.method5014(local104, local117, local108, local104, local137, local108);
				} else {
					Static195.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static209.anInt4263 + Static209.anInt4263 + 1; local77++) {
			for (local84 = 0; local84 < Static209.anInt4263 + Static209.anInt4263 + 1; local84++) {
				Static8.aBooleanArrayArray1[local77][local84] = Static195.aBooleanArrayArray6[local77][local84] || Static195.aBooleanArrayArray6[local77 + 1][local84] || Static195.aBooleanArrayArray6[local77][local84 + 1] || Static195.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static294.anIntArray453 = arg8;
		Static306.anIntArray496 = arg9;
		Static40.anIntArray58 = arg10;
		Static237.anIntArray376 = arg11;
		Static284.anIntArray438 = arg12;
		Static101.method1500();
		Static153.method2456();
		for (@Pc(253) Class10_Sub1 local253 = (Class10_Sub1) Static33.aClass210_2.method5608(); local253 != null; local253 = (Class10_Sub1) Static33.aClass210_2.method5615()) {
			local253.method5452();
			Static330.method5437(local253);
		}
		if (Static216.aBoolean369) {
			for (local90 = 0; local90 < Static219.anInt4457; local90++) {
				Static171.aClass11_Sub5_Sub1Array2[local90].method1043(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static174.aClass129_5.method4924(0);
			if (Static74.aClass38_1 == null || Static74.aClass38_1 instanceof Class38_Sub2) {
				Static74.aClass38_1 = new Class38_Sub1();
			}
		} else if (Static74.aClass38_1 == null || Static74.aClass38_1 instanceof Class38_Sub1) {
			Static74.aClass38_1 = new Class38_Sub2();
		}
		Static74.aClass38_1.method4168(arg2);
		Static74.aClass38_1.method4170();
		if (Static118.aClass106ArrayArrayArray1 != null) {
			Static355.method5699(true);
			Static74.aClass38_1.method4167(22);
			Static278.method5404(arg2, null, 0, (byte) 0, arg15, arg16);
			Static74.aClass38_1.method4170();
			Static74.aClass38_1.method4167(23);
			Static355.method5699(false);
		}
		Static278.method5404(arg2, arg7, arg13, arg14, arg15, arg16);
		Static74.aClass38_1.method4170();
		Static74.aClass38_1.method4169();
		Static74.aClass38_1.method4170();
		if (arg2 > 1) {
			Static174.aClass129_5.method4953(0);
		}
		Static174.aClass129_5.method4963(0, null);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V")
	public static void method2531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static313.aClass11_Sub25_Sub1_5.method2454(250);
		Static313.aClass11_Sub25_Sub1_5.method5182(arg1);
		Static313.aClass11_Sub25_Sub1_5.method5191(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method2533(@OriginalArg(0) int arg0) {
		Static170.anInt3354 = arg0;
		@Pc(15) Class26 local15 = Static261.aClass26_47;
		synchronized (Static261.aClass26_47) {
			Static261.aClass26_47.method333();
		}
		local15 = Static174.aClass26_31;
		synchronized (Static174.aClass26_31) {
			Static174.aClass26_31.method333();
		}
		local15 = Static83.aClass26_10;
		synchronized (Static83.aClass26_10) {
			Static83.aClass26_10.method333();
		}
	}
}
