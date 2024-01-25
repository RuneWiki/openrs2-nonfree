import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!ew;")
	public static final Class99 aClass99_15 = new Class99();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!la;I)Lclient!qt;")
	public static Class282 method3657(@OriginalArg(2) Class196 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5102(arg1, 0);
		return local9 == null ? null : new Class282(local9);
	}
}
