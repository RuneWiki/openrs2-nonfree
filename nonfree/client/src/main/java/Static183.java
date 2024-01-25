import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!je", name = "E", descriptor = "Lclient!sv;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!je", name = "H", descriptor = "Lclient!jc;")
	public static final Class117 aClass117_4 = new Class117("LIVE", 0);

	@OriginalMember(owner = "client!je", name = "M", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_11 = new Class21(5, 14);

	@OriginalMember(owner = "client!je", name = "N", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_12 = new Class21(14, 7);

	@OriginalMember(owner = "client!je", name = "O", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)Z")
	public static boolean method2904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
