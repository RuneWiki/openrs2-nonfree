import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	public static int anInt3021;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!jd;")
	public static Class84 aClass84_57;

	@OriginalMember(owner = "client!l", name = "F", descriptor = "Z")
	public static boolean aBoolean241 = true;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "I")
	public static int anInt3023 = 0;

	@OriginalMember(owner = "client!l", name = "L", descriptor = "I")
	public static int anInt3024 = 0;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Z")
	public static boolean method2469() {
		if (Static54.aBoolean95) {
			try {
				Static303.method484("showVideoAd", Static299.aClass177_5.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
