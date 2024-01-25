import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt2876;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
	public static int[] anIntArray216;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
	public static final int[] anIntArray214 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
	public static final int[] anIntArray215 = new int[50];

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public static int anInt2883 = 0;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
	public static final int[] anIntArray217 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static277.anIntArray417[arg1] = arg0;
		@Pc(23) Class1_Sub14 local23 = (Class1_Sub14) Static228.aClass38_25.method1475((long) arg1);
		if (local23 == null) {
			local23 = new Class1_Sub14(4611686018427387905L);
			Static228.aClass38_25.method1472(local23, (long) arg1);
		} else if (local23.aLong54 != 4611686018427387905L) {
			local23.aLong54 = Static183.method3462() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!kg;)V")
	public static void method2725(@OriginalArg(1) Class112 arg0) {
		if (arg0.anInt3397 == Static185.anInt1930) {
			Static207.aBooleanArray21[arg0.anInt3452] = true;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method2727(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg0, 4);
		local13.method3481();
	}
}
