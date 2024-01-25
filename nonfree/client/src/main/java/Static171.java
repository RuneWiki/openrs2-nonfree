import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "[Lclient!qf;")
	public static final Class293[] aClass293Array1 = new Class293[16];

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "[Lclient!nn;")
	public static final Class252[] aClass252Array1 = new Class252[8];

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIB)I")
	public static int method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static263.anIntArray120[arg1 & 0x3] : Static125.anIntArray134[arg1 & 0x3];
	}
}
