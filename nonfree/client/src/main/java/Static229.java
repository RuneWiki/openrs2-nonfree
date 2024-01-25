import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!ee;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	public static int anInt4562;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Lclient!kb;")
	public static Class52 aClass52_25;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!p;")
	public static Class160 aClass160_3;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "[[[Lclient!dg;")
	public static Class49[][][] aClass49ArrayArrayArray6;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public static int anInt4565 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)V")
	public static void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static314.anInt6030 < arg1 || Static142.anInt3103 > arg4) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg2 < Static61.anInt1534) {
			local31 = false;
			arg2 = Static61.anInt1534;
		} else if (Static168.anInt3509 >= arg2) {
			local31 = true;
		} else {
			local31 = false;
			arg2 = Static168.anInt3509;
		}
		@Pc(59) boolean local59;
		if (Static61.anInt1534 > arg0) {
			arg0 = Static61.anInt1534;
			local59 = false;
		} else if (Static168.anInt3509 >= arg0) {
			local59 = true;
		} else {
			arg0 = Static168.anInt3509;
			local59 = false;
		}
		if (Static142.anInt3103 <= arg1) {
			Static282.method4681(arg3, arg2, Static323.anIntArrayArray55[arg1++], arg0);
		} else {
			arg1 = Static142.anInt3103;
		}
		if (Static314.anInt6030 >= arg4) {
			Static282.method4681(arg3, arg2, Static323.anIntArrayArray55[arg4--], arg0);
		} else {
			arg4 = Static314.anInt6030;
		}
		@Pc(111) int local111;
		if (local31 && local59) {
			for (local111 = arg1; local111 <= arg4; local111++) {
				@Pc(155) int[] local155 = Static323.anIntArrayArray55[local111];
				local155[arg2] = local155[arg0] = arg3;
			}
		} else if (local31) {
			for (local111 = arg1; local111 <= arg4; local111++) {
				Static323.anIntArrayArray55[local111][arg2] = arg3;
			}
		} else if (local59) {
			for (local111 = arg1; local111 <= arg4; local111++) {
				Static323.anIntArrayArray55[local111][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class7_Sub1_Sub6 method4021(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub1_Sub6 local10 = (Class7_Sub1_Sub6) Static122.aClass154_2.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static194.aClass180_21.method4560(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static24.method419(local20);
			Static122.aClass154_2.method4078(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!r;)V")
	public static void method4022(@OriginalArg(1) Class7_Sub32 arg0) {
		if (!Static169.aBoolean260) {
			arg0.method5648();
			Static33.anInt735--;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method4023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 >= Static61.anInt1534 && arg5 <= Static168.anInt3509 && Static61.anInt1534 <= arg7 && Static168.anInt3509 >= arg7 && arg2 >= Static61.anInt1534 && arg2 <= Static168.anInt3509 && Static61.anInt1534 <= arg4 && arg4 <= Static168.anInt3509 && Static142.anInt3103 <= arg1 && Static314.anInt6030 >= arg1 && Static142.anInt3103 <= arg8 && arg8 <= Static314.anInt6030 && Static142.anInt3103 <= arg0 && arg0 <= Static314.anInt6030 && Static142.anInt3103 <= arg6 && Static314.anInt6030 >= arg6) {
			Static102.method2039(arg8, arg4, arg6, arg7, arg1, arg5, arg0, arg3, arg2);
		} else {
			Static205.method3649(arg0, arg8, arg1, arg4, arg3, arg6, arg2, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!mp;)V")
	public static void method4024(@OriginalArg(0) Class7_Sub16_Sub1 arg0) {
		if (Static105.anInt6014 >= 255) {
			return;
		}
		Static116.aClass7_Sub16_Sub1Array1[Static105.anInt6014] = arg0;
		Static42.aBooleanArray9[Static105.anInt6014] = false;
		Static105.anInt6014++;
		@Pc(18) int local18 = arg0.anInt4088;
		if (arg0.aBoolean318) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4088;
		if (arg0.aBoolean319) {
			local26 = Static41.anInt1075 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4072 + 64 - arg0.anInt4076 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4072 + arg0.anInt4076 - 64 >> 7;
			if (local66 >= Static174.anInt3604) {
				local66 = Static174.anInt3604 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray70[local38++];
				@Pc(96) int local96 = (arg0.anInt4070 + 64 - arg0.anInt4076 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static346.anInt6536) {
					local104 = Static346.anInt6536 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static142.anIntArrayArrayArray11[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static142.anIntArrayArrayArray11[local35][local117][local75] = local126 | Static105.anInt6014;
					} else if ((local126 & 0xFF00) == 0) {
						Static142.anIntArrayArrayArray11[local35][local117][local75] = local126 | Static105.anInt6014 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static142.anIntArrayArrayArray11[local35][local117][local75] = local126 | Static105.anInt6014 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static142.anIntArrayArrayArray11[local35][local117][local75] = local126 | Static105.anInt6014 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lclient!wn;")
	public static Class82 method4025() {
		try {
			return (Class82) Class.forName("Class82_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	public static void method4026(@OriginalArg(1) int arg0) {
		Static313.anInt5978 = arg0;
		@Pc(7) Class103 local7 = Static271.aClass103_57;
		synchronized (Static271.aClass103_57) {
			Static271.aClass103_57.method2678();
		}
		local7 = Static228.aClass103_45;
		synchronized (Static228.aClass103_45) {
			Static228.aClass103_45.method2678();
		}
		local7 = Static283.aClass103_60;
		synchronized (Static283.aClass103_60) {
			Static283.aClass103_60.method2678();
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method4027() {
		if (Static128.aClass89_3.method5447()) {
			Static226.method4016();
			Static128.aClass89_3.method5482(Static269.aCanvas4);
			Static183.method3347();
		} else {
			Static244.method4219(Static329.anInt6220);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V")
	public static void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static18.aFloat7 = local11;
		if (Static118.anInt6324 == 2) {
			Static292.anInt5691 = 0;
			Static138.anInt3022 = local3;
			Static179.anInt3660 = local11;
		}
		Static351.aFloat80 = local3;
		Static44.method977();
		Static13.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method4029(@OriginalArg(0) Class26 arg0) {
		@Pc(15) Class26 local15 = Static249.method1113(arg0);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local15 == null) {
			local23 = Static214.anInt4266;
			local20 = Static128.anInt2823;
		} else {
			local20 = local15.anInt523;
			local23 = local15.anInt515;
		}
		Static4.method60(arg0, false, local20, local23);
		Static292.method4789(local23, arg0, local20);
	}
}
