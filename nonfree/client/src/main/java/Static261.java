import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_32 = new Class112(8);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([FII)[F")
	public static float[] method4863(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static655.method6404(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!op;)Z")
	public static boolean method4864(@OriginalArg(1) Interface18 arg0) {
		@Pc(10) Class272 local10 = Static541.aClass349_4.method8123(arg0.method8587());
		if (local10.anInt8268 == -1) {
			return true;
		} else {
			@Pc(23) Class164 local23 = Static168.aClass204_3.method5447(local10.anInt8268);
			return local23.anInt5796 == -1 ? true : local23.method4910();
		}
	}
}
