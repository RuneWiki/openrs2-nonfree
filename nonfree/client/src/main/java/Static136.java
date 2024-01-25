import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
	public static final int[] anIntArray183 = new int[500];

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public static void method1875(@OriginalArg(0) int arg0) {
		if (!Static453.method5906(arg0)) {
			return;
		}
		@Pc(14) Class273[] local14 = Static509.aClass273ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class273 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt6811 = 0;
				local22.anInt6802 = 0;
				local22.anInt6833 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I")
	public static int method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1878() {
		@Pc(7) Class220[] local7 = Class352.aClass220Array1;
		synchronized (Class352.aClass220Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class352.aClass220Array1.length; local11++) {
				Class352.aClass220Array1[local11] = new Class220();
				Static563.anIntArray598[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1879() {
		Static484.anInt7715 = 0;
		Static411.aClass70_43.method1265();
		Static572.aBoolean774 = false;
	}
}
