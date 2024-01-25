import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Z")
	public static boolean aBoolean407;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[IIII)V")
	public static void method5303(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(13) int local13 = arg1 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (arg3 < local16) {
			@Pc(20) int local20 = arg3 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg2;
			arg3 = local50 + 1;
			arg0[arg3] = arg2;
		}
		while (arg3 < local13) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	public static void method5304() {
		Static114.aClass26_19.method329(5);
		Static182.aClass26_32.method329(5);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIIIII)V")
	public static void method5307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static280.anInt212 <= arg5 - arg3 && arg3 + arg5 <= Static346.anInt6607 && arg4 - arg3 >= Static240.anInt4829 && arg4 + arg3 <= Static166.anInt3315) {
			Static54.method822(arg3, arg1, arg5, arg4, arg0, arg2);
		} else {
			Static229.method4048(arg5, arg4, arg3, arg0, arg2, arg1);
		}
	}
}
