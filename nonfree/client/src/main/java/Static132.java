import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)Z")
	public static boolean method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static179.aByteArrayArrayArray3[1][arg0][arg1] & 0x2) != 0;
	}
}
