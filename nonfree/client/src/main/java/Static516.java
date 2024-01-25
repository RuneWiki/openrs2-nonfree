import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	public static boolean aBoolean679;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	public static int anInt8762;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt8761 = 0;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method7174() {
		Static90.anInt1938 = 0;
		@Pc(11) int local11 = Static585.aClass1_Sub35_Sub2_2.method5779();
		@Pc(20) boolean local20 = Static585.aClass1_Sub35_Sub2_2.method5775() == 1;
		@Pc(24) int local24 = Static585.aClass1_Sub35_Sub2_2.method5775();
		@Pc(28) int local28 = Static585.aClass1_Sub35_Sub2_2.method5783();
		Static19.method187();
		Static404.method5619(local24);
		@Pc(41) int local41 = (Static445.anInt7693 - Static585.aClass1_Sub35_Sub2_2.anInt7214) / 16;
		Static342.anIntArrayArray132 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static342.anIntArrayArray132[local47][local51] = Static585.aClass1_Sub35_Sub2_2.method5804();
			}
		}
		Static162.anIntArray263 = new int[local41];
		Static279.anIntArray375 = new int[local41];
		Static481.aByteArrayArray30 = null;
		Static173.aByteArrayArray15 = new byte[local41][];
		Static259.anIntArray367 = new int[local41];
		Static269.aByteArrayArray20 = new byte[local41][];
		Static317.aByteArrayArray21 = new byte[local41][];
		Static566.anIntArray710 = new int[local41];
		Static101.anIntArray182 = null;
		Static405.anIntArray542 = new int[local41];
		Static103.aByteArrayArray11 = new byte[local41][];
		local41 = 0;
		for (local51 = (local28 - (Static71.anInt1410 >> 4)) / 8; local51 <= (local28 + (Static71.anInt1410 >> 4)) / 8; local51++) {
			for (@Pc(126) int local126 = (local11 - (Static471.anInt8012 >> 4)) / 8; local126 <= ((Static471.anInt8012 >> 4) + local11) / 8; local126++) {
				Static566.anIntArray710[local41] = (local51 << 8) + local126;
				Static259.anIntArray367[local41] = Static559.aClass270_116.method5677("m" + local51 + "_" + local126);
				Static162.anIntArray263[local41] = Static559.aClass270_116.method5677("l" + local51 + "_" + local126);
				Static279.anIntArray375[local41] = Static559.aClass270_116.method5677("um" + local51 + "_" + local126);
				Static405.anIntArray542[local41] = Static559.aClass270_116.method5677("ul" + local51 + "_" + local126);
				local41++;
			}
		}
		Static498.method6987(local28, local20, local11, 11);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
	public static boolean method7177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
