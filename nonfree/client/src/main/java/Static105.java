import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
	public static boolean aBoolean623 = false;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public static int anInt8981 = 0;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "[I")
	public static final int[] anIntArray526 = new int[32];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z")
	public static boolean method6898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
