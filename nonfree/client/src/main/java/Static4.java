import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public static int anInt75;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString3 = "flash3:";

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static int anInt77 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!bi;ZBII)V")
	public static void method60(@OriginalArg(0) Class26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg0.anInt523;
		if (arg0.aByte12 == 0) {
			arg0.anInt523 = arg0.anInt483;
		} else if (arg0.aByte12 == 1) {
			arg0.anInt523 = arg2 - arg0.anInt483;
		} else if (arg0.aByte12 == 2) {
			arg0.anInt523 = arg2 * arg0.anInt483 >> 14;
		} else if (arg0.aByte12 == 3) {
			if (arg0.anInt520 == 2) {
				arg0.anInt523 = arg0.anInt483 * 32 + arg0.anInt534 * (arg0.anInt483 - 1);
			} else if (arg0.anInt520 == 7) {
				arg0.anInt523 = arg0.anInt534 * (arg0.anInt483 - 1) + arg0.anInt483 * 115;
			}
		}
		@Pc(99) int local99 = arg0.anInt515;
		if (arg0.aByte9 == 0) {
			arg0.anInt515 = arg0.anInt518;
		} else if (arg0.aByte9 == 1) {
			arg0.anInt515 = arg3 - arg0.anInt518;
		} else if (arg0.aByte9 == 2) {
			arg0.anInt515 = arg3 * arg0.anInt518 >> 14;
		} else if (arg0.aByte9 == 3) {
			if (arg0.anInt520 == 2) {
				arg0.anInt515 = arg0.anInt518 * 32 + arg0.anInt491 * (arg0.anInt518 - 1);
			} else if (arg0.anInt520 == 7) {
				arg0.anInt515 = arg0.anInt518 * 12 + arg0.anInt491 * (arg0.anInt518 - 1);
			}
		}
		if (arg0.aByte12 == 4) {
			arg0.anInt523 = arg0.anInt515 * arg0.anInt569 / arg0.anInt489;
		}
		if (arg0.aByte9 == 4) {
			arg0.anInt515 = arg0.anInt523 * arg0.anInt489 / arg0.anInt569;
		}
		if (Static105.aBoolean439 && (Static45.method1034(arg0).anInt4221 != 0 || arg0.anInt520 == 0)) {
			if (arg0.anInt515 < 5 && arg0.anInt523 < 5) {
				arg0.anInt523 = 5;
				arg0.anInt515 = 5;
			} else {
				if (arg0.anInt515 <= 0) {
					arg0.anInt515 = 5;
				}
				if (arg0.anInt523 <= 0) {
					arg0.anInt523 = 5;
				}
			}
		}
		if (arg0.anInt557 == 1337) {
			Static197.aClass26_21 = arg0;
		}
		if (arg1 && arg0.anObjectArray31 != null && (arg0.anInt523 != local10 || arg0.anInt515 != local99)) {
			@Pc(292) Class7_Sub25 local292 = new Class7_Sub25();
			local292.aClass26_22 = arg0;
			local292.anObjectArray34 = arg0.anObjectArray31;
			Static247.aClass74_34.method1802(local292);
		}
	}
}
