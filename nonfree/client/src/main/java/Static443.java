import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)I")
	public static int method6465(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
