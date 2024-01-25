import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!dd;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
	public static int anInt9149;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!dq;")
	public static final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray119 = new int[6][];

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	public static int anInt9148 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method7898() {
		if (Static441.anInt7708 <= 0) {
			Static231.aString101 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static379.aStringArray32.length; local14++) {
			if (Static379.aStringArray32[local14].startsWith("--> ")) {
				@Pc(25) int local25 = ~Static441.anInt7708;
				local12++;
				if (local25 == ~local12) {
					Static231.aString101 = Static379.aStringArray32[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z")
	public static boolean method7901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
