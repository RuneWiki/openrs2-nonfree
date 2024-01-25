import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!fs;IZ)V")
	public static void method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class76 arg2) {
		Static19.aBoolean30 = false;
		Static27.anInt461 = 1;
		Static206.anInt3920 = arg0;
		Static47.anInt811 = 10000;
		Static397.anInt742 = 0;
		Static14.anInt190 = arg1;
		Static236.aClass76_49 = arg2;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V")
	public static void method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = Static332.method4519(Static168.anInt3256, arg0, Static376.anInt6287);
		@Pc(25) int local25 = Static332.method4519(Static168.anInt3256, arg4, Static376.anInt6287);
		@Pc(31) int local31 = Static332.method4519(Static208.anInt2656, arg3, Static354.anInt6186);
		@Pc(37) int local37 = Static332.method4519(Static208.anInt2656, arg2, Static354.anInt6186);
		for (@Pc(39) int local39 = local19; local39 <= local25; local39++) {
			Static251.method3640(local31, arg1, local37, Static96.anIntArrayArray21[local39]);
		}
	}
}
