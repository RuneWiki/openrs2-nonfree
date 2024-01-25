import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Lclient!oi;")
	public static Class185 aClass185_9;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!bv", name = "T", descriptor = "I")
	public static int anInt641;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_35 = new Class67(88, 10);

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
	public static int anInt640 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIB)I")
	public static int method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * 15731 * local20 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
