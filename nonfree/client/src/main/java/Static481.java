import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static481 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger11 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!si", name = "j", descriptor = "I")
	public static int anInt8148 = 0;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)Z")
	public static boolean method6625() {
		return Static511.method7084("jaclib") ? Static511.method7084("hw3d") : false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method6626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
