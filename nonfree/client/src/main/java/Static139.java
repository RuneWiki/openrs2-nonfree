import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_78;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array10;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
	public static final int[] anIntArray313 = new int[2000];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ei;Lclient!ei;)V")
	public static void method2396(@OriginalArg(1) Class4_Sub1_Sub7_Sub1_Sub1 arg0, @OriginalArg(2) Class4_Sub1_Sub7_Sub1_Sub1 arg1) {
		if (Static53.aBoolean64) {
			Static96.method1860(arg1, arg0);
			return;
		}
		if (Static143.anInt3333 == 0 || Static143.anInt3333 == 5) {
			arg1.method906(Static6.aClass46_94, 382, 225, 16777215, -1);
			Static145.method2945(230, 233, 304, 34, 9179409);
			Static145.method2945(231, 234, 302, 32, 0);
			Static145.method2941(232, 235, Static92.anInt2364 * 3, 30, 9179409);
			Static145.method2941(Static92.anInt2364 * 3 + 232, 235, 300 - Static92.anInt2364 * 3, 30, 0);
			arg1.method906(Static3.aClass46_34, 382, 256, 16777215, -1);
		}
		@Pc(116) short local116;
		@Pc(124) int local124;
		if (Static143.anInt3333 == 20) {
			Static81.aClass4_Sub1_Sub7_Sub3_2.method2642(382 - Static81.aClass4_Sub1_Sub7_Sub3_2.anInt3484 / 2, -(Static81.aClass4_Sub1_Sub7_Sub3_2.anInt3482 / 2) + 271);
			local116 = 211;
			arg1.method906(Static3.aClass46_40, 382, 211, 16776960, 0);
			local124 = local116 + 15;
			arg1.method906(Static3.aClass46_32, 382, 226, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			arg1.method906(Static3.aClass46_35, 382, 241, 16776960, 0);
			@Pc(140) int local140 = local132 + 15;
			@Pc(141) int local141 = local140 + 10;
			arg1.method890(Static69.method1482(new Class46[] { Static123.aClass46_1089, Static138.method891(Static3.aClass46_38) }), 272, 266, 16777215, 0);
			@Pc(161) int local161 = local141 + 15;
			arg1.method890(Static69.method1482(new Class46[] { Static3.aClass46_36, Static3.aClass46_31.method1664() }), 274, 281, 16777215, 0);
			@Pc(182) int local182 = local161 + 15;
		}
		if (Static143.anInt3333 == 10) {
			Static81.aClass4_Sub1_Sub7_Sub3_2.method2642(202, 171);
			if (Static99.anInt2519 == 0) {
				local116 = 251;
				arg1.method906(Static169.aClass46_1380, 382, 251, 16776960, 0);
				local124 = local116 + 30;
				Static23.aClass4_Sub1_Sub7_Sub3_1.method2642(229, 271);
				arg1.method885(Static31.aClass46_262, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static23.aClass4_Sub1_Sub7_Sub3_1.method2642(389, 271);
				arg1.method885(Static176.aClass46_1450, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static99.anInt2519 == 2) {
				local116 = 211;
				arg1.method906(Static3.aClass46_40, 382, 211, 16776960, 0);
				local124 = local116 + 15;
				arg1.method906(Static3.aClass46_32, 382, 226, 16776960, 0);
				local124 += 15;
				arg1.method906(Static3.aClass46_35, 382, 241, 16776960, 0);
				local124 += 15;
				@Pc(308) boolean local308;
				if (Static25.anInt622 == 0 && Static142.anInt3325 % 40 < 20 && Static181.aBoolean167) {
					local308 = true;
				} else {
					local308 = false;
				}
				local124 += 10;
				arg1.method890(Static69.method1482(new Class46[] { Static123.aClass46_1089, Static138.method891(Static3.aClass46_38), local308 ? Static129.aClass46_1128 : Static3.aClass46_33 }), 272, 266, 16777215, 0);
				if (Static25.anInt622 == 1 && Static142.anInt3325 % 40 < 20 && Static181.aBoolean167) {
					local308 = true;
				} else {
					local308 = false;
				}
				local124 += 15;
				arg1.method890(Static69.method1482(new Class46[] { Static3.aClass46_36, Static3.aClass46_31.method1664(), local308 ? Static129.aClass46_1128 : Static3.aClass46_33 }), 274, 281, 16777215, 0);
				local124 += 15;
				Static23.aClass4_Sub1_Sub7_Sub3_1.method2642(229, 301);
				arg1.method906(Static4.aClass46_1041, 302, 326, 16777215, 0);
				Static23.aClass4_Sub1_Sub7_Sub3_1.method2642(389, 301);
				arg1.method906(Static93.aClass46_863, 462, 326, 16777215, 0);
			} else if (Static99.anInt2519 == 3) {
				arg1.method906(Static122.aClass46_1086, 382, 211, 16776960, 0);
				local116 = 236;
				arg1.method906(Static50.aClass46_487, 382, 236, 16777215, 0);
				local124 = local116 + 15;
				arg1.method906(Static28.aClass46_241, 382, 251, 16777215, 0);
				local124 += 15;
				arg1.method906(Static132.aClass46_1154, 382, 266, 16777215, 0);
				local124 += 15;
				arg1.method906(Static118.aClass46_1060, 382, 281, 16777215, 0);
				Static23.aClass4_Sub1_Sub7_Sub3_1.method2642(309, 301);
				local124 += 15;
				arg1.method906(Static93.aClass46_863, 382, 326, 16777215, 0);
			}
		}
		if (Static41.anInt1061 != 1) {
			if (Static103.anInt2611 > 0) {
				Static182.method3123(Static103.anInt2611);
				Static103.anInt2611 = 0;
			}
			Static85.method1706();
		}
		Static62.aClass4_Sub1_Sub7_Sub3Array8[Static154.aBoolean168 ? 1 : 0].method2642(725, 463);
		if (Static143.anInt3333 <= 5 || Static142.anInt3317 == 2 || Static64.anInt1688 != 0) {
			return;
		}
		if (Static152.aClass4_Sub1_Sub7_Sub3_4 == null) {
			Static152.aClass4_Sub1_Sub7_Sub3_4 = Static63.method1267(Static140.anInt3269, Static52.aClass62_Sub1_37);
		}
		if (Static152.aClass4_Sub1_Sub7_Sub3_4 == null) {
			return;
		}
		Static152.aClass4_Sub1_Sub7_Sub3_4.method2642(5, 463);
		arg1.method906(Static69.method1482(new Class46[] { Static59.aClass46_560, Static134.aClass46_1166, Static127.method2240(Static69.anInt1855) }), 55, 478, 16777215, 0);
		if (Static63.aClass87_2 != null) {
			arg0.method906(Static67.aClass46_699, 55, 492, 16777215, 0);
			return;
		}
		arg0.method906(Static166.aClass46_1349, 55, 492, 16777215, 0);
		return;
	}
}
