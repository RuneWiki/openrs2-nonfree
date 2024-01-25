import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!qm", name = "I", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_157 = new Class225(62, 0);

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_26 = new Class118(51);

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[I")
	public static final int[] anIntArray596 = new int[32];

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)Ljava/lang/String;")
	public static String method7417() {
		return Static189.aBoolean301 || Static91.aClass2_Sub6_Sub20_2 == null ? "" : Static91.aClass2_Sub6_Sub20_2.aString107;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)I")
	public static int method7418() {
		@Pc(14) int local14 = Static101.aClass406_8.method9624();
		if (local14 < Static127.aClass406Array1.length - 1) {
			Static101.aClass406_8 = Static127.aClass406Array1[local14 + 1];
		}
		return 100;
	}
}
