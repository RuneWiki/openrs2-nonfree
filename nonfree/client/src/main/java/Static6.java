import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_1 = new Class156(56, 2);

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_3 = new Class381(42, 4);

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
	public static int anInt74 = -1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V")
	public static void method93(@OriginalArg(1) int arg0) {
		Static272.anInt4913 = -1;
		Static403.anInt6785 = -1;
		Static124.anInt2052 = arg0;
		Static127.method1898();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I")
	public static int method94() {
		if ((double) Static491.aFloat24 == 3.0D) {
			return 37;
		} else if ((double) Static491.aFloat24 == 4.0D) {
			return 50;
		} else if ((double) Static491.aFloat24 == 6.0D) {
			return 75;
		} else if ((double) Static491.aFloat24 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!rv;I)Z")
	public static boolean method96(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method7343(2);
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(127) int local127;
		if (local8 == 0) {
			if (arg1.method7343(1) != 0) {
				method96(arg0, arg1);
			}
			local35 = arg1.method7343(6);
			local40 = arg1.method7343(6);
			@Pc(53) boolean local53 = arg1.method7343(1) == 1;
			if (local53) {
				Static486.anIntArray457[Static282.anInt5022++] = arg0;
			}
			if (Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(81) Class268 local81 = Static465.aClass268Array1[arg0];
			@Pc(89) Class4_Sub1_Sub1_Sub2_Sub1 local89 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg0] = new Class4_Sub1_Sub1_Sub2_Sub1();
			local89.anInt6843 = arg0;
			if (Static74.aClass5_Sub36Array1[arg0] != null) {
				local89.method4091(Static74.aClass5_Sub36Array1[arg0]);
			}
			local89.method5936(true, local81.anInt7108);
			local89.anInt6863 = local81.anInt7107;
			local117 = local81.anInt7109;
			local121 = local117 >> 28;
			local127 = local117 >> 14 & 0xFF;
			@Pc(131) int local131 = local117 & 0xFF;
			@Pc(140) int local140 = (local127 << 6) + local35 - Static315.anInt5380;
			@Pc(149) int local149 = local40 + (local131 << 6) - Static290.anInt5128;
			local89.aBoolean303 = local81.aBoolean473;
			local89.aBoolean304 = local81.aBoolean474;
			local89.aByteArray76[0] = Static298.aByteArray56[arg0];
			local89.aByte139 = local89.aByte138 = (byte) local121;
			if (Static389.method1741(local149, local140)) {
				local89.aByte138++;
			}
			local89.method4085(local140, local149);
			local89.aBoolean302 = false;
			Static465.aClass268Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local35 = arg1.method7343(2);
			local40 = Static465.aClass268Array1[arg0].anInt7109;
			Static465.aClass268Array1[arg0].anInt7109 = (local40 & 0xFFFFFFF) + (((local40 >> 28) + local35 & 0x3) << 28);
			return false;
		} else {
			@Pc(249) int local249;
			@Pc(254) int local254;
			@Pc(262) int local262;
			if (local8 != 2) {
				local35 = arg1.method7343(18);
				local40 = local35 >> 16;
				local249 = local35 >> 8 & 0xFF;
				local254 = local35 & 0xFF;
				local262 = Static465.aClass268Array1[arg0].anInt7109;
				local117 = local40 + (local262 >> 28) & 0x3;
				local121 = local249 + (local262 >> 14) & 0xFF;
				local127 = local262 + local254 & 0xFF;
				Static465.aClass268Array1[arg0].anInt7109 = local127 + (local121 << 14) + (local117 << 28);
				return false;
			}
			local35 = arg1.method7343(5);
			local40 = local35 >> 3;
			local249 = local35 & 0x7;
			local254 = Static465.aClass268Array1[arg0].anInt7109;
			local262 = local40 + (local254 >> 28) & 0x3;
			local117 = local254 >> 14 & 0xFF;
			local121 = local254 & 0xFF;
			if (local249 == 0) {
				local117--;
				local121--;
			}
			if (local249 == 1) {
				local121--;
			}
			if (local249 == 2) {
				local121--;
				local117++;
			}
			if (local249 == 3) {
				local117--;
			}
			if (local249 == 4) {
				local117++;
			}
			if (local249 == 5) {
				local117--;
				local121++;
			}
			if (local249 == 6) {
				local121++;
			}
			if (local249 == 7) {
				local121++;
				local117++;
			}
			Static465.aClass268Array1[arg0].anInt7109 = (local262 << 28) - (-(local117 << 14) - local121);
			return false;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II[B)[B")
	public static byte[] method97(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static693.method8320(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Lclient!pja;")
	public static Class5_Sub1_Sub16 method98() {
		return Static491.aClass5_Sub1_Sub16_2;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!wq;B)Lclient!fca;")
	public static Class108 method99(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(15) Class108 local15 = new Class108();
		local15.anInt2907 = arg0.method7333();
		local15.aClass5_Sub1_Sub5_1 = Static54.aClass308_1.method6953(local15.anInt2907);
		return local15;
	}
}
