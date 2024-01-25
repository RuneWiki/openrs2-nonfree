import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!dj;")
	public static Class48 aClass48_2;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "Lclient!nl;")
	public static Class171 aClass171_94;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "I")
	public static int anInt5999;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "[I")
	public static int[] anIntArray1261 = new int[2];

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "J")
	public static volatile long aLong195 = 0L;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)Z")
	public static boolean method5229(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(12) int local12 = local8.method5350();
		if (local12 != 1) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5350() == 1;
		if (local30) {
			Static292.method4420(local8);
		}
		Static187.method3244(local8);
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!wt;Z)Z")
	public static boolean method5230(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static350.aClass107Array4 == Static94.aClass107Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5537();
		if (arg0.aShort96 < 0 || arg0.aShort97 < 0 || arg0.aShort94 >= Static12.anInt312 || arg0.aShort95 >= Static341.anInt5833) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort96; local34 <= arg0.aShort94; local34++) {
			for (local38 = arg0.aShort97; local38 <= arg0.aShort95; local38++) {
				@Pc(45) Class251 local45 = Static377.method4610(arg0.aByte69, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort96) {
						local49++;
					}
					if (local34 < arg0.aShort94) {
						local49 += 4;
					}
					if (local38 > arg0.aShort97) {
						local49 += 8;
					}
					if (local38 < arg0.aShort95) {
						local49 += 2;
					}
					@Pc(74) Class46 local74 = Static360.method5254(local49, arg0);
					@Pc(77) Class46 local77 = local45.aClass46_3;
					if (local77 == null) {
						local45.aClass46_3 = local74;
					} else {
						while (local77.aClass46_1 != null) {
							local77 = local77.aClass46_1;
						}
						local77.aClass46_1 = local74;
					}
					local45.aByte76 = (byte) (local45.aByte76 | local49);
					if (local6 && (Static68.anIntArrayArray13[local34][local38] & 0xFF000000) != 0) {
						local8 = Static68.anIntArrayArray13[local34][local38];
						local10 = Static367.aByteArrayArray19[local34][local38];
						local12 = Static324.aByteArrayArray17[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort96; local38 <= arg0.aShort94; local38++) {
				for (@Pc(150) int local150 = arg0.aShort97; local150 <= arg0.aShort95; local150++) {
					if ((Static68.anIntArrayArray13[local38][local150] & 0xFF000000) == 0) {
						Static68.anIntArrayArray13[local38][local150] = local8;
						Static367.aByteArrayArray19[local38][local150] = local10;
						Static324.aByteArrayArray17[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static377.aClass1_Sub5Array5[Static167.anInt5330++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIBIIILclient!vc;I[[[BI)V")
	public static void method5231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class63 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg6 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg7 = arg7 + 1 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg7 = arg7 + 3 & 0x3;
			arg2 = 8;
		}
		arg8.method2023(arg0, arg9, arg3, arg5, arg11, arg1, arg10[arg2 - 1][arg7], arg6, arg4);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!tq;Lclient!nl;)V")
	public static void method5232(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class171 arg1) {
		Static345.aClass171_98 = arg1;
		Static371.anInterface9_7 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)V")
	public static void method5233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg1, 1);
		local8.method864();
		local8.anInt1037 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5234(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static190.aStringArray89.length; local12++) {
			if (Static190.aStringArray89[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBILclient!hq;)Lclient!ks;")
	public static Class2_Sub10_Sub11 method5235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(10) int local10 = arg2.anInt2705 | arg1 << 8;
		@Pc(24) Class2_Sub10_Sub11 local24 = (Class2_Sub10_Sub11) Static364.aClass166_5.method3688((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static305.aClass171_80.method3762(Static305.aClass171_80.method3760(local10));
		if (local36 == null) {
			local10 = arg0 + 65536 << 8 | arg2.anInt2705;
			local24 = (Class2_Sub10_Sub11) Static364.aClass166_5.method3688((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static305.aClass171_80.method3762(Static305.aClass171_80.method3760(local10));
			if (local36 == null) {
				local10 = arg2.anInt2705 | 0xFFFF00;
				local24 = (Class2_Sub10_Sub11) Static364.aClass166_5.method3688((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static305.aClass171_80.method3762(Static305.aClass171_80.method3760(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static131.method2581(local36);
					local24.aClass101_10 = arg2;
					Static364.aClass166_5.method3693((long) local10 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static131.method2581(local36);
				local24.aClass101_10 = arg2;
				Static364.aClass166_5.method3693((long) local10 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static131.method2581(local36);
			local24.aClass101_10 = arg2;
			Static364.aClass166_5.method3693((long) local10 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IC)C")
	public static char method5237(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
