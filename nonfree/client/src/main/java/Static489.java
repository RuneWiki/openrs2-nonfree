import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	public static int anInt8325;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([I[II[ILclient!hb;)V")
	public static void method6726(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class11_Sub1_Sub1_Sub3_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(14) int local14 = arg1[local3];
			@Pc(18) int local18 = arg2[local3];
			@Pc(22) int local22 = arg0[local3];
			for (@Pc(24) int local24 = 0; local18 != 0 && arg3.aClass221Array3.length > local24; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg3.aClass221Array3[local24] = null;
					} else {
						@Pc(39) Class197 local39 = Static223.aClass245_1.method5312(local14);
						@Pc(42) int local42 = local39.anInt5072;
						@Pc(47) Class221 local47 = arg3.aClass221Array3[local24];
						if (local47 != null) {
							if (local47.anInt5858 == local14) {
								if (local42 == 0) {
									local47 = arg3.aClass221Array3[local24] = null;
								} else if (local42 == 1) {
									local47.anInt5857 = 1;
									local47.anInt5856 = local22;
									local47.anInt5859 = 0;
									local47.anInt5854 = 0;
									local47.anInt5860 = 0;
									if (!arg3.aBoolean577) {
										Static473.method6515(arg3, local39, 0);
									}
								} else if (local42 == 2) {
									local47.anInt5859 = 0;
								}
							} else if (local39.anInt5076 >= Static223.aClass245_1.method5312(local47.anInt5858).anInt5076) {
								local47 = arg3.aClass221Array3[local24] = null;
							}
						}
						if (local47 == null) {
							local47 = arg3.aClass221Array3[local24] = new Class221();
							local47.anInt5857 = 1;
							local47.anInt5859 = 0;
							local47.anInt5860 = 0;
							local47.anInt5858 = local14;
							local47.anInt5854 = 0;
							local47.anInt5856 = local22;
							if (!arg3.aBoolean577) {
								Static473.method6515(arg3, local39, 0);
							}
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;I)V")
	public static void method6727(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class57 local9 = Static253.aClass57Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static253.aClass57Array1[local15] = Static253.aClass57Array1[local15 - 1];
		}
		if (local9 == null) {
			local9 = new Class57(arg2, arg7, arg6, arg1, arg3, arg5, arg4, arg0);
		} else {
			local9.method1365(arg5, arg7, arg6, arg2, arg3, arg1, arg4, arg0);
		}
		Static462.anInt8035++;
		Static253.aClass57Array1[0] = local9;
		Static203.anInt3823 = Static259.anInt4739;
	}
}
