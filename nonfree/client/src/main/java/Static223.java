import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
	public static final int[] anIntArray344 = new int[1000];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method3982() {
		Static309.aClass11_Sub10_Sub4_3.method4092();
		Static329.anInt6323 = 1;
		Static177.aClass144_46 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)Z")
	public static boolean method3983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static1.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method3985(@OriginalArg(1) int arg0) {
		if (Static164.anIntArray206 == null || arg0 > Static164.anIntArray206.length) {
			Static164.anIntArray206 = new int[arg0];
		}
	}
}
