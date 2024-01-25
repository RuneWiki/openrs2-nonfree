import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public static int anInt8750;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("a9ef8d9b9a57ae01e455deaa04bf8b2cec7bb5fe55b0f9613440ce793c1e1a35573cc8634a5a8748065e0fa72700b18d669bdb958ed4dd985c14b675f4e98c8b", 16);

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt8751 = 1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method7307(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local6 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local6 || Static240.method1410(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local6 <= local25 - 1 || Static240.method1410(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(73) byte[] local73 = new byte[local31];
		Static128.method2160(arg0, 0, local73);
		return local73;
	}
}
