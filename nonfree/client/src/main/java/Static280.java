import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jw", name = "z", descriptor = "Lclient!wu;")
	public static Class380 aClass380_67;

	@OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
	public static int anInt4506;

	@OriginalMember(owner = "client!jw", name = "H", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!s;)V")
	public static void method3894(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1) {
		Static314.aClass76Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IB)V")
	public static void method3895(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub2_Sub4 local14 = Static566.method7763(arg0, 1);
		local14.method669();
	}
}
