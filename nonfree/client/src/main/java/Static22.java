import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	public static int anInt435;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
	public static int anInt437;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "S")
	public static short aShort9 = 32767;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	public static int anInt439 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "Lclient!sc;")
	private static Class107 aClass107_152 = Static231.method3737("Close");

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_151 = aClass107_152;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)I")
	public static int method415(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIB)I")
	public static int method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
