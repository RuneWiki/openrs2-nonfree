import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lclient!rs;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
	public static final boolean aBoolean548 = false;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_134 = new Class268("", 12);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIII)V")
	public static void method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static388.anInt903 = arg3;
		Static427.anInt7043 = arg0;
		Static365.anInt6176 = arg1;
		Static315.anInt5218 = arg4;
		Static71.anInt1332 = arg2;
		if (Static388.anInt903 >= 100) {
			@Pc(29) int local29 = Static315.anInt5218 * 128 + 64;
			@Pc(35) int local35 = Static427.anInt7043 * 128 + 64;
			@Pc(43) int local43 = Static183.method4175(local35, local29, Static138.anInt3548) - Static365.anInt6176;
			@Pc(48) int local48 = local29 - Static278.anInt4391;
			@Pc(53) int local53 = local43 - Static5.anInt113;
			@Pc(58) int local58 = local35 - Static8.anInt7337;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local58 * local58 + local48 * local48));
			Static401.anInt3623 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static409.anInt6636 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			Static376.anInt6292 = 0;
			if (Static401.anInt3623 < 1024) {
				Static401.anInt3623 = 1024;
			}
			if (Static401.anInt3623 > 3072) {
				Static401.anInt3623 = 3072;
			}
		}
		Static100.anInt1781 = 2;
	}
}
