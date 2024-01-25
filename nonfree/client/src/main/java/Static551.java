import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
	public static int anInt9027 = 0;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Z")
	public static boolean method7882(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
