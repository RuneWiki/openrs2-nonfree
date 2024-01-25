import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public static int anInt1150 = -2;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIC)C")
	public static char method918(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method919() {
		@Pc(7) Class113 local7 = null;
		try {
			@Pc(11) Class2 local11 = Static77.aClass118_7.method2693();
			while (local11.anInt6 == 0) {
				Static244.method4311(1L);
			}
			if (local11.anInt6 == 1) {
				local7 = (Class113) local11.anObject1;
				@Pc(46) Class11_Sub25 local46 = new Class11_Sub25(Static8.anInt89 * 6 + 3);
				local46.method5186(1);
				local46.method5204(Static8.anInt89);
				for (@Pc(56) int local56 = 0; local56 < Static25.anIntArray516.length; local56++) {
					if (Static315.aBooleanArray25[local56]) {
						local46.method5204(local56);
						local46.method5168(Static25.anIntArray516[local56]);
					}
				}
				local7.method2304(0, local46.aByteArray93, local46.anInt6076);
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method2307();
			}
		} catch (@Pc(94) Exception local94) {
		}
		Static320.aLong189 = Static268.method4627();
		Static240.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!kh;BI)V")
	public static void method920(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (Static91.aClass69_2 == null) {
			return;
		}
		try {
			Static91.aClass69_2.method1219(0L);
			Static91.aClass69_2.method1225(24, arg1, arg0.aByteArray93);
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!nq;Lclient!nq;)V")
	public static void method921(@OriginalArg(1) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		Static189.aClass144_13 = arg1;
		Static39.aClass144_16 = arg0;
		Static189.aClass144_13.method3890(36);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILclient!mk;Lclient!mk;)V")
	public static void method922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class67_Sub2 arg3, @OriginalArg(4) Class67_Sub2 arg4) {
		if (Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static112.method1688(arg0, arg1, arg2);
		}
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub2_1 = arg3;
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub2_2 = arg4;
	}
}
