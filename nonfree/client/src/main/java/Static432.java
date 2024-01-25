import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
	public static int anInt7513 = -1;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BB)V")
	public static void method6286(@OriginalArg(1) byte arg0) {
		if (Static406.aByteArrayArrayArray15 == null) {
			Static406.aByteArrayArrayArray15 = new byte[4][Static459.anInt7799][Static482.anInt7990];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(20) int local20 = 0; local20 < Static459.anInt7799; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static482.anInt7990; local24++) {
					Static406.aByteArrayArrayArray15[local14][local20][local24] = arg0;
				}
			}
		}
	}
}
