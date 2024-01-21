import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "J")
	public static long aLong119;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!td;")
	public static Class79 aClass79_24 = new Class79(64);

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1466 = Static169.method2903("scape main");

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	public static int anInt3818 = 0;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1469 = Static169.method2903("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1467 = aClass23_1469;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1468 = null;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public static int anInt3821 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!nb;IIII)V")
	public static void method2640(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == null) {
			return;
		}
		@Pc(18) int local18 = arg0 * arg0 + arg4 * arg4;
		@Pc(25) int local25 = Static127.anInt3355 + Static179.anInt4264 & 0x7FF;
		if (local18 > 6400) {
			return;
		}
		@Pc(33) int local33 = Class1_Sub1_Sub12_Sub2.anIntArray417[local25];
		@Pc(41) int local41 = local33 * 256 / (Static49.anInt1423 + 256);
		@Pc(45) int local45 = Class1_Sub1_Sub12_Sub2.anIntArray416[local25];
		@Pc(53) int local53 = local45 * 256 / (Static49.anInt1423 + 256);
		@Pc(63) int local63 = arg0 * local53 + arg4 * local41 >> 16;
		@Pc(74) int local74 = local41 * arg0 - arg4 * local53 >> 16;
		if (local18 <= 2500) {
			arg1.method1944(local63 + arg2 + 4 + 94 - arg1.anInt2797 / 2, -(arg1.anInt2800 / 2) + -local74 + 83 + (arg3 - 4));
		} else {
			arg1.method1939(Static127.aClass1_Sub1_Sub12_Sub4_5, arg2 + local63 + 4 + 94 - arg1.anInt2797 / 2, -(arg1.anInt2800 / 2) + -local74 + arg3 + 83 + -4);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static49.method916(arg3)) {
			Static29.method529(-1, arg1, arg5, arg6, Static9.aClass60ArrayArray1[arg3], arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public static void method2642() {
		aClass23_1468 = null;
		aClass23_1469 = null;
		aClass23_1466 = null;
		anIntArray514 = null;
		aClass23_1467 = null;
		aClass79_24 = null;
		anIntArray516 = null;
	}
}
