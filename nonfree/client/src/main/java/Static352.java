import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static352 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
	public static int anInt6110;

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Lclient!qj;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public static int anInt6108 = 0;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_281 = new Class22(74, -1);

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_82 = new Class215(71, 2);

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_282 = new Class22(63, 4);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)V")
	public static void method4768(@OriginalArg(1) int arg0) {
		if (Static224.anIntArray288 == null || arg0 > Static224.anIntArray288.length) {
			Static224.anIntArray288 = new int[arg0];
		}
	}
}
