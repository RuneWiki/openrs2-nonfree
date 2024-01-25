import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	public static int anInt1672;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt1673;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt1670 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_9 = new Class361();

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
	public static final int[] anIntArray143 = new int[32];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)Z")
	public static boolean method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static256.method4327(arg0, arg1) | (arg0 & 0x800) != 0 || Static515.method7130(arg1, arg0);
	}
}
