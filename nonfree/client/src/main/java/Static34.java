import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
	public static int anInt1115;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_367 = Static49.method1293("(U4");

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_368 = Static49.method1293("<)4col>");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ub;")
	public static RuntimeException_Sub1 method872(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString5 = local12.aString5 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(II)Lclient!rf;")
	public static Class70 method873(@OriginalArg(0) int arg0) {
		return Static96.method2077(false, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method874() {
		aClass70_368 = null;
		aClass70_367 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBII)I")
	public static int method875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * local7 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + (local7 * (arg0 & 0xFF00) + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILclient!u;III)V")
	public static void method876(@OriginalArg(1) int arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static47.anInt1655 = arg3;
		Static184.anInt4567 = arg0;
		Static143.aClass76_111 = arg1;
		Static28.anInt834 = 10000;
		Static143.aBoolean142 = false;
		Static160.anInt4192 = 1;
		Static144.anInt3804 = arg2;
	}
}
