import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array9;

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	public static int anInt4309 = 0;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
	public static void method3480() {
		Static251.aClass2_Sub3_Sub1_10 = null;
		Static200.aClass2_Sub3_Sub1_8 = null;
		Static242.aClass2_Sub3_Sub1_9 = null;
		Static186.aClass2_Sub3_Sub1_7 = null;
		Static191.aClass2_Sub3_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!cn;)V")
	public static void method3482(@OriginalArg(0) Class34 arg0) {
		for (@Pc(2) int local2 = arg0.anInt894; local2 <= arg0.anInt896; local2++) {
			for (@Pc(9) int local9 = arg0.anInt897; local9 <= arg0.anInt902; local9++) {
				@Pc(22) Class2_Sub31 local22 = Static180.aClass2_Sub31ArrayArrayArray2[arg0.anInt904][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt5708; local26++) {
						if (local22.aClass34Array2[local26] == arg0) {
							local22.anInt5708--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt5708; local44++) {
								local22.aClass34Array2[local44] = local22.aClass34Array2[local44 + 1];
								local22.anIntArray498[local44] = local22.anIntArray498[local44 + 1];
							}
							local22.aClass34Array2[local22.anInt5708] = null;
							break;
						}
					}
					local22.anInt5702 = 0;
					for (local26 = 0; local26 < local22.anInt5708; local26++) {
						local22.anInt5702 |= local22.anIntArray498[local26];
					}
				}
			}
		}
	}
}
