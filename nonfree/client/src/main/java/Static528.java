import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
	public static int anInt8243;

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
	public static int anInt8244;

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_80 = new Class144(23, 8);

	@OriginalMember(owner = "client!qia", name = "q", descriptor = "I")
	public static int anInt8245 = -1;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
	public static boolean method7046() {
		if (Static304.aBoolean320) {
			try {
				Static728.method688(Static41.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(21) Throwable local21) {
			}
		}
		return false;
	}
}
