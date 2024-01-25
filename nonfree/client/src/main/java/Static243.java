import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!fi;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!al;")
	public static final Class11 aClass11_106 = new Class11(64);

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Loaded world list data";

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public static final int[] anIntArray431 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString177 = "Allocated memory";

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static98.aClass213ArrayArrayArray2[0][arg1][arg2] != null && Static98.aClass213ArrayArrayArray2[0][arg1][arg2].aClass213_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static98.aClass213ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class213 local46 = Static98.aClass213ArrayArrayArray2[local22][arg1][arg2] = new Class213(local22, arg1, arg2);
				if (local20) {
					local46.aByte73++;
				}
			}
		}
	}
}
