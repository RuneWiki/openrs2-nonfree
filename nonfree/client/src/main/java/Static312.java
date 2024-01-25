import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_79 = new Class142("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)I")
	public static int method4115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
