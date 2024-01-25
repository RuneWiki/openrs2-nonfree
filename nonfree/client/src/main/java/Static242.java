import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_61 = new Class200(3, -1);

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_7 = new Class337(6, 8);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
	public static boolean method3966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z")
	public static boolean method3967(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)C")
	public static char method3969(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(45) char local45 = Static66.aCharArray1[local12 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local12 = local45;
		}
		return (char) local12;
	}
}
