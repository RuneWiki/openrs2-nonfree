import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "p", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_14 = new Class316(4, -1);

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)[Lclient!l;")
	public static Class178[] method664() {
		if (Static334.aClass178Array1 == null) {
			@Pc(7) Class178[] local7 = Static56.method825(Static174.aClass313_24);
			@Pc(11) Class178[] local11 = new Class178[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static58.aClass6_Sub17_Sub1_1.method7355(Static79.anInt2700);
			@Pc(89) int local89;
			@Pc(95) Class178 local95;
			label70: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class178 local26 = local7[local20];
				if ((local26.anInt5210 <= 0 || local26.anInt5210 >= 24) && local26.anInt5209 >= 800 && local26.anInt5208 >= 600 && (local18 != 2 || local26.anInt5209 <= 800 && local26.anInt5208 <= 600) && (local18 != 1 || local26.anInt5209 <= 1024 && local26.anInt5208 <= 768)) {
					for (local89 = 0; local89 < local13; local89++) {
						local95 = local11[local89];
						if (local26.anInt5209 == local95.anInt5209 && local95.anInt5208 == local26.anInt5208) {
							if (local95.anInt5210 < local26.anInt5210) {
								local11[local89] = local26;
							}
							continue label70;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static334.aClass178Array1 = new Class178[local13];
			Static596.method7721(local11, 0, Static334.aClass178Array1, 0, local13);
			@Pc(151) int[] local151 = new int[Static334.aClass178Array1.length];
			for (local89 = 0; local89 < Static334.aClass178Array1.length; local89++) {
				local95 = Static334.aClass178Array1[local89];
				local151[local89] = local95.anInt5208 * local95.anInt5209;
			}
			Static112.method1709(local151, Static334.aClass178Array1);
		}
		return Static334.aClass178Array1;
	}
}
