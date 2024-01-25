import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!rka", name = "A", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_166 = new Class225(132, -1);

	@OriginalMember(owner = "client!rka", name = "x", descriptor = "Lclient!cga;")
	public static Class60 aClass60_180 = new Class60();

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(BI)Lclient!ve;")
	public static Class379 method7762(@OriginalArg(1) int arg0) {
		@Pc(12) Class379 local12 = (Class379) Static193.aClass85_21.method1737((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(32) byte[] local32 = Static641.aClass254_158.method6087(arg0, 1);
		local12 = new Class379();
		local12.anInt10436 = arg0;
		if (local32 != null) {
			local12.method9142(new Class2_Sub20(local32));
		}
		local12.method9141();
		if (local12.anInt10445 == 2 && Static193.aClass218_14.method5095((long) arg0, 0) == null) {
			Static193.aClass218_14.method5099(new Class2_Sub2(Static77.anInt1355), (long) arg0);
			Static280.aClass379Array2[Static77.anInt1355++] = local12;
		}
		Static193.aClass85_21.method1745((long) arg0, 16383, local12);
		return local12;
	}
}
