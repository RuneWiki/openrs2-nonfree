import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray114;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
	public static int anInt7360;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
	public static int anInt7361;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public static int anInt7369;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public static int anInt7352 = 1;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public static int anInt7353 = 0;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lclient!sca;")
	public static Class302 aClass302_45 = null;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "[I")
	public static final int[] anIntArray442 = new int[3];

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_10 = new Class240("", 18);

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	public static final int anInt7366 = 1407;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII)V")
	public static void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == Static625.anInt10293 && arg0 == Static419.anInt7662 && Static576.anInt4608 == arg2) {
			return;
		}
		Static419.anInt7662 = arg0;
		Static133.aBoolean183 = true;
		Static576.anInt4608 = arg2;
		Static625.anInt10293 = arg1;
		@Pc(39) double local39 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static550.aDouble17 = local52;
		Static430.aDouble13 = -local55 * local58;
		Static298.aDouble12 = -local52 * local61;
		Static522.aDouble15 = local52 * local58;
		Static221.aDouble10 = local61 * local55;
		Static145.aDouble4 = (double) 0;
		Static597.aDouble26 = local61;
		Static490.aDouble14 = local55;
		Static548.aDouble16 = local58;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
	public static void method6336() {
		Static648.aClass353_138.anInt9949 = 1;
		Static235.method4078();
		Static368.aBoolean450 = true;
		Static399.aBoolean503 = true;
		Static403.method6477();
		for (@Pc(8150) int local8150 = 0; local8150 < Static325.aClass19Array1.length; local8150++) {
			Static325.aClass19Array1[local8150] = null;
		}
		Static280.aBoolean380 = false;
		Static551.method7994();
		Static27.anInt551 = (int) (Math.random() * 80.0D) - 40;
		Static620.anInt10702 = (int) (Math.random() * 30.0D) - 20;
		Static107.anInt2107 = (int) (Math.random() * 100.0D) - 50;
		Static526.anInt9147 = (int) (Math.random() * 110.0D) - 55;
		Static284.aFloat164 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static298.anInt6417 = (int) (Math.random() * 120.0D) - 60;
		Static350.method5630();
		for (@Pc(8220) int local8220 = 0; local8220 < 2048; local8220++) {
			Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local8220] = null;
		}
		Static252.anInt5066 = 0;
		Static273.anInt5420 = 0;
		Static347.aClass128_23.method3562();
		Static364.aClass8_36.method154();
		Static576.aClass8_29.method154();
		Static78.aClass81_1.method2122();
		Static333.aClass128_46.method3562();
		Static26.aClass8_7 = new Class8();
		Static69.aClass8_9 = new Class8();
		Static279.aClass294_1.method7418();
		Static148.method2361();
		Static80.anInt1683 = 0;
		Static16.anInt283 = 0;
		Static447.anInt8023 = 0;
		Static358.anInt6653 = 0;
		Static81.anInt1699 = 0;
		Static636.anInt10648 = 0;
		Static222.anInt4352 = 0;
		Static551.anInt9406 = 0;
		Static542.anInt9328 = 0;
		Static26.anInt536 = 0;
		for (@Pc(8284) int local8284 = 0; local8284 < Static522.anIntArray557.length; local8284++) {
			if (!Static211.aBooleanArray25[local8284]) {
				Static522.anIntArray557[local8284] = -1;
			}
		}
		if (Static554.anInt1822 != -1) {
			Static388.method6215(Static554.anInt1822);
		}
		for (@Pc(8310) Class6_Sub29 local8310 = (Class6_Sub29) Static507.aClass128_42.method3556(); local8310 != null; local8310 = (Class6_Sub29) Static507.aClass128_42.method3555()) {
			if (!local8310.method9042()) {
				local8310 = (Class6_Sub29) Static507.aClass128_42.method3556();
				if (local8310 == null) {
					break;
				}
			}
			Static221.method3774(false, local8310, true);
		}
		Static554.anInt1822 = -1;
		Static507.aClass128_42 = new Class128(8);
		Static302.method5142();
		Static523.aClass302_53 = null;
		for (@Pc(8350) int local8350 = 0; local8350 < 8; local8350++) {
			Static637.aStringArray75[local8350] = null;
			Static493.aBooleanArray45[local8350] = false;
			Static496.anIntArray531[local8350] = -1;
		}
		Static580.method8186();
		Static629.aBoolean688 = true;
		for (@Pc(8374) int local8374 = 0; local8374 < 100; local8374++) {
			Static501.aBooleanArray46[local8374] = true;
		}
		for (@Pc(8388) int local8388 = 0; local8388 < 6; local8388++) {
			Static114.aClass255Array1[local8388] = new Class255();
		}
		for (@Pc(8404) int local8404 = 0; local8404 < 25; local8404++) {
			Static242.anIntArray277[local8404] = 0;
			Static287.anIntArray534[local8404] = 0;
			Static451.anIntArray512[local8404] = 0;
		}
		Static245.method5548();
		Static354.aShortArray33 = Static563.aShortArray130 = Static354.aShortArray32 = Static108.aShortArray47 = new short[256];
		Static246.aBoolean346 = true;
		Static412.aString55 = Static317.aClass192_26.method5299(Static307.anInt5931);
		Static348.aClass6_Sub22_19.method3534(Static348.aClass6_Sub22_19.aClass15_Sub10_1.method2360(), Static348.aClass6_Sub22_19.aClass15_Sub10_2);
		Static348.aClass6_Sub22_19.method3534(Static348.aClass6_Sub22_19.aClass15_Sub28_1.method8677(), Static348.aClass6_Sub22_19.aClass15_Sub28_2);
		Static500.anInt8420 = 0;
		Static497.method7422();
		Static181.method3307();
		Static317.aLong161 = 0L;
		Static32.aClass6_Sub17_1 = null;
		Static648.aClass353_138.anInt9949 = 2;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg1 == arg2 && arg6 == arg5 && arg7 == arg4 && arg3 == arg8) {
			Static492.method7385(arg1, arg6, arg4, arg3, arg0);
			return;
		}
		@Pc(41) int local41 = arg1;
		@Pc(43) int local43 = arg6;
		@Pc(47) int local47 = arg1 * 3;
		@Pc(51) int local51 = arg6 * 3;
		@Pc(55) int local55 = arg2 * 3;
		@Pc(59) int local59 = arg5 * 3;
		@Pc(63) int local63 = arg7 * 3;
		@Pc(67) int local67 = arg8 * 3;
		@Pc(77) int local77 = local55 + arg4 - arg1 - local63;
		@Pc(87) int local87 = arg3 + local59 - arg6 - local67;
		@Pc(97) int local97 = local47 + local63 - local55 - local55;
		@Pc(107) int local107 = local51 + local67 - local59 - local59;
		@Pc(111) int local111 = local55 - local47;
		@Pc(116) int local116 = local59 - local51;
		for (@Pc(118) int local118 = 128; local118 <= 4096; local118 += 128) {
			@Pc(126) int local126 = local118 * local118 >> 12;
			@Pc(132) int local132 = local118 * local126 >> 12;
			@Pc(136) int local136 = local132 * local77;
			@Pc(140) int local140 = local132 * local87;
			@Pc(144) int local144 = local126 * local97;
			@Pc(148) int local148 = local126 * local107;
			@Pc(152) int local152 = local118 * local111;
			@Pc(156) int local156 = local118 * local116;
			@Pc(167) int local167 = arg1 + (local152 + local144 + local136 >> 12);
			@Pc(178) int local178 = (local140 + local148 + local156 >> 12) + arg6;
			Static492.method7385(local41, local43, local167, local178, arg0);
			local43 = local178;
			local41 = local167;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIB)Z")
	public static boolean method6342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
