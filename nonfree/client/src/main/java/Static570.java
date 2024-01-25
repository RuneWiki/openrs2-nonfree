import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "[I")
	public static int[] anIntArray636;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Z")
	public static boolean aBoolean690 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIII)I")
	public static int method7806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)Z")
	public static boolean method7807(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static192.aClass95_4.method6951();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static192.aClass95_4.method7011();
		} else if (!Static192.aClass95_4.method6946()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static234.aClass2_Sub5_48.method176(arg0 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub8_1);
			Static329.method4407();
			return true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z")
	public static boolean method7808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static4.method97(arg0, arg1) || Static147.method2209(arg1, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public static void method7809(@OriginalArg(0) int arg0) {
		if (!Static221.method3025(arg0)) {
			return;
		}
		@Pc(18) Class261[] local18 = Static559.aClass261ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class261 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt6636 = 1;
				local26.anInt6581 = 0;
				local26.anInt6597 = 0;
			}
		}
	}
}
