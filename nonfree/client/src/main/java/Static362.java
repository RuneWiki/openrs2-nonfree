import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "Lclient!an;")
	public static Class16 aClass16_88;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
	public static int anInt6761 = 0;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
	public static void method5650() {
		Static184.anInt4228 = 0;
		@Pc(16) boolean local16 = Static394.aClass12_Sub8_Sub2_2.method5202() == 1;
		@Pc(20) int local20 = Static394.aClass12_Sub8_Sub2_2.method5199();
		@Pc(28) int local28 = Static394.aClass12_Sub8_Sub2_2.method5199();
		@Pc(32) int local32 = Static394.aClass12_Sub8_Sub2_2.method5216();
		Static300.method4833();
		Static305.method4966(local32);
		@Pc(44) int local44 = (Static331.anInt6307 - Static394.aClass12_Sub8_Sub2_2.anInt6217) / 16;
		Static174.anIntArrayArray38 = new int[local44][4];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < local44; local50++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static174.anIntArrayArray38[local50][local54] = Static394.aClass12_Sub8_Sub2_2.method5225();
			}
		}
		Static443.anIntArray607 = new int[local44];
		Static344.aByteArrayArray18 = new byte[local44][];
		Static120.anIntArray222 = new int[local44];
		Static427.aByteArrayArray26 = new byte[local44][];
		Static28.aByteArrayArray10 = new byte[local44][];
		Static13.anIntArray19 = null;
		Static100.anIntArray203 = new int[local44];
		Static230.aByteArrayArray9 = null;
		Static73.aByteArrayArray4 = new byte[local44][];
		Static143.anIntArray236 = new int[local44];
		Static395.anIntArray494 = new int[local44];
		local44 = 0;
		for (local54 = (local28 - (Static37.anInt7512 >> 4)) / 8; local54 <= (local28 + (Static37.anInt7512 >> 4)) / 8; local54++) {
			for (@Pc(127) int local127 = (local20 - (Static329.anInt6247 >> 4)) / 8; local127 <= ((Static329.anInt6247 >> 4) + local20) / 8; local127++) {
				Static443.anIntArray607[local44] = (local54 << 8) + local127;
				Static120.anIntArray222[local44] = Static129.aClass16_119.method420("m" + local54 + "_" + local127);
				Static100.anIntArray203[local44] = Static129.aClass16_119.method420("l" + local54 + "_" + local127);
				Static395.anIntArray494[local44] = Static129.aClass16_119.method420("um" + local54 + "_" + local127);
				Static143.anIntArray236[local44] = Static129.aClass16_119.method420("ul" + local54 + "_" + local127);
				local44++;
			}
		}
		Static253.method4365(local20, 10, local28, local16);
	}
}
