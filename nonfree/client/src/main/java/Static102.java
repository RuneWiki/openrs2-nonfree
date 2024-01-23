import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "[[[Lclient!vb;")
	public static Class2_Sub31[][][] aClass2_Sub31ArrayArrayArray1;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public static int anInt2236;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!ec;")
	public static Class46 aClass46_14 = new Class46(64);

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public static int anInt2234 = 0;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Z")
	public static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1925() {
		aClass46_14.method1077();
		Static261.aClass46_35.method1077();
		Static39.aClass46_6.method1077();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method1926() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static13.anInt332];
		for (@Pc(12) int local12 = 0; local12 < Static13.anInt332; local12++) {
			@Pc(23) Class155 local23 = Static152.method2616(local12);
			if (local23.anInt4821 >= 0 || local23.anInt4839 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static67.anIntArray523 = new int[local7];
		for (@Pc(54) int local54 = 0; local54 < local7; local54++) {
			Static67.anIntArray523[local54] = local10[local54];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!jd;III)[Lclient!rj;")
	public static Class2_Sub3_Sub1[] method1927(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		return Static288.method4789(0, arg1, arg0) ? Static54.method1069() : null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg0;
		@Pc(13) int local13 = arg0 + arg3;
		@Pc(18) int local18 = arg6 - arg0;
		@Pc(23) int local23 = arg2 - arg0;
		@Pc(25) int local25;
		for (local25 = arg5; local25 < local9; local25++) {
			Static133.method2321(arg2, arg3, Static274.anIntArrayArray50[local25], arg4);
		}
		for (local25 = arg6; local25 > local18; local25--) {
			Static133.method2321(arg2, arg3, Static274.anIntArrayArray50[local25], arg4);
		}
		for (local25 = local9; local25 <= local18; local25++) {
			@Pc(75) int[] local75 = Static274.anIntArrayArray50[local25];
			Static133.method2321(local13, arg3, local75, arg4);
			Static133.method2321(local23, local13, local75, arg1);
			Static133.method2321(arg2, local23, local75, arg4);
		}
	}
}
