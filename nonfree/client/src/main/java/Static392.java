import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static392 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	public static int anInt6960;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)Z")
	public static boolean method5758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static532.method7471(arg0, arg1) || Static457.method6552(arg1, arg0);
	}
}
