import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_41 = new Class208(60, -1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)Lclient!sd;")
	public static Class2_Sub2 method2341(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub2_Sub26();
		} else if (arg0 == 1) {
			return new Class2_Sub2_Sub35();
		} else if (arg0 == 2) {
			return new Class2_Sub2_Sub17();
		} else if (arg0 == 3) {
			return new Class2_Sub2_Sub11();
		} else if (arg0 == 4) {
			return new Class2_Sub2_Sub30();
		} else if (arg0 == 5) {
			return new Class2_Sub2_Sub14();
		} else if (arg0 == 6) {
			return new Class2_Sub2_Sub25();
		} else if (arg0 == 7) {
			return new Class2_Sub2_Sub13();
		} else if (arg0 == 8) {
			return new Class2_Sub2_Sub20();
		} else if (arg0 == 9) {
			return new Class2_Sub2_Sub10();
		} else if (arg0 == 10) {
			return new Class2_Sub2_Sub22();
		} else if (arg0 == 11) {
			return new Class2_Sub2_Sub29();
		} else if (arg0 == 12) {
			return new Class2_Sub2_Sub19();
		} else if (arg0 == 13) {
			return new Class2_Sub2_Sub1();
		} else if (arg0 == 14) {
			return new Class2_Sub2_Sub3();
		} else if (arg0 == 15) {
			return new Class2_Sub2_Sub7();
		} else if (arg0 == 16) {
			return new Class2_Sub2_Sub38();
		} else if (arg0 == 17) {
			return new Class2_Sub2_Sub6();
		} else if (arg0 == 18) {
			return new Class2_Sub2_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub2_Sub18();
		} else if (arg0 == 20) {
			return new Class2_Sub2_Sub2();
		} else if (arg0 == 21) {
			return new Class2_Sub2_Sub4();
		} else if (arg0 == 22) {
			return new Class2_Sub2_Sub36();
		} else if (arg0 == 23) {
			return new Class2_Sub2_Sub27();
		} else if (arg0 == 24) {
			return new Class2_Sub2_Sub37();
		} else if (arg0 == 25) {
			return new Class2_Sub2_Sub33();
		} else if (arg0 == 26) {
			return new Class2_Sub2_Sub9();
		} else if (arg0 == 27) {
			return new Class2_Sub2_Sub34();
		} else if (arg0 == 28) {
			return new Class2_Sub2_Sub8();
		} else if (arg0 == 29) {
			return new Class2_Sub2_Sub32();
		} else if (arg0 == 30) {
			return new Class2_Sub2_Sub21();
		} else if (arg0 == 31) {
			return new Class2_Sub2_Sub16();
		} else if (arg0 == 32) {
			return new Class2_Sub2_Sub23();
		} else if (arg0 == 33) {
			return new Class2_Sub2_Sub39();
		} else if (arg0 == 34) {
			return new Class2_Sub2_Sub28();
		} else if (arg0 == 35) {
			return new Class2_Sub2_Sub31();
		} else if (arg0 == 36) {
			return new Class2_Sub2_Sub15();
		} else if (arg0 == 37) {
			return new Class2_Sub2_Sub24();
		} else if (arg0 == 38) {
			return new Class2_Sub2_Sub5();
		} else if (arg0 == 39) {
			return new Class2_Sub2_Sub12();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZII)V")
	public static void method2342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static101.anInt1574 = arg3;
		Static258.anInt4504 = arg0;
		Static129.anInt2190 = arg2;
		Static419.anInt7190 = arg1;
		Static385.anInt6689 = arg4;
		if (Static419.anInt7190 >= 100) {
			@Pc(26) int local26 = Static101.anInt1574 * 128 + 64;
			@Pc(32) int local32 = Static258.anInt4504 * 128 + 64;
			@Pc(44) int local44 = Static365.method3535(Static204.anInt3498, local26, local32) - Static129.anInt2190;
			@Pc(49) int local49 = local26 - Static263.anInt4619;
			@Pc(54) int local54 = local44 - Static260.anInt4601;
			@Pc(59) int local59 = local32 - Static120.anInt2052;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local49 * local49 + local59 * local59));
			Static213.anInt3662 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static144.anInt2665 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			if (Static213.anInt3662 < 1024) {
				Static213.anInt3662 = 1024;
			}
			Static68.anInt1160 = 0;
			if (Static213.anInt3662 > 3072) {
				Static213.anInt3662 = 3072;
			}
		}
		Static25.anInt7273 = 2;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method2343() {
		Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
		Static434.anInt7319 = 0;
		Static302.anInt5465 = 0;
		Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
		Static359.aClass25_154 = null;
		Static463.aClass25_185 = null;
		Static117.aClass25_55 = null;
		Static292.anInt5209 = 0;
		Static119.aClass25_57 = null;
		Static194.method2776();
		Static157.method2339();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static435.aClass11_Sub5_Sub2_Sub1Array1[local31] = null;
		}
		Static127.aClass11_Sub5_Sub2_Sub1_2 = null;
		for (@Pc(45) int local45 = 0; local45 < Static30.anInt548; local45++) {
			@Pc(52) Class11_Sub5_Sub2_Sub2 local52 = Static226.aClass2_Sub34Array1[local45].aClass11_Sub5_Sub2_Sub2_2;
			if (local52 != null) {
				local52.anInt7656 = -1;
			}
		}
		Static55.method901();
		Static25.anInt7273 = 1;
		Static274.method3920(9);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static186.aBooleanArray12[local81] = true;
		}
		Static414.method5687();
		Static264.aClass2_Sub44_1 = null;
		Static461.aLong399 = 0L;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIZII)V")
	public static void method2345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static347.anInt6160 <= arg5 && Static385.anInt6686 >= arg6 && arg0 >= Static118.anInt2005 && arg2 <= Static123.anInt2069) {
			Static259.method3673(arg1, arg6, arg3, arg2, arg0, arg5, arg4);
		} else {
			Static334.method4755(arg0, arg3, arg6, arg2, arg1, arg4, arg5);
		}
	}
}
