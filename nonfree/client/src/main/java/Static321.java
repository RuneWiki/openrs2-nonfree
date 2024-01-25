import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_99 = new Class322(85, -2);

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!lc;")
	public static final Class219 aClass219_5 = new Class219();

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_8 = new Class158(7, 0, 1, 1);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(CI)Z")
	public static boolean method5033(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	public static int method5038(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
