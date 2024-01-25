import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
	public static final int anInt5803 = 1400;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_83 = new Class244(6, 3);

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[520];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(23) int local23 = arg0 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(50) int local50 = Static29.aShort63 + (Static342.aShort86 - Static29.aShort63) * local23 / 100;
		if (Static13.aShort69 > local50) {
			local50 = Static13.aShort69;
		} else if (local50 > Static305.aShort76) {
			local50 = Static305.aShort76;
		}
		@Pc(80) int local80 = local50 * arg0 * 512 / (arg4 * 334);
		@Pc(117) int local117;
		@Pc(124) int local124;
		@Pc(92) short local92;
		if (Static80.aShort24 > local80) {
			local92 = Static80.aShort24;
			local50 = arg4 * local92 * 334 / (arg0 * 512);
			if (local50 > Static305.aShort76) {
				local50 = Static305.aShort76;
				local117 = local50 * arg0 * 512 / (local92 * 334);
				local124 = (arg4 - local117) / 2;
				if (arg3) {
					Static347.aClass155_9.method4902();
					Static347.aClass155_9.method4954(arg0, arg1, local124, arg2, -16777216);
					Static347.aClass155_9.method4954(arg0, arg1, local124, arg4 + arg2 - local124, -16777216);
				}
				arg4 -= local124 * 2;
				arg2 += local124;
			}
		} else if (Static223.aShort50 < local80) {
			local92 = Static223.aShort50;
			local50 = arg4 * 334 * local92 / (arg0 * 512);
			if (Static13.aShort69 > local50) {
				local50 = Static13.aShort69;
				local117 = arg4 * local92 * 334 / (local50 * 512);
				local124 = (arg0 - local117) / 2;
				if (arg3) {
					Static347.aClass155_9.method4902();
					Static347.aClass155_9.method4954(local124, arg1, arg4, arg2, -16777216);
					Static347.aClass155_9.method4954(local124, arg0 + arg1 - local124, arg4, arg2, -16777216);
				}
				arg1 += local124;
				arg0 -= local124 * 2;
			}
		}
		Static357.anInt5995 = arg1;
		Static74.anInt1593 = (short) arg4;
		Static253.anInt4567 = arg0 * local50 / 334;
		Static312.anInt5392 = arg2;
		Static333.anInt5649 = (short) arg0;
	}
}
