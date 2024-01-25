import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "[Lclient!o;")
	public static Class55[] aClass55Array2;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "Lclient!la;")
	public static final Class136 aClass136_90 = new Class136(87, -1);

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "Z")
	public static boolean aBoolean253 = false;

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!iu", name = "K", descriptor = "[I")
	public static final int[] anIntArray198 = new int[1000];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZI)I")
	public static int method2877(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!qa;IILclient!n;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2879(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static157.aClass167_7 = arg0;
		Static427.anInt7198 = arg1;
		Static56.aClass11_2 = arg3;
		Static30.aBoolean29 = Static157.aClass167_7.method5986() > 0;
		Static366.anInt6203 = arg4 >> Static437.anInt7308;
		Static465.anInt3909 = arg6 >> Static437.anInt7308;
		Static257.anInt4288 = arg4;
		Static344.anInt5818 = arg6;
		Static207.anInt3661 = arg5;
		Static266.anInt4437 = Static366.anInt6203 - Static24.anInt2908;
		if (Static266.anInt4437 < 0) {
			Static246.anInt4231 = -Static266.anInt4437;
			Static266.anInt4437 = 0;
		} else {
			Static246.anInt4231 = 0;
		}
		Static423.anInt7132 = Static465.anInt3909 - Static24.anInt2908;
		if (Static423.anInt7132 < 0) {
			Static192.anInt3505 = -Static423.anInt7132;
			Static423.anInt7132 = 0;
		} else {
			Static192.anInt3505 = 0;
		}
		Static33.anInt605 = Static366.anInt6203 + Static24.anInt2908;
		if (Static33.anInt605 > Static459.anInt5916) {
			Static33.anInt605 = Static459.anInt5916;
		}
		Static439.anInt7312 = Static465.anInt3909 + Static24.anInt2908;
		if (Static439.anInt7312 > Static342.anInt5746) {
			Static439.anInt7312 = Static342.anInt5746;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static24.anInt2908 + Static24.anInt2908 + 2; local74++) {
			for (local77 = 0; local77 < Static24.anInt2908 + Static24.anInt2908 + 2; local77++) {
				local84 = Static366.anInt6203 + local74 - Static24.anInt2908;
				local90 = Static465.anInt3909 + local77 - Static24.anInt2908;
				if (local84 >= 0 && local90 >= 0 && local84 < Static459.anInt5916 && local90 < Static342.anInt5746) {
					@Pc(104) int local104 = local84 << Static437.anInt7308;
					@Pc(108) int local108 = local90 << Static437.anInt7308;
					@Pc(124) int local124 = aClass55Array2[aClass55Array2.length - 1].oa(local84, local90) - (0x3E8 << Static437.anInt7308 - 7);
					@Pc(144) int local144 = Static349.aClass55Array3 == null ? aClass55Array2[0].oa(local84, local90) + Static99.anInt1803 : Static349.aClass55Array3[0].oa(local84, local90) + Static99.anInt1803;
					Static111.aBooleanArrayArray4[local74][local77] = Static157.aClass167_7.TA(local104, local124, local108, local104, local144, local108);
				} else {
					Static111.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static24.anInt2908 + Static24.anInt2908 + 1; local77++) {
			for (local84 = 0; local84 < Static24.anInt2908 + Static24.anInt2908 + 1; local84++) {
				Static39.aBooleanArrayArray1[local77][local84] = Static111.aBooleanArrayArray4[local77][local84] || Static111.aBooleanArrayArray4[local77 + 1][local84] || Static111.aBooleanArrayArray4[local77][local84 + 1] || Static111.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static107.anIntArray94 = arg8;
		Static105.anIntArray92 = arg9;
		Static251.anIntArray395 = arg10;
		Static427.anIntArray460 = arg11;
		Static92.anIntArray76 = arg12;
		Static337.method4676();
		Static434.method5873();
		for (@Pc(260) Class23_Sub5 local260 = (Class23_Sub5) Static74.aClass194_1.method4577(); local260 != null; local260 = (Class23_Sub5) Static74.aClass194_1.method4580()) {
			local260.method5853();
			Static21.method6251(local260);
		}
		if (Static30.aBoolean29) {
			for (local90 = 0; local90 < Static329.anInt5518; local90++) {
				Static197.aClass226Array1[local90].method5242(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static157.aClass167_7.method5983(0);
			if (Static316.aClass12_1 == null || Static316.aClass12_1 instanceof Class12_Sub1) {
				Static316.aClass12_1 = new Class12_Sub2();
			}
		} else if (Static316.aClass12_1 == null || Static316.aClass12_1 instanceof Class12_Sub2) {
			Static316.aClass12_1 = new Class12_Sub1();
		}
		Static316.aClass12_1.method3108(arg2);
		Static316.aClass12_1.method3111();
		if (Static137.aClass227ArrayArrayArray1 != null) {
			Static234.method3420(true);
			Static316.aClass12_1.method3103(22);
			Static74.method1317(arg2, null, 0, (byte) 0, arg15, arg16);
			Static316.aClass12_1.method3111();
			Static316.aClass12_1.method3103(23);
			Static234.method3420(false);
		}
		Static74.method1317(arg2, arg7, arg13, arg14, arg15, arg16);
		Static316.aClass12_1.method3111();
		Static316.aClass12_1.method3107();
		Static316.aClass12_1.method3111();
		if (arg2 > 1) {
			Static157.aClass167_7.method6000(0);
		}
		Static157.aClass167_7.method5985(0, null);
	}
}
