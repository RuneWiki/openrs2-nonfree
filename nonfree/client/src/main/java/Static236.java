import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
	public static final int[] anIntArray356 = new int[4];

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public static void method3674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class5 local17 = Static368.aClass5ArrayArray1[arg1][arg2];
		Static232.method7845(local17 == null ? Static9.aClass5_1 : local17, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)Z")
	public static boolean method3675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static189.method3219(arg0, arg1) & Static170.method2695(arg1, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)V")
	public static void method3677(@OriginalArg(0) int arg0) {
		Static435.anIntArray555 = new int[arg0];
		Static471.anIntArray579 = new int[arg0];
		Static103.anIntArray152 = new int[arg0];
		Static443.anIntArray562 = new int[arg0];
		Static249.anIntArray376 = new int[arg0];
	}
}
