import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "[[[Lclient!k;")
	public static Class4_Sub21[][][] aClass4_Sub21ArrayArrayArray3;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt2994 = 0;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString102 = "flash3:";

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIC)C")
	public static char method2415(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)V")
	public static void method2417(@OriginalArg(0) int arg0) {
		Static230.anInt4619 = -1;
		Static230.anInt4619 = -1;
		if (arg0 == 37) {
			Static5.aFloat4 = 3.0F;
		} else if (arg0 == 50) {
			Static5.aFloat4 = 4.0F;
		} else if (arg0 == 75) {
			Static5.aFloat4 = 6.0F;
		} else if (arg0 == 100) {
			Static5.aFloat4 = 8.0F;
		} else if (arg0 == 200) {
			Static5.aFloat4 = 16.0F;
		}
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "(II)I")
	public static int method2418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	public static void method2419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static284.method4439(false);
		Static148.anInt2908 = arg1;
		Static273.anInt5430 = arg2;
		Static190.method3152(arg0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IB)Lclient!l;")
	public static Class4_Sub2_Sub13 method2421(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub2_Sub13 local18 = (Class4_Sub2_Sub13) Static147.aClass111_9.method2890((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static245.aClass22_83.method665(5, arg0);
		local18 = new Class4_Sub2_Sub13();
		if (local30 != null) {
			local18.method2394(new Class4_Sub24(local30));
		}
		Static147.aClass111_9.method2886((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public static void method2422() {
		Static158.aClass172_27.method4346();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg0 >= Static173.anInt3481 && Static121.anInt2460 >= arg0 + arg3 && arg5 - arg0 >= Static293.anInt5688 && arg0 + arg5 <= Static100.anInt1982) {
			Static152.method2441(arg2, arg4, arg5, arg3, arg1, arg0);
		} else {
			Static257.method4004(arg5, arg2, arg1, arg3, arg0, arg4);
		}
	}
}
