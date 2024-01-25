import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_64 = new Class200(105, -1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public static void method4014(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static44.aBooleanArray5[arg0]) {
			Static583.aClass196_121.method5116(arg0);
			Static92.aClass279ArrayArray1[arg0] = null;
			Static158.aClass279ArrayArray2[arg0] = null;
			Static44.aBooleanArray5[arg0] = false;
		}
	}
}
