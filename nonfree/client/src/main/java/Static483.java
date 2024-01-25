import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!sm", name = "Y", descriptor = "[I")
	public static final int[] anIntArray480 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void method7218(@OriginalArg(1) int arg0) {
		if (!Static214.aClass4_Sub19_Sub1_1.aBoolean259) {
			arg0 = -1;
		}
		if (arg0 == Static335.anInt6451) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class26 local21 = Static222.aClass243_2.method5945(arg0);
			@Pc(25) Class261 local25 = local21.method367();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static406.aClass354_5.method8230(Static475.aCanvas12, local25.method6320(), local25.method6313(), local25.method6321(), new Point(local21.anInt425, local21.anInt423));
				Static335.anInt6451 = arg0;
			}
		}
		if (arg0 == -1 && Static335.anInt6451 != -1) {
			Static406.aClass354_5.method8230(Static475.aCanvas12, -1, -1, null, new Point());
			Static335.anInt6451 = -1;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)B")
	public static byte method7220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
