import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "[Lclient!qh;")
	public static final Class3_Sub3_Sub6_Sub1[] aClass3_Sub3_Sub6_Sub1Array1 = new Class3_Sub3_Sub6_Sub1[2048];

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!qq;IILclient!ql;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5003(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static291.aClass28_132 = arg0;
		Static339.anInt5697 = arg1;
		Static357.aClass132_4 = arg3;
		Static439.aBoolean490 = Static291.aClass28_132.method3574() > 0;
		Static165.anInt2942 = arg4 >> Static301.anInt2759;
		Static97.anInt1799 = arg6 >> Static301.anInt2759;
		Static385.anInt6349 = arg4;
		Static352.anInt5944 = arg6;
		Static72.anInt1493 = arg5;
		Static167.anInt2998 = Static165.anInt2942 - Static99.anInt1813;
		if (Static167.anInt2998 < 0) {
			Static62.anInt1307 = -Static167.anInt2998;
			Static167.anInt2998 = 0;
		} else {
			Static62.anInt1307 = 0;
		}
		Static57.anInt1201 = Static97.anInt1799 - Static99.anInt1813;
		if (Static57.anInt1201 < 0) {
			Static58.anInt1222 = -Static57.anInt1201;
			Static57.anInt1201 = 0;
		} else {
			Static58.anInt1222 = 0;
		}
		Static117.anInt2049 = Static165.anInt2942 + Static99.anInt1813;
		if (Static117.anInt2049 > Static401.anInt6621) {
			Static117.anInt2049 = Static401.anInt6621;
		}
		Static329.anInt5591 = Static97.anInt1799 + Static99.anInt1813;
		if (Static329.anInt5591 > Static364.anInt6134) {
			Static329.anInt5591 = Static364.anInt6134;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static99.anInt1813 + Static99.anInt1813 + 2; local74++) {
			for (local77 = 0; local77 < Static99.anInt1813 + Static99.anInt1813 + 2; local77++) {
				local84 = Static165.anInt2942 + local74 - Static99.anInt1813;
				local90 = Static97.anInt1799 + local77 - Static99.anInt1813;
				if (local84 >= 0 && local90 >= 0 && local84 < Static401.anInt6621 && local90 < Static364.anInt6134) {
					@Pc(104) int local104 = local84 << Static301.anInt2759;
					@Pc(108) int local108 = local90 << Static301.anInt2759;
					@Pc(124) int local124 = Static93.aClass84Array1[Static93.aClass84Array1.length - 1].method5322(local84, local90) - (0x3E8 << Static301.anInt2759 - 7);
					@Pc(144) int local144 = Static365.aClass84Array3 == null ? Static93.aClass84Array1[0].method5322(local84, local90) + Static22.anInt397 : Static365.aClass84Array3[0].method5322(local84, local90) + Static22.anInt397;
					Static87.aBooleanArrayArray3[local74][local77] = Static291.aClass28_132.method3511(local104, local124, local108, local104, local144, local108);
				} else {
					Static87.aBooleanArrayArray3[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static99.anInt1813 + Static99.anInt1813 + 1; local77++) {
			for (local84 = 0; local84 < Static99.anInt1813 + Static99.anInt1813 + 1; local84++) {
				Static27.aBooleanArrayArray2[local77][local84] = Static87.aBooleanArrayArray3[local77][local84] || Static87.aBooleanArrayArray3[local77 + 1][local84] || Static87.aBooleanArrayArray3[local77][local84 + 1] || Static87.aBooleanArrayArray3[local77 + 1][local84 + 1];
			}
		}
		Static232.anIntArray339 = arg8;
		Static173.anIntArray281 = arg9;
		Static18.anIntArray23 = arg10;
		Static393.anIntArray495 = arg11;
		Static327.anIntArray488 = arg12;
		Static275.method4185();
		Static288.method4291();
		for (@Pc(260) Class48_Sub6 local260 = (Class48_Sub6) Static412.aClass128_10.method2831(); local260 != null; local260 = (Class48_Sub6) Static412.aClass128_10.method2832()) {
			local260.method5436();
			Static84.method1519(local260);
		}
		if (Static439.aBoolean490) {
			for (local90 = 0; local90 < Static208.anInt3623; local90++) {
				Static304.aClass66Array1[local90].method1552(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static291.aClass28_132.method3498(0);
			if (Static19.aClass10_1 == null || Static19.aClass10_1 instanceof Class10_Sub1) {
				Static19.aClass10_1 = new Class10_Sub2();
			}
		} else if (Static19.aClass10_1 == null || Static19.aClass10_1 instanceof Class10_Sub2) {
			Static19.aClass10_1 = new Class10_Sub1();
		}
		Static19.aClass10_1.method5374(arg2);
		Static19.aClass10_1.method5381();
		if (Static280.aClass189ArrayArrayArray3 != null) {
			Static165.method2688(true);
			Static19.aClass10_1.method5379(22);
			Static418.method5688(arg2, null, 0, (byte) 0, arg15, arg16);
			Static19.aClass10_1.method5381();
			Static19.aClass10_1.method5379(23);
			Static165.method2688(false);
		}
		Static418.method5688(arg2, arg7, arg13, arg14, arg15, arg16);
		Static19.aClass10_1.method5381();
		Static19.aClass10_1.method5375();
		Static19.aClass10_1.method5381();
		if (arg2 > 1) {
			Static291.aClass28_132.method3490(0);
		}
		Static291.aClass28_132.method3504(0, null);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)I")
	public static int method5005(@OriginalArg(0) int arg0) {
		if (Static103.aClass30_1 != null) {
			Static103.aClass30_1.method741();
			Static103.aClass30_1 = null;
		}
		Static188.anInt3289++;
		if (Static188.anInt3289 > 4) {
			Static400.anInt6607 = 0;
			Static188.anInt3289 = 0;
			return arg0;
		}
		if (Static172.anInt3043 == Static401.anInt6633) {
			Static172.anInt3043 = Static377.anInt6697;
		} else {
			Static172.anInt3043 = Static401.anInt6633;
		}
		Static400.anInt6607 = 0;
		return -1;
	}
}
