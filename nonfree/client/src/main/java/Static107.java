import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_254 = new Class87(8);

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	public static void method9046() {
		@Pc(7) int local7 = Static320.anInt5442;
		@Pc(9) int[] local9 = Static278.anIntArray264;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class4_Sub2_Sub1_Sub1_Sub1 local26 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local9[local18]];
			if (local26 != null) {
				Static106.method1670(local26.method1018(), local26);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lclient!raa;")
	public static Class295 method9049(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static519.aClass295ArrayArray2[local7] == null || Static519.aClass295ArrayArray2[local7][local11] == null) {
			@Pc(30) boolean local30 = Static633.method8959(local7);
			if (!local30) {
				return null;
			}
		}
		return Static519.aClass295ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z")
	public static boolean method9051(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
	public static void method9052() {
		if (Static104.aClass91_2 == null) {
			return;
		}
		if (Static104.aClass91_2.anInt2271 == 1) {
			Static104.aClass91_2 = null;
			return;
		}
		if (Static104.aClass91_2.anInt2271 == 2) {
			Static208.method3586(Static239.aString46, 2, Static350.aClass100_15);
			Static104.aClass91_2 = null;
			return;
		}
	}
}
