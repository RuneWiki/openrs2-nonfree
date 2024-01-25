import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_24 = new Class359(66, 0);

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
	public static final int[] anIntArray59 = new int[13];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)I")
	public static int method1001(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
