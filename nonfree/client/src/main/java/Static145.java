import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!ra;")
	public static Class170 aClass170_118;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_38 = new Class211();

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_39 = new Class211();

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
	public static boolean aBoolean466 = true;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString358 = null;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString359 = "shake:";

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!en;III[BI[Lclient!dl;ZI)V")
	public static void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class49[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(14) Class5_Sub1 local14 = new Class5_Sub1(arg7);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method1837();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method1866();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local14.method1832();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (local54 == arg2 && local50 >= arg4 && local50 < arg4 + 8 && arg0 <= local44 && local44 < arg0 + 8) {
					@Pc(99) Class137 local99 = Static228.method3923(local16);
					@Pc(116) int local116 = Static64.method1358(local66, local50 & 0x7, arg5, local99.anInt4166, local99.anInt4126, local44 & 0x7) + arg1;
					@Pc(134) int local134 = arg6 + Static162.method3005(local99.anInt4126, arg5, local99.anInt4166, local50 & 0x7, local44 & 0x7, local66);
					if (local116 > 0 && local134 > 0 && local116 < Static266.anInt5101 - 1 && Static339.anInt6352 - 1 > local134) {
						@Pc(160) Class49 local160 = null;
						if (!arg10) {
							@Pc(164) int local164 = arg8;
							if ((Static32.aByteArrayArrayArray4[1][local116][local134] & 0x2) == 2) {
								local164 = arg8 - 1;
							}
							if (local164 >= 0) {
								local160 = arg9[local164];
							}
						}
						Static164.method3035(arg8, local62, arg3, -1, local160, arg8, local16, local134, local66 + arg5 & 0x3, local116, arg10, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public static void method5519() {
		@Pc(8) int local8 = Static27.aByteArrayArray19.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static27.aByteArrayArray19[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static176.anInt1943; local20++) {
					if (Static179.anIntArray267[local20] == Static338.anIntArray283[local10]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static179.anIntArray267[Static176.anInt1943] = Static338.anIntArray283[local10];
					local18 = Static176.anInt1943++;
				}
				@Pc(59) Class5_Sub1 local59 = new Class5_Sub1(Static27.aByteArrayArray19[local10]);
				@Pc(61) int local61 = 0;
				while (local59.anInt2029 < Static27.aByteArrayArray19[local10].length && local61 < 511 && Static63.anInt1486 < 1023) {
					@Pc(80) int local80 = local61++ << 6 | local18;
					@Pc(86) int local86 = local59.method1845();
					@Pc(90) int local90 = local86 >> 14;
					@Pc(96) int local96 = local86 >> 7 & 0x3F;
					@Pc(100) int local100 = local86 & 0x3F;
					@Pc(112) int local112 = (Static338.anIntArray283[local10] >> 8) * 64 + local96 - Static263.anInt5063;
					@Pc(124) int local124 = local100 + (Static338.anIntArray283[local10] & 0xFF) * 64 - Static28.anInt773;
					@Pc(130) Class216 local130 = Static2.method5(local59.method1845());
					if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local80] == null && (local130.aByte73 & 0x1) > 0 && Static9.anInt297 == local90 && local112 >= 0 && local130.anInt6566 + local112 < Static266.anInt5101 && local124 >= 0 && Static339.anInt6352 > local130.anInt6566 + local124) {
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local80] = new Class25_Sub1_Sub1_Sub2();
						Static188.aClass25_Sub1_Sub1_Sub2Array1[local80].anInt5287 = local80;
						@Pc(180) Class25_Sub1_Sub1_Sub2 local180 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local80];
						Static331.anIntArray535[Static63.anInt1486++] = local80;
						local180.anInt5320 = Static180.anInt3606;
						local180.method4664(local130);
						local180.method4644(local180.aClass216_1.anInt6566);
						local180.anInt5308 = local180.aClass216_1.anInt6544 << 3;
						if (local180.anInt5308 == 0) {
							local180.method4648(0);
						} else {
							local180.method4648(Static301.anIntArray504[local180.aClass216_1.aByte75 - 1]);
						}
						local180.method4658(local112, local90, local124, local180.method4646(), true);
					}
				}
			}
		}
	}
}
