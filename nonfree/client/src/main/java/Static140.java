import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!vl;")
	public static Interface11 anInterface11_4;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Lclient!tj;")
	public static Class6_Sub37 aClass6_Sub37_1;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_39 = new Class186(95, 6);

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!wt;")
	public static Class6_Sub1_Sub18 method2317(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub1_Sub18 local15 = (Class6_Sub1_Sub18) Static53.aClass149_1.method3402((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static313.aClass158_69.method3672(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static229.method3475(local25);
			Static53.aClass149_1.method3404((long) arg0, local15);
			return local15;
		}
	}
}
