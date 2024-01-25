import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "Lclient!wr;")
	public static Class3_Sub56 aClass3_Sub56_2;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_89 = new Class186(60, -1);

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	public static int anInt4865 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZI)Z")
	public static boolean method4105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static700.method9155(arg1, arg0) | (arg0 & 0x800) != 0 || Static161.method2562(arg1, arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static641.anInt10380 = arg0;
		Static71.anInt1112 = arg3;
		Static647.anInt10427 = arg2;
		Static624.anInt10064 = arg4;
		Static674.anInt10663 = arg1;
		if (Static674.anInt10663 >= 100) {
			@Pc(36) int local36 = Static624.anInt10064 * 512 + 256;
			@Pc(42) int local42 = Static71.anInt1112 * 512 + 256;
			@Pc(51) int local51 = Static505.method7237(Static712.anInt11117, local42, local36) - Static641.anInt10380;
			@Pc(56) int local56 = local36 - Static173.anInt3144;
			@Pc(61) int local61 = local51 - Static376.anInt6408;
			@Pc(66) int local66 = local42 - Static235.anInt4471;
			@Pc(77) int local77 = (int) Math.sqrt((double) (local66 * local66 + local56 * local56));
			Static228.anInt9136 = (int) (Math.atan2((double) local61, (double) local77) * 2607.5945876176133D) & 0x3FFF;
			Static703.anInt10997 = (int) (Math.atan2((double) local56, (double) local66) * -2607.5945876176133D) & 0x3FFF;
			if (Static228.anInt9136 < 1024) {
				Static228.anInt9136 = 1024;
			}
			Static212.anInt3807 = 0;
			if (Static228.anInt9136 > 3072) {
				Static228.anInt9136 = 3072;
			}
		}
		Static175.anInt10579 = 2;
		Static573.anInt9429 = -1;
		Static283.anInt5140 = -1;
	}
}
