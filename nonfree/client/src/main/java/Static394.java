import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt7459 = 0;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt7461 = 0;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_23 = new Class91(2, 4);

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[Lclient!vq;")
	public static final Class2_Sub13_Sub18[] aClass2_Sub13_Sub18Array4 = new Class2_Sub13_Sub18[14];

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[Lclient!nt;")
	public static final Interface13[] anInterface13Array2 = new Interface13[128];

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_146 = new Class239(112, -1);

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public static int anInt7462 = 100;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZILclient!ls;BLclient!ls;I)I")
	public static int method6282(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178_Sub1 arg3, @OriginalArg(5) Class178_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static509.method7446(arg2, arg1, arg3, arg4);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static509.method7446(arg5, arg0, arg3, arg4);
			return arg0 ? -local39 : local39;
		}
	}
}
