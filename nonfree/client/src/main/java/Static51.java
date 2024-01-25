import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "K", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "Lclient!jt;")
	public static final Class150 aClass150_1 = new Class150(4);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIILclient!r;)Lclient!ed;")
	public static Class68 method920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class63 arg3) {
		return arg3 == null ? null : new Class68(arg1, arg0, arg2, arg3.e(), arg3.wa(), arg3.va(), arg3.TA(), arg3.n(), arg3.Q(), arg3.U());
	}
}
