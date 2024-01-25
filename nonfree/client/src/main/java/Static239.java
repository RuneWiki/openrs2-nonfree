import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)Lclient!la;")
	public static Class208 method3453(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class223 local11 = null;
		if (Static289.aClass176_11 != null) {
			local11 = new Class223(arg1, Static289.aClass176_11, Static371.aClass176Array1[arg1], 1000000);
		}
		Static11.aClass260_Sub1Array1[arg1] = Static33.aClass331_1.method8154(Static499.aClass223_4, arg1, local11);
		Static11.aClass260_Sub1Array1[arg1].method6259();
		return new Class208(Static11.aClass260_Sub1Array1[arg1], arg0, arg2);
	}
}
