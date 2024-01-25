import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public static int anInt6529;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_221 = new Class123(67, 0);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BILclient!pca;)I")
	public static int method5256(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1) {
		if (!Static70.method1716(arg1).method3244(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray412 == null || arg0 >= arg1.anIntArray412.length) {
			return -1;
		} else {
			return arg1.anIntArray412[arg0];
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLclient!ko;)I")
	public static int method5258(@OriginalArg(1) Class179 arg0) {
		if (arg0 == Static402.aClass179_23) {
			return 5890;
		} else if (arg0 == Static138.aClass179_11) {
			return 34167;
		} else if (arg0 == Static415.aClass179_24) {
			return 34168;
		} else if (arg0 == Static438.aClass179_14) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
