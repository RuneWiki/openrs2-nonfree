import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!os", name = "u", descriptor = "F")
	public static float aFloat149;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "I")
	public static final int anInt7574 = 1339;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "I")
	public static int anInt7577 = -1;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZIII)V")
	public static void method6534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(47) int local47 = Static172.aShort45 + (Static261.aShort60 - Static172.aShort45) * local21 / 100;
		if (Static308.aShort65 > local47) {
			local47 = Static308.aShort65;
		} else if (Static425.aShort83 < local47) {
			local47 = Static425.aShort83;
		}
		@Pc(73) int local73 = arg0 * 512 * local47 / (arg3 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(85) short local85;
		if (local73 < Static325.aShort70) {
			local85 = Static325.aShort70;
			local47 = local85 * arg3 * 334 / (arg0 * 512);
			if (Static425.aShort83 < local47) {
				local47 = Static425.aShort83;
				local114 = arg0 * 512 * local47 / (local85 * 334);
				local121 = (arg3 - local114) / 2;
				if (arg2) {
					Static162.aClass100_7.la();
					Static162.aClass100_7.method8815(arg1, -16777216, local121, arg4, arg0);
					Static162.aClass100_7.method8815(arg3 + arg1 - local121, -16777216, local121, arg4, arg0);
				}
				arg3 -= local121 * 2;
				arg1 += local121;
			}
		} else if (local73 > Static554.aShort27) {
			local85 = Static554.aShort27;
			local47 = arg3 * local85 * 334 / (arg0 * 512);
			if (local47 < Static308.aShort65) {
				local47 = Static308.aShort65;
				local114 = local85 * 334 * arg3 / (local47 * 512);
				local121 = (arg0 - local114) / 2;
				if (arg2) {
					Static162.aClass100_7.la();
					Static162.aClass100_7.method8815(arg1, -16777216, arg3, arg4, local121);
					Static162.aClass100_7.method8815(arg1, -16777216, arg3, arg4 + arg0 - local121, local121);
				}
				arg4 += local121;
				arg0 -= local121 * 2;
			}
		}
		Static613.anInt10095 = arg1;
		Static107.anInt2106 = arg0 * local47 / 334;
		Static552.anInt9421 = (short) arg3;
		Static116.anInt2278 = (short) arg0;
		Static291.anInt5753 = arg4;
	}
}
