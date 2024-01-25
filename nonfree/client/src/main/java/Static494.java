import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qv", name = "gb", descriptor = "I")
	public static int anInt8391;

	@OriginalMember(owner = "client!qv", name = "kb", descriptor = "Lclient!da;")
	public static Class19 aClass19_12;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)I")
	public static int method7138(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}
}
