import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static final int anInt6092 = 50;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
	public static final int[] anIntArray427 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[anInt6092];

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
	public static final int[] anIntArray428 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
	public static final int[] anIntArray429 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
	public static final int[] anIntArray430 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
	public static final int[] anIntArray431 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public static int anInt6094 = 2;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
	public static final int[] anIntArray432 = new int[anInt6092];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)I")
	public static int method5104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static169.method3403(arg0 - 1, arg1 + -1) + Static169.method3403(arg0 - 1, arg1 + 1) + Static169.method3403(arg0 - -1, arg1 + -1) + Static169.method3403(arg0 - -1, arg1 + 1);
		@Pc(72) int local72 = Static169.method3403(arg0, arg1 - 1) + Static169.method3403(arg0, arg1 + 1) + Static169.method3403(arg0 + -1, arg1) + Static169.method3403(arg0 - -1, arg1);
		@Pc(77) int local77 = Static169.method3403(arg0, arg1);
		return local72 / 8 + local42 / 16 + local77 / 4;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lclient!we;")
	public static Class30_Sub2 method5105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub2_2;
	}
}
