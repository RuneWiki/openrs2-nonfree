import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public static int anInt1221;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!bo;")
	public static final Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "[Lclient!cp;")
	public static final Class3_Sub11[] aClass3_Sub11Array1 = new Class3_Sub11[1024];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIZI)V")
	public static void method1225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(29) int local29 = arg2 - 334;
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 100) {
			local29 = 100;
		}
		@Pc(54) int local54 = (Static388.aShort79 - Static630.aShort121) * local29 / 100 + Static630.aShort121;
		if (Static372.aShort77 > local54) {
			local54 = Static372.aShort77;
		} else if (Static24.aShort4 < local54) {
			local54 = Static24.aShort4;
		}
		@Pc(76) int local76 = local54 * arg2 * 512 / (arg1 * 334);
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(88) short local88;
		if (Static429.aShort84 > local76) {
			local88 = Static429.aShort84;
			local54 = arg1 * 334 * local88 / (arg2 * 512);
			if (local54 > Static24.aShort4) {
				local54 = Static24.aShort4;
				local113 = arg2 * local54 * 512 / (local88 * 334);
				local119 = (arg1 - local113) / 2;
				if (arg3) {
					Static582.aClass16_12.la();
					Static582.aClass16_12.method8113(arg2, arg0, local119, -16777216, arg4);
					Static582.aClass16_12.method8113(arg2, arg1 + arg0 - local119, local119, -16777216, arg4);
				}
				arg1 -= local119 * 2;
				arg0 += local119;
			}
		} else if (local76 > Static162.aShort37) {
			local88 = Static162.aShort37;
			local54 = arg1 * local88 * 334 / (arg2 * 512);
			if (local54 < Static372.aShort77) {
				local54 = Static372.aShort77;
				local113 = arg1 * local88 * 334 / (local54 * 512);
				local119 = (arg2 - local113) / 2;
				if (arg3) {
					Static582.aClass16_12.la();
					Static582.aClass16_12.method8113(local119, arg0, arg1, -16777216, arg4);
					Static582.aClass16_12.method8113(local119, arg0, arg1, -16777216, arg2 + arg4 - local119);
				}
				arg4 += local119;
				arg2 -= local119 * 2;
			}
		}
		Static139.anInt2634 = arg2 * local54 / 334;
		Static105.anInt2207 = (short) arg2;
		Static272.anInt5119 = arg4;
		Static247.anInt4589 = arg0;
		Static612.anInt9538 = (short) arg1;
	}
}
