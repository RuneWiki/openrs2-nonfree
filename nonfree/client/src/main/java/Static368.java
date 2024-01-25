import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "Lclient!mg;")
	public static Class160 aClass160_73;

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
	public static int anInt6317;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "Lclient!la;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
	public static int anInt6315 = -1;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public static void method5010(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 1);
		local13.method4545();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)I")
	public static int method5012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 24;
		@Pc(20) int local20 = 255 - local15;
		@Pc(38) int local38 = (local15 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8;
		return local38 + ((local20 * (arg1 & 0xFF00) & 0xFF0000 | local20 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
