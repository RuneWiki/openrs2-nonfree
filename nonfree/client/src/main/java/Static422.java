import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	public static int anInt7522;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString202 = "";

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZII)Z")
	public static boolean method5872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(FFIF)I")
	public static int method5873(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V")
	public static void method5874(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub19 local12 = Static73.method5992(10, arg0);
		local12.method7364();
	}
}
