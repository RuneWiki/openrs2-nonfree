import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
	public static int anInt6186;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
	public static int anInt6184 = 0;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)I")
	public static int method5329() {
		return 16;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)Z")
	public static boolean method5331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static38.method888(arg1, arg0) & Static414.method6056(arg1, arg0);
	}
}
