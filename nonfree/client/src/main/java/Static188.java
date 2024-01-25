import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray82;

	@OriginalMember(owner = "client!kn", name = "S", descriptor = "Lclient!b;")
	public static Class20 aClass20_47;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_73 = new Class234(58, 2);

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "Lclient!dt;")
	public static Class62 aClass62_12 = null;

	@OriginalMember(owner = "client!kn", name = "G", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_46 = new Class244(26, 3);

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!kn", name = "N", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_40 = new Class139(64);

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)Lclient!vt;")
	public static Class242 method2993(@OriginalArg(0) int arg0) {
		@Pc(10) Class242 local10 = (Class242) aClass139_40.method3076((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static346.aClass20_89.method253(arg0, 0);
		local10 = new Class242();
		if (local20 != null) {
			local10.method5609(new Class3_Sub5(local20));
		}
		local10.method5610();
		aClass139_40.method3070(local10, (long) arg0);
		return local10;
	}
}
