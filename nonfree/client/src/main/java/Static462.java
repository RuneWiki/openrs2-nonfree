import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V")
	public static void method6487() {
		Static137.aClass332_64.method7497(5);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIB)I")
	public static int method6488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = (local12 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		return local35 + ((local17 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local17 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
