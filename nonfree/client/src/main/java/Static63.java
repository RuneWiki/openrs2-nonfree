import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IBZLclient!r;)Lclient!la;")
	public static Class45 method1399(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(9) Class279 local9 = Static371.method5565(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass45_8;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(IB)V")
	public static void method1400(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 14);
		local8.method2302();
	}
}
