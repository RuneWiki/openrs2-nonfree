import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public static int anInt5701;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
	public static int[] anIntArray373 = new int[2];

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_29 = new Class279(4);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!fe;Z)Z")
	public static boolean method4748(@OriginalArg(0) Class23_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static343.aClass104Array2 == Static605.aClass104Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8612();
		if (arg0.aShort123 < 0 || arg0.aShort124 < 0 || arg0.aShort125 >= Static410.anInt6962 || arg0.aShort122 >= Static315.anInt5894) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort123; local36 <= arg0.aShort125; local36++) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class247 local47 = Static554.method7252(arg0.aByte142, local36, local40);
				if (local47 != null) {
					@Pc(53) Class85 local53 = Static301.method4656(arg0);
					@Pc(56) Class85 local56 = local47.aClass85_3;
					if (local56 == null) {
						local47.aClass85_3 = local53;
					} else {
						while (local56.aClass85_1 != null) {
							local56 = local56.aClass85_1;
						}
						local56.aClass85_1 = local53;
					}
					if (local6 && (Static301.anIntArrayArray59[local36][local40] & 0xFF000000) != 0) {
						local8 = Static301.anIntArrayArray59[local36][local40];
						local10 = Static273.aShortArrayArray10[local36][local40];
						local12 = Static614.aByteArrayArray23[local36][local40];
					}
					if (!arg1 && local47.aClass23_Sub2_Sub3_1 != null && local47.aClass23_Sub2_Sub3_1.aShort116 > local33) {
						local33 = local47.aClass23_Sub2_Sub3_1.aShort116;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort123; local40 <= arg0.aShort125; local40++) {
				for (@Pc(136) int local136 = arg0.aShort124; local136 <= arg0.aShort122; local136++) {
					if ((Static301.anIntArrayArray59[local40][local136] & 0xFF000000) == 0) {
						Static301.anIntArrayArray59[local40][local136] = local8;
						Static273.aShortArrayArray10[local40][local136] = local10;
						Static614.aByteArrayArray23[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static594.aClass23_Sub2_Sub1Array1[Static279.anInt5224++] = arg0;
		} else {
			local40 = Static343.aClass104Array2 == Static605.aClass104Array3 ? 1 : 0;
			if (!arg0.method8608()) {
				arg0.aClass23_Sub2_23 = Static188.aClass23_Sub2Array1[local40];
				Static188.aClass23_Sub2Array1[local40] = arg0;
			} else if (arg0.method8594()) {
				arg0.aClass23_Sub2_23 = Static496.aClass23_Sub2Array3[local40];
				Static496.aClass23_Sub2Array3[local40] = arg0;
			} else {
				arg0.aClass23_Sub2_23 = Static249.aClass23_Sub2Array2[local40];
				Static249.aClass23_Sub2Array2[local40] = arg0;
				Static674.aBoolean763 = true;
			}
		}
		if (arg1) {
			arg0.anInt10114 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method4749() {
		@Pc(9) int local9 = Static215.anInt6266 * 512 + 256;
		@Pc(15) int local15 = Static480.anInt8125 * 512 + 256;
		@Pc(24) int local24 = Static194.method5133(local9, local15, Static576.anInt9136) - Static337.anInt6126;
		if (Static55.anInt1419 >= 100) {
			Static663.anInt10236 = Static480.anInt8125 * 512 + 256;
			Static97.anInt2082 = Static215.anInt6266 * 512 + 256;
			Static265.anInt9363 = Static194.method5133(Static97.anInt2082, Static663.anInt10236, Static576.anInt9136) - Static337.anInt6126;
		} else {
			if (Static97.anInt2082 < local9) {
				Static97.anInt2082 += (local9 - Static97.anInt2082) * Static55.anInt1419 / 1000 + Static18.anInt681;
				if (local9 < Static97.anInt2082) {
					Static97.anInt2082 = local9;
				}
			}
			if (local9 < Static97.anInt2082) {
				Static97.anInt2082 -= Static18.anInt681 + (Static97.anInt2082 - local9) * Static55.anInt1419 / 1000;
				if (local9 > Static97.anInt2082) {
					Static97.anInt2082 = local9;
				}
			}
			if (local24 > Static265.anInt9363) {
				Static265.anInt9363 += Static18.anInt681 + Static55.anInt1419 * (local24 - Static265.anInt9363) / 1000;
				if (Static265.anInt9363 > local24) {
					Static265.anInt9363 = local24;
				}
			}
			if (local15 > Static663.anInt10236) {
				Static663.anInt10236 += Static18.anInt681 + (local15 - Static663.anInt10236) * Static55.anInt1419 / 1000;
				if (Static663.anInt10236 > local15) {
					Static663.anInt10236 = local15;
				}
			}
			if (local24 < Static265.anInt9363) {
				Static265.anInt9363 -= Static18.anInt681 + (Static265.anInt9363 - local24) * Static55.anInt1419 / 1000;
				if (local24 > Static265.anInt9363) {
					Static265.anInt9363 = local24;
				}
			}
			if (local15 < Static663.anInt10236) {
				Static663.anInt10236 -= Static18.anInt681 + (Static663.anInt10236 - local15) * Static55.anInt1419 / 1000;
				if (Static663.anInt10236 < local15) {
					Static663.anInt10236 = local15;
				}
			}
		}
		local15 = Static108.anInt2245 * 512 + 256;
		local9 = Static409.anInt6761 * 512 + 256;
		local24 = Static194.method5133(local9, local15, Static576.anInt9136) - Static404.anInt6908;
		@Pc(229) int local229 = local9 - Static97.anInt2082;
		@Pc(234) int local234 = local24 - Static265.anInt9363;
		@Pc(239) int local239 = local15 - Static663.anInt10236;
		@Pc(250) int local250 = (int) Math.sqrt((double) (local239 * local239 + local229 * local229));
		@Pc(261) int local261 = (int) (Math.atan2((double) local234, (double) local250) * 2607.5945876176133D) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		@Pc(279) int local279 = (int) (Math.atan2((double) local229, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (local261 > Static118.anInt2323) {
			Static118.anInt2323 += Static290.anInt5356 + Static452.anInt7747 * (local261 - Static118.anInt2323 >> 3) / 1000 << 3;
			if (local261 < Static118.anInt2323) {
				Static118.anInt2323 = local261;
			}
		}
		if (local261 < Static118.anInt2323) {
			Static118.anInt2323 -= Static290.anInt5356 + (Static118.anInt2323 - local261 >> 3) * Static452.anInt7747 / 1000 << 3;
			if (local261 > Static118.anInt2323) {
				Static118.anInt2323 = local261;
			}
		}
		@Pc(348) int local348 = local279 - Static206.anInt3821;
		if (local348 > 8192) {
			local348 -= 16384;
		}
		if (local348 < -8192) {
			local348 += 16384;
		}
		local348 >>= 0x3;
		if (local348 > 0) {
			Static206.anInt3821 += Static290.anInt5356 + Static452.anInt7747 * local348 / 1000 << 3;
			Static206.anInt3821 &= 0x3FFF;
		}
		if (local348 < 0) {
			Static206.anInt3821 -= -local348 * Static452.anInt7747 / 1000 + Static290.anInt5356 << 3;
			Static206.anInt3821 &= 0x3FFF;
		}
		@Pc(412) int local412 = local279 - Static206.anInt3821;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local348 > 0 || local412 > 0 && local348 < 0) {
			Static206.anInt3821 = local279;
		}
		Static260.anInt4898 = 0;
	}
}
