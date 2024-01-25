import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt2653;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_104 = new Class182("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
	public static void method2266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static81.anInt1731 == 1) {
			Static437.method5688(Static60.aClass10_Sub45_3, arg1, arg0);
		} else if (Static81.anInt1731 == 2) {
			Static398.method5278(arg0, arg1);
		}
		Static60.aClass10_Sub45_3 = null;
		Static81.anInt1731 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!za;IILclient!gh;I)V")
	public static void method2273(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class49 local10 = arg2.method2292(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ba(arg3, arg1, arg2.anInt2703 + arg3, arg2.anInt2682 + arg1);
		if (Static166.anInt3290 == 2 || Static166.anInt3290 == 5 || Static162.aClass80_7 == null) {
			arg0.ra(-16777216, local10, arg3, arg1);
			return;
		}
		@Pc(62) int local62;
		@Pc(54) int local54;
		@Pc(60) int local60;
		@Pc(64) int local64;
		if (Static157.anInt3176 == 4) {
			local54 = Static131.anInt2737;
			local60 = (int) -Static149.aFloat53 & 0x3FFF;
			local62 = Static187.anInt3752;
			local64 = 4096;
		} else {
			local54 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
			local62 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
			local60 = (int) -Static149.aFloat53 + Static419.anInt7040 & 0x3FFF;
			local64 = 4096 - Static394.anInt6667 * 16;
		}
		@Pc(99) int local99 = local62 / 32 + 48 - (Static2.anInt7 + -104) * 2;
		@Pc(116) int local116 = Static17.anInt315 * 4 + 48 + 208 - local54 / 32 - Static17.anInt315 * 2;
		Static162.aClass80_7.method5553((float) arg2.anInt2703 / 2.0F + (float) arg3, (float) arg2.anInt2682 / 2.0F + (float) arg1, (float) local99, (float) local116, local64, local60 << 2, local10, arg3, arg1);
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(198) int local198;
		for (@Pc(150) Class10_Sub12 local150 = (Class10_Sub12) Static70.aClass163_14.method3620(); local150 != null; local150 = (Class10_Sub12) Static70.aClass163_14.method3621()) {
			@Pc(155) int local155 = local150.anInt1159;
			local166 = (Static33.aClass125_5.anIntArray379[local155] >> 14 & 0x3FFF) - Static168.anInt3353;
			local176 = (Static33.aClass125_5.anIntArray379[local155] & 0x3FFF) - Static72.anInt1488;
			local187 = local166 * 4 + 2 - local62 / 32;
			local198 = local176 * 4 + 2 - local54 / 32;
			Static305.method4246(local198, arg3, arg1, local187, local10, arg0, arg2, Static33.aClass125_5.anIntArray378[local155]);
		}
		for (local166 = 0; local166 < Static328.anInt7217; local166++) {
			local176 = Static219.anIntArray412[local166] * 4 + 2 - local62 / 32;
			local187 = Static307.anIntArray514[local166] * 4 + 2 - local54 / 32;
			@Pc(254) Class126 local254 = Static342.aClass237_4.method5212(Static47.anIntArray69[local166]);
			if (local254.anIntArray380 != null) {
				local254 = local254.method3009(Static329.aClass201_9);
				if (local254 == null || local254.anInt3792 == -1) {
					continue;
				}
			}
			Static305.method4246(local187, arg3, arg1, local176, local10, arg0, arg2, local254.anInt3792);
		}
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(290) Class10_Sub14 local290 = (Class10_Sub14) Static293.aClass167_21.method3702(); local290 != null; local290 = (Class10_Sub14) Static293.aClass167_21.method3708()) {
			local187 = (int) (local290.aLong264 >> 28 & 0x3L);
			if (local187 == Static319.anInt5487) {
				local198 = (int) (local290.aLong264 & 0x3FFFL) - Static168.anInt3353;
				@Pc(322) int local322 = (int) (local290.aLong264 >> 14 & 0x3FFFL) - Static72.anInt1488;
				local333 = local198 * 4 + 2 - local62 / 32;
				local343 = local322 * 4 + 2 - local54 / 32;
				Static201.method3168(arg2, arg1, arg3, local343, local333, Static76.aClass80Array5[0], local10);
			}
		}
		@Pc(434) int local434;
		for (local187 = 0; local187 < Static219.anInt4155; local187++) {
			@Pc(374) Class10_Sub26 local374 = (Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local187]);
			if (local374 != null) {
				@Pc(379) Class24_Sub3_Sub2_Sub1 local379 = local374.aClass24_Sub3_Sub2_Sub1_2;
				if (local379.method2890() && local379.aByte98 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) {
					@Pc(395) Class222 local395 = local379.aClass222_1;
					if (local395 != null && local395.anIntArray613 != null) {
						local395 = local395.method4938(Static329.aClass201_9);
					}
					if (local395 != null && local395.aBoolean412 && local395.aBoolean415) {
						local343 = local379.anInt7092 / 32 - local62 / 32;
						local434 = local379.anInt7094 / 32 - local54 / 32;
						if (local395.anInt6339 == -1) {
							Static201.method3168(arg2, arg1, arg3, local434, local343, Static76.aClass80Array5[1], local10);
						} else {
							Static305.method4246(local434, arg3, arg1, local343, local10, arg0, arg2, local395.anInt6339);
						}
					}
				}
			}
		}
		local198 = Static270.anInt4754;
		@Pc(473) int[] local473 = Static53.anIntArray79;
		@Pc(517) int local517;
		@Pc(521) int local521;
		@Pc(553) int local553;
		for (local333 = 0; local333 < local198; local333++) {
			@Pc(483) Class24_Sub3_Sub2_Sub2 local483 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local473[local333]];
			if (local483 != null && local483.method4924() && local483 != Static263.aClass24_Sub3_Sub2_Sub2_4 && local483.aByte98 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) {
				local434 = local483.anInt7092 / 32 - local62 / 32;
				local517 = local483.anInt7094 / 32 - local54 / 32;
				@Pc(519) boolean local519 = false;
				for (local521 = 0; local521 < Static60.anInt7169; local521++) {
					if (local483.aString58.equals(Static325.aStringArray36[local521]) && Static9.anIntArray8[local521] != 0) {
						local519 = true;
						break;
					}
				}
				@Pc(551) boolean local551 = false;
				for (local553 = 0; local553 < Static207.anInt4058; local553++) {
					if (local483.aString58.equals(Static247.aClass113Array1[local553].aString23)) {
						local551 = true;
						break;
					}
				}
				@Pc(573) boolean local573 = false;
				if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6327 != 0 && local483.anInt6327 != 0 && Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6327 == local483.anInt6327) {
					local573 = true;
				}
				if (local483.aBoolean408) {
					Static201.method3168(arg2, arg1, arg3, local517, local434, Static76.aClass80Array5[6], local10);
				} else if (local519) {
					Static201.method3168(arg2, arg1, arg3, local517, local434, Static76.aClass80Array5[3], local10);
				} else if (local551) {
					Static201.method3168(arg2, arg1, arg3, local517, local434, Static76.aClass80Array5[5], local10);
				} else if (local573) {
					Static201.method3168(arg2, arg1, arg3, local517, local434, Static76.aClass80Array5[4], local10);
				} else {
					Static201.method3168(arg2, arg1, arg3, local517, local434, Static76.aClass80Array5[2], local10);
				}
			}
		}
		@Pc(674) Class65[] local674 = Static362.aClass65Array1;
		@Pc(757) int local757;
		for (local434 = 0; local434 < local674.length; local434++) {
			@Pc(682) Class65 local682 = local674[local434];
			if (local682 != null && local682.anInt1850 != 0 && Static400.anInt6752 % 20 < 10) {
				@Pc(720) int local720;
				if (local682.anInt1850 == 1) {
					@Pc(706) Class10_Sub26 local706 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local682.anInt1856);
					if (local706 != null) {
						@Pc(711) Class24_Sub3_Sub2_Sub1 local711 = local706.aClass24_Sub3_Sub2_Sub1_2;
						local720 = local711.anInt7092 / 32 - local62 / 32;
						local553 = local711.anInt7094 / 32 - local54 / 32;
						Static59.method1020(360000L, arg3, arg2, local682.anInt1854, local10, arg1, local720, local553);
					}
				}
				if (local682.anInt1850 == 2) {
					local757 = local682.anInt1855 / 32 - local62 / 32;
					local521 = local682.anInt1860 / 32 - local54 / 32;
					@Pc(773) long local773 = (long) (local682.anInt1852 << 5);
					@Pc(777) long local777 = local773 * local773;
					Static59.method1020(local777, arg3, arg2, local682.anInt1854, local10, arg1, local757, local521);
				}
				if (local682.anInt1850 == 10 && local682.anInt1856 >= 0 && Static360.aClass24_Sub3_Sub2_Sub2Array1.length > local682.anInt1856) {
					@Pc(809) Class24_Sub3_Sub2_Sub2 local809 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local682.anInt1856];
					if (local809 != null) {
						local521 = local809.anInt7092 / 32 - local62 / 32;
						local720 = local809.anInt7094 / 32 - local54 / 32;
						Static59.method1020(360000L, arg3, arg2, local682.anInt1854, local10, arg1, local521, local720);
					}
				}
			}
		}
		if (Static157.anInt3176 == 4) {
			return;
		}
		if (Static297.anInt5146 != 0) {
			local517 = Static297.anInt5146 * 4 + (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() + -1) * 2 + 2 - local62 / 32;
			local757 = Static457.anInt7597 * 4 + Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() * 2 + 2 - local54 / 32 - 2;
			Static201.method3168(arg2, arg1, arg3, local757, local517, Static245.aClass80Array11[Static336.aBoolean367 ? 1 : 0], local10);
		}
		arg0.method5853(arg2.anInt2682 / 2 + arg1 - 1, arg3 + -1 - -(arg2.anInt2703 / 2), -1, 3, 3);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method2274() {
		if (Static95.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static399.anInt6748;
		@Pc(15) int local15 = Static350.anInt5988;
		@Pc(23) int local23 = Static370.anInt6388 - local8 - Static90.anInt1891;
		@Pc(30) int local30 = Static299.anInt4635 - local15 - Static340.anInt5756;
		if (local8 <= 0 && local23 <= 0 && local15 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static451.aFrame2 == null) {
				local48 = Static171.aClass159_1.anApplet1;
			} else {
				local48 = Static451.aFrame2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (local48 == Static451.aFrame2) {
				@Pc(63) Insets local63 = Static451.aFrame2.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local48.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static299.anInt4635);
			}
			if (local15 > 0) {
				local72.fillRect(local55, local57, Static370.anInt6388, local15);
			}
			if (local23 > 0) {
				local72.fillRect(Static370.anInt6388 + local55 - local23, local57, local23, Static299.anInt4635);
			}
			if (local30 > 0) {
				local72.fillRect(local55, Static299.anInt4635 + local57 - local30, Static370.anInt6388, local30);
				return;
			}
		} catch (@Pc(121) Exception local121) {
			return;
		}
	}
}
