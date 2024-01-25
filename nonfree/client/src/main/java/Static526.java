import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_110 = new Class179(22, -1);

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "[I")
	public static final int[] anIntArray588 = new int[3];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7282(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static352.anInt5497; local16++) {
			if (arg0.equalsIgnoreCase(Static213.aStringArray13[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50);
	}
}
