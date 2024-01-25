import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_22 = new Class257(5, 4);

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!rr;ZZ)V")
	public static void method2391(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean741 = arg1;
		if (Static403.aBoolean556) {
			Static49.aClass243Array1[Static49.aClass243Array1.length - 1].method6453(arg0);
		} else {
			Static148.method5411(arg0, Static302.aClass8_Sub1Array5);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZI)Z")
	public static boolean method2393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ffa;B)I")
	public static int method2397(@OriginalArg(0) Class100 arg0) {
		if (Static457.aClass100_27 == arg0) {
			return 9216;
		} else if (arg0 == Static622.aClass100_36) {
			return 34065;
		} else if (arg0 == Static550.aClass100_35) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
