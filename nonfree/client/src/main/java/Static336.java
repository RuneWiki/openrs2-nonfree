import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!l;")
	public static Class57 aClass57_26;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Lclient!hg;")
	public static Class3_Sub23 aClass3_Sub23_2;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_61 = new Class198(260);

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString245 = "slide:";

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "[B")
	public static final byte[] aByteArray93 = new byte[520];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!ps;ILclient!ps;IIIIII)V")
	public static void method5502(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub4_Sub4 arg1, @OriginalArg(3) Class5_Sub4_Sub4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method4204();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class57 local21 = (Class57) Static99.aClass198_19.method5242((long) local7);
		if (local21 == null) {
			@Pc(28) Class149[] local28 = Static366.method3882(Static317.aClass100_112, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static212.aClass122_2.method4757(local28[0]);
			Static99.aClass198_19.method5231((long) local7, local21);
		}
		Static123.method2166(0, arg1.anInt5901, arg5 >> 1, arg1.method4208() * 64, arg0 >> 1, arg1.anInt5905);
		@Pc(72) int local72 = Static187.anIntArray302[0] + arg3 - 18;
		@Pc(80) int local80 = arg6 + Static187.anIntArray302[1] - 70;
		@Pc(88) int local88 = local72 + arg4 / 4 * 18;
		@Pc(96) int local96 = local80 + arg4 % 4 * 18;
		local21.method5448(local88, local96);
		if (arg1 == arg2) {
			Static212.aClass122_2.method4719(local96 - 1, -256, local88 - 1, 18, 18);
		}
		@Pc(118) Class8_Sub6 local118 = Static120.method2122();
		local118.anInt4677 = local96;
		local118.aClass5_Sub4_Sub4_1 = arg2;
		local118.anInt4680 = local88;
		local118.anInt4681 = local88 + 16;
		local118.anInt4675 = local96 + 16;
		Static321.aClass65_8.method1458(local118);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!sj;Ljava/lang/String;Lclient!vn;Lclient!os;IIIIILclient!sf;I)V")
	public static void method5503(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class209 arg3, @OriginalArg(4) Class120 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class74 arg10) {
		@Pc(16) int local16;
		if (Static261.anInt5200 == 4) {
			local16 = (int) Static57.aFloat3 & 0x3FFF;
		} else {
			local16 = Static42.anInt892 + (int) Static57.aFloat3 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt5704 / 2, arg1.anInt5721 / 2) + 10;
		@Pc(46) int local46 = arg6 * arg6 + arg0 * arg0;
		if (local37 * local37 < local46) {
			return;
		}
		@Pc(56) int local56 = Class19.anIntArray20[local16];
		@Pc(60) int local60 = Class19.anIntArray21[local16];
		if (Static261.anInt5200 != 4) {
			local56 = local56 * 256 / (Static12.anInt309 + 256);
			local60 = local60 * 256 / (Static12.anInt309 + 256);
		}
		@Pc(90) int local90 = local56 * arg0 + local60 * arg6 >> 15;
		@Pc(101) int local101 = arg0 * local60 - arg6 * local56 >> 15;
		@Pc(108) int local108 = arg3.method5515(null, arg2, 100);
		@Pc(114) int local114 = local90 - local108 / 2;
		@Pc(122) int local122 = arg3.method5514(arg2, null);
		if (-arg1.anInt5704 <= local114 && local114 <= arg1.anInt5704 && -arg1.anInt5721 <= local101 && local101 <= arg1.anInt5721) {
			arg4.method5538(arg7 + local114 + arg1.anInt5704 / 2, 50, arg7, arg5, arg2, arg10, arg8 + arg1.anInt5721 / 2 - local122 - local101 - arg9, arg8, 1, null, 0, null, 0, local108, 0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method5504() {
		if (Static290.anIntArray474 != null && Static113.anIntArray534 != null) {
			return;
		}
		Static113.anIntArray534 = new int[256];
		Static290.anIntArray474 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static290.anIntArray474[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static113.anIntArray534[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public static void method5506(@OriginalArg(1) int arg0) {
		Static226.anIntArray375 = new int[Static122.anInt2632];
		Static155.aByteArrayArrayArray3 = new byte[arg0][Static162.anInt2152][Static122.anInt2632];
		Static72.aByteArrayArrayArray1 = null;
		Static302.anIntArray487 = new int[Static122.anInt2632];
		Static147.aByteArrayArrayArray8 = new byte[arg0][Static162.anInt2152][Static122.anInt2632];
		Static245.aByteArrayArrayArray12 = new byte[arg0][Static162.anInt2152][Static122.anInt2632];
		Static105.anIntArrayArrayArray2 = new int[arg0][Static162.anInt2152 + 1][Static122.anInt2632 + 1];
		Static103.anIntArray126 = new int[5];
		Static297.anIntArray483 = new int[Static122.anInt2632];
		Static322.anIntArray522 = new int[Static122.anInt2632];
		Static310.aByteArrayArrayArray14 = new byte[arg0][Static162.anInt2152 + 1][Static122.anInt2632 + 1];
		Static16.anIntArray16 = new int[Static122.anInt2632];
		Static137.anInt2556 = 99;
		Static176.aByteArrayArrayArray13 = new byte[arg0][Static162.anInt2152][Static122.anInt2632];
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method5512() {
		@Pc(10) int local10 = Static20.aClass3_Sub4_Sub2_1.method3681(8);
		@Pc(15) int local15;
		if (Static170.anInt6275 > local10) {
			for (local15 = local10; local15 < Static170.anInt6275; local15++) {
				Static263.anIntArray427[Static244.anInt4836++] = Static235.anIntArray377[local15];
			}
		}
		if (Static170.anInt6275 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static170.anInt6275 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(54) int local54 = Static235.anIntArray377[local15];
			@Pc(58) Class5_Sub4_Sub4_Sub1 local58 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local54];
			@Pc(63) int local63 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
			if (local63 == 0) {
				Static235.anIntArray377[Static170.anInt6275++] = local54;
				local58.anInt4921 = Static51.anInt1101;
			} else {
				@Pc(86) int local86 = Static20.aClass3_Sub4_Sub2_1.method3681(2);
				if (local86 == 0) {
					Static235.anIntArray377[Static170.anInt6275++] = local54;
					local58.anInt4921 = Static51.anInt1101;
					Static303.anIntArray447[Static283.anInt4489++] = local54;
				} else {
					@Pc(130) int local130;
					@Pc(142) int local142;
					if (local86 == 1) {
						Static235.anIntArray377[Static170.anInt6275++] = local54;
						local58.anInt4921 = Static51.anInt1101;
						local130 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
						local58.method4202(1, local130);
						local142 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
						if (local142 == 1) {
							Static303.anIntArray447[Static283.anInt4489++] = local54;
						}
					} else if (local86 == 2) {
						Static235.anIntArray377[Static170.anInt6275++] = local54;
						local58.anInt4921 = Static51.anInt1101;
						if (Static20.aClass3_Sub4_Sub2_1.method3681(1) == 1) {
							local130 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local58.method4202(2, local130);
							local142 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local58.method4202(2, local142);
						} else {
							local130 = Static20.aClass3_Sub4_Sub2_1.method3681(3);
							local58.method4202(0, local130);
						}
						local130 = Static20.aClass3_Sub4_Sub2_1.method3681(1);
						if (local130 == 1) {
							Static303.anIntArray447[Static283.anInt4489++] = local54;
						}
					} else if (local86 == 3) {
						Static263.anIntArray427[Static244.anInt4836++] = local54;
					}
				}
			}
		}
	}
}
