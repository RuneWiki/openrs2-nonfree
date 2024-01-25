import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!gp;")
	public static Class117 aClass117_149;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_44 = new Class288(4);

	@OriginalMember(owner = "client!np", name = "r", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_45 = new Class288(64);

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_157 = new Class150(93, 3);

	@OriginalMember(owner = "client!np", name = "z", descriptor = "I")
	public static int anInt6332 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)Lclient!eg;")
	public static Class81 method5255(@OriginalArg(0) int arg0) {
		@Pc(10) Class81 local10 = (Class81) Static460.aClass288_60.method6745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static310.aClass117_139.method2962(arg0, 0);
		local10 = new Class81();
		if (local20 != null) {
			local10.method2238(new Class5_Sub3(local20));
		}
		local10.method2235();
		Static460.aClass288_60.method6746(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I")
	public static int method5257() {
		return Static490.anInt8412;
	}
}
