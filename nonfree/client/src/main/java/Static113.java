import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
	public static int anInt2454 = -1;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
	public static void method1834() {
		for (@Pc(7) int local7 = 0; local7 < Static165.anInt3792; local7++) {
			@Pc(23) Class23 local23 = Static193.method3435(local7);
			if (local23 != null && local23.anInt493 == 0) {
				Static265.anIntArray574[local7] = 0;
				Static170.anIntArray601[local7] = 0;
			}
		}
		Static127.aClass117_8 = new Class117(16);
	}
}
