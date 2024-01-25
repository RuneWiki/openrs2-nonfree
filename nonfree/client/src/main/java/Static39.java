import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
	public static int anInt747 = -1;

	@OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
	public static int anInt749 = 0;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BIIIII)V")
	public static void method644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 + 1;
		Static264.method4006(arg4, arg0, arg2, Static155.anIntArrayArray32[arg3]);
		@Pc(26) int local26 = arg1 - 1;
		Static264.method4006(arg4, arg0, arg2, Static155.anIntArrayArray32[arg1]);
		for (@Pc(30) int local30 = local12; local30 <= local26; local30++) {
			@Pc(36) int[] local36 = Static155.anIntArrayArray32[local30];
			local36[arg2] = local36[arg4] = arg0;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)V")
	public static void method645() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static543.aBooleanArray30[local7] = true;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)Lclient!bg;")
	public static Class32 method646() {
		try {
			return new Class32_Sub1();
		} catch (@Pc(12) Throwable local12) {
			try {
				return (Class32) Class.forName("Class32_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class32_Sub2();
			}
		}
	}
}
