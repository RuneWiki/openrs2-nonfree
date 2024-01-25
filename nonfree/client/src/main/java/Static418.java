import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static418 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	public static final int[] anIntArray505 = new int[25];

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
	public static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method6753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILclient!bp;)V")
	public static void method6755(@OriginalArg(1) int arg0, @OriginalArg(2) Class41 arg1) {
		if (Static304.aBoolean472) {
			Static304.aBoolean472 = false;
			arg0 = 0;
		}
		if (Static436.aClass41_1 != null && Static436.aClass41_1.method1770(arg1)) {
			return;
		}
		Static436.aClass41_1 = arg1;
		Static476.aLong218 = Static277.method5091();
		Static190.anInt4460 = arg0;
		Static486.anInt9019 = arg0;
		if (Static486.anInt9019 == 0) {
			Static629.method9129();
			return;
		}
		Static3.aFloat208 = Static414.aFloat167;
		Static599.anInt10552 = Static457.anInt8404;
		Static90.aClass78_2 = Static409.aClass78_3;
		Static279.aFloat168 = Static535.aFloat203;
		Static536.aFloat204 = Static581.aFloat209;
		Static246.aFloat147 = Static138.aFloat102;
		Static628.aFloat212 = Static392.aFloat164;
		Static58.aFloat211 = Static147.aFloat105;
		Static253.anInt9842 = Static86.anInt2582;
		Static555.anInt9949 = Static234.anInt5124;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public static void method6758() {
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub7_2, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub21_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.lb, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub12_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub17_1, 1);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub20_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub1_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub28_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub15_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub4_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub8_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub25_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub23_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub27_2, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub22_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub14_1, 0);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub2_1, 0);
		Static524.method8703();
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub3_1, 2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub9_1, 2);
		Static538.method9146();
		Static305.method5400();
		Static291.aBoolean463 = true;
	}
}
