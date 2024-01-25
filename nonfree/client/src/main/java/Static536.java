import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static536 {

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "Lclient!hh;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
	public static int anInt8305;

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "[I")
	public static final int[] anIntArray566 = new int[200];

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "Lclient!gp;")
	public static final Class137 aClass137_4 = new Class137();

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIZI)V")
	public static void method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static537.anInt8321 = arg5;
		Static460.anInt7364 = arg2;
		Static578.anInt8920 = arg0;
		Static169.anInt3014 = arg1;
		Static414.anInt5950 = arg3;
		if (arg4 && Static169.anInt3014 >= 100) {
			Static652.anInt10283 = Static414.anInt5950 * 512 + 256;
			Static611.anInt9382 = Static537.anInt8321 * 512 + 256;
			Static618.anInt9710 = Static674.method8951(Static296.anInt4684, Static652.anInt10283, Static611.anInt9382) - Static460.anInt7364;
		}
		Static286.anInt4563 = -1;
		Static77.anInt1632 = -1;
		Static259.anInt4200 = 2;
	}
}
