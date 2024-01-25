import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "Lclient!jga;")
	public static Class6_Sub4_Sub2 aClass6_Sub4_Sub2_2;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13;

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
	public static int anInt4587;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "Lclient!wr;")
	public static Class380 aClass380_15 = new Class380(8);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method3812(@OriginalArg(1) Class5 arg0) {
		if (Static319.aBoolean495) {
			Static303.method5139(arg0);
		} else {
			Static145.method2845(arg0);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIB)V")
	public static void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub5_Sub19 local12 = Static348.method5721(arg1, 1);
		local12.method5179();
		local12.anInt6198 = arg0;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)Z")
	public static boolean method3815() {
		try {
			@Pc(12) Class277 local12 = new Class277();
			@Pc(17) byte[] local17 = local12.method6958(Static137.aByteArray20);
			Static476.method7043(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}
}
