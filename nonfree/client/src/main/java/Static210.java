import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!g;")
	public static Class83 aClass83_127;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[Lclient!mi;")
	public static Class149[] aClass149Array5;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!wd;")
	public static final Class235 aClass235_3 = Static301.method4920();

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_106 = new Class183(32, 1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!v;Lclient!v;)V")
	public static void method5843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub5 arg3, @OriginalArg(4) Class1_Sub5 arg4) {
		@Pc(4) Class188 local4 = Static226.method4116(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub5_2 = arg3;
			local4.aClass1_Sub5_1 = arg4;
		}
	}
}
