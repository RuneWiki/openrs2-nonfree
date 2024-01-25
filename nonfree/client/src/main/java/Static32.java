import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bn", name = "ab", descriptor = "Lclient!ek;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!bn", name = "bc", descriptor = "I")
	public static int anInt6598;

	@OriginalMember(owner = "client!bn", name = "Zb", descriptor = "I")
	public static int anInt6596 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)Z")
	public static boolean method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
