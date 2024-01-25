import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_15 = new Class146(37, 2);

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "[I")
	public static final int[] anIntArray40 = new int[8];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method427(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static437.method5813(local18) : local18;
		} else if (arg1 instanceof Class22) {
			@Pc(32) Class22 local32 = (Class22) arg1;
			return local32.method426();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
