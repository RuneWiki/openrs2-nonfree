import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public static int anInt8314;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt8315;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
	public static int[] anIntArray594;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_52 = new Class85(4);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method7384(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return arg0 ? Static37.method8166(local14) : local14;
		} else if (arg1 instanceof Class148) {
			@Pc(29) Class148 local29 = (Class148) arg1;
			return local29.method6552();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
