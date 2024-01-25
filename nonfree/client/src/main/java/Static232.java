import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_65 = new Class252(39, 6);

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[200];

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public static int anInt4496 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBII)I")
	public static int method4179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}
}
