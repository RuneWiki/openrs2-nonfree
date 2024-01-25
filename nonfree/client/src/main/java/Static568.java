import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public static int anInt9516 = -1;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("dd93a8b1b542ae61fca3492097c6c7ba9d3df56dc29aa0c7ca52242f0b3e18f2962825a15b4ac49eaea2a96a5edc43b6359ca9b757b7b57d72bad0c136798ff7", 16);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!u;)Ljava/lang/String;")
	public static String method7783(@OriginalArg(1) Class6_Sub48 arg0) {
		return arg0.aString104 == null || arg0.aString104.length() <= 0 ? arg0.aString103 : arg0.aString103 + Static141.aClass104_77.method2145(Static470.anInt7957) + arg0.aString104;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
	public static int method7784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method7786() {
		Static387.method5772();
		Static11.method182();
	}
}
