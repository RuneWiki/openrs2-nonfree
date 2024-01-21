import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ca", name = "kb", descriptor = "Lclient!pe;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ca", name = "sb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_231 = Static169.method2903("::fpsoff");

	@OriginalMember(owner = "client!ca", name = "tb", descriptor = "[I")
	public static int[] anIntArray83 = new int[32];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZIZ)Lclient!ed;")
	public static Class23 method350(@OriginalArg(1) int arg0) {
		return Static122.method2773(arg0, true);
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
	public static void method352() {
		aClass23_231 = null;
		anImage1 = null;
		aClass63_1 = null;
		aShortArray5 = null;
		anIntArray83 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!wc;Lclient!wc;)V")
	public static void method354(@OriginalArg(1) Class1_Sub1_Sub12_Sub3_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub12_Sub3_Sub1 arg1) {
		if (Static5.aBoolean218) {
			Static22.method395(arg0, arg1);
			return;
		}
		if (Static156.anInt3821 == 0 || Static156.anInt3821 == 5) {
			arg0.method3039(Static116.aClass23_1145, 382, 225, 16777215, -1);
			Static150.method3019(230, 233, 304, 34, 9179409);
			Static150.method3019(231, 234, 302, 32, 0);
			Static150.method3024(232, 235, Static86.anInt2301 * 3, 30, 9179409);
			Static150.method3024(Static86.anInt2301 * 3 + 232, 235, 300 - Static86.anInt2301 * 3, 30, 0);
			arg0.method3039(Static61.aClass23_606, 382, 256, 16777215, -1);
		}
		@Pc(116) short local116;
		@Pc(124) int local124;
		if (Static156.anInt3821 == 20) {
			Static32.aClass1_Sub1_Sub12_Sub4_3.method2746(382 - Static32.aClass1_Sub1_Sub12_Sub4_3.anInt3905 / 2, -(Static32.aClass1_Sub1_Sub12_Sub4_3.anInt3907 / 2) + 271);
			local116 = 211;
			arg0.method3039(Static61.aClass23_604, 382, 211, 16776960, 0);
			local124 = local116 + 15;
			arg0.method3039(Static61.aClass23_610, 382, 226, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			arg0.method3039(Static61.aClass23_602, 382, 241, 16776960, 0);
			@Pc(140) int local140 = local132 + 15;
			@Pc(141) int local141 = local140 + 10;
			arg0.method3058(Static149.method2571(new Class23[] { Static158.aClass23_1485, Static136.method3049(Static61.aClass23_612) }), 272, 266, 16777215, 0);
			@Pc(161) int local161 = local141 + 15;
			arg0.method3058(Static149.method2571(new Class23[] { Static80.aClass23_789, Static61.aClass23_608.method647() }), 274, 281, 16777215, 0);
			@Pc(182) int local182 = local161 + 15;
		}
		if (Static156.anInt3821 == 10) {
			Static32.aClass1_Sub1_Sub12_Sub4_3.method2746(202, 171);
			if (Static177.anInt4203 == 0) {
				local116 = 251;
				arg0.method3039(Static77.aClass23_771, 382, 251, 16776960, 0);
				Static54.aClass1_Sub1_Sub12_Sub4_4.method2746(229, 271);
				local124 = local116 + 30;
				arg0.method3052(Static76.aClass23_752, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static54.aClass1_Sub1_Sub12_Sub4_4.method2746(389, 271);
				arg0.method3052(Static152.aClass23_1329, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static177.anInt4203 == 2) {
				local116 = 211;
				arg0.method3039(Static61.aClass23_604, 382, 211, 16776960, 0);
				local124 = local116 + 15;
				arg0.method3039(Static61.aClass23_610, 382, 226, 16776960, 0);
				local124 += 15;
				arg0.method3039(Static61.aClass23_602, 382, 241, 16776960, 0);
				local124 += 15;
				@Pc(244) boolean local244;
				if (Static109.anInt2819 == 0 && Static26.anInt845 % 40 < 20 && Static108.aBoolean94) {
					local244 = true;
				} else {
					local244 = false;
				}
				local124 += 10;
				arg0.method3058(Static149.method2571(new Class23[] { Static158.aClass23_1485, Static136.method3049(Static61.aClass23_612), local244 ? Static94.aClass23_921 : Static61.aClass23_605 }), 272, 266, 16777215, 0);
				if (Static109.anInt2819 == 1 && Static26.anInt845 % 40 < 20 && Static108.aBoolean94) {
					local244 = true;
				} else {
					local244 = false;
				}
				local124 += 15;
				arg0.method3058(Static149.method2571(new Class23[] { Static80.aClass23_789, Static61.aClass23_608.method647(), local244 ? Static94.aClass23_921 : Static61.aClass23_605 }), 274, 281, 16777215, 0);
				local124 += 15;
				Static54.aClass1_Sub1_Sub12_Sub4_4.method2746(229, 301);
				arg0.method3039(Static157.aClass23_1481, 302, 326, 16777215, 0);
				Static54.aClass1_Sub1_Sub12_Sub4_4.method2746(389, 301);
				arg0.method3039(Static139.aClass23_1332, 462, 326, 16777215, 0);
			} else if (Static177.anInt4203 == 3) {
				arg0.method3039(Static147.aClass23_1409, 382, 211, 16776960, 0);
				local116 = 236;
				arg0.method3039(Static153.aClass23_1445, 382, 236, 16777215, 0);
				local124 = local116 + 15;
				arg0.method3039(Static98.aClass23_963, 382, 251, 16777215, 0);
				local124 += 15;
				arg0.method3039(Static25.aClass23_275, 382, 266, 16777215, 0);
				local124 += 15;
				arg0.method3039(Static95.aClass23_932, 382, 281, 16777215, 0);
				Static54.aClass1_Sub1_Sub12_Sub4_4.method2746(309, 301);
				arg0.method3039(Static139.aClass23_1332, 382, 326, 16777215, 0);
				local124 += 15;
			}
		}
		if (Static62.anInt1652 != 1) {
			if (Static182.anInt4381 > 0) {
				Static94.method1627(Static182.anInt4381);
				Static182.anInt4381 = 0;
			}
			Static109.method1951();
		}
		Static138.aClass1_Sub1_Sub12_Sub4Array9[Static142.aBoolean183 ? 1 : 0].method2746(725, 463);
		if (Static156.anInt3821 <= 5 || Static95.anInt2462 == 2 || Static37.anInt994 != 0) {
			return;
		}
		if (Static7.aClass1_Sub1_Sub12_Sub4_1 == null) {
			Static7.aClass1_Sub1_Sub12_Sub4_1 = Static170.method477(Static140.aClass30_Sub1_14, Static61.aClass23_605, Static2.aClass23_77);
			return;
		}
		Static7.aClass1_Sub1_Sub12_Sub4_1.method2746(5, 463);
		arg0.method3039(Static149.method2571(new Class23[] { Static25.aClass23_278, Static149.aClass23_1420, Static27.method498(Static86.anInt2304) }), 55, 478, 16777215, 0);
		if (Static77.aClass82_1 == null) {
			arg1.method3039(Static74.aClass23_735, 55, 492, 16777215, 0);
		} else {
			arg1.method3039(Static47.aClass23_483, 55, 492, 16777215, 0);
		}
	}
}
