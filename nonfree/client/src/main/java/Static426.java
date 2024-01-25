import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "Lclient!gaa;")
	public static Class39 aClass39_7;

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "Lclient!hm;")
	public static final Class122 aClass122_4 = new Class122();

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "[J")
	public static final long[] aLongArray13 = new long[100];

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(I)V")
	public static void method6323(@OriginalArg(0) int arg0) {
		Static382.anInt6687 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static488.anInt8353; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static60.anInt1677; local6++) {
				if (Static313.aClass206ArrayArrayArray2[arg0][local3][local6] == null) {
					Static313.aClass206ArrayArrayArray2[arg0][local3][local6] = new Class206(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(III)I")
	public static int method6324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(37) int local37 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}
}
