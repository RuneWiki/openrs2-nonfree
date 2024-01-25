import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_131 = new Class130(83, -1);

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_132 = new Class130(28, 3);

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
	public static int anInt9687 = 0;

	@OriginalMember(owner = "client!vba", name = "k", descriptor = "[I")
	public static final int[] anIntArray629 = new int[8];

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILclient!la;BZI)V")
	public static void method8303(@OriginalArg(2) int arg0, @OriginalArg(3) Class196 arg1, @OriginalArg(6) int arg2) {
		Static563.anInt9401 = arg2;
		Static406.anInt7454 = 2;
		Static141.anInt2838 = arg0;
		Static402.aClass196_83 = arg1;
		Static236.aClass3_Sub7_Sub2_1 = null;
		Static324.anInt8117 = 1;
		Static185.aBoolean342 = false;
		Static495.anInt8540 = 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)I")
	public static int method8304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg2;
		}
		@Pc(22) int local22 = 128 - arg1;
		@Pc(37) int local37 = local22 * (arg2 & 0x7F) + arg1 * (arg0 & 0x7F) >> 7;
		@Pc(51) int local51 = local22 * (arg2 & 0x380) + arg1 * (arg0 & 0x380) >> 7;
		@Pc(66) int local66 = (arg2 & 0xFC00) * local22 + arg1 * (arg0 & 0xFC00) >> 7;
		return local66 & 0xFC00 | local51 & 0x380 | local37 & 0x7F;
	}
}
