import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[Lclient!ah;")
	public static Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method3667() {
		if (Static63.anInt1592 == 0) {
			return;
		}
		try {
			if (++Static188.anInt4193 > 1500) {
				if (Static22.aClass41_1 != null) {
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
				}
				if (Static275.anInt5923 >= 1) {
					Static275.anInt5910 = -5;
					Static63.anInt1592 = 0;
					return;
				}
				Static188.anInt4193 = 0;
				Static63.anInt1592 = 1;
				if (Static176.anInt3984 == Static23.anInt486) {
					Static23.anInt486 = Static25.anInt510;
				} else {
					Static23.anInt486 = Static176.anInt3984;
				}
				Static275.anInt5923++;
			}
			if (Static63.anInt1592 == 1) {
				Static36.aClass43_1 = Static43.aClass66_1.method1616(Static23.anInt486, Static34.aString31);
				Static63.anInt1592 = 2;
			}
			@Pc(131) int local131;
			if (Static63.anInt1592 == 2) {
				if (Static36.aClass43_1.anInt1456 == 2) {
					throw new IOException();
				}
				if (Static36.aClass43_1.anInt1456 != 1) {
					return;
				}
				Static22.aClass41_1 = new Class41((Socket) Static36.aClass43_1.anObject3, Static43.aClass66_1);
				Static36.aClass43_1 = null;
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				local131 = Static22.aClass41_1.method1066();
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				if (local131 != 101) {
					Static63.anInt1592 = 0;
					Static275.anInt5910 = local131;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				}
				Static63.anInt1592 = 3;
			}
			if (Static63.anInt1592 == 3) {
				if (Static22.aClass41_1.method1067() < 2) {
					return;
				}
				local131 = Static22.aClass41_1.method1066() << 8 | Static22.aClass41_1.method1066();
				Static64.method1249(local131);
				if (Static113.anInt2454 != -1) {
					Static63.anInt1592 = 0;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					Static220.method3908();
					return;
				}
				Static63.anInt1592 = 0;
				Static275.anInt5910 = 6;
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
				return;
			}
		} catch (@Pc(216) IOException local216) {
			if (Static22.aClass41_1 != null) {
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
			}
			if (Static275.anInt5923 < 1) {
				if (Static23.anInt486 == Static176.anInt3984) {
					Static23.anInt486 = Static25.anInt510;
				} else {
					Static23.anInt486 = Static176.anInt3984;
				}
				Static275.anInt5923++;
				Static188.anInt4193 = 0;
				Static63.anInt1592 = 1;
			} else {
				Static275.anInt5910 = -4;
				Static63.anInt1592 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
	public static int method3672(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIII)V")
	public static void method3673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 11);
		local8.method1192();
		local8.anInt1558 = arg1;
		local8.anInt1565 = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII[BZI[Lclient!de;III)V")
	public static void method3674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Class36[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) Class1_Sub16 local6 = new Class1_Sub16(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(22) int local22 = local6.method2647();
			if (local22 == 0) {
				return;
			}
			local12 += local22;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local6.method2618();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(53) int local53 = local35 & 0x3F;
				@Pc(59) int local59 = local35 >> 6 & 0x3F;
				@Pc(63) int local63 = local35 >> 12;
				@Pc(67) int local67 = local6.method2655();
				@Pc(71) int local71 = local67 & 0x3;
				@Pc(75) int local75 = local67 >> 2;
				if (local63 == arg7 && local59 >= arg9 && arg9 + 8 > local59 && arg0 <= local53 && arg0 + 8 > local53) {
					@Pc(111) Class30 local111 = Static268.method4511(local12);
					@Pc(129) int local129 = arg3 + Static177.method3226(local111.anInt863, local111.anInt848, local59 & 0x7, arg1, local71, local53 & 0x7);
					@Pc(146) int local146 = Static156.method2882(local111.anInt848, local53 & 0x7, local59 & 0x7, local111.anInt863, arg1, local71) + arg2;
					if (local129 > 0 && local146 > 0 && local129 < 103 && local146 < 103) {
						@Pc(164) Class36 local164 = null;
						if (!arg5) {
							@Pc(169) int local169 = arg8;
							if ((Static126.aByteArrayArrayArray24[1][local129][local146] & 0x2) == 2) {
								local169 = arg8 - 1;
							}
							if (local169 >= 0) {
								local164 = arg6[local169];
							}
						}
						Static272.method4541(arg8, arg8, local164, local71 + arg1 & 0x3, local129, !arg5, arg5, local75, local12, local146);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!df;ILclient!kb;)Z")
	public static boolean method3675(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class1_Sub3_Sub2 arg2, @OriginalArg(4) Class83 arg3) {
		Static141.aClass1_Sub3_Sub2_2 = arg2;
		Static20.aClass83_177 = arg3;
		Static285.aClass83_198 = arg1;
		Static284.aClass83_197 = arg0;
		return true;
	}
}
