import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!i;")
	private static Class41 aClass41_920 = Static184.method2923("glow2:");

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_917 = aClass41_920;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "S")
	public static short aShort48 = 320;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_918 = aClass41_920;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_919 = Static184.method2923(" )2>");

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
	public static int[] anIntArray341 = new int[200];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bb;")
	public static RuntimeException_Sub1 method2247(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)I")
	public static int method2248(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method2250() {
		Static11.aClass43_2.method1469();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
	public static int method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
