import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public static int anInt2445;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public static int anInt2448;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "S")
	public static short aShort51 = 32767;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!rk;Lclient!rk;B)V")
	public static void method2033(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		Static233.aClass180_58 = arg1;
		Static104.aClass180_31 = arg0;
		Static104.aClass180_31.method4553(36);
	}
}
