import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "Lclient!kea;")
	public static Class208 aClass208_6;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "[Lclient!vv;")
	public static Interface25[] anInterface25Array1;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_84 = new Class144(55, 16);

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method7322() {
		Static599.method7699(Static580.aClass3_Sub22_24.aClass21_Sub23_1.method7366());
		@Pc(19) int local19 = (Static305.anInt4908 >> 12) + (Static291.anInt4448 >> 3);
		Static723.anInt11225 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 = 0;
		@Pc(33) int local33 = (Static263.anInt4101 >> 12) + (Static189.anInt3243 >> 3);
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method483(8, 8);
		Static592.aByteArrayArray14 = new byte[18][];
		Static253.anIntArray292 = new int[18];
		Static469.anIntArray550 = new int[18];
		Static186.aByteArrayArray5 = new byte[18][];
		Static297.anIntArrayArray21 = new int[18][4];
		Static385.anIntArray437 = new int[18];
		Static176.aByteArrayArray4 = new byte[18][];
		Static699.aByteArrayArray23 = new byte[18][];
		Static22.anIntArray50 = new int[18];
		Static223.anIntArray250 = new int[18];
		Static266.anIntArray325 = new int[18];
		Static169.aByteArrayArray3 = new byte[18][];
		@Pc(86) int local86 = 0;
		@Pc(106) int local106;
		for (@Pc(95) int local95 = (local19 - (Static497.anInt7926 >> 4)) / 8; local95 <= ((Static497.anInt7926 >> 4) + local19) / 8; local95++) {
			for (local106 = (local33 - (Static646.anInt9979 >> 4)) / 8; local106 <= (local33 + (Static646.anInt9979 >> 4)) / 8; local106++) {
				@Pc(114) int local114 = local106 + (local95 << 8);
				Static385.anIntArray437[local86] = local114;
				Static266.anIntArray325[local86] = Static699.aClass182_127.method3978("m" + local95 + "_" + local106);
				Static22.anIntArray50[local86] = Static699.aClass182_127.method3978("l" + local95 + "_" + local106);
				Static223.anIntArray250[local86] = Static699.aClass182_127.method3978("n" + local95 + "_" + local106);
				Static253.anIntArray292[local86] = Static699.aClass182_127.method3978("um" + local95 + "_" + local106);
				Static469.anIntArray550[local86] = Static699.aClass182_127.method3978("ul" + local95 + "_" + local106);
				if (Static223.anIntArray250[local86] == -1) {
					Static266.anIntArray325[local86] = -1;
					Static22.anIntArray50[local86] = -1;
					Static253.anIntArray292[local86] = -1;
					Static469.anIntArray550[local86] = -1;
				}
				local86++;
			}
		}
		for (local106 = local86; local106 < Static223.anIntArray250.length; local106++) {
			Static223.anIntArray250[local106] = -1;
			Static266.anIntArray325[local106] = -1;
			Static22.anIntArray50[local106] = -1;
			Static253.anIntArray292[local106] = -1;
			Static469.anIntArray550[local106] = -1;
		}
		@Pc(302) byte local302;
		if (Static98.anInt2140 == 3) {
			local302 = 4;
		} else if (Static98.anInt2140 == 9) {
			local302 = 10;
		} else if (Static98.anInt2140 == 7) {
			local302 = 8;
		} else {
			throw new RuntimeException(String.valueOf(Static98.anInt2140));
		}
		Static326.method4755(local19, local33, false, local302);
	}
}
