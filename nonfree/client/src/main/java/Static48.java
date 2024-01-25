import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "I")
	public static int anInt6772 = 503;

	@OriginalMember(owner = "client!bka", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_121 = new Class322(68, 6);

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "J")
	public static long aLong225 = 0L;

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "[I")
	public static final int[] anIntArray405 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray122 = new byte[50][];

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIIBI)V")
	public static void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg3 + arg0);
		@Pc(36) int local36 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 - arg3);
		Static367.method5559(-7, local36, arg1, Static36.anIntArrayArray4[arg2], local27);
		while (local7 < local9) {
			local19 += 2;
			local12 += local19;
			@Pc(67) int local67;
			@Pc(72) int local72;
			@Pc(96) int local96;
			@Pc(107) int local107;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg2 - local9;
				local72 = arg2 + local9;
				if (Static605.anInt9561 <= local72 && local67 <= Static223.anInt4380) {
					local96 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 + local7);
					local107 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 - local7);
					if (Static223.anInt4380 >= local72) {
						Static367.method5559(-7, local107, arg1, Static36.anIntArrayArray4[local72], local96);
					}
					if (local67 >= Static605.anInt9561) {
						Static367.method5559(-7, local107, arg1, Static36.anIntArrayArray4[local67], local96);
					}
				}
			}
			local7++;
			local67 = arg2 - local7;
			local72 = arg2 + local7;
			if (local72 >= Static605.anInt9561 && local67 <= Static223.anInt4380) {
				local96 = Static9.method118(Static8.anInt136, Static398.anInt6878, local9 + arg0);
				local107 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 - local9);
				if (local72 <= Static223.anInt4380) {
					Static367.method5559(-7, local107, arg1, Static36.anIntArrayArray4[local72], local96);
				}
				if (local67 >= Static605.anInt9561) {
					Static367.method5559(-7, local107, arg1, Static36.anIntArrayArray4[local67], local96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(CBI)C")
	public static char method6013(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!vo;B)V")
	public static void method6015(@OriginalArg(0) Class381 arg0) {
		if (arg0.anInt10156 == 5 && arg0.anInt10149 != -1) {
			Static148.method2919(arg0, Static202.aClass75_5);
		}
	}
}
