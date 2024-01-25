import java.awt.Canvas;
import java.lang.reflect.Constructor;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array4;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[200];

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "[Lclient!qi;")
	public static final Class170[] aClass170Array2 = new Class170[14];

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V")
	public static void method977() {
		if (Static18.aFloat7 < 1024.0F) {
			Static18.aFloat7 = 1024.0F;
		}
		if (Static18.aFloat7 > 3072.0F) {
			Static18.aFloat7 = 3072.0F;
		}
		while (Static351.aFloat80 >= 16384.0F) {
			Static351.aFloat80 -= 16384.0F;
		}
		while (Static351.aFloat80 < 0.0F) {
			Static351.aFloat80 += 16384.0F;
		}
		@Pc(37) int local37 = Static98.anInt1131 >> 7;
		@Pc(41) int local41 = Static319.anInt6099 >> 7;
		@Pc(49) int local49 = Static341.method5540(Static168.anInt3508, Static319.anInt6099, Static98.anInt1131);
		@Pc(55) int local55 = 0;
		@Pc(77) int local77;
		if (local37 > 3 && local41 > 3 && local37 < 100 && local41 < 100) {
			for (local77 = local37 - 4; local77 <= local37 + 4; local77++) {
				for (@Pc(82) int local82 = local41 - 4; local82 <= local41 + 4; local82++) {
					@Pc(85) int local85 = Static168.anInt3508;
					if (local85 < 3 && Static150.method1571(local82, local77)) {
						local85++;
					}
					@Pc(98) int local98 = 0;
					if (Static222.aByteArrayArrayArray10 != null && Static222.aByteArrayArrayArray10[local85] != null) {
						local98 = (Static222.aByteArrayArrayArray10[local85][local77][local82] & 0xFF) * 8;
					}
					@Pc(128) int local128 = local49 + local98 - Static331.aClass8Array5[local85].method4173(local77, local82);
					if (local128 > local55) {
						local55 = local128;
					}
				}
			}
		}
		local77 = local55 * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (Static263.anInt5176 < local77) {
			Static263.anInt5176 += (local77 - Static263.anInt5176) / 24;
		} else if (Static263.anInt5176 > local77) {
			Static263.anInt5176 += (local77 - Static263.anInt5176) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIZ)V")
	public static void method979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static229.aClass49ArrayArrayArray6 == null) {
			Static128.aClass89_3.method5477(arg2, arg0, arg1, arg3, -16777216);
			return;
		}
		Static233.anInt4634++;
		if (Static252.aClass22_Sub2_Sub1_Sub1_4 != null && Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 - (Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() - 1) * 64 >> 7 == Static35.anInt1025 && Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 + 64 - Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() * 64 >> 7 == Static259.anInt5013) {
			Static35.anInt1025 = -1;
			Static259.anInt5013 = -1;
			Static118.method5348();
		}
		Static279.method5649();
		if (!arg4) {
			Static269.method4492();
		}
		Static56.method1168();
		Static216.method3822(arg1, true, arg0, arg3, arg2);
		@Pc(77) int local77 = Static59.anInt1509;
		@Pc(79) int local79 = Static147.anInt3208;
		@Pc(81) int local81 = Static233.anInt4636;
		@Pc(83) int local83 = Static243.anInt4798;
		@Pc(89) int local89;
		@Pc(127) int local127;
		if (Static118.anInt6324 == 1) {
			local89 = (int) Static18.aFloat7;
			if (Static263.anInt5176 >> 8 > local89) {
				local89 = Static263.anInt5176 >> 8;
			}
			if (Static341.aBooleanArray31[4] && local89 < Static114.anIntArray348[4] + 128) {
				local89 = Static114.anIntArray348[4] + 128;
			}
			local127 = (int) Static351.aFloat80 + Static91.anInt5969 & 0x3FFF;
			Static184.method3387(local89, (local89 >> 3) * 3 + 600, local127, local77, Static98.anInt1131, Static341.method5540(Static168.anInt3508, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973) - 50, Static319.anInt6099);
		} else if (Static118.anInt6324 == 4) {
			local89 = (int) Static18.aFloat7;
			if (Static263.anInt5176 >> 8 > local89) {
				local89 = Static263.anInt5176 >> 8;
			}
			if (Static341.aBooleanArray31[4] && local89 < Static114.anIntArray348[4] + 128) {
				local89 = Static114.anIntArray348[4] + 128;
			}
			local127 = (int) Static351.aFloat80 & 0x3FFF;
			Static184.method3387(local89, (local89 >> 3) * 3 + 600, local127, local77, Static98.anInt1131, Static341.method5540(Static168.anInt3508, Static318.anInt611, Static74.anInt1848) - 50, Static319.anInt6099);
		} else if (Static118.anInt6324 == 5) {
			Static193.method3467(local77);
		}
		local89 = Static203.anInt4014;
		local127 = Static271.anInt5361;
		@Pc(230) int local230 = Static24.anInt478;
		@Pc(232) int local232 = Static179.anInt3660;
		@Pc(234) int local234 = Static138.anInt3022;
		@Pc(276) int local276;
		for (@Pc(236) int local236 = 0; local236 < 5; local236++) {
			if (Static341.aBooleanArray31[local236]) {
				local276 = (int) (Math.random() * (double) (Static131.anIntArray379[local236] * 2 + 1) - (double) Static131.anIntArray379[local236] + Math.sin((double) Static14.anIntArray35[local236] * ((double) Static274.anIntArray693[local236] / 100.0D)) * (double) Static114.anIntArray348[local236]);
				if (local236 == 3) {
					Static138.anInt3022 = Static138.anInt3022 + local276 & 0x3FFF;
				}
				if (local236 == 4) {
					Static179.anInt3660 += local276;
					if (Static179.anInt3660 < 1024) {
						Static179.anInt3660 = 1024;
					} else if (Static179.anInt3660 > 3072) {
						Static179.anInt3660 = 3072;
					}
				}
				if (local236 == 0) {
					Static203.anInt4014 += local276;
				}
				if (local236 == 1) {
					Static271.anInt5361 += local276;
				}
				if (local236 == 2) {
					Static24.anInt478 += local276;
				}
			}
		}
		if (Static203.anInt4014 < 0) {
			Static203.anInt4014 = 0;
		}
		if (Static203.anInt4014 > (Static346.anInt6536 << 7) - 1) {
			Static203.anInt4014 = (Static346.anInt6536 << 7) - 1;
		}
		if (Static24.anInt478 < 0) {
			Static24.anInt478 = 0;
		}
		if (Static24.anInt478 > (Static174.anInt3604 << 7) - 1) {
			Static24.anInt478 = (Static174.anInt3604 << 7) - 1;
		}
		Static337.method5370();
		Static212.method3771();
		Static128.aClass89_3.method5431(local83, local79, local83 + local81, local79 + local77);
		Static128.aClass89_3.method5480();
		local276 = Static316.anInt6073;
		if (Static62.aClass46_1 == null) {
			Static128.aClass89_3.method5405(local276);
		} else {
			Static62.aClass46_1.method1117(Static179.anInt3660, local79, local77, Static263.anInt5170 << 3, local276, local81, local83, Static138.anInt3022, Static128.aClass89_3);
		}
		Static263.method4429();
		Static91.aClass70_12.method3717(Static203.anInt4014, Static271.anInt5361, Static24.anInt478, -Static179.anInt3660 & 0x3FFF, -Static138.anInt3022 & 0x3FFF, -Static292.anInt5691 & 0x3FFF);
		Static128.aClass89_3.method5467(Static91.aClass70_12);
		Static128.aClass89_3.method5416(local81 / 2 + local83, local77 / 2 + local79, Static301.anInt5784 << 1, Static301.anInt5784 << 1);
		Static304.method4919(local79 + local77 / 2, local81 / 2 + local83, Static301.anInt5784 << 1, Static301.anInt5784 << 1);
		Static183.method3350(-Static179.anInt3660 & 0x3FFF, Static203.anInt4014, -Static292.anInt5691 & 0x3FFF, Static24.anInt478, -Static138.anInt3022 & 0x3FFF, Static271.anInt5361);
		@Pc(507) byte local507 = Static118.method5346() == 2 ? (byte) Static233.anInt4634 : 1;
		Static98.method929(Static128.aClass89_3, Static212.anInt4234, Static55.anInt1454, Static91.aClass70_12, Static203.anInt4014, Static271.anInt5361, Static24.anInt478, Static301.aByteArrayArrayArray11, Static88.anIntArray550, Static168.anIntArray473, Static272.anIntArray689, Static273.anIntArray692, Static346.anIntArray831, Static168.anInt3508 + 1, local507, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7, !Static308.aBoolean431);
		Static263.method4429();
		if (Static85.anInt2215 == 30) {
			Static177.method3286(local83, local79, local81, local77);
			Static139.method2809(local79, local81, local77, local83);
			Static2.method16(local81, local79, local83, local77);
			Static75.method1503(local79, local77, local81, local83);
		}
		Static189.method3445();
		Static138.anInt3022 = local234;
		Static203.anInt4014 = local89;
		Static24.anInt478 = local230;
		Static179.anInt3660 = local232;
		Static271.anInt5361 = local127;
		if (Static138.aBoolean227 && Static229.aClass160_3.method4111() == 0) {
			Static138.aBoolean227 = false;
		}
		if (Static138.aBoolean227) {
			Static128.aClass89_3.method5477(local79, local83, local77, local81, -16777216);
			Static227.method5321(Static341.aClass94_32, Static35.aString79, false);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lclient!be;")
	public static Class22_Sub1 method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null || local7.aClass22_Sub1_1 == null ? null : local7.aClass22_Sub1_1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!pg;ILjava/awt/Canvas;ZLclient!bd;I)Lclient!pe;")
	public static Class89 method982(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class21 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class89_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, pg.class, Integer.TYPE, Integer.TYPE, bd.class);
			return (Class89) local57.newInstance(arg2, arg0, Integer.valueOf(arg4), new Integer(arg1), arg3);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!r;I)I")
	public static int method984(@OriginalArg(0) Class7_Sub32 arg0) {
		@Pc(7) String local7 = Static24.method422(arg0);
		@Pc(9) int[] local9 = null;
		if (Static342.method5546(arg0.anInt5229)) {
			local9 = Static17.method4472((int) arg0.aLong169).anIntArray552;
		} else if (Static259.method4349(arg0.anInt5229)) {
			@Pc(35) Class22_Sub2_Sub1_Sub2 local35 = Static69.aClass22_Sub2_Sub1_Sub2Array1[(int) arg0.aLong169];
			if (local35 != null) {
				local9 = local35.aClass174_1.anIntArray669;
			}
		} else if (Static43.method933(arg0.anInt5229)) {
			if (arg0.anInt5229 == 1009) {
				local9 = Static245.method4227((int) arg0.aLong169).anIntArray480;
			} else {
				local9 = Static245.method4227((int) (arg0.aLong169 >>> 32 & 0x7FFFFFFFL)).anIntArray480;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static132.method2666(local9);
		}
		return Static175.aClass208_3.method5383(Static214.aClass52Array12, local7);
	}
}
