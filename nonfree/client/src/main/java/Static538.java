import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "[Lclient!ks;")
	public static final Interface12[] anInterface12Array2 = new Interface12[128];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method7910() {
		@Pc(9) int[] local9 = new int[Static201.aClass127_1.anInt2923];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static201.aClass127_1.anInt2923; local13++) {
			@Pc(20) Class204 local20 = Static201.aClass127_1.method2501(local13);
			if (local20.anInt5695 >= 0 || local20.anInt5674 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static646.anIntArray479 = new int[local11];
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			Static646.anIntArray479[local45] = local9[local45];
		}
	}
}
