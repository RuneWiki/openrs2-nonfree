import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!fr", name = "R", descriptor = "I")
	public static int anInt2502;

	@OriginalMember(owner = "client!fr", name = "P", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(IZI)Z")
	public static boolean method2115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static228.method3401(arg1, arg0) || Static344.method4659(arg0, arg1);
	}
}
