import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
	public static int anInt537;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString3 = null;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "[I")
	public static final int[] anIntArray40 = new int[4096];

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
	public static int anInt531 = 0;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
	public static int anInt533 = 0;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
	public static void method510() {
		if (Static333.anInt6155 <= 0) {
			Static155.aString32 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static230.aStringArray101.length; local18++) {
			if (Static230.aStringArray101[local18].startsWith("--> ")) {
				local16++;
				if (local16 == Static333.anInt6155) {
					Static155.aString32 = Static230.aStringArray101[local18].substring(4);
					return;
				}
			}
		}
	}
}
