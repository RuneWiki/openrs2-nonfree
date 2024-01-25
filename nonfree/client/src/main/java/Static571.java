import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!nq;")
	public static Class202_Sub1 aClass202_Sub1_2;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
	public static int[] anIntArray829;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public static int anInt9643;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray11;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "F")
	public static float aFloat196 = 0.25F;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Z")
	public static boolean method8044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static249.method4397(arg1, arg0) || Static401.method6295(arg1, arg0);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I")
	public static int method8046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = ((arg1 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(34) int local34 = 255 - local7;
		return local25 + (((arg0 & 0xFF00FF) * local34 & 0xFF00FF00 | local34 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
