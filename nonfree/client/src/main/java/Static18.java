import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array1;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_192 = Static187.method3089("titlebox");

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "Lclient!uc;")
	public static final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_1 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "Lclient!uc;")
	public static final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_2 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "Z")
	public static final boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ab;Lclient!vd;ZLclient!vd;)Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 method402(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(4) int local4 = arg0.method3246(arg2);
		@Pc(19) int local19 = arg0.method3262(arg1, local4);
		return method405(local19, arg0, local4);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method403(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static156.aClass9_1);
		arg0.removeMouseMotionListener(Static156.aClass9_1);
		arg0.removeFocusListener(Static156.aClass9_1);
		Static97.anInt2044 = 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lclient!tg;")
	public static Class1_Sub1 method404(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub3_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub3();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ab;II)Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 method405(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(3) int arg2) {
		return Static42.method736(arg1, arg0, arg2) ? Static61.method999() : null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public static void method406() {
		@Pc(9) int local9 = Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2462(Static155.aClass92_1432);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static152.anInt3135; local11++) {
			local19 = Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2462(Static29.method553(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		Static35.aBoolean61 = true;
		Static170.anInt3552 = local9;
		local19 = Static152.anInt3135 * 15 + 21;
		Static31.anInt737 = Static152.anInt3135 * 15 + 22;
		@Pc(60) int local60 = Static57.anInt1370 - local9 / 2;
		if (local60 + local9 > Static63.anInt3568) {
			local60 = Static63.anInt3568 - local9;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		Static192.anInt4179 = local60;
		@Pc(79) int local79 = Static140.anInt2804;
		if (local79 + local19 > Static111.anInt2396) {
			local79 = Static111.anInt2396 - local19;
		}
		if (local79 < 0) {
			local79 = 0;
		}
		Static196.anInt4260 = local79;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	public static void method408() {
		@Pc(12) int local12 = Static155.anInt2984 - (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
		@Pc(22) int local22 = Static111.anInt2402 - (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
		@Pc(31) int local31 = (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11) + Static111.anInt2402;
		@Pc(44) int local44 = (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11) + Static155.anInt2984;
		if (local12 < 0) {
			Static193.anInt3062 = -1;
			Static155.anInt2984 = (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
			Static110.anInt2386 = -1;
		}
		if (Static90.anInt1950 < local44) {
			Static155.anInt2984 = Static90.anInt1950 - (int) ((double) Static202.aClass11_20.anInt312 / Static203.aDouble11);
			Static193.anInt3062 = -1;
			Static110.anInt2386 = -1;
		}
		if (local22 < 0) {
			Static111.anInt2402 = (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
			Static193.anInt3062 = -1;
			Static110.anInt2386 = -1;
		}
		if (local31 > Static35.anInt988) {
			Static110.anInt2386 = -1;
			Static111.anInt2402 = Static35.anInt988 - (int) ((double) Static202.aClass11_20.anInt263 / Static203.aDouble11);
			Static193.anInt3062 = -1;
		}
	}
}
