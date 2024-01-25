import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!or;")
	public static Class183 aClass183_4;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	public static int anInt6077;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_124 = new Class211(75, 12);

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[J")
	public static final long[] aLongArray9 = new long[32];

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "[I")
	public static final int[] anIntArray525 = new int[32];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 >= Static317.anInt6670 && arg3 <= Static215.anInt3546 && arg1 >= Static219.anInt6125 && arg2 <= Static155.anInt2670) {
			Static218.method2889(arg3, arg4, arg0, arg6, arg5, arg1, arg2);
		} else {
			Static222.method4510(arg4, arg1, arg3, arg0, arg2, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)V")
	public static void method4751(@OriginalArg(0) long arg0) {
		Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
		Static456.aClass2_Sub13_Sub2_2.method3602(Static167.aClass236_8.anInt6448);
		Static456.aClass2_Sub13_Sub2_2.method3570(arg0);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static331.anInt5597);
		Static310.anInt5372 = -3;
		Static116.anInt2153 = 0;
		Static128.anInt2309 = 1;
		Static183.anInt3120 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	public static void method4752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static219.anInt6125 && arg2 <= Static155.anInt2670) {
			@Pc(19) int local19 = Static331.method4435(arg0, Static215.anInt3546, Static317.anInt6670);
			@Pc(25) int local25 = Static331.method4435(arg3, Static215.anInt3546, Static317.anInt6670);
			Static373.method4858(local25, local19, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
