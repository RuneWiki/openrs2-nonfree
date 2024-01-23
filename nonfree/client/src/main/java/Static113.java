import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!jb;")
	public static Class28 aClass28_44;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!re;")
	public static Class1_Sub26_Sub1 aClass1_Sub26_Sub1_1 = new Class1_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!sc;")
	private static Class107 aClass107_671 = Static231.method3737("Unable to find ");

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_672 = Static231.method3737(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_673 = aClass107_671;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!jb;IZ)Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 method1955(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		return Static83.method1393(arg1, arg0) ? Static133.method2211() : null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BI)[B")
	public static byte[] method1956(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local2];
		Static236.method300(arg0, 0, local9, 0, local2);
		return local9;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZIIIIIIII)Z")
	public static boolean method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static201.anIntArrayArray39[local3][local7] = 0;
				Static181.anIntArrayArray38[local3][local7] = 99999999;
			}
		}
		Static201.anIntArrayArray39[arg11][arg0] = 99;
		Static181.anIntArrayArray38[arg11][arg0] = 0;
		local7 = arg11;
		@Pc(51) int local51 = arg0;
		@Pc(53) byte local53 = 0;
		@Pc(55) boolean local55 = false;
		@Pc(57) int local57 = 0;
		Static157.anIntArray302[0] = arg11;
		@Pc(64) int local64 = local53 + 1;
		Static11.anIntArray34[0] = arg0;
		@Pc(71) int[][] local71 = Static107.aClass60Array1[Static191.anInt4237].anIntArrayArray24;
		@Pc(182) int local182;
		@Pc(227) int local227;
		label367: while (local64 != local57) {
			local7 = Static157.anIntArray302[local57];
			local51 = Static11.anIntArray34[local57];
			local57 = local57 + 1 & 0xFFF;
			if (arg6 == local7 && local51 == arg3) {
				local55 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static107.aClass60Array1[Static191.anInt4237].method1685(local7, arg8, local51, arg7 - 1, arg6, arg3, arg5)) {
					local55 = true;
					break;
				}
				if (arg7 < 10 && Static107.aClass60Array1[Static191.anInt4237].method1675(arg8, local51, local7, arg3, arg6, arg5, arg7 - 1)) {
					local55 = true;
					break;
				}
			}
			if (arg1 != 0 && arg9 != 0 && Static107.aClass60Array1[Static191.anInt4237].method1687(arg6, arg3, arg2, arg5, arg1, arg9, local51, local7)) {
				local55 = true;
				break;
			}
			local182 = Static181.anIntArrayArray38[local7][local51] + 1;
			if (local7 > 0 && Static201.anIntArrayArray39[local7 - 1][local51] == 0 && (local71[local7 - 1][local51] & 0x12C010E) == 0 && (local71[local7 - 1][arg5 + local51 - 1] & 0x12C0138) == 0) {
				local227 = 1;
				while (true) {
					if (local227 >= arg5 - 1) {
						Static157.anIntArray302[local64] = local7 - 1;
						Static11.anIntArray34[local64] = local51;
						local64 = local64 + 1 & 0xFFF;
						Static201.anIntArrayArray39[local7 - 1][local51] = 2;
						Static181.anIntArrayArray38[local7 - 1][local51] = local182;
						break;
					}
					if ((local71[local7 - 1][local227 + local51] & 0x12C013E) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local7 < 102 && Static201.anIntArrayArray39[local7 + 1][local51] == 0 && (local71[local7 + arg5][local51] & 0x12C0183) == 0 && (local71[local7 + arg5][arg5 + local51 - 1] & 0x12C01E0) == 0) {
				local227 = 1;
				while (true) {
					if (arg5 - 1 <= local227) {
						Static157.anIntArray302[local64] = local7 + 1;
						Static11.anIntArray34[local64] = local51;
						Static201.anIntArrayArray39[local7 + 1][local51] = 8;
						local64 = local64 + 1 & 0xFFF;
						Static181.anIntArrayArray38[local7 + 1][local51] = local182;
						break;
					}
					if ((local71[local7 + arg5][local227 + local51] & 0x12C01E3) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local51 > 0 && Static201.anIntArrayArray39[local7][local51 - 1] == 0 && (local71[local7][local51 - 1] & 0x12C010E) == 0 && (local71[local7 + arg5 - 1][local51 - 1] & 0x12C0183) == 0) {
				local227 = 1;
				while (true) {
					if (arg5 - 1 <= local227) {
						Static157.anIntArray302[local64] = local7;
						Static11.anIntArray34[local64] = local51 - 1;
						Static201.anIntArrayArray39[local7][local51 - 1] = 1;
						Static181.anIntArrayArray38[local7][local51 - 1] = local182;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local71[local227 + local7][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local51 < 102 && Static201.anIntArrayArray39[local7][local51 + 1] == 0 && (local71[local7][local51 + arg5] & 0x12C0138) == 0 && (local71[arg5 + local7 - 1][local51 + arg5] & 0x12C01E0) == 0) {
				local227 = 1;
				while (true) {
					if (local227 >= arg5 - 1) {
						Static157.anIntArray302[local64] = local7;
						Static11.anIntArray34[local64] = local51 + 1;
						Static201.anIntArrayArray39[local7][local51 + 1] = 4;
						local64 = local64 + 1 & 0xFFF;
						Static181.anIntArrayArray38[local7][local51 + 1] = local182;
						break;
					}
					if ((local71[local227 + local7][arg5 + local51] & 0x12C01F8) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local7 > 0 && local51 > 0 && Static201.anIntArrayArray39[local7 - 1][local51 - 1] == 0 && (local71[local7 - 1][local51 + arg5 - 1 - 1] & 0x12C0138) == 0 && (local71[local7 - 1][local51 - 1] & 0x12C010E) == 0 && (local71[arg5 + local7 - 1 - 1][local51 - 1] & 0x12C0183) == 0) {
				local227 = 1;
				while (true) {
					if (local227 >= arg5 - 1) {
						Static157.anIntArray302[local64] = local7 - 1;
						Static11.anIntArray34[local64] = local51 - 1;
						Static201.anIntArrayArray39[local7 - 1][local51 - 1] = 3;
						Static181.anIntArrayArray38[local7 - 1][local51 - 1] = local182;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local71[local7 - 1][local51 + local227 - 1] & 0x12C013E) != 0 || (local71[local227 + local7 - 1][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local7 < 102 && local51 > 0 && Static201.anIntArrayArray39[local7 + 1][local51 - 1] == 0 && (local71[local7 + 1][local51 - 1] & 0x12C010E) == 0 && (local71[local7 + arg5][local51 - 1] & 0x12C0183) == 0 && (local71[local7 + arg5][arg5 + local51 - 1 - 1] & 0x12C01E0) == 0) {
				local227 = 1;
				while (true) {
					if (arg5 - 1 <= local227) {
						Static157.anIntArray302[local64] = local7 + 1;
						Static11.anIntArray34[local64] = local51 - 1;
						Static201.anIntArrayArray39[local7 + 1][local51 - 1] = 9;
						local64 = local64 + 1 & 0xFFF;
						Static181.anIntArrayArray38[local7 + 1][local51 - 1] = local182;
						break;
					}
					if ((local71[arg5 + local7][local227 + local51 - 1] & 0x12C01E3) != 0 || (local71[local227 + local7 + 1][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local7 > 0 && local51 < 102 && Static201.anIntArrayArray39[local7 - 1][local51 + 1] == 0 && (local71[local7 - 1][local51 + 1] & 0x12C010E) == 0 && (local71[local7 - 1][arg5 + local51] & 0x12C0138) == 0 && (local71[local7][arg5 + local51] & 0x12C01E0) == 0) {
				local227 = 1;
				while (true) {
					if (arg5 - 1 <= local227) {
						Static157.anIntArray302[local64] = local7 - 1;
						Static11.anIntArray34[local64] = local51 + 1;
						Static201.anIntArrayArray39[local7 - 1][local51 + 1] = 6;
						Static181.anIntArrayArray38[local7 - 1][local51 + 1] = local182;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local71[local7 - 1][local51 + local227 + 1] & 0x12C013E) != 0 || (local71[local7 + local227 - 1][arg5 + local51] & 0x12C01F8) != 0) {
						break;
					}
					local227++;
				}
			}
			if (local7 < 102 && local51 < 102 && Static201.anIntArrayArray39[local7 + 1][local51 + 1] == 0 && (local71[local7 + 1][local51 + arg5] & 0x12C0138) == 0 && (local71[local7 + arg5][arg5 + local51] & 0x12C01E0) == 0 && (local71[local7 + arg5][local51 + 1] & 0x12C0183) == 0) {
				for (local227 = 1; local227 < arg5 - 1; local227++) {
					if ((local71[local227 + local7 + 1][arg5 + local51] & 0x12C01F8) != 0 || (local71[local7 + arg5][local51 + local227 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static157.anIntArray302[local64] = local7 + 1;
				Static11.anIntArray34[local64] = local51 + 1;
				Static201.anIntArrayArray39[local7 + 1][local51 + 1] = 12;
				local64 = local64 + 1 & 0xFFF;
				Static181.anIntArrayArray38[local7 + 1][local51 + 1] = local182;
			}
		}
		Static36.anInt763 = 0;
		if (!local55) {
			if (!arg4) {
				return false;
			}
			local227 = 100;
			local182 = 1000;
			for (@Pc(1190) int local1190 = arg6 - 10; local1190 <= arg6 + 10; local1190++) {
				for (@Pc(1197) int local1197 = arg3 - 10; local1197 <= arg3 + 10; local1197++) {
					if (local1190 >= 0 && local1197 >= 0 && local1190 < 104 && local1197 < 104 && Static181.anIntArrayArray38[local1190][local1197] < 100) {
						@Pc(1225) int local1225 = 0;
						@Pc(1227) int local1227 = 0;
						if (local1197 < arg3) {
							local1227 = arg3 - local1197;
						} else if (arg3 + arg9 - 1 < local1197) {
							local1227 = local1197 + 1 - arg9 - arg3;
						}
						if (local1190 < arg6) {
							local1225 = arg6 - local1190;
						} else if (local1190 > arg6 + arg1 - 1) {
							local1225 = local1190 + 1 - arg6 - arg1;
						}
						@Pc(1296) int local1296 = local1227 * local1227 + local1225 * local1225;
						if (local1296 < local182 || local1296 == local182 && local227 > Static181.anIntArrayArray38[local1190][local1197]) {
							local51 = local1197;
							local182 = local1296;
							local7 = local1190;
							local227 = Static181.anIntArrayArray38[local1190][local1197];
						}
					}
				}
			}
			if (local182 == 1000) {
				return false;
			}
			if (local7 == arg11 && arg0 == local51) {
				return false;
			}
			Static36.anInt763 = 1;
		}
		@Pc(1382) byte local1382 = 0;
		Static157.anIntArray302[0] = local7;
		local57 = local1382 + 1;
		Static11.anIntArray34[0] = local51;
		local182 = local227 = Static201.anIntArrayArray39[local7][local51];
		while (arg11 != local7 || local51 != arg0) {
			if (local182 != local227) {
				local227 = local182;
				Static157.anIntArray302[local57] = local7;
				Static11.anIntArray34[local57++] = local51;
			}
			if ((local182 & 0x2) != 0) {
				local7++;
			} else if ((local182 & 0x8) != 0) {
				local7--;
			}
			if ((local182 & 0x1) != 0) {
				local51++;
			} else if ((local182 & 0x4) != 0) {
				local51--;
			}
			local182 = Static201.anIntArrayArray39[local7][local51];
		}
		if (local57 > 0) {
			Static114.method1973(local57, arg10);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
	public static boolean method1958() throws IOException {
		if (Static167.aClass82_3 == null) {
			return false;
		}
		@Pc(18) int local18 = Static167.aClass82_3.method2397();
		if (local18 == 0) {
			return false;
		}
		if (Static176.anInt3812 == -1) {
			local18--;
			Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, 1);
			Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
			Static176.anInt3812 = Static194.aClass1_Sub26_Sub1_3.method3003();
			Static24.anInt450 = Static4.anIntArray377[Static176.anInt3812];
		}
		if (Static24.anInt450 == -1) {
			if (local18 <= 0) {
				return false;
			}
			local18--;
			Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, 1);
			Static24.anInt450 = Static194.aClass1_Sub26_Sub1_3.aByteArray52[0] & 0xFF;
		}
		if (Static24.anInt450 == -2) {
			if (local18 <= 1) {
				return false;
			}
			local18 -= 2;
			Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, 2);
			Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
			Static24.anInt450 = Static194.aClass1_Sub26_Sub1_3.method2964();
		}
		if (local18 < Static24.anInt450) {
			return false;
		}
		Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
		Static167.aClass82_3.method2398(0, Static194.aClass1_Sub26_Sub1_3.aByteArray52, Static24.anInt450);
		Static13.anInt317 = Static18.anInt382;
		Static114.anInt2522 = 0;
		Static18.anInt382 = Static200.anInt3496;
		Static200.anInt3496 = Static176.anInt3812;
		@Pc(125) int local125;
		if (Static176.anInt3812 == 194) {
			local125 = Static194.aClass1_Sub26_Sub1_3.method2958();
			@Pc(132) Class1_Sub11 local132 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local125);
			if (local132 != null) {
				Static165.method1867(local132, true);
			}
			if (Static184.aClass86_14 != null) {
				Static16.method354(Static184.aClass86_14);
				Static184.aClass86_14 = null;
			}
			Static176.anInt3812 = -1;
			return true;
		} else if (Static176.anInt3812 == 63) {
			Static3.anInt3934 = Static194.aClass1_Sub26_Sub1_3.method2945();
			Static82.anInt1779 = Static218.anInt4760;
			Static176.anInt3812 = -1;
			return true;
		} else {
			@Pc(179) int local179;
			@Pc(183) Class86 local183;
			@Pc(175) Class107 local175;
			if (Static176.anInt3812 == 146) {
				local175 = Static194.aClass1_Sub26_Sub1_3.method2978();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2995();
				local183 = Static13.method333(local179);
				if (!local175.method3071(local183.aClass107_867)) {
					local183.aClass107_867 = local175;
					Static16.method354(local183);
				}
				Static176.anInt3812 = -1;
				return true;
			}
			@Pc(216) int local216;
			if (Static176.anInt3812 == 117) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2987();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2983();
				local216 = Static194.aClass1_Sub26_Sub1_3.method2960();
				Static208.method3306(local179);
				Static186.method3043(local125, local216);
				Static176.anInt3812 = -1;
				return true;
			}
			@Pc(250) Class86 local250;
			if (Static176.anInt3812 == 211) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2995();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2952();
				local216 = Static194.aClass1_Sub26_Sub1_3.method2970();
				local250 = Static13.method333(local125);
				local250.aByte11 = 0;
				local250.anInt3268 = local250.anInt3250 = local216;
				local250.aByte12 = 0;
				local250.anInt3215 = local250.anInt3243 = local179;
				Static16.method354(local250);
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 161) {
				local175 = Static194.aClass1_Sub26_Sub1_3.method2978();
				@Pc(289) Object[] local289 = new Object[local175.method3095() + 1];
				for (local216 = local175.method3095() - 1; local216 >= 0; local216--) {
					if (local175.method3086(local216) == 115) {
						local289[local216 + 1] = Static194.aClass1_Sub26_Sub1_3.method2978();
					} else {
						local289[local216 + 1] = Integer.valueOf(Static194.aClass1_Sub26_Sub1_3.method2958());
					}
				}
				local289[0] = Integer.valueOf(Static194.aClass1_Sub26_Sub1_3.method2958());
				@Pc(345) Class1_Sub22 local345 = new Class1_Sub22();
				local345.anObjectArray33 = local289;
				Static60.method1156(local345);
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 164) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2981();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2977();
				if (local179 == 65535) {
					local179 = -1;
				}
				local183 = Static13.method333(local125);
				if (local183.anInt3257 != 1 || local183.anInt3228 != local179) {
					local183.anInt3257 = 1;
					local183.anInt3228 = local179;
					Static16.method354(local183);
				}
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 215) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local216 = Static194.aClass1_Sub26_Sub1_3.method2977();
				Static208.method3306(local125);
				Static186.method3043(local216, local179);
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 66) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2960();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2977();
				local183 = Static13.method333(local125);
				if (local183 != null && local183.anInt3286 == 0) {
					if (local183.anInt3266 - local183.anInt3270 < local179) {
						local179 = local183.anInt3266 - local183.anInt3270;
					}
					if (local179 < 0) {
						local179 = 0;
					}
					if (local183.anInt3222 != local179) {
						local183.anInt3222 = local179;
						Static16.method354(local183);
					}
				}
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 128) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2981();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
				Static98.method1665(local125, local179);
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 135) {
				if (Static77.anInt1732 != -1) {
					Static31.method2199(0, Static77.anInt1732);
				}
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 204) {
				Static214.method3466(Static194.aClass1_Sub26_Sub1_3.method2978());
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 88) {
				Static97.method1642();
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 4) {
				Static18.method371();
				Static188.method3059();
				Static173.anInt3758 += 32;
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 99) {
				@Pc(573) boolean local573 = Static194.aClass1_Sub26_Sub1_3.method2968() == 1;
				local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
				local183 = Static13.method333(local179);
				if (local183.aBoolean275 != local573) {
					local183.aBoolean275 = local573;
					Static16.method354(local183);
				}
				Static176.anInt3812 = -1;
				return true;
			} else if (Static176.anInt3812 == 127) {
				local125 = Static194.aClass1_Sub26_Sub1_3.method2972();
				local179 = Static194.aClass1_Sub26_Sub1_3.method2977();
				local216 = Static194.aClass1_Sub26_Sub1_3.method2977();
				@Pc(624) Class5_Sub5_Sub2 local624 = Static33.aClass5_Sub5_Sub2Array1[local179];
				if (local624 != null) {
					Static66.method1216(local624, local125, local216);
				}
				Static176.anInt3812 = -1;
				return true;
			} else {
				@Pc(644) long local644;
				if (Static176.anInt3812 == 125) {
					local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
					@Pc(651) Class107 local651 = Static164.method3329(Static94.method1586(Static194.aClass1_Sub26_Sub1_3).method3087());
					Static136.method2282(local651, 6, Static19.method382(local644).method3092());
					Static176.anInt3812 = -1;
					return true;
				}
				@Pc(685) int local685;
				@Pc(689) int local689;
				if (Static176.anInt3812 == 94) {
					local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
					local685 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local689 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static76.method1340(true, local685, local125, local179, local216, local689);
					Static176.anInt3812 = -1;
					return true;
				} else if (Static176.anInt3812 == 81) {
					local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
					@Pc(716) Class68 local716 = new Class68();
					local179 = local125 >> 6;
					local716.anInt2519 = local125 & 0x3F;
					local716.anInt2508 = Static194.aClass1_Sub26_Sub1_3.method2945();
					if (local716.anInt2508 >= 0 && local716.anInt2508 < Static23.aClass1_Sub2_Sub2Array2.length) {
						if (local716.anInt2519 == 1 || local716.anInt2519 == 10) {
							local716.anInt2515 = Static194.aClass1_Sub26_Sub1_3.method2964();
							Static194.aClass1_Sub26_Sub1_3.anInt4021 += 3;
						} else if (local716.anInt2519 >= 2 && local716.anInt2519 <= 6) {
							if (local716.anInt2519 == 2) {
								local716.anInt2504 = 64;
								local716.anInt2512 = 64;
							}
							if (local716.anInt2519 == 3) {
								local716.anInt2512 = 64;
								local716.anInt2504 = 0;
							}
							if (local716.anInt2519 == 4) {
								local716.anInt2512 = 64;
								local716.anInt2504 = 128;
							}
							if (local716.anInt2519 == 5) {
								local716.anInt2504 = 64;
								local716.anInt2512 = 0;
							}
							if (local716.anInt2519 == 6) {
								local716.anInt2512 = 128;
								local716.anInt2504 = 64;
							}
							local716.anInt2519 = 2;
							local716.anInt2514 = Static194.aClass1_Sub26_Sub1_3.method2964();
							local716.anInt2506 = Static194.aClass1_Sub26_Sub1_3.method2964();
							local716.anInt2518 = Static194.aClass1_Sub26_Sub1_3.method2945();
						}
						local716.anInt2511 = Static194.aClass1_Sub26_Sub1_3.method2964();
						if (local716.anInt2511 == 65535) {
							local716.anInt2511 = -1;
						}
						Static76.aClass68Array1[local179] = local716;
					}
					Static176.anInt3812 = -1;
					return true;
				} else if (Static176.anInt3812 == 142) {
					local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
					local685 = Static194.aClass1_Sub26_Sub1_3.method2945();
					local689 = Static194.aClass1_Sub26_Sub1_3.method2945();
					Static184.method3039(local685, local125, local216, local689, local179);
					Static176.anInt3812 = -1;
					return true;
				} else {
					@Pc(981) int local981;
					@Pc(1056) int local1056;
					@Pc(949) long local949;
					@Pc(1049) int local1049;
					if (Static176.anInt3812 == 177) {
						Static229.anInt4959 = Static218.anInt4760;
						local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
						if (local644 == 0L) {
							Static22.anInt437 = 0;
							Static116.aClass107_694 = null;
							Static151.aClass107_879 = null;
							Static176.anInt3812 = -1;
							Static39.aClass1_Sub13Array1 = null;
							return true;
						}
						local949 = Static194.aClass1_Sub26_Sub1_3.method2943();
						Static116.aClass107_694 = Static19.method382(local949);
						Static151.aClass107_879 = Static19.method382(local644);
						Static16.aByte3 = Static194.aClass1_Sub26_Sub1_3.method2992();
						local689 = Static194.aClass1_Sub26_Sub1_3.method2945();
						if (local689 == 255) {
							Static176.anInt3812 = -1;
							return true;
						}
						Static22.anInt437 = local689;
						@Pc(979) Class1_Sub13[] local979 = new Class1_Sub13[100];
						for (local981 = 0; local981 < Static22.anInt437; local981++) {
							local979[local981] = new Class1_Sub13();
							local979[local981].aLong177 = Static194.aClass1_Sub26_Sub1_3.method2943();
							local979[local981].aClass107_503 = Static19.method382(local979[local981].aLong177);
							local979[local981].anInt1728 = Static194.aClass1_Sub26_Sub1_3.method2964();
							local979[local981].aByte9 = Static194.aClass1_Sub26_Sub1_3.method2992();
							local979[local981].aClass107_504 = Static194.aClass1_Sub26_Sub1_3.method2978();
							if (local979[local981].aLong177 == Static189.aLong149) {
								Static10.aByte2 = local979[local981].aByte9;
							}
						}
						local1049 = Static22.anInt437;
						while (local1049 > 0) {
							@Pc(1053) boolean local1053 = true;
							local1049--;
							for (local1056 = 0; local1056 < local1049; local1056++) {
								if (local979[local1056].aClass107_503.method3078(local979[local1056 + 1].aClass107_503) > 0) {
									local1053 = false;
									@Pc(1080) Class1_Sub13 local1080 = local979[local1056];
									local979[local1056] = local979[local1056 + 1];
									local979[local1056 + 1] = local1080;
								}
							}
							if (local1053) {
								break;
							}
						}
						Static176.anInt3812 = -1;
						Static39.aClass1_Sub13Array1 = local979;
						return true;
					} else if (Static176.anInt3812 == 120) {
						Static188.method3059();
						Static90.anInt1960 = Static194.aClass1_Sub26_Sub1_3.method2945();
						Static176.anInt3812 = -1;
						Static90.anInt1963 = Static218.anInt4760;
						return true;
					} else if (Static176.anInt3812 == 40) {
						local125 = Static194.aClass1_Sub26_Sub1_3.method2987();
						local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
						Static1.method54(local179, local125);
						Static176.anInt3812 = -1;
						return true;
					} else {
						@Pc(1228) int local1228;
						if (Static176.anInt3812 == 23) {
							local125 = Static194.aClass1_Sub26_Sub1_3.method2958();
							local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
							if (local125 < 0) {
								local183 = null;
							} else {
								local183 = Static13.method333(local125);
							}
							if (local183 != null) {
								for (local685 = 0; local685 < local183.anIntArray285.length; local685++) {
									local183.anIntArray285[local685] = 0;
									local183.anIntArray275[local685] = 0;
								}
							}
							if (local125 < -70000) {
								local179 += 32768;
							}
							Static65.method1208(local179);
							local685 = Static194.aClass1_Sub26_Sub1_3.method2964();
							for (local689 = 0; local689 < local685; local689++) {
								local1228 = Static194.aClass1_Sub26_Sub1_3.method2942();
								if (local1228 == 255) {
									local1228 = Static194.aClass1_Sub26_Sub1_3.method2960();
								}
								local981 = Static194.aClass1_Sub26_Sub1_3.method2977();
								if (local183 != null && local689 < local183.anIntArray285.length) {
									local183.anIntArray285[local689] = local981;
									local183.anIntArray275[local689] = local1228;
								}
								Static195.method3182(local179, local981 - 1, local689, local1228);
							}
							if (local183 != null) {
								Static16.method354(local183);
							}
							Static188.method3059();
							Static70.anIntArray149[Static151.anInt3341++ & 0x1F] = local179 & 0x7FFF;
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 92) {
							Static207.anInt4426 = Static194.aClass1_Sub26_Sub1_3.method2983() * 30;
							Static90.anInt1963 = Static218.anInt4760;
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 100) {
							local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
							local179 = Static194.aClass1_Sub26_Sub1_3.method2977();
							Static98.method1665(local125, local179);
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 207) {
							Static107.anInt2342 = Static194.aClass1_Sub26_Sub1_3.method2945();
							Static59.anInt1432 = Static194.aClass1_Sub26_Sub1_3.method2945();
							Static174.anInt3795 = Static194.aClass1_Sub26_Sub1_3.method2945();
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 0) {
							@Pc(1362) byte[] local1362 = new byte[Static24.anInt450];
							Static194.aClass1_Sub26_Sub1_3.method3010(local1362, Static24.anInt450);
							Static97.method1646(true, Static140.method661(0, Static24.anInt450, local1362));
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 35) {
							Static138.method2315();
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 118) {
							Static212.method3404(Static194.aClass1_Sub26_Sub1_3);
							Static176.anInt3812 = -1;
							return true;
						} else if (Static176.anInt3812 == 45) {
							local125 = Static194.aClass1_Sub26_Sub1_3.method2977();
							local179 = Static194.aClass1_Sub26_Sub1_3.method2960();
							local216 = Static194.aClass1_Sub26_Sub1_3.method2977();
							local685 = Static194.aClass1_Sub26_Sub1_3.method2987();
							if (local179 >> 30 != 0) {
								local689 = local179 >> 28 & 0x3;
								local1228 = (local179 >> 14 & 0x3FFF) - Static36.anInt764;
								local981 = (local179 & 0x3FFF) - Static152.anInt3377;
								if (local1228 >= 0 && local981 >= 0 && local1228 < 104 && local981 < 104) {
									local1228 = local1228 * 128 + 64;
									local981 = local981 * 128 + 64;
									@Pc(1606) Class5_Sub6 local1606 = new Class5_Sub6(local216, local689, local1228, local981, Static130.method2174(local689, local981, local1228) - local125, local685, Static128.anInt2802);
									Static106.aClass120_12.method3567(new Class1_Sub2_Sub8(local1606));
								}
							} else if (local179 >> 29 != 0) {
								local689 = local179 & 0xFFFF;
								@Pc(1446) Class5_Sub5_Sub2 local1446 = Static33.aClass5_Sub5_Sub2Array1[local689];
								if (local1446 != null) {
									local1446.anInt3038 = 0;
									local1446.anInt3043 = local125;
									local1446.anInt3050 = 0;
									local1446.anInt3045 = local216;
									local1446.anInt3029 = Static128.anInt2802 + local685;
									if (local1446.anInt3045 == 65535) {
										local1446.anInt3045 = -1;
									}
									if (local1446.anInt3029 > Static128.anInt2802) {
										local1446.anInt3038 = -1;
									}
								}
							} else if (local179 >> 28 != 0) {
								local689 = local179 & 0xFFFF;
								@Pc(1504) Class5_Sub5_Sub1 local1504;
								if (local689 == Static137.anInt2980) {
									local1504 = Static204.aClass5_Sub5_Sub1_2;
								} else {
									local1504 = Static198.aClass5_Sub5_Sub1Array1[local689];
								}
								if (local1504 != null) {
									local1504.anInt3045 = local216;
									local1504.anInt3050 = 0;
									local1504.anInt3029 = local685 + Static128.anInt2802;
									local1504.anInt3043 = local125;
									local1504.anInt3038 = 0;
									if (Static128.anInt2802 < local1504.anInt3029) {
										local1504.anInt3038 = -1;
									}
									if (local1504.anInt3045 == 65535) {
										local1504.anInt3045 = -1;
									}
								}
							}
							Static176.anInt3812 = -1;
							return true;
						} else {
							@Pc(1630) Class107 local1630;
							if (Static176.anInt3812 == 223) {
								local125 = Static194.aClass1_Sub26_Sub1_3.method2987();
								local1630 = Static194.aClass1_Sub26_Sub1_3.method2978();
								local216 = Static194.aClass1_Sub26_Sub1_3.method2987();
								Static208.method3306(local125);
								Static109.method1903(local1630, local216);
								Static176.anInt3812 = -1;
								return true;
							} else if (Static176.anInt3812 == 140) {
								Static174.anInt3793 = Static24.anInt450 / 8;
								for (local125 = 0; local125 < Static174.anInt3793; local125++) {
									Static201.aLongArray7[local125] = Static194.aClass1_Sub26_Sub1_3.method2943();
									Static16.aClass107Array1[local125] = Static19.method382(Static201.aLongArray7[local125]);
								}
								Static176.anInt3812 = -1;
								Static82.anInt1779 = Static218.anInt4760;
								return true;
							} else if (Static176.anInt3812 == 246) {
								Static89.anInt1937 = Static194.aClass1_Sub26_Sub1_3.method2972();
								Static209.anInt4459 = Static194.aClass1_Sub26_Sub1_3.method2968();
								while (Static194.aClass1_Sub26_Sub1_3.anInt4021 < Static24.anInt450) {
									Static176.anInt3812 = Static194.aClass1_Sub26_Sub1_3.method2945();
									Static71.method1285();
								}
								Static176.anInt3812 = -1;
								return true;
							} else if (Static176.anInt3812 == 154) {
								local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
								Static217.method3554(local125);
								Static70.anIntArray149[Static151.anInt3341++ & 0x1F] = local125 & 0x7FFF;
								Static176.anInt3812 = -1;
								return true;
							} else if (Static176.anInt3812 == 222) {
								local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
								if (Static194.aClass1_Sub26_Sub1_3.method2945() == 0) {
									Static165.aClass15Array2[local125] = new Class15();
								} else {
									Static194.aClass1_Sub26_Sub1_3.anInt4021--;
									Static165.aClass15Array2[local125] = new Class15(Static194.aClass1_Sub26_Sub1_3);
								}
								Static100.anInt2170 = Static218.anInt4760;
								Static176.anInt3812 = -1;
								return true;
							} else if (Static176.anInt3812 == 116) {
								local125 = Static194.aClass1_Sub26_Sub1_3.method2944();
								local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
								local183 = Static13.method333(local179);
								if (local125 != local183.anInt3283 || local125 == -1) {
									local183.anInt3246 = 0;
									local183.anInt3269 = 0;
									local183.anInt3283 = local125;
									Static16.method354(local183);
								}
								Static176.anInt3812 = -1;
								return true;
							} else {
								@Pc(1851) boolean local1851;
								@Pc(1954) Class107 local1954;
								if (Static176.anInt3812 == 27) {
									local175 = Static194.aClass1_Sub26_Sub1_3.method2978();
									if (local175.method3081(Static14.aClass107_125)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (local949 == Static201.aLongArray7[local1228]) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											Static136.method2282(Static115.aClass107_689, 4, local1630);
										}
									} else if (local175.method3081(Static138.aClass107_828)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (local949 == Static201.aLongArray7[local1228]) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											local1954 = local175.method3104(local175.method3089(Static140.aClass107_235) + 1, local175.method3095() - 9);
											Static136.method2282(local1954, 8, local1630);
										}
									} else if (local175.method3081(Static221.aClass107_1305)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (local949 == Static201.aLongArray7[local1228]) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											Static136.method2282(Static63.aClass107_427, 10, local1630);
										}
									} else if (local175.method3081(Static36.aClass107_254)) {
										local1630 = local175.method3104(0, local175.method3089(Static36.aClass107_254));
										Static136.method2282(local1630, 11, Static63.aClass107_427);
									} else if (local175.method3081(Static44.aClass107_294)) {
										local1630 = local175.method3104(0, local175.method3089(Static44.aClass107_294));
										if (Static97.anInt2101 == 0) {
											Static136.method2282(local1630, 12, Static63.aClass107_427);
										}
									} else if (local175.method3081(Static51.aClass107_827)) {
										local1630 = local175.method3104(0, local175.method3089(Static51.aClass107_827));
										if (Static97.anInt2101 == 0) {
											Static136.method2282(local1630, 13, Static63.aClass107_427);
										}
									} else if (local175.method3081(Static183.aClass107_1083)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (Static201.aLongArray7[local1228] == local949) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											Static136.method2282(Static63.aClass107_427, 14, local1630);
										}
									} else if (local175.method3081(Static194.aClass107_1118)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (Static201.aLongArray7[local1228] == local949) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											Static136.method2282(Static63.aClass107_427, 15, local1630);
										}
									} else if (local175.method3081(Static163.aClass107_952)) {
										local1630 = local175.method3104(0, local175.method3089(Static140.aClass107_235));
										local949 = local1630.method3066();
										local1851 = false;
										for (local1228 = 0; local1228 < Static174.anInt3793; local1228++) {
											if (local949 == Static201.aLongArray7[local1228]) {
												local1851 = true;
												break;
											}
										}
										if (!local1851 && Static97.anInt2101 == 0) {
											Static136.method2282(Static63.aClass107_427, 16, local1630);
										}
									} else {
										Static136.method2282(local175, 0, Static63.aClass107_427);
									}
									Static176.anInt3812 = -1;
									return true;
								} else if (Static176.anInt3812 == 183) {
									Static89.anInt1937 = Static194.aClass1_Sub26_Sub1_3.method2968();
									Static209.anInt4459 = Static194.aClass1_Sub26_Sub1_3.method2942();
									for (local125 = Static89.anInt1937; local125 < Static89.anInt1937 + 8; local125++) {
										for (local179 = Static209.anInt4459; local179 < Static209.anInt4459 + 8; local179++) {
											if (Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local125][local179] != null) {
												Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local125][local179] = null;
												Static182.method3009(local125, local179);
											}
										}
									}
									for (@Pc(2327) Class1_Sub24 local2327 = (Class1_Sub24) Static86.aClass120_10.method3564(); local2327 != null; local2327 = (Class1_Sub24) Static86.aClass120_10.method3561()) {
										if (Static89.anInt1937 <= local2327.anInt3735 && local2327.anInt3735 < Static89.anInt1937 + 8 && Static209.anInt4459 <= local2327.anInt3739 && Static209.anInt4459 + 8 > local2327.anInt3739 && local2327.anInt3737 == Static191.anInt4237) {
											local2327.anInt3738 = 0;
										}
									}
									Static176.anInt3812 = -1;
									return true;
								} else if (Static176.anInt3812 == 216) {
									local175 = Static194.aClass1_Sub26_Sub1_3.method2978();
									local179 = Static194.aClass1_Sub26_Sub1_3.method2968();
									local216 = Static194.aClass1_Sub26_Sub1_3.method2945();
									if (local179 >= 1 && local179 <= 8) {
										if (local175.method3096(Static35.aClass107_245)) {
											local175 = null;
										}
										Static175.aClass107Array22[local179 - 1] = local175;
										Static43.aBooleanArray8[local179 - 1] = local216 == 0;
									}
									Static176.anInt3812 = -1;
									return true;
								} else {
									@Pc(2653) int local2653;
									@Pc(2471) Class107 local2471;
									@Pc(2487) int local2487;
									@Pc(2671) Class107 local2671;
									@Pc(2691) Class107 local2691;
									if (Static176.anInt3812 == 104) {
										local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
										local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
										local1851 = true;
										local685 = Static194.aClass1_Sub26_Sub1_3.method2945();
										if (local644 < 0L) {
											local1851 = false;
											local644 &= Long.MAX_VALUE;
										}
										local2471 = Static63.aClass107_427;
										if (local216 > 0) {
											local2471 = Static194.aClass1_Sub26_Sub1_3.method2978();
										}
										local1954 = Static19.method382(local644).method3092();
										for (local2487 = 0; local2487 < Static231.anInt4994; local2487++) {
											if (local644 == Static18.aLongArray1[local2487]) {
												if (local216 != Static196.anIntArray351[local2487]) {
													Static196.anIntArray351[local2487] = local216;
													if (local216 > 0) {
														Static136.method2282(Static149.method2437(new Class107[] { local1954, Static51.aClass107_825 }), 5, Static63.aClass107_427);
													}
													if (local216 == 0) {
														Static136.method2282(Static149.method2437(new Class107[] { local1954, Static115.aClass107_691 }), 5, Static63.aClass107_427);
													}
												}
												local1954 = null;
												Static149.aClass107Array17[local2487] = local2471;
												Static151.anIntArray292[local2487] = local685;
												Static211.aBooleanArray27[local2487] = local1851;
												break;
											}
										}
										if (local1954 != null && Static231.anInt4994 < 200) {
											Static18.aLongArray1[Static231.anInt4994] = local644;
											Static178.aClass107Array23[Static231.anInt4994] = local1954;
											Static196.anIntArray351[Static231.anInt4994] = local216;
											Static149.aClass107Array17[Static231.anInt4994] = local2471;
											Static151.anIntArray292[Static231.anInt4994] = local685;
											Static211.aBooleanArray27[Static231.anInt4994] = local1851;
											Static231.anInt4994++;
										}
										Static82.anInt1779 = Static218.anInt4760;
										local1049 = Static231.anInt4994;
										while (local1049 > 0) {
											@Pc(2618) boolean local2618 = true;
											local1049--;
											for (local1056 = 0; local1056 < local1049; local1056++) {
												if (Static196.anIntArray351[local1056] != Static170.anInt3689 && Static196.anIntArray351[local1056 + 1] == Static170.anInt3689 || Static196.anIntArray351[local1056] == 0 && Static196.anIntArray351[local1056 + 1] != 0) {
													local2653 = Static196.anIntArray351[local1056];
													Static196.anIntArray351[local1056] = Static196.anIntArray351[local1056 + 1];
													Static196.anIntArray351[local1056 + 1] = local2653;
													local2671 = Static149.aClass107Array17[local1056];
													local2618 = false;
													Static149.aClass107Array17[local1056] = Static149.aClass107Array17[local1056 + 1];
													Static149.aClass107Array17[local1056 + 1] = local2671;
													local2691 = Static178.aClass107Array23[local1056];
													Static178.aClass107Array23[local1056] = Static178.aClass107Array23[local1056 + 1];
													Static178.aClass107Array23[local1056 + 1] = local2691;
													@Pc(2709) long local2709 = Static18.aLongArray1[local1056];
													Static18.aLongArray1[local1056] = Static18.aLongArray1[local1056 + 1];
													Static18.aLongArray1[local1056 + 1] = local2709;
													@Pc(2727) int local2727 = Static151.anIntArray292[local1056];
													Static151.anIntArray292[local1056] = Static151.anIntArray292[local1056 + 1];
													Static151.anIntArray292[local1056 + 1] = local2727;
													@Pc(2745) boolean local2745 = Static211.aBooleanArray27[local1056];
													Static211.aBooleanArray27[local1056] = Static211.aBooleanArray27[local1056 + 1];
													Static211.aBooleanArray27[local1056 + 1] = local2745;
												}
											}
											if (local2618) {
												break;
											}
										}
										Static176.anInt3812 = -1;
										return true;
									} else if (Static176.anInt3812 == 108) {
										local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
										local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
										@Pc(2800) Class107 local2800 = Static58.method1124(local216).method1719(Static194.aClass1_Sub26_Sub1_3);
										Static174.method2775(null, Static19.method382(local644).method3092(), local2800, 19, local216);
										Static176.anInt3812 = -1;
										return true;
									} else {
										@Pc(2844) int local2844;
										@Pc(2861) int local2861;
										@Pc(2835) long local2835;
										@Pc(2840) long local2840;
										if (Static176.anInt3812 == 129) {
											local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
											Static194.aClass1_Sub26_Sub1_3.method2992();
											local949 = Static194.aClass1_Sub26_Sub1_3.method2943();
											local2835 = Static194.aClass1_Sub26_Sub1_3.method2964();
											local2840 = Static194.aClass1_Sub26_Sub1_3.method2937();
											local2844 = Static194.aClass1_Sub26_Sub1_3.method2945();
											local1049 = Static194.aClass1_Sub26_Sub1_3.method2964();
											@Pc(2852) boolean local2852 = false;
											@Pc(2859) long local2859 = (local2835 << 32) + local2840;
											local2861 = 0;
											label1168: while (true) {
												if (local2861 >= 100) {
													if (local2844 <= 1) {
														for (@Pc(2884) int local2884 = 0; local2884 < Static174.anInt3793; local2884++) {
															if (local644 == Static201.aLongArray7[local2884]) {
																local2852 = true;
																break label1168;
															}
														}
													}
													break;
												}
												if (local2859 == Static231.aLongArray9[local2861]) {
													local2852 = true;
													break;
												}
												local2861++;
											}
											if (!local2852 && Static97.anInt2101 == 0) {
												Static231.aLongArray9[Static33.anInt640] = local2859;
												Static33.anInt640 = (Static33.anInt640 + 1) % 100;
												local2691 = Static58.method1124(local1049).method1719(Static194.aClass1_Sub26_Sub1_3);
												if (local2844 == 2 || local2844 == 3) {
													Static174.method2775(Static19.method382(local949).method3092(), Static149.method2437(new Class107[] { Static185.aClass107_1330, Static19.method382(local644).method3092() }), local2691, 20, local1049);
												} else if (local2844 == 1) {
													Static174.method2775(Static19.method382(local949).method3092(), Static149.method2437(new Class107[] { Static29.aClass107_203, Static19.method382(local644).method3092() }), local2691, 20, local1049);
												} else {
													Static174.method2775(Static19.method382(local949).method3092(), Static19.method382(local644).method3092(), local2691, 20, local1049);
												}
											}
											Static176.anInt3812 = -1;
											return true;
										} else if (Static176.anInt3812 == 67) {
											local125 = Static194.aClass1_Sub26_Sub1_3.method2972();
											local179 = Static194.aClass1_Sub26_Sub1_3.method2983();
											if (local125 == 2) {
												Static157.method2541();
											}
											Static77.anInt1732 = local179;
											Static98.method1668(local179);
											Static154.method2516(false);
											Static222.method2941(Static77.anInt1732);
											for (local216 = 0; local216 < 100; local216++) {
												Static39.aBooleanArray5[local216] = true;
											}
											Static176.anInt3812 = -1;
											return true;
										} else if (Static176.anInt3812 == 208) {
											local125 = Static194.aClass1_Sub26_Sub1_3.method2987();
											local216 = local125 >> 10 & 0x1F;
											local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
											local689 = local125 & 0x1F;
											@Pc(3098) Class86 local3098 = Static13.method333(local179);
											local685 = local125 >> 5 & 0x1F;
											local1228 = (local216 << 19) - (-(local685 << 11) - (local689 << 3));
											if (local3098.anInt3230 != local1228) {
												local3098.anInt3230 = local1228;
												Static16.method354(local3098);
											}
											Static176.anInt3812 = -1;
											return true;
										} else {
											@Pc(3157) Class1_Sub11 local3157;
											if (Static176.anInt3812 == 169) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local216 = Static194.aClass1_Sub26_Sub1_3.method2981();
												local3157 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local216);
												if (local3157 != null) {
													Static165.method1867(local3157, local3157.anInt1575 != local179);
												}
												Static101.method1699(local216, local125, local179);
												Static176.anInt3812 = -1;
												return true;
											}
											@Pc(3246) Class86 local3246;
											if (Static176.anInt3812 == 95) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2958();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
												@Pc(3205) Class1_Sub11 local3205 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local125);
												local3157 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local179);
												if (local3157 != null) {
													Static165.method1867(local3157, local3205 == null || local3205.anInt1575 != local3157.anInt1575);
												}
												if (local3205 != null) {
													local3205.method3735();
													Static154.aClass50_18.method1362((long) local179, local3205);
												}
												local3246 = Static13.method333(local125);
												if (local3246 != null) {
													Static16.method354(local3246);
												}
												local3246 = Static13.method333(local179);
												if (local3246 != null) {
													Static16.method354(local3246);
													Static160.method2582(local3246, true);
												}
												if (Static77.anInt1732 != -1) {
													Static31.method2199(1, Static77.anInt1732);
												}
												Static176.anInt3812 = -1;
												return true;
											}
											@Pc(3313) long local3313;
											@Pc(3317) int local3317;
											if (Static176.anInt3812 == 2) {
												local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
												Static194.aClass1_Sub26_Sub1_3.method2992();
												local949 = Static194.aClass1_Sub26_Sub1_3.method2943();
												local2835 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local2840 = Static194.aClass1_Sub26_Sub1_3.method2937();
												local2844 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local3313 = local2840 + (local2835 << 32);
												@Pc(3315) boolean local3315 = false;
												local3317 = 0;
												label1214: while (true) {
													if (local3317 >= 100) {
														if (local2844 <= 1) {
															if (Static49.anInt1281 == 1 || Static99.anInt929 == 1) {
																local3315 = true;
															} else {
																for (local2861 = 0; local2861 < Static174.anInt3793; local2861++) {
																	if (Static201.aLongArray7[local2861] == local644) {
																		local3315 = true;
																		break label1214;
																	}
																}
															}
														}
														break;
													}
													if (local3313 == Static231.aLongArray9[local3317]) {
														local3315 = true;
														break;
													}
													local3317++;
												}
												if (!local3315 && Static97.anInt2101 == 0) {
													Static231.aLongArray9[Static33.anInt640] = local3313;
													Static33.anInt640 = (Static33.anInt640 + 1) % 100;
													local2671 = Static164.method3329(Static94.method1586(Static194.aClass1_Sub26_Sub1_3).method3087());
													if (local2844 == 2 || local2844 == 3) {
														Static201.method3222(local2671, Static149.method2437(new Class107[] { Static185.aClass107_1330, Static19.method382(local644).method3092() }), Static19.method382(local949).method3092());
													} else if (local2844 == 1) {
														Static201.method3222(local2671, Static149.method2437(new Class107[] { Static29.aClass107_203, Static19.method382(local644).method3092() }), Static19.method382(local949).method3092());
													} else {
														Static201.method3222(local2671, Static19.method382(local644).method3092(), Static19.method382(local949).method3092());
													}
												}
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 98) {
												Static14.method334();
												Static176.anInt3812 = -1;
												return false;
											} else if (Static176.anInt3812 == 192) {
												Static25.anInt490 = Static194.aClass1_Sub26_Sub1_3.method2945();
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 227) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2972();
												local216 = Static194.aClass1_Sub26_Sub1_3.method2945();
												Static191.anInt4237 = local125 >> 1;
												Static204.aClass5_Sub5_Sub1_2.method2311(local216, (local125 & 0x1) == 1, local179);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 56 || Static176.anInt3812 == 151 || Static176.anInt3812 == 60 || Static176.anInt3812 == 11 || Static176.anInt3812 == 110 || Static176.anInt3812 == 197 || Static176.anInt3812 == 28 || Static176.anInt3812 == 93 || Static176.anInt3812 == 80 || Static176.anInt3812 == 232 || Static176.anInt3812 == 61 || Static176.anInt3812 == 182) {
												Static71.method1285();
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 83) {
												@Pc(3609) byte local3609 = Static194.aClass1_Sub26_Sub1_3.method2950();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
												Static1.method54(local3609, local179);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 203) {
												local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
												local949 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local2835 = Static194.aClass1_Sub26_Sub1_3.method2937();
												@Pc(3644) boolean local3644 = false;
												@Pc(3650) long local3650 = local2835 + (local949 << 32);
												local981 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local2487 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local2653 = 0;
												label1230: while (true) {
													if (local2653 >= 100) {
														if (local981 <= 1) {
															for (local3317 = 0; local3317 < Static174.anInt3793; local3317++) {
																if (Static201.aLongArray7[local3317] == local644) {
																	local3644 = true;
																	break label1230;
																}
															}
														}
														break;
													}
													if (Static231.aLongArray9[local2653] == local3650) {
														local3644 = true;
														break;
													}
													local2653++;
												}
												if (!local3644 && Static97.anInt2101 == 0) {
													Static231.aLongArray9[Static33.anInt640] = local3650;
													Static33.anInt640 = (Static33.anInt640 + 1) % 100;
													@Pc(3727) Class107 local3727 = Static58.method1124(local2487).method1719(Static194.aClass1_Sub26_Sub1_3);
													if (local981 == 2) {
														Static174.method2775(null, Static149.method2437(new Class107[] { Static185.aClass107_1330, Static19.method382(local644).method3092() }), local3727, 18, local2487);
													} else if (local981 == 1) {
														Static174.method2775(null, Static149.method2437(new Class107[] { Static29.aClass107_203, Static19.method382(local644).method3092() }), local3727, 18, local2487);
													} else {
														Static174.method2775(null, Static19.method382(local644).method3092(), local3727, 18, local2487);
													}
												}
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 221) {
												local175 = Static194.aClass1_Sub26_Sub1_3.method2978();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local216 = Static194.aClass1_Sub26_Sub1_3.method2977();
												Static208.method3306(local179);
												Static109.method1903(local175, local216);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 138) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2995();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2987();
												local183 = Static13.method333(local125);
												if (local179 == 65535) {
													local179 = -1;
												}
												if (local183.anInt3257 != 2 || local179 != local183.anInt3228) {
													local183.anInt3257 = 2;
													local183.anInt3228 = local179;
													Static16.method354(local183);
												}
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 10) {
												local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
												@Pc(3892) boolean local3892 = false;
												local949 = Static194.aClass1_Sub26_Sub1_3.method2964();
												local2835 = Static194.aClass1_Sub26_Sub1_3.method2937();
												@Pc(3909) long local3909 = (local949 << 32) + local2835;
												local981 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local1056 = 0;
												label1265: while (true) {
													if (local1056 >= 100) {
														if (local981 <= 1) {
															if (Static49.anInt1281 == 1 || Static99.anInt929 == 1) {
																local3892 = true;
															} else {
																for (local2653 = 0; local2653 < Static174.anInt3793; local2653++) {
																	if (local644 == Static201.aLongArray7[local2653]) {
																		local3892 = true;
																		break label1265;
																	}
																}
															}
														}
														break;
													}
													if (local3909 == Static231.aLongArray9[local1056]) {
														local3892 = true;
														break;
													}
													local1056++;
												}
												if (!local3892 && Static97.anInt2101 == 0) {
													Static231.aLongArray9[Static33.anInt640] = local3909;
													Static33.anInt640 = (Static33.anInt640 + 1) % 100;
													@Pc(3996) Class107 local3996 = Static164.method3329(Static94.method1586(Static194.aClass1_Sub26_Sub1_3).method3087());
													if (local981 == 2 || local981 == 3) {
														Static136.method2282(local3996, 7, Static149.method2437(new Class107[] { Static185.aClass107_1330, Static19.method382(local644).method3092() }));
													} else if (local981 == 1) {
														Static136.method2282(local3996, 7, Static149.method2437(new Class107[] { Static29.aClass107_203, Static19.method382(local644).method3092() }));
													} else {
														Static136.method2282(local3996, 3, Static19.method382(local644).method3092());
													}
												}
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 65) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local216 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local685 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local689 = Static194.aClass1_Sub26_Sub1_3.method2964();
												Static23.aBooleanArray2[local125] = true;
												Static14.anIntArray36[local125] = local179;
												Static174.anIntArray332[local125] = local216;
												Static100.anIntArray217[local125] = local685;
												Static86.anIntArray197[local125] = local689;
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 119) {
												Static165.method1868(true);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 71) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
												if (local125 == 65535) {
													local125 = -1;
												}
												Static97.method1648(local125);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 126) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2985();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
												if (local179 == 65535) {
													local179 = -1;
												}
												Static224.method3664(local125, local179);
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 19) {
												Static188.method3059();
												local125 = Static194.aClass1_Sub26_Sub1_3.method2958();
												local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
												local216 = Static194.aClass1_Sub26_Sub1_3.method2968();
												Static83.anIntArray180[local216] = local125;
												Static85.anIntArray191[local216] = local179;
												Static59.anIntArray126[local216] = 1;
												for (local685 = 0; local685 < 98; local685++) {
													if (Canvas_Sub1.anIntArray224[local685] <= local125) {
														Static59.anIntArray126[local216] = local685 + 2;
													}
												}
												Static92.anIntArray205[Static86.anInt1901++ & 0x1F] = local216;
												Static176.anInt3812 = -1;
												return true;
											} else if (Static176.anInt3812 == 32) {
												local125 = Static194.aClass1_Sub26_Sub1_3.method2981();
												Static8.aClass84_1 = Static117.aClass34_2.method1061(local125);
												Static176.anInt3812 = -1;
												return true;
											} else {
												@Pc(4269) Class86 local4269;
												if (Static176.anInt3812 == 242) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2960();
													local4269 = Static13.method333(local125);
													for (local216 = 0; local216 < local4269.anIntArray285.length; local216++) {
														local4269.anIntArray285[local216] = -1;
														local4269.anIntArray285[local216] = 0;
													}
													Static16.method354(local4269);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 240) {
													local125 = Static194.aClass1_Sub26_Sub1_3.anInt4021 + Static24.anInt450;
													local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
													if (Static77.anInt1732 != local179) {
														Static77.anInt1732 = local179;
														Static98.method1668(Static77.anInt1732);
														Static154.method2516(false);
														Static222.method2941(Static77.anInt1732);
														for (local685 = 0; local685 < 100; local685++) {
															Static39.aBooleanArray5[local685] = true;
														}
													}
													while (local216-- > 0) {
														local685 = Static194.aClass1_Sub26_Sub1_3.method2958();
														local689 = Static194.aClass1_Sub26_Sub1_3.method2964();
														local1228 = Static194.aClass1_Sub26_Sub1_3.method2945();
														@Pc(4366) Class1_Sub11 local4366 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local685);
														if (local4366 != null && local689 != local4366.anInt1575) {
															Static165.method1867(local4366, true);
															local4366 = null;
														}
														if (local4366 == null) {
															local4366 = Static101.method1699(local685, local1228, local689);
														}
														local4366.aBoolean142 = true;
													}
													for (local3157 = (Class1_Sub11) Static154.aClass50_18.method1358(); local3157 != null; local3157 = (Class1_Sub11) Static154.aClass50_18.method1361()) {
														if (local3157.aBoolean142) {
															local3157.aBoolean142 = false;
														} else {
															Static165.method1867(local3157, true);
														}
													}
													Static155.aClass50_8.method1360();
													while (Static194.aClass1_Sub26_Sub1_3.anInt4021 < local125) {
														local689 = Static194.aClass1_Sub26_Sub1_3.method2958();
														local1228 = Static194.aClass1_Sub26_Sub1_3.method2964();
														local981 = Static194.aClass1_Sub26_Sub1_3.method2964();
														local2487 = Static194.aClass1_Sub26_Sub1_3.method2958();
														for (local2844 = local1228; local2844 <= local981; local2844++) {
															local3313 = (long) local2844 + ((long) local689 << 32);
															Static155.aClass50_8.method1362(local3313, new Class1_Sub5(local2487));
														}
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 230) {
													Static208.method3304();
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 234) {
													Static217.method3559(Static117.aClass34_2, Static194.aClass1_Sub26_Sub1_3, Static24.anInt450);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 5) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2995();
													local4269 = Static13.method333(local125);
													local4269.anInt3257 = 3;
													local4269.anInt3228 = Static204.aClass5_Sub5_Sub1_2.aClass56_10.method1531();
													Static16.method354(local4269);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 201) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2958();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
													if (local125 < -70000) {
														local179 += 32768;
													}
													if (local125 < 0) {
														local183 = null;
													} else {
														local183 = Static13.method333(local125);
													}
													while (Static194.aClass1_Sub26_Sub1_3.anInt4021 < Static24.anInt450) {
														local685 = Static194.aClass1_Sub26_Sub1_3.method2946();
														local689 = Static194.aClass1_Sub26_Sub1_3.method2964();
														local1228 = 0;
														if (local689 != 0) {
															local1228 = Static194.aClass1_Sub26_Sub1_3.method2945();
															if (local1228 == 255) {
																local1228 = Static194.aClass1_Sub26_Sub1_3.method2958();
															}
														}
														if (local183 != null && local685 >= 0 && local183.anIntArray285.length > local685) {
															local183.anIntArray285[local685] = local689;
															local183.anIntArray275[local685] = local1228;
														}
														Static195.method3182(local179, local689 - 1, local685, local1228);
													}
													if (local183 != null) {
														Static16.method354(local183);
													}
													Static188.method3059();
													Static70.anIntArray149[Static151.anInt3341++ & 0x1F] = local179 & 0x7FFF;
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 255) {
													local644 = Static194.aClass1_Sub26_Sub1_3.method2943();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local1851 = false;
													if ((local644 & Long.MIN_VALUE) != 0L) {
														local1851 = true;
													}
													@Pc(4672) byte local4672 = Static194.aClass1_Sub26_Sub1_3.method2992();
													if (local1851) {
														if (Static22.anInt437 == 0) {
															Static176.anInt3812 = -1;
															return true;
														}
														local644 &= Long.MAX_VALUE;
														for (local1228 = 0; Static22.anInt437 > local1228 && (local644 != Static39.aClass1_Sub13Array1[local1228].aLong177 || Static39.aClass1_Sub13Array1[local1228].anInt1728 != local216); local1228++) {
														}
														if (Static22.anInt437 > local1228) {
															while (local1228 < Static22.anInt437 - 1) {
																Static39.aClass1_Sub13Array1[local1228] = Static39.aClass1_Sub13Array1[local1228 + 1];
																local1228++;
															}
															Static22.anInt437--;
															Static39.aClass1_Sub13Array1[Static22.anInt437] = null;
														}
													} else {
														local2471 = Static194.aClass1_Sub26_Sub1_3.method2978();
														@Pc(4682) Class1_Sub13 local4682 = new Class1_Sub13();
														local4682.aLong177 = local644;
														local4682.aClass107_503 = Static19.method382(local4682.aLong177);
														local4682.aByte9 = local4672;
														local4682.anInt1728 = local216;
														local4682.aClass107_504 = local2471;
														for (local2487 = Static22.anInt437 - 1; local2487 >= 0; local2487--) {
															local2844 = Static39.aClass1_Sub13Array1[local2487].aClass107_503.method3078(local4682.aClass107_503);
															if (local2844 == 0) {
																Static39.aClass1_Sub13Array1[local2487].anInt1728 = local216;
																Static39.aClass1_Sub13Array1[local2487].aByte9 = local4672;
																Static39.aClass1_Sub13Array1[local2487].aClass107_504 = local2471;
																if (local644 == Static189.aLong149) {
																	Static10.aByte2 = local4672;
																}
																Static176.anInt3812 = -1;
																Static229.anInt4959 = Static218.anInt4760;
																return true;
															}
															if (local2844 < 0) {
																break;
															}
														}
														if (Static22.anInt437 >= Static39.aClass1_Sub13Array1.length) {
															Static176.anInt3812 = -1;
															return true;
														}
														for (local2844 = Static22.anInt437 - 1; local2844 > local2487; local2844--) {
															Static39.aClass1_Sub13Array1[local2844 + 1] = Static39.aClass1_Sub13Array1[local2844];
														}
														if (Static22.anInt437 == 0) {
															Static39.aClass1_Sub13Array1 = new Class1_Sub13[100];
														}
														Static39.aClass1_Sub13Array1[local2487 + 1] = local4682;
														Static22.anInt437++;
														if (local644 == Static189.aLong149) {
															Static10.aByte2 = local4672;
														}
													}
													Static229.anInt4959 = Static218.anInt4760;
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 76) {
													for (local125 = 0; local125 < Static141.anIntArray267.length; local125++) {
														if (Static203.anIntArray12[local125] != Static141.anIntArray267[local125]) {
															Static141.anIntArray267[local125] = Static203.anIntArray12[local125];
															Static126.method2109(local125);
															Static36.anIntArray80[Static173.anInt3758++ & 0x1F] = local125;
														}
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 87) {
													Static209.anInt4459 = Static194.aClass1_Sub26_Sub1_3.method2972();
													Static89.anInt1937 = Static194.aClass1_Sub26_Sub1_3.method2968();
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 238) {
													for (local125 = 0; local125 < Static198.aClass5_Sub5_Sub1Array1.length; local125++) {
														if (Static198.aClass5_Sub5_Sub1Array1[local125] != null) {
															Static198.aClass5_Sub5_Sub1Array1[local125].anInt3048 = -1;
														}
													}
													for (local179 = 0; local179 < Static33.aClass5_Sub5_Sub2Array1.length; local179++) {
														if (Static33.aClass5_Sub5_Sub2Array1[local179] != null) {
															Static33.aClass5_Sub5_Sub2Array1[local179].anInt3048 = -1;
														}
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 189) {
													if (Static24.anInt450 == 0) {
														Static210.aClass107_1225 = Static187.aClass107_1088;
													} else {
														Static210.aClass107_1225 = Static194.aClass1_Sub26_Sub1_3.method2978();
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 235) {
													Static184.anInt4144 = 0;
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 112) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2942();
													local179 = local125 >> 2;
													local685 = Static137.anIntArray255[local179];
													local689 = Static194.aClass1_Sub26_Sub1_3.method2987();
													if (local689 == 65535) {
														local689 = -1;
													}
													local216 = local125 & 0x3;
													local1228 = Static194.aClass1_Sub26_Sub1_3.method2995();
													local981 = local1228 >> 28 & 0x3;
													local2487 = local1228 >> 14 & 0x3FFF;
													@Pc(5099) int local5099 = local2487 - Static36.anInt764;
													local2844 = local1228 & 0x3FFF;
													@Pc(5107) int local5107 = local2844 - Static152.anInt3377;
													Static194.method3158(local179, local685, local216, local981, local689, local5107, local5099);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 46) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2995();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local250 = Static13.method333(local179);
													local250.anInt3248 = local125 + (local216 << 16);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 214) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2945();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2964();
													if (local125 == 65535) {
														local125 = -1;
													}
													Static15.method337(local125, local216, local179);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 31) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2960();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2983();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2958();
													if (local179 == 65535) {
														local179 = -1;
													}
													local685 = Static194.aClass1_Sub26_Sub1_3.method2977();
													if (local685 == 65535) {
														local685 = -1;
													}
													for (local689 = local685; local689 <= local179; local689++) {
														@Pc(5230) long local5230 = ((long) local216 << 32) + (long) local689;
														@Pc(5235) Class1 local5235 = Static155.aClass50_8.method1364(local5230);
														if (local5235 != null) {
															local5235.method3735();
														}
														Static155.aClass50_8.method1362(local5230, new Class1_Sub5(local125));
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 196) {
													Static188.method3059();
													Static171.anInt3711 = Static194.aClass1_Sub26_Sub1_3.method2944();
													Static176.anInt3812 = -1;
													Static90.anInt1963 = Static218.anInt4760;
													return true;
												} else if (Static176.anInt3812 == 96) {
													Static165.method1868(false);
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 22) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2977();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2964();
													Static88.anInt1924 = local179;
													Static79.anInt1741 = local125;
													Static70.method1250();
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 157) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2960();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2983();
													if (local179 == 65535) {
														local179 = -1;
													}
													local216 = Static194.aClass1_Sub26_Sub1_3.method2958();
													local250 = Static13.method333(local216);
													@Pc(5354) Class75 local5354;
													if (local250.aBoolean280) {
														local250.anInt3233 = local179;
														local250.anInt3291 = local125;
														local5354 = Static128.method2147(local179);
														local250.anInt3217 = local5354.anInt2738;
														local250.anInt3275 = local5354.anInt2706;
														local250.anInt3214 = local5354.anInt2721;
														if (local250.anInt3264 > 0) {
															local250.anInt3214 = local250.anInt3214 * 32 / local250.anInt3264;
														} else if (local250.anInt3288 > 0) {
															local250.anInt3214 = local250.anInt3214 * 32 / local250.anInt3288;
														}
														local250.anInt3226 = local5354.anInt2760;
														local250.anInt3252 = local5354.anInt2752;
														local250.anInt3229 = local5354.anInt2730;
														Static16.method354(local250);
													} else if (local179 == -1) {
														Static176.anInt3812 = -1;
														local250.anInt3257 = 0;
														return true;
													} else {
														local5354 = Static128.method2147(local179);
														local250.anInt3214 = local5354.anInt2721 * 100 / local125;
														local250.anInt3275 = local5354.anInt2706;
														local250.anInt3257 = 4;
														local250.anInt3229 = local5354.anInt2730;
														local250.anInt3228 = local179;
														Static16.method354(local250);
													}
													Static176.anInt3812 = -1;
													return true;
												} else if (Static176.anInt3812 == 153) {
													local125 = Static194.aClass1_Sub26_Sub1_3.method2964();
													local179 = Static194.aClass1_Sub26_Sub1_3.method2958();
													local216 = Static194.aClass1_Sub26_Sub1_3.method2983();
													local685 = Static194.aClass1_Sub26_Sub1_3.method2983();
													local3246 = Static13.method333(local179);
													if (local685 != local3246.anInt3229 || local125 != local3246.anInt3275 || local216 != local3246.anInt3214) {
														local3246.anInt3275 = local125;
														local3246.anInt3214 = local216;
														local3246.anInt3229 = local685;
														Static16.method354(local3246);
													}
													Static176.anInt3812 = -1;
													return true;
												} else {
													Static81.method1384(null, "T1 - " + Static176.anInt3812 + "," + Static18.anInt382 + "," + Static13.anInt317 + " - " + Static24.anInt450);
													Static14.method334();
													return true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Lclient!gk;")
	public static Class46 method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass46_1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method1960(@OriginalArg(0) Class28 arg0) {
		Static121.anInt2656 = arg0.method837(Static69.aClass107_447);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method1961() {
		Static39.anApplet_Sub1_1.method665();
	}
}
