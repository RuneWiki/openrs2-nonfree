import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt4402;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[B")
	public static final byte[] aByteArray73 = new byte[520];

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
	public static final int[] anIntArray541 = new int[13];

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
	public static final int[] anIntArray542 = new int[50];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lclient!rr;")
	public static Class204 method3905(@OriginalArg(1) int arg0) {
		@Pc(10) Class204 local10 = (Class204) Static81.aClass227_12.method4863((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static347.aClass230_84.method4985(arg0, 0);
		local10 = new Class204();
		if (local20 != null) {
			local10.method4629(new Class1_Sub33(local20));
		}
		local10.method4633();
		Static81.aClass227_12.method4865(local10, (long) arg0);
		return local10;
	}
}
