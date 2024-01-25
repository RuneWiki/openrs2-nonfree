import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "Lclient!vo;")
	public static Class348 aClass348_54;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "I")
	public static int anInt5168;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "Lclient!uea;")
	public static final Class326 aClass326_4 = new Class326("WTRC", 1);

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
	public static void method4016() {
		@Pc(3) Class158[] local3 = client.aClass158Array1;
		synchronized (client.aClass158Array1) {
			for (@Pc(15) int local15 = 0; local15 < client.aClass158Array1.length; local15++) {
				client.aClass158Array1[local15] = new Class158();
				Static121.anIntArray128[local15] = 0;
			}
		}
	}
}
