import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_11 = new Class306();

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "[I")
	public static final int[] anIntArray138 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method1501(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static27.method539(local6.height, local6.width);
		if (Static453.anInt7627 == 1) {
			Static512.aClass126_22.method6979(arg0, Static134.anInt2214, Static444.anInt7482);
		} else {
			Static512.aClass126_22.method6979(arg0, Static27.anInt517, Static554.anInt9157);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg4 && arg2 == arg1 && arg3 == arg6 && arg8 == arg0) {
			Static139.method2089(arg6, arg5, arg2, arg0, arg7);
			return;
		}
		@Pc(32) int local32 = arg7;
		@Pc(34) int local34 = arg2;
		@Pc(38) int local38 = arg7 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(68) int local68 = arg6 + local46 - arg7 - local54;
		@Pc(78) int local78 = local50 + arg0 - arg2 - local58;
		@Pc(88) int local88 = local54 + local38 - local46 - local46;
		@Pc(96) int local96 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local116 * local108 >> 12;
			@Pc(126) int local126 = local68 * local122;
			@Pc(130) int local130 = local122 * local78;
			@Pc(134) int local134 = local116 * local88;
			@Pc(138) int local138 = local116 * local96;
			@Pc(142) int local142 = local108 * local101;
			@Pc(146) int local146 = local106 * local108;
			@Pc(157) int local157 = arg7 + (local142 + local134 + local126 >> 12);
			@Pc(168) int local168 = arg2 + (local146 + local138 + local130 >> 12);
			Static139.method2089(local157, arg5, local34, local168, local32);
			local32 = local157;
			local34 = local168;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lclient!gl;")
	public static Class5_Sub2 method1503(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class5_Sub2_Sub6();
		} else if (arg0 == 1) {
			return new Class5_Sub2_Sub8();
		} else if (arg0 == 2) {
			return new Class5_Sub2_Sub14();
		} else if (arg0 == 3) {
			return new Class5_Sub2_Sub23();
		} else if (arg0 == 4) {
			return new Class5_Sub2_Sub13();
		} else if (arg0 == 5) {
			return new Class5_Sub2_Sub19();
		} else if (arg0 == 6) {
			return new Class5_Sub2_Sub34();
		} else if (arg0 == 7) {
			return new Class5_Sub2_Sub20();
		} else if (arg0 == 8) {
			return new Class5_Sub2_Sub38();
		} else if (arg0 == 9) {
			return new Class5_Sub2_Sub25();
		} else if (arg0 == 10) {
			return new Class5_Sub2_Sub26();
		} else if (arg0 == 11) {
			return new Class5_Sub2_Sub28();
		} else if (arg0 == 12) {
			return new Class5_Sub2_Sub22();
		} else if (arg0 == 13) {
			return new Class5_Sub2_Sub30();
		} else if (arg0 == 14) {
			return new Class5_Sub2_Sub21();
		} else if (arg0 == 15) {
			return new Class5_Sub2_Sub15();
		} else if (arg0 == 16) {
			return new Class5_Sub2_Sub32();
		} else if (arg0 == 17) {
			return new Class5_Sub2_Sub37();
		} else if (arg0 == 18) {
			return new Class5_Sub2_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class5_Sub2_Sub27();
		} else if (arg0 == 20) {
			return new Class5_Sub2_Sub10();
		} else if (arg0 == 21) {
			return new Class5_Sub2_Sub7();
		} else if (arg0 == 22) {
			return new Class5_Sub2_Sub35();
		} else if (arg0 == 23) {
			return new Class5_Sub2_Sub18();
		} else if (arg0 == 24) {
			return new Class5_Sub2_Sub2();
		} else if (arg0 == 25) {
			return new Class5_Sub2_Sub36();
		} else if (arg0 == 26) {
			return new Class5_Sub2_Sub3();
		} else if (arg0 == 27) {
			return new Class5_Sub2_Sub11();
		} else if (arg0 == 28) {
			return new Class5_Sub2_Sub24();
		} else if (arg0 == 29) {
			return new Class5_Sub2_Sub16();
		} else if (arg0 == 30) {
			return new Class5_Sub2_Sub31();
		} else if (arg0 == 31) {
			return new Class5_Sub2_Sub29();
		} else if (arg0 == 32) {
			return new Class5_Sub2_Sub4();
		} else if (arg0 == 33) {
			return new Class5_Sub2_Sub17();
		} else if (arg0 == 34) {
			return new Class5_Sub2_Sub1();
		} else if (arg0 == 35) {
			return new Class5_Sub2_Sub5();
		} else if (arg0 == 36) {
			return new Class5_Sub2_Sub33();
		} else if (arg0 == 37) {
			return new Class5_Sub2_Sub39();
		} else if (arg0 == 38) {
			return new Class5_Sub2_Sub9();
		} else if (arg0 == 39) {
			return new Class5_Sub2_Sub12();
		} else {
			return null;
		}
	}
}
