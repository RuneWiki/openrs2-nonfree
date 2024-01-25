import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
	public static int anInt2003;

	@OriginalMember(owner = "client!eu", name = "P", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V")
	public static void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static331.method4435(arg0, Static155.anInt2670, Static219.anInt6125);
		@Pc(28) int local28 = Static331.method4435(arg3, Static155.anInt2670, Static219.anInt6125);
		@Pc(34) int local34 = Static331.method4435(arg1, Static215.anInt3546, Static317.anInt6670);
		@Pc(40) int local40 = Static331.method4435(arg2, Static215.anInt3546, Static317.anInt6670);
		@Pc(48) int local48 = Static331.method4435(arg4 + arg0, Static155.anInt2670, Static219.anInt6125);
		@Pc(56) int local56 = Static331.method4435(arg3 - arg4, Static155.anInt2670, Static219.anInt6125);
		for (@Pc(58) int local58 = local11; local58 < local48; local58++) {
			Static216.method2862(local34, local40, arg5, Static229.anIntArrayArray26[local58]);
		}
		for (@Pc(78) int local78 = local28; local78 > local56; local78--) {
			Static216.method2862(local34, local40, arg5, Static229.anIntArrayArray26[local78]);
		}
		@Pc(105) int local105 = Static331.method4435(arg1 + arg4, Static215.anInt3546, Static317.anInt6670);
		@Pc(114) int local114 = Static331.method4435(arg2 - arg4, Static215.anInt3546, Static317.anInt6670);
		for (@Pc(116) int local116 = local48; local116 <= local56; local116++) {
			@Pc(122) int[] local122 = Static229.anIntArrayArray26[local116];
			Static216.method2862(local34, local105, arg5, local122);
			Static216.method2862(local114, local40, arg5, local122);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
	public static int method1645(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
