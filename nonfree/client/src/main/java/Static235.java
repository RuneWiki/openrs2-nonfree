import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)Lclient!va;")
	public static Class351 method3901(@OriginalArg(0) int arg0) {
		@Pc(10) Class351 local10 = (Class351) Static212.aClass233_23.method5669((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static121.aClass97_31.method2545(arg0, 1);
		local10 = new Class351();
		local10.anInt9701 = arg0;
		if (local20 != null) {
			local10.method8116(new Class2_Sub34(local20));
		}
		local10.method8117();
		if (local10.anInt9697 == 2 && Static622.aClass222_43.method5468((long) arg0) == null) {
			Static622.aClass222_43.method5476(new Class2_Sub15(Static338.anInt6229), (long) arg0);
			Static518.aClass351Array1[Static338.anInt6229++] = local10;
		}
		Static212.aClass233_23.method5662(local10, (long) arg0);
		return local10;
	}
}
