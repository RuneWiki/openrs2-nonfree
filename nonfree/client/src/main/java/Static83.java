import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public static int anInt1562;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public static int anInt1554 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method1268() {
		if (Static284.method4678() != 2) {
			return;
		}
		@Pc(16) int local16 = Static289.anInt5783 % 104;
		@Pc(23) byte local23 = (byte) (Static289.anInt5783 - 4 & 0xFF);
		@Pc(25) int local25;
		@Pc(32) int local32;
		for (local25 = 0; local25 < 4; local25++) {
			for (local32 = 0; local32 < 104; local32++) {
				Static126.aByteArrayArrayArray15[local25][local16][local32] = local23;
			}
		}
		if (Static99.anInt1826 == 3) {
			return;
		}
		for (local25 = 0; local25 < 2; local25++) {
			Static174.anIntArray398[local25] = -1000000;
			Static100.anIntArray184[local25] = 1000000;
			Static286.anIntArray569[local25] = 0;
			Static11.anIntArray541[local25] = 1000000;
			Static64.anIntArray110[local25] = 0;
		}
		if (Static25.anInt467 != 1) {
			local25 = Static122.method2036(Static173.anInt3251, Static230.anInt4492, Static99.anInt1826);
			if (local25 - Static224.anInt6075 < 800 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][Static230.anInt4492 >> 7][Static173.anInt3251 >> 7] & 0x4) != 0) {
				Static265.method4457(false, 1, Static230.anInt4492 >> 7, Static146.aClass3_Sub25ArrayArrayArray7, Static173.anInt3251 >> 7);
			}
			return;
		}
		if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7][Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7] & 0x4) != 0) {
			Static265.method4457(false, 0, Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7, Static146.aClass3_Sub25ArrayArrayArray7, Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7);
		}
		if (Static79.anInt1912 >= 310) {
			return;
		}
		local25 = Static230.anInt4492 >> 7;
		local32 = Static173.anInt3251 >> 7;
		@Pc(181) int local181 = Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7;
		@Pc(186) int local186 = Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7;
		@Pc(194) int local194;
		if (local32 >= local186) {
			local194 = local32 - local186;
		} else {
			local194 = local186 - local32;
		}
		@Pc(213) int local213;
		if (local25 >= local181) {
			local213 = local25 - local181;
		} else {
			local213 = local181 - local25;
		}
		if (local213 == 0 && local194 == 0 || local213 <= -104 || local213 >= 104 || local194 <= -104 || local194 >= 104) {
			Static42.method613("RC: " + local25 + "," + local32 + " " + local181 + "," + local186 + " " + Static101.anInt1844 + "," + Static43.anInt798, null);
			return;
		}
		@Pc(288) int local288;
		@Pc(290) int local290;
		if (local194 < local213) {
			local288 = local194 * 65536 / local213;
			local290 = 32768;
			while (local25 != local181) {
				if (local25 < local181) {
					local25++;
				} else if (local181 < local25) {
					local25--;
				}
				if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][local25][local32] & 0x4) != 0) {
					Static265.method4457(false, 1, local25, Static146.aClass3_Sub25ArrayArrayArray7, local32);
					break;
				}
				local290 += local288;
				if (local290 >= 65536) {
					local290 -= 65536;
					if (local186 > local32) {
						local32++;
					} else if (local32 > local186) {
						local32--;
					}
					if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][local25][local32] & 0x4) != 0) {
						Static265.method4457(false, 1, local25, Static146.aClass3_Sub25ArrayArrayArray7, local32);
						break;
					}
				}
			}
			return;
		}
		local288 = local213 * 65536 / local194;
		local290 = 32768;
		while (local186 != local32) {
			if (local32 < local186) {
				local32++;
			} else if (local186 < local32) {
				local32--;
			}
			if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][local25][local32] & 0x4) != 0) {
				Static265.method4457(false, 1, local25, Static146.aClass3_Sub25ArrayArrayArray7, local32);
				break;
			}
			local290 += local288;
			if (local290 >= 65536) {
				if (local181 > local25) {
					local25++;
				} else if (local181 < local25) {
					local25--;
				}
				local290 -= 65536;
				if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][local25][local32] & 0x4) != 0) {
					Static265.method4457(false, 1, local25, Static146.aClass3_Sub25ArrayArrayArray7, local32);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
	public static void method1272() {
		Static113.anInt2095 = 0;
		Static270.anInt5515 = 0;
		Static98.anInt1803 = -3;
		Static267.anInt5436 = -1;
		Static2.anInt23 = 0;
		Static305.aBoolean427 = false;
		Static241.anInt4885 = 1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLclient!rn;)Lclient!qi;")
	public static Class81 method1273(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1) {
		return Static287.method4736(arg0, arg1) ? Static20.method318() : null;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public static void method1276() {
		Static244.aClass3_Sub4_Sub12_6 = null;
		Static243.aClass3_Sub4_Sub12_5 = null;
		Static286.aClass3_Sub4_Sub12_9 = null;
		Static276.aClass3_Sub4_Sub12_10 = null;
		Static240.aClass3_Sub4_Sub12_4 = null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIZILclient!hm;I)Lclient!hm;")
	public static Class10_Sub4 method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10_Sub4 arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg0;
		@Pc(14) Class10_Sub4 local14 = (Class10_Sub4) Static206.aClass98_34.method2570(local4);
		if (local14 == null) {
			@Pc(23) Class10_Sub3 local23 = Static46.method722(Static49.aClass155_27, arg0);
			if (local23 == null) {
				return null;
			}
			local14 = local23.method717(64, 768, -50, -10, -50);
			Static206.aClass98_34.method2568(local14, local4);
		}
		@Pc(43) int local43 = arg4.method1937();
		@Pc(46) int local46 = arg4.method1951();
		@Pc(49) int local49 = arg4.method1938();
		@Pc(52) int local52 = arg4.method1952();
		local14 = local14.method1962(true, true, true);
		if (arg2 != 0) {
			local14.method1940(arg2);
		}
		@Pc(103) int local103;
		if (Static283.aBoolean393) {
			@Pc(143) Class10_Sub4_Sub1 local143 = (Class10_Sub4_Sub1) local14;
			if (arg3 != Static122.method2036(local49 + arg5, arg1 + local43, Static99.anInt1826) || Static122.method2036(arg5 + local52, arg1 - -local46, Static99.anInt1826) != arg3) {
				for (local103 = 0; local103 < local143.anInt1798; local103++) {
					local143.anIntArray177[local103] += Static122.method2036(arg5 + local143.anIntArray173[local103], arg1 + local143.anIntArray174[local103], Static99.anInt1826) - arg3;
				}
				local143.aClass75_1.aBoolean161 = false;
				local143.aClass180_2.aBoolean409 = false;
			}
		} else {
			@Pc(70) Class10_Sub4_Sub2 local70 = (Class10_Sub4_Sub2) local14;
			if (Static122.method2036(local49 + arg5, arg1 + local43, Static99.anInt1826) != arg3 || arg3 != Static122.method2036(local52 + arg5, local46 + arg1, Static99.anInt1826)) {
				for (local103 = 0; local103 < local70.anInt2224; local103++) {
					local70.anIntArray233[local103] += Static122.method2036(local70.anIntArray245[local103] + arg5, local70.anIntArray239[local103] + arg1, Static99.anInt1826) - arg3;
				}
				local70.aBoolean172 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1280(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class3 local7 = Static34.aClass30_2.method664(); local7 != null; local7 = Static34.aClass30_2.method671()) {
			if ((long) arg0 == (local7.aLong243 >> 48 & 0xFFFFL)) {
				local7.method5013();
			}
		}
	}
}
