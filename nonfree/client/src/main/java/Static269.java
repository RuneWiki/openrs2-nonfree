import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!uu;")
	public static Class250 aClass250_57;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt3398 = 0;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_87 = new Class163(30, 3);

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I")
	public static int method2903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * local15 * 15731 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
