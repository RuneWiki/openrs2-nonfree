import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt2388 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)Z")
	public static boolean method2192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
