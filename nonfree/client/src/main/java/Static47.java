import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "[I")
	public static final int[] anIntArray42 = new int[5];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z")
	public static boolean method776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)B")
	public static byte method777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIILclient!sj;I)V")
	public static void method779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub3_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray434[0];
		@Pc(15) int local15 = arg2.anIntArray433[0];
		if (local10 < 0 || local10 >= Static433.anInt7210 || local15 < 0 || local15 >= Static418.anInt6969 || (arg1 < 0 || arg1 >= Static433.anInt7210 || arg0 < 0 || arg0 >= Static418.anInt6969)) {
			return;
		}
		@Pc(74) int local74 = Static351.method4563(-4, local15, arg1, arg0, Static41.anIntArray36, local10, 0, 0, true, 0, 0, Static163.aClass240Array1[arg2.aByte105], Static433.anIntArray487, arg2.method4913());
		if (local74 >= 1 && local74 <= 3) {
			for (@Pc(93) int local93 = 0; local93 < local74 - 1; local93++) {
				arg2.method4925(Static433.anIntArray487[local93], (byte) 2, Static41.anIntArray36[local93]);
			}
		}
	}
}
