import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	public static int anInt2485;

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt2478 = 0;

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "[Lclient!gd;")
	public static Class60[] aClass60Array1 = new Class60[4];

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!bb;Lclient!pl;)V")
	public static void method2209(@OriginalArg(1) Class1_Sub5_Sub1 arg0, @OriginalArg(2) Class136 arg1) {
		@Pc(5) Class57_Sub1 local5 = arg1.method3523();
		if (local5 == null) {
			return;
		}
		@Pc(16) int local16 = local5.anInt3768;
		if (local5.anInt3766 > local5.anInt3768) {
			local16 = local5.anInt3766;
		}
		@Pc(31) int local31 = arg0.anInt368;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = arg0.anInt360;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		@Pc(60) int local60;
		@Pc(88) int local88;
		if (arg1.aString142 != null) {
			local41 = Static170.aClass1_Sub5_Sub9_4.method2856(arg1.aString142, null, Static118.aStringArray14);
			for (local60 = 0; local60 < local41; local60++) {
				@Pc(67) String local67 = Static118.aStringArray14[local60];
				if (local41 - 1 > local60) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local88 = Static289.aClass6_8.method117(local67);
				if (local88 > local46) {
					local46 = local88;
				}
			}
			local48 = Static289.aClass6_8.method118() * (local41 - 1) + Static289.aClass6_8.method114() / 2;
		}
		local60 = arg0.anInt368;
		if (local16 + Static249.anInt5584 > local31) {
			local60 = Static249.anInt5584 + local16 + local16 / 2 + local46 / 2 + 5;
			local31 = local16 + Static249.anInt5584;
		} else if (Static249.anInt5579 - local16 < local31) {
			local60 = Static249.anInt5579 - local46 / 2 - local16 - local16 / 2 - 5;
			local31 = Static249.anInt5579 - local16;
		}
		@Pc(178) int local178 = arg0.anInt360 - local48 / 2;
		if (local44 < local16 + Static249.anInt5580) {
			local44 = local16 + Static249.anInt5580;
			local178 = local16 / 2 + Static249.anInt5580 + local16 + Static289.aClass6_8.method118();
		} else if (local44 > Static249.anInt5583 - local16) {
			local178 = Static249.anInt5583 - local16 / 2 - local16 - local48;
			local44 = Static249.anInt5583 - local16;
		}
		local16 >>= 0x1;
		local88 = (int) (Math.atan2((double) (local31 - arg0.anInt368), (double) (local44 - arg0.anInt360)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local5.method1656(local5.anInt3770 << 3, local5.anInt3763 << 3, local16 + (local31 << 4), local16 + (local44 << 4), local88);
		@Pc(276) int local276 = -2;
		@Pc(278) int local278 = -2;
		@Pc(280) int local280 = -2;
		@Pc(282) int local282 = -2;
		if (arg1.aString142 != null) {
			local278 = local178 - Static289.aClass6_8.method114() - 3;
			local280 = Static289.aClass6_8.method118() * local41 + local278;
			local276 = local60 - local46 / 2 - 5;
			local282 = local276 + local46 + 10;
			if (arg1.anInt4056 != 0) {
				Static77.method1584(local276, local278, local282 - local276, -local278 + local280, arg1.anInt4056, arg1.anInt4056 >>> 24);
			}
			if (arg1.anInt4066 != 0) {
				Static77.method1600(local276, local278, local282 - local276, -local278 + local280, arg1.anInt4066, arg1.anInt4066 >>> 24);
			}
			for (@Pc(362) int local362 = 0; local362 < local41; local362++) {
				@Pc(373) String local373 = Static118.aStringArray14[local362];
				if (local41 - 1 > local362) {
					local373 = local373.substring(0, local373.length() - 4);
				}
				Static289.aClass6_8.method122(local373, local60, local178, arg1.anInt4068);
				local178 += Static289.aClass6_8.method118();
			}
		}
		if ((local31 - local16 >= Static89.anInt1899 || local16 + local31 <= Static89.anInt1899 || local44 - local16 >= Static14.anInt309 || Static14.anInt309 >= local44 + local16) && (local276 >= Static89.anInt1899 || local282 <= Static89.anInt1899 || local278 >= Static14.anInt309 || local280 <= Static14.anInt309)) {
			return;
		}
		if (arg1.aStringArray24[4] != null) {
			Static69.method1328(arg1.aString141, 0, (short) 1001, -1, arg1.aStringArray24[4], 0, (long) arg0.anInt359);
		}
		if (arg1.aStringArray24[3] != null) {
			Static69.method1328(arg1.aString141, 0, (short) 1008, -1, arg1.aStringArray24[3], 0, (long) arg0.anInt359);
		}
		if (arg1.aStringArray24[2] != null) {
			Static69.method1328(arg1.aString141, 0, (short) 1005, -1, arg1.aStringArray24[2], 0, (long) arg0.anInt359);
		}
		if (arg1.aStringArray24[1] != null) {
			Static69.method1328(arg1.aString141, 0, (short) 1012, -1, arg1.aStringArray24[1], 0, (long) arg0.anInt359);
		}
		if (arg1.aStringArray24[0] != null) {
			Static69.method1328(arg1.aString141, 0, (short) 1009, -1, arg1.aStringArray24[0], 0, (long) arg0.anInt359);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIII)V")
	public static void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static76.aLong182 = 0L;
		@Pc(8) int local8 = Static269.method4147();
		@Pc(10) boolean local10 = false;
		if (arg3 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (local8 > 0 == arg3 <= 0) {
			local10 = true;
		}
		if (Static290.aString209.startsWith("mac") && arg3 > 0) {
			arg1 = true;
		}
		if (arg1 && arg3 > 0) {
			local10 = true;
		}
		Static64.method1135(arg2, local8, local10, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
	public static int method2212() {
		if (Static48.aBoolean103) {
			return 0;
		} else if (Static115.method2108()) {
			return Static128.aBoolean223 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIBI)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = local13 << 1;
		@Pc(21) int local21 = arg1 * arg1;
		@Pc(25) int local25 = arg1 << 1;
		@Pc(29) int local29 = local21 << 1;
		@Pc(38) int local38 = local21 - local17 * (local25 - 1);
		@Pc(42) int local42 = local13 << 2;
		@Pc(50) int local50 = (1 - local25) * local13 + local29;
		@Pc(54) int local54 = local21 << 2;
		@Pc(62) int local62 = local29 * 3;
		@Pc(76) int local76 = local17 * ((arg1 << 1) - 3);
		@Pc(82) int local82 = (arg1 - 1) * local42;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (Static231.anInt4333 <= arg4 && arg4 <= Static218.anInt4086) {
			local100 = Static306.method4566(arg3 + arg2, Static188.anInt3598, Static289.anInt5245);
			local109 = Static306.method4566(arg2 - arg3, Static188.anInt3598, Static289.anInt5245);
			Static103.method1978(arg0, local100, local109, Static40.anIntArrayArray6[arg4]);
		}
		@Pc(123) int local123 = local54;
		while (local9 > 0) {
			local9--;
			if (local50 < 0) {
				while (local50 < 0) {
					local50 += local62;
					local62 += local54;
					local7++;
					local38 += local123;
					local123 += local54;
				}
			}
			if (local38 < 0) {
				local38 += local123;
				local123 += local54;
				local7++;
				local50 += local62;
				local62 += local54;
			}
			local100 = arg4 - local9;
			local50 += -local82;
			local38 += -local76;
			local76 -= local42;
			local109 = arg4 + local9;
			if (Static231.anInt4333 <= local109 && local100 <= Static218.anInt4086) {
				@Pc(222) int local222 = Static306.method4566(local7 + arg2, Static188.anInt3598, Static289.anInt5245);
				@Pc(231) int local231 = Static306.method4566(arg2 - local7, Static188.anInt3598, Static289.anInt5245);
				if (local100 >= Static231.anInt4333) {
					Static103.method1978(arg0, local222, local231, Static40.anIntArrayArray6[local100]);
				}
				if (local109 <= Static218.anInt4086) {
					Static103.method1978(arg0, local222, local231, Static40.anIntArrayArray6[local109]);
				}
			}
			local82 -= local42;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(ZI)Lclient!aa;")
	public static Class2 method2215(@OriginalArg(1) int arg0) {
		@Pc(6) Class2 local6 = (Class2) Static312.aClass175_45.method4295((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static218.aClass119_75.method3235(arg0, 0);
		local6 = new Class2();
		if (local26 != null) {
			local6.method46(new Class1_Sub13(local26));
		}
		local6.method48();
		Static312.aClass175_45.method4285(local6, (long) arg0);
		return local6;
	}
}
