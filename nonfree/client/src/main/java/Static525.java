import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sia", name = "j", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
	public static int anInt9175;

	@OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
	public static int anInt9179;

	@OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
	public static int anInt9180;

	@OriginalMember(owner = "client!sia", name = "x", descriptor = "Z")
	public static boolean aBoolean738;

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_157 = new Class73(29, 5);

	@OriginalMember(owner = "client!sia", name = "r", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_100 = new Class185(47, 3);

	@OriginalMember(owner = "client!sia", name = "s", descriptor = "[I")
	public static int[] anIntArray475 = new int[4];

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(IB)Z")
	public static boolean method7481(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static125.aCharArray7[local7 - 128] != '\u0000';
		}
	}
}
