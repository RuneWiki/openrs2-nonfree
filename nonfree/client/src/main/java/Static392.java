import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!od", name = "y", descriptor = "F")
	public static float aFloat164;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "I")
	public static int anInt7542;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_78 = new Class94(0, 0);

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public static final int anInt7538 = 1337;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZIBIII)V")
	public static void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223() != 0 && arg3 != 0 && Static395.anInt7569 < 50 && arg0 != -1) {
			Static443.aClass125Array1[Static395.anInt7569++] = new Class125((byte) 2, arg0, arg3, arg5, arg1, arg2, arg4, null);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public static void method6460() {
		Static634.method9194(Static186.aClass20_4, (long) Static407.anInt7704);
		if (Static475.anInt10143 != -1) {
			Static6.method166(Static475.anInt10143);
		}
		for (@Pc(23) int local23 = 0; local23 < Static511.anInt9364; local23++) {
			if (Static403.aBooleanArray18[local23]) {
				Static60.aBooleanArray9[local23] = true;
			}
			Static437.aBooleanArray20[local23] = Static403.aBooleanArray18[local23];
			Static403.aBooleanArray18[local23] = false;
		}
		Static267.anInt5681 = Static407.anInt7704;
		if (Static475.anInt10143 != -1) {
			Static511.anInt9364 = 0;
			Static323.method5594();
		}
		Static186.aClass20_4.la();
		Static270.method4966(Static186.aClass20_4);
		@Pc(68) int local68 = Static4.method112();
		if (local68 == -1) {
			local68 = Static151.anInt3895;
		}
		if (local68 == -1) {
			local68 = Static338.anInt6830;
		}
		Static231.method4405(local68);
		Static99.anInt2781 = 0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)I")
	public static int method6461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static476.aByteArrayArrayArray5[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static476.aByteArrayArrayArray5[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(CII)C")
	public static char method6464(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BILclient!in;)Lclient!oea;")
	public static Class239 method6465(@OriginalArg(1) int arg0, @OriginalArg(2) Class157 arg1) {
		@Pc(13) byte[] local13 = arg1.method4569(arg0);
		return local13 == null ? null : new Class239(local13);
	}
}
