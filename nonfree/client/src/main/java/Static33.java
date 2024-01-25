import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Lclient!bs;")
	public static final Class40 aClass40_3 = new Class40();

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
	public static int anInt612 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Z")
	public static boolean method542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static382.method5659(arg0, arg1) | (arg1 & 0x10000) != 0 || Static366.method5363(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static380.method5566(arg0, arg1);
		}
	}
}
