import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public static int anInt5385 = 0;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_249 = new Class22(105, -2);

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public static int anInt5387 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method4123() {
		Static57.aClass19_7.B(((float) Static323.aClass50_Sub1_1.anInt3436 * 0.1F + 0.7F) * 1.1523438F);
		Static57.aClass19_7.T(Static65.anInt1369, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static57.aClass19_7.UA(Static317.anInt5521, -1, 256);
		Static57.aClass19_7.method4288(Static265.aClass99_5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[BZIII)V")
	public static void method4125(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg1) {
			return;
		}
		arg3 += arg2;
		@Pc(23) int local23 = arg1 - arg2 >> 2;
		while (true) {
			local23--;
			if (local23 < 0) {
				local23 = arg1 - arg2 & 0x3;
				while (true) {
					local23--;
					if (local23 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(28) int local28 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg0[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			arg3 = local38 + 1;
			arg0[local38] = 1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method4129(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = Static310.anInt5424;
		@Pc(9) int local9 = Static172.anInt3367;
		@Pc(11) int local11 = Static173.anInt3370;
		@Pc(15) int local15 = Static112.anInt2392 - 3;
		if (Static21.aClass57_4 == null || Static430.aClass57_17 == null) {
			if (Static293.aClass76_60.method2125(Static199.anInt3850) && Static293.aClass76_60.method2125(Static419.anInt6931)) {
				Static21.aClass57_4 = arg0.method4308(Static456.method318(Static293.aClass76_60, Static199.anInt3850, 0));
				@Pc(63) Class18 local63 = Static456.method318(Static293.aClass76_60, Static419.anInt6931, 0);
				Static430.aClass57_17 = arg0.method4308(local63);
				local63.method316();
				Static299.aClass57_20 = arg0.method4308(local63);
			} else {
				arg0.O(local7, local9, local11, 20, Static426.anInt7011 | 255 - Static372.anInt6373 << 24, 1);
			}
		}
		@Pc(92) int local92;
		@Pc(90) int local90;
		if (Static21.aClass57_4 != null && Static430.aClass57_17 != null) {
			local90 = (local11 - Static430.aClass57_17.la() * 2) / Static21.aClass57_4.la();
			for (local92 = 0; local92 < local90; local92++) {
				Static21.aClass57_4.method5534(local7 + Static430.aClass57_17.la() + Static21.aClass57_4.la() * local92, local9);
			}
			Static430.aClass57_17.method5534(local7, local9);
			Static299.aClass57_20.method5534(local7 + local11 - Static299.aClass57_20.la(), local9);
		}
		Static331.aClass46_10.method5058(-1, Static111.anInt2387 | -16777216, Static391.aClass83_133.method2267(Static178.anInt3423), local9 + 14, local7 + 3);
		arg0.O(local7, local9 + 20, local11, local15 - 20, Static426.anInt7011 | 255 - Static372.anInt6373 << 24, 1);
		local90 = Static420.aClass80_1.method2234();
		local92 = Static420.aClass80_1.method2230();
		@Pc(172) int local172 = 0;
		@Pc(196) int local196;
		for (@Pc(179) Class4_Sub39 local179 = (Class4_Sub39) Static206.aClass183_28.method4140(); local179 != null; local179 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			local196 = (Static407.anInt6710 - local172 - 1) * 16 + local9 + 13 + 20;
			local172++;
			if (local7 < local90 && local7 + local11 > local90 && local196 - 13 < local92 && local92 < local196 + 4 && local179.aBoolean512) {
				arg0.O(local7, local196 - 12, local11, 16, 255 - Static131.anInt2738 << 24 | Static152.anInt3062, 1);
			}
		}
		if ((Static257.aClass57_19 == null || Static369.aClass57_21 == null || Static143.aClass57_15 == null) && Static293.aClass76_60.method2125(Static270.anInt5073) && Static293.aClass76_60.method2125(Static190.anInt3601) && Static293.aClass76_60.method2125(Static444.anInt7297)) {
			@Pc(279) Class18 local279 = Static456.method318(Static293.aClass76_60, Static190.anInt3601, 0);
			Static369.aClass57_21 = arg0.method4308(local279);
			local279.method316();
			Static80.aClass57_9 = arg0.method4308(local279);
			Static257.aClass57_19 = arg0.method4308(Static456.method318(Static293.aClass76_60, Static270.anInt5073, 0));
			@Pc(304) Class18 local304 = Static456.method318(Static293.aClass76_60, Static444.anInt7297, 0);
			Static143.aClass57_15 = arg0.method4308(local304);
			local304.method316();
			Static132.aClass57_12 = arg0.method4308(local304);
		}
		@Pc(372) int local372;
		@Pc(335) int local335;
		if (Static257.aClass57_19 != null && Static369.aClass57_21 != null && Static143.aClass57_15 != null) {
			local196 = (local11 - Static143.aClass57_15.la() * 2) / Static257.aClass57_19.la();
			for (local335 = 0; local335 < local196; local335++) {
				Static257.aClass57_19.method5534(Static143.aClass57_15.la() + local7 + local335 * Static257.aClass57_19.la(), local15 + local9 + -Static257.aClass57_19.ma());
			}
			local372 = (local15 - Static143.aClass57_15.ma() - 20) / Static369.aClass57_21.ma();
			for (@Pc(374) int local374 = 0; local374 < local372; local374++) {
				Static369.aClass57_21.method5534(local7, local9 + Static369.aClass57_21.ma() * local374 + 20);
				Static80.aClass57_9.method5534(local11 + local7 - Static80.aClass57_9.la(), local9 - (-(Static369.aClass57_21.ma() * local374) + -20));
			}
			Static143.aClass57_15.method5534(local7, local15 + local9 - Static143.aClass57_15.ma());
			Static132.aClass57_12.method5534(local11 + local7 - Static143.aClass57_15.la(), local9 + (local15 - Static143.aClass57_15.ma()));
		}
		local172 = 0;
		for (@Pc(444) Class4_Sub39 local444 = (Class4_Sub39) Static206.aClass183_28.method4140(); local444 != null; local444 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			local335 = local9 + (Static407.anInt6710 + -1 + -local172) * 16 + 20 + 13;
			local372 = Static111.anInt2387 | 0xFF000000;
			if (local7 < local90 && local11 + local7 > local90 && local92 > local335 - 13 && local335 + 4 > local92 && local444.aBoolean512) {
				local372 = Static286.anInt5199 | 0xFF000000;
			}
			@Pc(500) int[] local500 = null;
			if (Static441.method5569(local444.anInt5699)) {
				local500 = Static444.aClass206_3.method4703((int) local444.aLong192).anIntArray435;
			} else if (local444.anInt5695 != -1) {
				local500 = Static444.aClass206_3.method4703(local444.anInt5695).anIntArray435;
			} else if (Static323.method4382(local444.anInt5699)) {
				@Pc(578) Class16_Sub1_Sub5_Sub2 local578 = Static143.aClass16_Sub1_Sub5_Sub2Array1[(int) local444.aLong192];
				if (local578 != null) {
					@Pc(583) Class264 local583 = local578.aClass264_1;
					if (local583.anIntArray544 != null) {
						local583 = local583.method5574(Static257.aClass114_1);
					}
					if (local583 != null) {
						local500 = local583.anIntArray547;
					}
				}
			} else if (Static106.method1982(local444.anInt5699)) {
				@Pc(550) Class202 local550;
				if (local444.anInt5699 == 1010) {
					local550 = Static267.aClass262_2.method5560((int) local444.aLong192);
				} else {
					local550 = Static267.aClass262_2.method5560((int) (local444.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local550.anIntArray407 != null) {
					local550 = local550.method4584(Static257.aClass114_1);
				}
				if (local550 != null) {
					local500 = local550.anIntArray408;
				}
			}
			@Pc(608) String local608 = Static200.method3166(local444);
			if (local500 != null) {
				local608 = local608 + Static435.method5504(local500);
			}
			Static331.aClass46_10.method5057(Static278.anIntArray338, Static385.aClass57Array16, local372, local608, local7 + 3, local335);
			local172++;
			if (local444.aBoolean511) {
				Static389.aClass57_22.method5534(Static118.aClass89_5.method2340(local608) + local7 + 5, local335 + -12);
			}
		}
		Static403.method5216(Static173.anInt3370, Static112.anInt2392, Static172.anInt3367, Static310.anInt5424);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4130(@OriginalArg(0) String arg0) {
		if (!Static341.aBoolean599) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(17) int local17 = Static33.anInt606;
		@Pc(19) int[] local19 = Static99.anIntArray157;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(29) Class16_Sub1_Sub5_Sub1 local29 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local19[local21]];
			if (local29 != null && Static1.aClass16_Sub1_Sub5_Sub1_1 != local29 && local29.aString44 != null && local29.aString44.equalsIgnoreCase(arg0)) {
				Static429.method5476(Static339.aClass215_80);
				Static3.aClass4_Sub12_Sub1_5.method2513(Static408.anInt6726);
				Static3.aClass4_Sub12_Sub1_5.method2496(local19[local21]);
				Static3.aClass4_Sub12_Sub1_5.method2524(Static161.anInt3179);
				Static3.aClass4_Sub12_Sub1_5.method2524(Static23.anInt350);
				Static3.aClass4_Sub12_Sub1_5.method2495(0);
				Static166.method2734(0, local29.anIntArray427[0], local29.anIntArray426[0], local29.method4751(), true, local29.method4751(), 0, -2);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static415.method5323(Static76.aClass83_32.method2267(Static178.anInt3423) + arg0);
		}
		if (Static341.aBoolean599) {
			Static336.method5139();
		}
	}
}
