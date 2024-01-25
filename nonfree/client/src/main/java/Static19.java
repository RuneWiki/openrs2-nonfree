import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method497(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static416.aClass122_7 = arg0;
		Static23.anInt8695 = arg1;
		Static142.aClass118_5 = arg3;
		Static169.aBoolean207 = Static416.aClass122_7.method7217() > 0;
		Static393.anInt7097 = arg4 >> Static451.anInt7905;
		Static211.anInt4100 = arg6 >> Static451.anInt7905;
		Static311.anInt1617 = arg4;
		Static2.anInt5668 = arg6;
		Static334.anInt6030 = arg5;
		Static454.anInt7748 = Static393.anInt7097 - Static251.anInt4913;
		if (Static454.anInt7748 < 0) {
			Static243.anInt4851 = -Static454.anInt7748;
			Static454.anInt7748 = 0;
		} else {
			Static243.anInt4851 = 0;
		}
		Static281.anInt5279 = Static211.anInt4100 - Static251.anInt4913;
		if (Static281.anInt5279 < 0) {
			Static443.anInt7640 = -Static281.anInt5279;
			Static281.anInt5279 = 0;
		} else {
			Static443.anInt7640 = 0;
		}
		Static299.anInt5552 = Static393.anInt7097 + Static251.anInt4913;
		if (Static299.anInt5552 > Static93.anInt1898) {
			Static299.anInt5552 = Static93.anInt1898;
		}
		Static237.anInt4785 = Static211.anInt4100 + Static251.anInt4913;
		if (Static237.anInt4785 > Static382.anInt6965) {
			Static237.anInt4785 = Static382.anInt6965;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static251.anInt4913 + Static251.anInt4913 + 2; local74++) {
			for (local77 = 0; local77 < Static251.anInt4913 + Static251.anInt4913 + 2; local77++) {
				local84 = Static393.anInt7097 + local74 - Static251.anInt4913;
				local90 = Static211.anInt4100 + local77 - Static251.anInt4913;
				if (local84 >= 0 && local90 >= 0 && local84 < Static93.anInt1898 && local90 < Static382.anInt6965) {
					@Pc(104) int local104 = local84 << Static451.anInt7905;
					@Pc(108) int local108 = local90 << Static451.anInt7905;
					@Pc(124) int local124 = Static16.aClass205Array1[Static16.aClass205Array1.length - 1].ba(local84, local90) - (0x3E8 << Static451.anInt7905 - 7);
					@Pc(144) int local144 = Static209.aClass205Array2 == null ? Static16.aClass205Array1[0].ba(local84, local90) + Static201.anInt3950 : Static209.aClass205Array2[0].ba(local84, local90) + Static201.anInt3950;
					Static360.aBooleanArrayArray6[local74][local77] = Static416.aClass122_7.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static360.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static251.anInt4913 + Static251.anInt4913 + 1; local77++) {
			for (local84 = 0; local84 < Static251.anInt4913 + Static251.anInt4913 + 1; local84++) {
				Static149.aBooleanArrayArray5[local77][local84] = Static360.aBooleanArrayArray6[local77][local84] || Static360.aBooleanArrayArray6[local77 + 1][local84] || Static360.aBooleanArrayArray6[local77][local84 + 1] || Static360.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static254.anIntArray516 = arg8;
		Static508.anIntArray776 = arg9;
		Static486.anIntArray751 = arg10;
		Static415.anIntArray701 = arg11;
		Static106.anIntArray207 = arg12;
		Static251.method4232();
		Static101.method6350(Static416.aClass122_7);
		for (@Pc(261) Class72_Sub7 local261 = (Class72_Sub7) Static153.aClass299_3.method7030(); local261 != null; local261 = (Class72_Sub7) Static153.aClass299_3.method7031()) {
			local261.method6719();
			Static367.method5684(local261);
		}
		if (Static169.aBoolean207) {
			for (local90 = 0; local90 < Static246.anInt4872; local90++) {
				Static447.aClass62Array1[local90].method1459(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static416.aClass122_7.method7211(0);
			if (Static497.aClass75_1 == null || Static497.aClass75_1 instanceof Class75_Sub2) {
				Static497.aClass75_1 = new Class75_Sub1();
			}
		} else if (Static497.aClass75_1 == null || Static497.aClass75_1 instanceof Class75_Sub1) {
			Static497.aClass75_1 = new Class75_Sub2();
		}
		Static497.aClass75_1.method3834(arg2);
		Static497.aClass75_1.method3840();
		if (Static332.aClass255ArrayArrayArray3 != null) {
			Static76.method1318(true);
			Static497.aClass75_1.method3839(22);
			Static507.method7024(arg2, null, 0, (byte) 0, arg15, arg16);
			Static497.aClass75_1.method3840();
			Static497.aClass75_1.method3839(23);
			Static76.method1318(false);
		}
		Static507.method7024(arg2, arg7, arg13, arg14, arg15, arg16);
		Static497.aClass75_1.method3840();
		Static497.aClass75_1.method3836();
		Static497.aClass75_1.method3840();
		if (arg2 > 1) {
			Static416.aClass122_7.method7232(0);
		}
		Static416.aClass122_7.method7264(0, null);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!hca;")
	public static Class1_Sub5 method498(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(28) Class local28 = Class.forName("Class1_Sub5_Sub1");
			@Pc(32) Class1_Sub5 local32 = (Class1_Sub5) local28.getDeclaredConstructor().newInstance();
			local32.method2908(arg0);
			return local32;
		} catch (@Pc(39) Throwable local39) {
			@Pc(43) Class1_Sub5_Sub2 local43 = new Class1_Sub5_Sub2();
			local43.method2908(arg0);
			return local43;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public static void method499() {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(15, 0);
		local8.method4945();
	}
}
