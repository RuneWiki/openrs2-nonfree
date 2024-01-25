import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "rd", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_6 = new Class274(49, 6);

	@OriginalMember(owner = "client!ak", name = "Ld", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!ak", name = "Rd", descriptor = "I")
	public static final int anInt566 = 1338;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)V")
	public static void method426(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub5_Sub12 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class112 local8 = Static178.aClass112Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static191.anInt6006; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static347.anInt6411; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static415.anInt7579;
							@Pc(32) int local32 = local12 << Static415.anInt7579;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class112 local41 = Static178.aClass112Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7819(local12, local15) - local41.method7819(local12, local15);
									@Pc(71) int local71 = local8.method7819(local12, local15 + 1) - local41.method7819(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7819(local12 + 1, local15 + 1) - local41.method7819(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7819(local12 + 1, local15) - local41.method7819(local12 + 1, local15);
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
