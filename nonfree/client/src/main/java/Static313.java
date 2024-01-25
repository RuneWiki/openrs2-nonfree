import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "Lclient!is;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_80 = new Class276(4, -1);

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	public static void method5254() {
		if (Static25.anInt779 == -1) {
			return;
		}
		@Pc(19) int local19 = Static258.aClass116_1.method8249();
		@Pc(23) int local23 = Static258.aClass116_1.method8250();
		@Pc(28) Class3_Sub21 local28 = (Class3_Sub21) Static283.aClass183_38.method4795();
		if (local28 != null) {
			local19 = local28.method3917();
			local23 = local28.method3916();
		}
		Static197.method3343(Static294.anInt10217, 0, Static582.anInt10234, local23, 0, Static25.anInt779, 0, 0, local19);
		if (Static112.aClass305_5 != null) {
			Static285.method4908(local19, local23);
		}
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
	public static void method5255() {
		Static475.anInt8908 = Static9.aClass297_1.anInt8936 + Static9.aClass297_1.anInt8935 + 2;
		Static580.anInt10229 = Static13.aClass297_2.anInt8935 + Static13.aClass297_2.anInt8936 + 2;
		Static171.aStringArray14 = new String[500];
		for (@Pc(24) int local24 = 0; local24 < Static171.aStringArray14.length; local24++) {
			Static171.aStringArray14[local24] = "";
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static39.anIntArrayArrayArray1[arg0][local16][local20] == -Static360.anInt1763) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static309.anInt6172) + 1;
			@Pc(142) int local142 = (arg3 << Static309.anInt6172) + 2;
			@Pc(151) int local151 = Static224.aClass4Array3[arg0].JA(arg1, arg3) + arg5;
			if (!Static557.method1639(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static309.anInt6172) - 1;
			if (!Static557.method1639(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static309.anInt6172) - 1;
			if (!Static557.method1639(local20, local151, local177)) {
				return false;
			} else if (Static557.method1639(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static232.method3980(arg0, arg1, arg3)) {
			local16 = arg1 << Static309.anInt6172;
			local20 = arg3 << Static309.anInt6172;
			return Static557.method1639(local16 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static557.method1639(local16 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static557.method1639(local16 + Static480.anInt8971 - 1, Static224.aClass4Array3[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static480.anInt8971 - 1) && Static557.method1639(local16 + 1, Static224.aClass4Array3[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static480.anInt8971 - 1);
		} else {
			return false;
		}
	}
}
