import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt9565;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_334 = new Class179(100, 0);

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_335 = new Class179(54, 3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ae;BI)Lclient!hw;")
	public static Class151 method8055(@OriginalArg(0) Class8 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method267(arg1);
		return local16 == null ? null : new Class151(local16);
	}
}
