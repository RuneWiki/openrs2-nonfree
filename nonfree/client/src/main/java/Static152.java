import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public static int anInt4540;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!wo;")
	public static Class216 aClass216_71;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public static int anInt4543 = 0;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
	public static final int[] anIntArray408 = new int[14];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public static void method4088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg1 > arg2) {
			for (local19 = arg2; local19 < arg1; local19++) {
				Static344.anIntArrayArray65[local19][arg3] = arg0;
			}
		} else {
			for (local19 = arg1; local19 < arg2; local19++) {
				Static344.anIntArrayArray65[local19][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[II)V")
	public static void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg1; local51++) {
			if (local25 + (local51 & 0x1) > arg3[local51]) {
				@Pc(67) int local67 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21] = local67;
				@Pc(81) int local81 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local81;
			}
		}
		arg3[arg1] = arg3[local21];
		arg3[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method4089(arg0, local21 - 1, arg2, arg3);
		method4089(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method4092() {
		Static324.aClass87_58.method2473(5);
	}
}
