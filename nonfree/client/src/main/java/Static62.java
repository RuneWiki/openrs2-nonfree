import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class16[] local3 = Static568.aClass16Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class16 local11 = local3[local5];
			if (local11 != null && local11.anInt407 == 2) {
				Static365.method5698(local11.anInt399, arg3 >> 1, arg0 >> 1, local11.anInt402, local11.anInt404 * 2, local11.anInt398);
				if (Static515.anIntArray676[0] > -1 && Static235.anInt3998 % 20 < 10) {
					@Pc(59) Class44 local59 = Static619.aClass44Array19[local11.anInt405];
					@Pc(67) int local67 = Static515.anIntArray676[0] + arg1 - 12;
					@Pc(76) int local76 = arg2 + Static515.anIntArray676[1] - 28;
					local59.method5312(local67, local76);
					Static354.method5603(local67 + local59.method5313(), local67, local59.method5325() + local76, local76);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg2[arg0 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(46) char local46 = Static605.aCharArray8[local27 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local27 = local46;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}
}
