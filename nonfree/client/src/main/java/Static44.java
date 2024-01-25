import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bja", name = "F", descriptor = "[Lclient!fv;")
	public static final Class122[] aClass122Array1 = new Class122[2048];

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIB)I")
	public static int method1173(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(39) int local39 = (arg0 & 0x7F) * 96 >> 7;
			if (local39 < 2) {
				local39 = 2;
			} else if (local39 > 126) {
				local39 = 126;
			}
			return (arg0 & 0xFF80) + local39;
		}
	}
}
