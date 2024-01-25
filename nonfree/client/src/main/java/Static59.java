import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!ur;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(JILclient!gh;IILclient!ta;III)V")
	public static void method1020(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg7 * arg7 + arg6 * arg6;
		if ((long) local15 > arg0) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg2.anInt2703 / 2, arg2.anInt2682 / 2);
		if (local15 <= local35 * local35) {
			Static201.method3168(arg2, arg5, arg1, arg7, arg6, Static423.aClass80Array20[arg3], arg4);
			return;
		}
		local35 -= 10;
		@Pc(52) int local52;
		if (Static157.anInt3176 == 4) {
			local52 = (int) Static149.aFloat53 & 0x3FFF;
		} else {
			local52 = (int) Static149.aFloat53 + Static419.anInt7040 & 0x3FFF;
		}
		@Pc(63) int local63 = Class250.anIntArray675[local52];
		@Pc(67) int local67 = Class250.anIntArray674[local52];
		if (Static157.anInt3176 != 4) {
			local67 = local67 * 256 / (Static394.anInt6667 + 256);
			local63 = local63 * 256 / (Static394.anInt6667 + 256);
		}
		@Pc(98) int local98 = arg6 * local67 + local63 * arg7 >> 15;
		@Pc(109) int local109 = arg7 * local67 - local63 * arg6 >> 15;
		@Pc(115) double local115 = Math.atan2((double) local98, (double) local109);
		@Pc(122) int local122 = (int) ((double) local35 * Math.sin(local115));
		@Pc(129) int local129 = (int) (Math.cos(local115) * (double) local35);
		Static33.aClass80Array19[arg3].method5561((float) local122 + (float) arg1 + (float) arg2.anInt2703 / 2.0F, (float) arg5 + (float) arg2.anInt2682 / 2.0F - (float) local129, 4096, (int) (-local115 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method1021() {
		if (Static84.anInt1816 == -1 || Static251.anInt6026 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static456.anInt7583 - Static222.anInt4188) * Static365.anInt3059 >> 16) + Static222.anInt4188;
		Static365.anInt3059 += local23;
		if (Static365.anInt3059 >= 65535) {
			if (Static216.aBoolean279) {
				Static366.aBoolean409 = false;
			} else {
				Static366.aBoolean409 = true;
			}
			Static365.anInt3059 = 65535;
			Static216.aBoolean279 = true;
		} else {
			Static366.aBoolean409 = false;
			Static216.aBoolean279 = false;
		}
		@Pc(55) float local55 = (float) Static365.anInt3059 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static358.anInt6084 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static174.anIntArrayArrayArray5[Static84.anInt1816][local62][local64] * 3;
			local88 = Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 1][local64] * 3;
			local121 = (Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 2][local64] + Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 2][local64] - Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 3][local64]) * 3;
			local129 = Static174.anIntArrayArrayArray5[Static84.anInt1816][local62][local64];
			local133 = local88 - local76;
			local142 = local121 + local76 - local88 * 2;
			local160 = local88 + Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 2][local64] - local129 - local121;
			local58[local64] = (float) local129 + local55 * (((float) local142 + (float) local160 * local55) * local55 + (float) local133);
		}
		Static8.anInt121 = (int) local58[1] * -1;
		Static80.anInt1679 = (int) local58[0] - Static168.anInt3353 * 128;
		Static50.anInt906 = (int) local58[2] - Static72.anInt1488 * 128;
		@Pc(213) float[] local213 = new float[3];
		local88 = Static350.anInt5984 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static174.anIntArrayArrayArray5[Static251.anInt6026][local88][local121] * 3;
			local133 = Static174.anIntArrayArrayArray5[Static251.anInt6026][local88 + 1][local121] * 3;
			local142 = (Static174.anIntArrayArrayArray5[Static251.anInt6026][local88 + 2][local121] + Static174.anIntArrayArrayArray5[Static251.anInt6026][local88 + 2][local121] - Static174.anIntArrayArrayArray5[Static251.anInt6026][local88 + 3][local121]) * 3;
			local160 = Static174.anIntArrayArrayArray5[Static251.anInt6026][local88][local121];
			@Pc(287) int local287 = local133 - local129;
			@Pc(295) int local295 = local129 + local142 - local133 * 2;
			@Pc(312) int local312 = local133 + Static174.anIntArrayArrayArray5[Static251.anInt6026][local88 + 2][local121] - local160 - local142;
			local213[local121] = (float) local160 + local55 * ((float) local287 + local55 * ((float) local312 * local55 + (float) local295));
		}
		@Pc(347) float local347 = local213[0] - local58[0];
		@Pc(358) float local358 = -1.0F * (local213[1] - local58[1]);
		@Pc(367) float local367 = local213[2] - local58[2];
		@Pc(377) double local377 = Math.sqrt((double) (local367 * local367 + local347 * local347));
		Static127.anInt2604 = (int) (Math.atan2((double) local358, local377) * 2607.5945876176133D) & 0x3FFF;
		Static362.anInt6155 = (int) (-Math.atan2((double) local347, (double) local367) * 2607.5945876176133D) & 0x3FFF;
		Static242.anInt5735 = ((Static174.anIntArrayArrayArray5[Static84.anInt1816][local62 + 2][3] - Static174.anIntArrayArrayArray5[Static84.anInt1816][local62][3]) * Static365.anInt3059 >> 16) + Static174.anIntArrayArrayArray5[Static84.anInt1816][local62][3];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!h;[[BI)V")
	public static void method1022(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static236.aByteArrayArray31.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(21) byte[] local21 = arg1[local10];
			if (local21 != null) {
				@Pc(34) int local34 = (Static144.anIntArray288[local10] >> 8) * 64 - Static168.anInt3353;
				@Pc(45) int local45 = (Static144.anIntArray288[local10] & 0xFF) * 64 - Static72.anInt1488;
				Static278.method4705();
				arg0.method2447(local21, Static412.aClass50_8, Static11.aClass220Array1, local45, local34);
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V")
	public static void method1023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg0);
		@Pc(22) int local22 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg1);
		@Pc(28) int local28 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg4);
		@Pc(34) int local34 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg2);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static212.method3267(local28, local34, arg3, Class10_Sub10_Sub1.lb[local36]);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!ta;Lclient!fj;IIIIBLclient!gh;ILclient!la;Ljava/lang/String;)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class89 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class57 arg9, @OriginalArg(11) String arg10) {
		@Pc(13) int local13;
		if (Static157.anInt3176 == 4) {
			local13 = (int) Static149.aFloat53 & 0x3FFF;
		} else {
			local13 = (int) Static149.aFloat53 + Static419.anInt7040 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg7.anInt2703 / 2, arg7.anInt2682 / 2) + 10;
		@Pc(41) int local41 = arg4 * arg4 + arg0 * arg0;
		if (local32 * local32 < local41) {
			return;
		}
		@Pc(56) int local56 = Class250.anIntArray675[local13];
		@Pc(60) int local60 = Class250.anIntArray674[local13];
		if (Static157.anInt3176 != 4) {
			local56 = local56 * 256 / (Static394.anInt6667 + 256);
			local60 = local60 * 256 / (Static394.anInt6667 + 256);
		}
		@Pc(90) int local90 = local56 * arg0 + arg4 * local60 >> 15;
		@Pc(101) int local101 = arg0 * local60 - local56 * arg4 >> 15;
		@Pc(108) int local108 = arg2.method1982(null, 100, arg10);
		@Pc(114) int local114 = local90 - local108 / 2;
		@Pc(122) int local122 = arg2.method1974(arg10, null);
		if (-arg7.anInt2703 <= local114 && local114 <= arg7.anInt2703 && local101 >= -arg7.anInt2682 && local101 <= arg7.anInt2682) {
			arg9.method5955(arg5, arg7.anInt2682 / 2 + arg3 - arg6 - local101 - local122, arg3, local114 + arg5 + arg7.anInt2703 / 2, arg10, 50, 0, 0, null, local108, arg8, arg1, null);
		}
	}
}
