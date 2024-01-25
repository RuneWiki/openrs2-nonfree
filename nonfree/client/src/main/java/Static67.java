import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
	public static int anInt1403;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
	public static int anInt1404;

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBI)Z")
	public static boolean method1258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static588.method8115(arg1, arg0) | (arg0 & 0x70000) != 0 || Static395.method2908(arg1, arg0);
	}
}
