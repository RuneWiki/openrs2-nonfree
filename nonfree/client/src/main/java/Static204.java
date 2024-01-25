import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "J")
	public static long aLong98;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_63 = new Class337(47, 3);

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)I")
	public static int method3552(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!al;)I")
	public static int method3553(@OriginalArg(1) Class19 arg0) {
		if (Static20.aClass19_1 == arg0) {
			return 5120;
		} else if (Static20.aClass19_2 == arg0) {
			return 5122;
		} else if (arg0 == Static20.aClass19_3) {
			return 5124;
		} else if (Static20.aClass19_4 == arg0) {
			return 5121;
		} else if (Static20.aClass19_5 == arg0) {
			return 5123;
		} else if (Static20.aClass19_6 == arg0) {
			return 5125;
		} else if (Static20.aClass19_7 == arg0) {
			return 5131;
		} else if (Static20.aClass19_8 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
