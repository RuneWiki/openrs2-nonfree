import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt10027;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_92 = new Class208(11, 7);

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
	public static int anInt10026 = 0;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public static int anInt10028 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method8460() {
		Static481.method7208();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vs;III)V")
	public static void method8461(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class97 local12;
		if (arg2 < Static544.anInt9353) {
			local12 = Static272.aClass97ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass20_Sub2_Sub5_1 != null && local12.aClass20_Sub2_Sub5_1.method9011()) {
				arg0.method9018(local12.aClass20_Sub2_Sub5_1, true, 0, Static565.aClass100_15, 0, Static246.anInt4917);
			}
		}
		if (arg3 < Static544.anInt9353) {
			local12 = Static272.aClass97ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass20_Sub2_Sub5_1 != null && local12.aClass20_Sub2_Sub5_1.method9011()) {
				arg0.method9018(local12.aClass20_Sub2_Sub5_1, true, 0, Static565.aClass100_15, Static246.anInt4917, 0);
			}
		}
		if (arg2 < Static544.anInt9353 && arg3 < Static608.anInt10072) {
			local12 = Static272.aClass97ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass20_Sub2_Sub5_1 != null && local12.aClass20_Sub2_Sub5_1.method9011()) {
				arg0.method9018(local12.aClass20_Sub2_Sub5_1, true, 0, Static565.aClass100_15, Static246.anInt4917, Static246.anInt4917);
			}
		}
		if (arg2 < Static544.anInt9353 && arg3 > 0) {
			local12 = Static272.aClass97ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass20_Sub2_Sub5_1 != null && local12.aClass20_Sub2_Sub5_1.method9011()) {
				arg0.method9018(local12.aClass20_Sub2_Sub5_1, true, 0, Static565.aClass100_15, -Static246.anInt4917, Static246.anInt4917);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[B[BIIIII)V")
	public static void method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg5++;
				arg2[local26] = (byte) (arg2[local26] - arg3[arg4++]);
				@Pc(39) int local39 = arg5++;
				arg2[local39] = (byte) (arg2[local39] - arg3[arg4++]);
				@Pc(52) int local52 = arg5++;
				arg2[local52] = (byte) (arg2[local52] - arg3[arg4++]);
				@Pc(65) int local65 = arg5++;
				arg2[local65] = (byte) (arg2[local65] - arg3[arg4++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg5++;
				arg2[local26] = (byte) (arg2[local26] - arg3[arg4++]);
			}
			arg4 += arg6;
			arg5 += arg0;
		}
	}
}
