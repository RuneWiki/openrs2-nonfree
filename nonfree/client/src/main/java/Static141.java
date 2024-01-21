import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Lclient!jg;")
	public static Class44 aClass44_25;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "I")
	public static int anInt3259;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "Lclient!jg;")
	public static Class44 aClass44_26;

	@OriginalMember(owner = "client!re", name = "X", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1127 = Static65.method1172("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1125 = aClass46_1127;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1126 = Static65.method1172(")3");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZ)V")
	public static void method2366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class3_Sub15 local14 = (Class3_Sub15) Static86.aClass59_6.method1731(); local14 != null; local14 = (Class3_Sub15) Static86.aClass59_6.method1734()) {
			if (local14.anInt2321 != -1 || local14.anIntArray236 != null) {
				@Pc(31) int local31 = 0;
				if (local14.anInt2318 < arg2) {
					local31 = arg2 - local14.anInt2318;
				} else if (local14.anInt2319 > arg2) {
					local31 = local14.anInt2319 - arg2;
				}
				if (arg0 > local14.anInt2316) {
					local31 += arg0 - local14.anInt2316;
				} else if (arg0 < local14.anInt2311) {
					local31 += local14.anInt2311 - arg0;
				}
				if (local31 - 64 > local14.anInt2322 || Static147.anInt3353 == 0 || arg1 != local14.anInt2314) {
					if (local14.aClass3_Sub5_Sub4_2 != null) {
						Static163.aClass3_Sub5_Sub3_2.method2451(local14.aClass3_Sub5_Sub4_2);
						local14.aClass3_Sub5_Sub4_2 = null;
					}
					if (local14.aClass3_Sub5_Sub4_1 != null) {
						Static163.aClass3_Sub5_Sub3_2.method2451(local14.aClass3_Sub5_Sub4_1);
						local14.aClass3_Sub5_Sub4_1 = null;
					}
				} else {
					local31 -= 64;
					if (local31 < 0) {
						local31 = 0;
					}
					@Pc(145) int local145 = Static147.anInt3353 * (local14.anInt2322 - local31) / local14.anInt2322;
					if (local14.aClass3_Sub5_Sub4_2 != null) {
						local14.aClass3_Sub5_Sub4_2.method2808(local145);
					} else if (local14.anInt2321 >= 0) {
						@Pc(166) Class24 local166 = Static183.method846(Static65.aClass44_Sub1_8, local14.anInt2321, 0);
						if (local166 != null) {
							@Pc(173) Class3_Sub9_Sub1 local173 = local166.method849().method2837(Static121.aClass41_1);
							@Pc(178) Class3_Sub5_Sub4 local178 = Static189.method2780(local173, local145);
							local178.method2785(-1);
							Static163.aClass3_Sub5_Sub3_2.method2455(local178);
							local14.aClass3_Sub5_Sub4_2 = local178;
						}
					}
					if (local14.aClass3_Sub5_Sub4_1 != null) {
						local14.aClass3_Sub5_Sub4_1.method2808(local145);
						if (!local14.aClass3_Sub5_Sub4_1.method2903()) {
							local14.aClass3_Sub5_Sub4_1 = null;
						}
					} else if (local14.anIntArray236 != null && (local14.anInt2312 -= arg3) <= 0) {
						@Pc(212) int local212 = (int) (Math.random() * (double) local14.anIntArray236.length);
						@Pc(220) Class24 local220 = Static183.method846(Static65.aClass44_Sub1_8, local14.anIntArray236[local212], 0);
						if (local220 != null) {
							@Pc(227) Class3_Sub9_Sub1 local227 = local220.method849().method2837(Static121.aClass41_1);
							@Pc(232) Class3_Sub5_Sub4 local232 = Static189.method2780(local227, local145);
							local232.method2785(0);
							Static163.aClass3_Sub5_Sub3_2.method2455(local232);
							local14.anInt2312 = (int) (Math.random() * (double) (local14.anInt2310 - local14.anInt2313)) + local14.anInt2313;
							local14.aClass3_Sub5_Sub4_1 = local232;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
	public static void method2368() {
		aClass46_1125 = null;
		aClass46_1127 = null;
		aClass46_1126 = null;
		aClass44_26 = null;
		aClass44_25 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Lclient!te;")
	public static Class3_Sub2_Sub15 method2369(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub15 local6 = (Class3_Sub2_Sub15) Static15.aClass57_3.method1719((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static111.aClass44_21.method1624(4, arg0);
		local6 = new Class3_Sub2_Sub15();
		if (local25 != null) {
			local6.method2537(new Class3_Sub4(local25), arg0);
		}
		Static15.aClass57_3.method1717(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method2370(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt1705 == Static20.anInt512 || arg0.anInt1738 == -1 || arg0.anInt1726 != 0 || arg0.anInt1706 + 1 > Static35.method628(arg0.anInt1738).anIntArray73[arg0.anInt1681]) {
			@Pc(33) int local33 = Static20.anInt512 - arg0.anInt1720;
			@Pc(40) int local40 = arg0.anInt1705 - arg0.anInt1720;
			@Pc(50) int local50 = arg0.anInt1712 * 64 + arg0.anInt1695 * 128;
			@Pc(60) int local60 = arg0.anInt1703 * 128 + arg0.anInt1712 * 64;
			@Pc(70) int local70 = arg0.anInt1712 * 64 + arg0.anInt1685 * 128;
			arg0.anInt1700 = (local50 * (local40 - local33) + local33 * local70) / local40;
			@Pc(94) int local94 = arg0.anInt1691 * 128 + arg0.anInt1712 * 64;
			arg0.anInt1711 = (local33 * local94 + local60 * (local40 - local33)) / local40;
		}
		if (arg0.anInt1725 == 0) {
			arg0.anInt1732 = 1024;
		}
		if (arg0.anInt1725 == 1) {
			arg0.anInt1732 = 1536;
		}
		arg0.anInt1709 = 0;
		if (arg0.anInt1725 == 2) {
			arg0.anInt1732 = 0;
		}
		if (arg0.anInt1725 == 3) {
			arg0.anInt1732 = 512;
		}
		arg0.anInt1736 = arg0.anInt1732;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!mc;I)V")
	public static void method2371(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		arg0.aBoolean65 = false;
		@Pc(18) Class3_Sub2_Sub2 local18;
		if (arg0.anInt1719 != -1) {
			local18 = Static35.method628(arg0.anInt1719);
			if (local18 == null || local18.anIntArray74 == null) {
				arg0.anInt1719 = -1;
			} else {
				arg0.anInt1701++;
				if (local18.anIntArray74.length > arg0.anInt1686 && local18.anIntArray73[arg0.anInt1686] < arg0.anInt1701) {
					arg0.anInt1701 = 1;
					arg0.anInt1686++;
					Static60.method1122(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt1686, local18, arg0.anInt1700, arg0.anInt1711);
				}
				if (arg0.anInt1686 >= local18.anIntArray74.length) {
					arg0.anInt1701 = 0;
					arg0.anInt1686 = 0;
					Static60.method1122(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt1686, local18, arg0.anInt1700, arg0.anInt1711);
				}
			}
		}
		if (arg0.anInt1707 != -1 && arg0.anInt1722 <= Static20.anInt512) {
			if (arg0.anInt1687 < 0) {
				arg0.anInt1687 = 0;
			}
			@Pc(127) int local127 = Static155.method2522(arg0.anInt1707).anInt1284;
			if (local127 == -1) {
				arg0.anInt1707 = -1;
			} else {
				@Pc(134) Class3_Sub2_Sub2 local134 = Static35.method628(local127);
				if (local134 == null || local134.anIntArray74 == null) {
					arg0.anInt1707 = -1;
				} else {
					arg0.anInt1728++;
					if (arg0.anInt1687 < local134.anIntArray74.length && arg0.anInt1728 > local134.anIntArray73[arg0.anInt1687]) {
						arg0.anInt1728 = 1;
						arg0.anInt1687++;
						Static60.method1122(arg0 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1, arg0.anInt1687, local134, arg0.anInt1700, arg0.anInt1711);
					}
					if (arg0.anInt1687 >= local134.anIntArray74.length) {
						arg0.anInt1707 = -1;
					}
				}
			}
		}
		if (arg0.anInt1738 != -1 && arg0.anInt1726 <= 1) {
			local18 = Static35.method628(arg0.anInt1738);
			if (local18.anInt946 == 1 && arg0.anInt1715 > 0 && Static20.anInt512 >= arg0.anInt1720 && arg0.anInt1705 < Static20.anInt512) {
				arg0.anInt1726 = 1;
				return;
			}
		}
		if (arg0.anInt1738 != -1 && arg0.anInt1726 == 0) {
			local18 = Static35.method628(arg0.anInt1738);
			if (local18 == null || local18.anIntArray74 == null) {
				arg0.anInt1738 = -1;
			} else {
				arg0.anInt1706++;
				if (local18.anIntArray74.length > arg0.anInt1681 && local18.anIntArray73[arg0.anInt1681] < arg0.anInt1706) {
					arg0.anInt1706 = 1;
					arg0.anInt1681++;
					Static60.method1122(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt1681, local18, arg0.anInt1700, arg0.anInt1711);
				}
				if (local18.anIntArray74.length <= arg0.anInt1681) {
					arg0.anInt1731++;
					arg0.anInt1681 -= local18.anInt945;
					if (local18.anInt953 <= arg0.anInt1731) {
						arg0.anInt1738 = -1;
					} else if (arg0.anInt1681 >= 0 && local18.anIntArray74.length > arg0.anInt1681) {
						Static60.method1122(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt1681, local18, arg0.anInt1700, arg0.anInt1711);
					} else {
						arg0.anInt1738 = -1;
					}
				}
				arg0.aBoolean65 = local18.aBoolean30;
			}
		}
		if (arg0.anInt1726 > 0) {
			arg0.anInt1726--;
		}
	}
}
