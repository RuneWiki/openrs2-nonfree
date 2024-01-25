import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static536 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt8844;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt8850;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public static int anInt8845 = 0;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	public static int method7307() {
		return Static327.anInt5869;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)I")
	public static int method7308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!da;IIILclient!cu;I)V")
	public static void method7309(@OriginalArg(0) Class61 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg3.method1643(arg0.l(), arg0.H(), arg0.za(), arg2, arg1, arg0.K(), arg0.J(), arg4, arg0.KA(), arg0.OA());
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
	public static boolean method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static356.method5848(arg1, arg0) | (arg1 & 0x40000) != 0 || Static563.method7586(arg0, arg1);
	}
}
