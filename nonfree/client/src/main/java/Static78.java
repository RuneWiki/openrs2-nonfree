import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[Lclient!wf;")
	public static Class8_Sub24[] aClass8_Sub24Array1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
	public static int[] anIntArray238 = new int[2000];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
	public static int[] anIntArray239 = new int[32];

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public static int anInt1847 = 0;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array14 = new Class34[100];

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!ud;")
	public static Class8_Sub20_Sub1 aClass8_Sub20_Sub1_2 = new Class8_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!ic;")
	public static Class34 aClass34_845 = Static56.method816("gelb:");

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!pb;")
	public static Class60 aClass60_2 = new Class60();

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_846 = Static56.method816("Okay");

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_847 = Static56.method816("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	public static int[] anIntArray240 = new int[128];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)I")
	public static int method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ub;Lclient!ub;)V")
	public static void method1125(@OriginalArg(1) Class8_Sub1_Sub3_Sub4_Sub1 arg0, @OriginalArg(2) Class8_Sub1_Sub3_Sub4_Sub1 arg1) {
		if (Static115.aBoolean104) {
			Static75.method1103(arg1, arg0);
			return;
		}
		if (Static61.anInt1587 == 0 || Static61.anInt1587 == 5) {
			arg0.method1753(Static104.aClass34_1117, 382, 225, 16777215, -1);
			Static110.method1738(230, 233, 304, 34, 9179409);
			Static110.method1738(231, 234, 302, 32, 0);
			Static110.method1729(232, 235, Static70.anInt1702 * 3, 30, 9179409);
			Static110.method1729(Static70.anInt1702 * 3 + 232, 235, 300 - Static70.anInt1702 * 3, 30, 0);
			arg0.method1753(Static83.aClass34_935, 382, 256, 16777215, -1);
		}
		@Pc(109) short local109;
		@Pc(117) int local117;
		if (Static61.anInt1587 == 20) {
			Static61.aClass8_Sub1_Sub3_Sub2_4.method300(382 - Static61.aClass8_Sub1_Sub3_Sub2_4.anInt484 / 2, -(Static61.aClass8_Sub1_Sub3_Sub2_4.anInt485 / 2) + 271);
			local109 = 211;
			arg0.method1753(Static83.aClass34_942, 382, 211, 16776960, 0);
			local117 = local109 + 15;
			arg0.method1753(Static83.aClass34_933, 382, 226, 16776960, 0);
			@Pc(125) int local125 = local117 + 15;
			arg0.method1753(Static83.aClass34_943, 382, 241, 16776960, 0);
			@Pc(133) int local133 = local125 + 15;
			@Pc(134) int local134 = local133 + 10;
			arg0.method1741(Static44.method669(new Class34[] { Static16.aClass34_216, Static131.method1757(Static83.aClass34_941) }), 272, 266, 16777215, 0);
			@Pc(154) int local154 = local134 + 15;
			arg0.method1741(Static44.method669(new Class34[] { Static20.aClass34_307, Static83.aClass34_936.method827() }), 274, 281, 16777215, 0);
			@Pc(175) int local175 = local154 + 15;
		}
		if (Static61.anInt1587 == 10) {
			Static61.aClass8_Sub1_Sub3_Sub2_4.method300(202, 171);
			if (Static14.anInt359 == 0) {
				local109 = 251;
				arg0.method1753(Static18.aClass34_269, 382, 251, 16776960, 0);
				local117 = local109 + 30;
				Static75.aClass8_Sub1_Sub3_Sub2_5.method300(229, 271);
				arg0.method1763(Static34.aClass34_492, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static75.aClass8_Sub1_Sub3_Sub2_5.method300(389, 271);
				arg0.method1763(Static44.aClass34_566, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static14.anInt359 == 2) {
				local109 = 211;
				arg0.method1753(Static83.aClass34_942, 382, 211, 16776960, 0);
				local117 = local109 + 15;
				arg0.method1753(Static83.aClass34_933, 382, 226, 16776960, 0);
				local117 += 15;
				arg0.method1753(Static83.aClass34_943, 382, 241, 16776960, 0);
				local117 += 15;
				local117 += 10;
				@Pc(370) boolean local370;
				if (Static113.anInt2575 == 0 && Static21.anInt655 % 40 < 20 && Static108.aBoolean99) {
					local370 = true;
				} else {
					local370 = false;
				}
				arg0.method1741(Static44.method669(new Class34[] { Static16.aClass34_216, Static131.method1757(Static83.aClass34_941), local370 ? Static123.aClass34_1339 : Static83.aClass34_940 }), 272, 266, 16777215, 0);
				local117 += 15;
				if (Static113.anInt2575 == 1 && Static21.anInt655 % 40 < 20 && Static108.aBoolean99) {
					local370 = true;
				} else {
					local370 = false;
				}
				arg0.method1741(Static44.method669(new Class34[] { Static20.aClass34_307, Static83.aClass34_936.method827(), local370 ? Static123.aClass34_1339 : Static83.aClass34_940 }), 274, 281, 16777215, 0);
				local117 += 15;
				Static75.aClass8_Sub1_Sub3_Sub2_5.method300(229, 301);
				arg0.method1753(Static120.aClass34_1322, 302, 326, 16777215, 0);
				Static75.aClass8_Sub1_Sub3_Sub2_5.method300(389, 301);
				arg0.method1753(Static62.aClass34_759, 462, 326, 16777215, 0);
			} else if (Static14.anInt359 == 3) {
				local109 = 236;
				arg0.method1753(Static101.aClass34_1108, 382, 211, 16776960, 0);
				arg0.method1753(Static92.aClass34_1019, 382, 236, 16777215, 0);
				local117 = local109 + 15;
				arg0.method1753(Static5.aClass34_36, 382, 251, 16777215, 0);
				local117 += 15;
				arg0.method1753(Static67.aClass34_773, 382, 266, 16777215, 0);
				local117 += 15;
				arg0.method1753(Static118.aClass34_1241, 382, 281, 16777215, 0);
				local117 += 15;
				Static75.aClass8_Sub1_Sub3_Sub2_5.method300(309, 301);
				arg0.method1753(Static62.aClass34_759, 382, 326, 16777215, 0);
			}
		}
		if (Static56.anInt1415 != 1) {
			if (Static61.anInt1586 > 0) {
				Static29.method518(Static61.anInt1586);
				Static61.anInt1586 = 0;
			}
			Static3.method25();
		}
		Static50.aClass8_Sub1_Sub3_Sub2Array5[Static83.aBoolean79 ? 1 : 0].method300(725, 463);
		if (Static61.anInt1587 <= 5 || Static49.anInt1314 == 2 || Static115.anInt2594 != 0) {
			return;
		}
		if (Static47.aClass8_Sub1_Sub3_Sub2_2 == null) {
			Static47.aClass8_Sub1_Sub3_Sub2_2 = Static87.method1306(Static3.aClass34_23, Static92.aClass14_Sub1_16, Static83.aClass34_940);
			return;
		}
		Static47.aClass8_Sub1_Sub3_Sub2_2.method300(5, 463);
		arg0.method1753(Static44.method669(new Class34[] { Static74.aClass34_831, Static104.aClass34_1120, Static44.method672(Static9.anInt189) }), 55, 478, 16777215, 0);
		if (Static51.aClass31_1 == null) {
			arg1.method1753(Static24.aClass34_860, 55, 492, 16777215, 0);
		} else {
			arg1.method1753(Static56.aClass34_705, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1128() {
		aClass8_Sub20_Sub1_2 = null;
		anIntArray238 = null;
		aClass34_846 = null;
		aClass8_Sub24Array1 = null;
		anIntArray239 = null;
		aClass60_2 = null;
		aClass34_845 = null;
		aClass34_847 = null;
		anIntArray240 = null;
		aClass34Array14 = null;
	}
}
