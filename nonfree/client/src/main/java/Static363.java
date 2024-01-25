import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "J")
	public static long aLong179 = 0L;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)V")
	public static void method5854() {
		if (Static407.anInt7738 <= 0) {
			Static41.aString3 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static573.aStringArray70.length; local15++) {
			if (Static573.aStringArray70[local15].indexOf("--> ") != -1) {
				local13++;
				if (local13 == Static407.anInt7738) {
					Static41.aString3 = Static573.aStringArray70[local15].substring(Static573.aStringArray70[local15].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)I")
	public static int method5855(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(III)Z")
	public static boolean method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static335.method5479(arg1, arg0)) {
			return Static297.method5126(arg1, arg0) | (arg0 & 0xB000) != 0 | Static467.method7079(arg0, arg1) ? true : (Static584.method8298(arg1, arg0) | Static528.method7656(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
