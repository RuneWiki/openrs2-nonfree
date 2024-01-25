import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	public static int anInt8693 = 0;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray28 = new byte[50][];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
	public static boolean method7118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
	public static void method7120(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static312.anInt5688 - Static79.anInt1670;
		if (local8 >= 100) {
			Static346.anInt6215 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static331.aFloat140;
		if (Static90.anInt9289 >> 8 > local17) {
			local17 = Static90.anInt9289 >> 8;
		}
		if (Static567.aBooleanArray41[4] && local17 < Static196.anIntArray252[4] + 128) {
			local17 = Static196.anIntArray252[4] + 128;
		}
		@Pc(58) int local58 = (int) Static428.aFloat160 + Static196.anInt4058 & 0x3FFF;
		Static419.method5993(Static160.method2951(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542, Static97.anInt1863) - 200, arg0, (local17 >> 3) * 3 + 600 << 2, local17, Static468.anInt8032, Static405.anInt7184, local58);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static322.anInt5904 = (int) ((float) Static169.anInt3618 + local103 * (float) (Static322.anInt5904 - Static169.anInt3618));
		Static111.anInt2160 = (int) ((float) (Static111.anInt2160 - Static128.anInt2921) * local103 + (float) Static128.anInt2921);
		Static67.anInt1407 = (int) ((float) Static170.anInt3620 + local103 * (float) (Static67.anInt1407 - Static170.anInt3620));
		Static371.anInt6572 = (int) ((float) (Static371.anInt6572 - Static42.anInt1012) * local103 + (float) Static42.anInt1012);
		@Pc(155) int local155 = Static570.anInt9340 - Static202.anInt4156;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static570.anInt9340 = (int) ((float) Static202.anInt4156 + local103 * (float) local155);
		Static570.anInt9340 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
	public static int method7121() {
		return Static221.anInt4606;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)V")
	public static void method7122(@OriginalArg(0) int arg0) {
		Static193.anInt9352 = arg0;
		Static560.anInt9247 = 2;
		if (Static70.aString27 == null) {
			Static305.method1149(35);
		} else {
			@Pc(24) Class6_Sub21 local24 = new Class6_Sub21(Static185.method3398(Static418.method5986(Static70.aString27)));
			@Pc(28) long local28 = local24.method6018();
			Static583.aLong261 = local24.method6018();
			Static17.method406(Static404.method5929(local28), "", true);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ)V")
	public static void method7123(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static92.anInt1780 = arg0;
		Static181.aClass98_Sub3Array1 = new Class98_Sub3[Static545.anIntArray691[Static92.anInt1780] + 1];
		Static521.anInt8749 = 0;
		Static178.anInt3720 = 0;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)Z")
	public static boolean method7124() {
		@Pc(7) boolean local7 = true;
		if (Static496.aClass140_2 == null) {
			if (Static398.aClass251_94.method5782(Static249.anInt4925)) {
				Static496.aClass140_2 = Static604.method3624(Static398.aClass251_94, Static249.anInt4925);
			} else {
				local7 = false;
			}
		}
		if (Static543.aClass140_3 == null) {
			if (Static398.aClass251_94.method5782(Static252.anInt2857)) {
				Static543.aClass140_3 = Static604.method3624(Static398.aClass251_94, Static252.anInt2857);
			} else {
				local7 = false;
			}
		}
		if (Static202.aClass140_1 == null) {
			if (Static398.aClass251_94.method5782(Static63.anInt1291)) {
				Static202.aClass140_1 = Static604.method3624(Static398.aClass251_94, Static63.anInt1291);
			} else {
				local7 = false;
			}
		}
		if (Static543.aClass327_12 == null) {
			if (Static264.aClass251_66.method5782(Static532.anInt8838)) {
				Static543.aClass327_12 = Static18.method427(Static532.anInt8838, Static264.aClass251_66);
			} else {
				local7 = false;
			}
		}
		if (Static507.aClass140Array1 == null) {
			if (Static398.aClass251_94.method5782(Static532.anInt8838)) {
				Static507.aClass140Array1 = Static604.method3618(Static398.aClass251_94, Static532.anInt8838);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([B[I[I[[BBI[[BI)I")
	public static int method7125(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1[arg4];
		@Pc(16) int local16 = local9 + arg2[arg4];
		@Pc(25) int local25 = arg1[arg6];
		@Pc(32) int local32 = local25 + arg2[arg6];
		@Pc(34) int local34 = local9;
		if (local25 > local9) {
			local34 = local25;
		}
		@Pc(45) int local45 = local16;
		if (local16 > local32) {
			local45 = local32;
		}
		@Pc(56) int local56 = arg0[arg4] & 0xFF;
		if (local56 > (arg0[arg6] & 0xFF)) {
			local56 = arg0[arg6] & 0xFF;
		}
		@Pc(73) byte[] local73 = arg5[arg4];
		@Pc(77) byte[] local77 = arg3[arg6];
		@Pc(82) int local82 = local34 - local9;
		@Pc(87) int local87 = local34 - local25;
		for (@Pc(89) int local89 = local34; local89 < local45; local89++) {
			@Pc(101) int local101 = local77[local87++] + local73[local82++];
			if (local101 < local56) {
				local56 = local101;
			}
		}
		return -local56;
	}
}
