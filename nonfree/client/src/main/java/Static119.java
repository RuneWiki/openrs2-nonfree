import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
	public static int anInt2720;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_37 = new Class90(16, 1);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)I")
	public static int method2175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(29) int local29 = 255 - local7;
		return local25 + ((local29 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local29 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZII)Z")
	public static boolean method2177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
