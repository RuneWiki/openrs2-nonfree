import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!qda;")
	public static Class59 aClass59_32;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	public static int anInt8829;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[8];

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
	public static void method7437() {
		if (Static271.anInt4278 != -1) {
			Static123.method1945(false, Static271.anInt4278, -1, -1);
			Static271.anInt4278 = -1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V")
	public static void method7439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static634.anInt10113 != 1) {
			return;
		}
		@Pc(11) int local11 = arg2 / Static586.anInt9622;
		@Pc(15) int local15 = arg3 / Static586.anInt9622;
		@Pc(19) int local19 = arg0 / Static77.anInt1204;
		@Pc(23) int local23 = arg1 / Static77.anInt1204;
		if (local11 >= Static449.anInt7857 || local15 < 0 || local19 >= Static259.anInt4111 || local23 < 0) {
			return;
		}
		if (Static449.anInt7857 <= local15) {
			local15 = Static449.anInt7857 - 1;
		}
		if (local11 < 0) {
			local11 = 0;
		}
		if (local19 < 0) {
			local19 = 0;
		}
		if (Static259.anInt4111 <= local23) {
			local23 = Static259.anInt4111 - 1;
		}
		for (@Pc(64) int local64 = local19; local64 <= local23; local64++) {
			@Pc(77) int local77 = Static460.method6810(Static259.anInt4111, local64 + Static675.anInt10637) * Static449.anInt7857;
			for (@Pc(79) int local79 = local11; local79 <= local15; local79++) {
				@Pc(89) int local89 = Static460.method6810(Static449.anInt7857, Static606.anInt9804 + local79) + local77;
				Static348.anIntArray433[local89] = Static244.anInt3958;
			}
		}
	}
}
