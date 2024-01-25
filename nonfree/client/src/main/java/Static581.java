import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public static int anInt10352;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!rv;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	public static void method8641(@OriginalArg(0) int arg0) {
		Static454.anInt8398 = arg0;
		@Pc(12) Class169 local12 = Static118.aClass169_19;
		synchronized (Static118.aClass169_19) {
			Static118.aClass169_19.method5009();
		}
	}
}
