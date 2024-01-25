import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
	public static int anInt6474 = 0;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(IBI)Z")
	public static boolean method5807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static523.method7739(arg0, arg1) || Static532.method7864(arg1, arg0);
	}
}
