import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public static int anInt7149;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean504 = false;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public static int anInt7144 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	public static void method5796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static300.aClass5_Sub28_Sub1_1.anInt4889 * arg0 >> 8;
		if (arg2 == -1 && !Static359.aBoolean477) {
			Static369.method5025();
		} else if (arg2 != -1 && (Static161.anInt3277 != arg2 || !Static133.method2508()) && local10 != 0 && !Static359.aBoolean477) {
			Static218.method3518(local10, Static108.aClass117_61, arg1, arg2);
		}
		Static161.anInt3277 = arg2;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public static void method5797() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static494.aBooleanArray35[local7] = false;
		}
		Static206.anInt5076 = Static141.anInt2910;
		Static166.anInt3343 = 5;
		Static73.anInt1454 = 0;
		Static62.anInt8330 = Static182.anInt3520;
		Static167.anInt3381 = Static481.anInt8318;
		Static364.anInt6808 = Static180.anInt3500;
		Static466.anInt7999 = -1;
		Static106.anInt2331 = Static367.anInt6861;
		Static93.anInt2151 = -1;
		Static305.anInt6031 = Static364.anInt6817;
		Static107.anInt2340 = 0;
	}
}
