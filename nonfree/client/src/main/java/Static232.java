import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	public static int anInt4258 = 0;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_80 = new Class44(113, -1);

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "Lclient!fga;")
	public static final Class105 aClass105_2 = new Class105();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(CI)Z")
	public static boolean method3510(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Z")
	public static boolean method3511() {
		return Static499.anInt8832 != 0;
	}
}
