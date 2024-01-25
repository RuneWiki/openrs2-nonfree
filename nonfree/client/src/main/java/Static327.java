import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method5369(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(9) int local9 = arg0.method5606();
		Static249.aClass349Array1 = new Class349[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static249.aClass349Array1[local14] = new Class349();
			Static249.aClass349Array1[local14].anInt9681 = arg0.method5606();
			Static249.aClass349Array1[local14].aString96 = arg0.method5605();
		}
		Static597.anInt9711 = arg0.method5606();
		Static527.anInt8945 = arg0.method5606();
		Static645.anInt10266 = arg0.method5606();
		Static230.aClass354_Sub1Array1 = new Class354_Sub1[Static527.anInt8945 + 1 - Static597.anInt9711];
		for (@Pc(74) int local74 = 0; local74 < Static645.anInt10266; local74++) {
			@Pc(80) int local80 = arg0.method5606();
			@Pc(88) Class354_Sub1 local88 = Static230.aClass354_Sub1Array1[local80] = new Class354_Sub1();
			local88.anInt9772 = arg0.method5633();
			local88.anInt9771 = arg0.method5585();
			local88.anInt9773 = local80 + Static597.anInt9711;
			local88.aString99 = arg0.method5605();
			local88.aString100 = arg0.method5605();
		}
		Static353.anInt6518 = arg0.method5585();
		Static246.aBoolean356 = true;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
	public static int method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static2.method24(arg0 + 45365, arg1 - -91923, 4) + (Static2.method24(arg0 + 10294, arg1 - -37821, 2) - 128 >> 1) + (Static2.method24(arg0, arg1, 1) + -128 >> 2) - 128;
		local49 = (int) ((double) local49 * 0.3D) + 35;
		if (local49 < 10) {
			local49 = 10;
		} else if (local49 > 60) {
			local49 = 60;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lclient!gs;")
	public static Class3_Sub2 method5371(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub2_Sub36();
		} else if (arg0 == 1) {
			return new Class3_Sub2_Sub22();
		} else if (arg0 == 2) {
			return new Class3_Sub2_Sub39();
		} else if (arg0 == 3) {
			return new Class3_Sub2_Sub9();
		} else if (arg0 == 4) {
			return new Class3_Sub2_Sub3();
		} else if (arg0 == 5) {
			return new Class3_Sub2_Sub15();
		} else if (arg0 == 6) {
			return new Class3_Sub2_Sub33();
		} else if (arg0 == 7) {
			return new Class3_Sub2_Sub10();
		} else if (arg0 == 8) {
			return new Class3_Sub2_Sub12();
		} else if (arg0 == 9) {
			return new Class3_Sub2_Sub24();
		} else if (arg0 == 10) {
			return new Class3_Sub2_Sub23();
		} else if (arg0 == 11) {
			return new Class3_Sub2_Sub14();
		} else if (arg0 == 12) {
			return new Class3_Sub2_Sub19();
		} else if (arg0 == 13) {
			return new Class3_Sub2_Sub20();
		} else if (arg0 == 14) {
			return new Class3_Sub2_Sub34();
		} else if (arg0 == 15) {
			return new Class3_Sub2_Sub2();
		} else if (arg0 == 16) {
			return new Class3_Sub2_Sub11();
		} else if (arg0 == 17) {
			return new Class3_Sub2_Sub38();
		} else if (arg0 == 18) {
			return new Class3_Sub2_Sub4_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub2_Sub16();
		} else if (arg0 == 20) {
			return new Class3_Sub2_Sub27();
		} else if (arg0 == 21) {
			return new Class3_Sub2_Sub5();
		} else if (arg0 == 22) {
			return new Class3_Sub2_Sub7();
		} else if (arg0 == 23) {
			return new Class3_Sub2_Sub17();
		} else if (arg0 == 24) {
			return new Class3_Sub2_Sub18();
		} else if (arg0 == 25) {
			return new Class3_Sub2_Sub8();
		} else if (arg0 == 26) {
			return new Class3_Sub2_Sub21();
		} else if (arg0 == 27) {
			return new Class3_Sub2_Sub35();
		} else if (arg0 == 28) {
			return new Class3_Sub2_Sub30();
		} else if (arg0 == 29) {
			return new Class3_Sub2_Sub6();
		} else if (arg0 == 30) {
			return new Class3_Sub2_Sub13();
		} else if (arg0 == 31) {
			return new Class3_Sub2_Sub31();
		} else if (arg0 == 32) {
			return new Class3_Sub2_Sub26();
		} else if (arg0 == 33) {
			return new Class3_Sub2_Sub1();
		} else if (arg0 == 34) {
			return new Class3_Sub2_Sub25();
		} else if (arg0 == 35) {
			return new Class3_Sub2_Sub32();
		} else if (arg0 == 36) {
			return new Class3_Sub2_Sub29();
		} else if (arg0 == 37) {
			return new Class3_Sub2_Sub37();
		} else if (arg0 == 38) {
			return new Class3_Sub2_Sub28();
		} else if (arg0 == 39) {
			return new Class3_Sub2_Sub4();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public static void method5375() {
		Static89.aClass25_27.method433();
		Static285.aClass363_42.method8419();
		Static193.aClass363_57.method8419();
	}
}
