import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public static int anInt6141;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
	public static int[] anIntArray703;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public static int anInt6145;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString296 = "Loaded title screen";

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public static void method5568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class108 local10 = new Class108(16);
		for (@Pc(15) Class6_Sub8 local15 = (Class6_Sub8) Static33.aClass108_3.method2903(); local15 != null; local15 = (Class6_Sub8) Static33.aClass108_3.method2905()) {
			local15.method5756();
			@Pc(26) int local26 = (int) (local15.aLong218 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong218 >> 14 & 0x3FFFL) - arg0;
			@Pc(46) int local46 = (int) (local15.aLong218 & 0x3FFFL) - arg1;
			if (local46 >= 0 && local37 >= 0 && local46 < Static153.anInt2883 && Static246.anInt4606 > local37) {
				local10.method2898((long) (local46 | local26 << 28 | local37 << 14), local15);
			}
		}
		Static33.aClass108_3 = local10;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	public static void method5573() {
		@Pc(13) int local13 = Static44.method763();
		if (local13 == 0) {
			Static37.aByteArrayArrayArray2 = null;
			Static207.method3713(0);
		} else if (local13 == 1) {
			Static232.method4111((byte) 0);
			Static207.method3713(512);
			if (Static265.aByteArrayArrayArray11 != null) {
				Static179.method3442();
			}
		} else {
			Static232.method4111((byte) (Static138.anInt4577 - 4 & 0xFF));
			Static207.method3713(2);
		}
		Static318.anInt5893 = Static343.anInt6225;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public static void method5574() {
		@Pc(17) int local17 = Static142.aClass6_Sub10_Sub1_3.method2883(8);
		@Pc(26) int local26;
		if (Static200.anInt3712 > local17) {
			for (local26 = local17; local26 < Static200.anInt3712; local26++) {
				Static105.anIntArray264[Static162.anInt3066++] = Static183.anIntArray400[local26];
			}
		}
		if (Static200.anInt3712 < local17) {
			throw new RuntimeException("gppov1");
		}
		Static200.anInt3712 = 0;
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(68) int local68 = Static183.anIntArray400[local26];
			@Pc(72) Class44_Sub4_Sub4_Sub1 local72 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local68];
			@Pc(77) int local77 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
			if (local77 == 0) {
				Static183.anIntArray400[Static200.anInt3712++] = local68;
				local72.anInt5105 = Static76.anInt2853;
			} else {
				@Pc(97) int local97 = Static142.aClass6_Sub10_Sub1_3.method2883(2);
				if (local97 == 0) {
					Static183.anIntArray400[Static200.anInt3712++] = local68;
					local72.anInt5105 = Static76.anInt2853;
					Static151.anIntArray352[Static15.anInt281++] = local68;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static183.anIntArray400[Static200.anInt3712++] = local68;
						local72.anInt5105 = Static76.anInt2853;
						local139 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
						local72.method4705(local139, 1);
						local149 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
						if (local149 == 1) {
							Static151.anIntArray352[Static15.anInt281++] = local68;
						}
					} else if (local97 == 2) {
						Static183.anIntArray400[Static200.anInt3712++] = local68;
						local72.anInt5105 = Static76.anInt2853;
						if (Static142.aClass6_Sub10_Sub1_3.method2883(1) == 1) {
							local139 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local72.method4705(local139, 2);
							local149 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local72.method4705(local149, 2);
						} else {
							local139 = Static142.aClass6_Sub10_Sub1_3.method2883(3);
							local72.method4705(local139, 0);
						}
						local139 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
						if (local139 == 1) {
							Static151.anIntArray352[Static15.anInt281++] = local68;
						}
					} else if (local97 == 3) {
						Static105.anIntArray264[Static162.anInt3066++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	public static void method5575() {
		if (!Static46.method773()) {
			return;
		}
		if (Static223.aStringArray29 == null) {
			Static314.method2480();
		}
		Static299.anIntArray639 = new int[100];
		Static98.anIntArray255 = new int[100];
		Static241.anIntArray669 = new int[100];
		Static214.anInt3932 = 0;
		Static190.aBoolean274 = true;
		Static20.aBooleanArray3 = new boolean[100];
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static98.anIntArray255[local30] = (int) ((double) Static209.anInt3815 * Math.random());
			Static241.anIntArray669[local30] = (int) (Math.random() * 350.0D);
			Static299.anIntArray639[local30] = (int) (Math.random() * 102.0D);
			Static20.aBooleanArray3[local30] = Math.random() < 0.5D;
		}
		try {
			Static204.aClipboard1 = Static16.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(76) Exception local76) {
		}
	}
}
