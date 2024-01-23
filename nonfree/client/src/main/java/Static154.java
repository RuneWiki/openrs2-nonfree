import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lg", name = "tc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lg", name = "Cd", descriptor = "J")
	public static long aLong116;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!tm;")
	public static Class163 aClass163_23 = new Class163(16);

	@OriginalMember(owner = "client!lg", name = "Eb", descriptor = "Ljava/lang/String;")
	public static String aString105 = "Loading world list data";

	@OriginalMember(owner = "client!lg", name = "zd", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!lg", name = "Dd", descriptor = "I")
	public static int anInt3207 = 2;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method2515() {
		Static121.aClass172_21.method4350();
		Static50.aClass172_9.method4350();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
	public static void method2523(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub33 local10 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local10 != null) {
			local10.method4690();
		}
	}
}
