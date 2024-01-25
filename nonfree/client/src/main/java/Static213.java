import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!aq;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public static int anInt3924;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt3923 = -2;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILclient!pi;Lclient!pi;)V")
	public static void method3601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) Class12_Sub2 arg4) {
		@Pc(4) Class227 local4 = Static115.method2162(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass12_Sub2_2 = arg3;
			local4.aClass12_Sub2_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!km;IILclient!dr;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3602(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static315.aClass82_7 = arg0;
		Static16.anInt398 = arg1;
		Static382.aClass54_5 = arg3;
		Static161.aBoolean216 = Static315.aClass82_7.method4532() > 0;
		Static33.anInt702 = arg4 >> Static315.anInt5584;
		Static345.anInt6083 = arg6 >> Static315.anInt5584;
		Static174.anInt6735 = arg4;
		Static34.anInt736 = arg6;
		Static23.anInt555 = arg5;
		Static218.anInt4049 = Static33.anInt702 - Static273.anInt4882;
		if (Static218.anInt4049 < 0) {
			Static166.anInt2978 = -Static218.anInt4049;
			Static218.anInt4049 = 0;
		} else {
			Static166.anInt2978 = 0;
		}
		Static276.anInt4907 = Static345.anInt6083 - Static273.anInt4882;
		if (Static276.anInt4907 < 0) {
			Static276.anInt4912 = -Static276.anInt4907;
			Static276.anInt4907 = 0;
		} else {
			Static276.anInt4912 = 0;
		}
		Static263.anInt4660 = Static33.anInt702 + Static273.anInt4882;
		if (Static263.anInt4660 > Static166.anInt2967) {
			Static263.anInt4660 = Static166.anInt2967;
		}
		Static376.anInt6609 = Static345.anInt6083 + Static273.anInt4882;
		if (Static376.anInt6609 > Static244.anInt1024) {
			Static376.anInt6609 = Static244.anInt1024;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static273.anInt4882 + Static273.anInt4882 + 2; local74++) {
			for (local77 = 0; local77 < Static273.anInt4882 + Static273.anInt4882 + 2; local77++) {
				local84 = Static33.anInt702 + local74 - Static273.anInt4882;
				local90 = Static345.anInt6083 + local77 - Static273.anInt4882;
				if (local84 >= 0 && local90 >= 0 && local84 < Static166.anInt2967 && local90 < Static244.anInt1024) {
					@Pc(104) int local104 = local84 << Static315.anInt5584;
					@Pc(108) int local108 = local90 << Static315.anInt5584;
					@Pc(120) int local120 = Static39.aClass33Array2[Static39.aClass33Array2.length - 1].method4057(local84, local90) - 1000;
					@Pc(140) int local140 = Static345.aClass33Array3 == null ? Static39.aClass33Array2[0].method4057(local84, local90) + Static292.anInt5158 : Static345.aClass33Array3[0].method4057(local84, local90) + Static292.anInt5158;
					Static15.aBooleanArrayArray1[local74][local77] = Static315.aClass82_7.method4530(local104, local120, local108, local104, local140, local108);
				} else {
					Static15.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static273.anInt4882 + Static273.anInt4882 + 1; local77++) {
			for (local84 = 0; local84 < Static273.anInt4882 + Static273.anInt4882 + 1; local84++) {
				Static227.aBooleanArrayArray5[local77][local84] = Static15.aBooleanArrayArray1[local77][local84] || Static15.aBooleanArrayArray1[local77 + 1][local84] || Static15.aBooleanArrayArray1[local77][local84 + 1] || Static15.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static77.anIntArray196 = arg8;
		Static377.anIntArray796 = arg9;
		Static355.anIntArray756 = arg10;
		Static204.anIntArray452 = arg11;
		Static92.anIntArray226 = arg12;
		Static238.method3869();
		Static63.method1157();
		for (@Pc(256) Class22_Sub8 local256 = (Class22_Sub8) Static371.aClass56_7.method1259(); local256 != null; local256 = (Class22_Sub8) Static371.aClass56_7.method1254()) {
			local256.method5237();
			Static178.method2899(local256);
		}
		if (Static161.aBoolean216) {
			for (local90 = 0; local90 < Static356.anInt6269; local90++) {
				Static305.aClass2_Sub14_Sub1Array2[local90].method2108(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static315.aClass82_7.method4522(0);
			if (Static42.aClass51_1 == null || Static42.aClass51_1 instanceof Class51_Sub2) {
				Static42.aClass51_1 = new Class51_Sub1();
			}
		} else if (Static42.aClass51_1 == null || Static42.aClass51_1 instanceof Class51_Sub1) {
			Static42.aClass51_1 = new Class51_Sub2();
		}
		Static42.aClass51_1.method2511(arg2);
		Static42.aClass51_1.method2510();
		if (Static91.aClass227ArrayArrayArray1 != null) {
			Static78.method1407(true);
			Static42.aClass51_1.method2516(22);
			Static219.method3701(arg2, null, 0, (byte) 0, arg15, arg16);
			Static42.aClass51_1.method2510();
			Static42.aClass51_1.method2516(23);
			Static78.method1407(false);
		}
		Static219.method3701(arg2, arg7, arg13, arg14, arg15, arg16);
		Static42.aClass51_1.method2510();
		Static42.aClass51_1.method2515();
		Static42.aClass51_1.method2510();
		if (arg2 > 1) {
			Static315.aClass82_7.method4464(0);
		}
		Static315.aClass82_7.method4489(0, null);
	}
}
