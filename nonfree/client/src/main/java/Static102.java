import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!ma;")
	public static Class216 aClass216_1 = new Class216();

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_66 = new Class235(97, 10);

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!so;")
	public static final Class309 aClass309_1 = new Class309();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method1687() {
		Static126.aClass341Array1 = null;
		Static280.method3936(0, 0, 0, Static499.anInt4149, -1, Static130.anInt2566, Static422.anInt7311, 0);
		if (Static126.aClass341Array1 != null) {
			Static349.method4737(Static126.aClass341Array1, 0, Static499.anInt4149, Static303.aClass341_13.anInt9299, Static512.anInt8689, 0, -1412584499, Static130.anInt2566, Static447.anInt7725);
			Static126.aClass341Array1 = null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)[Lclient!wl;")
	public static Class359[] method1688() {
		if (Static208.aClass359Array1 == null) {
			@Pc(12) Class359[] local12 = Static492.method7380(Static362.aClass109_5);
			@Pc(16) Class359[] local16 = new Class359[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23 = Static348.aClass1_Sub30_Sub1_1.method3919(Static113.anInt2222);
			@Pc(84) int local84;
			@Pc(90) Class359 local90;
			label69: for (@Pc(25) int local25 = 0; local25 < local12.length; local25++) {
				@Pc(31) Class359 local31 = local12[local25];
				if ((local31.anInt9568 <= 0 || local31.anInt9568 >= 24) && local31.anInt9567 >= 800 && local31.anInt9566 >= 600 && (local23 != 2 || local31.anInt9567 <= 800 && local31.anInt9566 <= 600) && (local23 != 1 || local31.anInt9567 <= 1024 && local31.anInt9566 <= 768)) {
					for (local84 = 0; local84 < local18; local84++) {
						local90 = local16[local84];
						if (local31.anInt9567 == local90.anInt9567 && local90.anInt9566 == local31.anInt9566) {
							if (local31.anInt9568 > local90.anInt9568) {
								local16[local84] = local31;
							}
							continue label69;
						}
					}
					local16[local18] = local31;
					local18++;
				}
			}
			Static208.aClass359Array1 = new Class359[local18];
			Static598.method1175(local16, 0, Static208.aClass359Array1, 0, local18);
			@Pc(154) int[] local154 = new int[Static208.aClass359Array1.length];
			for (local84 = 0; local84 < Static208.aClass359Array1.length; local84++) {
				local90 = Static208.aClass359Array1[local84];
				local154[local84] = local90.anInt9566 * local90.anInt9567;
			}
			Static247.method3676(Static208.aClass359Array1, local154);
		}
		return Static208.aClass359Array1;
	}
}
