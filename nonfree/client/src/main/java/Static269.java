import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	public static int anInt4741;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
	public static final int[] anIntArray524 = new int[4096];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!rp;)Lclient!jh;")
	public static Class42_Sub1 method4255(@OriginalArg(1) Class3_Sub5 arg0) {
		return new Class42_Sub1(arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2740(), arg0.method2786(), arg0.method2739());
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public static void method4258() {
		Static306.method4730();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static160.aClass67Array3[local8].method1324();
		}
		Static239.method5187();
		Static73.method1286();
		System.gc();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hu;")
	public static RuntimeException_Sub1 method4259(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString26 = local12.aString26 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4260(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
	public static void method4264(@OriginalArg(0) int arg0) {
		if (Static212.method3305(arg0)) {
			Static28.method331(Static375.aClass62ArrayArray2[arg0], -1);
		}
	}
}
