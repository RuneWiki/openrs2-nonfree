import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Lclient!qp;")
	public static Class290 aClass290_2;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)J")
	public static synchronized long method5133() {
		@Pc(11) long local11 = System.currentTimeMillis();
		if (Static252.aLong109 > local11) {
			Static228.aLong102 += Static252.aLong109 - local11;
		}
		Static252.aLong109 = local11;
		return local11 + Static228.aLong102;
	}
}
