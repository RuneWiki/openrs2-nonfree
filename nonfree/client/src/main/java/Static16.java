import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public static int anInt331 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public static void method301() {
		if (Static350.anInt6718 == 0) {
			return;
		}
		try {
			if (++Static41.anInt725 > 2000) {
				if (Static155.aClass41_18 != null) {
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
				}
				if (Static18.anInt359 >= 1) {
					Static350.anInt6718 = 0;
					Static8.anInt187 = -5;
					return;
				}
				Static350.anInt6718 = 1;
				Static41.anInt725 = 0;
				if (Static195.anInt3881 == Static101.anInt1909) {
					Static101.anInt1909 = Static312.anInt6076;
				} else {
					Static101.anInt1909 = Static195.anInt3881;
				}
				Static18.anInt359++;
			}
			if (Static350.anInt6718 == 1) {
				Static164.aClass16_4 = Static182.aClass139_5.method3857(Static101.anInt1909, Static152.aString56);
				Static350.anInt6718 = 2;
			}
			@Pc(113) int local113;
			if (Static350.anInt6718 == 2) {
				if (Static164.aClass16_4.anInt381 == 2) {
					throw new IOException();
				}
				if (Static164.aClass16_4.anInt381 != 1) {
					return;
				}
				Static155.aClass41_18 = new Class41((Socket) Static164.aClass16_4.anObject1, Static182.aClass139_5);
				Static164.aClass16_4 = null;
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				local113 = Static155.aClass41_18.method830();
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				if (local113 != 21) {
					Static8.anInt187 = local113;
					Static350.anInt6718 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					return;
				}
				Static350.anInt6718 = 3;
			}
			if (Static350.anInt6718 == 3) {
				if (Static155.aClass41_18.method826() < 1) {
					return;
				}
				Static156.aStringArray38 = new String[Static155.aClass41_18.method830()];
				Static350.anInt6718 = 4;
			}
			if (Static350.anInt6718 == 4 && Static155.aClass41_18.method826() >= Static156.aStringArray38.length * 8) {
				Static187.aClass5_Sub12_Sub2_4.anInt5731 = 0;
				Static155.aClass41_18.method827(Static187.aClass5_Sub12_Sub2_4.aByteArray90, Static156.aStringArray38.length * 8, 0);
				for (local113 = 0; local113 < Static156.aStringArray38.length; local113++) {
					Static156.aStringArray38[local113] = Static289.method5017(Static187.aClass5_Sub12_Sub2_4.method5099());
				}
				Static8.anInt187 = 21;
				Static350.anInt6718 = 0;
				Static155.aClass41_18.method825();
				Static155.aClass41_18 = null;
			}
		} catch (@Pc(232) IOException local232) {
			if (Static155.aClass41_18 != null) {
				Static155.aClass41_18.method825();
				Static155.aClass41_18 = null;
			}
			if (Static18.anInt359 < 1) {
				Static41.anInt725 = 0;
				Static350.anInt6718 = 1;
				Static18.anInt359++;
				if (Static101.anInt1909 == Static195.anInt3881) {
					Static101.anInt1909 = Static312.anInt6076;
				} else {
					Static101.anInt1909 = Static195.anInt3881;
				}
			} else {
				Static8.anInt187 = -4;
				Static350.anInt6718 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZZ)V")
	public static void method302(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static75.aByteArrayArray6;
		} else {
			local9 = Static252.aByteArrayArray16;
		}
		@Pc(16) int local16 = Static245.aByteArrayArray15.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(36) int local36 = (Static198.anIntArray387[local18] >> 8) * 64 - Static172.anInt4394;
				@Pc(46) int local46 = (Static198.anIntArray387[local18] & 0xFF) * 64 - Static12.anInt3797;
				Static315.method5535();
				Static41.method638(local36, local46, Static152.aClass24Array3, arg0, Static236.aClass55_9, local24);
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[Lclient!bm;IIIILclient!ea;[BZIBI)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class55 arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class5_Sub12 local10 = new Class5_Sub12(arg7);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method5102();
			if (local22 == 0) {
				return;
			}
			local16 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method5060();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(49) int local49 = local33 & 0x3F;
				@Pc(55) int local55 = local33 >> 6 & 0x3F;
				@Pc(59) int local59 = local33 >> 12;
				@Pc(63) int local63 = local10.method5115();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				if (local59 == arg0 && arg4 <= local55 && local55 < arg4 + 8 && local49 >= arg10 && local49 < arg10 + 8) {
					@Pc(102) Class156 local102 = Static111.method1967(local16);
					@Pc(119) int local119 = Static272.method4787(local102.anInt4769, arg9, local55 & 0x7, local102.anInt4775, local71, local49 & 0x7) + arg3;
					@Pc(136) int local136 = arg5 + Static122.method2142(local71, local55 & 0x7, local102.anInt4769, arg9, local49 & 0x7, local102.anInt4775);
					if (local119 > 0 && local136 > 0 && Static22.anInt481 - 1 > local119 && local136 < Static269.anInt5281 - 1) {
						@Pc(158) Class24 local158 = null;
						if (!arg8) {
							@Pc(162) int local162 = arg2;
							if ((Static255.aByteArrayArrayArray13[1][local119][local136] & 0x2) == 2) {
								local162 = arg2 - 1;
							}
							if (local162 >= 0) {
								local158 = arg1[local162];
							}
						}
						Static86.method1554(local158, local136, arg9 + local71 & 0x3, local16, arg2, arg8, local67, arg2, -1, local119, arg6, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!of;Z)I")
	public static int method307(@OriginalArg(0) Class4_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) int local11 = arg0.anInt4560;
		@Pc(15) Class88 local15 = arg0.method4805();
		if (arg0.aBoolean446) {
			local11 = arg0.anInt4549;
		} else if (local15.anInt2272 == arg0.anInt5361 || local15.anInt2286 == arg0.anInt5361 || arg0.anInt5361 == local15.anInt2290 || arg0.anInt5361 == local15.anInt2275) {
			local11 = arg0.anInt4551;
		} else if (local15.anInt2276 == arg0.anInt5361 || arg0.anInt5361 == local15.anInt2308 || local15.anInt2314 == arg0.anInt5361 || arg0.anInt5361 == local15.anInt2305) {
			local11 = arg0.anInt4553;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	public static void method309() {
		if (Static223.aClass16_7 == null) {
			return;
		}
		if (Static223.aClass16_7.anInt381 == 1) {
			Static223.aClass16_7 = null;
			return;
		}
		if (Static223.aClass16_7.anInt381 == 2) {
			Static343.method5884(2, Static75.aClass139_4, Static273.aString52);
			Static223.aClass16_7 = null;
			return;
		}
	}
}
