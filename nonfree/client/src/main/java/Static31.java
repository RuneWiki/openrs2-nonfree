import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_433 = Static28.method504("Use");

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!ja;")
	public static Class39 aClass39_428 = aClass39_433;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!ja;")
	private static Class39 aClass39_429 = Static28.method504("Take");

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "[I")
	public static int[] anIntArray91 = new int[50];

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
	public static int anInt815 = 0;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lclient!ja;")
	private static Class39 aClass39_432 = Static28.method504("Loaded update list");

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "Lclient!ja;")
	public static Class39 aClass39_430 = aClass39_432;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!ja;")
	public static Class39 aClass39_431 = aClass39_429;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	public static void method539(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static110.aClass4_Sub2_Sub3_Sub1_7.anIntArray141;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (103 - local25) * 512 * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static131.aByteArrayArrayArray7[arg0][local40][local25] & 0x18) == 0) {
					Static101.aClass43_1.method1098(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static131.aByteArrayArrayArray7[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static101.aClass43_1.method1098(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static110.aClass4_Sub2_Sub3_Sub1_7.method867();
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local38 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * (double) 20) + 238 + -10 << 16) + 238 - 10;
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 1; local141 < 103; local141++) {
			for (local145 = 1; local145 < 103; local145++) {
				if ((Static131.aByteArrayArrayArray7[arg0][local145][local141] & 0x18) == 0) {
					Static93.method2212(local141, arg0, local145, local40, local38);
				}
				if (arg0 < 3 && (Static131.aByteArrayArrayArray7[arg0 + 1][local145][local141] & 0x8) != 0) {
					Static93.method2212(local141, arg0 + 1, local145, local40, local38);
				}
			}
		}
		Static84.anInt2107 = 0;
		for (local145 = 0; local145 < 104; local145++) {
			for (@Pc(214) int local214 = 0; local214 < 104; local214++) {
				@Pc(222) int local222 = Static101.aClass43_1.method1113(Static131.anInt3202, local145, local214);
				if (local222 != 0) {
					local222 = local222 >> 14 & 0x7FFF;
					@Pc(235) int local235 = Static73.method1207(local222).anInt1402;
					if (local235 >= 0) {
						@Pc(239) int local239 = local145;
						@Pc(241) int local241 = local214;
						if (local235 != 22 && local235 != 29 && local235 != 34 && local235 != 36 && local235 != 46 && local235 != 47 && local235 != 48) {
							@Pc(275) int[][] local275 = Static109.aClass81Array1[Static131.anInt3202].anIntArrayArray29;
							for (@Pc(277) int local277 = 0; local277 < 10; local277++) {
								@Pc(284) int local284 = (int) (Math.random() * 4.0D);
								if (local284 == 0 && local239 > 0 && local145 - 3 < local239 && (local275[local239 - 1][local241] & 0x12C0108) == 0) {
									local239--;
								}
								if (local284 == 1 && local239 < 103 && local239 < local145 + 3 && (local275[local239 + 1][local241] & 0x12C0180) == 0) {
									local239++;
								}
								if (local284 == 2 && local241 > 0 && local241 > local214 - 3 && (local275[local239][local241 - 1] & 0x12C0102) == 0) {
									local241--;
								}
								if (local284 == 3 && local241 < 103 && local214 + 3 > local241 && (local275[local239][local241 + 1] & 0x12C0120) == 0) {
									local241++;
								}
							}
						}
						Static91.aClass4_Sub2_Sub3_Sub1Array8[Static84.anInt2107] = Static108.aClass4_Sub2_Sub3_Sub1Array10[local235];
						Static92.anIntArray78[Static84.anInt2107] = local239;
						Static118.anIntArray318[Static84.anInt2107] = local241;
						Static84.anInt2107++;
					}
				}
			}
		}
		Static91.aClass6_1.method536();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIB[B[Lclient!we;I)V")
	public static void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class81[] arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg5 + local7 > 0 && arg5 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
						arg4[local3].anIntArrayArray29[local7 + arg5][local11 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(86) Class4_Sub16 local86 = new Class4_Sub16(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					Static11.method223(0, local11, local86, arg1 + local101, arg0, arg2, arg5 + local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public static void method542() {
		aClass39_433 = null;
		aClass39_430 = null;
		aClass39_428 = null;
		aClass39_431 = null;
		anIntArray91 = null;
		aClass39_429 = null;
		aClass39_432 = null;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public static void method543() {
		Static44.aClass12_30.method233();
		Static85.aClass12_57.method233();
		Static38.aClass12_24.method233();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BI)I")
	public static int method544(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static110.method1948(arg1, 0, arg0);
	}
}
