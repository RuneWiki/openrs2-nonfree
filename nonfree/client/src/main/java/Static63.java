import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "[S")
	public static final short[] aShortArray37 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[I")
	public static final int[] anIntArray110 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
	public static boolean method1151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method1155() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static244.aClass8Array1[local7] = null;
		}
		Static185.anInt3399 = 0;
	}
}
