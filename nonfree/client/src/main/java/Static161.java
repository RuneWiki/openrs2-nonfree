import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!sha;")
	public static Class329 aClass329_3;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public static int anInt1416;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array7;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!dja;")
	public static Class80 aClass80_6 = null;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)I")
	public static int method1393(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!hga;Lclient!qp;ZLclient!ha;)V")
	public static void method1394(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Class14_Sub39 arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(10) Class45 local10 = arg0.method3800(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(22) int local22 = local10.method7510();
		if (local10.method7501() > local22) {
			local22 = local10.method7501();
		}
		@Pc(38) int local38 = arg1.anInt8787;
		@Pc(41) int local41 = arg1.anInt8786;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(61) int local61;
		@Pc(84) int local84;
		if (arg0.aString43 != null) {
			local43 = Static343.aClass350_4.method8354(Static555.aStringArray40, (int[]) null, (Class45[]) null, arg0.aString43);
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(67) String local67 = Static555.aStringArray40[local61];
				if (local43 - 1 > local61) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local84 = Static107.aClass228_3.method5504(local67);
				if (local84 > local45) {
					local45 = local84;
				}
			}
			local47 = Static107.aClass228_3.method5505() * local43 + Static107.aClass228_3.method5506() / 2;
		}
		local61 = arg1.anInt8787 + local22 / 2;
		@Pc(114) int local114 = arg1.anInt8786;
		if (local22 + Static224.anInt1288 > local38) {
			local38 = Static224.anInt1288;
			local61 = local45 / 2 + Static224.anInt1288 + local22 / 2 + 5 + 10;
		} else if (Static224.anInt1296 - local22 < local38) {
			local61 = Static224.anInt1296 - local45 / 2 - local22 / 2 - 5 - 10;
			local38 = Static224.anInt1296 - local22;
		}
		if (local22 + Static224.anInt1293 > local41) {
			local114 = local22 / 2 + Static224.anInt1293 + 10;
			local41 = Static224.anInt1293;
		} else if (local41 > Static224.anInt1297 - local22) {
			local114 = Static224.anInt1297 - local47 - local22 / 2 - 10;
			local41 = Static224.anInt1297 - local22;
		}
		local84 = (int) (Math.atan2((double) (local38 - arg1.anInt8787), (double) (local41 - arg1.anInt8786)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7494((float) local38 + (float) local22 / 2.0F, (float) local41 + (float) local22 / 2.0F, 4096, local84);
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		if (arg0.aString43 != null) {
			local263 = local61 - local45 / 2 - 5;
			local265 = local114;
			local267 = local263 + local45 + 10;
			local269 = local114 + local43 * Static107.aClass228_3.method5505() + 3;
			if (arg0.anInt4303 != 0) {
				arg2.method6887(local114, arg0.anInt4303, local267 - local263, local269 - local114, local263);
			}
			if (arg0.anInt4319 != 0) {
				arg2.method6906(local263, local269 - local114, -local263 + local267, arg0.anInt4319, local114);
			}
			for (@Pc(343) int local343 = 0; local343 < local43; local343++) {
				@Pc(349) String local349 = Static555.aStringArray40[local343];
				if (local343 < local43 - 1) {
					local349 = local349.substring(0, local349.length() - 4);
				}
				Static107.aClass228_3.method5508(arg2, local349, local61, local114, arg0.anInt4291);
				local114 += Static107.aClass228_3.method5505();
			}
		}
		if (arg0.anInt4322 == -1 && arg0.aString43 == null) {
			return;
		}
		@Pc(404) Class14_Sub55 local404 = new Class14_Sub55(arg1);
		local22 >>= 0x1;
		local404.anInt10876 = local38 - local22;
		local404.anInt10873 = local269;
		local404.anInt10870 = local41 + local22;
		local404.anInt10867 = local41 - local22;
		local404.anInt10872 = local263;
		local404.anInt10877 = local265;
		local404.anInt10874 = local38 + local22;
		local404.anInt10880 = local267;
		Static216.aClass32_31.method582(local404);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)Lclient!saa;")
	public static Class4_Sub3_Sub5 method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub3_Sub5_1;
	}
}
