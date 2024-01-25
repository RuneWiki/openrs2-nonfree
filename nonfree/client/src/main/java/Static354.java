import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "Lclient!kr;")
	public static Class171 aClass171_104;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Lclient!kr;")
	public static Class171 aClass171_105;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
	public static final int anInt6280 = Static515.method7051(1600);

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "Lclient!be;")
	public static final Class22 aClass22_4 = new Class22();

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIII)Lclient!dc;")
	public static Class49_Sub2_Sub2 method5321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class255 local11 = Static242.aClass255ArrayArrayArray2[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class49_Sub2_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class63 local22 = local11.aClass63_3; local22 != null; local22 = local22.aClass63_1) {
			@Pc(30) Class49_Sub2 local30 = local22.aClass49_Sub2_1;
			if (local30 instanceof Class49_Sub2_Sub2) {
				@Pc(36) Class49_Sub2_Sub2 local36 = (Class49_Sub2_Sub2) local30;
				@Pc(46) int local46 = (local36.method3788() - 1) * 256 + 252;
				@Pc(54) int local54 = local36.anInt7137 - local46 >> 9;
				@Pc(62) int local62 = local36.anInt7141 - local46 >> 9;
				@Pc(69) int local69 = local36.anInt7137 + local46 >> 9;
				@Pc(76) int local76 = local36.anInt7141 + local46 >> 9;
				if (local54 <= arg0 && arg2 >= local62 && arg0 <= local69 && arg2 <= local76) {
					@Pc(109) int local109 = (local69 + 1 - arg0) * (local76 + 1 - arg2);
					if (local19 < local109) {
						local17 = local36;
						local19 = local109;
					}
				}
			}
		}
		return local17;
	}
}
