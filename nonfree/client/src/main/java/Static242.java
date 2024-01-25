import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Lclient!kba;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Lclient!uk;")
	public static Class377 aClass377_3;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("c6c19b12b347ea5d505fb0f875f61b112bf0321a88e7074a3e0ec43966d307d06871e137a5595d3366712cc8b97274b0c6d8bbb6821eaee7761e9d59b76ffb73", 16);

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "Lclient!gw;")
	public static final Class147 aClass147_2 = new Class147();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)Z")
	public static boolean method3456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public static void method3457() {
		if (!Static347.method4914()) {
			return;
		}
		if (Static547.aStringArray37 == null) {
			Static8.method250();
		}
		Static315.aBoolean335 = true;
		Static720.anInt11176 = 0;
	}
}
