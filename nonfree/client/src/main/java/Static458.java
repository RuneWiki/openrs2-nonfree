import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
	public static int anInt6588;

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "Lclient!br;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "[[[Lclient!ev;")
	public static Class75[][][] aClass75ArrayArrayArray5;

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_121 = new Class15("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(BILclient!pc;Ljava/awt/Canvas;ILclient!ga;)Lclient!ya;")
	public static synchronized Class135 method5338(@OriginalArg(1) int arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface5 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static116.aBooleanArray10[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(50) Class135 local50;
		if (arg3 == 0) {
			local50 = Static370.method4893(arg4, local7, arg2);
		} else if (arg3 == 1) {
			local50 = Static176.method2474(arg4, arg2, arg0, arg1, local7);
		} else if (arg3 == 2) {
			local50 = Static110.method1632(arg1, arg4, local7, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static116.aBooleanArray10[local7] = true;
		return local50;
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(B)V")
	public static void method5366() {
		for (@Pc(8) Class20_Sub3 local8 = (Class20_Sub3) Static73.aClass248_3.method5583(); local8 != null; local8 = (Class20_Sub3) Static73.aClass248_3.method5577()) {
			local8.method2126();
		}
	}

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
	public static void method5376() {
		Static240.aBoolean300 = true;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZ)V")
	public static void method5401() {
		Static448.method5935(Static29.aClass146_9);
		for (@Pc(17) Class4_Sub8 local17 = (Class4_Sub8) Static449.aClass67_37.method1428(); local17 != null; local17 = (Class4_Sub8) Static449.aClass67_37.method1424()) {
			if (!local17.method6060()) {
				local17 = (Class4_Sub8) Static449.aClass67_37.method1428();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt859 == 0) {
				Static242.method3223(local17, true, true);
			}
		}
		if (Static246.aClass110_11 != null) {
			Static118.method1693(Static246.aClass110_11);
			Static246.aClass110_11 = null;
		}
	}
}
