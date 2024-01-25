import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!dga;Z)V")
	public static void method293(@OriginalArg(0) Class6_Sub14 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt7244 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method6041();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray88.length - arg0.anInt7244 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method6006();
		if (arg0.aByteArray88.length - arg0.anInt7244 < local46 * 6) {
			return;
		}
		for (@Pc(70) int local70 = 0; local70 < local46; local70++) {
			@Pc(76) int local76 = arg0.method6006();
			@Pc(80) int local80 = arg0.method6027();
			if (local76 < Static402.anIntArray568.length && Static248.aBooleanArray25[local76] && (Static279.aClass115_1.method2293(local76).aChar4 != '1' || local80 >= -1 && local80 <= 1)) {
				Static402.anIntArray568[local76] = local80;
			}
		}
	}
}
