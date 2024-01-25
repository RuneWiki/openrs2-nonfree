import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
	public static final int[] anIntArray299 = new int[8];

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	public static int anInt5082 = 0;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
	public static void method3976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class210 local9 = Static167.aClass210ArrayArray1[arg0][arg1];
		Static350.method4432(local9 == null ? Static211.aClass210_2 : local9, arg2);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	public static int method3977(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
