import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "Lclient!or;")
	public static Class183 aClass183_5;

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
	public static void method5363() {
		for (@Pc(7) int local7 = 0; local7 < Static351.anInt5969; local7++) {
			@Pc(18) int local18 = Static40.anIntArray84[local7];
			@Pc(25) Class2_Sub28 local25 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local18);
			if (local25 != null) {
				@Pc(30) Class3_Sub4_Sub1_Sub1 local30 = local25.aClass3_Sub4_Sub1_Sub1_1;
				Static81.method1176(local30.aClass245_1.anInt6704, local30);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)Z")
	public static boolean method5365(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}
}
