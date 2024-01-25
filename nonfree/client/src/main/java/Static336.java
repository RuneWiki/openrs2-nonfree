import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "Z")
	public static boolean aBoolean405;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_131 = new Class7("M", "M", "M", "M");

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
	public static final int[] anIntArray525 = new int[32];

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_70 = new Class179(1, -1);

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_166 = new Class107(90, 14);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
	public static void method4750(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub2_Sub1 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class149 local8 = Static269.aClass149Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static87.anInt1875; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static132.anInt2639; local15++) {
						local1 = local8.k(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static31.anInt665;
							@Pc(32) int local32 = local12 << Static31.anInt665;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class149 local41 = Static269.aClass149Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.l(local15, local12) - local41.l(local15, local12);
									@Pc(67) int local67 = local8.l(local15 + 1, local12) - local41.l(local15 + 1, local12);
									@Pc(85) int local85 = local8.l(local15 + 1, local12 + 1) - local41.l(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.l(local15, local12 + 1) - local41.l(local15, local12 + 1);
									local41.b(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
