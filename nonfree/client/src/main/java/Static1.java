import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_1 = new Class269(7, 4);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
	public static final int[] anIntArray1 = new int[3];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!za;Lclient!ot;III)V")
	public static void method8(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class169 local12;
		if (arg3 < Static37.anInt666) {
			local12 = Static359.aClass169ArrayArrayArray5[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass25_Sub2_2 != null && local12.aClass25_Sub2_2.method4602()) {
				arg1.method4609(0, 0, true, Static5.anInt78, local12.aClass25_Sub2_2, arg0);
			}
		}
		if (arg4 < Static37.anInt666) {
			local12 = Static359.aClass169ArrayArrayArray5[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub2_2 != null && local12.aClass25_Sub2_2.method4602()) {
				arg1.method4609(Static5.anInt78, 0, true, 0, local12.aClass25_Sub2_2, arg0);
			}
		}
		if (arg3 < Static37.anInt666 && arg4 < Static408.anInt6716) {
			local12 = Static359.aClass169ArrayArrayArray5[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub2_2 != null && local12.aClass25_Sub2_2.method4602()) {
				arg1.method4609(Static5.anInt78, 0, true, Static5.anInt78, local12.aClass25_Sub2_2, arg0);
			}
		}
		if (arg3 < Static37.anInt666 && arg4 > 0) {
			local12 = Static359.aClass169ArrayArrayArray5[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass25_Sub2_2 != null && local12.aClass25_Sub2_2.method4602()) {
				arg1.method4609(-Static5.anInt78, 0, true, Static5.anInt78, local12.aClass25_Sub2_2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method9() {
		if (Static306.method4183(Static312.anInt5414) || Static40.method585(Static312.anInt5414)) {
			Static348.method4714(5000, Static360.anInt6145 >> 10, Static213.anInt258 >> 10);
		} else {
			@Pc(22) int local22 = Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] >> 3;
			@Pc(29) int local29 = Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] >> 3;
			if (local22 >= 0 && local22 < Static296.anInt5187 >> 3 && local29 >= 0 && Static206.anInt3607 >> 3 > local29) {
				Static348.method4714(5000, local29, local22);
			} else {
				Static348.method4714(0, Static206.anInt3607 >> 4, Static296.anInt5187 >> 4);
			}
		}
		Static125.method1990();
		Static31.method399();
		Static350.method4742();
		Static294.method4023();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ii;III)V")
	public static void method12(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static261.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt6702 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub7Array2[arg0.anInt6702++] = Static45.aClass137Array4[local21 - 1].aClass1_Sub7_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt6702; local21 < 4; local21++) {
			arg0.aClass1_Sub7Array2[local21] = null;
		}
	}
}
