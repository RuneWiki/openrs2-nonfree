import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public static int anInt5826;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
	public static int[] anIntArray509;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!qe;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5138(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
