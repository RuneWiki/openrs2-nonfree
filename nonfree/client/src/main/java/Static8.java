import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!ic;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_151 = Static34.method846("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!le;")
	public static Class36 aClass36_5 = new Class36(64);

	@OriginalMember(owner = "client!be", name = "m", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public static int anInt376 = 0;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "I")
	public static int anInt378 = 0;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "I")
	public static int anInt383 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method324() {
		aClass6_Sub2_Sub2_Sub1_3 = null;
		aClass55_151 = null;
		aLongArray1 = null;
		aClass36_5 = null;
		aClass19_1 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!d;")
	public static Class6_Sub2_Sub4 method326(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub4 local10 = (Class6_Sub2_Sub4) Static47.aClass36_19.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static79.aClass40_29.method1243(arg0, 9);
		local10 = new Class6_Sub2_Sub4();
		local10.anInt858 = arg0;
		if (local20 != null) {
			local10.method535(new Class6_Sub1(local20));
		}
		local10.method538();
		Static47.aClass36_19.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII[Lclient!te;IIIII)V")
	public static void method327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub2_Sub14[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(9) Class6_Sub2_Sub14 local9 = arg4[local3];
			if (local9 != null && (local9.anInt2890 == 0 || local9.aBoolean143) && local9 != null && local9.anInt2880 == arg0 && (!local9.aBoolean139 || Static10.aBoolean29)) {
				@Pc(39) int local39 = arg5 + local9.anInt2889;
				if (!local9.aBoolean140) {
					local39 -= arg3;
				}
				@Pc(51) int local51 = arg6 + local9.anInt2918;
				if (!local9.aBoolean140) {
					local51 -= arg2;
				}
				@Pc(63) int local63 = local39 + local9.anInt2914;
				@Pc(68) int local68 = local9.anInt2875 + local51;
				@Pc(75) int local75 = arg5 < local39 ? local39 : arg5;
				@Pc(86) int local86 = arg6 < local51 ? local51 : arg6;
				@Pc(97) int local97 = local63 >= arg1 ? arg1 : local63;
				@Pc(104) int local104 = local68 < arg8 ? local68 : arg8;
				if (local9.anInt2890 == 0) {
					method327(local9.anInt2920, local97, local9.anInt2905, local9.anInt2879, arg4, local75, local86, arg7, local104);
					if (local9.aClass6_Sub2_Sub14Array1 != null) {
						method327(local9.anInt2920, local97, local9.anInt2905, local9.anInt2879, local9.aClass6_Sub2_Sub14Array1, local75, local86, arg7, local104);
					}
				}
				if (local9.aBoolean143) {
					@Pc(147) boolean local147 = false;
					if (Static85.anInt2400 == 1 && Static68.anInt2013 >= local75 && Static23.anInt1030 >= local86 && local97 > Static68.anInt2013 && local104 > Static23.anInt1030) {
						local147 = true;
					}
					if (local9.anInt2906 != -1 && local147 && Static77.aClass6_Sub2_Sub14_37 == null && (arg7 & 0x200) != 0 && !Static109.aBoolean163) {
						Static77.aClass6_Sub2_Sub14_37 = local9;
						Static65.anInt1952 = Static27.anInt1358;
						Static11.aBoolean30 = false;
						Static38.anInt1386 = 0;
						Static63.anInt1890 = Static58.anInt1741;
					}
					@Pc(201) boolean local201 = false;
					@Pc(223) boolean local223;
					if (local75 <= Static58.anInt1741 && local86 <= Static27.anInt1358 && Static58.anInt1741 < local97 && Static27.anInt1358 < local104) {
						local223 = true;
					} else {
						local223 = false;
					}
					if (Static6.anInt275 == 1 && local223) {
						local201 = true;
					}
					if (Static77.aClass6_Sub2_Sub14_37 != null || Static109.aBoolean163) {
						local201 = false;
						local223 = false;
						local147 = false;
					}
					if (!local9.aBoolean135 && local147 && (arg7 & 0x1) != 0) {
						local9.aBoolean135 = true;
						if (local9.anObjectArray1 != null) {
							Static51.method1093(Static23.anInt1030 - local51, local9.anObjectArray1, local9, Static68.anInt2013 - local39);
						}
					}
					if (local9.aBoolean135 && local201 && (arg7 & 0x4) != 0 && local9.anObjectArray8 != null) {
						Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray8, local9, Static58.anInt1741 - local39);
					}
					if (local9.aBoolean135 && !local201 && (arg7 & 0x2) != 0) {
						local9.aBoolean135 = false;
						if (local9.anObjectArray13 != null) {
							Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray13, local9, Static58.anInt1741 - local39);
						}
					}
					if (local201 && (arg7 & 0x8) != 0 && local9.anObjectArray5 != null) {
						Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray5, local9, Static58.anInt1741 - local39);
					}
					if (!local9.aBoolean133 && local223 && (arg7 & 0x10) != 0) {
						local9.aBoolean133 = true;
						if (local9.anObjectArray10 != null) {
							Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray10, local9, Static58.anInt1741 - local39);
						}
					}
					if (local9.aBoolean133 && local223 && (arg7 & 0x40) != 0 && local9.anObjectArray11 != null) {
						Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray11, local9, Static58.anInt1741 - local39);
					}
					if (local9.aBoolean133 && !local223 && (arg7 & 0x20) != 0) {
						local9.aBoolean133 = false;
						if (local9.anObjectArray3 != null) {
							Static51.method1093(Static27.anInt1358 - local51, local9.anObjectArray3, local9, Static58.anInt1741 - local39);
						}
					}
					if (local9.anObjectArray2 != null && (arg7 & 0x80) != 0) {
						Static51.method1093(0, local9.anObjectArray2, local9, 0);
					}
					if (Static109.anInt3142 == Static85.anInt2389 && local9.anObjectArray14 != null && (arg7 & 0x100) != 0) {
						Static51.method1093(0, local9.anObjectArray14, local9, 0);
					}
					if (Static57.anInt1730 == Static85.anInt2389 && local9.anObjectArray7 != null && (arg7 & 0x400) != 0) {
						Static51.method1093(0, local9.anObjectArray7, local9, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Lclient!ua;")
	public static Class6_Sub2_Sub15 method333(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub15 local10 = (Class6_Sub2_Sub15) Static71.aClass36_24.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static6.aClass40_7.method1243(arg0, 6);
		local10 = new Class6_Sub2_Sub15();
		local10.anInt3013 = arg0;
		if (local20 != null) {
			local10.method1943(new Class6_Sub1(local20));
		}
		local10.method1933();
		if (local10.aBoolean149) {
			local10.aBoolean151 = false;
			local10.aBoolean150 = false;
		}
		Static71.aClass36_24.method1161((long) arg0, local10);
		return local10;
	}
}
