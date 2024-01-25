import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[[Lclient!gq;")
	public static Class93[][] aClass93ArrayArray3;

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "Lclient!qu;")
	public static final Class204 aClass204_10 = new Class204(15, 0, 1, 0);

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(9, arg0);
		local8.method1778();
		local8.anInt2055 = arg1;
		local8.anInt2056 = arg2;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIII)V")
	public static void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static374.anInt6117 = arg2;
		Static139.anInt2726 = arg4;
		Static440.anInt7082 = arg3;
		Static372.anInt6092 = arg0;
		Static452.anInt7261 = arg1;
		if (Static139.anInt2726 >= 100) {
			@Pc(30) int local30 = Static372.anInt6092 * 128 + 64;
			@Pc(36) int local36 = Static374.anInt6117 * 128 + 64;
			@Pc(44) int local44 = Static301.method4312(Static357.anInt5881, local30, local36) - Static452.anInt7261;
			@Pc(49) int local49 = local30 - Static139.anInt2727;
			@Pc(54) int local54 = local44 - Static142.anInt5535;
			@Pc(58) int local58 = local36 - Static92.anInt1946;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local49 * local49 + local58 * local58));
			Static296.anInt5167 = (int) (Math.atan2((double) local54, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static406.anInt6527 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local58)) & 0x3FFF;
			if (Static296.anInt5167 < 1024) {
				Static296.anInt5167 = 1024;
			}
			Static264.anInt4689 = 0;
			if (Static296.anInt5167 > 3072) {
				Static296.anInt5167 = 3072;
			}
		}
		Static345.anInt5797 = 2;
	}
}
