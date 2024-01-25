import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "[Lclient!oea;")
	public static Class237[] aClass237Array1;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_200 = new Class81(103, 8);

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("bc8064591cade7cc46a5ffce292917f52fbad6b9acc065ce0efae88f3dfc44e26559ec582911f2b3e020ae3d56d87370aa0cd1357dcbbccab1a6339ab121ed6f", 16);

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
	public static int anInt8424 = 0;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILclient!hk;Lclient!hk;)V")
	public static void method6984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub1 arg3, @OriginalArg(4) Class20_Sub2_Sub1 arg4) {
		@Pc(4) Class293 local4 = Static528.method7221(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub1_1 = arg3;
		local4.aClass20_Sub2_Sub1_2 = arg4;
		@Pc(19) int local19 = Static20.aClass17Array1 == Static499.aClass17Array3 ? 1 : 0;
		if (!arg3.method7249()) {
			Static379.aClass20_Sub2ArrayArray2[local19][Static431.anIntArray499[local19]++] = arg3;
		} else if (arg3.method7256()) {
			Static386.aClass20_Sub2ArrayArray3[local19][Static288.anIntArray327[local19]++] = arg3;
		} else {
			Static166.aClass20_Sub2ArrayArray1[local19][Static464.anIntArray526[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7249()) {
			if (arg4.method7256()) {
				Static386.aClass20_Sub2ArrayArray3[local19][Static288.anIntArray327[local19]++] = arg4;
				return;
			}
			Static166.aClass20_Sub2ArrayArray1[local19][Static464.anIntArray526[local19]++] = arg4;
			return;
		}
		Static379.aClass20_Sub2ArrayArray2[local19][Static431.anIntArray499[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!io;B)Lclient!fo;")
	public static Class78_Sub2 method6985(@OriginalArg(0) Class1_Sub20 arg0) {
		return new Class78_Sub2(arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4396(), arg0.method4396(), arg0.method4393());
	}
}
