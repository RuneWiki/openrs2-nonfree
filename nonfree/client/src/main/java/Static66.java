import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_15 = new Class77(43, -1);

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "[I")
	public static final int[] anIntArray171 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "Lclient!tl;")
	public static final Class285 aClass285_1 = new Class285("WTWIP", 3);

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "[I")
	public static final int[] anIntArray172 = new int[13];

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "[I")
	public static final int[] anIntArray173 = new int[4];

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public static int anInt1516 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)I")
	public static int method1489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static22.anInt9607 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg2 - Static2.anInt5916;
		@Pc(24) int local24 = arg1 - Static2.anInt5914;
		for (@Pc(34) Class12_Sub12 local34 = (Class12_Sub12) Static2.aClass73_48.method2005(); local34 != null; local34 = (Class12_Sub12) Static2.aClass73_48.method2009()) {
			if (arg0 == local34.anInt2333) {
				@Pc(47) int local47 = local34.anInt2332;
				@Pc(50) int local50 = local34.anInt2334;
				@Pc(60) int local60 = local50 + Static2.anInt5914 | local47 + Static2.anInt5916 << 14;
				@Pc(80) int local80 = (local24 - local50) * (-local50 + local24) + (local19 - local47) * (-local47 + local19);
				if (local12 < 0 || local14 > local80) {
					local12 = local60;
					local14 = local80;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IC)Z")
	public static boolean method1490(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static97.aCharArray1;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}
}
