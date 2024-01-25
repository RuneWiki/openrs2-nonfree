import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Lclient!dp;")
	public static Class53 aClass53_114;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	public static int anInt4575;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	public static int anInt4574 = 0;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
	public static int anInt4577 = 0;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public static int anInt4579 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V")
	public static void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static108.anInt2020 = arg1;
		Static230.anInt4302 = arg3;
		Static219.anInt4046 = arg0;
		Static327.anInt3029 = arg2;
	}

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "(I)V")
	public static void method4286() {
		Static223.aClass70_74.method1405();
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)V")
	public static void method4287() {
		Static40.method686(Static163.anInt3087);
		@Pc(24) int local24 = (Static44.anInt881 >> 3) + (Static287.anInt5405 >> 10);
		@Pc(32) int local32 = (Static300.anInt5672 >> 3) + (Static11.anInt197 >> 10);
		Static303.aByteArrayArray17 = new byte[18][];
		Static49.anIntArray108 = new int[18];
		Static303.anIntArray647 = new int[18];
		Static179.aByteArrayArray11 = new byte[18][];
		Static227.aByteArrayArray14 = new byte[18][];
		Static271.anIntArray542 = new int[18];
		Static101.anIntArray259 = new int[18];
		Static237.anIntArray495 = new int[18];
		Static324.anIntArray681 = new int[18];
		Static308.aByteArrayArray18 = new byte[18][];
		Static83.aByteArrayArray4 = new byte[18][];
		Static243.anIntArrayArray160 = new int[18][4];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local24 - (Static153.anInt2883 >> 4)) / 8; local88 <= ((Static153.anInt2883 >> 4) + local24) / 8; local88++) {
			for (local99 = (local32 - (Static246.anInt4606 >> 4)) / 8; local99 <= ((Static246.anInt4606 >> 4) + local32) / 8; local99++) {
				@Pc(108) int local108 = (local88 << 8) + local99;
				Static303.anIntArray647[local79] = local108;
				Static271.anIntArray542[local79] = Static71.aClass53_36.method1037("m" + local88 + "_" + local99);
				Static237.anIntArray495[local79] = Static71.aClass53_36.method1037("l" + local88 + "_" + local99);
				Static49.anIntArray108[local79] = Static71.aClass53_36.method1037("n" + local88 + "_" + local99);
				Static101.anIntArray259[local79] = Static71.aClass53_36.method1037("um" + local88 + "_" + local99);
				Static324.anIntArray681[local79] = Static71.aClass53_36.method1037("ul" + local88 + "_" + local99);
				if (Static49.anIntArray108[local79] == -1) {
					Static271.anIntArray542[local79] = -1;
					Static237.anIntArray495[local79] = -1;
					Static101.anIntArray259[local79] = -1;
					Static324.anIntArray681[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static49.anIntArray108.length; local99++) {
			Static49.anIntArray108[local99] = -1;
			Static271.anIntArray542[local99] = -1;
			Static237.anIntArray495[local99] = -1;
			Static101.anIntArray259[local99] = -1;
			Static324.anIntArray681[local99] = -1;
		}
		Static292.method4993(8, local32, 8, local24, 0, false, true);
	}
}
