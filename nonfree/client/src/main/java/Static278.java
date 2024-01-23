import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
	public static void method4264() {
		Static183.aClass175_28.method4294();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Lclient!db;")
	public static Class1_Sub5_Sub4 method4265(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5_Sub4 local10 = (Class1_Sub5_Sub4) Static97.aClass175_15.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static94.method1801(Static300.aClass119_93, Static11.aClass119_2, arg0);
		if (local10 != null) {
			Static97.aClass175_15.method4285(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)Lclient!td;")
	public static Class1_Sub5_Sub21 method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class1_Sub5_Sub21 local23 = (Class1_Sub5_Sub21) Static147.aClass86_37.method2136((long) arg1 | (long) arg0 << 32);
		if (local23 == null) {
			local23 = new Class1_Sub5_Sub21(arg0, arg1);
			Static147.aClass86_37.method2144(local23, local23.aLong210);
		}
		return local23;
	}
}
