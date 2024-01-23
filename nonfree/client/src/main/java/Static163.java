import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public static int anInt3585;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
	public static int anInt3587;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt3583 = -1;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!ff;")
	public static Class33 aClass33_13 = new Class33(512);

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt3586 = 50;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
	public static int[] anIntArray465 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array26 = new Class60[anInt3586];

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1233 = Static200.method3116("(U(Y");

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "[I")
	public static int[] anIntArray466 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
	public static int[] anIntArray467 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
	public static int[] anIntArray468 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
	public static int[] anIntArray469 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
	public static int[] anIntArray470 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
	public static int[] anIntArray471 = new int[anInt3586];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method2706() {
		@Pc(9) int local9 = Static176.aClass1_Sub1_Sub14_2.method3307(Static176.aClass60_261);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static91.anInt2134; local11++) {
			local19 = Static176.aClass1_Sub1_Sub14_2.method3307(Static114.method1966(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static162.aBoolean261 = true;
		local19 = Static91.anInt2134 * 15 + 21;
		Static29.anInt709 = Static91.anInt2134 * 15 + 22;
		local9 += 8;
		Static108.anInt2506 = local9;
		@Pc(68) int local68 = Static166.anInt3603 - local9 / 2;
		@Pc(70) int local70 = Static39.anInt882;
		if (local9 + local68 > Static88.anInt2058) {
			local68 = Static88.anInt2058 - local9;
		}
		if (local68 < 0) {
			local68 = 0;
		}
		if (local70 + local19 > Static112.anInt2563) {
			local70 = Static112.anInt2563 - local19;
		}
		Static89.anInt2075 = local68;
		if (local70 < 0) {
			local70 = 0;
		}
		Static102.anInt2345 = local70;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method2707() {
		Static7.aClass1_Sub1_Sub6_Sub1_1.method2166(0, 0);
		Static31.aClass1_Sub1_Sub6_Sub1_2.method2166(382, 0);
		Static37.aClass73_1.method2270(382 - Static37.aClass73_1.anInt2959 / 2, 18);
	}
}
