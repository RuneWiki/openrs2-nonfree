import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "I")
	public static int anInt4693;

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_67 = new Class289(30, 8);

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[50][];

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method3991(@OriginalArg(2) String arg0) {
		Static55.method3549("", "", "", 4, 0, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)V")
	public static void method3993(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub34 local10 = (Class6_Sub34) Static60.aClass209_5.method5038((long) arg0);
		if (local10 != null) {
			local10.aClass204_Sub1_1.method6604();
			Static247.method3616(local10.anInt5400, local10.aBoolean344);
			local10.method9174();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public static void method3996() {
		Static104.aClass362_10.method8543();
		Static630.anInt6215 = 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III[II)V")
	public static void method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg1--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg1) {
			@Pc(15) int local15 = arg1 + 1;
			arg3[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg0;
			arg1 = local45 + 1;
			arg3[arg1] = arg0;
		}
		while (local7 > arg1) {
			arg1++;
			arg3[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIBII[B[B)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(18) int local18 = -(arg4 >> 2);
		@Pc(23) int local23 = -(arg4 & 0x3);
		for (@Pc(26) int local26 = -arg1; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
				local34 = arg2++;
				arg7[local34] += arg6[arg5++];
				@Pc(46) int local46 = arg2++;
				arg7[local46] += arg6[arg5++];
				@Pc(58) int local58 = arg2++;
				arg7[local58] += arg6[arg5++];
				@Pc(70) int local70 = arg2++;
				arg7[local70] += arg6[arg5++];
			}
			for (@Pc(88) int local88 = local23; local88 < 0; local88++) {
				local34 = arg2++;
				arg7[local34] += arg6[arg5++];
			}
			arg5 += arg0;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	public static void method4001() {
		for (@Pc(14) Class6_Sub4_Sub14 local14 = (Class6_Sub4_Sub14) Static205.aClass362_18.method8538(); local14 != null; local14 = (Class6_Sub4_Sub14) Static205.aClass362_18.method8530()) {
			@Pc(19) Class2_Sub1_Sub1_Sub4 local19 = local14.aClass2_Sub1_Sub1_Sub4_1;
			if (Static90.anInt1698 > local19.anInt5811) {
				local14.method9174();
				local19.method4952();
			} else if (local19.anInt5799 <= Static90.anInt1698) {
				local19.method4947();
				if (local19.anInt5829 > 0) {
					@Pc(47) Class6_Sub44 local47 = (Class6_Sub44) Static349.aClass209_32.method5038((long) (local19.anInt5829 - 1));
					if (local47 != null) {
						@Pc(52) Class2_Sub1_Sub1_Sub3_Sub2 local52 = local47.aClass2_Sub1_Sub1_Sub3_Sub2_2;
						if (local52.anInt10006 >= 0 && local52.anInt10006 < Static491.anInt9856 * 512 && local52.anInt10001 >= 0 && local52.anInt10001 < Static393.anInt6574 * 512) {
							local19.method4948(local52.anInt10006, Static284.method4118(local52.anInt10006, local19.aByte140, local52.anInt10001) - local19.anInt5832, local52.anInt10001, Static90.anInt1698);
						}
					}
				}
				if (local19.anInt5829 < 0) {
					@Pc(110) int local110 = -local19.anInt5829 - 1;
					@Pc(117) Class2_Sub1_Sub1_Sub3_Sub1 local117;
					if (local110 == Static659.anInt7559) {
						local117 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2;
					} else {
						local117 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local110];
					}
					if (local117 != null && local117.anInt10006 >= 0 && local117.anInt10006 < Static491.anInt9856 * 512 && local117.anInt10001 >= 0 && Static393.anInt6574 * 512 > local117.anInt10001) {
						local19.method4948(local117.anInt10006, Static284.method4118(local117.anInt10006, local19.aByte140, local117.anInt10001) - local19.anInt5832, local117.anInt10001, Static90.anInt1698);
					}
				}
				local19.method4949(Static332.anInt7620);
				Static23.method582(local19, true);
			}
		}
	}
}
