import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
	public static int anInt4038;

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
	public static int anInt4046 = -1;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Z")
	public static boolean method3654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
