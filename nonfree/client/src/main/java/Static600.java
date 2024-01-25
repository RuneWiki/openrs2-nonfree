import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public static int anInt9097 = 255;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_90 = new Class144(32, 7);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
	public static void method7708(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static265.aClass292_3 = Static95.aClass292_1;
		Static11.anInt525 = 1;
		Static565.anInt8601 = -1;
		Static45.method1224(arg0, arg1, false, false);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;IIIILclient!mf;)V")
	public static void method7709(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class247 arg4) {
		@Pc(9) Class298 local9 = Static139.aClass68_3.method1961(arg4.anInt6266);
		if (local9.anInt8123 == -1) {
			return;
		}
		if (arg4.aBoolean419) {
			@Pc(27) int local27 = arg3 + arg4.anInt6274;
			arg3 = local27 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(39) Class178 local39 = local9.method6952(arg4.aBoolean423, arg0, arg3);
		if (local39 == null) {
			return;
		}
		@Pc(46) int local46 = arg4.anInt6246;
		@Pc(49) int local49 = arg4.anInt6242;
		if ((arg3 & 0x1) == 1) {
			local49 = arg4.anInt6246;
			local46 = arg4.anInt6242;
		}
		@Pc(63) int local63 = local39.method7627();
		@Pc(66) int local66 = local39.method7632();
		if (local9.aBoolean545) {
			local66 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt8121 == 0) {
			local39.method7613(arg2, arg1 - (local49 - 1) * 4, local63, local66);
		} else {
			local39.method7630(arg2, arg1 + 4 - local49 * 4, local63, local66, 0, local9.anInt8121 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)V")
	public static void method7710() {
		@Pc(17) Class3_Sub57 local17;
		for (local17 = (Class3_Sub57) Static629.aClass342_76.method7644(); local17 != null; local17 = (Class3_Sub57) Static629.aClass342_76.method7650()) {
			if (local17.aBoolean734) {
				local17.method9596();
			} else {
				local17.aBoolean733 = true;
				if (local17.anInt10797 >= 0 && local17.anInt10805 >= 0 && local17.anInt10797 < Static497.anInt7926 && local17.anInt10805 < Static646.anInt9979) {
					Static602.method7735(local17);
				}
			}
		}
		for (local17 = (Class3_Sub57) Static226.aClass342_35.method7644(); local17 != null; local17 = (Class3_Sub57) Static226.aClass342_35.method7650()) {
			if (local17.aBoolean734) {
				local17.method9596();
			} else {
				local17.aBoolean733 = true;
			}
		}
	}
}
