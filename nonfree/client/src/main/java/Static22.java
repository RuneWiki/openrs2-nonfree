import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!em;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!th;")
	public static Class15_Sub2_Sub2 aClass15_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
	public static int[] anIntArray57 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public static int anInt504 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	public static int method438() {
		return Static155.anInt3470;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nh;")
	public static RuntimeException_Sub1 method440(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString134 = local12.aString134 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method441(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static153.method2808(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!oe;I)Lclient!pg;")
	public static Class2_Sub8_Sub16 method442(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(29) Class2_Sub8_Sub16 local29 = new Class2_Sub8_Sub16(arg1, arg0.method2158(), arg0.method2158(), arg0.method2145(), arg0.method2145(), arg0.method2146() == 1, arg0.method2146());
		@Pc(42) int local42 = arg0.method2146();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			local29.aClass44_22.method1358(new Class2_Sub30(arg0.method2146(), arg0.method2146(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130()));
		}
		local29.method3592();
		return local29;
	}
}
