import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!sea", name = "u", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!sea", name = "x", descriptor = "[Lclient!d;")
	public static final Class1_Sub11[] aClass1_Sub11Array1 = new Class1_Sub11[300];

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!bd;[[BB)V")
	public static void method6469(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class1_Sub35 local30 = new Class1_Sub35(local23);
				local36 = Static566.anIntArray710[local17] >> 8;
				@Pc(42) int local42 = Static566.anIntArray710[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static541.anInt9058;
				@Pc(56) int local56 = local42 * 64 - Static116.anInt2289;
				Static510.method7089();
				arg0.method403(Static541.anInt9058, Static478.aClass59Array2, local49, Static116.anInt2289, local30, local56);
				arg0.method419(local56, local12, local49, local30, Static16.aClass134_1);
				if (!arg0.aBoolean48 && Static504.anInt5716 / 8 == local36 && local42 == Static188.anInt3531 / 8 && local12[0] != -1) {
					Static544.aClass197_1 = Static485.aClass318_1.method6999(local12[1], Static321.aClass279_1, local12[0], local12[3], local12[2]);
					Static198.anInt3676 = local12[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local15; local136++) {
			@Pc(149) int local149 = (Static566.anIntArray710[local136] >> 8) * 64 - Static541.anInt9058;
			local36 = (Static566.anIntArray710[local136] & 0xFF) * 64 - Static116.anInt2289;
			@Pc(164) byte[] local164 = arg1[local136];
			if (local164 == null && Static188.anInt3531 < 800) {
				Static510.method7089();
				arg0.method410(local149, local36);
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!vg;BI)V")
	public static void method6470(@OriginalArg(0) int arg0, @OriginalArg(1) Class341 arg1, @OriginalArg(3) int arg2) {
		if (Static93.aClass341_8 != null || Static554.aBoolean708 || (arg1 == null || Static540.method7390(arg1) == null)) {
			return;
		}
		Static93.aClass341_8 = arg1;
		Static303.aClass341_13 = Static540.method7390(arg1);
		Static571.anInt9433 = arg2;
		Static525.anInt8857 = 0;
		Static467.anInt7995 = arg0;
		Static468.aBoolean614 = false;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)I")
	public static int method6471(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		local60 /= 6.0D;
		@Pc(164) int local164 = (int) (local60 * 256.0D);
		@Pc(169) int local169 = (int) (local62 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		@Pc(188) int local188 = (int) (local68 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local169 >>= 0x4;
		} else if (local188 > 217) {
			local169 >>= 0x3;
		} else if (local188 > 192) {
			local169 >>= 0x2;
		} else if (local188 > 179) {
			local169 >>= 0x1;
		}
		return (local188 >> 1) + ((local164 >> 2 & 0x3F) << 10) + (local169 >> 5 << 7);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!lt;Lclient!r;ILclient!sp;)V")
	public static void method6472(@OriginalArg(0) Class1_Sub32 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(3) Class310 arg2) {
		@Pc(10) Class22 local10 = arg2.method6530(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local16 < local10.u()) {
			local16 = local10.u();
		}
		@Pc(28) int local28 = arg0.anInt5295;
		@Pc(31) int local31 = arg0.anInt5299;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg2.aString84 != null) {
			local33 = Static291.aClass334_9.method7357(null, null, arg2.aString84, Static594.aStringArray44);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static594.aStringArray44[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static575.aClass31_11.method484(local57);
				if (local35 < local78) {
					local35 = local78;
				}
			}
			local37 = Static575.aClass31_11.method486() * local33 + Static575.aClass31_11.method488() / 2;
		}
		local51 = local16 / 2 + arg0.anInt5295;
		if (local28 < Static226.anInt6313 + local16) {
			local51 = Static226.anInt6313 + local16 / 2 + local35 / 2 + 10 + 5;
			local28 = Static226.anInt6313;
		} else if (local28 > Static226.anInt6311 - local16) {
			local51 = Static226.anInt6311 - local16 / 2 - local35 / 2 - 10 - 5;
			local28 = Static226.anInt6311 - local16;
		}
		@Pc(167) int local167 = arg0.anInt5299;
		if (local16 + Static226.anInt6321 > local31) {
			local167 = Static226.anInt6321 + local16 / 2 + 10;
			local31 = Static226.anInt6321;
		} else if (Static226.anInt6320 - local16 < local31) {
			local167 = Static226.anInt6320 - local37 - local16 / 2 - 10;
			local31 = Static226.anInt6320 - local16;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg0.anInt5295), (double) (local31 - arg0.anInt5299)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7658((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		if (arg2.aString84 != null) {
			local248 = local51 - local35 / 2 - 5;
			local250 = local167;
			local254 = local33 * Static575.aClass31_11.method486() + local167 + 3;
			local252 = local248 + local35 + 10;
			if (arg2.anInt8115 != 0) {
				arg1.method6929(local252 - local248, local167, local248, arg2.anInt8115, local254 - local167);
			}
			if (arg2.anInt8119 != 0) {
				arg1.method6927(local252 - local248, arg2.anInt8119, local167, local254 - local167, local248);
			}
			for (@Pc(322) int local322 = 0; local322 < local33; local322++) {
				@Pc(328) String local328 = Static594.aStringArray44[local322];
				if (local33 - 1 > local322) {
					local328 = local328.substring(0, local328.length() - 4);
				}
				Static575.aClass31_11.method483(arg1, local328, local51, local167, arg2.anInt8126);
				local167 += Static575.aClass31_11.method486();
			}
		}
		if (arg2.anInt8124 == -1 && arg2.aString84 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(383) Class1_Sub9 local383 = new Class1_Sub9(arg0);
		local383.anInt1364 = local16 + local28;
		local383.anInt1358 = local28 - local16;
		local383.anInt1361 = local254;
		local383.anInt1357 = local252;
		local383.anInt1362 = local31 - local16;
		local383.anInt1359 = local16 + local31;
		local383.anInt1356 = local250;
		local383.anInt1365 = local248;
		Static497.aClass353_44.method7679(local383);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!mo;I)Lclient!qb;")
	public static Class43_Sub3 method6473(@OriginalArg(0) Class1_Sub35 arg0) {
		return new Class43_Sub3(arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5797(), arg0.method5797(), arg0.method5750());
	}
}
