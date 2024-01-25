import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public static void method7515(@OriginalArg(0) int arg0) {
		if (arg0 == Static516.anInt8250) {
			return;
		}
		Static281.anInt4822 = Static29.anInt491 = Static264.anIntArray312[arg0];
		Static221.method2688();
		Static55.anIntArrayArrayArray1 = new int[4][Static281.anInt4822 >> 3][Static29.anInt491 >> 3];
		Static29.anIntArrayArray4 = new int[Static281.anInt4822][Static29.anInt491];
		Static471.anIntArrayArray50 = new int[Static281.anInt4822][Static29.anInt491];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static87.aClass362Array3[local40] = Static101.method1524(Static281.anInt4822, Static29.anInt491);
		}
		Class2_Sub35_Sub1.lb = new byte[4][Static281.anInt4822][Static29.anInt491];
		Static144.method1991(Static29.anInt491, Static281.anInt4822);
		Static301.method4357(Static281.anInt4822 >> 3, Static29.anInt491 >> 3, Static417.aClass162_17);
		Static516.anInt8250 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!vea;IIILclient!tca;IBIII)V")
	public static void method7516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class322 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static222.anInt3249 = arg9;
		Static130.anInt2130 = arg7;
		Static471.aClass344_5 = null;
		Static194.aClass344_1 = null;
		Static502.anInt8004 = arg10;
		Static442.anInt7095 = arg4;
		Static526.anInt9652 = arg5;
		Static591.anInt9579 = arg8;
		Static258.aClass322_4 = arg6;
		Static372.anInt6232 = arg3;
		Static184.anInt2740 = arg1;
		Static99.aClass347_2 = arg2;
		Static541.aClass344_4 = null;
		Static407.anInt6675 = arg0;
		Static14.method247();
		Static582.aBoolean788 = true;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(Z)Ljava/lang/String;")
	public static String method7517() {
		@Pc(7) String local7 = "www";
		if (Static416.aClass232_7 == Static225.aClass232_9) {
			local7 = "www-wtrc";
		} else if (Static416.aClass232_7 == Static580.aClass232_20) {
			local7 = "www-wtqa";
		} else if (Static295.aClass232_12 == Static416.aClass232_7) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static523.aString125 != null) {
			local28 = "/p=" + Static523.aString125;
		}
		return "http://" + local7 + "." + Static18.aClass308_7.aString119 + ".com/l=" + Static261.anInt4297 + "/a=" + Static516.anInt8248 + local28 + "/";
	}
}
