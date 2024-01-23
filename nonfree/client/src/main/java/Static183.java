import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "Lclient!o;")
	public static Class86 aClass86_13;

	@OriginalMember(owner = "client!rf", name = "hb", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array26;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1082 = Static231.method3737("leuchten1:");

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1083 = Static231.method3737(":duelstake:");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= arg3) {
			Static162.method2605(Static231.anIntArrayArray44[arg0], arg2, arg1, arg3);
		} else {
			Static162.method2605(Static231.anIntArrayArray44[arg0], arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	public static boolean method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static201.anIntArrayArray39[local3][local7] = 0;
				Static181.anIntArrayArray38[local3][local7] = 99999999;
			}
		}
		Static201.anIntArrayArray39[arg8][arg3] = 99;
		Static181.anIntArrayArray38[arg8][arg3] = 0;
		local7 = arg8;
		@Pc(58) int local58 = arg3;
		@Pc(60) byte local60 = 0;
		Static157.anIntArray302[0] = arg8;
		@Pc(67) int local67 = local60 + 1;
		Static11.anIntArray34[0] = arg3;
		@Pc(71) boolean local71 = false;
		@Pc(73) int local73 = 0;
		@Pc(78) int[][] local78 = Static107.aClass60Array1[Static191.anInt4237].anIntArrayArray24;
		@Pc(192) int local192;
		while (local67 != local73) {
			local7 = Static157.anIntArray302[local73];
			local58 = Static11.anIntArray34[local73];
			local73 = local73 + 1 & 0xFFF;
			if (arg5 == local7 && arg6 == local58) {
				local71 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && Static107.aClass60Array1[Static191.anInt4237].method1685(local7, arg9, local58, arg4 - 1, arg5, arg6, 1)) {
					local71 = true;
					break;
				}
				if (arg4 < 10 && Static107.aClass60Array1[Static191.anInt4237].method1675(arg9, local58, local7, arg6, arg5, 1, arg4 - 1)) {
					local71 = true;
					break;
				}
			}
			if (arg7 != 0 && arg1 != 0 && Static107.aClass60Array1[Static191.anInt4237].method1687(arg5, arg6, arg10, 1, arg7, arg1, local58, local7)) {
				local71 = true;
				break;
			}
			local192 = Static181.anIntArrayArray38[local7][local58] + 1;
			if (local7 > 0 && Static201.anIntArrayArray39[local7 - 1][local58] == 0 && (local78[local7 - 1][local58] & 0x12C0108) == 0) {
				Static157.anIntArray302[local67] = local7 - 1;
				Static11.anIntArray34[local67] = local58;
				local67 = local67 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local7 - 1][local58] = 2;
				Static181.anIntArrayArray38[local7 - 1][local58] = local192;
			}
			if (local7 < 103 && Static201.anIntArrayArray39[local7 + 1][local58] == 0 && (local78[local7 + 1][local58] & 0x12C0180) == 0) {
				Static157.anIntArray302[local67] = local7 + 1;
				Static11.anIntArray34[local67] = local58;
				Static201.anIntArrayArray39[local7 + 1][local58] = 8;
				Static181.anIntArrayArray38[local7 + 1][local58] = local192;
				local67 = local67 + 1 & 0xFFF;
			}
			if (local58 > 0 && Static201.anIntArrayArray39[local7][local58 - 1] == 0 && (local78[local7][local58 - 1] & 0x12C0102) == 0) {
				Static157.anIntArray302[local67] = local7;
				Static11.anIntArray34[local67] = local58 - 1;
				Static201.anIntArrayArray39[local7][local58 - 1] = 1;
				local67 = local67 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local7][local58 - 1] = local192;
			}
			if (local58 < 103 && Static201.anIntArrayArray39[local7][local58 + 1] == 0 && (local78[local7][local58 + 1] & 0x12C0120) == 0) {
				Static157.anIntArray302[local67] = local7;
				Static11.anIntArray34[local67] = local58 + 1;
				Static201.anIntArrayArray39[local7][local58 + 1] = 4;
				local67 = local67 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local7][local58 + 1] = local192;
			}
			if (local7 > 0 && local58 > 0 && Static201.anIntArrayArray39[local7 - 1][local58 - 1] == 0 && (local78[local7 - 1][local58 - 1] & 0x12C010E) == 0 && (local78[local7 - 1][local58] & 0x12C0108) == 0 && (local78[local7][local58 - 1] & 0x12C0102) == 0) {
				Static157.anIntArray302[local67] = local7 - 1;
				Static11.anIntArray34[local67] = local58 - 1;
				Static201.anIntArrayArray39[local7 - 1][local58 - 1] = 3;
				local67 = local67 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local7 - 1][local58 - 1] = local192;
			}
			if (local7 < 103 && local58 > 0 && Static201.anIntArrayArray39[local7 + 1][local58 - 1] == 0 && (local78[local7 + 1][local58 - 1] & 0x12C0183) == 0 && (local78[local7 + 1][local58] & 0x12C0180) == 0 && (local78[local7][local58 - 1] & 0x12C0102) == 0) {
				Static157.anIntArray302[local67] = local7 + 1;
				Static11.anIntArray34[local67] = local58 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local7 + 1][local58 - 1] = 9;
				Static181.anIntArrayArray38[local7 + 1][local58 - 1] = local192;
			}
			if (local7 > 0 && local58 < 103 && Static201.anIntArrayArray39[local7 - 1][local58 + 1] == 0 && (local78[local7 - 1][local58 + 1] & 0x12C0138) == 0 && (local78[local7 - 1][local58] & 0x12C0108) == 0 && (local78[local7][local58 + 1] & 0x12C0120) == 0) {
				Static157.anIntArray302[local67] = local7 - 1;
				Static11.anIntArray34[local67] = local58 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local7 - 1][local58 + 1] = 6;
				Static181.anIntArrayArray38[local7 - 1][local58 + 1] = local192;
			}
			if (local7 < 103 && local58 < 103 && Static201.anIntArrayArray39[local7 + 1][local58 + 1] == 0 && (local78[local7 + 1][local58 + 1] & 0x12C01E0) == 0 && (local78[local7 + 1][local58] & 0x12C0180) == 0 && (local78[local7][local58 + 1] & 0x12C0120) == 0) {
				Static157.anIntArray302[local67] = local7 + 1;
				Static11.anIntArray34[local67] = local58 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static201.anIntArrayArray39[local7 + 1][local58 + 1] = 12;
				Static181.anIntArrayArray38[local7 + 1][local58 + 1] = local192;
			}
		}
		Static36.anInt763 = 0;
		@Pc(806) int local806;
		if (!local71) {
			if (!arg2) {
				return false;
			}
			local192 = 1000;
			local806 = 100;
			for (@Pc(813) int local813 = arg5 - 10; local813 <= arg5 + 10; local813++) {
				for (@Pc(819) int local819 = arg6 - 10; local819 <= arg6 + 10; local819++) {
					if (local813 >= 0 && local819 >= 0 && local813 < 104 && local819 < 104 && Static181.anIntArrayArray38[local813][local819] < 100) {
						@Pc(850) int local850 = 0;
						if (arg5 > local813) {
							local850 = arg5 - local813;
						} else if (arg7 + arg5 - 1 < local813) {
							local850 = local813 + 1 - arg5 - arg7;
						}
						@Pc(887) int local887 = 0;
						if (arg6 > local819) {
							local887 = arg6 - local819;
						} else if (arg6 + arg1 - 1 < local819) {
							local887 = local819 + 1 - arg1 - arg6;
						}
						@Pc(931) int local931 = local850 * local850 + local887 * local887;
						if (local931 < local192 || local192 == local931 && Static181.anIntArrayArray38[local813][local819] < local806) {
							local806 = Static181.anIntArrayArray38[local813][local819];
							local192 = local931;
							local7 = local813;
							local58 = local819;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (arg8 == local7 && arg3 == local58) {
				return false;
			}
			Static36.anInt763 = 1;
		}
		@Pc(999) byte local999 = 0;
		Static157.anIntArray302[0] = local7;
		local73 = local999 + 1;
		Static11.anIntArray34[0] = local58;
		local192 = local806 = Static201.anIntArrayArray39[local7][local58];
		while (arg8 != local7 || local58 != arg3) {
			if (local806 != local192) {
				Static157.anIntArray302[local73] = local7;
				Static11.anIntArray34[local73++] = local58;
				local806 = local192;
			}
			if ((local192 & 0x2) != 0) {
				local7++;
			} else if ((local192 & 0x8) != 0) {
				local7--;
			}
			if ((local192 & 0x1) != 0) {
				local58++;
			} else if ((local192 & 0x4) != 0) {
				local58--;
			}
			local192 = Static201.anIntArrayArray39[local7][local58];
		}
		if (local73 > 0) {
			Static114.method1973(local73, arg0);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!vf;Z)V")
	public static void method3037(@OriginalArg(0) Class1_Sub26 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt4021 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2945();
		if (local20 < 0 || local20 > 3) {
			return;
		}
		@Pc(31) byte local31;
		if (local20 == 3) {
			local31 = 23;
		} else if (local20 == 2) {
			local31 = 22;
		} else if (local20 == 1) {
			local31 = 23;
		} else {
			local31 = 19;
		}
		if (local31 > arg0.aByteArray52.length - arg0.anInt4021) {
			return;
		}
		Static27.anInt523 = arg0.method2945();
		if (Static27.anInt523 < 1) {
			Static27.anInt523 = 1;
		} else if (Static27.anInt523 > 4) {
			Static27.anInt523 = 4;
		}
		Static27.method477(arg0.method2945() == 1);
		Static100.aBoolean195 = arg0.method2945() == 1;
		Static163.aBoolean317 = arg0.method2945() == 1;
		Static142.aBoolean266 = arg0.method2945() == 1;
		Static14.aBoolean30 = arg0.method2945() == 1;
		Static179.aBoolean357 = arg0.method2945() == 1;
		Static153.aBoolean296 = arg0.method2945() == 1;
		Static163.aBoolean316 = arg0.method2945() == 1;
		Static85.anInt1851 = arg0.method2945();
		if (Static85.anInt1851 > 2) {
			Static85.anInt1851 = 2;
		}
		if (local20 < 2) {
			Static169.aBoolean326 = arg0.method2945() == 1;
			arg0.method2945();
		} else {
			Static169.aBoolean326 = arg0.method2945() == 1;
		}
		Static182.aBoolean362 = arg0.method2945() == 1;
		Static224.aBoolean434 = arg0.method2945() == 1;
		Static83.anInt1786 = arg0.method2945();
		if (Static83.anInt1786 > 2) {
			Static83.anInt1786 = 2;
		}
		Static73.aBoolean151 = arg0.method2945() == 1;
		Static91.anInt1982 = arg0.method2945();
		if (Static91.anInt1982 > 127) {
			Static91.anInt1982 = 127;
		}
		Static157.anInt3449 = arg0.method2945();
		Static90.anInt1961 = arg0.method2945();
		if (Static90.anInt1961 > 127) {
			Static90.anInt1961 = 127;
		}
		if (local20 >= 1) {
			Static112.anInt2482 = arg0.method2964();
			Static96.anInt2088 = arg0.method2964();
		}
		if (local20 >= 3) {
			Static156.aBoolean301 = arg0.method2945() == 1;
		}
	}
}
