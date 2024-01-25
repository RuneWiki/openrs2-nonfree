import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!il", name = "K", descriptor = "Lclient!ui;")
	public static Class230 aClass230_44;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_69 = new Class211(79, 1);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2347(@OriginalArg(1) String arg0) {
		return Static358.method4963(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
	public static void method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class161 local14 = Static364.aClass161ArrayArray3[arg2][arg0];
		Static37.method566(arg1, local14 == null ? Static121.aClass161_1 : local14);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)Lclient!so;")
	public static Class124_Sub1 method2351() {
		Static32.anInt650 = 0;
		return Static232.method617();
	}
}
