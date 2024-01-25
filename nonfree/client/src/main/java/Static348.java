import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "[Lclient!vr;")
	public static final Interface23[] anInterface23Array3 = new Interface23[128];

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static455.aClass3_Sub27_Sub1_1.anInt4799 != 0 && arg3 != 0 && Static228.anInt4641 < 50 && arg4 != -1) {
			Static200.aClass64Array1[Static228.anInt4641++] = new Class64((byte) 1, arg4, arg3, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method2212(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static209.method3675(arg0, null, arg4, -1, arg5, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ)V")
	public static void method2213(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static87.aClass3_Sub4_Sub7_2 != null) {
			Static479.anInt8960 = Static87.aClass3_Sub4_Sub7_2.anInt2243;
		} else {
			Static479.anInt8960 = -1;
		}
		Static130.anInt2933 = 0;
		Static112.aClass305_5 = null;
		Static87.aClass3_Sub4_Sub7_2 = null;
		Static493.aClass183_55 = null;
		Static87.method5766();
		Static87.aClass183_42.method4790();
		Static474.aClass247_9 = null;
		Static251.aClass37_27 = null;
		Static87.aClass238_2 = null;
		Static563.aClass247_11 = null;
		Static142.aClass247_4 = null;
		Static423.anInt8217 = -1;
		Static593.anInt10380 = -1;
		Static284.aClass247_7 = null;
		Static400.aClass247_8 = null;
		Static67.aClass247_12 = null;
		Static584.aClass247_14 = null;
		Static580.aClass247_13 = null;
		if (Static87.aClass10_4 != null) {
			Static87.aClass10_4.method399();
			Static87.aClass10_4.method401(64, 128);
		}
		if (Static87.aClass315_3 != null) {
			Static87.aClass315_3.method7656(64, 64);
		}
		if (Static87.aClass146_3 != null) {
			Static87.aClass146_3.method3359(64);
		}
		Static380.aClass46_1.method1600(64);
	}
}
