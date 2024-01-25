import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
	public static final int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
	public static boolean method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static45.aBoolean34) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static188.aClass93ArrayArray4[local18] == null || Static188.aClass93ArrayArray4[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class93 local40 = Static188.aClass93ArrayArray4[local18][local22];
		@Pc(54) Class2_Sub35 local54;
		if (arg0 == -1 && local40.anInt2494 == 0) {
			for (local54 = (Class2_Sub35) Static93.aClass181_7.method3972(); local54 != null; local54 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
				if (local54.anInt5875 == 13 || local54.anInt5875 == 1012 || local54.anInt5875 == 5 || local54.anInt5875 == 59 || local54.anInt5875 == 8) {
					for (@Pc(132) Class93 local132 = Static160.method2380(local54.anInt5881); local132 != null; local132 = Static345.method4859(local132)) {
						if (local40.anInt2508 == local132.anInt2508) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class2_Sub35) Static93.aClass181_7.method3972(); local54 != null; local54 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
				if (arg0 == local54.anInt5877 && local40.anInt2508 == local54.anInt5881 && (local54.anInt5875 == 13 || local54.anInt5875 == 1012 || local54.anInt5875 == 5 || local54.anInt5875 == 59 || local54.anInt5875 == 8)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)Z")
	public static boolean method775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static59.anIntArrayArrayArray16[arg0][arg1][arg2];
		if (local7 == -Static455.anInt7589) {
			return false;
		} else if (local7 == Static455.anInt7589) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static146.anInt2674;
			@Pc(26) int local26 = arg2 << Static146.anInt2674;
			if (Static238.method3232(local22 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg2), local26 + 1) && Static238.method3232(local22 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg2), local26 + 1) && Static238.method3232(local22 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg2 + 1), local26 + Static327.anInt5862 - 1) && Static238.method3232(local22 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg2 + 1), local26 + Static327.anInt5862 - 1) && Static238.method3232(local22 + Static417.anInt7156, Static241.aClass22Array3[arg0].ua(arg1, arg2), local26 + 1) && Static238.method3232(local22 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg2), local26 + Static417.anInt7156) && Static238.method3232(local22 + Static417.anInt7156, Static241.aClass22Array3[arg0].ua(arg1, arg2 + 1), local26 + Static327.anInt5862 - 1) && Static238.method3232(local22 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1, arg2), local26 + Static417.anInt7156) && Static238.method3232(local22 + Static417.anInt7156, Static241.aClass22Array3[arg0].ua(arg1, arg2), local26 + Static417.anInt7156)) {
				Static59.anIntArrayArrayArray16[arg0][arg1][arg2] = Static455.anInt7589;
				return true;
			} else {
				Static59.anIntArrayArrayArray16[arg0][arg1][arg2] = -Static455.anInt7589;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJ)V")
	public static void method779(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static188.anInt6693;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static82.anInt3899) {
			local19 = local7 - Static82.anInt3899;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static82.anInt3899 += local27;
		}
		@Pc(69) int local69 = Static235.anInt3979;
		if (local69 != Static184.anInt3246) {
			local19 = local69 - Static184.anInt3246;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static184.anInt3246 += local27;
		}
		if (!Static434.aClass165_Sub1_1.aBoolean290) {
			Static234.aFloat30 += (float) arg0 * Static104.aFloat13 / 40.0F * 8.0F;
			Static37.aFloat9 += (float) arg0 * Static417.aFloat93 / 40.0F * 8.0F;
		}
		Static193.method2765();
	}
}
