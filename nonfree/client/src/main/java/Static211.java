import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
	public static int anInt4433;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_32 = new Class344(75, 8);

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
	public static int anInt4428 = 0;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "[I")
	public static int[] anIntArray211 = new int[2];

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg2 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(50) int local50 = (Static470.aShort111 - Static186.aShort39) * local21 / 100 + Static186.aShort39;
		if (local50 < Static197.aShort40) {
			local50 = Static197.aShort40;
		} else if (Static195.aShort112 < local50) {
			local50 = Static195.aShort112;
		}
		@Pc(76) int local76 = arg2 * local50 * 512 / (arg1 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(85) short local85;
		if (local76 < Static549.aShort124) {
			local85 = Static549.aShort124;
			local50 = arg1 * 334 * local85 / (arg2 * 512);
			if (Static195.aShort112 < local50) {
				local50 = Static195.aShort112;
				local114 = local50 * arg2 * 512 / (local85 * 334);
				local121 = (arg1 - local114) / 2;
				if (arg4) {
					Static39.aClass7_2.JA();
					Static39.aClass7_2.method7825(arg2, local121, arg0, -16777216, arg3);
					Static39.aClass7_2.method7825(arg2, local121, arg0, -16777216, arg1 + arg3 - local121);
				}
				arg1 -= local121 * 2;
				arg3 += local121;
			}
		} else if (local76 > Static479.aShort113) {
			local85 = Static479.aShort113;
			local50 = arg1 * 334 * local85 / (arg2 * 512);
			if (Static197.aShort40 > local50) {
				local50 = Static197.aShort40;
				local114 = local85 * 334 * arg1 / (local50 * 512);
				local121 = (arg2 - local114) / 2;
				if (arg4) {
					Static39.aClass7_2.JA();
					Static39.aClass7_2.method7825(local121, arg1, arg0, -16777216, arg3);
					Static39.aClass7_2.method7825(local121, arg1, arg0 + arg2 - local121, -16777216, arg3);
				}
				arg2 -= local121 * 2;
				arg0 += local121;
			}
		}
		Static194.anInt4048 = arg3;
		Static296.anInt6002 = arg0;
		Static90.anInt2301 = (short) arg2;
		Static136.anInt3032 = (short) arg1;
		Static15.anInt864 = arg2 * local50 / 334;
	}
}
