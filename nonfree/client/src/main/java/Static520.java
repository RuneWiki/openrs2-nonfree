import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_193 = new Class200(18, -1);

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_194 = new Class200(64, 6);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
	public static boolean aBoolean607 = true;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Z")
	public static boolean aBoolean608 = true;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt8394 = -1;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[Lclient!je;")
	public static final Class175[] aClass175Array1 = new Class175[4];

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public static int anInt8395 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIZ)V")
	public static void method7230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(23) int local23 = arg1 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(48) int local48 = Static517.aShort109 + local23 * (Static262.aShort71 - Static517.aShort109) / 100;
		if (Static197.aShort64 > local48) {
			local48 = Static197.aShort64;
		} else if (local48 > Static151.aShort60) {
			local48 = Static151.aShort60;
		}
		@Pc(73) int local73 = local48 * arg1 * 512 / (arg0 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(85) short local85;
		if (Static427.aShort93 > local73) {
			local85 = Static427.aShort93;
			local48 = local85 * arg0 * 334 / (arg1 * 512);
			if (Static151.aShort60 < local48) {
				local48 = Static151.aShort60;
				local114 = local48 * 512 * arg1 / (local85 * 334);
				local121 = (arg0 - local114) / 2;
				if (arg4) {
					Static141.aClass13_27.la();
					Static141.aClass13_27.method8164(-16777216, arg1, arg2, local121, arg3);
					Static141.aClass13_27.method8164(-16777216, arg1, arg0 + arg2 - local121, local121, arg3);
				}
				arg0 -= local121 * 2;
				arg2 += local121;
			}
		} else if (local73 > Static132.aShort55) {
			local85 = Static132.aShort55;
			local48 = arg0 * local85 * 334 / (arg1 * 512);
			if (Static197.aShort64 > local48) {
				local48 = Static197.aShort64;
				local114 = local85 * arg0 * 334 / (local48 * 512);
				local121 = (arg1 - local114) / 2;
				if (arg4) {
					Static141.aClass13_27.la();
					Static141.aClass13_27.method8164(-16777216, local121, arg2, arg0, arg3);
					Static141.aClass13_27.method8164(-16777216, local121, arg2, arg0, arg1 + arg3 - local121);
				}
				arg3 += local121;
				arg1 -= local121 * 2;
			}
		}
		Static378.anInt8482 = (short) arg1;
		Static265.anInt4973 = arg2;
		Static198.anInt3919 = (short) arg0;
		Static485.anInt7794 = arg3;
		Static333.anInt5839 = local48 * arg1 / 334;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method7232(@OriginalArg(1) int arg0) {
		if (Static639.anInt10307 == 1) {
			Static541.anInt8700 = arg0;
		} else if (Static639.anInt10307 == 2) {
			Static321.anInt5651 = arg0;
		}
	}
}
