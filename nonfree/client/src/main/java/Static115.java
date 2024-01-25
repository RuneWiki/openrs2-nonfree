import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "D")
	public static double aDouble2;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	public static int anInt1792;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!fha;ILclient!wd;II)V")
	public static void method1658(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) Class5_Sub12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg2 & 0x8) != 0) {
			arg0.anInt2714 = arg1.method8633();
			if (arg0.anInt2972 == 0) {
				arg0.method2507(arg0.anInt2714);
				arg0.anInt2714 = -1;
			}
		}
		if ((arg2 & 0x2000) != 0) {
			arg0.aBoolean238 = arg1.method8615() == 1;
		}
		if ((arg2 & 0x800) != 0) {
			arg0.aString50 = arg1.method8617();
			if (arg0.aString50.charAt(0) == '~') {
				arg0.aString50 = arg0.aString50.substring(1);
				Static365.method5696(0, arg0.aString50, arg0.aString43, arg0.method2375(), arg0.method2373(), 2);
			} else if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == arg0) {
				Static365.method5696(0, arg0.aString50, arg0.aString43, arg0.method2375(), arg0.method2373(), 2);
			}
			arg0.anInt2944 = 0;
			arg0.anInt2957 = 150;
			arg0.anInt2940 = 0;
		}
		if ((arg2 & 0x10000) != 0) {
			arg0.aByte70 = arg1.method8635();
			arg0.aByte67 = arg1.method8649();
			arg0.aByte71 = arg1.method8658();
			arg0.aByte69 = (byte) arg1.method8607();
			arg0.anInt2955 = Static235.anInt3998 + arg1.method8606();
			arg0.anInt2915 = Static235.anInt3998 + arg1.method8631();
		}
		@Pc(178) int local178;
		@Pc(181) int[] local181;
		@Pc(184) int[] local184;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if ((arg2 & 0x100) != 0) {
			local178 = arg1.method8639();
			local181 = new int[local178];
			local184 = new int[local178];
			@Pc(187) int[] local187 = new int[local178];
			for (local189 = 0; local189 < local178; local189++) {
				local195 = arg1.method8606();
				if (local195 == 65535) {
					local195 = -1;
				}
				local181[local189] = local195;
				local184[local189] = arg1.method8645();
				local187[local189] = arg1.method8631();
			}
			Static109.method1612(local184, local187, arg0, local181);
		}
		@Pc(238) int local238;
		@Pc(247) int local247;
		@Pc(251) int local251;
		if ((arg2 & 0x1000) != 0) {
			local178 = arg1.method8606();
			local238 = arg1.method8601();
			if (local178 == 65535) {
				local178 = -1;
			}
			local247 = arg1.method8639();
			local251 = local247 & 0x7;
			local189 = local247 >> 3 & 0xF;
			if (local189 == 15) {
				local189 = -1;
			}
			arg0.method2506(local189, local178, local238, 1, local251);
		}
		if ((arg2 & 0x4000) != 0) {
			local178 = arg1.method8640();
			arg0.anInt2908 = arg1.method8615();
			arg0.anInt2934 = arg1.method8645();
			arg0.anInt2927 = local178 & 0x7FFF;
			arg0.aBoolean256 = (local178 & 0x8000) != 0;
			arg0.anInt2965 = Static235.anInt3998 + arg0.anInt2927 + arg0.anInt2908;
		}
		if ((arg2 & 0x20) != 0) {
			Static514.aByteArray78[arg3] = arg1.method8649();
		}
		if ((arg2 & 0x1) != 0) {
			local178 = arg1.method8640();
			if (local178 == 65535) {
				local178 = -1;
			}
			arg0.anInt2951 = local178;
		}
		if ((arg2 & 0x20000) != 0) {
			local178 = arg1.method8606();
			local238 = arg1.method8623();
			if (local178 == 65535) {
				local178 = -1;
			}
			local247 = arg1.method8645();
			local251 = local247 & 0x7;
			local189 = local247 >> 3 & 0xF;
			if (local189 == 15) {
				local189 = -1;
			}
			arg0.method2506(local189, local178, local238, 2, local251);
		}
		if ((arg2 & 0x40) != 0) {
			@Pc(403) int[] local403 = new int[4];
			for (local238 = 0; local238 < 4; local238++) {
				local403[local238] = arg1.method8633();
				if (local403[local238] == 65535) {
					local403[local238] = -1;
				}
			}
			local247 = arg1.method8607();
			Static440.method6531(local247, arg0, local403);
		}
		if ((arg2 & 0x10) != 0) {
			local178 = arg1.method8639();
			@Pc(451) byte[] local451 = new byte[local178];
			@Pc(456) Class5_Sub12 local456 = new Class5_Sub12(local451);
			arg1.method8636(local178, local451);
			Static578.aClass5_Sub12Array1[arg3] = local456;
			arg0.method2369(local456);
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2911 = arg1.method8649();
			arg0.anInt2920 = arg1.method8658();
			arg0.anInt2916 = arg1.method8592();
			arg0.anInt2909 = arg1.method8658();
			arg0.anInt2912 = arg1.method8640() + Static235.anInt3998;
			arg0.anInt2942 = arg1.method8606() + Static235.anInt3998;
			arg0.anInt2943 = arg1.method8645();
			if (arg0.aBoolean240) {
				arg0.anInt2916 += arg0.anInt2732;
				arg0.anInt2911 += arg0.anInt2732;
				arg0.anInt2920 += arg0.anInt2749;
				arg0.anInt2972 = 0;
				arg0.anInt2909 += arg0.anInt2749;
			} else {
				arg0.anInt2972 = 1;
				arg0.anInt2916 += arg0.anIntArray253[0];
				arg0.anInt2920 += arg0.anIntArray252[0];
				arg0.anInt2909 += arg0.anIntArray252[0];
				arg0.anInt2911 += arg0.anIntArray253[0];
			}
			arg0.anInt2973 = 0;
		}
		if ((arg2 & 0x8000) != 0) {
			local7 = arg1.method8592();
		}
		if ((arg2 & 0x2) != 0) {
			local178 = arg1.method8615();
			if (local178 > 0) {
				for (local238 = 0; local238 < local178; local238++) {
					local251 = -1;
					local189 = -1;
					local195 = -1;
					local247 = arg1.method8614();
					if (local247 == 32767) {
						local247 = arg1.method8614();
						local189 = arg1.method8614();
						local251 = arg1.method8614();
						local195 = arg1.method8614();
					} else if (local247 == 32766) {
						local247 = -1;
					} else {
						local189 = arg1.method8614();
					}
					@Pc(666) int local666 = arg1.method8614();
					@Pc(670) int local670 = arg1.method8607();
					arg0.method2520(local251, local189, local666, Static235.anInt3998, local247, local670, local195);
				}
			}
		}
		if ((arg2 & 0x80) != 0) {
			local178 = arg1.method8606();
			local238 = arg1.method8601();
			if (local178 == 65535) {
				local178 = -1;
			}
			local247 = arg1.method8639();
			local251 = local247 & 0x7;
			local189 = local247 >> 3 & 0xF;
			if (local189 == 15) {
				local189 = -1;
			}
			arg0.method2506(local189, local178, local238, 0, local251);
		}
		if ((arg2 & 0x40000) != 0) {
			local178 = arg1.method8639();
			local181 = new int[local178];
			local184 = new int[local178];
			for (local251 = 0; local251 < local178; local251++) {
				local189 = arg1.method8640();
				if ((local189 & 0xC000) == 49152) {
					local195 = arg1.method8606();
					local181[local251] = local195 | local189 << 16;
				} else {
					local181[local251] = local189;
				}
				local184[local251] = arg1.method8640();
			}
			arg0.method2515(local184, local181);
		}
		if (!arg0.aBoolean240) {
			return;
		}
		if (local7 == 127) {
			arg0.method2371(arg0.anInt2749, arg0.anInt2732);
			return;
		}
		@Pc(811) byte local811;
		if (local7 == -1) {
			local811 = Static514.aByteArray78[arg3];
		} else {
			local811 = local7;
		}
		Static78.method1248(arg0, local811);
		arg0.method2372(local811, arg0.anInt2749, arg0.anInt2732);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "()V")
	public static void method1659() {
		for (@Pc(1) int local1 = 0; local1 < Static311.aClass301Array1.length; local1++) {
			Static311.aClass301Array1[local1].method7147();
		}
		Static311.aClass301Array1 = null;
	}
}
