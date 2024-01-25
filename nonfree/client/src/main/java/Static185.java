import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	public static int anInt9183;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_14 = new Class357(9, 2);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Z")
	public static boolean aBoolean708 = true;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lclient!vj;")
	public static Class349 method7626(@OriginalArg(0) int arg0) {
		@Pc(10) Class349 local10 = (Class349) Static4.aClass313_59.method6989((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static282.aClass259_85.method5985(arg0, 1);
		local10 = new Class349();
		local10.anInt9205 = arg0;
		if (local20 != null) {
			local10.method7640(new Class2_Sub15(local20));
		}
		local10.method7636();
		if (local10.anInt9198 == 2 && Static172.aClass162_18.method3519((long) arg0) == null) {
			Static172.aClass162_18.method3522(new Class2_Sub22(Static451.anInt484), (long) arg0);
			Static347.aClass349Array1[Static451.anInt484++] = local10;
		}
		Static4.aClass313_59.method6980((long) arg0, local10);
		return local10;
	}
}
