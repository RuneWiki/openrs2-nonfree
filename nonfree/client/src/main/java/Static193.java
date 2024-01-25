import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hea", name = "P", descriptor = "Z")
	public static boolean aBoolean341;

	@OriginalMember(owner = "client!hea", name = "S", descriptor = "[Lclient!qf;")
	public static Class262[] aClass262Array1;

	@OriginalMember(owner = "client!hea", name = "M", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_77 = new Class254(16, 6);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!lt;I)V")
	public static void method3701(@OriginalArg(0) Class6_Sub26_Sub2 arg0) {
		arg0.method5002();
		@Pc(10) int local10 = Static412.anInt7714;
		@Pc(20) Class11_Sub1_Sub1_Sub2 local20 = Static350.aClass11_Sub1_Sub1_Sub2_4 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local10] = new Class11_Sub1_Sub1_Sub2();
		local20.anInt7392 = local10;
		@Pc(28) int local28 = arg0.method5008(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray526[0] = local39 - Static191.anInt4147;
		local20.anInt7347 = (local20.anIntArray526[0] << 9) + (local20.method6212() << 8);
		local20.anIntArray527[0] = local43 - Static247.anInt5049;
		local20.anInt7351 = (local20.anIntArray527[0] << 9) + (local20.method6212() << 8);
		Static493.anInt8836 = local20.aByte77 = local33;
		if (Static125.aClass6_Sub26Array1[local10] != null) {
			local20.method6224(Static125.aClass6_Sub26Array1[local10]);
		}
		Static81.anInt1953 = 0;
		Static227.anIntArray309[Static81.anInt1953++] = local10;
		Static375.aByteArray80[local10] = 0;
		Static439.anInt8018 = 0;
		for (@Pc(119) int local119 = 1; local119 < 2048; local119++) {
			if (local119 != local10) {
				@Pc(129) int local129 = arg0.method5008(18);
				@Pc(133) int local133 = local129 >> 16;
				@Pc(139) int local139 = local129 >> 8 & 0xFF;
				@Pc(143) int local143 = local129 & 0xFF;
				@Pc(151) Class153 local151 = Static510.aClass153Array6[local119] = new Class153();
				local151.anInt4682 = 0;
				local151.anInt4679 = -1;
				local151.aBoolean368 = false;
				local151.anInt4680 = local143 + (local133 << 28) + (local139 << 14);
				Static36.anIntArray76[Static439.anInt8018++] = local119;
				Static375.aByteArray80[local119] = 0;
			}
		}
		arg0.method5006();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method3703(@OriginalArg(1) Class11_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static508.anInt8998 == arg0.anInt7428 || arg0.anInt7387 == -1 || arg0.anInt7401 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class16 local29 = Static114.aClass156_2.method4101(arg0.anInt7387);
			if (local29.aBoolean39 || local29.anIntArray46[arg0.anInt7361] < arg0.anInt7414 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(60) int local60 = arg0.anInt7428 - arg0.anInt7391;
			@Pc(65) int local65 = Static508.anInt8998 - arg0.anInt7391;
			@Pc(77) int local77 = arg0.anInt7372 * 512 + arg0.method6212() * 256;
			@Pc(88) int local88 = arg0.anInt7367 * 512 + arg0.method6212() * 256;
			@Pc(100) int local100 = arg0.anInt7412 * 512 + arg0.method6212() * 256;
			@Pc(112) int local112 = arg0.anInt7429 * 512 + arg0.method6212() * 256;
			arg0.anInt7347 = (local77 * (local60 - local65) + local65 * local100) / local60;
			arg0.anInt7351 = (local112 * local65 + local88 * (local60 - local65)) / local60;
		}
		arg0.anInt7433 = 0;
		if (arg0.anInt7431 == 0) {
			arg0.method6204(false, 8192);
		}
		if (arg0.anInt7431 == 1) {
			arg0.method6204(false, 12288);
		}
		if (arg0.anInt7431 == 2) {
			arg0.method6204(false, 0);
		}
		if (arg0.anInt7431 == 3) {
			arg0.method6204(false, 4096);
		}
	}
}
