import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!te", name = "X", descriptor = "Lclient!gp;")
	public static Class75 aClass75_9;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "I")
	public static int anInt5825 = 0;

	@OriginalMember(owner = "client!te", name = "O", descriptor = "[I")
	public static final int[] anIntArray446 = new int[14];

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "[I")
	public static int[] anIntArray447 = new int[2];

	@OriginalMember(owner = "client!te", name = "W", descriptor = "[I")
	public static final int[] anIntArray448 = new int[1000];

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "[I")
	public static final int[] anIntArray449 = new int[4096];

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
	public static void method5136() {
		Static257.method4468();
		Static66.aClass18_3 = null;
		Static26.aClass59_2 = null;
		Static230.aClass18_4 = null;
		Static4.aClass18_1 = null;
		Static115.aClass6ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([Lclient!dl;ZILclient!en;I[BZ)V")
	public static void method5137(@OriginalArg(0) Class49[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		@Pc(10) Class5_Sub1 local10 = new Class5_Sub1(arg5);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method1837();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method1866();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local10.method1832();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg4;
				@Pc(77) int local77 = arg2 + local47;
				if (local73 > 0 && local77 > 0 && Static266.anInt5101 - 1 > local73 && Static339.anInt6352 - 1 > local77) {
					@Pc(96) Class49 local96 = null;
					if (!arg1) {
						@Pc(100) int local100 = local57;
						if ((Static32.aByteArrayArrayArray4[1][local73][local77] & 0x2) == 2) {
							local100 = local57 - 1;
						}
						if (local100 >= 0) {
							local96 = arg0[local100];
						}
					}
					Static164.method3035(local57, local65, arg3, -1, local96, local57, local16, local77, local69, local73, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
	public static void method5138() {
		for (@Pc(6) Class5_Sub27 local6 = (Class5_Sub27) Static82.aClass211_6.method5608(); local6 != null; local6 = (Class5_Sub27) Static82.aClass211_6.method5603()) {
			if (local6.aBoolean265) {
				local6.method3460();
			}
		}
		for (@Pc(30) Class5_Sub27 local30 = (Class5_Sub27) Static16.aClass211_1.method5608(); local30 != null; local30 = (Class5_Sub27) Static16.aClass211_1.method5603()) {
			if (local30.aBoolean265) {
				local30.method3460();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBC)C")
	public static char method5140(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!jf;)Z")
	public static boolean method5141(@OriginalArg(1) Class96 arg0) {
		if (arg0.anIntArray181 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray181.length; local12++) {
			@Pc(24) int local24 = Static195.method3508(arg0, local12);
			@Pc(29) int local29 = arg0.anIntArray197[local12];
			if (arg0.anIntArray181[local12] == 2) {
				if (local24 >= local29) {
					return false;
				}
			} else if (arg0.anIntArray181[local12] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray181[local12] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
