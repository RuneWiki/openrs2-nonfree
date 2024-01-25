import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static435 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public static int anInt7968;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!xa;")
	public static Class119 aClass119_25;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_129 = new Class67("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt7969 = 0;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt7970 = -1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBLclient!qf;)V")
	public static void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class245 arg2) {
		if (Static166.aClass245_12 != null || Static228.aBoolean342 || (arg2 == null || Static161.method3128(arg2) == null)) {
			return;
		}
		Static166.aClass245_12 = arg2;
		Static143.aClass245_6 = Static161.method3128(arg2);
		Static21.anInt706 = arg0;
		Static468.aBoolean618 = false;
		Static392.anInt7212 = arg1;
		Static339.anInt5664 = 0;
	}
}
