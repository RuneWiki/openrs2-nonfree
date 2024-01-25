import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array19;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!dk;")
	public static Class54 aClass54_94;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_164 = new Class102(20, 6);

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public static int anInt5739 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIIII)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = Static331.method4435(arg1, Static155.anInt2670, Static219.anInt6125);
		@Pc(21) int local21 = Static331.method4435(arg4, Static155.anInt2670, Static219.anInt6125);
		@Pc(27) int local27 = Static331.method4435(arg0, Static215.anInt3546, Static317.anInt6670);
		@Pc(33) int local33 = Static331.method4435(arg2, Static215.anInt3546, Static317.anInt6670);
		@Pc(41) int local41 = Static331.method4435(arg1 + arg3, Static155.anInt2670, Static219.anInt6125);
		@Pc(50) int local50 = Static331.method4435(arg4 - arg3, Static155.anInt2670, Static219.anInt6125);
		for (@Pc(52) int local52 = local15; local52 < local41; local52++) {
			Static216.method2862(local27, local33, arg6, Static229.anIntArrayArray26[local52]);
		}
		for (@Pc(72) int local72 = local21; local72 > local50; local72--) {
			Static216.method2862(local27, local33, arg6, Static229.anIntArrayArray26[local72]);
		}
		@Pc(98) int local98 = Static331.method4435(arg0 + arg3, Static215.anInt3546, Static317.anInt6670);
		@Pc(107) int local107 = Static331.method4435(arg2 - arg3, Static215.anInt3546, Static317.anInt6670);
		for (@Pc(109) int local109 = local41; local109 <= local50; local109++) {
			@Pc(115) int[] local115 = Static229.anIntArrayArray26[local109];
			Static216.method2862(local27, local98, arg6, local115);
			Static216.method2862(local98, local107, arg5, local115);
			Static216.method2862(local107, local33, arg6, local115);
		}
	}
}
