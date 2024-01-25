import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public static int anInt1113;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Lclient!hg;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!la;")
	public static final Class136 aClass136_24 = new Class136(54, 17);

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public static int anInt1114 = -1;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "J")
	public static volatile long aLong41 = 0L;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_25 = new Class136(82, 8);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1104(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Lclient!ff;")
	public static Class69 method1105(@OriginalArg(0) int arg0) {
		@Pc(10) Class69 local10 = (Class69) Static203.aClass268_30.method6166((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static184.aClass250_56.method5806(1, arg0);
		local10 = new Class69();
		local10.anInt1946 = arg0;
		if (local25 != null) {
			local10.method1800(new Class3_Sub25(local25));
		}
		local10.method1803();
		if (local10.anInt1949 == 2 && Static292.aClass140_29.method3490((long) arg0) == null) {
			Static292.aClass140_29.method3494((long) arg0, new Class3_Sub30(Static162.anInt3002));
			Static195.aClass69Array1[Static162.anInt3002++] = local10;
		}
		Static203.aClass268_30.method6164(local10, (long) arg0);
		return local10;
	}
}
