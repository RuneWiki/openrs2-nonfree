import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	public static int anInt10280 = 0;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	public static int anInt10284 = -2;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
	public static boolean method8574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static489.method1463(arg0, arg1) | (arg1 & 0x70000) != 0 || Static102.method1050(arg0, arg1);
	}
}
