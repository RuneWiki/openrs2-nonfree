import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public static int anInt3704;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1588 = Static51.method932("Type");

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1587 = aClass10_1588;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	public static final int anInt3705 = 20;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "[I")
	public static int[] anIntArray402 = new int[128];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method2634() {
		anIntArray402 = null;
		aClass10_1587 = null;
		aClass10_1588 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!fa;Lclient!cd;)Lclient!cd;")
	public static Class10 method2635(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class10 arg1) {
		if (arg1.method365(Static30.aClass10_379) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(12) int local12 = arg1.method365(Static123.aClass10_1203);
			if (local12 == -1) {
				while (true) {
					local12 = arg1.method365(Static67.aClass10_1265);
					if (local12 == -1) {
						while (true) {
							local12 = arg1.method365(Static46.aClass10_520);
							if (local12 == -1) {
								while (true) {
									local12 = arg1.method365(Static60.aClass10_660);
									if (local12 == -1) {
										while (true) {
											local12 = arg1.method365(Static124.aClass10_1218);
											if (local12 == -1) {
												while (true) {
													local12 = arg1.method365(Static66.aClass10_698);
													if (local12 == -1) {
														return arg1;
													}
													@Pc(238) Class10 local238 = Static63.aClass10_687;
													if (Static64.aClass15_4 != null) {
														local238 = Static66.method1139(Static64.aClass15_4.anInt820);
														try {
															if (Static64.aClass15_4.anObject2 != null) {
																@Pc(256) byte[] local256 = ((String) Static64.aClass15_4.anObject2).getBytes("ISO-8859-1");
																local238 = Static54.method982(local256.length, 0, local256);
															}
														} catch (@Pc(265) UnsupportedEncodingException local265) {
														}
													}
													arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), local238, arg1.method333(local12 + 4) });
												}
											}
											arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), Static26.method590(Static169.method2595(arg0, 4)), arg1.method333(local12 + 2) });
										}
									}
									arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), Static26.method590(Static169.method2595(arg0, 3)), arg1.method333(local12 + 2) });
								}
							}
							arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), Static26.method590(Static169.method2595(arg0, 2)), arg1.method333(local12 + 2) });
						}
					}
					arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), Static26.method590(Static169.method2595(arg0, 1)), arg1.method333(local12 + 2) });
				}
			}
			arg1 = Static3.method36(new Class10[] { arg1.method353(0, local12), Static26.method590(Static169.method2595(arg0, 0)), arg1.method333(local12 + 2) });
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	public static void method2645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static111.anInt2519 != 0 && Static111.anInt2519 != 3 || Static40.anInt976 != 1) {
			return;
		}
		@Pc(29) int local29 = Static62.anInt1534 - arg0 - 25;
		@Pc(36) int local36 = Static40.anInt977 - arg1 - 5;
		if (local29 < 0 || local36 < 0 || local29 >= 146 || local36 >= 151) {
			return;
		}
		local29 -= 73;
		local36 -= 75;
		@Pc(59) int local59 = Static64.anInt1576 + Static45.anInt1123 & 0x7FF;
		@Pc(63) int local63 = Class2_Sub1_Sub4_Sub4.anIntArray299[local59];
		@Pc(71) int local71 = (Static96.anInt3690 + 256) * local63 >> 8;
		@Pc(75) int local75 = Class2_Sub1_Sub4_Sub4.anIntArray304[local59];
		@Pc(83) int local83 = (Static96.anInt3690 + 256) * local75 >> 8;
		@Pc(93) int local93 = local71 * local36 + local29 * local83 >> 11;
		@Pc(100) int local100 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 + local93 >> 7;
		@Pc(110) int local110 = local83 * local36 - local71 * local29 >> 11;
		@Pc(117) int local117 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 - local110 >> 7;
		@Pc(137) boolean local137 = Static165.method2527(0, true, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local100, 0, 0, 1, local117, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
		if (!local137) {
			return;
		}
		Static141.aClass2_Sub11_Sub1_3.method1439(local29);
		Static141.aClass2_Sub11_Sub1_3.method1439(local36);
		Static141.aClass2_Sub11_Sub1_3.method1479(Static45.anInt1123);
		Static141.aClass2_Sub11_Sub1_3.method1439(57);
		Static141.aClass2_Sub11_Sub1_3.method1439(Static64.anInt1576);
		Static141.aClass2_Sub11_Sub1_3.method1439(Static96.anInt3690);
		Static141.aClass2_Sub11_Sub1_3.method1439(89);
		Static141.aClass2_Sub11_Sub1_3.method1479(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454);
		Static141.aClass2_Sub11_Sub1_3.method1479(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499);
		Static141.aClass2_Sub11_Sub1_3.method1439(Static44.anInt1061);
		Static141.aClass2_Sub11_Sub1_3.method1439(63);
		return;
	}
}
