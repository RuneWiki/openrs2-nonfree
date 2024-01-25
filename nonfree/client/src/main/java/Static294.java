import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static294 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Lclient!du;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public static int anInt5990;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lclient!pda;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	public static final int anInt5992 = 2;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BII)Z")
	public static boolean method4725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static131.method2389(arg1, arg0) | (arg1 & 0x10000) != 0 || Static386.method5965(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static378.method5890(arg0, arg1);
		}
	}
}
