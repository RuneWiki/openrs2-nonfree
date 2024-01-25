import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt9026;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	public static int method7577() {
		return Static200.anIntArray222 == null ? 0 : Static200.anIntArray222.length * 2;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
	public static boolean method7578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
