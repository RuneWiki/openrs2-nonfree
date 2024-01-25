import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!za", name = "p", descriptor = "I")
	public static int anInt11094;

	@OriginalMember(owner = "client!za", name = "o", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_26 = new Class234(10, 2, 2, 0);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "I")
	public static int anInt11095 = 0;

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(II)V")
	public static void method9254(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub6_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class65 local8 = Static40.aClass65Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static562.anInt10128; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static477.anInt8929; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static151.anInt3896;
							@Pc(32) int local32 = local12 << Static151.anInt3896;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class65 local41 = Static40.aClass65Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7995(local12, local15) - local41.method7995(local12, local15);
									@Pc(71) int local71 = local8.method7995(local12, local15 + 1) - local41.method7995(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7995(local12 + 1, local15 + 1) - local41.method7995(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7995(local12 + 1, local15) - local41.method7995(local12 + 1, local15);
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
