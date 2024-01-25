import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "Lclient!sj;")
	public static Class185 aClass185_1;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public static int anInt3109 = 0;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!jf;I)Ljava/lang/String;")
	public static String method2896(@OriginalArg(0) Class96 arg0) {
		if (Static43.method975(arg0).method1140() == 0) {
			return null;
		} else if (arg0.aString188 == null || arg0.aString188.trim().length() == 0) {
			return Static213.aBoolean311 ? "Hidden-use" : null;
		} else {
			return arg0.aString188;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)Z")
	public static boolean method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface8 local11 = (Interface8) Static178.method3304(arg0, arg1, arg2);
		if (local11 != null) {
			local5 = Static32.method796(local11) & true;
		}
		local11 = (Interface8) Static82.method1816(arg0, arg1, arg2, sl.class);
		if (local11 != null) {
			local5 &= Static32.method796(local11);
		}
		local11 = (Interface8) Static251.method4403(arg0, arg1, arg2);
		if (local11 != null) {
			local5 &= Static32.method796(local11);
		}
		return local5;
	}
}
