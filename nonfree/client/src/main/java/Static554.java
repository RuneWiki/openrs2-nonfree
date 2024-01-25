import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "[I")
	public static int[] anIntArray697 = new int[1];

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
	public static void method7611() {
		if (Static398.anInt7032 <= 0) {
			Static298.aString68 = "";
			return;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static316.aStringArray22.length; local21++) {
			if (Static316.aStringArray22[local21].startsWith("--> ")) {
				local19++;
				if (Static398.anInt7032 == local19) {
					Static298.aString68 = Static316.aStringArray22[local21].substring(4);
					return;
				}
			}
		}
	}
}
