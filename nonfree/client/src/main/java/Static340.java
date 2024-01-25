import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt6975 = 13156520;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt6976 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZ)V")
	public static void method5394(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static204.anInt3409++;
			Static97.method1504();
		}
		if (arg0) {
			Static315.anInt5432++;
			Static348.method4628();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method5395() {
		if (Static236.aClass258_6 != Static260.aClass258_7) {
			try {
				Static469.method4194("tbrefresh", Static320.aClient1);
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public static void method5397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg2 <= arg0) {
			for (local15 = arg2; local15 < arg0; local15++) {
				Static229.anIntArrayArray26[local15][arg3] = arg1;
			}
		} else {
			for (local15 = arg0; local15 < arg2; local15++) {
				Static229.anIntArrayArray26[local15][arg3] = arg1;
			}
		}
	}
}
