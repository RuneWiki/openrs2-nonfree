import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt2036;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1961(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local7 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local18);
			if (local28 >= 'A' && local28 <= 'Z') {
				local7 += (long) (local28 + 1 - 65);
			} else if (local28 >= 'a' && local28 <= 'z') {
				local7 += (long) (local28 + 1 - 97);
			} else if (local28 >= '0' && local28 <= '9') {
				local7 += (long) (local28 + 27 - 48);
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILclient!qo;BI)V")
	public static void method1962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60_Sub1_Sub1_Sub3 arg3) {
		Static155.method3086(arg3.aByte135, arg2, arg3.anInt9048, arg0, arg3.anInt9057, 0, arg1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBI)Lclient!pca;")
	public static Class277 method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(38) long local38 = (long) arg2 & 0xFFFFL | ((long) arg3 & 0xFFFFL) << 48 | ((long) arg0 & 0xFFFFL) << 32 | (long) arg1 << 16 & 0xFFFFL << 16;
		@Pc(44) Class277 local44 = (Class277) Static99.aClass359_12.method8517(local38);
		if (local44 == null) {
			local44 = Static227.aClass298_1.method7254(arg3, arg1, Static276.aClass350_1, arg0, arg2);
			Static99.aClass359_12.method8515(local38, local44);
		}
		return local44;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!vo;ZII)V")
	public static void method1964(@OriginalArg(1) Class381 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg0.anInt10159;
		@Pc(18) int local18 = arg0.anInt10131;
		if (arg0.aByte144 == 0) {
			arg0.anInt10159 = arg0.anInt10094;
		} else if (arg0.aByte144 == 1) {
			arg0.anInt10159 = arg2 - arg0.anInt10094;
		} else if (arg0.aByte144 == 2) {
			arg0.anInt10159 = arg0.anInt10094 * arg2 >> 14;
		}
		if (arg0.aByte146 == 0) {
			arg0.anInt10131 = arg0.anInt10108;
		} else if (arg0.aByte146 == 1) {
			arg0.anInt10131 = arg3 - arg0.anInt10108;
		} else if (arg0.aByte146 == 2) {
			arg0.anInt10131 = arg0.anInt10108 * arg3 >> 14;
		}
		if (arg0.aByte144 == 4) {
			arg0.anInt10159 = arg0.anInt10131 * arg0.anInt10093 / arg0.anInt10115;
		}
		if (arg0.aByte146 == 4) {
			arg0.anInt10131 = arg0.anInt10115 * arg0.anInt10159 / arg0.anInt10093;
		}
		if (Static628.aBoolean728 && (Static78.method1061(arg0).anInt5776 != 0 || arg0.anInt10156 == 0)) {
			if (arg0.anInt10131 < 5 && arg0.anInt10159 < 5) {
				arg0.anInt10159 = 5;
				arg0.anInt10131 = 5;
			} else {
				if (arg0.anInt10131 <= 0) {
					arg0.anInt10131 = 5;
				}
				if (arg0.anInt10159 <= 0) {
					arg0.anInt10159 = 5;
				}
			}
		}
		if (arg0.anInt10117 == Static557.anInt9010) {
			Static493.aClass381_10 = arg0;
		}
		if (arg1 && arg0.anObjectArray11 != null && (arg0.anInt10159 != local15 || arg0.anInt10131 != local18)) {
			@Pc(245) Class6_Sub53 local245 = new Class6_Sub53();
			local245.anObjectArray3 = arg0.anObjectArray11;
			local245.aClass381_11 = arg0;
			Static131.aClass340_20.method8131(local245);
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method1965() {
		@Pc(8) int local8 = Static76.aByteArrayArray27.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static76.aByteArrayArray27[local10] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static250.anInt4755; local22++) {
					if (Static617.anIntArray642[local10] == Static84.anIntArray81[local22]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static84.anIntArray81[Static250.anInt4755] = Static617.anIntArray642[local10];
					local20 = Static250.anInt4755++;
				}
				@Pc(73) Class6_Sub15 local73 = new Class6_Sub15(Static76.aByteArrayArray27[local10]);
				@Pc(75) int local75 = 0;
				while (Static76.aByteArrayArray27[local10].length > local73.anInt3174 && local75 < 511 && Static201.anInt4069 < 1023) {
					@Pc(96) int local96 = local20 | local75++ << 6;
					@Pc(100) int local100 = local73.method3018();
					@Pc(104) int local104 = local100 >> 14;
					@Pc(110) int local110 = local100 >> 7 & 0x3F;
					@Pc(114) int local114 = local100 & 0x3F;
					@Pc(128) int local128 = (Static617.anIntArray642[local10] >> 8) * 64 + local110 - Static50.anInt606;
					@Pc(140) int local140 = local114 + (Static617.anIntArray642[local10] & 0xFF) * 64 - Static404.anInt7039;
					@Pc(147) Class294 local147 = Static221.aClass164_1.method4157(local73.method3018());
					@Pc(154) Class6_Sub11 local154 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local96);
					if (local154 == null && (local147.aByte110 & 0x1) > 0 && local104 == Static621.anInt9796 && local128 >= 0 && local147.anInt8169 + local128 < Static29.anInt380 && local140 >= 0 && Static327.anInt5650 > local147.anInt8169 + local140) {
						@Pc(203) Class60_Sub1_Sub1_Sub3_Sub2 local203 = new Class60_Sub1_Sub1_Sub3_Sub2();
						local203.anInt4845 = local96;
						@Pc(211) Class6_Sub11 local211 = new Class6_Sub11(local203);
						Static419.aClass74_45.method1399(local211, (long) local96);
						Static216.aClass6_Sub11Array1[Static251.anInt4781++] = local211;
						Static531.anIntArray580[Static201.anInt4069++] = local96;
						local203.anInt4866 = Static141.anInt8737;
						local203.method4435(local147);
						local203.method4432(local203.aClass294_1.anInt8169);
						local203.anInt4865 = local203.aClass294_1.anInt8162 << 3;
						local203.method4423(true, (local203.aClass294_1.aByte111 + 4 & 0xBD400007) << 11);
						local203.method4440(local128, local203.method4424((byte) -28), true, local140, local104);
					}
				}
			}
		}
	}
}
