import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
	public static int anInt9866;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_91 = new Class208(9, 3);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method8324(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static184.method3349(local18) : local18;
		} else if (arg1 instanceof Class263) {
			@Pc(34) Class263 local34 = (Class263) arg1;
			return local34.method6924();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
