import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public static int anInt521;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLclient!sf;II)V")
	public static void method445(@OriginalArg(2) Class24_Sub3_Sub2_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray610[0];
		@Pc(15) int local15 = arg0.anIntArray611[0];
		if (local10 < 0 || local10 >= Static2.anInt7 || local15 < 0 || local15 >= Static17.anInt315 || (arg2 < 0 || arg2 >= Static2.anInt7 || arg1 < 0 || arg1 >= Static17.anInt315)) {
			return;
		}
		@Pc(73) int local73 = Static78.method1496(local15, 0, Static11.aClass220Array1[arg0.aByte98], -4, 0, local10, 0, true, arg2, arg1, 0, Static319.anIntArray534, arg0.method4919(), Static268.anIntArray480);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local73 - 1; local87++) {
				arg0.method4928(Static268.anIntArray480[local87], Static319.anIntArray534[local87], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!wi;B)V")
	public static void method446(@OriginalArg(0) Class10_Sub45 arg0) {
		if (!Static35.aBoolean37) {
			arg0.method6033();
			Static207.anInt4055--;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ol;Lclient!ol;)V")
	public static void method447(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) Class10_Sub1 arg1) {
		if (arg0.aClass10_Sub1_57 != null) {
			arg0.method5897();
		}
		arg0.aClass10_Sub1_57 = arg1;
		arg0.aClass10_Sub1_56 = arg1.aClass10_Sub1_56;
		arg0.aClass10_Sub1_57.aClass10_Sub1_56 = arg0;
		arg0.aClass10_Sub1_56.aClass10_Sub1_57 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}
}
