import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "[Lclient!lr;")
	public static final Class129[] aClass129Array1 = new Class129[29];

	@OriginalMember(owner = "client!os", name = "M", descriptor = "I")
	public static int anInt4724 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ij;IZ)Lclient!ci;")
	public static Class36 method4218(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2392(arg1);
		return local8 == null ? null : new Class36(local8);
	}
}
