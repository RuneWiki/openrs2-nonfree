import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public static int anInt2632 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIB)V")
	public static void method2546(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static9.aClass63_1 = Static93.method4640(arg1, Static289.anInt5617 * 2, Static314.anInterface3_7, Static227.aClass75_5, Static174.aCanvas3);
		} else {
			if (arg0) {
				Static9.aClass63_1 = Static93.method4640(0, 0, Static314.anInterface3_7, Static227.aClass75_5, Static174.aCanvas3);
				Static9.aClass63_1.method4627(0);
				@Pc(23) Class80 local23 = Static323.method4438(Static101.aClass30_30, Static31.anInt788);
				@Pc(32) Class33 local32 = Static9.aClass63_1.method4611(local23, Static382.method5434(Static280.aClass30_83, Static31.anInt788));
				Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172), local32);
				Static9.aClass63_1.method4647();
				Static136.method4750();
				Static9.aClass63_1.method4625();
			}
			try {
				Static9.aClass63_1 = Static93.method4640(arg1, Static289.anInt5617 * 2, Static314.anInterface3_7, Static227.aClass75_5, Static174.aCanvas3);
			} catch (@Pc(61) Throwable local61) {
				Static9.aClass63_1 = Static93.method4640(0, 0, Static314.anInterface3_7, Static227.aClass75_5, Static174.aCanvas3);
				arg1 = 0;
			}
		}
		if (Static9.aClass63_1.method4575()) {
			@Pc(99) Class1_Sub30 local99 = Static9.aClass63_1.method4588();
			Static9.aClass63_1.method4616(local99);
		}
		Static241.anInt4925 = arg1;
		Static307.method5316();
		if (!Static9.aClass63_1.method4567()) {
			Static44.anInt1145 = 1;
		}
		Static9.aClass63_1.method4576(Static44.anInt1145);
		Static9.aClass63_1.method4600(0);
		Static341.aClass129_5 = Static9.aClass63_1.method4573();
		Static312.aClass129_4 = Static9.aClass63_1.method4573();
		@Pc(129) int local129 = (int) ((double) Static311.anInt5653 * 34.46D);
		if (Static9.aClass63_1.method4656()) {
			local129 += 128;
		}
		Static9.aClass63_1.method4582(50, local129);
		Static9.aClass63_1.method4568(!Static80.aBoolean128);
		if (Static9.aClass63_1.method4606()) {
			Static160.method3014(Static271.aBoolean33);
		}
		Static260.aBoolean386 = !Static150.method4956();
		Static129.method2665(Static189.anInt3820 >> 3, Static311.anInt5653 >> 3, Static9.aClass63_1);
		Static119.method2539();
		Static307.aBoolean439 = false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!at;)V")
	public static void method2548(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aByteArray41.length - arg0.anInt2219 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2132();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray41.length - arg0.anInt2219 < 2) {
			return;
		}
		@Pc(55) int local55 = arg0.method2161();
		if (local55 * 6 != arg0.aByteArray41.length - arg0.anInt2219) {
			return;
		}
		while (true) {
			@Pc(77) int local77;
			@Pc(81) int local81;
			do {
				do {
					do {
						if (arg0.anInt2219 >= arg0.aByteArray41.length) {
							return;
						}
						local77 = arg0.method2161();
						local81 = arg0.method2140();
					} while (local77 >= Static7.anIntArray24.length);
				} while (!Static237.aBooleanArray11[local77]);
			} while (Static364.method6049(local77).aChar5 == '1' && (local81 < -1 || local81 > 1));
			Static7.anIntArray24[local77] = local81;
		}
	}
}
