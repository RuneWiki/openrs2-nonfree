import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_18 = new Class68(7, 0, 1, 1);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public static int anInt9811 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBLclient!r;)Lclient!ll;")
	public static Class198 method7543(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(14) Class279 local14 = Static371.method5565(true, arg1, arg0);
		return local14 == null ? null : local14.aClass198_10;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZI)Lclient!is;")
	public static Class155 method7544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class155 local7 = Static558.method7916(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass155Array2 == null || local7.aClass155Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass155Array2[arg1];
		}
	}
}
