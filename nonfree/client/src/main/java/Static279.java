import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!fh;")
	public static Class58 aClass58_99;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt5320 = 0;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "[I")
	public static int[] anIntArray599 = new int[25];

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Z")
	public static boolean aBoolean363 = true;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JB)V")
	public static void method4341(@OriginalArg(0) long arg0) {
		if (Static41.anInt772 == 1 || Static41.anInt772 == 5) {
			Static40.method641(arg0);
		} else if (Static41.anInt772 == 2) {
			Static157.method2550();
		} else {
			Static84.method1496();
		}
		if (!Static18.aBoolean17) {
			if (Static83.anInt1940 != 0) {
				Static175.anInt3341 = Static139.anInt2663;
				Static198.anInt5852 = Static47.anInt891;
			} else if (Static252.anInt4803 == 0) {
				Static198.anInt5852 = Static312.anInt6042;
				Static175.anInt3341 = Static286.anInt5358;
			} else {
				Static198.anInt5852 = Static278.anInt5313;
				Static175.anInt3341 = Static79.anInt1797;
			}
			Static262.aShortArray100[0] = 1006;
			Static259.aStringArray30[0] = Static254.aString303;
			Static249.aStringArray27[0] = "";
			Static300.anInt5638 = 1;
			Static86.anIntArray160[0] = Static313.anInt6054;
		}
		Static184.method2977((long) Static50.anInt954);
		if (Static107.anInt5399 != -1) {
			Static194.method4280(Static107.anInt5399);
		}
		@Pc(80) int local80;
		for (local80 = 0; local80 < Static6.anInt113; local80++) {
			if (Static85.aBooleanArray8[local80]) {
				Static259.aBooleanArray24[local80] = true;
			}
			Static9.aBooleanArray2[local80] = Static85.aBooleanArray8[local80];
			Static85.aBooleanArray8[local80] = false;
		}
		Static289.aClass189_15 = null;
		Static130.anInt2522 = Static50.anInt954;
		Static91.anInt2047 = -1;
		Static246.anInt4680 = -1;
		Static246.aClass189_13 = null;
		if (Static94.aBoolean138) {
			Static273.aBoolean123 = true;
		}
		if (Static107.anInt5399 != -1) {
			Static6.anInt113 = 0;
			Static91.method1563();
		}
		if (Static94.aBoolean138) {
			Static104.method1699();
		} else {
			Static270.method4266();
		}
		Static137.method2055();
		if (Static18.aBoolean17) {
			if (Static300.aBoolean390) {
				Static179.method2824();
			} else {
				Static83.method1479();
			}
		} else if (Static289.aClass189_15 != null) {
			Static133.method2009(Static9.anInt127, Static289.aClass189_15, Static138.anInt2643);
		} else if (Static91.anInt2047 != -1) {
			Static133.method2009(Static91.anInt2047, null, Static246.anInt4680);
		}
		local80 = Static18.aBoolean17 ? -1 : Static304.method4700();
		if (local80 == -1) {
			local80 = Static166.anInt3407;
		}
		Static56.method966(local80);
		if (Static259.anInt4947 == 1) {
			Static259.anInt4947 = 2;
		}
		if (Static78.anInt1767 == 1) {
			Static78.anInt1767 = 2;
		}
		if (Static18.anInt268 == 3) {
			for (@Pc(211) int local211 = 0; local211 < Static6.anInt113; local211++) {
				if (Static9.aBooleanArray2[local211]) {
					if (Static94.aBoolean138) {
						Static104.method1692(Static261.anIntArray540[local211], Static299.anIntArray638[local211], Static181.anIntArray383[local211], Static289.anIntArray616[local211], 16711935, 128);
					} else {
						Static270.method4250(Static261.anIntArray540[local211], Static299.anIntArray638[local211], Static181.anIntArray383[local211], Static289.anIntArray616[local211], 16711935, 128);
					}
				} else if (Static259.aBooleanArray24[local211]) {
					if (Static94.aBoolean138) {
						Static104.method1692(Static261.anIntArray540[local211], Static299.anIntArray638[local211], Static181.anIntArray383[local211], Static289.anIntArray616[local211], 16711680, 128);
					} else {
						Static270.method4250(Static261.anIntArray540[local211], Static299.anIntArray638[local211], Static181.anIntArray383[local211], Static289.anIntArray616[local211], 16711680, 128);
					}
				}
			}
		}
		Static128.method1964(Static281.anInt5335, Static154.aClass53_Sub1_Sub1_2.anInt4002, Static154.aClass53_Sub1_Sub1_2.anInt3974, Static211.anInt4156);
		Static211.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method4343() {
		if (Static132.anInt2554 != -1) {
			Static167.method2960(false, -1, -1, Static132.anInt2554);
			Static132.anInt2554 = -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method4345() {
		for (@Pc(13) int local13 = 0; local13 < Static250.anInt4761; local13++) {
			@Pc(24) int local24 = Static275.anIntArray587[local13];
			@Pc(28) Class53_Sub1_Sub1 local28 = Static182.aClass53_Sub1_Sub1Array1[local24];
			@Pc(32) int local32 = Static189.aClass4_Sub10_Sub1_2.method4666();
			if ((local32 & 0x80) != 0) {
				local32 += Static189.aClass4_Sub10_Sub1_2.method4666() << 8;
			}
			Static225.method3602(local24, local32, local28);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!wf;BIII)V")
	public static void method4346(@OriginalArg(0) Class189 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static94.aBoolean138) {
			Static104.method1694(arg3, arg1, arg0.anInt5897 + arg3, arg1 - -arg0.anInt5953);
		}
		if (Static194.anInt5207 >= 3) {
			if (Static94.aBoolean138) {
				@Pc(41) Class4_Sub3_Sub14 local41 = arg0.method4766(false);
				if (local41 != null) {
					local41.method4543(arg3, arg1);
				}
			} else {
				Static270.method4247(arg3, arg1, arg0.anIntArray672, arg0.anIntArray657);
			}
		} else if (Static94.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) Static254.aClass4_Sub3_Sub14_6).method4556(arg3, arg1, arg0.anInt5897, arg0.anInt5953, Static254.aClass4_Sub3_Sub14_6.anInt5610 / 2, Static254.aClass4_Sub3_Sub14_6.anInt5609 / 2, (int) Static202.aFloat97, 256, (Class4_Sub3_Sub14_Sub2) arg0.method4766(false));
		} else {
			((Class4_Sub3_Sub14_Sub1) Static254.aClass4_Sub3_Sub14_6).method2166(arg3, arg1, arg0.anInt5897, arg0.anInt5953, Static254.aClass4_Sub3_Sub14_6.anInt5610 / 2, Static254.aClass4_Sub3_Sub14_6.anInt5609 / 2, (int) Static202.aFloat97, arg0.anIntArray672, arg0.anIntArray657);
		}
		Static259.aBooleanArray24[arg2] = true;
	}
}
