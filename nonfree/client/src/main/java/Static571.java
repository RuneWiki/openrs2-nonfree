import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static571 {

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!gi;")
	public static Class131 aClass131_22;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	public static int anInt9216;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_139 = new Class171(17, 6);

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_101 = new Class240(52, 16);

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_140 = new Class171(8, 4);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	public static int method7502(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILclient!ka;Lclient!ln;II)V")
	public static void method7503(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1, @OriginalArg(3) Class214 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			arg2.method5033(arg1.RA(), arg1.fa(), arg1.EA(), arg0, arg1.na(), arg4, arg1.V(), arg3, arg1.G(), arg1.HA());
		}
	}
}
