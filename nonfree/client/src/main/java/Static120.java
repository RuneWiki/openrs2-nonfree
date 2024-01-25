import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_18 = new Class125(64);

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public static int anInt2575 = 1;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_53 = new Class133(52, 12);

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[S")
	public static short[] aShortArray64 = new short[256];

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lclient!rc;")
	public static Class3_Sub10_Sub16 method2198() {
		@Pc(13) Class3_Sub10_Sub16 local13 = (Class3_Sub10_Sub16) Static250.aClass279_8.method6908();
		if (local13 != null) {
			local13.method7820();
			local13.method7643();
			return local13;
		}
		do {
			local13 = (Class3_Sub10_Sub16) Static510.aClass279_10.method6908();
			if (local13 == null) {
				return null;
			}
			if (local13.method6216() > Static12.method647()) {
				return null;
			}
			local13.method7820();
			local13.method7643();
		} while ((local13.aLong277 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}
