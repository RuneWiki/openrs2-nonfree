import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
	public static final int[] anIntArray32 = new int[500];

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt1159 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public static void method1090() {
		Static289.aClass342_111.method7697(50);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
	public static void method1091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(9) int local9 = arg1; local9 <= arg2; local9++) {
			Static504.method6755(arg4, arg0, Static570.anIntArrayArray100[local9], arg3);
		}
	}
}
