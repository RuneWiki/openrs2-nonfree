import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!eq;")
	public static Class97 aClass97_78;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
	public static int anInt5689;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
	public static int anInt5690;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)Z")
	public static boolean method4756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
