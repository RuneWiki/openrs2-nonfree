import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
	public static int anInt5182;

	@OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
	public static int anInt5184;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "[I")
	public static final int[] anIntArray495 = new int[14];

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
	public static int anInt5176 = 0;

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
	public static int anInt5185 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)I")
	public static int method4633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local19;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4635(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static7.method123(arg0, -1, arg4, null, arg1, arg2, arg3);
	}
}
