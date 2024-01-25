import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
	public static int anInt1326;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
	public static final int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "Ljava/lang/String;")
	public static final String aString75 = "wave:";

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lclient!wf;")
	private static final Class215 aClass215_1 = new Class215(64);

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "Ljava/lang/String;")
	public static final String aString76 = "slide:";

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V")
	public static void method1170() {
		Static56.aClass66_19.method1944(5);
		Static38.aClass66_11.method1944(5);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Lclient!jb;")
	public static Class5_Sub9_Sub12 method1171(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub12 local10 = (Class5_Sub9_Sub12) aClass215_1.method5683((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static130.aClass170_56.method4584(1, arg0 & 0x7FFF);
		} else {
			local25 = Static344.aClass170_10.method4584(1, arg0);
		}
		local10 = new Class5_Sub9_Sub12();
		if (local25 != null) {
			local10.method2633(new Class5_Sub1(local25));
		}
		if (arg0 >= 32768) {
			local10.method2638();
		}
		aClass215_1.method5687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!en;IILclient!vr;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1173(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static98.aClass59_3 = arg0;
		Static112.anInt2423 = arg1;
		Static108.aClass112_1 = arg3;
		Static65.aBoolean130 = Static98.aClass59_3.method4796() > 0;
		Static210.anInt5625 = arg4 >> 7;
		Static103.anInt2249 = arg6 >> 7;
		Static10.anInt345 = arg4;
		Static21.anInt6206 = arg6;
		Static337.anInt6349 = arg5;
		Static266.anInt5098 = Static210.anInt5625 - Static98.anInt2185;
		if (Static266.anInt5098 < 0) {
			Static20.anInt552 = -Static266.anInt5098;
			Static266.anInt5098 = 0;
		} else {
			Static20.anInt552 = 0;
		}
		Static233.anInt4557 = Static103.anInt2249 - Static98.anInt2185;
		if (Static233.anInt4557 < 0) {
			Static320.anInt6059 = -Static233.anInt4557;
			Static233.anInt4557 = 0;
		} else {
			Static320.anInt6059 = 0;
		}
		Static271.anInt5206 = Static210.anInt5625 + Static98.anInt2185;
		if (Static271.anInt5206 > Static12.anInt378) {
			Static271.anInt5206 = Static12.anInt378;
		}
		Static166.anInt3360 = Static103.anInt2249 + Static98.anInt2185;
		if (Static166.anInt3360 > Static248.anInt4822) {
			Static166.anInt3360 = Static248.anInt4822;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static98.anInt2185 + Static98.anInt2185 + 2; local74++) {
			for (local77 = 0; local77 < Static98.anInt2185 + Static98.anInt2185 + 2; local77++) {
				local84 = Static210.anInt5625 + local74 - Static98.anInt2185;
				local90 = Static103.anInt2249 + local77 - Static98.anInt2185;
				if (local84 >= 0 && local90 >= 0 && local84 < Static12.anInt378 && local90 < Static248.anInt4822) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static262.aClass3Array3[3].method5638(local84, local90) - 1000;
					@Pc(137) int local137 = Static93.aClass3Array1 == null ? Static262.aClass3Array3[0].method5638(local84, local90) + 128 : Static93.aClass3Array1[0].method5638(local84, local90) + 128;
					Static187.aBooleanArrayArray43[local74][local77] = Static98.aClass59_3.method4833(local104, local117, local108, local104, local137, local108);
				} else {
					Static187.aBooleanArrayArray43[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static98.anInt2185 + Static98.anInt2185 + 1; local77++) {
			for (local84 = 0; local84 < Static98.anInt2185 + Static98.anInt2185 + 1; local84++) {
				Static240.aBooleanArrayArray31[local77][local84] = Static187.aBooleanArrayArray43[local77][local84] || Static187.aBooleanArrayArray43[local77 + 1][local84] || Static187.aBooleanArrayArray43[local77][local84 + 1] || Static187.aBooleanArrayArray43[local77 + 1][local84 + 1];
			}
		}
		Static148.anIntArray203 = arg8;
		Static148.anIntArray202 = arg9;
		Static334.anIntArray544 = arg10;
		Static345.anIntArray553 = arg11;
		Static26.anIntArray31 = arg12;
		Static286.method4899();
		Static322.method5426();
		for (@Pc(253) Class63_Sub3 local253 = (Class63_Sub3) Static161.aClass24_1.method619(); local253 != null; local253 = (Class63_Sub3) Static161.aClass24_1.method627()) {
			local253.method5690();
			Static161.method2996(local253);
		}
		if (Static65.aBoolean130) {
			for (local90 = 0; local90 < Static132.anInt2864; local90++) {
				Static233.aClass5_Sub13_Sub1Array3[local90].method1925(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static98.aClass59_3.method4852(0);
			if (Static134.aClass28_1 == null || Static134.aClass28_1 instanceof Class28_Sub1) {
				Static134.aClass28_1 = new Class28_Sub2();
			}
		} else if (Static134.aClass28_1 == null || Static134.aClass28_1 instanceof Class28_Sub2) {
			Static134.aClass28_1 = new Class28_Sub1();
		}
		Static134.aClass28_1.method5711(arg2);
		Static134.aClass28_1.method5716();
		if (Static147.aClass51ArrayArrayArray2 != null) {
			Static164.method3036(true);
			Static134.aClass28_1.method5719(22);
			Static337.method5622(arg2, null, 0, (byte) 0, arg15, arg16);
			Static134.aClass28_1.method5716();
			Static134.aClass28_1.method5719(23);
			Static164.method3036(false);
		}
		Static337.method5622(arg2, arg7, arg13, arg14, arg15, arg16);
		Static134.aClass28_1.method5716();
		Static134.aClass28_1.method5718();
		Static134.aClass28_1.method5716();
		if (arg2 > 1) {
			Static98.aClass59_3.method4847(0);
		}
		Static98.aClass59_3.method4885(0, null);
	}
}
