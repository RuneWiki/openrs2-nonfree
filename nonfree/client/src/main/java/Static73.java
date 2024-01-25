import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "Lclient!tu;")
	public static final Class356 aClass356_1 = new Class356(2);

	@OriginalMember(owner = "client!cka", name = "m", descriptor = "[Lclient!nja;")
	public static final Class252[] aClass252Array1 = new Class252[37];

	@OriginalMember(owner = "client!cka", name = "o", descriptor = "I")
	public static int anInt1542 = 0;

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(II)V")
	public static void method1562(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub5_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class42 local8 = Static655.aClass42Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static245.anInt7888; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static51.anInt1108; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static273.anInt4424;
							@Pc(32) int local32 = local12 << Static273.anInt4424;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class42 local41 = Static655.aClass42Array5[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7450(local12, local15) - local41.method7450(local12, local15);
									@Pc(71) int local71 = local8.method7450(local12, local15 + 1) - local41.method7450(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7450(local12 + 1, local15 + 1) - local41.method7450(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7450(local12 + 1, local15) - local41.method7450(local12 + 1, local15);
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
