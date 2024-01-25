import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!al;")
	public static final Class11 aClass11_40 = new Class11(10);

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public static int anInt1855 = 0;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "S")
	public static short aShort29 = 256;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Lclient!gj;")
	public static Class78 method1908(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static22.aClass11_15;
		@Pc(14) Class78 local14;
		synchronized (Static22.aClass11_15) {
			local14 = (Class78) Static22.aClass11_15.method209((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static328.aClass143_110.method3745(Static130.method2676(arg0), Static285.method4881(arg0));
		local14 = new Class78();
		local14.anInt2304 = arg0;
		if (local39 != null) {
			local14.method2265(new Class14_Sub4(local39));
		}
		@Pc(57) Class11 local57 = Static22.aClass11_15;
		synchronized (Static22.aClass11_15) {
			Static22.aClass11_15.method219((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1910(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static302.anInt5838; local16++) {
			if (arg0.equalsIgnoreCase(Static120.aStringArray36[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
