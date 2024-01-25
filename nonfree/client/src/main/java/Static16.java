import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_9 = new Class220(13, 0, 1, 0);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)Z")
	public static boolean method268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static210.method2798(arg1, arg0) | Static320.method3942(arg0, arg1) | Static162.method2296(arg1, arg0)) & Static53.method829(arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg4 < 1 || Static433.anInt7210 - 2 < arg7 || arg4 > Static418.anInt6969 - 2) {
			return;
		}
		@Pc(33) int local33 = arg2;
		if (arg2 < 3 && Static118.method1679(arg4, arg7)) {
			local33 = arg2 + 1;
		}
		if (!Static216.aClass1_Sub1_1.method3587(Static146.anInt2644) && !Static364.method4712(local33, arg7, arg4, Static123.anInt2187)) {
			return;
		}
		if (Static319.aClass258ArrayArrayArray3 == null) {
			return;
		}
		Static427.aClass113_Sub1_2.method2977(arg6, Static407.aClass200_9, Static163.aClass240Array1[arg2], arg2, arg7, arg4);
		if (arg1 < 0) {
			return;
		}
		@Pc(74) boolean local74 = Static216.aClass1_Sub1_1.aBoolean300;
		Static216.aClass1_Sub1_1.aBoolean300 = true;
		Static427.aClass113_Sub1_2.method2979(arg3, local33, arg7, arg5, arg1, Static163.aClass240Array1[arg2], arg0, arg4, Static407.aClass200_9, arg2);
		Static216.aClass1_Sub1_1.aBoolean300 = local74;
		return;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
	public static void method273(@OriginalArg(0) int arg0) {
		Static136.anInt7478 = arg0;
		@Pc(7) Class44 local7 = Static74.aClass44_9;
		synchronized (Static74.aClass44_9) {
			Static74.aClass44_9.method1031();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
	public static void method275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static106.method5682(true, local35, false);
	}
}
