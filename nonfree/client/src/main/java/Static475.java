import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!eia;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "J")
	public static long aLong212;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
	public static int anInt8127 = 0;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_262 = new Class194(61, 6);

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
	public static int anInt8130 = -1;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[B)[B")
	public static byte[] method7020(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static651.method749(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
