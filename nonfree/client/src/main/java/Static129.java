import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Lclient!rg;")
	public static Class310 aClass310_28;

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_14 = new Class317(8);

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Lclient!c;")
	public static final Class51 aClass51_6 = new Class51(9, 2);

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "[I")
	public static final int[] anIntArray132 = new int[4096];

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "[I")
	public static int[] anIntArray133 = new int[1];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
	public static boolean method1989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static511.method7646(arg0, arg1) || Static333.method8698(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static497.method7459(arg0, arg1);
		}
	}
}
