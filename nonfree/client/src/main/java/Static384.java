import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("b70fcea753e4785b7fa0e6de7d6a396a3b53c881461caa77c90dc72883ec7151b190f2fc6194e6ba0012c3eaa5b2edc28919de97772f988da44474a52706a881", 16);

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Z")
	public static final boolean aBoolean506 = false;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_128 = new Class56(43, 6);

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	public static int method5685() {
		return Static16.anInt309;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public static void method5687(@OriginalArg(0) int arg0) {
		if (Static11.anIntArray13 == null || Static11.anIntArray13.length < arg0) {
			Static11.anIntArray13 = new int[arg0];
		}
	}
}
