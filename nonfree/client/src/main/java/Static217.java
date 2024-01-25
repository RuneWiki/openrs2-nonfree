import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hia", name = "W", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
	public static int anInt3688 = -1;

	@OriginalMember(owner = "client!hia", name = "G", descriptor = "Lclient!jk;")
	public static final Class176 aClass176_2 = new Class176("game4", 3);

	@OriginalMember(owner = "client!hia", name = "Q", descriptor = "Lclient!af;")
	public static final Class10 aClass10_16 = new Class10(8);

	@OriginalMember(owner = "client!hia", name = "U", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)I")
	public static int method3159() {
		@Pc(7) int local7 = Static483.aClass46_23.method1119();
		if (Static51.aClass46Array1.length - 1 > local7) {
			Static483.aClass46_23 = Static51.aClass46Array1[local7 + 1];
		}
		return 100;
	}
}
