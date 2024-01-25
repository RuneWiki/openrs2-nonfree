import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "Lclient!lf;")
	public static Class90 aClass90_5;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public static int anInt991;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "J")
	public static volatile long aLong42 = 0L;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIBIII)V")
	public static void method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class136[] local8 = Static135.aClass136Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class136 local16 = local8[local10];
			if (local16 != null && local16.anInt4068 == 2) {
				Static216.method3968((local16.anInt4067 - Static182.anInt3775 << 7) + local16.anInt4057, arg2 >> 1, arg3 >> 1, (local16.anInt4052 - Static161.anInt3315 << 7) + local16.anInt4053, local16.anInt4055 * 2);
				if (Static87.anIntArray215[0] > -1 && Static215.anInt4246 % 20 < 10) {
					Static163.aClass90Array9[local16.anInt4066].method5454(Static87.anIntArray215[0] + arg0 - 12, Static87.anIntArray215[1] + arg1 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
	public static void method1028() {
		if (Static239.anInt4649 == 10 || Static239.anInt4649 == 28) {
			Static287.method4920(Static221.anInt4363 >> 10, Static164.anInt3425 >> 10);
		} else {
			Static287.method4920(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] >> 3, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] >> 3);
		}
		Static11.method4796();
		Static38.method3470();
		Static287.method4918();
		Static288.method5418();
	}
}
