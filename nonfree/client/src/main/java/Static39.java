import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass25_Sub4_1 != null) {
			local7.aClass25_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)I")
	public static int method883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!bq;I)I")
	public static int method884(@OriginalArg(0) Class5_Sub4 arg0) {
		@Pc(7) String local7 = Static55.method1184(arg0);
		@Pc(9) int[] local9 = null;
		if (Static327.method5513(arg0.anInt785)) {
			local9 = Static88.method1382((int) arg0.aLong24).anIntArray382;
		} else if (Static93.method1989(arg0.anInt785)) {
			@Pc(40) Class25_Sub1_Sub1_Sub2 local40 = Static188.aClass25_Sub1_Sub1_Sub2Array1[(int) arg0.aLong24];
			if (local40 != null) {
				local9 = local40.aClass216_1.anIntArray560;
			}
		} else if (Static199.method3530(arg0.anInt785)) {
			if (arg0.anInt785 == 1002) {
				local9 = Static228.method3923((int) arg0.aLong24).anIntArray298;
			} else {
				local9 = Static228.method3923((int) (arg0.aLong24 >>> 32 & 0x7FFFFFFFL)).anIntArray298;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static346.method5697(local9);
		}
		return Static337.aClass138_10.method3727(Static49.aClass54Array4, local7);
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	public static void method888() {
		Static131.aClass66_45.method1933();
	}
}
