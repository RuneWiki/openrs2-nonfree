import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)Z")
	public static boolean method2423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
