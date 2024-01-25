import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "F")
	public static float aFloat56 = 0.25F;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method3846() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static72.aBooleanArray6[local7] = false;
		}
		Static171.anInt3113 = -1;
		Static432.anInt7151 = 0;
		Static285.anInt4686 = Static133.anInt2435;
		Static320.anInt5206 = -1;
		Static366.anInt6051 = 0;
		Static259.anInt4334 = Static411.anInt6947;
		Static16.anInt244 = Static235.anInt4004;
		Static264.anInt4366 = Static265.anInt4371;
		Static97.anInt1791 = 5;
		Static317.anInt5141 = Static222.anInt3814;
		Static134.anInt2447 = Static393.anInt7135;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
	public static void method3849() {
		@Pc(5) Class137 local5 = Static31.aClass137_5;
		synchronized (Static31.aClass137_5) {
			Static31.aClass137_5.method2739();
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZII)B")
	public static byte method3850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
