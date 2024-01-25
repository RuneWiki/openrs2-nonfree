import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt3176;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public static int anInt3179;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	public static int anInt3180;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "[S")
	public static short[] aShortArray38;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_74 = new Class85("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
	public static int[] anIntArray327 = new int[2];

	@OriginalMember(owner = "client!js", name = "k", descriptor = "[Lclient!rg;")
	public static final Class5_Sub12[] aClass5_Sub12Array1 = new Class5_Sub12[2048];

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	public static int anInt3181 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method2836(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (long) arg0.charAt(local15) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public static void method2837() {
		for (@Pc(4) Class5_Sub20 local4 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local4 != null; local4 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			if (Static18.method335(local4.anInt2094)) {
				Static195.method3461(local4);
			}
		}
		if (anInt3181 == 1) {
			Static93.aBoolean128 = false;
			Static184.method5033(Static187.anInt3710, Static127.anInt2450, Static334.anInt6466, Static141.anInt2737);
			return;
		}
		Static184.method5033(Static187.anInt3710, Static127.anInt2450, Static334.anInt6466, Static141.anInt2737);
		@Pc(43) int local43 = Static268.aClass36_8.method640(Static8.aClass85_6.method2020(Static41.anInt726));
		for (@Pc(48) Class5_Sub20 local48 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local48 != null; local48 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			@Pc(53) int local53 = Static5.method92(local48);
			if (local53 > local43) {
				local43 = local53;
			}
		}
		Static127.anInt2450 = (Static133.aBoolean203 ? 26 : 22) + anInt3181 * 16;
		Static334.anInt6466 = local43 + 8;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
	public static void method2839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17;
		if (arg1 < arg3) {
			for (local17 = arg1; local17 < arg3; local17++) {
				Static129.anIntArrayArray46[local17][arg2] = arg0;
			}
		} else {
			for (local17 = arg3; local17 < arg1; local17++) {
				Static129.anIntArrayArray46[local17][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII[I)V")
	public static void method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(5) int local5 = arg1 - 1;
		@Pc(9) int local9 = local5 - 7;
		while (arg2 < local9) {
			@Pc(21) int local21 = arg2 + 1;
			arg3[local21] = arg0;
			@Pc(26) int local26 = local21 + 1;
			arg3[local26] = arg0;
			@Pc(31) int local31 = local26 + 1;
			arg3[local31] = arg0;
			@Pc(36) int local36 = local31 + 1;
			arg3[local36] = arg0;
			@Pc(41) int local41 = local36 + 1;
			arg3[local41] = arg0;
			@Pc(46) int local46 = local41 + 1;
			arg3[local46] = arg0;
			@Pc(51) int local51 = local46 + 1;
			arg3[local51] = arg0;
			arg2 = local51 + 1;
			arg3[arg2] = arg0;
		}
		while (arg2 < local5) {
			arg2++;
			arg3[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static161.method2842(arg6, Static346.anInt6668, Static75.anInt1447);
		@Pc(17) int local17 = Static161.method2842(arg0, Static346.anInt6668, Static75.anInt1447);
		@Pc(23) int local23 = Static161.method2842(arg5, Static353.anInt6760, Static163.anInt3234);
		@Pc(29) int local29 = Static161.method2842(arg2, Static353.anInt6760, Static163.anInt3234);
		@Pc(38) int local38 = Static161.method2842(arg6 + arg3, Static346.anInt6668, Static75.anInt1447);
		@Pc(46) int local46 = Static161.method2842(arg0 - arg3, Static346.anInt6668, Static75.anInt1447);
		for (@Pc(48) int local48 = local11; local48 < local38; local48++) {
			method2840(arg4, local29, local23, Static129.anIntArrayArray46[local48]);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			method2840(arg4, local29, local23, Static129.anIntArrayArray46[local73]);
		}
		@Pc(99) int local99 = Static161.method2842(arg5 + arg3, Static353.anInt6760, Static163.anInt3234);
		@Pc(108) int local108 = Static161.method2842(arg2 - arg3, Static353.anInt6760, Static163.anInt3234);
		for (@Pc(110) int local110 = local38; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static129.anIntArrayArray46[local110];
			method2840(arg4, local99, local23, local116);
			method2840(arg1, local108, local99, local116);
			method2840(arg4, local29, local108, local116);
		}
	}
}
