import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static int anInt6881;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static final int anInt6879 = 1337;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V")
	public static void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static361.aClass85_Sub1_1.anInt2496 * arg1 >> 8;
		if (local10 != 0 && arg2 != -1) {
			Static163.method2712(arg2, local10, Static265.aClass187_83);
			Static290.aBoolean344 = true;
		}
	}
}
