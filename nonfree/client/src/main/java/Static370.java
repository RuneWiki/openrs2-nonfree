import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "B")
	public static byte aByte83;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_226 = new Class214(45, 11);

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray152 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4797(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Z")
	public static boolean method4799(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 30 || arg0 == 1007 || arg0 == 51 || arg0 == 46;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ji;Z)[Lclient!pp;")
	public static Class195[] method4800(@OriginalArg(0) Class124 arg0) {
		if (!arg0.method2518()) {
			return new Class195[0];
		}
		@Pc(16) Class215 local16 = arg0.method2528();
		while (local16.anInt5791 == 0) {
			Static252.method2874(10L);
		}
		if (local16.anInt5791 == 2) {
			return new Class195[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject10;
		@Pc(51) Class195[] local51 = new Class195[local40.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class195 local59 = new Class195();
			local51[local53] = local59;
			local59.anInt5213 = local40[local53 << 2];
			local59.anInt5212 = local40[(local53 << 2) + 1];
			local59.anInt5216 = local40[(local53 << 2) + 2];
			local59.anInt5214 = local40[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!vg;I)V")
	public static void method4801(@OriginalArg(0) Class250 arg0) {
		@Pc(7) Class250 local7 = Static266.method2728(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static92.anInt1618;
			local12 = Static126.anInt2202;
		} else {
			local12 = local7.anInt7041;
			local15 = local7.anInt6997;
		}
		Static241.method3138(local15, false, arg0, local12);
		Static355.method4565(arg0, local12, local15);
	}
}
