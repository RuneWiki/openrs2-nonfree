import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "S")
	public static short aShort93 = 1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
	public static void method6220() {
		Static303.method4764();
		Static403.aClass299ArrayArray1 = null;
		Static554.aClass49_4 = null;
		Static505.aClass49_3 = null;
		Static28.aClass13_87 = null;
		Static446.aClass49_1 = null;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBLclient!nd;)Lclient!jl;")
	public static Class183 method6221(@OriginalArg(0) int arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(8) byte[] local8 = arg1.method5580(arg0);
		return local8 == null ? null : new Class183(local8);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
	public static void method6222() {
		Static141.aClass25_2 = Static141.aClass25_1;
	}
}
