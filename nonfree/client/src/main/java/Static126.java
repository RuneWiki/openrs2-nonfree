import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Lclient!gj;")
	public static Class143 aClass143_32;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	public static final int[] anIntArray159 = new int[25];

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_38 = new Class376(60, 4);

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_43 = new Class126(102, 2);

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
	public static final int[] anIntArray160 = new int[32];

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method2226() {
		Static527.method7376();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIIII)V")
	public static void method2228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 + 1;
		Static526.method7369(Static299.anIntArrayArray58[arg0], arg3, arg1, arg4);
		@Pc(17) int local17 = arg2 - 1;
		Static526.method7369(Static299.anIntArrayArray58[arg2], arg3, arg1, arg4);
		for (@Pc(25) int local25 = local8; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static299.anIntArrayArray58[local25];
			local31[arg1] = local31[arg3] = arg4;
		}
	}
}
