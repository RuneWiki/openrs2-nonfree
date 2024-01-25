import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public static int anInt10052 = -1;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method8536() {
		Static466.anInt7862 = 0;
		@Pc(11) int local11 = Static167.aClass5_Sub12_Sub2_1.method8606();
		@Pc(15) int local15 = Static167.aClass5_Sub12_Sub2_1.method8645();
		@Pc(26) boolean local26 = Static167.aClass5_Sub12_Sub2_1.method8607() == 1;
		@Pc(32) int local32 = Static167.aClass5_Sub12_Sub2_1.method8640();
		Static246.method3762();
		Static565.method7926(local15);
		@Pc(45) int local45 = (Static60.anInt3115 - Static167.aClass5_Sub12_Sub2_1.anInt10154) / 16;
		Static141.anIntArrayArray12 = new int[local45][4];
		@Pc(60) int local60;
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static141.anIntArrayArray12[local51][local60] = Static167.aClass5_Sub12_Sub2_1.method8623();
			}
		}
		Static462.anIntArray542 = new int[local45];
		Static503.aByteArrayArray8 = null;
		Static310.aByteArrayArray9 = new byte[local45][];
		Static112.aByteArrayArray4 = new byte[local45][];
		Static610.aByteArrayArray26 = new byte[local45][];
		Static28.anIntArray43 = new int[local45];
		Static594.anIntArray784 = new int[local45];
		Static343.aByteArrayArray10 = new byte[local45][];
		Static379.anIntArray680 = new int[local45];
		Static322.anIntArray403 = new int[local45];
		Static587.anIntArray777 = null;
		local45 = 0;
		for (local60 = (local11 - (Static111.anInt1752 >> 4)) / 8; local60 <= ((Static111.anInt1752 >> 4) + local11) / 8; local60++) {
			for (@Pc(132) int local132 = (local32 - (Static279.anInt4567 >> 4)) / 8; local132 <= ((Static279.anInt4567 >> 4) + local32) / 8; local132++) {
				Static594.anIntArray784[local45] = local132 + (local60 << 8);
				Static462.anIntArray542[local45] = Static342.aClass384_86.method8890("m" + local60 + "_" + local132);
				Static379.anIntArray680[local45] = Static342.aClass384_86.method8890("l" + local60 + "_" + local132);
				Static28.anIntArray43[local45] = Static342.aClass384_86.method8890("um" + local60 + "_" + local132);
				Static322.anIntArray403[local45] = Static342.aClass384_86.method8890("ul" + local60 + "_" + local132);
				local45++;
			}
		}
		Static349.method5303(local11, local26, 11, local32);
	}
}
