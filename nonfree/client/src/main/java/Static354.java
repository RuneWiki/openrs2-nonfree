import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	public static int anInt6717 = 0;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
	public static final int[] anIntArray649 = new int[50];

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public static int anInt6718 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Lclient!ee;")
	public static Class48 method5983(@OriginalArg(0) int arg0) {
		@Pc(15) Class48 local15 = (Class48) Static227.aClass11_94.method209((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static253.aClass143_27.method3745(1, arg0);
		local15 = new Class48();
		if (local25 != null) {
			local15.method1672(new Class14_Sub4(local25), arg0);
		}
		Static227.aClass11_94.method219((long) arg0, local15);
		return local15;
	}
}
