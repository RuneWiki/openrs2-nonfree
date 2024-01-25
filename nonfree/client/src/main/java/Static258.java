import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!im", name = "A", descriptor = "Lclient!hv;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "I")
	public static int anInt4452 = 0;

	@OriginalMember(owner = "client!im", name = "fb", descriptor = "Z")
	public static boolean aBoolean347 = true;

	@OriginalMember(owner = "client!im", name = "ib", descriptor = "I")
	public static int anInt4467 = 0;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_47 = new Class387(2, 3);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIBII)V")
	public static void method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(48) int local48 = local7 * (Static494.aShort99 - Static122.aShort23) / 100 + Static122.aShort23;
		@Pc(54) int local54 = local48 * arg6 >> 8;
		Static243.anInt4189 = local48 * Static243.anInt4191 >> 8;
		@Pc(67) int local67 = 16384 - arg0 & 0x3FFF;
		@Pc(73) int local73 = 16384 - arg4 & 0x3FFF;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = local54;
		if (local67 != 0) {
			local77 = Class5_Sub12.anIntArray544[local67] * -local54 >> 14;
			local79 = local54 * Class5_Sub12.anIntArray543[local67] >> 14;
		}
		if (local73 != 0) {
			local75 = Class5_Sub12.anIntArray544[local73] * local79 >> 14;
			local79 = Class5_Sub12.anIntArray543[local73] * local79 >> 14;
		}
		Static132.anInt2186 = arg1 - local77;
		Static532.anInt9189 = arg2 - local75;
		Static489.anInt8202 = arg5 - local79;
		Static159.anInt2475 = arg4;
		Static649.anInt5976 = arg0;
		Static313.anInt5549 = 0;
	}
}
