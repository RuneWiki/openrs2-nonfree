import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "[Lclient!cg;")
	public static Class16[] aClass16Array1 = new Class16[4];

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
	public static int[] anIntArray45 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!hh;")
	private static Class50 aClass50_167 = Static186.method3527("");

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!hh;")
	private static Class50 aClass50_168 = Static186.method3527("Loading interfaces )2 ");

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!hh;")
	public static Class50 aClass50_169 = aClass50_167;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_170 = aClass50_168;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
	public static int anInt427 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method308(@OriginalArg(0) Class86 arg0) {
		Static112.aClass86_38 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method310() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static193.anInt3035 - 1; local17++) {
				if (Static27.aShortArray4[local17] < 1000 && Static27.aShortArray4[local17 + 1] > 1000) {
					@Pc(39) Class50 local39 = Static211.aClass50Array80[local17];
					Static211.aClass50Array80[local17] = Static211.aClass50Array80[local17 + 1];
					local11 = false;
					Static211.aClass50Array80[local17 + 1] = local39;
					@Pc(59) Class50 local59 = Static91.aClass50Array78[local17];
					Static91.aClass50Array78[local17] = Static91.aClass50Array78[local17 + 1];
					Static91.aClass50Array78[local17 + 1] = local59;
					@Pc(77) int local77 = Static9.anIntArray21[local17];
					Static9.anIntArray21[local17] = Static9.anIntArray21[local17 + 1];
					Static9.anIntArray21[local17 + 1] = local77;
					@Pc(95) int local95 = Static66.anIntArray109[local17];
					Static66.anIntArray109[local17] = Static66.anIntArray109[local17 + 1];
					Static66.anIntArray109[local17 + 1] = local95;
					@Pc(113) short local113 = Static27.aShortArray4[local17];
					Static27.aShortArray4[local17] = Static27.aShortArray4[local17 + 1];
					Static27.aShortArray4[local17 + 1] = local113;
					@Pc(131) long local131 = Static225.aLongArray9[local17];
					Static225.aLongArray9[local17] = Static225.aLongArray9[local17 + 1];
					Static225.aLongArray9[local17 + 1] = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Z")
	public static boolean method311(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
