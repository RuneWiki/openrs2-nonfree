import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static int anInt4630;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_118 = new Class129(49, 0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Z")
	public static boolean method3674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(21) Class114 local21 = Static398.aClass256_4.method5782(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local21.method2400(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method3677() {
		Static82.method1222(Static216.aClass1_Sub1_1.anInt4510);
		@Pc(18) int local18 = (Static116.anInt1977 >> 10) + (Static31.anInt618 >> 3);
		@Pc(27) int local27 = (Static393.anInt4184 >> 10) + (Static226.anInt3768 >> 3);
		Static6.anInt131 = Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 = 0;
		Static220.aClass2_Sub1_Sub3_Sub2_1.method4930(8, 8);
		Static393.anIntArray330 = new int[18];
		Static48.aByteArrayArray3 = new byte[18][];
		Static398.anIntArray459 = new int[18];
		Static113.anIntArrayArray11 = new int[18][4];
		Static404.anIntArray465 = new int[18];
		Static415.aByteArrayArray19 = new byte[18][];
		Static319.anIntArray372 = new int[18];
		Static415.aByteArrayArray18 = new byte[18][];
		Static191.aByteArrayArray9 = new byte[18][];
		Static362.anIntArray418 = new int[18];
		Static160.aByteArrayArray7 = new byte[18][];
		Static149.anIntArray139 = new int[18];
		@Pc(78) int local78 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local18 - (Static433.anInt7210 >> 4)) / 8; local87 <= (local18 + (Static433.anInt7210 >> 4)) / 8; local87++) {
			for (local98 = (local27 - (Static418.anInt6969 >> 4)) / 8; local98 <= (local27 + (Static418.anInt6969 >> 4)) / 8; local98++) {
				@Pc(106) int local106 = local98 + (local87 << 8);
				Static362.anIntArray418[local78] = local106;
				Static149.anIntArray139[local78] = Static71.aClass243_255.method5461("m" + local87 + "_" + local98);
				Static393.anIntArray330[local78] = Static71.aClass243_255.method5461("l" + local87 + "_" + local98);
				Static319.anIntArray372[local78] = Static71.aClass243_255.method5461("n" + local87 + "_" + local98);
				Static398.anIntArray459[local78] = Static71.aClass243_255.method5461("um" + local87 + "_" + local98);
				Static404.anIntArray465[local78] = Static71.aClass243_255.method5461("ul" + local87 + "_" + local98);
				if (Static319.anIntArray372[local78] == -1) {
					Static149.anIntArray139[local78] = -1;
					Static393.anIntArray330[local78] = -1;
					Static398.anIntArray459[local78] = -1;
					Static404.anIntArray465[local78] = -1;
				}
				local78++;
			}
		}
		for (local98 = local78; local98 < Static319.anIntArray372.length; local98++) {
			Static319.anIntArray372[local98] = -1;
			Static149.anIntArray139[local98] = -1;
			Static393.anIntArray330[local98] = -1;
			Static398.anIntArray459[local98] = -1;
			Static404.anIntArray465[local98] = -1;
		}
		@Pc(289) byte local289;
		if (Static376.anInt6324 == 1 || Static376.anInt6324 == 2) {
			local289 = 3;
		} else {
			local289 = 7;
		}
		Static36.method615(false, local289, local27, local18);
	}
}
