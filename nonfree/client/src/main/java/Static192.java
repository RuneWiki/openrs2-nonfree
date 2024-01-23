import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!om", name = "m", descriptor = "[[Lclient!tk;")
	public static Class1_Sub32[][] aClass1_Sub32ArrayArray2;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!o;")
	public static Class116 aClass116_3;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "[I")
	public static int[] anIntArray355 = new int[50];

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	public static int anInt3954 = 0;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "Z")
	public static boolean aBoolean301 = true;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3162(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static221.aString261 = arg1;
		Static74.anInt1597 = arg2;
		Static236.aString271 = arg0;
		if (Static221.aString261.equals("") || Static236.aString271.equals("")) {
			Static113.anInt2602 = 3;
		} else if (Static33.anInt764 == -1) {
			Static274.anInt5342 = 0;
			Static22.anInt454 = 0;
			Static23.anInt469 = 1;
			Static113.anInt2602 = -3;
			@Pc(46) Class1_Sub11 local46 = new Class1_Sub11(128);
			local46.method2655(10);
			local46.method2659((int) (Math.random() * 9.9999999E7D));
			local46.method2673(Static93.method1658(Static221.aString261));
			local46.method2659((int) (Math.random() * 9.9999999E7D));
			local46.method2628(Static236.aString271);
			local46.method2659((int) (Math.random() * 9.9999999E7D));
			local46.method2687(Static233.aBigInteger2, Static87.aBigInteger1);
			Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
			Static283.aClass1_Sub11_Sub1_3.method2655(24);
			Static283.aClass1_Sub11_Sub1_3.method2655(local46.anInt3264 + 2);
			Static283.aClass1_Sub11_Sub1_3.method2660(541);
			Static283.aClass1_Sub11_Sub1_3.method2689(local46.anInt3264, local46.aByteArray47);
		} else {
			Static88.method1534();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!km;Lclient!km;Lclient!gn;ILclient!km;)Z")
	public static boolean method3166(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class1_Sub5_Sub2 arg2, @OriginalArg(4) Class91 arg3) {
		Static152.aClass91_120 = arg1;
		Static221.aClass1_Sub5_Sub2_2 = arg2;
		Static260.aClass91_208 = arg0;
		Static267.aClass91_192 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Lclient!fa;")
	public static Class41_Sub1 method3167(@OriginalArg(1) int arg0) {
		return Static297.aBoolean452 && Static217.anInt4286 <= arg0 && Static6.anInt186 >= arg0 ? Static82.aClass41_Sub1Array2[arg0 - Static217.anInt4286] : null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZII)I")
	public static int method3171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub33 local10 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray505.length) {
			return local10.anIntArray505[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ZI)V")
	public static void method3172(@OriginalArg(1) int arg0) {
		Static43.anInt903 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public static void method3174() {
		Static183.aClass135_25.method3324();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	public static void method3176() {
		Static194.aClass135_21.method3320(5);
		Static281.aClass135_39.method3320(5);
	}
}
