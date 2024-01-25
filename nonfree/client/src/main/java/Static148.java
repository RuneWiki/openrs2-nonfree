import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Lclient!qn;")
	public static Class209 aClass209_47;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[S")
	public static short[] aShortArray37 = new short[256];

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_151 = new Class123(87, 6);

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "J")
	public static long aLong85 = 0L;

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_152 = new Class123(0, -2);

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lclient!lc;")
	public static Class150 method2550(@OriginalArg(0) int arg0) {
		@Pc(15) Class150 local15 = (Class150) Static171.aClass44_24.method1353((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static112.aClass100_17.method2520(arg0, 0);
		local15 = new Class150();
		if (local25 != null) {
			local15.method3363(new Class6_Sub1(local25), arg0);
		}
		Static171.aClass44_24.method1349(local15, (long) arg0);
		return local15;
	}
}
