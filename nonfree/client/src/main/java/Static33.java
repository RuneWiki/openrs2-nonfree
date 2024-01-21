import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!gg;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_340 = Static170.method3101(" from your friend list first)3");

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_339 = aClass28_340;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!ea;")
	public static Class23 aClass23_5 = new Class23();

	@OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
	public static int[] anIntArray188 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_341 = Static170.method3101("title)3jpg");

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!ea;")
	public static Class23 aClass23_6 = new Class23();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	public static int anInt1026 = 0;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_342 = Static170.method3101("leuchten1:");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)Lclient!eh;")
	public static Class28 method845(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class28 local7 = new Class28();
		local7.aByteArray15 = new byte[arg1];
		local7.anInt1118 = 0;
		for (@Pc(16) int local16 = arg2; local16 < arg1 + arg2; local16++) {
			if (arg0[local16] != 0) {
				local7.aByteArray15[local7.anInt1118++] = arg0[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method846() {
		aClass28_340 = null;
		aClass28_341 = null;
		aClass28_342 = null;
		anIntArray188 = null;
		aClass34_1 = null;
		aClass28_339 = null;
		aClass23_5 = null;
		aClass23_6 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
	public static int method848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg1;
		@Pc(36) int local36 = arg0 & 0x7F;
		if (arg1 < 3 && (Static157.aByteArrayArrayArray41[1][local3][local11] & 0x2) == 2) {
			local32 = arg1 + 1;
		}
		@Pc(57) int local57 = arg2 & 0x7F;
		@Pc(85) int local85 = (128 - local36) * Static90.anIntArrayArrayArray31[local32][local3][local11] + local36 * Static90.anIntArrayArrayArray31[local32][local3 + 1][local11] >> 7;
		@Pc(116) int local116 = local36 * Static90.anIntArrayArrayArray31[local32][local3 + 1][local11 + 1] + Static90.anIntArrayArrayArray31[local32][local3][local11 + 1] * (128 - local36) >> 7;
		return local85 * (128 - local57) + local57 * local116 >> 7;
	}
}
