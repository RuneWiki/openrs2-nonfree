import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "Lclient!hf;")
	public static Class32 aClass32_8;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1248 = Static161.method2971("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1247 = aClass13_1248;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1249 = aClass13_1248;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[Lclient!dd;[SII)V")
	public static void method2611(@OriginalArg(1) Class13[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) Class13 local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) short local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg2; local50++) {
			if (local24 == null || arg0[local50] != null && arg0[local50].method896(local24) < (local50 & 0x1)) {
				@Pc(72) Class13 local72 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20] = local72;
				@Pc(86) short local86 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local86;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method2611(arg0, arg1, local20 - 1, arg3);
		method2611(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public static void method2613() {
		aClass32_8 = null;
		aClass13_1247 = null;
		aClass13_1248 = null;
		aClass13_1249 = null;
		aBooleanArrayArrayArrayArray1 = null;
	}
}
