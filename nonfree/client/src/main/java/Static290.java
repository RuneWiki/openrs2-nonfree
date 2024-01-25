import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!vc;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
	public static boolean aBoolean370;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	public static int anInt5596 = -1;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method4971() {
		Static243.aClass11_106.method213();
		Static259.aClass11_112.method213();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method4972(@OriginalArg(1) int arg0) {
		Static315.anInt6455 = arg0;
		@Pc(7) Class11 local7 = Static159.aClass11_73;
		synchronized (Static159.aClass11_73) {
			Static159.aClass11_73.method213();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)B")
	public static byte method4973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
