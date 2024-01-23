import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	public static int anInt3407;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "[Lclient!v;")
	public static Class173[] aClass173Array2;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Lclient!cl;")
	public static Class27 method2699() {
		try {
			return (Class27) Class.forName("Class27_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I")
	public static int method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public static void method2701() {
		aBigInteger2 = null;
		aClass173Array2 = null;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Lclient!cc;")
	public static Class22 method2702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class22 local9 = Static21.method3453(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass22Array1 == null || local9.aClass22Array1.length <= arg1) {
			return null;
		} else {
			return local9.aClass22Array1[arg1];
		}
	}
}
