import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt4948;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!tga;")
	public static final Class315 aClass315_5 = new Class315("WTRC", 1);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg3 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(55) int local55 = (Static240.aShort75 - Static518.aShort114) * local23 / 100 + Static518.aShort114;
		if (local55 < Static278.aShort79) {
			local55 = Static278.aShort79;
		} else if (Static498.aShort108 < local55) {
			local55 = Static498.aShort108;
		}
		@Pc(77) int local77 = arg3 * 512 * local55 / (arg0 * 334);
		@Pc(122) int local122;
		@Pc(129) int local129;
		@Pc(93) short local93;
		if (Static348.aShort84 > local77) {
			local93 = Static348.aShort84;
			local55 = local93 * arg0 * 334 / (arg3 * 512);
			if (Static498.aShort108 < local55) {
				local55 = Static498.aShort108;
				local122 = arg3 * local55 * 512 / (local93 * 334);
				local129 = (arg0 - local122) / 2;
				if (arg4) {
					Static185.aClass66_14.F();
					Static185.aClass66_14.method6794(local129, arg2, arg3, arg1, -16777216);
					Static185.aClass66_14.method6794(local129, arg0 + arg2 - local129, arg3, arg1, -16777216);
				}
				arg0 -= local129 * 2;
				arg2 += local129;
			}
		} else if (local77 > Static164.aShort54) {
			local93 = Static164.aShort54;
			local55 = local93 * 334 * arg0 / (arg3 * 512);
			if (local55 < Static278.aShort79) {
				local55 = Static278.aShort79;
				local122 = local93 * arg0 * 334 / (local55 * 512);
				local129 = (arg3 - local122) / 2;
				if (arg4) {
					Static185.aClass66_14.F();
					Static185.aClass66_14.method6794(arg0, arg2, local129, arg1, -16777216);
					Static185.aClass66_14.method6794(arg0, arg2, local129, arg3 + arg1 - local129, -16777216);
				}
				arg3 -= local129 * 2;
				arg1 += local129;
			}
		}
		Static274.anInt5201 = arg1;
		Static535.anInt9061 = local55 * arg3 / 334;
		Static147.anInt3283 = arg2;
		Static565.anInt9457 = (short) arg0;
		Static244.anInt4833 = (short) arg3;
	}
}
