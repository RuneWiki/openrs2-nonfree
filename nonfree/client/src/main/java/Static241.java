import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt4921 = 0;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
	public static final int[] anIntArray320 = new int[1];

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!hh;")
	public static final Class135 aClass135_3 = new Class135(2);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBZ)V")
	public static void method4243(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static518.anInt9045 = arg0;
		Static49.anInt1353 = 3;
		Static87.method1963(Static516.aClass275_5.aString100, Static516.aClass275_5.anInt7968);
		if (arg1) {
			Static482.method7331("", false, "");
		} else {
			Static178.method3533();
			Static482.method7331(Static500.aString106, false, Static91.aString22);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z")
	public static boolean method4244() {
		return Static463.anInt8569 == 0 ? Static258.aClass6_Sub10_Sub1_2.method1533() : true;
	}
}
