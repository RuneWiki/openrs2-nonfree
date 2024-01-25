import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "ob", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!at", name = "D", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_62 = new Class21(64);

	@OriginalMember(owner = "client!at", name = "pb", descriptor = "[I")
	public static final int[] anIntArray169 = new int[100];

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	public static void method2105() {
		for (@Pc(7) int local7 = 0; local7 < Static280.anInt5460; local7++) {
			@Pc(13) Class116 local13 = Static123.method2594(local7);
			if (local13 != null && local13.anInt3541 == 0) {
				Static277.anIntArray417[local7] = 0;
				Static87.anIntArray147[local7] = 0;
			}
		}
		Static228.aClass38_25 = new Class38(128);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2116(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static216.anInt4293; local11++) {
			if (arg0.equalsIgnoreCase(Static191.aStringArray43[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static239.aStringArray26[local11])) {
				return true;
			}
		}
		return false;
	}
}
