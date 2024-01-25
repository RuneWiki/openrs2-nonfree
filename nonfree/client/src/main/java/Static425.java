import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public static int anInt9464;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)Z")
	public static boolean method7745(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
	public static boolean method7753(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
