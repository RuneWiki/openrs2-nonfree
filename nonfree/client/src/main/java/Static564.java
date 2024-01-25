import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "[I")
	public static final int[] anIntArray655 = new int[25];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZI)Lclient!po;")
	public static Class267 method8459(@OriginalArg(1) int arg0) {
		@Pc(10) Class267 local10 = (Class267) Static154.aClass169_39.method5002((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static100.aClass157_65.method4564(1, arg0);
		local10 = new Class267();
		local10.anInt8090 = arg0;
		if (local20 != null) {
			local10.method6900(new Class2_Sub11(local20));
		}
		local10.method6901();
		if (local10.anInt8084 == 2 && Static621.aClass99_82.method3056((long) arg0) == null) {
			Static621.aClass99_82.method3059((long) arg0, new Class2_Sub43(Static31.anInt716));
			Static212.aClass267Array1[Static31.anInt716++] = local10;
		}
		Static154.aClass169_39.method5001(local10, (long) arg0);
		return local10;
	}
}
