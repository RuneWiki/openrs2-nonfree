import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
	public static int anInt5310;

	@OriginalMember(owner = "client!jt", name = "Q", descriptor = "Lclient!eq;")
	public static Class97 aClass97_69;

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[5];

	@OriginalMember(owner = "client!jt", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
	public static void method4437() {
		Static462.anInt8018 = 0;
		@Pc(11) int local11 = Static313.aClass2_Sub34_Sub2_1.method6867();
		@Pc(22) boolean local22 = Static313.aClass2_Sub34_Sub2_1.method6867() == 1;
		@Pc(26) int local26 = Static313.aClass2_Sub34_Sub2_1.method6879();
		@Pc(30) int local30 = Static313.aClass2_Sub34_Sub2_1.method6884();
		Static259.method4235();
		Static586.method8086(local11);
		@Pc(42) int local42 = (Static44.anInt971 - Static313.aClass2_Sub34_Sub2_1.anInt8188) / 16;
		Static564.anIntArrayArray73 = new int[local42][4];
		@Pc(51) int local51;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static564.anIntArrayArray73[local48][local51] = Static313.aClass2_Sub34_Sub2_1.method6865();
			}
		}
		Static440.anIntArray533 = new int[local42];
		Static502.anIntArray283 = new int[local42];
		Static349.anIntArray395 = new int[local42];
		Static501.aByteArrayArray19 = new byte[local42][];
		Static478.aByteArrayArray18 = new byte[local42][];
		Static501.aByteArrayArray20 = new byte[local42][];
		Static237.aByteArrayArray12 = null;
		Static516.anIntArray595 = new int[local42];
		Static633.anIntArray729 = new int[local42];
		Static350.anIntArray421 = null;
		Static19.aByteArrayArray10 = new byte[local42][];
		local42 = 0;
		for (local51 = (local30 - (Static3.anInt46 >> 4)) / 8; local51 <= (local30 + (Static3.anInt46 >> 4)) / 8; local51++) {
			for (@Pc(125) int local125 = (local26 - (Static270.anInt5194 >> 4)) / 8; local125 <= ((Static270.anInt5194 >> 4) + local26) / 8; local125++) {
				Static349.anIntArray395[local42] = (local51 << 8) + local125;
				Static633.anIntArray729[local42] = Static48.aClass97_6.method2574("m" + local51 + "_" + local125);
				Static516.anIntArray595[local42] = Static48.aClass97_6.method2574("l" + local51 + "_" + local125);
				Static440.anIntArray533[local42] = Static48.aClass97_6.method2574("um" + local51 + "_" + local125);
				Static502.anIntArray283[local42] = Static48.aClass97_6.method2574("ul" + local51 + "_" + local125);
				local42++;
			}
		}
		Static516.method7251(local22, local30, 11, local26);
	}
}
