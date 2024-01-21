import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lclient!dg;")
	public static Class1_Sub1_Sub4_Sub2_Sub1 aClass1_Sub1_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_543 = Static49.method1293("Please enter your password)3");

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_542 = aClass70_543;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_544 = Static49.method1293("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZILclient!u;)[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] method1328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2) {
		return Static95.method2048(arg0, arg2, arg1) ? Static148.method2915() : null;
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	public static void method1329() {
		aClass1_Sub1_Sub4_Sub2_Sub1_1 = null;
		aClass70_543 = null;
		aClass70_542 = null;
		aClass70_544 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method1330(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static139.method2732(local18) : local18;
		} else if (arg0 instanceof Class52) {
			@Pc(32) Class52 local32 = (Class52) arg0;
			return local32.method3350();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	public static void method1331() {
		Static37.anIntArray122 = null;
		Static35.anIntArray198 = null;
		Static65.aByteArrayArrayArray5 = null;
		Static95.aByteArrayArrayArray6 = null;
		Static41.aByteArrayArrayArray3 = null;
		Static60.aByteArrayArrayArray4 = null;
		Static49.anIntArray169 = null;
		Static134.anIntArray331 = null;
		Static25.aByteArrayArrayArray2 = null;
		Static39.anIntArrayArrayArray3 = null;
		Static96.anIntArray259 = null;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Z")
	public static boolean method1332(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
