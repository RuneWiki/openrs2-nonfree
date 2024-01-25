import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	public static int anInt3210;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!iq", name = "J", descriptor = "Lclient!pr;")
	public static final Class200 aClass200_3 = new Class200("runescape", 0);

	@OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
	public static int anInt3212 = 0;

	@OriginalMember(owner = "client!iq", name = "R", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(CB)C")
	public static char method2648(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
	public static int method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static427.anIntArrayArray176 == null ? 0 : Static427.anIntArrayArray176[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method2650(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static151.method2286(local21) : local21;
		} else if (arg0 instanceof Class185) {
			@Pc(35) Class185 local35 = (Class185) arg0;
			return local35.method4067();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
