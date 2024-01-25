import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
	public static int anInt4087;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[Lclient!hga;")
	public static final Class141[] aClass141Array1 = new Class141[37];

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)V")
	public static void method3722(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(2, (long) arg0);
		local9.method2489();
	}
}
