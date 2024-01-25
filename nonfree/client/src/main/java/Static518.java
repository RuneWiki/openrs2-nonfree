import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
	public static int anInt8220;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt8219 = -1;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "[Lclient!ot;")
	public static final Class274[] aClass274Array1 = new Class274[16];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)I")
	public static int method7072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(22) int local22 = 255 - local7;
		@Pc(40) int local40 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return ((local22 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local22 & 0xFF00FF00) >>> 8) + local40;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!rga;IBII)Z")
	public static boolean method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class315 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static429.aBoolean478 || !Static343.aBoolean381) {
			return false;
		} else if (Static547.anInt8693 < 100) {
			return false;
		} else if (arg3 != arg4 || arg5 != arg1) {
			for (@Pc(72) int local72 = arg3; local72 <= arg4; local72++) {
				for (@Pc(78) int local78 = arg1; local78 <= arg5; local78++) {
					if (-Static489.anInt7963 == Static648.anIntArrayArrayArray19[arg0][local72][local78]) {
						return false;
					}
				}
			}
			if (Static62.method1062(arg2)) {
				Static424.anInt6889++;
				return true;
			} else {
				return false;
			}
		} else if (!Static339.method5086(arg3, arg0, arg1)) {
			return false;
		} else if (Static62.method1062(arg2)) {
			Static424.anInt6889++;
			return true;
		} else {
			return false;
		}
	}
}
