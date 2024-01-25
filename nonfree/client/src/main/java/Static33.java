import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)Z")
	public static boolean method472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static154.method2867(arg0, arg1) | (arg1 & 0x800) != 0 || Static45.method928(arg0, arg1);
	}
}
