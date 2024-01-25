import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!ak;")
	public static final Class14 aClass14_3 = new Class14(128);

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	public static final int[] anIntArray643 = new int[3];

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt8686 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method7144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
