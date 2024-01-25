import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
	public static void method5381() {
		Static49.anInt1325 = 0;
		@Pc(10) Class3_Sub2_Sub1 local10 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		@Pc(14) int local14 = local10.method2060();
		@Pc(18) int local18 = local10.method2048(255);
		@Pc(30) boolean local30 = local10.method2075() == 1;
		@Pc(34) int local34 = local10.method2044();
		Static202.method3079();
		Static599.method7699(local18);
		@Pc(48) int local48 = (Static95.aClass292_2.anInt8012 - local10.anInt2178) / 16;
		Static297.anIntArrayArray21 = new int[local48][4];
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			for (@Pc(58) int local58 = 0; local58 < 4; local58++) {
				Static297.anIntArrayArray21[local54][local58] = local10.method2036();
			}
		}
		Static169.aByteArrayArray3 = new byte[local48][];
		Static223.anIntArray250 = null;
		Static22.anIntArray50 = new int[local48];
		Static176.aByteArrayArray4 = new byte[local48][];
		Static186.aByteArrayArray5 = null;
		Static592.aByteArrayArray14 = new byte[local48][];
		Static385.anIntArray437 = new int[local48];
		Static469.anIntArray550 = new int[local48];
		Static253.anIntArray292 = new int[local48];
		Static699.aByteArrayArray23 = new byte[local48][];
		Static266.anIntArray325 = new int[local48];
		local48 = 0;
		for (@Pc(135) int local135 = (local34 - (Static497.anInt7926 >> 4)) / 8; local135 <= (local34 + (Static497.anInt7926 >> 4)) / 8; local135++) {
			for (@Pc(150) int local150 = (local14 - (Static646.anInt9979 >> 511574084)) / 8; local150 <= (local14 + (Static646.anInt9979 >> 4)) / 8; local150++) {
				Static385.anIntArray437[local48] = (local135 << 8) + local150;
				Static266.anIntArray325[local48] = Static699.aClass182_127.method3978("m" + local135 + "_" + local150);
				Static22.anIntArray50[local48] = Static699.aClass182_127.method3978("l" + local135 + "_" + local150);
				Static253.anIntArray292[local48] = Static699.aClass182_127.method3978("um" + local135 + "_" + local150);
				Static469.anIntArray550[local48] = Static699.aClass182_127.method3978("ul" + local135 + "_" + local150);
				local48++;
			}
		}
		Static326.method4755(local34, local14, local30, 12);
	}
}
