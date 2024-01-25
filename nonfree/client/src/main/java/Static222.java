import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!l", name = "C", descriptor = "[I")
	public static int[] anIntArray293 = new int[2];

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	public static int anInt4030 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!eq;I)V")
	public static void method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4) {
		arg3.method5044(arg0, arg1, arg0 + arg4, arg2 + arg1);
		arg3.method5035(arg4, arg1, -16777216, arg0, arg2);
		if (Static263.anInt4747 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static7.anInt1147 / (float) Static7.anInt1141;
		@Pc(37) int local37 = arg4;
		@Pc(39) int local39 = arg2;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg4 * local35);
		} else {
			local37 = (int) ((float) arg2 / local35);
		}
		@Pc(66) int local66 = arg1 + (arg2 - local39) / 2;
		@Pc(74) int local74 = arg0 + (arg4 - local37) / 2;
		if (Static78.aClass87_6 == null || arg4 != Static78.aClass87_6.method6555() || Static78.aClass87_6.method6554() != arg2) {
			Static7.method934(Static7.anInt1139, Static7.anInt1150 + Static7.anInt1147, Static7.anInt1139 - -Static7.anInt1141, Static7.anInt1150, local74, local66, local74 + local37, local39 + local66);
			Static7.method926(arg3);
			Static78.aClass87_6 = arg3.method5014(local74, local66, local37, local39, false);
		}
		Static78.aClass87_6.method6567(local74, local66);
		@Pc(127) int local127 = Static408.anInt7342 * local37 / Static7.anInt1141;
		@Pc(133) int local133 = Static93.anInt2136 * local39 / Static7.anInt1147;
		@Pc(142) int local142 = local74 + Static348.anInt6271 * local37 / Static7.anInt1141;
		@Pc(155) int local155 = local39 + local66 - local133 - Static71.anInt1871 * local39 / Static7.anInt1147;
		@Pc(157) int local157 = -1996554240;
		if (Static24.aClass36_2 == Static4.aClass36_5) {
			local157 = -1996488705;
		}
		arg3.method5004(local142, local155, local127, local133, local157, 1);
		arg3.method4972(local142, local155, local127, local133, local157, 0);
		if (Static224.anInt4061 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static373.anInt6709 > 50) {
			local194 = (100 - Static373.anInt6709) * 5;
		} else {
			local194 = Static373.anInt6709 * 5;
		}
		for (@Pc(205) Class6_Sub32 local205 = (Class6_Sub32) Static7.aClass244_7.method5976(); local205 != null; local205 = (Class6_Sub32) Static7.aClass244_7.method5964()) {
			@Pc(213) Class260 local213 = Static7.aClass169_6.method3948(local205.anInt5707);
			if (Static224.method3364(local213)) {
				@Pc(235) int local235;
				@Pc(247) int local247;
				if (Static224.anInt4054 == local205.anInt5707) {
					local235 = local74 + local37 * local205.anInt5701 / Static7.anInt1141;
					local247 = local39 * (Static7.anInt1147 - local205.anInt5705) / Static7.anInt1147 + local66;
					arg3.method5035(4, local247 - 2, local194 << 24 | 0xFFFF00, local235 - 2, 4);
				} else if (Static138.anInt4528 != -1 && Static138.anInt4528 == local213.anInt7733) {
					local235 = local74 + local37 * local205.anInt5701 / Static7.anInt1141;
					local247 = (Static7.anInt1147 - local205.anInt5705) * local39 / Static7.anInt1147 + local66;
					arg3.method5035(4, local247 - 2, local194 << 24 | 0xFFFF00, local235 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method3349() {
		for (@Pc(8) int local8 = 0; local8 < Static263.anInt4750; local8++) {
			@Pc(14) int local14 = Static58.anIntArray193[local8];
			@Pc(18) Class3_Sub2_Sub1_Sub1 local18 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local14];
			@Pc(22) int local22 = Static232.aClass6_Sub1_Sub1_4.method6433();
			if ((local22 & 0x4) != 0) {
				local22 += Static232.aClass6_Sub1_Sub1_4.method6433() << 8;
			}
			@Pc(45) int local45;
			@Pc(49) int local49;
			if ((local22 & 0x20) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6445();
				local49 = Static232.aClass6_Sub1_Sub1_4.method6433();
				local18.method5512(local45, local49, Static66.anInt1741);
				local18.anInt6593 = Static66.anInt1741 + 300;
				local18.anInt6589 = Static232.aClass6_Sub1_Sub1_4.method6431();
			}
			if ((local22 & 0x1) != 0) {
				local18.aString52 = Static232.aClass6_Sub1_Sub1_4.method6473();
				local18.anInt6539 = 100;
			}
			if ((local22 & 0x100) != 0) {
				local18.anInt1667 = Static232.aClass6_Sub1_Sub1_4.method6485();
				local18.anInt1665 = Static232.aClass6_Sub1_Sub1_4.method6485();
			}
			if ((local22 & 0x10) != 0) {
				local18.anInt6569 = Static232.aClass6_Sub1_Sub1_4.method6485();
				if (local18.anInt6569 == 65535) {
					local18.anInt6569 = -1;
				}
			}
			if ((local22 & 0x2000) != 0) {
				local18.anInt6536 = Static232.aClass6_Sub1_Sub1_4.method6438();
				local18.anInt6554 = Static232.aClass6_Sub1_Sub1_4.method6468();
				local18.anInt6560 = Static232.aClass6_Sub1_Sub1_4.method6468();
				local18.anInt6578 = Static232.aClass6_Sub1_Sub1_4.method6486();
				local18.anInt6570 = Static232.aClass6_Sub1_Sub1_4.method6447() + Static66.anInt1741;
				local18.anInt6595 = Static232.aClass6_Sub1_Sub1_4.method6485() + Static66.anInt1741;
				local18.anInt6580 = Static232.aClass6_Sub1_Sub1_4.method6488();
				local18.anInt6578 += local18.anIntArray459[0];
				local18.anInt6611 = 0;
				local18.anInt6536 += local18.anIntArray458[0];
				local18.anInt6613 = 1;
				local18.anInt6560 += local18.anIntArray458[0];
				local18.anInt6554 += local18.anIntArray459[0];
			}
			if ((local22 & 0x40) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6445();
				local49 = Static232.aClass6_Sub1_Sub1_4.method6431();
				local18.method5512(local45, local49, Static66.anInt1741);
			}
			@Pc(250) int local250;
			if ((local22 & 0x8) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6447();
				if (local45 == 65535) {
					local45 = -1;
				}
				local49 = Static232.aClass6_Sub1_Sub1_4.method6442();
				local250 = Static232.aClass6_Sub1_Sub1_4.method6472();
				local18.method5522(false, local45, local250, local49);
			}
			if ((local22 & 0x200) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6447();
				local18.anInt6537 = Static232.aClass6_Sub1_Sub1_4.method6433();
				local18.anInt6577 = Static232.aClass6_Sub1_Sub1_4.method6433();
				local18.aBoolean419 = (local45 & 0x8000) != 0;
				local18.anInt6542 = local45 & 0x7FFF;
				local18.anInt6556 = local18.anInt6537 + local18.anInt6542 + Static66.anInt1741;
			}
			if ((local22 & 0x1000) != 0) {
				local18.aByte91 = Static232.aClass6_Sub1_Sub1_4.method6438();
				local18.aByte92 = Static232.aClass6_Sub1_Sub1_4.method6486();
				local18.aByte89 = Static232.aClass6_Sub1_Sub1_4.method6468();
				local18.aByte90 = (byte) Static232.aClass6_Sub1_Sub1_4.method6488();
				local18.anInt6582 = Static66.anInt1741 + Static232.aClass6_Sub1_Sub1_4.method6455();
				local18.anInt6600 = Static66.anInt1741 + Static232.aClass6_Sub1_Sub1_4.method6447();
			}
			if ((local22 & 0x80) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6455();
				if (local45 == 65535) {
					local45 = -1;
				}
				local49 = Static232.aClass6_Sub1_Sub1_4.method6472();
				Static99.method4913(local45, local18, local49);
			}
			if ((local22 & 0x2) != 0) {
				if (local18.aClass48_1.method1384()) {
					Static5.method202(local18);
				}
				local18.method1318(Static235.aClass263_2.method6416(Static232.aClass6_Sub1_Sub1_4.method6455()));
				local18.method5515(local18.aClass48_1.anInt1752);
				local18.anInt6571 = local18.aClass48_1.anInt1744 << 3;
				if (local18.aClass48_1.method1384()) {
					Static160.method2662(local18.aByte103, 0, null, local18, local18.anIntArray458[0], null, local18.anIntArray459[0]);
				}
			}
			if ((local22 & 0x400) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6447();
				local49 = Static232.aClass6_Sub1_Sub1_4.method6469();
				if (local45 == 65535) {
					local45 = -1;
				}
				local250 = Static232.aClass6_Sub1_Sub1_4.method6431();
				local18.method5522(true, local45, local250, local49);
			}
			if ((local22 & 0x800) != 0) {
				local45 = Static232.aClass6_Sub1_Sub1_4.method6431();
				@Pc(476) int[] local476 = new int[local45];
				@Pc(479) int[] local479 = new int[local45];
				@Pc(482) int[] local482 = new int[local45];
				for (@Pc(484) int local484 = 0; local484 < local45; local484++) {
					@Pc(490) int local490 = Static232.aClass6_Sub1_Sub1_4.method6477();
					if (local490 == 65535) {
						local490 = -1;
					}
					local476[local484] = local490;
					local479[local484] = Static232.aClass6_Sub1_Sub1_4.method6433();
					local482[local484] = Static232.aClass6_Sub1_Sub1_4.method6485();
				}
				Static72.method1457(local479, local18, local476, local482);
			}
		}
	}
}
