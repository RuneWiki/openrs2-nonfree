import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static int anInt3383;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
	public static int[] anIntArray360 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!oj;")
	public static Class84 aClass84_28 = new Class84(4);

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1102 = Static186.method3527(":clanreq:");

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lclient!qh;")
	public static Class93 method2725(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static54.aClass93ArrayArray1[local3] == null || Static54.aClass93ArrayArray1[local3][local16] == null) {
			@Pc(30) boolean local30 = Static1.method31(local3);
			if (!local30) {
				return null;
			}
		}
		return Static54.aClass93ArrayArray1[local3][local16];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILclient!cg;II)V")
	public static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg1 == 0) {
			local7 = Static14.method199(arg5, arg2, arg3);
		} else if (arg1 == 1) {
			local7 = Static50.method783(arg5, arg2, arg3);
		} else if (arg1 == 2) {
			local7 = Static26.method382(arg5, arg2, arg3);
		} else if (arg1 == 3) {
			local7 = Static64.method988(arg5, arg2, arg3);
		}
		@Pc(57) int local57 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
		@Pc(68) int local68 = (int) local7 >> 14 & 0x1F;
		@Pc(75) int local75 = (int) local7 >> 20 & 0x3;
		@Pc(79) Class18 local79 = Static148.method2487(local57);
		if (local79.method606()) {
			Static114.method1849(arg5, arg2, arg3, local79);
		}
		if (local7 == 0L) {
			return;
		}
		if (arg1 == 0) {
			Static34.method510(arg5, arg2, arg3);
			if (local79.anInt807 != 0) {
				arg4.method437(local75, local68, arg3, arg2, local79.aBoolean42);
				return;
			}
			return;
		}
		if (arg1 == 1) {
			Static173.method2877(arg5, arg2, arg3);
			return;
		}
		if (arg1 == 2) {
			Static207.method3274(arg5, arg2, arg3);
			if (local79.anInt807 != 0 && arg2 + local79.anInt811 < 104 && local79.anInt811 + arg3 < 104 && arg2 + local79.anInt822 < 104 && arg3 + local79.anInt822 < 104) {
				arg4.method440(local79.anInt811, local79.aBoolean42, arg2, local79.anInt822, local75, arg3);
				return;
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		Static183.method3004(arg5, arg2, arg3);
		if (local79.anInt807 == 1) {
			arg4.method432(arg3, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!pc;Lclient!pg;I)V")
	public static void method2728(@OriginalArg(1) Class87 arg0, @OriginalArg(2) Class1_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub27 local9 = new Class1_Sub27();
		local9.anInt4193 = arg1.method2142();
		local9.anInt4197 = arg1.method2140();
		local9.aClass116Array2 = new Class116[local9.anInt4193];
		local9.aClass116Array1 = new Class116[local9.anInt4193];
		local9.anIntArray480 = new int[local9.anInt4193];
		local9.anIntArray481 = new int[local9.anInt4193];
		local9.anIntArray479 = new int[local9.anInt4193];
		local9.aByteArrayArrayArray12 = new byte[local9.anInt4193][][];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt4193; local51++) {
			try {
				@Pc(57) int local57 = arg1.method2142();
				@Pc(76) String local76;
				@Pc(85) String local85;
				@Pc(87) int local87;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local76 = new String(arg1.method2125().method1230());
					local85 = new String(arg1.method2125().method1230());
					local87 = 0;
					if (local57 == 1) {
						local87 = arg1.method2140();
					}
					local9.anIntArray479[local51] = local57;
					local9.anIntArray480[local51] = local87;
					local9.aClass116Array1[local51] = arg0.method2697(Static12.method187(local76), local85);
				} else if (local57 == 3 || local57 == 4) {
					local76 = new String(arg1.method2125().method1230());
					local85 = new String(arg1.method2125().method1230());
					local87 = arg1.method2142();
					@Pc(154) String[] local154 = new String[local87];
					for (@Pc(156) int local156 = 0; local156 < local87; local156++) {
						local154[local156] = new String(arg1.method2125().method1230());
					}
					@Pc(180) byte[][] local180 = new byte[local87][];
					@Pc(191) int local191;
					if (local57 == 3) {
						for (@Pc(185) int local185 = 0; local185 < local87; local185++) {
							local191 = arg1.method2140();
							local180[local185] = new byte[local191];
							arg1.method2148(local191, local180[local185]);
						}
					}
					local9.anIntArray479[local51] = local57;
					@Pc(216) Class[] local216 = new Class[local87];
					for (local191 = 0; local191 < local87; local191++) {
						local216[local191] = Static12.method187(local154[local191]);
					}
					local9.aClass116Array2[local51] = arg0.method2689(local216, Static12.method187(local76), local85);
					local9.aByteArrayArrayArray12[local51] = local180;
				}
			} catch (@Pc(257) ClassNotFoundException local257) {
				local9.anIntArray481[local51] = -1;
			} catch (@Pc(264) SecurityException local264) {
				local9.anIntArray481[local51] = -2;
			} catch (@Pc(271) NullPointerException local271) {
				local9.anIntArray481[local51] = -3;
			} catch (@Pc(278) Exception local278) {
				local9.anIntArray481[local51] = -4;
			} catch (@Pc(285) Throwable local285) {
				local9.anIntArray481[local51] = -5;
			}
		}
		Static124.aClass75_12.method2240(local9);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLclient!pg;)Lclient!hh;")
	public static Class50 method2729(@OriginalArg(2) Class1_Sub17 arg0) {
		try {
			@Pc(7) Class50 local7 = new Class50();
			local7.anInt1705 = arg0.method2156();
			if (local7.anInt1705 > 32767) {
				local7.anInt1705 = 32767;
			}
			local7.aByteArray12 = new byte[local7.anInt1705];
			arg0.anInt2656 += Static229.aClass59_1.method1588(local7.aByteArray12, local7.anInt1705, 0, arg0.aByteArray40, arg0.anInt2656);
			return local7;
		} catch (@Pc(56) Exception local56) {
			return Static46.aClass50_343;
		}
	}
}
