import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public static int anInt4469 = 0;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "J")
	public static long aLong154 = 0L;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!gd;")
	public static Class61 aClass61_39 = new Class61(4);

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString158 = "red:";

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!le;")
	public static Class8_Sub2_Sub1 aClass8_Sub2_Sub1_4 = new Class8_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public static void method3394() {
		Static108.method1772(0, 0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method3395() {
		while (true) {
			if (Static275.aClass8_Sub2_Sub1_6.method2389(Static68.anInt1687) >= 11) {
				@Pc(12) int local12 = Static275.aClass8_Sub2_Sub1_6.method2390(11);
				if (local12 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static230.aClass36_Sub3_Sub1Array1[local12] == null) {
						Static230.aClass36_Sub3_Sub1Array1[local12] = new Class36_Sub3_Sub1();
						if (Static44.aClass8_Sub2Array1[local12] != null) {
							Static230.aClass36_Sub3_Sub1Array1[local12].method3080(Static44.aClass8_Sub2Array1[local12]);
						}
						local21 = true;
					}
					Static85.anIntArray123[Static61.anInt1336++] = local12;
					@Pc(59) Class36_Sub3_Sub1 local59 = Static230.aClass36_Sub3_Sub1Array1[local12];
					local59.anInt4119 = Static183.anInt3590;
					@Pc(67) int local67 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
					@Pc(72) int local72 = Static275.aClass8_Sub2_Sub1_6.method2390(5);
					if (local72 > 15) {
						local72 -= 32;
					}
					@Pc(87) int local87 = Static92.anIntArray131[Static275.aClass8_Sub2_Sub1_6.method2390(3)];
					if (local21) {
						local59.anInt4081 = local59.anInt4128 = local87;
					}
					@Pc(100) int local100 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
					if (local100 == 1) {
						Static171.anIntArray259[Static291.anInt3609++] = local12;
					}
					@Pc(118) int local118 = Static275.aClass8_Sub2_Sub1_6.method2390(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					local59.method3085(local118 + Static21.aClass36_Sub3_Sub1_1.anIntArray308[0], Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] + local72, local67 == 1);
					continue;
				}
			}
			Static275.aClass8_Sub2_Sub1_6.method2391();
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJZ)V")
	public static void method3396(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static30.anInt728 >= 100) {
			Static47.method746(0, Static162.aString113, "");
			return;
		}
		@Pc(29) String local29 = Static121.method1945(arg0);
		@Pc(31) int local31;
		for (local31 = 0; local31 < Static30.anInt728; local31++) {
			if (Static213.aLongArray11[local31] == arg0) {
				Static47.method746(0, local29 + Static91.aString73, "");
				return;
			}
		}
		for (local31 = 0; local31 < Static173.anInt3444; local31++) {
			if (arg0 == Static98.aLongArray7[local31]) {
				Static47.method746(0, Static295.aString130 + local29 + Static185.aString128, "");
				return;
			}
		}
		if (local29.equals(Static21.aClass36_Sub3_Sub1_1.aString144)) {
			Static47.method746(0, Static40.aString38, "");
			return;
		}
		Static213.aLongArray11[Static30.anInt728] = arg0;
		Static48.aStringArray17[Static30.anInt728] = Static170.method2669(arg0);
		Static145.aBooleanArray13[Static30.anInt728++] = arg1;
		Static295.anInt3737 = Static157.anInt5706;
		aClass8_Sub2_Sub1_4.method2398(35);
		aClass8_Sub2_Sub1_4.method2378(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method3397(@OriginalArg(0) int arg0) {
		Static119.anInt2398 = -1;
		Static218.anInt4483 = arg0;
		Static119.anInt2398 = -1;
		Static286.method4120();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3399(@OriginalArg(1) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}
}
