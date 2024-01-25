import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!mo;")
	public static Class143 aClass143_77;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "I")
	public static int anInt3937;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "I")
	public static int anInt3924 = 0;

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString136 = " is already on your ignore list.";

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
	public static void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static6.anInt136 <= arg4 - arg5 && Static275.anInt5244 >= arg4 + arg5 && Static32.anInt750 <= arg2 - arg5 && arg5 + arg2 <= Static112.anInt2485) {
			Static342.method5835(arg2, arg0, arg4, arg5, arg3, arg1);
		} else {
			Static309.method5328(arg4, arg2, arg0, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)V")
	public static void method3652(@OriginalArg(1) int arg0) {
		@Pc(12) Class14_Sub37 local12 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg0);
		if (local12 != null) {
			local12.method5986();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!kk;IIIII)V")
	public static void method3654(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5367 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static118.anIntArrayArrayArray3[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class14_Sub13_Sub1 local33 = Static127.aClass14_Sub13_Sub1Array1[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt5367; local35++) {
							if (arg0.aClass14_Sub13_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass14_Sub13_Sub1Array3[arg0.anInt5367++] = local33;
						if (arg0.anInt5367 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt5367; local7 < 4; local7++) {
			arg0.aClass14_Sub13_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method3657(@OriginalArg(0) Class10_Sub3_Sub3 arg0) {
		@Pc(13) int local13 = arg0.anInt5928 - Static153.anInt3257;
		@Pc(24) int local24 = arg0.anInt5930 * 128 + arg0.method5353() * 64;
		@Pc(38) int local38 = arg0.anInt5974 * 128 + arg0.method5353() * 64;
		arg0.anInt5908 += (local38 - arg0.anInt5908) / local13;
		arg0.anInt5983 = 0;
		arg0.anInt5910 += (local24 - arg0.anInt5910) / local13;
		if (arg0.anInt5977 == 0) {
			arg0.method5354(8192);
		}
		if (arg0.anInt5977 == 1) {
			arg0.method5354(12288);
		}
		if (arg0.anInt5977 == 2) {
			arg0.method5354(0);
		}
		if (arg0.anInt5977 == 3) {
			arg0.method5354(4096);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method3659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * Static345.anInt6584 >> 8;
		if (arg1 == -1 && !Static134.aBoolean192) {
			Static191.method3631();
		} else if (arg1 != -1 && (arg1 != Static313.anInt6044 || !Static68.method1674()) && local9 != 0 && !Static134.aBoolean192) {
			Static253.method1024(Static304.aClass143_106, arg1, local9);
		}
		Static313.anInt6044 = arg1;
	}
}
