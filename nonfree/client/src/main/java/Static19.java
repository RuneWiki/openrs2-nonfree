import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt346;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("85d2803914a3425c13d85771619be009a18ff620e5ad274fb3540020f08cf6697132583429ba31a3543e6af0c8ce72888004fba3e3c169e880cd7ec7cc2116b1", 16);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZII)I")
	public static int method319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) byte local22;
		if (arg0 > 20000) {
			Static6.method104();
			local22 = 4;
		} else if (arg0 > 10000) {
			Static67.method820();
			local22 = 3;
		} else if (arg0 <= 5000) {
			local22 = 1;
			Static209.method3106();
		} else {
			Static413.method6147();
			local22 = 2;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != arg1) {
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, arg1);
			Static718.method9389(arg1, false);
		}
		Static328.method4885();
		return local22;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ss;BII)V")
	public static void method320(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.aClass3_Sub28_Sub2_1.method5282(arg2);
		arg1.aClass3_Sub28_Sub2_1.method5311(arg0);
		arg1.aClass3_Sub28_Sub2_1.method5313(arg3);
	}
}
