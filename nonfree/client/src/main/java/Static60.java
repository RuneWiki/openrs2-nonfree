import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Lclient!am;")
	public static Class11 aClass11_28;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!ph;")
	public static Class154 aClass154_18 = new Class154(64);

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
	public static final int[] anIntArray143 = new int[13];

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lclient!bk;")
	public static Class25 method1054(@OriginalArg(0) int arg0) {
		@Pc(12) Class154 local12 = Static337.aClass154_88;
		@Pc(21) Class25 local21;
		synchronized (Static337.aClass154_88) {
			local21 = (Class25) Static337.aClass154_88.method4222((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(41) byte[] local41 = Static224.aClass11_88.method288(Static148.method4012(arg0), Static215.method3733(arg0));
		local21 = new Class25();
		if (local41 != null) {
			local21.method481(new Class4_Sub7(local41));
		}
		@Pc(56) Class154 local56 = Static337.aClass154_88;
		synchronized (Static337.aClass154_88) {
			Static337.aClass154_88.method4221((long) arg0, local21);
			return local21;
		}
	}
}
