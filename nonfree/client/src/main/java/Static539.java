import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt9126;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_134 = new Class306("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V")
	public static void method7501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class283 local17 = Static251.aClass283ArrayArray1[arg1][arg0];
		Static456.method6474(local17 == null ? Static85.aClass283_1 : local17, arg2);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZBIII)V")
	public static void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(26) int local26 = arg2 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(53) int local53 = (Static299.aShort97 - Static498.aShort131) * local26 / 100 + Static498.aShort131;
		if (local53 < Static146.aShort39) {
			local53 = Static146.aShort39;
		} else if (local53 > Static109.aShort56) {
			local53 = Static109.aShort56;
		}
		@Pc(79) int local79 = local53 * 512 * arg2 / (arg3 * 334);
		@Pc(116) int local116;
		@Pc(123) int local123;
		@Pc(91) short local91;
		if (Static154.aShort45 > local79) {
			local91 = Static154.aShort45;
			local53 = arg3 * local91 * 334 / (arg2 * 512);
			if (local53 > Static109.aShort56) {
				local53 = Static109.aShort56;
				local116 = local53 * 512 * arg2 / (local91 * 334);
				local123 = (arg3 - local116) / 2;
				if (arg1) {
					Static513.aClass122_10.n();
					Static513.aClass122_10.method7265(-16777216, arg2, arg0, local123, arg4);
					Static513.aClass122_10.method7265(-16777216, arg2, arg3 + arg0 - local123, local123, arg4);
				}
				arg3 -= local123 * 2;
				arg0 += local123;
			}
		} else if (local79 > Static148.aShort119) {
			local91 = Static148.aShort119;
			local53 = local91 * arg3 * 334 / (arg2 * 512);
			if (local53 < Static146.aShort39) {
				local53 = Static146.aShort39;
				local116 = local91 * arg3 * 334 / (local53 * 512);
				local123 = (arg2 - local116) / 2;
				if (arg1) {
					Static513.aClass122_10.n();
					Static513.aClass122_10.method7265(-16777216, local123, arg0, arg3, arg4);
					Static513.aClass122_10.method7265(-16777216, local123, arg0, arg3, arg2 + arg4 - local123);
				}
				arg2 -= local123 * 2;
				arg4 += local123;
			}
		}
		Static514.anInt8674 = arg4;
		Static376.anInt6882 = (short) arg3;
		Static280.anInt5244 = arg0;
		Static407.anInt7234 = local53 * arg2 / 334;
		Static211.anInt4099 = (short) arg2;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Z")
	public static boolean method7503(@OriginalArg(1) int arg0) {
		Static475.anInt6155 = arg0 + 1 & 0xFFFF;
		Static149.aBoolean179 = true;
		return true;
	}
}
