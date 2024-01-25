import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!ik;")
	public static Class182 aClass182_36;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_22 = new Class144(62, 3);

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public static int anInt2611 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public static void method2384(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static478.aBooleanArray12[arg0]) {
			Static567.aClass182_109.method3968(arg0);
			Static172.aClass270ArrayArray2[arg0] = null;
			Static158.aClass270ArrayArray1[arg0] = null;
			Static478.aBooleanArray12[arg0] = false;
		}
	}
}
