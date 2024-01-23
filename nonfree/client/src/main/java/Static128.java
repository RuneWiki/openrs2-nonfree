import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt2873;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_578 = Static199.method3560(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBI)I")
	public static int method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & arg1 - 1;
		@Pc(13) int local13 = arg0 / arg1;
		@Pc(24) int local24 = arg2 / arg1;
		@Pc(30) int local30 = arg2 & arg1 - 1;
		@Pc(35) int local35 = Static146.method2591(local24, local13);
		@Pc(42) int local42 = Static146.method2591(local24, local13 + 1);
		@Pc(49) int local49 = Static146.method2591(local24 + 1, local13);
		@Pc(58) int local58 = Static146.method2591(local24 + 1, local13 + 1);
		@Pc(65) int local65 = Static220.method3825(local35, local42, arg1, local9);
		@Pc(72) int local72 = Static220.method3825(local49, local58, arg1, local9);
		return Static220.method3825(local65, local72, arg1, local30);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method2311() {
		if (Static165.aDouble10 > Static174.aDouble11) {
			Static174.aDouble11 += Static174.aDouble11 / 30.0D;
			if (Static165.aDouble10 < Static174.aDouble11) {
				Static174.aDouble11 = Static165.aDouble10;
			}
			Static178.method3274();
		} else if (Static174.aDouble11 > Static165.aDouble10) {
			Static174.aDouble11 -= Static174.aDouble11 / 30.0D;
			if (Static165.aDouble10 > Static174.aDouble11) {
				Static174.aDouble11 = Static165.aDouble10;
			}
			Static178.method3274();
		}
		if (Static22.anInt416 == -1 || Static4.anInt123 == -1) {
			return;
		}
		@Pc(54) int local54 = Static4.anInt123 - Static223.anInt4831;
		@Pc(58) int local58 = Static22.anInt416 - Static32.anInt4049;
		if (local54 < 2 || local54 > 2) {
			local54 >>= 0x4;
		}
		if (local58 < 2 || local58 > 2) {
			local58 >>= 0x4;
		}
		Static32.anInt4049 -= -local58;
		Static223.anInt4831 += local54;
		if (local58 == 0 && local54 == 0) {
			Static4.anInt123 = -1;
			Static22.anInt416 = -1;
		}
		Static178.method3274();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
	public static void method2312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		if (arg1 > 25) {
			local5 = 25;
		}
		arg1--;
		@Pc(25) int local25 = Static86.anIntArray341[arg1];
		@Pc(29) int local29 = Static110.anIntArray419[arg1];
		if (arg0 == 0) {
			Static161.aClass2_Sub23_Sub1_5.method2155(135);
			Static161.aClass2_Sub23_Sub1_5.method2132(local5 + local5 + 3);
		}
		if (arg0 == 1) {
			Static161.aClass2_Sub23_Sub1_5.method2155(200);
			Static161.aClass2_Sub23_Sub1_5.method2132(local5 + local5 + 14 + 3);
		}
		if (arg0 == 2) {
			Static161.aClass2_Sub23_Sub1_5.method2155(211);
			Static161.aClass2_Sub23_Sub1_5.method2132(local5 + local5 + 3);
		}
		Static161.aClass2_Sub23_Sub1_5.method2099(Static28.anInt497 + local25);
		Static161.aClass2_Sub23_Sub1_5.method2128(Static121.aBooleanArray133[82] ? 1 : 0);
		Static161.aClass2_Sub23_Sub1_5.method2090(Static57.anInt628 + local29);
		Static66.anInt1316 = Static110.anIntArray419[0];
		Static8.anInt268 = Static86.anIntArray341[0];
		for (@Pc(122) int local122 = 1; local122 < local5; local122++) {
			arg1--;
			Static161.aClass2_Sub23_Sub1_5.method2137(Static86.anIntArray341[arg1] - local25);
			Static161.aClass2_Sub23_Sub1_5.method2121(Static110.anIntArray419[arg1] - local29);
		}
	}
}
