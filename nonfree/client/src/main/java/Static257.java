import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Lclient!rk;")
	public static Class180 aClass180_67;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
	public static final int[] anIntArray649 = new int[1024];

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	public static int anInt4958 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	public static void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static142.anInt3103 && arg3 <= Static314.anInt6030) {
			@Pc(15) int local15 = Static270.method4496(Static168.anInt3509, arg1, Static61.anInt1534);
			@Pc(21) int local21 = Static270.method4496(Static168.anInt3509, arg2, Static61.anInt1534);
			Static353.method2004(arg0, arg3, local21, local15);
		}
	}
}
