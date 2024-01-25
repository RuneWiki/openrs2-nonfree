import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZLclient!uv;)V")
	public static void method5417(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class344 arg1) {
		@Pc(22) int local22 = arg1.anInt9562 == 0 ? arg1.anInt9546 : arg1.anInt9562;
		@Pc(34) int local34 = arg1.anInt9591 == 0 ? arg1.anInt9602 : arg1.anInt9591;
		Static145.method3121(local34, arg0, arg1.anInt9571, local22, Static319.aClass344ArrayArray2[arg1.anInt9571 >> 16]);
		if (arg1.aClass344Array2 != null) {
			Static145.method3121(local34, arg0, arg1.anInt9571, local22, arg1.aClass344Array2);
		}
		@Pc(67) Class3_Sub1 local67 = (Class3_Sub1) Static128.aClass25_7.method426((long) arg1.anInt9571);
		if (local67 != null) {
			Static459.method6810(local22, local34, local67.anInt24, arg0);
		}
	}
}
