import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
	public static int anInt7600;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_165 = new Class40(72, 10);

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "[I")
	public static final int[] anIntArray596 = new int[6];

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "Z")
	public static boolean aBoolean524 = false;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIZIII)V")
	public static void method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg1 + 1;
		Static455.method6536(arg4, arg0, arg3, Static503.anIntArrayArray12[arg1]);
		@Pc(21) int local21 = arg2 - 1;
		Static455.method6536(arg4, arg0, arg3, Static503.anIntArrayArray12[arg2]);
		for (@Pc(25) int local25 = local8; local25 <= local21; local25++) {
			@Pc(31) int[] local31 = Static503.anIntArrayArray12[local25];
			local31[arg0] = local31[arg4] = arg3;
		}
	}
}
