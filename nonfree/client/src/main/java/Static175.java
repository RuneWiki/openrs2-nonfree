import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static175 {

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	public static int anInt3126 = -1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZI)Z")
	public static boolean method2538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
