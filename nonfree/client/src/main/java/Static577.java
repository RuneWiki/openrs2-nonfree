import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!rm;")
	public static Class4_Sub39 aClass4_Sub39_3;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_67 = new Class223(10);

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "[I")
	public static final int[] anIntArray541 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
	public static int anInt10067 = 64;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
	public static void method8234() {
		for (@Pc(7) int local7 = 0; local7 < Static459.anInt8551; local7++) {
			@Pc(13) Class281 local13 = Static104.aClass281Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(145) int local145;
			if (local13.aClass4_Sub7_Sub4_3 == null) {
				local13.anInt8202--;
				if (local13.anInt8202 >= (local13.method6807() ? -1500 : -10)) {
					if (local13.aByte85 == 1 && local13.aClass321_1 == null) {
						local13.aClass321_1 = Static602.method7590(Static399.aClass176_103, local13.anInt8203, 0);
						if (local13.aClass321_1 == null) {
							continue;
						}
						local13.anInt8202 += local13.aClass321_1.method7591();
					} else if (local13.method6807() && (local13.aClass4_Sub47_3 == null || local13.aClass4_Sub16_Sub1_3 == null)) {
						if (local13.aClass4_Sub47_3 == null) {
							local13.aClass4_Sub47_3 = Static527.method7632(Static112.aClass176_35, local13.anInt8203);
						}
						if (local13.aClass4_Sub47_3 == null) {
							continue;
						}
						if (local13.aClass4_Sub16_Sub1_3 == null) {
							local13.aClass4_Sub16_Sub1_3 = local13.aClass4_Sub47_3.method7635(new int[] { 22050 });
							if (local13.aClass4_Sub16_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local13.anInt8202 < 0) {
						if (local13.anInt8206 == 0) {
							local145 = (local13.aByte85 == 3 ? Static214.aClass4_Sub19_Sub1_1.anInt3077 : Static214.aClass4_Sub19_Sub1_1.anInt3064) * local13.anInt8201 >> 2;
						} else {
							@Pc(135) int local135 = local13.anInt8206 >> 24 & 0x3;
							if (local135 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126) {
								@Pc(154) int local154 = (local13.anInt8206 & 0xFF) << 9;
								@Pc(160) int local160 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() << 8;
								@Pc(167) int local167 = local13.anInt8206 >> 16 & 0xFF;
								@Pc(179) int local179 = local160 + (local167 << 9) + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
								@Pc(186) int local186 = local13.anInt8206 >> 8 & 0xFF;
								@Pc(198) int local198 = local160 + (local186 << 9) + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
								@Pc(207) int local207 = Math.abs(local179) + Math.abs(local198) - 512;
								if (local154 < local207) {
									local13.anInt8202 = -99999;
									continue;
								}
								if (local207 < 0) {
									local207 = 0;
								}
								local145 = (local154 - local207) * Static214.aClass4_Sub19_Sub1_1.anInt3051 * local13.anInt8201 / local154 >> 2;
								if (local13.aClass1_Sub4_3 != null && local13.aClass1_Sub4_3 instanceof Class1_Sub4_Sub2) {
									@Pc(245) Class1_Sub4_Sub2 local245 = (Class1_Sub4_Sub2) local13.aClass1_Sub4_3;
									@Pc(248) short local248 = local245.aShort120;
									@Pc(251) short local251 = local245.aShort121;
								}
							} else {
								local145 = 0;
							}
						}
						if (local145 > 0) {
							@Pc(272) Class4_Sub16_Sub1 local272 = null;
							if (local13.aByte85 == 1) {
								local272 = local13.aClass321_1.method7592().method2544(Static46.aClass260_1);
							} else if (local13.method6807()) {
								local272 = local13.aClass4_Sub16_Sub1_3;
							}
							@Pc(300) Class4_Sub7_Sub4 local300 = local13.aClass4_Sub7_Sub4_3 = Static600.method6430(local272, local13.anInt8205, local145, 8192);
							local300.method6422(local13.anInt8204 - 1);
							Static444.aClass4_Sub7_Sub1_2.method397(local300);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass4_Sub7_Sub4_3.method8381()) {
				local15 = true;
			}
			if (local15) {
				Static459.anInt8551--;
				for (local145 = local7; local145 < Static459.anInt8551; local145++) {
					Static104.aClass281Array1[local145] = Static104.aClass281Array1[local145 + 1];
				}
				local7--;
			}
		}
		if (Static393.aBoolean519 && !Static5.method134()) {
			if (Static214.aClass4_Sub19_Sub1_1.anInt3066 != 0 && Static18.anInt281 != -1) {
				if (Static280.aClass4_Sub7_Sub3_3 == null) {
					Static410.method6484(Static214.aClass4_Sub19_Sub1_1.anInt3066, Static55.aClass176_104, Static18.anInt281);
				} else {
					Static501.method5642(Static280.aClass4_Sub7_Sub3_3, Static214.aClass4_Sub19_Sub1_1.anInt3066, Static55.aClass176_104, Static18.anInt281);
				}
			}
			Static280.aClass4_Sub7_Sub3_3 = null;
			Static393.aBoolean519 = false;
		} else if (Static214.aClass4_Sub19_Sub1_1.anInt3066 != 0 && Static18.anInt281 != -1 && !Static5.method134()) {
			@Pc(414) Class4_Sub14 local414 = Static196.method3380(Static17.aClass159_1, Static291.aClass173_84);
			local414.aClass4_Sub11_Sub1_3.method4909(Static18.anInt281);
			Static353.method5712(local414);
			Static18.anInt281 = -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLclient!io;ZIIILclient!io;)I")
	public static int method8235(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class158_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class158_Sub1 arg5) {
		@Pc(10) int local10 = Static110.method2420(arg1, arg0, arg3, arg5);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(47) int local47 = Static110.method2420(arg1, arg2, arg4, arg5);
			return arg2 ? -local47 : local47;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lclient!mt;")
	public static Class4_Sub7_Sub3 method8237() {
		return Static405.aClass4_Sub7_Sub3_4;
	}
}
