import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	public static int anInt5465 = 10;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "[S")
	public static final short[] aShortArray97 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIII)V")
	public static void method4281(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static93.anInt1676 = arg1;
		Static289.anInt5053 = 0;
		Static434.anInt7302 = arg0;
		Static427.anInt7214 = 0;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	public static void method4282() {
		@Pc(10) int local10 = Static453.aClass136_Sub1_1.method3520(Static14.anInt293);
		if (local10 == 0) {
			Static41.aByteArrayArrayArray4 = null;
			Static367.method4880(0);
		} else if (local10 == 1) {
			Static221.method3237((byte) 0);
			Static367.method4880(512);
			if (Static147.aByteArrayArrayArray22 != null) {
				Static256.method3675();
			}
		} else {
			Static221.method3237((byte) (Static49.anInt840 - 4 & 0xFF));
			Static367.method4880(2);
		}
		Static216.anInt3861 = Static265.anInt4807;
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
	public static void method4283() {
		Static25.aClass102_4.method2271();
	}
}
