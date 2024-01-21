import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ga;")
	public static Class29 aClass29_6;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 aClass6_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Lclient!rd;")
	private static Class63 aClass63_606 = Static80.method1463("From");

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_607 = Static80.method1463(",Zffentlicher Chat");

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!rd;")
	private static Class63 aClass63_612 = Static80.method1463(" ");

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!rd;")
	public static Class63 aClass63_608 = aClass63_612;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_609 = Static80.method1463("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_610 = Static80.method1463("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_611 = Static80.method1463(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_613 = null;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_614 = aClass63_606;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!ge;)V")
	public static void method839(@OriginalArg(1) Class7 arg0) {
		Static47.aClass7_27 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ge;III)[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] method840(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static76.method1433(arg1, arg0, arg2) ? Static120.method2149() : null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method841() {
		aClass63_610 = null;
		aClass63_613 = null;
		aClass63_606 = null;
		aClass6_Sub3_Sub3_Sub1_1 = null;
		aClass63_611 = null;
		aClass29_6 = null;
		aClass63_614 = null;
		aClass63_609 = null;
		aClass63_608 = null;
		aClass63_607 = null;
		aClass63_612 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILclient!bf;IIB)V")
	public static void method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local28 = arg4.method1321();
				if (local28 == 0) {
					break;
				}
				if (local28 == 1) {
					arg4.method1321();
					break;
				}
				if (local28 <= 49) {
					arg4.method1321();
				}
			}
			return;
		}
		Static103.aByteArrayArrayArray92[arg2][arg0][arg1] = 0;
		while (true) {
			local28 = arg4.method1321();
			if (local28 == 0) {
				if (arg2 == 0) {
					Static11.anIntArrayArrayArray6[0][arg0][arg1] = -Static60.method1173(arg5 + arg1 + 556238, arg3 + arg0 + 932731) * 8;
				} else {
					Static11.anIntArrayArrayArray6[arg2][arg0][arg1] = Static11.anIntArrayArrayArray6[arg2 - 1][arg0][arg1] - 240;
				}
				break;
			}
			if (local28 == 1) {
				@Pc(86) int local86 = arg4.method1321();
				if (local86 == 1) {
					local86 = 0;
				}
				if (arg2 == 0) {
					Static11.anIntArrayArrayArray6[0][arg0][arg1] = -local86 * 8;
				} else {
					Static11.anIntArrayArrayArray6[arg2][arg0][arg1] = Static11.anIntArrayArrayArray6[arg2 - 1][arg0][arg1] - local86 * 8;
				}
				break;
			}
			if (local28 <= 49) {
				Static66.aByteArrayArrayArray91[arg2][arg0][arg1] = arg4.method1297();
				Static60.aByteArrayArrayArray51[arg2][arg0][arg1] = (byte) ((local28 - 2) / 4);
				Static79.aByteArrayArrayArray59[arg2][arg0][arg1] = (byte) (arg6 + local28 - 2 & 0x3);
			} else if (local28 <= 81) {
				Static103.aByteArrayArrayArray92[arg2][arg0][arg1] = (byte) (local28 - 49);
			} else {
				Static44.aByteArrayArrayArray38[arg2][arg0][arg1] = (byte) (local28 - 81);
			}
		}
	}
}
