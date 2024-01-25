import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lclient!eq;")
	public static Class97 aClass97_121;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_54 = new Class238();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)V")
	public static void method6886(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class2_Sub22 local8 = Static284.method8371(arg1, arg0);
		if (local8 != null) {
			for (@Pc(13) int local13 = 0; local13 < local8.anIntArray219.length; local13++) {
				local8.anIntArray219[local13] = -1;
				local8.anIntArray220[local13] = 0;
			}
		}
	}
}
