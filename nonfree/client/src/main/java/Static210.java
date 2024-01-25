import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[Lclient!us;")
	public static Class250[] aClass250Array1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method2810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static404.method5118(arg1, arg0) | (arg1 & 0x70000) != 0 || Static255.method3255(arg1, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!sv;)Lclient!si;")
	public static Class57_Sub4 method2811(@OriginalArg(1) Class2_Sub13 arg0) {
		return new Class57_Sub4(arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3558(), arg0.method3563(), arg0.method3563(), arg0.method3580());
	}
}
