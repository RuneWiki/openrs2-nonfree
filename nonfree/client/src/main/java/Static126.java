import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "Lclient!df;")
	public static Class33 aClass33_4 = new Class33(128);

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
	public static int anInt2449 = 1;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
	public static int[] anIntArray291 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IBII[I)V")
	public static void method2191(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(7) int local7 = arg2;
		@Pc(13) int local13 = (arg1 + arg2) / 2;
		@Pc(17) int local17 = arg3[local13];
		arg3[local13] = arg3[arg1];
		arg3[arg1] = local17;
		@Pc(31) int local31 = arg0[local13];
		arg0[local13] = arg0[arg1];
		arg0[arg1] = local31;
		for (@Pc(43) int local43 = arg2; local43 < arg1; local43++) {
			if (local17 + (local43 & 0x1) > arg3[local43]) {
				@Pc(60) int local60 = arg3[local43];
				arg3[local43] = arg3[local7];
				arg3[local7] = local60;
				@Pc(74) int local74 = arg0[local43];
				arg0[local43] = arg0[local7];
				arg0[local7++] = local74;
			}
		}
		arg3[arg1] = arg3[local7];
		arg3[local7] = local17;
		arg0[arg1] = arg0[local7];
		arg0[local7] = local31;
		method2191(arg0, local7 - 1, arg2, arg3);
		method2191(arg0, arg1, local7 + 1, arg3);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	public static void method2192() {
		if (Static32.aClass105_1 != null) {
			Static32.aClass105_1.method2782();
		}
		if (Static187.aClass105_2 != null) {
			Static187.aClass105_2.method2782();
		}
		Static27.method426(Static110.aBoolean160);
		Static32.aClass105_1 = Static31.method475(0, Static224.aCanvas12, 22050, Static274.aClass176_4);
		Static32.aClass105_1.method2777(Static22.aClass3_Sub15_Sub4_1);
		Static187.aClass105_2 = Static31.method475(1, Static224.aCanvas12, 2048, Static274.aClass176_4);
		Static187.aClass105_2.method2777(Static86.aClass3_Sub15_Sub2_1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!rn;Z)V")
	public static void method2194(@OriginalArg(0) Class155 arg0) {
		if (Static3.aBoolean1) {
			return;
		}
		if (Static283.aBoolean393) {
			Static234.method3978();
		} else {
			Static143.method2443();
		}
		Static194.aClass3_Sub4_Sub12_2 = Static237.method4003(arg0, Static131.anInt2477);
		@Pc(20) int local20 = Static123.anInt2333;
		@Pc(26) int local26 = local20 * 956 / 503;
		Static194.aClass3_Sub4_Sub12_2.method4703((Static253.anInt5224 - local26) / 2, 0, local26, local20);
		Static79.aClass81_2 = Static83.method1273(Static198.anInt3861, arg0);
		Static79.aClass81_2.method2501(Static253.anInt5224 / 2 - Static79.aClass81_2.anInt2797 / 2, 18);
		Static3.aBoolean1 = true;
	}
}
