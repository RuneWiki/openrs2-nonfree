import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
	public static volatile int anInt975 = 0;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_520 = Static56.method816("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_521 = Static56.method816("null");

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_522 = Static56.method816("jolt");

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!lf;")
	public static Class48 aClass48_21 = new Class48(50);

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
	public static int anInt978 = 0;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "Lclient!ic;")
	public static Class34 aClass34_523 = Static56.method816("(U1");

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
	public static int anInt984 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!dd;B)V")
	public static void method604(@OriginalArg(0) Class14 arg0) {
		Static30.aClass14_8 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIII)Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 method606(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg0 << 40) + ((long) arg3 << 16) + (long) arg4 + ((long) arg2 << 38);
		@Pc(32) Class8_Sub1_Sub3_Sub3 local32;
		if (!arg1) {
			local32 = (Class8_Sub1_Sub3_Sub3) Static48.aClass48_56.method1100(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class8_Sub1_Sub13 local40 = Static7.method49(arg4);
		if (arg3 > 1 && local40.anIntArray225 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (local40.anIntArray224[local52] <= arg3 && local40.anIntArray224[local52] != 0) {
					local50 = local40.anIntArray225[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static7.method49(local50);
			}
		}
		@Pc(96) Class8_Sub1_Sub1_Sub6 local96 = local40.method1072(1);
		if (local96 == null) {
			return null;
		}
		@Pc(102) Class8_Sub1_Sub3_Sub3 local102 = null;
		if (local40.anInt1739 != -1) {
			local102 = method606(0, true, 1, 10, local40.anInt1740);
			if (local102 == null) {
				return null;
			}
		}
		@Pc(122) int local122 = Static110.anInt2717;
		@Pc(124) int local124 = Static110.anInt2714;
		@Pc(126) int[] local126 = Static110.anIntArray376;
		@Pc(129) int[] local129 = new int[4];
		Static110.method1731(local129);
		local32 = new Class8_Sub1_Sub3_Sub3(36, 32);
		Static110.method1720(local32.anIntArray342, 36, 32);
		Static110.method1723();
		Static11.method178();
		Static11.method181(16, 16);
		Static11.aBoolean9 = false;
		@Pc(152) int local152 = local40.anInt1727;
		if (arg1) {
			local152 = (int) ((double) local152 * 1.5D);
		} else if (arg2 == 2) {
			local152 = (int) ((double) local152 * 1.04D);
		}
		@Pc(180) int local180 = local152 * Class8_Sub1_Sub3_Sub1.anIntArray40[local40.anInt1733] >> 16;
		@Pc(189) int local189 = Class8_Sub1_Sub3_Sub1.anIntArray38[local40.anInt1733] * local152 >> 16;
		local96.method1269();
		local96.method1279(local40.anInt1766, local40.anInt1767, local40.anInt1733, local40.anInt1758, local40.anInt1757 + local96.anInt2957 / 2 + local189, local180 - -local40.anInt1757);
		if (arg2 >= 1) {
			local32.method1589(1);
		}
		if (arg2 >= 2) {
			local32.method1589(16777215);
		}
		if (arg0 != 0) {
			local32.method1571(arg0);
		}
		Static110.method1720(local32.anIntArray342, 36, 32);
		if (local40.anInt1739 != -1) {
			local102.method1587(0, 0);
		}
		if (!arg1 && (local40.anInt1752 == 1 || arg3 != 1) && arg3 != -1) {
			Static129.aClass8_Sub1_Sub3_Sub4_Sub1_4.method1741(Static47.method729(arg3), 0, 9, 16776960, 1);
		}
		if (!arg1) {
			Static48.aClass48_56.method1097(local32, local24);
		}
		Static110.method1720(local126, local122, local124);
		Static110.method1730(local129);
		Static11.method178();
		Static11.aBoolean9 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method607(@OriginalArg(0) Class14 arg0) {
		Static30.aClass14_9 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!wf;)V")
	public static void method608(@OriginalArg(1) Class8_Sub24 arg0) {
		if (Static82.anInt1978 == arg0.anInt3169) {
			Static23.aBooleanArray2[arg0.anInt3157] = true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method610() {
		aClass34_523 = null;
		aClass48_21 = null;
		aClass34_520 = null;
		aClass34_522 = null;
		aClass34_521 = null;
		aBooleanArray5 = null;
	}
}
