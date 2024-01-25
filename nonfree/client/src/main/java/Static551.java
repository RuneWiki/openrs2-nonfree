import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!dh;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method7381() {
		if (Static582.anInt9301 == 6) {
			Static582.anInt9301 = 7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method7382() {
		if (Static105.anInterface13Array4 == null) {
			return;
		}
		@Pc(5) Interface13[] local5 = Static105.anInterface13Array4;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface13 local13 = local5[local7];
			local13.method5349();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	public static int method7383() {
		return 46;
	}
}
