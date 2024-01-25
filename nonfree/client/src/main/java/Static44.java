import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[2048];

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1111(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static458.anInt7581; local18++) {
			if (arg0.equalsIgnoreCase(Static461.aStringArray20[local18])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123);
	}
}
