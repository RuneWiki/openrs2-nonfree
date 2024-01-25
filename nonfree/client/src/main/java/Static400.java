import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "[Lclient!gs;")
	public static Class134[] aClass134Array1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_100 = new Class100(43, 6);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)Z")
	public static boolean method5985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class58 local28 = Static486.aClass58ArrayArrayArray2[local9][arg0][arg1] = Static486.aClass58ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class43 local33 = local28.aClass43_4; local33 != null; local33 = local33.aClass43_3) {
					@Pc(37) Class12_Sub2_Sub2 local37 = local33.aClass12_Sub2_Sub2_1;
					if (local37.aShort111 == arg0 && local37.aShort110 == arg1) {
						local37.aByte146--;
					}
				}
				if (local28.aClass12_Sub2_Sub4_1 != null) {
					local28.aClass12_Sub2_Sub4_1.aByte146--;
				}
				if (local28.aClass12_Sub2_Sub1_1 != null) {
					local28.aClass12_Sub2_Sub1_1.aByte146--;
				}
				if (local28.aClass12_Sub2_Sub1_2 != null) {
					local28.aClass12_Sub2_Sub1_2.aByte146--;
				}
				if (local28.aClass12_Sub2_Sub3_2 != null) {
					local28.aClass12_Sub2_Sub3_2.aByte146--;
				}
				if (local28.aClass12_Sub2_Sub3_1 != null) {
					local28.aClass12_Sub2_Sub3_1.aByte146--;
				}
			}
		}
		if (Static486.aClass58ArrayArrayArray2[0][arg0][arg1] == null) {
			Static486.aClass58ArrayArrayArray2[0][arg0][arg1] = new Class58(0);
			Static486.aClass58ArrayArrayArray2[0][arg0][arg1].aByte39 = 1;
		}
		Static486.aClass58ArrayArrayArray2[0][arg0][arg1].aClass58_1 = local7;
		Static486.aClass58ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V")
	public static void method5987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg1, 1);
		local14.method2817();
		local14.anInt3419 = arg0;
	}
}
