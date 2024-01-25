import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "Lclient!sda;")
	public static Class12_Sub45 aClass12_Sub45_1;

	@OriginalMember(owner = "client!eca", name = "I", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_22 = new Class77(10, 6);

	@OriginalMember(owner = "client!eca", name = "U", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_12 = new Class202(4, 2);

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_13 = new Class202(12, 7);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIZ)I")
	public static int method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > arg0) {
			return arg1;
		} else if (arg2 >= arg0) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "(III)Z")
	public static boolean method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static133.method2769(arg0, arg1) | Static435.method6630(arg1, arg0)) & Static136.method2793(arg1, arg0);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cs;")
	public static RuntimeException_Sub1 method2270(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString13 = local9.aString13 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
