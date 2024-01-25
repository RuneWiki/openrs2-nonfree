import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public static int anInt6297;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
	public static boolean method5258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static301.method4359(arg0, arg1) & Static433.method5700(arg1, arg0);
	}
}
