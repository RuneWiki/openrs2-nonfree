import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static190 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
	public static final int[] anIntArray183 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "[I")
	public static final int[] anIntArray184 = new int[4096];

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[I")
	public static final int[] anIntArray185 = new int[6];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!raa;)V")
	public static void method2863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class295 arg2) {
		if (arg2.aByte116 == 0) {
			arg2.anInt7996 = arg2.anInt7945;
		} else if (arg2.aByte116 == 1) {
			arg2.anInt7996 = (arg0 - arg2.anInt7985) / 2 + arg2.anInt7945;
		} else if (arg2.aByte116 == 2) {
			arg2.anInt7996 = arg0 - arg2.anInt7985 - arg2.anInt7945;
		} else if (arg2.aByte116 == 3) {
			arg2.anInt7996 = arg2.anInt7945 * arg0 >> 14;
		} else if (arg2.aByte116 == 4) {
			arg2.anInt7996 = (arg0 * arg2.anInt7945 >> 14) + (arg0 - arg2.anInt7985) / 2;
		} else {
			arg2.anInt7996 = arg0 - arg2.anInt7985 - (arg2.anInt7945 * arg0 >> 14);
		}
		if (arg2.aByte119 == 0) {
			arg2.anInt8030 = arg2.anInt7962;
		} else if (arg2.aByte119 == 1) {
			arg2.anInt8030 = arg2.anInt7962 + (arg1 - arg2.anInt7957) / 2;
		} else if (arg2.aByte119 == 2) {
			arg2.anInt8030 = arg1 - arg2.anInt7957 - arg2.anInt7962;
		} else if (arg2.aByte119 == 3) {
			arg2.anInt8030 = arg1 * arg2.anInt7962 >> 14;
		} else if (arg2.aByte119 == 4) {
			arg2.anInt8030 = (arg1 - arg2.anInt7957) / 2 + (arg2.anInt7962 * arg1 >> 14);
		} else {
			arg2.anInt8030 = arg1 - (arg1 * arg2.anInt7962 >> 14) - arg2.anInt7957;
		}
		if (!Static132.aBoolean513 || Static75.method1286(arg2).anInt7590 == 0 && arg2.anInt8001 != 0) {
			return;
		}
		if (arg2.anInt7996 < 0) {
			arg2.anInt7996 = 0;
		} else if (arg2.anInt7985 + arg2.anInt7996 > arg0) {
			arg2.anInt7996 = arg0 - arg2.anInt7985;
		}
		if (arg2.anInt8030 < 0) {
			arg2.anInt8030 = 0;
		} else if (arg1 < arg2.anInt8030 + arg2.anInt7957) {
			arg2.anInt8030 = arg1 - arg2.anInt7957;
			return;
		}
	}
}
