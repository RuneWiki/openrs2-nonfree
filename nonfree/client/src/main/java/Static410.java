import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public static int anInt6946;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_176 = new Class163(7, -1);

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public static int anInt6945 = 0;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "J")
	public static long aLong229 = 0L;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lclient!om;")
	public static Class177 method5654(@OriginalArg(1) int arg0) {
		@Pc(10) Class177 local10 = (Class177) Static234.aClass268_34.method6166((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static188.aClass250_58.method5806(0, arg0);
		local10 = new Class177();
		if (local25 != null) {
			local10.method4280(new Class3_Sub25(local25), arg0);
		}
		Static234.aClass268_34.method6164(local10, (long) arg0);
		return local10;
	}
}
