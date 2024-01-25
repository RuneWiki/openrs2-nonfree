import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt5474 = 13156520;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
	public static final int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIB)V")
	public static void method4388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static178.method2589(Static380.aClass242_102);
		}
		if (arg1 == 1) {
			Static178.method2589(Static228.aClass242_98);
		}
		Static426.aClass1_Sub19_Sub2_2.method2933(Static269.aClass53_1.method3910(82) ? 1 : 0);
		Static426.aClass1_Sub19_Sub2_2.method2889(arg2 + Static315.anInt5207);
		Static426.aClass1_Sub19_Sub2_2.method2889(arg0 + Static47.anInt676);
		Static460.anInt7364 = arg2;
		Static288.anInt4834 = arg0;
		Static207.aBoolean358 = false;
		Static413.method5275();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Lclient!bu;")
	public static Class1_Sub2 method4389(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub2_Sub27();
		} else if (arg0 == 1) {
			return new Class1_Sub2_Sub22();
		} else if (arg0 == 2) {
			return new Class1_Sub2_Sub8();
		} else if (arg0 == 3) {
			return new Class1_Sub2_Sub17();
		} else if (arg0 == 4) {
			return new Class1_Sub2_Sub37();
		} else if (arg0 == 5) {
			return new Class1_Sub2_Sub14();
		} else if (arg0 == 6) {
			return new Class1_Sub2_Sub38();
		} else if (arg0 == 7) {
			return new Class1_Sub2_Sub19();
		} else if (arg0 == 8) {
			return new Class1_Sub2_Sub12();
		} else if (arg0 == 9) {
			return new Class1_Sub2_Sub1();
		} else if (arg0 == 10) {
			return new Class1_Sub2_Sub31();
		} else if (arg0 == 11) {
			return new Class1_Sub2_Sub23();
		} else if (arg0 == 12) {
			return new Class1_Sub2_Sub13();
		} else if (arg0 == 13) {
			return new Class1_Sub2_Sub34();
		} else if (arg0 == 14) {
			return new Class1_Sub2_Sub26();
		} else if (arg0 == 15) {
			return new Class1_Sub2_Sub36();
		} else if (arg0 == 16) {
			return new Class1_Sub2_Sub18();
		} else if (arg0 == 17) {
			return new Class1_Sub2_Sub4();
		} else if (arg0 == 18) {
			return new Class1_Sub2_Sub21_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub2_Sub10();
		} else if (arg0 == 20) {
			return new Class1_Sub2_Sub7();
		} else if (arg0 == 21) {
			return new Class1_Sub2_Sub33();
		} else if (arg0 == 22) {
			return new Class1_Sub2_Sub5();
		} else if (arg0 == 23) {
			return new Class1_Sub2_Sub15();
		} else if (arg0 == 24) {
			return new Class1_Sub2_Sub28();
		} else if (arg0 == 25) {
			return new Class1_Sub2_Sub35();
		} else if (arg0 == 26) {
			return new Class1_Sub2_Sub30();
		} else if (arg0 == 27) {
			return new Class1_Sub2_Sub20();
		} else if (arg0 == 28) {
			return new Class1_Sub2_Sub24();
		} else if (arg0 == 29) {
			return new Class1_Sub2_Sub16();
		} else if (arg0 == 30) {
			return new Class1_Sub2_Sub29();
		} else if (arg0 == 31) {
			return new Class1_Sub2_Sub25();
		} else if (arg0 == 32) {
			return new Class1_Sub2_Sub9();
		} else if (arg0 == 33) {
			return new Class1_Sub2_Sub3();
		} else if (arg0 == 34) {
			return new Class1_Sub2_Sub32();
		} else if (arg0 == 35) {
			return new Class1_Sub2_Sub6();
		} else if (arg0 == 36) {
			return new Class1_Sub2_Sub2();
		} else if (arg0 == 37) {
			return new Class1_Sub2_Sub39();
		} else if (arg0 == 38) {
			return new Class1_Sub2_Sub11();
		} else if (arg0 == 39) {
			return new Class1_Sub2_Sub21();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method4390() {
		@Pc(15) Class63[] local15 = Class139.aClass63Array4;
		synchronized (Class139.aClass63Array4) {
			for (@Pc(19) int local19 = 0; local19 < Class139.aClass63Array4.length; local19++) {
				Class139.aClass63Array4[local19] = new Class63();
				Static160.anIntArray215[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
	public static void method4391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static281.anInt4757 && arg2 <= Static457.anInt7264) {
			@Pc(16) int local16 = Static241.method3467(arg0, Static142.anInt2163, Static182.anInt3402);
			@Pc(22) int local22 = Static241.method3467(arg3, Static142.anInt2163, Static182.anInt3402);
			Static434.method5490(arg1, arg2, local22, local16);
		}
	}
}
