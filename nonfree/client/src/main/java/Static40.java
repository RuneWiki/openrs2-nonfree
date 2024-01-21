import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_541 = Static9.method266(":tradereq:");

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public static int anInt1147 = 0;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[8];

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	public static int anInt1154 = 0;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_542 = Static9.method266("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BIII)V")
	public static void method686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static123.anInt2916 = -1;
			Static95.anInt2447 = -1;
			return;
		}
		@Pc(32) int local32 = Static45.method1845(Static42.anInt1208, arg0, arg2) - arg1;
		@Pc(36) int local36 = arg2 - Static119.anInt2839;
		@Pc(47) int local47 = arg0 - Static109.anInt3091;
		@Pc(51) int local51 = Class1_Sub1_Sub2_Sub4.anIntArray335[Static66.anInt1754];
		@Pc(55) int local55 = Class1_Sub1_Sub2_Sub4.anIntArray334[Static58.anInt1617];
		@Pc(59) int local59 = local32 - Static88.anInt2285;
		@Pc(63) int local63 = Class1_Sub1_Sub2_Sub4.anIntArray334[Static66.anInt1754];
		@Pc(67) int local67 = Class1_Sub1_Sub2_Sub4.anIntArray335[Static58.anInt1617];
		@Pc(77) int local77 = local63 * local36 + local47 * local51 >> 16;
		@Pc(88) int local88 = local47 * local63 - local51 * local36 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local59 * local55 - local67 * local88 >> 16;
		@Pc(111) int local111 = local55 * local88 + local59 * local67 >> 16;
		if (local111 < 50) {
			Static95.anInt2447 = -1;
			Static123.anInt2916 = -1;
		} else {
			Static123.anInt2916 = (local90 << 9) / local111 + 256;
			Static95.anInt2447 = (local101 << 9) / local111 + 167;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Lclient!gd;")
	public static Class1_Sub1_Sub6 method687(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub6 local10 = (Class1_Sub1_Sub6) Static57.aClass63_10.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static23.aClass35_6.method1573(12, arg0);
		local10 = new Class1_Sub1_Sub6();
		if (local20 != null) {
			local10.method726(new Class1_Sub19(local20));
		}
		local10.method723();
		Static57.aClass63_10.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ie;II)[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) int arg2) {
		return Static69.method1193(arg0, arg2, arg1) ? Static49.method910() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method689() {
		aClass34_541 = null;
		aBooleanArray7 = null;
		aClass34_542 = null;
		aLongArray3 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method690(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static31.anInt923 > 0) {
			local16 = Static37.aByteArrayArray2[--Static31.anInt923];
			Static37.aByteArrayArray2[Static31.anInt923] = null;
			return local16;
		} else if (arg0 == 5000 && Static45.anInt2762 > 0) {
			local16 = Static39.aByteArrayArray3[--Static45.anInt2762];
			Static39.aByteArrayArray3[Static45.anInt2762] = null;
			return local16;
		} else if (arg0 == 30000 && Static28.anInt3027 > 0) {
			local16 = Static112.aByteArrayArray8[--Static28.anInt3027];
			Static112.aByteArrayArray8[Static28.anInt3027] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
