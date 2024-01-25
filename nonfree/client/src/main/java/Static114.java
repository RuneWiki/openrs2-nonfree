import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "I")
	public static int anInt2317 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)I")
	public static int method2231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(11) int local11 = 255 - local7;
		@Pc(29) int local29 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return ((local11 * (arg1 & 0xFF00) & 0xFF0000 | local11 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local29;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZI)Z")
	public static boolean method2233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public static void method2235() {
		Static108.aClass231_27.method6240();
	}
}
