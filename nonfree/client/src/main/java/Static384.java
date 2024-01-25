import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nba", name = "v", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
	public static int anInt7056;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "[I")
	public static final int[] anIntArray515 = new int[3];

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)V")
	public static void method5712(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 12);
		local9.method2822();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIZ)V")
	public static void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static205.aClass187_31.method4078((long) arg0) != null) {
			return;
		}
		if (Static318.aBoolean427) {
			@Pc(34) Class14_Sub15 local34 = new Class14_Sub15(arg0, new Class63_Sub1(4096, Static497.aClass386_129, arg0), arg1, arg2);
			local34.aClass63_Sub1_1.method1519(Static204.aStringArray36[Static232.anInt4258]);
			Static205.aClass187_31.method4077((long) arg0, local34);
		} else {
			Static169.method2766(arg2, arg0);
		}
	}
}
