import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_7 = new Class352(10, 2, 2, 0);

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([BII)I")
	public static int method5003(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static425.method6282(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)V")
	public static void method5004(@OriginalArg(1) int arg0) {
		if (!Static14.method139()) {
			return;
		}
		if (Static242.anInt4374 != arg0) {
			Static521.aString85 = "";
		}
		Static242.anInt4374 = arg0;
		if (Static258.aClass97_2 != null) {
			Static258.aClass97_2.method2286();
			Static258.aClass97_2 = null;
		}
		Static67.method1345(5);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(JJ)J")
	public static long method5005(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
