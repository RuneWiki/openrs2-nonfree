import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "Z")
	public static boolean aBoolean172;

	@OriginalMember(owner = "client!gs", name = "T", descriptor = "Lclient!mo;")
	public static Class143 aClass143_56;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!gs", name = "Y", descriptor = "[S")
	public static short[] aShortArray62 = new short[256];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lclient!ls;")
	public static Class132 method2379(@OriginalArg(1) int arg0) {
		@Pc(10) Class11 local10 = Static94.aClass11_51;
		@Pc(19) Class132 local19;
		synchronized (Static94.aClass11_51) {
			local19 = (Class132) Static94.aClass11_51.method209((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35 = Static201.aClass143_78.method3745(3, arg0);
		local19 = new Class132();
		if (local35 != null) {
			local19.method3592(new Class14_Sub4(local35));
		}
		@Pc(50) Class11 local50 = Static94.aClass11_51;
		synchronized (Static94.aClass11_51) {
			Static94.aClass11_51.method219((long) arg0, local19);
			return local19;
		}
	}
}
