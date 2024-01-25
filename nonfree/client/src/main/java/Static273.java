import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	public static int anInt5828;

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public static int anInt5829;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!an;")
	public static final Class20 aClass20_8 = new Class20(8, -1);

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
	public static final int[] anIntArray338 = new int[4096];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIII)V")
	public static void method4938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class260 local14 = Static165.aClass260ArrayArray1[arg2][arg1];
		Static279.method4951(local14 == null ? Static561.aClass260_2 : local14, arg0);
	}
}
