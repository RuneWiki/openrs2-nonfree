import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	public static int anInt5501 = 0;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[6][];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4740(@OriginalArg(1) String arg0) {
		if (!Static382.aBoolean440) {
			return;
		}
		@Pc(8) boolean local8 = false;
		@Pc(10) int local10 = Static412.anInt7191;
		@Pc(12) int[] local12 = Static349.anIntArray479;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) Class47_Sub2_Sub3_Sub2 local21 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local12[local14]];
			if (local21 != null && local21 != Static16.aClass47_Sub2_Sub3_Sub2_1 && local21.aString36 != null && local21.aString36.equalsIgnoreCase(arg0)) {
				Static444.method6416(Static180.aClass186_57);
				Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
				Static192.aClass1_Sub13_Sub2_1.method3069(Static323.anInt6116);
				Static192.aClass1_Sub13_Sub2_1.method3023(local12[local14]);
				Static192.aClass1_Sub13_Sub2_1.method3065(0);
				Static192.aClass1_Sub13_Sub2_1.method3028(Static368.anInt6563);
				Static76.method1968(local21.anIntArray362[0], local21.method4350(), true, local21.anIntArray361[0], local21.method4350(), -2, 0, 0);
				local8 = true;
				break;
			}
		}
		if (!local8) {
			Static289.method4881(Static165.aClass114_75.method3330(Static315.anInt5993) + arg0);
		}
		if (Static382.aBoolean440) {
			Static214.method3846();
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)Z")
	public static boolean method4741() {
		return Static491.anInt8374 == 0 ? Static535.aClass1_Sub12_Sub4_3.method6529() : true;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
	public static void method4742() {
		if (Static283.aString52.toLowerCase().indexOf("microsoft") != -1) {
			Static511.anIntArray820[187] = 27;
			Static511.anIntArray820[186] = 57;
			Static511.anIntArray820[188] = 71;
			Static511.anIntArray820[191] = 73;
			Static511.anIntArray820[192] = 58;
			Static511.anIntArray820[220] = 74;
			Static511.anIntArray820[222] = 59;
			Static511.anIntArray820[190] = 72;
			Static511.anIntArray820[219] = 42;
			Static511.anIntArray820[189] = 26;
			Static511.anIntArray820[223] = 28;
			Static511.anIntArray820[221] = 43;
			return;
		}
		Static511.anIntArray820[47] = 73;
		Static511.anIntArray820[44] = 71;
		Static511.anIntArray820[93] = 43;
		Static511.anIntArray820[92] = 74;
		if (Static283.aMethod2 == null) {
			Static511.anIntArray820[192] = 58;
			Static511.anIntArray820[222] = 59;
		} else {
			Static511.anIntArray820[222] = 58;
			Static511.anIntArray820[520] = 59;
			Static511.anIntArray820[192] = 28;
		}
		Static511.anIntArray820[45] = 26;
		Static511.anIntArray820[91] = 42;
		Static511.anIntArray820[46] = 72;
		Static511.anIntArray820[59] = 57;
		Static511.anIntArray820[61] = 27;
	}
}
