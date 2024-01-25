import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	public static int anInt919 = -1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZI)V")
	public static void method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = Static300.aClass5_Sub28_Sub1_1.anInt4889 * arg2 >> 8;
		if (local18 != 0 && arg0 != -1) {
			Static19.method6150(arg0, Static56.aClass117_29, local18);
			Static359.aBoolean477 = true;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BB)Z")
	public static boolean method859(@OriginalArg(0) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			return false;
		} else {
			return local15 < 128 || local15 >= 160 || Static395.aCharArray7[local15 - 128] != '\u0000';
		}
	}
}
