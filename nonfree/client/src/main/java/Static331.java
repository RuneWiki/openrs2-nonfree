import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "[Lclient!mp;")
	public static Class15_Sub4_Sub1_Sub1[] aClass15_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString252;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
	public static int anInt6338 = 1;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
	public static int anInt6346 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Lclient!ue;")
	public static Class5_Sub5 method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass5_Sub5_1 == null ? null : local7.aClass5_Sub5_1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lclient!ie;I[BZLclient!aa;IIIIIII)V")
	public static void method5552(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg2);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(34) int local34 = local10.method3110();
			if (local34 == 0) {
				return;
			}
			local28 += local34;
			@Pc(42) int local42 = 0;
			while (true) {
				@Pc(46) int local46 = local10.method3145();
				if (local46 == 0) {
					break;
				}
				local42 += local46 - 1;
				@Pc(58) int local58 = local42 & 0x3F;
				@Pc(64) int local64 = local42 >> 6 & 0x3F;
				@Pc(68) int local68 = local42 >> 12;
				@Pc(74) int local74 = local10.method3141();
				@Pc(78) int local78 = local74 >> 2;
				@Pc(82) int local82 = local74 & 0x3;
				if (local68 == arg8 && local64 >= arg6 && arg6 + 8 > local64 && local58 >= arg7 && arg7 + 8 > local58) {
					@Pc(117) Class188 local117 = Static126.method2405(local28);
					@Pc(137) int local137 = arg9 + Static137.method2640(local58 & 0x7, local117.anInt5533, local117.anInt5541, local82, local64 & 0x7, arg1);
					@Pc(157) int local157 = arg10 + Static67.method1687(local82, local117.anInt5533, local64 & 0x7, local117.anInt5541, arg1, local58 & 0x7);
					if (local137 > 0 && local157 > 0 && Static48.anInt1107 - 1 > local137 && local157 < Static337.anInt6402 - 1) {
						@Pc(179) Class91 local179 = null;
						if (!arg3) {
							@Pc(183) int local183 = arg5;
							if ((Static183.aByteArrayArrayArray7[1][local137][local157] & 0x2) == 2) {
								local183 = arg5 - 1;
							}
							if (local183 >= 0) {
								local179 = arg0[local183];
							}
						}
						Static293.method5028(local179, local82 + arg1 & 0x3, -1, true, arg4, local157, arg5, local137, arg3, local78, arg5, local28);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
	public static void method5554() {
		try {
			if (Static3.anInt77 == 1) {
				@Pc(16) int local16 = Static121.aClass1_Sub6_Sub1_2.method562();
				if (local16 > 0 && Static121.aClass1_Sub6_Sub1_2.method573()) {
					local16 -= Static292.anInt5680;
					if (local16 < 0) {
						local16 = 0;
					}
					Static121.aClass1_Sub6_Sub1_2.method558(local16);
				} else {
					Static121.aClass1_Sub6_Sub1_2.method561();
					Static121.aClass1_Sub6_Sub1_2.method563();
					Static231.aClass1_Sub40_2 = null;
					if (Static77.aClass165_25 == null) {
						Static3.anInt77 = 0;
					} else {
						Static3.anInt77 = 2;
					}
					Static111.aClass196_1 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static121.aClass1_Sub6_Sub1_2.method561();
			Static3.anInt77 = 0;
			Static231.aClass1_Sub40_2 = null;
			Static111.aClass196_1 = null;
			Static77.aClass165_25 = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I")
	public static int method5555(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
