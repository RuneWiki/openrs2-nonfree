import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!rd;")
	public static Class275 aClass275_2;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "F")
	public static float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!le", name = "A", descriptor = "I")
	public static int anInt5603 = 1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)Z")
	public static boolean method4804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public static int method4805() {
		@Pc(10) Class245 local10 = Static428.aClass245_59;
		synchronized (Static428.aClass245_59) {
			return Static428.aClass245_59.method6085();
		}
	}
}
