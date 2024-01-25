import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	public static int anInt2781;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method2296() {
		Static409.anInt701 = 0;
		@Pc(13) int local13 = Static202.aClass2_Sub17_Sub1_1.method6115();
		@Pc(17) int local17 = Static202.aClass2_Sub17_Sub1_1.method6110();
		@Pc(26) boolean local26 = Static202.aClass2_Sub17_Sub1_1.method6115() == 1;
		@Pc(30) int local30 = Static202.aClass2_Sub17_Sub1_1.method6148();
		Static70.method1093();
		Static29.method475(local13);
		@Pc(43) int local43 = (Static302.anInt5465 - Static202.aClass2_Sub17_Sub1_1.anInt7523) / 16;
		Static83.anIntArrayArray38 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static83.anIntArrayArray38[local49][local53] = Static202.aClass2_Sub17_Sub1_1.method6129();
			}
		}
		Static328.aByteArrayArray18 = null;
		Static423.anIntArray585 = null;
		Static222.aByteArrayArray12 = new byte[local43][];
		Static414.anIntArray577 = new int[local43];
		Static428.aByteArrayArray21 = new byte[local43][];
		Static265.anIntArray391 = new int[local43];
		Static59.anIntArray532 = new int[local43];
		Static450.anIntArray635 = new int[local43];
		Static246.aByteArrayArray15 = new byte[local43][];
		Static388.aByteArrayArray19 = new byte[local43][];
		Static437.anIntArray600 = new int[local43];
		local43 = 0;
		for (local53 = (local30 - (Static234.anInt3949 >> 4)) / 8; local53 <= (local30 + (Static234.anInt3949 >> 4)) / 8; local53++) {
			for (@Pc(128) int local128 = (local17 - (Static371.anInt6492 >> 4)) / 8; local128 <= (local17 + (Static371.anInt6492 >> 4)) / 8; local128++) {
				Static450.anIntArray635[local43] = (local53 << 8) + local128;
				Static59.anIntArray532[local43] = Static11.aClass171_2.method3668("m" + local53 + "_" + local128);
				Static437.anIntArray600[local43] = Static11.aClass171_2.method3668("l" + local53 + "_" + local128);
				Static414.anIntArray577[local43] = Static11.aClass171_2.method3668("um" + local53 + "_" + local128);
				Static265.anIntArray391[local43] = Static11.aClass171_2.method3668("ul" + local53 + "_" + local128);
				local43++;
			}
		}
		Static144.method2216(local26, 10, local17, local30);
	}
}
