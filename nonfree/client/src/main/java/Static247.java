import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	public static int anInt4937;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	public static int anInt4938;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "I")
	public static int anInt4939 = -1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!vd;II)Lclient!hia;")
	public static Class133 method4287(@OriginalArg(1) Class353 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method8404(arg1, 0);
		return local18 == null ? null : new Class133(local18);
	}
}
