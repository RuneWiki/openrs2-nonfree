import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public static int anInt696 = 1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)Z")
	public static boolean method621(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	public static void method625(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub17 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class259 local8 = Static43.aClass259Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static448.anInt6835; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static128.anInt2531; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static626.anInt9669;
							@Pc(32) int local32 = local12 << Static626.anInt9669;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class259 local41 = Static43.aClass259Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method9295(local12, local15) - local41.method9295(local12, local15);
									@Pc(71) int local71 = local8.method9295(local12, local15 + 1) - local41.method9295(local12, local15 + 1);
									@Pc(91) int local91 = local8.method9295(local12 + 1, local15 + 1) - local41.method9295(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method9295(local12 + 1, local15) - local41.method9295(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
