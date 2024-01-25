import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "[Lclient!nm;")
	public static Class203[] aClass203Array1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(43) char local43 = Static289.aCharArray7[local27 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local27 = local43;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method3567() {
		Static291.anInt5364 = Static124.aClass52_6.anInt1673 + Static124.aClass52_6.anInt1675 + 2;
		Static75.anInt1564 = Static188.aClass52_2.anInt1675 + Static188.aClass52_2.anInt1673 + 2;
		Static277.aStringArray27 = new String[500];
		for (@Pc(34) int local34 = 0; local34 < Static277.aStringArray27.length; local34++) {
			Static277.aStringArray27[local34] = "";
		}
	}
}
