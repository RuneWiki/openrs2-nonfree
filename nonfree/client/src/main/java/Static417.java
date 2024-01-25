import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Lclient!rfa;")
	public static Class285 aClass285_1;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!ah;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public static int anInt7188 = 0;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
	public static final int[] anIntArray493 = new int[4];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!kp;IBILclient!ua;IJI)V")
	public static void method6033(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg5 * arg5 + arg0 * arg0;
		if (arg6 < (long) local16) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg1.anInt5130 / 2, arg1.anInt5078 / 2);
		if (local16 <= local36 * local36) {
			Static267.method4087(arg7, arg5, arg0, arg1, Static231.aClass39Array9[arg2], arg3, arg4);
			return;
		}
		local36 -= 10;
		@Pc(67) int local67;
		if (Static311.anInt5570 == 4) {
			local67 = (int) Static447.aFloat233 & 0x3FFF;
		} else {
			local67 = (int) Static447.aFloat233 + anInt7188 & 0x3FFF;
		}
		@Pc(78) int local78 = Class363.anIntArray697[local67];
		@Pc(82) int local82 = Class363.anIntArray698[local67];
		if (Static311.anInt5570 != 4) {
			local78 = local78 * 256 / (Static557.anInt9152 + 256);
			local82 = local82 * 256 / (Static557.anInt9152 + 256);
		}
		@Pc(114) int local114 = local78 * arg5 + arg0 * local82 >> 14;
		@Pc(125) int local125 = arg5 * local82 - local78 * arg0 >> 14;
		@Pc(131) double local131 = Math.atan2((double) local114, (double) local125);
		@Pc(138) int local138 = (int) (Math.sin(local131) * (double) local36);
		@Pc(145) int local145 = (int) ((double) local36 * Math.cos(local131));
		Static123.aClass39Array3[arg2].method7857((float) arg1.anInt5130 / 2.0F + (float) arg3 + (float) local138, (float) arg1.anInt5078 / 2.0F + (float) arg7 - (float) local145, 4096, (int) (-local131 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!qd;)V")
	public static void method6035(@OriginalArg(0) Class265 arg0) {
		if (Static441.anInt7764 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub14 local6 = arg0.aClass2_Sub14_3;
		Static237.aClass265Array2[Static441.anInt7764] = arg0;
		Static237.aBooleanArray34[Static441.anInt7764] = false;
		Static441.anInt7764++;
		@Pc(21) int local21 = arg0.anInt7293;
		if (arg0.aBoolean566) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt7293;
		if (arg0.aBoolean565) {
			local29 = Static89.anInt8689 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7693() + Static81.anInt1767 - local6.method7691() >> Static134.anInt2822;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7693() + local6.method7691() - Static81.anInt1767 >> Static134.anInt2822;
			if (local73 >= Static357.anInt6390) {
				local73 = Static357.anInt6390 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray102[local41++];
				@Pc(105) int local105 = (local6.method7694() + Static81.anInt1767 - local6.method7691() >> Static134.anInt2822) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static496.anInt8369) {
					local113 = Static496.anInt8369 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static501.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static501.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static441.anInt7764;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static501.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static441.anInt7764 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static501.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static441.anInt7764 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static501.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static441.anInt7764 << 48;
					}
				}
			}
		}
	}
}
