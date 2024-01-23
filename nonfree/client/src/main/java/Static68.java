import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static int anInt1403;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt1405;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!se;")
	public static Class122 aClass122_5;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static int anInt1401 = 0;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIIIIII)V")
	public static void method976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		@Pc(19) int local19 = arg5 * arg5;
		@Pc(23) int local23 = arg6 * arg6;
		@Pc(28) int local28 = arg6 - arg4;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local28 * local28;
		@Pc(40) int local40 = local23 << 1;
		@Pc(44) int local44 = local19 << 1;
		@Pc(48) int local48 = local32 << 1;
		@Pc(52) int local52 = local36 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local28 << 1;
		@Pc(68) int local68 = (1 - local56) * local19 + local40;
		@Pc(78) int local78 = (1 - local60) * local32 + local52;
		@Pc(87) int local87 = local36 - local48 * (local60 - 1);
		@Pc(91) int local91 = local19 << 2;
		@Pc(100) int local100 = local23 - local44 * (local56 - 1);
		@Pc(104) int local104 = local32 << 2;
		@Pc(108) int local108 = local40 * 3;
		@Pc(112) int local112 = local23 << 2;
		@Pc(116) int local116 = local36 << 2;
		@Pc(122) int local122 = (local60 - 3) * local48;
		@Pc(133) int local133 = (local56 - 3) * local44;
		@Pc(135) int local135 = local112;
		@Pc(139) int local139 = local52 * 3;
		@Pc(145) int local145 = (arg6 - 1) * local91;
		@Pc(147) int local147 = local116;
		@Pc(153) int local153 = local104 * (local28 - 1);
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(206) int local206;
		if (arg0 >= Static202.anInt4469 && Static94.anInt4237 >= arg0) {
			@Pc(171) int[] local171 = Static29.anIntArrayArray10[arg0];
			local179 = Static3.method36(Static167.anInt3907, arg2 - arg5, Static150.anInt3860);
			local187 = Static3.method36(Static167.anInt3907, arg2 + arg5, Static150.anInt3860);
			local196 = Static3.method36(Static167.anInt3907, arg2 - local15, Static150.anInt3860);
			local206 = Static3.method36(Static167.anInt3907, arg2 + local15, Static150.anInt3860);
			Static147.method2681(local171, arg1, local179, local196);
			Static147.method2681(local171, arg3, local196, local206);
			Static147.method2681(local171, arg1, local206, local187);
		}
		while (local9 > 0) {
			@Pc(239) boolean local239 = local28 >= local9;
			local9--;
			if (local68 < 0) {
				while (local68 < 0) {
					local7++;
					local100 += local135;
					local68 += local108;
					local135 += local112;
					local108 += local112;
				}
			}
			if (local239) {
				if (local78 < 0) {
					while (local78 < 0) {
						local87 += local147;
						local11++;
						local147 += local116;
						local78 += local139;
						local139 += local116;
					}
				}
				if (local87 < 0) {
					local87 += local147;
					local78 += local139;
					local11++;
					local139 += local116;
					local147 += local116;
				}
				local78 += -local153;
				local87 += -local122;
				local122 -= local104;
				local153 -= local104;
			}
			local179 = arg0 - local9;
			local187 = local9 + arg0;
			if (local100 < 0) {
				local7++;
				local68 += local108;
				local108 += local112;
				local100 += local135;
				local135 += local112;
			}
			local100 += -local133;
			if (Static202.anInt4469 <= local187 && local179 <= Static94.anInt4237) {
				local196 = Static3.method36(Static167.anInt3907, local7 + arg2, Static150.anInt3860);
				local206 = Static3.method36(Static167.anInt3907, arg2 - local7, Static150.anInt3860);
				if (local239) {
					@Pc(424) int local424 = Static3.method36(Static167.anInt3907, local11 + arg2, Static150.anInt3860);
					@Pc(433) int local433 = Static3.method36(Static167.anInt3907, arg2 - local11, Static150.anInt3860);
					@Pc(440) int[] local440;
					if (local179 >= Static202.anInt4469) {
						local440 = Static29.anIntArrayArray10[local179];
						Static147.method2681(local440, arg1, local206, local433);
						Static147.method2681(local440, arg3, local433, local424);
						Static147.method2681(local440, arg1, local424, local196);
					}
					if (Static94.anInt4237 >= local187) {
						local440 = Static29.anIntArrayArray10[local187];
						Static147.method2681(local440, arg1, local206, local433);
						Static147.method2681(local440, arg3, local433, local424);
						Static147.method2681(local440, arg1, local424, local196);
					}
				} else {
					if (Static202.anInt4469 <= local179) {
						Static147.method2681(Static29.anIntArrayArray10[local179], arg1, local206, local196);
					}
					if (local187 <= Static94.anInt4237) {
						Static147.method2681(Static29.anIntArrayArray10[local187], arg1, local206, local196);
					}
				}
			}
			local68 += -local145;
			local133 -= local91;
			local145 -= local91;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)[Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1[] method977() {
		@Pc(8) Class1_Sub2_Sub4_Sub1[] local8 = new Class1_Sub2_Sub4_Sub1[Static75.anInt2041];
		for (@Pc(22) int local22 = 0; local22 < Static75.anInt2041; local22++) {
			@Pc(32) int local32 = Static218.anIntArray382[local22] * Static233.anIntArray438[local22];
			@Pc(36) byte[] local36 = Static11.aByteArrayArray1[local22];
			@Pc(39) int[] local39 = new int[local32];
			for (@Pc(41) int local41 = 0; local41 < local32; local41++) {
				local39[local41] = Static102.anIntArray201[local36[local41] & 0xFF];
			}
			local8[local22] = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[local22], Static79.anIntArray165[local22], Static218.anIntArray382[local22], Static233.anIntArray438[local22], local39);
		}
		Static259.method4155();
		return local8;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIB)Ljava/lang/String;")
	public static String method978(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(61) int local61 = local34 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(75) int local75 = local65 - arg0 * 10;
			if (local75 >= 10) {
				local53[local61] = (char) (local75 + 87);
			} else {
				local53[local61] = (char) (local75 + 48);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!hc;)Lclient!ke;")
	public static Class1_Sub2_Sub4 method980(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		return Static181.method3124(arg1, arg0) ? Static109.method2226() : null;
	}
}
