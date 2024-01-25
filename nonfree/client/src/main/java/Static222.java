import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!wv;")
	public static Class366 aClass366_3;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public static int anInt4655;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public static int anInt4653 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!hw;IZ)V")
	public static void method3617(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static384.anInt7556 >= 400) {
			return;
		}
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 != arg0) {
			@Pc(166) String local166;
			@Pc(101) int local101;
			if (arg0.anInt4319 == 0) {
				@Pc(52) boolean local52 = true;
				if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4293 != -1 && arg0.anInt4293 != -1) {
					@Pc(76) int local76 = arg0.anInt4287 < Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287 : arg0.anInt4287;
					@Pc(91) int local91 = arg0.anInt4293 > Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4293 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4293 : arg0.anInt4293;
					local101 = local91 + local76 * 10 / 100 + 5;
					@Pc(108) int local108 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287 - arg0.anInt4287;
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local101 < local108) {
						local52 = false;
					}
				}
				@Pc(131) String local131 = Static403.aClass128_3 == Static162.aClass128_1 ? Static223.aClass152_34.method3624(Static142.anInt3088) : Static223.aClass152_32.method3624(Static142.anInt3088);
				if (arg0.anInt4317 <= arg0.anInt4287) {
					local166 = arg0.method3345() + (local52 ? Static333.method5094(arg0.anInt4287, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287) : "<col=ffffff>") + " (" + local131 + arg0.anInt4287 + ")";
				} else {
					local166 = arg0.method3345() + (local52 ? Static333.method5094(arg0.anInt4287, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287) : "<col=ffffff>") + " (" + local131 + arg0.anInt4287 + "+" + (arg0.anInt4317 - arg0.anInt4287) + ")";
				}
			} else if (arg0.anInt4319 == -1) {
				local166 = arg0.method3345();
			} else {
				local166 = arg0.method3345() + " (" + Static223.aClass152_33.method3624(Static142.anInt3088) + arg0.anInt4319 + ")";
			}
			if (Static430.aBoolean586 && !arg1 && (Static264.anInt5328 & 0x8) != 0) {
				Static437.method6478(0, (long) arg0.anInt4256, -1, 0, true, Static317.aString131, 59, Static393.aString154 + " -> <col=ffffff>" + local166, false, Static398.anInt7799);
			}
			if (arg1) {
				Static437.method6478(0, 0L, 0, 0, false, "<col=cccccc>" + local166, -1, "", true, -1);
			} else {
				for (@Pc(286) int local286 = 7; local286 >= 0; local286--) {
					if (Static524.aStringArray40[local286] != null) {
						@Pc(294) short local294 = 0;
						if (Static162.aClass128_1 == Static592.aClass128_4 && Static524.aStringArray40[local286].equalsIgnoreCase(Static223.aClass152_27.method3624(Static142.anInt3088))) {
							if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4287 < arg0.anInt4287) {
								local294 = 2000;
							}
							if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4292 != 0 && arg0.anInt4292 != 0) {
								if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4292 == arg0.anInt4292) {
									local294 = 2000;
								} else {
									local294 = 0;
								}
							}
						} else if (Static325.aBooleanArray16[local286]) {
							local294 = 2000;
						}
						@Pc(345) short local345 = (short) (local294 + Static560.aShortArray137[local286]);
						local101 = Static38.anIntArray30[local286] == -1 ? Static542.anInt9892 : Static38.anIntArray30[local286];
						Static437.method6478(0, (long) arg0.anInt4256, -1, 0, true, Static524.aStringArray40[local286], local345, "<col=ffffff>" + local166, false, local101);
					}
				}
			}
			if (!arg1) {
				for (@Pc(415) Class4_Sub36 local415 = (Class4_Sub36) Static593.aClass22_65.method895(); local415 != null; local415 = (Class4_Sub36) Static593.aClass22_65.method889()) {
					if (local415.anInt7137 == 45) {
						local415.aString145 = "<col=ffffff>" + local166;
						return;
					}
				}
			}
		} else if (Static430.aBoolean586 && (Static264.anInt5328 & 0x10) != 0) {
			Static437.method6478(0, 0L, -1, 0, true, Static317.aString131, 6, Static393.aString154 + " -> <col=ffffff>" + Static223.aClass152_41.method3624(Static142.anInt3088), false, Static398.anInt7799);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIILclient!ua;Lclient!r;Lclient!is;II)V")
	public static void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) Class155 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class288 local10 = Static89.aClass121_1.method2676(arg6);
		if (local10 == null || !local10.aBoolean608 || !local10.method6627(Static523.aClass173_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local10.anIntArray498 != null) {
			@Pc(33) int[] local33 = new int[local10.anIntArray498.length];
			@Pc(49) int local49;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static300.anInt6053 == 4) {
					local49 = (int) Static189.aFloat83 & 0x3FFF;
				} else {
					local49 = (int) Static189.aFloat83 + Static136.anInt3033 & 0x3FFF;
				}
				@Pc(60) int local60 = Class262.anIntArray420[local49];
				@Pc(64) int local64 = Class262.anIntArray421[local49];
				if (Static300.anInt6053 != 4) {
					local60 = local60 * 256 / (Static273.anInt5737 + 256);
					local64 = local64 * 256 / (Static273.anInt5737 + 256);
				}
				local33[local35 * 2] = arg1 + arg5.anInt4806 / 2 + (local60 * (local10.anIntArray498[local35 * 2 - -1] * 4 + arg2) - -(local64 * (local10.anIntArray498[local35 * 2] * 4 + arg0)) >> 14);
				local33[local35 * 2 + 1] = arg5.anInt4831 / 2 + arg7 - ((arg2 + local10.anIntArray498[local35 * 2 + 1] * 4) * local64 - local60 * (arg0 - -(local10.anIntArray498[local35 * 2] * 4)) >> 14);
			}
			Static133.method2404(arg4, local33, local10.anInt8602, arg5.anIntArray235, arg5.anIntArray233);
			for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
				arg4.method7814(local33[local49 * 2], local33[local49 * 2 + 1], local33[(local49 + 1) * 2], local33[local49 * 2 + 3], local10.anInt8600, arg3, arg1, arg7);
			}
			arg4.method7814(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local10.anInt8600, arg3, arg1, arg7);
		}
		@Pc(263) Class88 local263 = null;
		if (local10.anInt8577 != -1) {
			local263 = local10.method6629(false, arg4);
			if (local263 != null) {
				Static327.method6515(arg0, arg1, arg5, local263, arg2, arg3, arg7);
			}
		}
		if (local10.aString177 == null) {
			return;
		}
		local35 = 0;
		if (local263 != null) {
			local35 = local263.u();
		}
		@Pc(300) Class45 local300 = Static464.aClass45_9;
		@Pc(302) Class198 local302 = Static174.aClass198_8;
		if (local10.anInt8603 == 1) {
			local300 = Static127.aClass45_1;
			local302 = Static478.aClass198_11;
		}
		if (local10.anInt8603 == 2) {
			local302 = Static503.aClass198_12;
			local300 = Static306.aClass45_4;
		}
		Static1.method3890(local302, arg5, arg3, local300, arg0, local10.aString177, local10.anInt8589, arg1, arg7, arg2, local35);
		return;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIB)I")
	public static int method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(16) int local16 = 128 - arg2;
		@Pc(30) int local30 = (arg0 & 0x7F) * arg2 + (arg1 & 0x7F) * local16 >> 7;
		@Pc(44) int local44 = local16 * (arg1 & 0x380) + (arg0 & 0x380) * arg2 >> 7;
		@Pc(63) int local63 = (arg1 & 0xFC00) * local16 + arg2 * (arg0 & 0xFC00) >> 7;
		return local30 & 0x7F | local44 & 0x380 | local63 & 0xFC00;
	}
}
