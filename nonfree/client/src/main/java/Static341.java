import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!cn;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	public static int anInt5833;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!tl;")
	public static Class225 aClass225_1;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int anInt5819 = 0;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_90 = new Class32("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public static int anInt5824 = 0;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "[I")
	public static final int[] anIntArray1177 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
	public static boolean method5002(@OriginalArg(1) int arg0) {
		@Pc(9) Class138_Sub1 local9 = Static47.method804(arg0);
		if (local9 == null) {
			return false;
		} else if (Static152.anInt2983 == 3) {
			@Pc(41) String local41 = "";
			if (Static17.aClass117_1 != Static141.aClass117_7) {
				local41 = ":" + (local9.anInt3885 + 7000);
			}
			@Pc(57) String local57 = "";
			if (Static9.aString6 != null) {
				local57 = "/p=" + Static9.aString6;
			}
			@Pc(106) String local106 = "http://" + local9.aString45 + local41 + "/l=" + Static107.anInt2498 + "/a=" + Static16.anInt383 + local57 + "/j" + (Static217.aBoolean297 ? "1" : "0") + ",o" + (Static130.aBoolean205 ? "1" : "0") + ",a2";
			try {
				Static387.aClient1.getAppletContext().showDocument(new URL(local106), "_self");
				return true;
			} catch (@Pc(116) Exception local116) {
				return false;
			}
		} else {
			Static61.aString15 = local9.aString45;
			Static347.anInt5864 = local9.anInt3885;
			if (Static141.aClass117_7 != Static17.aClass117_1) {
				Static41.anInt831 = Static347.anInt5864 + 50000;
				Static255.anInt4505 = Static347.anInt5864 + 40000;
				Static167.anInt5329 = Static255.anInt4505;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!vc;IIILclient!oj;Lclient!ae;III)V")
	public static void method5003(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class165 arg4, @OriginalArg(5) Class4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(14) Class243 local14 = Static158.aClass226_1.method4913(arg7);
		if (local14 == null || !local14.aBoolean454 || !local14.method5525(Static321.aClass211_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray1317 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray1317.length];
			@Pc(46) int local46;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static79.anInt4624 == 4) {
					local46 = (int) Static127.aFloat41 & 0x3FFF;
				} else {
					local46 = Static190.anInt3567 + (int) Static127.aFloat41 & 0x3FFF;
				}
				@Pc(57) int local57 = Class177.anIntArray843[local46];
				@Pc(61) int local61 = Class177.anIntArray844[local46];
				if (Static79.anInt4624 != 4) {
					local61 = local61 * 256 / (Static30.anInt643 + 256);
					local57 = local57 * 256 / (Static30.anInt643 + 256);
				}
				local32[local34 * 2] = arg2 + arg5.anInt101 / 2 + (local57 * (local14.anIntArray1317[local34 * 2 + 1] * 4 + arg3) + local61 * (local14.anIntArray1317[local34 * 2] * 4 + arg1) >> 15);
				local32[local34 * 2 + 1] = arg6 + arg5.anInt113 / 2 - (local61 * (arg3 + local14.anIntArray1317[local34 * 2 + 1] * 4) - (arg1 + local14.anIntArray1317[local34 * 2] * 4) * local57 >> 15);
			}
			Static134.method2631(arg0, local32, local14.anInt6362, arg5.anIntArray41, arg5.anIntArray35);
			for (local46 = 0; local46 < local32.length / 2 - 1; local46++) {
				arg0.method1964(local32[local46 * 2], local32[local46 * 2 + 1], local32[local46 * 2 + 2], local32[local46 * 2 + 2 + 1], local14.anInt6348, arg4, arg2, arg6);
			}
			arg0.method1964(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt6348, arg4, arg2, arg6);
		}
		@Pc(263) Class18 local263 = null;
		if (local14.anInt6344 != -1) {
			local263 = local14.method5519(false, arg0);
			if (local263 != null) {
				Static35.method636(arg1, arg4, arg6, local263, arg3, arg2, arg5);
			}
		}
		if (local14.aString64 == null) {
			return;
		}
		local34 = 0;
		if (local263 != null) {
			local34 = local263.method4571();
		}
		@Pc(296) Class9 local296 = Static156.aClass9_1;
		@Pc(298) Class136 local298 = Static374.aClass136_9;
		if (local14.anInt6369 == 1) {
			local298 = Static302.aClass136_4;
			local296 = Static319.aClass9_3;
		}
		if (local14.anInt6369 == 2) {
			local296 = Static340.aClass9_4;
			local298 = Static238.aClass136_7;
		}
		Static100.method1948(local296, arg5, local34, local298, arg3, arg1, arg4, arg2, arg6, local14.anInt6373, local14.aString64);
		return;
	}
}
