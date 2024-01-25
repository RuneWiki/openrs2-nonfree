import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!v", name = "k", descriptor = "J")
	public static long aLong195 = -1L;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!sj;")
	public static Class181 aClass181_50 = null;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	public static void method5352() {
		@Pc(10) Class198 local10 = Static327.aClass198_59;
		synchronized (Static327.aClass198_59) {
			Static327.aClass198_59.method5243(5);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!fb;Z)Lclient!cl;")
	public static Class35_Sub1 method5353(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class35_Sub1(arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3659(), arg0.method3659(), arg0.method3643());
	}
}
