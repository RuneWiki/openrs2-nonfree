import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public static int anInt4310;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLclient!rda;)V")
	public static void method3809(@OriginalArg(1) Class3_Sub42 arg0) {
		if (Static554.aClass63ArrayArrayArray4 == null) {
			return;
		}
		@Pc(16) Interface22 local16 = null;
		if (arg0.anInt7377 == 0) {
			local16 = (Interface22) Static247.method4031(arg0.anInt7384, arg0.anInt7385, arg0.anInt7381);
		}
		if (arg0.anInt7377 == 1) {
			local16 = (Interface22) Static339.method5173(arg0.anInt7384, arg0.anInt7385, arg0.anInt7381);
		}
		if (arg0.anInt7377 == 2) {
			local16 = (Interface22) Static417.method5998(arg0.anInt7384, arg0.anInt7385, arg0.anInt7381, qu.class);
		}
		if (arg0.anInt7377 == 3) {
			local16 = (Interface22) Static168.method7472(arg0.anInt7384, arg0.anInt7385, arg0.anInt7381);
		}
		if (local16 == null) {
			arg0.anInt7378 = 0;
			arg0.anInt7380 = 0;
			arg0.anInt7382 = -1;
		} else {
			arg0.anInt7382 = local16.method7088();
			arg0.anInt7380 = local16.method7091();
			arg0.anInt7378 = local16.method7093();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "([I[JZ)V")
	public static void method3810(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static485.method6607(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)Z")
	public static boolean method3811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(III)I")
	public static int method3812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static290.method7656(arg0 - 1, arg1 - 1) + Static290.method7656(arg0 - 1, arg1 + 1) + Static290.method7656(arg0 + 1, arg1 + -1) + Static290.method7656(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static290.method7656(arg0, arg1 - 1) + Static290.method7656(arg0, arg1 + 1) + Static290.method7656(arg0 + -1, arg1) + Static290.method7656(arg0 + 1, arg1);
		@Pc(82) int local82 = Static290.method7656(arg0, arg1);
		return local48 / 16 + local77 / 8 + local82 / 4;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!cd;Lclient!qj;Lclient!r;I)V")
	public static void method3813(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) Class43 arg2) {
		@Pc(17) Class46 local17 = arg0.method1124(arg2);
		if (local17 == null) {
			return;
		}
		@Pc(23) int local23 = local17.E();
		if (local23 < local17.u()) {
			local23 = local17.u();
		}
		@Pc(35) int local35 = arg1.anInt7157;
		@Pc(38) int local38 = arg1.anInt7158;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(58) int local58;
		@Pc(81) int local81;
		if (arg0.aString25 != null) {
			local40 = Static519.aClass58_13.method1778(Static106.aStringArray10, null, null, arg0.aString25);
			for (local58 = 0; local58 < local40; local58++) {
				@Pc(64) String local64 = Static106.aStringArray10[local58];
				if (local40 - 1 > local58) {
					local64 = local64.substring(0, local64.length() - 4);
				}
				local81 = Static152.aClass106_2.method2834(local64);
				if (local42 < local81) {
					local42 = local81;
				}
			}
			local44 = Static152.aClass106_2.method2829() * local40 + Static152.aClass106_2.method2830() / 2;
		}
		local58 = arg1.anInt7157 + local23 / 2;
		if (Static284.anInt7857 + local23 > local35) {
			local35 = Static284.anInt7857;
			local58 = Static284.anInt7857 + local23 / 2 + local42 / 2 + 5 + 10;
		} else if (Static284.anInt7866 - local23 < local35) {
			local35 = Static284.anInt7866 - local23;
			local58 = Static284.anInt7866 - local23 / 2 - local42 / 2 - 5 - 10;
		}
		@Pc(173) int local173 = arg1.anInt7158;
		if (local23 + Static284.anInt7859 > local38) {
			local173 = local23 / 2 + Static284.anInt7859 + 10;
			local38 = Static284.anInt7859;
		} else if (local38 > Static284.anInt7862 - local23) {
			local173 = Static284.anInt7862 - local23 / 2 - local44 - 10;
			local38 = Static284.anInt7862 - local23;
		}
		local81 = (int) (Math.atan2((double) (local35 - arg1.anInt7157), (double) (local38 - arg1.anInt7158)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local17.method7611((float) local35 + (float) local23 / 2.0F, (float) local23 / 2.0F + (float) local38, 4096, local81);
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		if (arg0.aString25 != null) {
			local258 = local173;
			local256 = local58 - local42 / 2 - 5;
			local260 = local256 + local42 + 10;
			local262 = Static152.aClass106_2.method2829() * local40 + local173 + 3;
			if (arg0.anInt1387 != 0) {
				arg2.method7185(local173, local262 - local173, local260 - local256, local256, arg0.anInt1387);
			}
			if (arg0.anInt1384 != 0) {
				arg2.method7145(local262 - local173, arg0.anInt1384, local260 - local256, local256, local173);
			}
			for (@Pc(335) int local335 = 0; local335 < local40; local335++) {
				@Pc(341) String local341 = Static106.aStringArray10[local335];
				if (local40 - 1 > local335) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static152.aClass106_2.method2831(arg2, local341, local58, local173, arg0.anInt1390);
				local173 += Static152.aClass106_2.method2829();
			}
		}
		if (arg0.anInt1385 == -1 && arg0.aString25 == null) {
			return;
		}
		@Pc(393) Class3_Sub50 local393 = new Class3_Sub50(arg1);
		local23 >>= 0x1;
		local393.anInt9380 = local258;
		local393.anInt9390 = local23 + local35;
		local393.anInt9389 = local262;
		local393.anInt9381 = local38 - local23;
		local393.anInt9387 = local260;
		local393.anInt9383 = local256;
		local393.anInt9391 = local35 - local23;
		local393.anInt9392 = local23 + local38;
		Static552.aClass130_63.method3548(local393);
	}
}
