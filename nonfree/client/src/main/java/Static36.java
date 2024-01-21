import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "Lclient!gb;")
	public static Class34 aClass34_3;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_274 = Static161.method2452("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!dc;")
	public static Class20 aClass20_270 = aClass20_274;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_272 = Static161.method2452("yellow:");

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!dc;")
	public static Class20 aClass20_271 = aClass20_272;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
	public static int anInt784 = 0;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
	public static int anInt786 = -1;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_273 = Static161.method2452("scrollbar");

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_275 = aClass20_272;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ig;Lclient!ig;I)V")
	public static void method615(@OriginalArg(0) Class5_Sub2_Sub8 arg0, @OriginalArg(1) Class5_Sub2_Sub8 arg1) {
		if (Static158.aBoolean67) {
			Static7.method167(arg1, arg0);
			return;
		}
		if (Static96.anInt2013 == 0 || Static96.anInt2013 == 5) {
			arg0.method1350(Static207.aClass20_1506, 382, 225, 16777215, -1);
			Static42.method817(230, 233, 304, 34, 9179409);
			Static42.method817(231, 234, 302, 32, 0);
			Static42.method824(232, 235, Static136.anInt2841 * 3, 30, 9179409);
			Static42.method824(Static136.anInt2841 * 3 + 232, 235, 300 - Static136.anInt2841 * 3, 30, 0);
			arg0.method1350(Static17.aClass20_155, 382, 256, 16777215, -1);
		}
		@Pc(97) short local97;
		@Pc(120) int local120;
		if (Static96.anInt2013 == 20) {
			local97 = 211;
			Static30.aClass47_1.method2016(382 - Static30.aClass47_1.anInt2707 / 2, -(Static30.aClass47_1.anInt2709 / 2) + 271);
			arg0.method1350(Static17.aClass20_157, 382, 211, 16776960, 0);
			local120 = local97 + 15;
			arg0.method1350(Static17.aClass20_158, 382, 226, 16776960, 0);
			@Pc(128) int local128 = local120 + 15;
			arg0.method1350(Static17.aClass20_160, 382, 241, 16776960, 0);
			@Pc(136) int local136 = local128 + 15;
			@Pc(137) int local137 = local136 + 10;
			arg0.method1334(Static70.method1166(new Class20[] { Static195.aClass20_1430, Static81.method1358(Static17.aClass20_161) }), 272, 266, 16777215, 0);
			@Pc(157) int local157 = local137 + 15;
			arg0.method1334(Static70.method1166(new Class20[] { Static192.aClass20_1411, Static17.aClass20_162.method566() }), 274, 281, 16777215, 0);
			@Pc(178) int local178 = local157 + 15;
		}
		if (Static96.anInt2013 == 10) {
			Static30.aClass47_1.method2016(202, 171);
			if (Static214.anInt4152 == 0) {
				local97 = 251;
				arg0.method1350(Static134.aClass20_1013, 382, 251, 16776960, 0);
				Static86.aClass47_2.method2016(229, 271);
				arg0.method1349(Static183.aClass20_1355, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static86.aClass47_2.method2016(389, 271);
				arg0.method1349(Static3.aClass20_39, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
				local120 = local97 + 30;
			} else if (Static214.anInt4152 == 2) {
				local97 = 211;
				arg0.method1350(Static17.aClass20_157, 382, 211, 16776960, 0);
				local120 = local97 + 15;
				arg0.method1350(Static17.aClass20_158, 382, 226, 16776960, 0);
				local120 += 15;
				arg0.method1350(Static17.aClass20_160, 382, 241, 16776960, 0);
				@Pc(310) boolean local310;
				if (Static109.anInt2294 == 0 && Static177.anInt3533 % 40 < 20 && Static197.aBoolean175) {
					local310 = true;
				} else {
					local310 = false;
				}
				local120 += 15;
				local120 += 10;
				arg0.method1334(Static70.method1166(new Class20[] { Static195.aClass20_1430, Static81.method1358(Static17.aClass20_161), local310 ? Static189.aClass20_1381 : Static17.aClass20_159 }), 272, 266, 16777215, 0);
				if (Static109.anInt2294 == 1 && Static177.anInt3533 % 40 < 20 && Static197.aBoolean175) {
					local310 = true;
				} else {
					local310 = false;
				}
				local120 += 15;
				arg0.method1334(Static70.method1166(new Class20[] { Static192.aClass20_1411, Static17.aClass20_162.method566(), local310 ? Static189.aClass20_1381 : Static17.aClass20_159 }), 274, 281, 16777215, 0);
				local120 += 15;
				Static86.aClass47_2.method2016(229, 301);
				arg0.method1350(Static35.aClass20_263, 302, 326, 16777215, 0);
				Static86.aClass47_2.method2016(389, 301);
				arg0.method1350(Static141.aClass20_1110, 462, 326, 16777215, 0);
			} else if (Static214.anInt4152 == 3) {
				local97 = 236;
				arg0.method1350(Static178.aClass20_1305, 382, 211, 16776960, 0);
				arg0.method1350(Static6.aClass20_73, 382, 236, 16777215, 0);
				local120 = local97 + 15;
				arg0.method1350(Static67.aClass20_1487, 382, 251, 16777215, 0);
				local120 += 15;
				arg0.method1350(Static173.aClass20_1276, 382, 266, 16777215, 0);
				local120 += 15;
				arg0.method1350(Static89.aClass20_703, 382, 281, 16777215, 0);
				local120 += 15;
				Static86.aClass47_2.method2016(309, 301);
				arg0.method1350(Static141.aClass20_1110, 382, 326, 16777215, 0);
			}
		}
		if (Static167.anInt3347 != 1) {
			if (Static175.anInt3513 > 0) {
				Static3.method96(Static175.anInt3513);
				Static175.anInt3513 = 0;
			}
			Static128.method1998();
		}
		Static127.aClass47Array10[Static147.aBoolean129 ? 1 : 0].method2016(725, 463);
		if (Static96.anInt2013 <= 5 || Static94.anInt2006 == 2) {
			return;
		}
		if (Static89.aClass47_3 == null) {
			Static89.aClass47_3 = Static85.method1456(Static113.anInt2385, Static186.aClass23_Sub1_26);
		}
		if (Static89.aClass47_3 == null) {
			return;
		}
		Static89.aClass47_3.method2016(5, 463);
		arg0.method1350(Static70.method1166(new Class20[] { Static179.aClass20_1312, Static192.aClass20_1413, Static132.method2805(Static40.anInt844) }), 55, 478, 16777215, 0);
		if (Static47.aClass58_103 != null) {
			arg1.method1350(Static73.aClass20_532, 55, 492, 16777215, 0);
			return;
		}
		arg1.method1350(Static66.aClass20_500, 55, 492, 16777215, 0);
		return;
	}
}
