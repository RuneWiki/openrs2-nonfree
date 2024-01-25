import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
	public static int anInt3052 = 64;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZI)Z")
	public static boolean method2477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static100.method1527(arg0, arg1) & Static40.method624(arg1, arg0);
	}
}
