import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public static int anInt2099;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt2100;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt2094 = 0;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!fg;")
	public static Class70 aClass70_37 = new Class70(64);

	@OriginalMember(owner = "client!he", name = "n", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_17 = new Class211();

	@OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
	public static final int[] anIntArray284 = new int[100];

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString84 = "glow1:";

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method2271(@OriginalArg(1) int arg0) {
		Static41.anInt6388 = 3;
		Static204.anInt3768 = arg0;
		Static297.anInt5578 = 100;
		Static151.anInt2868 = -1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method2273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(37) int local37 = Static330.aShort86 + (Static309.aShort85 - Static330.aShort86) * local7 / 100;
		@Pc(43) int local43 = arg6 * local37 >> 8;
		@Pc(50) int local50 = 16384 - arg1 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg5 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local43;
		if (local50 != 0) {
			local61 = -local43 * Class207.anIntArray697[local50] >> 15;
			local63 = local43 * Class207.anIntArray698[local50] >> 15;
		}
		if (local57 != 0) {
			local59 = Class207.anIntArray697[local57] * local63 >> 15;
			local63 = Class207.anIntArray698[local57] * local63 >> 15;
		}
		Static110.anInt2047 = arg1;
		Static287.anInt5405 = arg4 - local59;
		Static217.anInt4016 = arg0 - local61;
		Static11.anInt197 = arg2 - local63;
		Static79.anInt1450 = arg5;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;Lclient!pi;Z)V")
	public static void method2274(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class30 arg2) {
		@Pc(20) int local20 = Static38.aClass26_3.method503(arg1, null, 250);
		@Pc(29) int local29 = Static38.aClass26_3.method499(null, 250, arg1) * 13;
		Static289.aClass81_7.method2962(6, 6, local20 + 8, local29 + 8, -16777216, 0);
		Static289.aClass81_7.method2992(6, 6, local20 + 8, 4 + 4 + local29, -1, 0);
		arg2.method5337(10, 10, null, 0, local20, null, 1, 1, 0, 0, null, arg1, -1, local29, -1);
		Static101.method2080(local20 + 4 + 4, local29 + 4 + 4, 6, 6);
		if (arg0) {
			Static289.aClass81_7.method3030();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method2275() {
		Static9.aClass70_4.method1399();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method2276() {
		while (true) {
			if (Static142.aClass6_Sub10_Sub1_3.method2888(Static31.anInt578) >= 27) {
				@Pc(12) int local12 = Static142.aClass6_Sub10_Sub1_3.method2883(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static239.aClass44_Sub4_Sub4_Sub2Array8[local12] == null) {
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local12] = new Class44_Sub4_Sub4_Sub2();
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local12].anInt5127 = local12;
						local17 = true;
					}
					@Pc(38) Class44_Sub4_Sub4_Sub2 local38 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local12];
					Static191.anIntArray428[Static149.anInt2759++] = local12;
					local38.anInt5105 = Static76.anInt2853;
					if (local38.aClass18_1 != null && local38.aClass18_1.method365()) {
						Static91.method3104(local38);
					}
					@Pc(65) int local65 = Static142.aClass6_Sub10_Sub1_3.method2883(5);
					if (local65 > 15) {
						local65 -= 32;
					}
					@Pc(76) int local76 = Static310.anIntArray658[Static142.aClass6_Sub10_Sub1_3.method2883(3)];
					@Pc(81) int local81 = Static142.aClass6_Sub10_Sub1_3.method2883(5);
					local38.method4726(Static162.method3235(Static142.aClass6_Sub10_Sub1_3.method2883(14)));
					if (local81 > 15) {
						local81 -= 32;
					}
					@Pc(99) int local99 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
					if (local99 == 1) {
						Static151.anIntArray352[Static15.anInt281++] = local12;
					}
					@Pc(117) int local117 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
					local38.method4712(local38.aClass18_1.anInt409);
					local38.anInt5121 = local38.aClass18_1.anInt388 << 3;
					if (local38.anInt5121 == 0) {
						local38.method4715(0);
					} else if (local17) {
						local38.method4715(local76);
					}
					local38.method4708(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] + local65, local38.method4714(), local81 + Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], local117 == 1, Static343.anInt6225);
					if (local38.aClass18_1.method365()) {
						Static152.method3082(local38.anIntArray560[0], Static343.anInt6225, null, 0, local38.anIntArray561[0], null, local38);
					}
					continue;
				}
			}
			Static142.aClass6_Sub10_Sub1_3.method2884();
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	public static void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static336.anInt6136 == 1) {
			Static40.aClass40Array8[Static249.anInt4661 / 100].method5077(Static194.anInt3669 - 8, Static215.anInt3935 + -8);
		}
		if (Static336.anInt6136 == 2) {
			Static40.aClass40Array8[Static249.anInt4661 / 100 + 4].method5077(Static194.anInt3669 - 8, Static215.anInt3935 + -8);
		}
		Static120.method2418();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V")
	public static void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static291.anIntArrayArray183 != null) {
			Static291.anIntArrayArray183[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
