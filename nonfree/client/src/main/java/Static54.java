import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt3672;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	public static int anInt3676;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_137;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt3674 = 128;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2170 = Static118.method2249("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2165 = aClass65_2170;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2167 = Static118.method2249("Free world");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2166 = aClass65_2167;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2168 = Static118.method2249(")3");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt3677 = -1;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2169 = Static118.method2249("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method2789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg4;
		@Pc(13) int local13 = arg1 - arg2;
		if (local13 == 0) {
			if (local9 != 0) {
				Static79.method1389(arg4, arg3, arg0, arg2);
			}
		} else if (local9 == 0) {
			Static89.method1498(arg2, arg0, arg4, arg1);
		} else {
			@Pc(49) int local49 = (local9 << 12) / local13;
			@Pc(58) int local58 = arg4 - (local49 * arg2 >> 12);
			@Pc(72) int local72;
			@Pc(70) int local70;
			if (Static71.anInt1744 > arg2) {
				local70 = local58 + (Static71.anInt1744 * local49 >> 12);
				local72 = Static71.anInt1744;
			} else if (Static23.anInt685 < arg2) {
				local72 = Static23.anInt685;
				local70 = local58 + (local49 * Static23.anInt685 >> 12);
			} else {
				local72 = arg2;
				local70 = arg4;
			}
			if (Static206.anInt4385 > local70) {
				local70 = Static206.anInt4385;
				local72 = (Static206.anInt4385 - local58 << 12) / local49;
			} else if (local70 > Static133.anInt3309) {
				local72 = (Static133.anInt3309 - local58 << 12) / local49;
				local70 = Static133.anInt3309;
			}
			@Pc(151) int local151;
			@Pc(149) int local149;
			if (arg1 < Static71.anInt1744) {
				local149 = (Static71.anInt1744 * local49 >> 12) + local58;
				local151 = Static71.anInt1744;
			} else if (Static23.anInt685 < arg1) {
				local149 = local58 + (Static23.anInt685 * local49 >> 12);
				local151 = Static23.anInt685;
			} else {
				local151 = arg1;
				local149 = arg3;
			}
			if (local149 < Static206.anInt4385) {
				local149 = Static206.anInt4385;
				local151 = (Static206.anInt4385 - local58 << 12) / local49;
			} else if (Static133.anInt3309 < local149) {
				local151 = (Static133.anInt3309 - local58 << 12) / local49;
				local149 = Static133.anInt3309;
			}
			Static97.method1848(local72, arg0, local70, local149, local151);
		}
	}
}
