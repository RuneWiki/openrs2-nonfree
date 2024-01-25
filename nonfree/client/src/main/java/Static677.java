import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public static int anInt10938;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public static int anInt10940;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_72 = new Class302();

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public static int anInt10939 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V")
	public static void method9019() {
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub25_2);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub25_1);
		Static336.aClass3_Sub41_18.method6705(1, Static336.aClass3_Sub41_18.aClass14_Sub19_1);
		Static336.aClass3_Sub41_18.method6705(1, Static336.aClass3_Sub41_18.aClass14_Sub19_2);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub23_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub16_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub21_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub4_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub11_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub20_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub5_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub8_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub17_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub27_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub10_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub10_2);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub18_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub22_1);
		Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub24_1);
		Static316.method4543();
		Static336.aClass3_Sub41_18.method6705(2, Static336.aClass3_Sub41_18.aClass14_Sub29_1);
		Static336.aClass3_Sub41_18.method6705(1, Static336.aClass3_Sub41_18.aClass14_Sub15_1);
		Static136.method2278();
		Static451.method6102();
		Static88.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Z")
	public static boolean method9021() {
		try {
			if (Static634.anInt6735 == 2) {
				if (Static192.aClass3_Sub32_1 == null) {
					Static192.aClass3_Sub32_1 = Static682.method4331(Static554.aClass362_126, Static523.anInt8276, Static566.anInt9146);
					if (Static192.aClass3_Sub32_1 == null) {
						return false;
					}
				}
				if (Static672.aClass53_1 == null) {
					Static672.aClass53_1 = new Class53(Static33.aClass362_119, Static628.aClass362_150);
				}
				@Pc(29) Class3_Sub12_Sub3 local29 = Static574.aClass3_Sub12_Sub3_3;
				if (Static653.aClass3_Sub12_Sub3_4 != null) {
					local29 = Static653.aClass3_Sub12_Sub3_4;
				}
				if (local29.method7563(Static672.aClass53_1, Static192.aClass3_Sub32_1, Static515.aClass362_110)) {
					Static574.aClass3_Sub12_Sub3_3 = local29;
					Static574.aClass3_Sub12_Sub3_3.method7578();
					@Pc(64) int local64;
					if (Static208.anInt3637 > 0) {
						Static634.anInt6735 = 3;
						Static574.aClass3_Sub12_Sub3_3.method7553(Static208.anInt3637 <= Static531.anInt8329 ? Static208.anInt3637 : Static531.anInt8329);
						for (local64 = 0; local64 < Static59.anIntArray61.length; local64++) {
							Static574.aClass3_Sub12_Sub3_3.method7552(local64, Static59.anIntArray61[local64]);
							Static59.anIntArray61[local64] = 255;
						}
					} else {
						Static634.anInt6735 = 0;
						Static574.aClass3_Sub12_Sub3_3.method7553(Static531.anInt8329);
						for (local64 = 0; local64 < Static59.anIntArray61.length; local64++) {
							Static574.aClass3_Sub12_Sub3_3.method7552(local64, Static59.anIntArray61[local64]);
							Static59.anIntArray61[local64] = 255;
						}
					}
					if (Static653.aClass3_Sub12_Sub3_4 == null) {
						if (Static223.aLong104 <= 0L) {
							Static574.aClass3_Sub12_Sub3_3.method7557(Static192.aClass3_Sub32_1, Static18.aBoolean20);
						} else {
							Static574.aClass3_Sub12_Sub3_3.method7567(Static18.aBoolean20, Static192.aClass3_Sub32_1, Static223.aLong104);
						}
					}
					if (Static282.aClass41_1 != null) {
						Static282.aClass41_1.method7708(Static574.aClass3_Sub12_Sub3_3);
					}
					Static192.aClass3_Sub32_1 = null;
					Static554.aClass362_126 = null;
					Static672.aClass53_1 = null;
					Static653.aClass3_Sub12_Sub3_4 = null;
					Static223.aLong104 = 0L;
					return true;
				}
			}
		} catch (@Pc(151) Exception local151) {
			local151.printStackTrace();
			Static574.aClass3_Sub12_Sub3_3.method7561();
			Static653.aClass3_Sub12_Sub3_4 = null;
			Static192.aClass3_Sub32_1 = null;
			Static634.anInt6735 = 0;
			Static672.aClass53_1 = null;
			Static554.aClass362_126 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(FFIFIBIFLclient!mm;IF)[B")
	public static byte[] method9022(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) Class209 arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static279.method4067(0, arg2, local15, arg0, arg1, arg4, arg3, arg5);
		return local15;
	}
}
