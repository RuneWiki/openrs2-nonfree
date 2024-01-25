import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_25 = new Class198(500);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public static int anInt3147 = 0;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!da;Lclient!tj;ZI[Lclient!ao;I)V")
	public static void method2567(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13[] arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(30) int local30;
		if (!arg2) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static162.anInt2152; local9++) {
					for (local13 = 0; local13 < Static122.anInt2632; local13++) {
						if ((Static160.aByteArrayArrayArray9[local5][local9][local13] & 0x1) != 0) {
							local30 = local5;
							if ((Static160.aByteArrayArrayArray9[1][local9][local13] & 0x2) != 0) {
								local30 = local5 - 1;
							}
							if (local30 >= 0) {
								arg4[local30].method247(local13, local9);
							}
						}
					}
				}
			}
		}
		@Pc(77) int[][] local77 = new int[Static162.anInt2152][Static122.anInt2632];
		for (local9 = 0; local9 < arg3; local9++) {
			for (local13 = 0; local13 < Static122.anInt2632; local13++) {
				Static302.anIntArray487[local13] = 0;
				Static322.anIntArray522[local13] = 0;
				Static226.anIntArray375[local13] = 0;
				Static297.anIntArray483[local13] = 0;
				Static16.anIntArray16[local13] = 0;
			}
			for (local30 = -5; local30 < Static162.anInt2152; local30++) {
				@Pc(125) int local125;
				@Pc(142) int local142;
				@Pc(208) int local208;
				for (@Pc(119) int local119 = 0; local119 < Static122.anInt2632; local119++) {
					local125 = local30 + 5;
					@Pc(186) int local186;
					if (local125 < Static162.anInt2152) {
						local142 = Static147.aByteArrayArrayArray8[local9][local125][local119] & 0xFF;
						if (local142 > 0) {
							@Pc(150) Class155 local150 = Static106.method1817(local142 - 1);
							Static302.anIntArray487[local119] += local150.anInt4706;
							Static322.anIntArray522[local119] += local150.anInt4708;
							Static226.anIntArray375[local119] += local150.anInt4707;
							Static297.anIntArray483[local119] += local150.anInt4696;
							local186 = Static16.anIntArray16[local119]++;
						}
					}
					local142 = local30 - 5;
					if (local142 >= 0) {
						local208 = Static147.aByteArrayArrayArray8[local9][local142][local119] & 0xFF;
						if (local208 > 0) {
							@Pc(216) Class155 local216 = Static106.method1817(local208 - 1);
							Static302.anIntArray487[local119] -= local216.anInt4706;
							Static322.anIntArray522[local119] -= local216.anInt4708;
							Static226.anIntArray375[local119] -= local216.anInt4707;
							Static297.anIntArray483[local119] -= local216.anInt4696;
							local186 = Static16.anIntArray16[local119]--;
						}
					}
				}
				if (local30 >= 0) {
					local125 = 0;
					local142 = 0;
					local208 = 0;
					@Pc(273) int local273 = 0;
					@Pc(275) int local275 = 0;
					for (@Pc(277) int local277 = -5; local277 < Static122.anInt2632; local277++) {
						@Pc(283) int local283 = local277 + 5;
						if (local283 < Static122.anInt2632) {
							local125 += Static302.anIntArray487[local283];
							local273 += Static297.anIntArray483[local283];
							local275 += Static16.anIntArray16[local283];
							local208 += Static226.anIntArray375[local283];
							local142 += Static322.anIntArray522[local283];
						}
						@Pc(320) int local320 = local277 - 5;
						if (local320 >= 0) {
							local208 -= Static226.anIntArray375[local320];
							local142 -= Static322.anIntArray522[local320];
							local273 -= Static297.anIntArray483[local320];
							local275 -= Static16.anIntArray16[local320];
							local125 -= Static302.anIntArray487[local320];
						}
						if (local277 >= 0 && local273 > 0 && local275 > 0) {
							local77[local30][local277] = Static111.method1930(local125 * 256 / local273, local142 / local275, local208 / local275);
						}
					}
				}
			}
			Static61.method1004(local77, Static176.aByteArrayArrayArray13[local9], Static155.aByteArrayArrayArray3[local9], Static122.anInt2632, arg0, Static245.aByteArrayArrayArray12[local9], local9, arg2, Static162.anInt2152, arg1, Static69.aClass22Array1[local9], Static147.aByteArrayArrayArray8[local9]);
			Static147.aByteArrayArrayArray8[local9] = null;
			Static245.aByteArrayArrayArray12[local9] = null;
			Static155.aByteArrayArrayArray3[local9] = null;
			Static176.aByteArrayArrayArray13[local9] = null;
		}
		if (!arg2) {
			if (Static118.aBoolean141) {
				Static254.method4266();
			}
			if (Static77.anInt1520 != 0) {
				Static269.method4563();
			}
		}
		for (local13 = 0; local13 < arg3; local13++) {
			Static69.aClass22Array1[local13].method4679();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZZILclient!md;I)V")
	public static void method2570(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class131 arg3, @OriginalArg(5) int arg4) {
		if (Static186.anInt3102 >= 50 || (arg3 == null || arg3.anIntArrayArray34 == null || arg0 >= arg3.anIntArrayArray34.length || arg3.anIntArrayArray34[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg3.anIntArrayArray34[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg3.anIntArrayArray34[arg0].length > 1) {
			local65 = (int) ((double) arg3.anIntArrayArray34[arg0].length * Math.random());
			if (local65 > 0) {
				local40 = arg3.anIntArrayArray34[arg0][local65];
			}
		}
		@Pc(78) int local78 = local36 & 0x1F;
		if (local78 == 0) {
			if (arg1) {
				Static157.method2489(255, local40, local46, 0);
			}
		} else if (Static260.anInt5195 != 0) {
			Static37.anIntArray538[Static186.anInt3102] = local40;
			Static244.anIntArray393[Static186.anInt3102] = local46;
			Static109.anIntArray136[Static186.anInt3102] = 0;
			Static334.aClass143Array1[Static186.anInt3102] = null;
			Static230.anIntArray548[Static186.anInt3102] = 255;
			local65 = (arg4 - 64) / 128;
			@Pc(130) int local130 = (arg2 - 64) / 128;
			Static251.anIntArray406[Static186.anInt3102] = (local65 << 16) + (local130 << 8) + local78;
			Static186.anInt3102++;
		}
	}
}
