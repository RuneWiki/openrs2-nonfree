import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
	public static int anInt5353;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
	public static int anInt5350 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)I")
	public static int method4482(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IC)Z")
	public static boolean method4483(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static232.method3510(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static165.aCharArray1;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static378.aCharArray4;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V")
	public static void method4486() {
		for (@Pc(3) int local3 = 0; local3 < Static621.anInt10451; local3++) {
			@Pc(9) int local9 = Static272.anIntArray383[local3];
			@Pc(17) Class12_Sub2_Sub2_Sub1_Sub1 local17 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) local9)).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			@Pc(21) int local21 = Static481.aClass14_Sub29_Sub1_2.method5866();
			if ((local21 & 0x2) != 0) {
				local21 += Static481.aClass14_Sub29_Sub1_2.method5866() << 8;
			}
			if ((local21 & 0x400) != 0) {
				local21 += Static481.aClass14_Sub29_Sub1_2.method5866() << 16;
			}
			@Pc(54) int local54;
			@Pc(56) int local56;
			@Pc(80) int local80;
			@Pc(89) int[] local89;
			@Pc(99) int local99;
			@Pc(125) int local125;
			@Pc(154) int local154;
			@Pc(113) short[] local113;
			@Pc(144) short[] local144;
			@Pc(181) long local181;
			if ((local21 & 0x10000) != 0) {
				local54 = local17.aClass283_1.anIntArray637.length;
				local56 = 0;
				if (local17.aClass283_1.aShortArray121 != null) {
					local56 = local17.aClass283_1.aShortArray121.length;
				}
				if (local17.aClass283_1.lb != null) {
					local56 = local17.aClass283_1.lb.length;
				}
				local80 = Static481.aClass14_Sub29_Sub1_2.method5866();
				if ((local80 & 0x1) != 1) {
					local89 = null;
					if ((local80 & 0x2) == 2) {
						local89 = new int[local54];
						for (local99 = 0; local99 < local54; local99++) {
							local89[local99] = Static481.aClass14_Sub29_Sub1_2.method5884();
						}
					}
					local113 = null;
					if ((local80 & 0x4) == 4) {
						local113 = new short[local56];
						for (local125 = 0; local125 < local56; local125++) {
							local113[local125] = (short) Static481.aClass14_Sub29_Sub1_2.method5840();
						}
					}
					local144 = null;
					if ((local80 & 0x8) == 8) {
						local144 = new short[0];
						for (local154 = 0; local154 < 0; local154++) {
							local144[local154] = (short) Static481.aClass14_Sub29_Sub1_2.method5876();
						}
					}
					local181 = (long) local9 | (long) local17.anInt684++ << 32;
					new Class183(local181, local89, local113, local144);
				}
			}
			@Pc(204) int[] local204;
			@Pc(201) int[] local201;
			@Pc(209) int local209;
			if ((local21 & 0x2000) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5888();
				local201 = new int[local54];
				local204 = new int[local54];
				@Pc(207) int[] local207 = new int[local54];
				for (local209 = 0; local209 < local54; local209++) {
					local99 = Static481.aClass14_Sub29_Sub1_2.method5884();
					if (local99 == 65535) {
						local99 = -1;
					}
					local201[local209] = local99;
					local204[local209] = Static481.aClass14_Sub29_Sub1_2.method5846();
					local207[local209] = Static481.aClass14_Sub29_Sub1_2.method5840();
				}
				Static557.method7831(local201, local17, local207, local204);
			}
			@Pc(284) int local284;
			if ((local21 & 0x40) != 0) {
				@Pc(255) int[] local255 = new int[4];
				for (local56 = 0; local56 < 4; local56++) {
					local255[local56] = Static481.aClass14_Sub29_Sub1_2.method5876();
					if (local255[local56] == 65535) {
						local255[local56] = -1;
					}
				}
				local284 = Static481.aClass14_Sub29_Sub1_2.method5846();
				Static348.method5324(local17, local284, local255);
			}
			if ((local21 & 0x4) != 0) {
				if (local17.aClass283_1.method7127()) {
					Static423.method6258(local17);
				}
				local17.method611(Static63.aClass37_1.method974(Static481.aClass14_Sub29_Sub1_2.method5900()));
				local17.method2415(local17.aClass283_1.anInt8617);
				local17.anInt2931 = local17.aClass283_1.anInt8616 << 3;
				if (local17.aClass283_1.method7127()) {
					Static413.method1523((Class203) null, local17, (Class12_Sub2_Sub2_Sub1_Sub2) null, local17.anIntArray242[0], local17.anIntArray241[0], 0, local17.aByte146);
				}
			}
			if ((local21 & 0x10) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5846();
				if (local54 > 0) {
					for (local56 = 0; local56 < local54; local56++) {
						local80 = -1;
						local209 = -1;
						local284 = Static481.aClass14_Sub29_Sub1_2.method5895();
						local99 = -1;
						if (local284 == 32767) {
							local284 = Static481.aClass14_Sub29_Sub1_2.method5895();
							local209 = Static481.aClass14_Sub29_Sub1_2.method5895();
							local80 = Static481.aClass14_Sub29_Sub1_2.method5895();
							local99 = Static481.aClass14_Sub29_Sub1_2.method5895();
						} else if (local284 == 32766) {
							local284 = -1;
						} else {
							local209 = Static481.aClass14_Sub29_Sub1_2.method5895();
						}
						local125 = Static481.aClass14_Sub29_Sub1_2.method5895();
						local154 = Static481.aClass14_Sub29_Sub1_2.method5842();
						local17.method2428(local209, local125, local284, local99, local154, Static87.anInt1951, local80);
					}
				}
			}
			if ((local21 & 0x4000) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5876();
				local17.anInt2914 = Static481.aClass14_Sub29_Sub1_2.method5842();
				local17.anInt2908 = Static481.aClass14_Sub29_Sub1_2.method5888();
				local17.aBoolean223 = (local54 & 0x8000) != 0;
				local17.anInt2901 = local54 & 0x7FFF;
				local17.anInt2961 = Static87.anInt1951 + local17.anInt2901 + local17.anInt2914;
			}
			if ((local21 & 0x20) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5884();
				if (local54 == 65535) {
					local54 = -1;
				}
				local56 = Static481.aClass14_Sub29_Sub1_2.method5864();
				local284 = Static481.aClass14_Sub29_Sub1_2.method5846();
				local80 = local284 & 0x7;
				local209 = local284 >> 3 & 0xF;
				if (local209 == 15) {
					local209 = -1;
				}
				local17.method2429(local54, local56, local80, local209, 0);
			}
			if ((local21 & 0x80000) != 0) {
				local17.aString8 = Static481.aClass14_Sub29_Sub1_2.method5898();
				if ("".equals(local17.aString8) || local17.aString8.equals(local17.aClass283_1.aString84)) {
					local17.aString8 = local17.aClass283_1.aString84;
				}
			}
			if ((local21 & 0x8) != 0) {
				local17.aString33 = Static481.aClass14_Sub29_Sub1_2.method5898();
				local17.anInt2910 = 100;
			}
			if ((local21 & 0x8000) != 0) {
				local54 = local17.aClass283_1.anIntArray640.length;
				local56 = 0;
				if (local17.aClass283_1.aShortArray121 != null) {
					local56 = local17.aClass283_1.aShortArray121.length;
				}
				local284 = 0;
				if (local17.aClass283_1.lb != null) {
					local284 = local17.aClass283_1.lb.length;
				}
				local80 = Static481.aClass14_Sub29_Sub1_2.method5846();
				if ((local80 & 0x1) == 1) {
					local17.aClass183_1 = null;
				} else {
					local89 = null;
					if ((local80 & 0x2) == 2) {
						local89 = new int[local54];
						for (local99 = 0; local99 < local54; local99++) {
							local89[local99] = Static481.aClass14_Sub29_Sub1_2.method5840();
						}
					}
					local113 = null;
					if ((local80 & 0x4) == 4) {
						local113 = new short[local56];
						for (local125 = 0; local125 < local56; local125++) {
							local113[local125] = (short) Static481.aClass14_Sub29_Sub1_2.method5840();
						}
					}
					local144 = null;
					if ((local80 & 0x8) == 8) {
						local144 = new short[local284];
						for (local154 = 0; local154 < local284; local154++) {
							local144[local154] = (short) Static481.aClass14_Sub29_Sub1_2.method5900();
						}
					}
					local181 = (long) local9 | (long) local17.anInt695++ << 32;
					local17.aClass183_1 = new Class183(local181, local89, local113, local144);
				}
			}
			if ((local21 & 0x200) != 0) {
				local17.aByte58 = Static481.aClass14_Sub29_Sub1_2.method5906();
				local17.aByte57 = Static481.aClass14_Sub29_Sub1_2.method5877();
				local17.aByte61 = Static481.aClass14_Sub29_Sub1_2.method5906();
				local17.aByte60 = (byte) Static481.aClass14_Sub29_Sub1_2.method5866();
				local17.anInt2962 = Static87.anInt1951 + Static481.aClass14_Sub29_Sub1_2.method5840();
				local17.anInt2936 = Static87.anInt1951 + Static481.aClass14_Sub29_Sub1_2.method5884();
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt688 = Static481.aClass14_Sub29_Sub1_2.method5900();
				local17.anInt694 = Static481.aClass14_Sub29_Sub1_2.method5876();
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt2903 = Static481.aClass14_Sub29_Sub1_2.method5840();
				if (local17.anInt2903 == 65535) {
					local17.anInt2903 = -1;
				}
			}
			if ((local21 & 0x40000) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5884();
				local56 = Static481.aClass14_Sub29_Sub1_2.method5878();
				if (local54 == 65535) {
					local54 = -1;
				}
				local284 = Static481.aClass14_Sub29_Sub1_2.method5866();
				local80 = local284 & 0x7;
				local209 = local284 >> 3 & 0xF;
				if (local209 == 15) {
					local209 = -1;
				}
				local17.method2429(local54, local56, local80, local209, 2);
			}
			if ((local21 & 0x800) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5846();
				local201 = new int[local54];
				local204 = new int[local54];
				for (local80 = 0; local80 < local54; local80++) {
					local209 = Static481.aClass14_Sub29_Sub1_2.method5840();
					if ((local209 & 0xC000) == 49152) {
						local99 = Static481.aClass14_Sub29_Sub1_2.method5900();
						local201[local80] = local209 << 16 | local99;
					} else {
						local201[local80] = local209;
					}
					local204[local80] = Static481.aClass14_Sub29_Sub1_2.method5840();
				}
				local17.method2420(local201, local204);
			}
			if ((local21 & 0x1000) != 0) {
				local54 = Static481.aClass14_Sub29_Sub1_2.method5840();
				local56 = Static481.aClass14_Sub29_Sub1_2.method5864();
				if (local54 == 65535) {
					local54 = -1;
				}
				local284 = Static481.aClass14_Sub29_Sub1_2.method5888();
				local80 = local284 & 0x7;
				local209 = local284 >> 3 & 0xF;
				if (local209 == 15) {
					local209 = -1;
				}
				local17.method2429(local54, local56, local80, local209, 1);
			}
			if ((local21 & 0x20000) != 0) {
				local17.anInt682 = Static481.aClass14_Sub29_Sub1_2.method5884();
				if (local17.anInt682 == 65535) {
					local17.anInt682 = local17.aClass283_1.anInt8632;
				}
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt2905 = Static481.aClass14_Sub29_Sub1_2.method5877();
				local17.anInt2909 = Static481.aClass14_Sub29_Sub1_2.method5906();
				local17.anInt2957 = Static481.aClass14_Sub29_Sub1_2.method5845();
				local17.anInt2919 = Static481.aClass14_Sub29_Sub1_2.method5880();
				local17.anInt2938 = Static481.aClass14_Sub29_Sub1_2.method5900() + Static87.anInt1951;
				local17.anInt2959 = Static481.aClass14_Sub29_Sub1_2.method5900() + Static87.anInt1951;
				local17.anInt2912 = Static481.aClass14_Sub29_Sub1_2.method5846();
				local17.anInt2957 += local17.anIntArray241[0];
				local17.anInt2909 += local17.anIntArray242[0];
				local17.anInt2964 = 1;
				local17.anInt2966 = 0;
				local17.anInt2919 += local17.anIntArray242[0];
				local17.anInt2905 += local17.anIntArray241[0];
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public static void method4487() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static569.aBooleanArray26[local7] = false;
		}
		Static40.anInt1719 = 0;
		Static123.anInt2476 = -1;
		Static358.anInt6615 = -1;
		Static115.anInt2304 = -1;
		Static667.anInt11097 = -1;
		Static378.anInt6935 = 1;
		Static305.anInt5329 = 0;
	}
}
