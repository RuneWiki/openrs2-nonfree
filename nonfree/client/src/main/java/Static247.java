import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "Z")
	public static boolean aBoolean271;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	public static int anInt4319;

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "Lclient!v;")
	public static final Class362 aClass362_20 = new Class362();

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIZ)V")
	public static void method3616(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(14) Class6_Sub26 local14 = Static268.method3981(Static377.aClass15_2, Static504.aClass289_122);
			local14.aClass6_Sub23_Sub1_2.method8347(arg0);
			Static670.method9077(local14);
		} else {
			Static295.method4225(Static285.aClass357_17, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)I")
	public static int method3618(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ICB)C")
	public static char method3620(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZII)Lclient!ae;")
	public static Class8 method3621(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class274 local5 = null;
		if (Static43.aClass238_1 != null) {
			local5 = new Class274(arg0, Static43.aClass238_1, Static630.aClass238Array3[arg0], 1000000);
		}
		Static483.aClass222_Sub1Array1[arg0] = Static126.aClass306_10.method7247(local5, Static293.aClass274_1, arg0);
		Static483.aClass222_Sub1Array1[arg0].method5289();
		return new Class8(Static483.aClass222_Sub1Array1[arg0], arg1, arg2);
	}
}
