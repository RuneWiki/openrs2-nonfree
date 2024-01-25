import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static642 {

	@OriginalMember(owner = "client!wq", name = "Yc", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!wq", name = "sd", descriptor = "Lclient!cu;")
	public static Class61 aClass61_8;

	@OriginalMember(owner = "client!wq", name = "gd", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_73 = new Class136(8);

	@OriginalMember(owner = "client!wq", name = "qd", descriptor = "[S")
	public static short[] aShortArray157 = new short[256];

	@OriginalMember(owner = "client!wq", name = "vd", descriptor = "F")
	public static float aFloat200 = 0.0F;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)C")
	public static char method8636(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)Z")
	public static boolean method8640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static395.method6223(arg0, arg1) | (arg1 & 0x70000) != 0 || Static57.method7333(arg0, arg1);
	}
}
