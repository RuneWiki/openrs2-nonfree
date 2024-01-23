import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!qh;")
	public static Class93 aClass93_124;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_43;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1414 = Static186.method3527("floorshadows");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt4430 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!v;ZLclient!vg;I)V")
	public static void method3486(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(2) Class123 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) byte[] local12 = null;
		@Pc(14) Class75 local14 = Static18.aClass75_2;
		synchronized (Static18.aClass75_2) {
			for (@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) Static18.aClass75_2.method2239(); local21 != null; local21 = (Class1_Sub26) Static18.aClass75_2.method2238()) {
				if (local21.aLong173 == (long) arg2 && arg1 == local21.aClass123_6 && local21.anInt4151 == 0) {
					local12 = local21.aByteArray56;
					break;
				}
			}
		}
		if (local12 == null) {
			@Pc(68) byte[] local68 = arg1.method3391(arg2);
			arg0.method3342(true, local68, arg2, arg1);
		} else {
			arg0.method3342(true, local12, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
			return;
		}
		@Pc(34) int local34;
		if (!Static79.method2552() && (Static159.aByteArrayArrayArray13[0][arg1][arg4] & 0x2) == 0) {
			local34 = arg2;
			if ((Static159.aByteArrayArrayArray13[arg2][arg1][arg4] & 0x8) != 0) {
				local34 = 0;
			}
			if (local34 != Static185.anInt3848) {
				return;
			}
		}
		local34 = arg2;
		if (arg2 < 3 && (Static159.aByteArrayArrayArray13[1][arg1][arg4] & 0x2) == 2) {
			local34 = arg2 + 1;
		}
		Static164.method2727(local34, arg0, arg1, arg4, Static22.aClass16Array1[arg2], arg2);
		if (arg5 >= 0) {
			@Pc(91) boolean local91 = Static24.aBoolean14;
			Static24.aBoolean14 = true;
			Static195.method3168(arg3, arg5, Static22.aClass16Array1[arg2], arg4, arg1, false, arg2, local34, arg6);
			Static24.aBoolean14 = local91;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!qh;)Lclient!hh;")
	public static Class50 method3491(@OriginalArg(1) Class93 arg0) {
		if (Static170.method2810(Static35.method552(arg0)) == 0) {
			return null;
		} else if (arg0.aClass50_1190 == null || arg0.aClass50_1190.method1222().method1249() == 0) {
			return Static131.aBoolean115 ? Static39.aClass50_305 : null;
		} else {
			return arg0.aClass50_1190;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIIII)V")
	public static void method3492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static232.method3498(arg2);
		@Pc(9) int local9 = arg2 - arg4;
		if (local9 < 0) {
			local9 = 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(40) int local40 = local9;
		@Pc(43) int local43 = -local9;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(95) int local95;
		if (arg0 >= Static49.anInt1030 && arg0 <= Static177.anInt3701) {
			@Pc(61) int[] local61 = Static139.anIntArrayArray21[arg0];
			local70 = Static92.method1433(Static131.anInt2713, arg5 - arg2, Static135.anInt2790);
			local78 = Static92.method1433(Static131.anInt2713, arg2 + arg5, Static135.anInt2790);
			local87 = Static92.method1433(Static131.anInt2713, arg5 - local9, Static135.anInt2790);
			local95 = Static92.method1433(Static131.anInt2713, local9 + arg5, Static135.anInt2790);
			Static107.method1641(local70, arg3, local61, local87);
			Static107.method1641(local87, arg1, local61, local95);
			Static107.method1641(local95, arg3, local61, local78);
		}
		@Pc(115) int local115 = -1;
		@Pc(117) int local117 = -1;
		while (local24 > local18) {
			local117 += 2;
			local115 += 2;
			local43 += local117;
			local27 += local115;
			if (local43 >= 0 && local40 >= 1) {
				local40--;
				local43 -= local40 << 1;
				Static110.anIntArray235[local40] = local18;
			}
			local18++;
			@Pc(260) int local260;
			@Pc(269) int local269;
			@Pc(276) int[] local276;
			@Pc(164) int local164;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local164 = arg0 - local24;
				local70 = local24 + arg0;
				if (Static49.anInt1030 <= local70 && Static177.anInt3701 >= local164) {
					if (local9 <= local24) {
						local78 = Static92.method1433(Static131.anInt2713, arg5 + local18, Static135.anInt2790);
						local87 = Static92.method1433(Static131.anInt2713, arg5 - local18, Static135.anInt2790);
						if (local70 <= Static177.anInt3701) {
							Static107.method1641(local87, arg3, Static139.anIntArrayArray21[local70], local78);
						}
						if (Static49.anInt1030 <= local164) {
							Static107.method1641(local87, arg3, Static139.anIntArrayArray21[local164], local78);
						}
					} else {
						local78 = Static110.anIntArray235[local24];
						local87 = Static92.method1433(Static131.anInt2713, arg5 + local18, Static135.anInt2790);
						local95 = Static92.method1433(Static131.anInt2713, arg5 - local18, Static135.anInt2790);
						local260 = Static92.method1433(Static131.anInt2713, local78 + arg5, Static135.anInt2790);
						local269 = Static92.method1433(Static131.anInt2713, arg5 - local78, Static135.anInt2790);
						if (local70 <= Static177.anInt3701) {
							local276 = Static139.anIntArrayArray21[local70];
							Static107.method1641(local95, arg3, local276, local269);
							Static107.method1641(local269, arg1, local276, local260);
							Static107.method1641(local260, arg3, local276, local87);
						}
						if (local164 >= Static49.anInt1030) {
							local276 = Static139.anIntArrayArray21[local164];
							Static107.method1641(local95, arg3, local276, local269);
							Static107.method1641(local269, arg1, local276, local260);
							Static107.method1641(local260, arg3, local276, local87);
						}
					}
				}
			}
			local70 = arg0 + local18;
			local164 = arg0 - local18;
			if (local70 >= Static49.anInt1030 && local164 <= Static177.anInt3701) {
				local78 = arg5 + local24;
				local87 = arg5 - local24;
				if (local78 >= Static131.anInt2713 && local87 <= Static135.anInt2790) {
					local78 = Static92.method1433(Static131.anInt2713, local78, Static135.anInt2790);
					local87 = Static92.method1433(Static131.anInt2713, local87, Static135.anInt2790);
					if (local18 < local9) {
						local95 = local40 >= local18 ? local40 : Static110.anIntArray235[local18];
						local260 = Static92.method1433(Static131.anInt2713, arg5 + local95, Static135.anInt2790);
						local269 = Static92.method1433(Static131.anInt2713, arg5 - local95, Static135.anInt2790);
						if (local70 <= Static177.anInt3701) {
							local276 = Static139.anIntArrayArray21[local70];
							Static107.method1641(local87, arg3, local276, local269);
							Static107.method1641(local269, arg1, local276, local260);
							Static107.method1641(local260, arg3, local276, local78);
						}
						if (local164 >= Static49.anInt1030) {
							local276 = Static139.anIntArrayArray21[local164];
							Static107.method1641(local87, arg3, local276, local269);
							Static107.method1641(local269, arg1, local276, local260);
							Static107.method1641(local260, arg3, local276, local78);
						}
					} else {
						if (local70 <= Static177.anInt3701) {
							Static107.method1641(local87, arg3, Static139.anIntArrayArray21[local70], local78);
						}
						if (local164 >= Static49.anInt1030) {
							Static107.method1641(local87, arg3, Static139.anIntArrayArray21[local164], local78);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Lclient!qf;")
	public static Class92 method3496() {
		try {
			return (Class92) Class.forName("Class92_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(20) Throwable local20) {
			return new Class92_Sub1();
		}
	}
}
