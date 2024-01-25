import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt6300;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_23 = new Class225(4, 1, 1, 1);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
	public static int method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local10 << 13 ^ local10;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Z")
	public static boolean method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static269.method3932(arg0, arg1) | (arg0 & 0x40000) != 0 || Static161.method2443(arg0, arg1);
	}
}
