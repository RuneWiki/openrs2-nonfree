import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public static int anInt1533;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_33 = new Class85("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZII)I")
	public static int method1463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}
}
