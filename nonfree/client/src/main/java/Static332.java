import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "Lclient!mo;")
	public static Class143 aClass143_111;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
	public static int anInt6436;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "[I")
	public static final int[] anIntArray613 = new int[50];

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
	public static void method5724() {
		@Pc(1) Class11 local1 = Static238.aClass11_102;
		synchronized (Static238.aClass11_102) {
			Static238.aClass11_102.method214();
		}
		local1 = Static20.aClass11_13;
		synchronized (Static20.aClass11_13) {
			Static20.aClass11_13.method214();
		}
		local1 = Static38.aClass11_20;
		synchronized (Static38.aClass11_20) {
			Static38.aClass11_20.method214();
		}
		local1 = Static292.aClass11_128;
		synchronized (Static292.aClass11_128) {
			Static292.aClass11_128.method214();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ne;Lclient!e;IIB)V")
	public static void method5725(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class156 local12 = arg0.method3798(arg1);
		if (local12 == null) {
			return;
		}
		arg1.method5172(arg3, arg2, arg0.anInt4133 + arg3, arg0.anInt4199 + arg2);
		if (Static7.anInt191 == 2 || Static7.anInt191 == 5 || Static254.aClass2_18 == null) {
			arg1.method5165(local12, arg3, arg2);
			return;
		}
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(60) int local60;
		@Pc(54) int local54;
		if (Static205.anInt4115 == 4) {
			local50 = Static41.anInt982;
			local52 = Static141.anInt2992;
			local54 = 4096;
			local60 = (int) -Static94.aFloat42 & 0x3FFF;
		} else {
			local54 = 4096 - Static309.anInt5886 * 16;
			local52 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908;
			local50 = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910;
			local60 = (int) -Static94.aFloat42 + Static8.anInt205 & 0x3FFF;
		}
		@Pc(95) int local95 = local50 / 32 + 48 - (Static195.anInt3965 + -104) * 2;
		@Pc(113) int local113 = Static298.anInt5716 * 4 + 208 + 48 - Static298.anInt5716 * 2 - local52 / 32;
		Static254.aClass2_18.method2631((float) arg3 + (float) arg0.anInt4133 / 2.0F, (float) arg0.anInt4199 / 2.0F + (float) arg2, (float) local95, (float) local113, local54, local60 << 2, local12, arg3, arg2);
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(147) Class14_Sub34 local147 = (Class14_Sub34) Static326.aClass18_43.method459(); local147 != null; local147 = (Class14_Sub34) Static326.aClass18_43.method453()) {
			@Pc(152) int local152 = local147.anInt6039;
			local164 = (Static112.aClass163_1.anIntArray429[local152] >> 14 & 0x3FFF) - Static151.anInt3234;
			local174 = (Static112.aClass163_1.anIntArray429[local152] & 0x3FFF) - Static251.anInt3170;
			local185 = local164 * 4 + 2 - local50 / 32;
			local196 = local174 * 4 + 2 - local52 / 32;
			Static79.method1958(local185, arg3, arg1, arg0, local196, arg2, local12, Static112.aClass163_1.anIntArray428[local152]);
		}
		for (local164 = 0; local164 < Static3.anInt111; local164++) {
			local174 = Static84.anIntArray189[local164] * 4 + 2 - local50 / 32;
			local185 = Static31.anIntArray47[local164] * 4 + 2 - local52 / 32;
			@Pc(251) Class59 local251 = Static232.method2200(Static74.anIntArray483[local164]);
			if (local251.anIntArray176 != null) {
				local251 = local251.method1977();
				if (local251 == null || local251.anInt1944 == -1) {
					continue;
				}
			}
			Static79.method1958(local174, arg3, arg1, arg0, local185, arg2, local12, local251.anInt1944);
		}
		for (@Pc(290) Class14_Sub39 local290 = (Class14_Sub39) Static65.aClass25_32.method697(); local290 != null; local290 = (Class14_Sub39) Static65.aClass25_32.method694()) {
			local185 = (int) (local290.aLong217 >> 28 & 0x3L);
			if (Static223.anInt5825 == local185) {
				local196 = (int) (local290.aLong217 & 0x3FFFL) * 4 + 2 - local50 / 32;
				@Pc(334) int local334 = (int) (local290.aLong217 >> 14 & 0x3FFFL) * 4 + 2 - local52 / 32;
				Static317.method5477(arg2, local196, arg3, local12, arg0, Static94.aClass2Array6[0], local334);
			}
		}
		@Pc(398) int local398;
		@Pc(407) int local407;
		for (local185 = 0; local185 < Static315.anInt6456; local185++) {
			@Pc(362) Class10_Sub3_Sub3_Sub1 local362 = Static266.aClass10_Sub3_Sub3_Sub1Array1[Static98.anIntArray205[local185]];
			if (local362 != null && local362.method4960()) {
				@Pc(371) Class192 local371 = local362.aClass192_1;
				if (local371 != null && local371.anIntArray525 != null) {
					local371 = local371.method5281();
				}
				if (local371 != null && local371.aBoolean402 && local371.aBoolean403) {
					local398 = local362.anInt5910 / 32 - local50 / 32;
					local407 = local362.anInt5908 / 32 - local52 / 32;
					if (local371.anInt5800 == -1) {
						Static317.method5477(arg2, local398, arg3, local12, arg0, Static94.aClass2Array6[1], local407);
					} else {
						Static79.method1958(local398, arg3, arg1, arg0, local407, arg2, local12, local371.anInt5800);
					}
				}
			}
		}
		@Pc(479) int local479;
		for (local196 = 0; local196 < Static307.anInt2887; local196++) {
			@Pc(449) Class10_Sub3_Sub3_Sub2 local449 = Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local196]];
			if (local449 != null && local449.method5376()) {
				local398 = local449.anInt5910 / 32 - local50 / 32;
				local407 = local449.anInt5908 / 32 - local52 / 32;
				@Pc(477) boolean local477 = false;
				for (local479 = 0; local479 < Static302.anInt5838; local479++) {
					if (local449.aString224.equals(Static120.aStringArray36[local479]) && Static54.anIntArray81[local479] != 0) {
						local477 = true;
						break;
					}
				}
				@Pc(505) boolean local505 = false;
				for (@Pc(507) int local507 = 0; local507 < Static249.anInt4819; local507++) {
					if (local449.aString224.equals(Static198.aClass195Array1[local507].aString221)) {
						local505 = true;
						break;
					}
				}
				@Pc(531) boolean local531 = false;
				if (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5992 != 0 && local449.anInt5992 != 0 && local449.anInt5992 == Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5992) {
					local531 = true;
				}
				if (local477) {
					Static317.method5477(arg2, local398, arg3, local12, arg0, Static94.aClass2Array6[3], local407);
				} else if (local505) {
					Static317.method5477(arg2, local398, arg3, local12, arg0, Static94.aClass2Array6[5], local407);
				} else if (local531) {
					Static317.method5477(arg2, local398, arg3, local12, arg0, Static94.aClass2Array6[4], local407);
				} else {
					Static317.method5477(arg2, local398, arg3, local12, arg0, Static94.aClass2Array6[2], local407);
				}
			}
		}
		@Pc(609) Class113[] local609 = Static27.aClass113Array1;
		@Pc(704) int local704;
		for (local398 = 0; local398 < local609.length; local398++) {
			@Pc(617) Class113 local617 = local609[local398];
			if (local617 != null && local617.anInt3406 != 0 && Static153.anInt3257 % 20 < 10) {
				@Pc(675) int local675;
				if (local617.anInt3406 == 1 && local617.anInt3403 >= 0 && Static266.aClass10_Sub3_Sub3_Sub1Array1.length > local617.anInt3403) {
					@Pc(654) Class10_Sub3_Sub3_Sub1 local654 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local617.anInt3403];
					if (local654 != null) {
						local479 = local654.anInt5910 / 32 - local50 / 32;
						local675 = local654.anInt5908 / 32 - local52 / 32;
						Static338.method5825(arg2, arg3, local617.anInt3414, arg0, local479, local675, local12, 360000);
					}
				}
				if (local617.anInt3406 == 2) {
					local704 = (local617.anInt3408 - Static151.anInt3234) * 4 + 2 - local50 / 32;
					local479 = (-Static251.anInt3170 + local617.anInt3413) * 4 + 2 - local52 / 32;
					local675 = local617.anInt3407 * 4;
					local675 *= local675;
					Static338.method5825(arg2, arg3, local617.anInt3414, arg0, local704, local479, local12, local675);
				}
				if (local617.anInt3406 == 10 && local617.anInt3403 >= 0 && Static29.aClass10_Sub3_Sub3_Sub2Array3.length > local617.anInt3403) {
					@Pc(758) Class10_Sub3_Sub3_Sub2 local758 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local617.anInt3403];
					if (local758 != null) {
						local479 = local758.anInt5910 / 32 - local50 / 32;
						local675 = local758.anInt5908 / 32 - local52 / 32;
						Static338.method5825(arg2, arg3, local617.anInt3414, arg0, local479, local675, local12, 360000);
					}
				}
			}
		}
		if (Static205.anInt4115 == 4) {
			return;
		}
		if (Static140.anInt2984 != 0) {
			local407 = Static140.anInt2984 * 4 + (Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() + -1) * 2 + 2 - local50 / 32;
			local704 = Static213.anInt4250 * 4 + (Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() - 1) * 2 + 2 - local52 / 32;
			Static317.method5477(arg2, local407, arg3, local12, arg0, Static38.aClass2Array5[Static276.aBoolean348 ? 1 : 0], local704);
		}
		arg1.method5108(3, arg0.anInt4133 / 2 + arg3 - 1, 3, -1, arg0.anInt4199 / 2 + arg2 - 1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	public static int method5726(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[B")
	public static byte[] method5728(@OriginalArg(1) int arg0) {
		@Pc(12) Class14_Sub2_Sub21 local12 = (Class14_Sub2_Sub21) Static164.aClass178_7.method4772((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static193.method3664(local31, local53);
				@Pc(62) byte local62 = local25[local58];
				local25[local58] = local25[local53];
				local25[local53] = local25[511 - local46] = local62;
			}
			local12 = new Class14_Sub2_Sub21(local25);
			Static164.aClass178_7.method4767(local12, (long) arg0);
		}
		return local12.aByteArray175;
	}
}
