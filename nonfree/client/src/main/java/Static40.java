import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[Lclient!ji;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public static final int anInt796 = 1400;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	public static int anInt800 = -1;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Lclient!rea;")
	public static Class2_Sub40 method643() {
		return Static364.anInt5764 == 0 ? new Class2_Sub40() : Static180.aClass2_Sub40Array1[--Static364.anInt5764];
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIZI)V")
	public static void method644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(29) int local29 = arg0 - 334;
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 100) {
			local29 = 100;
		}
		@Pc(50) int local50 = (Static123.aShort27 - Static417.aShort89) * local29 / 100 + Static417.aShort89;
		if (Static516.aShort90 > local50) {
			local50 = Static516.aShort90;
		} else if (Static340.aShort57 < local50) {
			local50 = Static340.aShort57;
		}
		@Pc(80) int local80 = arg0 * local50 * 512 / (arg4 * 334);
		@Pc(113) int local113;
		@Pc(120) int local120;
		@Pc(88) short local88;
		if (local80 < Static431.aShort91) {
			local88 = Static431.aShort91;
			local50 = arg4 * local88 * 334 / (arg0 * 512);
			if (local50 > Static340.aShort57) {
				local50 = Static340.aShort57;
				local113 = arg0 * local50 * 512 / (local88 * 334);
				local120 = (arg4 - local113) / 2;
				if (arg3) {
					Static192.aClass95_4.la();
					Static192.aClass95_4.method6936(arg0, local120, arg1, -16777216, arg2);
					Static192.aClass95_4.method6936(arg0, local120, arg1 + arg4 - local120, -16777216, arg2);
				}
				arg4 -= local120 * 2;
				arg1 += local120;
			}
		} else if (local80 > Static2.aShort1) {
			local88 = Static2.aShort1;
			local50 = local88 * 334 * arg4 / (arg0 * 512);
			if (local50 < Static516.aShort90) {
				local50 = Static516.aShort90;
				local113 = local88 * 334 * arg4 / (local50 * 512);
				local120 = (arg0 - local113) / 2;
				if (arg3) {
					Static192.aClass95_4.la();
					Static192.aClass95_4.method6936(local120, arg4, arg1, -16777216, arg2);
					Static192.aClass95_4.method6936(local120, arg4, arg1, -16777216, arg0 + arg2 - local120);
				}
				arg2 += local120;
				arg0 -= local120 * 2;
			}
		}
		Static92.anInt1709 = local50 * arg0 / 334;
		Static425.anInt6682 = arg2;
		Static621.anInt9968 = (short) arg4;
		Static244.anInt9751 = arg1;
		Static93.anInt1717 = (short) arg0;
	}
}
