import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!b;")
	public static Class20 aClass20_38;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(10, arg2);
		local13.method3219();
		local13.anInt3667 = arg3;
		local13.anInt3670 = arg0;
		local13.anInt3669 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	public static void method2120() {
		Static141.anImage1 = null;
		Static45.aFont1 = null;
	}
}
