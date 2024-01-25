import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!rd;")
	public static Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_74 = new Class303(22, 6);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method5859(@OriginalArg(1) Class14[] arg0) {
		Static536.anInt8597 = arg0.length;
		Static129.anIntArray133 = new int[Static536.anInt8597 + 10];
		Static348.aClass14Array12 = new Class14[Static536.anInt8597 + 10];
		Static601.method2819(arg0, 0, Static348.aClass14Array12, 0, Static536.anInt8597);
		for (@Pc(26) int local26 = 0; local26 < Static536.anInt8597; local26++) {
			Static129.anIntArray133[local26] = Static348.aClass14Array12[local26].ca();
		}
		for (@Pc(49) int local49 = Static536.anInt8597; local49 < Static348.aClass14Array12.length; local49++) {
			Static129.anIntArray133[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!tf;Lclient!tf;Lclient!tf;Lclient!tf;Z)V")
	public static void method5860(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Class322 arg3) {
		Static321.aClass322_98 = arg2;
		Static527.aClass322_143 = arg0;
		Static198.aClass322_75 = arg1;
		Static380.aClass361ArrayArray2 = new Class361[Static527.aClass322_143.method6825()][];
		Static414.aBooleanArray22 = new boolean[Static527.aClass322_143.method6825()];
	}
}
