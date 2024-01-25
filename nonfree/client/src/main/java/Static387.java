import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!qba", name = "ch", descriptor = "Lclient!dj;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!qba", name = "uh", descriptor = "Lclient!mg;")
	public static Class187 aClass187_2;

	@OriginalMember(owner = "client!qba", name = "Yg", descriptor = "I")
	public static int anInt7341 = -1;

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(III)Z")
	public static boolean method6220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qba", name = "ab", descriptor = "(I)Z")
	public static boolean method6221() {
		return Static259.aBoolean185;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLclient!ps;)V")
	public static void method6222(@OriginalArg(1) Class2_Sub29 arg0) {
		if (arg0.aByteArray96.length - arg0.anInt6132 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5170();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray96.length - arg0.anInt6132 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method5229();
		if (local52 * 6 > arg0.aByteArray96.length - arg0.anInt6132) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < local52; local65++) {
			@Pc(71) int local71 = arg0.method5229();
			@Pc(75) int local75 = arg0.method5198();
			if (local71 < Static399.anIntArray113.length && Static432.aBooleanArray35[local71] && (Static33.aClass28_1.method834(local71).aChar2 != '1' || local75 >= -1 && local75 <= 1)) {
				Static399.anIntArray113[local71] = local75;
			}
		}
	}
}
