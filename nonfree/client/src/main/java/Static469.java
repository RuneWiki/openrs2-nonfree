import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!ur;")
	public static Class345 aClass345_15;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	public static int anInt8489;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static int anInt8486 = 0;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	public static int anInt8487 = 0;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZIIII)V")
	public static void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(44) int local44 = local21 * (Static117.aShort30 - Static90.aShort27) / 100 + Static90.aShort27;
		if (Static434.aShort89 > local44) {
			local44 = Static434.aShort89;
		} else if (local44 > Static262.aShort60) {
			local44 = Static262.aShort60;
		}
		@Pc(70) int local70 = arg4 * 512 * local44 / (arg3 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(79) short local79;
		if (Static456.aShort91 > local70) {
			local79 = Static456.aShort91;
			local44 = arg3 * local79 * 334 / (arg4 * 512);
			if (local44 > Static262.aShort60) {
				local44 = Static262.aShort60;
				local108 = arg4 * local44 * 512 / (local79 * 334);
				local115 = (arg3 - local108) / 2;
				if (arg1) {
					Static171.aClass16_5.la();
					Static171.aClass16_5.method6114(-16777216, arg0, arg4, arg2, local115);
					Static171.aClass16_5.method6114(-16777216, arg0 + arg3 - local115, arg4, arg2, local115);
				}
				arg3 -= local115 * 2;
				arg0 += local115;
			}
		} else if (local70 > Static200.aShort54) {
			local79 = Static200.aShort54;
			local44 = arg3 * 334 * local79 / (arg4 * 512);
			if (Static434.aShort89 > local44) {
				local44 = Static434.aShort89;
				local108 = local79 * arg3 * 334 / (local44 * 512);
				local115 = (arg4 - local108) / 2;
				if (arg1) {
					Static171.aClass16_5.la();
					Static171.aClass16_5.method6114(-16777216, arg0, local115, arg2, arg3);
					Static171.aClass16_5.method6114(-16777216, arg0, local115, arg4 + arg2 - local115, arg3);
				}
				arg2 += local115;
				arg4 -= local115 * 2;
			}
		}
		Static499.anInt8783 = local44 * arg4 / 334;
		Static603.anInt10259 = arg2;
		Static563.anInt9711 = (short) arg3;
		Static122.anInt3287 = (short) arg4;
		Static60.anInt1929 = arg0;
	}
}
