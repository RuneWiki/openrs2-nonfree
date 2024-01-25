import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	public static int anInt8095;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_160 = new Class56(42, 10);

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
	public static final int[] anIntArray518 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_91 = new Class303(40, 3);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
	public static void method6711() {
		while (true) {
			if (Static532.aClass3_Sub11_Sub1_2.method1390(Static292.anInt4974) >= 15) {
				@Pc(16) int local16 = Static532.aClass3_Sub11_Sub1_2.method1383(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class3_Sub34 local30 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local16);
					@Pc(36) Class41_Sub2_Sub1_Sub4_Sub1 local36;
					if (local30 == null) {
						local36 = new Class41_Sub2_Sub1_Sub4_Sub1();
						local36.anInt9472 = local16;
						local30 = new Class3_Sub34(local36);
						Static213.aClass354_37.method7691(local30, (long) local16);
						Static441.aClass3_Sub34Array1[Static137.anInt2977++] = local30;
						local23 = true;
					}
					local36 = local30.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					Static445.anIntArray470[Static88.anInt1884++] = local16;
					local36.anInt9487 = Static506.anInt8251;
					if (local36.aClass264_1 != null && local36.aClass264_1.method6002()) {
						Static184.method3145(local36);
					}
					@Pc(96) int local96 = Static532.aClass3_Sub11_Sub1_2.method1383(3) + 4 << 11 & 0x38CB;
					@Pc(101) int local101 = Static532.aClass3_Sub11_Sub1_2.method1383(2);
					@Pc(106) int local106 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
					local36.method5661(Static361.aClass229_13.method5396(Static532.aClass3_Sub11_Sub1_2.method1383(14)));
					@Pc(121) int local121 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
					if (local121 == 1) {
						Static70.anIntArray70[Static596.anInt9773++] = local16;
					}
					@Pc(137) int local137 = Static532.aClass3_Sub11_Sub1_2.method1383(5);
					if (local137 > 15) {
						local137 -= 32;
					}
					@Pc(148) int local148 = Static532.aClass3_Sub11_Sub1_2.method1383(5);
					local36.method7859(local36.aClass264_1.anInt7163);
					if (local148 > 15) {
						local148 -= 32;
					}
					local36.anInt9499 = local36.aClass264_1.anInt7149 << 3;
					if (local23) {
						local36.method7855(local96, true);
					}
					local36.method5652(local106 == 1, local101, local137 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0], Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] + local148, local36.method7858());
					if (local36.aClass264_1.method6002()) {
						Static145.method2803(local36, null, 0, local36.anIntArray629[0], local36.aByte117, null, local36.anIntArray628[0]);
					}
					continue;
				}
			}
			Static532.aClass3_Sub11_Sub1_2.method1392();
			return;
		}
	}
}
