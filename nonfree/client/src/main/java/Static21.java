import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!au", name = "H", descriptor = "Lclient!l;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!au", name = "K", descriptor = "I")
	public static int anInt290;

	@OriginalMember(owner = "client!au", name = "P", descriptor = "[I")
	public static int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!au", name = "T", descriptor = "I")
	public static final int anInt295 = 1337;

	@OriginalMember(owner = "client!au", name = "V", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_12 = new Class83("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)I")
	public static int method236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
