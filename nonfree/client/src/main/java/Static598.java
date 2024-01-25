import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static598 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public static int anInt2010;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public static int anInt2012 = 0;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
