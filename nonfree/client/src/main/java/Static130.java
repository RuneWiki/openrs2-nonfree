import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lclient!ke;")
	public static Class43 aClass43_31;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!qd", name = "zb", descriptor = "I")
	public static int anInt3165;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1156 = Static146.method2172("To create a new account you need to");

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1155 = aClass77_1156;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
	public static int anInt3149 = 0;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1157 = Static146.method2172("runes");

	@OriginalMember(owner = "client!qd", name = "pb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
	public static int anInt3166 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!qf;)Lclient!sg;")
	public static Class77 method2229(@OriginalArg(1) Class66 arg0) {
		if (Static40.method796(Static63.method1160(arg0)) == 0) {
			return null;
		} else if (arg0.aClass77_1161 == null || arg0.aClass77_1161.method2505().method2532() == 0) {
			return Static150.aBoolean150 ? Static7.aClass77_98 : null;
		} else {
			return arg0.aClass77_1161;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B[B)[B")
	public static byte[] method2233(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub18 local9 = new Class2_Sub18(arg0);
		@Pc(17) int local17 = local9.method2387();
		@Pc(21) int local21 = local9.method2382();
		if (local21 < 0 || Static181.anInt4601 != 0 && local21 > Static181.anInt4601) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(77) byte[] local77 = new byte[local21];
			local9.method2354(local21, local77);
			return local77;
		} else {
			@Pc(38) int local38 = local9.method2382();
			if (local38 < 0 || Static181.anInt4601 != 0 && Static181.anInt4601 < local38) {
				throw new RuntimeException();
			}
			@Pc(52) byte[] local52 = new byte[local38];
			if (local17 == 1) {
				Static43.method817(local52, local38, arg0, local21);
			} else {
				Static123.aClass67_1.method2255(local9, local52);
			}
			return local52;
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public static void method2237() {
		aClass77_1157 = null;
		anIntArray465 = null;
		aClass43_31 = null;
		aClass77_1155 = null;
		aCalendar1 = null;
		anIntArrayArray26 = null;
		aClass77_1156 = null;
	}
}
