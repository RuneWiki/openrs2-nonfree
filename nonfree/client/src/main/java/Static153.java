import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
	public static int anInt2441;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIB)Z")
	public static boolean method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static20.method462(arg0, arg1) & Static75.method1234(arg1, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLclient!fa;)V")
	public static void method2233(@OriginalArg(1) Class5_Sub4_Sub6 arg0) {
		@Pc(15) boolean local15 = false;
		arg0.method8741();
		for (@Pc(23) Class5_Sub4_Sub6 local23 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local23 != null; local23 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
			if (Static509.method7369(arg0.method2113(), local23.method2113())) {
				local15 = true;
				Static164.method5099(local23, arg0);
				break;
			}
		}
		if (!local15) {
			Static616.aClass80_12.method1537(arg0);
		}
	}
}
