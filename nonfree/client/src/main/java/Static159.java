import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "Lclient!jd;")
	public static Class84 aClass84_64;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "Lclient!ec;")
	public static Class46 aClass46_27 = new Class46(200);

	@OriginalMember(owner = "client!mg", name = "jb", descriptor = "I")
	public static int anInt3363 = -1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIIIII)V")
	public static void method2769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static202.method3411(Static127.anInt2664, arg0, Static290.anInt6021);
		@Pc(17) int local17 = Static202.method3411(Static127.anInt2664, arg2, Static290.anInt6021);
		@Pc(23) int local23 = Static202.method3411(Static68.anInt1509, arg3, Static43.anInt1054);
		@Pc(29) int local29 = Static202.method3411(Static68.anInt1509, arg1, Static43.anInt1054);
		@Pc(37) int local37 = Static202.method3411(Static127.anInt2664, arg5 + arg0, Static290.anInt6021);
		@Pc(46) int local46 = Static202.method3411(Static127.anInt2664, arg2 - arg5, Static290.anInt6021);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static133.method2321(local29, local23, Static274.anIntArrayArray50[local48], arg4);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static133.method2321(local29, local23, Static274.anIntArrayArray50[local48], arg4);
		}
		@Pc(94) int local94 = Static202.method3411(Static68.anInt1509, arg5 + arg3, Static43.anInt1054);
		@Pc(103) int local103 = Static202.method3411(Static68.anInt1509, arg1 - arg5, Static43.anInt1054);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(112) int[] local112 = Static274.anIntArrayArray50[local48];
			Static133.method2321(local94, local23, local112, arg4);
			Static133.method2321(local29, local103, local112, arg4);
		}
	}
}
