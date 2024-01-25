import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "Lclient!ul;")
	public static Class246 aClass246_155;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_114 = new Class7("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_12 = new Class237(3, 7);

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
	public static int anInt4868 = 1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public static void method4032() {
		if (Static342.anInt5771 == 6) {
			Static225.method3455(false);
		} else if (Static264.anInt4690 > 0) {
			Static225.method3455(Static309.aBoolean382);
		} else {
			Static139.aClass229_2 = Static82.aClass229_1;
			Static82.aClass229_1 = null;
			Static193.method2987(12);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public static void method4034() {
		Static23.anInt5194 = 0;
		@Pc(11) int local11 = Static206.aClass1_Sub5_Sub1_2.method5383();
		@Pc(22) boolean local22 = Static206.aClass1_Sub5_Sub1_2.method5374() == 1;
		@Pc(26) int local26 = Static206.aClass1_Sub5_Sub1_2.method5400();
		@Pc(30) int local30 = Static206.aClass1_Sub5_Sub1_2.method5363();
		Static444.method5854(local11);
		@Pc(40) int local40 = (Static167.anInt3076 - Static206.aClass1_Sub5_Sub1_2.anInt6475) / 16;
		Static44.anIntArrayArray7 = new int[local40][4];
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static44.anIntArrayArray7[local46][local50] = Static206.aClass1_Sub5_Sub1_2.method5407();
			}
		}
		Static136.aByteArrayArray6 = new byte[local40][];
		Static181.anIntArray293 = new int[local40];
		Static431.anIntArray632 = new int[local40];
		Static111.anIntArray183 = new int[local40];
		Static390.aByteArrayArray18 = new byte[local40][];
		Static266.anIntArray627 = new int[local40];
		Static72.aByteArrayArray3 = null;
		Static18.anIntArray306 = new int[local40];
		Static92.anIntArray162 = null;
		Static407.aByteArrayArray20 = new byte[local40][];
		Static175.aByteArrayArray8 = new byte[local40][];
		local40 = 0;
		for (local50 = (local30 - (Static195.anInt3537 >> 4)) / 8; local50 <= ((Static195.anInt3537 >> 4) + local30) / 8; local50++) {
			for (@Pc(127) int local127 = (local26 - (Static118.anInt2419 >> 4)) / 8; local127 <= ((Static118.anInt2419 >> 4) + local26) / 8; local127++) {
				Static266.anIntArray627[local40] = (local50 << 8) + local127;
				Static111.anIntArray183[local40] = Static334.aClass246_179.method5478("m" + local50 + "_" + local127);
				Static431.anIntArray632[local40] = Static334.aClass246_179.method5478("l" + local50 + "_" + local127);
				Static18.anIntArray306[local40] = Static334.aClass246_179.method5478("um" + local50 + "_" + local127);
				Static181.anIntArray293[local40] = Static334.aClass246_179.method5478("ul" + local50 + "_" + local127);
				local40++;
			}
		}
		Static410.method5509(local30, local22, local26, 10);
	}
}
