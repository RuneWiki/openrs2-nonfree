import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!na", name = "n", descriptor = "I")
	public static int anInt6216;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "[B")
	public static byte[] aByteArray73;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Z")
	public static boolean method5311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
