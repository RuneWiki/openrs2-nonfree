import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!im;")
	public static final Class140 aClass140_104 = new Class140(64, 12);

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
	public static int anInt6850 = 0;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)I")
	public static int method5736(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(20) int local20 = (arg0 & 0x7F) * 96 >> 7;
		if (local20 < 2) {
			local20 = 2;
		} else if (local20 > 126) {
			local20 = 126;
		}
		return (arg0 & 0xFF80) + local20;
	}
}
