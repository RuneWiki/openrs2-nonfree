import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!qa;")
	public static Class54 aClass54_37 = new Class54(30);

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!pb;")
	public static Class52 aClass52_12 = new Class52();

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1275 = Static38.method736("::fpson");

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1276 = Static38.method736("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1277 = aClass71_1276;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[Lclient!eb;")
	public static Class5_Sub2[] aClass5_Sub2Array2 = new Class5_Sub2[8];

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1278 = Static38.method736("headicons_pk");

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt2627 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method1739() {
		aClass71_1275 = null;
		aClass52_12 = null;
		aClass71_1278 = null;
		aClass5_Sub2Array2 = null;
		aClass54_37 = null;
		aClass71_1277 = null;
		aClass71_1276 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!qd;")
	public static Class5_Sub1_Sub13 method1740(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub1_Sub13 local6 = (Class5_Sub1_Sub13) Static88.aClass54_34.method1397((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static5.aClass24_2.method679(13, arg0);
		local6 = new Class5_Sub1_Sub13();
		local6.anInt2103 = arg0;
		if (local20 != null) {
			local6.method1432(new Class5_Sub11(local20));
		}
		Static88.aClass54_34.method1399(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B[B)V")
	public static void method1741(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class5_Sub11 local10 = new Class5_Sub11(arg0);
		local10.anInt2233 = arg0.length - 2;
		Static87.anInt2053 = local10.method1543();
		Static116.aByteArrayArray10 = new byte[Static87.anInt2053][];
		Static66.anIntArray192 = new int[Static87.anInt2053];
		Static48.anIntArray157 = new int[Static87.anInt2053];
		Static40.anIntArray85 = new int[Static87.anInt2053];
		Static5.anIntArray8 = new int[Static87.anInt2053];
		local10.anInt2233 = arg0.length - Static87.anInt2053 * 8 - 7;
		Static29.anInt778 = local10.method1543();
		Static118.anInt2914 = local10.method1543();
		@Pc(62) int local62 = (local10.method1546() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static87.anInt2053; local64++) {
			Static66.anIntArray192[local64] = local10.method1543();
		}
		for (@Pc(88) int local88 = 0; local88 < Static87.anInt2053; local88++) {
			Static40.anIntArray85[local88] = local10.method1543();
		}
		for (@Pc(102) int local102 = 0; local102 < Static87.anInt2053; local102++) {
			Static5.anIntArray8[local102] = local10.method1543();
		}
		for (@Pc(116) int local116 = 0; local116 < Static87.anInt2053; local116++) {
			Static48.anIntArray157[local116] = local10.method1543();
		}
		local10.anInt2233 = arg0.length - Static87.anInt2053 * 8 - (local62 + -1) * 3 - 7;
		Static40.anIntArray84 = new int[local62];
		for (@Pc(154) int local154 = 1; local154 < local62; local154++) {
			Static40.anIntArray84[local154] = local10.method1530();
			if (Static40.anIntArray84[local154] == 0) {
				Static40.anIntArray84[local154] = 1;
			}
		}
		local10.anInt2233 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static87.anInt2053; local179++) {
			@Pc(185) int local185 = Static48.anIntArray157[local179];
			@Pc(189) int local189 = Static5.anIntArray8[local179];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static116.aByteArrayArray10[local179] = local196;
			@Pc(204) int local204 = local10.method1546();
			@Pc(211) int local211;
			if (local204 == 0) {
				for (local211 = 0; local211 < local193; local211++) {
					local196[local211] = local10.method1524();
				}
			} else if (local204 == 1) {
				for (local211 = 0; local211 < local189; local211++) {
					for (@Pc(215) int local215 = 0; local215 < local185; local215++) {
						local196[local215 * local189 + local211] = local10.method1524();
					}
				}
			}
		}
	}
}
