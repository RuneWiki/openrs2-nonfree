import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public static int anInt6134;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JBIZI)Ljava/lang/String;")
	public static String method5129(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(33) boolean local33 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local33 = true;
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(26);
		@Pc(51) int local51;
		@Pc(56) int local56;
		if (arg3 > 0) {
			for (local51 = 0; local51 < arg3; local51++) {
				local56 = (int) arg0;
				arg0 /= 10L;
				local47.append((char) (local56 + 48 - (int) arg0 * 10));
			}
			local47.append(local7);
		}
		local51 = 0;
		while (true) {
			local56 = (int) arg0;
			arg0 /= 10L;
			local47.append((char) (local56 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local33) {
					local47.append('-');
				}
				return local47.reverse().toString();
			}
			if (arg2) {
				local51++;
				if (local51 % 3 == 0) {
					local47.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5130(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static165.anInt2940; local11++) {
			if (arg0.equalsIgnoreCase(Static208.aStringArray24[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([II[ILclient!uj;[I)V")
	public static void method5131(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class3_Sub3_Sub6_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg1[local8];
			@Pc(22) int local22 = arg0[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && arg2.aClass38Array3.length > local24; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg2.aClass38Array3[local24] = null;
					} else {
						@Pc(46) Class83 local46 = Static244.aClass174_2.method4011(local14);
						@Pc(49) int local49 = local46.anInt1981;
						@Pc(54) Class38 local54 = arg2.aClass38Array3[local24];
						if (local54 != null) {
							if (local54.anInt918 == local14) {
								if (local49 == 0) {
									local54 = arg2.aClass38Array3[local24] = null;
								} else if (local49 == 1) {
									local54.anInt921 = local22;
									local54.anInt920 = 0;
									local54.anInt922 = 0;
									local54.anInt916 = 1;
									local54.anInt919 = 0;
									Static34.method731(local46, arg2.aByte93, 0, false, arg2.anInt6675, arg2.anInt6677);
								} else if (local49 == 2) {
									local54.anInt919 = 0;
								}
							} else if (local46.anInt1998 >= Static244.aClass174_2.method4011(local54.anInt918).anInt1998) {
								local54 = arg2.aClass38Array3[local24] = null;
							}
						}
						if (local54 == null) {
							local54 = arg2.aClass38Array3[local24] = new Class38();
							local54.anInt919 = 0;
							local54.anInt921 = local22;
							local54.anInt920 = 0;
							local54.anInt918 = local14;
							local54.anInt922 = 0;
							local54.anInt916 = 1;
							Static34.method731(local46, arg2.aByte93, 0, false, arg2.anInt6675, arg2.anInt6677);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method5132(@OriginalArg(1) Class3_Sub3_Sub6 arg0) {
		if (arg0 instanceof Class3_Sub3_Sub6_Sub2) {
			@Pc(9) Class3_Sub3_Sub6_Sub2 local9 = (Class3_Sub3_Sub6_Sub2) arg0;
			if (local9.aClass17_1 != null) {
				Static155.method2532(local9, local9.aByte93 != Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93);
			}
		} else if (arg0 instanceof Class3_Sub3_Sub6_Sub1) {
			@Pc(31) Class3_Sub3_Sub6_Sub1 local31 = (Class3_Sub3_Sub6_Sub1) arg0;
			Static26.method2139(local31.aByte93 != Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93, local31);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public static int method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static426.aByteArrayArray46 == null ? 0 : Static426.aByteArrayArray46[arg0][arg1] & 0xFF;
	}
}
