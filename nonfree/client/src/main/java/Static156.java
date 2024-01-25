import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array47;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!ae;)V")
	public static void method2211(@OriginalArg(1) Class8 arg0) {
		Static270.anInt4693 = arg0.method252("p11_full");
		Static332.anInt7616 = arg0.method252("p12_full");
		Static568.anInt9424 = arg0.method252("b12_full");
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBIZ)I")
	public static int method2212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub6 local8 = Static249.method3626(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray55.length) {
			return local8.anIntArray55[arg0];
		} else {
			return -1;
		}
	}
}
