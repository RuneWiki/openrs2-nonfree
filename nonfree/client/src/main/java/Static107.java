import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 aClass1_Sub1_Sub12_Sub3_Sub1_6;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!ob;")
	public static Class60 aClass60_8;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILclient!nb;IZ)V")
	public static void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub12_Sub1 arg3, @OriginalArg(4) int arg4) {
		@Pc(17) int local17 = arg4 * arg4 + arg1 * arg1;
		if (local17 <= 4225 || local17 >= 90000) {
			Static156.method2640(arg4, arg3, arg0, arg2, arg1);
			return;
		}
		@Pc(39) int local39 = Static179.anInt4264 + Static127.anInt3355 & 0x7FF;
		@Pc(43) int local43 = Class1_Sub1_Sub12_Sub2.anIntArray417[local39];
		@Pc(47) int local47 = Class1_Sub1_Sub12_Sub2.anIntArray416[local39];
		@Pc(55) int local55 = local47 * 256 / (Static49.anInt1423 + 256);
		@Pc(63) int local63 = local43 * 256 / (Static49.anInt1423 + 256);
		@Pc(73) int local73 = arg4 * local63 - arg1 * local55 >> 16;
		@Pc(83) int local83 = arg1 * local63 + arg4 * local55 >> 16;
		@Pc(89) double local89 = Math.atan2((double) local83, (double) local73);
		@Pc(95) int local95 = (int) (Math.sin(local89) * 63.0D);
		@Pc(101) int local101 = (int) (Math.cos(local89) * 57.0D);
		Static16.aClass1_Sub1_Sub12_Sub1_2.method1929(local95 + arg0 + 94 - 6, -local101 + 83 + (arg2 - 20), local89);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method1848(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static8.aClass1_Sub1_Sub12_Sub1_1.anIntArray374;
		@Pc(7) int local7 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			local4[local13] = 1;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static12.aByteArrayArrayArray11[arg0][local40][local25] & 0x18) == 0) {
					Static123.aClass80_1.method2702(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static12.aByteArrayArrayArray11[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static123.aClass80_1.method2702(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static8.aClass1_Sub1_Sub12_Sub1_1.method1935();
		local38 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 1; local141 < 103; local141++) {
			for (local145 = 1; local145 < 103; local145++) {
				if ((Static12.aByteArrayArrayArray11[arg0][local145][local141] & 0x18) == 0) {
					Static1.method93(local38, local145, local141, local40, arg0);
				}
				if (arg0 < 3 && (Static12.aByteArrayArrayArray11[arg0 + 1][local145][local141] & 0x8) != 0) {
					Static1.method93(local38, local145, local141, local40, arg0 + 1);
				}
			}
		}
		Static35.anInt969 = 0;
		for (local145 = 0; local145 < 104; local145++) {
			for (@Pc(218) int local218 = 0; local218 < 104; local218++) {
				@Pc(226) int local226 = Static123.aClass80_1.method2687(Static85.anInt2267, local145, local218);
				if (local226 != 0) {
					local226 = local226 >> 14 & 0x7FFF;
					@Pc(242) int local242 = Static84.method3155(local226).anInt642;
					if (local242 >= 0) {
						@Pc(249) int local249 = local145;
						@Pc(251) int local251 = local218;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(281) int[][] local281 = Static132.aClass69Array3[Static85.anInt2267].anIntArrayArray33;
							for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
								@Pc(290) int local290 = (int) (Math.random() * 4.0D);
								if (local290 == 0 && local249 > 0 && local249 > local145 - 3 && (local281[local249 - 1][local251] & 0x12C0108) == 0) {
									local249--;
								}
								if (local290 == 1 && local249 < 103 && local145 + 3 > local249 && (local281[local249 + 1][local251] & 0x12C0180) == 0) {
									local249++;
								}
								if (local290 == 2 && local251 > 0 && local218 - 3 < local251 && (local281[local249][local251 - 1] & 0x12C0102) == 0) {
									local251--;
								}
								if (local290 == 3 && local251 < 103 && local251 < local218 + 3 && (local281[local249][local251 + 1] & 0x12C0120) == 0) {
									local251++;
								}
							}
						}
						Static98.aClass1_Sub1_Sub12_Sub1Array5[Static35.anInt969] = Static69.aClass1_Sub1_Sub12_Sub1Array4[local242];
						Static127.anIntArray441[Static35.anInt969] = local249;
						Static129.anIntArray445[Static35.anInt969] = local251;
						Static35.anInt969++;
					}
				}
			}
		}
		Static138.aClass25_1.method2789();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1850(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static129.aClass35_1);
		arg0.removeFocusListener(Static129.aClass35_1);
		Static170.anInt803 = -1;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public static void method1854() {
		aClass1_Sub1_Sub12_Sub3_Sub1_6 = null;
		aClass60_8 = null;
	}
}
