import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!hc;")
	public static Class51 aClass51_61;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
	public static int[] anIntArray339 = new int[25];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3279(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static228.anInt5020 > 0) {
			local18 = Static181.aByteArrayArray9[--Static228.anInt5020];
			Static181.aByteArrayArray9[Static228.anInt5020] = null;
			return local18;
		} else if (arg0 == 5000 && Static26.anInt708 > 0) {
			local18 = Static36.aByteArrayArray3[--Static26.anInt708];
			Static36.aByteArrayArray3[Static26.anInt708] = null;
			return local18;
		} else if (arg0 == 30000 && Static110.anInt2936 > 0) {
			local18 = Static191.aByteArrayArray10[--Static110.anInt2936];
			Static191.aByteArrayArray10[Static110.anInt2936] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3280(@OriginalArg(0) String arg0) {
		return Static44.method937(10, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ai;[I[I[II)V")
	public static void method3282(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg1[local8];
			@Pc(22) int local22 = arg2[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg0.aClass83Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass83Array3[local24] = null;
					} else {
						@Pc(47) Class49 local47 = Static131.method697(local14);
						@Pc(50) int local50 = local47.anInt2190;
						@Pc(55) Class83 local55 = arg0.aClass83Array3[local24];
						if (local55 != null) {
							if (local55.anInt3390 == local14) {
								if (local50 == 0) {
									local55 = arg0.aClass83Array3[local24] = null;
								} else if (local50 == 1) {
									local55.anInt3384 = 0;
									local55.anInt3391 = 1;
									local55.anInt3392 = local22;
									local55.anInt3386 = 0;
									local55.anInt3385 = 0;
									Static232.method3865(arg0.anInt479, arg0.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg0, 0, local47);
								} else if (local50 == 2) {
									local55.anInt3386 = 0;
								}
							} else if (local47.anInt2189 >= Static131.method697(local55.anInt3390).anInt2189) {
								local55 = arg0.aClass83Array3[local24] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass83Array3[local24] = new Class83();
							local55.anInt3384 = 0;
							local55.anInt3392 = local22;
							local55.anInt3390 = local14;
							local55.anInt3391 = 1;
							local55.anInt3385 = 0;
							local55.anInt3386 = 0;
							Static232.method3865(arg0.anInt479, arg0.anInt427, Static83.aClass9_Sub1_Sub1_1 == arg0, 0, local47);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method3283(@OriginalArg(1) Class51 arg0) {
		if (Static110.aBoolean160) {
			return;
		}
		Static189.method3189();
		Static216.aClass1_Sub2_Sub4_7 = Static68.method980(Static30.anInt914, arg0);
		@Pc(22) int local22 = Static251.anInt5352;
		@Pc(28) int local28 = local22 * 956 / 503;
		Static216.aClass1_Sub2_Sub4_7.method887((Static200.anInt4411 - local28) / 2, 0, local28, local22);
		Static203.aClass7_1 = Static165.method2873(arg0, Static210.anInt4599);
		Static203.aClass7_1.method1521(Static200.anInt4411 / 2 - Static203.aClass7_1.anInt2109 / 2, 18);
		Static110.aBoolean160 = true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method3284(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg1, 2);
		local4.method3810();
		local4.aString359 = arg0;
	}
}
