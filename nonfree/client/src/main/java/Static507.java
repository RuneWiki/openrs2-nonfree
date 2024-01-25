import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "[Lclient!gga;")
	public static final Class2_Sub14[] aClass2_Sub14Array5 = new Class2_Sub14[8];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)I")
	public static int method7037(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return (arg0 & 0xFF80) + local44;
		}
	}
}
