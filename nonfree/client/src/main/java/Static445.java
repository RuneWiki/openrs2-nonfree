import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
	public static int[] anIntArray720;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!vt;")
	public static final Class262 aClass262_12 = new Class262();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method5849(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static105.anInt2415;
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			@Pc(24) Class50 local24 = Static201.aClass5_1.method60(arg0[local16]);
			if (local24.anInt1734 != -1) {
				@Pc(37) Class137 local37 = (Class137) Static329.aClass91_83.method1988((long) local24.anInt1734);
				if (local37 == null) {
					@Pc(45) Class266 local45 = Static470.method6054(Static140.aClass211_38, local24.anInt1734, 0);
					if (local45 != null) {
						local37 = Static30.aClass106_3.method5938(local45);
						Static329.aClass91_83.method1990(local37, (long) local24.anInt1734);
					}
				}
				if (local37 != null) {
					Static154.aClass137Array6[local9] = local37;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)Z")
	public static boolean method5852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg5 - arg2;
		for (@Pc(18) int local18 = arg0; local18 < local9; local18++) {
			Static228.method3480(arg4, arg1, Static60.anIntArrayArray14[local18], arg3);
		}
		@Pc(36) int local36 = arg4 + arg2;
		@Pc(40) int local40 = arg3 - arg2;
		for (@Pc(42) int local42 = arg5; local42 > local13; local42--) {
			Static228.method3480(arg4, arg1, Static60.anIntArrayArray14[local42], arg3);
		}
		for (@Pc(58) int local58 = local9; local58 <= local13; local58++) {
			@Pc(64) int[] local64 = Static60.anIntArrayArray14[local58];
			Static228.method3480(arg4, arg1, local64, local36);
			Static228.method3480(local36, arg6, local64, local40);
			Static228.method3480(local40, arg1, local64, arg3);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ii;IIII)V")
	public static void method5855(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.anInt3798 == -1 && arg1.anIntArray367 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg4 > arg1.anInt3800) {
			local16 = arg4 - arg1.anInt3800;
		} else if (arg4 < arg1.anInt3790) {
			local16 = arg1.anInt3790 - arg4;
		}
		@Pc(54) int local54 = arg1.anInt3797 * Static12.aClass34_Sub1_1.anInt7175 >> 8;
		if (arg1.anInt3793 < arg3) {
			local16 += arg3 - arg1.anInt3793;
		} else if (arg3 < arg1.anInt3803) {
			local16 += arg1.anInt3803 - arg3;
		}
		if (arg1.anInt3795 == 0 || local16 - 64 > arg1.anInt3795 || Static12.aClass34_Sub1_1.anInt7175 == 0 || arg1.anInt3796 != arg0) {
			if (arg1.aClass1_Sub19_Sub4_3 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(arg1.aClass1_Sub19_Sub4_3);
				arg1.aClass1_Sub19_Sub4_3 = null;
			}
			if (arg1.aClass1_Sub19_Sub4_4 != null) {
				Static12.aClass1_Sub19_Sub2_1.method3181(arg1.aClass1_Sub19_Sub4_4);
				arg1.aClass1_Sub19_Sub4_4 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(152) int local152 = (arg1.anInt3795 - local16) * local54 / arg1.anInt3795;
		if (arg1.aClass1_Sub19_Sub4_3 != null) {
			arg1.aClass1_Sub19_Sub4_3.method5832(local152);
		} else if (arg1.anInt3798 >= 0) {
			@Pc(170) Class112 local170 = Static463.method2688(Static125.aClass211_33, arg1.anInt3798, 0);
			if (local170 != null) {
				@Pc(177) Class1_Sub12_Sub1 local177 = local170.method2690().method3716(Static441.aClass233_1);
				@Pc(182) Class1_Sub19_Sub4 local182 = Static468.method5825(local177, local152);
				local182.method5828(-1);
				Static12.aClass1_Sub19_Sub2_1.method3187(local182);
				arg1.aClass1_Sub19_Sub4_3 = local182;
			}
		}
		if (arg1.aClass1_Sub19_Sub4_4 != null) {
			arg1.aClass1_Sub19_Sub4_4.method5832(local152);
			if (!arg1.aClass1_Sub19_Sub4_4.method6175()) {
				arg1.aClass1_Sub19_Sub4_4 = null;
			}
		} else if (arg1.anIntArray367 != null && (arg1.anInt3794 -= arg2) <= 0) {
			@Pc(226) int local226 = (int) ((double) arg1.anIntArray367.length * Math.random());
			@Pc(234) Class112 local234 = Static463.method2688(Static125.aClass211_33, arg1.anIntArray367[local226], 0);
			if (local234 != null) {
				@Pc(241) Class1_Sub12_Sub1 local241 = local234.method2690().method3716(Static441.aClass233_1);
				@Pc(246) Class1_Sub19_Sub4 local246 = Static468.method5825(local241, local152);
				local246.method5828(0);
				Static12.aClass1_Sub19_Sub2_1.method3187(local246);
				arg1.aClass1_Sub19_Sub4_4 = local246;
				arg1.anInt3794 = arg1.anInt3791 + (int) (Math.random() * (double) (arg1.anInt3792 - arg1.anInt3791));
				return;
			}
		}
	}
}
