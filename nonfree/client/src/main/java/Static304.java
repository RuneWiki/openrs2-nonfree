import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!jw;")
	public static Class2_Sub27 aClass2_Sub27_2;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static int anInt5060;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!rw;")
	public static Class304 aClass304_1;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt5055 = 0;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_84 = new Class349(77, 19);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lclient!qd;")
	public static Class280 method4382(@OriginalArg(0) int arg0) {
		@Pc(10) Class280 local10 = (Class280) Static225.aClass21_38.method324((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static353.aClass229_86.method4980(0, arg0);
		local10 = new Class280();
		if (local20 != null) {
			local10.method5690(arg0, new Class2_Sub7(local20));
		}
		Static225.aClass21_38.method317(local10, (long) arg0);
		return local10;
	}
}
