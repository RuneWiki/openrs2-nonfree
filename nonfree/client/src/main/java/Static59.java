import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!wb;")
	public static Class2_Sub17 aClass2_Sub17_4 = new Class2_Sub17(new byte[5000]);

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lclient!i;")
	public static Class32 aClass32_34 = new Class32(64);

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Lclient!wd;")
	private static Class80 aClass80_628 = Static2.method59("Select");

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "Lclient!wd;")
	public static Class80 aClass80_629 = aClass80_628;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
	public static int anInt1769 = -1;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "Lclient!wd;")
	public static Class80 aClass80_630 = Static2.method59("p12_full");

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_631 = null;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method1042(@OriginalArg(0) int arg0) {
		Static8.method136(arg0);
		Static10.method174(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!wd;ZILclient!wd;I)V")
	public static void method1043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class80 arg4, @OriginalArg(6) int arg5) {
		if (Static103.anInt2679 >= 500) {
			return;
		}
		if (arg4.method1999() <= 0) {
			Static2.aClass80Array1[Static103.anInt2679] = arg2;
		} else {
			Static2.aClass80Array1[Static103.anInt2679] = Static93.method1444(new Class80[] { arg2, Static45.aClass80_832, arg4 });
		}
		Static57.anIntArray218[Static103.anInt2679] = arg1;
		Static8.anIntArray19[Static103.anInt2679] = arg0;
		Static77.anIntArray262[Static103.anInt2679] = arg3;
		Static96.anIntArray325[Static103.anInt2679] = arg5;
		Static103.anInt2679++;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!v;ILclient!v;)V")
	public static void method1044(@OriginalArg(0) Class2_Sub1_Sub9_Sub4 arg0, @OriginalArg(2) Class2_Sub1_Sub9_Sub4 arg1) {
		if (Static82.aBoolean237) {
			Static44.method742(arg0, arg1);
			return;
		}
		if (Static114.anInt2934 == 0 || Static114.anInt2934 == 5) {
			arg0.method1924(Static71.aClass80_727, 382, 225, 16777215);
			Static99.method1888(230, 233, 304, 34, 9179409);
			Static99.method1888(231, 234, 302, 32, 0);
			Static99.method1894(232, 235, Static42.anInt1250 * 3, 30, 9179409);
			Static99.method1894(Static42.anInt1250 * 3 + 232, 235, 300 - Static42.anInt1250 * 3, 30, 0);
			arg0.method1924(Static79.aClass80_789, 382, 256, 16777215);
		}
		@Pc(107) short local107;
		@Pc(115) int local115;
		if (Static114.anInt2934 == 20) {
			Static78.aClass2_Sub1_Sub9_Sub3_48.method1494(382 - Static78.aClass2_Sub1_Sub9_Sub3_48.anInt2487 / 2, -(Static78.aClass2_Sub1_Sub9_Sub3_48.anInt2482 / 2) + 271);
			local107 = 211;
			arg0.method1927(Static79.aClass80_785, 382, 211, 16776960, true);
			local115 = local107 + 15;
			arg0.method1927(Static79.aClass80_791, 382, 226, 16776960, true);
			@Pc(123) int local123 = local115 + 15;
			arg0.method1927(Static79.aClass80_793, 382, 241, 16776960, true);
			@Pc(131) int local131 = local123 + 15;
			@Pc(132) int local132 = local131 + 10;
			arg0.method1919(Static93.method1444(new Class80[] { Static82.aClass80_1173, Static79.aClass80_786 }), 292, 266, 16777215, true);
			@Pc(151) int local151 = local132 + 15;
			arg0.method1919(Static93.method1444(new Class80[] { Static17.aClass80_230, Static79.aClass80_794.method2009() }), 294, 281, 16777215, true);
			@Pc(172) int local172 = local151 + 15;
		}
		if (Static114.anInt2934 == 10) {
			Static78.aClass2_Sub1_Sub9_Sub3_48.method1494(202, 171);
			if (Static124.anInt3137 == 0) {
				local107 = 251;
				arg0.method1927(Static105.aClass80_910, 382, 251, 16776960, true);
				local115 = local107 + 30;
				Static70.aClass2_Sub1_Sub9_Sub3_41.method1494(229, 271);
				arg0.method1912(Static19.aClass80_273, 229, 271, 144, 40, 16777215, true, 1, 1, 0);
				Static70.aClass2_Sub1_Sub9_Sub3_41.method1494(389, 271);
				arg0.method1912(Static124.aClass80_1200, 389, 271, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static124.anInt3137 == 2) {
				local107 = 211;
				arg0.method1927(Static79.aClass80_785, 382, 211, 16776960, true);
				local115 = local107 + 15;
				arg0.method1927(Static79.aClass80_791, 382, 226, 16776960, true);
				local115 += 15;
				arg0.method1927(Static79.aClass80_793, 382, 241, 16776960, true);
				local115 += 15;
				local115 += 10;
				arg0.method1919(Static93.method1444(new Class80[] { Static82.aClass80_1173, Static79.aClass80_786, Static95.anInt2452 == 0 & Static10.anInt300 % 40 < 20 ? Static91.aClass80_875 : Static79.aClass80_788 }), 292, 266, 16777215, true);
				local115 += 15;
				arg0.method1919(Static93.method1444(new Class80[] { Static17.aClass80_230, Static79.aClass80_794.method2009(), Static95.anInt2452 == 1 & Static10.anInt300 % 40 < 20 ? Static91.aClass80_875 : Static79.aClass80_788 }), 294, 281, 16777215, true);
				local115 += 15;
				Static70.aClass2_Sub1_Sub9_Sub3_41.method1494(229, 301);
				arg0.method1927(Static88.aClass80_853, 302, 326, 16777215, true);
				Static70.aClass2_Sub1_Sub9_Sub3_41.method1494(389, 301);
				arg0.method1927(Static71.aClass80_730, 462, 326, 16777215, true);
			} else if (Static124.anInt3137 == 3) {
				local107 = 236;
				arg0.method1927(Static53.aClass80_576, 382, 211, 16776960, true);
				arg0.method1927(Static87.aClass80_897, 382, 236, 16777215, true);
				local115 = local107 + 15;
				arg0.method1927(Static24.aClass80_318, 382, 251, 16777215, true);
				local115 += 15;
				arg0.method1927(Static74.aClass80_753, 382, 266, 16777215, true);
				local115 += 15;
				arg0.method1927(Static121.aClass80_1180, 382, 281, 16777215, true);
				Static70.aClass2_Sub1_Sub9_Sub3_41.method1494(309, 301);
				local115 += 15;
				arg0.method1927(Static71.aClass80_730, 382, 326, 16777215, true);
			}
		}
		if (Static25.anInt995 > 0) {
			Static13.method223(Static25.anInt995);
			Static25.anInt995 = 0;
		}
		Static119.method1006();
		Static50.aClass2_Sub1_Sub9_Sub3Array4[Static22.aBoolean63 ? 1 : 0].method1494(725, 463);
		if (Static114.anInt2934 > 5 && Static28.anInt2308 != 2 && Static81.anInt2043 == 0) {
			if (Static108.aClass2_Sub1_Sub9_Sub3_71 == null) {
				Static108.aClass2_Sub1_Sub9_Sub3_71 = Static73.method1164(Static18.aClass80_258, Static57.aClass11_Sub1_11, Static79.aClass80_788);
			} else {
				Static108.aClass2_Sub1_Sub9_Sub3_71.method1494(5, 463);
				arg0.method1927(Static93.method1444(new Class80[] { Static16.aClass80_175, Static18.aClass80_256, Static28.method1422(Static106.anInt2839) }), 55, 478, 16777215, true);
				if (Static103.aClass15_1 == null) {
					arg1.method1927(Static35.aClass80_397, 55, 492, 16777215, true);
				} else {
					arg1.method1927(Static121.aClass80_1184, 55, 492, 16777215, true);
				}
			}
		}
		try {
			@Pc(610) Graphics local610 = Static119.aCanvas2.getGraphics();
			Static19.aClass22_4.method1065(local610, 0, 0);
		} catch (@Pc(618) Exception local618) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1045() {
		aClass2_Sub17_4 = null;
		aClass32_34 = null;
		aClass80_628 = null;
		aClass80_629 = null;
		aClass80_630 = null;
		aClass80_631 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
	public static int method1046(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return local10 + arg0;
	}
}
