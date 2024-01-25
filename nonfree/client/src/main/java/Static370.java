import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	public static int anInt10482;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public static int anInt10475 = 100;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_132 = new Class100(18, 6);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!ls;")
	public static final Class222 aClass222_7 = new Class222("LIVE", 0);

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!ip;")
	public static final Class169 aClass169_8 = new Class169();

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
	public static final int[] anIntArray770 = new int[4];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
	public static int method8742(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}
}
