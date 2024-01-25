import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
	public static int anInt4649;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
	public static boolean aBoolean379 = true;

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
	public static int method4144(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
	public static void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7;
		if (arg1 != Static7.anInt129) {
			Static164.anIntArray337 = new int[arg1];
			for (local7 = 0; local7 < arg1; local7++) {
				Static164.anIntArray337[local7] = (local7 << 12) / arg1;
			}
			Static193.anInt3689 = arg1 * 32;
			Static177.anInt3515 = arg1 - 1;
			Static7.anInt129 = arg1;
		}
		if (Static227.anInt4557 == arg0) {
			return;
		}
		if (Static7.anInt129 == arg0) {
			Static345.anIntArray627 = Static164.anIntArray337;
		} else {
			Static345.anIntArray627 = new int[arg0];
			for (local7 = 0; local7 < arg0; local7++) {
				Static345.anIntArray627[local7] = (local7 << 12) / arg0;
			}
		}
		Static227.anInt4557 = arg0;
		Static221.anInt4359 = arg0 - 1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4147(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(18) char[] local18 = new char[local15];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local20 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local20 == 2 || Character.isUpperCase(local28)) {
				local28 = Static35.method574(local28);
			}
			if (Character.isLetter(local28)) {
				local20 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local20 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local18[local22] = local28;
		}
		return new String(local18);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0) {
			Static236.aClass55_9 = Static66.method5183(Static102.aCanvas3, Static182.aClass139_5, Static44.anInt747 * 2, arg0, Static182.anInterface3_3);
		} else {
			if (arg1) {
				Static236.aClass55_9 = Static66.method5183(Static102.aCanvas3, Static182.aClass139_5, 0, 0, Static182.anInterface3_3);
				Static236.aClass55_9.method5226(0);
				@Pc(35) Class36 local35 = Static349.method5944(Static294.aClass93_133, Static276.anInt5762);
				@Pc(44) Class18 local44 = Static236.aClass55_9.method5180(local35, Static363.method2681(Static244.aClass93_93, Static276.anInt5762));
				Static86.method1557(true, local44, Static321.aClass85_134.method2020(Static41.anInt726));
				Static236.aClass55_9.method5159();
				Static1.method2();
				Static236.aClass55_9.method5168();
			}
			try {
				Static236.aClass55_9 = Static66.method5183(Static102.aCanvas3, Static182.aClass139_5, Static44.anInt747 * 2, arg0, Static182.anInterface3_3);
			} catch (@Pc(71) Throwable local71) {
				Static236.aClass55_9 = Static66.method5183(Static102.aCanvas3, Static182.aClass139_5, 0, 0, Static182.anInterface3_3);
				arg0 = 0;
			}
		}
		if (Static236.aClass55_9.method5228()) {
			@Pc(89) Class5_Sub23 local89 = Static236.aClass55_9.method5198();
			Static236.aClass55_9.method5227(local89);
		}
		Static342.anInt6605 = arg0;
		Static159.method2835();
		if (!Static236.aClass55_9.method5193()) {
			Static79.anInt1486 = 1;
		}
		Static236.aClass55_9.method5233(Static79.anInt1486);
		Static236.aClass55_9.method5255(0);
		Static303.aClass66_5 = Static236.aClass55_9.method5173();
		Static301.aClass66_4 = Static236.aClass55_9.method5173();
		@Pc(126) int local126 = (int) ((double) Static22.anInt481 * 34.46D);
		if (Static236.aClass55_9.method5187()) {
			local126 += 128;
		}
		Static236.aClass55_9.method5200(50, local126);
		Static236.aClass55_9.method5249(!Static352.aBoolean585);
		if (Static236.aClass55_9.method5188()) {
			Static32.method558(Static209.aBoolean344);
		}
		Static35.aBoolean43 = !Static288.method5007();
		Static64.method1605(Static269.anInt5281 >> 3, Static22.anInt481 >> 3, Static236.aClass55_9);
		Static200.method3522();
		Static157.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method4149(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static313.method5468(arg0);
	}
}
