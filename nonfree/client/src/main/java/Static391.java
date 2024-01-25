import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public static int anInt6853;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[[[Lclient!fba;")
	public static Class100[][][] aClass100ArrayArrayArray3;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt6854 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)Z")
	public static boolean method5718(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	public static void method5719() {
		Static274.method4405(Static189.aClass4_Sub2_Sub1_1.anInt9286);
		@Pc(18) int local18 = (Static473.anInt7978 >> 12) + (Static373.anInt6695 >> 3);
		Static320.anInt5748 = Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 = 0;
		@Pc(31) int local31 = (Static563.anInt9436 >> 12) + (Static6.anInt97 >> 3);
		Static129.aClass10_Sub1_Sub2_Sub2_1.method7045(8, 8);
		Static475.aByteArrayArray33 = new byte[18][];
		Static380.anIntArray543 = new int[18];
		Static101.anIntArray236 = new int[18];
		Static240.anIntArray424 = new int[18];
		Static197.anIntArray391 = new int[18];
		Static34.aByteArrayArray40 = new byte[18][];
		Static376.anIntArrayArray61 = new int[18][4];
		Static434.aByteArrayArray31 = new byte[18][];
		Static206.anIntArray400 = new int[18];
		Static220.aByteArrayArray18 = new byte[18][];
		Static293.anIntArray459 = new int[18];
		Static238.aByteArrayArray38 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(97) int local97;
		for (@Pc(86) int local86 = (local18 - (Static38.anInt740 >> 4)) / 8; local86 <= ((Static38.anInt740 >> 4) + local18) / 8; local86++) {
			for (local97 = (local31 - (Static38.anInt741 >> 4)) / 8; local97 <= ((Static38.anInt741 >> 4) + local31) / 8; local97++) {
				@Pc(105) int local105 = (local86 << 8) + local97;
				Static380.anIntArray543[local77] = local105;
				Static240.anIntArray424[local77] = Static370.aClass31_81.method653("m" + local86 + "_" + local97);
				Static206.anIntArray400[local77] = Static370.aClass31_81.method653("l" + local86 + "_" + local97);
				Static197.anIntArray391[local77] = Static370.aClass31_81.method653("n" + local86 + "_" + local97);
				Static101.anIntArray236[local77] = Static370.aClass31_81.method653("um" + local86 + "_" + local97);
				Static293.anIntArray459[local77] = Static370.aClass31_81.method653("ul" + local86 + "_" + local97);
				if (Static197.anIntArray391[local77] == -1) {
					Static240.anIntArray424[local77] = -1;
					Static206.anIntArray400[local77] = -1;
					Static101.anIntArray236[local77] = -1;
					Static293.anIntArray459[local77] = -1;
				}
				local77++;
			}
		}
		for (local97 = local77; local97 < Static197.anIntArray391.length; local97++) {
			Static197.anIntArray391[local97] = -1;
			Static240.anIntArray424[local97] = -1;
			Static206.anIntArray400[local97] = -1;
			Static101.anIntArray236[local97] = -1;
			Static293.anIntArray459[local97] = -1;
		}
		@Pc(275) byte local275;
		if (Static598.anInt9831 == 3) {
			local275 = 4;
		} else {
			local275 = 8;
		}
		Static575.method7834(local275, local31, local18, false);
	}
}
