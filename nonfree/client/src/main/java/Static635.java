import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static int anInt9893;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public static int anInt9889 = -1;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	public static int anInt9890 = 0;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public static int anInt9892 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method8466(@OriginalArg(1) int arg0) {
		Static294.anInt4647 = arg0;
		@Pc(7) Class352 local7 = Static261.aClass352_36;
		synchronized (Static261.aClass352_36) {
			Static261.aClass352_36.method7659();
		}
		local7 = Static511.aClass352_58;
		synchronized (Static511.aClass352_58) {
			Static511.aClass352_58.method7659();
		}
	}
}
