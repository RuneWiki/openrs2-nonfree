import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
	public static int method2405(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(18) int local18 = (arg0 & 0x7F) * 96 >> 7;
		if (local18 < 2) {
			local18 = 2;
		} else if (local18 > 126) {
			local18 = 126;
		}
		return (arg0 & 0xFF80) + local18;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z")
	public static boolean method2406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static262.method3790(arg0, arg1) | (arg1 & 0x10000) != 0 || Static380.method5475(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static519.method7180(arg1, arg0);
		}
	}
}
